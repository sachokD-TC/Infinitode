package com.badlogic.gdx.p010a.p011a;

import com.badlogic.gdx.graphics.g2d.C0453f;
import com.badlogic.gdx.graphics.g2d.C0480m;
import com.badlogic.gdx.p010a.C0242c;
import com.badlogic.gdx.p010a.C0267a;
import com.badlogic.gdx.p010a.C0273e;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.C0676a;

/* renamed from: com.badlogic.gdx.a.a.i */
public final class C0255i extends C0254n<C0453f, C0253a> {

    /* renamed from: com.badlogic.gdx.a.a.i$a */
    public static class C0253a extends C0242c<C0453f> {
        /* renamed from: b */
        public String f929b;
        /* renamed from: c */
        public String f930c;
        /* renamed from: d */
        public C0316a f931d;
    }

    public C0255i(C0238e c0238e) {
        super(c0238e);
    }

    /* renamed from: a */
    public final /* synthetic */ C0676a mo151a(String str, C0316a c0316a, C0242c c0242c) {
        C0253a c0253a = (C0253a) c0242c;
        if (c0253a == null || c0253a.f929b == null) {
            return null;
        }
        C0676a c0676a = new C0676a();
        c0676a.m2296a(new C0267a(c0253a.f929b, C0480m.class));
        return c0676a;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo154a(C0273e c0273e, String str, C0316a c0316a, C0242c c0242c) {
        C0253a c0253a = (C0253a) c0242c;
        C0453f c0453f = new C0453f();
        if (c0253a != null && c0253a.f929b != null) {
            c0453f.m1353a(c0316a, (C0480m) c0273e.m792a(c0253a.f929b, C0480m.class), c0253a.f930c);
        } else if (c0253a == null || c0253a.f931d == null) {
            c0453f.m1352a(c0316a, c0316a.mo265a());
        } else {
            c0453f.m1352a(c0316a, c0253a.f931d);
        }
        return c0453f;
    }
}
