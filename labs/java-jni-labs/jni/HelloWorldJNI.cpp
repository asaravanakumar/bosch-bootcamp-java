#include <jni.h>
#include <iostream>
#include "HelloWorldJNI.h"

using namespace std;

JNIEXPORT void JNICALL Java_HelloWorldJNI_sayHello(JNIEnv *env, jobject obj) {
    cout << "Hello, World from C++!" << endl;
    return;
}
