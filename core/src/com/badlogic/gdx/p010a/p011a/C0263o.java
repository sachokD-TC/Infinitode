package com.badlogic.gdx.p010a.p011a;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.C0480m;
import com.badlogic.gdx.graphics.g2d.C0480m.C0479c;
import com.badlogic.gdx.graphics.g2d.C0480m.C0479c.C0477a;
import com.badlogic.gdx.p010a.C0242c;
import com.badlogic.gdx.p010a.C0267a;
import com.badlogic.gdx.p010a.C0273e;
import com.badlogic.gdx.p010a.p011a.C0266p.C0265b;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.C0676a;
import java.util.Iterator;

/* renamed from: com.badlogic.gdx.a.a.o */
public final class C0263o extends C0254n<C0480m, C0262a> {
    /* renamed from: a */
    C0479c f944a;

    /* renamed from: com.badlogic.gdx.a.a.o$a */
    public static class C0262a extends C0242c<C0480m> {
        /* renamed from: b */
        public boolean f943b = false;
    }

    public C0263o(C0238e c0238e) {
        super(c0238e);
    }

    /* renamed from: a */
    public final /* synthetic */ C0676a mo151a(String str, C0316a c0316a, C0242c c0242c) {
        C0262a c0262a = (C0262a) c0242c;
        C0316a a = c0316a.mo265a();
        if (c0262a != null) {
            this.f944a = new C0479c(c0316a, a, c0262a.f943b);
        } else {
            this.f944a = new C0479c(c0316a, a, false);
        }
        C0676a c0676a = new C0676a();
        Iterator it = this.f944a.f2082a.iterator();
        while (it.hasNext()) {
            C0477a c0477a = (C0477a) it.next();
            C0242c c0265b = new C0265b();
            c0265b.f948b = c0477a.f2062f;
            c0265b.f949c = c0477a.f2061e;
            c0265b.f952f = c0477a.f2063g;
            c0265b.f953g = c0477a.f2064h;
            c0676a.m2296a(new C0267a(c0477a.f2057a, Texture.class, c0265b));
        }
        return c0676a;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo154a(C0273e c0273e, String str, C0316a c0316a, C0242c c0242c) {
        Iterator it = this.f944a.f2082a.iterator();
        while (it.hasNext()) {
            C0477a c0477a = (C0477a) it.next();
            c0477a.f2058b = (Texture) c0273e.m792a(c0477a.f2057a.m896h().replaceAll("\\\\", "/"), Texture.class);
        }
        C0480m c0480m = new C0480m(this.f944a);
        this.f944a = null;
        return c0480m;
    }
}
