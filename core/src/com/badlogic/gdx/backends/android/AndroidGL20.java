package com.badlogic.gdx.backends.android;

import com.badlogic.gdx.graphics.C0284f;
import java.nio.Buffer;
import java.nio.IntBuffer;

public class AndroidGL20 implements C0284f {
    public static native void init();

    public native void glAttachShader(int i, int i2);

    public native void glBindBuffer(int i, int i2);

    public native void glBindFramebuffer(int i, int i2);

    public native void glBindRenderbuffer(int i, int i2);

    public native void glBindTexture(int i, int i2);

    public native void glBlendFunc(int i, int i2);

    public native void glBlendFuncSeparate(int i, int i2, int i3, int i4);

    public native void glBufferData(int i, int i2, Buffer buffer, int i3);

    public native void glBufferSubData(int i, int i2, int i3, Buffer buffer);

    public native int glCheckFramebufferStatus(int i);

    public native void glClear(int i);

    public native void glClearColor(float f, float f2, float f3, float f4);

    public native void glCompileShader(int i);

    public native void glCompressedTexImage2D(int i, int i2, int i3, int i4, int i5, int i6, int i7, Buffer buffer);

    public native int glCreateProgram();

    public native int glCreateShader(int i);

    public native void glDeleteBuffer(int i);

    public native void glDeleteFramebuffer(int i);

    public native void glDeleteProgram(int i);

    public native void glDeleteRenderbuffer(int i);

    public native void glDeleteShader(int i);

    public native void glDeleteTexture(int i);

    public native void glDepthMask(boolean z);

    public native void glDisable(int i);

    public native void glDisableVertexAttribArray(int i);

    public native void glDrawArrays(int i, int i2, int i3);

    public native void glDrawElements(int i, int i2, int i3, int i4);

    public native void glDrawElements(int i, int i2, int i3, Buffer buffer);

    public native void glEnable(int i);

    public native void glEnableVertexAttribArray(int i);

    public native void glFramebufferRenderbuffer(int i, int i2, int i3, int i4);

    public native void glFramebufferTexture2D(int i, int i2, int i3, int i4, int i5);

    public native int glGenBuffer();

    public native int glGenFramebuffer();

    public native int glGenRenderbuffer();

    public native int glGenTexture();

    public native void glGenerateMipmap(int i);

    public native String glGetActiveAttrib(int i, int i2, IntBuffer intBuffer, Buffer buffer);

    public native String glGetActiveUniform(int i, int i2, IntBuffer intBuffer, Buffer buffer);

    public native int glGetAttribLocation(int i, String str);

    public native void glGetIntegerv(int i, IntBuffer intBuffer);

    public native String glGetProgramInfoLog(int i);

    public native void glGetProgramiv(int i, int i2, IntBuffer intBuffer);

    public native String glGetShaderInfoLog(int i);

    public native void glGetShaderiv(int i, int i2, IntBuffer intBuffer);

    public native String glGetString(int i);

    public native int glGetUniformLocation(int i, String str);

    public native void glLinkProgram(int i);

    public native void glPixelStorei(int i, int i2);

    public native void glRenderbufferStorage(int i, int i2, int i3, int i4);

    public native void glScissor(int i, int i2, int i3, int i4);

    public native void glShaderSource(int i, String str);

    public native void glTexImage2D(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Buffer buffer);

    public native void glTexParameterf(int i, int i2, float f);

    public native void glTexSubImage2D(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Buffer buffer);

    public native void glUniform1i(int i, int i2);

    public native void glUniformMatrix4fv(int i, int i2, boolean z, float[] fArr, int i3);

    public native void glUseProgram(int i);

    public native void glVertexAttribPointer(int i, int i2, int i3, boolean z, int i4, int i5);

    public native void glVertexAttribPointer(int i, int i2, int i3, boolean z, int i4, Buffer buffer);

    public native void glViewport(int i, int i2, int i3, int i4);
}
