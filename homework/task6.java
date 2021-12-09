/**
 * program creates  array of strings with random names;
 * sorts  array and outputs the result
  */

package com.teachmeskills.lesson_3.homework;

import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {
        String[ ] myArray = new String[4];
        myArray[0] = "Mark";
        myArray[1] = "Jan";
        myArray[2] = "Marta";
        myArray[3] = "Anna";

        System.out.println(Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
