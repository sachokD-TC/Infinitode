package com.badlogic.gdx.scenes.scene2d;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.C0367f;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0427a;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.C0507i;
import com.badlogic.gdx.graphics.g2d.C0444a;
import com.badlogic.gdx.graphics.g2d.C0473l;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.InputEvent.Type;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.Table.Debug;
import com.badlogic.gdx.scenes.scene2d.utils.FocusListener.FocusEvent;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.C0328t.C0449a;
import com.badlogic.gdx.utils.C0721u;
import com.badlogic.gdx.utils.C0728z;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.p034b.C0682c;
import com.badlogic.gdx.utils.p034b.C0683a;

/* renamed from: com.badlogic.gdx.scenes.scene2d.g */
public final class C0609g extends C0367f implements Disposable {
    /* renamed from: a */
    static boolean f2640a;
    /* renamed from: b */
    public C0682c f2641b;
    /* renamed from: c */
    public C0605e f2642c;
    /* renamed from: d */
    C0602b f2643d;
    /* renamed from: e */
    C0602b f2644e;
    /* renamed from: f */
    final C0728z<C0608a> f2645f;
    /* renamed from: g */
    public boolean f2646g;
    /* renamed from: h */
    public final C0430b f2647h;
    /* renamed from: i */
    private final C0444a f2648i;
    /* renamed from: j */
    private boolean f2649j;
    /* renamed from: k */
    private final Vector2 f2650k;
    /* renamed from: l */
    private final C0602b[] f2651l;
    /* renamed from: m */
    private final boolean[] f2652m;
    /* renamed from: n */
    private final int[] f2653n;
    /* renamed from: o */
    private final int[] f2654o;
    /* renamed from: p */
    private int f2655p;
    /* renamed from: q */
    private int f2656q;
    /* renamed from: r */
    private C0602b f2657r;
    /* renamed from: s */
    private ShapeRenderer f2658s;
    /* renamed from: t */
    private boolean f2659t;
    /* renamed from: u */
    private boolean f2660u;
    /* renamed from: v */
    private boolean f2661v;
    /* renamed from: w */
    private Debug f2662w;

    /* renamed from: com.badlogic.gdx.scenes.scene2d.g$a */
    public static final class C0608a implements C0449a {
        /* renamed from: a */
        C0603d f2635a;
        /* renamed from: b */
        C0602b f2636b;
        /* renamed from: c */
        C0602b f2637c;
        /* renamed from: d */
        int f2638d;
        /* renamed from: e */
        int f2639e;

        /* renamed from: a */
        public final void mo360a() {
            this.f2636b = null;
            this.f2635a = null;
            this.f2637c = null;
        }
    }

    public C0609g() {
        this(new C0683a(Scaling.stretch, (float) Gdx.graphics.mo294c(), (float) Gdx.graphics.mo295d(), new C0507i()), new C0473l());
        this.f2649j = true;
    }

    public C0609g(C0682c c0682c) {
        this(c0682c, new C0473l());
        this.f2649j = true;
    }

    private C0609g(C0682c c0682c, C0444a c0444a) {
        this.f2650k = new Vector2();
        this.f2651l = new C0602b[20];
        this.f2652m = new boolean[20];
        this.f2653n = new int[20];
        this.f2654o = new int[20];
        this.f2645f = new C0728z(C0608a.class);
        this.f2646g = true;
        this.f2662w = Debug.none;
        this.f2647h = new C0430b(0.0f, 1.0f, 0.0f, 0.85f);
        if (c0682c == null) {
            throw new IllegalArgumentException("viewport cannot be null.");
        }
        this.f2641b = c0682c;
        this.f2648i = c0444a;
        this.f2642c = new C0605e();
        this.f2642c.mo474a(this);
        c0682c.mo522a(Gdx.graphics.mo294c(), Gdx.graphics.mo295d());
    }

    /* renamed from: a */
    private C0602b m1996a(float f, float f2) {
        this.f2642c.m1948b(this.f2650k.m1701a(f, f2));
        return this.f2642c.mo469a(this.f2650k.f2337x, this.f2650k.f2338y, true);
    }

