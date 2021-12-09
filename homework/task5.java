/**
 * program creates and initialized array, outputs it;
 * replaces each odd number with a zero;.
 * outputs changed array in new line
 */

package com.teachmeskills.lesson_3.homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        int[] myArray = {11,22,33,44,55};
        System.out.println(Arrays.toString(myArray));

        for (int i = 0 ; i < myArray.length ; i++) {
            if (myArray[i] % 2 != 0){
                myArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
