package com.badlogic.gdx.graphics.p019a.p021b;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.C0512m;
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
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.p010a.p011a.C0238e;
import com.badlogic.gdx.p010a.p011a.C0251g;
import com.badlogic.gdx.p010a.p011a.C0251g.C0250a;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0679d;
import com.badlogic.gdx.utils.C0685b;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.JsonValue;
import java.util.Iterator;

/* renamed from: com.badlogic.gdx.graphics.a.b.a */
public final class C0387a extends C0251g<C0250a> {
    /* renamed from: c */
    protected final C0679d f1442c;
    /* renamed from: d */
    private final Quaternion f1443d = new Quaternion();

    public C0387a(C0679d c0679d, C0238e c0238e) {
        super(c0238e);
        this.f1442c = c0679d;
    }

    /* renamed from: a */
    private static C0430b m1160a(JsonValue jsonValue) {
        if (jsonValue.f2961j >= 3) {
            return new C0430b(jsonValue.m2257a(0), jsonValue.m2257a(1), jsonValue.m2257a(2), 1.0f);
        }
        throw new GdxRuntimeException("Expected Color values <> than three.");
    }

    /* renamed from: a */
    private static Vector2 m1161a(JsonValue jsonValue, float f, float f2) {
        if (jsonValue == null) {
            return new Vector2(f, f2);
        }
        if (jsonValue.f2961j == 2) {
            return new Vector2(jsonValue.m2257a(0), jsonValue.m2257a(1));
        }
        throw new GdxRuntimeException("Expected Vector2 values <> than two.");
    }

    /* renamed from: a */
    private C0676a<C0398f> m1162a(C0394b c0394b, JsonValue jsonValue) {
        JsonValue a = jsonValue.m2259a("nodes");
        if (a != null) {
            c0394b.f1468e.m2305c(a.f2961j);
            for (a = a.f2957f; a != null; a = a.f2958g) {
                c0394b.f1468e.m2296a(m1164b(a));
            }
        }
        return c0394b.f1468e;
    }

    /* renamed from: a */
    private static void m1163a(C0394b c0394b, JsonValue jsonValue, String str) {
        JsonValue a = jsonValue.m2259a("materials");
        if (a != null) {
            c0394b.f1467d.m2305c(a.f2961j);
            for (JsonValue jsonValue2 = a.f2957f; jsonValue2 != null; jsonValue2 = jsonValue2.f2958g) {
                Object c0395c = new C0395c();
                String a2 = jsonValue2.m2261a("id", null);
                if (a2 == null) {
                    throw new GdxRuntimeException("Material needs an id.");
                }
                c0395c.f1470a = a2;
                a = jsonValue2.m2259a("diffuse");
                if (a != null) {
                    c0395c.f1472c = C0387a.m1160a(a);
                }
                a = jsonValue2.m2259a("ambient");
                if (a != null) {
                    c0395c.f1471b = C0387a.m1160a(a);
                }
                a = jsonValue2.m2259a("emissive");
                if (a != null) {
                    c0395c.f1474e = C0387a.m1160a(a);
                }
                a = jsonValue2.m2259a("specular");
                if (a != null) {
                    c0395c.f1473d = C0387a.m1160a(a);
                }
                a = jsonValue2.m2259a("reflection");
                if (a != null) {
                    c0395c.f1475f = C0387a.m1160a(a);
                }
                c0395c.f1476g = jsonValue2.m2258a("shininess", 0.0f);
                c0395c.f1477h = jsonValue2.m2258a("opacity", 1.0f);
                a = jsonValue2.m2259a("textures");
                if (a != null) {
                    for (JsonValue jsonValue3 = a.f2957f; jsonValue3 != null; jsonValue3 = jsonValue3.f2958g) {
                        Object c0402j = new C0402j();
                        a2 = jsonValue3.m2261a("id", null);
                        if (a2 == null) {
                            throw new GdxRuntimeException("Texture has no id.");
                        }
                        c0402j.f1502a = a2;
                        String a3 = jsonValue3.m2261a("filename", null);
                        if (a3 == null) {
                            throw new GdxRuntimeException("Texture needs filename.");
                        }
                        StringBuilder append = new StringBuilder().append(str);
                        a2 = (str.length() == 0 || str.endsWith("/")) ? "" : "/";
                        c0402j.f1503b = append.append(a2).append(a3).toString();
                        c0402j.f1504c = C0387a.m1161a(jsonValue3.m2259a("uvTranslation"), 0.0f, 0.0f);
                        c0402j.f1505d = C0387a.m1161a(jsonValue3.m2259a("uvScaling"), 1.0f, 1.0f);
                        a2 = jsonValue3.m2261a("type", null);
                        if (a2 == null) {
                            throw new GdxRuntimeException("Texture needs type.");
                        }
                        int i = a2.equalsIgnoreCase("AMBIENT") ? 4 : a2.equalsIgnoreCase("BUMP") ? 8 : a2.equalsIgnoreCase("DIFFUSE") ? 2 : a2.equalsIgnoreCase("EMISSIVE") ? 3 : a2.equalsIgnoreCase("NONE") ? 1 : a2.equalsIgnoreCase("NORMAL") ? 7 : a2.equalsIgnoreCase("REFLECTION") ? 10 : a2.equalsIgnoreCase("SHININESS") ? 6 : a2.equalsIgnoreCase("SPECULAR") ? 5 : a2.equalsIgnoreCase("TRANSPARENCY") ? 9 : 0;
                        c0402j.f1506e = i;
                        if (c0395c.f1478i == null) {
                            c0395c.f1478i = new C0676a();
                        }
                        c0395c.f1478i.m2296a(c0402j);
                    }
                    continue;
                }
                c0394b.f1467d.m2296a(c0395c);
            }
        }
    }

