package com.badlogic.gdx.scenes.scene2d.p033a;

/* renamed from: com.badlogic.gdx.scenes.scene2d.a.h */
public class C0596h extends C0592e {
    /* renamed from: d */
    int f2596d;
    /* renamed from: f */
    private int f2597f;
    /* renamed from: g */
    private boolean f2598g;

    /* renamed from: b */
    public final void mo461b() {
        super.mo461b();
        this.f2597f = 0;
        this.f2598g = false;
    }

    /* renamed from: b */
    protected final boolean mo467b(float f) {
        if (this.f2597f == this.f2596d) {
            return true;
        }
        if (this.e.mo460a(f)) {
            if (this.f2598g) {
                return true;
            }
            if (this.f2596d > 0) {
                this.f2597f++;
            }
            if (this.f2597f == this.f2596d) {
                return true;
            }
            if (this.e != null) {
                this.e.mo461b();
            }
        }
        return false;
    }
}
