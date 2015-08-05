package com.zibilal.myhellojni.nativelib;

/**
 * Created by Bilal on 8/5/2015.
 */
public class NativeLib {
    public static native int getCpuCount();
    public static native String getCpuFamily();

    static {
        System.loadLibrary("NativeLib");
    }
}
