LOCAL_PATH := $(call my_dir)
include $(CLEAR_VARS)

LOCAL_MODULE := NativeLib
LOCAL_SRC_FILES := NativeLib.cpp
LOCAL_LDLIBS := llog
LOCAL_STATIC_LIBRARIES := cpufeatures

include $(BUILD_SHARED_LIBRARY)

$(call import-module,android/cpufeatures)