package com.victor.all.a_title_1_100.b_11_20;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {

    @Test
    public void maxArea() {
        int[] height = new int[15000];
        for (int i = 0; i < height.length; i++) {
            height[i] = i + 1;
        }
        System.out.println(new ContainerWithMostWater().maxArea(height));
    }
}