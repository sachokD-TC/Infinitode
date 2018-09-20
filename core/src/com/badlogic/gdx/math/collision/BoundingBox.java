package com.badlogic.gdx.math.collision;

import com.badlogic.gdx.math.Vector3;
import java.io.Serializable;

public class BoundingBox implements Serializable {
    /* renamed from: a */
    private static final Vector3 f2367a = new Vector3();
    private static final long serialVersionUID = -1286036817192127343L;
    public final Vector3 cnt = new Vector3();
    public final Vector3 dim = new Vector3();
    public final Vector3 max = new Vector3();
    public final Vector3 min = new Vector3();

    public BoundingBox() {
        m1725a(this.min.m1709a(0.0f, 0.0f, 0.0f), this.max.m1709a(0.0f, 0.0f, 0.0f));
    }

    /* renamed from: a */
    private static float m1724a(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    /* renamed from: a */
    private BoundingBox m1725a(Vector3 vector3, Vector3 vector32) {
        this.min.m1709a(vector3.f2344x < vector32.f2344x ? vector3.f2344x : vector32.f2344x, vector3.f2345y < vector32.f2345y ? vector3.f2345y : vector32.f2345y, vector3.f2346z < vector32.f2346z ? vector3.f2346z : vector32.f2346z);
        this.max.m1709a(vector3.f2344x > vector32.f2344x ? vector3.f2344x : vector32.f2344x, vector3.f2345y > vector32.f2345y ? vector3.f2345y : vector32.f2345y, vector3.f2346z > vector32.f2346z ? vector3.f2346z : vector32.f2346z);
        this.cnt.m1711a(this.min).m1714b(this.max).m1708a(0.5f);
        this.dim.m1711a(this.max).m1715c(this.min);
        return this;
    }

    /* renamed from: a */
    public final BoundingBox m1726a(Vector3 vector3) {
        return m1725a(this.min.m1709a(m1724a(this.min.f2344x, vector3.f2344x), m1724a(this.min.f2345y, vector3.f2345y), m1724a(this.min.f2346z, vector3.f2346z)), this.max.m1709a(Math.max(this.max.f2344x, vector3.f2344x), Math.max(this.max.f2345y, vector3.f2345y), Math.max(this.max.f2346z, vector3.f2346z)));
    }

    public String toString() {
        return "[" + this.min + "|" + this.max + "]";
    }
}
