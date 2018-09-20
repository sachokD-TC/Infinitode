package com.badlogic.gdx.utils;

import java.util.Comparator;

/* renamed from: com.badlogic.gdx.utils.z */
public final class C0728z<T> extends C0676a<T> {
    /* renamed from: d */
    private T[] f3240d;
    /* renamed from: e */
    private T[] f3241e;
    /* renamed from: f */
    private int f3242f;

    public C0728z(Class cls) {
        super(true, 4, cls);
    }

    public C0728z(Class cls, byte b) {
        super(cls);
    }

    /* renamed from: h */
    private void m2530h() {
        if (this.f3240d != null && this.f3240d == this.a) {
            if (this.f3241e == null || this.f3241e.length < this.b) {
                m2307d(this.a.length);
                return;
            }
            System.arraycopy(this.a, 0, this.f3241e, 0, this.b);
            this.a = this.f3241e;
            this.f3241e = null;
        }
    }

    /* renamed from: a */
    public final T mo523a() {
        m2530h();
        return super.mo523a();
    }

    /* renamed from: a */
    public final void mo524a(int i, int i2) {
        m2530h();
        super.mo524a(i, i2);
    }

    /* renamed from: a */
    public final void mo525a(int i, T t) {
        m2530h();
        super.mo525a(i, (Object) t);
    }

    /* renamed from: a */
    public final void mo526a(Comparator<? super T> comparator) {
        m2530h();
        super.mo526a((Comparator) comparator);
    }

    /* renamed from: b */
    public final T mo527b(int i) {
        m2530h();
        return super.mo527b(i);
    }

    /* renamed from: b */
    public final void mo528b(int i, int i2) {
        m2530h();
        super.mo528b(i, i2);
    }

    /* renamed from: b */
    public final boolean mo529b(T t, boolean z) {
        m2530h();
        return super.mo529b((Object) t, z);
    }

    /* renamed from: d */
    public final void mo530d() {
        m2530h();
        super.mo530d();
    }

    /* renamed from: e */
    public final void mo531e(int i) {
        m2530h();
        super.mo531e(i);
    }

    /* renamed from: f */
    public final T[] m2540f() {
        m2530h();
        this.f3240d = this.a;
        this.f3242f++;
        return this.a;
    }

    /* renamed from: g */
    public final void m2541g() {
        int i = 0;
        this.f3242f = Math.max(0, this.f3242f - 1);
        if (this.f3240d != null) {
            if (this.f3240d != this.a && this.f3242f == 0) {
                this.f3241e = this.f3240d;
                int length = this.f3241e.length;
                while (i < length) {
                    this.f3241e[i] = null;
                    i++;
                }
            }
            this.f3240d = null;
        }
    }
}
