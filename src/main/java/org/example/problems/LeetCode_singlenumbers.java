package org.example.problems;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_singlenumbers {
    public static void main(String[] args) {
        System.out.println(
                "Version one: " + findV1(new int[] {2,2,1})
        );
        System.out.println(
                "Version two: " + findV2(new int[] {2,2,1})
        );
    }

    //XOR operator, 2 ^ 2 = 0, 1 ^ 1 = 0, 2 ^ 2 ^ 1 = 0 ^ 1 = 1, result = 1
    public static int findV1(int[] nums) {//Bitwise XOR operator, 2 ^ 2 ^ 1 > 1
        if(nums.length == 1) return nums[0];
        int singleNum = 0;
        for(int num : nums) {
            singleNum = singleNum ^ num;
        }
        return singleNum;
    }

    public static int findV2(int[] nums) {
        if(nums.length == 1) return nums[0];
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().hasNext() ? set.iterator().next() : -1 ;
    }
}
