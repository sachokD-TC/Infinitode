package com.badlogic.gdx.scenes.scene2d.p033a;

import com.badlogic.gdx.scenes.scene2d.C0588a;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.utils.C0328t;

/* renamed from: com.badlogic.gdx.scenes.scene2d.a.e */
public abstract class C0592e extends C0588a {
    /* renamed from: e */
    protected C0588a f2590e;

    /* renamed from: a */
    public final void mo360a() {
        super.mo360a();
        this.f2590e = null;
    }

    /* renamed from: a */
    public final void m1905a(C0588a c0588a) {
        this.f2590e = c0588a;
    }

    /* renamed from: a */
    public final void mo464a(C0602b c0602b) {
        if (this.f2590e != null) {
            this.f2590e.mo464a(c0602b);
        }
        super.mo464a(c0602b);
    }

    /* renamed from: a */
    public final boolean mo460a(float f) {
        C0328t c0328t = this.f2574c;
        this.f2574c = null;
        try {
            boolean b = mo467b(f);
            return b;
        } finally {
            this.f2574c = c0328t;
        }
    }

    /* renamed from: b */
    public void mo461b() {
        if (this.f2590e != null) {
            this.f2590e.mo461b();
        }
    }

    /* renamed from: b */
    public final void mo465b(C0602b c0602b) {
        if (this.f2590e != null) {
            this.f2590e.mo465b(c0602b);
        }
        super.mo465b(c0602b);
    }

    /* renamed from: b */
    protected abstract boolean mo467b(float f);

    public String toString() {
        return super.toString() + (this.f2590e == null ? "" : "(" + this.f2590e + ")");
    }
}
