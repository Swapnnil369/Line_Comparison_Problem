package com.bridgelabz;


public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        GetUserInputMethods getUserInputMethods = new GetUserInputMethods();
        double lengthOfLineOne = getUserInputMethods.getFirstLineCoordinates();
        System.out.println("Length of line 1 : "+lengthOfLineOne);
        double lengthOfLineTwo = getUserInputMethods.getSecondLineCoordinates();
        System.out.println("Length of line 2 : "+lengthOfLineTwo);
        getUserInputMethods.checkEquality(lengthOfLineOne,lengthOfLineTwo);
        getUserInputMethods.compareTwoLine(lengthOfLineOne,lengthOfLineTwo);
    }
}
