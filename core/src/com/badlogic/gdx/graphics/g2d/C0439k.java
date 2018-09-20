package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.C0549f;

/* renamed from: com.badlogic.gdx.graphics.g2d.k */
public class C0439k extends C0438n {
    /* renamed from: a */
    private final C0430b f1687a;
    /* renamed from: b */
    private float f1688b;
    /* renamed from: c */
    private float f1689c;
    /* renamed from: d */
    private float f1690d;
    /* renamed from: e */
    private float f1691e;
    /* renamed from: f */
    private float f1692f;
    /* renamed from: g */
    private float f1693g;
    /* renamed from: h */
    private float f1694h;
    /* renamed from: i */
    private boolean f1695i;
    /* renamed from: w */
    final float[] f1696w;
    /* renamed from: x */
    float f1697x;
    /* renamed from: y */
    float f1698y;

    public C0439k() {
        this.f1696w = new float[20];
        this.f1687a = new C0430b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f1693g = 1.0f;
        this.f1694h = 1.0f;
        this.f1695i = true;
        m1263b(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public C0439k(Texture texture) {
        this(texture, texture.m1144c(), texture.m1145k());
    }

    private C0439k(Texture texture, int i, int i2) {
        this.f1696w = new float[20];
        this.f1687a = new C0430b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f1693g = 1.0f;
        this.f1694h = 1.0f;
        this.f1695i = true;
        if (texture == null) {
            throw new IllegalArgumentException("texture cannot be null.");
        }
        this.z = texture;
        m1243a(0, 0, i, i2);
        m1263b(1.0f, 1.0f, 1.0f, 1.0f);
        mo381a((float) Math.abs(i), (float) Math.abs(i2));
        mo386c(this.f1697x / 2.0f, this.f1698y / 2.0f);
    }

    public C0439k(C0439k c0439k) {
        this.f1696w = new float[20];
        this.f1687a = new C0430b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f1693g = 1.0f;
        this.f1694h = 1.0f;
        this.f1695i = true;
        m1257a(c0439k);
    }

    public C0439k(C0438n c0438n) {
        this.f1696w = new float[20];
        this.f1687a = new C0430b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f1693g = 1.0f;
        this.f1694h = 1.0f;
        this.f1695i = true;
        m1244a(c0438n);
        m1263b(1.0f, 1.0f, 1.0f, 1.0f);
        mo381a((float) c0438n.f1684E, (float) c0438n.f1685F);
        mo386c(this.f1697x / 2.0f, this.f1698y / 2.0f);
    }

    /* renamed from: a */
    public float mo380a() {
        return this.f1688b;
    }

    /* renamed from: a */
    public final void m1252a(float f) {
        this.f1692f = f;
        this.f1695i = true;
    }

    /* renamed from: a */
    public void mo381a(float f, float f2) {
        this.f1697x = f;
        this.f1698y = f2;
        if (!this.f1695i) {
            float f3 = this.f1688b + f;
            float f4 = this.f1689c + f2;
            float[] fArr = this.f1696w;
            fArr[0] = this.f1688b;
            fArr[1] = this.f1689c;
            fArr[5] = this.f1688b;
            fArr[6] = f4;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[15] = f3;
            fArr[16] = this.f1689c;
            if (this.f1692f != 0.0f || this.f1693g != 1.0f || this.f1694h != 1.0f) {
                this.f1695i = true;
            }
        }
    }

    /* renamed from: a */
    public void mo382a(float f, float f2, float f3, float f4) {
        this.f1688b = f;
        this.f1689c = f2;
        this.f1697x = f3;
        this.f1698y = f4;
        if (!this.f1695i) {
            float f5 = f + f3;
            float f6 = f2 + f4;
            float[] fArr = this.f1696w;
            fArr[0] = f;
            fArr[1] = f2;
            fArr[5] = f;
            fArr[6] = f6;
            fArr[10] = f5;
            fArr[11] = f6;
            fArr[15] = f5;
            fArr[16] = f2;
            if (this.f1692f != 0.0f || this.f1693g != 1.0f || this.f1694h != 1.0f) {
                this.f1695i = true;
            }
        }
    }

    /* renamed from: a */
    public final void m1255a(C0430b c0430b) {
        float a = c0430b.m1216a();
        float[] fArr = this.f1696w;
        fArr[2] = a;
        fArr[7] = a;
        fArr[12] = a;
        fArr[17] = a;
    }

    /* renamed from: a */
    public final void m1256a(C0444a c0444a) {
        Texture texture = this.z;
        if (this.f1695i) {
            this.f1695i = false;
            float[] fArr = this.f1696w;
            float f = -this.f1690d;
            float f2 = -this.f1691e;
            float f3 = f + this.f1697x;
            float f4 = this.f1698y + f2;
            float f5 = this.f1688b - f;
            float f6 = this.f1689c - f2;
            if (!(this.f1693g == 1.0f && this.f1694h == 1.0f)) {
                f *= this.f1693g;
                f2 *= this.f1694h;
                f3 *= this.f1693g;
                f4 *= this.f1694h;
            }
            if (this.f1692f != 0.0f) {
                float d = C0549f.m1771d(this.f1692f);
                float c = C0549f.m1769c(this.f1692f);
                float f7 = f * d;
                f *= c;
                float f8 = f2 * d;
                float f9 = f3 * d;
                f3 *= c;
                d *= f4;
                f4 *= c;
                f2 = (f7 - (f2 * c)) + f5;
                c = (f8 + f) + f6;
                fArr[0] = f2;
                fArr[1] = c;
                f7 = (f7 - f4) + f5;
                f = (f + d) + f6;
                fArr[5] = f7;
                fArr[6] = f;
                f4 = (f9 - f4) + f5;
                f3 = (f3 + d) + f6;
                fArr[10] = f4;
                fArr[11] = f3;
                fArr[15] = (f4 - f7) + f2;
                fArr[16] = f3 - (f - c);
            } else {
                f += f5;
                f2 += f6;
                f3 += f5;
                f4 += f6;
                fArr[0] = f;
                fArr[1] = f2;
                fArr[5] = f;
                fArr[6] = f4;
                fArr[10] = f3;
                fArr[11] = f4;
                fArr[15] = f3;
                fArr[16] = f2;
            }
        }
        c0444a.mo369a(texture, this.f1696w, 0, 20);
    }

    /* renamed from: a */
    public final void m1257a(C0439k c0439k) {
        if (c0439k == null) {
            throw new IllegalArgumentException("sprite cannot be null.");
        }
        System.arraycopy(c0439k.f1696w, 0, this.f1696w, 0, 20);
        this.z = c0439k.z;
        this.A = c0439k.A;
        this.B = c0439k.B;
        this.C = c0439k.C;
        this.D = c0439k.D;
        this.f1688b = c0439k.f1688b;
        this.f1689c = c0439k.f1689c;
        this.f1697x = c0439k.f1697x;
        this.f1698y = c0439k.f1698y;
        this.E = c0439k.E;
        this.F = c0439k.F;
        this.f1690d = c0439k.f1690d;
        this.f1691e = c0439k.f1691e;
        this.f1692f = c0439k.f1692f;
        this.f1693g = c0439k.f1693g;
        this.f1694h = c0439k.f1694h;
        this.f1687a.m1218a(c0439k.f1687a);
        this.f1695i = c0439k.f1695i;
    }

    /* renamed from: a */
    public void mo383a(boolean z) {
        float[] fArr = this.f1696w;
        if (z) {
            float f = fArr[4];
            fArr[4] = fArr[19];
            fArr[19] = fArr[14];
            fArr[14] = fArr[9];
            fArr[9] = f;
            f = fArr[3];
            fArr[3] = fArr[18];
            fArr[18] = fArr[13];
            fArr[13] = fArr[8];
            fArr[8] = f;
            return;
        }
        f = fArr[4];
        fArr[4] = fArr[9];
        fArr[9] = fArr[14];
        fArr[14] = fArr[19];
        fArr[19] = f;
        f = fArr[3];
        fArr[3] = fArr[8];
        fArr[8] = fArr[13];
        fArr[13] = fArr[18];
        fArr[18] = f;
    }

    /* renamed from: a */
    public void mo353a(boolean z, boolean z2) {
        super.mo353a(z, z2);
        float[] fArr = this.f1696w;
        if (z) {
            float f = fArr[3];
            fArr[3] = fArr[13];
            fArr[13] = f;
            f = fArr[8];
            fArr[8] = fArr[18];
            fArr[18] = f;
        }
        if (z2) {
            f = fArr[4];
            fArr[4] = fArr[14];
            fArr[14] = f;
            f = fArr[9];
            fArr[9] = fArr[19];
            fArr[19] = f;
        }
    }

    /* renamed from: b */
    public float mo384b() {
        return this.f1689c;
    }

    /* renamed from: b */
    public final void m1261b(float f) {
        this.f1693g = f;
        this.f1694h = f;
        this.f1695i = true;
    }

    /* renamed from: b */
    public final void m1262b(float f, float f2) {
        this.f1688b += f;
        this.f1689c += f2;
        if (!this.f1695i) {
            float[] fArr = this.f1696w;
            fArr[0] = fArr[0] + f;
            fArr[1] = fArr[1] + f2;
            fArr[5] = fArr[5] + f;
            fArr[6] = fArr[6] + f2;
            fArr[10] = fArr[10] + f;
            fArr[11] = fArr[11] + f2;
            fArr[15] = fArr[15] + f;
            fArr[16] = fArr[16] + f2;
        }
    }

    /* renamed from: b */
    public final void m1263b(float f, float f2, float f3, float f4) {
        float intBitsToFloat = Float.intBitsToFloat(((((((int) (255.0f * f4)) << 24) | (((int) (255.0f * f3)) << 16)) | (((int) (255.0f * f2)) << 8)) | ((int) (255.0f * f))) & -16777217);
        float[] fArr = this.f1696w;
        fArr[2] = intBitsToFloat;
        fArr[7] = intBitsToFloat;
        fArr[12] = intBitsToFloat;
        fArr[17] = intBitsToFloat;
    }

    /* renamed from: c */
    public float mo385c() {
        return this.f1697x;
    }

    /* renamed from: c */
    public final void mo354c(float f) {
        super.mo354c(f);
        this.f1696w[3] = f;
        this.f1696w[8] = f;
    }

    /* renamed from: c */
    public void mo386c(float f, float f2) {
        this.f1690d = f;
        this.f1691e = f2;
        this.f1695i = true;
    }

    /* renamed from: c */
    public final void mo355c(float f, float f2, float f3, float f4) {
        super.mo355c(f, f2, f3, f4);
        float[] fArr = this.f1696w;
        fArr[3] = f;
        fArr[4] = f4;
        fArr[8] = f;
        fArr[9] = f2;
        fArr[13] = f3;
        fArr[14] = f2;
        fArr[18] = f3;
        fArr[19] = f4;
    }

    /* renamed from: d */
    public float mo387d() {
        return this.f1698y;
    }

    /* renamed from: d */
    public final void mo356d(float f) {
        super.mo356d(f);
        this.f1696w[9] = f;
        this.f1696w[14] = f;
    }

    /* renamed from: d */
    public final void m1270d(float f, float f2) {
        this.f1693g = f;
        this.f1694h = f2;
        this.f1695i = true;
    }

    /* renamed from: e */
    public float mo388e() {
        return this.f1690d;
    }

    /* renamed from: e */
    public final void mo357e(float f) {
        super.mo357e(f);
        this.f1696w[13] = f;
        this.f1696w[18] = f;
    }

    /* renamed from: f */
    public float mo389f() {
        return this.f1691e;
    }

    /* renamed from: f */
    public final void mo358f(float f) {
        super.mo358f(f);
        this.f1696w[4] = f;
        this.f1696w[19] = f;
    }

    /* renamed from: g */
    public final C0430b m1275g() {
        int floatToRawIntBits = Float.floatToRawIntBits(this.f1696w[2]);
        C0430b c0430b = this.f1687a;
        c0430b.f1644I = ((float) (floatToRawIntBits & 255)) / 255.0f;
        c0430b.f1645J = ((float) ((floatToRawIntBits >>> 8) & 255)) / 255.0f;
        c0430b.f1646K = ((float) ((floatToRawIntBits >>> 16) & 255)) / 255.0f;
        c0430b.f1647L = ((float) ((floatToRawIntBits >>> 24) & 255)) / 255.0f;
        return c0430b;
    }
}
