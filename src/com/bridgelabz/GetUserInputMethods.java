package com.bridgelabz;

import java.util.Scanner;

public class GetUserInputMethods extends InputMethods {
    private double x1, y1, x2, y2;
    String lineOne;
    String lineTwo;

    @Override
    double getFirstLineCoordinates() {
        double lengthOfLine;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x1 :");
        x1 = scanner.nextDouble();

        System.out.println("Enter the value of y1 :");
        y1 = scanner.nextDouble();

        System.out.println("Enter the value of x2 :");
        x2 = scanner.nextDouble();

        System.out.println("Enter the value of y2 :");
        y2 = scanner.nextDouble();

        lengthOfLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return lengthOfLine;
    }

    @Override
    double getSecondLineCoordinates() {
        double lengthOfLine;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x1 :");
        x1 = scanner.nextDouble();

        System.out.println("Enter the value of y1 :");
        y1 = scanner.nextDouble();

        System.out.println("Enter the value of x2 :");
        x2 = scanner.nextDouble();

        System.out.println("Enter the value of y2 :");
        y2 = scanner.nextDouble();

        lengthOfLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return lengthOfLine;
    }

    public void checkEquality(double line1, double line2) {
        lineOne = String.valueOf(line1);
        lineTwo = String.valueOf(line2);
        if (lineOne.equals(lineTwo)) {
            System.out.println("Length of line1 is equal to length of line2");
        } else {
            System.out.println("Length of line1 is not equal to  length of line2");
        }
    }

    public void compareTwoLine(double line1, double line2) {
        lineOne = String.valueOf(line1);
        lineTwo = String.valueOf(line2);
        int compare = lineOne.compareTo(lineTwo);
        if (compare >0) {
            System.out.println("Length of line1 is greater than length of line2");
        } else {
            System.out.println("Length of line1 is less than length of line2");
        }
    }
}
