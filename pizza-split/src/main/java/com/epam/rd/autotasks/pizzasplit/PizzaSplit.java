package com.epam.rd.autotasks.pizzasplit;

import java.util.*;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner s = new Scanner(System.in);
        int np=s.nextInt();
        int npp=s.nextInt();
        int i=1;
        while((i*npp)%np!=0){
            i++;
        }
        System.out.println(i);


    }
}
