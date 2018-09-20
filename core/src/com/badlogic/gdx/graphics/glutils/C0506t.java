package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0284f;
import com.badlogic.gdx.graphics.C0322g;
import com.badlogic.gdx.graphics.C0512m;
import com.badlogic.gdx.graphics.C0515n;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.C0692k;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* renamed from: com.badlogic.gdx.graphics.glutils.t */
public final class C0506t implements C0502u {
    /* renamed from: a */
    static final IntBuffer f2268a = BufferUtils.m2246b(1);
    /* renamed from: b */
    final C0515n f2269b;
    /* renamed from: c */
    final FloatBuffer f2270c;
    /* renamed from: d */
    final ByteBuffer f2271d;
    /* renamed from: e */
    int f2272e;
    /* renamed from: f */
    final boolean f2273f;
    /* renamed from: g */
    final int f2274g;
    /* renamed from: h */
    boolean f2275h = false;
    /* renamed from: i */
    boolean f2276i = false;
    /* renamed from: j */
    int f2277j = -1;
    /* renamed from: k */
    C0692k f2278k = new C0692k();

    public C0506t(boolean z, int i, C0515n c0515n) {
        this.f2273f = z;
        this.f2269b = c0515n;
        this.f2271d = BufferUtils.m2247c(this.f2269b.f2300b * i);
        this.f2270c = this.f2271d.asFloatBuffer();
        this.f2270c.flip();
        this.f2271d.flip();
        this.f2272e = Gdx.gl20.glGenBuffer();
        this.f2274g = z ? 35044 : 35048;
        m1649f();
    }

    /* renamed from: f */
    private void m1649f() {
        f2268a.clear();
        Gdx.gl30.mo290b(f2268a);
        this.f2277j = f2268a.get();
    }

    /* renamed from: a */
    public final FloatBuffer mo422a() {
        this.f2275h = true;
        return this.f2270c;
    }

    /* renamed from: a */
    public final void mo423a(C0501p c0501p) {
        int i;
        C0284f c0284f = Gdx.gl30;
        c0284f.mo286a(this.f2277j);
        boolean z = this.f2278k.f3091b != 0;
        int length = this.f2269b.f2299a.length;
        if (z) {
            i = 0;
            while (z && i < length) {
                z = c0501p.m1612b(this.f2269b.f2299a[i].f2290f) == this.f2278k.m2420b(i);
                i++;
            }
        }
        if (!z) {
            Gdx.gl.glBindBuffer(34962, this.f2272e);
            if (this.f2278k.f3091b != 0) {
                i = this.f2269b.f2299a.length;
                for (int i2 = 0; i2 < i; i2++) {
                    int b = this.f2278k.m2420b(i2);
                    if (b >= 0) {
                        C0284f c0284f2 = Gdx.gl20;
                        c0501p.m1615e();
                        c0284f2.glDisableVertexAttribArray(b);
                    }
                }
            }
            this.f2278k.f3091b = 0;
            for (int i3 = 0; i3 < length; i3++) {
                C0512m c0512m = this.f2269b.f2299a[i3];
                this.f2278k.m2418a(c0501p.m1612b(c0512m.f2290f));
                i = this.f2278k.m2420b(i3);
                if (i >= 0) {
                    c0501p.m1606a(i);
                    c0501p.m1607a(i, c0512m.f2286b, c0512m.f2288d, c0512m.f2287c, this.f2269b.f2300b, c0512m.f2289e);
                }
            }
        }
        if (this.f2275h) {
            c0284f.glBindBuffer(34962, this.f2272e);
            this.f2271d.limit(this.f2270c.limit() * 4);
            c0284f.glBufferData(34962, this.f2271d.limit(), this.f2271d, this.f2274g);
            this.f2275h = false;
        }
        this.f2276i = true;
    }

    /* renamed from: a */
    public final void mo424a(float[] fArr, int i) {
        this.f2275h = true;
        BufferUtils.m2245a(fArr, this.f2271d, i);
        this.f2270c.position(0);
        this.f2270c.limit(i);
        if (this.f2276i) {
            Gdx.gl20.glBufferData(34962, this.f2271d.limit(), this.f2271d, this.f2274g);
            this.f2275h = false;
        }
    }

    /* renamed from: b */
    public final void dispose() {
        C0322g c0322g = Gdx.gl30;
        c0322g.glBindBuffer(34962, 0);
        c0322g.glDeleteBuffer(this.f2272e);
        this.f2272e = 0;
        BufferUtils.m2243a(this.f2271d);
        if (this.f2277j != -1) {
            f2268a.clear();
            f2268a.put(this.f2277j);
            f2268a.flip();
            Gdx.gl30.mo289a(f2268a);
            this.f2277j = -1;
        }
    }

    /* renamed from: b */
    public final void mo425b(C0501p c0501p) {
        Gdx.gl30.mo286a(0);
        this.f2276i = false;
    }

    /* renamed from: c */
    public final int mo426c() {
        return (this.f2270c.limit() * 4) / this.f2269b.f2300b;
    }

    /* renamed from: d */
    public final C0515n mo427d() {
        return this.f2269b;
    }

    /* renamed from: e */
    public final void mo428e() {
        this.f2272e = Gdx.gl30.glGenBuffer();
        m1649f();
        this.f2275h = true;
    }
}
