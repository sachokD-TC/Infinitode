package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.ui.C0611i.C0652a;
import com.badlogic.gdx.utils.C0328t.C0449a;

/* renamed from: com.badlogic.gdx.scenes.scene2d.ui.c */
public final class C0623c<T extends C0602b> implements C0449a {
    /* renamed from: L */
    private static final Float f2751L = Float.valueOf(0.0f);
    /* renamed from: M */
    private static final Integer f2752M = Integer.valueOf(0);
    /* renamed from: N */
    private static final Integer f2753N;
    /* renamed from: O */
    private static final Integer f2754O;
    /* renamed from: P */
    private static final Integer f2755P = Integer.valueOf(2);
    /* renamed from: Q */
    private static final Integer f2756Q = Integer.valueOf(4);
    /* renamed from: R */
    private static final Integer f2757R = Integer.valueOf(8);
    /* renamed from: S */
    private static final Integer f2758S = Integer.valueOf(16);
    /* renamed from: T */
    private static Files f2759T;
    /* renamed from: U */
    private static C0623c f2760U;
    /* renamed from: a */
    public static final Float f2761a = Float.valueOf(1.0f);
    /* renamed from: A */
    float f2762A;
    /* renamed from: B */
    float f2763B;
    /* renamed from: C */
    Table f2764C;
    /* renamed from: D */
    boolean f2765D;
    /* renamed from: E */
    int f2766E;
    /* renamed from: F */
    int f2767F;
    /* renamed from: G */
    int f2768G;
    /* renamed from: H */
    float f2769H;
    /* renamed from: I */
    float f2770I;
    /* renamed from: J */
    float f2771J;
    /* renamed from: K */
    float f2772K;
    /* renamed from: b */
    C0611i f2773b;
    /* renamed from: c */
    C0611i f2774c;
    /* renamed from: d */
    C0611i f2775d;
    /* renamed from: e */
    C0611i f2776e;
    /* renamed from: f */
    C0611i f2777f;
    /* renamed from: g */
    C0611i f2778g;
    /* renamed from: h */
    C0611i f2779h;
    /* renamed from: i */
    public C0611i f2780i;
    /* renamed from: j */
    C0611i f2781j;
    /* renamed from: k */
    public C0611i f2782k;
    /* renamed from: l */
    C0611i f2783l;
    /* renamed from: m */
    C0611i f2784m;
    /* renamed from: n */
    C0611i f2785n;
    /* renamed from: o */
    C0611i f2786o;
    /* renamed from: p */
    public Float f2787p;
    /* renamed from: q */
    public Float f2788q;
    /* renamed from: r */
    Integer f2789r;
    /* renamed from: s */
    Integer f2790s;
    /* renamed from: t */
    Integer f2791t;
    /* renamed from: u */
    Integer f2792u;
    /* renamed from: v */
    Boolean f2793v;
    /* renamed from: w */
    Boolean f2794w;
    /* renamed from: x */
    C0602b f2795x;
    /* renamed from: y */
    float f2796y;
    /* renamed from: z */
    float f2797z;

    static {
        Integer valueOf = Integer.valueOf(1);
        f2753N = valueOf;
        f2754O = valueOf;
    }

    public C0623c() {
        mo360a();
    }

    /* renamed from: a */
    public final C0623c<T> m2084a(float f) {
        C0611i c0652a = new C0652a(f);
        this.f2773b = c0652a;
        this.f2774c = c0652a;
        this.f2775d = c0652a;
        this.f2776e = c0652a;
        this.f2777f = c0652a;
        this.f2778g = c0652a;
        return this;
    }

    /* renamed from: a */
    public final C0623c<T> m2085a(float f, float f2) {
        C0611i c0652a = new C0652a(f);
        C0611i c0652a2 = new C0652a(f2);
        this.f2773b = c0652a;
        this.f2774c = c0652a2;
        this.f2775d = c0652a;
        this.f2776e = c0652a2;
        this.f2777f = c0652a;
        this.f2778g = c0652a2;
        return this;
    }

