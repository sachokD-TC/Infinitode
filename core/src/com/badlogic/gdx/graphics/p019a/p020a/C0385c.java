package com.badlogic.gdx.graphics.p019a.p020a;

import com.badlogic.gdx.graphics.p019a.C0382a;
import com.badlogic.gdx.math.C0549f;

/* renamed from: com.badlogic.gdx.graphics.a.a.c */
public final class C0385c extends C0382a {
    /* renamed from: b */
    public static final long f1425b = C0382a.m1158a("shininess");
    /* renamed from: c */
    public static final long f1426c = C0382a.m1158a("alphaTest");
    /* renamed from: d */
    public float f1427d;

    public C0385c(long j, float f) {
        super(j);
        this.f1427d = f;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C0382a c0382a = (C0382a) obj;
        if (this.a != c0382a.f1409a) {
            return (int) (this.a - c0382a.f1409a);
        }
        float f = ((C0385c) c0382a).f1427d;
        return C0549f.m1764a(this.f1427d, f) ? 0 : this.f1427d < f ? -1 : 1;
    }

    public final int hashCode() {
        return (super.hashCode() * 977) + Float.floatToRawIntBits(this.f1427d);
    }
}
