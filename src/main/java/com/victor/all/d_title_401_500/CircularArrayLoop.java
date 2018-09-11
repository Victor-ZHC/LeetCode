package com.victor.all.d_title_401_500;

/**
 * Created by Victor_Zhou on 2017-5-24.
 */
public class CircularArrayLoop {
    public boolean circularArrayLoop(int[] nums) {
        int beginIndex, currentIndex;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                beginIndex = i;
                currentIndex = i;
                int step = nums[i];
                int direction = step > 0 ? 1 : -1;

                while (step != 0) {
                    if (step * direction < 0) {
                        break;
                    }

                    int nextIndex = (currentIndex + step) % nums.length;
                    nextIndex = nextIndex < 0 ? nextIndex + nums.length : nextIndex;
                    nums[currentIndex] = 0;

                    if (nums[nextIndex] == 0) {
                        if (nextIndex == beginIndex && nextIndex != currentIndex) {
                            return true;
                        }
                    }

                    currentIndex = nextIndex;
                    step = nums[currentIndex];
                }
            }
        }
        return false;
    }
}
