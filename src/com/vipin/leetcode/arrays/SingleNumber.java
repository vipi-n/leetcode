package com.vipin.leetcode.arrays;

//link https://leetcode.com/problems/single-number/

public class SingleNumber {

        public int singleNumber(int[] nums) {
            int result = 0;
            for (int i : nums) {
                result = result ^ i;
            }
            return result;
        }
}
