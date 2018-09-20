package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0444a;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.BitmapFont.C0446b;
import com.badlogic.gdx.graphics.g2d.BitmapFontCache;
import com.badlogic.gdx.graphics.g2d.C0451d;
import com.badlogic.gdx.graphics.g2d.C0451d.C0450a;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.utils.C0655f;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.ac;

/* renamed from: com.badlogic.gdx.scenes.scene2d.ui.f */
public final class C0629f extends C0624j {
    /* renamed from: r */
    private static final C0430b f2819r = new C0430b();
    /* renamed from: s */
    private static final C0451d f2820s = new C0451d();
    /* renamed from: A */
    private float f2821A;
    /* renamed from: B */
    private boolean f2822B = true;
    /* renamed from: C */
    private float f2823C = 1.0f;
    /* renamed from: D */
    private float f2824D = 1.0f;
    /* renamed from: E */
    private boolean f2825E = false;
    /* renamed from: F */
    private String f2826F;
    /* renamed from: q */
    public C0628a f2827q;
    /* renamed from: t */
    private final C0451d f2828t = new C0451d();
    /* renamed from: u */
    private final Vector2 f2829u = new Vector2();
    /* renamed from: v */
    private final ac f2830v = new ac();
    /* renamed from: w */
    private BitmapFontCache f2831w;
    /* renamed from: x */
    private int f2832x = 8;
    /* renamed from: y */
    private int f2833y = 8;
    /* renamed from: z */
    private boolean f2834z;

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.f$a */
    public static class C0628a {
        /* renamed from: a */
        public BitmapFont f2816a;
        /* renamed from: b */
        public C0430b f2817b;
        /* renamed from: c */
        public C0655f f2818c;

        public C0628a(BitmapFont bitmapFont, C0430b c0430b) {
            this.f2816a = bitmapFont;
            this.f2817b = c0430b;
        }
    }

    public C0629f(CharSequence charSequence, C0628a c0628a) {
        if (charSequence != null) {
            this.f2830v.m2319a(charSequence);
        }
        m2129a(c0628a);
        if (charSequence != null && charSequence.length() > 0) {
            m1956c(mo483l(), mo484m());
        }
    }

    /* renamed from: k */
    private void m2126k() {
        BitmapFont bitmapFont = this.f2831w.f1829b;
        float f = bitmapFont.f1821a.f1796n;
        float f2 = bitmapFont.f1821a.f1797o;
        if (this.f2825E) {
            bitmapFont.f1821a.m1324a(this.f2823C, this.f2824D);
        }
        this.f2822B = false;
        C0451d c0451d = f2820s;
        BitmapFont bitmapFont2;
        CharSequence charSequence;
        if (this.f2834z && this.f2826F == null) {
            float f3 = this.f2615i;
            if (this.f2827q.f2818c != null) {
                f3 -= this.f2827q.f2818c.mo513a() + this.f2827q.f2818c.mo515b();
            }
            bitmapFont2 = this.f2831w.f1829b;
            charSequence = this.f2830v;
            c0451d.m1346a(bitmapFont2, charSequence, 0, charSequence.length(), C0430b.f1620c, f3, 8, true, null);
        } else {
            bitmapFont2 = this.f2831w.f1829b;
            charSequence = this.f2830v;
            c0451d.m1346a(bitmapFont2, charSequence, 0, charSequence.length(), bitmapFont2.f1823c.f1834g, 0.0f, 8, false, null);
        }
        this.f2829u.m1701a(c0451d.f1849b, c0451d.f1850c);
        if (this.f2825E) {
            bitmapFont.f1821a.m1324a(f, f2);
        }
    }

    /* renamed from: a */
    public final void m2127a(int i) {
        this.f2832x = i;
        if ((i & 8) != 0) {
            this.f2833y = 8;
        } else if ((i & 16) != 0) {
            this.f2833y = 16;
        } else {
            this.f2833y = 1;
        }
        mo505g();
    }

