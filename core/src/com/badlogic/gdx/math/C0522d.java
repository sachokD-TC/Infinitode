package com.badlogic.gdx.math;

/* renamed from: com.badlogic.gdx.math.d */
public abstract class C0522d {
    /* renamed from: A */
    public static final C0540i f2369A = new C0540i(10.0f);
    /* renamed from: B */
    public static final C0538g f2370B = new C0538g(5.0f);
    /* renamed from: C */
    public static final C0539h f2371C = new C0539h(5.0f);
    /* renamed from: D */
    public static final C0540i f2372D = new C0540i(5.0f);
    /* renamed from: E */
    public static final C0522d f2373E = new C05264();
    /* renamed from: F */
    public static final C0522d f2374F = new C05275();
    /* renamed from: G */
    public static final C0522d f2375G = new C05286();
    /* renamed from: H */
    public static final C0535d f2376H = new C0535d(7);
    /* renamed from: I */
    public static final C0536e f2377I = new C0536e();
    /* renamed from: J */
    public static final C0537f f2378J = new C0537f();
    /* renamed from: K */
    public static final C0544m f2379K = new C0544m();
    /* renamed from: L */
    public static final C0545n f2380L = new C0545n();
    /* renamed from: M */
    public static final C0546o f2381M = new C0546o();
    /* renamed from: N */
    public static final C0533a f2382N = new C0533a();
    /* renamed from: O */
    public static final C0534b f2383O = new C0534b();
    /* renamed from: P */
    public static final C0532c f2384P = new C0532c();
    /* renamed from: a */
    public static final C0522d f2385a = new C05231();
    /* renamed from: b */
    public static final C0522d f2386b = new C05297();
    /* renamed from: c */
    public static final C0522d f2387c = new C05308();
    /* renamed from: d */
    public static final C0522d f2388d;
    /* renamed from: e */
    public static final C0522d f2389e;
    /* renamed from: f */
    public static final C0541j f2390f = new C0541j(2);
    /* renamed from: g */
    public static final C0542k f2391g = new C0542k(2);
    /* renamed from: h */
    public static final C0543l f2392h = new C0543l(2);
    /* renamed from: i */
    public static final C0522d f2393i = new C0522d() {
        /* renamed from: a */
        public final float mo430a(float f) {
            return (float) Math.sqrt((double) f);
        }
    };
    /* renamed from: j */
    public static final C0522d f2394j = new C0522d() {
        /* renamed from: a */
        public final float mo430a(float f) {
            return 1.0f - ((float) Math.sqrt((double) (-(f - 1.0f))));
        }
    };
    /* renamed from: k */
    public static final C0541j f2395k = new C0541j(3);
    /* renamed from: l */
    public static final C0542k f2396l = new C0542k(3);
    /* renamed from: m */
    public static final C0543l f2397m = new C0543l(3);
    /* renamed from: n */
    public static final C0522d f2398n = new C0522d() {
        /* renamed from: a */
        public final float mo430a(float f) {
            return (float) Math.cbrt((double) f);
        }
    };
    /* renamed from: o */
    public static final C0522d f2399o = new C0522d() {
        /* renamed from: a */
        public final float mo430a(float f) {
            return 1.0f - ((float) Math.cbrt((double) (-(f - 1.0f))));
        }
    };
    /* renamed from: p */
    public static final C0541j f2400p = new C0541j(4);
    /* renamed from: q */
    public static final C0542k f2401q = new C0542k(4);
    /* renamed from: r */
    public static final C0543l f2402r = new C0543l(4);
    /* renamed from: s */
    public static final C0541j f2403s = new C0541j(5);
    /* renamed from: t */
    public static final C0542k f2404t = new C0542k(5);
    /* renamed from: u */
    public static final C0543l f2405u = new C0543l(5);
    /* renamed from: v */
    public static final C0522d f2406v = new C0522d() {
        /* renamed from: a */
        public final float mo430a(float f) {
            return (1.0f - C0549f.m1766b(3.1415927f * f)) / 2.0f;
        }
    };
    /* renamed from: w */
    public static final C0522d f2407w = new C05242();
    /* renamed from: x */
    public static final C0522d f2408x = new C05253();
    /* renamed from: y */
    public static final C0538g f2409y = new C0538g(10.0f);
    /* renamed from: z */
    public static final C0539h f2410z = new C0539h(10.0f);

    /* renamed from: com.badlogic.gdx.math.d$1 */
    static class C05231 extends C0522d {
        C05231() {
        }

