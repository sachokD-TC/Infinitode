package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.math.C0549f;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Disposable;

public final class ShapeRenderer implements Disposable {
    /* renamed from: a */
    public final C0492g f2110a;
    /* renamed from: b */
    public final Matrix4 f2111b;
    /* renamed from: c */
    public final Matrix4 f2112c;
    /* renamed from: d */
    public final C0430b f2113d;
    /* renamed from: e */
    public ShapeType f2114e;
    /* renamed from: f */
    public boolean f2115f;
    /* renamed from: g */
    private boolean f2116g;
    /* renamed from: h */
    private final Matrix4 f2117h;
    /* renamed from: i */
    private final Vector2 f2118i;
    /* renamed from: j */
    private float f2119j;

    public enum ShapeType {
        Point(0),
        Line(1),
        Filled(4);
        
        final int glType;

        private ShapeType(int i) {
            this.glType = i;
        }
    }

    public ShapeRenderer() {
        this((byte) 0);
    }

    private ShapeRenderer(byte b) {
        this('\u0000');
    }

    private ShapeRenderer(char c) {
        this.f2116g = false;
        this.f2111b = new Matrix4();
        this.f2112c = new Matrix4();
        this.f2117h = new Matrix4();
        this.f2118i = new Vector2();
        this.f2113d = new C0430b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f2119j = 0.75f;
        this.f2110a = new C0493h();
        this.f2111b.m1688a((float) Gdx.graphics.mo294c(), (float) Gdx.graphics.mo295d());
        this.f2116g = true;
    }

    /* renamed from: a */
    public final void m1451a() {
        this.f2110a.mo406a();
        this.f2114e = null;
    }

