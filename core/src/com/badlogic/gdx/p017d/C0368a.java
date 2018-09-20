package com.badlogic.gdx.p017d;

import com.badlogic.gdx.C0367f;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.af;
import com.badlogic.gdx.utils.af.C0361a;

/* renamed from: com.badlogic.gdx.d.a */
public final class C0368a extends C0367f {
    /* renamed from: a */
    final C0363b f1304a;
    /* renamed from: b */
    public boolean f1305b;
    /* renamed from: c */
    public boolean f1306c;
    /* renamed from: d */
    Vector2 f1307d = new Vector2();
    /* renamed from: e */
    public final C0361a f1308e = new C03621(this);
    /* renamed from: f */
    private float f1309f = 20.0f;
    /* renamed from: g */
    private long f1310g = 400000000;
    /* renamed from: h */
    private float f1311h = 1.1f;
    /* renamed from: i */
    private long f1312i = 150000000;
    /* renamed from: j */
    private boolean f1313j;
    /* renamed from: k */
    private int f1314k;
    /* renamed from: l */
    private long f1315l;
    /* renamed from: m */
    private float f1316m;
    /* renamed from: n */
    private float f1317n;
    /* renamed from: o */
    private int f1318o;
    /* renamed from: p */
    private int f1319p;
    /* renamed from: q */
    private boolean f1320q;
    /* renamed from: r */
    private final C0365c f1321r = new C0365c();
    /* renamed from: s */
    private float f1322s;
    /* renamed from: t */
    private float f1323t;
    /* renamed from: u */
    private long f1324u;
    /* renamed from: v */
    private final Vector2 f1325v = new Vector2();
    /* renamed from: w */
    private final Vector2 f1326w = new Vector2();
    /* renamed from: x */
    private final Vector2 f1327x = new Vector2();

    /* renamed from: com.badlogic.gdx.d.a$1 */
    class C03621 extends C0361a {
        /* renamed from: a */
        final /* synthetic */ C0368a f1293a;

        C03621(C0368a c0368a) {
            this.f1293a = c0368a;
        }

        public final void run() {
            if (!this.f1293a.f1305b) {
                this.f1293a.f1305b = this.f1293a.f1304a.mo328b(this.f1293a.f1307d.f2337x, this.f1293a.f1307d.f2338y);
            }
        }
    }

    /* renamed from: com.badlogic.gdx.d.a$b */
    public interface C0363b {
        /* renamed from: a */
        boolean mo324a();

        /* renamed from: a */
        boolean mo325a(float f, float f2);

        /* renamed from: a */
        boolean mo326a(float f, float f2, float f3, float f4);

        /* renamed from: a */
        boolean mo327a(Vector2 vector2, Vector2 vector22, Vector2 vector23, Vector2 vector24);

        /* renamed from: b */
        boolean mo328b(float f, float f2);

        /* renamed from: c */
        boolean mo329c(float f, float f2);
    }

