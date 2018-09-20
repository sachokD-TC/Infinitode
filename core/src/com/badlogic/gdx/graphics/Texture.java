package com.badlogic.gdx.graphics;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap.Blending;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.TextureData.C0381a;
import com.badlogic.gdx.graphics.TextureData.TextureDataType;
import com.badlogic.gdx.graphics.glutils.C0499n;
import com.badlogic.gdx.graphics.glutils.C0500o;
import com.badlogic.gdx.p010a.C0242c;
import com.badlogic.gdx.p010a.C0242c.C0269a;
import com.badlogic.gdx.p010a.C0273e;
import com.badlogic.gdx.p010a.p011a.C0266p.C0265b;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Texture extends C0380h {
    /* renamed from: a */
    static final Map<Application, C0676a<Texture>> f1402a = new HashMap();
    /* renamed from: i */
    private static C0273e f1403i;
    /* renamed from: b */
    public TextureData f1404b;

    public enum TextureFilter {
        Nearest(9728),
        Linear(9729),
        MipMap(9987),
        MipMapNearestNearest(9984),
        MipMapLinearNearest(9985),
        MipMapNearestLinear(9986),
        MipMapLinearLinear(9987);
        
        public final int glEnum;

        private TextureFilter(int i) {
            this.glEnum = i;
        }
    }

    public enum TextureWrap {
        MirroredRepeat(33648),
        ClampToEdge(33071),
        Repeat(10497);
        
        public final int glEnum;

        private TextureWrap(int i) {
            this.glEnum = i;
        }
    }

    public Texture(int i, int i2, Format format) {
        this(new C0500o(new Pixmap(i, i2, format), null, true));
    }

    private Texture(int i, TextureData textureData) {
        super(3553, i);
        m1142a(textureData);
        if (textureData.mo393d()) {
            Application application = Gdx.app;
            C0676a c0676a = (C0676a) f1402a.get(application);
            if (c0676a == null) {
                c0676a = new C0676a();
            }
            c0676a.m2296a((Object) this);
            f1402a.put(application, c0676a);
        }
    }

    public Texture(C0316a c0316a) {
        this(c0316a, null, false);
    }

    public Texture(C0316a c0316a, Format format, boolean z) {
        this(C0381a.m1146a(c0316a, format, z));
    }

    public Texture(Pixmap pixmap) {
        this(new C0500o(pixmap, null, false));
    }

    public Texture(Pixmap pixmap, Format format) {
        this(new C0500o(pixmap, format, false));
    }

    public Texture(TextureData textureData) {
        this(Gdx.gl.glGenTexture(), textureData);
    }

    /* renamed from: a */
    public static void m1138a(Application application) {
        f1402a.remove(application);
    }

    /* renamed from: b */
    public static void m1139b(Application application) {
        int i = 0;
        C0676a c0676a = (C0676a) f1402a.get(application);
        if (c0676a != null) {
            if (f1403i == null) {
                while (i < c0676a.f3001b) {
                    ((Texture) c0676a.m2291a(i)).mo345a();
                    i++;
                }
                return;
            }
            f1403i.m794a();
            C0676a c0676a2 = new C0676a(c0676a);
            Iterator it = c0676a2.iterator();
            while (it.hasNext()) {
                Object obj = (Texture) it.next();
                String a = f1403i.m793a(obj);
                if (a == null) {
                    obj.mo345a();
                } else {
                    final int c = f1403i.m800c(a);
                    f1403i.m795a(a, 0);
                    obj.d = 0;
                    C0242c c0265b = new C0265b();
                    c0265b.f951e = obj.f1404b;
                    c0265b.f952f = obj.m1132e();
                    c0265b.f953g = obj.m1133f();
                    c0265b.f954h = obj.m1134g();
                    c0265b.f955i = obj.m1135h();
                    c0265b.f949c = obj.f1404b.mo400k();
                    c0265b.f950d = obj;
                    c0265b.a = new C0269a() {
                        /* renamed from: a */
                        public final void mo344a(C0273e c0273e, String str) {
                            c0273e.m795a(str, c);
                        }
                    };
                    f1403i.m799b(a);
                    obj.d = Gdx.gl.glGenTexture();
                    f1403i.m797a(a, Texture.class, c0265b);
                }
            }
            c0676a.mo530d();
            c0676a.m2294a(c0676a2);
        }
    }

    /* renamed from: l */
    public static String m1140l() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Managed textures/app: { ");
        for (Application application : f1402a.keySet()) {
            stringBuilder.append(((C0676a) f1402a.get(application)).f3001b);
            stringBuilder.append(" ");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    protected final void mo345a() {
        if (this.f1404b.mo393d()) {
            this.d = Gdx.gl.glGenTexture();
            m1142a(this.f1404b);
            return;
        }
        throw new GdxRuntimeException("Tried to reload unmanaged Texture");
    }

    /* renamed from: a */
    public final void m1142a(TextureData textureData) {
        if (this.f1404b == null || textureData.mo393d() == this.f1404b.mo393d()) {
            this.f1404b = textureData;
            if (!textureData.mo391a()) {
                textureData.mo392b();
            }
            m1131d();
            if (textureData != null) {
                if (!textureData.mo391a()) {
                    textureData.mo392b();
                }
                if (textureData.mo394e() == TextureDataType.Custom) {
                    textureData.mo390a(3553);
                } else {
                    int i;
                    Pixmap pixmap;
                    Pixmap f = textureData.mo395f();
                    boolean g = textureData.mo396g();
                    if (textureData.mo399j() != f.m1123g()) {
                        Pixmap pixmap2 = new Pixmap(f.f1378a.f1654b, f.f1378a.f1655c, textureData.mo399j());
                        pixmap2.m1113a(Blending.None);
                        pixmap2.m1115a(f, 0, 0, f.f1378a.f1654b, f.f1378a.f1655c);
                        if (textureData.mo396g()) {
                            f.dispose();
                        }
                        i = 1;
                        pixmap = pixmap2;
                    } else {
                        boolean z = g;
                        pixmap = f;
                    }
                    Gdx.gl.glPixelStorei(3317, 1);
                    if (textureData.mo400k()) {
                        C0499n.m1583a(3553, pixmap, pixmap.f1378a.f1654b, pixmap.f1378a.f1655c);
                    } else {
                        Gdx.gl.glTexImage2D(3553, 0, pixmap.m1120d(), pixmap.f1378a.f1654b, pixmap.f1378a.f1655c, 0, pixmap.m1119c(), pixmap.m1121e(), pixmap.m1122f());
                    }
                    if (i != 0) {
                        pixmap.dispose();
                    }
                }
            }
            m1126a(this.e, this.f);
            m1127a(this.g, this.h);
            Gdx.gl.glBindTexture(this.c, 0);
            return;
        }
        throw new GdxRuntimeException("New data must have the same managed status as the old data");
    }

    /* renamed from: b */
    public void dispose() {
        if (this.d != 0) {
            m1137j();
            if (this.f1404b.mo393d() && f1402a.get(Gdx.app) != null) {
                ((C0676a) f1402a.get(Gdx.app)).mo529b((Object) this, true);
            }
        }
    }

    /* renamed from: c */
    public final int m1144c() {
        return this.f1404b.mo397h();
    }

    /* renamed from: k */
    public final int m1145k() {
        return this.f1404b.mo398i();
    }
}
