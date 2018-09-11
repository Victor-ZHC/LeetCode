package com.victor.all.a_title_1_100.b_11_20;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
//        for (Integer integer : sortList) {
//            System.out.printf(integer + " ");
//        }
//        System.out.println();

        for (int i = 0; i < nums.length && nums[i] < 1; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[i] + nums[right] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                }
                double mid = - nums[i] / 2.0;
//                System.out.println(mid);
                if (mid - nums[left] > nums[right] - mid) {
                    do {
                        left++;
                    } while (left < nums.length && nums[left] == nums[left - 1]);
                } else if (mid - nums[left] < nums[right] - mid) {
                    do {
                        right--;
                    } while (right > i && nums[right] == nums[right + 1]);
                } else {
                    do {
                        left++;
                    } while (left < nums.length && nums[left] == nums[left - 1]);
                    do {
                        right--;
                    } while (right > i && nums[right] == nums[right + 1]);
                }
            }
        }

        return result;
    }
}
