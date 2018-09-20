package com.badlogic.gdx.utils;

/* renamed from: com.badlogic.gdx.utils.h */
public final class C0689h {
    /* renamed from: a */
    public float[] f3078a;
    /* renamed from: b */
    public int f3079b;
    /* renamed from: c */
    public boolean f3080c;

    public C0689h() {
        this(16, (byte) 0);
    }

    public C0689h(int i) {
        this(i, (byte) 0);
    }

    private C0689h(int i, byte b) {
        this.f3080c = true;
        this.f3078a = new float[i];
    }

    /* renamed from: a */
    public final float m2404a(int i) {
        if (i < this.f3079b) {
            return this.f3078a[i];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f3079b);
    }

    /* renamed from: a */
    public final void m2405a(float f) {
        float[] fArr = this.f3078a;
        if (this.f3079b == fArr.length) {
            fArr = m2408b(Math.max(8, (int) (((float) this.f3079b) * 1.75f)));
        }
        int i = this.f3079b;
        this.f3079b = i + 1;
        fArr[i] = f;
    }

    /* renamed from: a */
    public final void m2406a(int i, float f) {
        if (i >= this.f3079b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f3079b);
        }
        this.f3078a[i] = f;
    }

    /* renamed from: a */
    public final void m2407a(C0689h c0689h, int i, int i2) {
        if (i + i2 > c0689h.f3079b) {
            throw new IllegalArgumentException("offset + length must be <= size: " + i + " + " + i2 + " <= " + c0689h.f3079b);
        }
        Object obj = c0689h.f3078a;
        Object obj2 = this.f3078a;
        int i3 = this.f3079b + i2;
        if (i3 > obj2.length) {
            obj2 = m2408b(Math.max(8, (int) (((float) i3) * 1.75f)));
        }
        System.arraycopy(obj, i, obj2, this.f3079b, i2);
        this.f3079b += i2;
    }

    /* renamed from: b */
    public final float[] m2408b(int i) {
        Object obj = new float[i];
        System.arraycopy(this.f3078a, 0, obj, 0, Math.min(this.f3079b, obj.length));
        this.f3078a = obj;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!this.f3080c) {
            return false;
        }
        if (!(obj instanceof C0689h)) {
            return false;
        }
        C0689h c0689h = (C0689h) obj;
        if (!c0689h.f3080c) {
            return false;
        }
        int i = this.f3079b;
        if (i != c0689h.f3079b) {
            return false;
        }
        float[] fArr = this.f3078a;
        float[] fArr2 = c0689h.f3078a;
        for (int i2 = 0; i2 < i; i2++) {
            if (fArr[i2] != fArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f3080c) {
            return super.hashCode();
        }
        float[] fArr = this.f3078a;
        int i = 1;
        int i2 = 0;
        while (i2 < this.f3079b) {
            int floatToIntBits = Float.floatToIntBits(fArr[i2]) + (i * 31);
            i2++;
            i = floatToIntBits;
        }
        return i;
    }

    public final String toString() {
        if (this.f3079b == 0) {
            return "[]";
        }
        float[] fArr = this.f3078a;
        ac acVar = new ac(32);
        acVar.m2322a('[');
        acVar.m2317a(fArr[0]);
        for (int i = 1; i < this.f3079b; i++) {
            acVar.m2324a(", ");
            acVar.m2317a(fArr[i]);
        }
        acVar.m2322a(']');
        return acVar.toString();
    }
}
