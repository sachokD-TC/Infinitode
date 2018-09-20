package com.badlogic.gdx.pay;

/* renamed from: com.badlogic.gdx.pay.a */
public final class C0552a {
    /* renamed from: a */
    public static final C0552a f2462a = new C0552a();
    /* renamed from: b */
    public String f2463b;
    /* renamed from: c */
    public String f2464c;
    /* renamed from: d */
    public String f2465d;
    /* renamed from: e */
    public Integer f2466e;
    /* renamed from: f */
    public String f2467f;

    /* renamed from: com.badlogic.gdx.pay.a$a */
    public static final class C0551a {
        /* renamed from: a */
        public String f2457a;
        /* renamed from: b */
        public String f2458b;
        /* renamed from: c */
        public String f2459c;
        /* renamed from: d */
        public Integer f2460d;
        /* renamed from: e */
        public String f2461e;

        private C0551a() {
        }
    }

    private C0552a() {
        this.f2463b = null;
        this.f2464c = null;
        this.f2465d = null;
    }

    private C0552a(C0551a c0551a) {
        this.f2463b = c0551a.f2457a;
        this.f2464c = c0551a.f2458b;
        this.f2465d = c0551a.f2459c;
        this.f2466e = c0551a.f2460d;
        this.f2467f = c0551a.f2461e;
    }

    /* renamed from: a */
    public static C0551a m1775a() {
        return new C0551a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0552a c0552a = (C0552a) obj;
        if (this.f2463b == null ? c0552a.f2463b != null : !this.f2463b.equals(c0552a.f2463b)) {
            return false;
        }
        if (this.f2464c == null ? c0552a.f2464c != null : !this.f2464c.equals(c0552a.f2464c)) {
            return false;
        }
        if (this.f2465d != null) {
            if (this.f2465d.equals(c0552a.f2465d)) {
                return true;
            }
        } else if (c0552a.f2465d == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f2464c != null ? this.f2464c.hashCode() : 0) + ((this.f2463b != null ? this.f2463b.hashCode() : 0) * 31)) * 31;
        if (this.f2465d != null) {
            i = this.f2465d.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Information{localName='" + this.f2463b + '\'' + ", localDescription='" + this.f2464c + '\'' + ", localPricing='" + this.f2465d + '\'' + '}';
    }
}
