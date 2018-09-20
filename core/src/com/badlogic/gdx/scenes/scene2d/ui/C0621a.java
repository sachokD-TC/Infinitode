package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.C0444a;
import com.badlogic.gdx.scenes.scene2d.C0586c;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0603d;
import com.badlogic.gdx.scenes.scene2d.C0609g;
import com.badlogic.gdx.scenes.scene2d.utils.C0618d;
import com.badlogic.gdx.scenes.scene2d.utils.C0655f;
import com.badlogic.gdx.scenes.scene2d.utils.C0658c.C0657a;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0721u;

/* renamed from: com.badlogic.gdx.scenes.scene2d.ui.a */
public class C0621a extends Table {
    /* renamed from: N */
    private C0618d f2740N;
    /* renamed from: O */
    private boolean f2741O = true;
    /* renamed from: s */
    boolean f2742s;
    /* renamed from: t */
    boolean f2743t;
    /* renamed from: u */
    C0622b f2744u;
    /* renamed from: v */
    private C0620a f2745v;

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.a$1 */
    class C06191 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ C0621a f2727a;

        C06191(C0621a c0621a) {
            this.f2727a = c0621a;
        }

        /* renamed from: b */
        public final void mo500b() {
            if (!this.f2727a.f2743t) {
                this.f2727a.mo501a(!this.f2727a.f2742s, true);
            }
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.a$a */
    public static class C0620a {
        /* renamed from: a */
        public C0655f f2728a;
        /* renamed from: b */
        public C0655f f2729b;
        /* renamed from: c */
        public C0655f f2730c;
        /* renamed from: d */
        public C0655f f2731d;
        /* renamed from: e */
        public C0655f f2732e;
        /* renamed from: f */
        public C0655f f2733f;
        /* renamed from: g */
        public float f2734g;
        /* renamed from: h */
        public float f2735h;
        /* renamed from: i */
        public float f2736i;
        /* renamed from: j */
        public float f2737j;
        /* renamed from: k */
        public float f2738k;
        /* renamed from: l */
        public float f2739l;

        public C0620a(byte b) {
            this.f2728a = null;
            this.f2729b = null;
            this.f2731d = null;
        }
    }

    public C0621a(C0620a c0620a) {
        C0603d c06191 = new C06191(this);
        this.f2740N = c06191;
        m1947a(c06191);
        mo504a(c0620a);
        m1956c(mo483l(), mo484m());
    }

    /* renamed from: a */
    public void mo471a(C0444a c0444a, float f) {
        float f2;
        float f3;
        int i = 0;
        b_();
        boolean z = this.f2743t;
        boolean a_ = a_();
        boolean z2 = this.f2742s;
        boolean k = mo502k();
        C0655f c0655f = null;
        if (z && this.f2745v.f2733f != null) {
            c0655f = this.f2745v.f2733f;
        } else if (a_ && this.f2745v.f2729b != null) {
            c0655f = this.f2745v.f2729b;
        } else if (z2 && this.f2745v.f2731d != null) {
            c0655f = (this.f2745v.f2732e == null || !k) ? this.f2745v.f2731d : this.f2745v.f2732e;
        } else if (k && this.f2745v.f2730c != null) {
            c0655f = this.f2745v.f2730c;
        } else if (this.f2745v.f2728a != null) {
            c0655f = this.f2745v.f2728a;
        }
        m2054a(c0655f);
        if (a_ && !z) {
            f2 = this.f2745v.f2734g;
            f3 = this.f2745v.f2735h;
        } else if (!z2 || z) {
            f2 = this.f2745v.f2736i;
            f3 = this.f2745v.f2737j;
        } else {
            f2 = this.f2745v.f2738k;
            f3 = this.f2745v.f2739l;
        }
        C0676a c0676a = this.f2627q;
        for (int i2 = 0; i2 < c0676a.f3001b; i2++) {
            ((C0602b) c0676a.m2291a(i2)).m1951b(f2, f3);
        }
        super.mo471a(c0444a, f);
        while (i < c0676a.f3001b) {
            ((C0602b) c0676a.m2291a(i)).m1951b(-f2, -f3);
            i++;
        }
        C0609g c0609g = this.f2607a;
        if (c0609g != null && c0609g.f2646g && a_ != this.f2740N.f2715c) {
            Gdx.graphics.mo300i();
        }
    }

    /* renamed from: a */
    public void mo504a(C0620a c0620a) {
        if (c0620a == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        this.f2745v = c0620a;
        C0655f c0655f = (!a_() || this.f2743t) ? (!this.f2743t || c0620a.f2733f == null) ? (!this.f2742s || c0620a.f2731d == null) ? (!mo502k() || c0620a.f2730c == null) ? c0620a.f2728a : c0620a.f2730c : (!mo502k() || c0620a.f2732e == null) ? c0620a.f2731d : c0620a.f2732e : c0620a.f2733f : c0620a.f2729b == null ? c0620a.f2728a : c0620a.f2729b;
        m2054a(c0655f);
    }

    /* renamed from: a */
    final void mo501a(boolean z, boolean z2) {
        boolean z3 = true;
        if (this.f2742s != z) {
            if (this.f2744u != null) {
                boolean z4;
                C0622b c0622b = this.f2744u;
                if (this.f2742s == z) {
                    z4 = false;
                } else {
                    if (z) {
                        if (c0622b.f2748c != -1 && c0622b.f2746a.f3001b >= c0622b.f2748c) {
                            if (c0622b.f2749d) {
                                int i = c0622b.f2747b;
                                c0622b.f2747b = 0;
                                C0621a c0621a = c0622b.f2750e;
                                c0621a.mo501a(false, c0621a.f2741O);
                                c0622b.f2747b = i;
                            } else {
                                z4 = false;
                            }
                        }
                        c0622b.f2746a.m2296a((Object) this);
                        c0622b.f2750e = this;
                    } else if (c0622b.f2746a.f3001b <= c0622b.f2747b) {
                        z4 = false;
                    } else {
                        c0622b.f2746a.mo529b((Object) this, true);
                    }
                    z4 = true;
                }
                if (!z4) {
                    return;
                }
            }
            this.f2742s = z;
            if (z2) {
                Object obj = (C0657a) C0721u.m2514b(C0657a.class);
                if (m1945a((C0586c) obj)) {
                    if (z) {
                        z3 = false;
                    }
                    this.f2742s = z3;
                }
                C0721u.m2513a(obj);
            }
        }
    }

    public final boolean a_() {
        C0618d c0618d = this.f2740N;
        if (c0618d.f2715c) {
            return true;
        }
        if (c0618d.f2717e <= 0) {
            return false;
        }
        if (c0618d.f2717e > System.currentTimeMillis()) {
            return true;
        }
        c0618d.f2717e = 0;
        return false;
    }

    /* renamed from: k */
    public final boolean mo502k() {
        C0618d c0618d = this.f2740N;
        return c0618d.f2716d || c0618d.f2715c;
    }

    /* renamed from: l */
    public final float mo483l() {
        float l = super.mo483l();
        if (this.f2745v.f2728a != null) {
            l = Math.max(l, this.f2745v.f2728a.mo518e());
        }
        if (this.f2745v.f2729b != null) {
            l = Math.max(l, this.f2745v.f2729b.mo518e());
        }
        return this.f2745v.f2731d != null ? Math.max(l, this.f2745v.f2731d.mo518e()) : l;
    }

    /* renamed from: m */
    public final float mo484m() {
        float m = super.mo484m();
        if (this.f2745v.f2728a != null) {
            m = Math.max(m, this.f2745v.f2728a.mo519f());
        }
        if (this.f2745v.f2729b != null) {
            m = Math.max(m, this.f2745v.f2729b.mo519f());
        }
        return this.f2745v.f2731d != null ? Math.max(m, this.f2745v.f2731d.mo519f()) : m;
    }

    /* renamed from: n */
    public final float mo485n() {
        return mo483l();
    }

    /* renamed from: o */
    public final float mo486o() {
        return mo484m();
    }
}
