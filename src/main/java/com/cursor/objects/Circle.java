package com.cursor.objects;

import java.util.Scanner;

public class Circle {

    public void circleArea() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = scan.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("The circle area is : " + area);
    }
}
