package com.badlogic.gdx.scenes.scene2d.p033a;

import com.badlogic.gdx.graphics.C0430b;

/* renamed from: com.badlogic.gdx.scenes.scene2d.a.c */
public class C0591c extends C0589m {
    /* renamed from: d */
    final C0430b f2584d = new C0430b();
    /* renamed from: g */
    private float f2585g;
    /* renamed from: h */
    private float f2586h;
    /* renamed from: i */
    private float f2587i;
    /* renamed from: j */
    private float f2588j;
    /* renamed from: k */
    private C0430b f2589k;

    /* renamed from: a */
    public final void mo360a() {
        super.mo360a();
        this.f2589k = null;
    }

    /* renamed from: b */
    protected final void mo462b(float f) {
        this.f2589k.m1217a(this.f2585g + ((this.f2584d.f1644I - this.f2585g) * f), this.f2586h + ((this.f2584d.f1645J - this.f2586h) * f), this.f2587i + ((this.f2584d.f1646K - this.f2587i) * f), this.f2588j + ((this.f2584d.f1647L - this.f2588j) * f));
    }

    /* renamed from: c */
    protected final void mo463c() {
        if (this.f2589k == null) {
            this.f2589k = this.b.f2622p;
        }
        this.f2585g = this.f2589k.f1644I;
        this.f2586h = this.f2589k.f1645J;
        this.f2587i = this.f2589k.f1646K;
        this.f2588j = this.f2589k.f1647L;
    }
}
