package com.badlogic.gdx.math;

import java.io.Serializable;

public class Quaternion implements Serializable {
    /* renamed from: a */
    private static Quaternion f2324a = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f);
    /* renamed from: b */
    private static Quaternion f2325b = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f);
    private static final long serialVersionUID = -7661875440774897168L;
    /* renamed from: w */
    public float f2326w;
    /* renamed from: x */
    public float f2327x;
    /* renamed from: y */
    public float f2328y;
    /* renamed from: z */
    public float f2329z;

    public Quaternion() {
        m1695a(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public Quaternion(float f, float f2, float f3, float f4) {
        m1695a(f, f2, f3, f4);
    }

    public Quaternion(Quaternion quaternion) {
        m1696a(quaternion);
    }

    /* renamed from: a */
    public final Quaternion m1695a(float f, float f2, float f3, float f4) {
        this.f2327x = f;
        this.f2328y = f2;
        this.f2329z = f3;
        this.f2326w = f4;
        return this;
    }

    /* renamed from: a */
    public final Quaternion m1696a(Quaternion quaternion) {
        return m1695a(quaternion.f2327x, quaternion.f2328y, quaternion.f2329z, quaternion.f2326w);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Quaternion)) {
            return false;
        }
        Quaternion quaternion = (Quaternion) obj;
        return Float.floatToRawIntBits(this.f2326w) == Float.floatToRawIntBits(quaternion.f2326w) && Float.floatToRawIntBits(this.f2327x) == Float.floatToRawIntBits(quaternion.f2327x) && Float.floatToRawIntBits(this.f2328y) == Float.floatToRawIntBits(quaternion.f2328y) && Float.floatToRawIntBits(this.f2329z) == Float.floatToRawIntBits(quaternion.f2329z);
    }

    public int hashCode() {
        return ((((((Float.floatToRawIntBits(this.f2326w) + 31) * 31) + Float.floatToRawIntBits(this.f2327x)) * 31) + Float.floatToRawIntBits(this.f2328y)) * 31) + Float.floatToRawIntBits(this.f2329z);
    }

    public String toString() {
        return "[" + this.f2327x + "|" + this.f2328y + "|" + this.f2329z + "|" + this.f2326w + "]";
    }
}
