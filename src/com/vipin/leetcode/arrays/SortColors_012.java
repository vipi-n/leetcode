package com.vipin.leetcode.arrays;

public class SortColors_012 {

    public void sortColors(int[] nums) {

        int low = 0;
        int high = nums.length - 1;
        int index = 0;

        while(index <= high && low < high){

            if(nums[index] == 0){
                nums[index] = nums[low];
                nums[low] = 0;
                low++;
                index++;

            }else if(nums[index] == 1){
                index++;
            }else{
                nums[index] = nums[high];
                nums[high] = 2;
                high--;
            }
        }

    }
}
