package com.badlogic.gdx.graphics;

import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.badlogic.gdx.graphics.n */
public final class C0515n implements Comparable<C0515n>, Iterable<C0512m> {
    /* renamed from: a */
    public final C0512m[] f2299a;
    /* renamed from: b */
    public final int f2300b;
    /* renamed from: c */
    private long f2301c = -1;
    /* renamed from: d */
    private C0513a<C0512m> f2302d;

    /* renamed from: com.badlogic.gdx.graphics.n$a */
    private static class C0513a<T> implements Iterable<T> {
        /* renamed from: a */
        private final T[] f2293a;
        /* renamed from: b */
        private C0514b f2294b;
        /* renamed from: c */
        private C0514b f2295c;

        public C0513a(T[] tArr) {
            this.f2293a = tArr;
        }

        public final Iterator<T> iterator() {
            if (this.f2294b == null) {
                this.f2294b = new C0514b(this.f2293a);
                this.f2295c = new C0514b(this.f2293a);
            }
            if (this.f2294b.f2297b) {
                this.f2295c.f2296a = 0;
                this.f2295c.f2297b = true;
                this.f2294b.f2297b = false;
                return this.f2295c;
            }
            this.f2294b.f2296a = 0;
            this.f2294b.f2297b = true;
            this.f2295c.f2297b = false;
            return this.f2294b;
        }
    }

    /* renamed from: com.badlogic.gdx.graphics.n$b */
    private static class C0514b<T> implements Iterable<T>, Iterator<T> {
        /* renamed from: a */
        int f2296a;
        /* renamed from: b */
        boolean f2297b = true;
        /* renamed from: c */
        private final T[] f2298c;

        public C0514b(T[] tArr) {
            this.f2298c = tArr;
        }

        public final boolean hasNext() {
            if (this.f2297b) {
                return this.f2296a < this.f2298c.length;
            } else {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
        }

        public final Iterator<T> iterator() {
            return this;
        }

        public final T next() {
            if (this.f2296a >= this.f2298c.length) {
                throw new NoSuchElementException(String.valueOf(this.f2296a));
            } else if (this.f2297b) {
                Object[] objArr = this.f2298c;
                int i = this.f2296a;
                this.f2296a = i + 1;
                return objArr[i];
            } else {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
        }

        public final void remove() {
            throw new GdxRuntimeException("Remove not allowed.");
        }
    }

    public C0515n(C0512m... c0512mArr) {
        if (c0512mArr.length == 0) {
            throw new IllegalArgumentException("attributes must be >= 1");
        }
        C0512m[] c0512mArr2 = new C0512m[c0512mArr.length];
        for (int i = 0; i < c0512mArr.length; i++) {
            c0512mArr2[i] = c0512mArr[i];
        }
        this.f2299a = c0512mArr2;
        this.f2300b = m1678a();
    }

    /* renamed from: a */
    private int m1678a() {
        int i = 0;
        for (C0512m c0512m : this.f2299a) {
            int i2;
            c0512m.f2289e = i;
            switch (c0512m.f2288d) {
                case 5120:
                case 5121:
                    i2 = c0512m.f2286b;
                    break;
                case 5122:
                case 5123:
                    i2 = c0512m.f2286b * 2;
                    break;
                case 5126:
                case 5132:
                    i2 = c0512m.f2286b * 4;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            i += i2;
        }
        return i;
    }

    /* renamed from: b */
    private long m1679b() {
        if (this.f2301c == -1) {
            long j = 0;
            for (C0512m c0512m : this.f2299a) {
                j |= (long) c0512m.f2285a;
            }
            this.f2301c = j;
        }
        return this.f2301c;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C0515n c0515n = (C0515n) obj;
        if (this.f2299a.length != c0515n.f2299a.length) {
            return this.f2299a.length - c0515n.f2299a.length;
        }
        long b = m1679b();
        long b2 = c0515n.m1679b();
        if (b != b2) {
            return b >= b2 ? 1 : -1;
        } else {
            int length = this.f2299a.length - 1;
            while (length >= 0) {
                C0512m c0512m = this.f2299a[length];
                C0512m c0512m2 = c0515n.f2299a[length];
                if (c0512m.f2285a != c0512m2.f2285a) {
                    return c0512m.f2285a - c0512m2.f2285a;
                }
                if (c0512m.f2291g != c0512m2.f2291g) {
                    return c0512m.f2291g - c0512m2.f2291g;
                }
                if (c0512m.f2286b != c0512m2.f2286b) {
                    return c0512m.f2286b - c0512m2.f2286b;
                }
                if (c0512m.f2287c != c0512m2.f2287c) {
                    return c0512m.f2287c ? 1 : -1;
                } else {
                    if (c0512m.f2288d != c0512m2.f2288d) {
                        return c0512m.f2288d - c0512m2.f2288d;
                    }
                    length--;
                }
            }
            return 0;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0515n)) {
            return false;
        }
        C0515n c0515n = (C0515n) obj;
        if (this.f2299a.length != c0515n.f2299a.length) {
            return false;
        }
        for (int i = 0; i < this.f2299a.length; i++) {
            if (!this.f2299a[i].m1677a(c0515n.f2299a[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        long length = (long) (this.f2299a.length * 61);
        for (C0512m hashCode : this.f2299a) {
            length = (length * 61) + ((long) hashCode.hashCode());
        }
        return (int) ((length >> 32) ^ length);
    }

    public final Iterator<C0512m> iterator() {
        if (this.f2302d == null) {
            this.f2302d = new C0513a(this.f2299a);
        }
        return this.f2302d.iterator();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < this.f2299a.length; i++) {
            stringBuilder.append("(");
            stringBuilder.append(this.f2299a[i].f2290f);
            stringBuilder.append(", ");
            stringBuilder.append(this.f2299a[i].f2285a);
            stringBuilder.append(", ");
            stringBuilder.append(this.f2299a[i].f2286b);
            stringBuilder.append(", ");
            stringBuilder.append(this.f2299a[i].f2289e);
            stringBuilder.append(")");
            stringBuilder.append("\n");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
