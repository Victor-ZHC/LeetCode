package com.victor.all.a_title_1_100.b_11_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {

            for (int j = i + 1; j < nums.length - 2; j++) {

                int left = j + 1, right = nums.length - 1, rest = target - nums[i] - nums[j];

                while (left < right) {
                    if (nums[i] + nums[j] + nums[left] + nums[right] == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        result.add(list);
                    }

                    if (nums[left] + nums[right] > rest) {
                        do {
                            right--;
                        } while (left < right && nums[right] == nums[right + 1]);
                    } else if (nums[left] + nums[right] < rest) {
                        do {
                            left++;
                        } while (left < right && nums[left] == nums[left - 1]);
                    } else {
                        do {
                            left++;
                        } while (left < right && nums[left] == nums[left - 1]);
                        do {
                            right--;
                        } while (left < right && nums[right] == nums[right + 1]);
                    }
                }

                while (j < nums.length - 2 && nums[j] == nums[j + 1]) {
                    j++;
                }
            }

            while (i < nums.length - 3 && nums[i] == nums[i + 1]) {
                i++;
            }
        }

        return result;
    }
}
