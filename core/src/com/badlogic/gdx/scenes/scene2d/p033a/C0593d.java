package com.badlogic.gdx.scenes.scene2d.p033a;

/* renamed from: com.badlogic.gdx.scenes.scene2d.a.d */
public class C0593d extends C0592e {
    /* renamed from: d */
    public float f2591d;
    /* renamed from: f */
    private float f2592f;

    /* renamed from: b */
    public final void mo461b() {
        super.mo461b();
        this.f2592f = 0.0f;
    }

    /* renamed from: b */
    protected final boolean mo467b(float f) {
        if (this.f2592f < this.f2591d) {
            this.f2592f += f;
            if (this.f2592f < this.f2591d) {
                return false;
            }
            f = this.f2592f - this.f2591d;
        }
        return this.e == null ? true : this.e.mo460a(f);
    }
}
