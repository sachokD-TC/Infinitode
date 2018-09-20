package com.badlogic.gdx.p010a.p011a;

import com.badlogic.gdx.p010a.C0242c;
import com.badlogic.gdx.p010a.C0267a;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.C0676a;

/* renamed from: com.badlogic.gdx.a.a.a */
public abstract class C0240a<T, P extends C0242c<T>> {
    /* renamed from: a */
    private C0238e f902a;

    public C0240a(C0238e c0238e) {
        this.f902a = c0238e;
    }

    /* renamed from: a */
    public final C0316a m731a(String str) {
        return this.f902a.mo150a(str);
    }

    /* renamed from: a */
    public abstract C0676a<C0267a> mo151a(String str, C0316a c0316a, P p);
}
