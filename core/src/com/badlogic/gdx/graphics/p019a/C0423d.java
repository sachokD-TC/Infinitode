package com.badlogic.gdx.graphics.p019a;

import com.badlogic.gdx.graphics.C0380h;
import com.badlogic.gdx.graphics.C0512m;
import com.badlogic.gdx.graphics.C0515n;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.p019a.p020a.C0383a;
import com.badlogic.gdx.graphics.p019a.p020a.C0384b;
import com.badlogic.gdx.graphics.p019a.p020a.C0385c;
import com.badlogic.gdx.graphics.p019a.p020a.C0386d;
import com.badlogic.gdx.graphics.p019a.p022c.C0403a;
import com.badlogic.gdx.graphics.p019a.p022c.C0404b;
import com.badlogic.gdx.graphics.p019a.p022c.C0405c;
import com.badlogic.gdx.graphics.p019a.p022c.C0406d;
import com.badlogic.gdx.graphics.p019a.p022c.C0407e;
import com.badlogic.gdx.graphics.p019a.p022c.C0408f;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0393a;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0394b;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0395c;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0396d;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0397e;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0398f;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0399g;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0400h;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0401i;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0402j;
import com.badlogic.gdx.graphics.p019a.p029e.C0424a;
import com.badlogic.gdx.graphics.p019a.p029e.C0425b;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0685b;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.C0710q.C0707b;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Iterator;

/* renamed from: com.badlogic.gdx.graphics.a.d */
public class C0423d implements Disposable {
    /* renamed from: a */
    public final C0676a<C0409c> f1577a = new C0676a();
    /* renamed from: b */
    public final C0676a<C0405c> f1578b = new C0676a();
    /* renamed from: c */
    public final C0676a<C0403a> f1579c = new C0676a();
    /* renamed from: d */
    public final C0676a<Mesh> f1580d = new C0676a();
    /* renamed from: e */
    public final C0676a<C0404b> f1581e = new C0676a();
    /* renamed from: f */
    protected final C0676a<Disposable> f1582f = new C0676a();
    /* renamed from: g */
    private C0710q<C0408f, C0685b<String, Matrix4>> f1583g = new C0710q();

    public C0423d(C0394b c0394b, C0425b c0425b) {
        m1200c(c0394b.f1466c);
        m1197a(c0394b.f1467d, c0425b);
        m1198b(c0394b.f1468e);
        m1196a(c0394b.f1469f);
        m1199c();
    }

    /* renamed from: a */
    private C0405c m1194a(C0398f c0398f) {
        C0405c c0405c = new C0405c();
        c0405c.f1519a = c0398f.f1486a;
        if (c0398f.f1487b != null) {
            c0405c.f1522d.m1711a(c0398f.f1487b);
        }
        if (c0398f.f1488c != null) {
            c0405c.f1523e.m1696a(c0398f.f1488c);
        }
        if (c0398f.f1489d != null) {
            c0405c.f1524f.m1711a(c0398f.f1489d);
        }
        if (c0398f.f1491f != null) {
            for (C0401i c0401i : c0398f.f1491f) {
                C0404b c0404b;
                C0409c c0409c;
                if (c0401i.f1500b != null) {
                    Iterator it = this.f1581e.iterator();
                    while (it.hasNext()) {
                        C0404b c0404b2 = (C0404b) it.next();
                        if (c0401i.f1500b.equals(c0404b2.f1511a)) {
                            c0404b = c0404b2;
                            break;
                        }
                    }
                }
                c0404b = null;
                if (c0401i.f1499a != null) {
                    Iterator it2 = this.f1577a.iterator();
                    while (it2.hasNext()) {
                        c0409c = (C0409c) it2.next();
                        if (c0401i.f1499a.equals(c0409c.f1542d)) {
                            break;
                        }
                    }
                }
                c0409c = null;
                if (c0404b == null || c0409c == null) {
                    throw new GdxRuntimeException("Invalid node: " + c0405c.f1519a);
                }
                if (!(c0404b == null || c0409c == null)) {
                    Object c0408f = new C0408f();
                    c0408f.f1536a = c0404b;
                    c0408f.f1537b = c0409c;
                    c0405c.f1527i.m2296a(c0408f);
                    if (c0401i.f1501c != null) {
                        this.f1583g.mo542a(c0408f, c0401i.f1501c);
                    }
                }
            }
        }
        if (c0398f.f1492g != null) {
            for (C0398f a : c0398f.f1492g) {
                c0405c.m1176a(m1194a(a));
            }
        }
        return c0405c;
    }

