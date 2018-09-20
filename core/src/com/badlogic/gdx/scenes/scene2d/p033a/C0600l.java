package com.badlogic.gdx.scenes.scene2d.p033a;

import com.badlogic.gdx.scenes.scene2d.C0588a;
import com.badlogic.gdx.utils.C0328t;

/* renamed from: com.badlogic.gdx.scenes.scene2d.a.l */
public class C0600l extends C0594f {
    /* renamed from: e */
    private int f2605e;

    /* renamed from: a */
    public final boolean mo460a(float f) {
        if (this.f2605e >= this.d.f3001b) {
            return true;
        }
        C0328t c0328t = this.f2574c;
        this.f2574c = null;
        try {
            if (((C0588a) this.d.m2291a(this.f2605e)).mo460a(f)) {
                if (this.a == null) {
                    return true;
                }
                this.f2605e++;
                if (this.f2605e >= this.d.f3001b) {
                    this.f2574c = c0328t;
                    return true;
                }
            }
            this.f2574c = c0328t;
            return false;
        } finally {
            this.f2574c = c0328t;
        }
    }

    /* renamed from: b */
    public final void mo461b() {
        super.mo461b();
        this.f2605e = 0;
    }
}
