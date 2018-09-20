package com.badlogic.gdx.graphics.g2d;

/* renamed from: com.badlogic.gdx.graphics.g2d.i */
public class C0470i {
    /* renamed from: a */
    final float[] f2010a;
    /* renamed from: b */
    final float[] f2011b;
    /* renamed from: c */
    final short[] f2012c;
    /* renamed from: d */
    final C0438n f2013d;

    public C0470i(C0438n c0438n, float[] fArr, short[] sArr) {
        this.f2013d = c0438n;
        this.f2011b = fArr;
        this.f2012c = sArr;
        float[] fArr2 = new float[fArr.length];
        this.f2010a = fArr2;
        float f = c0438n.f1680A;
        float f2 = c0438n.f1681B;
        float f3 = c0438n.f1682C - f;
        float f4 = c0438n.f1683D - f2;
        int i = c0438n.f1684E;
        int i2 = c0438n.f1685F;
        int i3 = 0;
        int length = fArr.length;
        while (i3 < length) {
            fArr2[i3] = ((fArr[i3] / ((float) i)) * f3) + f;
            i3++;
            fArr2[i3] = ((1.0f - (fArr[i3] / ((float) i2))) * f4) + f2;
            i3++;
        }
    }
}
