package solidus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the small circle - ");
        double radius1 = scanner.nextDouble();
        double circleArea = circleArea(radius1);

        double sector = circleArea / 8;

        System.out.print("Enter the radius of the big circle - ");
        double radius2 = scanner.nextDouble();
        double triangleArea = triangleArea(radius2);

        double triangleWithoutSector = triangleArea - sector;

        double finalArea = findFinalArea(sector, triangleWithoutSector);

        System.out.println("Area of the filled figure = " + finalArea);
    }

    static double circleArea(double radius1)
    {
        return radius1 * radius1 * Math.PI;
    }

    static double triangleArea(double radius2)
    {
        return (radius2 * radius2) / 2;
    }

    static double findFinalArea(double sector, double triangleWithoutSector)
    {
        return sector * 6 + triangleWithoutSector;
    }

}