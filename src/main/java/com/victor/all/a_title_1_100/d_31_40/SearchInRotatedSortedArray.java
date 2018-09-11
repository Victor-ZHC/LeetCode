package com.victor.all.a_title_1_100.d_31_40;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        if (target == nums[right] || target == nums[left]) {
            return target == nums[right] ? right : left;
        } else if (nums[left] < nums[right]) {
            while (left < right - 1) {
                int mid = (left + right) / 2;

                if (nums[mid] == target) {
                    return mid;
                }

                if (nums[mid] > target) {
                    right = mid;
                } else {
                    left = mid;
                }
            }
            return -1;
        } else if (target < nums[right]) {
            while (left < right - 1) {
                int mid = (left + right) / 2;

                if (nums[mid] == target) {
                    return mid;
                }

                if (nums[mid] > nums[0]) {
                    left = mid;
                } else if (nums[mid] > target) {
                    right = mid;
                } else {
                    left = mid;
                }
            }
            return -1;
        } else if (target > nums[left]) {
            while (left < right - 1) {
                int mid = (left + right) / 2;

                if (nums[mid] == target) {
                    return mid;
                }

                if (nums[mid] < nums[nums.length - 1]) {
                    right = mid;
                } else if (nums[mid] > target) {
                    right = mid;
                } else {
                    left = mid;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }
}
