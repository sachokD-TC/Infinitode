package com.badlogic.gdx.graphics;

/* renamed from: com.badlogic.gdx.graphics.b */
public class C0430b {
    /* renamed from: A */
    public static final C0430b f1610A = new C0430b(-13361921);
    /* renamed from: B */
    public static final C0430b f1611B = new C0430b(-8433409);
    /* renamed from: C */
    public static final C0430b f1612C = new C0430b(-92245249);
    /* renamed from: D */
    public static final C0430b f1613D = new C0430b(-9849601);
    /* renamed from: E */
    public static final C0430b f1614E = new C0430b(1.0f, 0.0f, 1.0f, 1.0f);
    /* renamed from: F */
    public static final C0430b f1615F = new C0430b(-1608453889);
    /* renamed from: G */
    public static final C0430b f1616G = new C0430b(-293409025);
    /* renamed from: H */
    public static final C0430b f1617H = new C0430b(-1339006721);
    /* renamed from: a */
    public static final C0430b f1618a = new C0430b(0.0f, 0.0f, 0.0f, 0.0f);
    /* renamed from: b */
    public static final C0430b f1619b = new C0430b(0.0f, 0.0f, 0.0f, 1.0f);
    /* renamed from: c */
    public static final C0430b f1620c = new C0430b(-1);
    /* renamed from: d */
    public static final C0430b f1621d = new C0430b(-1077952513);
    /* renamed from: e */
    public static final C0430b f1622e = new C0430b(2139062271);
    /* renamed from: f */
    public static final C0430b f1623f = new C0430b(1061109759);
    /* renamed from: g */
    public static final C0430b f1624g = new C0430b(0.0f, 0.0f, 1.0f, 1.0f);
    /* renamed from: h */
    public static final C0430b f1625h = new C0430b(0.0f, 0.0f, 0.5f, 1.0f);
    /* renamed from: i */
    public static final C0430b f1626i = new C0430b(1097458175);
    /* renamed from: j */
    public static final C0430b f1627j = new C0430b(1887473919);
    /* renamed from: k */
    public static final C0430b f1628k = new C0430b(-2016482305);
    /* renamed from: l */
    public static final C0430b f1629l = new C0430b(0.0f, 1.0f, 1.0f, 1.0f);
    /* renamed from: m */
    public static final C0430b f1630m = new C0430b(0.0f, 0.5f, 0.5f, 1.0f);
    /* renamed from: n */
    public static final C0430b f1631n = new C0430b(16711935);
    /* renamed from: o */
    public static final C0430b f1632o = new C0430b(2147418367);
    /* renamed from: p */
    public static final C0430b f1633p = new C0430b(852308735);
    /* renamed from: q */
    public static final C0430b f1634q = new C0430b(579543807);
    /* renamed from: r */
    public static final C0430b f1635r = new C0430b(1804477439);
    /* renamed from: s */
    public static final C0430b f1636s = new C0430b(-65281);
    /* renamed from: t */
    public static final C0430b f1637t = new C0430b(-2686721);
    /* renamed from: u */
    public static final C0430b f1638u = new C0430b(-626712321);
    /* renamed from: v */
    public static final C0430b f1639v = new C0430b(-5963521);
    /* renamed from: w */
    public static final C0430b f1640w = new C0430b(-1958407169);
    /* renamed from: x */
    public static final C0430b f1641x = new C0430b(-759919361);
    /* renamed from: y */
    public static final C0430b f1642y = new C0430b(-1306385665);
    /* renamed from: z */
    public static final C0430b f1643z = new C0430b(-16776961);
    /* renamed from: I */
    public float f1644I;
    /* renamed from: J */
    public float f1645J;
    /* renamed from: K */
    public float f1646K;
    /* renamed from: L */
    public float f1647L;

    public C0430b(float f, float f2, float f3, float f4) {
        this.f1644I = f;
        this.f1645J = f2;
        this.f1646K = f3;
        this.f1647L = f4;
        m1215d();
    }

    public C0430b(int i) {
        C0430b.m1211a(this, i);
    }

    public C0430b(C0430b c0430b) {
        m1218a(c0430b);
    }

    /* renamed from: a */
    public static float m1209a(int i, int i2, int i3, int i4) {
        return Float.intBitsToFloat(((((i4 << 24) | (i3 << 16)) | (i2 << 8)) | i) & -16777217);
    }

    /* renamed from: a */
    public static C0430b m1210a(String str) {
        if (str.charAt(0) == '#') {
            str = str.substring(1);
        }
        return new C0430b(((float) Integer.valueOf(str.substring(0, 2), 16).intValue()) / 255.0f, ((float) Integer.valueOf(str.substring(2, 4), 16).intValue()) / 255.0f, ((float) Integer.valueOf(str.substring(4, 6), 16).intValue()) / 255.0f, ((float) (str.length() != 8 ? 255 : Integer.valueOf(str.substring(6, 8), 16).intValue())) / 255.0f);
    }

