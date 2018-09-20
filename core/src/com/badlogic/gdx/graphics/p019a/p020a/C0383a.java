package com.badlogic.gdx.graphics.p019a.p020a;

import com.badlogic.gdx.graphics.p019a.C0382a;
import com.badlogic.gdx.math.C0549f;

/* renamed from: com.badlogic.gdx.graphics.a.a.a */
public final class C0383a extends C0382a {
    /* renamed from: b */
    public static final long f1411b = C0382a.m1158a("blended");
    /* renamed from: c */
    public boolean f1412c;
    /* renamed from: d */
    public int f1413d;
    /* renamed from: e */
    public int f1414e;
    /* renamed from: f */
    public float f1415f;

    public C0383a() {
        this((byte) 0);
    }

    private C0383a(byte b) {
        this(1.0f);
    }

    private C0383a(float f) {
        super(f1411b);
        this.f1415f = 1.0f;
        this.f1412c = true;
        this.f1413d = 770;
        this.f1414e = 771;
        this.f1415f = f;
    }

    public C0383a(float f, byte b) {
        this(f);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C0382a c0382a = (C0382a) obj;
        if (this.a != c0382a.f1409a) {
            return (int) (this.a - c0382a.f1409a);
        }
        C0383a c0383a = (C0383a) c0382a;
        return this.f1412c != c0383a.f1412c ? !this.f1412c ? -1 : 1 : this.f1413d != c0383a.f1413d ? this.f1413d - c0383a.f1413d : this.f1414e != c0383a.f1414e ? this.f1414e - c0383a.f1414e : C0549f.m1764a(this.f1415f, c0383a.f1415f) ? 0 : this.f1415f >= c0383a.f1415f ? -1 : 1;
    }

    public final int hashCode() {
        return (((((((this.f1412c ? 1 : 0) + (super.hashCode() * 947)) * 947) + this.f1413d) * 947) + this.f1414e) * 947) + Float.floatToRawIntBits(this.f1415f);
    }
}