    /* renamed from: a */
    public final void m1452a(float f, float f2, float f3, float f4) {
        C0430b c0430b = this.f2113d;
        C0430b c0430b2 = this.f2113d;
        if (this.f2114e == ShapeType.Filled) {
            float f5 = this.f2119j;
            m1457a(ShapeType.Line, ShapeType.Filled, 8);
            float a = c0430b.m1216a();
            float a2 = c0430b2.m1216a();
            Vector2 a3 = this.f2118i.m1701a(f4 - f2, f - f3).m1700a();
            f5 *= 0.5f;
            float f6 = a3.f2337x * f5;
            f5 *= a3.f2338y;
            if (this.f2114e == ShapeType.Line) {
                this.f2110a.mo407a(a);
                this.f2110a.mo408a(f + f6, f2 + f5);
                this.f2110a.mo407a(a);
                this.f2110a.mo408a(f - f6, f2 - f5);
                this.f2110a.mo407a(a2);
                this.f2110a.mo408a(f3 + f6, f4 + f5);
                this.f2110a.mo407a(a2);
                this.f2110a.mo408a(f3 - f6, f4 - f5);
                this.f2110a.mo407a(a2);
                this.f2110a.mo408a(f3 + f6, f4 + f5);
                this.f2110a.mo407a(a);
                this.f2110a.mo408a(f + f6, f2 + f5);
                this.f2110a.mo407a(a2);
                this.f2110a.mo408a(f3 - f6, f4 - f5);
                this.f2110a.mo407a(a);
                this.f2110a.mo408a(f - f6, f2 - f5);
                return;
            }
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f + f6, f2 + f5);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f - f6, f2 - f5);
            this.f2110a.mo407a(a2);
            this.f2110a.mo408a(f3 + f6, f4 + f5);
            this.f2110a.mo407a(a2);
            this.f2110a.mo408a(f3 - f6, f4 - f5);
            this.f2110a.mo407a(a2);
            this.f2110a.mo408a(f3 + f6, f4 + f5);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f - f6, f2 - f5);
            return;
        }
        m1457a(ShapeType.Line, null, 2);
        this.f2110a.mo409a(c0430b.f1644I, c0430b.f1645J, c0430b.f1646K, c0430b.f1647L);
        this.f2110a.mo408a(f, f2);
        this.f2110a.mo409a(c0430b2.f1644I, c0430b2.f1645J, c0430b2.f1646K, c0430b2.f1647L);
        this.f2110a.mo408a(f3, f4);
    }

    /* renamed from: a */
    public final void m1453a(float f, float f2, float f3, float f4, float f5) {
        m1457a(ShapeType.Line, ShapeType.Filled, 8);
        float a = this.f2113d.m1216a();
        Vector2 a2 = this.f2118i.m1701a(f4 - f2, f - f3).m1700a();
        float f6 = 0.5f * f5;
        float f7 = a2.f2337x * f6;
        float f8 = a2.f2338y * f6;
        if (this.f2114e == ShapeType.Line) {
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f + f7, f2 + f8);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f - f7, f2 - f8);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f3 + f7, f4 + f8);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f3 - f7, f4 - f8);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f3 + f7, f4 + f8);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f + f7, f2 + f8);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f3 - f7, f4 - f8);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f - f7, f2 - f8);
            return;
        }
        this.f2110a.mo407a(a);
        this.f2110a.mo408a(f + f7, f2 + f8);
        this.f2110a.mo407a(a);
        this.f2110a.mo408a(f - f7, f2 - f8);
        this.f2110a.mo407a(a);
        this.f2110a.mo408a(f3 + f7, f4 + f8);
        this.f2110a.mo407a(a);
        this.f2110a.mo408a(f3 - f7, f4 - f8);
        this.f2110a.mo407a(a);
        this.f2110a.mo408a(f3 + f7, f4 + f8);
        this.f2110a.mo407a(a);
        this.f2110a.mo408a(f - f7, f2 - f8);
    }

    /* renamed from: a */
    public final void m1454a(float f, float f2, float f3, float f4, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("segments must be > 0.");
        }
        float a = this.f2113d.m1216a();
        float f5 = (6.2831855f * (f4 / 360.0f)) / ((float) i);
        float b = C0549f.m1766b(f5);
        float a2 = C0549f.m1760a(f5);
        f5 = C0549f.m1766b(f3 * 0.017453292f) * f2;
        float a3 = C0549f.m1760a(f3 * 0.017453292f) * f2;
        float f6;
        int i2;
        float f7;
        if (this.f2114e == ShapeType.Line) {
            m1457a(ShapeType.Line, ShapeType.Filled, (i * 2) + 2);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f, 600.0f);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f + f5, 600.0f + a3);
            f6 = a3;
            i2 = 0;
            while (i2 < i) {
                this.f2110a.mo407a(a);
                this.f2110a.mo408a(f + f5, 600.0f + f6);
                f7 = (b * f5) - (a2 * f6);
                f6 = (f6 * b) + (f5 * a2);
                this.f2110a.mo407a(a);
                this.f2110a.mo408a(f + f7, 600.0f + f6);
                i2++;
                f5 = f7;
            }
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f5 + f, 600.0f + f6);
        } else {
            m1457a(ShapeType.Line, ShapeType.Filled, (i * 3) + 3);
            f6 = a3;
            i2 = 0;
            while (i2 < i) {
                this.f2110a.mo407a(a);
                this.f2110a.mo408a(f, 600.0f);
                this.f2110a.mo407a(a);
                this.f2110a.mo408a(f + f5, 600.0f + f6);
                f7 = (b * f5) - (a2 * f6);
                f6 = (f6 * b) + (f5 * a2);
                this.f2110a.mo407a(a);
                this.f2110a.mo408a(f + f7, 600.0f + f6);
                i2++;
                f5 = f7;
            }
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f, 600.0f);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f5 + f, 600.0f + f6);
        }
        this.f2110a.mo407a(a);
        this.f2110a.mo408a(0.0f + f, 600.0f);
    }

    /* renamed from: a */
    public final void m1455a(C0430b c0430b) {
        this.f2113d.m1218a(c0430b);
    }

    /* renamed from: a */
    public final void m1456a(ShapeType shapeType) {
        if (this.f2114e != null) {
            throw new IllegalStateException("Call end() before beginning a new shape batch.");
        }
        this.f2114e = shapeType;
        if (this.f2116g) {
            this.f2117h.m1691a(this.f2111b);
            Matrix4.mul(this.f2117h.val, this.f2112c.val);
            this.f2116g = false;
        }
        this.f2110a.mo410a(this.f2117h, this.f2114e.glType);
    }

    /* renamed from: a */
    public final void m1457a(ShapeType shapeType, ShapeType shapeType2, int i) {
        if (this.f2114e == null) {
            throw new IllegalStateException("begin must be called first.");
        } else if (this.f2114e == shapeType || this.f2114e == shapeType2) {
            ShapeType shapeType3;
            if (this.f2116g) {
                shapeType3 = this.f2114e;
                m1451a();
                m1456a(shapeType3);
            } else if (this.f2110a.mo412c() - this.f2110a.mo411b() < i) {
                shapeType3 = this.f2114e;
                m1451a();
                m1456a(shapeType3);
            }
        } else if (this.f2115f) {
            m1451a();
            m1456a(shapeType);
        } else if (shapeType2 == null) {
            throw new IllegalStateException("Must call begin(ShapeType." + shapeType + ").");
        } else {
            throw new IllegalStateException("Must call begin(ShapeType." + shapeType + ") or begin(ShapeType." + shapeType2 + ").");
        }
    }

    /* renamed from: a */
    public final void m1458a(Matrix4 matrix4) {
        this.f2111b.m1691a(matrix4);
        this.f2116g = true;
    }

    /* renamed from: b */
    public final void dispose() {
        this.f2110a.mo413d();
    }

    /* renamed from: b */
    public final void m1460b(float f, float f2, float f3, float f4) {
        m1457a(ShapeType.Line, ShapeType.Filled, 8);
        float a = this.f2113d.m1216a();
        if (this.f2114e == ShapeType.Line) {
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f, f2);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f + f3, f2);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f + f3, f2);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f + f3, f2 + f4);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f + f3, f2 + f4);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f, f2 + f4);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f, f2 + f4);
            this.f2110a.mo407a(a);
            this.f2110a.mo408a(f, f2);
            return;
        }
        this.f2110a.mo407a(a);
        this.f2110a.mo408a(f, f2);
        this.f2110a.mo407a(a);
        this.f2110a.mo408a(f + f3, f2);
        this.f2110a.mo407a(a);
        this.f2110a.mo408a(f + f3, f2 + f4);
        this.f2110a.mo407a(a);
        this.f2110a.mo408a(f + f3, f2 + f4);
        this.f2110a.mo407a(a);
        this.f2110a.mo408a(f, f2 + f4);
        this.f2110a.mo407a(a);
        this.f2110a.mo408a(f, f2);
    }

    /* renamed from: b */
    public final void m1461b(ShapeType shapeType) {
        if (this.f2114e != shapeType) {
            if (this.f2114e == null) {
                throw new IllegalStateException("begin must be called first.");
            } else if (this.f2115f) {
                m1451a();
                m1456a(shapeType);
            } else {
                throw new IllegalStateException("autoShapeType must be enabled.");
            }
        }
    }

    /* renamed from: b */
    public final void m1462b(Matrix4 matrix4) {
        this.f2112c.m1691a(matrix4);
        this.f2116g = true;
    }

    /* renamed from: c */
    public final void m1463c() {
        ShapeType shapeType = this.f2114e;
        m1451a();
        m1456a(shapeType);
    }
}
