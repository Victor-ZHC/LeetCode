package com.victor.all.interview_question;

import org.junit.Test;

public class BinaryTreeSerializeAndDeserializeTest {

    @Test
    public void test() {
        String s = "1,2,4,$,$,$,3,5,$,$,6,$,$";
        BinaryTreeSerializeAndDeserialize bsd = new BinaryTreeSerializeAndDeserialize();

        TreeNode root = bsd.deserialize(s);

        System.out.println(bsd.serialize(root));
    }
}