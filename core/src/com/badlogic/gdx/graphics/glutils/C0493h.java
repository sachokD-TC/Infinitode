package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.C0512m;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.C0676a;

/* renamed from: com.badlogic.gdx.graphics.glutils.h */
public final class C0493h implements C0492g {
    /* renamed from: a */
    private int f2167a;
    /* renamed from: b */
    private int f2168b;
    /* renamed from: c */
    private int f2169c;
    /* renamed from: d */
    private final int f2170d;
    /* renamed from: e */
    private int f2171e;
    /* renamed from: f */
    private final Mesh f2172f;
    /* renamed from: g */
    private C0501p f2173g;
    /* renamed from: h */
    private boolean f2174h;
    /* renamed from: i */
    private final int f2175i;
    /* renamed from: j */
    private final int f2176j;
    /* renamed from: k */
    private final int f2177k;
    /* renamed from: l */
    private final int f2178l;
    /* renamed from: m */
    private final int f2179m;
    /* renamed from: n */
    private final Matrix4 f2180n;
    /* renamed from: o */
    private final float[] f2181o;
    /* renamed from: p */
    private final String[] f2182p;

    public C0493h() {
        this(new C0501p((((("attribute vec4 a_position;\nattribute vec4 a_color;\n" + "uniform mat4 u_projModelView;\n") + "varying vec4 v_col;\n") + "void main() {\n   gl_Position = u_projModelView * a_position;\n   v_col = a_color;\n") + "   gl_PointSize = 1.0;\n") + "}\n", (("#ifdef GL_ES\nprecision mediump float;\n#endif\n" + "varying vec4 v_col;\n") + "void main() {\n   gl_FragColor = v_col") + ";\n}"));
        this.f2174h = true;
    }

    private C0493h(C0501p c0501p) {
        this.f2180n = new Matrix4();
        this.f2170d = 5000;
        this.f2175i = 0;
        this.f2173g = c0501p;
        this.f2172f = new Mesh(false, 5000, 0, C0493h.m1529e());
        this.f2181o = new float[((this.f2172f.m1105d().f2300b / 4) * 5000)];
        this.f2176j = this.f2172f.m1105d().f2300b / 4;
        this.f2177k = this.f2172f.m1100a(8) != null ? this.f2172f.m1100a(8).f2289e / 4 : 0;
        this.f2178l = this.f2172f.m1100a(4) != null ? this.f2172f.m1100a(4).f2289e / 4 : 0;
        this.f2179m = this.f2172f.m1100a(16) != null ? this.f2172f.m1100a(16).f2289e / 4 : 0;
        this.f2182p = new String[0];
    }

    /* renamed from: e */
    private static C0512m[] m1529e() {
        C0676a c0676a = new C0676a();
        c0676a.m2296a(new C0512m(1, 3, "a_position"));
        c0676a.m2296a(new C0512m(4, 4, "a_color"));
        C0512m[] c0512mArr = new C0512m[c0676a.f3001b];
        for (int i = 0; i < c0676a.f3001b; i++) {
            c0512mArr[i] = (C0512m) c0676a.m2291a(i);
        }
        return c0512mArr;
    }

    /* renamed from: a */
    public final void mo406a() {
        if (this.f2171e != 0) {
            this.f2173g.m1614c();
            this.f2173g.m1611a("u_projModelView", this.f2180n);
            for (int i = 0; i < this.f2175i; i++) {
                this.f2173g.m1610a(this.f2182p[i], i);
            }
            this.f2172f.m1098a(this.f2181o, this.f2168b);
            Mesh mesh = this.f2172f;
            mesh.m1102a(this.f2173g, this.f2167a, mesh.f1360c.mo416c() > 0 ? mesh.m1096a() : mesh.m1104c(), mesh.f1361d);
            C0501p.m1601d();
            this.f2169c = 0;
            this.f2168b = 0;
            this.f2171e = 0;
        }
    }

    /* renamed from: a */
    public final void mo407a(float f) {
        this.f2181o[this.f2168b + this.f2178l] = f;
    }

    /* renamed from: a */
    public final void mo408a(float f, float f2) {
        int i = this.f2168b;
        this.f2181o[i] = f;
        this.f2181o[i + 1] = f2;
        this.f2181o[i + 2] = 0.0f;
        this.f2169c = 0;
        this.f2168b += this.f2176j;
        this.f2171e++;
    }

    /* renamed from: a */
    public final void mo409a(float f, float f2, float f3, float f4) {
        this.f2181o[this.f2168b + this.f2178l] = C0430b.m1212b(f, f2, f3, f4);
    }

    /* renamed from: a */
    public final void mo410a(Matrix4 matrix4, int i) {
        this.f2180n.m1691a(matrix4);
        this.f2167a = i;
    }

    /* renamed from: b */
    public final int mo411b() {
        return this.f2171e;
    }

    /* renamed from: c */
    public final int mo412c() {
        return this.f2170d;
    }

    /* renamed from: d */
    public final void mo413d() {
        if (this.f2174h && this.f2173g != null) {
            this.f2173g.dispose();
        }
        this.f2172f.dispose();
    }
}
