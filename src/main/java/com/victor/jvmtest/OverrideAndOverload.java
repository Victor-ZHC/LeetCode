package com.victor.jvmtest;

public class OverrideAndOverload {

    static class Parent {
        //  2优先级
        public void sayHello(char arg) {
            System.out.println("parent say " + arg);
        }

        //  3优先级
        public void sayHello(int arg) {
            System.out.println("parent say " + arg);
        }
    }

    static class Child extends Parent {
        //  1优先级
        @Override
        public void sayHello(char arg) {
            System.out.println("child say " + arg);
        }

        //  4优先级
        public void sayHello(Character arg) {
            System.out.println("child say " + arg);
        }
    }

}
