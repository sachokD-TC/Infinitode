package com.badlogic.gdx.scenes.scene2d;

import com.badlogic.gdx.utils.C0328t;
import com.badlogic.gdx.utils.C0328t.C0449a;

/* renamed from: com.badlogic.gdx.scenes.scene2d.a */
public abstract class C0588a implements C0449a {
    /* renamed from: a */
    public C0602b f2572a;
    /* renamed from: b */
    public C0602b f2573b;
    /* renamed from: c */
    public C0328t f2574c;

    /* renamed from: a */
    public void mo360a() {
        this.f2572a = null;
        this.f2573b = null;
        this.f2574c = null;
        mo461b();
    }

    /* renamed from: a */
    public void mo464a(C0602b c0602b) {
        this.f2572a = c0602b;
        if (this.f2573b == null) {
            mo465b(c0602b);
        }
        if (c0602b == null && this.f2574c != null) {
            this.f2574c.mo363a((Object) this);
            this.f2574c = null;
        }
    }

    /* renamed from: a */
    public abstract boolean mo460a(float f);

    /* renamed from: b */
    public void mo461b() {
    }

    /* renamed from: b */
    public void mo465b(C0602b c0602b) {
        this.f2573b = c0602b;
    }

    public String toString() {
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf != -1) {
            name = name.substring(lastIndexOf + 1);
        }
        return name.endsWith("Action") ? name.substring(0, name.length() - 6) : name;
    }
}
