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
JNIEXPORT jstring JNICALL Java_com_zibilal_myhellojni_nativelib_NativeLib_stringFromJNI(JNIEnv *, jobject);
JNIEXPORT void JNICALL Java_com_zibilal_myhellojni_nativelib_NativeLib_init(JNIEnv * env, jobject obj,  jint width, jint height);
JNIEXPORT void JNICALL Java_com_zibilal_myhellojni_nativelib_NativeLib_step(JNIEnv * env, jobject obj);

#ifdef __cplusplus
}
#endif
#endif //MYHELLOJNI_NATIVELIB_H
