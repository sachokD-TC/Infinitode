package com.badlogic.gdx.scenes.scene2d.p033a;

import com.badlogic.gdx.graphics.C0430b;

/* renamed from: com.badlogic.gdx.scenes.scene2d.a.b */
public class C0590b extends C0589m {
    /* renamed from: d */
    float f2581d;
    /* renamed from: g */
    private float f2582g;
    /* renamed from: h */
    private C0430b f2583h;

    /* renamed from: a */
    public final void mo360a() {
        super.mo360a();
        this.f2583h = null;
    }

    /* renamed from: b */
    protected final void mo462b(float f) {
        this.f2583h.f1647L = this.f2582g + ((this.f2581d - this.f2582g) * f);
    }

    /* renamed from: c */
    protected final void mo463c() {
        if (this.f2583h == null) {
            this.f2583h = this.b.f2622p;
        }
        this.f2582g = this.f2583h.f1647L;
    }
}
