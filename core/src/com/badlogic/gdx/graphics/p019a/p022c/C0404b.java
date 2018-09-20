package com.badlogic.gdx.graphics.p019a.p022c;

import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;

/* renamed from: com.badlogic.gdx.graphics.a.c.b */
public final class C0404b {
    /* renamed from: i */
    public static final BoundingBox f1510i = new BoundingBox();
    /* renamed from: a */
    public String f1511a;
    /* renamed from: b */
    public int f1512b;
    /* renamed from: c */
    public int f1513c;
    /* renamed from: d */
    public int f1514d;
    /* renamed from: e */
    public Mesh f1515e;
    /* renamed from: f */
    public final Vector3 f1516f = new Vector3();
    /* renamed from: g */
    public final Vector3 f1517g = new Vector3();
    /* renamed from: h */
    public float f1518h = -1.0f;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0404b)) {
            return false;
        }
        C0404b c0404b = (C0404b) obj;
        return c0404b == this || (c0404b != null && c0404b.f1515e == this.f1515e && c0404b.f1512b == this.f1512b && c0404b.f1513c == this.f1513c && c0404b.f1514d == this.f1514d);
    }
}
