package com.victor.all.a_title_1_100.a_1_10;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个int数组，在其中找到两数，其和为target
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 *
 * return [0, 1].
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) throws Exception {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new Exception("no result");
    }

    public int[] twoSumBetter(int[] nums, int target) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        throw new Exception("no result");
    }

}
