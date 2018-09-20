package com.badlogic.gdx.utils;

/* renamed from: com.badlogic.gdx.utils.k */
public final class C0692k {
    /* renamed from: a */
    public int[] f3090a;
    /* renamed from: b */
    public int f3091b;
    /* renamed from: c */
    public boolean f3092c;

    public C0692k() {
        this(16, (byte) 0);
    }

    public C0692k(int i) {
        this(i, (byte) 0);
    }

    private C0692k(int i, byte b) {
        this.f3092c = true;
        this.f3090a = new int[i];
    }

    /* renamed from: a */
    public final int m2417a() {
        int[] iArr = this.f3090a;
        int i = this.f3091b - 1;
        this.f3091b = i;
        return iArr[i];
    }

    /* renamed from: a */
    public final void m2418a(int i) {
        int[] iArr = this.f3090a;
        if (this.f3091b == iArr.length) {
            iArr = m2422d(Math.max(8, (int) (((float) this.f3091b) * 1.75f)));
        }
        int i2 = this.f3091b;
        this.f3091b = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: a */
    public final void m2419a(int i, int i2) {
        if (i > this.f3091b) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i + " > " + this.f3091b);
        }
        Object obj = this.f3090a;
        if (this.f3091b == obj.length) {
            obj = m2422d(Math.max(8, (int) (((float) this.f3091b) * 1.75f)));
        }
        if (this.f3092c) {
            System.arraycopy(obj, i, obj, i + 1, this.f3091b - i);
        } else {
            obj[this.f3091b] = obj[i];
        }
        this.f3091b++;
        obj[i] = i2;
    }

    /* renamed from: b */
    public final int m2420b(int i) {
        if (i < this.f3091b) {
            return this.f3090a[i];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f3091b);
    }

    /* renamed from: c */
    public final int[] m2421c(int i) {
        int i2 = this.f3091b + i;
        if (i2 > this.f3090a.length) {
            m2422d(Math.max(8, i2));
        }
        return this.f3090a;
    }

    /* renamed from: d */
    public final int[] m2422d(int i) {
        Object obj = new int[i];
        System.arraycopy(this.f3090a, 0, obj, 0, Math.min(this.f3091b, obj.length));
        this.f3090a = obj;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!this.f3092c) {
            return false;
        }
        if (!(obj instanceof C0692k)) {
            return false;
        }
        C0692k c0692k = (C0692k) obj;
        if (!c0692k.f3092c) {
            return false;
        }
        int i = this.f3091b;
        if (i != c0692k.f3091b) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f3090a[i2] != c0692k.f3090a[i2]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f3092c) {
            return super.hashCode();
        }
        int[] iArr = this.f3090a;
        int i = 1;
        int i2 = 0;
        while (i2 < this.f3091b) {
            int i3 = iArr[i2] + (i * 31);
            i2++;
            i = i3;
        }
        return i;
    }

    public final String toString() {
        if (this.f3091b == 0) {
            return "[]";
        }
        int[] iArr = this.f3090a;
        ac acVar = new ac(32);
        acVar.m2322a('[');
        acVar.m2328c(iArr[0]);
        for (int i = 1; i < this.f3091b; i++) {
            acVar.m2324a(", ");
            acVar.m2328c(iArr[i]);
        }
        acVar.m2322a(']');
        return acVar.toString();
    }
}
