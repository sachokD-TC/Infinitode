package com.badlogic.gdx.utils;

import com.badlogic.gdx.utils.C0710q.C0707b;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.badlogic.gdx.utils.b */
public final class C0685b<K, V> implements Iterable<C0707b<K, V>> {
    /* renamed from: a */
    public K[] f3065a;
    /* renamed from: b */
    public V[] f3066b;
    /* renamed from: c */
    public int f3067c;
    /* renamed from: d */
    public boolean f3068d;
    /* renamed from: e */
    private C0681a f3069e;
    /* renamed from: f */
    private C0681a f3070f;

    /* renamed from: com.badlogic.gdx.utils.b$a */
    public static class C0681a<K, V> implements Iterable<C0707b<K, V>>, Iterator<C0707b<K, V>> {
        /* renamed from: a */
        C0707b<K, V> f3051a = new C0707b();
        /* renamed from: b */
        int f3052b;
        /* renamed from: c */
        boolean f3053c = true;
        /* renamed from: d */
        private final C0685b<K, V> f3054d;

        public C0681a(C0685b<K, V> c0685b) {
            this.f3054d = c0685b;
        }

        public final boolean hasNext() {
            if (this.f3053c) {
                return this.f3052b < this.f3054d.f3067c;
            } else {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
        }

        public final Iterator<C0707b<K, V>> iterator() {
            return this;
        }

        public final /* synthetic */ Object next() {
            if (this.f3052b >= this.f3054d.f3067c) {
                throw new NoSuchElementException(String.valueOf(this.f3052b));
            } else if (this.f3053c) {
                this.f3051a.f3163a = this.f3054d.f3065a[this.f3052b];
                C0707b c0707b = this.f3051a;
                Object[] objArr = this.f3054d.f3066b;
                int i = this.f3052b;
                this.f3052b = i + 1;
                c0707b.f3164b = objArr[i];
                return this.f3051a;
            } else {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
        }

        public final void remove() {
            this.f3052b--;
            C0685b c0685b = this.f3054d;
            int i = this.f3052b;
            if (i >= c0685b.f3067c) {
                throw new IndexOutOfBoundsException(String.valueOf(i));
            }
            Object obj = c0685b.f3065a;
            c0685b.f3067c--;
            if (c0685b.f3068d) {
                System.arraycopy(obj, i + 1, obj, i, c0685b.f3067c - i);
                System.arraycopy(c0685b.f3066b, i + 1, c0685b.f3066b, i, c0685b.f3067c - i);
            } else {
                obj[i] = obj[c0685b.f3067c];
                c0685b.f3066b[i] = c0685b.f3066b[c0685b.f3067c];
            }
            obj[c0685b.f3067c] = null;
            c0685b.f3066b[c0685b.f3067c] = null;
        }
    }

    public C0685b() {
        this((byte) 0);
    }

    private C0685b(byte b) {
        this.f3068d = true;
        this.f3065a = new Object[16];
        this.f3066b = new Object[16];
    }

    public C0685b(Class cls, Class cls2) {
        this(false, 16, cls, cls2);
    }

    public C0685b(boolean z, int i, Class cls, Class cls2) {
        this.f3068d = z;
        this.f3065a = (Object[]) Array.newInstance(cls, i);
        this.f3066b = (Object[]) Array.newInstance(cls2, i);
    }

    /* renamed from: a */
    private V m2383a(K k) {
        Object[] objArr = this.f3065a;
        int i = this.f3067c - 1;
        if (k == null) {
            while (i >= 0) {
                if (objArr[i] == k) {
                    return this.f3066b[i];
                }
                i--;
            }
        } else {
            while (i >= 0) {
                if (k.equals(objArr[i])) {
                    return this.f3066b[i];
                }
                i--;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final int m2384a(K k, V v) {
        int i;
        Object[] objArr = this.f3065a;
        int i2;
        if (k == null) {
            i2 = this.f3067c;
            i = 0;
            while (i < i2) {
                if (objArr[i] == k) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            i2 = this.f3067c;
            i = 0;
            while (i < i2) {
                if (k.equals(objArr[i])) {
                    break;
                }
                i++;
            }
            i = -1;
        }
        if (i == -1) {
            if (this.f3067c == this.f3065a.length) {
                int max = Math.max(8, (int) (((float) this.f3067c) * 1.75f));
                Object[] objArr2 = (Object[]) Array.newInstance(this.f3065a.getClass().getComponentType(), max);
                System.arraycopy(this.f3065a, 0, objArr2, 0, Math.min(this.f3067c, objArr2.length));
                this.f3065a = objArr2;
                objArr2 = (Object[]) Array.newInstance(this.f3066b.getClass().getComponentType(), max);
                System.arraycopy(this.f3066b, 0, objArr2, 0, Math.min(this.f3067c, objArr2.length));
                this.f3066b = objArr2;
            }
            i = this.f3067c;
            this.f3067c = i + 1;
        }
        this.f3065a[i] = k;
        this.f3066b[i] = v;
        return i;
    }

    /* renamed from: a */
    public final C0681a<K, V> m2385a() {
        if (this.f3069e == null) {
            this.f3069e = new C0681a(this);
            this.f3070f = new C0681a(this);
        }
        if (this.f3069e.f3053c) {
            this.f3070f.f3052b = 0;
            this.f3070f.f3053c = true;
            this.f3069e.f3053c = false;
            return this.f3070f;
        }
        this.f3069e.f3052b = 0;
        this.f3069e.f3053c = true;
        this.f3070f.f3053c = false;
        return this.f3069e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0685b)) {
            return false;
        }
        C0685b c0685b = (C0685b) obj;
        if (c0685b.f3067c != this.f3067c) {
            return false;
        }
        Object[] objArr = this.f3065a;
        Object[] objArr2 = this.f3066b;
        int i = this.f3067c;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj2 = objArr[i2];
            Object obj3 = objArr2[i2];
            if (obj3 == null) {
                boolean z;
                Object[] objArr3 = c0685b.f3065a;
                int i3 = c0685b.f3067c - 1;
                int i4;
                if (obj2 == null) {
                    while (i3 >= 0) {
                        i4 = i3 - 1;
                        if (objArr3[i3] == obj2) {
                            z = true;
                            break;
                        }
                        i3 = i4;
                    }
                    z = false;
                } else {
                    while (i3 >= 0) {
                        i4 = i3 - 1;
                        if (obj2.equals(objArr3[i3])) {
                            z = true;
                            break;
                        }
                        i3 = i4;
                    }
                    z = false;
                }
                if (!z || c0685b.m2383a(obj2) != null) {
                    return false;
                }
            } else if (!obj3.equals(c0685b.m2383a(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        Object[] objArr = this.f3065a;
        Object[] objArr2 = this.f3066b;
        int i2 = this.f3067c;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            Object obj2 = objArr2[i3];
            if (obj != null) {
                i += obj.hashCode() * 31;
            }
            if (obj2 != null) {
                i += obj2.hashCode();
            }
        }
        return i;
    }

    public final Iterator<C0707b<K, V>> iterator() {
        return m2385a();
    }

    public final String toString() {
        if (this.f3067c == 0) {
            return "{}";
        }
        Object[] objArr = this.f3065a;
        Object[] objArr2 = this.f3066b;
        ac acVar = new ac(32);
        acVar.m2322a('{');
        acVar.m2320a(objArr[0]);
        acVar.m2322a('=');
        acVar.m2320a(objArr2[0]);
        for (int i = 1; i < this.f3067c; i++) {
            acVar.m2324a(", ");
            acVar.m2320a(objArr[i]);
            acVar.m2322a('=');
            acVar.m2320a(objArr2[i]);
        }
        acVar.m2322a('}');
        return acVar.toString();
    }
}
