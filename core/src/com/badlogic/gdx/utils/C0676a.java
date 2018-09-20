package com.badlogic.gdx.utils;

import com.badlogic.gdx.math.C0549f;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.badlogic.gdx.utils.a */
public class C0676a<T> implements Iterable<T> {
    /* renamed from: a */
    public T[] f3000a;
    /* renamed from: b */
    public int f3001b;
    /* renamed from: c */
    public boolean f3002c;
    /* renamed from: d */
    private C0670a f3003d;

    /* renamed from: com.badlogic.gdx.utils.a$a */
    public static class C0670a<T> implements Iterable<T> {
        /* renamed from: a */
        private final C0676a<T> f2987a;
        /* renamed from: b */
        private final boolean f2988b;
        /* renamed from: c */
        private C0671b f2989c;
        /* renamed from: d */
        private C0671b f2990d;

        public C0670a(C0676a<T> c0676a) {
            this(c0676a, (byte) 0);
        }

        private C0670a(C0676a<T> c0676a, byte b) {
            this.f2987a = c0676a;
            this.f2988b = true;
        }

        public final Iterator<T> iterator() {
            if (this.f2989c == null) {
                this.f2989c = new C0671b(this.f2987a, this.f2988b);
                this.f2990d = new C0671b(this.f2987a, this.f2988b);
            }
            if (this.f2989c.f2992b) {
                this.f2990d.f2991a = 0;
                this.f2990d.f2992b = true;
                this.f2989c.f2992b = false;
                return this.f2990d;
            }
            this.f2989c.f2991a = 0;
            this.f2989c.f2992b = true;
            this.f2990d.f2992b = false;
            return this.f2989c;
        }
    }

    /* renamed from: com.badlogic.gdx.utils.a$b */
    public static class C0671b<T> implements Iterable<T>, Iterator<T> {
        /* renamed from: a */
        int f2991a;
        /* renamed from: b */
        boolean f2992b = true;
        /* renamed from: c */
        private final C0676a<T> f2993c;
        /* renamed from: d */
        private final boolean f2994d;

        public C0671b(C0676a<T> c0676a, boolean z) {
            this.f2993c = c0676a;
            this.f2994d = z;
        }

