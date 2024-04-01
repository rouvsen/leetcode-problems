package org.example.problems;

public class LeetCode_reverseInteger {
    public static void main(String[] args) {
        System.out.println(
                findReverse(12345)
        );;
    }
    public static int findReverse(int num) {
        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) return 0; //it's always false, but sometimes given number can be Long you should convert to int and then process it
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            if (reverse > Integer.MAX_VALUE / 10) return 0;
            if (reverse < Integer.MIN_VALUE / 10) return 0;
            num = num / 10;
        }
        return reverse;
    }
}
