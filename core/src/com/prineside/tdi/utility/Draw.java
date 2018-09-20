package com.prineside.tdi.utility;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.C0473l;

public class Draw {
    /* renamed from: a */
    private static final float[] f8386a = new float[20];

    /* renamed from: a */
    public static void m8806a(C0473l c0473l, Texture texture, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        float f15 = f9 / 2.0f;
        float f16 = f10 / 2.0f;
        f8386a[0] = (((float) (-Math.sin((double) (f11 - 1.5707964f)))) * f15) + f5;
        f8386a[1] = (((float) Math.cos((double) (f11 - 1.5707964f))) * f15) + f6;
        f8386a[2] = f13;
        f8386a[3] = f3;
        f8386a[4] = f4;
        f8386a[15] = (((float) (-Math.sin((double) (f12 - 1.5707964f)))) * f16) + f7;
        f8386a[16] = (((float) Math.cos((double) (f12 - 1.5707964f))) * f16) + f8;
        f8386a[17] = f14;
        f8386a[18] = f3;
        f8386a[19] = f2;
        f8386a[5] = (((float) (-Math.sin((double) (1.5707964f + f11)))) * f15) + f5;
        f8386a[6] = (f15 * ((float) Math.cos((double) (1.5707964f + f11)))) + f6;
        f8386a[7] = f13;
        f8386a[8] = f;
        f8386a[9] = f4;
        f8386a[10] = (((float) (-Math.sin((double) (1.5707964f + f12)))) * f16) + f7;
        f8386a[11] = (f16 * ((float) Math.cos((double) (1.5707964f + f12)))) + f8;
        f8386a[12] = f14;
        f8386a[13] = f;
        f8386a[14] = f2;
        c0473l.mo369a(texture, f8386a, 0, 20);
    }
}
