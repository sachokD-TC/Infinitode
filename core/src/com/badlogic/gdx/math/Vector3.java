package com.badlogic.gdx.math;

import java.io.Serializable;

public class Vector3 implements Serializable {
    /* renamed from: a */
    public static final Vector3 f2339a = new Vector3(1.0f, 0.0f, 0.0f);
    /* renamed from: b */
    public static final Vector3 f2340b = new Vector3(0.0f, 1.0f, 0.0f);
    /* renamed from: c */
    public static final Vector3 f2341c = new Vector3(0.0f, 0.0f, 1.0f);
    /* renamed from: d */
    public static final Vector3 f2342d = new Vector3(0.0f, 0.0f, 0.0f);
    /* renamed from: e */
    private static final Matrix4 f2343e = new Matrix4();
    private static final long serialVersionUID = 3840054589595372522L;
    /* renamed from: x */
    public float f2344x;
    /* renamed from: y */
    public float f2345y;
    /* renamed from: z */
    public float f2346z;

    public Vector3(float f, float f2, float f3) {
        m1709a(f, f2, f3);
    }

    public Vector3(Vector3 vector3) {
        m1711a(vector3);
    }

    /* renamed from: a */
    public final float m1707a() {
        return (float) Math.sqrt((double) (((this.f2344x * this.f2344x) + (this.f2345y * this.f2345y)) + (this.f2346z * this.f2346z)));
    }

    /* renamed from: a */
    public final Vector3 m1708a(float f) {
        return m1709a(this.f2344x * f, this.f2345y * f, this.f2346z * f);
    }

    /* renamed from: a */
    public final Vector3 m1709a(float f, float f2, float f3) {
        this.f2344x = f;
        this.f2345y = f2;
        this.f2346z = f3;
        return this;
    }

    /* renamed from: a */
    public final Vector3 m1710a(Matrix4 matrix4) {
        float[] fArr = matrix4.val;
        return m1709a((((this.f2344x * fArr[0]) + (this.f2345y * fArr[4])) + (this.f2346z * fArr[8])) + fArr[12], (((this.f2344x * fArr[1]) + (this.f2345y * fArr[5])) + (this.f2346z * fArr[9])) + fArr[13], fArr[14] + (((this.f2344x * fArr[2]) + (this.f2345y * fArr[6])) + (this.f2346z * fArr[10])));
    }

    /* renamed from: a */
    public final Vector3 m1711a(Vector3 vector3) {
        return m1709a(vector3.f2344x, vector3.f2345y, vector3.f2346z);
    }

    /* renamed from: b */
    public final Vector3 m1712b() {
        float f = ((this.f2344x * this.f2344x) + (this.f2345y * this.f2345y)) + (this.f2346z * this.f2346z);
        return (f == 0.0f || f == 1.0f) ? this : m1708a(1.0f / ((float) Math.sqrt((double) f)));
    }

    /* renamed from: b */
    public final Vector3 m1713b(Matrix4 matrix4) {
        float[] fArr = matrix4.val;
        float f = 1.0f / ((((this.f2344x * fArr[3]) + (this.f2345y * fArr[7])) + (this.f2346z * fArr[11])) + fArr[15]);
        return m1709a(((((this.f2344x * fArr[0]) + (this.f2345y * fArr[4])) + (this.f2346z * fArr[8])) + fArr[12]) * f, ((((this.f2344x * fArr[1]) + (this.f2345y * fArr[5])) + (this.f2346z * fArr[9])) + fArr[13]) * f, (fArr[14] + (((this.f2344x * fArr[2]) + (this.f2345y * fArr[6])) + (this.f2346z * fArr[10]))) * f);
    }

    /* renamed from: b */
    public final Vector3 m1714b(Vector3 vector3) {
        return m1709a(vector3.f2344x + this.f2344x, vector3.f2345y + this.f2345y, vector3.f2346z + this.f2346z);
    }

    /* renamed from: c */
    public final Vector3 m1715c(Vector3 vector3) {
        return m1709a(this.f2344x - vector3.f2344x, this.f2345y - vector3.f2345y, this.f2346z - vector3.f2346z);
    }

    /* renamed from: d */
    public final float m1716d(Vector3 vector3) {
        return ((this.f2344x * vector3.f2344x) + (this.f2345y * vector3.f2345y)) + (this.f2346z * vector3.f2346z);
    }

    /* renamed from: e */
    public final Vector3 m1717e(Vector3 vector3) {
        return m1709a((this.f2345y * vector3.f2346z) - (this.f2346z * vector3.f2345y), (this.f2346z * vector3.f2344x) - (this.f2344x * vector3.f2346z), (this.f2344x * vector3.f2345y) - (this.f2345y * vector3.f2344x));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Vector3 vector3 = (Vector3) obj;
        return Float.floatToIntBits(this.f2344x) != Float.floatToIntBits(vector3.f2344x) ? false : Float.floatToIntBits(this.f2345y) != Float.floatToIntBits(vector3.f2345y) ? false : Float.floatToIntBits(this.f2346z) == Float.floatToIntBits(vector3.f2346z);
    }

    public int hashCode() {
        return ((((Float.floatToIntBits(this.f2344x) + 31) * 31) + Float.floatToIntBits(this.f2345y)) * 31) + Float.floatToIntBits(this.f2346z);
    }

    public String toString() {
        return "(" + this.f2344x + "," + this.f2345y + "," + this.f2346z + ")";
    }
}
