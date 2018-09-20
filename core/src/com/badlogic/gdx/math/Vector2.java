package com.badlogic.gdx.math;

import java.io.Serializable;

public class Vector2 implements Serializable {
    /* renamed from: a */
    public static final Vector2 f2334a = new Vector2(1.0f, 0.0f);
    /* renamed from: b */
    public static final Vector2 f2335b = new Vector2(0.0f, 1.0f);
    /* renamed from: c */
    public static final Vector2 f2336c = new Vector2(0.0f, 0.0f);
    private static final long serialVersionUID = 913902788239530931L;
    /* renamed from: x */
    public float f2337x;
    /* renamed from: y */
    public float f2338y;

    public Vector2(float f, float f2) {
        this.f2337x = f;
        this.f2338y = f2;
    }

    public Vector2(Vector2 vector2) {
        m1702a(vector2);
    }

    /* renamed from: a */
    public final Vector2 m1700a() {
        float sqrt = (float) Math.sqrt((double) ((this.f2337x * this.f2337x) + (this.f2338y * this.f2338y)));
        if (sqrt != 0.0f) {
            this.f2337x /= sqrt;
            this.f2338y /= sqrt;
        }
        return this;
    }

    /* renamed from: a */
    public final Vector2 m1701a(float f, float f2) {
        this.f2337x = f;
        this.f2338y = f2;
        return this;
    }

    /* renamed from: a */
    public final Vector2 m1702a(Vector2 vector2) {
        this.f2337x = vector2.f2337x;
        this.f2338y = vector2.f2338y;
        return this;
    }

    /* renamed from: b */
    public final float m1703b(float f, float f2) {
        float f3 = f - this.f2337x;
        float f4 = f2 - this.f2338y;
        return (float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
    }

    /* renamed from: b */
    public final Vector2 m1704b(Vector2 vector2) {
        this.f2337x -= vector2.f2337x;
        this.f2338y -= vector2.f2338y;
        return this;
    }

    /* renamed from: c */
    public final Vector2 m1705c(Vector2 vector2) {
        this.f2337x += vector2.f2337x;
        this.f2338y += vector2.f2338y;
        return this;
    }

    /* renamed from: d */
    public final float m1706d(Vector2 vector2) {
        float f = vector2.f2337x - this.f2337x;
        float f2 = vector2.f2338y - this.f2338y;
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Vector2 vector2 = (Vector2) obj;
        return Float.floatToIntBits(this.f2337x) != Float.floatToIntBits(vector2.f2337x) ? false : Float.floatToIntBits(this.f2338y) == Float.floatToIntBits(vector2.f2338y);
    }

    public int hashCode() {
        return ((Float.floatToIntBits(this.f2337x) + 31) * 31) + Float.floatToIntBits(this.f2338y);
    }

    public String toString() {
        return "(" + this.f2337x + "," + this.f2338y + ")";
    }
}
