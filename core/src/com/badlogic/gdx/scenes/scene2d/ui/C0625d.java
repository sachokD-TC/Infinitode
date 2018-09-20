package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.g2d.C0444a;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.utils.C0655f;
import com.badlogic.gdx.scenes.scene2d.utils.C0659l;
import com.badlogic.gdx.scenes.scene2d.utils.C0663k;
import com.badlogic.gdx.utils.Scaling;

/* renamed from: com.badlogic.gdx.scenes.scene2d.ui.d */
public final class C0625d extends C0624j {
    /* renamed from: q */
    Scaling f2801q;
    /* renamed from: r */
    public C0655f f2802r;
    /* renamed from: s */
    private int f2803s;
    /* renamed from: t */
    private float f2804t;
    /* renamed from: u */
    private float f2805u;
    /* renamed from: v */
    private float f2806v;
    /* renamed from: w */
    private float f2807w;

    public C0625d() {
        this(null);
    }

    public C0625d(Texture texture) {
        this(new C0663k(new C0438n(texture)));
    }

    public C0625d(C0438n c0438n) {
        this(new C0663k(c0438n), Scaling.stretch);
    }

    public C0625d(C0655f c0655f) {
        this(c0655f, Scaling.stretch);
    }

    private C0625d(C0655f c0655f, Scaling scaling) {
        this.f2803s = 1;
        m2117a(c0655f);
        this.f2801q = scaling;
        this.f2803s = 1;
        m1956c(mo483l(), mo484m());
    }

    /* renamed from: a */
    public final void mo471a(C0444a c0444a, float f) {
        b_();
        C0430b c0430b = this.f2622p;
        c0444a.mo367a(c0430b.f1644I, c0430b.f1645J, c0430b.f1646K, c0430b.f1647L * f);
        float f2 = this.f2613g;
        float f3 = this.f2614h;
        float f4 = this.f2619m;
        float f5 = this.f2620n;
        if (this.f2802r instanceof C0659l) {
            float f6 = this.f2621o;
            if (!(f4 == 1.0f && f5 == 1.0f && f6 == 0.0f)) {
                ((C0659l) this.f2802r).mo520a(c0444a, this.f2804t + f2, f3 + this.f2805u, this.f2617k - this.f2804t, this.f2618l - this.f2805u, this.f2806v, this.f2807w, f4, f5, f6);
                return;
            }
        }
        if (this.f2802r != null) {
            this.f2802r.mo514a(c0444a, this.f2804t + f2, f3 + this.f2805u, this.f2806v * f4, this.f2807w * f5);
        }
    }

    /* renamed from: a */
    public final void m2117a(C0655f c0655f) {
        if (this.f2802r != c0655f) {
            if (c0655f == null) {
                mo482j();
            } else if (!(mo483l() == c0655f.mo518e() && mo484m() == c0655f.mo519f())) {
                mo482j();
            }
            this.f2802r = c0655f;
        }
    }

    /* renamed from: f */
    public final void mo503f() {
        if (this.f2802r != null) {
            float e = this.f2802r.mo518e();
            float f = this.f2802r.mo519f();
            float f2 = this.f2615i;
            float f3 = this.f2616j;
            Vector2 a = this.f2801q.m2282a(e, f, f2, f3);
            this.f2806v = a.f2337x;
            this.f2807w = a.f2338y;
            if ((this.f2803s & 8) != 0) {
                this.f2804t = 0.0f;
            } else if ((this.f2803s & 16) != 0) {
                this.f2804t = (float) ((int) (f2 - this.f2806v));
            } else {
                this.f2804t = (float) ((int) ((f2 / 2.0f) - (this.f2806v / 2.0f)));
            }
            if ((this.f2803s & 2) != 0) {
                this.f2805u = (float) ((int) (f3 - this.f2807w));
            } else if ((this.f2803s & 4) != 0) {
                this.f2805u = 0.0f;
            } else {
                this.f2805u = (float) ((int) ((f3 / 2.0f) - (this.f2807w / 2.0f)));
            }
        }
    }

    /* renamed from: l */
    public final float mo483l() {
        return this.f2802r != null ? this.f2802r.mo518e() : 0.0f;
    }

    /* renamed from: m */
    public final float mo484m() {
        return this.f2802r != null ? this.f2802r.mo519f() : 0.0f;
    }

    /* renamed from: n */
    public final float mo485n() {
        return 0.0f;
    }

    /* renamed from: o */
    public final float mo486o() {
        return 0.0f;
    }
}
