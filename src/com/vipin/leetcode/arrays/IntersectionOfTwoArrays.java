package com.vipin.leetcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// link https://leetcode.com/problems/intersection-of-two-arrays-ii/

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

    }

    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {

            HashMap<Integer, Integer> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < nums1.length; i++) {
                if (map.containsKey(nums1[i])) {
                    map.put(nums1[i], map.get(nums1[i]) + 1);
                } else
                    map.put(nums1[i], 1);
            }

            for (int i = 0; i < nums2.length; i++) {
                if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                    list.add(nums2[i]);
                    map.put(nums2[i], map.get(nums2[i]) - 1);

                }
            }

            int[] result = new int[list.size()];
            for (int j = 0; j < list.size(); j++) {
                result[j] = list.get(j);
            }

            return result;
        }
    }
}