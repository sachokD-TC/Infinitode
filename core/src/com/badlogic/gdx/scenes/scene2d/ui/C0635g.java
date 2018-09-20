package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0444a;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.C0522d;
import com.badlogic.gdx.math.C0549f;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.p017d.C0368a;
import com.badlogic.gdx.scenes.scene2d.C0586c;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0607f;
import com.badlogic.gdx.scenes.scene2d.C0609g;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputEvent.Type;
import com.badlogic.gdx.scenes.scene2d.utils.C0604e;
import com.badlogic.gdx.scenes.scene2d.utils.C0616g;
import com.badlogic.gdx.scenes.scene2d.utils.C0631a;
import com.badlogic.gdx.scenes.scene2d.utils.C0655f;
import com.badlogic.gdx.scenes.scene2d.utils.C0661i;

/* renamed from: com.badlogic.gdx.scenes.scene2d.ui.g */
public final class C0635g extends C0617k {
    /* renamed from: A */
    float f2851A;
    /* renamed from: B */
    float f2852B;
    /* renamed from: C */
    float f2853C;
    /* renamed from: D */
    float f2854D;
    /* renamed from: E */
    float f2855E;
    /* renamed from: F */
    float f2856F;
    /* renamed from: G */
    boolean f2857G;
    /* renamed from: H */
    boolean f2858H;
    /* renamed from: I */
    final Vector2 f2859I = new Vector2();
    /* renamed from: J */
    float f2860J;
    /* renamed from: K */
    float f2861K;
    /* renamed from: L */
    float f2862L;
    /* renamed from: M */
    float f2863M = 1.0f;
    /* renamed from: N */
    float f2864N;
    /* renamed from: O */
    float f2865O = 1.0f;
    /* renamed from: P */
    boolean f2866P = true;
    /* renamed from: Q */
    boolean f2867Q = true;
    /* renamed from: R */
    float f2868R;
    /* renamed from: S */
    float f2869S;
    /* renamed from: T */
    float f2870T;
    /* renamed from: U */
    float f2871U = 1.0f;
    /* renamed from: V */
    boolean f2872V;
    /* renamed from: W */
    boolean f2873W;
    /* renamed from: X */
    int f2874X = -1;
    /* renamed from: Z */
    private C0634a f2875Z;
    private C0602b aa;
    private final Rectangle ab = new Rectangle();
    private final Rectangle ac = new Rectangle();
    private final Rectangle ad = new Rectangle();
    private C0631a ae;
    private boolean af = true;
    private boolean ag = true;
    private boolean ah = true;
    private boolean ai = true;
    private float aj = 50.0f;
    private float ak = 30.0f;
    private float al = 200.0f;
    private boolean am;
    private boolean an;
    private boolean ao = true;
    private boolean ap;
    private boolean aq = true;
    /* renamed from: s */
    final Rectangle f2876s = new Rectangle();
    /* renamed from: t */
    final Rectangle f2877t = new Rectangle();
    /* renamed from: u */
    final Rectangle f2878u = new Rectangle();
    /* renamed from: v */
    final Rectangle f2879v = new Rectangle();
    /* renamed from: w */
    boolean f2880w;
    /* renamed from: x */
    boolean f2881x;
    /* renamed from: y */
    boolean f2882y = true;
    /* renamed from: z */
    boolean f2883z = true;

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.g$1 */
    class C06301 extends C0607f {
        /* renamed from: a */
        final /* synthetic */ C0635g f2835a;
        /* renamed from: b */
        private float f2836b;

        C06301(C0635g c0635g) {
            this.f2835a = c0635g;
        }

