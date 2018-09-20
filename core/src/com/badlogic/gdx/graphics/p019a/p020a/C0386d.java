package com.badlogic.gdx.graphics.p019a.p020a;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.p019a.C0382a;
import com.badlogic.gdx.graphics.p019a.p029e.C0424a;
import com.badlogic.gdx.math.C0549f;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* renamed from: com.badlogic.gdx.graphics.a.a.d */
public final class C0386d extends C0382a {
    /* renamed from: b */
    public static final long f1428b = C0382a.m1158a("diffuseTexture");
    /* renamed from: c */
    public static final long f1429c = C0382a.m1158a("specularTexture");
    /* renamed from: d */
    public static final long f1430d = C0382a.m1158a("bumpTexture");
    /* renamed from: e */
    public static final long f1431e = C0382a.m1158a("normalTexture");
    /* renamed from: f */
    public static final long f1432f = C0382a.m1158a("ambientTexture");
    /* renamed from: g */
    public static final long f1433g = C0382a.m1158a("emissiveTexture");
    /* renamed from: h */
    public static final long f1434h = C0382a.m1158a("reflectionTexture");
    /* renamed from: i */
    protected static long f1435i = ((((((f1428b | f1429c) | f1430d) | f1431e) | f1432f) | f1433g) | f1434h);
    /* renamed from: j */
    public final C0424a<Texture> f1436j;
    /* renamed from: k */
    public float f1437k;
    /* renamed from: l */
    public float f1438l;
    /* renamed from: m */
    public float f1439m;
    /* renamed from: n */
    public float f1440n;
    /* renamed from: o */
    public int f1441o;

    private C0386d(long j) {
        int i = 0;
        super(j);
        this.f1437k = 0.0f;
        this.f1438l = 0.0f;
        this.f1439m = 1.0f;
        this.f1440n = 1.0f;
        this.f1441o = 0;
        if ((f1435i & j) != 0) {
            i = 1;
        }
        if (i == 0) {
            throw new GdxRuntimeException("Invalid type specified");
        }
        this.f1436j = new C0424a();
    }

    private <T extends Texture> C0386d(long j, C0424a<T> c0424a) {
        this(j);
        C0424a c0424a2 = this.f1436j;
        c0424a2.f1584a = c0424a.f1584a;
        c0424a2.f1585b = c0424a.f1585b;
        c0424a2.f1586c = c0424a.f1586c;
        c0424a2.f1587d = c0424a.f1587d;
        c0424a2.f1588e = c0424a.f1588e;
    }

    private <T extends Texture> C0386d(long j, C0424a<T> c0424a, float f, float f2, float f3, float f4) {
        this(j, c0424a);
        this.f1437k = f;
        this.f1438l = f2;
        this.f1439m = f3;
        this.f1440n = f4;
        this.f1441o = 0;
    }

    public <T extends Texture> C0386d(long j, C0424a<T> c0424a, float f, float f2, float f3, float f4, byte b) {
        this(j, c0424a, f, f2, f3, f4);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C0382a c0382a = (C0382a) obj;
        if (this.a != c0382a.f1409a) {
            return this.a < c0382a.f1409a ? -1 : 1;
        } else {
            C0386d c0386d = (C0386d) c0382a;
            int a = this.f1436j.m1203a(c0386d.f1436j);
            return a != 0 ? a : this.f1441o != c0386d.f1441o ? this.f1441o - c0386d.f1441o : !C0549f.m1764a(this.f1439m, c0386d.f1439m) ? this.f1439m > c0386d.f1439m ? 1 : -1 : !C0549f.m1764a(this.f1440n, c0386d.f1440n) ? this.f1440n > c0386d.f1440n ? 1 : -1 : !C0549f.m1764a(this.f1437k, c0386d.f1437k) ? this.f1437k > c0386d.f1437k ? 1 : -1 : !C0549f.m1764a(this.f1438l, c0386d.f1438l) ? this.f1438l > c0386d.f1438l ? 1 : -1 : 0;
        }
    }

    public final int hashCode() {
        return (((((((((((super.hashCode() * 991) + this.f1436j.hashCode()) * 991) + Float.floatToRawIntBits(this.f1437k)) * 991) + Float.floatToRawIntBits(this.f1438l)) * 991) + Float.floatToRawIntBits(this.f1439m)) * 991) + Float.floatToRawIntBits(this.f1440n)) * 991) + this.f1441o;
    }
}
