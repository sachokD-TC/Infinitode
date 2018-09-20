package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.math.C0549f;
import com.badlogic.gdx.utils.C0676a;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public final class ParticleEmitter {
    /* renamed from: A */
    private C0441d f1731A = new C0441d();
    /* renamed from: B */
    private C0442e f1732B = new C0442e();
    /* renamed from: C */
    private C0441d f1733C = new C0441d();
    /* renamed from: D */
    private C0442e f1734D = new C0442e();
    /* renamed from: E */
    private C0442e f1735E = new C0442e();
    /* renamed from: F */
    private C0442e f1736F = new C0442e();
    /* renamed from: G */
    private C0442e f1737G = new C0442e();
    /* renamed from: H */
    private C0442e f1738H = new C0442e();
    /* renamed from: I */
    private C0442e f1739I = new C0442e();
    /* renamed from: J */
    private C0442e f1740J = new C0442e();
    /* renamed from: K */
    private C0442e f1741K = new C0442e();
    /* renamed from: L */
    private C0437a f1742L = new C0437a();
    /* renamed from: M */
    private C0441d f1743M = new C0442e();
    /* renamed from: N */
    private C0441d f1744N = new C0442e();
    /* renamed from: O */
    private C0442e f1745O = new C0442e();
    /* renamed from: P */
    private C0442e f1746P = new C0442e();
    /* renamed from: Q */
    private C0443f f1747Q = new C0443f();
    /* renamed from: R */
    private C0441d[] f1748R;
    /* renamed from: S */
    private C0441d[] f1749S;
    /* renamed from: T */
    private C0441d[] f1750T;
    /* renamed from: U */
    private SpriteMode f1751U = SpriteMode.single;
    /* renamed from: V */
    private String f1752V;
    /* renamed from: W */
    private boolean f1753W;
    /* renamed from: X */
    private boolean f1754X;
    /* renamed from: Y */
    private int f1755Y;
    /* renamed from: Z */
    private int f1756Z;
    /* renamed from: a */
    public C0442e f1757a = new C0442e();
    private int aa;
    private int ab;
    private int ac;
    private float ad;
    private float ae;
    private float af;
    private float ag;
    private boolean ah;
    private boolean ai;
    /* renamed from: b */
    public C0442e f1758b = new C0442e();
    /* renamed from: c */
    public float f1759c;
    /* renamed from: d */
    C0676a<C0439k> f1760d;
    /* renamed from: e */
    public C0440b[] f1761e;
    /* renamed from: f */
    public int f1762f;
    /* renamed from: g */
    public int f1763g = 4;
    /* renamed from: h */
    public float f1764h;
    /* renamed from: i */
    public float f1765i;
    /* renamed from: j */
    C0676a<String> f1766j;
    /* renamed from: k */
    public int f1767k;
    /* renamed from: l */
    public boolean[] f1768l;
    /* renamed from: m */
    public boolean f1769m;
    /* renamed from: n */
    public boolean f1770n;
    /* renamed from: o */
    public int f1771o;
    /* renamed from: p */
    public int f1772p;
    /* renamed from: q */
    public int f1773q;
    /* renamed from: r */
    public float f1774r = 1.0f;
    /* renamed from: s */
    public float f1775s;
    /* renamed from: t */
    public float f1776t;
    /* renamed from: u */
    public float f1777u;
    /* renamed from: v */
    public boolean f1778v;
    /* renamed from: w */
    public boolean f1779w;
    /* renamed from: x */
    public boolean f1780x = true;
    /* renamed from: y */
    public boolean f1781y = false;
    /* renamed from: z */
    public boolean f1782z = true;

    public enum SpawnEllipseSide {
        both,
        top,
        bottom
    }

    public enum SpawnShape {
        point,
        line,
        square,
        ellipse
    }

    public enum SpriteMode {
        single,
        random,
        animated
    }

    /* renamed from: com.badlogic.gdx.graphics.g2d.ParticleEmitter$c */
    public static class C0436c {
        /* renamed from: b */
        boolean f1675b;
        /* renamed from: c */
        boolean f1676c;

        /* renamed from: a */
        public final void m1238a(C0436c c0436c) {
            this.f1675b = c0436c.f1675b;
            this.f1676c = c0436c.f1676c;
        }

        /* renamed from: a */
        public void mo352a(BufferedReader bufferedReader) {
            if (this.f1676c) {
                this.f1675b = true;
            } else {
                this.f1675b = ParticleEmitter.m1291b(bufferedReader, "active");
            }
        }
    }

    /* renamed from: com.badlogic.gdx.graphics.g2d.ParticleEmitter$a */
    public static class C0437a extends C0436c {
        /* renamed from: d */
        private static float[] f1677d = new float[4];
        /* renamed from: a */
        float[] f1678a;
        /* renamed from: e */
        private float[] f1679e;

        public C0437a() {
            this.f1679e = new float[]{1.0f, 1.0f, 1.0f};
            this.f1678a = new float[]{0.0f};
            this.c = true;
        }

        /* renamed from: a */
        public final void m1240a(C0437a c0437a) {
            super.m1238a((C0436c) c0437a);
            this.f1679e = new float[c0437a.f1679e.length];
            System.arraycopy(c0437a.f1679e, 0, this.f1679e, 0, this.f1679e.length);
            this.f1678a = new float[c0437a.f1678a.length];
            System.arraycopy(c0437a.f1678a, 0, this.f1678a, 0, this.f1678a.length);
        }

        /* renamed from: a */
        public final void mo352a(BufferedReader bufferedReader) {
            int i = 0;
            super.mo352a(bufferedReader);
            if (this.b) {
                this.f1679e = new float[ParticleEmitter.m1292c(bufferedReader, "colorsCount")];
                for (int i2 = 0; i2 < this.f1679e.length; i2++) {
                    this.f1679e[i2] = ParticleEmitter.m1294d(bufferedReader, "colors" + i2);
                }
                this.f1678a = new float[ParticleEmitter.m1292c(bufferedReader, "timelineCount")];
                while (i < this.f1678a.length) {
                    this.f1678a[i] = ParticleEmitter.m1294d(bufferedReader, "timeline" + i);
                    i++;
                }
            }
        }

        /* renamed from: a */
        public final float[] m1242a(float f) {
            float[] fArr = this.f1678a;
            int length = fArr.length;
            int i = 1;
            int i2 = 0;
            while (i < length) {
                if (fArr[i] > f) {
                    break;
                }
                i2 = i;
                i++;
            }
            i = -1;
            float f2 = fArr[i2];
            i2 *= 3;
            float f3 = this.f1679e[i2];
            float f4 = this.f1679e[i2 + 1];
            float f5 = this.f1679e[i2 + 2];
            if (i == -1) {
                f1677d[0] = f3;
                f1677d[1] = f4;
                f1677d[2] = f5;
                return f1677d;
            }
            float f6 = (f - f2) / (fArr[i] - f2);
            i *= 3;
            f1677d[0] = ((this.f1679e[i] - f3) * f6) + f3;
            f1677d[1] = ((this.f1679e[i + 1] - f4) * f6) + f4;
            f1677d[2] = ((this.f1679e[i + 2] - f5) * f6) + f5;
            return f1677d;
        }
    }

    /* renamed from: com.badlogic.gdx.graphics.g2d.ParticleEmitter$b */
    public static class C0440b extends C0439k {
        /* renamed from: a */
        protected int f1699a;
        /* renamed from: b */
        protected int f1700b;
        /* renamed from: c */
        protected float f1701c;
        /* renamed from: d */
        protected float f1702d;
        /* renamed from: e */
        protected float f1703e;
        /* renamed from: f */
        protected float f1704f;
        /* renamed from: g */
        protected float f1705g;
        /* renamed from: h */
        protected float f1706h;
        /* renamed from: i */
        protected float f1707i;
        /* renamed from: j */
        protected float f1708j;
        /* renamed from: k */
        protected float f1709k;
        /* renamed from: l */
        protected float f1710l;
        /* renamed from: m */
        protected float f1711m;
        /* renamed from: n */
        protected float f1712n;
        /* renamed from: o */
        protected float f1713o;
        /* renamed from: p */
        protected float f1714p;
        /* renamed from: q */
        protected float f1715q;
        /* renamed from: r */
        protected float f1716r;
        /* renamed from: s */
        protected float f1717s;
        /* renamed from: t */
        protected float f1718t;
        /* renamed from: u */
        protected float[] f1719u;
        /* renamed from: v */
        protected int f1720v;

        public C0440b(C0439k c0439k) {
            super(c0439k);
        }
    }

    /* renamed from: com.badlogic.gdx.graphics.g2d.ParticleEmitter$d */
    public static class C0441d extends C0436c {
        /* renamed from: a */
        private float f1721a;
        /* renamed from: d */
        private float f1722d;

        /* renamed from: a */
        public final float m1276a() {
            return this.f1721a + ((this.f1722d - this.f1721a) * C0549f.m1765b());
        }

        /* renamed from: a */
        public void mo359a(C0441d c0441d) {
            this.f1721a = c0441d.f1721a;
            this.f1722d = c0441d.f1722d;
        }

        /* renamed from: a */
        public void mo352a(BufferedReader bufferedReader) {
            super.mo352a(bufferedReader);
            if (this.b) {
                this.f1721a = ParticleEmitter.m1294d(bufferedReader, "lowMin");
                this.f1722d = ParticleEmitter.m1294d(bufferedReader, "lowMax");
            }
        }

        /* renamed from: b */
        public final void m1279b(C0441d c0441d) {
            super.m1238a((C0436c) c0441d);
            this.f1722d = c0441d.f1722d;
            this.f1721a = c0441d.f1721a;
        }
    }

    /* renamed from: com.badlogic.gdx.graphics.g2d.ParticleEmitter$e */
    public static class C0442e extends C0441d {
        /* renamed from: a */
        float[] f1723a = new float[]{0.0f};
        /* renamed from: d */
        public float f1724d;
        /* renamed from: e */
        public float f1725e;
        /* renamed from: f */
        boolean f1726f;
        /* renamed from: g */
        private float[] f1727g = new float[]{1.0f};

        /* renamed from: a */
        public final float m1280a(float f) {
            float[] fArr = this.f1723a;
            int length = fArr.length;
            int i = 1;
            while (i < length) {
                if (fArr[i] > f) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i == -1) {
                return this.f1727g[length - 1];
            }
            float[] fArr2 = this.f1727g;
            length = i - 1;
            float f2 = fArr2[length];
            float f3 = fArr[length];
            return (((f - f3) / (fArr[i] - f3)) * (fArr2[i] - f2)) + f2;
        }

        /* renamed from: a */
        public final void mo359a(C0441d c0441d) {
            if (c0441d instanceof C0442e) {
                c0441d = (C0442e) c0441d;
                super.mo359a(c0441d);
                this.f1724d = c0441d.f1724d;
                this.f1725e = c0441d.f1725e;
                if (this.f1727g.length != c0441d.f1727g.length) {
                    this.f1727g = Arrays.copyOf(c0441d.f1727g, c0441d.f1727g.length);
                } else {
                    System.arraycopy(c0441d.f1727g, 0, this.f1727g, 0, this.f1727g.length);
                }
                if (this.f1723a.length != c0441d.f1723a.length) {
                    this.f1723a = Arrays.copyOf(c0441d.f1723a, c0441d.f1723a.length);
                } else {
                    System.arraycopy(c0441d.f1723a, 0, this.f1723a, 0, this.f1723a.length);
                }
                this.f1726f = c0441d.f1726f;
                return;
            }
            super.mo359a(c0441d);
        }

        /* renamed from: a */
        public final void m1282a(C0442e c0442e) {
            super.m1279b(c0442e);
            this.f1725e = c0442e.f1725e;
            this.f1724d = c0442e.f1724d;
            this.f1727g = new float[c0442e.f1727g.length];
            System.arraycopy(c0442e.f1727g, 0, this.f1727g, 0, this.f1727g.length);
            this.f1723a = new float[c0442e.f1723a.length];
            System.arraycopy(c0442e.f1723a, 0, this.f1723a, 0, this.f1723a.length);
            this.f1726f = c0442e.f1726f;
        }

        /* renamed from: a */
        public final void mo352a(BufferedReader bufferedReader) {
            int i = 0;
            super.mo352a(bufferedReader);
            if (this.b) {
                this.f1724d = ParticleEmitter.m1294d(bufferedReader, "highMin");
                this.f1725e = ParticleEmitter.m1294d(bufferedReader, "highMax");
                this.f1726f = ParticleEmitter.m1291b(bufferedReader, "relative");
                this.f1727g = new float[ParticleEmitter.m1292c(bufferedReader, "scalingCount")];
                for (int i2 = 0; i2 < this.f1727g.length; i2++) {
                    this.f1727g[i2] = ParticleEmitter.m1294d(bufferedReader, "scaling" + i2);
                }
                this.f1723a = new float[ParticleEmitter.m1292c(bufferedReader, "timelineCount")];
                while (i < this.f1723a.length) {
                    this.f1723a[i] = ParticleEmitter.m1294d(bufferedReader, "timeline" + i);
                    i++;
                }
            }
        }

        /* renamed from: b */
        public final float m1284b() {
            return this.f1724d + ((this.f1725e - this.f1724d) * C0549f.m1765b());
        }
    }

    /* renamed from: com.badlogic.gdx.graphics.g2d.ParticleEmitter$f */
    public static class C0443f extends C0436c {
        /* renamed from: a */
        SpawnShape f1728a = SpawnShape.point;
        /* renamed from: d */
        boolean f1729d;
        /* renamed from: e */
        SpawnEllipseSide f1730e = SpawnEllipseSide.both;

        /* renamed from: a */
        public final void m1285a(C0443f c0443f) {
            super.m1238a((C0436c) c0443f);
            this.f1728a = c0443f.f1728a;
            this.f1729d = c0443f.f1729d;
            this.f1730e = c0443f.f1730e;
        }

        /* renamed from: a */
        public final void mo352a(BufferedReader bufferedReader) {
            super.mo352a(bufferedReader);
            if (this.b) {
                this.f1728a = SpawnShape.valueOf(ParticleEmitter.m1287a(bufferedReader, "shape"));
                if (this.f1728a == SpawnShape.ellipse) {
                    this.f1729d = ParticleEmitter.m1291b(bufferedReader, "edges");
                    this.f1730e = SpawnEllipseSide.valueOf(ParticleEmitter.m1287a(bufferedReader, "side"));
                }
            }
        }
    }

    public ParticleEmitter() {
        m1295g();
    }

    public ParticleEmitter(ParticleEmitter particleEmitter) {
        this.f1760d = new C0676a(particleEmitter.f1760d);
        this.f1752V = particleEmitter.f1752V;
        this.f1766j = new C0676a(particleEmitter.f1766j);
        m1290b(particleEmitter.f1763g);
        this.f1762f = particleEmitter.f1762f;
        this.f1731A.m1279b(particleEmitter.f1731A);
        this.f1733C.m1279b(particleEmitter.f1733C);
        this.f1757a.m1282a(particleEmitter.f1757a);
        this.f1734D.m1282a(particleEmitter.f1734D);
        this.f1732B.m1282a(particleEmitter.f1732B);
        this.f1735E.m1282a(particleEmitter.f1735E);
        this.f1736F.m1282a(particleEmitter.f1736F);
        this.f1737G.m1282a(particleEmitter.f1737G);
        this.f1738H.m1282a(particleEmitter.f1738H);
        this.f1758b.m1282a(particleEmitter.f1758b);
        this.f1739I.m1282a(particleEmitter.f1739I);
        this.f1740J.m1282a(particleEmitter.f1740J);
        this.f1741K.m1282a(particleEmitter.f1741K);
        this.f1742L.m1240a(particleEmitter.f1742L);
        this.f1743M.m1279b(particleEmitter.f1743M);
        this.f1744N.m1279b(particleEmitter.f1744N);
        this.f1745O.m1282a(particleEmitter.f1745O);
        this.f1746P.m1282a(particleEmitter.f1746P);
        this.f1747Q.m1285a(particleEmitter.f1747Q);
        this.f1778v = particleEmitter.f1778v;
        this.f1779w = particleEmitter.f1779w;
        this.ah = particleEmitter.ah;
        this.ai = particleEmitter.ai;
        this.f1780x = particleEmitter.f1780x;
        this.f1781y = particleEmitter.f1781y;
        this.f1782z = particleEmitter.f1782z;
        this.f1751U = particleEmitter.f1751U;
    }

    public ParticleEmitter(BufferedReader bufferedReader) {
        m1295g();
        m1289a(bufferedReader);
    }

    /* renamed from: a */
    static String m1287a(BufferedReader bufferedReader, String str) {
        String readLine = bufferedReader.readLine();
        if (readLine != null) {
            return m1288a(readLine);
        }
        throw new IOException("Missing value: " + str);
    }

    /* renamed from: a */
    private static String m1288a(String str) {
        return str.substring(str.indexOf(":") + 1).trim();
    }

    /* renamed from: a */
    private void m1289a(BufferedReader bufferedReader) {
        try {
            this.f1752V = m1287a(bufferedReader, "name");
            bufferedReader.readLine();
            this.f1731A.mo352a(bufferedReader);
            bufferedReader.readLine();
            this.f1733C.mo352a(bufferedReader);
            bufferedReader.readLine();
            this.f1762f = m1292c(bufferedReader, "minParticleCount");
            m1290b(m1292c(bufferedReader, "maxParticleCount"));
            bufferedReader.readLine();
            this.f1757a.mo352a(bufferedReader);
            bufferedReader.readLine();
            this.f1734D.mo352a(bufferedReader);
            bufferedReader.readLine();
            this.f1732B.mo352a(bufferedReader);
            bufferedReader.readLine();
            this.f1743M.mo352a(bufferedReader);
            bufferedReader.readLine();
            this.f1744N.mo352a(bufferedReader);
            bufferedReader.readLine();
            this.f1747Q.mo352a(bufferedReader);
            bufferedReader.readLine();
            this.f1745O.mo352a(bufferedReader);
            bufferedReader.readLine();
            this.f1746P.mo352a(bufferedReader);
            if (bufferedReader.readLine().trim().equals("- Scale -")) {
                this.f1735E.mo352a(bufferedReader);
                this.f1736F.f1675b = false;
            } else {
                this.f1735E.mo352a(bufferedReader);
                bufferedReader.readLine();
                this.f1736F.mo352a(bufferedReader);
            }
            bufferedReader.readLine();
            this.f1738H.mo352a(bufferedReader);
            bufferedReader.readLine();
            this.f1758b.mo352a(bufferedReader);
            bufferedReader.readLine();
            this.f1737G.mo352a(bufferedReader);
            bufferedReader.readLine();
            this.f1739I.mo352a(bufferedReader);
            bufferedReader.readLine();
            this.f1740J.mo352a(bufferedReader);
            bufferedReader.readLine();
            this.f1742L.mo352a(bufferedReader);
            bufferedReader.readLine();
            this.f1741K.mo352a(bufferedReader);
            bufferedReader.readLine();
            this.f1778v = m1291b(bufferedReader, "attached");
            this.f1779w = m1291b(bufferedReader, "continuous");
            this.ah = m1291b(bufferedReader, "aligned");
            this.f1780x = m1291b(bufferedReader, "additive");
            this.ai = m1291b(bufferedReader, "behind");
            String readLine = bufferedReader.readLine();
            if (readLine.startsWith("premultipliedAlpha")) {
                this.f1781y = Boolean.parseBoolean(m1288a(readLine));
                readLine = bufferedReader.readLine();
            }
            if (readLine.startsWith("spriteMode")) {
                this.f1751U = SpriteMode.valueOf(m1288a(readLine));
                bufferedReader.readLine();
            }
            C0676a c0676a = new C0676a();
            while (true) {
                Object readLine2 = bufferedReader.readLine();
                if (readLine2 == null || readLine2.isEmpty()) {
                    this.f1766j = c0676a;
                } else {
                    c0676a.m2296a(readLine2);
                }
            }
            this.f1766j = c0676a;
        } catch (Throwable e) {
            if (this.f1752V == null) {
                throw e;
            }
            throw new RuntimeException("Error parsing emitter: " + this.f1752V, e);
        }
    }

    /* renamed from: b */
    private void m1290b(int i) {
        this.f1763g = i;
        this.f1768l = new boolean[i];
        this.f1767k = 0;
        this.f1761e = new C0440b[i];
    }

    /* renamed from: b */
    static boolean m1291b(BufferedReader bufferedReader, String str) {
        return Boolean.parseBoolean(m1287a(bufferedReader, str));
    }

    /* renamed from: c */
    static int m1292c(BufferedReader bufferedReader, String str) {
        return Integer.parseInt(m1287a(bufferedReader, str));
    }

    /* renamed from: c */
    private void m1293c(int i) {
        float a;
        C0439k c0439k = null;
        switch (this.f1751U) {
            case single:
            case animated:
                c0439k = (C0439k) this.f1760d.m2304c();
                break;
            case random:
                c0439k = (C0439k) this.f1760d.m2308e();
                break;
        }
        C0440b c0440b = this.f1761e[i];
        if (c0440b == null) {
            C0440b[] c0440bArr = this.f1761e;
            c0440b = new C0440b(c0439k);
            c0440bArr[i] = c0440b;
            c0440b.mo353a(this.f1753W, this.f1754X);
        } else {
            c0440b.m1257a(c0439k);
        }
        float f = this.f1775s / this.f1774r;
        int i2 = this.f1755Y;
        int a2 = this.ab + ((int) (((float) this.ac) * this.f1734D.m1280a(f)));
        c0440b.f1699a = a2;
        c0440b.f1700b = a2;
        if (this.f1738H.b) {
            c0440b.f1707i = this.f1738H.m1276a();
            c0440b.f1708j = this.f1738H.m1284b();
            if (!this.f1738H.f1726f) {
                c0440b.f1708j -= c0440b.f1707i;
            }
        }
        c0440b.f1709k = this.f1758b.m1276a();
        c0440b.f1710l = this.f1758b.m1284b();
        if (!this.f1758b.f1726f) {
            c0440b.f1710l -= c0440b.f1709k;
        }
        float f2 = 0.0f;
        if ((i2 & 2) == 0) {
            f2 = c0440b.f1709k + (c0440b.f1710l * this.f1758b.m1280a(0.0f));
            c0440b.f1709k = f2;
            c0440b.f1711m = C0549f.m1771d(f2);
            c0440b.f1712n = C0549f.m1769c(f2);
        }
        float c = c0439k.mo385c();
        float d = c0439k.mo387d();
        c0440b.f1701c = this.f1735E.m1276a() / c;
        c0440b.f1702d = this.f1735E.m1284b() / c;
        if (!this.f1735E.f1726f) {
            c0440b.f1702d -= c0440b.f1701c;
        }
        if (this.f1736F.b) {
            c0440b.f1703e = this.f1736F.m1276a() / d;
            c0440b.f1704f = this.f1736F.m1284b() / d;
            if (!this.f1736F.f1726f) {
                c0440b.f1704f -= c0440b.f1703e;
            }
            c0440b.m1270d(c0440b.f1701c + (c0440b.f1702d * this.f1735E.m1280a(0.0f)), c0440b.f1703e + (c0440b.f1704f * this.f1736F.m1280a(0.0f)));
        } else {
            c0440b.m1261b(c0440b.f1701c + (c0440b.f1702d * this.f1735E.m1280a(0.0f)));
        }
        if (this.f1737G.b) {
            c0440b.f1705g = this.f1737G.m1276a();
            c0440b.f1706h = this.f1737G.m1284b();
            if (!this.f1737G.f1726f) {
                c0440b.f1706h -= c0440b.f1705g;
            }
            a = c0440b.f1705g + (c0440b.f1706h * this.f1737G.m1280a(0.0f));
            if (this.ah) {
                a += f2;
            }
            c0440b.m1252a(a);
        }
        if (this.f1739I.b) {
            c0440b.f1715q = this.f1739I.m1276a();
            c0440b.f1716r = this.f1739I.m1284b();
            if (!this.f1739I.f1726f) {
                c0440b.f1716r -= c0440b.f1715q;
            }
        }
        if (this.f1740J.b) {
            c0440b.f1717s = this.f1740J.m1276a();
            c0440b.f1718t = this.f1740J.m1284b();
            if (!this.f1740J.f1726f) {
                c0440b.f1718t -= c0440b.f1717s;
            }
        }
        float[] fArr = c0440b.f1719u;
        if (fArr == null) {
            fArr = new float[3];
            c0440b.f1719u = fArr;
        }
        float[] a3 = this.f1742L.m1242a(0.0f);
        fArr[0] = a3[0];
        fArr[1] = a3[1];
        fArr[2] = a3[2];
        c0440b.f1713o = this.f1741K.m1276a();
        c0440b.f1714p = this.f1741K.m1284b() - c0440b.f1713o;
        a = this.f1764h;
        if (this.f1743M.b) {
            a += this.f1743M.m1276a();
        }
        f2 = this.f1765i;
        if (this.f1744N.b) {
            f2 += this.f1744N.m1276a();
        }
        float a4;
        float a5;
        float a6;
        switch (this.f1747Q.f1728a) {
            case square:
                a4 = this.ad + (this.ae * this.f1745O.m1280a(f));
                a5 = this.af + (this.ag * this.f1746P.m1280a(f));
                a += C0549f.m1772e(a4) - (a4 / 2.0f);
                f2 += C0549f.m1772e(a5) - (a5 / 2.0f);
                break;
            case ellipse:
                a4 = this.ad + (this.ae * this.f1745O.m1280a(f));
                a6 = this.af + (this.ag * this.f1746P.m1280a(f));
                float f3 = a4 / 2.0f;
                float f4 = a6 / 2.0f;
                if (!(f3 == 0.0f || f4 == 0.0f)) {
                    float f5 = f3 / f4;
                    if (!this.f1747Q.f1729d) {
                        float e;
                        float e2;
                        do {
                            e = C0549f.m1772e(a4) - f3;
                            e2 = C0549f.m1772e(a6) - f4;
                        } while ((e * e) + (e2 * e2) > f3 * f3);
                        a += e;
                        f2 += e2 / f5;
                        break;
                    }
                    switch (this.f1747Q.f1730e) {
                        case top:
                            a4 = -C0549f.m1772e(179.0f);
                            break;
                        case bottom:
                            a4 = C0549f.m1772e(179.0f);
                            break;
                        default:
                            a4 = C0549f.m1772e(360.0f);
                            break;
                    }
                    a6 = C0549f.m1771d(a4);
                    f4 = C0549f.m1769c(a4);
                    a += a6 * f3;
                    f2 += (f3 * f4) / f5;
                    if ((i2 & 2) == 0) {
                        c0440b.f1709k = a4;
                        c0440b.f1711m = a6;
                        c0440b.f1712n = f4;
                        break;
                    }
                }
                break;
            case line:
                a4 = this.ad + (this.ae * this.f1745O.m1280a(f));
                a5 = this.af + (this.ag * this.f1746P.m1280a(f));
                if (a4 == 0.0f) {
                    f2 += C0549f.m1765b() * a5;
                    break;
                }
                a6 = C0549f.m1765b() * a4;
                a += a6;
                f2 += (a5 / a4) * a6;
                break;
        }
        c0440b.mo382a(a - (c / 2.0f), f2 - (d / 2.0f), c, d);
        int a7 = (int) (((float) this.f1756Z) + (((float) this.aa) * this.f1732B.m1280a(f)));
        if (a7 > 0) {
            if (a7 >= c0440b.f1700b) {
                a7 = c0440b.f1700b - 1;
            }
            m1299a(c0440b, ((float) a7) / 1000.0f, a7);
        }
    }

    /* renamed from: d */
    static float m1294d(BufferedReader bufferedReader, String str) {
        return Float.parseFloat(m1287a(bufferedReader, str));
    }

    /* renamed from: g */
    private void m1295g() {
        this.f1760d = new C0676a();
        this.f1766j = new C0676a();
        this.f1733C.f1676c = true;
        this.f1757a.f1676c = true;
        this.f1734D.f1676c = true;
        this.f1735E.f1676c = true;
        this.f1741K.f1676c = true;
        this.f1747Q.f1676c = true;
        this.f1745O.f1676c = true;
        this.f1746P.f1676c = true;
    }

    /* renamed from: a */
    public final void m1296a() {
        int i = this.f1767k;
        if (i != this.f1763g) {
            boolean[] zArr = this.f1768l;
            int i2 = 0;
            int length = zArr.length;
            while (i2 < length) {
                if (zArr[i2]) {
                    i2++;
                } else {
                    m1293c(i2);
                    zArr[i2] = true;
                    this.f1767k = i + 1;
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m1297a(int i) {
        int i2 = 0;
        int min = Math.min(i, this.f1763g - this.f1767k);
        if (min != 0) {
            boolean[] zArr = this.f1768l;
            int length = zArr.length;
            int i3 = 0;
            loop0:
            while (i3 < min) {
                while (i2 < length) {
                    if (zArr[i2]) {
                        i2++;
                    } else {
                        m1293c(i2);
                        int i4 = i2 + 1;
                        zArr[i2] = true;
                        i3++;
                        i2 = i4;
                    }
                }
                break loop0;
            }
            this.f1767k += min;
        }
    }

    /* renamed from: a */
    public final void m1298a(C0676a<C0439k> c0676a) {
        this.f1760d = c0676a;
        if (c0676a.f3001b != 0) {
            int length = this.f1761e.length;
            int i = 0;
            while (i < length) {
                C0440b c0440b = this.f1761e[i];
                if (c0440b != null) {
                    C0438n c0438n = null;
                    C0439k c0439k;
                    switch (this.f1751U) {
                        case single:
                            c0439k = (C0439k) c0676a.m2304c();
                            break;
                        case animated:
                            c0440b.f1720v = Math.min((int) ((1.0f - (((float) c0440b.f1700b) / ((float) c0440b.f1699a))) * ((float) c0676a.f3001b)), c0676a.f3001b - 1);
                            c0439k = (C0439k) c0676a.m2291a(c0440b.f1720v);
                            break;
                        case random:
                            c0439k = (C0439k) c0676a.m2308e();
                            break;
                        default:
                            break;
                    }
                    c0440b.m1244a(c0438n);
                    c0440b.mo386c(c0438n.mo388e(), c0438n.mo389f());
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean m1299a(C0440b c0440b, float f, int i) {
        int i2 = c0440b.f1700b - i;
        if (i2 <= 0) {
            return false;
        }
        float d;
        c0440b.f1700b = i2;
        float f2 = 1.0f - (((float) c0440b.f1700b) / ((float) c0440b.f1699a));
        int i3 = this.f1755Y;
        if ((i3 & 1) != 0) {
            if (this.f1736F.b) {
                c0440b.m1270d(c0440b.f1701c + (c0440b.f1702d * this.f1735E.m1280a(f2)), c0440b.f1703e + (c0440b.f1704f * this.f1736F.m1280a(f2)));
            } else {
                c0440b.m1261b(c0440b.f1701c + (c0440b.f1702d * this.f1735E.m1280a(f2)));
            }
        }
        if ((i3 & 8) != 0) {
            float c;
            float a = (c0440b.f1707i + (c0440b.f1708j * this.f1738H.m1280a(f2))) * f;
            if ((i3 & 2) != 0) {
                float a2 = c0440b.f1709k + (c0440b.f1710l * this.f1758b.m1280a(f2));
                d = a * C0549f.m1771d(a2);
                c = C0549f.m1769c(a2) * a;
                if ((i3 & 4) != 0) {
                    a = c0440b.f1705g + (c0440b.f1706h * this.f1737G.m1280a(f2));
                    if (this.ah) {
                        a += a2;
                    }
                    c0440b.m1252a(a);
                }
                a = c;
                c = d;
            } else {
                d = a * c0440b.f1711m;
                c = c0440b.f1712n * a;
                if (this.ah || (i3 & 4) != 0) {
                    a = c0440b.f1705g + (c0440b.f1706h * this.f1737G.m1280a(f2));
                    if (this.ah) {
                        a += c0440b.f1709k;
                    }
                    c0440b.m1252a(a);
                }
                a = c;
                c = d;
            }
            if ((i3 & 16) != 0) {
                c += (c0440b.f1715q + (c0440b.f1716r * this.f1739I.m1280a(f2))) * f;
            }
            if ((i3 & 32) != 0) {
                a += (c0440b.f1717s + (c0440b.f1718t * this.f1740J.m1280a(f2))) * f;
            }
            c0440b.m1262b(c, a);
        } else if ((i3 & 4) != 0) {
            c0440b.m1252a(c0440b.f1705g + (c0440b.f1706h * this.f1737G.m1280a(f2)));
        }
        float[] a3 = (i3 & 64) != 0 ? this.f1742L.m1242a(f2) : c0440b.f1719u;
        if (this.f1781y) {
            d = c0440b.f1713o + (c0440b.f1714p * this.f1741K.m1280a(f2));
            c0440b.m1263b(a3[0] * d, a3[1] * d, a3[2] * d, (this.f1780x ? 0.0f : 1.0f) * d);
        } else {
            c0440b.m1263b(a3[0], a3[1], a3[2], c0440b.f1713o + (c0440b.f1714p * this.f1741K.m1280a(f2)));
        }
        if ((i3 & 128) != 0) {
            int min = Math.min((int) (((float) this.f1760d.f3001b) * f2), this.f1760d.f3001b - 1);
            if (c0440b.f1720v != min) {
                C0439k c0439k = (C0439k) this.f1760d.m2291a(min);
                d = c0440b.mo385c();
                f2 = c0440b.mo387d();
                c0440b.m1244a(c0439k);
                c0440b.mo381a(c0439k.mo385c(), c0439k.mo387d());
                c0440b.mo386c(c0439k.mo388e(), c0439k.mo389f());
                c0440b.m1262b((d - c0439k.mo385c()) / 2.0f, (f2 - c0439k.mo387d()) / 2.0f);
                c0440b.f1720v = min;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void m1300b() {
        this.f1769m = true;
        this.f1770n = false;
        m1301c();
    }

    /* renamed from: c */
    public final void m1301c() {
        this.f1776t = this.f1731A.b ? this.f1731A.m1276a() : 0.0f;
        this.f1777u = 0.0f;
        this.f1775s -= this.f1774r;
        this.f1774r = this.f1733C.m1276a();
        this.f1771o = (int) this.f1757a.m1276a();
        this.f1772p = (int) this.f1757a.m1284b();
        if (!this.f1757a.f1726f) {
            this.f1772p -= this.f1771o;
        }
        this.ab = (int) this.f1734D.m1276a();
        this.ac = (int) this.f1734D.m1284b();
        if (!this.f1734D.f1726f) {
            this.ac -= this.ab;
        }
        this.f1756Z = this.f1732B.b ? (int) this.f1732B.m1276a() : 0;
        this.aa = (int) this.f1732B.m1284b();
        if (!this.f1732B.f1726f) {
            this.aa -= this.f1756Z;
        }
        this.ad = this.f1745O.m1276a();
        this.ae = this.f1745O.m1284b();
        if (!this.f1745O.f1726f) {
            this.ae -= this.ad;
        }
        this.af = this.f1746P.m1276a();
        this.ag = this.f1746P.m1284b();
        if (!this.f1746P.f1726f) {
            this.ag -= this.af;
        }
        this.f1755Y = 0;
        if (this.f1758b.b && this.f1758b.f1723a.length > 1) {
            this.f1755Y |= 2;
        }
        if (this.f1738H.b) {
            this.f1755Y |= 8;
        }
        if (this.f1735E.f1723a.length > 1) {
            this.f1755Y |= 1;
        }
        if (this.f1736F.b && this.f1736F.f1723a.length > 1) {
            this.f1755Y |= 1;
        }
        if (this.f1737G.b && this.f1737G.f1723a.length > 1) {
            this.f1755Y |= 4;
        }
        if (this.f1739I.b) {
            this.f1755Y |= 16;
        }
        if (this.f1740J.b) {
            this.f1755Y |= 32;
        }
        if (this.f1742L.f1678a.length > 1) {
            this.f1755Y |= 64;
        }
        if (this.f1751U == SpriteMode.animated) {
            this.f1755Y |= 128;
        }
    }

    /* renamed from: d */
    final C0441d[] m1302d() {
        if (this.f1748R == null) {
            this.f1748R = new C0441d[3];
            this.f1748R[0] = this.f1735E;
            this.f1748R[1] = this.f1745O;
            this.f1748R[2] = this.f1743M;
        }
        return this.f1748R;
    }

    /* renamed from: e */
    final C0441d[] m1303e() {
        if (this.f1749S == null) {
            this.f1749S = new C0441d[3];
            this.f1749S[0] = this.f1736F;
            this.f1749S[1] = this.f1746P;
            this.f1749S[2] = this.f1744N;
        }
        return this.f1749S;
    }

    /* renamed from: f */
    final C0441d[] m1304f() {
        if (this.f1750T == null) {
            this.f1750T = new C0441d[3];
            this.f1750T[0] = this.f1738H;
            this.f1750T[1] = this.f1739I;
            this.f1750T[2] = this.f1740J;
        }
        return this.f1750T;
    }
}
