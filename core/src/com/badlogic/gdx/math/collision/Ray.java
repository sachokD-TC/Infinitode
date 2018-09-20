package com.badlogic.gdx.math.collision;

import com.badlogic.gdx.math.Vector3;
import java.io.Serializable;

public class Ray implements Serializable {
    /* renamed from: a */
    static Vector3 f2368a = new Vector3();
    private static final long serialVersionUID = -620692054835390878L;
    public final Vector3 direction = new Vector3();
    public final Vector3 origin = new Vector3();

    public Ray(Vector3 vector3, Vector3 vector32) {
        this.origin.m1711a(vector3);
        this.direction.m1711a(vector32).m1712b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Ray ray = (Ray) obj;
        return this.direction.equals(ray.direction) && this.origin.equals(ray.origin);
    }

    public int hashCode() {
        return ((this.direction.hashCode() + 73) * 73) + this.origin.hashCode();
    }

    public String toString() {
        return "ray [" + this.origin + ":" + this.direction + "]";
    }
}
