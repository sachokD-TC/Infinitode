package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.graphics.Texture;

/* renamed from: com.badlogic.gdx.graphics.g2d.n */
public class C0438n {
    /* renamed from: A */
    public float f1680A;
    /* renamed from: B */
    public float f1681B;
    /* renamed from: C */
    public float f1682C;
    /* renamed from: D */
    public float f1683D;
    /* renamed from: E */
    public int f1684E;
    /* renamed from: F */
    public int f1685F;
    /* renamed from: z */
    public Texture f1686z;

    public C0438n(Texture texture) {
        if (texture == null) {
            throw new IllegalArgumentException("texture cannot be null.");
        }
        this.f1686z = texture;
        m1243a(0, 0, texture.m1144c(), texture.m1145k());
    }

    public C0438n(Texture texture, int i, int i2, int i3, int i4) {
        this.f1686z = texture;
        m1243a(i, i2, i3, i4);
    }

    public C0438n(C0438n c0438n, int i, int i2, int i3, int i4) {
        this.f1686z = c0438n.f1686z;
        m1243a(Math.round(c0438n.f1680A * ((float) c0438n.f1686z.m1144c())) + i, Math.round(c0438n.f1681B * ((float) c0438n.f1686z.m1145k())) + i2, i3, i4);
    }

    /* renamed from: a */
    public final void m1243a(int i, int i2, int i3, int i4) {
        float c = 1.0f / ((float) this.f1686z.m1144c());
        float k = 1.0f / ((float) this.f1686z.m1145k());
        mo355c(((float) i) * c, ((float) i2) * k, c * ((float) (i + i3)), k * ((float) (i2 + i4)));
        this.f1684E = Math.abs(i3);
        this.f1685F = Math.abs(i4);
    }

    /* renamed from: a */
    public final void m1244a(C0438n c0438n) {
        this.f1686z = c0438n.f1686z;
        mo355c(c0438n.f1680A, c0438n.f1681B, c0438n.f1682C, c0438n.f1683D);
    }

    /* renamed from: a */
    public void mo353a(boolean z, boolean z2) {
        if (z) {
            float f = this.f1680A;
            this.f1680A = this.f1682C;
            this.f1682C = f;
        }
        if (z2) {
            f = this.f1681B;
            this.f1681B = this.f1683D;
            this.f1683D = f;
        }
    }

    /* renamed from: c */
    public void mo354c(float f) {
        this.f1680A = f;
        this.f1684E = Math.round(Math.abs(this.f1682C - f) * ((float) this.f1686z.m1144c()));
    }

    /* renamed from: c */
    public void mo355c(float f, float f2, float f3, float f4) {
        int c = this.f1686z.m1144c();
        int k = this.f1686z.m1145k();
        this.f1684E = Math.round(Math.abs(f3 - f) * ((float) c));
        this.f1685F = Math.round(Math.abs(f4 - f2) * ((float) k));
        if (this.f1684E == 1 && this.f1685F == 1) {
            float f5 = 0.25f / ((float) c);
            f += f5;
            f3 -= f5;
            f5 = 0.25f / ((float) k);
            f2 += f5;
            f4 -= f5;
        }
        this.f1680A = f;
        this.f1681B = f2;
        this.f1682C = f3;
        this.f1683D = f4;
    }

    /* renamed from: d */
    public void mo356d(float f) {
        this.f1681B = f;
        this.f1685F = Math.round(Math.abs(this.f1683D - f) * ((float) this.f1686z.m1145k()));
    }

    /* renamed from: e */
    public void mo357e(float f) {
        this.f1682C = f;
        this.f1684E = Math.round(Math.abs(f - this.f1680A) * ((float) this.f1686z.m1144c()));
    }

    /* renamed from: f */
    public void mo358f(float f) {
        this.f1683D = f;
        this.f1685F = Math.round(Math.abs(f - this.f1681B) * ((float) this.f1686z.m1145k()));
    }
}
