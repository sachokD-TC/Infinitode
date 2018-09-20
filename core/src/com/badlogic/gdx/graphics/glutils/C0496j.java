package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.badlogic.gdx.graphics.glutils.j */
public final class C0496j implements C0494l {
    /* renamed from: a */
    final ShortBuffer f2186a;
    /* renamed from: b */
    final ByteBuffer f2187b;
    /* renamed from: c */
    int f2188c;
    /* renamed from: d */
    final boolean f2189d;
    /* renamed from: e */
    boolean f2190e = true;
    /* renamed from: f */
    boolean f2191f = false;
    /* renamed from: g */
    final int f2192g;
    /* renamed from: h */
    private final boolean f2193h;

    public C0496j(boolean z, int i) {
        boolean z2 = false;
        if (i == 0) {
            z2 = true;
        }
        this.f2193h = z2;
        if (this.f2193h) {
            i = 1;
        }
        this.f2187b = BufferUtils.m2247c(i * 2);
        this.f2189d = true;
        this.f2186a = this.f2187b.asShortBuffer();
        this.f2186a.flip();
        this.f2187b.flip();
        this.f2188c = Gdx.gl20.glGenBuffer();
        this.f2192g = z ? 35044 : 35048;
    }

    /* renamed from: a */
    public final int mo414a() {
        return this.f2193h ? 0 : this.f2186a.limit();
    }

    /* renamed from: a */
    public final void mo415a(short[] sArr, int i) {
        this.f2190e = true;
        this.f2186a.clear();
        this.f2186a.put(sArr, 0, i);
        this.f2186a.flip();
        this.f2187b.position(0);
        this.f2187b.limit(i << 1);
        if (this.f2191f) {
            Gdx.gl20.glBufferData(34963, this.f2187b.limit(), this.f2187b, this.f2192g);
            this.f2190e = false;
        }
    }

    /* renamed from: b */
    public final void dispose() {
        Gdx.gl20.glBindBuffer(34963, 0);
        Gdx.gl20.glDeleteBuffer(this.f2188c);
        this.f2188c = 0;
        BufferUtils.m2243a(this.f2187b);
    }

    /* renamed from: c */
    public final int mo416c() {
        return this.f2193h ? 0 : this.f2186a.capacity();
    }

    /* renamed from: d */
    public final ShortBuffer mo417d() {
        this.f2190e = true;
        return this.f2186a;
    }

    /* renamed from: e */
    public final void mo418e() {
        if (this.f2188c == 0) {
            throw new GdxRuntimeException("No buffer allocated!");
        }
        Gdx.gl20.glBindBuffer(34963, this.f2188c);
        if (this.f2190e) {
            this.f2187b.limit(this.f2186a.limit() * 2);
            Gdx.gl20.glBufferData(34963, this.f2187b.limit(), this.f2187b, this.f2192g);
            this.f2190e = false;
        }
        this.f2191f = true;
    }

    /* renamed from: f */
    public final void mo419f() {
        Gdx.gl20.glBindBuffer(34963, 0);
        this.f2191f = false;
    }

    /* renamed from: g */
    public final void mo420g() {
        this.f2188c = Gdx.gl20.glGenBuffer();
        this.f2190e = true;
    }
}
