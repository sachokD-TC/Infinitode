package com.badlogic.gdx.graphics;

import java.nio.Buffer;
import java.nio.IntBuffer;

/* renamed from: com.badlogic.gdx.graphics.f */
public interface C0284f {
    void glAttachShader(int i, int i2);

    void glBindBuffer(int i, int i2);

    void glBindFramebuffer(int i, int i2);

    void glBindRenderbuffer(int i, int i2);

    void glBindTexture(int i, int i2);

    void glBlendFunc(int i, int i2);

    void glBlendFuncSeparate(int i, int i2, int i3, int i4);

    void glBufferData(int i, int i2, Buffer buffer, int i3);

    void glBufferSubData(int i, int i2, int i3, Buffer buffer);

    int glCheckFramebufferStatus(int i);

    void glClear(int i);

    void glClearColor(float f, float f2, float f3, float f4);

    void glCompileShader(int i);

    void glCompressedTexImage2D(int i, int i2, int i3, int i4, int i5, int i6, int i7, Buffer buffer);

    int glCreateProgram();

    int glCreateShader(int i);

    void glDeleteBuffer(int i);

    void glDeleteFramebuffer(int i);

    void glDeleteProgram(int i);

    void glDeleteRenderbuffer(int i);

    void glDeleteShader(int i);

    void glDeleteTexture(int i);

    void glDepthMask(boolean z);

    void glDisable(int i);

    void glDisableVertexAttribArray(int i);

    void glDrawArrays(int i, int i2, int i3);

    void glDrawElements(int i, int i2, int i3, int i4);

    void glDrawElements(int i, int i2, int i3, Buffer buffer);

    void glEnable(int i);

    void glEnableVertexAttribArray(int i);

    void glFramebufferRenderbuffer(int i, int i2, int i3, int i4);

    void glFramebufferTexture2D(int i, int i2, int i3, int i4, int i5);

    int glGenBuffer();

    int glGenFramebuffer();

    int glGenRenderbuffer();

    int glGenTexture();

    void glGenerateMipmap(int i);

    String glGetActiveAttrib(int i, int i2, IntBuffer intBuffer, Buffer buffer);

    String glGetActiveUniform(int i, int i2, IntBuffer intBuffer, Buffer buffer);

    int glGetAttribLocation(int i, String str);

    void glGetIntegerv(int i, IntBuffer intBuffer);

    String glGetProgramInfoLog(int i);

    void glGetProgramiv(int i, int i2, IntBuffer intBuffer);

    String glGetShaderInfoLog(int i);

    void glGetShaderiv(int i, int i2, IntBuffer intBuffer);

    String glGetString(int i);

    int glGetUniformLocation(int i, String str);

    void glLinkProgram(int i);

    void glPixelStorei(int i, int i2);

    void glRenderbufferStorage(int i, int i2, int i3, int i4);

    void glScissor(int i, int i2, int i3, int i4);

    void glShaderSource(int i, String str);

    void glTexImage2D(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Buffer buffer);

    void glTexParameterf(int i, int i2, float f);

    void glTexSubImage2D(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Buffer buffer);

    void glUniform1i(int i, int i2);

    void glUniformMatrix4fv(int i, int i2, boolean z, float[] fArr, int i3);

    void glUseProgram(int i);

    void glVertexAttribPointer(int i, int i2, int i3, boolean z, int i4, int i5);

    void glVertexAttribPointer(int i, int i2, int i3, boolean z, int i4, Buffer buffer);

    void glViewport(int i, int i2, int i3, int i4);
}
