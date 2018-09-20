package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0284f;
import com.badlogic.gdx.graphics.C0512m;
import com.badlogic.gdx.graphics.C0515n;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* renamed from: com.badlogic.gdx.graphics.glutils.r */
public final class C0504r implements C0502u {
    /* renamed from: a */
    boolean f2251a = false;
    /* renamed from: b */
    boolean f2252b = false;
    /* renamed from: c */
    private C0515n f2253c;
    /* renamed from: d */
    private FloatBuffer f2254d;
    /* renamed from: e */
    private ByteBuffer f2255e;
    /* renamed from: f */
    private boolean f2256f;
    /* renamed from: g */
    private int f2257g = Gdx.gl20.glGenBuffer();
    /* renamed from: h */
    private int f2258h;

    public C0504r(boolean z, int i, C0515n c0515n) {
        ByteBuffer c = BufferUtils.m2247c(c0515n.f2300b * i);
        c.limit(0);
        if (this.f2252b) {
            throw new GdxRuntimeException("Cannot change attributes while VBO is bound");
        }
        if (this.f2256f && this.f2255e != null) {
            BufferUtils.m2243a(this.f2255e);
        }
        this.f2253c = c0515n;
        if (c instanceof ByteBuffer) {
            this.f2255e = c;
            this.f2256f = true;
            int limit = this.f2255e.limit();
            this.f2255e.limit(this.f2255e.capacity());
            this.f2254d = this.f2255e.asFloatBuffer();
            this.f2255e.limit(limit);
            this.f2254d.limit(limit / 4);
            limit = z ? 35044 : 35048;
            if (this.f2252b) {
                throw new GdxRuntimeException("Cannot change usage while VBO is bound");
            }
            this.f2258h = limit;
            return;
        }
        throw new GdxRuntimeException("Only ByteBuffer is currently supported");
    }

    /* renamed from: a */
    public final FloatBuffer mo422a() {
        this.f2251a = true;
        return this.f2254d;
    }

    /* renamed from: a */
    public final void mo423a(C0501p c0501p) {
        C0284f c0284f = Gdx.gl20;
        c0284f.glBindBuffer(34962, this.f2257g);
        if (this.f2251a) {
            this.f2255e.limit(this.f2254d.limit() * 4);
            c0284f.glBufferData(34962, this.f2255e.limit(), this.f2255e, this.f2258h);
            this.f2251a = false;
        }
        for (C0512m c0512m : this.f2253c.f2299a) {
            int b = c0501p.m1612b(c0512m.f2290f);
            if (b >= 0) {
                c0501p.m1606a(b);
                c0501p.m1607a(b, c0512m.f2286b, c0512m.f2288d, c0512m.f2287c, this.f2253c.f2300b, c0512m.f2289e);
            }
        }
        this.f2252b = true;
    }

    /* renamed from: a */
    public final void mo424a(float[] fArr, int i) {
        this.f2251a = true;
        BufferUtils.m2245a(fArr, this.f2255e, i);
        this.f2254d.position(0);
        this.f2254d.limit(i);
        if (this.f2252b) {
            Gdx.gl20.glBufferData(34962, this.f2255e.limit(), this.f2255e, this.f2258h);
            this.f2251a = false;
        }
    }

    /* renamed from: b */
    public final void dispose() {
        C0284f c0284f = Gdx.gl20;
        c0284f.glBindBuffer(34962, 0);
        c0284f.glDeleteBuffer(this.f2257g);
        this.f2257g = 0;
        if (this.f2256f) {
            BufferUtils.m2243a(this.f2255e);
        }
    }

    /* renamed from: b */
    public final void mo425b(C0501p c0501p) {
        C0284f c0284f = Gdx.gl20;
        for (C0512m c0512m : this.f2253c.f2299a) {
            c0501p.m1609a(c0512m.f2290f);
        }
        c0284f.glBindBuffer(34962, 0);
        this.f2252b = false;
    }

    /* renamed from: c */
    public final int mo426c() {
        return (this.f2254d.limit() * 4) / this.f2253c.f2300b;
    }

    /* renamed from: d */
    public final C0515n mo427d() {
        return this.f2253c;
    }

    /* renamed from: e */
    public final void mo428e() {
        this.f2257g = Gdx.gl20.glGenBuffer();
        this.f2251a = true;
    }
}
