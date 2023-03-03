package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int sum = 0;
        int count = 0;
        int input;
        do {
            input = scanner.nextInt();
            if (input != 0) {
                sum += input;
                count++;
            }
        } while (input != 0);
        int average = count == 0 ? 0 : sum / count;
        System.out.println(average);

    }

}