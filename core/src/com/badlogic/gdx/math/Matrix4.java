package com.badlogic.gdx.math;

import java.io.Serializable;

public class Matrix4 implements Serializable {
    /* renamed from: a */
    public static final float[] f2312a = new float[16];
    /* renamed from: b */
    static Quaternion f2313b = new Quaternion();
    /* renamed from: c */
    static Quaternion f2314c = new Quaternion();
    /* renamed from: d */
    public static final Vector3 f2315d = new Vector3();
    /* renamed from: e */
    public static final Vector3 f2316e = new Vector3();
    /* renamed from: f */
    public static final Vector3 f2317f = new Vector3();
    /* renamed from: g */
    public static final Vector3 f2318g = new Vector3();
    /* renamed from: h */
    public static final Matrix4 f2319h = new Matrix4();
    /* renamed from: i */
    static final Vector3 f2320i = new Vector3();
    /* renamed from: j */
    static final Vector3 f2321j = new Vector3();
    /* renamed from: k */
    static final Vector3 f2322k = new Vector3();
    private static final long serialVersionUID = -2717655254359579617L;
    public final float[] val;

    public Matrix4() {
        this.val = new float[16];
        this.val[0] = 1.0f;
        this.val[5] = 1.0f;
        this.val[10] = 1.0f;
        this.val[15] = 1.0f;
    }

    public Matrix4(Matrix4 matrix4) {
        this.val = new float[16];
        m1691a(matrix4);
    }

    public static native boolean inv(float[] fArr);

    public static native void mul(float[] fArr, float[] fArr2);

    public static native void prj(float[] fArr, float[] fArr2, int i, int i2, int i3);

    /* renamed from: a */
    public final Matrix4 m1687a() {
        return new Matrix4(this);
    }

    /* renamed from: a */
    public final Matrix4 m1688a(float f, float f2) {
        m1690a(0.0f, 0.0f + f, 0.0f, 0.0f + f2, 0.0f, 1.0f);
        return this;
    }

    /* renamed from: a */
    public final Matrix4 m1689a(float f, float f2, float f3) {
        f2312a[0] = f;
        f2312a[4] = 0.0f;
        f2312a[8] = 0.0f;
        f2312a[12] = 0.0f;
        f2312a[1] = 0.0f;
        f2312a[5] = f2;
        f2312a[9] = 0.0f;
        f2312a[13] = 0.0f;
        f2312a[2] = 0.0f;
        f2312a[6] = 0.0f;
        f2312a[10] = f3;
        f2312a[14] = 0.0f;
        f2312a[3] = 0.0f;
        f2312a[7] = 0.0f;
        f2312a[11] = 0.0f;
        f2312a[15] = 1.0f;
        mul(this.val, f2312a);
        return this;
    }

    /* renamed from: a */
    public final Matrix4 m1690a(float f, float f2, float f3, float f4, float f5, float f6) {
        m1692b();
        float f7 = 2.0f / (f4 - f3);
        float f8 = -2.0f / (f6 - f5);
        float f9 = (-(f2 + f)) / (f2 - f);
        float f10 = (-(f4 + f3)) / (f4 - f3);
        float f11 = (-(f6 + f5)) / (f6 - f5);
        this.val[0] = 2.0f / (f2 - f);
        this.val[1] = 0.0f;
        this.val[2] = 0.0f;
        this.val[3] = 0.0f;
        this.val[4] = 0.0f;
        this.val[5] = f7;
        this.val[6] = 0.0f;
        this.val[7] = 0.0f;
        this.val[8] = 0.0f;
        this.val[9] = 0.0f;
        this.val[10] = f8;
        this.val[11] = 0.0f;
        this.val[12] = f9;
        this.val[13] = f10;
        this.val[14] = f11;
        this.val[15] = 1.0f;
        return this;
    }

    /* renamed from: a */
    public final Matrix4 m1691a(Matrix4 matrix4) {
        System.arraycopy(matrix4.val, 0, this.val, 0, this.val.length);
        return this;
    }

    /* renamed from: b */
    public final Matrix4 m1692b() {
        this.val[0] = 1.0f;
        this.val[4] = 0.0f;
        this.val[8] = 0.0f;
        this.val[12] = 0.0f;
        this.val[1] = 0.0f;
        this.val[5] = 1.0f;
        this.val[9] = 0.0f;
        this.val[13] = 0.0f;
        this.val[2] = 0.0f;
        this.val[6] = 0.0f;
        this.val[10] = 1.0f;
        this.val[14] = 0.0f;
        this.val[3] = 0.0f;
        this.val[7] = 0.0f;
        this.val[11] = 0.0f;
        this.val[15] = 1.0f;
        return this;
    }

    /* renamed from: b */
    public final Matrix4 m1693b(Matrix4 matrix4) {
        mul(this.val, matrix4.val);
        return this;
    }

    public String toString() {
        return "[" + this.val[0] + "|" + this.val[4] + "|" + this.val[8] + "|" + this.val[12] + "]\n[" + this.val[1] + "|" + this.val[5] + "|" + this.val[9] + "|" + this.val[13] + "]\n[" + this.val[2] + "|" + this.val[6] + "|" + this.val[10] + "|" + this.val[14] + "]\n[" + this.val[3] + "|" + this.val[7] + "|" + this.val[11] + "|" + this.val[15] + "]\n";
    }
}
