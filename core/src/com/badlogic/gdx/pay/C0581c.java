package com.badlogic.gdx.pay;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.badlogic.gdx.pay.c */
public final class C0581c {
    /* renamed from: a */
    private OfferType f2521a;
    /* renamed from: b */
    private String f2522b;
    /* renamed from: c */
    private Map<String, String> f2523c = new HashMap(16);

    /* renamed from: a */
    public final synchronized OfferType m1853a() {
        return this.f2521a;
    }

    /* renamed from: a */
    public final synchronized C0581c m1854a(OfferType offerType) {
        this.f2521a = offerType;
        return this;
    }

    /* renamed from: a */
    public final synchronized C0581c m1855a(String str) {
        this.f2522b = str;
        return this;
    }

    /* renamed from: b */
    public final synchronized String m1856b() {
        return this.f2522b;
    }

    public final String toString() {
        return "Offer{type=" + this.f2521a + ", identifier='" + this.f2522b + '\'' + ", identifierForStores=" + this.f2523c + '}';
    }
}
