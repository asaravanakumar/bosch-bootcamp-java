#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_bosch_labs_jni_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++. It Works!!!";
    return env->NewStringUTF(hello.c_str());
}