package com.badlogic.gdx.utils;

import com.badlogic.gdx.math.Vector2;

public enum Scaling {
    fit,
    fill,
    fillX,
    fillY,
    stretch,
    stretchX,
    stretchY,
    none;
    
    /* renamed from: i */
    private static final Vector2 f2985i = null;

    static {
        f2985i = new Vector2();
    }

    /* renamed from: a */
    public final Vector2 m2282a(float f, float f2, float f3, float f4) {
        float f5;
        switch (this) {
            case fit:
                f5 = f4 / f3 > f2 / f ? f3 / f : f4 / f2;
                f2985i.f2337x = f * f5;
                f2985i.f2338y = f5 * f2;
                break;
            case fill:
                f5 = f4 / f3 < f2 / f ? f3 / f : f4 / f2;
                f2985i.f2337x = f * f5;
                f2985i.f2338y = f5 * f2;
                break;
            case fillX:
                f5 = f3 / f;
                f2985i.f2337x = f * f5;
                f2985i.f2338y = f5 * f2;
                break;
            case fillY:
                f5 = f4 / f2;
                f2985i.f2337x = f * f5;
                f2985i.f2338y = f5 * f2;
                break;
            case stretch:
                f2985i.f2337x = f3;
                f2985i.f2338y = f4;
                break;
            case stretchX:
                f2985i.f2337x = f3;
                f2985i.f2338y = f2;
                break;
            case stretchY:
                f2985i.f2337x = f;
                f2985i.f2338y = f4;
                break;
            case none:
                f2985i.f2337x = f;
                f2985i.f2338y = f2;
                break;
        }
        return f2985i;
    }
}
