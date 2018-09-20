package com.badlogic.gdx.utils.p034b;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0427a;
import com.badlogic.gdx.graphics.glutils.C0491f;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.utils.C0661i;

/* renamed from: com.badlogic.gdx.utils.b.c */
public abstract class C0682c {
    /* renamed from: b */
    public C0427a f3055b;
    /* renamed from: c */
    public float f3056c;
    /* renamed from: d */
    public float f3057d;
    /* renamed from: e */
    public int f3058e;
    /* renamed from: f */
    public int f3059f;
    /* renamed from: g */
    public int f3060g;
    /* renamed from: h */
    public int f3061h;
    /* renamed from: i */
    public final Vector3 f3062i = new Vector3();

    /* renamed from: a */
    public final void m2376a() {
        int i = this.f3058e;
        int i2 = this.f3059f;
        int i3 = this.f3060g;
        int i4 = this.f3061h;
        if (Gdx.graphics.mo294c() == Gdx.graphics.mo296e() && Gdx.graphics.mo295d() == Gdx.graphics.mo297f()) {
            Gdx.gl.glViewport(i, i2, i3, i4);
        } else {
            Gdx.gl.glViewport(C0491f.m1518a(i), C0491f.m1520b(i2), C0491f.m1518a(i3), C0491f.m1520b(i4));
        }
        this.f3055b.f1599j = this.f3056c;
        this.f3055b.f1600k = this.f3057d;
        this.f3055b.f1590a.m1709a(this.f3056c / 2.0f, this.f3057d / 2.0f, 0.0f);
        this.f3055b.mo429a();
    }

    /* renamed from: a */
    public final void m2377a(float f, float f2) {
        this.f3056c = f;
        this.f3057d = f2;
    }

    /* renamed from: a */
    public void mo522a(int i, int i2) {
        m2376a();
    }

    /* renamed from: a */
    public final void m2379a(int i, int i2, int i3, int i4) {
        this.f3058e = i;
        this.f3059f = i2;
        this.f3060g = i3;
        this.f3061h = i4;
    }

    /* renamed from: a */
    public final void m2380a(Matrix4 matrix4, Rectangle rectangle, Rectangle rectangle2) {
        C0661i.m2232a(this.f3055b, (float) this.f3058e, (float) this.f3059f, (float) this.f3060g, (float) this.f3061h, matrix4, rectangle, rectangle2);
    }
}
