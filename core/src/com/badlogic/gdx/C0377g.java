package com.badlogic.gdx;

import com.badlogic.gdx.utils.C0676a;

/* renamed from: com.badlogic.gdx.g */
public final class C0377g implements C0366h {
    /* renamed from: a */
    private C0676a<C0366h> f1351a = new C0676a(4);

    /* renamed from: a */
    public final void m1082a(C0366h c0366h) {
        if (c0366h == null) {
            throw new NullPointerException("processor cannot be null");
        }
        this.f1351a.m2296a((Object) c0366h);
    }

    /* renamed from: a */
    public final boolean mo330a(char c) {
        int i = this.f1351a.f3001b;
        for (int i2 = 0; i2 < i; i2++) {
            if (((C0366h) this.f1351a.m2291a(i2)).mo330a(c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo331a(int i) {
        int i2 = this.f1351a.f3001b;
        for (int i3 = 0; i3 < i2; i3++) {
            if (((C0366h) this.f1351a.m2291a(i3)).mo331a(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo332a(int i, int i2) {
        int i3 = this.f1351a.f3001b;
        for (int i4 = 0; i4 < i3; i4++) {
            if (((C0366h) this.f1351a.m2291a(i4)).mo332a(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo333a(int i, int i2, int i3) {
        int i4 = this.f1351a.f3001b;
        for (int i5 = 0; i5 < i4; i5++) {
            if (((C0366h) this.f1351a.m2291a(i5)).mo333a(i, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo334a(int i, int i2, int i3, int i4) {
        int i5 = this.f1351a.f3001b;
        for (int i6 = 0; i6 < i5; i6++) {
            if (((C0366h) this.f1351a.m2291a(i6)).mo334a(i, i2, i3, i4)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo335b(int i) {
        int i2 = this.f1351a.f3001b;
        for (int i3 = 0; i3 < i2; i3++) {
            if (((C0366h) this.f1351a.m2291a(i3)).mo335b(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo336b(int i, int i2, int i3, int i4) {
        int i5 = this.f1351a.f3001b;
        for (int i6 = 0; i6 < i5; i6++) {
            if (((C0366h) this.f1351a.m2291a(i6)).mo336b(i, i2, i3, i4)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo337c(int i) {
        int i2 = this.f1351a.f3001b;
        for (int i3 = 0; i3 < i2; i3++) {
            if (((C0366h) this.f1351a.m2291a(i3)).mo337c(i)) {
                return true;
            }
        }
        return false;
    }
}
