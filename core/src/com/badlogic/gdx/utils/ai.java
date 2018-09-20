package com.badlogic.gdx.utils;

import java.io.Writer;

public final class ai extends Writer {
    /* renamed from: a */
    public int f3046a;
    /* renamed from: b */
    private final Writer f3047b;
    /* renamed from: c */
    private final C0676a<String> f3048c = new C0676a();
    /* renamed from: d */
    private String f3049d;
    /* renamed from: e */
    private boolean f3050e;

    public ai(Writer writer) {
        this.f3047b = writer;
    }

    /* renamed from: b */
    private void m2370b() {
        int i = this.f3046a;
        if (this.f3049d != null) {
            i++;
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.f3047b.write(9);
        }
    }

    /* renamed from: c */
    private boolean m2371c() {
        if (this.f3049d == null) {
            return false;
        }
        this.f3046a++;
        this.f3048c.m2296a(this.f3049d);
        this.f3049d = null;
        this.f3047b.write(">");
        return true;
    }

    /* renamed from: a */
    public final ai m2372a() {
        if (this.f3049d != null) {
            this.f3047b.write("/>\n");
            this.f3049d = null;
        } else {
            this.f3046a = Math.max(this.f3046a - 1, 0);
            if (this.f3050e) {
                m2370b();
            }
            this.f3047b.write("</");
            this.f3047b.write((String) this.f3048c.mo523a());
            this.f3047b.write(">\n");
        }
        this.f3050e = true;
        return this;
    }

    /* renamed from: a */
    public final ai m2373a(Object obj) {
        m2371c();
        String obj2 = obj == null ? "null" : obj.toString();
        this.f3050e = obj2.length() > 64;
        if (this.f3050e) {
            this.f3047b.write(10);
            m2370b();
        }
        this.f3047b.write(obj2);
        if (this.f3050e) {
            this.f3047b.write(10);
        }
        return this;
    }

    /* renamed from: a */
    public final ai m2374a(String str) {
        if (m2371c()) {
            this.f3047b.write(10);
        }
        m2370b();
        this.f3047b.write(60);
        this.f3047b.write(str);
        this.f3049d = str;
        return this;
    }

    /* renamed from: a */
    public final ai m2375a(String str, Object obj) {
        if (this.f3049d == null) {
            throw new IllegalStateException();
        }
        this.f3047b.write(32);
        this.f3047b.write(str);
        this.f3047b.write("=\"");
        this.f3047b.write(obj == null ? "null" : obj.toString());
        this.f3047b.write(34);
        return this;
    }

    public final void close() {
        while (this.f3048c.f3001b != 0) {
            m2372a();
        }
        this.f3047b.close();
    }

    public final void flush() {
        this.f3047b.flush();
    }

    public final void write(char[] cArr, int i, int i2) {
        m2371c();
        this.f3047b.write(cArr, i, i2);
    }
}
