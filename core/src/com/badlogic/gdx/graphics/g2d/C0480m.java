package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.Texture.TextureWrap;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.C0712r;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.ab;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.badlogic.gdx.graphics.g2d.m */
public class C0480m implements Disposable {
    /* renamed from: a */
    static final String[] f2084a = new String[4];
    /* renamed from: d */
    static final Comparator<C0478b> f2085d = new C04741();
    /* renamed from: b */
    public final C0712r<Texture> f2086b;
    /* renamed from: c */
    public final C0676a<C0475a> f2087c;

    /* renamed from: com.badlogic.gdx.graphics.g2d.m$1 */
    static class C04741 implements Comparator<C0478b> {
        C04741() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            int i = Integer.MAX_VALUE;
            C0478b c0478b = (C0478b) obj2;
            int i2 = ((C0478b) obj).f2068b;
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            int i3 = c0478b.f2068b;
            if (i3 != -1) {
                i = i3;
            }
            return i2 - i;
        }
    }

    /* renamed from: com.badlogic.gdx.graphics.g2d.m$a */
    public static class C0475a extends C0438n {
        /* renamed from: a */
        public int f2043a;
        /* renamed from: b */
        public String f2044b;
        /* renamed from: c */
        public float f2045c;
        /* renamed from: d */
        public float f2046d;
        /* renamed from: e */
        public int f2047e;
        /* renamed from: f */
        public int f2048f;
        /* renamed from: g */
        public int f2049g;
        /* renamed from: h */
        public int f2050h;
        /* renamed from: i */
        public boolean f2051i;
        /* renamed from: j */
        public int[] f2052j;
        /* renamed from: k */
        public int[] f2053k;

        public C0475a(Texture texture, int i, int i2, int i3, int i4) {
            super(texture, i, i2, i3, i4);
            this.f2049g = i3;
            this.f2050h = i4;
            this.f2047e = i3;
            this.f2048f = i4;
        }

        public C0475a(C0475a c0475a) {
            m1244a(c0475a);
            this.f2043a = c0475a.f2043a;
            this.f2044b = c0475a.f2044b;
            this.f2045c = c0475a.f2045c;
            this.f2046d = c0475a.f2046d;
            this.f2047e = c0475a.f2047e;
            this.f2048f = c0475a.f2048f;
            this.f2049g = c0475a.f2049g;
            this.f2050h = c0475a.f2050h;
            this.f2051i = c0475a.f2051i;
            this.f2052j = c0475a.f2052j;
        }

        /* renamed from: a */
        public final float m1423a() {
            return this.f2051i ? (float) this.f2048f : (float) this.f2047e;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, boolean z2) {
            super.mo353a(z, z2);
            if (z) {
                this.f2045c = (((float) this.f2049g) - this.f2045c) - m1423a();
            }
            if (z2) {
                this.f2046d = (((float) this.f2050h) - this.f2046d) - m1425b();
            }
        }

        /* renamed from: b */
        public final float m1425b() {
            return this.f2051i ? (float) this.f2047e : (float) this.f2048f;
        }

        public final String toString() {
            return this.f2044b;
        }
    }

    /* renamed from: com.badlogic.gdx.graphics.g2d.m$b */
    public static class C0476b extends C0439k {
        /* renamed from: a */
        final C0475a f2054a;
        /* renamed from: b */
        float f2055b;
        /* renamed from: c */
        float f2056c;

        public C0476b(C0475a c0475a) {
            this.f2054a = new C0475a(c0475a);
            this.f2055b = c0475a.f2045c;
            this.f2056c = c0475a.f2046d;
            m1244a(c0475a);
            mo386c(((float) c0475a.f2049g) / 2.0f, ((float) c0475a.f2050h) / 2.0f);
            int i = c0475a.f1684E;
            int i2 = c0475a.f1685F;
            if (c0475a.f2051i) {
                super.mo383a(true);
                super.mo382a(c0475a.f2045c, c0475a.f2046d, (float) i2, (float) i);
            } else {
                super.mo382a(c0475a.f2045c, c0475a.f2046d, (float) i, (float) i2);
            }
            m1263b(1.0f, 1.0f, 1.0f, 1.0f);
        }

        public C0476b(C0476b c0476b) {
            this.f2054a = c0476b.f2054a;
            this.f2055b = c0476b.f2055b;
            this.f2056c = c0476b.f2056c;
            m1257a((C0439k) c0476b);
        }

        /* renamed from: h */
        private float m1426h() {
            return super.mo385c() / this.f2054a.m1423a();
        }

        /* renamed from: i */
        private float m1427i() {
            return super.mo387d() / this.f2054a.m1425b();
        }

        /* renamed from: a */
        public final float mo380a() {
            return super.mo380a() - this.f2054a.f2045c;
        }

        /* renamed from: a */
        public final void mo381a(float f, float f2) {
            mo382a(mo380a(), mo384b(), f, f2);
        }

        /* renamed from: a */
        public final void mo382a(float f, float f2, float f3, float f4) {
            float f5 = f3 / ((float) this.f2054a.f2049g);
            float f6 = f4 / ((float) this.f2054a.f2050h);
            this.f2054a.f2045c = this.f2055b * f5;
            this.f2054a.f2046d = this.f2056c * f6;
            super.mo382a(this.f2054a.f2045c + f, this.f2054a.f2046d + f2, ((float) (this.f2054a.f2051i ? this.f2054a.f2048f : this.f2054a.f2047e)) * f5, ((float) (this.f2054a.f2051i ? this.f2054a.f2047e : this.f2054a.f2048f)) * f6);
        }

        /* renamed from: a */
        public final void mo383a(boolean z) {
            super.mo383a(z);
            float e = mo388e();
            float f = mo389f();
            float f2 = this.f2054a.f2045c;
            float f3 = this.f2054a.f2046d;
            float h = m1426h();
            float i = m1427i();
            if (z) {
                this.f2054a.f2045c = f3;
                this.f2054a.f2046d = ((i * ((float) this.f2054a.f2050h)) - f2) - (h * ((float) this.f2054a.f2047e));
            } else {
                this.f2054a.f2045c = ((h * ((float) this.f2054a.f2049g)) - f3) - (i * ((float) this.f2054a.f2048f));
                this.f2054a.f2046d = f2;
            }
            m1262b(this.f2054a.f2045c - f2, this.f2054a.f2046d - f3);
            mo386c(e, f);
        }

        /* renamed from: a */
        public final void mo353a(boolean z, boolean z2) {
            if (this.f2054a.f2051i) {
                super.mo353a(z2, z);
            } else {
                super.mo353a(z, z2);
            }
            float e = mo388e();
            float f = mo389f();
            float f2 = this.f2054a.f2045c;
            float f3 = this.f2054a.f2046d;
            float h = m1426h();
            float i = m1427i();
            this.f2054a.f2045c = this.f2055b;
            this.f2054a.f2046d = this.f2056c;
            this.f2054a.mo353a(z, z2);
            this.f2055b = this.f2054a.f2045c;
            this.f2056c = this.f2054a.f2046d;
            C0475a c0475a = this.f2054a;
            c0475a.f2045c = h * c0475a.f2045c;
            C0475a c0475a2 = this.f2054a;
            c0475a2.f2046d = i * c0475a2.f2046d;
            m1262b(this.f2054a.f2045c - f2, this.f2054a.f2046d - f3);
            mo386c(e, f);
        }

        /* renamed from: b */
        public final float mo384b() {
            return super.mo384b() - this.f2054a.f2046d;
        }

        /* renamed from: c */
        public final float mo385c() {
            return (super.mo385c() / this.f2054a.m1423a()) * ((float) this.f2054a.f2049g);
        }

        /* renamed from: c */
        public final void mo386c(float f, float f2) {
            super.mo386c(f - this.f2054a.f2045c, f2 - this.f2054a.f2046d);
        }

        /* renamed from: d */
        public final float mo387d() {
            return (super.mo387d() / this.f2054a.m1425b()) * ((float) this.f2054a.f2050h);
        }

        /* renamed from: e */
        public final float mo388e() {
            return super.mo388e() + this.f2054a.f2045c;
        }

        /* renamed from: f */
        public final float mo389f() {
            return super.mo389f() + this.f2054a.f2046d;
        }

        public final String toString() {
            return this.f2054a.toString();
        }
    }

    /* renamed from: com.badlogic.gdx.graphics.g2d.m$c */
    public static class C0479c {
        /* renamed from: a */
        public final C0676a<C0477a> f2082a = new C0676a();
        /* renamed from: b */
        final C0676a<C0478b> f2083b = new C0676a();

        /* renamed from: com.badlogic.gdx.graphics.g2d.m$c$a */
        public static class C0477a {
            /* renamed from: a */
            public final C0316a f2057a;
            /* renamed from: b */
            public Texture f2058b;
            /* renamed from: c */
            public final float f2059c;
            /* renamed from: d */
            public final float f2060d;
            /* renamed from: e */
            public final boolean f2061e;
            /* renamed from: f */
            public final Format f2062f;
            /* renamed from: g */
            public final TextureFilter f2063g;
            /* renamed from: h */
            public final TextureFilter f2064h;
            /* renamed from: i */
            public final TextureWrap f2065i;
            /* renamed from: j */
            public final TextureWrap f2066j;

            public C0477a(C0316a c0316a, float f, float f2, boolean z, Format format, TextureFilter textureFilter, TextureFilter textureFilter2, TextureWrap textureWrap, TextureWrap textureWrap2) {
                this.f2059c = f;
                this.f2060d = f2;
                this.f2057a = c0316a;
                this.f2061e = z;
                this.f2062f = format;
                this.f2063g = textureFilter;
                this.f2064h = textureFilter2;
                this.f2065i = textureWrap;
                this.f2066j = textureWrap2;
            }
        }

        /* renamed from: com.badlogic.gdx.graphics.g2d.m$c$b */
        public static class C0478b {
            /* renamed from: a */
            public C0477a f2067a;
            /* renamed from: b */
            public int f2068b;
            /* renamed from: c */
            public String f2069c;
            /* renamed from: d */
            public float f2070d;
            /* renamed from: e */
            public float f2071e;
            /* renamed from: f */
            public int f2072f;
            /* renamed from: g */
            public int f2073g;
            /* renamed from: h */
            public boolean f2074h;
            /* renamed from: i */
            public int f2075i;
            /* renamed from: j */
            public int f2076j;
            /* renamed from: k */
            public int f2077k;
            /* renamed from: l */
            public int f2078l;
            /* renamed from: m */
            public boolean f2079m;
            /* renamed from: n */
            public int[] f2080n;
            /* renamed from: o */
            public int[] f2081o;
        }

        public C0479c(C0316a c0316a, C0316a c0316a2, boolean z) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c0316a.mo268b()), 64);
            C0477a c0477a = null;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        ab.m2310a(bufferedReader);
                        this.f2083b.mo526a(C0480m.f2085d);
                        return;
                    } else if (readLine.trim().length() == 0) {
                        c0477a = null;
                    } else if (c0477a == null) {
                        C0316a a = c0316a2.mo266a(readLine);
                        float f = 0.0f;
                        float f2 = 0.0f;
                        if (C0480m.m1441b(bufferedReader) == 2) {
                            f = (float) Integer.parseInt(C0480m.f2084a[0]);
                            f2 = (float) Integer.parseInt(C0480m.f2084a[1]);
                            C0480m.m1441b(bufferedReader);
                        }
                        Format valueOf = Format.valueOf(C0480m.f2084a[0]);
                        C0480m.m1441b(bufferedReader);
                        TextureFilter valueOf2 = TextureFilter.valueOf(C0480m.f2084a[0]);
                        TextureFilter valueOf3 = TextureFilter.valueOf(C0480m.f2084a[1]);
                        String a2 = C0480m.m1439a(bufferedReader);
                        TextureWrap textureWrap = TextureWrap.ClampToEdge;
                        TextureWrap textureWrap2 = TextureWrap.ClampToEdge;
                        if (a2.equals("x")) {
                            textureWrap = TextureWrap.Repeat;
                        } else if (a2.equals("y")) {
                            textureWrap2 = TextureWrap.Repeat;
                        } else if (a2.equals("xy")) {
                            textureWrap = TextureWrap.Repeat;
                            textureWrap2 = TextureWrap.Repeat;
                        }
                        boolean z2 = (valueOf2.glEnum == 9728 || valueOf2.glEnum == 9729) ? false : true;
                        c0477a = new C0477a(a, f, f2, z2, valueOf, valueOf2, valueOf3, textureWrap, textureWrap2);
                        this.f2082a.m2296a((Object) c0477a);
                    } else {
                        boolean booleanValue = Boolean.valueOf(C0480m.m1439a(bufferedReader)).booleanValue();
                        C0480m.m1441b(bufferedReader);
                        int parseInt = Integer.parseInt(C0480m.f2084a[0]);
                        int parseInt2 = Integer.parseInt(C0480m.f2084a[1]);
                        C0480m.m1441b(bufferedReader);
                        int parseInt3 = Integer.parseInt(C0480m.f2084a[0]);
                        int parseInt4 = Integer.parseInt(C0480m.f2084a[1]);
                        Object c0478b = new C0478b();
                        c0478b.f2067a = c0477a;
                        c0478b.f2075i = parseInt;
                        c0478b.f2076j = parseInt2;
                        c0478b.f2077k = parseInt3;
                        c0478b.f2078l = parseInt4;
                        c0478b.f2069c = readLine;
                        c0478b.f2074h = booleanValue;
                        if (C0480m.m1441b(bufferedReader) == 4) {
                            c0478b.f2080n = new int[]{Integer.parseInt(C0480m.f2084a[0]), Integer.parseInt(C0480m.f2084a[1]), Integer.parseInt(C0480m.f2084a[2]), Integer.parseInt(C0480m.f2084a[3])};
                            if (C0480m.m1441b(bufferedReader) == 4) {
                                c0478b.f2081o = new int[]{Integer.parseInt(C0480m.f2084a[0]), Integer.parseInt(C0480m.f2084a[1]), Integer.parseInt(C0480m.f2084a[2]), Integer.parseInt(C0480m.f2084a[3])};
                                C0480m.m1441b(bufferedReader);
                            }
                        }
                        c0478b.f2072f = Integer.parseInt(C0480m.f2084a[0]);
                        c0478b.f2073g = Integer.parseInt(C0480m.f2084a[1]);
                        C0480m.m1441b(bufferedReader);
                        c0478b.f2070d = (float) Integer.parseInt(C0480m.f2084a[0]);
                        c0478b.f2071e = (float) Integer.parseInt(C0480m.f2084a[1]);
                        c0478b.f2068b = Integer.parseInt(C0480m.m1439a(bufferedReader));
                        if (z) {
                            c0478b.f2079m = true;
                        }
                        this.f2083b.m2296a(c0478b);
                    }
                } catch (Throwable e) {
                    throw new GdxRuntimeException("Error reading pack file: " + c0316a, e);
                } catch (Throwable th) {
                    ab.m2310a(bufferedReader);
                }
            }
        }
    }

    public C0480m() {
        this.f2086b = new C0712r((byte) 0);
        this.f2087c = new C0676a();
    }

    private C0480m(C0316a c0316a) {
        this(c0316a, c0316a.mo265a());
    }

    private C0480m(C0316a c0316a, C0316a c0316a2) {
        this(c0316a, c0316a2, (byte) 0);
    }

    private C0480m(C0316a c0316a, C0316a c0316a2, byte b) {
        this(new C0479c(c0316a, c0316a2, false));
    }

    public C0480m(C0479c c0479c) {
        this.f2086b = new C0712r((byte) 0);
        this.f2087c = new C0676a();
        if (c0479c != null) {
            m1440a(c0479c);
        }
    }

    public C0480m(String str) {
        this(Gdx.files.mo277b(str));
    }

    /* renamed from: a */
    static String m1439a(BufferedReader bufferedReader) {
        String readLine = bufferedReader.readLine();
        int indexOf = readLine.indexOf(58);
        if (indexOf != -1) {
            return readLine.substring(indexOf + 1).trim();
        }
        throw new GdxRuntimeException("Invalid line: " + readLine);
    }

    /* renamed from: a */
    private void m1440a(C0479c c0479c) {
        C0710q c0710q = new C0710q();
        Iterator it = c0479c.f2082a.iterator();
        while (it.hasNext()) {
            Object texture;
            C0477a c0477a = (C0477a) it.next();
            if (c0477a.f2058b == null) {
                texture = new Texture(c0477a.f2057a, c0477a.f2062f, c0477a.f2061e);
                texture.m1129b(c0477a.f2063g, c0477a.f2064h);
                texture.m1130b(c0477a.f2065i, c0477a.f2066j);
            } else {
                texture = c0477a.f2058b;
                texture.m1129b(c0477a.f2063g, c0477a.f2064h);
                texture.m1130b(c0477a.f2065i, c0477a.f2066j);
            }
            this.f2086b.m2486a(texture);
            c0710q.mo542a(c0477a, texture);
        }
        Iterator it2 = c0479c.f2083b.iterator();
        while (it2.hasNext()) {
            C0478b c0478b = (C0478b) it2.next();
            int i = c0478b.f2077k;
            int i2 = c0478b.f2078l;
            Texture texture2 = (Texture) c0710q.m2467a(c0478b.f2067a);
            int i3 = c0478b.f2075i;
            int i4 = c0478b.f2076j;
            int i5 = c0478b.f2074h ? i2 : i;
            if (c0478b.f2074h) {
                i2 = i;
            }
            Object c0475a = new C0475a(texture2, i3, i4, i5, i2);
            c0475a.f2043a = c0478b.f2068b;
            c0475a.f2044b = c0478b.f2069c;
            c0475a.f2045c = c0478b.f2070d;
            c0475a.f2046d = c0478b.f2071e;
            c0475a.f2050h = c0478b.f2073g;
            c0475a.f2049g = c0478b.f2072f;
            c0475a.f2051i = c0478b.f2074h;
            c0475a.f2052j = c0478b.f2080n;
            c0475a.f2053k = c0478b.f2081o;
            if (c0478b.f2079m) {
                c0475a.mo353a(false, true);
            }
            this.f2087c.m2296a(c0475a);
        }
    }

    /* renamed from: b */
    static int m1441b(BufferedReader bufferedReader) {
        String readLine = bufferedReader.readLine();
        int indexOf = readLine.indexOf(58);
        if (indexOf == -1) {
            throw new GdxRuntimeException("Invalid line: " + readLine);
        }
        indexOf++;
        int i = 0;
        while (i < 3) {
            int indexOf2 = readLine.indexOf(44, indexOf);
            if (indexOf2 == -1) {
                break;
            }
            f2084a[i] = readLine.substring(indexOf, indexOf2).trim();
            indexOf = indexOf2 + 1;
            i++;
        }
        f2084a[i] = readLine.substring(indexOf).trim();
        return i + 1;
    }

    /* renamed from: a */
    public final C0475a m1442a(String str) {
        int i = this.f2087c.f3001b;
        for (int i2 = 0; i2 < i; i2++) {
            if (((C0475a) this.f2087c.m2291a(i2)).f2044b.equals(str)) {
                return (C0475a) this.f2087c.m2291a(i2);
            }
        }
        return null;
    }

    /* renamed from: b */
    public final C0439k m1443b(String str) {
        int i = this.f2087c.f3001b;
        for (int i2 = 0; i2 < i; i2++) {
            if (((C0475a) this.f2087c.m2291a(i2)).f2044b.equals(str)) {
                C0475a c0475a = (C0475a) this.f2087c.m2291a(i2);
                if (c0475a.f2047e != c0475a.f2049g || c0475a.f2048f != c0475a.f2050h) {
                    return new C0476b(c0475a);
                }
                if (!c0475a.f2051i) {
                    return new C0439k((C0438n) c0475a);
                }
                C0439k c0439k = new C0439k((C0438n) c0475a);
                c0439k.mo382a(0.0f, 0.0f, (float) c0475a.f1685F, (float) c0475a.f1684E);
                c0439k.mo383a(true);
                return c0439k;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void dispose() {
        Iterator c = this.f2086b.m2489c();
        while (c.hasNext()) {
            ((Texture) c.next()).dispose();
        }
        this.f2086b.m2484a();
    }
}
