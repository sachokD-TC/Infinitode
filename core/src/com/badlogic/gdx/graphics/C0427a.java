package com.badlogic.gdx.graphics;

import com.badlogic.gdx.math.C0521c;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.Ray;

/* renamed from: com.badlogic.gdx.graphics.a */
public abstract class C0427a {
    /* renamed from: a */
    public final Vector3 f1590a = new Vector3();
    /* renamed from: b */
    public final Vector3 f1591b = new Vector3(0.0f, 0.0f, -1.0f);
    /* renamed from: c */
    public final Vector3 f1592c = new Vector3(0.0f, 1.0f, 0.0f);
    /* renamed from: d */
    public final Matrix4 f1593d = new Matrix4();
    /* renamed from: e */
    public final Matrix4 f1594e = new Matrix4();
    /* renamed from: f */
    public final Matrix4 f1595f = new Matrix4();
    /* renamed from: g */
    public final Matrix4 f1596g = new Matrix4();
    /* renamed from: h */
    public float f1597h = 1.0f;
    /* renamed from: i */
    public float f1598i = 100.0f;
    /* renamed from: j */
    public float f1599j = 0.0f;
    /* renamed from: k */
    public float f1600k = 0.0f;
    /* renamed from: l */
    public final C0521c f1601l = new C0521c();
    /* renamed from: m */
    private final Vector3 f1602m = new Vector3();
    /* renamed from: n */
    private final Ray f1603n = new Ray(new Vector3(), new Vector3());

    /* renamed from: a */
    public final Vector3 m1206a(Vector3 vector3, float f, float f2, float f3, float f4) {
        vector3.m1713b(this.f1595f);
        vector3.f2344x = (((vector3.f2344x + 1.0f) * f3) / 2.0f) + f;
        vector3.f2345y = (((vector3.f2345y + 1.0f) * f4) / 2.0f) + f2;
        vector3.f2346z = (vector3.f2346z + 1.0f) / 2.0f;
        return vector3;
    }

    /* renamed from: a */
    public abstract void mo429a();
}