    /* renamed from: b */
    private C0398f m1164b(JsonValue jsonValue) {
        C0398f c0398f = new C0398f();
        String a = jsonValue.m2261a("id", null);
        if (a == null) {
            throw new GdxRuntimeException("Node id missing.");
        }
        c0398f.f1486a = a;
        JsonValue a2 = jsonValue.m2259a("translation");
        if (a2 == null || a2.f2961j == 3) {
            c0398f.f1487b = a2 == null ? null : new Vector3(a2.m2257a(0), a2.m2257a(1), a2.m2257a(2));
            a2 = jsonValue.m2259a("rotation");
            if (a2 == null || a2.f2961j == 4) {
                c0398f.f1488c = a2 == null ? null : new Quaternion(a2.m2257a(0), a2.m2257a(1), a2.m2257a(2), a2.m2257a(3));
                a2 = jsonValue.m2259a("scale");
                if (a2 == null || a2.f2961j == 3) {
                    int i;
                    JsonValue a3;
                    c0398f.f1489d = a2 == null ? null : new Vector3(a2.m2257a(0), a2.m2257a(1), a2.m2257a(2));
                    String a4 = jsonValue.m2261a("mesh", null);
                    if (a4 != null) {
                        c0398f.f1490e = a4;
                    }
                    a2 = jsonValue.m2259a("parts");
                    if (a2 != null) {
                        c0398f.f1491f = new C0401i[a2.f2961j];
                        JsonValue jsonValue2 = a2.f2957f;
                        i = 0;
                        while (jsonValue2 != null) {
                            C0401i c0401i = new C0401i();
                            a4 = jsonValue2.m2261a("meshpartid", null);
                            String a5 = jsonValue2.m2261a("materialid", null);
                            if (a4 == null || a5 == null) {
                                throw new GdxRuntimeException("Node " + a + " part is missing meshPartId or materialId");
                            }
                            c0401i.f1499a = a5;
                            c0401i.f1500b = a4;
                            a3 = jsonValue2.m2259a("bones");
                            if (a3 != null) {
                                c0401i.f1501c = new C0685b(true, a3.f2961j, String.class, Matrix4.class);
                                for (a3 = a3.f2957f; a3 != null; a3 = a3.f2958g) {
                                    a5 = a3.m2261a("node", null);
                                    if (a5 == null) {
                                        throw new GdxRuntimeException("Bone node ID missing");
                                    }
                                    float a6;
                                    float a7;
                                    Matrix4 matrix4 = new Matrix4();
                                    JsonValue a8 = a3.m2259a("translation");
                                    if (a8 != null && a8.f2961j >= 3) {
                                        float a9 = a8.m2257a(0);
                                        a6 = a8.m2257a(1);
                                        a7 = a8.m2257a(2);
                                        Matrix4.f2312a[0] = 1.0f;
                                        Matrix4.f2312a[4] = 0.0f;
                                        Matrix4.f2312a[8] = 0.0f;
                                        Matrix4.f2312a[12] = a9;
                                        Matrix4.f2312a[1] = 0.0f;
                                        Matrix4.f2312a[5] = 1.0f;
                                        Matrix4.f2312a[9] = 0.0f;
                                        Matrix4.f2312a[13] = a6;
                                        Matrix4.f2312a[2] = 0.0f;
                                        Matrix4.f2312a[6] = 0.0f;
                                        Matrix4.f2312a[10] = 1.0f;
                                        Matrix4.f2312a[14] = a7;
                                        Matrix4.f2312a[3] = 0.0f;
                                        Matrix4.f2312a[7] = 0.0f;
                                        Matrix4.f2312a[11] = 0.0f;
                                        Matrix4.f2312a[15] = 1.0f;
                                        Matrix4.mul(matrix4.val, Matrix4.f2312a);
                                    }
                                    a8 = a3.m2259a("rotation");
                                    if (a8 != null && a8.f2961j >= 4) {
                                        Quaternion a10 = this.f1443d.m1695a(a8.m2257a(0), a8.m2257a(1), a8.m2257a(2), a8.m2257a(3));
                                        float[] fArr = Matrix4.f2312a;
                                        a6 = a10.f2327x * a10.f2327x;
                                        float f = a10.f2327x * a10.f2328y;
                                        float f2 = a10.f2327x * a10.f2329z;
                                        float f3 = a10.f2327x * a10.f2326w;
                                        float f4 = a10.f2328y * a10.f2328y;
                                        float f5 = a10.f2328y * a10.f2329z;
                                        float f6 = a10.f2328y * a10.f2326w;
                                        float f7 = a10.f2329z * a10.f2329z;
                                        a7 = a10.f2326w * a10.f2329z;
                                        fArr[0] = 1.0f - (2.0f * (f4 + f7));
                                        fArr[4] = 2.0f * (f - a7);
                                        fArr[8] = 2.0f * (f2 + f6);
                                        fArr[12] = 0.0f;
                                        fArr[1] = (a7 + f) * 2.0f;
                                        fArr[5] = 1.0f - ((f7 + a6) * 2.0f);
                                        fArr[9] = 2.0f * (f5 - f3);
                                        fArr[13] = 0.0f;
                                        fArr[2] = 2.0f * (f2 - f6);
                                        fArr[6] = 2.0f * (f5 + f3);
                                        fArr[10] = 1.0f - ((a6 + f4) * 2.0f);
                                        fArr[14] = 0.0f;
                                        fArr[3] = 0.0f;
                                        fArr[7] = 0.0f;
                                        fArr[11] = 0.0f;
                                        fArr[15] = 1.0f;
                                        Matrix4.mul(matrix4.val, Matrix4.f2312a);
                                    }
                                    a8 = a3.m2259a("scale");
                                    if (a8 != null && a8.f2961j >= 3) {
                                        matrix4.m1689a(a8.m2257a(0), a8.m2257a(1), a8.m2257a(2));
                                    }
                                    c0401i.f1501c.m2384a(a5, matrix4);
                                }
                                continue;
                            }
                            c0398f.f1491f[i] = c0401i;
                            jsonValue2 = jsonValue2.f2958g;
                            i++;
                        }
                    }
                    a3 = jsonValue.m2259a("children");
                    if (a3 != null) {
                        c0398f.f1492g = new C0398f[a3.f2961j];
                        i = 0;
                        a3 = a3.f2957f;
                        while (a3 != null) {
                            c0398f.f1492g[i] = m1164b(a3);
                            a3 = a3.f2958g;
                            i++;
                        }
                    }
                    return c0398f;
                }
                throw new GdxRuntimeException("Node scale incomplete");
            }
            throw new GdxRuntimeException("Node rotation incomplete");
        }
        throw new GdxRuntimeException("Node translation incomplete");
    }

