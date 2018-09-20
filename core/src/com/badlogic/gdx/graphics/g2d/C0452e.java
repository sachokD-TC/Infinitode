package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;

/* renamed from: com.badlogic.gdx.graphics.g2d.e */
public class C0452e {
    /* renamed from: n */
    private static final C0430b f1852n = new C0430b();
    /* renamed from: a */
    public Texture f1853a;
    /* renamed from: b */
    public float f1854b;
    /* renamed from: c */
    public float f1855c;
    /* renamed from: d */
    public float f1856d;
    /* renamed from: e */
    public float f1857e;
    /* renamed from: f */
    public float f1858f;
    /* renamed from: g */
    public float f1859g;
    /* renamed from: h */
    public float[] f1860h;
    /* renamed from: i */
    public int f1861i;
    /* renamed from: j */
    public float f1862j;
    /* renamed from: k */
    public float f1863k;
    /* renamed from: l */
    public float f1864l;
    /* renamed from: m */
    public float f1865m;
    /* renamed from: o */
    private int f1866o;
    /* renamed from: p */
    private int f1867p;
    /* renamed from: q */
    private int f1868q;
    /* renamed from: r */
    private int f1869r;
    /* renamed from: s */
    private int f1870s;
    /* renamed from: t */
    private int f1871t;
    /* renamed from: u */
    private int f1872u;
    /* renamed from: v */
    private int f1873v;
    /* renamed from: w */
    private int f1874w;
    /* renamed from: x */
    private final C0430b f1875x;

    public C0452e(C0452e c0452e, C0430b c0430b) {
        this.f1866o = -1;
        this.f1867p = -1;
        this.f1868q = -1;
        this.f1869r = -1;
        this.f1870s = -1;
        this.f1871t = -1;
        this.f1872u = -1;
        this.f1873v = -1;
        this.f1874w = -1;
        this.f1860h = new float[180];
        this.f1875x = new C0430b(C0430b.f1620c);
        this.f1862j = -1.0f;
        this.f1863k = -1.0f;
        this.f1864l = -1.0f;
        this.f1865m = -1.0f;
        this.f1853a = c0452e.f1853a;
        this.f1866o = c0452e.f1866o;
        this.f1867p = c0452e.f1867p;
        this.f1868q = c0452e.f1868q;
        this.f1869r = c0452e.f1869r;
        this.f1870s = c0452e.f1870s;
        this.f1871t = c0452e.f1871t;
        this.f1872u = c0452e.f1872u;
        this.f1873v = c0452e.f1873v;
        this.f1874w = c0452e.f1874w;
        this.f1854b = c0452e.f1854b;
        this.f1855c = c0452e.f1855c;
        this.f1856d = c0452e.f1856d;
        this.f1857e = c0452e.f1857e;
        this.f1858f = c0452e.f1858f;
        this.f1859g = c0452e.f1859g;
        this.f1862j = c0452e.f1862j;
        this.f1864l = c0452e.f1864l;
        this.f1865m = c0452e.f1865m;
        this.f1863k = c0452e.f1863k;
        this.f1860h = new float[c0452e.f1860h.length];
        System.arraycopy(c0452e.f1860h, 0, this.f1860h, 0, c0452e.f1860h.length);
        this.f1861i = c0452e.f1861i;
        this.f1875x.m1218a(c0430b);
    }

    public C0452e(C0438n c0438n) {
        this.f1866o = -1;
        this.f1867p = -1;
        this.f1868q = -1;
        this.f1869r = -1;
        this.f1870s = -1;
        this.f1871t = -1;
        this.f1872u = -1;
        this.f1873v = -1;
        this.f1874w = -1;
        this.f1860h = new float[180];
        this.f1875x = new C0430b(C0430b.f1620c);
        this.f1862j = -1.0f;
        this.f1863k = -1.0f;
        this.f1864l = -1.0f;
        this.f1865m = -1.0f;
        m1349a(new C0438n[]{null, null, null, null, c0438n, null, null, null, null});
    }

