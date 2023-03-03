package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            int Num1 = (int) Math.round(root1);
            int Num2 = (int) Math.round(root2);
            if(root1==Num1 && root2==Num2)
            {
                System.out.println(Num2+" " +Num1);
            }
            else if(root1==Num1 && root2!=Num2)
            {
                System.out.println(root2+" "+Num1);
            }
            else if(root1!=Num1 && root2==Num2)
            {
                System.out.println(Num2+" "+root1);
            }
            else if(root1!=Num1 && root2!=Num2)
            {
                System.out.println(root2+" "+root1);
            }
        }
        else if (discriminant == 0)
        {
            double root = -b / (2 * a);
            int Num3 = (int) Math.round(root);
            if(root==Num3)
            {
                System.out.println(Num3);
            }
            else
            {
                System.out.println(root);
            }
        }
        else
        {
            System.out.println("no roots");
        }
    }

}