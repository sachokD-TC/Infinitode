package com.badlogic.gdx.graphics.p019a.p024d;

import com.badlogic.gdx.graphics.p019a.p024d.p026b.C0414a;
import com.badlogic.gdx.graphics.p019a.p024d.p027c.C0415a;
import com.badlogic.gdx.graphics.p019a.p024d.p028d.C0418a;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.C0636l;
import com.badlogic.gdx.utils.C0636l.C0411c;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.JsonValue;

/* renamed from: com.badlogic.gdx.graphics.a.d.a */
public class C0412a implements C0411c {
    /* renamed from: a */
    public String f1543a;
    /* renamed from: b */
    public C0414a f1544b;
    /* renamed from: c */
    public C0676a<C0415a> f1545c = new C0676a(true, 3, C0415a.class);
    /* renamed from: d */
    public C0418a<?, ?> f1546d;
    /* renamed from: e */
    public Matrix4 f1547e = new Matrix4();
    /* renamed from: f */
    public Vector3 f1548f = new Vector3(1.0f, 1.0f, 1.0f);
    /* renamed from: g */
    public float f1549g = 0.016666668f;
    /* renamed from: h */
    public float f1550h = (this.f1549g * this.f1549g);

    /* renamed from: a */
    public final void mo350a(C0636l c0636l, JsonValue jsonValue) {
        this.f1543a = (String) c0636l.m2176a("name", String.class, jsonValue);
        this.f1544b = (C0414a) c0636l.m2176a("emitter", C0414a.class, jsonValue);
        this.f1545c.m2294a((C0676a) c0636l.m2177a("influencers", C0676a.class, C0415a.class, jsonValue));
        this.f1546d = (C0418a) c0636l.m2176a("renderer", C0418a.class, jsonValue);
    }
}
