package com.badlogic.gdx.utils;

import com.badlogic.gdx.math.C0549f;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.badlogic.gdx.utils.p */
public final class C0704p<K> implements Iterable<C0703b<K>> {
    /* renamed from: a */
    public int f3144a;
    /* renamed from: b */
    public K[] f3145b;
    /* renamed from: c */
    int[] f3146c;
    /* renamed from: d */
    public int f3147d;
    /* renamed from: e */
    public int f3148e;
    /* renamed from: f */
    private float f3149f;
    /* renamed from: g */
    private int f3150g;
    /* renamed from: h */
    private int f3151h;
    /* renamed from: i */
    private int f3152i;
    /* renamed from: j */
    private int f3153j;
    /* renamed from: k */
    private int f3154k;
    /* renamed from: l */
    private C0702a f3155l;
    /* renamed from: m */
    private C0702a f3156m;

    /* renamed from: com.badlogic.gdx.utils.p$c */
    private static class C0701c<K> {
        /* renamed from: a */
        public boolean f3136a;
        /* renamed from: b */
        final C0704p<K> f3137b;
        /* renamed from: c */
        int f3138c;
        /* renamed from: d */
        int f3139d;
        /* renamed from: e */
        boolean f3140e = true;

        public C0701c(C0704p<K> c0704p) {
            this.f3137b = c0704p;
            mo534a();
        }

        /* renamed from: a */
        public void mo534a() {
            this.f3139d = -1;
            this.f3138c = -1;
            m2448b();
        }

        /* renamed from: b */
        final void m2448b() {
            this.f3136a = false;
            Object[] objArr = this.f3137b.f3145b;
            int i = this.f3137b.f3147d + this.f3137b.f3148e;
            do {
                int i2 = this.f3138c + 1;
                this.f3138c = i2;
                if (i2 >= i) {
                    return;
                }
            } while (objArr[this.f3138c] == null);
            this.f3136a = true;
        }

        public void remove() {
            if (this.f3139d < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            C0704p c0704p;
            if (this.f3139d >= this.f3137b.f3147d) {
                c0704p = this.f3137b;
                int i = this.f3139d;
                c0704p.f3148e--;
                int i2 = c0704p.f3147d + c0704p.f3148e;
                if (i < i2) {
                    c0704p.f3145b[i] = c0704p.f3145b[i2];
                    c0704p.f3146c[i] = c0704p.f3146c[i2];
                }
                this.f3138c = this.f3139d - 1;
                m2448b();
            } else {
                this.f3137b.f3145b[this.f3139d] = null;
            }
            this.f3139d = -1;
            c0704p = this.f3137b;
            c0704p.f3144a--;
        }
    }

    /* renamed from: com.badlogic.gdx.utils.p$a */
    public static class C0702a<K> extends C0701c<K> implements Iterable<C0703b<K>>, Iterator<C0703b<K>> {
        /* renamed from: f */
        private C0703b<K> f3141f = new C0703b();

