package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;

/* renamed from: com.badlogic.gdx.graphics.glutils.f */
public final class C0491f {
    /* renamed from: a */
    public static int m1518a(int i) {
        return (int) (((float) (Gdx.graphics.mo296e() * i)) / ((float) Gdx.graphics.mo294c()));
    }

    /* renamed from: a */
    public static void m1519a(int i, int i2, int i3, int i4) {
        if (Gdx.graphics.mo294c() == Gdx.graphics.mo296e() && Gdx.graphics.mo295d() == Gdx.graphics.mo297f()) {
            Gdx.gl.glScissor(i, i2, i3, i4);
        } else {
            Gdx.gl.glScissor(C0491f.m1518a(i), C0491f.m1520b(i2), C0491f.m1518a(i3), C0491f.m1520b(i4));
        }
    }

    /* renamed from: b */
    public static int m1520b(int i) {
        return (int) (((float) (Gdx.graphics.mo297f() * i)) / ((float) Gdx.graphics.mo295d()));
    }
}
