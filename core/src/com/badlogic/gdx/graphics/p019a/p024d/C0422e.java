package com.badlogic.gdx.graphics.p019a.p024d;

import com.badlogic.gdx.utils.C0636l;
import com.badlogic.gdx.utils.C0636l.C0411c;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0692k;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.C0710q.C0707b;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.reflect.C0713a;
import java.util.Iterator;

/* renamed from: com.badlogic.gdx.graphics.a.d.e */
public class C0422e<T> implements C0411c {
    /* renamed from: a */
    C0676a<C0420a> f1572a = new C0676a();
    /* renamed from: b */
    public T f1573b;
    /* renamed from: c */
    private C0710q<String, C0421b> f1574c = new C0710q();
    /* renamed from: d */
    private C0676a<C0421b> f1575d = new C0676a(true, 3, C0421b.class);
    /* renamed from: e */
    private int f1576e = 0;

    /* renamed from: com.badlogic.gdx.graphics.a.d.e$a */
    public static class C0420a<T> implements C0411c {
        /* renamed from: a */
        public String f1566a;
        /* renamed from: b */
        public Class<T> f1567b;

        /* renamed from: a */
        public final void mo350a(C0636l c0636l, JsonValue jsonValue) {
            this.f1566a = (String) c0636l.m2176a("filename", String.class, jsonValue);
            String str = (String) c0636l.m2176a("type", String.class, jsonValue);
            try {
                this.f1567b = C0713a.m2493a(str);
            } catch (Throwable e) {
                throw new GdxRuntimeException("Class not found: " + str, e);
            }
        }
    }

    /* renamed from: com.badlogic.gdx.graphics.a.d.e$b */
    public static class C0421b implements C0411c {
        /* renamed from: a */
        C0710q<String, Object> f1568a = new C0710q();
        /* renamed from: b */
        C0692k f1569b = new C0692k();
        /* renamed from: c */
        protected C0422e f1570c;
        /* renamed from: d */
        private int f1571d = 0;

        /* renamed from: a */
        public final void mo350a(C0636l c0636l, JsonValue jsonValue) {
            this.f1568a = (C0710q) c0636l.m2176a("data", C0710q.class, jsonValue);
            C0692k c0692k = this.f1569b;
            int[] iArr = (int[]) c0636l.m2176a("indices", int[].class, jsonValue);
            int length = iArr.length;
            Object obj = c0692k.f3090a;
            int i = c0692k.f3091b + length;
            if (i > obj.length) {
                obj = c0692k.m2422d(Math.max(8, (int) (((float) i) * 1.75f)));
            }
            System.arraycopy(iArr, 0, obj, c0692k.f3091b, length);
            c0692k.f3091b += length;
        }
    }

    /* renamed from: a */
    public final void mo350a(C0636l c0636l, JsonValue jsonValue) {
        this.f1574c = (C0710q) c0636l.m2176a("unique", C0710q.class, jsonValue);
        Iterator c = this.f1574c.mo546c();
        while (c.hasNext()) {
            ((C0421b) ((C0707b) c.next()).f3164b).f1570c = this;
        }
        this.f1575d = (C0676a) c0636l.m2177a("data", C0676a.class, C0421b.class, jsonValue);
        c = this.f1575d.iterator();
        while (c.hasNext()) {
            ((C0421b) c.next()).f1570c = this;
        }
        this.f1572a.m2294a((C0676a) c0636l.m2177a("assets", C0676a.class, C0420a.class, jsonValue));
        this.f1573b = c0636l.m2176a("resource", null, jsonValue);
    }
}
