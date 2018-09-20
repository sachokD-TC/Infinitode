package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.g2d.C0444a;
import com.badlogic.gdx.scenes.scene2d.ui.C0621a.C0620a;
import com.badlogic.gdx.scenes.scene2d.utils.C0655f;
import com.badlogic.gdx.utils.Scaling;

/* renamed from: com.badlogic.gdx.scenes.scene2d.ui.e */
public final class C0627e extends C0621a {
    /* renamed from: N */
    private final C0625d f2814N;
    /* renamed from: v */
    public C0626a f2815v;

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.e$a */
    public static class C0626a extends C0620a {
        /* renamed from: m */
        public C0655f f2808m;
        /* renamed from: n */
        public C0655f f2809n;
        /* renamed from: o */
        public C0655f f2810o;
        /* renamed from: p */
        public C0655f f2811p;
        /* renamed from: q */
        public C0655f f2812q;
        /* renamed from: r */
        public C0655f f2813r;

        public C0626a(C0655f c0655f) {
            super((byte) 0);
            this.f2808m = c0655f;
            this.f2809n = null;
            this.f2811p = null;
        }
    }

    public C0627e(C0626a c0626a) {
        super(c0626a);
        this.f2814N = new C0625d();
        C0625d c0625d = this.f2814N;
        Scaling scaling = Scaling.fit;
        if (scaling == null) {
            throw new IllegalArgumentException("scaling cannot be null.");
        }
        c0625d.f2801q = scaling;
        c0625d.mo505g();
        m2059d(this.f2814N);
        mo504a(c0626a);
        m1956c(mo483l(), mo484m());
    }

    public C0627e(C0655f c0655f) {
        this(new C0626a(c0655f));
    }

    /* renamed from: s */
    private void m2123s() {
        C0655f c0655f = null;
        if (this.f2743t && this.f2815v.f2813r != null) {
            c0655f = this.f2815v.f2813r;
        } else if (a_() && this.f2815v.f2809n != null) {
            c0655f = this.f2815v.f2809n;
        } else if (this.s && this.f2815v.f2811p != null) {
            c0655f = (this.f2815v.f2812q == null || !mo502k()) ? this.f2815v.f2811p : this.f2815v.f2812q;
        } else if (mo502k() && this.f2815v.f2810o != null) {
            c0655f = this.f2815v.f2810o;
        } else if (this.f2815v.f2808m != null) {
            c0655f = this.f2815v.f2808m;
        }
        this.f2814N.m2117a(c0655f);
    }

    /* renamed from: a */
    public final void mo471a(C0444a c0444a, float f) {
        m2123s();
        super.mo471a(c0444a, f);
    }

    /* renamed from: a */
    public final void mo504a(C0620a c0620a) {
        if (c0620a instanceof C0626a) {
            super.mo504a(c0620a);
            this.f2815v = (C0626a) c0620a;
            if (this.f2814N != null) {
                m2123s();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("style must be an ImageButtonStyle.");
    }
}