    /* renamed from: a */
    private C0405c m1195a(String str) {
        return C0405c.m1175a(this.f1578b, str, false);
    }

    /* renamed from: a */
    private void m1196a(Iterable<C0393a> iterable) {
        for (C0393a c0393a : iterable) {
            Object c0403a = new C0403a();
            c0403a.f1507a = c0393a.f1462a;
            Iterator it = c0393a.f1463b.iterator();
            while (it.hasNext()) {
                C0399g c0399g = (C0399g) it.next();
                C0405c a = m1195a(c0399g.f1493a);
                if (a != null) {
                    Iterator it2;
                    C0400h c0400h;
                    Object c0406d = new C0406d();
                    c0406d.f1530a = a;
                    if (c0399g.f1494b != null) {
                        c0406d.f1531b = new C0676a();
                        c0406d.f1531b.m2305c(c0399g.f1494b.f3001b);
                        it2 = c0399g.f1494b.iterator();
                        while (it2.hasNext()) {
                            c0400h = (C0400h) it2.next();
                            if (c0400h.f1497a > c0403a.f1508b) {
                                c0403a.f1508b = c0400h.f1497a;
                            }
                            c0406d.f1531b.m2296a(new C0407e(c0400h.f1497a, new Vector3(c0400h.f1498b == null ? a.f1522d : (Vector3) c0400h.f1498b)));
                        }
                    }
                    if (c0399g.f1495c != null) {
                        c0406d.f1532c = new C0676a();
                        c0406d.f1532c.m2305c(c0399g.f1495c.f3001b);
                        it2 = c0399g.f1495c.iterator();
                        while (it2.hasNext()) {
                            c0400h = (C0400h) it2.next();
                            if (c0400h.f1497a > c0403a.f1508b) {
                                c0403a.f1508b = c0400h.f1497a;
                            }
                            c0406d.f1532c.m2296a(new C0407e(c0400h.f1497a, new Quaternion(c0400h.f1498b == null ? a.f1523e : (Quaternion) c0400h.f1498b)));
                        }
                    }
                    if (c0399g.f1496d != null) {
                        c0406d.f1533d = new C0676a();
                        c0406d.f1533d.m2305c(c0399g.f1496d.f3001b);
                        Iterator it3 = c0399g.f1496d.iterator();
                        while (it3.hasNext()) {
                            C0400h c0400h2 = (C0400h) it3.next();
                            if (c0400h2.f1497a > c0403a.f1508b) {
                                c0403a.f1508b = c0400h2.f1497a;
                            }
                            c0406d.f1533d.m2296a(new C0407e(c0400h2.f1497a, new Vector3(c0400h2.f1498b == null ? a.f1524f : (Vector3) c0400h2.f1498b)));
                        }
                    }
                    if ((c0406d.f1531b != null && c0406d.f1531b.f3001b > 0) || ((c0406d.f1532c != null && c0406d.f1532c.f3001b > 0) || (c0406d.f1533d != null && c0406d.f1533d.f3001b > 0))) {
                        c0403a.f1509c.m2296a(c0406d);
                    }
                }
            }
            if (c0403a.f1509c.f3001b > 0) {
                this.f1579c.m2296a(c0403a);
            }
        }
    }