    public C0452e(C0438n c0438n, int i, int i2, int i3, int i4) {
        this.f1866o = -1;
        this.f1867p = -1;
        this.f1868q = -1;
        this.f1869r = -1;
        this.f1870s = -1;
        this.f1871t = -1;
        this.f1872u = -1;
        this.f1873v = -1;
        this.f1874w = -1;
        this.f1860h = new float[180];
        this.f1875x = new C0430b(C0430b.f1620c);
        this.f1862j = -1.0f;
        this.f1863k = -1.0f;
        this.f1864l = -1.0f;
        this.f1865m = -1.0f;
        if (c0438n == null) {
            throw new IllegalArgumentException("region cannot be null.");
        }
        int i5 = (c0438n.f1684E - i) - i2;
        int i6 = (c0438n.f1685F - i3) - i4;
        C0438n[] c0438nArr = new C0438n[9];
        if (i3 > 0) {
            if (i > 0) {
                c0438nArr[0] = new C0438n(c0438n, 0, 0, i, i3);
            }
            if (i5 > 0) {
                c0438nArr[1] = new C0438n(c0438n, i, 0, i5, i3);
            }
            if (i2 > 0) {
                c0438nArr[2] = new C0438n(c0438n, i + i5, 0, i2, i3);
            }
        }
        if (i6 > 0) {
            if (i > 0) {
                c0438nArr[3] = new C0438n(c0438n, 0, i3, i, i6);
            }
            if (i5 > 0) {
                c0438nArr[4] = new C0438n(c0438n, i, i3, i5, i6);
            }
            if (i2 > 0) {
                c0438nArr[5] = new C0438n(c0438n, i + i5, i3, i2, i6);
            }
        }
        if (i4 > 0) {
            if (i > 0) {
                c0438nArr[6] = new C0438n(c0438n, 0, i3 + i6, i, i4);
            }
            if (i5 > 0) {
                c0438nArr[7] = new C0438n(c0438n, i, i3 + i6, i5, i4);
            }
            if (i2 > 0) {
                c0438nArr[8] = new C0438n(c0438n, i + i5, i3 + i6, i2, i4);
            }
        }
        if (i == 0 && i5 == 0) {
            c0438nArr[1] = c0438nArr[2];
            c0438nArr[4] = c0438nArr[5];
            c0438nArr[7] = c0438nArr[8];
            c0438nArr[2] = null;
            c0438nArr[5] = null;
            c0438nArr[8] = null;
        }
        if (i3 == 0 && i6 == 0) {
            c0438nArr[3] = c0438nArr[6];
            c0438nArr[4] = c0438nArr[7];
            c0438nArr[5] = c0438nArr[8];
            c0438nArr[6] = null;
            c0438nArr[7] = null;
            c0438nArr[8] = null;
        }
        m1349a(c0438nArr);
    }

    /* renamed from: a */
    private int m1347a(C0438n c0438n, float f, boolean z, boolean z2) {
        if (this.f1853a == null) {
            this.f1853a = c0438n.f1686z;
        } else if (this.f1853a != c0438n.f1686z) {
            throw new IllegalArgumentException("All regions must be from the same texture.");
        }
        float f2 = c0438n.f1680A;
        float f3 = c0438n.f1683D;
        float f4 = c0438n.f1682C;
        float f5 = c0438n.f1681B;
        if (this.f1853a.m1133f() == TextureFilter.Linear || this.f1853a.m1132e() == TextureFilter.Linear) {
            float c;
            if (z) {
                c = 0.5f / ((float) this.f1853a.m1144c());
                f2 += c;
                f4 -= c;
            }
            if (z2) {
                c = 0.5f / ((float) this.f1853a.m1145k());
                f3 -= c;
                f5 += c;
            }
        }
        float[] fArr = this.f1860h;
        fArr[this.f1861i + 2] = f;
        fArr[this.f1861i + 3] = f2;
        fArr[this.f1861i + 4] = f3;
        fArr[this.f1861i + 7] = f;
        fArr[this.f1861i + 8] = f2;
        fArr[this.f1861i + 9] = f5;
        fArr[this.f1861i + 12] = f;
        fArr[this.f1861i + 13] = f4;
        fArr[this.f1861i + 14] = f5;
        fArr[this.f1861i + 17] = f;
        fArr[this.f1861i + 18] = f4;
        fArr[this.f1861i + 19] = f3;
        this.f1861i += 20;
        return this.f1861i - 20;
    }

    /* renamed from: a */
    private void m1348a(int i, float f, float f2, float f3, float f4, float f5) {
        float f6 = f + f3;
        float f7 = f2 + f4;
        float[] fArr = this.f1860h;
        fArr[i] = f;
        fArr[i + 1] = f2;
        fArr[i + 2] = f5;
        fArr[i + 5] = f;
        fArr[i + 6] = f7;
        fArr[i + 7] = f5;
        fArr[i + 10] = f6;
        fArr[i + 11] = f7;
        fArr[i + 12] = f5;
        fArr[i + 15] = f6;
        fArr[i + 16] = f2;
        fArr[i + 17] = f5;
    }

