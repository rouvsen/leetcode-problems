package org.example.problems;

public class LeetCode_palindromenumber {
    public static void main(String[] args) {
        System.out.println(
                "Entered number is palindrome: " + isPalindrome(1221)
        );;
    }
    public static boolean isPalindrome(int num) {
        if(num < 0) return false;
        int reverse = 0;
        int temp = num;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return num == reverse;
    }
}
