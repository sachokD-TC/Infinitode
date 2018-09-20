package com.badlogic.gdx.scenes.scene2d;

import com.badlogic.gdx.graphics.g2d.C0444a;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Affine2;
import com.badlogic.gdx.math.C0549f;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.C0609g.C0608a;
import com.badlogic.gdx.scenes.scene2d.InputEvent.Type;
import com.badlogic.gdx.scenes.scene2d.utils.C0604e;
import com.badlogic.gdx.utils.C0721u;
import com.badlogic.gdx.utils.C0728z;
import java.util.Iterator;

/* renamed from: com.badlogic.gdx.scenes.scene2d.e */
public class C0605e extends C0602b implements C0604e {
    /* renamed from: s */
    private static final Vector2 f2626s = new Vector2();
    /* renamed from: q */
    public final C0728z<C0602b> f2627q = new C0728z(C0602b.class);
    /* renamed from: r */
    public boolean f2628r = true;
    /* renamed from: t */
    private final Affine2 f2629t = new Affine2();
    /* renamed from: u */
    private final Matrix4 f2630u = new Matrix4();
    /* renamed from: v */
    private final Matrix4 f2631v = new Matrix4();
    /* renamed from: w */
    private Rectangle f2632w;

    /* renamed from: a */
    private void m1965a(StringBuilder stringBuilder, int i) {
        stringBuilder.append(super.toString());
        stringBuilder.append('\n');
        C0602b[] c0602bArr = (C0602b[]) this.f2627q.m2540f();
        int i2 = this.f2627q.b;
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                stringBuilder.append("|  ");
            }
            Object obj = c0602bArr[i3];
            if (obj instanceof C0605e) {
                ((C0605e) obj).m1965a(stringBuilder, i + 1);
            } else {
                stringBuilder.append(obj);
                stringBuilder.append('\n');
            }
        }
        this.f2627q.m2541g();
    }

    /* renamed from: a */
    private void mo501a(boolean z, boolean z2) {
        mo487a(z);
        if (z2) {
            Iterator it = this.f2627q.iterator();
            while (it.hasNext()) {
                C0602b c0602b = (C0602b) it.next();
                if (c0602b instanceof C0605e) {
                    ((C0605e) c0602b).mo501a(z, z2);
                } else {
                    c0602b.mo487a(z);
                }
            }
        }
    }

    /* renamed from: a */
    public C0602b mo469a(float f, float f2, boolean z) {
        if (z && this.f2610d == Touchable.disabled) {
            return null;
        }
        Vector2 vector2 = f2626s;
        C0602b[] c0602bArr = (C0602b[]) this.f2627q.a;
        for (int i = this.f2627q.b - 1; i >= 0; i--) {
            C0602b c0602b = c0602bArr[i];
            if (c0602b.f2611e) {
                c0602b.m1948b(vector2.m1701a(f, f2));
                c0602b = c0602b.mo469a(vector2.f2337x, vector2.f2338y, z);
                if (c0602b != null) {
                    return c0602b;
                }
            }
        }
        return super.mo469a(f, f2, z);
    }

    /* renamed from: a */
    public void mo470a(float f) {
        super.mo470a(f);
        C0602b[] c0602bArr = (C0602b[]) this.f2627q.m2540f();
        int i = this.f2627q.b;
        for (int i2 = 0; i2 < i; i2++) {
            c0602bArr[i2].mo470a(f);
        }
        this.f2627q.m2541g();
    }

    /* renamed from: a */
    public final void m1969a(C0444a c0444a) {
        c0444a.mo373b(this.f2631v);
    }

    /* renamed from: a */
    public void mo471a(C0444a c0444a, float f) {
        if (this.f2628r) {
            m1971a(c0444a, m1983f());
        }
        m1977b(c0444a, f);
        if (this.f2628r) {
            m1969a(c0444a);
        }
    }

    /* renamed from: a */
    public final void m1971a(C0444a c0444a, Matrix4 matrix4) {
        this.f2631v.m1691a(c0444a.mo379h());
        c0444a.mo373b(matrix4);
    }

    /* renamed from: a */
    public void mo472a(ShapeRenderer shapeRenderer) {
        mo489b(shapeRenderer);
        if (this.f2628r) {
            m1973a(shapeRenderer, m1983f());
        }
        m1980c(shapeRenderer);
        if (this.f2628r) {
            m1982d(shapeRenderer);
        }
    }

    /* renamed from: a */
    public final void m1973a(ShapeRenderer shapeRenderer, Matrix4 matrix4) {
        this.f2631v.m1691a(shapeRenderer.f2112c);
        shapeRenderer.m1462b(matrix4);
    }

    /* renamed from: a */
    public final void mo473a(Rectangle rectangle) {
        this.f2632w = rectangle;
    }

    /* renamed from: a */
    protected final void mo474a(C0609g c0609g) {
        super.mo474a(c0609g);
        C0602b[] c0602bArr = (C0602b[]) this.f2627q.a;
        int i = this.f2627q.b;
        for (int i2 = 0; i2 < i; i2++) {
            c0602bArr[i2].mo474a(c0609g);
        }
    }

    /* renamed from: a */
    public boolean mo488a(C0602b c0602b, boolean z) {
        int i = 0;
        if (!this.f2627q.mo529b((Object) c0602b, true)) {
            return false;
        }
        if (z) {
            C0609g c0609g = this.f2607a;
            if (c0609g != null) {
                Object obj = (InputEvent) C0721u.m2514b(InputEvent.class);
                obj.f2551a = c0609g;
                obj.f2559i = Type.touchUp;
                obj.f2560j = -2.14748365E9f;
                obj.f2561k = -2.14748365E9f;
                C0728z c0728z = c0609g.f2645f;
                C0608a[] c0608aArr = (C0608a[]) c0728z.m2540f();
                int i2 = c0728z.b;
                while (i < i2) {
                    Object obj2 = c0608aArr[i];
                    if (obj2.f2636b == c0602b && c0728z.mo529b(obj2, true)) {
                        obj.f2552b = obj2.f2637c;
                        obj.f2553c = obj2.f2636b;
                        obj.f2562l = obj2.f2638d;
                        obj.f2563m = obj2.f2639e;
                        obj2.f2635a.mo477a(obj);
                    }
                    i++;
                }
                c0728z.m2541g();
                C0721u.m2513a(obj);
                if (c0609g.f2644e != null && c0609g.f2644e.m1944a(c0602b)) {
                    c0609g.m2014b(null);
                }
                if (c0609g.f2643d != null && c0609g.f2643d.m1944a(c0602b)) {
                    c0609g.m2017d();
                }
            }
        }
        c0602b.f2608b = null;
        c0602b.mo474a(null);
        mo481g();
        return true;
    }

    /* renamed from: b */
    public final void m1977b(C0444a c0444a, float f) {
        float f2 = f * this.p.f1647L;
        C0728z c0728z = this.f2627q;
        C0602b[] c0602bArr = (C0602b[]) c0728z.m2540f();
        Rectangle rectangle = this.f2632w;
        float f3;
        float f4;
        int i;
        float f5;
        float f6;
        if (rectangle != null) {
            f3 = rectangle.f2332x;
            f4 = rectangle.width + f3;
            float f7 = rectangle.f2333y;
            float f8 = f7 + rectangle.height;
            if (this.f2628r) {
                int i2 = c0728z.b;
                for (i = 0; i < i2; i++) {
                    C0602b c0602b = c0602bArr[i];
                    if (c0602b.f2611e) {
                        float f9 = c0602b.f2613g;
                        float f10 = c0602b.f2614h;
                        if (f9 <= f4 && f10 <= f8 && f9 + c0602b.f2615i >= f3 && c0602b.f2616j + f10 >= f7) {
                            c0602b.mo471a(c0444a, f2);
                        }
                    }
                }
            } else {
                f5 = this.g;
                f6 = this.h;
                this.g = 0.0f;
                this.h = 0.0f;
                int i3 = c0728z.b;
                for (i = 0; i < i3; i++) {
                    C0602b c0602b2 = c0602bArr[i];
                    if (c0602b2.f2611e) {
                        float f11 = c0602b2.f2613g;
                        float f12 = c0602b2.f2614h;
                        if (f11 <= f4 && f12 <= f8 && c0602b2.f2615i + f11 >= f3 && c0602b2.f2616j + f12 >= f7) {
                            c0602b2.f2613g = f11 + f5;
                            c0602b2.f2614h = f12 + f6;
                            c0602b2.mo471a(c0444a, f2);
                            c0602b2.f2613g = f11;
                            c0602b2.f2614h = f12;
                        }
                    }
                }
                this.g = f5;
                this.h = f6;
            }
        } else if (this.f2628r) {
            int i4 = c0728z.b;
            for (i = 0; i < i4; i++) {
                C0602b c0602b3 = c0602bArr[i];
                if (c0602b3.f2611e) {
                    c0602b3.mo471a(c0444a, f2);
                }
            }
        } else {
            f3 = this.g;
            f4 = this.h;
            this.g = 0.0f;
            this.h = 0.0f;
            int i5 = c0728z.b;
            for (i = 0; i < i5; i++) {
                C0602b c0602b4 = c0602bArr[i];
                if (c0602b4.f2611e) {
                    f5 = c0602b4.f2613g;
                    f6 = c0602b4.f2614h;
                    c0602b4.f2613g = f5 + f3;
                    c0602b4.f2614h = f6 + f4;
                    c0602b4.mo471a(c0444a, f2);
                    c0602b4.f2613g = f5;
                    c0602b4.f2614h = f6;
                }
            }
            this.g = f3;
            this.h = f4;
        }
        c0728z.m2541g();
    }

    /* renamed from: b */
    public void mo510b(C0602b c0602b) {
        if (c0602b.f2608b != null) {
            if (c0602b.f2608b != this) {
                c0602b.f2608b.mo488a(c0602b, false);
            } else {
                return;
            }
        }
        this.f2627q.m2296a((Object) c0602b);
        c0602b.f2608b = this;
        c0602b.mo474a(this.f2607a);
        mo481g();
    }

    /* renamed from: c */
    public final void mo475c() {
        super.mo475c();
        mo492h();
    }

    /* renamed from: c */
    public final void m1980c(ShapeRenderer shapeRenderer) {
        int i = 0;
        C0728z c0728z = this.f2627q;
        C0602b[] c0602bArr = (C0602b[]) c0728z.m2540f();
        if (this.f2628r) {
            int i2 = c0728z.b;
            while (i < i2) {
                C0602b c0602b = c0602bArr[i];
                if (c0602b.f2611e && (c0602b.f2612f || (c0602b instanceof C0605e))) {
                    c0602b.mo472a(shapeRenderer);
                }
                i++;
            }
            shapeRenderer.m1463c();
        } else {
            float f = this.g;
            float f2 = this.h;
            this.g = 0.0f;
            this.h = 0.0f;
            int i3 = c0728z.b;
            while (i < i3) {
                C0602b c0602b2 = c0602bArr[i];
                if (c0602b2.f2611e && (c0602b2.f2612f || (c0602b2 instanceof C0605e))) {
                    float f3 = c0602b2.f2613g;
                    float f4 = c0602b2.f2614h;
                    c0602b2.f2613g = f3 + f;
                    c0602b2.f2614h = f4 + f2;
                    c0602b2.mo472a(shapeRenderer);
                    c0602b2.f2613g = f3;
                    c0602b2.f2614h = f4;
                }
                i++;
            }
            this.g = f;
            this.h = f2;
        }
        c0728z.m2541g();
    }

    /* renamed from: c */
    public boolean mo490c(C0602b c0602b) {
        return mo488a(c0602b, true);
    }

    /* renamed from: d */
    public final void m1982d(ShapeRenderer shapeRenderer) {
        shapeRenderer.m1462b(this.f2631v);
    }

    /* renamed from: f */
    public final Matrix4 m1983f() {
        Affine2 affine2 = this.f2629t;
        float f = this.k;
        float f2 = this.l;
        float f3 = this.g + f;
        float f4 = this.h + f2;
        float f5 = this.o;
        float f6 = this.m;
        float f7 = this.n;
        affine2.m02 = f3;
        affine2.m12 = f4;
        if (f5 == 0.0f) {
            affine2.m00 = f6;
            affine2.m01 = 0.0f;
            affine2.m10 = 0.0f;
            affine2.m11 = f7;
        } else {
            f3 = C0549f.m1769c(f5);
            f4 = C0549f.m1771d(f5);
            affine2.m00 = f4 * f6;
            affine2.m01 = (-f3) * f7;
            affine2.m10 = f3 * f6;
            affine2.m11 = f4 * f7;
        }
        if (!(f == 0.0f && f2 == 0.0f)) {
            f = -f;
            f2 = -f2;
            affine2.m02 += (affine2.m00 * f) + (affine2.m01 * f2);
            affine2.m12 = ((f * affine2.m10) + (f2 * affine2.m11)) + affine2.m12;
        }
        C0605e c0605e = this.b;
        while (c0605e != null && !c0605e.f2628r) {
            c0605e = c0605e.b;
        }
        if (c0605e != null) {
            Affine2 affine22 = c0605e.f2629t;
            f2 = (affine22.m00 * affine2.m00) + (affine22.m01 * affine2.m10);
            f3 = (affine22.m00 * affine2.m01) + (affine22.m01 * affine2.m11);
            f4 = ((affine22.m00 * affine2.m02) + (affine22.m01 * affine2.m12)) + affine22.m02;
            f5 = (affine22.m10 * affine2.m00) + (affine22.m11 * affine2.m10);
            f6 = (affine22.m10 * affine2.m01) + (affine22.m11 * affine2.m11);
            f = affine22.m12 + ((affine22.m10 * affine2.m02) + (affine22.m11 * affine2.m12));
            affine2.m00 = f2;
            affine2.m01 = f3;
            affine2.m02 = f4;
            affine2.m10 = f5;
            affine2.m11 = f6;
            affine2.m12 = f;
        }
        Matrix4 matrix4 = this.f2630u;
        matrix4.val[0] = affine2.m00;
        matrix4.val[1] = affine2.m10;
        matrix4.val[2] = 0.0f;
        matrix4.val[3] = 0.0f;
        matrix4.val[4] = affine2.m01;
        matrix4.val[5] = affine2.m11;
        matrix4.val[6] = 0.0f;
        matrix4.val[7] = 0.0f;
        matrix4.val[8] = 0.0f;
        matrix4.val[9] = 0.0f;
        matrix4.val[10] = 1.0f;
        matrix4.val[11] = 0.0f;
        matrix4.val[12] = affine2.m02;
        matrix4.val[13] = affine2.m12;
        matrix4.val[14] = 0.0f;
        matrix4.val[15] = 1.0f;
        return this.f2630u;
    }

    /* renamed from: g */
    public void mo481g() {
    }

    /* renamed from: h */
    public void mo492h() {
        C0602b[] c0602bArr = (C0602b[]) this.f2627q.m2540f();
        int i = this.f2627q.b;
        for (int i2 = 0; i2 < i; i2++) {
            C0602b c0602b = c0602bArr[i2];
            c0602b.mo474a(null);
            c0602b.f2608b = null;
        }
        this.f2627q.m2541g();
        this.f2627q.mo530d();
        mo481g();
    }

    /* renamed from: i */
    public C0605e mo493i() {
        mo501a(true, true);
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        m1965a(stringBuilder, 1);
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
