package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1 line value:");
        int x1=scanner.nextInt();
        int x2=scanner.nextInt();
        int y1=scanner.nextInt();
        int y2=scanner.nextInt();

        double length1=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println(length1);

        System.out.println("Enter 2 line value:");
        int x3=scanner.nextInt();
        int x4=scanner.nextInt();
        int y3=scanner.nextInt();
        int y4=scanner.nextInt();

        double length2=Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));
        System.out.println(length2);

        if (length1==length2){
            System.out.println("Two lines are equal");
        }else {
            System.out.println("Two lines are not equal");
        }

    }
}