    /* renamed from: a */
    private C0602b m1997a(C0602b c0602b, int i, int i2, int i3) {
        m2000a(this.f2650k.m1701a((float) i, (float) i2));
        C0602b a = m1996a(this.f2650k.f2337x, this.f2650k.f2338y);
        if (a == c0602b) {
            return c0602b;
        }
        if (c0602b != null) {
            Object obj = (InputEvent) C0721u.m2514b(InputEvent.class);
            obj.f2551a = this;
            obj.f2560j = this.f2650k.f2337x;
            obj.f2561k = this.f2650k.f2338y;
            obj.f2562l = i3;
            obj.f2559i = Type.exit;
            obj.f2567q = a;
            c0602b.m1945a((C0586c) obj);
            C0721u.m2513a(obj);
        }
        if (a != null) {
            obj = (InputEvent) C0721u.m2514b(InputEvent.class);
            obj.f2551a = this;
            obj.f2560j = this.f2650k.f2337x;
            obj.f2561k = this.f2650k.f2338y;
            obj.f2562l = i3;
            obj.f2559i = Type.enter;
            obj.f2567q = c0602b;
            a.m1945a((C0586c) obj);
            C0721u.m2513a(obj);
        }
        return a;
    }

    /* renamed from: a */
    private void m1998a(C0602b c0602b, C0602b c0602b2) {
        if (c0602b != c0602b2) {
            c0602b.mo487a(false);
            if (c0602b instanceof C0605e) {
                C0728z c0728z = ((C0605e) c0602b).f2627q;
                int i = c0728z.b;
                for (int i2 = 0; i2 < i; i2++) {
                    m1998a((C0602b) c0728z.m2291a(i2), c0602b2);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m1999b(int i, int i2) {
        int i3 = this.f2641b.f3058e;
        int i4 = this.f2641b.f3060g + i3;
        int i5 = this.f2641b.f3059f;
        int d = (Gdx.graphics.mo295d() - 1) - i2;
        return i >= i3 && i < i4 && d >= i5 && d < this.f2641b.f3061h + i5;
    }

    /* renamed from: a */
    public final Vector2 m2000a(Vector2 vector2) {
        C0682c c0682c = this.f2641b;
        c0682c.f3062i.m1709a(vector2.f2337x, vector2.f2338y, 1.0f);
        C0427a c0427a = c0682c.f3055b;
        Vector3 vector3 = c0682c.f3062i;
        float f = (float) c0682c.f3058e;
        float f2 = (float) c0682c.f3059f;
        float f3 = (float) c0682c.f3060g;
        float f4 = (float) c0682c.f3061h;
        float f5 = vector3.f2344x;
        f2 = ((((float) Gdx.graphics.mo295d()) - vector3.f2345y) - 1.0f) - f2;
        vector3.f2344x = (((f5 - f) * 2.0f) / f3) - 1.0f;
        vector3.f2345y = ((2.0f * f2) / f4) - 1.0f;
        vector3.f2346z = (vector3.f2346z * 2.0f) - 1.0f;
        vector3.m1713b(c0427a.f1596g);
        vector2.m1701a(c0682c.f3062i.f2344x, c0682c.f3062i.f2345y);
        return vector2;
    }

    /* renamed from: a */
    public final void m2001a() {
        C0427a c0427a = this.f2641b.f3055b;
        c0427a.mo429a();
        if (this.f2642c.f2611e) {
            C0444a c0444a = this.f2648i;
            c0444a.mo372a(c0427a.f1595f);
            c0444a.mo365a();
            this.f2642c.mo471a(c0444a, 1.0f);
            c0444a.mo374c();
            if (f2640a) {
                if (this.f2658s == null) {
                    this.f2658s = new ShapeRenderer();
                    this.f2658s.f2115f = true;
                }
                if (this.f2660u || this.f2661v || this.f2662w != Debug.none) {
                    m2000a(this.f2650k.m1701a((float) Gdx.input.mo302a(), (float) Gdx.input.mo306b()));
                    C0602b a = m1996a(this.f2650k.f2337x, this.f2650k.f2338y);
                    if (a != null) {
                        C0602b c0602b;
                        if (this.f2661v && a.f2608b != null) {
                            a = a.f2608b;
                        }
                        if (this.f2662w == Debug.none) {
                            a.mo487a(true);
                            c0602b = a;
                        } else {
                            c0602b = a;
                            while (c0602b != null && !(c0602b instanceof Table)) {
                                c0602b = c0602b.f2608b;
                            }
                            if (c0602b != null) {
                                ((Table) c0602b).m2051a(this.f2662w);
                            } else {
                                return;
                            }
                        }
                        if (this.f2659t && (c0602b instanceof C0605e)) {
                            ((C0605e) c0602b).mo493i();
                        }
                        m1998a(this.f2642c, c0602b);
                    } else {
                        return;
                    }
                } else if (this.f2659t) {
                    this.f2642c.mo493i();
                }
                Gdx.gl.glEnable(3042);
                this.f2658s.m1458a(this.f2641b.f3055b.f1595f);
                ShapeRenderer shapeRenderer = this.f2658s;
                if (shapeRenderer.f2115f) {
                    shapeRenderer.m1456a(ShapeType.Line);
                    this.f2642c.mo472a(this.f2658s);
                    this.f2658s.m1451a();
                    return;
                }
                throw new IllegalStateException("autoShapeType must be true to use this method.");
            }
        }
    }

    /* renamed from: a */
    public final void m2002a(float f) {
        int length = this.f2651l.length;
        for (int i = 0; i < length; i++) {
            C0602b c0602b = this.f2651l[i];
            if (this.f2652m[i]) {
                this.f2651l[i] = m1997a(c0602b, this.f2653n[i], this.f2654o[i], i);
            } else if (c0602b != null) {
                this.f2651l[i] = null;
                m2000a(this.f2650k.m1701a((float) this.f2653n[i], (float) this.f2654o[i]));
                Object obj = (InputEvent) C0721u.m2514b(InputEvent.class);
                obj.f2559i = Type.exit;
                obj.f2551a = this;
                obj.f2560j = this.f2650k.f2337x;
                obj.f2561k = this.f2650k.f2338y;
                obj.f2567q = c0602b;
                obj.f2562l = i;
                c0602b.m1945a((C0586c) obj);
                C0721u.m2513a(obj);
            }
        }
        ApplicationType type = Gdx.app.getType();
        if (type == ApplicationType.Desktop || type == ApplicationType.Applet || type == ApplicationType.WebGL) {
            this.f2657r = m1997a(this.f2657r, this.f2655p, this.f2656q, -1);
        }
        this.f2642c.mo470a(f);
    }

    /* renamed from: a */
    public final void m2003a(Rectangle rectangle, Rectangle rectangle2) {
        Matrix4 matrix4;
        this.f2641b.m2380a(this.f2648i.mo379h(), rectangle, rectangle2);
        if (this.f2658s != null) {
            if ((this.f2658s.f2114e != null ? 1 : null) != null) {
                matrix4 = this.f2658s.f2112c;
                this.f2641b.m2380a(matrix4, rectangle, rectangle2);
            }
        }
        matrix4 = this.f2648i.mo379h();
        this.f2641b.m2380a(matrix4, rectangle, rectangle2);
    }

    /* renamed from: a */
    public final void m2004a(C0602b c0602b) {
        this.f2642c.mo510b(c0602b);
    }

    /* renamed from: a */
    public final void m2005a(C0603d c0603d, C0602b c0602b) {
        Object obj = (InputEvent) C0721u.m2514b(InputEvent.class);
        obj.f2551a = this;
        obj.f2559i = Type.touchUp;
        obj.f2560j = -2.14748365E9f;
        obj.f2561k = -2.14748365E9f;
        C0728z c0728z = this.f2645f;
        C0608a[] c0608aArr = (C0608a[]) c0728z.m2540f();
        int i = c0728z.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj2 = c0608aArr[i2];
            if (!(obj2.f2635a == c0603d && obj2.f2636b == c0602b) && c0728z.mo529b(obj2, true)) {
                obj.f2552b = obj2.f2637c;
                obj.f2553c = obj2.f2636b;
                obj.f2562l = obj2.f2638d;
                obj.f2563m = obj2.f2639e;
                obj2.f2635a.mo477a(obj);
            }
        }
        c0728z.m2541g();
        C0721u.m2513a(obj);
    }

    /* renamed from: a */
    public final boolean mo330a(char c) {
        C0602b c0602b = this.f2643d == null ? this.f2642c : this.f2643d;
        Object obj = (InputEvent) C0721u.m2514b(InputEvent.class);
        obj.f2551a = this;
        obj.f2559i = Type.keyTyped;
        obj.f2566p = c;
        c0602b.m1945a((C0586c) obj);
        boolean z = obj.f2556f;
        C0721u.m2513a(obj);
        return z;
    }

    /* renamed from: a */
    public final boolean mo331a(int i) {
        C0602b c0602b = this.f2643d == null ? this.f2642c : this.f2643d;
        Object obj = (InputEvent) C0721u.m2514b(InputEvent.class);
        obj.f2551a = this;
        obj.f2559i = Type.keyDown;
        obj.f2564n = i;
        c0602b.m1945a((C0586c) obj);
        boolean z = obj.f2556f;
        C0721u.m2513a(obj);
        return z;
    }

    /* renamed from: a */
    public final boolean mo332a(int i, int i2) {
        this.f2655p = i;
        this.f2656q = i2;
        if (!m1999b(i, i2)) {
            return false;
        }
        m2000a(this.f2650k.m1701a((float) i, (float) i2));
        Object obj = (InputEvent) C0721u.m2514b(InputEvent.class);
        obj.f2551a = this;
        obj.f2559i = Type.mouseMoved;
        obj.f2560j = this.f2650k.f2337x;
        obj.f2561k = this.f2650k.f2338y;
        C0602b a = m1996a(this.f2650k.f2337x, this.f2650k.f2338y);
        if (a == null) {
            a = this.f2642c;
        }
        a.m1945a((C0586c) obj);
        boolean z = obj.f2556f;
        C0721u.m2513a(obj);
        return z;
    }

    /* renamed from: a */
    public final boolean mo333a(int i, int i2, int i3) {
        int i4 = 0;
        this.f2653n[i3] = i;
        this.f2654o[i3] = i2;
        this.f2655p = i;
        this.f2656q = i2;
        if (this.f2645f.b == 0) {
            return false;
        }
        m2000a(this.f2650k.m1701a((float) i, (float) i2));
        Object obj = (InputEvent) C0721u.m2514b(InputEvent.class);
        obj.f2559i = Type.touchDragged;
        obj.f2551a = this;
        obj.f2560j = this.f2650k.f2337x;
        obj.f2561k = this.f2650k.f2338y;
        obj.f2562l = i3;
        C0728z c0728z = this.f2645f;
        C0608a[] c0608aArr = (C0608a[]) c0728z.m2540f();
        int i5 = c0728z.b;
        while (i4 < i5) {
            C0608a c0608a = c0608aArr[i4];
            if (c0608a.f2638d == i3 && c0728z.m2302b((Object) c0608a)) {
                obj.f2552b = c0608a.f2637c;
                obj.f2553c = c0608a.f2636b;
                if (c0608a.f2635a.mo477a(obj)) {
                    obj.f2556f = true;
                }
            }
            i4++;
        }
        c0728z.m2541g();
        boolean z = obj.f2556f;
        C0721u.m2513a(obj);
        return z;
    }

    /* renamed from: a */
    public final boolean mo334a(int i, int i2, int i3, int i4) {
        if (!m1999b(i, i2)) {
            return false;
        }
        this.f2652m[i3] = true;
        this.f2653n[i3] = i;
        this.f2654o[i3] = i2;
        m2000a(this.f2650k.m1701a((float) i, (float) i2));
        C0586c c0586c = (InputEvent) C0721u.m2514b(InputEvent.class);
        c0586c.f2559i = Type.touchDown;
        c0586c.f2551a = this;
        c0586c.f2560j = this.f2650k.f2337x;
        c0586c.f2561k = this.f2650k.f2338y;
        c0586c.f2562l = i3;
        c0586c.f2563m = i4;
        C0602b a = m1996a(this.f2650k.f2337x, this.f2650k.f2338y);
        if (a != null) {
            a.m1945a(c0586c);
        } else if (this.f2642c.f2610d == Touchable.enabled) {
            this.f2642c.m1945a(c0586c);
        }
        boolean z = c0586c.f2556f;
        C0721u.m2513a((Object) c0586c);
        return z;
    }

    /* renamed from: b */
    public final void dispose() {
        m2014b(null);
        m2017d();
        m2005a(null, null);
        this.f2642c.mo475c();
        if (this.f2649j) {
            this.f2648i.dispose();
        }
    }

    /* renamed from: b */
    public final boolean mo335b(int i) {
        C0602b c0602b = this.f2643d == null ? this.f2642c : this.f2643d;
        Object obj = (InputEvent) C0721u.m2514b(InputEvent.class);
        obj.f2551a = this;
        obj.f2559i = Type.keyUp;
        obj.f2564n = i;
        c0602b.m1945a((C0586c) obj);
        boolean z = obj.f2556f;
        C0721u.m2513a(obj);
        return z;
    }

    /* renamed from: b */
    public final boolean mo336b(int i, int i2, int i3, int i4) {
        int i5 = 0;
        this.f2652m[i3] = false;
        this.f2653n[i3] = i;
        this.f2654o[i3] = i2;
        if (this.f2645f.b == 0) {
            return false;
        }
        m2000a(this.f2650k.m1701a((float) i, (float) i2));
        Object obj = (InputEvent) C0721u.m2514b(InputEvent.class);
        obj.f2559i = Type.touchUp;
        obj.f2551a = this;
        obj.f2560j = this.f2650k.f2337x;
        obj.f2561k = this.f2650k.f2338y;
        obj.f2562l = i3;
        obj.f2563m = i4;
        C0728z c0728z = this.f2645f;
        C0608a[] c0608aArr = (C0608a[]) c0728z.m2540f();
        int i6 = c0728z.b;
        while (i5 < i6) {
            Object obj2 = c0608aArr[i5];
            if (obj2.f2638d == i3 && obj2.f2639e == i4 && c0728z.mo529b(obj2, true)) {
                obj.f2552b = obj2.f2637c;
                obj.f2553c = obj2.f2636b;
                if (obj2.f2635a.mo477a(obj)) {
                    obj.f2556f = true;
                }
                C0721u.m2513a(obj2);
            }
            i5++;
        }
        c0728z.m2541g();
        boolean z = obj.f2556f;
        C0721u.m2513a(obj);
        return z;
    }

    /* renamed from: b */
    public final boolean m2014b(C0602b c0602b) {
        if (this.f2644e == c0602b) {
            return true;
        }
        Object obj = (FocusEvent) C0721u.m2514b(FocusEvent.class);
        obj.f2551a = this;
        obj.f2914j = FocusEvent.Type.scroll;
        C0602b c0602b2 = this.f2644e;
        if (c0602b2 != null) {
            obj.f2913i = false;
            obj.f2915k = c0602b;
            c0602b2.m1945a((C0586c) obj);
        }
        boolean z = !obj.f2558h;
        if (z) {
            this.f2644e = c0602b;
            if (c0602b != null) {
                obj.f2913i = true;
                obj.f2915k = c0602b2;
                c0602b.m1945a((C0586c) obj);
                z = !obj.f2558h;
                if (!z) {
                    this.f2644e = c0602b2;
                }
            }
        }
        C0721u.m2513a(obj);
        return z;
    }

    /* renamed from: c */
    public final void m2015c() {
        m2002a(Math.min(Gdx.graphics.getDeltaTime(), 0.033333335f));
    }

    /* renamed from: c */
    public final boolean mo337c(int i) {
        C0602b c0602b = this.f2644e == null ? this.f2642c : this.f2644e;
        m2000a(this.f2650k.m1701a((float) this.f2655p, (float) this.f2656q));
        Object obj = (InputEvent) C0721u.m2514b(InputEvent.class);
        obj.f2551a = this;
        obj.f2559i = Type.scrolled;
        obj.f2565o = i;
        obj.f2560j = this.f2650k.f2337x;
        obj.f2561k = this.f2650k.f2338y;
        c0602b.m1945a((C0586c) obj);
        boolean z = obj.f2556f;
        C0721u.m2513a(obj);
        return z;
    }

    /* renamed from: d */
    public final boolean m2017d() {
        boolean z = true;
        if (this.f2643d == null) {
            return true;
        }
        Object obj = (FocusEvent) C0721u.m2514b(FocusEvent.class);
        obj.f2551a = this;
        obj.f2914j = FocusEvent.Type.keyboard;
        C0602b c0602b = this.f2643d;
        if (c0602b != null) {
            obj.f2913i = false;
            obj.f2915k = null;
            c0602b.m1945a((C0586c) obj);
        }
        if (obj.f2558h) {
            z = false;
        }
        if (z) {
            this.f2643d = null;
        }
        C0721u.m2513a(obj);
        return z;
    }
}
