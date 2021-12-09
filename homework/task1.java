/**
 * program remove all occurrences of an input number from the initialized array and outputs the  new array without it
 * or outputs the message that there is no such number.
 */
package com.teachmeskills.lesson_3.homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] myArray = {1,4,57,87,3};

        boolean contains = IntStream.of(myArray).anyMatch(i -> i == n);

        if (contains){
            int [] filtered = Arrays.stream(myArray).filter(i -> i != n).toArray();
            System.out.println(Arrays.toString(filtered));
        } else {
            System.out.println("The array does not contain the number " + n);
        }
    }
}
