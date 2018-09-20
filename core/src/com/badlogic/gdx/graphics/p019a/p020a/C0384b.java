package com.badlogic.gdx.graphics.p019a.p020a;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.p019a.C0382a;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* renamed from: com.badlogic.gdx.graphics.a.a.b */
public final class C0384b extends C0382a {
    /* renamed from: b */
    public static final long f1416b = C0382a.m1158a("diffuseColor");
    /* renamed from: c */
    public static final long f1417c = C0382a.m1158a("specularColor");
    /* renamed from: d */
    public static final long f1418d = C0382a.m1158a("ambientColor");
    /* renamed from: e */
    public static final long f1419e = C0382a.m1158a("emissiveColor");
    /* renamed from: f */
    public static final long f1420f = C0382a.m1158a("reflectionColor");
    /* renamed from: g */
    public static final long f1421g = C0382a.m1158a("ambientLightColor");
    /* renamed from: h */
    public static final long f1422h = C0382a.m1158a("fogColor");
    /* renamed from: i */
    protected static long f1423i = ((((((f1418d | f1416b) | f1417c) | f1419e) | f1420f) | f1421g) | f1422h);
    /* renamed from: j */
    public final C0430b f1424j;

    private C0384b(long j) {
        super(j);
        this.f1424j = new C0430b();
        if (((f1423i & j) != 0 ? 1 : null) == null) {
            throw new GdxRuntimeException("Invalid type specified");
        }
    }

    public C0384b(long j, C0430b c0430b) {
        this(j);
        if (c0430b != null) {
            this.f1424j.m1218a(c0430b);
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C0382a c0382a = (C0382a) obj;
        return this.a != c0382a.f1409a ? (int) (this.a - c0382a.f1409a) : ((C0384b) c0382a).f1424j.m1220b() - this.f1424j.m1220b();
    }

    public final int hashCode() {
        return (super.hashCode() * 953) + this.f1424j.m1220b();
    }
}
