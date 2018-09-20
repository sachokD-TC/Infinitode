package com.badlogic.gdx.math;

import java.io.Serializable;

public class Rectangle implements Serializable {
    /* renamed from: a */
    public static final Rectangle f2330a = new Rectangle();
    /* renamed from: b */
    public static final Rectangle f2331b = new Rectangle();
    private static final long serialVersionUID = 5733252015138115702L;
    public float height;
    public float width;
    /* renamed from: x */
    public float f2332x;
    /* renamed from: y */
    public float f2333y;

    public Rectangle(float f, float f2) {
        this.f2332x = 0.0f;
        this.f2333y = 0.0f;
        this.width = f;
        this.height = f2;
    }

    /* renamed from: a */
    public final Rectangle m1698a(float f, float f2, float f3, float f4) {
        this.f2332x = f;
        this.f2333y = f2;
        this.width = f3;
        this.height = f4;
        return this;
    }

    /* renamed from: a */
    public final boolean m1699a(float f, float f2) {
        return this.f2332x <= f && this.f2332x + this.width >= f && this.f2333y <= f2 && this.f2333y + this.height >= f2;
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
        Rectangle rectangle = (Rectangle) obj;
        return Float.floatToRawIntBits(this.height) != Float.floatToRawIntBits(rectangle.height) ? false : Float.floatToRawIntBits(this.width) != Float.floatToRawIntBits(rectangle.width) ? false : Float.floatToRawIntBits(this.f2332x) != Float.floatToRawIntBits(rectangle.f2332x) ? false : Float.floatToRawIntBits(this.f2333y) == Float.floatToRawIntBits(rectangle.f2333y);
    }

    public int hashCode() {
        return ((((((Float.floatToRawIntBits(this.height) + 31) * 31) + Float.floatToRawIntBits(this.width)) * 31) + Float.floatToRawIntBits(this.f2332x)) * 31) + Float.floatToRawIntBits(this.f2333y);
    }

    public String toString() {
        return "[" + this.f2332x + "," + this.f2333y + "," + this.width + "," + this.height + "]";
    }
}
