/**
 * program creates array with random numbers with input length (greater than 5 and less than or equal to 10),
 * outputs the message if the input number doesn`t satisfy the condition,
 * then outputs the array,
 * creates new random with all evens from the first array and outputs it  if there are evens.
 */

package com.teachmeskills.lesson_3.homework;

import java.util.Arrays;
import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        System.out.println("Enter the length of te array from 6 to 10");
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int numberOfElements = 0;
        if ((l <= 5) || (l > 10)) {
            System.out.println("Enter the right value from 6 to 10");
            //break;
            // can`t understand, why couldn`t I use 'break;' here????
        } else {
            numberOfElements = l;
        }

        int[] myArray = new int[numberOfElements];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(myArray));

        int [] filtered = Arrays.stream(myArray).filter(i -> i %2 == 0).toArray();
        System.out.println(Arrays.toString(filtered));
        }
}