package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0444a;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.utils.C0616g;
import com.badlogic.gdx.scenes.scene2d.utils.C0655f;
import com.badlogic.gdx.scenes.scene2d.utils.C0661i;
import com.badlogic.gdx.utils.C0328t;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0721u;

public class Table extends C0617k {
    /* renamed from: J */
    public static C0611i f2680J = new C06122();
    /* renamed from: K */
    public static C0611i f2681K = new C06133();
    /* renamed from: L */
    public static C0611i f2682L = new C06144();
    /* renamed from: M */
    public static C0611i f2683M = new C06155();
    /* renamed from: s */
    private static float[] f2684s;
    /* renamed from: t */
    private static float[] f2685t;
    /* renamed from: w */
    public static C0430b f2686w = new C0430b(0.0f, 0.0f, 1.0f, 1.0f);
    /* renamed from: x */
    public static C0430b f2687x = new C0430b(1.0f, 0.0f, 0.0f, 1.0f);
    /* renamed from: y */
    public static C0430b f2688y = new C0430b(0.0f, 1.0f, 0.0f, 1.0f);
    /* renamed from: z */
    static final C0328t<C0623c> f2689z = new C06101();
    /* renamed from: A */
    C0611i f2690A;
    /* renamed from: B */
    C0611i f2691B;
    /* renamed from: C */
    C0611i f2692C;
    /* renamed from: D */
    C0611i f2693D;
    /* renamed from: E */
    public int f2694E;
    /* renamed from: F */
    Debug f2695F;
    /* renamed from: G */
    C0676a<DebugRect> f2696G;
    /* renamed from: H */
    C0655f f2697H;
    /* renamed from: I */
    boolean f2698I;
    /* renamed from: N */
    private boolean f2699N;
    /* renamed from: O */
    private final C0676a<C0623c> f2700O;
    /* renamed from: P */
    private final C0623c f2701P;
    /* renamed from: Q */
    private final C0676a<C0623c> f2702Q;
    /* renamed from: R */
    private C0623c f2703R;
    /* renamed from: S */
    private boolean f2704S;
    /* renamed from: T */
    private float[] f2705T;
    /* renamed from: U */
    private float[] f2706U;
    /* renamed from: V */
    private float[] f2707V;
    /* renamed from: W */
    private float[] f2708W;
    /* renamed from: X */
    private float f2709X;
    /* renamed from: Z */
    private float f2710Z;
    private float aa;
    private float ab;
    private float[] ac;
    private float[] ad;
    private float[] ae;
    private float[] af;
    private boolean ag;
    private C0645h ah;
    /* renamed from: u */
    private int f2711u;
    /* renamed from: v */
    private int f2712v;

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.Table$1 */
    static class C06101 extends C0328t<C0623c> {
        C06101() {
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo301a() {
            return new C0623c();
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.Table$2 */
    static class C06122 extends C0611i {
        C06122() {
        }

        /* renamed from: a */
        public final float mo478a(C0602b c0602b) {
            C0655f c0655f = ((Table) c0602b).f2697H;
            return c0655f == null ? 0.0f : c0655f.mo516c();
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.Table$3 */
    static class C06133 extends C0611i {
        C06133() {
        }

        /* renamed from: a */
        public final float mo478a(C0602b c0602b) {
            C0655f c0655f = ((Table) c0602b).f2697H;
            return c0655f == null ? 0.0f : c0655f.mo513a();
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.Table$4 */
    static class C06144 extends C0611i {
        C06144() {
        }

        /* renamed from: a */
        public final float mo478a(C0602b c0602b) {
            C0655f c0655f = ((Table) c0602b).f2697H;
            return c0655f == null ? 0.0f : c0655f.mo517d();
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.Table$5 */
    static class C06155 extends C0611i {
        C06155() {
        }

        /* renamed from: a */
        public final float mo478a(C0602b c0602b) {
            C0655f c0655f = ((Table) c0602b).f2697H;
            return c0655f == null ? 0.0f : c0655f.mo515b();
        }
    }

    public enum Debug {
        none,
        all,
        table,
        cell,
        actor
    }

    public static class DebugRect extends Rectangle {
        /* renamed from: c */
        static C0328t<DebugRect> f2676c = C0721u.m2511a(DebugRect.class);
        C0430b color;
    }

    public Table() {
        this((byte) 0);
    }

    private Table(byte b) {
        this.f2700O = new C0676a(4);
        this.f2702Q = new C0676a(2);
        this.f2704S = true;
        this.f2690A = f2680J;
        this.f2691B = f2681K;
        this.f2692C = f2682L;
        this.f2693D = f2683M;
        this.f2694E = 1;
        this.f2695F = Debug.none;
        this.f2698I = true;
        this.ah = null;
        this.f2701P = mo502k();
        this.f2628r = false;
        this.f2610d = Touchable.childrenOnly;
    }

    /* renamed from: a */
    private void m2038a(float f, float f2, float f3, float f4, C0430b c0430b) {
        if (this.f2696G == null) {
            this.f2696G = new C0676a();
        }
        Object obj = (DebugRect) DebugRect.f2676c.m965b();
        obj.color = c0430b;
        obj.m1698a(f, (this.f2616j - f2) - f4, f3, f4);
        this.f2696G.m2296a(obj);
    }

    /* renamed from: a */
    private void m2039a(C0444a c0444a, float f, float f2, float f3) {
        if (this.f2697H != null) {
            C0430b c0430b = this.f2622p;
            c0444a.mo367a(c0430b.f1644I, c0430b.f1645J, c0430b.f1646K, c0430b.f1647L * f);
            this.f2697H.mo514a(c0444a, f2, f3, this.f2615i, this.f2616j);
        }
    }

    /* renamed from: a */
    private static float[] m2040a(float[] fArr, int i) {
        if (fArr == null || fArr.length < i) {
            return new float[i];
        }
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            fArr[i2] = 0.0f;
        }
        return fArr;
    }

    /* renamed from: e */
    private void m2041e(ShapeRenderer shapeRenderer) {
        if (this.f2696G != null && this.f2612f) {
            float f;
            float f2;
            shapeRenderer.m1461b(ShapeType.Line);
            shapeRenderer.m1455a(this.f2607a.f2647h);
            if (this.f2628r) {
                f = 0.0f;
                f2 = 0.0f;
            } else {
                f2 = this.f2613g;
                f = this.f2614h;
            }
            int i = this.f2696G.f3001b;
            for (int i2 = 0; i2 < i; i2++) {
                DebugRect debugRect = (DebugRect) this.f2696G.m2291a(i2);
                shapeRenderer.m1455a(debugRect.color);
                shapeRenderer.m1460b(debugRect.x + f2, debugRect.y + f, debugRect.width, debugRect.height);
            }
        }
    }

    /* renamed from: k */
    private C0623c mo502k() {
        C0623c c0623c = (C0623c) f2689z.m965b();
        c0623c.f2764C = this;
        return c0623c;
    }

    /* renamed from: s */
    private void m2043s() {
        C0676a c0676a = this.f2700O;
        int i = 0;
        for (int i2 = c0676a.f3001b - 1; i2 >= 0; i2--) {
            C0623c c0623c = (C0623c) c0676a.m2291a(i2);
            if (c0623c.f2765D) {
                break;
            }
            i += c0623c.f2792u.intValue();
        }
        this.f2711u = Math.max(this.f2711u, i);
        this.f2712v++;
        ((C0623c) c0676a.m2299b()).f2765D = true;
    }

    /* renamed from: t */
    private float m2044t() {
        return this.f2690A.mo478a(this);
    }

    /* renamed from: u */
    private float m2045u() {
        return this.f2691B.mo478a(this);
    }

    /* renamed from: v */
    private float m2046v() {
        return this.f2692C.mo478a(this);
    }

    /* renamed from: w */
    private float m2047w() {
        return this.f2693D.mo478a(this);
    }

    /* renamed from: x */
    private void m2048x() {
        int i;
        float a;
        float a2;
        float a3;
        float f;
        int i2;
        this.f2704S = false;
        C0676a c0676a = this.f2700O;
        int i3 = c0676a.f3001b;
        if (i3 > 0 && !((C0623c) c0676a.m2299b()).f2765D) {
            m2043s();
            this.f2699N = true;
        }
        int i4 = this.f2711u;
        int i5 = this.f2712v;
        float[] a4 = m2040a(this.f2705T, i4);
        this.f2705T = a4;
        float[] a5 = m2040a(this.f2706U, i5);
        this.f2706U = a5;
        float[] a6 = m2040a(this.f2707V, i4);
        this.f2707V = a6;
        float[] a7 = m2040a(this.f2708W, i5);
        this.f2708W = a7;
        this.ac = m2040a(this.ac, i4);
        this.ad = m2040a(this.ad, i5);
        float[] a8 = m2040a(this.ae, i4);
        this.ae = a8;
        float[] a9 = m2040a(this.af, i5);
        this.af = a9;
        float f2 = 0.0f;
        for (i = 0; i < i3; i++) {
            C0623c c0623c = (C0623c) c0676a.m2291a(i);
            int i6 = c0623c.f2766E;
            int i7 = c0623c.f2767F;
            int intValue = c0623c.f2792u.intValue();
            C0602b c0602b = c0623c.f2795x;
            if (c0623c.f2791t.intValue() != 0 && a9[i7] == 0.0f) {
                a9[i7] = (float) c0623c.f2791t.intValue();
            }
            if (intValue == 1 && c0623c.f2790s.intValue() != 0 && a8[i6] == 0.0f) {
                a8[i6] = (float) c0623c.f2790s.intValue();
            }
            c0623c.f2770I = (i6 == 0 ? 0.0f : Math.max(0.0f, c0623c.f2780i.mo478a(c0602b) - f2)) + c0623c.f2784m.mo478a(c0602b);
            c0623c.f2769H = c0623c.f2783l.mo478a(c0602b);
            if (c0623c.f2768G != -1) {
                c0623c.f2769H = Math.max(0.0f, c0623c.f2779h.mo478a(c0602b) - ((C0623c) c0676a.m2291a(c0623c.f2768G)).f2781j.mo478a(c0602b)) + c0623c.f2769H;
            }
            f2 = c0623c.f2782k.mo478a(c0602b);
            c0623c.f2772K = (i6 + intValue == i4 ? 0.0f : f2) + c0623c.f2786o.mo478a(c0602b);
            c0623c.f2771J = (i7 == i5 + -1 ? 0.0f : c0623c.f2781j.mo478a(c0602b)) + c0623c.f2785n.mo478a(c0602b);
            float a10 = c0623c.f2775d.mo478a(c0602b);
            a = c0623c.f2776e.mo478a(c0602b);
            float a11 = c0623c.f2773b.mo478a(c0602b);
            float a12 = c0623c.f2774c.mo478a(c0602b);
            a2 = c0623c.f2777f.mo478a(c0602b);
            a3 = c0623c.f2778g.mo478a(c0602b);
            if (a10 < a11) {
                a10 = a11;
            }
            if (a < a12) {
                a = a12;
            }
            if (a2 <= 0.0f || a10 <= a2) {
                a2 = a10;
            }
            if (a3 <= 0.0f || a <= a3) {
                a3 = a;
            }
            if (intValue == 1) {
                a = c0623c.f2770I + c0623c.f2772K;
                a6[i6] = Math.max(a6[i6], a2 + a);
                a4[i6] = Math.max(a4[i6], a + a11);
            }
            f = c0623c.f2771J + c0623c.f2769H;
            a7[i7] = Math.max(a7[i7], a3 + f);
            a5[i7] = Math.max(a5[i7], f + a12);
        }
        f2 = 0.0f;
        a2 = 0.0f;
        a3 = 0.0f;
        a = 0.0f;
        int i8 = 0;
        while (i8 < i3) {
            c0623c = (C0623c) c0676a.m2291a(i8);
            int i9 = c0623c.f2766E;
            i = c0623c.f2790s.intValue();
            if (i != 0) {
                int i10;
                int intValue2 = i9 + c0623c.f2792u.intValue();
                for (i10 = i9; i10 < intValue2; i10++) {
                    if (a8[i10] != 0.0f) {
                        break;
                    }
                }
                for (i10 = i9; i10 < intValue2; i10++) {
                    a8[i10] = (float) i;
                }
            }
            if (c0623c.f2793v == Boolean.TRUE && c0623c.f2792u.intValue() == 1) {
                a12 = c0623c.f2770I + c0623c.f2772K;
                f2 = Math.max(f2, a4[i9] - a12);
                a3 = Math.max(a3, a6[i9] - a12);
            }
            if (c0623c.f2794w == Boolean.TRUE) {
                a12 = c0623c.f2769H + c0623c.f2771J;
                a2 = Math.max(a2, a5[c0623c.f2767F] - a12);
                f = Math.max(a, a7[c0623c.f2767F] - a12);
                a = a2;
            } else {
                f = a;
                a = a2;
            }
            i8++;
            a2 = a;
            a = f;
        }
        if (a3 > 0.0f || a > 0.0f) {
            for (i8 = 0; i8 < i3; i8++) {
                c0623c = (C0623c) c0676a.m2291a(i8);
                if (a3 > 0.0f && c0623c.f2793v == Boolean.TRUE && c0623c.f2792u.intValue() == 1) {
                    a12 = c0623c.f2770I + c0623c.f2772K;
                    a4[c0623c.f2766E] = f2 + a12;
                    a6[c0623c.f2766E] = a12 + a3;
                }
                if (a > 0.0f && c0623c.f2794w == Boolean.TRUE) {
                    a12 = c0623c.f2769H + c0623c.f2771J;
                    a5[c0623c.f2767F] = a2 + a12;
                    a7[c0623c.f2767F] = a12 + a;
                }
            }
        }
        for (i9 = 0; i9 < i3; i9++) {
            c0623c = (C0623c) c0676a.m2291a(i9);
            i = c0623c.f2792u.intValue();
            if (i != 1) {
                int i11;
                int i12 = c0623c.f2766E;
                C0602b c0602b2 = c0623c.f2795x;
                a12 = c0623c.f2773b.mo478a(c0602b2);
                f2 = c0623c.f2775d.mo478a(c0602b2);
                a3 = c0623c.f2777f.mo478a(c0602b2);
                if (f2 < a12) {
                    f2 = a12;
                }
                if (a3 <= 0.0f || f2 <= a3) {
                    a3 = f2;
                }
                f = -(c0623c.f2772K + c0623c.f2770I);
                a10 = 0.0f;
                f2 = f;
                for (i11 = i12; i11 < i12 + i; i11++) {
                    f2 += a4[i11];
                    f += a6[i11];
                    a10 += a8[i11];
                }
                f2 = Math.max(0.0f, a12 - f2);
                a3 = Math.max(0.0f, a3 - f);
                i11 = i12 + i;
                while (i12 < i11) {
                    f = a10 == 0.0f ? 1.0f / ((float) i) : a8[i12] / a10;
                    a4[i12] = a4[i12] + (f2 * f);
                    a6[i12] = (f * a3) + a6[i12];
                    i12++;
                }
            }
        }
        this.f2709X = 0.0f;
        this.f2710Z = 0.0f;
        this.aa = 0.0f;
        this.ab = 0.0f;
        for (i2 = 0; i2 < i4; i2++) {
            this.f2709X += a4[i2];
            this.aa += a6[i2];
        }
        for (i2 = 0; i2 < i5; i2++) {
            this.f2710Z += a5[i2];
            this.ab += Math.max(a5[i2], a7[i2]);
        }
        f = this.f2691B.mo478a(this) + this.f2693D.mo478a(this);
        a3 = this.f2690A.mo478a(this) + this.f2692C.mo478a(this);
        this.f2709X += f;
        this.f2710Z += a3;
        this.aa = Math.max(f + this.aa, this.f2709X);
        this.ab = Math.max(this.ab + a3, this.f2710Z);
    }

    /* renamed from: y */
    private void m2049y() {
        if (this.f2696G != null) {
            DebugRect.f2676c.m963a(this.f2696G);
            this.f2696G.mo530d();
        }
    }

    /* renamed from: a */
    public final C0602b mo469a(float f, float f2, boolean z) {
        return (!this.ag || (!(z && this.f2610d == Touchable.disabled) && f >= 0.0f && f < this.f2615i && f2 >= 0.0f && f2 < this.f2616j)) ? super.mo469a(f, f2, z) : null;
    }

    /* renamed from: a */
    public final Table m2051a(Debug debug) {
        super.mo487a(debug != Debug.none);
        if (this.f2695F != debug) {
            this.f2695F = debug;
            if (debug == Debug.none) {
                m2049y();
            } else {
                d_();
            }
        }
        return this;
    }

    /* renamed from: a */
    public void mo471a(C0444a c0444a, float f) {
        b_();
        if (this.f2628r) {
            m1971a(c0444a, m1983f());
            m2039a(c0444a, f, 0.0f, 0.0f);
            if (this.ag) {
                c0444a.mo377f();
                float a = this.f2691B.mo478a(this);
                float a2 = this.f2692C.mo478a(this);
                if (m1957c(a, a2, (this.f2615i - a) - this.f2693D.mo478a(this), (this.f2616j - a2) - this.f2690A.mo478a(this))) {
                    m1977b(c0444a, f);
                    c0444a.mo377f();
                    C0721u.m2513a(C0661i.m2231a());
                }
            } else {
                m1977b(c0444a, f);
            }
            m1969a(c0444a);
            return;
        }
        m2039a(c0444a, f, this.f2613g, this.f2614h);
        super.mo471a(c0444a, f);
    }

    /* renamed from: a */
    public final void mo472a(ShapeRenderer shapeRenderer) {
        float f = 0.0f;
        if (this.f2628r) {
            m1973a(shapeRenderer, m1983f());
            m2041e(shapeRenderer);
            if (this.ag) {
                float a;
                shapeRenderer.m1463c();
                float f2 = this.f2615i;
                float f3 = this.f2616j;
                if (this.f2697H != null) {
                    a = this.f2691B.mo478a(this);
                    f = this.f2692C.mo478a(this);
                    f2 -= this.f2693D.mo478a(this) + a;
                    f3 -= this.f2690A.mo478a(this) + f;
                } else {
                    a = 0.0f;
                }
                if (m1957c(a, f, f2, f3)) {
                    m1980c(shapeRenderer);
                    C0721u.m2513a(C0661i.m2231a());
                }
            } else {
                m1980c(shapeRenderer);
            }
            m1982d(shapeRenderer);
            return;
        }
        m2041e(shapeRenderer);
        super.mo472a(shapeRenderer);
    }

    /* renamed from: a */
    public final void m2054a(C0655f c0655f) {
        if (this.f2697H != c0655f) {
            float t = m2044t();
            float u = m2045u();
            float v = m2046v();
            float w = m2047w();
            this.f2697H = c0655f;
            float t2 = m2044t();
            float u2 = m2045u();
            float v2 = m2046v();
            float w2 = m2047w();
            if (t + v != t2 + v2 || u + w != u2 + w2) {
                mo482j();
            } else if (t != t2 || u != u2 || v != v2 || w != w2) {
                d_();
            }
        }
    }

    /* renamed from: a */
    public final void mo487a(boolean z) {
        m2051a(z ? Debug.all : Debug.none);
    }

    /* renamed from: a */
    public final boolean mo488a(C0602b c0602b, boolean z) {
        if (!super.mo488a(c0602b, z)) {
            return false;
        }
        C0623c c0623c;
        C0676a c0676a = this.f2700O;
        int i = c0676a.f3001b;
        for (int i2 = 0; i2 < i; i2++) {
            c0623c = (C0623c) c0676a.m2291a(i2);
            if (c0623c.f2795x == c0602b) {
                break;
            }
        }
        c0623c = null;
        if (c0623c != null) {
            c0623c.f2795x = null;
        }
        return true;
    }

    /* renamed from: b */
    protected final void mo489b(ShapeRenderer shapeRenderer) {
    }

    /* renamed from: c */
    public final boolean mo490c(C0602b c0602b) {
        return mo488a(c0602b, true);
    }

    /* renamed from: d */
    public final <T extends C0602b> C0623c<T> m2059d(T t) {
        C0623c c0623c;
        Object k = mo502k();
        k.f2795x = t;
        if (this.f2699N) {
            this.f2699N = false;
            this.f2712v--;
            ((C0623c) this.f2700O.m2299b()).f2765D = false;
        }
        C0676a c0676a = this.f2700O;
        int i = c0676a.f3001b;
        if (i > 0) {
            c0623c = (C0623c) c0676a.m2299b();
            if (c0623c.f2765D) {
                k.f2766E = 0;
                k.f2767F = c0623c.f2767F + 1;
            } else {
                k.f2766E = c0623c.f2766E + c0623c.f2792u.intValue();
                k.f2767F = c0623c.f2767F;
            }
            if (k.f2767F > 0) {
                loop0:
                for (i--; i >= 0; i--) {
                    c0623c = (C0623c) c0676a.m2291a(i);
                    int i2 = c0623c.f2766E;
                    int intValue = i2 + c0623c.f2792u.intValue();
                    for (int i3 = i2; i3 < intValue; i3++) {
                        if (i3 == k.f2766E) {
                            k.f2768G = i;
                            break loop0;
                        }
                    }
                }
            }
        } else {
            k.f2766E = 0;
            k.f2767F = 0;
        }
        c0676a.m2296a(k);
        k.m2088a(this.f2701P);
        if (k.f2766E < this.f2702Q.f3001b) {
            c0623c = (C0623c) this.f2702Q.m2291a(k.f2766E);
            if (c0623c != null) {
                k.m2091b(c0623c);
            }
        }
        k.m2091b(this.f2703R);
        if (t != null) {
            mo510b(t);
        }
        return k;
    }

    public final void d_() {
        this.f2704S = true;
        super.d_();
    }

    /* renamed from: h */
    public final void mo492h() {
        C0676a c0676a = this.f2700O;
        for (int i = c0676a.f3001b - 1; i >= 0; i--) {
            C0602b c0602b = ((C0623c) c0676a.m2291a(i)).f2795x;
            if (c0602b != null) {
                c0602b.m1943a();
            }
        }
        f2689z.m963a(c0676a);
        c0676a.mo530d();
        this.f2712v = 0;
        this.f2711u = 0;
        if (this.f2703R != null) {
            f2689z.mo363a(this.f2703R);
        }
        this.f2703R = null;
        this.f2699N = false;
        super.mo492h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C0605e mo493i() {
        super.mo493i();
        return this;
    }

    /* renamed from: l */
    public float mo483l() {
        if (this.f2704S) {
            m2048x();
        }
        float f = this.aa;
        return this.f2697H != null ? Math.max(f, this.f2697H.mo518e()) : f;
    }

    /* renamed from: m */
    public float mo484m() {
        if (this.f2704S) {
            m2048x();
        }
        float f = this.ab;
        return this.f2697H != null ? Math.max(f, this.f2697H.mo519f()) : f;
    }

    /* renamed from: n */
    public float mo485n() {
        if (this.f2704S) {
            m2048x();
        }
        return this.f2709X;
    }

    /* renamed from: o */
    public float mo486o() {
        if (this.f2704S) {
            m2048x();
        }
        return this.f2710Z;
    }

    /* renamed from: q */
    public final C0623c m2066q() {
        if (this.f2700O.f3001b > 0) {
            if (!this.f2699N) {
                m2043s();
            }
            d_();
        }
        this.f2699N = false;
        if (this.f2703R != null) {
            f2689z.mo363a(this.f2703R);
        }
        this.f2703R = mo502k();
        C0623c c0623c = this.f2703R;
        c0623c.f2773b = null;
        c0623c.f2774c = null;
        c0623c.f2775d = null;
        c0623c.f2776e = null;
        c0623c.f2777f = null;
        c0623c.f2778g = null;
        c0623c.f2779h = null;
        c0623c.f2780i = null;
        c0623c.f2781j = null;
        c0623c.f2782k = null;
        c0623c.f2783l = null;
        c0623c.f2784m = null;
        c0623c.f2785n = null;
        c0623c.f2786o = null;
        c0623c.f2787p = null;
        c0623c.f2788q = null;
        c0623c.f2789r = null;
        c0623c.f2790s = null;
        c0623c.f2791t = null;
        c0623c.f2792u = null;
        c0623c.f2793v = null;
        c0623c.f2794w = null;
        return this.f2703R;
    }

    /* renamed from: r */
    public final void mo494r() {
        float[] fArr;
        float min;
        float[] a;
        float[] fArr2;
        int i;
        float[] fArr3;
        float min2;
        int i2;
        int i3;
        float a2;
        float a3;
        float a4;
        int i4;
        int i5;
        C0602b c0602b;
        float f = this.f2615i;
        float f2 = this.f2616j;
        C0676a c0676a = this.f2700O;
        int i6 = c0676a.f3001b;
        if (this.f2704S) {
            m2048x();
        }
        float a5 = this.f2691B.mo478a(this);
        float a6 = a5 + this.f2693D.mo478a(this);
        float a7 = this.f2690A.mo478a(this);
        float a8 = a7 + this.f2692C.mo478a(this);
        int i7 = this.f2711u;
        int i8 = this.f2712v;
        float[] fArr4 = this.ae;
        float[] fArr5 = this.af;
        float[] fArr6 = this.ac;
        float[] fArr7 = this.ad;
        int i9 = 0;
        float f3 = 0.0f;
        while (i9 < i7) {
            i9++;
            f3 = fArr4[i9] + f3;
        }
        i9 = 0;
        float f4 = 0.0f;
        while (i9 < i8) {
            i9++;
            f4 = fArr5[i9] + f4;
        }
        float f5 = this.aa - this.f2709X;
        if (f5 == 0.0f) {
            fArr = this.f2705T;
        } else {
            min = Math.min(f5, Math.max(0.0f, f - this.f2709X));
            a = m2040a(f2684s, i7);
            f2684s = a;
            float[] fArr8 = this.f2705T;
            fArr2 = this.f2707V;
            for (i = 0; i < i7; i++) {
                a[i] = (((fArr2[i] - fArr8[i]) / f5) * min) + fArr8[i];
            }
            fArr = a;
        }
        min = this.ab - this.f2710Z;
        if (min == 0.0f) {
            fArr3 = this.f2706U;
        } else {
            a = m2040a(f2685t, i8);
            f2685t = a;
            min2 = Math.min(min, Math.max(0.0f, f2 - this.f2710Z));
            fArr2 = this.f2706U;
            float[] fArr9 = this.f2708W;
            for (i2 = 0; i2 < i8; i2++) {
                a[i2] = (((fArr9[i2] - fArr2[i2]) / min) * min2) + fArr2[i2];
            }
            fArr3 = a;
        }
        for (i3 = 0; i3 < i6; i3++) {
            C0623c c0623c = (C0623c) c0676a.m2291a(i3);
            int i10 = c0623c.f2766E;
            int i11 = c0623c.f2767F;
            C0602b c0602b2 = c0623c.f2795x;
            int intValue = c0623c.f2792u.intValue();
            float f6 = 0.0f;
            int i12 = i10;
            while (i12 < i10 + intValue) {
                i12++;
                f6 = fArr[i12] + f6;
            }
            float f7 = fArr3[i11];
            a2 = c0623c.f2775d.mo478a(c0602b2);
            a3 = c0623c.f2776e.mo478a(c0602b2);
            a4 = c0623c.f2773b.mo478a(c0602b2);
            min2 = c0623c.f2774c.mo478a(c0602b2);
            float a9 = c0623c.f2777f.mo478a(c0602b2);
            min = c0623c.f2778g.mo478a(c0602b2);
            if (a2 >= a4) {
                a4 = a2;
            }
            if (a3 >= min2) {
                min2 = a3;
            }
            if (a9 <= 0.0f || a4 <= a9) {
                a9 = a4;
            }
            if (min <= 0.0f || min2 <= min) {
                min = min2;
            }
            c0623c.f2762A = Math.min((f6 - c0623c.f2770I) - c0623c.f2772K, a9);
            c0623c.f2763B = Math.min((f7 - c0623c.f2769H) - c0623c.f2771J, min);
            if (intValue == 1) {
                fArr6[i10] = Math.max(fArr6[i10], f6);
            }
            fArr7[i11] = Math.max(fArr7[i11], f7);
        }
        if (f3 > 0.0f) {
            i9 = 0;
            min2 = f - a6;
            while (i9 < i7) {
                i9++;
                min2 -= fArr6[i9];
            }
            min = 0.0f;
            i9 = 0;
            for (i2 = 0; i2 < i7; i2++) {
                if (fArr4[i2] != 0.0f) {
                    float f8 = (fArr4[i2] * min2) / f3;
                    fArr6[i2] = fArr6[i2] + f8;
                    min = f8 + min;
                    i9 = i2;
                }
            }
            fArr6[i9] = fArr6[i9] + (min2 - min);
        }
        if (f4 > 0.0f) {
            i9 = 0;
            min2 = f2 - a8;
            while (i9 < i8) {
                i9++;
                min2 -= fArr7[i9];
            }
            min = 0.0f;
            i9 = 0;
            for (i2 = 0; i2 < i8; i2++) {
                if (fArr5[i2] != 0.0f) {
                    f8 = (fArr5[i2] * min2) / f4;
                    fArr7[i2] = fArr7[i2] + f8;
                    min = f8 + min;
                    i9 = i2;
                }
            }
            fArr7[i9] = fArr7[i9] + (min2 - min);
        }
        for (i2 = 0; i2 < i6; i2++) {
            c0623c = (C0623c) c0676a.m2291a(i2);
            i3 = c0623c.f2792u.intValue();
            if (i3 != 1) {
                min = 0.0f;
                int i13 = c0623c.f2766E;
                i4 = i13 + i3;
                while (i13 < i4) {
                    min += fArr[i13] - fArr6[i13];
                    i13++;
                }
                min = (min - Math.max(0.0f, c0623c.f2770I + c0623c.f2772K)) / ((float) i3);
                if (min > 0.0f) {
                    i9 = c0623c.f2766E;
                    i13 = i9 + i3;
                    while (i9 < i13) {
                        fArr6[i9] = fArr6[i9] + min;
                        i9++;
                    }
                }
            }
        }
        i9 = 0;
        a2 = a6;
        while (i9 < i7) {
            i9++;
            a2 = fArr6[i9] + a2;
        }
        i9 = 0;
        a3 = a8;
        while (i9 < i8) {
            i9++;
            a3 = fArr7[i9] + a3;
        }
        i9 = this.f2694E;
        min2 = 0.0f + a5;
        if ((i9 & 16) != 0) {
            min2 += f - a2;
        } else if ((i9 & 8) == 0) {
            min2 += (f - a2) / 2.0f;
        }
        float f9 = 0.0f + a7;
        if ((i9 & 4) != 0) {
            f9 += f2 - a3;
        } else if ((i9 & 2) == 0) {
            f9 += (f2 - a3) / 2.0f;
        }
        i4 = 0;
        a4 = min2;
        float f10 = f9;
        while (i4 < i6) {
            c0623c = (C0623c) c0676a.m2291a(i4);
            min = 0.0f;
            i2 = c0623c.f2766E;
            i10 = c0623c.f2792u.intValue() + i2;
            while (i2 < i10) {
                min += fArr6[i2];
                i2++;
            }
            f5 = min - (c0623c.f2770I + c0623c.f2772K);
            min = c0623c.f2770I + a4;
            a4 = c0623c.f2787p.floatValue();
            float floatValue = c0623c.f2788q.floatValue();
            if (a4 > 0.0f) {
                c0623c.f2762A = Math.max(a4 * f5, c0623c.f2773b.mo478a(c0623c.f2795x));
                a4 = c0623c.f2777f.mo478a(c0623c.f2795x);
                if (a4 > 0.0f) {
                    c0623c.f2762A = Math.min(c0623c.f2762A, a4);
                }
            }
            if (floatValue > 0.0f) {
                c0623c.f2763B = Math.max(((fArr7[c0623c.f2767F] * floatValue) - c0623c.f2769H) - c0623c.f2771J, c0623c.f2774c.mo478a(c0623c.f2795x));
                a4 = c0623c.f2778g.mo478a(c0623c.f2795x);
                if (a4 > 0.0f) {
                    c0623c.f2763B = Math.min(c0623c.f2763B, a4);
                }
            }
            int intValue2 = c0623c.f2789r.intValue();
            if ((intValue2 & 8) != 0) {
                c0623c.f2796y = min;
            } else if ((intValue2 & 16) != 0) {
                c0623c.f2796y = (min + f5) - c0623c.f2762A;
            } else {
                c0623c.f2796y = ((f5 - c0623c.f2762A) / 2.0f) + min;
            }
            if ((intValue2 & 2) != 0) {
                c0623c.f2797z = c0623c.f2769H + f10;
            } else if ((intValue2 & 4) != 0) {
                c0623c.f2797z = ((fArr7[c0623c.f2767F] + f10) - c0623c.f2763B) - c0623c.f2771J;
            } else {
                c0623c.f2797z = ((((fArr7[c0623c.f2767F] - c0623c.f2763B) + c0623c.f2769H) - c0623c.f2771J) / 2.0f) + f10;
            }
            if (c0623c.f2765D) {
                f10 = fArr7[c0623c.f2767F] + f10;
                f8 = min2;
            } else {
                f8 = (c0623c.f2772K + f5) + min;
            }
            i4++;
            a4 = f8;
        }
        if (this.f2695F != Debug.none) {
            m2049y();
            if (this.f2695F == Debug.table || this.f2695F == Debug.all) {
                m2038a(0.0f, 0.0f, f, f2, f2686w);
                m2038a(min2, f9, a2 - a6, a3 - a8, f2686w);
            }
            i12 = 0;
            a6 = min2;
            f10 = f9;
            while (i12 < i6) {
                c0623c = (C0623c) c0676a.m2291a(i12);
                if (this.f2695F == Debug.actor || this.f2695F == Debug.all) {
                    m2038a(c0623c.f2796y, c0623c.f2797z, c0623c.f2762A, c0623c.f2763B, f2688y);
                }
                f = 0.0f;
                i2 = c0623c.f2766E;
                i3 = c0623c.f2792u.intValue() + i2;
                while (i2 < i3) {
                    f += fArr6[i2];
                    i2++;
                }
                a3 = f - (c0623c.f2770I + c0623c.f2772K);
                a9 = a6 + c0623c.f2770I;
                if (this.f2695F == Debug.cell || this.f2695F == Debug.all) {
                    m2038a(a9, f10 + c0623c.f2769H, a3, (fArr7[c0623c.f2767F] - c0623c.f2769H) - c0623c.f2771J, f2687x);
                }
                if (c0623c.f2765D) {
                    f10 = fArr7[c0623c.f2767F] + f10;
                    f8 = min2;
                } else {
                    f8 = (c0623c.f2772K + a3) + a9;
                }
                i12++;
                a6 = f8;
            }
        }
        C0676a c0676a2 = this.f2700O;
        if (this.f2698I) {
            i5 = c0676a2.f3001b;
            for (i = 0; i < i5; i++) {
                c0623c = (C0623c) c0676a2.m2291a(i);
                min = (float) Math.round(c0623c.f2762A);
                min2 = (float) Math.round(c0623c.f2763B);
                f9 = (float) Math.round(c0623c.f2796y);
                a9 = (f2 - ((float) Math.round(c0623c.f2797z))) - min2;
                c0623c.f2796y = f9;
                c0623c.f2797z = a9;
                c0623c.f2762A = min;
                c0623c.f2763B = min2;
                c0602b = c0623c.f2795x;
                if (c0602b != null) {
                    c0602b.m1936a(f9, a9, min, min2);
                }
            }
        } else {
            i5 = c0676a2.f3001b;
            for (i = 0; i < i5; i++) {
                c0623c = (C0623c) c0676a2.m2291a(i);
                min = c0623c.f2763B;
                min2 = (f2 - c0623c.f2797z) - min;
                c0623c.f2797z = min2;
                C0602b c0602b3 = c0623c.f2795x;
                if (c0602b3 != null) {
                    c0602b3.m1936a(c0623c.f2796y, min2, c0623c.f2762A, min);
                }
            }
        }
        c0676a2 = this.f2627q;
        i5 = c0676a2.f3001b;
        for (i = 0; i < i5; i++) {
            c0602b = (C0602b) c0676a2.m2291a(i);
            if (c0602b instanceof C0616g) {
                ((C0616g) c0602b).b_();
            }
        }
    }
}
