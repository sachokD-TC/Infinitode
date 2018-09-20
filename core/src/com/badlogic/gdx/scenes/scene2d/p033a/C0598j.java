package com.badlogic.gdx.scenes.scene2d.p033a;

import com.badlogic.gdx.math.C0549f;

/* renamed from: com.badlogic.gdx.scenes.scene2d.a.j */
public class C0598j extends C0589m {
    /* renamed from: d */
    public float f2600d;
    /* renamed from: g */
    private float f2601g;
    /* renamed from: h */
    private boolean f2602h = false;

    /* renamed from: b */
    protected final void mo462b(float f) {
        if (this.f2602h) {
            this.b.m1961e(C0549f.m1767b(this.f2601g, this.f2600d, f));
        } else {
            this.b.m1961e(this.f2601g + ((this.f2600d - this.f2601g) * f));
        }
    }

    /* renamed from: c */
    protected final void mo463c() {
        this.f2601g = this.b.f2621o;
    }
}
