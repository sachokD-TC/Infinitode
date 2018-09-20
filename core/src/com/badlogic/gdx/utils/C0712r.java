package com.badlogic.gdx.utils;

import com.badlogic.gdx.math.C0549f;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.badlogic.gdx.utils.r */
public final class C0712r<T> implements Iterable<T> {
    /* renamed from: a */
    public int f3187a;
    /* renamed from: b */
    T[] f3188b;
    /* renamed from: c */
    int f3189c;
    /* renamed from: d */
    int f3190d;
    /* renamed from: e */
    private float f3191e;
    /* renamed from: f */
    private int f3192f;
    /* renamed from: g */
    private int f3193g;
    /* renamed from: h */
    private int f3194h;
    /* renamed from: i */
    private int f3195i;
    /* renamed from: j */
    private int f3196j;
    /* renamed from: k */
    private C0711a f3197k;
    /* renamed from: l */
    private C0711a f3198l;

    /* renamed from: com.badlogic.gdx.utils.r$a */
    public static class C0711a<K> implements Iterable<K>, Iterator<K> {
        /* renamed from: a */
        public boolean f3182a;
        /* renamed from: b */
        final C0712r<K> f3183b;
        /* renamed from: c */
        int f3184c;
        /* renamed from: d */
        int f3185d;
        /* renamed from: e */
        boolean f3186e = true;

        public C0711a(C0712r<K> c0712r) {
            this.f3183b = c0712r;
            m2478a();
        }

        /* renamed from: b */
        private void m2477b() {
            this.f3182a = false;
            Object[] objArr = this.f3183b.f3188b;
            int i = this.f3183b.f3189c + this.f3183b.f3190d;
            do {
                int i2 = this.f3184c + 1;
                this.f3184c = i2;
                if (i2 >= i) {
                    return;
                }
            } while (objArr[this.f3184c] == null);
            this.f3182a = true;
        }

        /* renamed from: a */
        public final void m2478a() {
            this.f3185d = -1;
            this.f3184c = -1;
            m2477b();
        }

        public final boolean hasNext() {
            if (this.f3186e) {
                return this.f3182a;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return this;
        }

        public final K next() {
            if (!this.f3182a) {
                throw new NoSuchElementException();
            } else if (this.f3186e) {
                K k = this.f3183b.f3188b[this.f3184c];
                this.f3185d = this.f3184c;
                m2477b();
                return k;
            } else {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
        }

        public final void remove() {
            if (this.f3185d < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            if (this.f3185d >= this.f3183b.f3189c) {
                this.f3183b.m2485a(this.f3185d);
                this.f3184c = this.f3185d - 1;
                m2477b();
            } else {
                this.f3183b.f3188b[this.f3185d] = null;
            }
            this.f3185d = -1;
            C0712r c0712r = this.f3183b;
            c0712r.f3187a--;
        }
    }

    public C0712r() {
        this(51, 0.8f);
    }

    public C0712r(byte b) {
        this(4, 0.8f);
    }

    private C0712r(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i);
        }
        int b = C0549f.m1768b((int) Math.ceil((double) (((float) i) / f)));
        if (b > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + b);
        }
        this.f3189c = b;
        if (f <= 0.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0: " + f);
        }
        this.f3191e = f;
        this.f3194h = (int) (((float) this.f3189c) * f);
        this.f3193g = this.f3189c - 1;
        this.f3192f = 31 - Integer.numberOfTrailingZeros(this.f3189c);
        this.f3195i = Math.max(3, ((int) Math.ceil(Math.log((double) this.f3189c))) * 2);
        this.f3196j = Math.max(Math.min(this.f3189c, 8), ((int) Math.sqrt((double) this.f3189c)) / 8);
        this.f3188b = new Object[(this.f3189c + this.f3195i)];
    }

    public C0712r(C0712r c0712r) {
        this((int) Math.floor((double) (((float) c0712r.f3189c) * c0712r.f3191e)), c0712r.f3191e);
        this.f3190d = c0712r.f3190d;
        System.arraycopy(c0712r.f3188b, 0, this.f3188b, 0, c0712r.f3188b.length);
        this.f3187a = c0712r.f3187a;
    }

