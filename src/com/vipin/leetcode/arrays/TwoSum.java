package com.vipin.leetcode.arrays;

//link https://leetcode.com/problems/two-sum/

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int length = nums.length;
            int f = 0;
            int l = 0;
            if (length == 1) {
                return nums;
            }
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (nums[i] + nums[j] == target) {
                        f = i;
                        l = j;
                    }
                }
            }
            return new int[]{f, l};

        }
    }

    //  optimized --

    class SolutionOp {
        public int[] twoSum(int[] numbers, int target) {
            int[] result = new int[2];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < numbers.length; i++) {
                if (map.containsKey(target - numbers[i])) {
                    result[1] = i;
                    result[0] = map.get(target - numbers[i]);
                }
                map.put(numbers[i], i);
            }
            return result;
        }
    }

}