        public C0702a(C0704p<K> c0704p) {
            super(c0704p);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo534a() {
            super.mo534a();
        }

        public final boolean hasNext() {
            if (this.e) {
                return this.a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return this;
        }

        public final /* synthetic */ Object next() {
            if (!this.a) {
                throw new NoSuchElementException();
            } else if (this.e) {
                Object[] objArr = this.b.f3145b;
                this.f3141f.f3142a = objArr[this.c];
                this.f3141f.f3143b = this.b.f3146c[this.c];
                this.d = this.c;
                m2448b();
                return this.f3141f;
            } else {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
        }

        public final void remove() {
            super.remove();
        }
    }

    /* renamed from: com.badlogic.gdx.utils.p$b */
    public static class C0703b<K> {
        /* renamed from: a */
        public K f3142a;
        /* renamed from: b */
        public int f3143b;

        public final String toString() {
            return this.f3142a + "=" + this.f3143b;
        }
    }

    public C0704p() {
        this((byte) 0);
    }

    private C0704p(byte b) {
        int b2 = C0549f.m1768b((int) Math.ceil(63.75d));
        if (b2 > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + b2);
        }
        this.f3147d = b2;
        this.f3149f = 0.8f;
        this.f3152i = (int) (((float) this.f3147d) * 0.8f);
        this.f3151h = this.f3147d - 1;
        this.f3150g = 31 - Integer.numberOfTrailingZeros(this.f3147d);
        this.f3153j = Math.max(3, ((int) Math.ceil(Math.log((double) this.f3147d))) * 2);
        this.f3154k = Math.max(Math.min(this.f3147d, 8), ((int) Math.sqrt((double) this.f3147d)) / 8);
        this.f3145b = new Object[(this.f3147d + this.f3153j)];
        this.f3146c = new int[this.f3145b.length];
    }

    /* renamed from: a */
    private void m2450a(int i) {
        int i2 = this.f3147d + this.f3148e;
        this.f3147d = i;
        this.f3152i = (int) (((float) i) * this.f3149f);
        this.f3151h = i - 1;
        this.f3150g = 31 - Integer.numberOfTrailingZeros(i);
        this.f3153j = Math.max(3, ((int) Math.ceil(Math.log((double) i))) * 2);
        this.f3154k = Math.max(Math.min(i, 8), ((int) Math.sqrt((double) i)) / 8);
        Object[] objArr = this.f3145b;
        int[] iArr = this.f3146c;
        this.f3145b = new Object[(this.f3153j + i)];
        this.f3146c = new int[(this.f3153j + i)];
        int i3 = this.f3144a;
        this.f3144a = 0;
        this.f3148e = 0;
        if (i3 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != null) {
                    int i5 = iArr[i4];
                    i3 = obj.hashCode();
                    int i6 = this.f3151h & i3;
                    Object obj2 = this.f3145b[i6];
                    if (obj2 == null) {
                        this.f3145b[i6] = obj;
                        this.f3146c[i6] = i5;
                        i3 = this.f3144a;
                        this.f3144a = i3 + 1;
                        if (i3 >= this.f3152i) {
                            m2450a(this.f3147d << 1);
                        }
                    } else {
                        int b = m2452b(i3);
                        Object obj3 = this.f3145b[b];
                        if (obj3 == null) {
                            this.f3145b[b] = obj;
                            this.f3146c[b] = i5;
                            i3 = this.f3144a;
                            this.f3144a = i3 + 1;
                            if (i3 >= this.f3152i) {
                                m2450a(this.f3147d << 1);
                            }
                        } else {
                            int c = m2453c(i3);
                            Object obj4 = this.f3145b[c];
                            if (obj4 == null) {
                                this.f3145b[c] = obj;
                                this.f3146c[c] = i5;
                                i3 = this.f3144a;
                                this.f3144a = i3 + 1;
                                if (i3 >= this.f3152i) {
                                    m2450a(this.f3147d << 1);
                                }
                            } else {
                                m2451a(obj, i5, i6, obj2, b, obj3, c, obj4);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m2451a(K k, int i, int i2, K k2, int i3, K k3, int i4, K k4) {
        Object[] objArr = this.f3145b;
        int[] iArr = this.f3146c;
        int i5 = this.f3151h;
        int i6 = 0;
        int i7 = this.f3154k;
        do {
            int i8;
            switch (C0549f.m1762a()) {
                case 0:
                    i8 = iArr[i2];
                    objArr[i2] = k;
                    iArr[i2] = i;
                    i = i8;
                    k = k2;
                    break;
                case 1:
                    i8 = iArr[i3];
                    objArr[i3] = k;
                    iArr[i3] = i;
                    i = i8;
                    k = k3;
                    break;
                default:
                    i8 = iArr[i4];
                    objArr[i4] = k;
                    iArr[i4] = i;
                    i = i8;
                    k = k4;
                    break;
            }
            i8 = k.hashCode();
            i2 = i8 & i5;
            k2 = objArr[i2];
            if (k2 == null) {
                objArr[i2] = k;
                iArr[i2] = i;
                i6 = this.f3144a;
                this.f3144a = i6 + 1;
                if (i6 >= this.f3152i) {
                    m2450a(this.f3147d << 1);
                    return;
                }
                return;
            }
            i3 = m2452b(i8);
            k3 = objArr[i3];
            if (k3 == null) {
                objArr[i3] = k;
                iArr[i3] = i;
                i6 = this.f3144a;
                this.f3144a = i6 + 1;
                if (i6 >= this.f3152i) {
                    m2450a(this.f3147d << 1);
                    return;
                }
                return;
            }
            i4 = m2453c(i8);
            k4 = objArr[i4];
            if (k4 == null) {
                objArr[i4] = k;
                iArr[i4] = i;
                i6 = this.f3144a;
                this.f3144a = i6 + 1;
                if (i6 >= this.f3152i) {
                    m2450a(this.f3147d << 1);
                    return;
                }
                return;
            }
            i6++;
        } while (i6 != i7);
        if (this.f3148e == this.f3153j) {
            m2450a(this.f3147d << 1);
            m2454a(k, i);
            return;
        }
        i6 = this.f3147d + this.f3148e;
        this.f3145b[i6] = k;
        this.f3146c[i6] = i;
        this.f3148e++;
        this.f3144a++;
    }

    /* renamed from: b */
    private int m2452b(int i) {
        int i2 = -1262997959 * i;
        return (i2 ^ (i2 >>> this.f3150g)) & this.f3151h;
    }

    /* renamed from: c */
    private int m2453c(int i) {
        int i2 = -825114047 * i;
        return (i2 ^ (i2 >>> this.f3150g)) & this.f3151h;
    }

    /* renamed from: a */
    public final void m2454a(K k, int i) {
        if (k == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        Object[] objArr = this.f3145b;
        int hashCode = k.hashCode();
        int i2 = hashCode & this.f3151h;
        Object obj = objArr[i2];
        if (k.equals(obj)) {
            this.f3146c[i2] = i;
            return;
        }
        int b = m2452b(hashCode);
        Object obj2 = objArr[b];
        if (k.equals(obj2)) {
            this.f3146c[b] = i;
            return;
        }
        int c = m2453c(hashCode);
        Object obj3 = objArr[c];
        if (k.equals(obj3)) {
            this.f3146c[c] = i;
            return;
        }
        hashCode = this.f3147d;
        int i3 = this.f3148e + hashCode;
        while (hashCode < i3) {
            if (k.equals(objArr[hashCode])) {
                this.f3146c[hashCode] = i;
                return;
            }
            hashCode++;
        }
        if (obj == null) {
            objArr[i2] = k;
            this.f3146c[i2] = i;
            hashCode = this.f3144a;
            this.f3144a = hashCode + 1;
            if (hashCode >= this.f3152i) {
                m2450a(this.f3147d << 1);
            }
        } else if (obj2 == null) {
            objArr[b] = k;
            this.f3146c[b] = i;
            hashCode = this.f3144a;
            this.f3144a = hashCode + 1;
            if (hashCode >= this.f3152i) {
                m2450a(this.f3147d << 1);
            }
        } else if (obj3 == null) {
            objArr[c] = k;
            this.f3146c[c] = i;
            hashCode = this.f3144a;
            this.f3144a = hashCode + 1;
            if (hashCode >= this.f3152i) {
                m2450a(this.f3147d << 1);
            }
        } else {
            m2451a(k, i, i2, obj, b, obj2, c, obj3);
        }
    }

    /* renamed from: b */
    public final int m2455b(K k, int i) {
        int hashCode = k.hashCode();
        int i2 = this.f3151h & hashCode;
        if (!k.equals(this.f3145b[i2])) {
            i2 = m2452b(hashCode);
            if (!k.equals(this.f3145b[i2])) {
                i2 = m2453c(hashCode);
                if (!k.equals(this.f3145b[i2])) {
                    Object[] objArr = this.f3145b;
                    i2 = this.f3147d;
                    int i3 = this.f3148e + i2;
                    while (i2 < i3) {
                        if (k.equals(objArr[i2])) {
                            return this.f3146c[i2];
                        }
                        i2++;
                    }
                    return i;
                }
            }
        }
        return this.f3146c[i2];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0704p)) {
            return false;
        }
        C0704p c0704p = (C0704p) obj;
        if (c0704p.f3144a != this.f3144a) {
            return false;
        }
        Object[] objArr = this.f3145b;
        int[] iArr = this.f3146c;
        int i = this.f3147d + this.f3148e;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj2 = objArr[i2];
            if (obj2 != null) {
                int b = c0704p.m2455b(obj2, 0);
                if (b == 0) {
                    int hashCode = obj2.hashCode();
                    if (!obj2.equals(c0704p.f3145b[c0704p.f3151h & hashCode])) {
                        if (!obj2.equals(c0704p.f3145b[c0704p.m2452b(hashCode)])) {
                            if (!obj2.equals(c0704p.f3145b[c0704p.m2453c(hashCode)])) {
                                Object[] objArr2 = c0704p.f3145b;
                                hashCode = c0704p.f3147d;
                                int i3 = c0704p.f3148e + hashCode;
                                while (hashCode < i3) {
                                    if (!obj2.equals(objArr2[hashCode])) {
                                        hashCode++;
                                    }
                                }
                                hashCode = 0;
                                if (hashCode == 0) {
                                    return false;
                                }
                            }
                        }
                    }
                    boolean z = true;
                    if (hashCode == 0) {
                        return false;
                    }
                }
                if (b != iArr[i2]) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        Object[] objArr = this.f3145b;
        int[] iArr = this.f3146c;
        int i2 = this.f3148e + this.f3147d;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            if (obj != null) {
                i = (i + (obj.hashCode() * 31)) + iArr[i3];
            }
        }
        return i;
    }

    public final /* synthetic */ Iterator iterator() {
        if (this.f3155l == null) {
            this.f3155l = new C0702a(this);
            this.f3156m = new C0702a(this);
        }
        if (this.f3155l.e) {
            this.f3156m.mo534a();
            this.f3156m.e = true;
            this.f3155l.e = false;
            return this.f3156m;
        }
        this.f3155l.mo534a();
        this.f3155l.e = true;
        this.f3156m.e = false;
        return this.f3155l;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final String toString() {
        /*
        r7 = this;
        r6 = 61;
        r0 = r7.f3144a;
        if (r0 != 0) goto L_0x0009;
    L_0x0006:
        r0 = "{}";
    L_0x0008:
        return r0;
    L_0x0009:
        r2 = new com.badlogic.gdx.utils.ac;
        r0 = 32;
        r2.<init>(r0);
        r0 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r2.m2322a(r0);
        r3 = r7.f3145b;
        r4 = r7.f3146c;
        r0 = r3.length;
        r1 = r0;
    L_0x001b:
        r0 = r1 + -1;
        if (r1 <= 0) goto L_0x002e;
    L_0x001f:
        r1 = r3[r0];
        if (r1 == 0) goto L_0x0054;
    L_0x0023:
        r2.m2320a(r1);
        r2.m2322a(r6);
        r1 = r4[r0];
        r2.m2328c(r1);
    L_0x002e:
        r1 = r0 + -1;
        if (r0 <= 0) goto L_0x0048;
    L_0x0032:
        r0 = r3[r1];
        if (r0 == 0) goto L_0x0052;
    L_0x0036:
        r5 = ", ";
        r2.m2324a(r5);
        r2.m2320a(r0);
        r2.m2322a(r6);
        r0 = r4[r1];
        r2.m2328c(r0);
        r0 = r1;
        goto L_0x002e;
    L_0x0048:
        r0 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r2.m2322a(r0);
        r0 = r2.toString();
        goto L_0x0008;
    L_0x0052:
        r0 = r1;
        goto L_0x002e;
    L_0x0054:
        r1 = r0;
        goto L_0x001b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.p.toString():java.lang.String");
    }
}
