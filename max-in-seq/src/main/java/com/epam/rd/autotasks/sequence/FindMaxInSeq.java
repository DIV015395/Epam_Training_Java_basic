package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {

    public static int max() {

        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int input;
        do {
            input = scanner.nextInt();
            if(input==0)
            {
                break;
            }
            if (input > max)
            {
                max = input;
            }
        } while (input != 0);
        return max;
    }
    public static void main(String[] args)
    {
        //Scanner scanner = new Scanner(System.in);
        //int max = max(scanner);
        //System.out.println(max);
        int a = max();
        System.out.println(a);


    }
}

