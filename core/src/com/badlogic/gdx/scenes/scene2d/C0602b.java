package com.badlogic.gdx.scenes.scene2d;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0444a;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.C0549f;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.C0609g.C0608a;
import com.badlogic.gdx.scenes.scene2d.InputEvent.Type;
import com.badlogic.gdx.scenes.scene2d.utils.C0661i;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0688f;
import com.badlogic.gdx.utils.C0721u;

/* renamed from: com.badlogic.gdx.scenes.scene2d.b */
public class C0602b {
    /* renamed from: a */
    public C0609g f2607a;
    /* renamed from: b */
    public C0605e f2608b;
    /* renamed from: c */
    public final C0688f<C0603d> f2609c = new C0688f((byte) 0);
    /* renamed from: d */
    public Touchable f2610d = Touchable.enabled;
    /* renamed from: e */
    public boolean f2611e = true;
    /* renamed from: f */
    public boolean f2612f;
    /* renamed from: g */
    public float f2613g;
    /* renamed from: h */
    public float f2614h;
    /* renamed from: i */
    public float f2615i;
    /* renamed from: j */
    public float f2616j;
    /* renamed from: k */
    public float f2617k;
    /* renamed from: l */
    public float f2618l;
    /* renamed from: m */
    public float f2619m = 1.0f;
    /* renamed from: n */
    public float f2620n = 1.0f;
    /* renamed from: o */
    public float f2621o;
    /* renamed from: p */
    public final C0430b f2622p = new C0430b(1.0f, 1.0f, 1.0f, 1.0f);
    /* renamed from: q */
    private final C0688f<C0603d> f2623q = new C0688f((byte) 0);
    /* renamed from: r */
    private final C0676a<C0588a> f2624r = new C0676a(0);
    /* renamed from: s */
    private String f2625s;

    /* renamed from: a */
    public final Vector2 m1932a(Vector2 vector2) {
        if (this.f2608b != null) {
            this.f2608b.m1932a(vector2);
        }
        m1948b(vector2);
        return vector2;
    }

    /* renamed from: a */
    public C0602b mo469a(float f, float f2, boolean z) {
        return (!z || this.f2610d == Touchable.enabled) ? (f < 0.0f || f >= this.f2615i || f2 < 0.0f || f2 >= this.f2616j) ? null : this : null;
    }