    /* renamed from: a */
    private void m1197a(Iterable<C0395c> iterable, C0425b c0425b) {
        for (C0395c c0395c : iterable) {
            C0676a c0676a = this.f1577a;
            Object c0409c = new C0409c();
            c0409c.f1542d = c0395c.f1470a;
            if (c0395c.f1471b != null) {
                c0409c.m1174a(new C0384b(C0384b.f1418d, c0395c.f1471b));
            }
            if (c0395c.f1472c != null) {
                c0409c.m1174a(new C0384b(C0384b.f1416b, c0395c.f1472c));
            }
            if (c0395c.f1473d != null) {
                c0409c.m1174a(new C0384b(C0384b.f1417c, c0395c.f1473d));
            }
            if (c0395c.f1474e != null) {
                c0409c.m1174a(new C0384b(C0384b.f1419e, c0395c.f1474e));
            }
            if (c0395c.f1475f != null) {
                c0409c.m1174a(new C0384b(C0384b.f1420f, c0395c.f1475f));
            }
            if (c0395c.f1476g > 0.0f) {
                c0409c.m1174a(new C0385c(C0385c.f1425b, c0395c.f1476g));
            }
            if (c0395c.f1477h != 1.0f) {
                c0409c.m1174a(new C0383a(c0395c.f1477h, (byte) 0));
            }
            C0710q c0710q = new C0710q();
            if (c0395c.f1478i != null) {
                Iterator it = c0395c.f1478i.iterator();
                while (it.hasNext()) {
                    C0380h c0380h;
                    C0402j c0402j = (C0402j) it.next();
                    if (c0710q.m2474c(c0402j.f1503b)) {
                        c0380h = (Texture) c0710q.m2467a(c0402j.f1503b);
                    } else {
                        Object a = c0425b.mo351a(c0402j.f1503b);
                        c0710q.mo542a(c0402j.f1503b, a);
                        this.f1582f.m2296a(a);
                    }
                    C0424a c0424a = new C0424a(c0380h, (byte) 0);
                    c0424a.f1585b = c0380h.m1132e();
                    c0424a.f1586c = c0380h.m1133f();
                    c0424a.f1587d = c0380h.m1134g();
                    c0424a.f1588e = c0380h.m1135h();
                    float f = c0402j.f1504c == null ? 0.0f : c0402j.f1504c.f2337x;
                    float f2 = c0402j.f1504c == null ? 0.0f : c0402j.f1504c.f2338y;
                    float f3 = c0402j.f1505d == null ? 1.0f : c0402j.f1505d.f2337x;
                    float f4 = c0402j.f1505d == null ? 1.0f : c0402j.f1505d.f2338y;
                    switch (c0402j.f1506e) {
                        case 2:
                            c0409c.m1174a(new C0386d(C0386d.f1428b, c0424a, f, f2, f3, f4, (byte) 0));
                            break;
                        case 3:
                            c0409c.m1174a(new C0386d(C0386d.f1433g, c0424a, f, f2, f3, f4, (byte) 0));
                            break;
                        case 4:
                            c0409c.m1174a(new C0386d(C0386d.f1432f, c0424a, f, f2, f3, f4, (byte) 0));
                            break;
                        case 5:
                            c0409c.m1174a(new C0386d(C0386d.f1429c, c0424a, f, f2, f3, f4, (byte) 0));
                            break;
                        case 7:
                            c0409c.m1174a(new C0386d(C0386d.f1431e, c0424a, f, f2, f3, f4, (byte) 0));
                            break;
                        case 8:
                            c0409c.m1174a(new C0386d(C0386d.f1430d, c0424a, f, f2, f3, f4, (byte) 0));
                            break;
                        case 10:
                            c0409c.m1174a(new C0386d(C0386d.f1434h, c0424a, f, f2, f3, f4, (byte) 0));
                            break;
                        default:
                            break;
                    }
                }
            }
            c0676a.m2296a(c0409c);
        }
    }

