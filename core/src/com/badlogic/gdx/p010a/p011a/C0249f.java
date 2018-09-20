package com.badlogic.gdx.p010a.p011a;

import com.badlogic.gdx.p010a.C0242c;
import com.badlogic.gdx.p010a.C0273e;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0691j;
import java.util.Locale;

/* renamed from: com.badlogic.gdx.a.a.f */
public final class C0249f extends C0241b<C0691j, C0248a> {
    /* renamed from: a */
    C0691j f924a;

    /* renamed from: com.badlogic.gdx.a.a.f$a */
    public static class C0248a extends C0242c<C0691j> {
        /* renamed from: b */
        public final Locale f922b;
        /* renamed from: c */
        public final String f923c;

        public C0248a() {
            this((byte) 0);
        }

        private C0248a(byte b) {
            this.f922b = null;
            this.f923c = null;
        }
    }

    public C0249f(C0238e c0238e) {
        super(c0238e);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0676a mo151a(String str, C0316a c0316a, C0242c c0242c) {
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo152a(C0273e c0273e, String str, C0316a c0316a, C0242c c0242c) {
        C0691j c0691j = this.f924a;
        this.f924a = null;
        return c0691j;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo153b(String str, C0316a c0316a, C0242c c0242c) {
        Locale locale;
        String str2 = null;
        C0248a c0248a = (C0248a) c0242c;
        this.f924a = null;
        if (c0248a == null) {
            locale = Locale.getDefault();
        } else {
            locale = c0248a.f922b == null ? Locale.getDefault() : c0248a.f922b;
            str2 = c0248a.f923c;
        }
        if (str2 == null) {
            this.f924a = C0691j.m2412a(c0316a, locale);
        } else {
            this.f924a = C0691j.m2413a(c0316a, locale, str2);
        }
    }
}
