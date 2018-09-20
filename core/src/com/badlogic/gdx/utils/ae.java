package com.badlogic.gdx.utils;

import java.util.Comparator;

final class ae<T> {
    /* renamed from: a */
    T[] f3012a;
    /* renamed from: b */
    Comparator<? super T> f3013b;
    /* renamed from: c */
    T[] f3014c = new Object[256];
    /* renamed from: d */
    int f3015d;
    /* renamed from: e */
    int f3016e = 0;
    /* renamed from: f */
    final int[] f3017f = new int[40];
    /* renamed from: g */
    final int[] f3018g = new int[40];
    /* renamed from: h */
    private int f3019h = 7;

    ae() {
    }

    /* renamed from: a */
    static int m2329a(int i) {
        int i2 = 0;
        while (i >= 32) {
            i2 |= i & 1;
            i >>= 1;
        }
        return i2 + i;
    }

    /* renamed from: a */
    private static <T> int m2330a(T t, T[] tArr, int i, int i2, int i3, Comparator<? super T> comparator) {
        int i4;
        int i5 = 0;
        int i6 = 1;
        int i7;
        if (comparator.compare(t, tArr[i + i3]) > 0) {
            i4 = i2 - i3;
            while (i6 < i4 && comparator.compare(t, tArr[(i + i3) + i6]) > 0) {
                i5 = (i6 << 1) + 1;
                if (i5 <= 0) {
                    i5 = i6;
                    i6 = i4;
                } else {
                    i7 = i5;
                    i5 = i6;
                    i6 = i7;
                }
            }
            if (i6 <= i4) {
                i4 = i6;
            }
            i6 = i5 + i3;
            i4 += i3;
        } else {
            i4 = i3 + 1;
            while (i6 < i4 && comparator.compare(t, tArr[(i + i3) - i6]) <= 0) {
                i5 = (i6 << 1) + 1;
                if (i5 <= 0) {
                    i5 = i6;
                    i6 = i4;
                } else {
                    i7 = i5;
                    i5 = i6;
                    i6 = i7;
                }
            }
            if (i6 <= i4) {
                i4 = i6;
            }
            i6 = i3 - i4;
            i4 = i3 - i5;
        }
        i5 = i6 + 1;
        while (i5 < i4) {
            i6 = ((i4 - i5) >>> 1) + i5;
            if (comparator.compare(t, tArr[i + i6]) > 0) {
                i5 = i6 + 1;
            } else {
                i4 = i6;
            }
        }
        return i4;
    }

