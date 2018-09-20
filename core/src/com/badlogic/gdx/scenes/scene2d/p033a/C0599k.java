package com.badlogic.gdx.scenes.scene2d.p033a;

import com.badlogic.gdx.scenes.scene2d.C0588a;
import com.badlogic.gdx.utils.C0328t;

/* renamed from: com.badlogic.gdx.scenes.scene2d.a.k */
public class C0599k extends C0588a {
    /* renamed from: d */
    public Runnable f2603d;
    /* renamed from: e */
    private boolean f2604e;

    /* renamed from: a */
    public final void mo360a() {
        super.mo360a();
        this.f2603d = null;
    }

    /* renamed from: a */
    public final boolean mo460a(float f) {
        if (!this.f2604e) {
            this.f2604e = true;
            C0328t c0328t = this.f2574c;
            this.f2574c = null;
            try {
                this.f2603d.run();
            } finally {
                this.f2574c = c0328t;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void mo461b() {
        this.f2604e = false;
    }
}
