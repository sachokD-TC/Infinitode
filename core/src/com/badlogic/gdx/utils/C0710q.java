package com.badlogic.gdx.utils;

import com.badlogic.gdx.math.C0549f;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.badlogic.gdx.utils.q */
public class C0710q<K, V> implements Iterable<C0707b<K, V>> {
    /* renamed from: a */
    public int f3165a;
    /* renamed from: b */
    K[] f3166b;
    /* renamed from: c */
    V[] f3167c;
    /* renamed from: d */
    int f3168d;
    /* renamed from: e */
    int f3169e;
    /* renamed from: f */
    private float f3170f;
    /* renamed from: g */
    private int f3171g;
    /* renamed from: h */
    private int f3172h;
    /* renamed from: i */
    private int f3173i;
    /* renamed from: j */
    private int f3174j;
    /* renamed from: k */
    private int f3175k;
    /* renamed from: l */
    private C0706a f3176l;
    /* renamed from: m */
    private C0706a f3177m;
    /* renamed from: n */
    private C0709e f3178n;
    /* renamed from: o */
    private C0709e f3179o;
    /* renamed from: p */
    private C0708c f3180p;
    /* renamed from: q */
    private C0708c f3181q;

    /* renamed from: com.badlogic.gdx.utils.q$d */
    private static abstract class C0705d<K, V, I> implements Iterable<I>, Iterator<I> {
        /* renamed from: b */
        public boolean f3157b;
        /* renamed from: c */
        public final C0710q<K, V> f3158c;
        /* renamed from: d */
        int f3159d;
        /* renamed from: e */
        int f3160e;
        /* renamed from: f */
        boolean f3161f = true;

        public C0705d(C0710q<K, V> c0710q) {
            this.f3158c = c0710q;
            mo536b();
        }

        /* renamed from: b */
        public void mo536b() {
            this.f3160e = -1;
            this.f3159d = -1;
            m2457c();
        }

        /* renamed from: c */
        final void m2457c() {
            this.f3157b = false;
            Object[] objArr = this.f3158c.f3166b;
            int i = this.f3158c.f3168d + this.f3158c.f3169e;
            do {
                int i2 = this.f3159d + 1;
                this.f3159d = i2;
                if (i2 >= i) {
                    return;
                }
            } while (objArr[this.f3159d] == null);
            this.f3157b = true;
        }

        public void remove() {
            if (this.f3160e < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            if (this.f3160e >= this.f3158c.f3168d) {
                this.f3158c.m2470a(this.f3160e);
                this.f3159d = this.f3160e - 1;
                m2457c();
            } else {
                this.f3158c.f3166b[this.f3160e] = null;
                this.f3158c.f3167c[this.f3160e] = null;
            }
            this.f3160e = -1;
            C0710q c0710q = this.f3158c;
            c0710q.f3165a--;
        }
    }

    /* renamed from: com.badlogic.gdx.utils.q$a */
    public static class C0706a<K, V> extends C0705d<K, V, C0707b<K, V>> {
        /* renamed from: a */
        C0707b<K, V> f3162a = new C0707b();

        public C0706a(C0710q<K, V> c0710q) {
            super(c0710q);
        }

