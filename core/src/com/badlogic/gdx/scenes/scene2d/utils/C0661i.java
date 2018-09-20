package com.badlogic.gdx.scenes.scene2d.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0427a;
import com.badlogic.gdx.graphics.glutils.C0491f;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.C0676a;

/* renamed from: com.badlogic.gdx.scenes.scene2d.utils.i */
public final class C0661i {
    /* renamed from: a */
    static Vector3 f2930a = new Vector3();
    /* renamed from: b */
    static final Rectangle f2931b = new Rectangle();
    /* renamed from: c */
    private static C0676a<Rectangle> f2932c = new C0676a();

    /* renamed from: a */
    public static Rectangle m2231a() {
        Rectangle rectangle = (Rectangle) f2932c.mo523a();
        if (f2932c.f3001b == 0) {
            Gdx.gl.glDisable(3089);
        } else {
            Rectangle rectangle2 = (Rectangle) f2932c.m2299b();
            C0491f.m1519a((int) rectangle2.f2332x, (int) rectangle2.f2333y, (int) rectangle2.width, (int) rectangle2.height);
        }
        return rectangle;
    }

    /* renamed from: a */
    public static void m2232a(C0427a c0427a, float f, float f2, float f3, float f4, Matrix4 matrix4, Rectangle rectangle, Rectangle rectangle2) {
        f2930a.m1709a(rectangle.f2332x, rectangle.f2333y, 0.0f);
        f2930a.m1710a(matrix4);
        c0427a.m1206a(f2930a, f, f2, f3, f4);
        rectangle2.f2332x = f2930a.f2344x;
        rectangle2.f2333y = f2930a.f2345y;
        f2930a.m1709a(rectangle.f2332x + rectangle.width, rectangle.f2333y + rectangle.height, 0.0f);
        f2930a.m1710a(matrix4);
        c0427a.m1206a(f2930a, f, f2, f3, f4);
        rectangle2.width = f2930a.f2344x - rectangle2.f2332x;
        rectangle2.height = f2930a.f2345y - rectangle2.f2333y;
    }

    /* renamed from: a */
    public static boolean m2233a(Rectangle rectangle) {
        rectangle.f2332x = (float) Math.round(rectangle.f2332x);
        rectangle.f2333y = (float) Math.round(rectangle.f2333y);
        rectangle.width = (float) Math.round(rectangle.width);
        rectangle.height = (float) Math.round(rectangle.height);
        if (rectangle.width < 0.0f) {
            rectangle.width = -rectangle.width;
            rectangle.f2332x -= rectangle.width;
        }
        if (rectangle.height < 0.0f) {
            rectangle.height = -rectangle.height;
            rectangle.f2333y -= rectangle.height;
        }
        if (f2932c.f3001b != 0) {
            Rectangle rectangle2 = (Rectangle) f2932c.m2291a(f2932c.f3001b - 1);
            float max = Math.max(rectangle2.f2332x, rectangle.f2332x);
            float min = Math.min(rectangle2.f2332x + rectangle2.width, rectangle.f2332x + rectangle.width);
            if (min - max < 1.0f) {
                return false;
            }
            float max2 = Math.max(rectangle2.f2333y, rectangle.f2333y);
            float min2 = Math.min(rectangle2.height + rectangle2.f2333y, rectangle.f2333y + rectangle.height);
            if (min2 - max2 < 1.0f) {
                return false;
            }
            rectangle.f2332x = max;
            rectangle.f2333y = max2;
            rectangle.width = min - max;
            rectangle.height = Math.max(1.0f, min2 - max2);
        } else if (rectangle.width < 1.0f || rectangle.height < 1.0f) {
            return false;
        } else {
            Gdx.gl.glEnable(3089);
        }
        f2932c.m2296a((Object) rectangle);
        C0491f.m1519a((int) rectangle.f2332x, (int) rectangle.f2333y, (int) rectangle.width, (int) rectangle.height);
        return true;
    }
}
