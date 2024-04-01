package org.example.problems;

public class LeetCode_trailingzero {
    public static void main(String[] args) {
//        System.out.println(findTrailingZero(125));
        System.out.println(findFactorialExplanationTrailingZero(125));
    }
    public static int findTrailingZero(int num) {
        int count = 0;
        int powFive = 5;
        while (num >= powFive) {
            count += num / powFive;
            powFive *= 5;
        }
        return count;
    }
static int count = 0;
    public static int findFactorialExplanationTrailingZero(int num) {
        System.out.println(num);
        if(num != 0 && num % 5 == 0) {
            count++;
            int temp = num / 5;
            if (temp % 5 == 0) {
                count ++;
                temp = temp / 5;
                if(temp % 5 == 0) {
                    count++;
                }
            }
        }
        if (num == 1 || num == 0) {
            System.out.println("count=" + count);
            return 1;
        }
        return num * findFactorialExplanationTrailingZero(num - 1);
    }
}
