package com.badlogic.gdx.p010a.p011a;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.C0501p;
import com.badlogic.gdx.p010a.C0242c;
import com.badlogic.gdx.p010a.C0273e;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0695n;

/* renamed from: com.badlogic.gdx.a.a.k */
public final class C0258k extends C0241b<C0501p, C0257a> {
    /* renamed from: a */
    private String f938a = ".vert";
    /* renamed from: b */
    private String f939b = ".frag";

    /* renamed from: com.badlogic.gdx.a.a.k$a */
    public static class C0257a extends C0242c<C0501p> {
        /* renamed from: b */
        public String f933b;
        /* renamed from: c */
        public String f934c;
        /* renamed from: d */
        public boolean f935d = true;
        /* renamed from: e */
        public String f936e;
        /* renamed from: f */
        public String f937f;
    }

    public C0258k(C0238e c0238e) {
        super(c0238e);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0676a mo151a(String str, C0316a c0316a, C0242c c0242c) {
        return null;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo152a(C0273e c0273e, String str, C0316a c0316a, C0242c c0242c) {
        String str2;
        String str3 = null;
        C0257a c0257a = (C0257a) c0242c;
        if (c0257a != null) {
            str2 = c0257a.f933b != null ? c0257a.f933b : null;
            if (c0257a.f934c != null) {
                str3 = str2;
                str2 = c0257a.f934c;
            } else {
                str3 = str2;
                str2 = null;
            }
        } else {
            str2 = null;
        }
        if (str3 == null && str.endsWith(this.f939b)) {
            str3 = str.substring(0, str.length() - this.f939b.length()) + this.f938a;
        }
        String str4 = (str2 == null && str.endsWith(this.f938a)) ? str.substring(0, str.length() - this.f938a.length()) + this.f939b : str2;
        C0316a a = str3 == null ? c0316a : m731a(str3);
        if (str4 != null) {
            c0316a = m731a(str4);
        }
        str2 = a.m899k();
        str3 = a.equals(c0316a) ? str2 : c0316a.m899k();
        if (c0257a != null) {
            if (c0257a.f936e != null) {
                str2 = c0257a.f936e + str2;
            }
            if (c0257a.f937f != null) {
                str3 = c0257a.f937f + str3;
            }
        }
        C0501p c0501p = new C0501p(str2, str3);
        if ((c0257a == null || c0257a.f935d) && !c0501p.f2227d) {
            C0695n c0695n = c0273e.f987n;
            str3 = "ShaderProgram " + str + " failed to compile:\n" + c0501p.m1605a();
            if (c0695n.f3110b > 0) {
                Gdx.app.error(c0695n.f3109a, str3);
            }
        }
        return c0501p;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo153b(String str, C0316a c0316a, C0242c c0242c) {
    }
}
