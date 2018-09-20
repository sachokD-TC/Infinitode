package com.badlogic.gdx.utils;

/* renamed from: com.badlogic.gdx.utils.y */
public final class C0727y {
    /* renamed from: a */
    public short[] f3237a;
    /* renamed from: b */
    public int f3238b;
    /* renamed from: c */
    public boolean f3239c;

    public C0727y() {
        this((byte) 0);
    }

    private C0727y(byte b) {
        this.f3239c = true;
        this.f3237a = new short[16];
    }

    /* renamed from: b */
    private short[] m2527b(int i) {
        Object obj = new short[i];
        System.arraycopy(this.f3237a, 0, obj, 0, Math.min(this.f3238b, obj.length));
        this.f3237a = obj;
        return obj;
    }

    /* renamed from: a */
    public final void m2528a(short s) {
        short[] sArr = this.f3237a;
        if (this.f3238b == sArr.length) {
            sArr = m2527b(Math.max(8, (int) (((float) this.f3238b) * 1.75f)));
        }
        int i = this.f3238b;
        this.f3238b = i + 1;
        sArr[i] = s;
    }

    /* renamed from: a */
    public final short[] m2529a(int i) {
        int i2 = this.f3238b + i;
        if (i2 > this.f3237a.length) {
            m2527b(Math.max(8, i2));
        }
        return this.f3237a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!this.f3239c) {
            return false;
        }
        if (!(obj instanceof C0727y)) {
            return false;
        }
        C0727y c0727y = (C0727y) obj;
        if (!c0727y.f3239c) {
            return false;
        }
        int i = this.f3238b;
        if (i != c0727y.f3238b) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f3237a[i2] != c0727y.f3237a[i2]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f3239c) {
            return super.hashCode();
        }
        short[] sArr = this.f3237a;
        int i = 1;
        int i2 = 0;
        while (i2 < this.f3238b) {
            int i3 = sArr[i2] + (i * 31);
            i2++;
            i = i3;
        }
        return i;
    }

    public final String toString() {
        if (this.f3238b == 0) {
            return "[]";
        }
        short[] sArr = this.f3237a;
        ac acVar = new ac(32);
        acVar.m2322a('[');
        acVar.m2328c(sArr[0]);
        for (int i = 1; i < this.f3238b; i++) {
            acVar.m2324a(", ");
            acVar.m2328c(sArr[i]);
        }
        acVar.m2322a(']');
        return acVar.toString();
    }
}
