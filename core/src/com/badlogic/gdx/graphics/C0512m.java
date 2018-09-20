package com.badlogic.gdx.graphics;

/* renamed from: com.badlogic.gdx.graphics.m */
public final class C0512m {
    /* renamed from: a */
    public final int f2285a;
    /* renamed from: b */
    public final int f2286b;
    /* renamed from: c */
    public final boolean f2287c;
    /* renamed from: d */
    public final int f2288d;
    /* renamed from: e */
    public int f2289e;
    /* renamed from: f */
    public String f2290f;
    /* renamed from: g */
    public int f2291g;
    /* renamed from: h */
    private final int f2292h;

    private C0512m(int i, int i2, int i3, boolean z, String str, int i4) {
        this.f2285a = i;
        this.f2286b = i2;
        this.f2288d = i3;
        this.f2287c = z;
        this.f2290f = str;
        this.f2291g = i4;
        this.f2292h = Integer.numberOfTrailingZeros(i);
    }

    public C0512m(int i, int i2, String str) {
        this(i, i2, str, 0);
    }

    private C0512m(int i, int i2, String str, int i3) {
        this(i, i2, i == 4 ? 5121 : 5126, i == 4, str, i3);
    }

    private C0512m(int i, int i2, boolean z, String str) {
        this(i, 4, i2, z, str, 0);
    }

    /* renamed from: a */
    public static C0512m m1669a() {
        return new C0512m(1, 3, "a_position");
    }

    /* renamed from: a */
    public static C0512m m1670a(int i) {
        return new C0512m(16, 2, "a_texCoord" + i, i);
    }

    /* renamed from: b */
    public static C0512m m1671b() {
        return new C0512m(8, 3, "a_normal");
    }

    /* renamed from: b */
    public static C0512m m1672b(int i) {
        return new C0512m(64, 2, "a_boneWeight" + i, i);
    }

    /* renamed from: c */
    public static C0512m m1673c() {
        return new C0512m(4, 5121, true, "a_color");
    }

    /* renamed from: d */
    public static C0512m m1674d() {
        return new C0512m(2, 5126, false, "a_color");
    }

    /* renamed from: e */
    public static C0512m m1675e() {
        return new C0512m(128, 3, "a_tangent");
    }

    /* renamed from: f */
    public static C0512m m1676f() {
        return new C0512m(256, 3, "a_binormal");
    }

    /* renamed from: a */
    public final boolean m1677a(C0512m c0512m) {
        return c0512m != null && this.f2285a == c0512m.f2285a && this.f2286b == c0512m.f2286b && this.f2288d == c0512m.f2288d && this.f2287c == c0512m.f2287c && this.f2290f.equals(c0512m.f2290f) && this.f2291g == c0512m.f2291g;
    }

    public final boolean equals(Object obj) {
        return !(obj instanceof C0512m) ? false : m1677a((C0512m) obj);
    }

    public final int hashCode() {
        return (((((this.f2292h << 8) + (this.f2291g & 255)) * 541) + this.f2286b) * 541) + this.f2290f.hashCode();
    }
}
