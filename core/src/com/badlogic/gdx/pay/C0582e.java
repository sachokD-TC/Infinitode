package com.badlogic.gdx.pay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.badlogic.gdx.pay.e */
public final class C0582e {
    /* renamed from: a */
    private List<C0581c> f2524a = new ArrayList(16);
    /* renamed from: b */
    private Map<String, Object> f2525b = new HashMap(16);

    /* renamed from: a */
    public final synchronized int m1857a() {
        return this.f2524a.size();
    }

    /* renamed from: a */
    public final synchronized C0581c m1858a(int i) {
        return (C0581c) this.f2524a.get(i);
    }

    /* renamed from: a */
    public final synchronized C0581c m1859a(String str) {
        C0581c c0581c;
        for (int i = 0; i < this.f2524a.size(); i++) {
            if (((C0581c) this.f2524a.get(i)).m1856b().equals(str)) {
                c0581c = (C0581c) this.f2524a.get(i);
                break;
            }
        }
        c0581c = null;
        return c0581c;
    }

    /* renamed from: a */
    public final synchronized void m1860a(C0581c c0581c) {
        this.f2524a.add(c0581c);
    }

    /* renamed from: a */
    public final synchronized void m1861a(String str, Object obj) {
        this.f2525b.put(str, obj);
    }
}
