package com.epam.rd.autotasks.snail;
import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // height snail can climb during the day
        int b = scanner.nextInt(); // height snail slides down at night
        int h = scanner.nextInt(); // height of the tree

        if (a >= h) {
            System.out.println(1); // snail can reach the top in one day
        } else {
// calculate the distance the snail climbs during the day and slides down at night
            int distancePerDay = a - b;
            if (distancePerDay <= 0) {
                System.out.println("Impossible"); // the snail cannot reach the top of the tree
            } else {
                int days = (int) Math.ceil((h - a) / (double) distancePerDay) + 1; // add one day to reach the top
                System.out.println(days);
            }
        }
    }
}