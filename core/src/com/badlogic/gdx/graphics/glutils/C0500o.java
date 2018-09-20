package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.graphics.TextureData.TextureDataType;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* renamed from: com.badlogic.gdx.graphics.glutils.o */
public final class C0500o implements TextureData {
    /* renamed from: a */
    final Pixmap f2217a;
    /* renamed from: b */
    final Format f2218b;
    /* renamed from: c */
    final boolean f2219c;
    /* renamed from: d */
    final boolean f2220d;
    /* renamed from: e */
    final boolean f2221e;

    public C0500o(Pixmap pixmap, Format format, boolean z) {
        this(pixmap, format, false, z, false);
    }

    public C0500o(Pixmap pixmap, Format format, boolean z, boolean z2, boolean z3) {
        this.f2217a = pixmap;
        if (format == null) {
            format = pixmap.m1123g();
        }
        this.f2218b = format;
        this.f2219c = z;
        this.f2220d = z2;
        this.f2221e = z3;
    }

    /* renamed from: a */
    public final void mo390a(int i) {
        throw new GdxRuntimeException("This TextureData implementation does not upload data itself");
    }

    /* renamed from: a */
    public final boolean mo391a() {
        return true;
    }

    /* renamed from: b */
    public final void mo392b() {
        throw new GdxRuntimeException("prepare() must not be called on a PixmapTextureData instance as it is already prepared.");
    }

    /* renamed from: d */
    public final boolean mo393d() {
        return this.f2221e;
    }

    /* renamed from: e */
    public final TextureDataType mo394e() {
        return TextureDataType.Pixmap;
    }

    /* renamed from: f */
    public final Pixmap mo395f() {
        return this.f2217a;
    }

    /* renamed from: g */
    public final boolean mo396g() {
        return this.f2220d;
    }

    /* renamed from: h */
    public final int mo397h() {
        return this.f2217a.f1378a.f1654b;
    }

    /* renamed from: i */
    public final int mo398i() {
        return this.f2217a.f1378a.f1655c;
    }

    /* renamed from: j */
    public final Format mo399j() {
        return this.f2218b;
    }

    /* renamed from: k */
    public final boolean mo400k() {
        return this.f2219c;
    }
}
