package com.badlogic.gdx.p010a.p011a;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData;
import com.badlogic.gdx.graphics.g2d.C0480m;
import com.badlogic.gdx.p010a.C0242c;
import com.badlogic.gdx.p010a.C0267a;
import com.badlogic.gdx.p010a.C0273e;
import com.badlogic.gdx.p010a.p011a.C0266p.C0265b;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* renamed from: com.badlogic.gdx.a.a.c */
public final class C0244c extends C0241b<BitmapFont, C0243a> {
    /* renamed from: a */
    BitmapFontData f910a;

    /* renamed from: com.badlogic.gdx.a.a.c$a */
    public static class C0243a extends C0242c<BitmapFont> {
        /* renamed from: b */
        public boolean f904b = false;
        /* renamed from: c */
        public boolean f905c = false;
        /* renamed from: d */
        public TextureFilter f906d = TextureFilter.Nearest;
        /* renamed from: e */
        public TextureFilter f907e = TextureFilter.Nearest;
        /* renamed from: f */
        public BitmapFontData f908f = null;
        /* renamed from: g */
        public String f909g = null;
    }

    public C0244c(C0238e c0238e) {
        super(c0238e);
    }

    /* renamed from: a */
    public final /* synthetic */ C0676a mo151a(String str, C0316a c0316a, C0242c c0242c) {
        int i = 0;
        C0243a c0243a = (C0243a) c0242c;
        C0676a c0676a = new C0676a();
        if (c0243a == null || c0243a.f908f == null) {
            this.f910a = new BitmapFontData(c0316a, c0243a != null ? c0243a.f904b : false);
            if (c0243a == null || c0243a.f909g == null) {
                while (i < this.f910a.f1783a.length) {
                    C0316a a = m731a(this.f910a.f1783a[i]);
                    C0242c c0265b = new C0265b();
                    if (c0243a != null) {
                        c0265b.f949c = c0243a.f905c;
                        c0265b.f952f = c0243a.f906d;
                        c0265b.f953g = c0243a.f907e;
                    }
                    c0676a.m2296a(new C0267a(a, Texture.class, c0265b));
                    i++;
                }
            } else {
                c0676a.m2296a(new C0267a(c0243a.f909g, C0480m.class));
            }
        } else {
            this.f910a = c0243a.f908f;
        }
        return c0676a;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo152a(C0273e c0273e, String str, C0316a c0316a, C0242c c0242c) {
        int i = 0;
        C0243a c0243a = (C0243a) c0242c;
        if (c0243a == null || c0243a.f909g == null) {
            int length = this.f910a.f1783a.length;
            C0676a c0676a = new C0676a(length);
            while (i < length) {
                c0676a.m2296a(new C0438n((Texture) c0273e.m792a(this.f910a.f1783a[i], Texture.class)));
                i++;
            }
            return new BitmapFont(this.f910a, c0676a);
        }
        C0480m c0480m = (C0480m) c0273e.m792a(c0243a.f909g, C0480m.class);
        String str2 = c0316a.mo267b(this.f910a.f1783a[0]).m897i().toString();
        C0438n a = c0480m.m1442a(str2);
        if (a != null) {
            return new BitmapFont(c0316a, a);
        }
        throw new GdxRuntimeException("Could not find font region " + str2 + " in atlas " + c0243a.f909g);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo153b(String str, C0316a c0316a, C0242c c0242c) {
    }
}