        /* renamed from: a */
        public final void mo496a(InputEvent inputEvent, float f, float f2, int i) {
            if (i == this.f2835a.f2874X) {
                float f3;
                float f4;
                C0635g c0635g;
                if (this.f2835a.f2857G) {
                    f3 = (f - this.f2835a.f2859I.f2337x) + this.f2836b;
                    this.f2836b = f3;
                    f3 = Math.min((this.f2835a.f2876s.f2332x + this.f2835a.f2876s.width) - this.f2835a.f2878u.width, Math.max(this.f2835a.f2876s.f2332x, f3));
                    f4 = this.f2835a.f2876s.width - this.f2835a.f2878u.width;
                    if (f4 != 0.0f) {
                        c0635g = this.f2835a;
                        f3 = (f3 - this.f2835a.f2876s.f2332x) / f4;
                        c0635g.f2851A = C0549f.m1761a(f3, 0.0f, 1.0f) * c0635g.f2855E;
                    }
                    this.f2835a.f2859I.m1701a(f, f2);
                } else if (this.f2835a.f2858H) {
                    f3 = (f2 - this.f2835a.f2859I.f2338y) + this.f2836b;
                    this.f2836b = f3;
                    f3 = Math.min((this.f2835a.f2877t.f2333y + this.f2835a.f2877t.height) - this.f2835a.f2879v.height, Math.max(this.f2835a.f2877t.f2333y, f3));
                    f4 = this.f2835a.f2877t.height - this.f2835a.f2879v.height;
                    if (f4 != 0.0f) {
                        c0635g = this.f2835a;
                        f3 = 1.0f - ((f3 - this.f2835a.f2877t.f2333y) / f4);
                        c0635g.f2852B = C0549f.m1761a(f3, 0.0f, 1.0f) * c0635g.f2856F;
                    }
                    this.f2835a.f2859I.m1701a(f, f2);
                }
            }
        }

