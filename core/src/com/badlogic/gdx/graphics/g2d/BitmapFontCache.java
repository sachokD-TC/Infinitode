package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.BitmapFont.C0446b;
import com.badlogic.gdx.graphics.g2d.C0451d.C0450a;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0689h;
import com.badlogic.gdx.utils.C0692k;
import com.badlogic.gdx.utils.C0721u;

/* renamed from: com.badlogic.gdx.graphics.g2d.c */
public final class BitmapFontCache {
    /* renamed from: a */
    public static final C0430b f1827a = new C0430b(1.0f, 1.0f, 1.0f, 1.0f);
    /* renamed from: l */
    private static final float f1828l = C0430b.f1620c.m1216a();
    /* renamed from: b */
    public final BitmapFont f1829b;
    /* renamed from: c */
    public boolean f1830c;
    /* renamed from: d */
    public final C0676a<C0451d> f1831d = new C0676a();
    /* renamed from: e */
    public float f1832e;
    /* renamed from: f */
    public float f1833f;
    /* renamed from: g */
    public final C0430b f1834g = new C0430b(1.0f, 1.0f, 1.0f, 1.0f);
    /* renamed from: h */
    public float f1835h;
    /* renamed from: i */
    public float[][] f1836i;
    /* renamed from: j */
    public int[] f1837j;
    /* renamed from: k */
    public int[] f1838k;
    /* renamed from: m */
    private final C0676a<C0451d> f1839m = new C0676a();
    /* renamed from: n */
    private int f1840n;
    /* renamed from: o */
    private C0692k[] f1841o;