    /* renamed from: a */
    private void m1349a(C0438n[] c0438nArr) {
        float a = C0430b.f1620c.m1216a();
        if (c0438nArr[6] != null) {
            this.f1866o = m1347a(c0438nArr[6], a, false, false);
            this.f1854b = (float) c0438nArr[6].f1684E;
            this.f1859g = (float) c0438nArr[6].f1685F;
        }
        if (c0438nArr[7] != null) {
            this.f1867p = m1347a(c0438nArr[7], a, true, false);
            this.f1856d = Math.max(this.f1856d, (float) c0438nArr[7].f1684E);
            this.f1859g = Math.max(this.f1859g, (float) c0438nArr[7].f1685F);
        }
        if (c0438nArr[8] != null) {
            this.f1868q = m1347a(c0438nArr[8], a, false, false);
            this.f1855c = Math.max(this.f1855c, (float) c0438nArr[8].f1684E);
            this.f1859g = Math.max(this.f1859g, (float) c0438nArr[8].f1685F);
        }
        if (c0438nArr[3] != null) {
            this.f1869r = m1347a(c0438nArr[3], a, false, true);
            this.f1854b = Math.max(this.f1854b, (float) c0438nArr[3].f1684E);
            this.f1857e = Math.max(this.f1857e, (float) c0438nArr[3].f1685F);
        }
        if (c0438nArr[4] != null) {
            this.f1870s = m1347a(c0438nArr[4], a, true, true);
            this.f1856d = Math.max(this.f1856d, (float) c0438nArr[4].f1684E);
            this.f1857e = Math.max(this.f1857e, (float) c0438nArr[4].f1685F);
        }
        if (c0438nArr[5] != null) {
            this.f1871t = m1347a(c0438nArr[5], a, false, true);
            this.f1855c = Math.max(this.f1855c, (float) c0438nArr[5].f1684E);
            this.f1857e = Math.max(this.f1857e, (float) c0438nArr[5].f1685F);
        }
        if (c0438nArr[0] != null) {
            this.f1872u = m1347a(c0438nArr[0], a, false, false);
            this.f1854b = Math.max(this.f1854b, (float) c0438nArr[0].f1684E);
            this.f1858f = Math.max(this.f1858f, (float) c0438nArr[0].f1685F);
        }
        if (c0438nArr[1] != null) {
            this.f1873v = m1347a(c0438nArr[1], a, true, false);
            this.f1856d = Math.max(this.f1856d, (float) c0438nArr[1].f1684E);
            this.f1858f = Math.max(this.f1858f, (float) c0438nArr[1].f1685F);
        }
        if (c0438nArr[2] != null) {
            this.f1874w = m1347a(c0438nArr[2], a, false, false);
            this.f1855c = Math.max(this.f1855c, (float) c0438nArr[2].f1684E);
            this.f1858f = Math.max(this.f1858f, (float) c0438nArr[2].f1685F);
        }
        if (this.f1861i < this.f1860h.length) {
            Object obj = new float[this.f1861i];
            System.arraycopy(this.f1860h, 0, obj, 0, this.f1861i);
            this.f1860h = obj;
        }
    }

    /* renamed from: a */
    public final void m1350a(C0444a c0444a, float f, float f2, float f3, float f4) {
        float f5 = f + this.f1854b;
        float f6 = (f + f3) - this.f1855c;
        float f7 = f2 + this.f1859g;
        float f8 = (f2 + f4) - this.f1858f;
        float a = f1852n.m1218a(this.f1875x).m1221b(c0444a.mo375d()).m1216a();
        if (this.f1866o != -1) {
            m1348a(this.f1866o, f, f2, f5 - f, f7 - f2, a);
        }
        if (this.f1867p != -1) {
            m1348a(this.f1867p, f5, f2, f6 - f5, f7 - f2, a);
        }
        if (this.f1868q != -1) {
            m1348a(this.f1868q, f6, f2, (f + f3) - f6, f7 - f2, a);
        }
        if (this.f1869r != -1) {
            m1348a(this.f1869r, f, f7, f5 - f, f8 - f7, a);
        }
        if (this.f1870s != -1) {
            m1348a(this.f1870s, f5, f7, f6 - f5, f8 - f7, a);
        }
        if (this.f1871t != -1) {
            m1348a(this.f1871t, f6, f7, (f + f3) - f6, f8 - f7, a);
        }
        if (this.f1872u != -1) {
            float f9 = f;
            float f10 = f8;
            m1348a(this.f1872u, f9, f10, f5 - f, (f2 + f4) - f8, a);
        }
        if (this.f1873v != -1) {
            f9 = f5;
            f10 = f8;
            m1348a(this.f1873v, f9, f10, f6 - f5, (f2 + f4) - f8, a);
        }
        if (this.f1874w != -1) {
            m1348a(this.f1874w, f6, f8, (f + f3) - f6, (f2 + f4) - f8, a);
        }
    }
}
