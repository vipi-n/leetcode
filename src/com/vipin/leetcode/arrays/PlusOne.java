package com.vipin.leetcode.arrays;

//link https://leetcode.com/problems/plus-one/

public class PlusOne {

        public int[] plusOne(int[] digits) {

            int length = digits.length;
            for (int i = length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }
            int[] newArr = new int[length + 1];
            newArr[0] = 1;
            return newArr;
        }
}