        /* renamed from: a */
        public C0707b<K, V> mo538a() {
            if (!this.b) {
                throw new NoSuchElementException();
            } else if (this.f) {
                Object[] objArr = this.c.f3166b;
                this.f3162a.f3163a = objArr[this.d];
                this.f3162a.f3164b = this.c.f3167c[this.d];
                this.e = this.d;
                m2457c();
                return this.f3162a;
            } else {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ void mo536b() {
            super.mo536b();
        }

        public boolean hasNext() {
            if (this.f) {
                return this.b;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return this;
        }

        public /* synthetic */ Object next() {
            return mo538a();
        }

        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }
    }

    /* renamed from: com.badlogic.gdx.utils.q$b */
    public static class C0707b<K, V> {
        /* renamed from: a */
        public K f3163a;
        /* renamed from: b */
        public V f3164b;

        public final String toString() {
            return this.f3163a + "=" + this.f3164b;
        }
    }

    /* renamed from: com.badlogic.gdx.utils.q$c */
    public static class C0708c<K> extends C0705d<K, Object, K> {
        public C0708c(C0710q<K, ?> c0710q) {
            super(c0710q);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ void mo536b() {
            super.mo536b();
        }

        public boolean hasNext() {
            if (this.f) {
                return this.b;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return this;
        }

        public K next() {
            if (!this.b) {
                throw new NoSuchElementException();
            } else if (this.f) {
                K k = this.c.f3166b[this.d];
                this.e = this.d;
                m2457c();
                return k;
            } else {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
        }

        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }
    }

    /* renamed from: com.badlogic.gdx.utils.q$e */
    public static class C0709e<V> extends C0705d<Object, V, V> {
        public C0709e(C0710q<?, V> c0710q) {
            super(c0710q);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ void mo536b() {
            super.mo536b();
        }

        public boolean hasNext() {
            if (this.f) {
                return this.b;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return this;
        }

        public V next() {
            if (!this.b) {
                throw new NoSuchElementException();
            } else if (this.f) {
                V v = this.c.f3167c[this.d];
                this.e = this.d;
                m2457c();
                return v;
            } else {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
        }

        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }
    }

    public C0710q() {
        this(51, (byte) 0);
    }

    public C0710q(int i) {
        this(i, (byte) 0);
    }

    private C0710q(int i, byte b) {
        if (i < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i);
        }
        int b2 = C0549f.m1768b((int) Math.ceil((double) (((float) i) / 0.8f)));
        if (b2 > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + b2);
        }
        this.f3168d = b2;
        this.f3170f = 0.8f;
        this.f3173i = (int) (((float) this.f3168d) * 0.8f);
        this.f3172h = this.f3168d - 1;
        this.f3171g = 31 - Integer.numberOfTrailingZeros(this.f3168d);
        this.f3174j = Math.max(3, ((int) Math.ceil(Math.log((double) this.f3168d))) * 2);
        this.f3175k = Math.max(Math.min(this.f3168d, 8), ((int) Math.sqrt((double) this.f3168d)) / 8);
        this.f3166b = new Object[(this.f3168d + this.f3174j)];
        this.f3167c = new Object[this.f3166b.length];
    }

    /* renamed from: a */
    private void m2462a(K k, V v, int i, K k2, int i2, K k3, int i3, K k4) {
        Object[] objArr = this.f3166b;
        Object[] objArr2 = this.f3167c;
        int i4 = this.f3172h;
        int i5 = 0;
        int i6 = this.f3175k;
        do {
            V v2;
            switch (C0549f.m1762a()) {
                case 0:
                    v2 = objArr2[i];
                    objArr[i] = k;
                    objArr2[i] = v;
                    v = v2;
                    k = k2;
                    break;
                case 1:
                    v2 = objArr2[i2];
                    objArr[i2] = k;
                    objArr2[i2] = v;
                    v = v2;
                    k = k3;
                    break;
                default:
                    v2 = objArr2[i3];
                    objArr[i3] = k;
                    objArr2[i3] = v;
                    v = v2;
                    k = k4;
                    break;
            }
            int hashCode = k.hashCode();
            i = hashCode & i4;
            k2 = objArr[i];
            if (k2 == null) {
                objArr[i] = k;
                objArr2[i] = v;
                i5 = this.f3165a;
                this.f3165a = i5 + 1;
                if (i5 >= this.f3173i) {
                    m2464b(this.f3168d << 1);
                    return;
                }
                return;
            }
            i2 = m2465c(hashCode);
            k3 = objArr[i2];
            if (k3 == null) {
                objArr[i2] = k;
                objArr2[i2] = v;
                i5 = this.f3165a;
                this.f3165a = i5 + 1;
                if (i5 >= this.f3173i) {
                    m2464b(this.f3168d << 1);
                    return;
                }
                return;
            }
            i3 = m2466d(hashCode);
            k4 = objArr[i3];
            if (k4 == null) {
                objArr[i3] = k;
                objArr2[i3] = v;
                i5 = this.f3165a;
                this.f3165a = i5 + 1;
                if (i5 >= this.f3173i) {
                    m2464b(this.f3168d << 1);
                    return;
                }
                return;
            }
            i5++;
        } while (i5 != i6);
        if (this.f3169e == this.f3174j) {
            m2464b(this.f3168d << 1);
            m2463b(k, v);
            return;
        }
        i5 = this.f3168d + this.f3169e;
        this.f3166b[i5] = k;
        this.f3167c[i5] = v;
        this.f3169e++;
        this.f3165a++;
    }

    /* renamed from: b */
    private V m2463b(K k, V v) {
        Object[] objArr = this.f3166b;
        int hashCode = k.hashCode();
        int i = hashCode & this.f3172h;
        Object obj = objArr[i];
        if (k.equals(obj)) {
            V v2 = this.f3167c[i];
            this.f3167c[i] = v;
            return v2;
        }
        int c = m2465c(hashCode);
        Object obj2 = objArr[c];
        if (k.equals(obj2)) {
            v2 = this.f3167c[c];
            this.f3167c[c] = v;
            return v2;
        }
        int d = m2466d(hashCode);
        Object obj3 = objArr[d];
        if (k.equals(obj3)) {
            v2 = this.f3167c[d];
            this.f3167c[d] = v;
            return v2;
        }
        hashCode = this.f3168d;
        int i2 = hashCode + this.f3169e;
        for (int i3 = hashCode; i3 < i2; i3++) {
            if (k.equals(objArr[i3])) {
                v2 = this.f3167c[i3];
                this.f3167c[i3] = v;
                return v2;
            }
        }
        if (obj == null) {
            objArr[i] = k;
            this.f3167c[i] = v;
            hashCode = this.f3165a;
            this.f3165a = hashCode + 1;
            if (hashCode >= this.f3173i) {
                m2464b(this.f3168d << 1);
            }
            return null;
        } else if (obj2 == null) {
            objArr[c] = k;
            this.f3167c[c] = v;
            hashCode = this.f3165a;
            this.f3165a = hashCode + 1;
            if (hashCode >= this.f3173i) {
                m2464b(this.f3168d << 1);
            }
            return null;
        } else if (obj3 == null) {
            objArr[d] = k;
            this.f3167c[d] = v;
            hashCode = this.f3165a;
            this.f3165a = hashCode + 1;
            if (hashCode >= this.f3173i) {
                m2464b(this.f3168d << 1);
            }
            return null;
        } else {
            m2462a(k, v, i, obj, c, obj2, d, obj3);
            return null;
        }
    }

    /* renamed from: b */
    private void m2464b(int i) {
        int i2 = this.f3168d + this.f3169e;
        this.f3168d = i;
        this.f3173i = (int) (((float) i) * this.f3170f);
        this.f3172h = i - 1;
        this.f3171g = 31 - Integer.numberOfTrailingZeros(i);
        this.f3174j = Math.max(3, ((int) Math.ceil(Math.log((double) i))) * 2);
        this.f3175k = Math.max(Math.min(i, 8), ((int) Math.sqrt((double) i)) / 8);
        Object[] objArr = this.f3166b;
        Object[] objArr2 = this.f3167c;
        this.f3166b = new Object[(this.f3174j + i)];
        this.f3167c = new Object[(this.f3174j + i)];
        int i3 = this.f3165a;
        this.f3165a = 0;
        this.f3169e = 0;
        if (i3 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != null) {
                    Object obj2 = objArr2[i4];
                    i3 = obj.hashCode();
                    int i5 = this.f3172h & i3;
                    Object obj3 = this.f3166b[i5];
                    if (obj3 == null) {
                        this.f3166b[i5] = obj;
                        this.f3167c[i5] = obj2;
                        i3 = this.f3165a;
                        this.f3165a = i3 + 1;
                        if (i3 >= this.f3173i) {
                            m2464b(this.f3168d << 1);
                        }
                    } else {
                        int c = m2465c(i3);
                        Object obj4 = this.f3166b[c];
                        if (obj4 == null) {
                            this.f3166b[c] = obj;
                            this.f3167c[c] = obj2;
                            i3 = this.f3165a;
                            this.f3165a = i3 + 1;
                            if (i3 >= this.f3173i) {
                                m2464b(this.f3168d << 1);
                            }
                        } else {
                            int d = m2466d(i3);
                            Object obj5 = this.f3166b[d];
                            if (obj5 == null) {
                                this.f3166b[d] = obj;
                                this.f3167c[d] = obj2;
                                i3 = this.f3165a;
                                this.f3165a = i3 + 1;
                                if (i3 >= this.f3173i) {
                                    m2464b(this.f3168d << 1);
                                }
                            } else {
                                m2462a(obj, obj2, i5, obj3, c, obj4, d, obj5);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private int m2465c(int i) {
        int i2 = -1262997959 * i;
        return (i2 ^ (i2 >>> this.f3171g)) & this.f3172h;
    }

    /* renamed from: d */
    private int m2466d(int i) {
        int i2 = -825114047 * i;
        return (i2 ^ (i2 >>> this.f3171g)) & this.f3172h;
    }

    /* renamed from: a */
    public final V m2467a(K k) {
        int hashCode = k.hashCode();
        int i = this.f3172h & hashCode;
        if (!k.equals(this.f3166b[i])) {
            i = m2465c(hashCode);
            if (!k.equals(this.f3166b[i])) {
                i = m2466d(hashCode);
                if (!k.equals(this.f3166b[i])) {
                    Object[] objArr = this.f3166b;
                    i = this.f3168d;
                    int i2 = this.f3169e + i;
                    while (i < i2) {
                        if (k.equals(objArr[i])) {
                            return this.f3167c[i];
                        }
                        i++;
                    }
                    return null;
                }
            }
        }
        return this.f3167c[i];
    }

    /* renamed from: a */
    public V mo542a(K k, V v) {
        if (k != null) {
            return m2463b(k, v);
        }
        throw new IllegalArgumentException("key cannot be null.");
    }

    /* renamed from: a */
    public void mo543a() {
        if (this.f3165a != 0) {
            Object[] objArr = this.f3166b;
            Object[] objArr2 = this.f3167c;
            int i = this.f3168d + this.f3169e;
            while (true) {
                int i2 = i - 1;
                if (i > 0) {
                    objArr[i2] = null;
                    objArr2[i2] = null;
                    i = i2;
                } else {
                    this.f3165a = 0;
                    this.f3169e = 0;
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    final void m2470a(int i) {
        this.f3169e--;
        int i2 = this.f3168d + this.f3169e;
        if (i < i2) {
            this.f3166b[i] = this.f3166b[i2];
            this.f3167c[i] = this.f3167c[i2];
            this.f3167c[i2] = null;
            return;
        }
        this.f3167c[i] = null;
    }

    /* renamed from: b */
    public C0706a<K, V> mo544b() {
        return mo546c();
    }

    /* renamed from: b */
    public V mo545b(K k) {
        int hashCode = k.hashCode();
        int i = this.f3172h & hashCode;
        if (k.equals(this.f3166b[i])) {
            this.f3166b[i] = null;
            V v = this.f3167c[i];
            this.f3167c[i] = null;
            this.f3165a--;
            return v;
        }
        i = m2465c(hashCode);
        if (k.equals(this.f3166b[i])) {
            this.f3166b[i] = null;
            v = this.f3167c[i];
            this.f3167c[i] = null;
            this.f3165a--;
            return v;
        }
        i = m2466d(hashCode);
        if (k.equals(this.f3166b[i])) {
            this.f3166b[i] = null;
            v = this.f3167c[i];
            this.f3167c[i] = null;
            this.f3165a--;
            return v;
        }
        Object[] objArr = this.f3166b;
        hashCode = this.f3168d;
        int i2 = hashCode + this.f3169e;
        for (i = hashCode; i < i2; i++) {
            if (k.equals(objArr[i])) {
                v = this.f3167c[i];
                m2470a(i);
                this.f3165a--;
                return v;
            }
        }
        return null;
    }

    /* renamed from: c */
    public C0706a<K, V> mo546c() {
        if (this.f3176l == null) {
            this.f3176l = new C0706a(this);
            this.f3177m = new C0706a(this);
        }
        if (this.f3176l.f) {
            this.f3177m.mo536b();
            this.f3177m.f = true;
            this.f3176l.f = false;
            return this.f3177m;
        }
        this.f3176l.mo536b();
        this.f3176l.f = true;
        this.f3177m.f = false;
        return this.f3176l;
    }

    /* renamed from: c */
    public final boolean m2474c(K k) {
        int hashCode = k.hashCode();
        if (k.equals(this.f3166b[this.f3172h & hashCode])) {
            return true;
        }
        if (k.equals(this.f3166b[m2465c(hashCode)])) {
            return true;
        }
        if (k.equals(this.f3166b[m2466d(hashCode)])) {
            return true;
        }
        Object[] objArr = this.f3166b;
        hashCode = this.f3168d;
        int i = this.f3169e + hashCode;
        while (hashCode < i) {
            if (k.equals(objArr[hashCode])) {
                return true;
            }
            hashCode++;
        }
        return false;
    }

    /* renamed from: d */
    public C0709e<V> mo547d() {
        if (this.f3178n == null) {
            this.f3178n = new C0709e(this);
            this.f3179o = new C0709e(this);
        }
        if (this.f3178n.f) {
            this.f3179o.mo536b();
            this.f3179o.f = true;
            this.f3178n.f = false;
            return this.f3179o;
        }
        this.f3178n.mo536b();
        this.f3178n.f = true;
        this.f3179o.f = false;
        return this.f3178n;
    }

    /* renamed from: e */
    public C0708c<K> mo548e() {
        if (this.f3180p == null) {
            this.f3180p = new C0708c(this);
            this.f3181q = new C0708c(this);
        }
        if (this.f3180p.f) {
            this.f3181q.mo536b();
            this.f3181q.f = true;
            this.f3180p.f = false;
            return this.f3181q;
        }
        this.f3180p.mo536b();
        this.f3180p.f = true;
        this.f3181q.f = false;
        return this.f3180p;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0710q)) {
            return false;
        }
        C0710q c0710q = (C0710q) obj;
        if (c0710q.f3165a != this.f3165a) {
            return false;
        }
        Object[] objArr = this.f3166b;
        Object[] objArr2 = this.f3167c;
        int i = this.f3169e + this.f3168d;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj2 = objArr[i2];
            if (obj2 != null) {
                Object obj3 = objArr2[i2];
                if (obj3 == null) {
                    if (!c0710q.m2474c(obj2) || c0710q.m2467a(obj2) != null) {
                        return false;
                    }
                } else if (!obj3.equals(c0710q.m2467a(obj2))) {
                    return false;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        Object[] objArr = this.f3166b;
        Object[] objArr2 = this.f3167c;
        int i2 = this.f3169e + this.f3168d;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            if (obj != null) {
                i += obj.hashCode() * 31;
                obj = objArr2[i3];
                if (obj != null) {
                    i += obj.hashCode();
                }
            }
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return mo544b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public String toString() {
        /*
        r7 = this;
        r6 = 61;
        r2 = ", ";
        r0 = r7.f3165a;
        if (r0 != 0) goto L_0x000b;
    L_0x0008:
        r0 = "{}";
    L_0x000a:
        return r0;
    L_0x000b:
        r3 = new com.badlogic.gdx.utils.ac;
        r0 = 32;
        r3.<init>(r0);
        r0 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r3.m2322a(r0);
        r4 = r7.f3166b;
        r5 = r7.f3167c;
        r0 = r4.length;
        r1 = r0;
    L_0x001d:
        r0 = r1 + -1;
        if (r1 <= 0) goto L_0x0030;
    L_0x0021:
        r1 = r4[r0];
        if (r1 == 0) goto L_0x0054;
    L_0x0025:
        r3.m2320a(r1);
        r3.m2322a(r6);
        r1 = r5[r0];
        r3.m2320a(r1);
    L_0x0030:
        r1 = r0 + -1;
        if (r0 <= 0) goto L_0x0048;
    L_0x0034:
        r0 = r4[r1];
        if (r0 == 0) goto L_0x0052;
    L_0x0038:
        r3.m2324a(r2);
        r3.m2320a(r0);
        r3.m2322a(r6);
        r0 = r5[r1];
        r3.m2320a(r0);
        r0 = r1;
        goto L_0x0030;
    L_0x0048:
        r0 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r3.m2322a(r0);
        r0 = r3.toString();
        goto L_0x000a;
    L_0x0052:
        r0 = r1;
        goto L_0x0030;
    L_0x0054:
        r1 = r0;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.q.toString():java.lang.String");
    }
}
