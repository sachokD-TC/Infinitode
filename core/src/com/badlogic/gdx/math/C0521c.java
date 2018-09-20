package com.badlogic.gdx.math;

/* renamed from: com.badlogic.gdx.math.c */
public final class C0521c {
    /* renamed from: a */
    protected static final Vector3[] f2361a = new Vector3[]{new Vector3(-1.0f, -1.0f, -1.0f), new Vector3(1.0f, -1.0f, -1.0f), new Vector3(1.0f, 1.0f, -1.0f), new Vector3(-1.0f, 1.0f, -1.0f), new Vector3(-1.0f, -1.0f, 1.0f), new Vector3(1.0f, -1.0f, 1.0f), new Vector3(1.0f, 1.0f, 1.0f), new Vector3(-1.0f, 1.0f, 1.0f)};
    /* renamed from: b */
    protected static final float[] f2362b = new float[24];
    /* renamed from: f */
    private static final Vector3 f2363f = new Vector3();
    /* renamed from: c */
    public final Plane[] f2364c = new Plane[6];
    /* renamed from: d */
    public final Vector3[] f2365d = new Vector3[]{new Vector3(), new Vector3(), new Vector3(), new Vector3(), new Vector3(), new Vector3(), new Vector3(), new Vector3()};
    /* renamed from: e */
    protected final float[] f2366e = new float[24];

    static {
        int i = 0;
        Vector3[] vector3Arr = f2361a;
        int length = vector3Arr.length;
        int i2 = 0;
        while (i < length) {
            Vector3 vector3 = vector3Arr[i];
            int i3 = i2 + 1;
            f2362b[i2] = vector3.f2344x;
            int i4 = i3 + 1;
            f2362b[i3] = vector3.f2345y;
            i2 = i4 + 1;
            f2362b[i4] = vector3.f2346z;
            i++;
        }
    }

    public C0521c() {
        int i = 0;
        while (i < 6) {
            this.f2364c[i] = new Plane(new Vector3());
            i++;
        }
    }

    /* renamed from: a */
    public final void m1723a(Matrix4 matrix4) {
        System.arraycopy(f2362b, 0, this.f2366e, 0, f2362b.length);
        Matrix4.prj(matrix4.val, this.f2366e, 0, 8, 3);
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            Vector3 vector3 = this.f2365d[i2];
            int i3 = i + 1;
            vector3.f2344x = this.f2366e[i];
            int i4 = i3 + 1;
            vector3.f2345y = this.f2366e[i3];
            i = i4 + 1;
            vector3.f2346z = this.f2366e[i4];
        }
        this.f2364c[0].m1694a(this.f2365d[1], this.f2365d[0], this.f2365d[2]);
        this.f2364c[1].m1694a(this.f2365d[4], this.f2365d[5], this.f2365d[7]);
        this.f2364c[2].m1694a(this.f2365d[0], this.f2365d[4], this.f2365d[3]);
        this.f2364c[3].m1694a(this.f2365d[5], this.f2365d[1], this.f2365d[6]);
        this.f2364c[4].m1694a(this.f2365d[2], this.f2365d[3], this.f2365d[6]);
        this.f2364c[5].m1694a(this.f2365d[4], this.f2365d[0], this.f2365d[1]);
    }
}
