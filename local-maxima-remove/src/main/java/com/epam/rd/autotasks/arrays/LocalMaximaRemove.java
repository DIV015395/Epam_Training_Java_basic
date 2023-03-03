package com.epam.rd.autotasks.arrays;

import java.util.Arrays;
import java.util.*;

import java.util.*;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){

        //put your code here
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<array.length;i++){
            if(i>0 && array[i]<=array[i-1] || (i != array.length-1 && array[i]<=array[i+1])){
                l.add(array[i]);


            }
        }
        return l.stream().mapToInt(i->i).toArray();
    }
}
