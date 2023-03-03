package com.epam.rd.autotasks.max;
import java.lang.System;

public class MaxMethod {
    public static int max(int[] values)
    {

        int max = -2147483648;
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }
}
