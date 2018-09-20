package com.badlogic.gdx.utils.p034b;

import com.badlogic.gdx.graphics.C0427a;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Scaling;

/* renamed from: com.badlogic.gdx.utils.b.a */
public final class C0683a extends C0682c {
    /* renamed from: a */
    private Scaling f3063a;

    public C0683a(Scaling scaling, float f, float f2, C0427a c0427a) {
        this.f3063a = scaling;
        m2377a(f, f2);
        this.f3055b = c0427a;
    }

    /* renamed from: a */
    public final void mo522a(int i, int i2) {
        Vector2 a = this.f3063a.m2282a(this.f3056c, this.f3057d, (float) i, (float) i2);
        int round = Math.round(a.f2337x);
        int round2 = Math.round(a.f2338y);
        m2379a((i - round) / 2, (i2 - round2) / 2, round, round2);
        m2376a();
    }
}
