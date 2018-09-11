package com.victor.jvmtest;

import org.junit.Test;

public class EscapeGCTest {

    @Test
    public void testEscapeGC() throws Exception {
        EscapeGC.SAVE_HOOK = new EscapeGC();

        EscapeGC.SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if (EscapeGC.SAVE_HOOK != null) {
            EscapeGC.SAVE_HOOK.isAlive();
        } else {
            System.out.println("i am dead");
        }

        EscapeGC.SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if (EscapeGC.SAVE_HOOK != null) {
            EscapeGC.SAVE_HOOK.isAlive();
        } else {
            System.out.println("i am dead");
        }
    }

}