package com.victor.jvmtest;

public class EscapeGC {
    public static EscapeGC SAVE_HOOK = null;

    public void isAlive() {
        System.out.println("i am still alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed!");
        EscapeGC.SAVE_HOOK = this;
    }
}
