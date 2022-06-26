package com.vipin.leetcode.arrays;

//link https://leetcode.com/problems/rotate-array/

public class RotateArray {

        public void rotate(int[] nums, int k) {
            k %= nums.length;
            int len = nums.length;

            reverse(0, len - 1, nums);
            reverse(0, k - 1, nums);
            reverse(k, len - 1, nums);
        }

        public void reverse(int start, int end, int[] arr) {

            int temp;

            while (start < end) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

    }

