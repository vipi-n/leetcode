package com.vipin.leetcode.string;

//link : https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalindromeII {

    public static void main(String[] args) {

    }

    class Solution {
        public boolean validPalindrome(String s) {

            int len = s.length();
            int i = 0;
            int j = len - 1;

            while (i < j) {

                if (s.charAt(i) != s.charAt(j)) {
                    return isPalindrome(s, i+1, j) || isPalindrome(s, i, j-1);
                }
                i++;
                j--;
            }
            return true;
        }

        public boolean isPalindrome(String s, int i, int j){

            while (i < j){
                if (s.charAt(i) != s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }


    }
}
