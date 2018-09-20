package com.badlogic.gdx.scenes.scene2d.p033a;

import com.badlogic.gdx.math.C0522d;
import com.badlogic.gdx.scenes.scene2d.C0588a;
import com.badlogic.gdx.utils.C0328t;

/* renamed from: com.badlogic.gdx.scenes.scene2d.a.m */
public abstract class C0589m extends C0588a {
    /* renamed from: d */
    private float f2575d;
    /* renamed from: e */
    public float f2576e;
    /* renamed from: f */
    public C0522d f2577f;
    /* renamed from: g */
    private boolean f2578g;
    /* renamed from: h */
    private boolean f2579h;
    /* renamed from: i */
    private boolean f2580i;

    /* renamed from: a */
    public void mo360a() {
        super.mo360a();
        this.f2578g = false;
        this.f2577f = null;
    }

    /* renamed from: a */
    public final boolean mo460a(float f) {
        boolean z = true;
        if (!this.f2580i) {
            C0328t c0328t = this.f2574c;
            this.f2574c = null;
            try {
                float f2;
                if (!this.f2579h) {
                    mo463c();
                    this.f2579h = true;
                }
                this.f2575d += f;
                if (this.f2575d < this.f2576e) {
                    z = false;
                }
                this.f2580i = z;
                if (this.f2580i) {
                    f2 = 1.0f;
                } else {
                    f2 = this.f2575d / this.f2576e;
                    if (this.f2577f != null) {
                        f2 = this.f2577f.mo430a(f2);
                    }
                }
                if (this.f2578g) {
                    f2 = 1.0f - f2;
                }
                mo462b(f2);
                z = this.f2580i;
            } finally {
                this.f2574c = c0328t;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void mo461b() {
        this.f2575d = 0.0f;
        this.f2579h = false;
        this.f2580i = false;
    }

    /* renamed from: b */
    protected abstract void mo462b(float f);

    /* renamed from: c */
    protected void mo463c() {
    }
}
