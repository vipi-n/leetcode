package com.vipin.leetcode.string;

//link : https://leetcode.com/problems/first-unique-character-in-a-string/
public class FirstUniqueCharacterInAString {

        public int firstUniqChar(String s) {

            int[] resultArr = new int[26];

            for (int i = 0; i <s.length() ; i++) {
                resultArr[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i <s.length() ; i++) {
                if (resultArr[s.charAt(i) - 'a'] == 1)
                    return i;
            }
            return -1;
        }
    }
