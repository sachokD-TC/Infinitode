package com.badlogic.gdx.utils;

/* renamed from: com.badlogic.gdx.utils.t */
public abstract class C0328t<T> {
    /* renamed from: b */
    public final int f1173b;
    /* renamed from: c */
    public int f1174c;
    /* renamed from: d */
    public final C0676a<T> f1175d;

    /* renamed from: com.badlogic.gdx.utils.t$a */
    public interface C0449a {
        /* renamed from: a */
        void mo360a();
    }

    public C0328t() {
        this(16, Integer.MAX_VALUE);
    }

    public C0328t(int i, int i2) {
        this.f1175d = new C0676a(false, i);
        this.f1173b = i2;
    }

    /* renamed from: b */
    private static void m961b(T t) {
        if (t instanceof C0449a) {
            ((C0449a) t).mo360a();
        }
    }

    /* renamed from: a */
    public abstract T mo301a();

    /* renamed from: a */
    public final void m963a(C0676a<T> c0676a) {
        if (c0676a == null) {
            throw new IllegalArgumentException("objects cannot be null.");
        }
        C0676a c0676a2 = this.f1175d;
        int i = this.f1173b;
        for (int i2 = 0; i2 < c0676a.f3001b; i2++) {
            Object a = c0676a.m2291a(i2);
            if (a != null) {
                if (c0676a2.f3001b < i) {
                    c0676a2.m2296a(a);
                }
                C0328t.m961b(a);
            }
        }
        this.f1174c = Math.max(this.f1174c, c0676a2.f3001b);
    }

    /* renamed from: a */
    public void mo363a(T t) {
        if (t == null) {
            throw new IllegalArgumentException("object cannot be null.");
        }
        if (this.f1175d.f3001b < this.f1173b) {
            this.f1175d.m2296a((Object) t);
            this.f1174c = Math.max(this.f1174c, this.f1175d.f3001b);
        }
        C0328t.m961b(t);
    }

    /* renamed from: b */
    public final T m965b() {
        return this.f1175d.f3001b == 0 ? mo301a() : this.f1175d.mo523a();
    }
}
