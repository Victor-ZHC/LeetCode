package com.victor.all.e_title_501_600.e_41_50;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class FriendCirclesTest {

    @Test
    public void findCircleNum() {
        int[][] M = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(new FriendCircles().findCircleNum(M));

    }
}