    /* renamed from: b */
    private void m1198b(Iterable<C0398f> iterable) {
        this.f1583g.mo543a();
        for (C0398f a : iterable) {
            this.f1578b.m2296a(m1194a(a));
        }
        Iterator c = this.f1583g.mo546c();
        while (c.hasNext()) {
            C0707b c0707b = (C0707b) c.next();
            if (((C0408f) c0707b.f3163a).f1538c == null) {
                ((C0408f) c0707b.f3163a).f1538c = new C0685b(C0405c.class, Matrix4.class);
            }
            C0685b c0685b = ((C0408f) c0707b.f3163a).f1538c;
            Object[] objArr = c0685b.f3065a;
            Object[] objArr2 = c0685b.f3066b;
            int i = c0685b.f3067c;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
                objArr2[i2] = null;
            }
            c0685b.f3067c = 0;
            Iterator it = ((C0685b) c0707b.f3164b).m2385a().iterator();
            while (it.hasNext()) {
                C0707b c0707b2 = (C0707b) it.next();
                C0685b c0685b2 = ((C0408f) c0707b.f3163a).f1538c;
                C0405c a2 = m1195a((String) c0707b2.f3163a);
                Matrix4 matrix4 = new Matrix4((Matrix4) c0707b2.f3164b);
                float f = (((((((((((((((((((((((((matrix4.val[3] * matrix4.val[6]) * matrix4.val[9]) * matrix4.val[12]) - (((matrix4.val[2] * matrix4.val[7]) * matrix4.val[9]) * matrix4.val[12])) - (((matrix4.val[3] * matrix4.val[5]) * matrix4.val[10]) * matrix4.val[12])) + (((matrix4.val[1] * matrix4.val[7]) * matrix4.val[10]) * matrix4.val[12])) + (((matrix4.val[2] * matrix4.val[5]) * matrix4.val[11]) * matrix4.val[12])) - (((matrix4.val[1] * matrix4.val[6]) * matrix4.val[11]) * matrix4.val[12])) - (((matrix4.val[3] * matrix4.val[6]) * matrix4.val[8]) * matrix4.val[13])) + (((matrix4.val[2] * matrix4.val[7]) * matrix4.val[8]) * matrix4.val[13])) + (((matrix4.val[3] * matrix4.val[4]) * matrix4.val[10]) * matrix4.val[13])) - (((matrix4.val[0] * matrix4.val[7]) * matrix4.val[10]) * matrix4.val[13])) - (((matrix4.val[2] * matrix4.val[4]) * matrix4.val[11]) * matrix4.val[13])) + (((matrix4.val[0] * matrix4.val[6]) * matrix4.val[11]) * matrix4.val[13])) + (((matrix4.val[3] * matrix4.val[5]) * matrix4.val[8]) * matrix4.val[14])) - (((matrix4.val[1] * matrix4.val[7]) * matrix4.val[8]) * matrix4.val[14])) - (((matrix4.val[3] * matrix4.val[4]) * matrix4.val[9]) * matrix4.val[14])) + (((matrix4.val[0] * matrix4.val[7]) * matrix4.val[9]) * matrix4.val[14])) + (((matrix4.val[1] * matrix4.val[4]) * matrix4.val[11]) * matrix4.val[14])) - (((matrix4.val[0] * matrix4.val[5]) * matrix4.val[11]) * matrix4.val[14])) - (((matrix4.val[2] * matrix4.val[5]) * matrix4.val[8]) * matrix4.val[15])) + (((matrix4.val[1] * matrix4.val[6]) * matrix4.val[8]) * matrix4.val[15])) + (((matrix4.val[2] * matrix4.val[4]) * matrix4.val[9]) * matrix4.val[15])) - (((matrix4.val[0] * matrix4.val[6]) * matrix4.val[9]) * matrix4.val[15])) - (((matrix4.val[1] * matrix4.val[4]) * matrix4.val[10]) * matrix4.val[15])) + (((matrix4.val[0] * matrix4.val[5]) * matrix4.val[10]) * matrix4.val[15]);
                if (f == 0.0f) {
                    throw new RuntimeException("non-invertible matrix");
                }
                f = 1.0f / f;
                Matrix4.f2312a[0] = ((((((matrix4.val[9] * matrix4.val[14]) * matrix4.val[7]) - ((matrix4.val[13] * matrix4.val[10]) * matrix4.val[7])) + ((matrix4.val[13] * matrix4.val[6]) * matrix4.val[11])) - ((matrix4.val[5] * matrix4.val[14]) * matrix4.val[11])) - ((matrix4.val[9] * matrix4.val[6]) * matrix4.val[15])) + ((matrix4.val[5] * matrix4.val[10]) * matrix4.val[15]);
                Matrix4.f2312a[4] = ((((((matrix4.val[12] * matrix4.val[10]) * matrix4.val[7]) - ((matrix4.val[8] * matrix4.val[14]) * matrix4.val[7])) - ((matrix4.val[12] * matrix4.val[6]) * matrix4.val[11])) + ((matrix4.val[4] * matrix4.val[14]) * matrix4.val[11])) + ((matrix4.val[8] * matrix4.val[6]) * matrix4.val[15])) - ((matrix4.val[4] * matrix4.val[10]) * matrix4.val[15]);
                Matrix4.f2312a[8] = ((((((matrix4.val[8] * matrix4.val[13]) * matrix4.val[7]) - ((matrix4.val[12] * matrix4.val[9]) * matrix4.val[7])) + ((matrix4.val[12] * matrix4.val[5]) * matrix4.val[11])) - ((matrix4.val[4] * matrix4.val[13]) * matrix4.val[11])) - ((matrix4.val[8] * matrix4.val[5]) * matrix4.val[15])) + ((matrix4.val[4] * matrix4.val[9]) * matrix4.val[15]);
                Matrix4.f2312a[12] = ((((((matrix4.val[12] * matrix4.val[9]) * matrix4.val[6]) - ((matrix4.val[8] * matrix4.val[13]) * matrix4.val[6])) - ((matrix4.val[12] * matrix4.val[5]) * matrix4.val[10])) + ((matrix4.val[4] * matrix4.val[13]) * matrix4.val[10])) + ((matrix4.val[8] * matrix4.val[5]) * matrix4.val[14])) - ((matrix4.val[4] * matrix4.val[9]) * matrix4.val[14]);
                Matrix4.f2312a[1] = ((((((matrix4.val[13] * matrix4.val[10]) * matrix4.val[3]) - ((matrix4.val[9] * matrix4.val[14]) * matrix4.val[3])) - ((matrix4.val[13] * matrix4.val[2]) * matrix4.val[11])) + ((matrix4.val[1] * matrix4.val[14]) * matrix4.val[11])) + ((matrix4.val[9] * matrix4.val[2]) * matrix4.val[15])) - ((matrix4.val[1] * matrix4.val[10]) * matrix4.val[15]);
                Matrix4.f2312a[5] = ((((((matrix4.val[8] * matrix4.val[14]) * matrix4.val[3]) - ((matrix4.val[12] * matrix4.val[10]) * matrix4.val[3])) + ((matrix4.val[12] * matrix4.val[2]) * matrix4.val[11])) - ((matrix4.val[0] * matrix4.val[14]) * matrix4.val[11])) - ((matrix4.val[8] * matrix4.val[2]) * matrix4.val[15])) + ((matrix4.val[0] * matrix4.val[10]) * matrix4.val[15]);
                Matrix4.f2312a[9] = ((((((matrix4.val[12] * matrix4.val[9]) * matrix4.val[3]) - ((matrix4.val[8] * matrix4.val[13]) * matrix4.val[3])) - ((matrix4.val[12] * matrix4.val[1]) * matrix4.val[11])) + ((matrix4.val[0] * matrix4.val[13]) * matrix4.val[11])) + ((matrix4.val[8] * matrix4.val[1]) * matrix4.val[15])) - ((matrix4.val[0] * matrix4.val[9]) * matrix4.val[15]);
                Matrix4.f2312a[13] = ((((((matrix4.val[8] * matrix4.val[13]) * matrix4.val[2]) - ((matrix4.val[12] * matrix4.val[9]) * matrix4.val[2])) + ((matrix4.val[12] * matrix4.val[1]) * matrix4.val[10])) - ((matrix4.val[0] * matrix4.val[13]) * matrix4.val[10])) - ((matrix4.val[8] * matrix4.val[1]) * matrix4.val[14])) + ((matrix4.val[0] * matrix4.val[9]) * matrix4.val[14]);
                Matrix4.f2312a[2] = ((((((matrix4.val[5] * matrix4.val[14]) * matrix4.val[3]) - ((matrix4.val[13] * matrix4.val[6]) * matrix4.val[3])) + ((matrix4.val[13] * matrix4.val[2]) * matrix4.val[7])) - ((matrix4.val[1] * matrix4.val[14]) * matrix4.val[7])) - ((matrix4.val[5] * matrix4.val[2]) * matrix4.val[15])) + ((matrix4.val[1] * matrix4.val[6]) * matrix4.val[15]);
                Matrix4.f2312a[6] = ((((((matrix4.val[12] * matrix4.val[6]) * matrix4.val[3]) - ((matrix4.val[4] * matrix4.val[14]) * matrix4.val[3])) - ((matrix4.val[12] * matrix4.val[2]) * matrix4.val[7])) + ((matrix4.val[0] * matrix4.val[14]) * matrix4.val[7])) + ((matrix4.val[4] * matrix4.val[2]) * matrix4.val[15])) - ((matrix4.val[0] * matrix4.val[6]) * matrix4.val[15]);
                Matrix4.f2312a[10] = ((((((matrix4.val[4] * matrix4.val[13]) * matrix4.val[3]) - ((matrix4.val[12] * matrix4.val[5]) * matrix4.val[3])) + ((matrix4.val[12] * matrix4.val[1]) * matrix4.val[7])) - ((matrix4.val[0] * matrix4.val[13]) * matrix4.val[7])) - ((matrix4.val[4] * matrix4.val[1]) * matrix4.val[15])) + ((matrix4.val[0] * matrix4.val[5]) * matrix4.val[15]);
                Matrix4.f2312a[14] = ((((((matrix4.val[12] * matrix4.val[5]) * matrix4.val[2]) - ((matrix4.val[4] * matrix4.val[13]) * matrix4.val[2])) - ((matrix4.val[12] * matrix4.val[1]) * matrix4.val[6])) + ((matrix4.val[0] * matrix4.val[13]) * matrix4.val[6])) + ((matrix4.val[4] * matrix4.val[1]) * matrix4.val[14])) - ((matrix4.val[0] * matrix4.val[5]) * matrix4.val[14]);
                Matrix4.f2312a[3] = ((((((matrix4.val[9] * matrix4.val[6]) * matrix4.val[3]) - ((matrix4.val[5] * matrix4.val[10]) * matrix4.val[3])) - ((matrix4.val[9] * matrix4.val[2]) * matrix4.val[7])) + ((matrix4.val[1] * matrix4.val[10]) * matrix4.val[7])) + ((matrix4.val[5] * matrix4.val[2]) * matrix4.val[11])) - ((matrix4.val[1] * matrix4.val[6]) * matrix4.val[11]);
                Matrix4.f2312a[7] = ((((((matrix4.val[4] * matrix4.val[10]) * matrix4.val[3]) - ((matrix4.val[8] * matrix4.val[6]) * matrix4.val[3])) + ((matrix4.val[8] * matrix4.val[2]) * matrix4.val[7])) - ((matrix4.val[0] * matrix4.val[10]) * matrix4.val[7])) - ((matrix4.val[4] * matrix4.val[2]) * matrix4.val[11])) + ((matrix4.val[0] * matrix4.val[6]) * matrix4.val[11]);
                Matrix4.f2312a[11] = ((((((matrix4.val[8] * matrix4.val[5]) * matrix4.val[3]) - ((matrix4.val[4] * matrix4.val[9]) * matrix4.val[3])) - ((matrix4.val[8] * matrix4.val[1]) * matrix4.val[7])) + ((matrix4.val[0] * matrix4.val[9]) * matrix4.val[7])) + ((matrix4.val[4] * matrix4.val[1]) * matrix4.val[11])) - ((matrix4.val[0] * matrix4.val[5]) * matrix4.val[11]);
                Matrix4.f2312a[15] = ((((((matrix4.val[4] * matrix4.val[9]) * matrix4.val[2]) - ((matrix4.val[8] * matrix4.val[5]) * matrix4.val[2])) + ((matrix4.val[8] * matrix4.val[1]) * matrix4.val[6])) - ((matrix4.val[0] * matrix4.val[9]) * matrix4.val[6])) - ((matrix4.val[4] * matrix4.val[1]) * matrix4.val[10])) + ((matrix4.val[0] * matrix4.val[5]) * matrix4.val[10]);
                matrix4.val[0] = Matrix4.f2312a[0] * f;
                matrix4.val[4] = Matrix4.f2312a[4] * f;
                matrix4.val[8] = Matrix4.f2312a[8] * f;
                matrix4.val[12] = Matrix4.f2312a[12] * f;
                matrix4.val[1] = Matrix4.f2312a[1] * f;
                matrix4.val[5] = Matrix4.f2312a[5] * f;
                matrix4.val[9] = Matrix4.f2312a[9] * f;
                matrix4.val[13] = Matrix4.f2312a[13] * f;
                matrix4.val[2] = Matrix4.f2312a[2] * f;
                matrix4.val[6] = Matrix4.f2312a[6] * f;
                matrix4.val[10] = Matrix4.f2312a[10] * f;
                matrix4.val[14] = Matrix4.f2312a[14] * f;
                matrix4.val[3] = Matrix4.f2312a[3] * f;
                matrix4.val[7] = Matrix4.f2312a[7] * f;
                matrix4.val[11] = Matrix4.f2312a[11] * f;
                matrix4.val[15] = f * Matrix4.f2312a[15];
                c0685b2.m2384a(a2, matrix4);
            }
        }
    }

    /* renamed from: c */
    private void m1199c() {
        int i = 0;
        int i2 = this.f1578b.f3001b;
        for (int i3 = 0; i3 < i2; i3++) {
            ((C0405c) this.f1578b.m2291a(i3)).m1177a();
        }
        while (i < i2) {
            ((C0405c) this.f1578b.m2291a(i)).m1178b();
            i++;
        }
    }

    /* renamed from: c */
    private void m1200c(Iterable<C0396d> iterable) {
        for (C0396d c0396d : iterable) {
            int i;
            int a;
            int i2 = 0;
            for (C0397e c0397e : c0396d.f1482d) {
                i2 += c0397e.f1484b.length;
            }
            C0515n c0515n = new C0515n(c0396d.f1480b);
            Object mesh = new Mesh(c0396d.f1481c.length / (c0515n.f2300b / 4), i2, c0515n);
            this.f1580d.m2296a(mesh);
            this.f1582f.m2296a(mesh);
            BufferUtils.m2245a(c0396d.f1481c, mesh.f1359b.mo422a(), c0396d.f1481c.length);
            mesh.m1106e().clear();
            int i3 = 0;
            for (C0397e c0397e2 : c0396d.f1482d) {
                Object c0404b = new C0404b();
                c0404b.f1511a = c0397e2.f1483a;
                c0404b.f1512b = c0397e2.f1485c;
                c0404b.f1513c = i3;
                c0404b.f1514d = c0397e2.f1484b.length;
                c0404b.f1515e = mesh;
                mesh.m1106e().put(c0397e2.f1484b);
                i3 += c0404b.f1514d;
                this.f1581e.m2296a(c0404b);
            }
            mesh.m1106e().position(0);
            Iterator it = this.f1581e.iterator();
            while (it.hasNext()) {
                C0404b c0404b2 = (C0404b) it.next();
                Mesh mesh2 = c0404b2.f1515e;
                BoundingBox boundingBox = C0404b.f1510i;
                i = c0404b2.f1513c;
                int i4 = c0404b2.f1514d;
                boundingBox.min.m1709a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
                boundingBox.max.m1709a(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
                boundingBox.cnt.m1709a(0.0f, 0.0f, 0.0f);
                boundingBox.dim.m1709a(0.0f, 0.0f, 0.0f);
                a = mesh2.m1096a();
                i2 = mesh2.m1104c();
                if (a != 0) {
                    i2 = a;
                }
                if (i < 0 || i4 <= 0 || i + i4 > i2) {
                    throw new GdxRuntimeException("Invalid part specified ( offset=" + i + ", count=" + i4 + ", max=" + i2 + " )");
                }
                FloatBuffer a2 = mesh2.f1359b.mo422a();
                ShortBuffer d = mesh2.f1360c.mo417d();
                C0512m a3 = mesh2.m1100a(1);
                int i5 = a3.f2289e / 4;
                int i6 = mesh2.f1359b.mo427d().f2300b / 4;
                i4 += i;
                switch (a3.f2286b) {
                    case 1:
                        if (a <= 0) {
                            while (i < i4) {
                                mesh2.f1363f.m1709a(a2.get((i * i6) + i5), 0.0f, 0.0f);
                                boundingBox.m1726a(mesh2.f1363f);
                                i++;
                            }
                            break;
                        }
                        while (i < i4) {
                            mesh2.f1363f.m1709a(a2.get((d.get(i) * i6) + i5), 0.0f, 0.0f);
                            boundingBox.m1726a(mesh2.f1363f);
                            i++;
                        }
                        break;
                    case 2:
                        if (a <= 0) {
                            while (i < i4) {
                                a = (i * i6) + i5;
                                mesh2.f1363f.m1709a(a2.get(a), a2.get(a + 1), 0.0f);
                                boundingBox.m1726a(mesh2.f1363f);
                                i++;
                            }
                            break;
                        }
                        while (i < i4) {
                            a = (d.get(i) * i6) + i5;
                            mesh2.f1363f.m1709a(a2.get(a), a2.get(a + 1), 0.0f);
                            boundingBox.m1726a(mesh2.f1363f);
                            i++;
                        }
                        break;
                    case 3:
                        if (a <= 0) {
                            while (i < i4) {
                                a = (i * i6) + i5;
                                mesh2.f1363f.m1709a(a2.get(a), a2.get(a + 1), a2.get(a + 2));
                                boundingBox.m1726a(mesh2.f1363f);
                                i++;
                            }
                            break;
                        }
                        while (i < i4) {
                            a = (d.get(i) * i6) + i5;
                            mesh2.f1363f.m1709a(a2.get(a), a2.get(a + 1), a2.get(a + 2));
                            boundingBox.m1726a(mesh2.f1363f);
                            i++;
                        }
                        break;
                    default:
                        break;
                }
                c0404b2.f1516f.m1711a(C0404b.f1510i.cnt);
                c0404b2.f1517g.m1711a(C0404b.f1510i.dim).m1708a(0.5f);
                c0404b2.f1518h = c0404b2.f1517g.m1707a();
            }
        }
    }

    /* renamed from: a */
    public final Iterable<Disposable> m1201a() {
        return this.f1582f;
    }

    /* renamed from: b */
    public final void dispose() {
        Iterator it = this.f1582f.iterator();
        while (it.hasNext()) {
            ((Disposable) it.next()).dispose();
        }
    }
}