    /* renamed from: com.badlogic.gdx.d.a$a */
    public static class C0364a implements C0363b {
        /* renamed from: a */
        public boolean mo324a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo325a(float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo326a(float f, float f2, float f3, float f4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo327a(Vector2 vector2, Vector2 vector22, Vector2 vector23, Vector2 vector24) {
            return false;
        }

        /* renamed from: b */
        public boolean mo328b(float f, float f2) {
            return false;
        }

        /* renamed from: c */
        public boolean mo329c(float f, float f2) {
            return false;
        }
    }

    /* renamed from: com.badlogic.gdx.d.a$c */
    static class C0365c {
        /* renamed from: a */
        int f1294a = 10;
        /* renamed from: b */
        float f1295b;
        /* renamed from: c */
        float f1296c;
        /* renamed from: d */
        float f1297d;
        /* renamed from: e */
        float f1298e;
        /* renamed from: f */
        long f1299f;
        /* renamed from: g */
        int f1300g;
        /* renamed from: h */
        float[] f1301h = new float[this.f1294a];
        /* renamed from: i */
        float[] f1302i = new float[this.f1294a];
        /* renamed from: j */
        long[] f1303j = new long[this.f1294a];

        C0365c() {
        }

        /* renamed from: a */
        final float m1038a(float[] fArr, int i) {
            int min = Math.min(this.f1294a, i);
            float f = 0.0f;
            for (int i2 = 0; i2 < min; i2++) {
                f += fArr[i2];
            }
            return f / ((float) min);
        }

        /* renamed from: a */
        final long m1039a(long[] jArr, int i) {
            int min = Math.min(this.f1294a, i);
            long j = 0;
            for (int i2 = 0; i2 < min; i2++) {
                j += jArr[i2];
            }
            return min == 0 ? 0 : j / ((long) min);
        }

        /* renamed from: a */
        public final void m1040a(float f, float f2, long j) {
            int i = 0;
            this.f1295b = f;
            this.f1296c = f2;
            this.f1297d = 0.0f;
            this.f1298e = 0.0f;
            this.f1300g = 0;
            while (i < this.f1294a) {
                this.f1301h[i] = 0.0f;
                this.f1302i[i] = 0.0f;
                this.f1303j[i] = 0;
                i++;
            }
            this.f1299f = j;
        }

        /* renamed from: b */
        public final void m1041b(float f, float f2, long j) {
            this.f1297d = f - this.f1295b;
            this.f1298e = f2 - this.f1296c;
            this.f1295b = f;
            this.f1296c = f2;
            long j2 = j - this.f1299f;
            this.f1299f = j;
            int i = this.f1300g % this.f1294a;
            this.f1301h[i] = this.f1297d;
            this.f1302i[i] = this.f1298e;
            this.f1303j[i] = j2;
            this.f1300g++;
        }
    }

    public C0368a(C0363b c0363b) {
        this.f1304a = c0363b;
    }

    /* renamed from: a */
    private boolean m1058a(float f, float f2, float f3, float f4) {
        return Math.abs(f - f3) < this.f1309f && Math.abs(f2 - f4) < this.f1309f;
    }

    /* renamed from: a */
    public final boolean m1059a(float f, float f2, int i) {
        if (i <= 1) {
            if (i == 0) {
                this.f1307d.m1701a(f, f2);
                this.f1324u = Gdx.input.mo309d();
                this.f1321r.m1040a(f, f2, this.f1324u);
                if (Gdx.input.mo308c()) {
                    this.f1313j = false;
                    this.f1320q = true;
                    this.f1326w.m1702a(this.f1307d);
                    this.f1327x.m1702a(this.f1325v);
                    this.f1308e.m1024a();
                } else {
                    this.f1313j = true;
                    this.f1320q = false;
                    this.f1305b = false;
                    this.f1322s = f;
                    this.f1323t = f2;
                    if (!this.f1308e.m1025b()) {
                        af.m2339a(this.f1308e, this.f1311h);
                    }
                }
            } else {
                this.f1325v.m1701a(f, f2);
                this.f1313j = false;
                this.f1320q = true;
                this.f1326w.m1702a(this.f1307d);
                this.f1327x.m1702a(this.f1325v);
                this.f1308e.m1024a();
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m1060a(float f, float f2, int i, int i2) {
        float f3 = 0.0f;
        if (i > 1) {
            return false;
        }
        if (this.f1313j && !m1058a(f, f2, this.f1322s, this.f1323t)) {
            this.f1313j = false;
        }
        boolean z = this.f1306c;
        this.f1306c = false;
        this.f1308e.m1024a();
        if (this.f1305b) {
            return false;
        }
        if (this.f1313j) {
            if (!(this.f1318o == i2 && this.f1319p == i && System.nanoTime() - this.f1315l <= this.f1310g && m1058a(f, f2, this.f1316m, this.f1317n))) {
                this.f1314k = 0;
            }
            this.f1314k++;
            this.f1315l = System.nanoTime();
            this.f1316m = f;
            this.f1317n = f2;
            this.f1318o = i2;
            this.f1319p = i;
            this.f1324u = 0;
            return this.f1304a.mo325a(f, f2);
        } else if (this.f1320q) {
            this.f1320q = false;
            this.f1306c = true;
            if (i == 0) {
                this.f1321r.m1040a(this.f1325v.f2337x, this.f1325v.f2338y, Gdx.input.mo309d());
                return false;
            }
            this.f1321r.m1040a(this.f1307d.f2337x, this.f1307d.f2338y, Gdx.input.mo309d());
            return false;
        } else {
            long d;
            if (z && this.f1306c) {
                this.f1324u = 0;
                d = Gdx.input.mo309d();
            } else {
                this.f1324u = 0;
                d = Gdx.input.mo309d();
            }
            if (d - this.f1321r.f1299f < this.f1312i) {
                this.f1321r.m1041b(f, f2, d);
                C0363b c0363b = this.f1304a;
                C0365c c0365c = this.f1321r;
                float a = c0365c.m1038a(c0365c.f1301h, c0365c.f1300g);
                float a2 = ((float) c0365c.m1039a(c0365c.f1303j, c0365c.f1300g)) / 1.0E9f;
                a2 = a2 == 0.0f ? 0.0f : a / a2;
                C0365c c0365c2 = this.f1321r;
                float a3 = c0365c2.m1038a(c0365c2.f1302i, c0365c2.f1300g);
                a = ((float) c0365c2.m1039a(c0365c2.f1303j, c0365c2.f1300g)) / 1.0E9f;
                if (a != 0.0f) {
                    f3 = a3 / a;
                }
                z = c0363b.mo329c(a2, f3);
            } else {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: a */
    public final boolean mo333a(int i, int i2, int i3) {
        return m1063b((float) i, (float) i2, i3);
    }

    /* renamed from: a */
    public final boolean mo334a(int i, int i2, int i3, int i4) {
        return m1059a((float) i, (float) i2, i3);
    }

    /* renamed from: b */
    public final boolean m1063b(float f, float f2, int i) {
        if (i > 1 || this.f1305b) {
            return false;
        }
        if (i == 0) {
            this.f1307d.m1701a(f, f2);
        } else {
            this.f1325v.m1701a(f, f2);
        }
        if (!this.f1320q) {
            this.f1321r.m1041b(f, f2, Gdx.input.mo309d());
            if (this.f1313j && !m1058a(f, f2, this.f1322s, this.f1323t)) {
                this.f1308e.m1024a();
                this.f1313j = false;
            }
            if (this.f1313j) {
                return false;
            }
            this.f1306c = true;
            return this.f1304a.mo326a(f, f2, this.f1321r.f1297d, this.f1321r.f1298e);
        } else if (this.f1304a == null) {
            return false;
        } else {
            boolean a = this.f1304a.mo327a(this.f1326w, this.f1327x, this.f1307d, this.f1325v);
            C0363b c0363b = this.f1304a;
            this.f1326w.m1706d(this.f1327x);
            this.f1307d.m1706d(this.f1325v);
            return c0363b.mo324a() || a;
        }
    }

    /* renamed from: b */
    public final boolean mo336b(int i, int i2, int i3, int i4) {
        return m1060a((float) i, (float) i2, i3, i4);
    }
}
