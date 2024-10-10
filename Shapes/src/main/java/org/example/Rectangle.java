package org.example;

import java.util.Scanner;

public class Rectangle extends Polygon {
    private static Scanner rec= new Scanner(System.in);
    private int width;
    @Override
    public void Polygon(){
        System.out.println("Enter length of rectangle: ");
        dim=rec.nextInt();
    }
}