        public final boolean hasNext() {
            if (this.f2992b) {
                return this.f2991a < this.f2993c.f3001b;
            } else {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
        }

        public final Iterator<T> iterator() {
            return this;
        }

        public final T next() {
            if (this.f2991a >= this.f2993c.f3001b) {
                throw new NoSuchElementException(String.valueOf(this.f2991a));
            } else if (this.f2992b) {
                Object[] objArr = this.f2993c.f3000a;
                int i = this.f2991a;
                this.f2991a = i + 1;
                return objArr[i];
            } else {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
        }

        public final void remove() {
            if (this.f2994d) {
                this.f2991a--;
                this.f2993c.mo527b(this.f2991a);
                return;
            }
            throw new GdxRuntimeException("Remove not allowed.");
        }
    }

    public C0676a() {
        this(true, 16);
    }

    public C0676a(int i) {
        this(true, i);
    }

    public C0676a(C0676a<? extends T> c0676a) {
        this(c0676a.f3002c, c0676a.f3001b, c0676a.f3000a.getClass().getComponentType());
        this.f3001b = c0676a.f3001b;
        System.arraycopy(c0676a.f3000a, 0, this.f3000a, 0, this.f3001b);
    }

    public C0676a(Class cls) {
        this(true, 16, cls);
    }

    public C0676a(boolean z, int i) {
        this.f3002c = z;
        this.f3000a = new Object[i];
    }

    public C0676a(boolean z, int i, Class cls) {
        this.f3002c = z;
        this.f3000a = (Object[]) Array.newInstance(cls, i);
    }

    public C0676a(T[] tArr) {
        this((Object[]) tArr, tArr.length);
    }

    private C0676a(T[] tArr, int i) {
        this(true, i, tArr.getClass().getComponentType());
        this.f3001b = i;
        System.arraycopy(tArr, 0, this.f3000a, 0, this.f3001b);
    }

    /* renamed from: a */
    public static <T> C0676a<T> m2288a(T... tArr) {
        return new C0676a((Object[]) tArr);
    }

    /* renamed from: a */
    public final int m2289a(T t, boolean z) {
        int i = 0;
        Object[] objArr = this.f3000a;
        int i2;
        if (z || t == null) {
            i2 = this.f3001b;
            while (i < i2) {
                if (objArr[i] == t) {
                    return i;
                }
                i++;
            }
        } else {
            i2 = this.f3001b;
            while (i < i2) {
                if (t.equals(objArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public T mo523a() {
        if (this.f3001b == 0) {
            throw new IllegalStateException("Array is empty.");
        }
        this.f3001b--;
        T t = this.f3000a[this.f3001b];
        this.f3000a[this.f3001b] = null;
        return t;
    }

    /* renamed from: a */
    public final T m2291a(int i) {
        if (i < this.f3001b) {
            return this.f3000a[i];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f3001b);
    }

    /* renamed from: a */
    public void mo524a(int i, int i2) {
        if (i >= this.f3001b) {
            throw new IndexOutOfBoundsException("first can't be >= size: " + i + " >= " + this.f3001b);
        } else if (i2 >= this.f3001b) {
            throw new IndexOutOfBoundsException("second can't be >= size: " + i2 + " >= " + this.f3001b);
        } else {
            Object[] objArr = this.f3000a;
            Object obj = objArr[i];
            objArr[i] = objArr[i2];
            objArr[i2] = obj;
        }
    }

    /* renamed from: a */
    public void mo525a(int i, T t) {
        if (i >= this.f3001b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f3001b);
        }
        this.f3000a[i] = t;
    }

    /* renamed from: a */
    public final void m2294a(C0676a<? extends T> c0676a) {
        m2295a((C0676a) c0676a, c0676a.f3001b);
    }

    /* renamed from: a */
    public final void m2295a(C0676a<? extends T> c0676a, int i) {
        if (i + 0 > c0676a.f3001b) {
            throw new IllegalArgumentException("start + count must be <= size: 0 + " + i + " <= " + c0676a.f3001b);
        }
        Object[] objArr = c0676a.f3000a;
        Object obj = this.f3000a;
        int i2 = this.f3001b + i;
        if (i2 > obj.length) {
            obj = m2307d(Math.max(8, (int) (((float) i2) * 1.75f)));
        }
        System.arraycopy(objArr, 0, obj, this.f3001b, i);
        this.f3001b += i;
    }

    /* renamed from: a */
    public final void m2296a(T t) {
        Object[] objArr = this.f3000a;
        if (this.f3001b == objArr.length) {
            objArr = m2307d(Math.max(8, (int) (((float) this.f3001b) * 1.75f)));
        }
        int i = this.f3001b;
        this.f3001b = i + 1;
        objArr[i] = t;
    }

    /* renamed from: a */
    public void mo526a(Comparator<? super T> comparator) {
        int i = 0;
        if (aa.f3004a == null) {
            aa.f3004a = new aa();
        }
        aa aaVar = aa.f3004a;
        Object[] objArr = this.f3000a;
        int i2 = this.f3001b;
        if (aaVar.f3005b == null) {
            aaVar.f3005b = new ae();
        }
        ae aeVar = aaVar.f3005b;
        aeVar.f3016e = 0;
        int length = objArr.length;
        if (i2 < 0) {
            throw new IllegalArgumentException("fromIndex(0) > toIndex(" + i2 + ")");
        } else if (i2 > length) {
            throw new ArrayIndexOutOfBoundsException(i2);
        } else {
            length = i2 + 0;
            if (length < 2) {
                return;
            }
            if (length < 32) {
                ae.m2333a(objArr, 0, i2, ae.m2331a(objArr, 0, i2, (Comparator) comparator) + 0, comparator);
                return;
            }
            aeVar.f3012a = objArr;
            aeVar.f3013b = comparator;
            aeVar.f3015d = 0;
            int a = ae.m2329a(length);
            int i3 = 0;
            do {
                int i4;
                int a2 = ae.m2331a(objArr, i3, i2, (Comparator) comparator);
                if (a2 < a) {
                    i4 = length <= a ? length : a;
                    ae.m2333a(objArr, i3, i3 + i4, a2 + i3, comparator);
                } else {
                    i4 = a2;
                }
                aeVar.f3017f[aeVar.f3016e] = i3;
                aeVar.f3018g[aeVar.f3016e] = i4;
                aeVar.f3016e++;
                aeVar.m2337a();
                i3 += i4;
                length -= i4;
            } while (length != 0);
            aeVar.m2338b();
            aeVar.f3012a = null;
            aeVar.f3013b = null;
            Object[] objArr2 = aeVar.f3014c;
            i3 = aeVar.f3015d;
            while (i < i3) {
                objArr2[i] = null;
                i++;
            }
        }
    }

    /* renamed from: a */
    public final <V> V[] m2298a(Class cls) {
        Object[] objArr = (Object[]) Array.newInstance(cls, this.f3001b);
        System.arraycopy(this.f3000a, 0, objArr, 0, this.f3001b);
        return objArr;
    }

    /* renamed from: b */
    public final T m2299b() {
        if (this.f3001b != 0) {
            return this.f3000a[this.f3001b - 1];
        }
        throw new IllegalStateException("Array is empty.");
    }

    /* renamed from: b */
    public T mo527b(int i) {
        if (i >= this.f3001b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f3001b);
        }
        Object obj = this.f3000a;
        T t = obj[i];
        this.f3001b--;
        if (this.f3002c) {
            System.arraycopy(obj, i + 1, obj, i, this.f3001b - i);
        } else {
            obj[i] = obj[this.f3001b];
        }
        obj[this.f3001b] = null;
        return t;
    }

    /* renamed from: b */
    public void mo528b(int i, int i2) {
        if (i2 >= this.f3001b) {
            throw new IndexOutOfBoundsException("end can't be >= size: " + i2 + " >= " + this.f3001b);
        } else if (i > i2) {
            throw new IndexOutOfBoundsException("start can't be > end: " + i + " > " + i2);
        } else {
            Object obj = this.f3000a;
            int i3 = (i2 - i) + 1;
            if (this.f3002c) {
                System.arraycopy(obj, i + i3, obj, i, this.f3001b - (i + i3));
            } else {
                int i4 = this.f3001b - 1;
                for (int i5 = 0; i5 < i3; i5++) {
                    obj[i + i5] = obj[i4 - i5];
                }
            }
            this.f3001b -= i3;
        }
    }

    /* renamed from: b */
    public final boolean m2302b(T t) {
        Object[] objArr = this.f3000a;
        int i = this.f3001b - 1;
        while (i >= 0) {
            int i2 = i - 1;
            if (objArr[i] == t) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo529b(T t, boolean z) {
        Object[] objArr = this.f3000a;
        int i;
        int i2;
        if (z || t == null) {
            i = this.f3001b;
            for (i2 = 0; i2 < i; i2++) {
                if (objArr[i2] == t) {
                    mo527b(i2);
                    return true;
                }
            }
        } else {
            i = this.f3001b;
            for (i2 = 0; i2 < i; i2++) {
                if (t.equals(objArr[i2])) {
                    mo527b(i2);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final T m2304c() {
        if (this.f3001b != 0) {
            return this.f3000a[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    /* renamed from: c */
    public final T[] m2305c(int i) {
        int i2 = this.f3001b + i;
        if (i2 > this.f3000a.length) {
            m2307d(Math.max(8, i2));
        }
        return this.f3000a;
    }

    /* renamed from: d */
    public void mo530d() {
        Object[] objArr = this.f3000a;
        int i = this.f3001b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f3001b = 0;
    }

    /* renamed from: d */
    protected final T[] m2307d(int i) {
        Object obj = this.f3000a;
        Object[] objArr = (Object[]) Array.newInstance(obj.getClass().getComponentType(), i);
        System.arraycopy(obj, 0, objArr, 0, Math.min(this.f3001b, objArr.length));
        this.f3000a = objArr;
        return objArr;
    }

    /* renamed from: e */
    public final T m2308e() {
        return this.f3001b == 0 ? null : this.f3000a[C0549f.m1763a(this.f3001b - 1)];
    }

    /* renamed from: e */
    public void mo531e(int i) {
        if (this.f3001b > i) {
            for (int i2 = i; i2 < this.f3001b; i2++) {
                this.f3000a[i2] = null;
            }
            this.f3001b = i;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!this.f3002c) {
            return false;
        }
        if (!(obj instanceof C0676a)) {
            return false;
        }
        C0676a c0676a = (C0676a) obj;
        if (!c0676a.f3002c) {
            return false;
        }
        int i = this.f3001b;
        if (i != c0676a.f3001b) {
            return false;
        }
        Object[] objArr = this.f3000a;
        Object[] objArr2 = c0676a.f3000a;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj2 = objArr[i2];
            Object obj3 = objArr2[i2];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (!this.f3002c) {
            return super.hashCode();
        }
        Object[] objArr = this.f3000a;
        int i = this.f3001b;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 *= 31;
            Object obj = objArr[i3];
            if (obj != null) {
                i2 += obj.hashCode();
            }
        }
        return i2;
    }

    public Iterator<T> iterator() {
        if (this.f3003d == null) {
            this.f3003d = new C0670a(this);
        }
        return this.f3003d.iterator();
    }

    public String toString() {
        if (this.f3001b == 0) {
            return "[]";
        }
        Object[] objArr = this.f3000a;
        ac acVar = new ac(32);
        acVar.m2322a('[');
        acVar.m2320a(objArr[0]);
        for (int i = 1; i < this.f3001b; i++) {
            acVar.m2324a(", ");
            acVar.m2320a(objArr[i]);
        }
        acVar.m2322a(']');
        return acVar.toString();
    }
}
