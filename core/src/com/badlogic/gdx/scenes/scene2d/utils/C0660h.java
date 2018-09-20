package com.badlogic.gdx.scenes.scene2d.utils;

import com.badlogic.gdx.graphics.g2d.C0444a;
import com.badlogic.gdx.graphics.g2d.C0452e;
import com.badlogic.gdx.math.C0549f;

/* renamed from: com.badlogic.gdx.scenes.scene2d.utils.h */
public final class C0660h extends C0656b implements C0659l {
    /* renamed from: h */
    public C0452e f2929h;

    public C0660h(C0452e c0452e) {
        m2230a(c0452e);
    }

    public C0660h(C0660h c0660h) {
        super(c0660h);
        m2230a(c0660h.f2929h);
    }

    /* renamed from: a */
    public final void mo514a(C0444a c0444a, float f, float f2, float f3, float f4) {
        C0452e c0452e = this.f2929h;
        c0452e.m1350a(c0444a, f, f2, f3, f4);
        c0444a.mo369a(c0452e.f1853a, c0452e.f1860h, 0, c0452e.f1861i);
    }

    /* renamed from: a */
    public final void mo520a(C0444a c0444a, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        C0452e c0452e = this.f2929h;
        c0452e.m1350a(c0444a, f, f2, f5, f6);
        float f10 = f + f3;
        float f11 = f2 + f4;
        int i = c0452e.f1861i;
        float[] fArr = c0452e.f1860h;
        int i2;
        if (f9 != 0.0f) {
            for (i2 = 0; i2 < i; i2 += 5) {
                float f12 = (fArr[i2] - f10) * f7;
                float f13 = (fArr[i2 + 1] - f11) * f8;
                float d = C0549f.m1771d(f9);
                float c = C0549f.m1769c(f9);
                fArr[i2] = ((d * f12) - (c * f13)) + f10;
                fArr[i2 + 1] = ((f12 * c) + (f13 * d)) + f11;
            }
        } else if (!(f7 == 1.0f && f8 == 1.0f)) {
            for (i2 = 0; i2 < i; i2 += 5) {
                fArr[i2] = ((fArr[i2] - f10) * f7) + f10;
                fArr[i2 + 1] = ((fArr[i2 + 1] - f11) * f8) + f11;
            }
        }
        c0444a.mo369a(c0452e.f1853a, fArr, 0, i);
    }

    /* renamed from: a */
    public final void m2230a(C0452e c0452e) {
        this.f2929h = c0452e;
        this.f2927f = (c0452e.f1854b + c0452e.f1856d) + c0452e.f1855c;
        this.f2928g = (c0452e.f1858f + c0452e.f1857e) + c0452e.f1859g;
        this.f2925d = c0452e.f1864l == -1.0f ? c0452e.f1858f : c0452e.f1864l;
        this.f2924c = c0452e.f1863k == -1.0f ? c0452e.f1855c : c0452e.f1863k;
        this.f2926e = c0452e.f1865m == -1.0f ? c0452e.f1859g : c0452e.f1865m;
        this.f2923b = c0452e.f1862j == -1.0f ? c0452e.f1854b : c0452e.f1862j;
    }
}
