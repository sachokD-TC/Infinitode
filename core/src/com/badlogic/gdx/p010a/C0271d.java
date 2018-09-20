package com.badlogic.gdx.p010a;

import com.badlogic.gdx.p010a.p011a.C0240a;
import com.badlogic.gdx.p010a.p011a.C0241b;
import com.badlogic.gdx.p010a.p011a.C0254n;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.p013a.C0270c;
import com.badlogic.gdx.utils.p013a.C0674a;
import com.badlogic.gdx.utils.p013a.C0675b;

/* renamed from: com.badlogic.gdx.a.d */
final class C0271d implements C0270c<Void> {
    /* renamed from: a */
    C0273e f961a;
    /* renamed from: b */
    final C0267a f962b;
    /* renamed from: c */
    final C0240a f963c;
    /* renamed from: d */
    final C0674a f964d;
    /* renamed from: e */
    final long f965e;
    /* renamed from: f */
    volatile boolean f966f = false;
    /* renamed from: g */
    volatile boolean f967g = false;
    /* renamed from: h */
    volatile C0676a<C0267a> f968h;
    /* renamed from: i */
    volatile C0675b<Void> f969i = null;
    /* renamed from: j */
    volatile C0675b<Void> f970j = null;
    /* renamed from: k */
    volatile Object f971k = null;
    /* renamed from: l */
    int f972l = 0;
    /* renamed from: m */
    volatile boolean f973m = false;

    public C0271d(C0273e c0273e, C0267a c0267a, C0240a c0240a, C0674a c0674a) {
        this.f961a = c0273e;
        this.f962b = c0267a;
        this.f963c = c0240a;
        this.f964d = c0674a;
        this.f965e = c0273e.f987n.f3110b == 3 ? System.nanoTime() : 0;
    }

    /* renamed from: a */
    private static C0316a m775a(C0240a c0240a, C0267a c0267a) {
        if (c0267a.f960d == null) {
            c0267a.f960d = c0240a.m731a(c0267a.f957a);
        }
        return c0267a.f960d;
    }

    /* renamed from: a */
    private static void m776a(C0676a<C0267a> c0676a) {
        boolean z = c0676a.f3002c;
        c0676a.f3002c = true;
        for (int i = 0; i < c0676a.f3001b; i++) {
            String str = ((C0267a) c0676a.m2291a(i)).f957a;
            Class cls = ((C0267a) c0676a.m2291a(i)).f958b;
            int i2 = c0676a.f3001b - 1;
            while (i2 > i) {
                if (cls == ((C0267a) c0676a.m2291a(i2)).f958b && str.equals(((C0267a) c0676a.m2291a(i2)).f957a)) {
                    c0676a.mo527b(i2);
                }
                i2--;
            }
        }
        c0676a.f3002c = z;
    }

    /* renamed from: a */
    public final boolean m777a() {
        this.f972l++;
        if (this.f963c instanceof C0254n) {
            C0254n c0254n = (C0254n) this.f963c;
            if (!this.f967g) {
                this.f967g = true;
                this.f968h = c0254n.mo151a(this.f962b.f957a, C0271d.m775a(this.f963c, this.f962b), this.f962b.f959c);
                if (this.f968h != null) {
                    C0271d.m776a(this.f968h);
                    this.f961a.m796a(this.f962b.f957a, this.f968h);
                }
            }
            this.f971k = c0254n.mo154a(this.f961a, this.f962b.f957a, C0271d.m775a(this.f963c, this.f962b), this.f962b.f959c);
        } else {
            C0241b c0241b = (C0241b) this.f963c;
            if (this.f967g) {
                if (this.f970j == null && !this.f966f) {
                    this.f970j = this.f964d.m2284a(this);
                } else if (this.f966f) {
                    this.f971k = c0241b.mo152a(this.f961a, this.f962b.f957a, C0271d.m775a(this.f963c, this.f962b), this.f962b.f959c);
                } else if (this.f970j.m2286a()) {
                    try {
                        this.f970j.m2287b();
                        this.f971k = c0241b.mo152a(this.f961a, this.f962b.f957a, C0271d.m775a(this.f963c, this.f962b), this.f962b.f959c);
                    } catch (Throwable e) {
                        throw new GdxRuntimeException("Couldn't load asset: " + this.f962b.f957a, e);
                    }
                }
            } else if (this.f969i == null) {
                this.f969i = this.f964d.m2284a(this);
            } else if (this.f969i.m2286a()) {
                try {
                    this.f969i.m2287b();
                    this.f967g = true;
                    if (this.f966f) {
                        this.f971k = c0241b.mo152a(this.f961a, this.f962b.f957a, C0271d.m775a(this.f963c, this.f962b), this.f962b.f959c);
                    }
                } catch (Throwable e2) {
                    throw new GdxRuntimeException("Couldn't load dependencies of asset: " + this.f962b.f957a, e2);
                }
            }
        }
        return this.f971k != null;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo155b() {
        C0241b c0241b = (C0241b) this.f963c;
        if (this.f967g) {
            c0241b.mo153b(this.f962b.f957a, C0271d.m775a(this.f963c, this.f962b), this.f962b.f959c);
        } else {
            this.f968h = c0241b.mo151a(this.f962b.f957a, C0271d.m775a(this.f963c, this.f962b), this.f962b.f959c);
            if (this.f968h != null) {
                C0271d.m776a(this.f968h);
                this.f961a.m796a(this.f962b.f957a, this.f968h);
            } else {
                c0241b.mo153b(this.f962b.f957a, C0271d.m775a(this.f963c, this.f962b), this.f962b.f959c);
                this.f966f = true;
            }
        }
        return null;
    }
}