    /* renamed from: a */
    public final void mo471a(C0444a c0444a, float f) {
        int i;
        int i2;
        int i3;
        int i4;
        b_();
        C0430b a = f2819r.m1218a(this.f2622p);
        a.f1647L *= f;
        if (this.f2827q.f2818c != null) {
            c0444a.mo367a(a.f1644I, a.f1645J, a.f1646K, a.f1647L);
            this.f2827q.f2818c.mo514a(c0444a, this.f2613g, this.f2614h, this.f2615i, this.f2616j);
        }
        if (this.f2827q.f2817b != null) {
            a.m1221b(this.f2827q.f2817b);
        }
        BitmapFontCache bitmapFontCache = this.f2831w;
        float a2 = a.m1216a();
        if (bitmapFontCache.f1835h != a2) {
            bitmapFontCache.f1835h = a2;
            int[] iArr = bitmapFontCache.f1838k;
            int length = iArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                iArr[i5] = 0;
            }
            i = bitmapFontCache.f1831d.f3001b;
            for (int i6 = 0; i6 < i; i6++) {
                C0451d c0451d = (C0451d) bitmapFontCache.f1831d.m2291a(i6);
                i2 = c0451d.f1848a.f3001b;
                for (i3 = 0; i3 < i2; i3++) {
                    C0450a c0450a = (C0450a) c0451d.f1848a.m2291a(i3);
                    C0676a c0676a = c0450a.f1842a;
                    float a3 = BitmapFontCache.f1827a.m1218a(c0450a.f1847f).m1221b(a).m1216a();
                    int i7 = c0676a.f3001b;
                    for (i4 = 0; i4 < i7; i4++) {
                        length = ((C0446b) c0676a.m2291a(i4)).f1820o;
                        int i8 = (iArr[length] * 20) + 2;
                        iArr[length] = iArr[length] + 1;
                        float[] fArr = bitmapFontCache.f1836i[length];
                        for (length = 0; length < 20; length += 5) {
                            fArr[i8 + length] = a3;
                        }
                    }
                }
            }
        }
        BitmapFontCache bitmapFontCache2 = this.f2831w;
        a2 = this.f2613g;
        float f2 = a2 - bitmapFontCache2.f1832e;
        a2 = this.f2614h - bitmapFontCache2.f1833f;
        if (!(f2 == 0.0f && a2 == 0.0f)) {
            if (bitmapFontCache2.f1830c) {
                f2 = (float) Math.round(f2);
                a2 = (float) Math.round(a2);
            }
            bitmapFontCache2.f1832e += f2;
            bitmapFontCache2.f1833f += a2;
            float[][] fArr2 = bitmapFontCache2.f1836i;
            int length2 = fArr2.length;
            for (i3 = 0; i3 < length2; i3++) {
                float[] fArr3 = fArr2[i3];
                i = bitmapFontCache2.f1837j[i3];
                for (i4 = 0; i4 < i; i4 += 5) {
                    fArr3[i4] = fArr3[i4] + f2;
                    i2 = i4 + 1;
                    fArr3[i2] = fArr3[i2] + a2;
                }
            }
        }
        this.f2831w.m1340a(c0444a);
    }

    /* renamed from: a */
    public final void m2129a(C0628a c0628a) {
        if (c0628a == null) {
            throw new IllegalArgumentException("style cannot be null.");
        } else if (c0628a.f2816a == null) {
            throw new IllegalArgumentException("Missing LabelStyle font.");
        } else {
            this.f2827q = c0628a;
            this.f2831w = c0628a.f2816a.m1336c();
            mo482j();
        }
    }

    /* renamed from: a */
    public final void m2130a(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence == null ? "" : charSequence;
        if (charSequence2 instanceof ac) {
            if (!this.f2830v.equals(charSequence2)) {
                this.f2830v.m2327b(0);
                ac acVar = this.f2830v;
                ac acVar2 = (ac) charSequence2;
                if (acVar2 == null) {
                    acVar.m2321a();
                } else {
                    acVar.m2325a(acVar2.f3008a, 0, acVar2.f3009b);
                }
            } else {
                return;
            }
        } else if (!m2131b(charSequence2)) {
            this.f2830v.m2327b(0);
            this.f2830v.m2319a(charSequence2);
        } else {
            return;
        }
        mo482j();
    }

    /* renamed from: b */
    public final boolean m2131b(CharSequence charSequence) {
        int i = this.f2830v.f3009b;
        char[] cArr = this.f2830v.f3008a;
        if (i != charSequence.length()) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (cArr[i2] != charSequence.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final void m2132d(float f, float f2) {
        this.f2825E = true;
        this.f2823C = f;
        this.f2824D = f2;
        mo482j();
    }

    /* renamed from: f */
    public final void mo503f() {
        float a;
        float d;
        float f;
        float c;
        BitmapFontCache bitmapFontCache;
        BitmapFont bitmapFont = this.f2831w.f1829b;
        float f2 = bitmapFont.f1821a.f1796n;
        float f3 = bitmapFont.f1821a.f1797o;
        if (this.f2825E) {
            bitmapFont.f1821a.m1324a(this.f2823C, this.f2824D);
        }
        boolean z = this.f2834z && this.f2826F == null;
        if (z) {
            float m = mo484m();
            if (m != this.f2821A) {
                this.f2821A = m;
                mo482j();
            }
        }
        float f4 = this.f2615i;
        float f5 = this.f2616j;
        C0655f c0655f = this.f2827q.f2818c;
        if (c0655f != null) {
            a = c0655f.mo513a();
            f4 -= c0655f.mo513a() + c0655f.mo515b();
            d = c0655f.mo517d();
            f = a;
            c = f5 - (c0655f.mo516c() + c0655f.mo517d());
        } else {
            d = 0.0f;
            f = 0.0f;
            c = f5;
        }
        C0451d c0451d = this.f2828t;
        if (!z) {
            ac acVar = this.f2830v;
            String str = "\n";
            int i = 0;
            int length = str.length();
            if (length <= 0) {
                i = 0;
            } else if (length + 0 > acVar.f3009b) {
                i = -1;
            } else {
                char charAt = str.charAt(0);
                while (true) {
                    Object obj = null;
                    while (i < acVar.f3009b) {
                        if (acVar.f3008a[i] == charAt) {
                            obj = 1;
                            break;
                        }
                        i++;
                    }
                    if (obj != null && length + i <= acVar.f3009b) {
                        int i2 = 0;
                        int i3 = i;
                        do {
                            i2++;
                            if (i2 >= length) {
                                break;
                            }
                            i3++;
                        } while (acVar.f3008a[i3] == str.charAt(i2));
                        if (i2 == length) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                    }
                }
                i = -1;
            }
            if (i == -1) {
                a = bitmapFont.f1821a.f1791i;
                if ((this.f2832x & 2) != 0) {
                    f5 = ((this.f2831w.f1829b.f1824d ? 0.0f : c - a) + d) + this.f2827q.f2816a.f1821a.f1793k;
                } else if ((this.f2832x & 4) == 0) {
                    f5 = ((this.f2831w.f1829b.f1824d ? c - a : 0.0f) + d) - this.f2827q.f2816a.f1821a.f1793k;
                } else {
                    f5 = ((c - a) / 2.0f) + d;
                }
                d = this.f2831w.f1829b.f1824d ? f5 + a : f5;
                c0451d.m1346a(bitmapFont, this.f2830v, 0, this.f2830v.f3009b, C0430b.f1620c, f4, this.f2833y, z, this.f2826F);
                bitmapFontCache = this.f2831w;
                bitmapFontCache.m1339a();
                bitmapFontCache.m1341a(c0451d, f, d);
                if (this.f2825E) {
                    bitmapFont.f1821a.m1324a(f2, f3);
                }
            }
        }
        c0451d.m1346a(bitmapFont, this.f2830v, 0, this.f2830v.f3009b, C0430b.f1620c, f4, this.f2833y, z, this.f2826F);
        f5 = c0451d.f1849b;
        a = c0451d.f1850c;
        if ((this.f2832x & 8) != 0) {
            f4 = f5;
        } else if ((this.f2832x & 16) != 0) {
            f += f4 - f5;
            f4 = f5;
        } else {
            f += (f4 - f5) / 2.0f;
            f4 = f5;
        }
        if ((this.f2832x & 2) != 0) {
            if (this.f2831w.f1829b.f1824d) {
            }
            f5 = ((this.f2831w.f1829b.f1824d ? 0.0f : c - a) + d) + this.f2827q.f2816a.f1821a.f1793k;
        } else if ((this.f2832x & 4) == 0) {
            f5 = ((c - a) / 2.0f) + d;
        } else {
            if (this.f2831w.f1829b.f1824d) {
            }
            f5 = ((this.f2831w.f1829b.f1824d ? c - a : 0.0f) + d) - this.f2827q.f2816a.f1821a.f1793k;
        }
        if (this.f2831w.f1829b.f1824d) {
        }
        c0451d.m1346a(bitmapFont, this.f2830v, 0, this.f2830v.f3009b, C0430b.f1620c, f4, this.f2833y, z, this.f2826F);
        bitmapFontCache = this.f2831w;
        bitmapFontCache.m1339a();
        bitmapFontCache.m1341a(c0451d, f, d);
        if (this.f2825E) {
            bitmapFont.f1821a.m1324a(f2, f3);
        }
    }

    /* renamed from: g */
    public final void mo505g() {
        super.mo505g();
        this.f2822B = true;
    }

    /* renamed from: h */
    public final void m2135h() {
        this.f2834z = true;
        mo482j();
    }

    /* renamed from: l */
    public final float mo483l() {
        if (this.f2834z) {
            return 0.0f;
        }
        if (this.f2822B) {
            m2126k();
        }
        float f = this.f2829u.f2337x;
        C0655f c0655f = this.f2827q.f2818c;
        if (c0655f == null) {
            return f;
        }
        return f + (c0655f.mo515b() + c0655f.mo513a());
    }

    /* renamed from: m */
    public final float mo484m() {
        if (this.f2822B) {
            m2126k();
        }
        float f = 1.0f;
        if (this.f2825E) {
            f = this.f2824D / this.f2827q.f2816a.f1821a.f1797o;
        }
        f = this.f2829u.f2338y - ((f * this.f2827q.f2816a.f1821a.f1793k) * 2.0f);
        C0655f c0655f = this.f2827q.f2818c;
        if (c0655f == null) {
            return f;
        }
        return f + (c0655f.mo517d() + c0655f.mo516c());
    }

    public final String toString() {
        return super.toString() + ": " + this.f2830v;
    }
}
