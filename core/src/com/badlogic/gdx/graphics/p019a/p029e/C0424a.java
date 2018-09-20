package com.badlogic.gdx.graphics.p019a.p029e;

import com.badlogic.gdx.graphics.C0380h;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.Texture.TextureWrap;

/* renamed from: com.badlogic.gdx.graphics.a.e.a */
public final class C0424a<T extends C0380h> implements Comparable<C0424a<T>> {
    /* renamed from: a */
    public T f1584a;
    /* renamed from: b */
    public TextureFilter f1585b;
    /* renamed from: c */
    public TextureFilter f1586c;
    /* renamed from: d */
    public TextureWrap f1587d;
    /* renamed from: e */
    public TextureWrap f1588e;

    public C0424a() {
        this.f1584a = null;
    }

    private C0424a(T t) {
        this.f1584a = null;
        this.f1584a = t;
        this.f1585b = null;
        this.f1586c = null;
        this.f1587d = null;
        this.f1588e = null;
    }

    public C0424a(T t, byte b) {
        this(t);
    }

    /* renamed from: a */
    public final int m1203a(C0424a<T> c0424a) {
        int i = 0;
        if (c0424a == this) {
            return 0;
        }
        int i2 = this.f1584a == null ? 0 : this.f1584a.f1396c;
        int i3 = c0424a.f1584a == null ? 0 : c0424a.f1584a.f1396c;
        if (i2 != i3) {
            return i2 - i3;
        }
        i2 = this.f1584a == null ? 0 : this.f1584a.m1136i();
        i3 = c0424a.f1584a == null ? 0 : c0424a.f1584a.m1136i();
        if (i2 != i3) {
            return i2 - i3;
        }
        if (this.f1585b != c0424a.f1585b) {
            i2 = this.f1585b == null ? 0 : this.f1585b.glEnum;
            if (c0424a.f1585b != null) {
                i = c0424a.f1585b.glEnum;
            }
            return i2 - i;
        } else if (this.f1586c != c0424a.f1586c) {
            i2 = this.f1586c == null ? 0 : this.f1586c.glEnum;
            if (c0424a.f1586c != null) {
                i = c0424a.f1586c.glEnum;
            }
            return i2 - i;
        } else if (this.f1587d != c0424a.f1587d) {
            i2 = this.f1587d == null ? 0 : this.f1587d.glEnum;
            if (c0424a.f1587d != null) {
                i = c0424a.f1587d.glEnum;
            }
            return i2 - i;
        } else if (this.f1588e == c0424a.f1588e) {
            return 0;
        } else {
            i2 = this.f1588e == null ? 0 : this.f1588e.glEnum;
            if (c0424a.f1588e != null) {
                i = c0424a.f1588e.glEnum;
            }
            return i2 - i;
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return m1203a((C0424a) obj);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0424a)) {
            return false;
        }
        C0424a c0424a = (C0424a) obj;
        return c0424a.f1584a == this.f1584a && c0424a.f1585b == this.f1585b && c0424a.f1586c == this.f1586c && c0424a.f1587d == this.f1587d && c0424a.f1588e == this.f1588e;
    }

    public final int hashCode() {
        int i = 0;
        long i2 = ((((((((((long) (this.f1584a == null ? 0 : this.f1584a.f1396c)) * 811) + ((long) (this.f1584a == null ? 0 : this.f1584a.m1136i()))) * 811) + ((long) (this.f1585b == null ? 0 : this.f1585b.glEnum))) * 811) + ((long) (this.f1586c == null ? 0 : this.f1586c.glEnum))) * 811) + ((long) (this.f1587d == null ? 0 : this.f1587d.glEnum))) * 811;
        if (this.f1588e != null) {
            i = this.f1588e.glEnum;
        }
        long j = ((long) i) + i2;
        return (int) (j ^ (j >> 32));
    }
}
