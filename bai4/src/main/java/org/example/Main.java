package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(5, 2);
        Rectangle r3 = new Rectangle(4.5, 3.5);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        double maxArea = r1.getArea();
        if (r2.getArea() > maxArea) maxArea = r2.getArea();
        if (r3.getArea() > maxArea) maxArea = r3.getArea();

        System.out.println("\nDiện tích lớn nhất: " + maxArea);
        int count = 0;
        System.out.println("Hình có diện tích lớn nhất:");
        if (r1.getArea() == maxArea) {
            System.out.println(r1);
            count++;
        }
        if (r2.getArea() == maxArea) {
            System.out.println(r2);
            count++;
        }
        if (r3.getArea() == maxArea) {
            System.out.println(r3);
            count++;
        }
        if (count > 1) {
            System.out.println("Có nhiều hình có diện tích bằng nhau lớn nhất!");
        }
    }
    }