    /* renamed from: a */
    public final C0623c<T> m2086a(int i) {
        this.f2792u = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public final void mo360a() {
        C0623c c0623c;
        this.f2795x = null;
        this.f2764C = null;
        this.f2765D = false;
        this.f2768G = -1;
        if (f2759T == null || f2759T != Gdx.files) {
            f2759T = Gdx.files;
            c0623c = new C0623c();
            f2760U = c0623c;
            c0623c.f2773b = C0611i.f2664b;
            f2760U.f2774c = C0611i.f2665c;
            f2760U.f2775d = C0611i.f2666d;
            f2760U.f2776e = C0611i.f2667e;
            f2760U.f2777f = C0611i.f2668f;
            f2760U.f2778g = C0611i.f2669g;
            f2760U.f2779h = C0611i.f2663a;
            f2760U.f2780i = C0611i.f2663a;
            f2760U.f2781j = C0611i.f2663a;
            f2760U.f2782k = C0611i.f2663a;
            f2760U.f2783l = C0611i.f2663a;
            f2760U.f2784m = C0611i.f2663a;
            f2760U.f2785n = C0611i.f2663a;
            f2760U.f2786o = C0611i.f2663a;
            f2760U.f2787p = f2751L;
            f2760U.f2788q = f2751L;
            f2760U.f2789r = f2754O;
            f2760U.f2790s = f2752M;
            f2760U.f2791t = f2752M;
            f2760U.f2792u = f2753N;
            f2760U.f2793v = null;
            f2760U.f2794w = null;
        }
        c0623c = f2760U;
        if (c0623c != null) {
            m2088a(c0623c);
        }
    }

    /* renamed from: a */
    final void m2088a(C0623c c0623c) {
        this.f2773b = c0623c.f2773b;
        this.f2774c = c0623c.f2774c;
        this.f2775d = c0623c.f2775d;
        this.f2776e = c0623c.f2776e;
        this.f2777f = c0623c.f2777f;
        this.f2778g = c0623c.f2778g;
        this.f2779h = c0623c.f2779h;
        this.f2780i = c0623c.f2780i;
        this.f2781j = c0623c.f2781j;
        this.f2782k = c0623c.f2782k;
        this.f2783l = c0623c.f2783l;
        this.f2784m = c0623c.f2784m;
        this.f2785n = c0623c.f2785n;
        this.f2786o = c0623c.f2786o;
        this.f2787p = c0623c.f2787p;
        this.f2788q = c0623c.f2788q;
        this.f2789r = c0623c.f2789r;
        this.f2790s = c0623c.f2790s;
        this.f2791t = c0623c.f2791t;
        this.f2792u = c0623c.f2792u;
        this.f2793v = c0623c.f2793v;
        this.f2794w = c0623c.f2794w;
    }

    /* renamed from: b */
    public final C0623c<T> m2089b() {
        this.f2775d = new C0652a(800.0f);
        return this;
    }

    /* renamed from: b */
    public final C0623c<T> m2090b(float f) {
        C0611i c0652a = new C0652a(f);
        this.f2773b = c0652a;
        this.f2775d = c0652a;
        this.f2777f = c0652a;
        return this;
    }

    /* renamed from: b */
    final void m2091b(C0623c c0623c) {
        if (c0623c != null) {
            if (c0623c.f2773b != null) {
                this.f2773b = c0623c.f2773b;
            }
            if (c0623c.f2774c != null) {
                this.f2774c = c0623c.f2774c;
            }
            if (c0623c.f2775d != null) {
                this.f2775d = c0623c.f2775d;
            }
            if (c0623c.f2776e != null) {
                this.f2776e = c0623c.f2776e;
            }
            if (c0623c.f2777f != null) {
                this.f2777f = c0623c.f2777f;
            }
            if (c0623c.f2778g != null) {
                this.f2778g = c0623c.f2778g;
            }
            if (c0623c.f2779h != null) {
                this.f2779h = c0623c.f2779h;
            }
            if (c0623c.f2780i != null) {
                this.f2780i = c0623c.f2780i;
            }
            if (c0623c.f2781j != null) {
                this.f2781j = c0623c.f2781j;
            }
            if (c0623c.f2782k != null) {
                this.f2782k = c0623c.f2782k;
            }
            if (c0623c.f2783l != null) {
                this.f2783l = c0623c.f2783l;
            }
            if (c0623c.f2784m != null) {
                this.f2784m = c0623c.f2784m;
            }
            if (c0623c.f2785n != null) {
                this.f2785n = c0623c.f2785n;
            }
            if (c0623c.f2786o != null) {
                this.f2786o = c0623c.f2786o;
            }
            if (c0623c.f2787p != null) {
                this.f2787p = c0623c.f2787p;
            }
            if (c0623c.f2788q != null) {
                this.f2788q = c0623c.f2788q;
            }
            if (c0623c.f2789r != null) {
                this.f2789r = c0623c.f2789r;
            }
            if (c0623c.f2790s != null) {
                this.f2790s = c0623c.f2790s;
            }
            if (c0623c.f2791t != null) {
                this.f2791t = c0623c.f2791t;
            }
            if (c0623c.f2792u != null) {
                this.f2792u = c0623c.f2792u;
            }
            if (c0623c.f2793v != null) {
                this.f2793v = c0623c.f2793v;
            }
            if (c0623c.f2794w != null) {
                this.f2794w = c0623c.f2794w;
            }
        }
    }

    /* renamed from: c */
    public final C0623c<T> m2092c() {
        C0611i c0652a = new C0652a(40.0f);
        this.f2779h = c0652a;
        this.f2780i = c0652a;
        this.f2781j = c0652a;
        this.f2782k = c0652a;
        return this;
    }

    /* renamed from: c */
    public final C0623c<T> m2093c(float f) {
        C0611i c0652a = new C0652a(f);
        this.f2774c = c0652a;
        this.f2776e = c0652a;
        this.f2778g = c0652a;
        return this;
    }

    /* renamed from: d */
    public final C0623c<T> m2094d() {
        this.f2787p = f2761a;
        return this;
    }

    /* renamed from: d */
    public final C0623c<T> m2095d(float f) {
        C0611i c0652a = new C0652a(f);
        this.f2783l = c0652a;
        this.f2784m = c0652a;
        this.f2785n = c0652a;
        this.f2786o = c0652a;
        return this;
    }

    /* renamed from: e */
    public final C0623c<T> m2096e() {
        if (this.f2789r == null) {
            this.f2789r = f2755P;
        } else {
            this.f2789r = Integer.valueOf((this.f2789r.intValue() | 2) & -5);
        }
        return this;
    }

    /* renamed from: e */
    public final C0623c<T> m2097e(float f) {
        this.f2783l = new C0652a(f);
        return this;
    }

    /* renamed from: f */
    public final C0623c<T> m2098f() {
        if (this.f2789r == null) {
            this.f2789r = f2757R;
        } else {
            this.f2789r = Integer.valueOf((this.f2789r.intValue() | 8) & -17);
        }
        return this;
    }

    /* renamed from: f */
    public final C0623c<T> m2099f(float f) {
        this.f2784m = new C0652a(f);
        return this;
    }

    /* renamed from: g */
    public final C0623c<T> m2100g() {
        if (this.f2789r == null) {
            this.f2789r = f2756Q;
        } else {
            this.f2789r = Integer.valueOf((this.f2789r.intValue() | 4) & -3);
        }
        return this;
    }

    /* renamed from: g */
    public final C0623c<T> m2101g(float f) {
        this.f2785n = new C0652a(f);
        return this;
    }

    /* renamed from: h */
    public final C0623c<T> m2102h() {
        if (this.f2789r == null) {
            this.f2789r = f2758S;
        } else {
            this.f2789r = Integer.valueOf((this.f2789r.intValue() | 16) & -9);
        }
        return this;
    }

    /* renamed from: h */
    public final C0623c<T> m2103h(float f) {
        this.f2786o = new C0652a(f);
        return this;
    }

    /* renamed from: i */
    public final C0623c<T> m2104i() {
        this.f2790s = f2753N;
        this.f2791t = f2753N;
        return this;
    }

    /* renamed from: j */
    public final C0623c<T> m2105j() {
        this.f2790s = f2753N;
        return this;
    }

    /* renamed from: k */
    public final void m2106k() {
        this.f2764C.m2066q();
    }

    public final String toString() {
        return this.f2795x != null ? this.f2795x.toString() : super.toString();
    }
}