    public BitmapFontCache(BitmapFont bitmapFont, boolean z) {
        this.f1829b = bitmapFont;
        this.f1830c = z;
        int i = bitmapFont.f1822b.f3001b;
        if (i == 0) {
            throw new IllegalArgumentException("The specified font must contain at least one texture page.");
        }
        this.f1836i = new float[i][];
        this.f1837j = new int[i];
        if (i > 1) {
            this.f1841o = new C0692k[i];
            int length = this.f1841o.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f1841o[i2] = new C0692k();
            }
        }
        this.f1838k = new int[i];
    }

    /* renamed from: a */
    private void m1337a(int i, int i2) {
        if (this.f1841o != null && i2 > this.f1841o[i].f3090a.length) {
            this.f1841o[i].m2421c(i2 - this.f1841o[i].f3090a.length);
        }
        int i3 = this.f1837j[i] + (i2 * 20);
        Object obj = this.f1836i[i];
        if (obj == null) {
            this.f1836i[i] = new float[i3];
        } else if (obj.length < i3) {
            Object obj2 = new float[i3];
            System.arraycopy(obj, 0, obj2, 0, this.f1837j[i]);
            this.f1836i[i] = obj2;
        }
    }

    /* renamed from: a */
    public final C0451d m1338a(CharSequence charSequence, float f, float f2, int i, float f3, int i2) {
        Object obj = (C0451d) C0721u.m2514b(C0451d.class);
        this.f1839m.m2296a(obj);
        obj.m1346a(this.f1829b, charSequence, 0, i, this.f1834g, f3, i2, false, null);
        m1341a(obj, f, f2);
        return obj;
    }

    /* renamed from: a */
    public final void m1339a() {
        this.f1832e = 0.0f;
        this.f1833f = 0.0f;
        C0721u.m2512a(this.f1839m);
        this.f1839m.mo530d();
        this.f1831d.mo530d();
        int length = this.f1837j.length;
        for (int i = 0; i < length; i++) {
            if (this.f1841o != null) {
                this.f1841o[i].f3091b = 0;
            }
            this.f1837j[i] = 0;
        }
    }

    /* renamed from: a */
    public final void m1340a(C0444a c0444a) {
        C0676a c0676a = this.f1829b.f1822b;
        int length = this.f1836i.length;
        for (int i = 0; i < length; i++) {
            if (this.f1837j[i] > 0) {
                c0444a.mo369a(((C0438n) c0676a.m2291a(i)).f1686z, this.f1836i[i], 0, this.f1837j[i]);
            }
        }
    }

    /* renamed from: a */
    public final void m1341a(C0451d c0451d, float f, float f2) {
        int i;
        int i2;
        int i3;
        int i4;
        float f3 = f2 + this.f1829b.f1821a.f1792j;
        int i5 = this.f1829b.f1822b.f3001b;
        if (this.f1836i.length < i5) {
            Object obj = new float[i5][];
            System.arraycopy(this.f1836i, 0, obj, 0, this.f1836i.length);
            this.f1836i = obj;
            obj = new int[i5];
            System.arraycopy(this.f1837j, 0, obj, 0, this.f1837j.length);
            this.f1837j = obj;
            Object obj2 = new C0692k[i5];
            i = 0;
            if (this.f1841o != null) {
                i = this.f1841o.length;
                System.arraycopy(this.f1841o, 0, obj2, 0, this.f1841o.length);
            }
            while (i < i5) {
                obj2[i] = new C0692k();
                i++;
            }
            this.f1841o = obj2;
            this.f1838k = new int[i5];
        }
        this.f1831d.m2296a((Object) c0451d);
        if (this.f1836i.length == 1) {
            i2 = 0;
            for (i5 = 0; i5 < c0451d.f1848a.f3001b; i5++) {
                i2 += ((C0450a) c0451d.f1848a.m2291a(i5)).f1842a.f3001b;
            }
            m1337a(0, i2);
        } else {
            int[] iArr = this.f1838k;
            i5 = iArr.length;
            for (i = 0; i < i5; i++) {
                iArr[i] = 0;
            }
            i3 = c0451d.f1848a.f3001b;
            for (i2 = 0; i2 < i3; i2++) {
                C0676a c0676a = ((C0450a) c0451d.f1848a.m2291a(i2)).f1842a;
                i4 = c0676a.f3001b;
                for (i5 = 0; i5 < i4; i5++) {
                    i = ((C0446b) c0676a.m2291a(i5)).f1820o;
                    iArr[i] = iArr[i] + 1;
                }
            }
            i5 = iArr.length;
            for (i = 0; i < i5; i++) {
                m1337a(i, iArr[i]);
            }
        }
        int i6 = c0451d.f1848a.f3001b;
        for (int i7 = 0; i7 < i6; i7++) {
            C0450a c0450a = (C0450a) c0451d.f1848a.m2291a(i7);
            C0676a c0676a2 = c0450a.f1842a;
            C0689h c0689h = c0450a.f1843b;
            float a = c0450a.f1847f.m1216a();
            float f4 = c0450a.f1844c + f;
            float f5 = f3 + c0450a.f1845d;
            int i8 = c0676a2.f3001b;
            i4 = 0;
            while (i4 < i8) {
                C0446b c0446b = (C0446b) c0676a2.m2291a(i4);
                float a2 = f4 + c0689h.m2404a(i4);
                f4 = this.f1829b.f1821a.f1796n;
                float f6 = this.f1829b.f1821a.f1797o;
                float f7 = a2 + (((float) c0446b.f1815j) * f4);
                float f8 = (((float) c0446b.f1816k) * f6) + f5;
                f4 *= (float) c0446b.f1809d;
                f6 *= (float) c0446b.f1810e;
                float f9 = c0446b.f1811f;
                float f10 = c0446b.f1813h;
                float f11 = c0446b.f1812g;
                float f12 = c0446b.f1814i;
                if (this.f1830c) {
                    f7 = (float) Math.round(f7);
                    f8 = (float) Math.round(f8);
                    f4 = (float) Math.round(f4);
                    f6 = (float) Math.round(f6);
                }
                f4 += f7;
                f6 += f8;
                i = c0446b.f1820o;
                int i9 = this.f1837j[i];
                int[] iArr2 = this.f1837j;
                iArr2[i] = iArr2[i] + 20;
                if (this.f1841o != null) {
                    C0692k c0692k = this.f1841o[i];
                    int i10 = this.f1840n;
                    this.f1840n = i10 + 1;
                    c0692k.m2418a(i10);
                }
                float[] fArr = this.f1836i[i];
                int i11 = i9 + 1;
                fArr[i9] = f7;
                i9 = i11 + 1;
                fArr[i11] = f8;
                i11 = i9 + 1;
                fArr[i9] = a;
                i9 = i11 + 1;
                fArr[i11] = f9;
                i11 = i9 + 1;
                fArr[i9] = f11;
                i9 = i11 + 1;
                fArr[i11] = f7;
                i3 = i9 + 1;
                fArr[i9] = f6;
                i9 = i3 + 1;
                fArr[i3] = a;
                i3 = i9 + 1;
                fArr[i9] = f9;
                int i12 = i3 + 1;
                fArr[i3] = f12;
                i3 = i12 + 1;
                fArr[i12] = f4;
                i12 = i3 + 1;
                fArr[i3] = f6;
                i2 = i12 + 1;
                fArr[i12] = a;
                i3 = i2 + 1;
                fArr[i2] = f10;
                i2 = i3 + 1;
                fArr[i3] = f12;
                i3 = i2 + 1;
                fArr[i2] = f4;
                i5 = i3 + 1;
                fArr[i3] = f8;
                i2 = i5 + 1;
                fArr[i5] = a;
                i5 = i2 + 1;
                fArr[i2] = f10;
                fArr[i5] = f11;
                i4++;
                f4 = a2;
            }
        }
        this.f1835h = f1828l;
    }
}
