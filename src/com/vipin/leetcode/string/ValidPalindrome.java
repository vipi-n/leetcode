package com.vipin.leetcode.string;

//link : https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {

    public static void main(String[] args) {

    }
    class Solution {
        public boolean isPalindrome(String s) {


            String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
            System.out.println(str);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != str.charAt(str.length()-1-i))
                    return false;
            }
            return true;
        }
    }

}