    /* renamed from: a */
    private String m2479a(String str) {
        if (this.f3187a == 0) {
            return "";
        }
        Object obj;
        ac acVar = new ac(32);
        Object[] objArr = this.f3188b;
        int length = objArr.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                break;
            }
            obj = objArr[i];
            if (obj != null) {
                break;
            }
            length = i;
        }
        acVar.m2320a(obj);
        while (true) {
            length = i - 1;
            if (i <= 0) {
                return acVar.toString();
            }
            Object obj2 = objArr[length];
            if (obj2 != null) {
                acVar.m2324a(str);
                acVar.m2320a(obj2);
                i = length;
            } else {
                i = length;
            }
        }
    }

    /* renamed from: a */
    private void m2480a(T t, int i, T t2, int i2, T t3, int i3, T t4) {
        Object[] objArr = this.f3188b;
        int i4 = this.f3193g;
        int i5 = 0;
        int i6 = this.f3196j;
        do {
            switch (C0549f.m1762a()) {
                case 0:
                    objArr[i] = t;
                    t = t2;
                    break;
                case 1:
                    objArr[i2] = t;
                    t = t3;
                    break;
                default:
                    objArr[i3] = t;
                    t = t4;
                    break;
            }
            int hashCode = r6.hashCode();
            i = hashCode & i4;
            t2 = objArr[i];
            if (t2 == null) {
                objArr[i] = r6;
                i5 = this.f3187a;
                this.f3187a = i5 + 1;
                if (i5 >= this.f3194h) {
                    m2481b(this.f3189c << 1);
                    return;
                }
                return;
            }
            i2 = m2482c(hashCode);
            t3 = objArr[i2];
            if (t3 == null) {
                objArr[i2] = r6;
                i5 = this.f3187a;
                this.f3187a = i5 + 1;
                if (i5 >= this.f3194h) {
                    m2481b(this.f3189c << 1);
                    return;
                }
                return;
            }
            i3 = m2483d(hashCode);
            t4 = objArr[i3];
            if (t4 == null) {
                objArr[i3] = r6;
                i5 = this.f3187a;
                this.f3187a = i5 + 1;
                if (i5 >= this.f3194h) {
                    m2481b(this.f3189c << 1);
                    return;
                }
                return;
            }
            i5++;
        } while (i5 != i6);
        if (this.f3190d == this.f3195i) {
            m2481b(this.f3189c << 1);
            m2486a(r6);
            return;
        }
        this.f3188b[this.f3189c + this.f3190d] = r6;
        this.f3190d++;
        this.f3187a++;
    }

    /* renamed from: b */
    private void m2481b(int i) {
        int i2 = this.f3189c + this.f3190d;
        this.f3189c = i;
        this.f3194h = (int) (((float) i) * this.f3191e);
        this.f3193g = i - 1;
        this.f3192f = 31 - Integer.numberOfTrailingZeros(i);
        this.f3195i = Math.max(3, ((int) Math.ceil(Math.log((double) i))) * 2);
        this.f3196j = Math.max(Math.min(i, 8), ((int) Math.sqrt((double) i)) / 8);
        Object[] objArr = this.f3188b;
        this.f3188b = new Object[(this.f3195i + i)];
        int i3 = this.f3187a;
        this.f3187a = 0;
        this.f3190d = 0;
        if (i3 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != null) {
                    i3 = obj.hashCode();
                    int i5 = this.f3193g & i3;
                    Object obj2 = this.f3188b[i5];
                    if (obj2 == null) {
                        this.f3188b[i5] = obj;
                        i3 = this.f3187a;
                        this.f3187a = i3 + 1;
                        if (i3 >= this.f3194h) {
                            m2481b(this.f3189c << 1);
                        }
                    } else {
                        int c = m2482c(i3);
                        Object obj3 = this.f3188b[c];
                        if (obj3 == null) {
                            this.f3188b[c] = obj;
                            i3 = this.f3187a;
                            this.f3187a = i3 + 1;
                            if (i3 >= this.f3194h) {
                                m2481b(this.f3189c << 1);
                            }
                        } else {
                            int d = m2483d(i3);
                            Object obj4 = this.f3188b[d];
                            if (obj4 == null) {
                                this.f3188b[d] = obj;
                                i3 = this.f3187a;
                                this.f3187a = i3 + 1;
                                if (i3 >= this.f3194h) {
                                    m2481b(this.f3189c << 1);
                                }
                            } else {
                                m2480a(obj, i5, obj2, c, obj3, d, obj4);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private int m2482c(int i) {
        int i2 = -1262997959 * i;
        return (i2 ^ (i2 >>> this.f3192f)) & this.f3193g;
    }

    /* renamed from: d */
    private int m2483d(int i) {
        int i2 = -825114047 * i;
        return (i2 ^ (i2 >>> this.f3192f)) & this.f3193g;
    }

    /* renamed from: a */
    public final void m2484a() {
        if (this.f3187a != 0) {
            Object[] objArr = this.f3188b;
            int i = this.f3189c + this.f3190d;
            while (true) {
                int i2 = i - 1;
                if (i > 0) {
                    objArr[i2] = null;
                    i = i2;
                } else {
                    this.f3187a = 0;
                    this.f3190d = 0;
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    final void m2485a(int i) {
        this.f3190d--;
        int i2 = this.f3189c + this.f3190d;
        if (i < i2) {
            this.f3188b[i] = this.f3188b[i2];
        }
    }

    /* renamed from: a */
    public final boolean m2486a(T t) {
        if (t == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        Object[] objArr = this.f3188b;
        int hashCode = t.hashCode();
        int i = this.f3193g & hashCode;
        Object obj = objArr[i];
        if (t.equals(obj)) {
            return false;
        }
        int c = m2482c(hashCode);
        Object obj2 = objArr[c];
        if (t.equals(obj2)) {
            return false;
        }
        int d = m2483d(hashCode);
        Object obj3 = objArr[d];
        if (t.equals(obj3)) {
            return false;
        }
        hashCode = this.f3189c;
        int i2 = this.f3190d + hashCode;
        while (hashCode < i2) {
            if (t.equals(objArr[hashCode])) {
                return false;
            }
            hashCode++;
        }
        int i3;
        if (obj == null) {
            objArr[i] = t;
            i3 = this.f3187a;
            this.f3187a = i3 + 1;
            if (i3 >= this.f3194h) {
                m2481b(this.f3189c << 1);
            }
            return true;
        } else if (obj2 == null) {
            objArr[c] = t;
            i3 = this.f3187a;
            this.f3187a = i3 + 1;
            if (i3 >= this.f3194h) {
                m2481b(this.f3189c << 1);
            }
            return true;
        } else if (obj3 == null) {
            objArr[d] = t;
            i3 = this.f3187a;
            this.f3187a = i3 + 1;
            if (i3 >= this.f3194h) {
                m2481b(this.f3189c << 1);
            }
            return true;
        } else {
            m2480a(t, i, obj, c, obj2, d, obj3);
            return true;
        }
    }

    /* renamed from: b */
    public final T m2487b() {
        Object[] objArr = this.f3188b;
        int i = this.f3189c + this.f3190d;
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] != null) {
                return objArr[i2];
            }
        }
        throw new IllegalStateException("ObjectSet is empty.");
    }

    /* renamed from: b */
    public final boolean m2488b(T t) {
        int hashCode = t.hashCode();
        int i = this.f3193g & hashCode;
        if (t.equals(this.f3188b[i])) {
            this.f3188b[i] = null;
            this.f3187a--;
            return true;
        }
        i = m2482c(hashCode);
        if (t.equals(this.f3188b[i])) {
            this.f3188b[i] = null;
            this.f3187a--;
            return true;
        }
        hashCode = m2483d(hashCode);
        if (t.equals(this.f3188b[hashCode])) {
            this.f3188b[hashCode] = null;
            this.f3187a--;
            return true;
        }
        Object[] objArr = this.f3188b;
        hashCode = this.f3189c;
        int i2 = this.f3190d + hashCode;
        while (hashCode < i2) {
            if (t.equals(objArr[hashCode])) {
                m2485a(hashCode);
                this.f3187a--;
                return true;
            }
            hashCode++;
        }
        return false;
    }

    /* renamed from: c */
    public final C0711a<T> m2489c() {
        if (this.f3197k == null) {
            this.f3197k = new C0711a(this);
            this.f3198l = new C0711a(this);
        }
        if (this.f3197k.f3186e) {
            this.f3198l.m2478a();
            this.f3198l.f3186e = true;
            this.f3197k.f3186e = false;
            return this.f3198l;
        }
        this.f3197k.m2478a();
        this.f3197k.f3186e = true;
        this.f3198l.f3186e = false;
        return this.f3197k;
    }

    /* renamed from: c */
    public final boolean m2490c(T t) {
        int hashCode = t.hashCode();
        if (t.equals(this.f3188b[this.f3193g & hashCode])) {
            return true;
        }
        if (t.equals(this.f3188b[m2482c(hashCode)])) {
            return true;
        }
        if (t.equals(this.f3188b[m2483d(hashCode)])) {
            return true;
        }
        Object obj;
        Object[] objArr = this.f3188b;
        hashCode = this.f3189c;
        int i = this.f3190d + hashCode;
        while (hashCode < i) {
            if (t.equals(objArr[hashCode])) {
                obj = objArr[hashCode];
                break;
            }
            hashCode++;
        }
        obj = null;
        return obj != null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0712r)) {
            return false;
        }
        C0712r c0712r = (C0712r) obj;
        if (c0712r.f3187a != this.f3187a) {
            return false;
        }
        int i = this.f3190d + this.f3189c;
        int i2 = 0;
        while (i2 < i) {
            if (this.f3188b[i2] != null && !c0712r.m2490c(this.f3188b[i2])) {
                return false;
            }
            i2++;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = this.f3190d + this.f3189c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f3188b[i3] != null) {
                i += this.f3188b[i3].hashCode();
            }
        }
        return i;
    }

    public final /* synthetic */ Iterator iterator() {
        return m2489c();
    }

    public final String toString() {
        return "{" + m2479a(", ") + '}';
    }
}
