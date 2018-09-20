package com.badlogic.gdx.graphics.p019a;

import com.badlogic.gdx.utils.C0676a;

/* renamed from: com.badlogic.gdx.graphics.a.a */
public abstract class C0382a implements Comparable<C0382a> {
    /* renamed from: b */
    private static final C0676a<String> f1408b = new C0676a();
    /* renamed from: a */
    public final long f1409a;
    /* renamed from: c */
    private final int f1410c;

    public C0382a(long j) {
        this.f1409a = j;
        this.f1410c = Long.numberOfTrailingZeros(j);
    }

    /* renamed from: a */
    public static final long m1158a(String str) {
        long j;
        for (int i = 0; i < f1408b.f3001b; i++) {
            if (((String) f1408b.m2291a(i)).compareTo(str) == 0) {
                j = 1 << i;
                break;
            }
        }
        j = 0;
        if (j > 0) {
            return j;
        }
        f1408b.m2296a((Object) str);
        return 1 << (f1408b.f3001b - 1);
    }

    /* renamed from: a */
    protected final boolean m1159a(C0382a c0382a) {
        return c0382a.hashCode() == hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0382a)) {
            return false;
        }
        C0382a c0382a = (C0382a) obj;
        return this.f1409a == c0382a.f1409a ? m1159a(c0382a) : false;
    }

    public int hashCode() {
        return this.f1410c * 7489;
    }

    public String toString() {
        long j = this.f1409a;
        int i = -1;
        while (j != 0) {
            i++;
            if (i < 63) {
                if (((j >> i) & 1) != 0) {
                    break;
                }
            }
            break;
        }
        return (i < 0 || i >= f1408b.f3001b) ? null : (String) f1408b.m2291a(i);
    }
}
