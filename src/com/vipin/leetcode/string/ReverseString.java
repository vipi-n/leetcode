package com.vipin.leetcode.string;

//link : https://leetcode.com/problems/reverse-string/

public class ReverseString {
    public static void main(String[] args) {

    }

    class Solution {
        public char[] reverseString(char[] s) {
            char temp;
            int len = s.length;
            for (int i = 0; i < len/2 ; i++) {
                temp = s[i];
                s[i] = s[len-1-i];
                s[len-1-i] = temp;
            }
            return s;
        }
    }
}
