package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.g2d.C0444a;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.C0609g;
import com.badlogic.gdx.scenes.scene2d.utils.C0616g;

/* renamed from: com.badlogic.gdx.scenes.scene2d.ui.j */
public class C0624j extends C0602b implements C0616g {
    /* renamed from: q */
    private boolean f2798q = true;
    /* renamed from: r */
    private boolean f2799r;
    /* renamed from: s */
    private boolean f2800s = true;

    /* renamed from: a */
    public void mo471a(C0444a c0444a, float f) {
        b_();
    }

    public final void b_() {
        if (this.f2800s) {
            C0602b c0602b = this.f2608b;
            if (this.f2799r && c0602b != null) {
                float f;
                float f2;
                C0609g c0609g = this.f2607a;
                if (c0609g == null || c0602b != c0609g.f2642c) {
                    f = c0602b.f2615i;
                    f2 = c0602b.f2616j;
                } else {
                    f = c0609g.f2641b.f3056c;
                    f2 = c0609g.f2641b.f3057d;
                }
                m1956c(f, f2);
            }
            if (this.f2798q) {
                this.f2798q = false;
                mo503f();
            }
        }
    }

    /* renamed from: d */
    protected final void mo480d() {
        mo505g();
    }

    /* renamed from: f */
    public void mo503f() {
    }

    /* renamed from: g */
    public void mo505g() {
        this.f2798q = true;
    }

    /* renamed from: j */
    public final void mo482j() {
        if (this.f2800s) {
            mo505g();
            C0605e c0605e = this.f2608b;
            if (c0605e instanceof C0616g) {
                ((C0616g) c0605e).mo482j();
            }
        }
    }

    /* renamed from: l */
    public float mo483l() {
        return 0.0f;
    }

    /* renamed from: m */
    public float mo484m() {
        return 0.0f;
    }

    /* renamed from: n */
    public float mo485n() {
        return mo483l();
    }

    /* renamed from: o */
    public float mo486o() {
        return mo484m();
    }
}
