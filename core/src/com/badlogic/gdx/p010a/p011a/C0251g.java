package com.badlogic.gdx.p010a.p011a;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.Texture.TextureWrap;
import com.badlogic.gdx.graphics.p019a.C0423d;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0394b;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0395c;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0402j;
import com.badlogic.gdx.graphics.p019a.p029e.C0425b.C0426a;
import com.badlogic.gdx.p010a.C0242c;
import com.badlogic.gdx.p010a.C0267a;
import com.badlogic.gdx.p010a.C0273e;
import com.badlogic.gdx.p010a.p011a.C0266p.C0265b;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0710q.C0707b;
import java.util.Iterator;

/* renamed from: com.badlogic.gdx.a.a.g */
public abstract class C0251g<P extends C0250a> extends C0241b<C0423d, P> {
    /* renamed from: a */
    protected C0676a<C0707b<String, C0394b>> f926a = new C0676a();
    /* renamed from: b */
    protected C0250a f927b = new C0250a();

    /* renamed from: com.badlogic.gdx.a.a.g$a */
    public static class C0250a extends C0242c<C0423d> {
        /* renamed from: b */
        public C0265b f925b = new C0265b();

        public C0250a() {
            C0265b c0265b = this.f925b;
            C0265b c0265b2 = this.f925b;
            TextureFilter textureFilter = TextureFilter.Linear;
            c0265b2.f953g = textureFilter;
            c0265b.f952f = textureFilter;
            c0265b = this.f925b;
            c0265b2 = this.f925b;
            TextureWrap textureWrap = TextureWrap.Repeat;
            c0265b2.f955i = textureWrap;
            c0265b.f954h = textureWrap;
        }
    }

    public C0251g(C0238e c0238e) {
        super(c0238e);
    }

    /* renamed from: a */
    private C0423d m744a(C0273e c0273e, String str) {
        synchronized (this.f926a) {
            int i = 0;
            C0394b c0394b = null;
            while (i < this.f926a.f3001b) {
                C0394b c0394b2;
                if (((String) ((C0707b) this.f926a.m2291a(i)).f3163a).equals(str)) {
                    c0394b2 = (C0394b) ((C0707b) this.f926a.m2291a(i)).f3164b;
                    this.f926a.mo527b(i);
                } else {
                    c0394b2 = c0394b;
                }
                i++;
                c0394b = c0394b2;
            }
        }
        if (c0394b == null) {
            return null;
        }
        C0423d c0423d = new C0423d(c0394b, new C0426a(c0273e));
        Iterator it = c0423d.m1201a().iterator();
        while (it.hasNext()) {
            if (((Disposable) it.next()) instanceof Texture) {
                it.remove();
            }
        }
        return c0423d;
    }

    /* renamed from: a */
    private C0676a<C0267a> m745a(String str, C0316a c0316a, P p) {
        C0676a<C0267a> c0676a = new C0676a();
        C0394b a = mo347a(c0316a, (C0250a) p);
        if (a == null) {
            return c0676a;
        }
        Object c0707b = new C0707b();
        c0707b.f3163a = str;
        c0707b.f3164b = a;
        synchronized (this.f926a) {
            this.f926a.m2296a(c0707b);
        }
        C0242c c0242c = p != null ? p.f925b : this.f927b.f925b;
        Iterator it = a.f1467d.iterator();
        while (it.hasNext()) {
            C0395c c0395c = (C0395c) it.next();
            if (c0395c.f1478i != null) {
                Iterator it2 = c0395c.f1478i.iterator();
                while (it2.hasNext()) {
                    c0676a.m2296a(new C0267a(((C0402j) it2.next()).f1503b, Texture.class, c0242c));
                }
            }
        }
        return c0676a;
    }

    /* renamed from: a */
    public abstract C0394b mo347a(C0316a c0316a, P p);

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo152a(C0273e c0273e, String str, C0316a c0316a, C0242c c0242c) {
        return m744a(c0273e, str);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo153b(String str, C0316a c0316a, C0242c c0242c) {
    }
}
