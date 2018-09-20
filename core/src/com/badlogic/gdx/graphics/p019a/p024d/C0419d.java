package com.badlogic.gdx.graphics.p019a.p024d;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.p019a.p024d.C0422e.C0420a;
import com.badlogic.gdx.graphics.p019a.p024d.p025a.C0410a;
import com.badlogic.gdx.p010a.C0242c;
import com.badlogic.gdx.p010a.C0267a;
import com.badlogic.gdx.p010a.C0273e;
import com.badlogic.gdx.p010a.p011a.C0238e;
import com.badlogic.gdx.p010a.p011a.C0241b;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.C0636l;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0710q.C0707b;
import java.util.Iterator;

/* renamed from: com.badlogic.gdx.graphics.a.d.d */
public final class C0419d extends C0241b<C0416c, C0417a> {
    /* renamed from: a */
    protected C0676a<C0707b<String, C0422e<C0416c>>> f1565a = new C0676a();

    /* renamed from: com.badlogic.gdx.graphics.a.d.d$a */
    public static class C0417a extends C0242c<C0416c> {
        /* renamed from: b */
        C0676a<C0410a<?>> f1563b;
    }

    public C0419d(C0238e c0238e) {
        super(c0238e);
    }

    /* renamed from: a */
    private C0416c m1186a(String str, C0417a c0417a) {
        C0422e c0422e = null;
        synchronized (this.f1565a) {
            for (int i = 0; i < this.f1565a.f3001b; i++) {
                C0707b c0707b = (C0707b) this.f1565a.m2291a(i);
                if (((String) c0707b.f3163a).equals(str)) {
                    C0422e c0422e2 = (C0422e) c0707b.f3164b;
                    this.f1565a.mo527b(i);
                    c0422e = c0422e2;
                    break;
                }
            }
        }
        Iterator it = ((C0416c) c0422e.f1573b).f1562a.iterator();
        while (it.hasNext()) {
            C0412a c0412a = (C0412a) it.next();
            C0413b.m1181a();
            Iterator it2 = c0412a.f1545c.iterator();
            while (it2.hasNext()) {
                it2.next();
                C0413b.m1181a();
            }
            C0413b.m1181a();
        }
        if (c0417a != null) {
            if (c0417a.f1563b != null) {
                it2 = c0417a.f1563b.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
            C0416c c0416c = (C0416c) c0422e.f1573b;
            C0676a c0676a = c0417a.f1563b;
            Iterator it3 = c0416c.f1562a.iterator();
            while (it3.hasNext()) {
                c0412a = (C0412a) it3.next();
                Iterator it4 = c0676a.iterator();
                while (it4.hasNext()) {
                    if (c0412a.f1546d.m1184a((C0410a) it4.next())) {
                        break;
                    }
                }
            }
        }
        return (C0416c) c0422e.f1573b;
    }

    /* renamed from: a */
    private C0676a<C0267a> m1187a(String str, C0316a c0316a, C0417a c0417a) {
        C0676a c0676a;
        C0422e c0422e = (C0422e) new C0636l().m2174a(C0422e.class, c0316a);
        synchronized (this.f1565a) {
            Object c0707b = new C0707b();
            c0707b.f3163a = str;
            c0707b.f3164b = c0422e;
            this.f1565a.m2296a(c0707b);
            c0676a = c0422e.f1572a;
        }
        C0676a<C0267a> c0676a2 = new C0676a();
        Iterator it = c0676a.iterator();
        while (it.hasNext()) {
            C0420a c0420a = (C0420a) it.next();
            if (!m731a(c0420a.f1566a).mo270d()) {
                c0420a.f1566a = c0316a.mo265a().mo266a(Gdx.files.mo277b(c0420a.f1566a).f1119a.getName()).m896h();
            }
            if (c0420a.f1567b == C0416c.class) {
                c0676a2.m2296a(new C0267a(c0420a.f1566a, c0420a.f1567b, (C0242c) c0417a));
            } else {
                c0676a2.m2296a(new C0267a(c0420a.f1566a, c0420a.f1567b));
            }
        }
        return c0676a2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo152a(C0273e c0273e, String str, C0316a c0316a, C0242c c0242c) {
        return m1186a(str, (C0417a) c0242c);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo153b(String str, C0316a c0316a, C0242c c0242c) {
    }
}
