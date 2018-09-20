package com.badlogic.gdx.graphics.p019a.p022c;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.Iterator;

/* renamed from: com.badlogic.gdx.graphics.a.c.c */
public class C0405c {
    /* renamed from: a */
    public String f1519a;
    /* renamed from: b */
    public boolean f1520b = true;
    /* renamed from: c */
    public boolean f1521c;
    /* renamed from: d */
    public final Vector3 f1522d = new Vector3();
    /* renamed from: e */
    public final Quaternion f1523e = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
    /* renamed from: f */
    public final Vector3 f1524f = new Vector3(1.0f, 1.0f, 1.0f);
    /* renamed from: g */
    public final Matrix4 f1525g = new Matrix4();
    /* renamed from: h */
    public final Matrix4 f1526h = new Matrix4();
    /* renamed from: i */
    public C0676a<C0408f> f1527i = new C0676a(2);
    /* renamed from: j */
    protected C0405c f1528j;
    /* renamed from: k */
    private final C0676a<C0405c> f1529k = new C0676a(2);

    /* renamed from: a */
    public static C0405c m1175a(C0676a<C0405c> c0676a, String str, boolean z) {
        C0405c c0405c;
        int i = 0;
        int i2 = c0676a.f3001b;
        int i3;
        if (z) {
            for (i3 = 0; i3 < i2; i3++) {
                c0405c = (C0405c) c0676a.m2291a(i3);
                if (c0405c.f1519a.equalsIgnoreCase(str)) {
                    return c0405c;
                }
            }
        } else {
            for (i3 = 0; i3 < i2; i3++) {
                c0405c = (C0405c) c0676a.m2291a(i3);
                if (c0405c.f1519a.equals(str)) {
                    return c0405c;
                }
            }
        }
        while (i < i2) {
            c0405c = C0405c.m1175a(((C0405c) c0676a.m2291a(i)).f1529k, str, z);
            if (c0405c != null) {
                return c0405c;
            }
            i++;
        }
        return null;
    }

    /* renamed from: a */
    public final <T extends C0405c> int m1176a(T t) {
        boolean z = true;
        for (T t2 = this; t2 != null; t2 = t2.f1528j) {
            if (t2 == t) {
                throw new GdxRuntimeException("Cannot add a parent as a child");
            }
        }
        C0405c c0405c = t.f1528j;
        if (c0405c != null) {
            if (c0405c.f1529k.mo529b((Object) t, true)) {
                t.f1528j = null;
            } else {
                z = false;
            }
            if (!z) {
                throw new GdxRuntimeException("Could not remove child from its current parent");
            }
        }
        int i = this.f1529k.f3001b;
        this.f1529k.m2296a((Object) t);
        t.f1528j = this;
        return i;
    }

    /* renamed from: a */
    public final void m1177a() {
        if (!this.f1521c) {
            Matrix4 matrix4 = this.f1525g;
            Vector3 vector3 = this.f1522d;
            Quaternion quaternion = this.f1523e;
            Vector3 vector32 = this.f1524f;
            float f = vector3.f2344x;
            float f2 = vector3.f2345y;
            float f3 = vector3.f2346z;
            float f4 = quaternion.f2327x;
            float f5 = quaternion.f2328y;
            float f6 = quaternion.f2329z;
            float f7 = quaternion.f2326w;
            float f8 = vector32.f2344x;
            float f9 = vector32.f2345y;
            float f10 = vector32.f2346z;
            float f11 = 2.0f * f4;
            float f12 = 2.0f * f5;
            float f13 = 2.0f * f6;
            float f14 = f7 * f11;
            float f15 = f7 * f12;
            f7 *= f13;
            f11 *= f4;
            float f16 = f4 * f12;
            f4 *= f13;
            f12 *= f5;
            f5 *= f13;
            f6 *= f13;
            matrix4.val[0] = (1.0f - (f12 + f6)) * f8;
            matrix4.val[4] = (f16 - f7) * f9;
            matrix4.val[8] = (f4 + f15) * f10;
            matrix4.val[12] = f;
            matrix4.val[1] = (f7 + f16) * f8;
            matrix4.val[5] = (1.0f - (f6 + f11)) * f9;
            matrix4.val[9] = (f5 - f14) * f10;
            matrix4.val[13] = f2;
            matrix4.val[2] = (f4 - f15) * f8;
            matrix4.val[6] = (f5 + f14) * f9;
            matrix4.val[10] = f10 * (1.0f - (f11 + f12));
            matrix4.val[14] = f3;
            matrix4.val[3] = 0.0f;
            matrix4.val[7] = 0.0f;
            matrix4.val[11] = 0.0f;
            matrix4.val[15] = 1.0f;
        }
        if (!this.f1520b || this.f1528j == null) {
            this.f1526h.m1691a(this.f1525g);
        } else {
            this.f1526h.m1691a(this.f1528j.f1526h).m1693b(this.f1525g);
        }
        Iterator it = this.f1529k.iterator();
        while (it.hasNext()) {
            ((C0405c) it.next()).m1177a();
        }
    }

    /* renamed from: b */
    public final void m1178b() {
        Iterator it = this.f1527i.iterator();
        while (it.hasNext()) {
            C0408f c0408f = (C0408f) it.next();
            if (!(c0408f.f1538c == null || c0408f.f1539d == null || c0408f.f1538c.f3067c != c0408f.f1539d.length)) {
                int i = c0408f.f1538c.f3067c;
                for (int i2 = 0; i2 < i; i2++) {
                    c0408f.f1539d[i2].m1691a(((C0405c[]) c0408f.f1538c.f3065a)[i2].f1526h).m1693b(((Matrix4[]) c0408f.f1538c.f3066b)[i2]);
                }
            }
        }
        Iterator it2 = this.f1529k.iterator();
        while (it2.hasNext()) {
            ((C0405c) it2.next()).m1178b();
        }
    }
}
