package com.lb6905.jnidemo;

import android.util.Log;

/**
 * Created by lb6905 on 2017/7/18.
 */

public final class TestClass {
    private final static String TAG = "TestClass";

    public TestClass(){
        Log.i(TAG, "TestClass");
    }

    public void test(int index) {
        Log.i(TAG, "test : " + index);
    }

    public static void testStatic(String str) {
        Log.i(TAG, "testStatic : " + str);
    }

    public static class InnerClass {
        private int num;
        public InnerClass() {
            Log.i(TAG, "InnerClass");
        }

        public void setInt(int n) {
            num = n;
            Log.i(TAG, "setInt: num = " + num);
        }
    }

    public static TestClass getNamess(String s){
        Log.i(TAG, "get single:" + s);
        return new TestClass();
    }
    public byte[] getBytefun(){
        byte[] byteArray = new byte[] {87, 79, 87, 46, 46, 46};
        return byteArray;
    }
}
