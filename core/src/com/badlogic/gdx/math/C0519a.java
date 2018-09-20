package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.C0692k;
import com.badlogic.gdx.utils.C0727y;

/* renamed from: com.badlogic.gdx.math.a */
public final class C0519a {
    /* renamed from: a */
    private final C0727y f2347a = new C0727y();
    /* renamed from: b */
    private short[] f2348b;
    /* renamed from: c */
    private float[] f2349c;
    /* renamed from: d */
    private int f2350d;
    /* renamed from: e */
    private final C0692k f2351e = new C0692k();
    /* renamed from: f */
    private final C0727y f2352f = new C0727y();

    /* renamed from: a */
    private static int m1718a(float f, float f2, float f3, float f4, float f5, float f6) {
        return (int) Math.signum((((f6 - f4) * f) + ((f2 - f6) * f3)) + ((f4 - f2) * f5));
    }

    /* renamed from: a */
    private int m1719a(int i) {
        short[] sArr = this.f2348b;
        int i2 = sArr[m1720b(i)] * 2;
        int i3 = sArr[i] * 2;
        int i4 = sArr[m1721c(i)] * 2;
        float[] fArr = this.f2349c;
        return C0519a.m1718a(fArr[i2], fArr[i2 + 1], fArr[i3], fArr[i3 + 1], fArr[i4], fArr[i4 + 1]);
    }

    /* renamed from: b */
    private int m1720b(int i) {
        if (i == 0) {
            i = this.f2350d;
        }
        return i - 1;
    }

    /* renamed from: c */
    private int m1721c(int i) {
        return (i + 1) % this.f2350d;
    }

