package com.badlogic.gdx.math;

import java.util.Random;

/* renamed from: com.badlogic.gdx.math.f */
public final class C0549f {
    /* renamed from: a */
    public static Random f2447a = new RandomXS128();

    /* renamed from: com.badlogic.gdx.math.f$a */
    private static class C0548a {
        /* renamed from: a */
        static final float[] f2446a = new float[16384];

        static {
            int i = 0;
            for (int i2 = 0; i2 < 16384; i2++) {
                f2446a[i2] = (float) Math.sin((double) (((((float) i2) + 0.5f) / 16384.0f) * 6.2831855f));
            }
            while (i < 360) {
                f2446a[((int) (((float) i) * 45.511112f)) & 16383] = (float) Math.sin((double) (((float) i) * 0.017453292f));
                i += 90;
            }
        }
    }

    /* renamed from: a */
    public static float m1760a(float f) {
        return C0548a.f2446a[((int) (2607.5945f * f)) & 16383];
    }

    /* renamed from: a */
    public static float m1761a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: a */
    public static int m1762a() {
        return f2447a.nextInt(3);
    }

    /* renamed from: a */
    public static int m1763a(int i) {
        return f2447a.nextInt((i + 0) + 1) + 0;
    }

    /* renamed from: a */
    public static boolean m1764a(float f, float f2) {
        return Math.abs(f - f2) <= 1.0E-6f;
    }

    /* renamed from: b */
    public static float m1765b() {
        return f2447a.nextFloat();
    }

    /* renamed from: b */
    public static float m1766b(float f) {
        return C0548a.f2446a[((int) ((1.5707964f + f) * 2607.5945f)) & 16383];
    }

    /* renamed from: b */
    public static float m1767b(float f, float f2, float f3) {
        return ((((((((f2 - f) + 360.0f) + 180.0f) % 360.0f) - 180.0f) * f3) + f) + 360.0f) % 360.0f;
    }

    /* renamed from: b */
    public static int m1768b(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = i - 1;
        i2 |= i2 >> 1;
        i2 |= i2 >> 2;
        i2 |= i2 >> 4;
        i2 |= i2 >> 8;
        return (i2 | (i2 >> 16)) + 1;
    }

    /* renamed from: c */
    public static float m1769c(float f) {
        return C0548a.f2446a[((int) (45.511112f * f)) & 16383];
    }

    /* renamed from: c */
    public static boolean m1770c(int i) {
        return i != 0 && ((i - 1) & i) == 0;
    }

    /* renamed from: d */
    public static float m1771d(float f) {
        return C0548a.f2446a[((int) ((90.0f + f) * 45.511112f)) & 16383];
    }

    /* renamed from: e */
    public static float m1772e(float f) {
        return f2447a.nextFloat() * f;
    }
}
