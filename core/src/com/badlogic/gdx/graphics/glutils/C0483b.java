package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.graphics.C0509j.C0508a;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.graphics.TextureData.TextureDataType;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* renamed from: com.badlogic.gdx.graphics.glutils.b */
public final class C0483b implements TextureData {
    /* renamed from: a */
    final C0316a f2126a;
    /* renamed from: b */
    int f2127b = 0;
    /* renamed from: c */
    int f2128c = 0;
    /* renamed from: d */
    Format f2129d;
    /* renamed from: e */
    Pixmap f2130e;
    /* renamed from: f */
    boolean f2131f;
    /* renamed from: g */
    boolean f2132g = false;

    public C0483b(C0316a c0316a, Pixmap pixmap, Format format, boolean z) {
        this.f2126a = c0316a;
        this.f2130e = pixmap;
        this.f2129d = format;
        this.f2131f = z;
        if (this.f2130e != null) {
            this.f2127b = this.f2130e.f1378a.f1654b;
            this.f2128c = this.f2130e.f1378a.f1655c;
            if (format == null) {
                this.f2129d = this.f2130e.m1123g();
            }
        }
    }

    /* renamed from: a */
    public final void mo390a(int i) {
        throw new GdxRuntimeException("This TextureData implementation does not upload data itself");
    }

    /* renamed from: a */
    public final boolean mo391a() {
        return this.f2132g;
    }

    /* renamed from: b */
    public final void mo392b() {
        if (this.f2132g) {
            throw new GdxRuntimeException("Already prepared");
        }
        if (this.f2130e == null) {
            String name = this.f2126a.f1119a.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if ((lastIndexOf == -1 ? "" : name.substring(lastIndexOf + 1)).equals("cim")) {
                this.f2130e = C0508a.m1659a(this.f2126a);
            } else {
                this.f2130e = new Pixmap(this.f2126a);
            }
            this.f2127b = this.f2130e.f1378a.f1654b;
            this.f2128c = this.f2130e.f1378a.f1655c;
            if (this.f2129d == null) {
                this.f2129d = this.f2130e.m1123g();
            }
        }
        this.f2132g = true;
    }

    /* renamed from: d */
    public final boolean mo393d() {
        return true;
    }

    /* renamed from: e */
    public final TextureDataType mo394e() {
        return TextureDataType.Pixmap;
    }

    /* renamed from: f */
    public final Pixmap mo395f() {
        if (this.f2132g) {
            this.f2132g = false;
            Pixmap pixmap = this.f2130e;
            this.f2130e = null;
            return pixmap;
        }
        throw new GdxRuntimeException("Call prepare() before calling getPixmap()");
    }

    /* renamed from: g */
    public final boolean mo396g() {
        return true;
    }

    /* renamed from: h */
    public final int mo397h() {
        return this.f2127b;
    }

    /* renamed from: i */
    public final int mo398i() {
        return this.f2128c;
    }

    /* renamed from: j */
    public final Format mo399j() {
        return this.f2129d;
    }

    /* renamed from: k */
    public final boolean mo400k() {
        return this.f2131f;
    }
}
