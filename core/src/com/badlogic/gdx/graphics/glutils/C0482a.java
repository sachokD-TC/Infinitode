package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.graphics.glutils.ETC1.C0481a;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* renamed from: com.badlogic.gdx.graphics.glutils.a */
public final class C0482a implements TextureData {
    /* renamed from: a */
    C0316a f2120a;
    /* renamed from: b */
    C0481a f2121b;
    /* renamed from: c */
    boolean f2122c;
    /* renamed from: d */
    int f2123d = 0;
    /* renamed from: e */
    int f2124e = 0;
    /* renamed from: f */
    boolean f2125f = false;

    public C0482a(C0316a c0316a, boolean z) {
        this.f2120a = c0316a;
        this.f2122c = z;
    }

    /* renamed from: a */
    public final void mo390a(int i) {
        if (this.f2125f) {
            if (Gdx.graphics.mo292a("GL_OES_compressed_ETC1_RGB8_texture")) {
                Gdx.gl.glCompressedTexImage2D(i, 0, ETC1.f2093b, this.f2123d, this.f2124e, 0, this.f2121b.f2090c.capacity() - this.f2121b.f2091d, this.f2121b.f2090c);
                if (this.f2122c) {
                    Gdx.gl20.glGenerateMipmap(3553);
                }
            } else {
                Pixmap a = ETC1.m1448a(this.f2121b, Format.RGB565);
                Gdx.gl.glTexImage2D(i, 0, a.m1120d(), a.f1378a.f1654b, a.f1378a.f1655c, 0, a.m1119c(), a.m1121e(), a.m1122f());
                if (this.f2122c) {
                    C0499n.m1583a(i, a, a.f1378a.f1654b, a.f1378a.f1655c);
                }
                a.dispose();
                this.f2122c = false;
            }
            this.f2121b.dispose();
            this.f2121b = null;
            this.f2125f = false;
            return;
        }
        throw new GdxRuntimeException("Call prepare() before calling consumeCompressedData()");
    }

    /* renamed from: a */
    public final boolean mo391a() {
        return this.f2125f;
    }

    /* renamed from: b */
    public final void mo392b() {
        if (this.f2125f) {
            throw new GdxRuntimeException("Already prepared");
        } else if (this.f2120a == null && this.f2121b == null) {
            throw new GdxRuntimeException("Can only load once from ETC1Data");
        } else {
            if (this.f2120a != null) {
                this.f2121b = new C0481a(this.f2120a);
            }
            this.f2123d = this.f2121b.f2088a;
            this.f2124e = this.f2121b.f2089b;
            this.f2125f = true;
        }
    }

    /* renamed from: d */
    public final boolean mo393d() {
        return true;
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
        return this.f2123d;
    }

    /* renamed from: i */
    public final int mo398i() {
        return this.f2124e;
    }

    /* renamed from: j */
    public final Format mo399j() {
        return Format.RGB565;
    }

    /* renamed from: k */
    public final boolean mo400k() {
        return this.f2122c;
    }
}
