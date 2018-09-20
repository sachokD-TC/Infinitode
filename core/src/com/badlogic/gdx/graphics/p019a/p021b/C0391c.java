package com.badlogic.gdx.graphics.p019a.p021b;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0512m;
import com.badlogic.gdx.graphics.p019a.C0409c;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0394b;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0396d;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0397e;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0398f;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0401i;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.p010a.p011a.C0238e;
import com.badlogic.gdx.p010a.p011a.C0251g;
import com.badlogic.gdx.p010a.p011a.C0251g.C0250a;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0689h;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

/* renamed from: com.badlogic.gdx.graphics.a.b.c */
public final class C0391c extends C0251g<C0390b> {
    /* renamed from: c */
    public static boolean f1454c = false;
    /* renamed from: d */
    final C0689h f1455d;
    /* renamed from: e */
    final C0689h f1456e;
    /* renamed from: f */
    final C0689h f1457f;
    /* renamed from: g */
    final C0676a<C0389a> f1458g;

    /* renamed from: com.badlogic.gdx.graphics.a.b.c$a */
    private class C0389a {
        /* renamed from: a */
        final String f1445a;
        /* renamed from: b */
        String f1446b = "default";
        /* renamed from: c */
        C0676a<Integer> f1447c = new C0676a(200);
        /* renamed from: d */
        int f1448d = 0;
        /* renamed from: e */
        boolean f1449e;
        /* renamed from: f */
        boolean f1450f;
        /* renamed from: g */
        C0409c f1451g = new C0409c("");
        /* renamed from: h */
        final /* synthetic */ C0391c f1452h;

        C0389a(C0391c c0391c, String str) {
            this.f1452h = c0391c;
            this.f1445a = str;
        }
    }

    /* renamed from: com.badlogic.gdx.graphics.a.b.c$b */
    public static class C0390b extends C0250a {
        /* renamed from: c */
        public boolean f1453c;
    }

    public C0391c() {
        this(null);
    }

    public C0391c(C0238e c0238e) {
        super(c0238e);
        this.f1455d = new C0689h(300);
        this.f1456e = new C0689h(300);
        this.f1457f = new C0689h(200);
        this.f1458g = new C0676a(10);
    }

