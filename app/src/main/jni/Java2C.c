//
// Created by FZY on 2018/7/10.
//

#include "com_example_fzy_ndkdemo_Java2CJni.h"
JNIEXPORT jstring JNICALL Java_com_example_fzy_ndkdemo_Java2CJni_java2c(JNIEnv * env, jobject instance)
{
     return (*env)->NewStringUTF(env,"I am From Native c .");
 }
