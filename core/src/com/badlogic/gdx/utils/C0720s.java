package com.badlogic.gdx.utils;

import com.badlogic.gdx.utils.C0710q.C0706a;
import com.badlogic.gdx.utils.C0710q.C0707b;
import com.badlogic.gdx.utils.C0710q.C0708c;
import com.badlogic.gdx.utils.C0710q.C0709e;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.badlogic.gdx.utils.s */
public final class C0720s<K, V> extends C0710q<K, V> {
    /* renamed from: f */
    final C0676a<K> f3205f;
    /* renamed from: g */
    private C0706a f3206g;
    /* renamed from: h */
    private C0706a f3207h;
    /* renamed from: i */
    private C0709e f3208i;
    /* renamed from: j */
    private C0709e f3209j;
    /* renamed from: k */
    private C0708c f3210k;
    /* renamed from: l */
    private C0708c f3211l;

    /* renamed from: com.badlogic.gdx.utils.s$a */
    public static class C0717a<K, V> extends C0706a<K, V> {
        /* renamed from: g */
        private C0676a<K> f3202g;

        public C0717a(C0720s<K, V> c0720s) {
            super(c0720s);
            this.f3202g = c0720s.f3205f;
        }

        /* renamed from: a */
        public final C0707b mo538a() {
            if (!this.b) {
                throw new NoSuchElementException();
            } else if (this.f) {
                this.a.f3163a = this.f3202g.m2291a(this.d);
                this.a.f3164b = this.c.m2467a(this.a.f3163a);
                this.d++;
                this.b = this.d < this.c.f3165a;
                return this.a;
            } else {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
        }

        /* renamed from: b */
        public final void mo536b() {
            boolean z = false;
            this.d = 0;
            if (this.c.f3165a > 0) {
                z = true;
            }
            this.b = z;
        }

        public final /* synthetic */ Object next() {
            return mo538a();
        }

        public final void remove() {
            if (this.e < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            this.c.mo545b(this.a.f3163a);
            this.d--;
        }
    }

    /* renamed from: com.badlogic.gdx.utils.s$b */
    public static class C0718b<K> extends C0708c<K> {
        /* renamed from: a */
        private C0676a<K> f3203a;

        public C0718b(C0720s<K, ?> c0720s) {
            super(c0720s);
            this.f3203a = c0720s.f3205f;
        }

        /* renamed from: b */
        public final void mo536b() {
            boolean z = false;
            this.d = 0;
            if (this.c.f3165a > 0) {
                z = true;
            }
            this.b = z;
        }

        public final K next() {
            if (!this.b) {
                throw new NoSuchElementException();
            } else if (this.f) {
                K a = this.f3203a.m2291a(this.d);
                this.e = this.d;
                this.d++;
                this.b = this.d < this.c.f3165a;
                return a;
            } else {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
        }

        public final void remove() {
            if (this.e < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            this.c.mo545b(this.f3203a.m2291a(this.d - 1));
            this.d = this.e;
            this.e = -1;
        }
    }

    /* renamed from: com.badlogic.gdx.utils.s$c */
    public static class C0719c<V> extends C0709e<V> {
        /* renamed from: a */
        private C0676a f3204a;

        public C0719c(C0720s<?, V> c0720s) {
            super(c0720s);
            this.f3204a = c0720s.f3205f;
        }

        /* renamed from: b */
        public final void mo536b() {
            boolean z = false;
            this.d = 0;
            if (this.c.f3165a > 0) {
                z = true;
            }
            this.b = z;
        }

        public final V next() {
            if (!this.b) {
                throw new NoSuchElementException();
            } else if (this.f) {
                V a = this.c.m2467a(this.f3204a.m2291a(this.d));
                this.e = this.d;
                this.d++;
                this.b = this.d < this.c.f3165a;
                return a;
            } else {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
        }

        public final void remove() {
            if (this.e < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            this.c.mo545b(this.f3204a.m2291a(this.e));
            this.d = this.e;
            this.e = -1;
        }
    }

    public C0720s() {
        this.f3205f = new C0676a();
    }

    public C0720s(int i) {
        super(i);
        this.f3205f = new C0676a(this.d);
    }

    /* renamed from: a */
    public final V mo542a(K k, V v) {
        if (!m2474c((Object) k)) {
            this.f3205f.m2296a((Object) k);
        }
        return super.mo542a(k, v);
    }

    /* renamed from: a */
    public final void mo543a() {
        this.f3205f.mo530d();
        super.mo543a();
    }

    /* renamed from: b */
    public final C0706a<K, V> mo544b() {
        return mo546c();
    }

    /* renamed from: b */
    public final V mo545b(K k) {
        this.f3205f.mo529b((Object) k, false);
        return super.mo545b((Object) k);
    }

    /* renamed from: c */
    public final C0706a<K, V> mo546c() {
        if (this.f3206g == null) {
            this.f3206g = new C0717a(this);
            this.f3207h = new C0717a(this);
        }
        if (this.f3206g.f) {
            this.f3207h.mo536b();
            this.f3207h.f = true;
            this.f3206g.f = false;
            return this.f3207h;
        }
        this.f3206g.mo536b();
        this.f3206g.f = true;
        this.f3207h.f = false;
        return this.f3206g;
    }

    /* renamed from: d */
    public final C0709e<V> mo547d() {
        if (this.f3208i == null) {
            this.f3208i = new C0719c(this);
            this.f3209j = new C0719c(this);
        }
        if (this.f3208i.f) {
            this.f3209j.mo536b();
            this.f3209j.f = true;
            this.f3208i.f = false;
            return this.f3209j;
        }
        this.f3208i.mo536b();
        this.f3208i.f = true;
        this.f3209j.f = false;
        return this.f3208i;
    }

    /* renamed from: e */
    public final C0708c<K> mo548e() {
        if (this.f3210k == null) {
            this.f3210k = new C0718b(this);
            this.f3211l = new C0718b(this);
        }
        if (this.f3210k.f) {
            this.f3211l.mo536b();
            this.f3211l.f = true;
            this.f3210k.f = false;
            return this.f3211l;
        }
        this.f3210k.mo536b();
        this.f3210k.f = true;
        this.f3211l.f = false;
        return this.f3210k;
    }

    public final /* synthetic */ Iterator iterator() {
        return mo546c();
    }

    public final String toString() {
        if (this.a == 0) {
            return "{}";
        }
        ac acVar = new ac(32);
        acVar.m2322a('{');
        C0676a c0676a = this.f3205f;
        int i = c0676a.f3001b;
        for (int i2 = 0; i2 < i; i2++) {
            Object a = c0676a.m2291a(i2);
            if (i2 > 0) {
                acVar.m2324a(", ");
            }
            acVar.m2320a(a);
            acVar.m2322a('=');
            acVar.m2320a(m2467a(a));
        }
        acVar.m2322a('}');
        return acVar.toString();
    }
}
