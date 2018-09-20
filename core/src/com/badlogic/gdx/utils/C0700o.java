package com.badlogic.gdx.utils;

import com.badlogic.gdx.math.C0549f;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.badlogic.gdx.utils.o */
public final class C0700o<V> implements Iterable<C0698b<V>> {
    /* renamed from: a */
    public int f3119a;
    /* renamed from: b */
    public long[] f3120b;
    /* renamed from: c */
    public V[] f3121c;
    /* renamed from: d */
    public int f3122d;
    /* renamed from: e */
    public int f3123e;
    /* renamed from: f */
    public V f3124f;
    /* renamed from: g */
    public boolean f3125g;
    /* renamed from: h */
    public int f3126h;
    /* renamed from: i */
    public C0699d f3127i;
    /* renamed from: j */
    public C0699d f3128j;
    /* renamed from: k */
    private float f3129k;
    /* renamed from: l */
    private int f3130l;
    /* renamed from: m */
    private int f3131m;
    /* renamed from: n */
    private int f3132n;
    /* renamed from: o */
    private int f3133o;
    /* renamed from: p */
    private C0697a f3134p;
    /* renamed from: q */
    private C0697a f3135q;

    /* renamed from: com.badlogic.gdx.utils.o$c */
    private static class C0696c<V> {
        /* renamed from: a */
        public boolean f3111a;
        /* renamed from: b */
        final C0700o<V> f3112b;
        /* renamed from: c */
        int f3113c;
        /* renamed from: d */
        int f3114d;
        /* renamed from: e */
        public boolean f3115e = true;

        public C0696c(C0700o<V> c0700o) {
            this.f3112b = c0700o;
            mo532a();
        }

        /* renamed from: a */
        public void mo532a() {
            this.f3114d = -2;
            this.f3113c = -1;
            if (this.f3112b.f3125g) {
                this.f3111a = true;
            } else {
                m2437b();
            }
        }

        /* renamed from: b */
        final void m2437b() {
            this.f3111a = false;
            long[] jArr = this.f3112b.f3120b;
            int i = this.f3112b.f3122d + this.f3112b.f3123e;
            do {
                int i2 = this.f3113c + 1;
                this.f3113c = i2;
                if (i2 >= i) {
                    return;
                }
            } while (jArr[this.f3113c] == 0);
            this.f3111a = true;
        }

        public void remove() {
            if (this.f3114d == -1 && this.f3112b.f3125g) {
                this.f3112b.f3124f = null;
                this.f3112b.f3125g = false;
            } else if (this.f3114d < 0) {
                throw new IllegalStateException("next must be called before remove.");
            } else if (this.f3114d >= this.f3112b.f3122d) {
                this.f3112b.m2444a(this.f3114d);
                this.f3113c = this.f3114d - 1;
                m2437b();
            } else {
                this.f3112b.f3120b[this.f3114d] = 0;
                this.f3112b.f3121c[this.f3114d] = null;
            }
            this.f3114d = -2;
            C0700o c0700o = this.f3112b;
            c0700o.f3119a--;
        }
    }

    /* renamed from: com.badlogic.gdx.utils.o$a */
    public static class C0697a<V> extends C0696c<V> implements Iterable<C0698b<V>>, Iterator<C0698b<V>> {
        /* renamed from: f */
        private C0698b<V> f3116f = new C0698b();

