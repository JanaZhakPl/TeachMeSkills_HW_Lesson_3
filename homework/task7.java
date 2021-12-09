/**
 * bubble sort algorithm
 *
 */
package com.teachmeskills.lesson_3.homework;

import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        int [] myArray = {33, 88, 44, 77, 11};

        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = myArray.length - 1; j > i; j--) {
                if (myArray[j - 1] > myArray[j]) {
                    int tmp = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}

