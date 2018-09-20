package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.graphics.TextureData.TextureDataType;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* renamed from: com.badlogic.gdx.graphics.glutils.e */
public final class C0490e implements TextureData {
    /* renamed from: a */
    int f2160a = 0;
    /* renamed from: b */
    int f2161b = 0;
    /* renamed from: c */
    boolean f2162c = false;
    /* renamed from: d */
    int f2163d = 0;
    /* renamed from: e */
    int f2164e;
    /* renamed from: f */
    int f2165f;
    /* renamed from: g */
    int f2166g;

    public C0490e(int i, int i2, int i3, int i4, int i5) {
        this.f2160a = i;
        this.f2161b = i2;
        this.f2163d = 0;
        this.f2164e = i3;
        this.f2165f = i4;
        this.f2166g = i5;
    }

    /* renamed from: a */
    public final void mo390a(int i) {
        Gdx.gl.glTexImage2D(i, this.f2163d, this.f2164e, this.f2160a, this.f2161b, 0, this.f2165f, this.f2166g, null);
    }

    /* renamed from: a */
    public final boolean mo391a() {
        return this.f2162c;
    }

    /* renamed from: b */
    public final void mo392b() {
        if (this.f2162c) {
            throw new GdxRuntimeException("Already prepared");
        }
        this.f2162c = true;
    }

    /* renamed from: d */
    public final boolean mo393d() {
        return false;
    }

    /* renamed from: e */
    public final TextureDataType mo394e() {
        return TextureDataType.Custom;
    }

    /* renamed from: f */
    public final Pixmap mo395f() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    /* renamed from: g */
    public final boolean mo396g() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    /* renamed from: h */
    public final int mo397h() {
        return this.f2160a;
    }

    /* renamed from: i */
    public final int mo398i() {
        return this.f2161b;
    }

    /* renamed from: j */
    public final Format mo399j() {
        return Format.RGBA8888;
    }

    /* renamed from: k */
    public final boolean mo400k() {
        return false;
    }
}
