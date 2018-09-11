package com.victor.all.a_title_1_100.a_1_10;

/**
 * Created by Victor_Zhou on 2017-5-26.
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int totalLength = m + n;
        int[] nums;

        if (m == 0) {
            nums = nums2;
        } else if (n == 0) {
            nums = nums1;
        } else {
            nums = new int[totalLength];
            int firstIndex = nums1[0] <= nums1[m - 1] ? 0 : m - 1;
            int firstStep = nums1[0] <= nums1[m - 1] ? 1 : -1;
            int secondIndex = nums2[0] <= nums2[n - 1] ? 0 : n - 1;
            int secondStep = nums1[0] <= nums1[m - 1] ? 1 : -1;
            for (int i = 0; i < totalLength; i++) {
                if (firstIndex < m && firstIndex >= 0 && secondIndex < n && secondIndex >= 0) {
                    if (nums1[firstIndex] < nums2[secondIndex]) {
                        nums[i] = nums1[firstIndex];
                        firstIndex += firstStep;
                    } else {
                        nums[i] = nums2[secondIndex];
                        secondIndex += secondStep;
                    }
                } else if (firstIndex < m && firstIndex >= 0) {
                    nums[i] = nums1[firstIndex];
                    firstIndex += firstStep;
                } else {
                    nums[i] = nums2[secondIndex];
                    secondIndex += secondStep;
                }
            }
        }

        return totalLength % 2 == 0 ? (nums[(totalLength / 2) - 1] + nums[totalLength / 2]) / 2.0 : nums[totalLength / 2];
    }
}
