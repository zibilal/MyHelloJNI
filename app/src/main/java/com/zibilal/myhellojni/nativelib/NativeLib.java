package com.zibilal.myhellojni.nativelib;

/**
 * Created by Bilal on 8/5/2015.
 */
public class NativeLib {

    static {
        System.loadLibrary("NativeLib");
    }

    public static native int getCpuCount();
    public static native String getCpuFamily();
    public static native String stringFromJNI();


}
