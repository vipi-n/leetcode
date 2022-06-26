package com.vipin.leetcode.arrays;

import java.util.HashSet;
//link https://leetcode.com/problems/contains-duplicate/

public class ContainsDuplicate {

        public boolean containsDuplicate(int[] nums) {

            HashSet<Integer> set = new HashSet<>();
            for (int i : nums) {
                set.add(i);
            }
            return set.size() != nums.length;
        }
    }

