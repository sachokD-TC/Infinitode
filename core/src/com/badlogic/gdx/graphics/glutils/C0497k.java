package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0284f;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.badlogic.gdx.graphics.glutils.k */
public final class C0497k implements C0494l {
    /* renamed from: a */
    final ShortBuffer f2194a = this.f2195b.asShortBuffer();
    /* renamed from: b */
    final ByteBuffer f2195b = BufferUtils.m2240a(12000);
    /* renamed from: c */
    int f2196c;
    /* renamed from: d */
    final boolean f2197d = true;
    /* renamed from: e */
    boolean f2198e = true;
    /* renamed from: f */
    boolean f2199f = false;
    /* renamed from: g */
    final int f2200g = 35048;

    public C0497k() {
        this.f2194a.flip();
        this.f2195b.flip();
        this.f2196c = m1562h();
    }

    /* renamed from: h */
    private int m1562h() {
        int glGenBuffer = Gdx.gl20.glGenBuffer();
        Gdx.gl20.glBindBuffer(34963, glGenBuffer);
        Gdx.gl20.glBufferData(34963, this.f2195b.capacity(), null, this.f2200g);
        Gdx.gl20.glBindBuffer(34963, 0);
        return glGenBuffer;
    }

    /* renamed from: a */
    public final int mo414a() {
        return this.f2194a.limit();
    }

    /* renamed from: a */
    public final void mo415a(short[] sArr, int i) {
        this.f2198e = true;
        this.f2194a.clear();
        this.f2194a.put(sArr, 0, i);
        this.f2194a.flip();
        this.f2195b.position(0);
        this.f2195b.limit(i << 1);
        if (this.f2199f) {
            Gdx.gl20.glBufferSubData(34963, 0, this.f2195b.limit(), this.f2195b);
            this.f2198e = false;
        }
    }

    /* renamed from: b */
    public final void dispose() {
        C0284f c0284f = Gdx.gl20;
        c0284f.glBindBuffer(34963, 0);
        c0284f.glDeleteBuffer(this.f2196c);
        this.f2196c = 0;
    }

    /* renamed from: c */
    public final int mo416c() {
        return this.f2194a.capacity();
    }

    /* renamed from: d */
    public final ShortBuffer mo417d() {
        this.f2198e = true;
        return this.f2194a;
    }

    /* renamed from: e */
    public final void mo418e() {
        if (this.f2196c == 0) {
            throw new GdxRuntimeException("IndexBufferObject cannot be used after it has been disposed.");
        }
        Gdx.gl20.glBindBuffer(34963, this.f2196c);
        if (this.f2198e) {
            this.f2195b.limit(this.f2194a.limit() * 2);
            Gdx.gl20.glBufferSubData(34963, 0, this.f2195b.limit(), this.f2195b);
            this.f2198e = false;
        }
        this.f2199f = true;
    }

    /* renamed from: f */
    public final void mo419f() {
        Gdx.gl20.glBindBuffer(34963, 0);
        this.f2199f = false;
    }

    /* renamed from: g */
    public final void mo420g() {
        this.f2196c = m1562h();
        this.f2198e = true;
    }
}
