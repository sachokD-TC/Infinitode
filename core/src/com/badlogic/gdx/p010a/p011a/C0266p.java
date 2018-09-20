package com.badlogic.gdx.p010a.p011a;

import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.Texture.TextureWrap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.graphics.TextureData.C0381a;
import com.badlogic.gdx.p010a.C0242c;
import com.badlogic.gdx.p010a.C0273e;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.C0676a;

/* renamed from: com.badlogic.gdx.a.a.p */
public final class C0266p extends C0241b<Texture, C0265b> {
    /* renamed from: a */
    C0264a f956a = new C0264a();

    /* renamed from: com.badlogic.gdx.a.a.p$a */
    public static class C0264a {
        /* renamed from: a */
        String f945a;
        /* renamed from: b */
        TextureData f946b;
        /* renamed from: c */
        Texture f947c;
    }

    /* renamed from: com.badlogic.gdx.a.a.p$b */
    public static class C0265b extends C0242c<Texture> {
        /* renamed from: b */
        public Format f948b = null;
        /* renamed from: c */
        public boolean f949c = false;
        /* renamed from: d */
        public Texture f950d = null;
        /* renamed from: e */
        public TextureData f951e = null;
        /* renamed from: f */
        public TextureFilter f952f = TextureFilter.Nearest;
        /* renamed from: g */
        public TextureFilter f953g = TextureFilter.Nearest;
        /* renamed from: h */
        public TextureWrap f954h = TextureWrap.ClampToEdge;
        /* renamed from: i */
        public TextureWrap f955i = TextureWrap.ClampToEdge;
    }

    public C0266p(C0238e c0238e) {
        super(c0238e);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0676a mo151a(String str, C0316a c0316a, C0242c c0242c) {
        return null;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo152a(C0273e c0273e, String str, C0316a c0316a, C0242c c0242c) {
        C0265b c0265b = (C0265b) c0242c;
        if (this.f956a == null) {
            return null;
        }
        Texture texture = this.f956a.f947c;
        if (texture != null) {
            texture.m1142a(this.f956a.f946b);
        } else {
            texture = new Texture(this.f956a.f946b);
        }
        if (c0265b == null) {
            return texture;
        }
        texture.m1129b(c0265b.f952f, c0265b.f953g);
        texture.m1130b(c0265b.f954h, c0265b.f955i);
        return texture;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo153b(String str, C0316a c0316a, C0242c c0242c) {
        Format format = null;
        C0265b c0265b = (C0265b) c0242c;
        this.f956a.f945a = str;
        if (c0265b == null || c0265b.f951e == null) {
            boolean z = false;
            this.f956a.f947c = null;
            if (c0265b != null) {
                format = c0265b.f948b;
                z = c0265b.f949c;
                this.f956a.f947c = c0265b.f950d;
            }
            this.f956a.f946b = C0381a.m1146a(c0316a, format, z);
        } else {
            this.f956a.f946b = c0265b.f951e;
            this.f956a.f947c = c0265b.f950d;
        }
        if (!this.f956a.f946b.mo391a()) {
            this.f956a.f946b.mo392b();
        }
    }
}