    /* renamed from: a */
    public void mo470a(float f) {
        C0676a c0676a = this.f2624r;
        if (c0676a.f3001b > 0) {
            if (this.f2607a != null && this.f2607a.f2646g) {
                Gdx.graphics.mo300i();
            }
            int i = 0;
            while (i < c0676a.f3001b) {
                Object obj = (C0588a) c0676a.m2291a(i);
                if (obj.mo460a(f) && i < c0676a.f3001b) {
                    int a = ((C0588a) c0676a.m2291a(i)) == obj ? i : c0676a.m2289a(obj, true);
                    if (a != -1) {
                        c0676a.mo527b(a);
                        obj.mo464a(null);
                        i--;
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    public final void m1935a(float f, float f2) {
        if (this.f2613g != f || this.f2614h != f2) {
            this.f2613g = f;
            this.f2614h = f2;
        }
    }

    /* renamed from: a */
    public final void m1936a(float f, float f2, float f3, float f4) {
        if (!(this.f2613g == f && this.f2614h == f2)) {
            this.f2613g = f;
            this.f2614h = f2;
        }
        if (this.f2615i != f3 || this.f2616j != f4) {
            this.f2615i = f3;
            this.f2616j = f4;
            mo480d();
        }
    }

    /* renamed from: a */
    public final void m1937a(C0430b c0430b) {
        this.f2622p.m1218a(c0430b);
    }

    /* renamed from: a */
    public void mo471a(C0444a c0444a, float f) {
    }

    /* renamed from: a */
    public void mo472a(ShapeRenderer shapeRenderer) {
        mo489b(shapeRenderer);
    }

    /* renamed from: a */
    public final void m1940a(C0588a c0588a) {
        c0588a.mo464a(this);
        this.f2624r.m2296a((Object) c0588a);
        if (this.f2607a != null && this.f2607a.f2646g) {
            Gdx.graphics.mo300i();
        }
    }

    /* renamed from: a */
    protected void mo474a(C0609g c0609g) {
        this.f2607a = c0609g;
    }

    /* renamed from: a */
    public void mo487a(boolean z) {
        this.f2612f = z;
        if (z) {
            C0609g.f2640a = true;
        }
    }

    /* renamed from: a */
    public final boolean m1943a() {
        return this.f2608b != null ? this.f2608b.mo488a(this, true) : false;
    }

    /* renamed from: a */
    public final boolean m1944a(C0602b c0602b) {
        if (c0602b == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        }
        while (this != null) {
            if (this == c0602b) {
                return true;
            }
            this = this.f2608b;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m1945a(C0586c c0586c) {
        if (c0586c.f2551a == null) {
            c0586c.f2551a = this.f2607a;
        }
        c0586c.f2552b = this;
        Object obj = (C0676a) C0721u.m2514b(C0676a.class);
        for (Object obj2 = this.f2608b; obj2 != null; obj2 = obj2.b) {
            obj.m2296a(obj2);
        }
        try {
            int i;
            boolean z;
            Object[] objArr = obj.f3000a;
            for (i = obj.f3001b - 1; i >= 0; i--) {
                ((C0605e) objArr[i]).m1946a(c0586c, true);
                if (c0586c.f2557g) {
                    z = c0586c.f2558h;
                    return z;
                }
            }
            m1946a(c0586c, true);
            if (c0586c.f2557g) {
                z = c0586c.f2558h;
                obj.mo530d();
                C0721u.m2513a(obj);
                return z;
            }
            m1946a(c0586c, false);
            if (!c0586c.f2555e) {
                z = c0586c.f2558h;
                obj.mo530d();
                C0721u.m2513a(obj);
                return z;
            } else if (c0586c.f2557g) {
                z = c0586c.f2558h;
                obj.mo530d();
                C0721u.m2513a(obj);
                return z;
            } else {
                i = obj.f3001b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((C0605e) objArr[i2]).m1946a(c0586c, false);
                    if (c0586c.f2557g) {
                        z = c0586c.f2558h;
                        obj.mo530d();
                        C0721u.m2513a(obj);
                        return z;
                    }
                }
                z = c0586c.f2558h;
                obj.mo530d();
                C0721u.m2513a(obj);
                return z;
            }
        } finally {
            obj.mo530d();
            C0721u.m2513a(obj);
        }
    }

    /* renamed from: a */
    public final boolean m1946a(C0586c c0586c, boolean z) {
        if (c0586c.f2552b == null) {
            throw new IllegalArgumentException("The event target cannot be null.");
        }
        C0688f c0688f = z ? this.f2609c : this.f2623q;
        if (c0688f.b == 0) {
            return c0586c.f2558h;
        }
        c0586c.f2553c = this;
        c0586c.f2554d = z;
        if (c0586c.f2551a == null) {
            c0586c.f2551a = this.f2607a;
        }
        c0688f.m2402f();
        int i = c0688f.b;
        for (int i2 = 0; i2 < i; i2++) {
            C0603d c0603d = (C0603d) c0688f.m2291a(i2);
            if (c0603d.mo477a(c0586c)) {
                c0586c.f2556f = true;
                if (c0586c instanceof InputEvent) {
                    InputEvent inputEvent = (InputEvent) c0586c;
                    if (inputEvent.f2559i == Type.touchDown) {
                        C0609g c0609g = c0586c.f2551a;
                        C0602b c0602b = inputEvent.f2552b;
                        int i3 = inputEvent.f2562l;
                        int i4 = inputEvent.f2563m;
                        C0608a c0608a = (C0608a) C0721u.m2514b(C0608a.class);
                        c0608a.f2636b = this;
                        c0608a.f2637c = c0602b;
                        c0608a.f2635a = c0603d;
                        c0608a.f2638d = i3;
                        c0608a.f2639e = i4;
                        c0609g.f2645f.m2296a((Object) c0608a);
                    }
                }
            }
        }
        c0688f.m2403g();
        return c0586c.f2558h;
    }

    /* renamed from: a */
    public final boolean m1947a(C0603d c0603d) {
        if (c0603d == null) {
            throw new IllegalArgumentException("listener cannot be null.");
        } else if (this.f2623q.m2302b((Object) c0603d)) {
            return false;
        } else {
            this.f2623q.m2296a((Object) c0603d);
            return true;
        }
    }

    /* renamed from: b */
    public final Vector2 m1948b(Vector2 vector2) {
        float f = this.f2621o;
        float f2 = this.f2619m;
        float f3 = this.f2620n;
        float f4 = this.f2613g;
        float f5 = this.f2614h;
        float cos;
        if (f != 0.0f) {
            cos = (float) Math.cos((double) (f * 0.017453292f));
            f = (float) Math.sin((double) (f * 0.017453292f));
            float f6 = this.f2617k;
            float f7 = this.f2618l;
            f4 = (vector2.f2337x - f4) - f6;
            f5 = (vector2.f2338y - f5) - f7;
            vector2.f2337x = (((f4 * cos) + (f5 * f)) / f2) + f6;
            vector2.f2338y = ((((-f) * f4) + (f5 * cos)) / f3) + f7;
        } else if (f2 == 1.0f && f3 == 1.0f) {
            vector2.f2337x -= f4;
            vector2.f2338y -= f5;
        } else {
            f = this.f2617k;
            cos = this.f2618l;
            vector2.f2337x = f + (((vector2.f2337x - f4) - f) / f2);
            vector2.f2338y = (((vector2.f2338y - f5) - cos) / f3) + cos;
        }
        return vector2;
    }

    /* renamed from: b */
    public final void m1949b() {
        for (int i = this.f2624r.f3001b - 1; i >= 0; i--) {
            ((C0588a) this.f2624r.m2291a(i)).mo464a(null);
        }
        this.f2624r.mo530d();
    }

    /* renamed from: b */
    public final void m1950b(float f) {
        if (this.f2613g != f) {
            this.f2613g = f;
        }
    }

    /* renamed from: b */
    public final void m1951b(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            this.f2613g += f;
            this.f2614h += f2;
        }
    }

    /* renamed from: b */
    public final void m1952b(float f, float f2, float f3, float f4) {
        this.f2622p.m1217a(f, f2, f3, f4);
    }

    /* renamed from: b */
    public void mo489b(ShapeRenderer shapeRenderer) {
        if (this.f2612f) {
            shapeRenderer.m1461b(ShapeType.Line);
            shapeRenderer.m1455a(this.f2607a.f2647h);
            float f = this.f2613g;
            float f2 = this.f2614h;
            float f3 = this.f2617k;
            float f4 = this.f2618l;
            float f5 = this.f2615i;
            float f6 = this.f2616j;
            float f7 = this.f2619m;
            float f8 = this.f2620n;
            float f9 = this.f2621o;
            C0430b c0430b = shapeRenderer.f2113d;
            C0430b c0430b2 = shapeRenderer.f2113d;
            C0430b c0430b3 = shapeRenderer.f2113d;
            C0430b c0430b4 = shapeRenderer.f2113d;
            shapeRenderer.m1457a(ShapeType.Line, ShapeType.Filled, 8);
            float d = C0549f.m1771d(f9);
            float c = C0549f.m1769c(f9);
            float f10 = -f3;
            f9 = -f4;
            float f11 = f5 - f3;
            f5 = f6 - f4;
            if (!(f7 == 1.0f && f8 == 1.0f)) {
                f10 *= f7;
                f9 *= f8;
                f11 *= f7;
                f5 *= f8;
            }
            f += f3;
            f2 += f4;
            f3 = ((d * f10) - (c * f9)) + f;
            f10 = ((f10 * c) + (d * f9)) + f2;
            f4 = ((d * f11) - (c * f9)) + f;
            f9 = ((f9 * d) + (c * f11)) + f2;
            f += (d * f11) - (c * f5);
            f5 = ((f5 * d) + (f11 * c)) + f2;
            f11 = (f - f4) + f3;
            f2 = f5 - (f9 - f10);
            if (shapeRenderer.f2114e == ShapeType.Line) {
                shapeRenderer.f2110a.mo409a(c0430b.f1644I, c0430b.f1645J, c0430b.f1646K, c0430b.f1647L);
                shapeRenderer.f2110a.mo408a(f3, f10);
                shapeRenderer.f2110a.mo409a(c0430b2.f1644I, c0430b2.f1645J, c0430b2.f1646K, c0430b2.f1647L);
                shapeRenderer.f2110a.mo408a(f4, f9);
                shapeRenderer.f2110a.mo409a(c0430b2.f1644I, c0430b2.f1645J, c0430b2.f1646K, c0430b2.f1647L);
                shapeRenderer.f2110a.mo408a(f4, f9);
                shapeRenderer.f2110a.mo409a(c0430b3.f1644I, c0430b3.f1645J, c0430b3.f1646K, c0430b3.f1647L);
                shapeRenderer.f2110a.mo408a(f, f5);
                shapeRenderer.f2110a.mo409a(c0430b3.f1644I, c0430b3.f1645J, c0430b3.f1646K, c0430b3.f1647L);
                shapeRenderer.f2110a.mo408a(f, f5);
                shapeRenderer.f2110a.mo409a(c0430b4.f1644I, c0430b4.f1645J, c0430b4.f1646K, c0430b4.f1647L);
                shapeRenderer.f2110a.mo408a(f11, f2);
                shapeRenderer.f2110a.mo409a(c0430b4.f1644I, c0430b4.f1645J, c0430b4.f1646K, c0430b4.f1647L);
                shapeRenderer.f2110a.mo408a(f11, f2);
                shapeRenderer.f2110a.mo409a(c0430b.f1644I, c0430b.f1645J, c0430b.f1646K, c0430b.f1647L);
                shapeRenderer.f2110a.mo408a(f3, f10);
                return;
            }
            shapeRenderer.f2110a.mo409a(c0430b.f1644I, c0430b.f1645J, c0430b.f1646K, c0430b.f1647L);
            shapeRenderer.f2110a.mo408a(f3, f10);
            shapeRenderer.f2110a.mo409a(c0430b2.f1644I, c0430b2.f1645J, c0430b2.f1646K, c0430b2.f1647L);
            shapeRenderer.f2110a.mo408a(f4, f9);
            shapeRenderer.f2110a.mo409a(c0430b3.f1644I, c0430b3.f1645J, c0430b3.f1646K, c0430b3.f1647L);
            shapeRenderer.f2110a.mo408a(f, f5);
            shapeRenderer.f2110a.mo409a(c0430b3.f1644I, c0430b3.f1645J, c0430b3.f1646K, c0430b3.f1647L);
            shapeRenderer.f2110a.mo408a(f, f5);
            shapeRenderer.f2110a.mo409a(c0430b4.f1644I, c0430b4.f1645J, c0430b4.f1646K, c0430b4.f1647L);
            shapeRenderer.f2110a.mo408a(f11, f2);
            shapeRenderer.f2110a.mo409a(c0430b.f1644I, c0430b.f1645J, c0430b.f1646K, c0430b.f1647L);
            shapeRenderer.f2110a.mo408a(f3, f10);
        }
    }

    /* renamed from: c */
    public void mo475c() {
        m1949b();
        this.f2623q.mo530d();
        this.f2609c.mo530d();
    }

    /* renamed from: c */
    public final void m1955c(float f) {
        if (this.f2615i != f) {
            this.f2615i = f;
            mo480d();
        }
    }

    /* renamed from: c */
    public final void m1956c(float f, float f2) {
        if (this.f2615i != f || this.f2616j != f2) {
            this.f2615i = f;
            this.f2616j = f2;
            mo480d();
        }
    }

    /* renamed from: c */
    public final boolean m1957c(float f, float f2, float f3, float f4) {
        if (f3 <= 0.0f || f4 <= 0.0f) {
            return false;
        }
        Rectangle rectangle = Rectangle.f2330a;
        rectangle.f2332x = f;
        rectangle.f2333y = f2;
        rectangle.width = f3;
        rectangle.height = f4;
        Object obj = (Rectangle) C0721u.m2514b(Rectangle.class);
        this.f2607a.m2003a(rectangle, (Rectangle) obj);
        if (C0661i.m2233a(obj)) {
            return true;
        }
        C0721u.m2513a(obj);
        return false;
    }

    /* renamed from: d */
    public void mo480d() {
    }

    /* renamed from: d */
    public final void m1959d(float f) {
        if (this.f2616j != f) {
            this.f2616j = f;
            mo480d();
        }
    }

    /* renamed from: e */
    public final void m1960e() {
        this.f2617k = this.f2615i / 2.0f;
        this.f2618l = this.f2616j / 2.0f;
    }

    /* renamed from: e */
    public final void m1961e(float f) {
        if (this.f2621o != f) {
            this.f2621o = f;
        }
    }

    /* renamed from: f */
    public final void m1962f(float f) {
        if (f != 0.0f) {
            this.f2621o += f;
        }
    }

    public String toString() {
        String str = this.f2625s;
        if (str != null) {
            return str;
        }
        str = getClass().getName();
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : str;
    }
}
