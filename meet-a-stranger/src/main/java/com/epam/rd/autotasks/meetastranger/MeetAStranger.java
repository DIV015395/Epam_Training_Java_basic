package com.epam.rd.autotasks.meetastranger;

import java.util.Scanner;

public class MeetAStranger {
    public static void main(String[] args) {
        //Write a program, which read a String from System.in and print "Hello, <input string>
        Scanner s = new Scanner(System.in);
        String inpu = s.nextLine();
        System.out.println("Hello, "+inpu);
    }
}
