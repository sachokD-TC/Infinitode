package com.badlogic.gdx.math;

/* renamed from: com.badlogic.gdx.math.g */
public final class C0550g {
    /* renamed from: a */
    public float[] f2448a = new float[5];
    /* renamed from: b */
    public int f2449b = 0;
    /* renamed from: c */
    public int f2450c;
    /* renamed from: d */
    float f2451d = 0.0f;
    /* renamed from: e */
    public boolean f2452e = true;

    /* renamed from: a */
    public final void m1773a() {
        int i = 0;
        this.f2449b = 0;
        this.f2450c = 0;
        while (i < this.f2448a.length) {
            this.f2448a[i] = 0.0f;
            i++;
        }
        this.f2452e = true;
    }

    /* renamed from: b */
    public final float m1774b() {
        if (!(this.f2449b >= this.f2448a.length)) {
            return 0.0f;
        }
        if (this.f2452e) {
            float f = 0.0f;
            for (float f2 : this.f2448a) {
                f += f2;
            }
            this.f2451d = f / ((float) this.f2448a.length);
            this.f2452e = false;
        }
        return this.f2451d;
    }
}
