package com.example.cmakendkdemo;

public class Java2CJni {

    static {
        System.loadLibrary("Java2C");
    }

    public native String java2c();
}