    /* renamed from: b */
    private static void m1165b(C0394b c0394b, JsonValue jsonValue) {
        JsonValue a = jsonValue.m2259a("animations");
        if (a != null) {
            c0394b.f1469f.m2305c(a.f2961j);
            for (JsonValue jsonValue2 = a.f2957f; jsonValue2 != null; jsonValue2 = jsonValue2.f2958g) {
                a = jsonValue2.m2259a("bones");
                if (a != null) {
                    Object c0393a = new C0393a();
                    c0394b.f1469f.m2296a(c0393a);
                    c0393a.f1463b.m2305c(a.f2961j);
                    c0393a.f1462a = jsonValue2.m2268d("id");
                    for (JsonValue jsonValue3 = a.f2957f; jsonValue3 != null; jsonValue3 = jsonValue3.f2958g) {
                        Object c0399g = new C0399g();
                        c0393a.f1463b.m2296a(c0399g);
                        c0399g.f1493a = jsonValue3.m2268d("boneId");
                        a = jsonValue3.m2259a("keyframes");
                        JsonValue a2;
                        if (a == null || !a.m2275j()) {
                            Object c0400h;
                            a = jsonValue3.m2259a("translation");
                            if (a != null && a.m2275j()) {
                                c0399g.f1494b = new C0676a();
                                c0399g.f1494b.m2305c(a.f2961j);
                                for (a = a.f2957f; a != null; a = a.f2958g) {
                                    c0400h = new C0400h();
                                    c0399g.f1494b.m2296a(c0400h);
                                    c0400h.f1497a = a.m2258a("keytime", 0.0f) / 1000.0f;
                                    a2 = a.m2259a("value");
                                    if (a2 != null && a2.f2961j >= 3) {
                                        c0400h.f1498b = new Vector3(a2.m2257a(0), a2.m2257a(1), a2.m2257a(2));
                                    }
                                }
                            }
                            a = jsonValue3.m2259a("rotation");
                            if (a != null && a.m2275j()) {
                                c0399g.f1495c = new C0676a();
                                c0399g.f1495c.m2305c(a.f2961j);
                                for (a = a.f2957f; a != null; a = a.f2958g) {
                                    c0400h = new C0400h();
                                    c0399g.f1495c.m2296a(c0400h);
                                    c0400h.f1497a = a.m2258a("keytime", 0.0f) / 1000.0f;
                                    a2 = a.m2259a("value");
                                    if (a2 != null && a2.f2961j >= 4) {
                                        c0400h.f1498b = new Quaternion(a2.m2257a(0), a2.m2257a(1), a2.m2257a(2), a2.m2257a(3));
                                    }
                                }
                            }
                            a = jsonValue3.m2259a("scaling");
                            if (a != null && a.m2275j()) {
                                c0399g.f1496d = new C0676a();
                                c0399g.f1496d.m2305c(a.f2961j);
                                for (a = a.f2957f; a != null; a = a.f2958g) {
                                    c0400h = new C0400h();
                                    c0399g.f1496d.m2296a(c0400h);
                                    c0400h.f1497a = a.m2258a("keytime", 0.0f) / 1000.0f;
                                    a2 = a.m2259a("value");
                                    if (a2 != null && a2.f2961j >= 3) {
                                        c0400h.f1498b = new Vector3(a2.m2257a(0), a2.m2257a(1), a2.m2257a(2));
                                    }
                                }
                            }
                        } else {
                            for (a = a.f2957f; a != null; a = a.f2958g) {
                                Object c0400h2;
                                float a3 = a.m2258a("keytime", 0.0f) / 1000.0f;
                                a2 = a.m2259a("translation");
                                if (a2 != null && a2.f2961j == 3) {
                                    if (c0399g.f1494b == null) {
                                        c0399g.f1494b = new C0676a();
                                    }
                                    c0400h2 = new C0400h();
                                    c0400h2.f1497a = a3;
                                    c0400h2.f1498b = new Vector3(a2.m2257a(0), a2.m2257a(1), a2.m2257a(2));
                                    c0399g.f1494b.m2296a(c0400h2);
                                }
                                a2 = a.m2259a("rotation");
                                if (a2 != null && a2.f2961j == 4) {
                                    if (c0399g.f1495c == null) {
                                        c0399g.f1495c = new C0676a();
                                    }
                                    c0400h2 = new C0400h();
                                    c0400h2.f1497a = a3;
                                    c0400h2.f1498b = new Quaternion(a2.m2257a(0), a2.m2257a(1), a2.m2257a(2), a2.m2257a(3));
                                    c0399g.f1495c.m2296a(c0400h2);
                                }
                                a2 = a.m2259a("scale");
                                if (a2 != null && a2.f2961j == 3) {
                                    if (c0399g.f1496d == null) {
                                        c0399g.f1496d = new C0676a();
                                    }
                                    c0400h2 = new C0400h();
                                    c0400h2.f1497a = a3;
                                    c0400h2.f1498b = new Vector3(a2.m2257a(0), a2.m2257a(1), a2.m2257a(2));
                                    c0399g.f1496d.m2296a(c0400h2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final C0394b mo347a(C0316a c0316a, C0250a c0250a) {
        JsonValue a = this.f1442c.mo521a(c0316a);
        C0394b c0394b = new C0394b();
        JsonValue b = a.m2263b("version");
        c0394b.f1465b[0] = b.m2264b(0);
        c0394b.f1465b[1] = b.m2264b(1);
        if (c0394b.f1465b[0] == (short) 0 && c0394b.f1465b[1] == (short) 1) {
            c0394b.f1464a = a.m2261a("id", "");
            b = a.m2259a("meshes");
            if (b != null) {
                c0394b.f1466c.m2305c(b.f2961j);
                for (JsonValue jsonValue = b.f2957f; jsonValue != null; jsonValue = jsonValue.f2958g) {
                    Object c0396d = new C0396d();
                    c0396d.f1479a = jsonValue.m2261a("id", "");
                    b = jsonValue.m2263b("attributes");
                    C0676a c0676a = new C0676a();
                    JsonValue jsonValue2 = b.f2957f;
                    int i = 0;
                    int i2 = 0;
                    while (jsonValue2 != null) {
                        int i3;
                        String a2 = jsonValue2.m2260a();
                        if (a2.equals("POSITION")) {
                            c0676a.m2296a(C0512m.m1669a());
                            i3 = i;
                        } else if (a2.equals("NORMAL")) {
                            c0676a.m2296a(C0512m.m1671b());
                            i3 = i;
                        } else if (a2.equals("COLOR")) {
                            c0676a.m2296a(C0512m.m1674d());
                            i3 = i;
                        } else if (a2.equals("COLORPACKED")) {
                            c0676a.m2296a(C0512m.m1673c());
                            i3 = i;
                        } else if (a2.equals("TANGENT")) {
                            c0676a.m2296a(C0512m.m1675e());
                            i3 = i;
                        } else if (a2.equals("BINORMAL")) {
                            c0676a.m2296a(C0512m.m1676f());
                            i3 = i;
                        } else if (a2.startsWith("TEXCOORD")) {
                            i3 = i + 1;
                            c0676a.m2296a(C0512m.m1670a(i));
                        } else if (a2.startsWith("BLENDWEIGHT")) {
                            i3 = i2 + 1;
                            c0676a.m2296a(C0512m.m1672b(i2));
                            i2 = i3;
                            i3 = i;
                        } else {
                            throw new GdxRuntimeException("Unknown vertex attribute '" + a2 + "', should be one of position, normal, uv, tangent or binormal");
                        }
                        jsonValue2 = jsonValue2.f2958g;
                        i = i3;
                    }
                    c0396d.f1480b = (C0512m[]) c0676a.m2298a(C0512m.class);
                    c0396d.f1481c = jsonValue.m2263b("vertices").m2273h();
                    b = jsonValue.m2263b("parts");
                    C0676a c0676a2 = new C0676a();
                    for (JsonValue jsonValue3 = b.f2957f; jsonValue3 != null; jsonValue3 = jsonValue3.f2958g) {
                        Object c0397e = new C0397e();
                        String a3 = jsonValue3.m2261a("id", null);
                        if (a3 == null) {
                            throw new GdxRuntimeException("Not id given for mesh part");
                        }
                        Iterator it = c0676a2.iterator();
                        while (it.hasNext()) {
                            if (((C0397e) it.next()).f1483a.equals(a3)) {
                                throw new GdxRuntimeException("Mesh part with id '" + a3 + "' already in defined");
                            }
                        }
                        c0397e.f1483a = a3;
                        String a4 = jsonValue3.m2261a("type", null);
                        if (a4 == null) {
                            throw new GdxRuntimeException("No primitive type given for mesh part '" + a3 + "'");
                        }
                        if (a4.equals("TRIANGLES")) {
                            i2 = 4;
                        } else if (a4.equals("LINES")) {
                            i2 = 1;
                        } else if (a4.equals("POINTS")) {
                            i2 = 0;
                        } else if (a4.equals("TRIANGLE_STRIP")) {
                            i2 = 5;
                        } else if (a4.equals("LINE_STRIP")) {
                            i2 = 3;
                        } else {
                            throw new GdxRuntimeException("Unknown primitive type '" + a4 + "', should be one of triangle, trianglestrip, line, linestrip, lineloop or point");
                        }
                        c0397e.f1485c = i2;
                        c0397e.f1484b = jsonValue3.m2263b("indices").m2274i();
                        c0676a2.m2296a(c0397e);
                    }
                    c0396d.f1482d = (C0397e[]) c0676a2.m2298a(C0397e.class);
                    c0394b.f1466c.m2296a(c0396d);
                }
            }
            C0387a.m1163a(c0394b, a, c0316a.mo265a().m896h());
            m1162a(c0394b, a);
            C0387a.m1165b(c0394b, a);
            return c0394b;
        }
        throw new GdxRuntimeException("Model version not supported");
    }
}
