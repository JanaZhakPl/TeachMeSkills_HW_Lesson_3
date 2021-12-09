/**
 * program creates and initialized new array with Math.random() method and inputted length, that can be changed.
 * Also outputs a maximum, minimum and average value of the array
 */

package com.teachmeskills.lesson_3.homework;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        System.out.println("Enter the array length");
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int[] myArray = new int[l];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);
        }

        System.out.println("Your massive is " + Arrays.toString(myArray));
        double max = myArray[0];
        double min = myArray[0];
        double avg = 0;
        double sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            if(max < myArray[i])
                max = myArray[i];
            if(min > myArray[i])
                min = myArray[i];
           sum += myArray[i];
           avg = sum / l;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}



