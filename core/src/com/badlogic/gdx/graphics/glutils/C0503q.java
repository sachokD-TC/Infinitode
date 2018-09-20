package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.graphics.C0512m;
import com.badlogic.gdx.graphics.C0515n;
import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* renamed from: com.badlogic.gdx.graphics.glutils.q */
public final class C0503q implements C0502u {
    /* renamed from: a */
    final C0515n f2247a;
    /* renamed from: b */
    final FloatBuffer f2248b;
    /* renamed from: c */
    final ByteBuffer f2249c;
    /* renamed from: d */
    boolean f2250d = false;

    public C0503q(C0515n c0515n) {
        this.f2247a = c0515n;
        this.f2249c = BufferUtils.m2247c(this.f2247a.f2300b * 4000);
        this.f2248b = this.f2249c.asFloatBuffer();
        this.f2248b.flip();
        this.f2249c.flip();
    }

    /* renamed from: a */
    public final FloatBuffer mo422a() {
        return this.f2248b;
    }

    /* renamed from: a */
    public final void mo423a(C0501p c0501p) {
        this.f2249c.limit(this.f2248b.limit() * 4);
        for (C0512m c0512m : this.f2247a.f2299a) {
            int b = c0501p.m1612b(c0512m.f2290f);
            if (b >= 0) {
                c0501p.m1606a(b);
                if (c0512m.f2288d == 5126) {
                    this.f2248b.position(c0512m.f2289e / 4);
                    c0501p.m1608a(b, c0512m.f2286b, c0512m.f2288d, c0512m.f2287c, this.f2247a.f2300b, this.f2248b);
                } else {
                    this.f2249c.position(c0512m.f2289e);
                    c0501p.m1608a(b, c0512m.f2286b, c0512m.f2288d, c0512m.f2287c, this.f2247a.f2300b, this.f2249c);
                }
            }
        }
        this.f2250d = true;
    }

    /* renamed from: a */
    public final void mo424a(float[] fArr, int i) {
        BufferUtils.m2245a(fArr, this.f2249c, i);
        this.f2248b.position(0);
        this.f2248b.limit(i);
    }

    /* renamed from: b */
    public final void dispose() {
        BufferUtils.m2243a(this.f2249c);
    }

    /* renamed from: b */
    public final void mo425b(C0501p c0501p) {
        for (C0512m c0512m : this.f2247a.f2299a) {
            c0501p.m1609a(c0512m.f2290f);
        }
        this.f2250d = false;
    }

    /* renamed from: c */
    public final int mo426c() {
        return (this.f2248b.limit() * 4) / this.f2247a.f2300b;
    }

    /* renamed from: d */
    public final C0515n mo427d() {
        return this.f2247a;
    }

    /* renamed from: e */
    public final void mo428e() {
    }
}
