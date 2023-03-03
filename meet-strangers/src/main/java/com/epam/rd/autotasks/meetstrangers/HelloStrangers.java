package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args)  {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".

        Scanner sc = new Scanner(System.in);
//takes an integer input
        int size = sc.nextInt();
        if(size==0)
        {
            System.out.println("Oh, it looks like there is no one here");
        }
        if(size<0)
        {
            System.out.println("Seriously? Why so negative?");
        }
        if(size>0)
        {
            String[] string = new String [size];
            sc.nextLine();
            for (int i = 0; i < size; i++)
            {
                string[i] = sc.nextLine();
            }
            for (String str : string) {
                System.out.println("Hello, " + str);
            }
        }
    }
}
