package com.badlogic.gdx.math;

import java.io.Serializable;

public class Plane implements Serializable {
    private static final long serialVersionUID = -1240652082930747866L;
    /* renamed from: d */
    public float f2323d = 0.0f;
    public final Vector3 normal = new Vector3();

    public Plane(Vector3 vector3) {
        this.normal.m1711a(vector3).m1712b();
        this.f2323d = 0.0f;
    }

    /* renamed from: a */
    public final void m1694a(Vector3 vector3, Vector3 vector32, Vector3 vector33) {
        Vector3 c = this.normal.m1711a(vector3).m1715c(vector32);
        float f = vector32.f2344x - vector33.f2344x;
        float f2 = vector32.f2345y - vector33.f2345y;
        float f3 = vector32.f2346z - vector33.f2346z;
        c.m1709a((c.f2345y * f3) - (c.f2346z * f2), (c.f2346z * f) - (f3 * c.f2344x), (f2 * c.f2344x) - (f * c.f2345y)).m1712b();
        this.f2323d = -vector3.m1716d(this.normal);
    }

    public String toString() {
        return this.normal.toString() + ", " + this.f2323d;
    }
}