    /* renamed from: a */
    public static void m1211a(C0430b c0430b, int i) {
        c0430b.f1644I = ((float) ((-16777216 & i) >>> 24)) / 255.0f;
        c0430b.f1645J = ((float) ((16711680 & i) >>> 16)) / 255.0f;
        c0430b.f1646K = ((float) ((65280 & i) >>> 8)) / 255.0f;
        c0430b.f1647L = ((float) (i & 255)) / 255.0f;
    }

    /* renamed from: b */
    public static float m1212b(float f, float f2, float f3, float f4) {
        return Float.intBitsToFloat(((((((int) (255.0f * f4)) << 24) | (((int) (255.0f * f3)) << 16)) | (((int) (255.0f * f2)) << 8)) | ((int) (255.0f * f))) & -16777217);
    }

    /* renamed from: c */
    public static int m1213c(float f, float f2, float f3, float f4) {
        return (((((int) (f * 255.0f)) << 24) | (((int) (f2 * 255.0f)) << 16)) | (((int) (f3 * 255.0f)) << 8)) | ((int) (f4 * 255.0f));
    }

    /* renamed from: c */
    public static int m1214c(C0430b c0430b) {
        return (((((int) (c0430b.f1644I * 255.0f)) << 24) | (((int) (c0430b.f1645J * 255.0f)) << 16)) | (((int) (c0430b.f1646K * 255.0f)) << 8)) | ((int) (c0430b.f1647L * 255.0f));
    }

    /* renamed from: d */
    private C0430b m1215d() {
        if (this.f1644I < 0.0f) {
            this.f1644I = 0.0f;
        } else if (this.f1644I > 1.0f) {
            this.f1644I = 1.0f;
        }
        if (this.f1645J < 0.0f) {
            this.f1645J = 0.0f;
        } else if (this.f1645J > 1.0f) {
            this.f1645J = 1.0f;
        }
        if (this.f1646K < 0.0f) {
            this.f1646K = 0.0f;
        } else if (this.f1646K > 1.0f) {
            this.f1646K = 1.0f;
        }
        if (this.f1647L < 0.0f) {
            this.f1647L = 0.0f;
        } else if (this.f1647L > 1.0f) {
            this.f1647L = 1.0f;
        }
        return this;
    }

    /* renamed from: a */
    public final float m1216a() {
        return Float.intBitsToFloat(((((((int) (this.f1647L * 255.0f)) << 24) | (((int) (this.f1646K * 255.0f)) << 16)) | (((int) (this.f1645J * 255.0f)) << 8)) | ((int) (this.f1644I * 255.0f))) & -16777217);
    }

    /* renamed from: a */
    public final C0430b m1217a(float f, float f2, float f3, float f4) {
        this.f1644I = f;
        this.f1645J = f2;
        this.f1646K = f3;
        this.f1647L = f4;
        return m1215d();
    }

    /* renamed from: a */
    public final C0430b m1218a(C0430b c0430b) {
        this.f1644I = c0430b.f1644I;
        this.f1645J = c0430b.f1645J;
        this.f1646K = c0430b.f1646K;
        this.f1647L = c0430b.f1647L;
        return this;
    }

    /* renamed from: a */
    public final C0430b m1219a(C0430b c0430b, float f) {
        this.f1644I += (c0430b.f1644I - this.f1644I) * f;
        this.f1645J += (c0430b.f1645J - this.f1645J) * f;
        this.f1646K += (c0430b.f1646K - this.f1646K) * f;
        this.f1647L += (c0430b.f1647L - this.f1647L) * f;
        return m1215d();
    }

    /* renamed from: b */
    public final int m1220b() {
        return (((((int) (this.f1647L * 255.0f)) << 24) | (((int) (this.f1646K * 255.0f)) << 16)) | (((int) (this.f1645J * 255.0f)) << 8)) | ((int) (this.f1644I * 255.0f));
    }

    /* renamed from: b */
    public final C0430b m1221b(C0430b c0430b) {
        this.f1644I *= c0430b.f1644I;
        this.f1645J *= c0430b.f1645J;
        this.f1646K *= c0430b.f1646K;
        this.f1647L *= c0430b.f1647L;
        return m1215d();
    }

    /* renamed from: c */
    public final C0430b m1222c() {
        return new C0430b(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return m1220b() == ((C0430b) obj).m1220b();
    }

    public int hashCode() {
        int i = 0;
        int floatToIntBits = ((this.f1646K != 0.0f ? Float.floatToIntBits(this.f1646K) : 0) + (((this.f1645J != 0.0f ? Float.floatToIntBits(this.f1645J) : 0) + ((this.f1644I != 0.0f ? Float.floatToIntBits(this.f1644I) : 0) * 31)) * 31)) * 31;
        if (this.f1647L != 0.0f) {
            i = Float.floatToIntBits(this.f1647L);
        }
        return floatToIntBits + i;
    }

    public String toString() {
        String toHexString = Integer.toHexString((((((int) (this.f1644I * 255.0f)) << 24) | (((int) (this.f1645J * 255.0f)) << 16)) | (((int) (this.f1646K * 255.0f)) << 8)) | ((int) (this.f1647L * 255.0f)));
        while (toHexString.length() < 8) {
            toHexString = "0" + toHexString;
        }
        return toHexString;
    }
}
