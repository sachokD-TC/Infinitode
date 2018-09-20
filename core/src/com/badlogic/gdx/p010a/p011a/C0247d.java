package com.badlogic.gdx.p010a.p011a;

import com.badlogic.gdx.graphics.C0433d;
import com.badlogic.gdx.graphics.C0434e;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.Texture.TextureWrap;
import com.badlogic.gdx.graphics.glutils.C0498m;
import com.badlogic.gdx.p010a.C0242c;
import com.badlogic.gdx.p010a.C0273e;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.C0676a;

/* renamed from: com.badlogic.gdx.a.a.d */
public final class C0247d extends C0241b<C0433d, C0246b> {
    /* renamed from: a */
    C0245a f921a = new C0245a();

    /* renamed from: com.badlogic.gdx.a.a.d$a */
    public static class C0245a {
        /* renamed from: a */
        String f911a;
        /* renamed from: b */
        C0434e f912b;
        /* renamed from: c */
        C0433d f913c;
    }

    /* renamed from: com.badlogic.gdx.a.a.d$b */
    public static class C0246b extends C0242c<C0433d> {
        /* renamed from: b */
        public Format f914b = null;
        /* renamed from: c */
        public C0433d f915c = null;
        /* renamed from: d */
        public C0434e f916d = null;
        /* renamed from: e */
        public TextureFilter f917e = TextureFilter.Nearest;
        /* renamed from: f */
        public TextureFilter f918f = TextureFilter.Nearest;
        /* renamed from: g */
        public TextureWrap f919g = TextureWrap.ClampToEdge;
        /* renamed from: h */
        public TextureWrap f920h = TextureWrap.ClampToEdge;
    }

    public C0247d(C0238e c0238e) {
        super(c0238e);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0676a mo151a(String str, C0316a c0316a, C0242c c0242c) {
        return null;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo152a(C0273e c0273e, String str, C0316a c0316a, C0242c c0242c) {
        C0246b c0246b = (C0246b) c0242c;
        if (this.f921a == null) {
            return null;
        }
        C0433d c0433d = this.f921a.f913c;
        if (c0433d != null) {
            c0433d.m1229a(this.f921a.f912b);
        } else {
            c0433d = new C0433d(this.f921a.f912b);
        }
        if (c0246b == null) {
            return c0433d;
        }
        c0433d.m1129b(c0246b.f917e, c0246b.f918f);
        c0433d.m1130b(c0246b.f919g, c0246b.f920h);
        return c0433d;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo153b(String str, C0316a c0316a, C0242c c0242c) {
        C0246b c0246b = (C0246b) c0242c;
        this.f921a.f911a = str;
        if (c0246b == null || c0246b.f916d == null) {
            this.f921a.f913c = null;
            if (c0246b != null) {
                this.f921a.f913c = c0246b.f915c;
            }
            if (str.contains(".ktx") || str.contains(".zktx")) {
                this.f921a.f912b = new C0498m(c0316a, false);
            }
        } else {
            this.f921a.f912b = c0246b.f916d;
            this.f921a.f913c = c0246b.f915c;
        }
        if (!this.f921a.f912b.mo391a()) {
            this.f921a.f912b.mo392b();
        }
    }
}
