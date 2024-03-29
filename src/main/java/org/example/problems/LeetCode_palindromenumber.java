package org.example.problems;

public class LeetCode_palindromenumber {
    public static void main(String[] args) {
        System.out.println(
                "Entered number is palindrome: " + isPalindrome(12333211)
        );
        System.out.println(
                "Entered number is palindrome: " + isPalindrome2(12333211)
        );
    }
    public static boolean isPalindrome(int num) {//TC: O(n)
        if(num < 0) return false;
        if(num != 0 && num % 10 == 0) return false;
        int reverse = 0;
        int temp = num;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return num == reverse;
    }
    //TODO: write that TC: O(log(n))
    public static boolean isPalindrome2(int num) {
        if (num < 0) return false;
        if (num != 0 && num % 10 == 0) return false;
        int reverse = 0;
        while(num > reverse) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return (reverse == num) || (reverse / 10 == num);
    }

}
