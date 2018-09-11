package com.victor.all.a_title_1_100.d_31_40;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] {-1, -1};
        }

        int left = 0;
        int right = nums.length - 1;

        int i = left;
        int j = right;

        int lIndex = -1;
        while (i < j - 1) {
            int lMid = (i + j) / 2;
            if (nums[lMid] >= target) {
                if (nums[lMid] == target) {
                    lIndex = lMid;
                }
                j = lMid;
            } else {
                i = lMid;
            }
        }

        if (nums[j] == target) {
            lIndex = j;
        }

        if (nums[i] == target) {
            lIndex = i;
        }

        int rIndex = -1;

        i = left;
        j = right;

        while (i < j - 1) {
            int rMid = (i + j + 1) / 2;
            if (nums[rMid] <= target) {
                if (nums[rMid] == target) {
                    rIndex = rMid;
                }
                i = rMid;
            } else {
                j = rMid;
            }
        }

        if (nums[i] == target) {
            rIndex = i;
        }

        if (nums[j] == target) {
            rIndex = j;
        }

        return new int[] {lIndex, rIndex};
    }
}
