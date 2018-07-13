package com.example.fzy.ndkdemo;

public class Java2CJni {

    static {
        System.loadLibrary("Java2C");
    }

    public native String java2c();
}
