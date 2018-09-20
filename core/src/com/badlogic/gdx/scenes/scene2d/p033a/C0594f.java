package com.badlogic.gdx.scenes.scene2d.p033a;

import com.badlogic.gdx.scenes.scene2d.C0588a;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.utils.C0328t;
import com.badlogic.gdx.utils.C0676a;

/* renamed from: com.badlogic.gdx.scenes.scene2d.a.f */
public class C0594f extends C0588a {
    /* renamed from: d */
    C0676a<C0588a> f2593d = new C0676a(4);
    /* renamed from: e */
    private boolean f2594e;

    /* renamed from: a */
    public final void mo360a() {
        super.mo360a();
        this.f2593d.mo530d();
    }

    /* renamed from: a */
    public final void m1914a(C0588a c0588a) {
        this.f2593d.m2296a((Object) c0588a);
        if (this.a != null) {
            c0588a.mo464a(this.a);
        }
    }

    /* renamed from: a */
    public final void mo464a(C0602b c0602b) {
        C0676a c0676a = this.f2593d;
        int i = c0676a.f3001b;
        for (int i2 = 0; i2 < i; i2++) {
            ((C0588a) c0676a.m2291a(i2)).mo464a(c0602b);
        }
        super.mo464a(c0602b);
    }

    /* renamed from: a */
    public boolean mo460a(float f) {
        if (this.f2594e) {
            return true;
        }
        this.f2594e = true;
        C0328t c0328t = this.f2574c;
        this.f2574c = null;
        try {
            C0676a c0676a = this.f2593d;
            int i = c0676a.f3001b;
            for (int i2 = 0; i2 < i && this.a != null; i2++) {
                C0588a c0588a = (C0588a) c0676a.m2291a(i2);
                if (!(c0588a.f2572a == null || c0588a.mo460a(f))) {
                    this.f2594e = false;
                }
                if (this.a == null) {
                    return true;
                }
            }
            boolean z = this.f2594e;
            this.f2574c = c0328t;
            return z;
        } finally {
            this.f2574c = c0328t;
        }
    }

    /* renamed from: b */
    public void mo461b() {
        this.f2594e = false;
        C0676a c0676a = this.f2593d;
        int i = c0676a.f3001b;
        for (int i2 = 0; i2 < i; i2++) {
            ((C0588a) c0676a.m2291a(i2)).mo461b();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append(super.toString());
        stringBuilder.append('(');
        C0676a c0676a = this.f2593d;
        int i = c0676a.f3001b;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(c0676a.m2291a(i2));
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