        /* renamed from: a */
        public final float mo430a(float f) {
            return f;
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$2 */
    static class C05242 extends C0522d {
        C05242() {
        }

        /* renamed from: a */
        public final float mo430a(float f) {
            return 1.0f - C0549f.m1766b((3.1415927f * f) / 2.0f);
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$3 */
    static class C05253 extends C0522d {
        C05253() {
        }

        /* renamed from: a */
        public final float mo430a(float f) {
            return C0549f.m1760a((3.1415927f * f) / 2.0f);
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$4 */
    static class C05264 extends C0522d {
        C05264() {
        }

        /* renamed from: a */
        public final float mo430a(float f) {
            if (f <= 0.5f) {
                float f2 = f * 2.0f;
                return (1.0f - ((float) Math.sqrt((double) (1.0f - (f2 * f2))))) / 2.0f;
            }
            f2 = (f - 1.0f) * 2.0f;
            return (((float) Math.sqrt((double) (1.0f - (f2 * f2)))) + 1.0f) / 2.0f;
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$5 */
    static class C05275 extends C0522d {
        C05275() {
        }

        /* renamed from: a */
        public final float mo430a(float f) {
            return 1.0f - ((float) Math.sqrt((double) (1.0f - (f * f))));
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$6 */
    static class C05286 extends C0522d {
        C05286() {
        }

        /* renamed from: a */
        public final float mo430a(float f) {
            float f2 = f - 1.0f;
            return (float) Math.sqrt((double) (1.0f - (f2 * f2)));
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$7 */
    static class C05297 extends C0522d {
        C05297() {
        }

        /* renamed from: a */
        public final float mo430a(float f) {
            return (f * f) * (3.0f - (2.0f * f));
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$8 */
    static class C05308 extends C0522d {
        C05308() {
        }

        /* renamed from: a */
        public final float mo430a(float f) {
            float f2 = (f * f) * (3.0f - (2.0f * f));
            return (3.0f - (f2 * 2.0f)) * (f2 * f2);
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$9 */
    static class C05319 extends C0522d {
        C05319() {
        }

        /* renamed from: a */
        public final float mo430a(float f) {
            return ((f * f) * f) * ((((6.0f * f) - 15.0f) * f) + 10.0f);
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$c */
    public static class C0532c extends C0522d {
        /* renamed from: Q */
        final float[] f2411Q = new float[4];
        /* renamed from: R */
        final float[] f2412R = new float[4];

        public C0532c() {
            this.f2412R[0] = 1.0f;
            this.f2411Q[0] = 0.34f;
            this.f2411Q[1] = 0.34f;
            this.f2411Q[2] = 0.2f;
            this.f2411Q[3] = 0.15f;
            this.f2412R[1] = 0.26f;
            this.f2412R[2] = 0.11f;
            this.f2412R[3] = 0.03f;
            float[] fArr = this.f2411Q;
            fArr[0] = fArr[0] * 2.0f;
        }

        /* renamed from: a */
        public float mo430a(float f) {
            float f2 = 0.0f;
            if (f == 1.0f) {
                return 1.0f;
            }
            float f3 = (this.f2411Q[0] / 2.0f) + f;
            int length = this.f2411Q.length;
            float f4 = f3;
            float f5 = 0.0f;
            for (int i = 0; i < length; i++) {
                f5 = this.f2411Q[i];
                if (f4 <= f5) {
                    f2 = this.f2412R[i];
                    break;
                }
                f4 -= f5;
            }
            f3 = f4 / f5;
            f2 = (f2 * (4.0f / f5)) * f3;
            return 1.0f - ((f2 - (f3 * f2)) * f5);
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$a */
    public static class C0533a extends C0532c {
        /* renamed from: b */
        private float m1743b(float f) {
            float f2 = (this.Q[0] / 2.0f) + f;
            return f2 < this.Q[0] ? (f2 / (this.Q[0] / 2.0f)) - 1.0f : super.mo430a(f);
        }

        /* renamed from: a */
        public final float mo430a(float f) {
            return f <= 0.5f ? (1.0f - m1743b(1.0f - (f * 2.0f))) / 2.0f : (m1743b((f * 2.0f) - 1.0f) / 2.0f) + 0.5f;
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$b */
    public static class C0534b extends C0532c {
        /* renamed from: a */
        public final float mo430a(float f) {
            return 1.0f - super.mo430a(1.0f - f);
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$d */
    public static class C0535d extends C0522d {
        /* renamed from: Q */
        final float f2413Q = 2.0f;
        /* renamed from: R */
        final float f2414R = 10.0f;
        /* renamed from: S */
        final float f2415S = 1.0f;
        /* renamed from: T */
        final float f2416T;

        public C0535d(int i) {
            this.f2416T = ((float) (i % 2 == 0 ? 1 : -1)) * (3.1415927f * ((float) i));
        }

        /* renamed from: a */
        public float mo430a(float f) {
            if (f <= 0.5f) {
                float f2 = f * 2.0f;
                return ((C0549f.m1760a(f2 * this.f2416T) * ((float) Math.pow((double) this.f2413Q, (double) (this.f2414R * (f2 - 1.0f))))) * this.f2415S) / 2.0f;
            }
            f2 = (1.0f - f) * 2.0f;
            return 1.0f - (((C0549f.m1760a(f2 * this.f2416T) * ((float) Math.pow((double) this.f2413Q, (double) (this.f2414R * (f2 - 1.0f))))) * this.f2415S) / 2.0f);
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$e */
    public static class C0536e extends C0535d {
        public C0536e() {
            super(6);
        }

        /* renamed from: a */
        public final float mo430a(float f) {
            if (((double) f) >= 0.99d) {
                return 1.0f;
            }
            return (((float) Math.pow((double) this.Q, (double) ((f - 1.0f) * this.R))) * C0549f.m1760a(this.T * f)) * this.S;
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$f */
    public static class C0537f extends C0535d {
        public C0537f() {
            super(7);
        }

        /* renamed from: a */
        public final float mo430a(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            float f2 = 1.0f - f;
            return 1.0f - ((C0549f.m1760a(f2 * this.T) * ((float) Math.pow((double) this.Q, (double) (this.R * (f2 - 1.0f))))) * this.S);
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$g */
    public static class C0538g extends C0522d {
        /* renamed from: Q */
        final float f2417Q = 2.0f;
        /* renamed from: R */
        final float f2418R;
        /* renamed from: S */
        final float f2419S;
        /* renamed from: T */
        final float f2420T;

        public C0538g(float f) {
            this.f2418R = f;
            this.f2419S = (float) Math.pow(2.0d, (double) (-f));
            this.f2420T = 1.0f / (1.0f - this.f2419S);
        }

        /* renamed from: a */
        public float mo430a(float f) {
            return f <= 0.5f ? ((((float) Math.pow((double) this.f2417Q, (double) (this.f2418R * ((f * 2.0f) - 1.0f)))) - this.f2419S) * this.f2420T) / 2.0f : (2.0f - ((((float) Math.pow((double) this.f2417Q, (double) ((-this.f2418R) * ((f * 2.0f) - 1.0f)))) - this.f2419S) * this.f2420T)) / 2.0f;
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$h */
    public static class C0539h extends C0538g {
        public C0539h(float f) {
            super(f);
        }

        /* renamed from: a */
        public final float mo430a(float f) {
            return (((float) Math.pow((double) this.Q, (double) (this.R * (f - 1.0f)))) - this.S) * this.T;
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$i */
    public static class C0540i extends C0538g {
        public C0540i(float f) {
            super(f);
        }

        /* renamed from: a */
        public final float mo430a(float f) {
            return 1.0f - ((((float) Math.pow((double) this.Q, (double) ((-this.R) * f))) - this.S) * this.T);
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$j */
    public static class C0541j extends C0522d {
        /* renamed from: Q */
        final int f2421Q;

        public C0541j(int i) {
            this.f2421Q = i;
        }

        /* renamed from: a */
        public float mo430a(float f) {
            if (f <= 0.5f) {
                return ((float) Math.pow((double) (f * 2.0f), (double) this.f2421Q)) / 2.0f;
            }
            return (((float) Math.pow((double) ((f - 1.0f) * 2.0f), (double) this.f2421Q)) / ((float) (this.f2421Q % 2 == 0 ? -2 : 2))) + 1.0f;
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$k */
    public static class C0542k extends C0541j {
        public C0542k(int i) {
            super(i);
        }

        /* renamed from: a */
        public final float mo430a(float f) {
            return (float) Math.pow((double) f, (double) this.Q);
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$l */
    public static class C0543l extends C0541j {
        public C0543l(int i) {
            super(i);
        }

        /* renamed from: a */
        public final float mo430a(float f) {
            return (((float) (this.Q % 2 == 0 ? -1 : 1)) * ((float) Math.pow((double) (f - 1.0f), (double) this.Q))) + 1.0f;
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$m */
    public static class C0544m extends C0522d {
        /* renamed from: Q */
        private final float f2422Q = 3.0f;

        /* renamed from: a */
        public final float mo430a(float f) {
            if (f <= 0.5f) {
                float f2 = f * 2.0f;
                return (((f2 * (this.f2422Q + 1.0f)) - this.f2422Q) * (f2 * f2)) / 2.0f;
            }
            f2 = (f - 1.0f) * 2.0f;
            return ((((f2 * (this.f2422Q + 1.0f)) + this.f2422Q) * (f2 * f2)) / 2.0f) + 1.0f;
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$n */
    public static class C0545n extends C0522d {
        /* renamed from: Q */
        private final float f2423Q = 2.0f;

        /* renamed from: a */
        public final float mo430a(float f) {
            return (f * f) * (((this.f2423Q + 1.0f) * f) - this.f2423Q);
        }
    }

    /* renamed from: com.badlogic.gdx.math.d$o */
    public static class C0546o extends C0522d {
        /* renamed from: Q */
        private final float f2424Q = 2.0f;

        /* renamed from: a */
        public final float mo430a(float f) {
            float f2 = f - 1.0f;
            return (((f2 * (this.f2424Q + 1.0f)) + this.f2424Q) * (f2 * f2)) + 1.0f;
        }
    }

    static {
        C0522d c05319 = new C05319();
        f2388d = c05319;
        f2389e = c05319;
    }

    /* renamed from: a */
    public abstract float mo430a(float f);
}
