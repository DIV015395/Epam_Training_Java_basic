package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int S = seconds % 60;
        int H = seconds / 60;
        int M = H % 60;
        H = H / 60;
        if(H==24)
        {
            H=0;
        }
        if(S<10 && M<10)
        {
            System.out.print( H + ":0" + M + ":0" + S);
        }
        if(S>=10 && M<10)
        {
            System.out.print( H + ":0" + M + ":" + S);
        }
        if(S<10 && M>=10)
        {
            System.out.print( H + ":" + M + ":0" + S);
        }
        if(S>=10 && M>=10)
        {
            System.out.print( H + ":" + M + ":" + S);
        }
        System.out.print("\n");

    }
}
