package com.vipin.leetcode.arrays;

//link https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicatesFromSortedArray {

        public int removeDuplicates(int[] nums) {

            int j = 0;
            for (int i = 1; i < nums.length; i++) {

                if (nums[i] != nums[j]) {
                    j++;
                    nums[j] = nums[i];
                }

            }
            return j + 1;
        }
    }
