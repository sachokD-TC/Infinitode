package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.g2d.C0444a;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.C0609g;
import com.badlogic.gdx.scenes.scene2d.utils.C0616g;

/* renamed from: com.badlogic.gdx.scenes.scene2d.ui.k */
public class C0617k extends C0605e implements C0616g {
    /* renamed from: Y */
    public boolean f2677Y;
    /* renamed from: s */
    private boolean f2678s = true;
    /* renamed from: t */
    private boolean f2679t = true;

    /* renamed from: a */
    public void mo471a(C0444a c0444a, float f) {
        b_();
        super.mo471a(c0444a, f);
    }

    public final void b_() {
        if (this.f2679t) {
            C0602b c0602b = this.f2608b;
            if (this.f2677Y && c0602b != null) {
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
                if (!(this.f2615i == f && this.f2616j == f2)) {
                    m1955c(f);
                    m1959d(f2);
                    d_();
                }
            }
            if (this.f2678s) {
                this.f2678s = false;
                mo494r();
            }
        }
    }

    /* renamed from: d */
    protected final void mo480d() {
        d_();
    }

    public void d_() {
        this.f2678s = true;
    }

    /* renamed from: g */
    protected final void mo481g() {
        mo482j();
    }

    /* renamed from: j */
    public final void mo482j() {
        d_();
        C0605e c0605e = this.f2608b;
        if (c0605e instanceof C0616g) {
            ((C0616g) c0605e).mo482j();
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

    /* renamed from: r */
    public void mo494r() {
    }
}
