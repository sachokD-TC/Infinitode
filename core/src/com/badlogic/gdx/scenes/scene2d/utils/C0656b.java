package com.badlogic.gdx.scenes.scene2d.utils;

import com.badlogic.gdx.graphics.g2d.C0444a;

/* renamed from: com.badlogic.gdx.scenes.scene2d.utils.b */
public class C0656b implements C0655f {
    /* renamed from: a */
    public String f2922a;
    /* renamed from: b */
    public float f2923b;
    /* renamed from: c */
    public float f2924c;
    /* renamed from: d */
    public float f2925d;
    /* renamed from: e */
    public float f2926e;
    /* renamed from: f */
    public float f2927f;
    /* renamed from: g */
    public float f2928g;

    public C0656b(C0655f c0655f) {
        if (c0655f instanceof C0656b) {
            this.f2922a = ((C0656b) c0655f).f2922a;
        }
        this.f2923b = c0655f.mo513a();
        this.f2924c = c0655f.mo515b();
        this.f2925d = c0655f.mo516c();
        this.f2926e = c0655f.mo517d();
        this.f2927f = c0655f.mo518e();
        this.f2928g = c0655f.mo519f();
    }

    /* renamed from: a */
    public final float mo513a() {
        return this.f2923b;
    }

    /* renamed from: a */
    public void mo514a(C0444a c0444a, float f, float f2, float f3, float f4) {
    }

    /* renamed from: b */
    public final float mo515b() {
        return this.f2924c;
    }

    /* renamed from: c */
    public final float mo516c() {
        return this.f2925d;
    }

    /* renamed from: d */
    public final float mo517d() {
        return this.f2926e;
    }

    /* renamed from: e */
    public final float mo518e() {
        return this.f2927f;
    }

    /* renamed from: f */
    public final float mo519f() {
        return this.f2928g;
    }

    public String toString() {
        return this.f2922a == null ? getClass().getSimpleName() : this.f2922a;
    }
}