    /* renamed from: a */
    private static int m1169a(String str, int i) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int parseInt = Integer.parseInt(str);
        return parseInt < 0 ? parseInt + i : parseInt - 1;
    }

    /* renamed from: a */
    private C0394b m1170a(C0316a c0316a, boolean z) {
        if (f1454c) {
            Gdx.app.error("ObjLoader", "Wavefront (OBJ) is not fully supported, consult the documentation for more information");
        }
        C0388b c0388b = new C0388b();
        C0389a c0389a = new C0389a(this, "default");
        this.f1458g.m2296a((Object) c0389a);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c0316a.mo268b()), 4096);
        C0389a c0389a2 = c0389a;
        while (true) {
            String readLine;
            int i;
            try {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split("\\s+");
                if (split.length <= 0) {
                    break;
                } else if (split[0].length() != 0) {
                    char charAt = split[0].toLowerCase().charAt(0);
                    if (charAt != '#') {
                        if (charAt == 'v') {
                            if (split[0].length() == 1) {
                                this.f1455d.m2405a(Float.parseFloat(split[1]));
                                this.f1455d.m2405a(Float.parseFloat(split[2]));
                                this.f1455d.m2405a(Float.parseFloat(split[3]));
                            } else if (split[0].charAt(1) == 'n') {
                                this.f1456e.m2405a(Float.parseFloat(split[1]));
                                this.f1456e.m2405a(Float.parseFloat(split[2]));
                                this.f1456e.m2405a(Float.parseFloat(split[3]));
                            } else if (split[0].charAt(1) == 't') {
                                this.f1457f.m2405a(Float.parseFloat(split[1]));
                                this.f1457f.m2405a(z ? 1.0f - Float.parseFloat(split[2]) : Float.parseFloat(split[2]));
                            }
                        } else if (charAt == 'f') {
                            C0676a c0676a = c0389a2.f1447c;
                            i = 1;
                            while (i < split.length - 2) {
                                String[] split2 = split[1].split("/");
                                c0676a.m2296a(Integer.valueOf(C0391c.m1169a(split2[0], this.f1455d.f3079b)));
                                if (split2.length > 2) {
                                    if (i == 1) {
                                        c0389a2.f1449e = true;
                                    }
                                    c0676a.m2296a(Integer.valueOf(C0391c.m1169a(split2[2], this.f1456e.f3079b)));
                                }
                                if (split2.length > 1 && split2[1].length() > 0) {
                                    if (i == 1) {
                                        c0389a2.f1450f = true;
                                    }
                                    c0676a.m2296a(Integer.valueOf(C0391c.m1169a(split2[1], this.f1457f.f3079b)));
                                }
                                i++;
                                split2 = split[i].split("/");
                                c0676a.m2296a(Integer.valueOf(C0391c.m1169a(split2[0], this.f1455d.f3079b)));
                                if (split2.length > 2) {
                                    c0676a.m2296a(Integer.valueOf(C0391c.m1169a(split2[2], this.f1456e.f3079b)));
                                }
                                if (split2.length > 1 && split2[1].length() > 0) {
                                    c0676a.m2296a(Integer.valueOf(C0391c.m1169a(split2[1], this.f1457f.f3079b)));
                                }
                                i++;
                                split2 = split[i].split("/");
                                c0676a.m2296a(Integer.valueOf(C0391c.m1169a(split2[0], this.f1455d.f3079b)));
                                if (split2.length > 2) {
                                    c0676a.m2296a(Integer.valueOf(C0391c.m1169a(split2[2], this.f1456e.f3079b)));
                                }
                                if (split2.length > 1 && split2[1].length() > 0) {
                                    c0676a.m2296a(Integer.valueOf(C0391c.m1169a(split2[1], this.f1457f.f3079b)));
                                }
                                c0389a2.f1448d++;
                                i--;
                            }
                        } else if (charAt == 'o' || charAt == 'g') {
                            c0389a2 = split.length > 1 ? m1171b(split[1]) : m1171b("default");
                        } else if (split[0].equals("mtllib")) {
                            c0388b.m1168a(c0316a.mo265a().mo266a(split[1]));
                        } else if (split[0].equals("usemtl")) {
                            if (split.length == 1) {
                                c0389a2.f1446b = "default";
                            } else {
                                c0389a2.f1446b = split[1].replace('.', '_');
                            }
                        }
                    }
                }
            } catch (IOException e) {
                return null;
            }
        }
        bufferedReader.close();
        int i2 = 0;
        while (i2 < this.f1458g.f3001b) {
            if (((C0389a) this.f1458g.m2291a(i2)).f1448d <= 0) {
                this.f1458g.mo527b(i2);
                i2--;
            }
            i2++;
        }
        if (this.f1458g.f3001b <= 0) {
            return null;
        }
        int i3 = this.f1458g.f3001b;
        C0394b c0394b = new C0394b();
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            c0389a2 = (C0389a) this.f1458g.m2291a(i5);
            C0676a c0676a2 = c0389a2.f1447c;
            int i6 = c0676a2.f3001b;
            int i7 = c0389a2.f1448d;
            boolean z2 = c0389a2.f1449e;
            boolean z3 = c0389a2.f1450f;
            float[] fArr = new float[(((z3 ? 2 : 0) + ((z2 ? 3 : 0) + 3)) * (i7 * 3))];
            i = 0;
            int i8 = 0;
            while (i < i6) {
                int i9;
                int i10 = i + 1;
                i = ((Integer) c0676a2.m2291a(i)).intValue() * 3;
                int i11 = i8 + 1;
                int i12 = i + 1;
                fArr[i8] = this.f1455d.m2404a(i);
                i = i11 + 1;
                int i13 = i12 + 1;
                fArr[i11] = this.f1455d.m2404a(i12);
                i8 = i + 1;
                fArr[i] = this.f1455d.m2404a(i13);
                if (z2) {
                    i11 = i10 + 1;
                    i = ((Integer) c0676a2.m2291a(i10)).intValue() * 3;
                    i10 = i8 + 1;
                    i12 = i + 1;
                    fArr[i8] = this.f1456e.m2404a(i);
                    i = i10 + 1;
                    i13 = i12 + 1;
                    fArr[i10] = this.f1456e.m2404a(i12);
                    i8 = i + 1;
                    fArr[i] = this.f1456e.m2404a(i13);
                    i = i11;
                } else {
                    i = i10;
                }
                if (z3) {
                    i11 = i + 1;
                    i = ((Integer) c0676a2.m2291a(i)).intValue() * 2;
                    i10 = i8 + 1;
                    i12 = i + 1;
                    fArr[i8] = this.f1457f.m2404a(i);
                    i = i10 + 1;
                    fArr[i10] = this.f1457f.m2404a(i12);
                    i8 = i11;
                } else {
                    i9 = i8;
                    i8 = i;
                    i = i9;
                }
                i9 = i;
                i = i8;
                i8 = i9;
            }
            i = i7 * 3 >= 32767 ? 0 : i7 * 3;
            short[] sArr = new short[i];
            if (i > 0) {
                for (i8 = 0; i8 < i; i8++) {
                    sArr[i8] = (short) i8;
                }
            }
            c0676a2 = new C0676a();
            c0676a2.m2296a(new C0512m(1, 3, "a_position"));
            if (z2) {
                c0676a2.m2296a(new C0512m(8, 3, "a_normal"));
            }
            if (z3) {
                c0676a2.m2296a(new C0512m(16, 2, "a_texCoord0"));
            }
            i4++;
            String num = Integer.toString(i4);
            readLine = "default".equals(c0389a2.f1445a) ? "node" + num : c0389a2.f1445a;
            String str = "default".equals(c0389a2.f1445a) ? "mesh" + num : c0389a2.f1445a;
            num = "default".equals(c0389a2.f1445a) ? "part" + num : c0389a2.f1445a;
            Object c0398f = new C0398f();
            c0398f.f1486a = readLine;
            c0398f.f1490e = str;
            c0398f.f1489d = new Vector3(1.0f, 1.0f, 1.0f);
            c0398f.f1487b = new Vector3();
            c0398f.f1488c = new Quaternion();
            C0401i c0401i = new C0401i();
            c0401i.f1500b = num;
            c0401i.f1499a = c0389a2.f1446b;
            c0398f.f1491f = new C0401i[]{c0401i};
            C0397e c0397e = new C0397e();
            c0397e.f1483a = num;
            c0397e.f1484b = sArr;
            c0397e.f1485c = 4;
            Object c0396d = new C0396d();
            c0396d.f1479a = str;
            c0396d.f1480b = (C0512m[]) c0676a2.m2298a(C0512m.class);
            c0396d.f1481c = fArr;
            c0396d.f1482d = new C0397e[]{c0397e};
            c0394b.f1468e.m2296a(c0398f);
            c0394b.f1466c.m2296a(c0396d);
            c0394b.f1467d.m2296a(c0388b.m1167a(c0389a2.f1446b));
        }
        if (this.f1455d.f3079b > 0) {
            this.f1455d.f3079b = 0;
        }
        if (this.f1456e.f3079b > 0) {
            this.f1456e.f3079b = 0;
        }
        if (this.f1457f.f3079b > 0) {
            this.f1457f.f3079b = 0;
        }
        if (this.f1458g.f3001b > 0) {
            this.f1458g.mo530d();
        }
        return c0394b;
    }

    /* renamed from: b */
    private C0389a m1171b(String str) {
        Iterator it = this.f1458g.iterator();
        while (it.hasNext()) {
            C0389a c0389a = (C0389a) it.next();
            if (c0389a.f1445a.equals(str)) {
                return c0389a;
            }
        }
        Object c0389a2 = new C0389a(this, str);
        this.f1458g.m2296a(c0389a2);
        return c0389a2;
    }
}
