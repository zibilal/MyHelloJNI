//
// Created by Bilal on 8/5/2015.
//
#include <jni.h>
#ifndef MYHELLOJNI_NATIVELIB_H
#define MYHELLOJNI_NATIVELIB_H
#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT jint JNICALL Java_com_zibilal_myhellojni_nativelib_NativeLib_getCpuCount(JNIEnv *, jclass);
JNIEXPORT jstring JNICALL Java_com_zibilal_myhellojni_nativelib_NativeLib_getCpuFamily(JNIEnv *, jclass);

#ifdef __cplusplus
}
#endif
#endif //MYHELLOJNI_NATIVELIB_H
