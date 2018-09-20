package com.badlogic.gdx.utils;

import java.util.Comparator;

/* renamed from: com.badlogic.gdx.utils.f */
public final class C0688f<T> extends C0676a<T> {
    /* renamed from: d */
    private int f3075d;
    /* renamed from: e */
    private C0692k f3076e = new C0692k(0);
    /* renamed from: f */
    private int f3077f;

    public C0688f(byte b) {
        super(0);
    }

    /* renamed from: f */
    private void m2392f(int i) {
        if (i >= this.f3077f) {
            int i2 = this.f3076e.f3091b;
            for (int i3 = 0; i3 < i2; i3++) {
                int b = this.f3076e.m2420b(i3);
                if (i == b) {
                    return;
                }
                if (i < b) {
                    this.f3076e.m2419a(i3, i);
                    return;
                }
            }
            this.f3076e.m2418a(i);
        }
    }

    /* renamed from: a */
    public final T mo523a() {
        if (this.f3075d <= 0) {
            return super.mo523a();
        }
        throw new IllegalStateException("Invalid between begin/end.");
    }

    /* renamed from: a */
    public final void mo524a(int i, int i2) {
        if (this.f3075d > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.mo524a(i, i2);
    }

    /* renamed from: a */
    public final void mo525a(int i, T t) {
        if (this.f3075d > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.mo525a(i, (Object) t);
    }

    /* renamed from: a */
    public final void mo526a(Comparator<? super T> comparator) {
        if (this.f3075d > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.mo526a((Comparator) comparator);
    }

    /* renamed from: b */
    public final T mo527b(int i) {
        if (this.f3075d <= 0) {
            return super.mo527b(i);
        }
        m2392f(i);
        return m2291a(i);
    }

    /* renamed from: b */
    public final void mo528b(int i, int i2) {
        if (this.f3075d > 0) {
            while (i2 >= i) {
                m2392f(i2);
                i2--;
            }
            return;
        }
        super.mo528b(i, i2);
    }

    /* renamed from: b */
    public final boolean mo529b(T t, boolean z) {
        if (this.f3075d <= 0) {
            return super.mo529b((Object) t, z);
        }
        int a = m2289a((Object) t, z);
        if (a == -1) {
            return false;
        }
        m2392f(a);
        return true;
    }

    /* renamed from: d */
    public final void mo530d() {
        if (this.f3075d > 0) {
            this.f3077f = this.b;
        } else {
            super.mo530d();
        }
    }

    /* renamed from: e */
    public final void mo531e(int i) {
        if (this.f3075d > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.mo531e(i);
    }

    /* renamed from: f */
    public final void m2402f() {
        this.f3075d++;
    }

    /* renamed from: g */
    public final void m2403g() {
        if (this.f3075d == 0) {
            throw new IllegalStateException("begin must be called before end.");
        }
        this.f3075d--;
        if (this.f3075d == 0) {
            if (this.f3077f <= 0 || this.f3077f != this.b) {
                int i;
                int i2 = this.f3076e.f3091b;
                for (i = 0; i < i2; i++) {
                    int a = this.f3076e.m2417a();
                    if (a >= this.f3077f) {
                        mo527b(a);
                    }
                }
                for (i = this.f3077f - 1; i >= 0; i--) {
                    mo527b(i);
                }
            } else {
                this.f3076e.f3091b = 0;
                mo530d();
            }
            this.f3077f = 0;
        }
    }
}
