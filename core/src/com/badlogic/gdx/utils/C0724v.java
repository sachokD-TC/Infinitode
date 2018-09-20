package com.badlogic.gdx.utils;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.badlogic.gdx.utils.v */
public class C0724v<T> implements Iterable<T> {
    /* renamed from: a */
    protected T[] f3221a;
    /* renamed from: b */
    protected int f3222b;
    /* renamed from: c */
    protected int f3223c;
    /* renamed from: d */
    public int f3224d;
    /* renamed from: e */
    private C0722a f3225e;

    /* renamed from: com.badlogic.gdx.utils.v$a */
    public static class C0722a<T> implements Iterable<T> {
        /* renamed from: a */
        private final C0724v<T> f3213a;
        /* renamed from: b */
        private final boolean f3214b;
        /* renamed from: c */
        private C0723b f3215c;
        /* renamed from: d */
        private C0723b f3216d;

        public C0722a(C0724v<T> c0724v) {
            this(c0724v, (byte) 0);
        }

        private C0722a(C0724v<T> c0724v, byte b) {
            this.f3213a = c0724v;
            this.f3214b = true;
        }

        public final Iterator<T> iterator() {
            if (this.f3215c == null) {
                this.f3215c = new C0723b(this.f3213a, this.f3214b);
                this.f3216d = new C0723b(this.f3213a, this.f3214b);
            }
            if (this.f3215c.f3218b) {
                this.f3216d.f3217a = 0;
                this.f3216d.f3218b = true;
                this.f3215c.f3218b = false;
                return this.f3216d;
            }
            this.f3215c.f3217a = 0;
            this.f3215c.f3218b = true;
            this.f3216d.f3218b = false;
            return this.f3215c;
        }
    }

    /* renamed from: com.badlogic.gdx.utils.v$b */
    public static class C0723b<T> implements Iterable<T>, Iterator<T> {
        /* renamed from: a */
        int f3217a;
        /* renamed from: b */
        boolean f3218b = true;
        /* renamed from: c */
        private final C0724v<T> f3219c;
        /* renamed from: d */
        private final boolean f3220d;

        public C0723b(C0724v<T> c0724v, boolean z) {
            this.f3219c = c0724v;
            this.f3220d = z;
        }

        public final boolean hasNext() {
            if (this.f3218b) {
                return this.f3217a < this.f3219c.f3224d;
            } else {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
        }

        public final Iterator<T> iterator() {
            return this;
        }

        public final T next() {
            if (this.f3217a >= this.f3219c.f3224d) {
                throw new NoSuchElementException(String.valueOf(this.f3217a));
            } else if (this.f3218b) {
                C0724v c0724v = this.f3219c;
                int i = this.f3217a;
                this.f3217a = i + 1;
                return c0724v.m2517b(i);
            } else {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
        }

        public final void remove() {
            if (this.f3220d) {
                this.f3217a--;
                this.f3219c.m2515a(this.f3217a);
                return;
            }
            throw new GdxRuntimeException("Remove not allowed.");
        }
    }

    public C0724v() {
        this((byte) 0);
    }

    private C0724v(byte b) {
        this.f3222b = 0;
        this.f3223c = 0;
        this.f3224d = 0;
        this.f3221a = new Object[16];
    }

    /* renamed from: a */
    public final T m2515a(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("index can't be < 0: " + i);
        } else if (i >= this.f3224d) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f3224d);
        } else {
            T t;
            Object obj = this.f3221a;
            int i2 = this.f3222b;
            int i3 = this.f3223c;
            int i4 = i + i2;
            if (i2 < i3) {
                t = obj[i4];
                System.arraycopy(obj, i4 + 1, obj, i4, i3 - i4);
                obj[i3] = null;
                this.f3223c--;
            } else if (i4 >= obj.length) {
                i2 = i4 - obj.length;
                t = obj[i2];
                System.arraycopy(obj, i2 + 1, obj, i2, i3 - i2);
                this.f3223c--;
            } else {
                t = obj[i4];
                System.arraycopy(obj, i2, obj, i2 + 1, i4 - i2);
                obj[i2] = null;
                this.f3222b++;
                if (this.f3222b == obj.length) {
                    this.f3222b = 0;
                }
            }
            this.f3224d--;
            return t;
        }
    }

    /* renamed from: a */
    public final void m2516a(T t) {
        Object[] objArr = this.f3221a;
        if (this.f3224d == objArr.length) {
            int length = objArr.length << 1;
            Object obj = this.f3221a;
            int i = this.f3222b;
            int i2 = this.f3223c;
            objArr = (Object[]) Array.newInstance(obj.getClass().getComponentType(), length);
            if (i < i2) {
                System.arraycopy(obj, i, objArr, 0, i2 - i);
            } else if (this.f3224d > 0) {
                int length2 = obj.length - i;
                System.arraycopy(obj, i, objArr, 0, length2);
                System.arraycopy(obj, 0, objArr, length2, i2);
            }
            this.f3221a = objArr;
            this.f3222b = 0;
            this.f3223c = this.f3224d;
            objArr = this.f3221a;
        }
        int i3 = this.f3223c;
        this.f3223c = i3 + 1;
        objArr[i3] = t;
        if (this.f3223c == objArr.length) {
            this.f3223c = 0;
        }
        this.f3224d++;
    }

    /* renamed from: b */
    public final T m2517b(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("index can't be < 0: " + i);
        } else if (i >= this.f3224d) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f3224d);
        } else {
            Object[] objArr = this.f3221a;
            int i2 = this.f3222b + i;
            if (i2 >= objArr.length) {
                i2 -= objArr.length;
            }
            return objArr[i2];
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0724v)) {
            return false;
        }
        C0724v c0724v = (C0724v) obj;
        int i = this.f3224d;
        if (c0724v.f3224d != i) {
            return false;
        }
        Object[] objArr = this.f3221a;
        int length = objArr.length;
        Object[] objArr2 = c0724v.f3221a;
        int length2 = objArr2.length;
        int i2 = this.f3222b;
        int i3 = c0724v.f3222b;
        for (int i4 = 0; i4 < i; i4++) {
            Object obj2 = objArr[i2];
            Object obj3 = objArr2[i3];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
            i2++;
            i3++;
            if (i2 == length) {
                i2 = 0;
            }
            if (i3 == length2) {
                i3 = 0;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f3224d;
        Object[] objArr = this.f3221a;
        int length = objArr.length;
        int i2 = i + 1;
        int i3 = 0;
        int i4 = this.f3222b;
        while (i3 < i) {
            Object obj = objArr[i4];
            int i5 = i2 * 31;
            i2 = obj != null ? i5 + obj.hashCode() : i5;
            i5 = i4 + 1;
            if (i5 == length) {
                i5 = 0;
            }
            i3++;
            i4 = i5;
        }
        return i2;
    }

    public Iterator<T> iterator() {
        if (this.f3225e == null) {
            this.f3225e = new C0722a(this);
        }
        return this.f3225e.iterator();
    }

    public String toString() {
        if (this.f3224d == 0) {
            return "[]";
        }
        Object[] objArr = this.f3221a;
        int i = this.f3222b;
        int i2 = this.f3223c;
        ac acVar = new ac(64);
        acVar.m2322a('[');
        acVar.m2320a(objArr[i]);
        for (i = (i + 1) % objArr.length; i != i2; i = (i + 1) % objArr.length) {
            acVar.m2324a(", ");
            acVar.m2320a(objArr[i]);
        }
        acVar.m2322a(']');
        return acVar.toString();
    }
}
