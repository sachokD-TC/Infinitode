package com.badlogic.gdx.graphics;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.p010a.C0242c;
import com.badlogic.gdx.p010a.C0242c.C0269a;
import com.badlogic.gdx.p010a.C0273e;
import com.badlogic.gdx.p010a.p011a.C0247d.C0246b;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.badlogic.gdx.graphics.d */
public class C0433d extends C0380h {
    /* renamed from: a */
    static final Map<Application, C0676a<C0433d>> f1650a = new HashMap();
    /* renamed from: i */
    private static C0273e f1651i;
    /* renamed from: b */
    protected C0434e f1652b;

    public C0433d(C0434e c0434e) {
        this.f1652b = c0434e;
        m1229a(c0434e);
    }

    /* renamed from: a */
    public static void m1225a(Application application) {
        f1650a.remove(application);
    }

    /* renamed from: b */
    public static void m1226b(Application application) {
        int i = 0;
        C0676a c0676a = (C0676a) f1650a.get(application);
        if (c0676a != null) {
            if (f1651i == null) {
                while (i < c0676a.f3001b) {
                    ((C0433d) c0676a.m2291a(i)).mo345a();
                    i++;
                }
                return;
            }
            f1651i.m794a();
            C0676a c0676a2 = new C0676a(c0676a);
            Iterator it = c0676a2.iterator();
            while (it.hasNext()) {
                Object obj = (C0433d) it.next();
                String a = f1651i.m793a(obj);
                if (a == null) {
                    obj.mo345a();
                } else {
                    final int c = f1651i.m800c(a);
                    f1651i.m795a(a, 0);
                    obj.d = 0;
                    C0242c c0246b = new C0246b();
                    c0246b.f916d = obj.f1652b;
                    c0246b.f917e = obj.m1132e();
                    c0246b.f918f = obj.m1133f();
                    c0246b.f919g = obj.m1134g();
                    c0246b.f920h = obj.m1135h();
                    c0246b.f915c = obj;
                    c0246b.a = new C0269a() {
                        /* renamed from: a */
                        public final void mo344a(C0273e c0273e, String str) {
                            c0273e.m795a(str, c);
                        }
                    };
                    f1651i.m799b(a);
                    obj.d = Gdx.gl.glGenTexture();
                    f1651i.m797a(a, C0433d.class, c0246b);
                }
            }
            c0676a.mo530d();
            c0676a.m2294a(c0676a2);
        }
    }

    /* renamed from: c */
    public static String m1227c() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Managed cubemap/app: { ");
        for (Application application : f1650a.keySet()) {
            stringBuilder.append(((C0676a) f1650a.get(application)).f3001b);
            stringBuilder.append(" ");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    protected final void mo345a() {
        if (this.f1652b.mo393d()) {
            this.d = Gdx.gl.glGenTexture();
            m1229a(this.f1652b);
            return;
        }
        throw new GdxRuntimeException("Tried to reload an unmanaged Cubemap");
    }

    /* renamed from: a */
    public final void m1229a(C0434e c0434e) {
        if (!c0434e.mo391a()) {
            c0434e.mo392b();
        }
        m1131d();
        m1126a(this.e, this.f);
        m1127a(this.g, this.h);
        c0434e.mo421c();
        Gdx.gl.glBindTexture(this.c, 0);
    }

    /* renamed from: b */
    public final void dispose() {
        if (this.d != 0) {
            m1137j();
            if (this.f1652b.mo393d() && f1650a.get(Gdx.app) != null) {
                ((C0676a) f1650a.get(Gdx.app)).mo529b((Object) this, true);
            }
        }
    }
}
