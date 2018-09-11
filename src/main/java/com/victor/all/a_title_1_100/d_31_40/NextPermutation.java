package com.victor.all.a_title_1_100.d_31_40;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        if (i < 0) {
            return;
        }

        while (i > -1) {
            if (nums[i] >= nums[i + 1]) {
                i--;
            } else {
                break;
            }
        }

        if (i > -1) {
            int dis = Integer.MAX_VALUE;
            int minIndex = i + 1;
            for (int j = i + 1; j < nums.length; j++) {
                int d = nums[j] - nums[i];

                if (d > 0 && d < dis) {
                    dis = d;
                    minIndex = j;
                }
            }

            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        sort(nums, i + 1, nums.length - 1);
    }

    public void sort(int[] nums, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int i = begin;
        int j = end;

        while (begin < end) {
            while (begin < end && nums[begin] <= nums[end]) {
                end--;
            }
            int temp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = temp;

            while (begin < end && nums[begin] <= nums[end]) {
                begin++;
            }
            temp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = temp;
        }
        sort(nums, i, begin - 1);
        sort(nums, begin + 1, j);
    }
}
