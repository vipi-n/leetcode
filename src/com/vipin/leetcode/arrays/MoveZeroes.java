package com.vipin.leetcode.arrays;

//link https://leetcode.com/problems/move-zeroes/

public class MoveZeroes {

        public int[] moveZeroes(int[] nums) {
            int snowBall = 0;
            int length = nums.length;
            for (int i = 0; i < length; i++) {
                if (nums[i] == 0) {
                    snowBall++;
                } else if (snowBall > 0) {
                    int t = nums[i];
                    nums[i] = 0;
                    nums[i - snowBall] = t;
                }
            }
            return nums;
        }
    }




