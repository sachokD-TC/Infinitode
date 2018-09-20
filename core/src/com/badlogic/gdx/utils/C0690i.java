package com.badlogic.gdx.utils;

/* renamed from: com.badlogic.gdx.utils.i */
public final class C0690i {
    /* renamed from: a */
    public static boolean f3081a = false;
    /* renamed from: b */
    private static boolean f3082b;

    /* renamed from: a */
    public static synchronized void m2409a() {
        synchronized (C0690i.class) {
            if (!f3082b) {
                f3082b = true;
                if (!f3081a) {
                    new C0726x().m2526a("gdx");
                }
            }
        }
    }
}