    /* renamed from: a */
    static <T> int m2331a(T[] tArr, int i, int i2, Comparator<? super T> comparator) {
        int i3 = i + 1;
        if (i3 == i2) {
            return 1;
        }
        int i4 = i3 + 1;
        if (comparator.compare(tArr[i3], tArr[i]) < 0) {
            while (i4 < i2 && comparator.compare(tArr[i4], tArr[i4 - 1]) < 0) {
                i4++;
            }
            i3 = i4 - 1;
            int i5 = i;
            while (i5 < i3) {
                T t = tArr[i5];
                int i6 = i5 + 1;
                tArr[i5] = tArr[i3];
                i5 = i3 - 1;
                tArr[i3] = t;
                i3 = i5;
                i5 = i6;
            }
        } else {
            while (i4 < i2 && comparator.compare(tArr[i4], tArr[i4 - 1]) >= 0) {
                i4++;
            }
        }
        return i4 - i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m2332a(int r20, int r21, int r22, int r23) {
        /*
        r19 = this;
        r0 = r19;
        r3 = r0.f3012a;
        r0 = r19;
        r1 = r23;
        r9 = r0.m2336c(r1);
        r2 = 0;
        r0 = r22;
        r1 = r23;
        java.lang.System.arraycopy(r3, r0, r9, r2, r1);
        r2 = r20 + r21;
        r2 = r2 + -1;
        r4 = r23 + -1;
        r5 = r22 + r23;
        r7 = r5 + -1;
        r6 = r7 + -1;
        r5 = r2 + -1;
        r2 = r3[r2];
        r3[r7] = r2;
        r8 = r21 + -1;
        if (r8 != 0) goto L_0x0035;
    L_0x002a:
        r2 = 0;
        r4 = r23 + -1;
        r4 = r6 - r4;
        r0 = r23;
        java.lang.System.arraycopy(r9, r2, r3, r4, r0);
    L_0x0034:
        return;
    L_0x0035:
        r2 = 1;
        r0 = r23;
        if (r0 != r2) goto L_0x0049;
    L_0x003a:
        r2 = r6 - r8;
        r5 = r5 - r8;
        r5 = r5 + 1;
        r6 = r2 + 1;
        java.lang.System.arraycopy(r3, r5, r3, r6, r8);
        r4 = r9[r4];
        r3[r2] = r4;
        goto L_0x0034;
    L_0x0049:
        r0 = r19;
        r7 = r0.f3013b;
        r0 = r19;
        r2 = r0.f3019h;
    L_0x0051:
        r11 = 0;
        r10 = 0;
        r17 = r10;
        r10 = r6;
        r6 = r4;
        r4 = r17;
        r18 = r5;
        r5 = r11;
        r11 = r8;
        r8 = r18;
    L_0x005f:
        r12 = r9[r6];
        r13 = r3[r8];
        r12 = r7.compare(r12, r13);
        if (r12 >= 0) goto L_0x0097;
    L_0x0069:
        r12 = r10 + -1;
        r4 = r8 + -1;
        r8 = r3[r8];
        r3[r10] = r8;
        r8 = r5 + 1;
        r5 = 0;
        r15 = r11 + -1;
        if (r15 != 0) goto L_0x016a;
    L_0x0078:
        r8 = r4;
        r5 = r12;
        r4 = r6;
    L_0x007b:
        if (r2 > 0) goto L_0x007e;
    L_0x007d:
        r2 = 1;
    L_0x007e:
        r0 = r19;
        r0.f3019h = r2;
        r2 = 1;
        r0 = r23;
        if (r0 != r2) goto L_0x012d;
    L_0x0087:
        r2 = r5 - r15;
        r5 = r8 - r15;
        r5 = r5 + 1;
        r6 = r2 + 1;
        java.lang.System.arraycopy(r3, r5, r3, r6, r15);
        r4 = r9[r4];
        r3[r2] = r4;
        goto L_0x0034;
    L_0x0097:
        r12 = r10 + -1;
        r5 = r6 + -1;
        r6 = r9[r6];
        r3[r10] = r6;
        r4 = r4 + 1;
        r6 = 0;
        r23 = r23 + -1;
        r10 = 1;
        r0 = r23;
        if (r0 == r10) goto L_0x0165;
    L_0x00a9:
        r10 = r12;
        r17 = r5;
        r5 = r6;
        r6 = r17;
    L_0x00af:
        r12 = r5 | r4;
        if (r12 < r2) goto L_0x005f;
    L_0x00b3:
        r14 = r2;
        r5 = r11;
        r11 = r10;
        r10 = r8;
        r8 = r6;
    L_0x00b8:
        r2 = r9[r8];
        r6 = r5 + -1;
        r4 = r20;
        r2 = m2334b(r2, r3, r4, r5, r6, r7);
        r16 = r5 - r2;
        if (r16 == 0) goto L_0x00d7;
    L_0x00c6:
        r11 = r11 - r16;
        r10 = r10 - r16;
        r5 = r5 - r16;
        r2 = r10 + 1;
        r4 = r11 + 1;
        r0 = r16;
        java.lang.System.arraycopy(r3, r2, r3, r4, r0);
        if (r5 == 0) goto L_0x015e;
    L_0x00d7:
        r2 = r10;
        r15 = r5;
        r5 = r11 + -1;
        r4 = r8 + -1;
        r6 = r9[r8];
        r3[r11] = r6;
        r11 = r23 + -1;
        r6 = 1;
        if (r11 == r6) goto L_0x0158;
    L_0x00e6:
        r8 = r3[r2];
        r10 = 0;
        r12 = r11 + -1;
        r13 = r7;
        r6 = m2330a(r8, r9, r10, r11, r12, r13);
        r12 = r11 - r6;
        if (r12 == 0) goto L_0x0154;
    L_0x00f4:
        r5 = r5 - r12;
        r4 = r4 - r12;
        r23 = r11 - r12;
        r6 = r4 + 1;
        r8 = r5 + 1;
        java.lang.System.arraycopy(r9, r6, r3, r8, r12);
        r6 = 1;
        r0 = r23;
        if (r0 <= r6) goto L_0x0150;
    L_0x0104:
        r8 = r5;
    L_0x0105:
        r6 = r8 + -1;
        r5 = r2 + -1;
        r2 = r3[r2];
        r3[r8] = r2;
        r8 = r15 + -1;
        if (r8 == 0) goto L_0x014a;
    L_0x0111:
        r2 = r14 + -1;
        r10 = 7;
        r0 = r16;
        if (r0 < r10) goto L_0x0128;
    L_0x0118:
        r10 = 1;
        r11 = r10;
    L_0x011a:
        r10 = 7;
        if (r12 < r10) goto L_0x012b;
    L_0x011d:
        r10 = 1;
    L_0x011e:
        r10 = r10 | r11;
        if (r10 != 0) goto L_0x0143;
    L_0x0121:
        if (r2 >= 0) goto L_0x0124;
    L_0x0123:
        r2 = 0;
    L_0x0124:
        r2 = r2 + 2;
        goto L_0x0051;
    L_0x0128:
        r10 = 0;
        r11 = r10;
        goto L_0x011a;
    L_0x012b:
        r10 = 0;
        goto L_0x011e;
    L_0x012d:
        if (r23 != 0) goto L_0x0137;
    L_0x012f:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "Comparison method violates its general contract!";
        r2.<init>(r3);
        throw r2;
    L_0x0137:
        r2 = 0;
        r4 = r23 + -1;
        r4 = r5 - r4;
        r0 = r23;
        java.lang.System.arraycopy(r9, r2, r3, r4, r0);
        goto L_0x0034;
    L_0x0143:
        r14 = r2;
        r10 = r5;
        r11 = r6;
        r5 = r8;
        r8 = r4;
        goto L_0x00b8;
    L_0x014a:
        r2 = r14;
        r15 = r8;
        r8 = r5;
        r5 = r6;
        goto L_0x007b;
    L_0x0150:
        r8 = r2;
        r2 = r14;
        goto L_0x007b;
    L_0x0154:
        r23 = r11;
        r8 = r5;
        goto L_0x0105;
    L_0x0158:
        r8 = r2;
        r23 = r11;
        r2 = r14;
        goto L_0x007b;
    L_0x015e:
        r2 = r14;
        r4 = r8;
        r15 = r5;
        r5 = r11;
        r8 = r10;
        goto L_0x007b;
    L_0x0165:
        r4 = r5;
        r15 = r11;
        r5 = r12;
        goto L_0x007b;
    L_0x016a:
        r10 = r12;
        r11 = r15;
        r17 = r4;
        r4 = r5;
        r5 = r8;
        r8 = r17;
        goto L_0x00af;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.ae.a(int, int, int, int):void");
    }

    /* renamed from: a */
    static <T> void m2333a(T[] tArr, int i, int i2, int i3, Comparator<? super T> comparator) {
        int i4 = i3 == i ? i3 + 1 : i3;
        while (i4 < i2) {
            Object obj = tArr[i4];
            int i5 = i4;
            int i6 = i;
            while (i6 < i5) {
                int i7 = (i6 + i5) >>> 1;
                if (comparator.compare(obj, tArr[i7]) < 0) {
                    i5 = i7;
                } else {
                    i6 = i7 + 1;
                }
            }
            i5 = i4 - i6;
            switch (i5) {
                case 1:
                    break;
                case 2:
                    tArr[i6 + 2] = tArr[i6 + 1];
                    break;
                default:
                    System.arraycopy(tArr, i6, tArr, i6 + 1, i5);
                    continue;
            }
            tArr[i6 + 1] = tArr[i6];
            tArr[i6] = obj;
            i4++;
        }
    }

    /* renamed from: b */
    private static <T> int m2334b(T t, T[] tArr, int i, int i2, int i3, Comparator<? super T> comparator) {
        int i4;
        int i5;
        int i6;
        int i7;
        if (comparator.compare(t, tArr[i + i3]) < 0) {
            i4 = i3 + 1;
            i5 = 1;
            i6 = 0;
            while (i5 < i4 && comparator.compare(t, tArr[(i + i3) - i5]) < 0) {
                i6 = (i5 << 1) + 1;
                if (i6 <= 0) {
                    i6 = i5;
                    i5 = i4;
                } else {
                    i7 = i5;
                    i5 = i6;
                    i6 = i7;
                }
            }
            if (i5 <= i4) {
                i4 = i5;
            }
            i4 = i3 - i4;
            i5 = i3 - i6;
        } else {
            i4 = i2 - i3;
            i5 = 1;
            i6 = 0;
            while (i5 < i4 && comparator.compare(t, tArr[(i + i3) + i5]) >= 0) {
                i6 = (i5 << 1) + 1;
                if (i6 <= 0) {
                    i6 = i5;
                    i5 = i4;
                } else {
                    i7 = i5;
                    i5 = i6;
                    i6 = i7;
                }
            }
            if (i5 <= i4) {
                i4 = i5;
            }
            i5 = i4 + i3;
            i4 = i6 + i3;
        }
        i4++;
        while (i4 < i5) {
            i6 = ((i5 - i4) >>> 1) + i4;
            if (comparator.compare(t, tArr[i + i6]) < 0) {
                i5 = i6;
            } else {
                i4 = i6 + 1;
            }
        }
        return i5;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private void m2335b(int r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r0.f3017f;
        r3 = r1[r18];
        r0 = r17;
        r1 = r0.f3018g;
        r4 = r1[r18];
        r0 = r17;
        r1 = r0.f3017f;
        r2 = r18 + 1;
        r10 = r1[r2];
        r0 = r17;
        r1 = r0.f3018g;
        r2 = r18 + 1;
        r8 = r1[r2];
        r0 = r17;
        r1 = r0.f3018g;
        r2 = r4 + r8;
        r1[r18] = r2;
        r0 = r17;
        r1 = r0.f3016e;
        r1 = r1 + -3;
        r0 = r18;
        if (r0 != r1) goto L_0x004e;
    L_0x002e:
        r0 = r17;
        r1 = r0.f3017f;
        r2 = r18 + 1;
        r0 = r17;
        r5 = r0.f3017f;
        r6 = r18 + 2;
        r5 = r5[r6];
        r1[r2] = r5;
        r0 = r17;
        r1 = r0.f3018g;
        r2 = r18 + 1;
        r0 = r17;
        r5 = r0.f3018g;
        r6 = r18 + 2;
        r5 = r5[r6];
        r1[r2] = r5;
    L_0x004e:
        r0 = r17;
        r1 = r0.f3016e;
        r1 = r1 + -1;
        r0 = r17;
        r0.f3016e = r1;
        r0 = r17;
        r1 = r0.f3012a;
        r1 = r1[r10];
        r0 = r17;
        r2 = r0.f3012a;
        r5 = 0;
        r0 = r17;
        r6 = r0.f3013b;
        r1 = m2334b(r1, r2, r3, r4, r5, r6);
        r11 = r3 + r1;
        r7 = r4 - r1;
        if (r7 != 0) goto L_0x0072;
    L_0x0071:
        return;
    L_0x0072:
        r0 = r17;
        r1 = r0.f3012a;
        r2 = r11 + r7;
        r2 = r2 + -1;
        r1 = r1[r2];
        r0 = r17;
        r2 = r0.f3012a;
        r5 = r8 + -1;
        r0 = r17;
        r6 = r0.f3013b;
        r3 = r10;
        r4 = r8;
        r1 = m2330a(r1, r2, r3, r4, r5, r6);
        if (r1 == 0) goto L_0x0071;
    L_0x008e:
        if (r7 > r1) goto L_0x018f;
    L_0x0090:
        r0 = r17;
        r8 = r0.f3012a;
        r0 = r17;
        r2 = r0.m2336c(r7);
        r3 = 0;
        java.lang.System.arraycopy(r8, r11, r2, r3, r7);
        r3 = 0;
        r9 = r11 + 1;
        r5 = r10 + 1;
        r4 = r8[r10];
        r8[r11] = r4;
        r4 = r1 + -1;
        if (r4 != 0) goto L_0x00b0;
    L_0x00ab:
        r1 = 0;
        java.lang.System.arraycopy(r2, r1, r8, r9, r7);
        goto L_0x0071;
    L_0x00b0:
        r1 = 1;
        if (r7 != r1) goto L_0x00be;
    L_0x00b3:
        java.lang.System.arraycopy(r8, r5, r8, r9, r4);
        r1 = r9 + r4;
        r3 = 0;
        r2 = r2[r3];
        r8[r1] = r2;
        goto L_0x0071;
    L_0x00be:
        r0 = r17;
        r6 = r0.f3013b;
        r0 = r17;
        r1 = r0.f3019h;
    L_0x00c6:
        r11 = 0;
        r10 = 0;
        r16 = r10;
        r10 = r7;
        r7 = r4;
        r4 = r11;
        r11 = r9;
        r9 = r5;
        r5 = r3;
        r3 = r16;
    L_0x00d2:
        r12 = r8[r9];
        r13 = r2[r5];
        r12 = r6.compare(r12, r13);
        if (r12 >= 0) goto L_0x0104;
    L_0x00dc:
        r12 = r11 + 1;
        r4 = r9 + 1;
        r9 = r8[r9];
        r8[r11] = r9;
        r3 = r3 + 1;
        r9 = 0;
        r7 = r7 + -1;
        if (r7 != 0) goto L_0x01bf;
    L_0x00eb:
        r3 = r5;
        r9 = r4;
        r14 = r10;
        r11 = r12;
    L_0x00ef:
        if (r1 > 0) goto L_0x00f2;
    L_0x00f1:
        r1 = 1;
    L_0x00f2:
        r0 = r17;
        r0.f3019h = r1;
        r1 = 1;
        if (r14 != r1) goto L_0x0180;
    L_0x00f9:
        java.lang.System.arraycopy(r8, r9, r8, r11, r7);
        r1 = r11 + r7;
        r2 = r2[r3];
        r8[r1] = r2;
        goto L_0x0071;
    L_0x0104:
        r12 = r11 + 1;
        r3 = r5 + 1;
        r5 = r2[r5];
        r8[r11] = r5;
        r5 = r4 + 1;
        r4 = 0;
        r14 = r10 + -1;
        r10 = 1;
        if (r14 == r10) goto L_0x01bc;
    L_0x0114:
        r10 = r14;
        r11 = r12;
        r16 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r16;
    L_0x011c:
        r12 = r4 | r3;
        if (r12 < r1) goto L_0x00d2;
    L_0x0120:
        r13 = r1;
        r3 = r5;
        r4 = r10;
        r10 = r9;
    L_0x0124:
        r1 = r8[r10];
        r5 = 0;
        r15 = m2334b(r1, r2, r3, r4, r5, r6);
        if (r15 == 0) goto L_0x0136;
    L_0x012d:
        java.lang.System.arraycopy(r2, r3, r8, r11, r15);
        r11 = r11 + r15;
        r3 = r3 + r15;
        r4 = r4 - r15;
        r1 = 1;
        if (r4 <= r1) goto L_0x01b7;
    L_0x0136:
        r1 = r3;
        r14 = r4;
        r3 = r11 + 1;
        r9 = r10 + 1;
        r4 = r8[r10];
        r8[r11] = r4;
        r10 = r7 + -1;
        if (r10 == 0) goto L_0x01b1;
    L_0x0144:
        r7 = r2[r1];
        r11 = 0;
        r12 = r6;
        r12 = m2330a(r7, r8, r9, r10, r11, r12);
        if (r12 == 0) goto L_0x01ad;
    L_0x014e:
        java.lang.System.arraycopy(r8, r9, r8, r3, r12);
        r3 = r3 + r12;
        r5 = r9 + r12;
        r4 = r10 - r12;
        if (r4 == 0) goto L_0x01a6;
    L_0x0158:
        r7 = r3;
    L_0x0159:
        r9 = r7 + 1;
        r3 = r1 + 1;
        r1 = r2[r1];
        r8[r7] = r1;
        r7 = r14 + -1;
        r1 = 1;
        if (r7 == r1) goto L_0x019f;
    L_0x0166:
        r1 = r13 + -1;
        r10 = 7;
        if (r15 < r10) goto L_0x017b;
    L_0x016b:
        r10 = 1;
        r11 = r10;
    L_0x016d:
        r10 = 7;
        if (r12 < r10) goto L_0x017e;
    L_0x0170:
        r10 = 1;
    L_0x0171:
        r10 = r10 | r11;
        if (r10 != 0) goto L_0x0196;
    L_0x0174:
        if (r1 >= 0) goto L_0x0177;
    L_0x0176:
        r1 = 0;
    L_0x0177:
        r1 = r1 + 2;
        goto L_0x00c6;
    L_0x017b:
        r10 = 0;
        r11 = r10;
        goto L_0x016d;
    L_0x017e:
        r10 = 0;
        goto L_0x0171;
    L_0x0180:
        if (r14 != 0) goto L_0x018a;
    L_0x0182:
        r1 = new java.lang.IllegalArgumentException;
        r2 = "Comparison method violates its general contract!";
        r1.<init>(r2);
        throw r1;
    L_0x018a:
        java.lang.System.arraycopy(r2, r3, r8, r11, r14);
        goto L_0x0071;
    L_0x018f:
        r0 = r17;
        r0.m2332a(r11, r7, r10, r1);
        goto L_0x0071;
    L_0x0196:
        r13 = r1;
        r10 = r5;
        r11 = r9;
        r16 = r7;
        r7 = r4;
        r4 = r16;
        goto L_0x0124;
    L_0x019f:
        r1 = r13;
        r14 = r7;
        r11 = r9;
        r7 = r4;
        r9 = r5;
        goto L_0x00ef;
    L_0x01a6:
        r7 = r4;
        r9 = r5;
        r11 = r3;
        r3 = r1;
        r1 = r13;
        goto L_0x00ef;
    L_0x01ad:
        r4 = r10;
        r5 = r9;
        r7 = r3;
        goto L_0x0159;
    L_0x01b1:
        r7 = r10;
        r11 = r3;
        r3 = r1;
        r1 = r13;
        goto L_0x00ef;
    L_0x01b7:
        r1 = r13;
        r9 = r10;
        r14 = r4;
        goto L_0x00ef;
    L_0x01bc:
        r11 = r12;
        goto L_0x00ef;
    L_0x01bf:
        r11 = r12;
        r16 = r4;
        r4 = r9;
        r9 = r16;
        goto L_0x011c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.ae.b(int):void");
    }

    /* renamed from: c */
    private T[] m2336c(int i) {
        this.f3015d = Math.max(this.f3015d, i);
        if (this.f3014c.length < i) {
            int i2 = (i >> 1) | i;
            i2 |= i2 >> 2;
            i2 |= i2 >> 4;
            i2 |= i2 >> 8;
            i2 = (i2 | (i2 >> 16)) + 1;
            if (i2 >= 0) {
                i = Math.min(i2, this.f3012a.length >>> 1);
            }
            this.f3014c = new Object[i];
        }
        return this.f3014c;
    }

    /* renamed from: a */
    final void m2337a() {
        while (this.f3016e > 1) {
            int i = this.f3016e - 2;
            if ((i <= 0 || this.f3018g[i - 1] > this.f3018g[i] + this.f3018g[i + 1]) && (i < 2 || this.f3018g[i - 2] > this.f3018g[i] + this.f3018g[i - 1])) {
                if (this.f3018g[i] > this.f3018g[i + 1]) {
                    return;
                }
            } else if (this.f3018g[i - 1] < this.f3018g[i + 1]) {
                i--;
            }
            m2335b(i);
        }
    }

    /* renamed from: b */
    final void m2338b() {
        while (this.f3016e > 1) {
            int i = this.f3016e - 2;
            if (i > 0 && this.f3018g[i - 1] < this.f3018g[i + 1]) {
                i--;
            }
            m2335b(i);
        }
    }
}
