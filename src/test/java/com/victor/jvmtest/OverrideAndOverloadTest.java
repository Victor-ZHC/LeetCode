package com.victor.jvmtest;

import org.junit.Test;

public class OverrideAndOverloadTest {

    @Test
    public void testOverrideAndOverload() throws Exception {
        OverrideAndOverload.Child obj = new OverrideAndOverload.Child();
        obj.sayHello('a');
    }

}