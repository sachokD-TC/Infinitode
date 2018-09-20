package com.badlogic.gdx.backends.android;

import android.opengl.GLES30;
import com.badlogic.gdx.graphics.C0322g;
import java.nio.IntBuffer;

/* renamed from: com.badlogic.gdx.backends.android.i */
public final class C0323i extends AndroidGL20 implements C0322g {
    /* renamed from: a */
    public final void mo286a(int i) {
        GLES30.glBindVertexArray(i);
    }

    /* renamed from: a */
    public final void mo287a(int i, int i2, int i3, int i4, int i5, int i6) {
        GLES30.glTexImage3D(35866, 0, i, i2, i3, i4, 0, i5, i6, 0);
    }

    /* renamed from: a */
    public final void mo288a(int i, IntBuffer intBuffer) {
        GLES30.glDrawBuffers(i, intBuffer);
    }

    /* renamed from: a */
    public final void mo289a(IntBuffer intBuffer) {
        GLES30.glDeleteVertexArrays(1, intBuffer);
    }

    /* renamed from: b */
    public final void mo290b(IntBuffer intBuffer) {
        GLES30.glGenVertexArrays(1, intBuffer);
    }
}
