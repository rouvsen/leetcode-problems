package org.example.problems;

import java.util.Arrays;
import java.util.Scanner;

/**

If number divisible for 3 and 5 > FizzBuzz
 If divisible for 3 < Fizz
 If divisible for ,5 < Buzz

 * */

public class LeetCode_fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.println(
                Arrays.toString(findFizzBuzz(sc.nextInt()))
        );
    }
    public static String[] findFizzBuzz(int num) {
        if(num < 1) {
            throw new IllegalArgumentException("Invalid num!");
        }
        String[] arr = new String[num];
        for (int i = 1; i <= num; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                arr[i - 1] = "FizzBuzz";
            } else if(i % 3 == 0) {
                arr[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                arr[i - 1] = "Buzz";
            } else {
                arr[i - 1] = String.valueOf(i);
            }
        }
        return arr;
    }
}
