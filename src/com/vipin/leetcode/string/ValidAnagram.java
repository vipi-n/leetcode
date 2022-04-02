package com.vipin.leetcode.string;

//link : https://leetcode.com/problems/valid-anagram/

public class ValidAnagram {

    public static void main(String[] args) {

    }
    class Solution {
        public boolean isAnagram(String s, String t) {


            int lengthS = s.length();
            int lengthT = t.length() ;
            int[] res = new int[26];

            for (int i = 0; i <lengthS ; i++) {
                res[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i <lengthT ; i++) {
                res[t.charAt(i) -'a']--;
            }
            for (int i : res){
                if (i != 0)
                    return false;
            }
            return true;
        }
    }

}
