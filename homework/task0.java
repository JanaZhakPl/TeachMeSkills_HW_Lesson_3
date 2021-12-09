/**
 * program outputs the message if the array contains an input number or not.
 */

package com.teachmeskills.lesson_3.homework;

import java.util.Scanner;
import java.util.stream.IntStream;

public class task0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] myArray = {1,4,57,87,3};

        boolean contains = IntStream.of(myArray).anyMatch(i -> i == n);

        if (contains){
            System.out.println("The array contains the number " + n);
        } else {
            System.out.println("The array does not contain the number " + n);
        }
    }
}

