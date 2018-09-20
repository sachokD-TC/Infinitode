package com.badlogic.gdx.utils;

/* renamed from: com.badlogic.gdx.utils.u */
public final class C0721u {
    /* renamed from: a */
    private static final C0710q<Class, C0328t> f3212a = new C0710q();

    /* renamed from: a */
    public static <T> C0328t<T> m2511a(Class<T> cls) {
        C0328t<T> c0328t = (C0328t) f3212a.m2467a((Object) cls);
        if (c0328t != null) {
            return c0328t;
        }
        C0328t c0725w = new C0725w(cls);
        f3212a.mo542a(cls, c0725w);
        return c0725w;
    }

    /* renamed from: a */
    public static void m2512a(C0676a c0676a) {
        if (c0676a == null) {
            throw new IllegalArgumentException("Objects cannot be null.");
        }
        int i = c0676a.f3001b;
        C0328t c0328t = null;
        for (int i2 = 0; i2 < i; i2++) {
            Object a = c0676a.m2291a(i2);
            if (a != null) {
                if (c0328t == null) {
                    c0328t = (C0328t) f3212a.m2467a(a.getClass());
                    if (c0328t == null) {
                    }
                }
                c0328t.mo363a(a);
            }
        }
    }

    /* renamed from: a */
    public static void m2513a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object cannot be null.");
        }
        C0328t c0328t = (C0328t) f3212a.m2467a(obj.getClass());
        if (c0328t != null) {
            c0328t.mo363a(obj);
        }
    }

    /* renamed from: b */
    public static <T> T m2514b(Class<T> cls) {
        return C0721u.m2511a((Class) cls).m965b();
    }
}
