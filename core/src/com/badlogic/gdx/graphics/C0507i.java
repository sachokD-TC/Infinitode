package com.badlogic.gdx.graphics;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;

/* renamed from: com.badlogic.gdx.graphics.i */
public final class C0507i extends C0427a {
    /* renamed from: m */
    public float f2279m;
    /* renamed from: n */
    private final Vector3 f2280n;

    public C0507i() {
        this.f2279m = 1.0f;
        this.f2280n = new Vector3();
        this.h = 0.0f;
    }

    public C0507i(float f, float f2) {
        this.f2279m = 1.0f;
        this.f2280n = new Vector3();
        this.j = f;
        this.k = f2;
        this.h = 0.0f;
        mo429a();
    }

    /* renamed from: a */
    public final void mo429a() {
        this.d.m1690a((this.f2279m * (-this.j)) / 2.0f, this.f2279m * (this.j / 2.0f), this.f2279m * (-(this.k / 2.0f)), (this.f2279m * this.k) / 2.0f, this.h, this.i);
        Matrix4 matrix4 = this.e;
        Vector3 vector3 = this.a;
        Vector3 b = this.f2280n.m1711a(this.a).m1714b(this.b);
        Vector3 vector32 = this.c;
        Matrix4.f2318g.m1711a(b).m1715c(vector3);
        b = Matrix4.f2318g;
        Matrix4.f2315d.m1711a(b).m1712b();
        Matrix4.f2316e.m1711a(b).m1712b();
        Matrix4.f2316e.m1717e(vector32).m1712b();
        Matrix4.f2317f.m1711a(Matrix4.f2316e).m1717e(Matrix4.f2315d).m1712b();
        matrix4.m1692b();
        matrix4.val[0] = Matrix4.f2316e.f2344x;
        matrix4.val[4] = Matrix4.f2316e.f2345y;
        matrix4.val[8] = Matrix4.f2316e.f2346z;
        matrix4.val[1] = Matrix4.f2317f.f2344x;
        matrix4.val[5] = Matrix4.f2317f.f2345y;
        matrix4.val[9] = Matrix4.f2317f.f2346z;
        matrix4.val[2] = -Matrix4.f2315d.f2344x;
        matrix4.val[6] = -Matrix4.f2315d.f2345y;
        matrix4.val[10] = -Matrix4.f2315d.f2346z;
        Matrix4 matrix42 = Matrix4.f2319h;
        float f = -vector3.f2344x;
        float f2 = -vector3.f2345y;
        float f3 = -vector3.f2346z;
        matrix42.m1692b();
        matrix42.val[12] = f;
        matrix42.val[13] = f2;
        matrix42.val[14] = f3;
        matrix4.m1693b(matrix42);
        this.f.m1691a(this.d);
        Matrix4.mul(this.f.val, this.e.val);
        this.g.m1691a(this.f);
        Matrix4.inv(this.g.val);
        this.l.m1723a(this.g);
    }
}
