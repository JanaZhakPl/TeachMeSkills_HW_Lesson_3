/**
 *  program creates 2 arrays with 5 numbers, outputs them on two lines, calculates the average of each array
 *  and compares them outputting message if they are equal, or which array`s average  is greater
  */
package com.teachmeskills.lesson_3.homework;

import java.util.Arrays;

public class task3 {

public static void main(String[]args){
    int []myArray1 =  {1,10,4,4,127};
    int []myArray2 = {1,4,4,10,127};
    System.out.println(Arrays.toString(myArray1));
    System.out.println(Arrays.toString(myArray2));

    double average1 = 0;
    double average2 = 0;
    double sum = 0;
    double sum2 = 0;

    for(int i = 0 ; i < myArray1.length ; i++){
        sum += myArray1[i];
    }

    for(int i = 0 ; i < myArray1.length ; i++){
        sum2 += myArray2[i];
    }

    average1 = sum / myArray1.length;
    average2 = sum2 / myArray2.length;

    System.out.println("The average value  for myArray1 is "  + average1);
    System.out.println("The average value  for myArray2 is "  + average2);

    if (average1 > average2){
        System.out.println("The average value is greater for myArray1");
    } else if (average1 < average2){
        System.out.println("The average value is greater for myArray2");
    } else {
        System.out.println("Average values are equal for myArray1 and myArray2");
    }
}


}
