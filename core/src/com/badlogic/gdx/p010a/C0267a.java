package com.badlogic.gdx.p010a;

import com.badlogic.gdx.p016c.C0316a;

/* renamed from: com.badlogic.gdx.a.a */
public final class C0267a<T> {
    /* renamed from: a */
    public final String f957a;
    /* renamed from: b */
    public final Class<T> f958b;
    /* renamed from: c */
    public final C0242c f959c;
    /* renamed from: d */
    public C0316a f960d;

    public C0267a(C0316a c0316a, Class<T> cls) {
        this(c0316a, (Class) cls, null);
    }

    public C0267a(C0316a c0316a, Class<T> cls, C0242c<T> c0242c) {
        this.f957a = c0316a.m896h().replaceAll("\\\\", "/");
        this.f960d = c0316a;
        this.f958b = cls;
        this.f959c = c0242c;
    }

    public C0267a(String str, Class<T> cls) {
        this(str, (Class) cls, null);
    }

    public C0267a(String str, Class<T> cls, C0242c<T> c0242c) {
        this.f957a = str.replaceAll("\\\\", "/");
        this.f958b = cls;
        this.f959c = c0242c;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f957a);
        stringBuffer.append(", ");
        stringBuffer.append(this.f958b.getName());
        return stringBuffer.toString();
    }
}
