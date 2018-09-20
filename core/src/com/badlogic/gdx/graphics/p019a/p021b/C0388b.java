package com.badlogic.gdx.graphics.p019a.p021b;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0395c;
import com.badlogic.gdx.graphics.p019a.p022c.p023a.C0402j;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.C0676a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

/* renamed from: com.badlogic.gdx.graphics.a.b.b */
final class C0388b {
    /* renamed from: a */
    public C0676a<C0395c> f1444a = new C0676a();

    C0388b() {
    }

    /* renamed from: a */
    public final C0395c m1167a(String str) {
        Iterator it = this.f1444a.iterator();
        while (it.hasNext()) {
            C0395c c0395c = (C0395c) it.next();
            if (c0395c.f1470a.equals(str)) {
                return c0395c;
            }
        }
        Object c0395c2 = new C0395c();
        c0395c2.f1470a = str;
        c0395c2.f1472c = new C0430b(C0430b.f1620c);
        this.f1444a.m2296a(c0395c2);
        return c0395c2;
    }

    /* renamed from: a */
    public final void m1168a(C0316a c0316a) {
        String str = "default";
        C0430b c0430b = C0430b.f1620c;
        C0430b c0430b2 = C0430b.f1620c;
        String str2 = null;
        if (c0316a != null && c0316a.mo270d()) {
            Object c0395c;
            Object c0402j;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c0316a.mo268b()), 4096);
            String str3 = str;
            C0430b c0430b3 = c0430b;
            c0430b = c0430b2;
            float f = 1.0f;
            float f2 = 0.0f;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.length() > 0 && readLine.charAt(0) == '\t') {
                        readLine = readLine.substring(1).trim();
                    }
                    String[] split = readLine.split("\\s+");
                    if (!(split[0].length() == 0 || split[0].charAt(0) == '#')) {
                        readLine = split[0].toLowerCase();
                        if (readLine.equals("newmtl")) {
                            c0395c = new C0395c();
                            c0395c.f1470a = str3;
                            c0395c.f1472c = new C0430b(c0430b3);
                            c0395c.f1473d = new C0430b(c0430b);
                            c0395c.f1477h = f;
                            c0395c.f1476g = f2;
                            if (str2 != null) {
                                c0402j = new C0402j();
                                c0402j.f1506e = 2;
                                c0402j.f1503b = new String(str2);
                                if (c0395c.f1478i == null) {
                                    c0395c.f1478i = new C0676a(1);
                                }
                                c0395c.f1478i.m2296a(c0402j);
                            }
                            this.f1444a.m2296a(c0395c);
                            readLine = split.length > 1 ? split[1].replace('.', '_') : "default";
                            c0430b3 = C0430b.f1620c;
                            c0430b = C0430b.f1620c;
                            f = 1.0f;
                            f2 = 0.0f;
                            str3 = readLine;
                        } else if (readLine.equals("kd") || readLine.equals("ks")) {
                            float parseFloat = Float.parseFloat(split[1]);
                            float parseFloat2 = Float.parseFloat(split[2]);
                            float parseFloat3 = Float.parseFloat(split[3]);
                            float f3 = 1.0f;
                            if (split.length > 4) {
                                f3 = Float.parseFloat(split[4]);
                            }
                            if (split[0].toLowerCase().equals("kd")) {
                                c0430b3 = new C0430b();
                                c0430b3.m1217a(parseFloat, parseFloat2, parseFloat3, f3);
                            } else {
                                c0430b = new C0430b();
                                c0430b.m1217a(parseFloat, parseFloat2, parseFloat3, f3);
                            }
                        } else if (readLine.equals("tr") || readLine.equals("d")) {
                            f = Float.parseFloat(split[1]);
                        } else if (readLine.equals("ns")) {
                            f2 = Float.parseFloat(split[1]);
                        } else if (readLine.equals("map_kd")) {
                            str2 = c0316a.mo265a().mo266a(split[1]).m896h();
                        }
                    }
                } catch (IOException e) {
                    return;
                }
            }
            bufferedReader.close();
            c0395c = new C0395c();
            c0395c.f1470a = str3;
            c0395c.f1472c = new C0430b(c0430b3);
            c0395c.f1473d = new C0430b(c0430b);
            c0395c.f1477h = f;
            c0395c.f1476g = f2;
            if (str2 != null) {
                c0402j = new C0402j();
                c0402j.f1506e = 2;
                c0402j.f1503b = new String(str2);
                if (c0395c.f1478i == null) {
                    c0395c.f1478i = new C0676a(1);
                }
                c0395c.f1478i.m2296a(c0402j);
            }
            this.f1444a.m2296a(c0395c);
        }
    }
}
