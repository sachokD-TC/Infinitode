package com.badlogic.gdx;

import com.badlogic.gdx.utils.C0328t.C0449a;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.badlogic.gdx.j */
public interface C0350j {

    /* renamed from: com.badlogic.gdx.j$b */
    public interface C0374b {
        /* renamed from: a */
        String mo343a();
    }

    /* renamed from: com.badlogic.gdx.j$a */
    public static class C0516a implements C0449a {
        /* renamed from: a */
        public String f2303a;
        /* renamed from: b */
        public String f2304b;
        /* renamed from: c */
        public Map<String, String> f2305c;
        /* renamed from: d */
        public int f2306d;
        /* renamed from: e */
        public String f2307e;
        /* renamed from: f */
        public InputStream f2308f;
        /* renamed from: g */
        public boolean f2309g;
        /* renamed from: h */
        private long f2310h;
        /* renamed from: i */
        private boolean f2311i;

        public C0516a() {
            this.f2306d = 0;
            this.f2309g = true;
            this.f2311i = false;
            this.f2305c = new HashMap();
        }

        public C0516a(String str) {
            this();
            this.f2303a = str;
        }

        /* renamed from: a */
        public final void mo360a() {
            this.f2303a = null;
            this.f2304b = null;
            this.f2305c.clear();
            this.f2306d = 0;
            this.f2307e = null;
            this.f2308f = null;
            this.f2310h = 0;
            this.f2309g = true;
        }
    }

    /* renamed from: com.badlogic.gdx.j$c */
    public interface C0517c {
        /* renamed from: a */
        void mo1740a(C0374b c0374b);

        /* renamed from: a */
        void mo1741a(Throwable th);
    }

    /* renamed from: a */
    void mo313a(C0516a c0516a, C0517c c0517c);

    /* renamed from: a */
    boolean mo314a(String str);
}
