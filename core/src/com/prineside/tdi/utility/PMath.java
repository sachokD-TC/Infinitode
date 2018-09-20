package com.prineside.tdi.utility;

import com.badlogic.gdx.math.Vector2;

public class PMath {
    /* renamed from: a */
    private static final Vector2 f8657a = new Vector2();

    /* renamed from: a */
    private static float m8818a(float f) {
        return ((f % 360.0f) + 360.0f) % 360.0f;
    }

    /* renamed from: a */
    public static float m8819a(float f, float f2) {
        float a = m8818a(f2) - m8818a(f);
        return a < -180.0f ? a + 360.0f : a > 180.0f ? a - 360.0f : a;
    }

    /* renamed from: a */
    public static float m8820a(float f, float f2, float f3, float f4) {
        return (float) Math.sqrt((double) (((f - f3) * (f - f3)) + ((f2 - f4) * (f2 - f4))));
    }

    /* renamed from: a */
    public static float m8821a(Vector2 vector2, Vector2 vector22) {
        return ((float) Math.toDegrees(Math.atan2((double) (vector22.f2338y - vector2.f2338y), (double) (vector22.f2337x - vector2.f2337x)))) - 90.0f;
    }

    /* renamed from: a */
    public static synchronized Vector2 m8822a(Vector2 vector2, Vector2 vector22, Vector2 vector23, float f) {
        Vector2 vector24;
        synchronized (PMath.class) {
            vector24 = new Vector2();
            m8825a(vector24, vector2, vector22, vector23, f);
        }
        return vector24;
    }

    /* renamed from: a */
    public static void m8823a(Vector2 vector2, float f, float f2) {
        float toRadians = (float) Math.toRadians((double) f);
        vector2.f2337x += ((float) (-Math.sin((double) toRadians))) * f2;
        vector2.f2338y = (((float) Math.cos((double) toRadians)) * f2) + vector2.f2338y;
    }

    /* renamed from: a */
    public static void m8824a(Vector2 vector2, Vector2 vector22, float f) {
        vector2.f2337x += (vector22.f2337x - vector2.f2337x) * f;
        vector2.f2338y += (vector22.f2338y - vector2.f2338y) * f;
    }

    /* renamed from: a */
    private static synchronized void m8825a(Vector2 vector2, Vector2 vector22, Vector2 vector23, Vector2 vector24, float f) {
        synchronized (PMath.class) {
            f8657a.f2337x = vector23.f2337x;
            f8657a.f2338y = vector23.f2338y;
            f8657a.m1704b(vector22);
            Vector2 vector25 = f8657a;
            vector25.f2337x *= f;
            vector25 = f8657a;
            vector25.f2338y *= f;
            f8657a.m1705c(vector22);
            vector2.f2337x = vector24.f2337x;
            vector2.f2338y = vector24.f2338y;
            vector2.m1704b(vector23);
            vector2.f2337x *= f;
            vector2.f2338y *= f;
            vector2.m1705c(vector23);
            vector2.m1704b(f8657a);
            vector2.f2337x *= f;
            vector2.f2338y *= f;
            vector2.m1705c(f8657a);
        }
    }

    /* renamed from: b */
    public static float m8826b(float f, float f2, float f3, float f4) {
        return ((f - f3) * (f - f3)) + ((f2 - f4) * (f2 - f4));
    }

    /* renamed from: c */
    public static float m8827c(float f, float f2, float f3, float f4) {
        return ((float) Math.toDegrees(Math.atan2((double) (f4 - f2), (double) (f3 - f)))) - 90.0f;
    }

    /* renamed from: d */
    public static Vector2 m8828d(float f, float f2, float f3, float f4) {
        Vector2 vector2 = new Vector2();
        float toRadians = (float) Math.toRadians((double) f3);
        vector2.f2337x = (((float) (-Math.sin((double) toRadians))) * f4) + f;
        vector2.f2338y = (((float) Math.cos((double) toRadians)) * f4) + f2;
        return vector2;
    }
}
