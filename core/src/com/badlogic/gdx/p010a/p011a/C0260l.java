package com.badlogic.gdx.p010a.p011a;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.C0480m;
import com.badlogic.gdx.p010a.C0242c;
import com.badlogic.gdx.p010a.C0267a;
import com.badlogic.gdx.p010a.C0273e;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h.C06371;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h.C06402;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h.C06413;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h.C06424;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h.C06435;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h.C0644a;
import com.badlogic.gdx.utils.C0636l;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.C0710q.C0707b;
import com.badlogic.gdx.utils.SerializationException;
import java.util.Iterator;

/* renamed from: com.badlogic.gdx.a.a.l */
public final class C0260l extends C0241b<C0645h, C0259a> {

    /* renamed from: com.badlogic.gdx.a.a.l$a */
    public static class C0259a extends C0242c<C0645h> {
        /* renamed from: b */
        public final String f940b;
        /* renamed from: c */
        public final C0710q<String, Object> f941c;

        public C0259a() {
            this((byte) 0);
        }

        private C0259a(byte b) {
            this.f940b = null;
            this.f941c = null;
        }
    }

    public C0260l(C0238e c0238e) {
        super(c0238e);
    }

    /* renamed from: a */
    public final /* synthetic */ C0676a mo151a(String str, C0316a c0316a, C0242c c0242c) {
        C0259a c0259a = (C0259a) c0242c;
        C0676a c0676a = new C0676a();
        if (c0259a == null || c0259a.f940b == null) {
            c0676a.m2296a(new C0267a(c0316a.m898j() + ".atlas", C0480m.class));
        } else if (c0259a.f940b != null) {
            c0676a.m2296a(new C0267a(c0259a.f940b, C0480m.class));
        }
        return c0676a;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo152a(C0273e c0273e, String str, C0316a c0316a, C0242c c0242c) {
        C0710q c0710q = null;
        C0259a c0259a = (C0259a) c0242c;
        String str2 = c0316a.m898j() + ".atlas";
        if (c0259a != null) {
            if (c0259a.f940b != null) {
                str2 = c0259a.f940b;
            }
            if (c0259a.f941c != null) {
                c0710q = c0259a.f941c;
            }
        }
        C0645h c0645h = new C0645h((C0480m) c0273e.m792a(str2, C0480m.class));
        if (c0710q != null) {
            Iterator c = c0710q.mo546c();
            while (c.hasNext()) {
                C0707b c0707b = (C0707b) c.next();
                str2 = (String) c0707b.f3163a;
                Object obj = c0707b.f3164b;
                c0645h.m2193a(str2, obj, obj.getClass());
            }
        }
        try {
            C0636l c06371 = new C06371(c0645h);
            c06371.f2885b = null;
            c06371.f2886c = false;
            c06371.m2179a(C0645h.class, new C06402(c0645h, c0645h));
            c06371.m2179a(BitmapFont.class, new C06413(c0645h, c0316a, c0645h));
            c06371.m2179a(C0430b.class, new C06424(c0645h));
            c06371.m2179a(C0644a.class, new C06435(c0645h));
            c06371.m2174a(C0645h.class, c0316a);
            return c0645h;
        } catch (Throwable e) {
            throw new SerializationException("Error reading file: " + c0316a, e);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo153b(String str, C0316a c0316a, C0242c c0242c) {
    }
}
