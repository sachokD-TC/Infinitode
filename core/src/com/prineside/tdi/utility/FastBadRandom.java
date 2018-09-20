package com.prineside.tdi.utility;

import java.security.SecureRandom;
import java.util.Random;

public class FastBadRandom {
    /* renamed from: a */
    public static Random f8387a;
    /* renamed from: b */
    static SecureRandom f8388b = new SecureRandom();
    /* renamed from: c */
    private static final float[] f8389c = new float[8192];
    /* renamed from: d */
    private static int f8390d = 0;

    /* renamed from: a */
    public static int m8807a(int i) {
        return (int) (m8809b() * ((float) i));
    }

    /* renamed from: a */
    public static void m8808a() {
        f8387a = new Random();
        for (int i = 0; i < 8192; i++) {
            f8389c[i] = f8387a.nextFloat();
        }
    }

    /* renamed from: b */
    public static synchronized float m8809b() {
        float f;
        synchronized (FastBadRandom.class) {
            int i = f8390d + 1;
            f8390d = i;
            if (i == 8192) {
                f8390d = 0;
            }
            f = f8389c[f8390d];
        }
        return f;
    }

    /* renamed from: b */
    public static int m8810b(int i) {
        return f8387a.nextInt(i);
    }

    /* renamed from: c */
    public static float m8811c() {
        return f8387a.nextFloat();
    }

    /* renamed from: d */
    public static String m8812d() {
        StringBuilder stringBuilder = new StringBuilder(8);
        for (int i = 0; i < 8; i++) {
            stringBuilder.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(f8388b.nextInt(36)));
        }
        return stringBuilder.toString();
    }
}
