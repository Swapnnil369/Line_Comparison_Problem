package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x1=scanner.nextInt();
        int x2=scanner.nextInt();
        int y1=scanner.nextInt();
        int y2=scanner.nextInt();

        double length=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println(length);
    }
}
