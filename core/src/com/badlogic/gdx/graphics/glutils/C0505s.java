package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0284f;
import com.badlogic.gdx.graphics.C0512m;
import com.badlogic.gdx.graphics.C0515n;
import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* renamed from: com.badlogic.gdx.graphics.glutils.s */
public final class C0505s implements C0502u {
    /* renamed from: a */
    final C0515n f2259a;
    /* renamed from: b */
    final FloatBuffer f2260b;
    /* renamed from: c */
    final ByteBuffer f2261c;
    /* renamed from: d */
    int f2262d;
    /* renamed from: e */
    final boolean f2263e;
    /* renamed from: f */
    final boolean f2264f = false;
    /* renamed from: g */
    final int f2265g;
    /* renamed from: h */
    boolean f2266h = false;
    /* renamed from: i */
    boolean f2267i = false;

    public C0505s(C0515n c0515n) {
        this.f2259a = c0515n;
        this.f2261c = BufferUtils.m2240a(this.f2259a.f2300b * 4000);
        this.f2263e = true;
        this.f2265g = 35048;
        this.f2260b = this.f2261c.asFloatBuffer();
        this.f2262d = m1640f();
        this.f2260b.flip();
        this.f2261c.flip();
    }

    /* renamed from: f */
    private int m1640f() {
        int glGenBuffer = Gdx.gl20.glGenBuffer();
        Gdx.gl20.glBindBuffer(34962, glGenBuffer);
        Gdx.gl20.glBufferData(34962, this.f2261c.capacity(), null, this.f2265g);
        Gdx.gl20.glBindBuffer(34962, 0);
        return glGenBuffer;
    }

    /* renamed from: a */
    public final FloatBuffer mo422a() {
        this.f2266h = true;
        return this.f2260b;
    }

    /* renamed from: a */
    public final void mo423a(C0501p c0501p) {
        C0284f c0284f = Gdx.gl20;
        c0284f.glBindBuffer(34962, this.f2262d);
        if (this.f2266h) {
            this.f2261c.limit(this.f2260b.limit() * 4);
            c0284f.glBufferData(34962, this.f2261c.limit(), this.f2261c, this.f2265g);
            this.f2266h = false;
        }
        for (C0512m c0512m : this.f2259a.f2299a) {
            int b = c0501p.m1612b(c0512m.f2290f);
            if (b >= 0) {
                c0501p.m1606a(b);
                c0501p.m1607a(b, c0512m.f2286b, c0512m.f2288d, c0512m.f2287c, this.f2259a.f2300b, c0512m.f2289e);
            }
        }
        this.f2267i = true;
    }

    /* renamed from: a */
    public final void mo424a(float[] fArr, int i) {
        this.f2266h = true;
        if (this.f2263e) {
            BufferUtils.m2245a(fArr, this.f2261c, i);
            this.f2260b.position(0);
            this.f2260b.limit(i);
        } else {
            this.f2260b.clear();
            this.f2260b.put(fArr, 0, i);
            this.f2260b.flip();
            this.f2261c.position(0);
            this.f2261c.limit(this.f2260b.limit() << 2);
        }
        if (this.f2267i) {
            Gdx.gl20.glBufferSubData(34962, 0, this.f2261c.limit(), this.f2261c);
            this.f2266h = false;
        }
    }

    /* renamed from: b */
    public final void dispose() {
        C0284f c0284f = Gdx.gl20;
        c0284f.glBindBuffer(34962, 0);
        c0284f.glDeleteBuffer(this.f2262d);
        this.f2262d = 0;
    }

    /* renamed from: b */
    public final void mo425b(C0501p c0501p) {
        C0284f c0284f = Gdx.gl20;
        for (C0512m c0512m : this.f2259a.f2299a) {
            c0501p.m1609a(c0512m.f2290f);
        }
        c0284f.glBindBuffer(34962, 0);
        this.f2267i = false;
    }

    /* renamed from: c */
    public final int mo426c() {
        return (this.f2260b.limit() * 4) / this.f2259a.f2300b;
    }

    /* renamed from: d */
    public final C0515n mo427d() {
        return this.f2259a;
    }

    /* renamed from: e */
    public final void mo428e() {
        this.f2262d = m1640f();
        this.f2266h = true;
    }
}