        /* renamed from: a */
        public final boolean mo506a() {
            if (!this.f2835a.f2867Q) {
                this.f2835a.c_();
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
            int i3 = -1;
            if (this.f2835a.f2874X != -1) {
                return false;
            }
            if (i == 0 && i2 != 0) {
                return false;
            }
            this.f2835a.f2607a.m2014b(this.f2835a);
            if (!this.f2835a.f2867Q) {
                this.f2835a.c_();
            }
            if (this.f2835a.f2862L == 0.0f) {
                return false;
            }
            C0635g c0635g;
            float f3;
            float f4;
            if (this.f2835a.f2880w && this.f2835a.f2876s.m1699a(f, f2)) {
                inputEvent.f2557g = true;
                this.f2835a.c_();
                if (this.f2835a.f2878u.m1699a(f, f2)) {
                    this.f2835a.f2859I.m1701a(f, f2);
                    this.f2836b = this.f2835a.f2878u.f2332x;
                    this.f2835a.f2857G = true;
                    this.f2835a.f2874X = i;
                    return true;
                }
                c0635g = this.f2835a;
                f3 = this.f2835a.f2851A;
                f4 = this.f2835a.f2860J;
                if (f >= this.f2835a.f2878u.f2332x) {
                    i3 = 1;
                }
                c0635g.m2161g((((float) i3) * f4) + f3);
                return true;
            } else if (!this.f2835a.f2881x || !this.f2835a.f2877t.m1699a(f, f2)) {
                return false;
            } else {
                inputEvent.f2557g = true;
                this.f2835a.c_();
                if (this.f2835a.f2879v.m1699a(f, f2)) {
                    this.f2835a.f2859I.m1701a(f, f2);
                    this.f2836b = this.f2835a.f2879v.f2333y;
                    this.f2835a.f2858H = true;
                    this.f2835a.f2874X = i;
                    return true;
                }
                c0635g = this.f2835a;
                f3 = this.f2835a.f2852B;
                f4 = this.f2835a.f2861K;
                if (f2 < this.f2835a.f2879v.f2333y) {
                    i3 = 1;
                }
                c0635g.m2162h((((float) i3) * f4) + f3);
                return true;
            }
        }

        /* renamed from: b */
        public final void mo499b(InputEvent inputEvent, float f, float f2, int i, int i2) {
            if (i == this.f2835a.f2874X) {
                this.f2835a.m2168p();
            }
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.g$2 */
    class C06322 extends C0631a {
        /* renamed from: a */
        final /* synthetic */ C0635g f2843a;

        C06322(C0635g c0635g) {
            this.f2843a = c0635g;
        }

        /* renamed from: a */
        public final void mo507a(float f, float f2) {
            this.f2843a.c_();
            C0635g c0635g = this.f2843a;
            c0635g.f2851A -= f;
            c0635g = this.f2843a;
            c0635g.f2852B += f2;
            this.f2843a.m2169q();
            if (!this.f2843a.f2866P) {
                return;
            }
            if ((this.f2843a.f2880w && f != 0.0f) || (this.f2843a.f2881x && f2 != 0.0f)) {
                this.f2843a.m2163k();
            }
        }

        /* renamed from: a */
        public final boolean mo477a(C0586c c0586c) {
            if (!super.mo477a(c0586c)) {
                return false;
            }
            if (((InputEvent) c0586c).f2559i == Type.touchDown) {
                this.f2843a.f2870T = 0.0f;
            }
            return true;
        }

        /* renamed from: b */
        public final void mo508b(float f, float f2) {
            if (Math.abs(f) > 150.0f && this.f2843a.f2880w) {
                this.f2843a.f2870T = this.f2843a.f2871U;
                this.f2843a.f2868R = f;
                if (this.f2843a.f2866P) {
                    this.f2843a.m2163k();
                }
            }
            if (Math.abs(f2) > 150.0f && this.f2843a.f2881x) {
                this.f2843a.f2870T = this.f2843a.f2871U;
                this.f2843a.f2869S = -f2;
                if (this.f2843a.f2866P) {
                    this.f2843a.m2163k();
                }
            }
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.g$3 */
    class C06333 extends C0607f {
        /* renamed from: a */
        final /* synthetic */ C0635g f2844a;

        C06333(C0635g c0635g) {
            this.f2844a = c0635g;
        }

        /* renamed from: c */
        public final boolean mo509c(int i) {
            this.f2844a.c_();
            C0635g c0635g;
            float f;
            C0635g c0635g2;
            if (this.f2844a.f2881x) {
                c0635g = this.f2844a;
                f = this.f2844a.f2852B;
                c0635g2 = this.f2844a;
                c0635g.m2162h(f + (Math.min(c0635g2.f2861K, Math.max(c0635g2.f2861K * 0.9f, c0635g2.f2856F * 0.1f) / 4.0f) * ((float) i)));
            } else if (!this.f2844a.f2880w) {
                return false;
            } else {
                c0635g = this.f2844a;
                f = this.f2844a.f2851A;
                c0635g2 = this.f2844a;
                c0635g.m2161g(f + (Math.min(c0635g2.f2860J, Math.max(c0635g2.f2860J * 0.9f, c0635g2.f2855E * 0.1f) / 4.0f) * ((float) i)));
            }
            return true;
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.g$a */
    public static class C0634a {
        /* renamed from: a */
        public C0655f f2845a;
        /* renamed from: b */
        public C0655f f2846b;
        /* renamed from: c */
        public C0655f f2847c;
        /* renamed from: d */
        public C0655f f2848d;
        /* renamed from: e */
        public C0655f f2849e;
        /* renamed from: f */
        public C0655f f2850f;
    }

    public C0635g(C0602b c0602b, C0634a c0634a) {
        this.f2875Z = c0634a;
        m2153d(c0602b);
        m1956c(150.0f, 150.0f);
        C06301 c06301 = new C06301(this);
        if (!this.f2609c.m2302b((Object) c06301)) {
            this.f2609c.m2296a((Object) c06301);
        }
        this.ae = new C06322(this);
        m1947a(this.ae);
        m1947a(new C06333(this));
    }

    /* renamed from: d */
    private void m2153d(C0602b c0602b) {
        if (this.aa == this) {
            throw new IllegalArgumentException("widget cannot be the ScrollPane.");
        }
        if (this.aa != null) {
            super.mo490c(this.aa);
        }
        this.aa = c0602b;
        if (this.aa != null) {
            super.mo510b(this.aa);
        }
    }

    /* renamed from: a */
    public final C0602b mo469a(float f, float f2, boolean z) {
        return (f < 0.0f || f >= this.f2615i || f2 < 0.0f || f2 >= this.f2616j) ? null : (this.f2880w && this.f2876s.m1699a(f, f2)) ? this : (this.f2881x && this.f2877t.m1699a(f, f2)) ? this : super.mo469a(f, f2, z);
    }

    /* renamed from: a */
    public final void mo470a(float f) {
        super.mo470a(f);
        boolean z = this.ae.f2839d.f1306c;
        Object obj = null;
        if (!(this.f2862L <= 0.0f || !this.af || z || this.f2857G || this.f2858H)) {
            this.f2864N -= f;
            if (this.f2864N <= 0.0f) {
                this.f2862L = Math.max(0.0f, this.f2862L - f);
            }
            obj = 1;
        }
        if (this.f2870T > 0.0f) {
            c_();
            float f2 = this.f2870T / this.f2871U;
            this.f2851A -= (this.f2868R * f2) * f;
            this.f2852B -= (f2 * this.f2869S) * f;
            m2169q();
            if (this.f2851A == (-this.aj)) {
                this.f2868R = 0.0f;
            }
            if (this.f2851A >= this.f2855E + this.aj) {
                this.f2868R = 0.0f;
            }
            if (this.f2852B == (-this.aj)) {
                this.f2869S = 0.0f;
            }
            if (this.f2852B >= this.f2856F + this.aj) {
                this.f2869S = 0.0f;
            }
            this.f2870T -= f;
            if (this.f2870T <= 0.0f) {
                this.f2868R = 0.0f;
                this.f2869S = 0.0f;
            }
            obj = 1;
        }
        if (!this.ag || this.f2870T > 0.0f || z || ((this.f2857G && (!this.f2880w || this.f2855E / (this.f2876s.width - this.f2878u.width) <= this.f2860J * 0.1f)) || (this.f2858H && (!this.f2881x || this.f2856F / (this.f2877t.height - this.f2879v.height) <= this.f2861K * 0.1f)))) {
            if (this.f2853C != this.f2851A) {
                this.f2853C = this.f2851A;
            }
            if (this.f2854D != this.f2852B) {
                this.f2854D = this.f2852B;
            }
        } else {
            if (this.f2853C != this.f2851A) {
                if (this.f2853C < this.f2851A) {
                    this.f2853C = Math.min(this.f2851A, this.f2853C + Math.max(200.0f * f, ((this.f2851A - this.f2853C) * 7.0f) * f));
                } else {
                    this.f2853C = Math.max(this.f2851A, this.f2853C - Math.max(200.0f * f, ((this.f2853C - this.f2851A) * 7.0f) * f));
                }
                obj = 1;
            }
            if (this.f2854D != this.f2852B) {
                if (this.f2854D < this.f2852B) {
                    this.f2854D = Math.min(this.f2852B, this.f2854D + Math.max(200.0f * f, ((this.f2852B - this.f2854D) * 7.0f) * f));
                } else {
                    this.f2854D = Math.max(this.f2852B, this.f2854D - Math.max(200.0f * f, ((this.f2854D - this.f2852B) * 7.0f) * f));
                }
                obj = 1;
            }
        }
        if (!z) {
            int i;
            if (this.ah && this.f2880w) {
                if (this.f2851A < 0.0f) {
                    c_();
                    this.f2851A += (this.ak + (((this.al - this.ak) * (-this.f2851A)) / this.aj)) * f;
                    if (this.f2851A > 0.0f) {
                        this.f2851A = 0.0f;
                    }
                    obj = 1;
                } else if (this.f2851A > this.f2855E) {
                    c_();
                    this.f2851A -= (this.ak + (((this.al - this.ak) * (-(this.f2855E - this.f2851A))) / this.aj)) * f;
                    if (this.f2851A < this.f2855E) {
                        this.f2851A = this.f2855E;
                    }
                    i = 1;
                }
            }
            if (this.ai && this.f2881x) {
                if (this.f2852B < 0.0f) {
                    c_();
                    this.f2852B += (this.ak + (((this.al - this.ak) * (-this.f2852B)) / this.aj)) * f;
                    if (this.f2852B > 0.0f) {
                        this.f2852B = 0.0f;
                    }
                    obj = 1;
                } else if (this.f2852B > this.f2856F) {
                    c_();
                    this.f2852B -= (this.ak + (((this.al - this.ak) * (-(this.f2856F - this.f2852B))) / this.aj)) * f;
                    if (this.f2852B < this.f2856F) {
                        this.f2852B = this.f2856F;
                    }
                    i = 1;
                }
            }
        }
        if (obj != null) {
            C0609g c0609g = this.f2607a;
            if (c0609g != null && c0609g.f2646g) {
                Gdx.graphics.mo300i();
            }
        }
    }

    /* renamed from: a */
    public final void mo471a(C0444a c0444a, float f) {
        if (this.aa != null) {
            b_();
            m1971a(c0444a, m1983f());
            if (this.f2880w) {
                this.f2878u.f2332x = this.f2876s.f2332x + ((float) ((int) ((this.f2876s.width - this.f2878u.width) * C0549f.m1761a(this.f2853C / this.f2855E, 0.0f, 1.0f))));
            }
            if (this.f2881x) {
                this.f2879v.f2333y = this.f2877t.f2333y + ((float) ((int) ((this.f2877t.height - this.f2879v.height) * (1.0f - C0549f.m1761a(this.f2854D / this.f2856F, 0.0f, 1.0f)))));
            }
            float f2 = this.ab.f2333y;
            f2 = !this.f2881x ? f2 - ((float) ((int) this.f2856F)) : f2 - ((float) ((int) (this.f2856F - this.f2854D)));
            float f3 = this.ab.f2332x;
            if (this.f2880w) {
                f3 -= (float) ((int) this.f2853C);
            }
            if (!this.af && this.ap) {
                float f4;
                if (this.f2880w && this.f2883z) {
                    f4 = this.f2875Z.f2848d != null ? this.f2875Z.f2848d.mo519f() : 0.0f;
                    if (this.f2875Z.f2847c != null) {
                        f4 = Math.max(f4, this.f2875Z.f2847c.mo519f());
                    }
                    f2 += f4;
                }
                if (this.f2881x && !this.f2882y) {
                    f4 = this.f2875Z.f2848d != null ? this.f2875Z.f2848d.mo518e() : 0.0f;
                    if (this.f2875Z.f2847c != null) {
                        f4 = Math.max(f4, this.f2875Z.f2847c.mo518e());
                    }
                    f3 += f4;
                }
            }
            this.aa.m1935a(f3, f2);
            if (this.aa instanceof C0604e) {
                this.ac.f2332x = (-this.aa.f2613g) + this.ab.f2332x;
                this.ac.f2333y = (-this.aa.f2614h) + this.ab.f2333y;
                this.ac.width = this.ab.width;
                this.ac.height = this.ab.height;
                ((C0604e) this.aa).mo473a(this.ac);
            }
            C0430b c0430b = this.f2622p;
            c0444a.mo367a(c0430b.f1644I, c0430b.f1645J, c0430b.f1646K, c0430b.f1647L * f);
            if (this.f2875Z.f2845a != null) {
                this.f2875Z.f2845a.mo514a(c0444a, 0.0f, 0.0f, this.f2615i, this.f2616j);
            }
            this.f2607a.m2003a(this.ab, this.ad);
            c0444a.mo377f();
            if (C0661i.m2233a(this.ad)) {
                m1977b(c0444a, f);
                c0444a.mo377f();
                C0661i.m2231a();
            }
            f2 = (c0430b.f1647L * f) * C0522d.f2389e.mo430a(this.f2862L / this.f2863M);
            if (f2 > 0.0f) {
                c0444a.mo367a(c0430b.f1644I, c0430b.f1645J, c0430b.f1646K, f2);
                if (this.f2880w && this.f2881x && this.f2875Z.f2846b != null) {
                    this.f2875Z.f2846b.mo514a(c0444a, this.f2876s.width + this.f2876s.f2332x, this.f2876s.f2333y, this.f2877t.width, this.f2877t.f2333y);
                }
                if (this.f2880w) {
                    if (this.f2875Z.f2847c != null) {
                        this.f2875Z.f2847c.mo514a(c0444a, this.f2876s.f2332x, this.f2876s.f2333y, this.f2876s.width, this.f2876s.height);
                    }
                    if (this.f2875Z.f2848d != null) {
                        this.f2875Z.f2848d.mo514a(c0444a, this.f2878u.f2332x, this.f2878u.f2333y, this.f2878u.width, this.f2878u.height);
                    }
                }
                if (this.f2881x) {
                    if (this.f2875Z.f2849e != null) {
                        this.f2875Z.f2849e.mo514a(c0444a, this.f2877t.f2332x, this.f2877t.f2333y, this.f2877t.width, this.f2877t.height);
                    }
                    if (this.f2875Z.f2850f != null) {
                        this.f2875Z.f2850f.mo514a(c0444a, this.f2879v.f2332x, this.f2879v.f2333y, this.f2879v.width, this.f2879v.height);
                    }
                }
            }
            m1969a(c0444a);
        }
    }

    /* renamed from: a */
    public final void mo472a(ShapeRenderer shapeRenderer) {
        shapeRenderer.m1463c();
        m1973a(shapeRenderer, m1983f());
        if (C0661i.m2233a(this.ad)) {
            m1980c(shapeRenderer);
            C0661i.m2231a();
        }
        m1982d(shapeRenderer);
    }

    /* renamed from: a */
    public final boolean mo488a(C0602b c0602b, boolean z) {
        if (c0602b == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        } else if (c0602b != this.aa) {
            return false;
        } else {
            this.aa = null;
            return super.mo488a(c0602b, z);
        }
    }

    /* renamed from: b */
    public final void mo510b(C0602b c0602b) {
        throw new UnsupportedOperationException("Use ScrollPane#setWidget.");
    }

    /* renamed from: c */
    public final boolean mo490c(C0602b c0602b) {
        if (c0602b == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        } else if (c0602b != this.aa) {
            return false;
        } else {
            m2153d(null);
            return true;
        }
    }

    final void c_() {
        this.f2862L = this.f2863M;
        this.f2864N = this.f2865O;
    }

    /* renamed from: g */
    public final void m2161g(float f) {
        this.f2851A = C0549f.m1761a(f, 0.0f, this.f2855E);
    }

    /* renamed from: h */
    public final void m2162h(float f) {
        this.f2852B = C0549f.m1761a(f, 0.0f, this.f2856F);
    }

    /* renamed from: k */
    public final void m2163k() {
        C0609g c0609g = this.f2607a;
        if (c0609g != null) {
            c0609g.m2005a(this.ae, (C0602b) this);
        }
    }

    /* renamed from: l */
    public final float mo483l() {
        if (!(this.aa instanceof C0616g)) {
            return 150.0f;
        }
        float l = ((C0616g) this.aa).mo483l();
        if (this.f2875Z.f2845a != null) {
            l += this.f2875Z.f2845a.mo513a() + this.f2875Z.f2845a.mo515b();
        }
        if (!this.an) {
            return l;
        }
        float f = 0.0f;
        if (this.f2875Z.f2850f != null) {
            f = this.f2875Z.f2850f.mo518e();
        }
        if (this.f2875Z.f2849e != null) {
            f = Math.max(f, this.f2875Z.f2849e.mo518e());
        }
        return l + f;
    }

    /* renamed from: m */
    public final float mo484m() {
        if (!(this.aa instanceof C0616g)) {
            return 150.0f;
        }
        float m = ((C0616g) this.aa).mo484m();
        if (this.f2875Z.f2845a != null) {
            m += this.f2875Z.f2845a.mo516c() + this.f2875Z.f2845a.mo517d();
        }
        if (!this.am) {
            return m;
        }
        float f = 0.0f;
        if (this.f2875Z.f2848d != null) {
            f = this.f2875Z.f2848d.mo519f();
        }
        if (this.f2875Z.f2847c != null) {
            f = Math.max(f, this.f2875Z.f2847c.mo519f());
        }
        return m + f;
    }

    /* renamed from: n */
    public final float mo485n() {
        return 0.0f;
    }

    /* renamed from: o */
    public final float mo486o() {
        return 0.0f;
    }

    /* renamed from: p */
    public final void m2168p() {
        this.f2874X = -1;
        this.f2857G = false;
        this.f2858H = false;
        C0368a c0368a = this.ae.f2839d;
        c0368a.f1308e.m1024a();
        c0368a.f1305b = true;
    }

    /* renamed from: q */
    final void m2169q() {
        if (this.ao) {
            this.f2851A = this.ah ? C0549f.m1761a(this.f2851A, -this.aj, this.f2855E + this.aj) : C0549f.m1761a(this.f2851A, 0.0f, this.f2855E);
            this.f2852B = this.ai ? C0549f.m1761a(this.f2852B, -this.aj, this.f2856F + this.aj) : C0549f.m1761a(this.f2852B, 0.0f, this.f2856F);
        }
    }

    /* renamed from: r */
    public final void mo494r() {
        float a;
        float b;
        float c;
        float d;
        float f;
        C0655f c0655f = this.f2875Z.f2845a;
        C0655f c0655f2 = this.f2875Z.f2848d;
        C0655f c0655f3 = this.f2875Z.f2850f;
        if (c0655f != null) {
            a = c0655f.mo513a();
            b = c0655f.mo515b();
            c = c0655f.mo516c();
            d = c0655f.mo517d();
            f = a;
            a = b;
            b = c;
            c = d;
        } else {
            f = 0.0f;
            a = 0.0f;
            b = 0.0f;
            c = 0.0f;
        }
        float f2 = this.f2615i;
        float f3 = this.f2616j;
        d = 0.0f;
        if (c0655f2 != null) {
            d = c0655f2.mo519f();
        }
        float max = this.f2875Z.f2847c != null ? Math.max(d, this.f2875Z.f2847c.mo519f()) : d;
        d = 0.0f;
        if (c0655f3 != null) {
            d = c0655f3.mo518e();
        }
        float max2 = this.f2875Z.f2849e != null ? Math.max(d, this.f2875Z.f2849e.mo518e()) : d;
        this.f2860J = (f2 - f) - a;
        this.f2861K = (f3 - b) - c;
        if (this.aa != null) {
            float l;
            if (this.aa instanceof C0616g) {
                C0616g c0616g = (C0616g) this.aa;
                l = c0616g.mo483l();
                d = c0616g.mo484m();
            } else {
                l = this.aa.f2615i;
                d = this.aa.f2616j;
            }
            boolean z = this.am || (l > this.f2860J && !this.f2872V);
            this.f2880w = z;
            z = this.an || (d > this.f2861K && !this.f2873W);
            this.f2881x = z;
            z = this.af;
            if (!z) {
                if (this.f2881x) {
                    this.f2860J -= max2;
                    if (!(this.f2880w || l <= this.f2860J || this.f2872V)) {
                        this.f2880w = true;
                    }
                }
                if (this.f2880w) {
                    this.f2861K -= max;
                    if (!(this.f2881x || d <= this.f2861K || this.f2873W)) {
                        this.f2881x = true;
                        this.f2860J -= max2;
                    }
                }
            }
            this.ab.m1698a(f, c, this.f2860J, this.f2861K);
            if (z) {
                if (this.f2880w && this.f2881x) {
                    this.f2861K -= max;
                    this.f2860J -= max2;
                }
            } else if (this.ap) {
                if (this.f2880w) {
                    r14 = this.ab;
                    r14.height += max;
                }
                if (this.f2881x) {
                    r14 = this.ab;
                    r14.width += max2;
                }
            } else {
                if (this.f2880w && this.f2883z) {
                    r14 = this.ab;
                    r14.f2333y += max;
                }
                if (this.f2881x && !this.f2882y) {
                    r14 = this.ab;
                    r14.f2332x += max2;
                }
            }
            l = this.f2872V ? this.f2860J : Math.max(this.f2860J, l);
            d = this.f2873W ? this.f2861K : Math.max(this.f2861K, d);
            this.f2855E = l - this.f2860J;
            this.f2856F = d - this.f2861K;
            if (z && this.f2880w && this.f2881x) {
                this.f2856F -= max;
                this.f2855E -= max2;
            }
            this.f2851A = C0549f.m1761a(this.f2851A, 0.0f, this.f2855E);
            this.f2852B = C0549f.m1761a(this.f2852B, 0.0f, this.f2856F);
            if (this.f2880w) {
                if (c0655f2 != null) {
                    float f4 = this.f2875Z.f2847c != null ? this.f2875Z.f2847c.mo519f() : c0655f2.mo519f();
                    this.f2876s.m1698a(this.f2882y ? f : max2 + f, this.f2883z ? c : (f3 - b) - f4, this.f2860J, f4);
                    if (this.aq) {
                        this.f2878u.width = Math.max(c0655f2.mo518e(), (float) ((int) ((this.f2876s.width * this.f2860J) / l)));
                    } else {
                        this.f2878u.width = c0655f2.mo518e();
                    }
                    this.f2878u.height = c0655f2.mo519f();
                    this.f2878u.f2332x = this.f2876s.f2332x + ((float) ((int) ((this.f2876s.width - this.f2878u.width) * C0549f.m1761a(this.f2851A / this.f2855E, 0.0f, 1.0f))));
                    this.f2878u.f2333y = this.f2876s.f2333y;
                } else {
                    this.f2876s.m1698a(0.0f, 0.0f, 0.0f, 0.0f);
                    this.f2878u.m1698a(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            if (this.f2881x) {
                if (c0655f3 != null) {
                    max2 = this.f2875Z.f2849e != null ? this.f2875Z.f2849e.mo518e() : c0655f3.mo518e();
                    if (this.f2883z) {
                        c = (f3 - b) - this.f2861K;
                    }
                    this.f2877t.m1698a(this.f2882y ? (f2 - a) - max2 : f, c, max2, this.f2861K);
                    this.f2879v.width = c0655f3.mo518e();
                    if (this.aq) {
                        this.f2879v.height = Math.max(c0655f3.mo519f(), (float) ((int) ((this.f2877t.height * this.f2861K) / d)));
                    } else {
                        this.f2879v.height = c0655f3.mo519f();
                    }
                    if (this.f2882y) {
                        this.f2879v.f2332x = (f2 - a) - c0655f3.mo518e();
                    } else {
                        this.f2879v.f2332x = f;
                    }
                    this.f2879v.f2333y = this.f2877t.f2333y + ((float) ((int) ((this.f2877t.height - this.f2879v.height) * (1.0f - C0549f.m1761a(this.f2852B / this.f2856F, 0.0f, 1.0f)))));
                } else {
                    this.f2877t.m1698a(0.0f, 0.0f, 0.0f, 0.0f);
                    this.f2879v.m1698a(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            this.aa.m1956c(l, d);
            if (this.aa instanceof C0616g) {
                ((C0616g) this.aa).b_();
            }
        }
    }
}