    /* renamed from: a */
    public final C0727y m1722a(float[] fArr, int i) {
        float f;
        int i2;
        int i3;
        float f2;
        float f3;
        Object obj;
        int i4;
        C0692k c0692k;
        C0727y c0727y;
        int[] iArr;
        int i5;
        int i6;
        int[] iArr2;
        int b;
        short[] sArr;
        int i7;
        float[] fArr2;
        int c;
        int[] iArr3;
        short[] sArr2;
        C0727y c0727y2;
        Object obj2;
        this.f2349c = fArr;
        int i8 = i / 2;
        this.f2350d = i8;
        C0727y c0727y3 = this.f2347a;
        c0727y3.f3238b = 0;
        c0727y3.m2529a(i8);
        c0727y3.f3238b = i8;
        short[] sArr3 = c0727y3.f3237a;
        this.f2348b = sArr3;
        if (i > 2) {
            f = 0.0f;
            i2 = (i + 0) - 3;
            for (i3 = 0; i3 < i2; i3 += 2) {
                f += (fArr[i3] * fArr[i3 + 3]) - (fArr[i3 + 1] * fArr[i3 + 2]);
            }
            f2 = fArr[(i + 0) - 2];
            f3 = fArr[(i + 0) - 1];
            if (((f2 * fArr[1]) + f) - (fArr[0] * f3) < 0.0f) {
                obj = 1;
                if (obj == null) {
                    for (i3 = 0; i3 < i8; i3 = (short) (i3 + 1)) {
                        sArr3[i3] = (short) (i3 + 0);
                    }
                } else {
                    i4 = i8 - 1;
                    for (i3 = 0; i3 < i8; i3++) {
                        sArr3[i3] = (short) ((i4 + 0) - i3);
                    }
                }
                c0692k = this.f2351e;
                c0692k.f3091b = 0;
                c0692k.m2421c(i8);
                for (i3 = 0; i3 < i8; i3++) {
                    c0692k.m2418a(m1719a(i3));
                }
                c0727y = this.f2352f;
                c0727y.f3238b = 0;
                c0727y.m2529a(Math.max(0, i8 - 2) * 3);
                iArr = this.f2351e.f3090a;
                while (this.f2350d > 3) {
                    i5 = this.f2350d;
                    for (i6 = 0; i6 < i5; i6++) {
                        iArr2 = this.f2351e.f3090a;
                        if (iArr2[i6] != -1) {
                            obj = null;
                        } else {
                            b = m1720b(i6);
                            i2 = m1721c(i6);
                            sArr = this.f2348b;
                            i3 = sArr[b] * 2;
                            i4 = sArr[i6] * 2;
                            i7 = sArr[i2] * 2;
                            fArr2 = this.f2349c;
                            float f4 = fArr2[i3];
                            float f5 = fArr2[i3 + 1];
                            float f6 = fArr2[i4];
                            float f7 = fArr2[i4 + 1];
                            f2 = fArr2[i7];
                            f = fArr2[i7 + 1];
                            c = m1721c(i2);
                            while (c != b) {
                                if (iArr2[c] != 1) {
                                    i7 = sArr[c] * 2;
                                    f3 = fArr2[i7];
                                    float f8 = fArr2[i7 + 1];
                                    if (C0519a.m1718a(f2, f, f4, f5, f3, f8) >= 0 && C0519a.m1718a(f4, f5, f6, f7, f3, f8) >= 0 && C0519a.m1718a(f6, f7, f2, f, f3, f8) >= 0) {
                                        obj = null;
                                        break;
                                    }
                                }
                                c = m1721c(c);
                            }
                            obj = 1;
                        }
                        if (obj != null) {
                            i3 = i6;
                            break;
                        }
                    }
                    iArr3 = this.f2351e.f3090a;
                    i3 = 0;
                    while (i3 < i5) {
                        if (iArr3[i3] == -1) {
                            break;
                        }
                        i3++;
                    }
                    i3 = 0;
                    sArr2 = this.f2348b;
                    C0727y c0727y4 = this.f2352f;
                    c0727y4.m2528a(sArr2[m1720b(i3)]);
                    c0727y4.m2528a(sArr2[i3]);
                    c0727y4.m2528a(sArr2[m1721c(i3)]);
                    c0727y2 = this.f2347a;
                    if (i3 < c0727y2.f3238b) {
                        throw new IndexOutOfBoundsException("index can't be >= size: " + i3 + " >= " + c0727y2.f3238b);
                    }
                    obj2 = c0727y2.f3237a;
                    c0727y2.f3238b--;
                    if (c0727y2.f3239c) {
                        obj2[i3] = obj2[c0727y2.f3238b];
                    } else {
                        System.arraycopy(obj2, i3 + 1, obj2, i3, c0727y2.f3238b - i3);
                    }
                    c0692k = this.f2351e;
                    if (i3 < c0692k.f3091b) {
                        throw new IndexOutOfBoundsException("index can't be >= size: " + i3 + " >= " + c0692k.f3091b);
                    }
                    obj2 = c0692k.f3090a;
                    c0692k.f3091b--;
                    if (c0692k.f3092c) {
                        obj2[i3] = obj2[c0692k.f3091b];
                    } else {
                        System.arraycopy(obj2, i3 + 1, obj2, i3, c0692k.f3091b - i3);
                    }
                    this.f2350d--;
                    i4 = m1720b(i3);
                    if (i3 == this.f2350d) {
                        i3 = 0;
                    }
                    iArr[i4] = m1719a(i4);
                    iArr[i3] = m1719a(i3);
                }
                if (this.f2350d == 3) {
                    c0727y3 = this.f2352f;
                    sArr2 = this.f2348b;
                    c0727y3.m2528a(sArr2[0]);
                    c0727y3.m2528a(sArr2[1]);
                    c0727y3.m2528a(sArr2[2]);
                }
                return c0727y;
            }
        }
        obj = null;
        if (obj == null) {
            i4 = i8 - 1;
            for (i3 = 0; i3 < i8; i3++) {
                sArr3[i3] = (short) ((i4 + 0) - i3);
            }
        } else {
            for (i3 = 0; i3 < i8; i3 = (short) (i3 + 1)) {
                sArr3[i3] = (short) (i3 + 0);
            }
        }
        c0692k = this.f2351e;
        c0692k.f3091b = 0;
        c0692k.m2421c(i8);
        for (i3 = 0; i3 < i8; i3++) {
            c0692k.m2418a(m1719a(i3));
        }
        c0727y = this.f2352f;
        c0727y.f3238b = 0;
        c0727y.m2529a(Math.max(0, i8 - 2) * 3);
        iArr = this.f2351e.f3090a;
        while (this.f2350d > 3) {
            i5 = this.f2350d;
            for (i6 = 0; i6 < i5; i6++) {
                iArr2 = this.f2351e.f3090a;
                if (iArr2[i6] != -1) {
                    b = m1720b(i6);
                    i2 = m1721c(i6);
                    sArr = this.f2348b;
                    i3 = sArr[b] * 2;
                    i4 = sArr[i6] * 2;
                    i7 = sArr[i2] * 2;
                    fArr2 = this.f2349c;
                    float f42 = fArr2[i3];
                    float f52 = fArr2[i3 + 1];
                    float f62 = fArr2[i4];
                    float f72 = fArr2[i4 + 1];
                    f2 = fArr2[i7];
                    f = fArr2[i7 + 1];
                    c = m1721c(i2);
                    while (c != b) {
                        if (iArr2[c] != 1) {
                            i7 = sArr[c] * 2;
                            f3 = fArr2[i7];
                            float f82 = fArr2[i7 + 1];
                            obj = null;
                            break;
                        }
                        c = m1721c(c);
                    }
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    i3 = i6;
                    break;
                }
            }
            iArr3 = this.f2351e.f3090a;
            i3 = 0;
            while (i3 < i5) {
                if (iArr3[i3] == -1) {
                    break;
                }
                i3++;
            }
            i3 = 0;
            sArr2 = this.f2348b;
            C0727y c0727y42 = this.f2352f;
            c0727y42.m2528a(sArr2[m1720b(i3)]);
            c0727y42.m2528a(sArr2[i3]);
            c0727y42.m2528a(sArr2[m1721c(i3)]);
            c0727y2 = this.f2347a;
            if (i3 < c0727y2.f3238b) {
                obj2 = c0727y2.f3237a;
                c0727y2.f3238b--;
                if (c0727y2.f3239c) {
                    obj2[i3] = obj2[c0727y2.f3238b];
                } else {
                    System.arraycopy(obj2, i3 + 1, obj2, i3, c0727y2.f3238b - i3);
                }
                c0692k = this.f2351e;
                if (i3 < c0692k.f3091b) {
                    obj2 = c0692k.f3090a;
                    c0692k.f3091b--;
                    if (c0692k.f3092c) {
                        obj2[i3] = obj2[c0692k.f3091b];
                    } else {
                        System.arraycopy(obj2, i3 + 1, obj2, i3, c0692k.f3091b - i3);
                    }
                    this.f2350d--;
                    i4 = m1720b(i3);
                    if (i3 == this.f2350d) {
                        i3 = 0;
                    }
                    iArr[i4] = m1719a(i4);
                    iArr[i3] = m1719a(i3);
                } else {
                    throw new IndexOutOfBoundsException("index can't be >= size: " + i3 + " >= " + c0692k.f3091b);
                }
            }
            throw new IndexOutOfBoundsException("index can't be >= size: " + i3 + " >= " + c0727y2.f3238b);
        }
        if (this.f2350d == 3) {
            c0727y3 = this.f2352f;
            sArr2 = this.f2348b;
            c0727y3.m2528a(sArr2[0]);
            c0727y3.m2528a(sArr2[1]);
            c0727y3.m2528a(sArr2[2]);
        }
        return c0727y;
    }
}
