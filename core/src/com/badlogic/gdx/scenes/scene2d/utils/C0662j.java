package com.badlogic.gdx.scenes.scene2d.utils;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0439k;
import com.badlogic.gdx.graphics.g2d.C0444a;

/* renamed from: com.badlogic.gdx.scenes.scene2d.utils.j */
public final class C0662j extends C0656b implements C0659l {
    /* renamed from: h */
    public C0439k f2933h;

    public C0662j(C0439k c0439k) {
        this.f2933h = c0439k;
        this.f2927f = c0439k.mo385c();
        this.f2928g = c0439k.mo387d();
    }

    /* renamed from: a */
    public final void mo514a(C0444a c0444a, float f, float f2, float f3, float f4) {
        C0430b g = this.f2933h.m1275g();
        float e = c0444a.mo376e();
        this.f2933h.m1255a(c0444a.mo375d().m1221b(g));
        this.f2933h.m1252a(0.0f);
        this.f2933h.m1270d(1.0f, 1.0f);
        this.f2933h.mo382a(f, f2, f3, f4);
        this.f2933h.m1256a(c0444a);
        this.f2933h.m1255a(g);
        c0444a.mo366a(e);
    }

    /* renamed from: a */
    public final void mo520a(C0444a c0444a, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        C0430b g = this.f2933h.m1275g();
        float e = c0444a.mo376e();
        this.f2933h.m1255a(c0444a.mo375d().m1221b(g));
        this.f2933h.mo386c(f3, f4);
        this.f2933h.m1252a(f9);
        this.f2933h.m1270d(f7, f8);
        this.f2933h.mo382a(f, f2, f5, f6);
        this.f2933h.m1256a(c0444a);
        this.f2933h.m1255a(g);
        c0444a.mo366a(e);
    }
}