        public C0697a(C0700o c0700o) {
            super(c0700o);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo532a() {
            super.mo532a();
        }

        public final boolean hasNext() {
            if (this.e) {
                return this.a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        public final Iterator<C0698b<V>> iterator() {
            return this;
        }

        public final /* synthetic */ Object next() {
            if (!this.a) {
                throw new NoSuchElementException();
            } else if (this.e) {
                long[] jArr = this.b.f3120b;
                if (this.c == -1) {
                    this.f3116f.f3117a = 0;
                    this.f3116f.f3118b = this.b.f3124f;
                } else {
                    this.f3116f.f3117a = jArr[this.c];
                    this.f3116f.f3118b = this.b.f3121c[this.c];
                }
                this.d = this.c;
                m2437b();
                return this.f3116f;
            } else {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
        }

        public final void remove() {
            super.remove();
        }
    }

    /* renamed from: com.badlogic.gdx.utils.o$b */
    public static class C0698b<V> {
        /* renamed from: a */
        public long f3117a;
        /* renamed from: b */
        public V f3118b;

        public final String toString() {
            return this.f3117a + "=" + this.f3118b;
        }
    }

    /* renamed from: com.badlogic.gdx.utils.o$d */
    public static class C0699d<V> extends C0696c<V> implements Iterable<V>, Iterator<V> {
        public C0699d(C0700o<V> c0700o) {
            super(c0700o);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo532a() {
            super.mo532a();
        }

        public final boolean hasNext() {
            if (this.e) {
                return this.a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        public final Iterator<V> iterator() {
            return this;
        }

        public final V next() {
            if (!this.a) {
                throw new NoSuchElementException();
            } else if (this.e) {
                V v = this.c == -1 ? this.b.f3124f : this.b.f3121c[this.c];
                this.d = this.c;
                m2437b();
                return v;
            } else {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
        }

        public final void remove() {
            super.remove();
        }
    }

    public C0700o() {
        this((byte) 0);
    }

    private C0700o(byte b) {
        int b2 = C0549f.m1768b((int) Math.ceil(63.75d));
        if (b2 > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + b2);
        }
        this.f3122d = b2;
        this.f3129k = 0.8f;
        this.f3131m = (int) (((float) this.f3122d) * 0.8f);
        this.f3126h = this.f3122d - 1;
        this.f3130l = 63 - Long.numberOfTrailingZeros((long) this.f3122d);
        this.f3132n = Math.max(3, ((int) Math.ceil(Math.log((double) this.f3122d))) * 2);
        this.f3133o = Math.max(Math.min(this.f3122d, 8), ((int) Math.sqrt((double) this.f3122d)) / 8);
        this.f3120b = new long[(this.f3122d + this.f3132n)];
        this.f3121c = new Object[this.f3120b.length];
    }

    /* renamed from: a */
    private void m2440a(long j, V v, int i, long j2, int i2, long j3, int i3, long j4) {
        long[] jArr = this.f3120b;
        Object[] objArr = this.f3121c;
        int i4 = this.f3126h;
        int i5 = 0;
        int i6 = this.f3133o;
        do {
            V v2;
            switch (C0549f.m1762a()) {
                case 0:
                    v2 = objArr[i];
                    jArr[i] = j;
                    objArr[i] = v;
                    v = v2;
                    j = j2;
                    break;
                case 1:
                    v2 = objArr[i2];
                    jArr[i2] = j;
                    objArr[i2] = v;
                    v = v2;
                    j = j3;
                    break;
                default:
                    v2 = objArr[i3];
                    jArr[i3] = j;
                    objArr[i3] = v;
                    v = v2;
                    j = j4;
                    break;
            }
            i = (int) (((long) i4) & j);
            j2 = jArr[i];
            if (j2 == 0) {
                jArr[i] = j;
                objArr[i] = v;
                i5 = this.f3119a;
                this.f3119a = i5 + 1;
                if (i5 >= this.f3131m) {
                    m2441b(this.f3122d << 1);
                    return;
                }
                return;
            }
            i2 = m2445b(j);
            j3 = jArr[i2];
            if (j3 == 0) {
                jArr[i2] = j;
                objArr[i2] = v;
                i5 = this.f3119a;
                this.f3119a = i5 + 1;
                if (i5 >= this.f3131m) {
                    m2441b(this.f3122d << 1);
                    return;
                }
                return;
            }
            i3 = m2446c(j);
            j4 = jArr[i3];
            if (j4 == 0) {
                jArr[i3] = j;
                objArr[i3] = v;
                i5 = this.f3119a;
                this.f3119a = i5 + 1;
                if (i5 >= this.f3131m) {
                    m2441b(this.f3122d << 1);
                    return;
                }
                return;
            }
            i5++;
        } while (i5 != i6);
        if (this.f3123e == this.f3132n) {
            m2441b(this.f3122d << 1);
            m2443a(j, v);
            return;
        }
        i5 = this.f3122d + this.f3123e;
        this.f3120b[i5] = j;
        this.f3121c[i5] = v;
        this.f3123e++;
        this.f3119a++;
    }

    /* renamed from: b */
    private void m2441b(int i) {
        int i2 = this.f3122d + this.f3123e;
        this.f3122d = i;
        this.f3131m = (int) (((float) i) * this.f3129k);
        this.f3126h = i - 1;
        this.f3130l = 63 - Long.numberOfTrailingZeros((long) i);
        this.f3132n = Math.max(3, ((int) Math.ceil(Math.log((double) i))) * 2);
        this.f3133o = Math.max(Math.min(i, 8), ((int) Math.sqrt((double) i)) / 8);
        long[] jArr = this.f3120b;
        Object[] objArr = this.f3121c;
        this.f3120b = new long[(this.f3132n + i)];
        this.f3121c = new Object[(this.f3132n + i)];
        int i3 = this.f3119a;
        this.f3119a = this.f3125g ? 1 : 0;
        this.f3123e = 0;
        if (i3 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                long j = jArr[i4];
                if (j != 0) {
                    Object obj = objArr[i4];
                    if (j == 0) {
                        this.f3124f = obj;
                        this.f3125g = true;
                    } else {
                        int i5 = (int) (((long) this.f3126h) & j);
                        long j2 = this.f3120b[i5];
                        if (j2 == 0) {
                            this.f3120b[i5] = j;
                            this.f3121c[i5] = obj;
                            i3 = this.f3119a;
                            this.f3119a = i3 + 1;
                            if (i3 >= this.f3131m) {
                                m2441b(this.f3122d << 1);
                            }
                        } else {
                            int b = m2445b(j);
                            long j3 = this.f3120b[b];
                            if (j3 == 0) {
                                this.f3120b[b] = j;
                                this.f3121c[b] = obj;
                                i3 = this.f3119a;
                                this.f3119a = i3 + 1;
                                if (i3 >= this.f3131m) {
                                    m2441b(this.f3122d << 1);
                                }
                            } else {
                                int c = m2446c(j);
                                long j4 = this.f3120b[c];
                                if (j4 == 0) {
                                    this.f3120b[c] = j;
                                    this.f3121c[c] = obj;
                                    i3 = this.f3119a;
                                    this.f3119a = i3 + 1;
                                    if (i3 >= this.f3131m) {
                                        m2441b(this.f3122d << 1);
                                    }
                                } else {
                                    m2440a(j, obj, i5, j2, b, j3, c, j4);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final V m2442a(long j) {
        if (j == 0) {
            return !this.f3125g ? null : this.f3124f;
        } else {
            int i = (int) (((long) this.f3126h) & j);
            if (this.f3120b[i] != j) {
                i = m2445b(j);
                if (this.f3120b[i] != j) {
                    i = m2446c(j);
                    if (this.f3120b[i] != j) {
                        long[] jArr = this.f3120b;
                        i = this.f3122d;
                        int i2 = this.f3123e + i;
                        while (i < i2) {
                            if (jArr[i] == j) {
                                return this.f3121c[i];
                            }
                            i++;
                        }
                        return null;
                    }
                }
            }
            return this.f3121c[i];
        }
    }

    /* renamed from: a */
    public final V m2443a(long j, V v) {
        V v2;
        if (j == 0) {
            v2 = this.f3124f;
            this.f3124f = v;
            if (this.f3125g) {
                return v2;
            }
            this.f3125g = true;
            this.f3119a++;
            return v2;
        }
        long[] jArr = this.f3120b;
        int i = (int) (((long) this.f3126h) & j);
        long j2 = jArr[i];
        if (j2 == j) {
            v2 = this.f3121c[i];
            this.f3121c[i] = v;
            return v2;
        }
        int b = m2445b(j);
        long j3 = jArr[b];
        if (j3 == j) {
            v2 = this.f3121c[b];
            this.f3121c[b] = v;
            return v2;
        }
        int c = m2446c(j);
        long j4 = jArr[c];
        if (j4 == j) {
            v2 = this.f3121c[c];
            this.f3121c[c] = v;
            return v2;
        }
        int i2 = this.f3122d;
        int i3 = i2 + this.f3123e;
        for (int i4 = i2; i4 < i3; i4++) {
            if (jArr[i4] == j) {
                v2 = this.f3121c[i4];
                this.f3121c[i4] = v;
                return v2;
            }
        }
        if (j2 == 0) {
            jArr[i] = j;
            this.f3121c[i] = v;
            i2 = this.f3119a;
            this.f3119a = i2 + 1;
            if (i2 >= this.f3131m) {
                m2441b(this.f3122d << 1);
            }
            return null;
        } else if (j3 == 0) {
            jArr[b] = j;
            this.f3121c[b] = v;
            i2 = this.f3119a;
            this.f3119a = i2 + 1;
            if (i2 >= this.f3131m) {
                m2441b(this.f3122d << 1);
            }
            return null;
        } else if (j4 == 0) {
            jArr[c] = j;
            this.f3121c[c] = v;
            i2 = this.f3119a;
            this.f3119a = i2 + 1;
            if (i2 >= this.f3131m) {
                m2441b(this.f3122d << 1);
            }
            return null;
        } else {
            m2440a(j, v, i, j2, b, j3, c, j4);
            return null;
        }
    }

    /* renamed from: a */
    public final void m2444a(int i) {
        this.f3123e--;
        int i2 = this.f3122d + this.f3123e;
        if (i < i2) {
            this.f3120b[i] = this.f3120b[i2];
            this.f3121c[i] = this.f3121c[i2];
            this.f3121c[i2] = null;
            return;
        }
        this.f3121c[i] = null;
    }

    /* renamed from: b */
    public final int m2445b(long j) {
        long j2 = -1262997959 * j;
        return (int) ((j2 ^ (j2 >>> this.f3130l)) & ((long) this.f3126h));
    }

    /* renamed from: c */
    public final int m2446c(long j) {
        long j2 = -825114047 * j;
        return (int) ((j2 ^ (j2 >>> this.f3130l)) & ((long) this.f3126h));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0700o)) {
            return false;
        }
        C0700o c0700o = (C0700o) obj;
        if (c0700o.f3119a != this.f3119a) {
            return false;
        }
        if (c0700o.f3125g != this.f3125g) {
            return false;
        }
        if (this.f3125g) {
            if (c0700o.f3124f == null) {
                if (this.f3124f != null) {
                    return false;
                }
            } else if (!c0700o.f3124f.equals(this.f3124f)) {
                return false;
            }
        }
        long[] jArr = this.f3120b;
        Object[] objArr = this.f3121c;
        int i = this.f3123e + this.f3122d;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (j != 0) {
                Object obj2 = objArr[i2];
                if (obj2 == null) {
                    boolean z;
                    if (j != 0) {
                        if (c0700o.f3120b[(int) (((long) c0700o.f3126h) & j)] != j) {
                            if (c0700o.f3120b[c0700o.m2445b(j)] != j) {
                                if (c0700o.f3120b[c0700o.m2446c(j)] != j) {
                                    long[] jArr2 = c0700o.f3120b;
                                    int i3 = c0700o.f3122d;
                                    int i4 = c0700o.f3123e + i3;
                                    while (i3 < i4) {
                                        if (jArr2[i3] != j) {
                                            i3++;
                                        }
                                    }
                                    z = false;
                                }
                            }
                        }
                        z = true;
                        break;
                    }
                    z = c0700o.f3125g;
                    if (!z || c0700o.m2442a(j) != null) {
                        return false;
                    }
                } else if (!obj2.equals(c0700o.m2442a(j))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (!this.f3125g || this.f3124f == null) ? 0 : this.f3124f.hashCode() + 0;
        long[] jArr = this.f3120b;
        Object[] objArr = this.f3121c;
        int i2 = this.f3122d + this.f3123e;
        while (i < i2) {
            long j = jArr[i];
            if (j != 0) {
                hashCode += ((int) (j ^ (j >>> 32))) * 31;
                Object obj = objArr[i];
                if (obj != null) {
                    hashCode += obj.hashCode();
                }
            }
            i++;
        }
        return hashCode;
    }

    public final Iterator<C0698b<V>> iterator() {
        if (this.f3134p == null) {
            this.f3134p = new C0697a(this);
            this.f3135q = new C0697a(this);
        }
        if (this.f3134p.e) {
            this.f3135q.mo532a();
            this.f3135q.e = true;
            this.f3134p.e = false;
            return this.f3135q;
        }
        this.f3134p.mo532a();
        this.f3134p.e = true;
        this.f3135q.e = false;
        return this.f3134p;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final String toString() {
        /*
        r10 = this;
        r8 = 0;
        r5 = 61;
        r0 = r10.f3119a;
        if (r0 != 0) goto L_0x000b;
    L_0x0008:
        r0 = "[]";
    L_0x000a:
        return r0;
    L_0x000b:
        r2 = new com.badlogic.gdx.utils.ac;
        r0 = 32;
        r2.<init>(r0);
        r0 = 91;
        r2.m2322a(r0);
        r3 = r10.f3120b;
        r4 = r10.f3121c;
        r0 = r3.length;
        r1 = r0;
    L_0x001d:
        r0 = r1 + -1;
        if (r1 <= 0) goto L_0x0032;
    L_0x0021:
        r6 = r3[r0];
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 == 0) goto L_0x005a;
    L_0x0027:
        r2.m2318a(r6);
        r2.m2322a(r5);
        r1 = r4[r0];
        r2.m2320a(r1);
    L_0x0032:
        r1 = r0 + -1;
        if (r0 <= 0) goto L_0x004e;
    L_0x0036:
        r6 = r3[r1];
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 == 0) goto L_0x0058;
    L_0x003c:
        r0 = ", ";
        r2.m2324a(r0);
        r2.m2318a(r6);
        r2.m2322a(r5);
        r0 = r4[r1];
        r2.m2320a(r0);
        r0 = r1;
        goto L_0x0032;
    L_0x004e:
        r0 = 93;
        r2.m2322a(r0);
        r0 = r2.toString();
        goto L_0x000a;
    L_0x0058:
        r0 = r1;
        goto L_0x0032;
    L_0x005a:
        r1 = r0;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.o.toString():java.lang.String");
    }
}
