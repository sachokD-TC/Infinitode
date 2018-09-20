package com.badlogic.gdx.graphics.g2d.freetype;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData;
import com.badlogic.gdx.graphics.g2d.BitmapFont.C0446b;
import com.badlogic.gdx.graphics.g2d.C0451d.C0450a;
import com.badlogic.gdx.graphics.g2d.C0469h;
import com.badlogic.gdx.graphics.g2d.C0469h.C0463b;
import com.badlogic.gdx.graphics.g2d.C0469h.C0464a;
import com.badlogic.gdx.graphics.g2d.C0469h.C0468d;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.graphics.g2d.freetype.FreeType.Bitmap;
import com.badlogic.gdx.graphics.g2d.freetype.FreeType.Face;
import com.badlogic.gdx.graphics.g2d.freetype.FreeType.Glyph;
import com.badlogic.gdx.graphics.g2d.freetype.FreeType.GlyphMetrics;
import com.badlogic.gdx.graphics.g2d.freetype.FreeType.GlyphSlot;
import com.badlogic.gdx.graphics.g2d.freetype.FreeType.Library;
import com.badlogic.gdx.graphics.g2d.freetype.FreeType.Size;
import com.badlogic.gdx.graphics.g2d.freetype.FreeType.SizeMetrics;
import com.badlogic.gdx.graphics.g2d.freetype.FreeType.Stroker;
import com.badlogic.gdx.math.C0549f;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.ab;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class FreeTypeFontGenerator implements Disposable {
    /* renamed from: e */
    private static int f1976e = 1024;
    /* renamed from: a */
    final Library f1977a;
    /* renamed from: b */
    final Face f1978b;
    /* renamed from: c */
    final String f1979c;
    /* renamed from: d */
    boolean f1980d = false;
    /* renamed from: f */
    private int f1981f;
    /* renamed from: g */
    private int f1982g;

    public enum Hinting {
        None,
        Slight,
        Medium,
        Full,
        AutoSlight,
        AutoMedium,
        AutoFull
    }

    /* renamed from: com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator$a */
    public static class C0456a extends BitmapFontData implements Disposable {
        /* renamed from: A */
        Stroker f1946A;
        /* renamed from: B */
        C0469h f1947B;
        /* renamed from: C */
        C0676a<C0446b> f1948C;
        /* renamed from: D */
        private boolean f1949D;
        /* renamed from: x */
        C0676a<C0438n> f1950x;
        /* renamed from: y */
        FreeTypeFontGenerator f1951y;
        /* renamed from: z */
        C0457b f1952z;

        /* renamed from: a */
        public final C0446b mo361a(char c) {
            C0446b a = super.mo361a(c);
            if (a != null || this.f1951y == null) {
                return a;
            }
            this.f1951y.m1381a(this.f1952z.f1953a);
            C0446b a2 = this.f1951y.m1379a(c, this, this.f1952z, this.f1946A, ((this.c ? -this.j : this.j) + this.i) / this.o, this.f1947B);
            if (a2 == null) {
                return this.r;
            }
            m1326a(a2, (C0438n) this.f1950x.m2291a(a2.f1820o));
            m1325a((int) c, a2);
            this.f1948C.m2296a((Object) a2);
            this.f1949D = true;
            Face face = this.f1951y.f1978b;
            if (this.f1952z.f1969q) {
                int a3 = face.m1357a(c);
                int i = this.f1948C.f3001b;
                for (int i2 = 0; i2 < i; i2++) {
                    a = (C0446b) this.f1948C.m2291a(i2);
                    int a4 = face.m1357a(a.f1806a);
                    int a5 = face.m1358a(a3, a4);
                    if (a5 != 0) {
                        a2.m1328a(a.f1806a, FreeType.m1371a(a5));
                    }
                    a4 = face.m1358a(a4, a3);
                    if (a4 != 0) {
                        a.m1328a(c, FreeType.m1371a(a4));
                    }
                }
            }
            return a2;
        }

        /* renamed from: a */
        public final void mo362a(C0450a c0450a, CharSequence charSequence, int i, int i2, boolean z) {
            if (this.f1947B != null) {
                this.f1947B.f2000a = true;
            }
            super.mo362a(c0450a, charSequence, i, i2, z);
            if (this.f1949D) {
                this.f1949D = false;
                this.f1947B.m1395a(this.f1950x, this.f1952z.f1973u, this.f1952z.f1974v, this.f1952z.f1972t);
            }
        }

        /* renamed from: b */
        public final void dispose() {
            if (this.f1946A != null) {
                this.f1946A.dispose();
            }
            if (this.f1947B != null) {
                this.f1947B.dispose();
            }
        }
    }

    /* renamed from: com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator$b */
    public static class C0457b {
        /* renamed from: a */
        public int f1953a = 16;
        /* renamed from: b */
        public boolean f1954b;
        /* renamed from: c */
        public Hinting f1955c = Hinting.AutoMedium;
        /* renamed from: d */
        public C0430b f1956d = C0430b.f1620c;
        /* renamed from: e */
        public float f1957e = 1.8f;
        /* renamed from: f */
        public int f1958f = 2;
        /* renamed from: g */
        public float f1959g = 0.0f;
        /* renamed from: h */
        public C0430b f1960h = C0430b.f1619b;
        /* renamed from: i */
        public boolean f1961i = false;
        /* renamed from: j */
        public float f1962j = 1.8f;
        /* renamed from: k */
        public int f1963k = 0;
        /* renamed from: l */
        public int f1964l = 0;
        /* renamed from: m */
        public C0430b f1965m = new C0430b(0.0f, 0.0f, 0.0f, 0.75f);
        /* renamed from: n */
        public int f1966n;
        /* renamed from: o */
        public int f1967o;
        /* renamed from: p */
        public String f1968p = "\u0000ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890\"!`?'.,;:()[]{}<>|/@\\^$€-%+=#_&~* ¡¢£¤¥¦§¨©ª«¬­®¯°±²³´µ¶·¸¹º»¼½¾¿ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõö÷øùúûüýþÿ";
        /* renamed from: q */
        public boolean f1969q = true;
        /* renamed from: r */
        public C0469h f1970r = null;
        /* renamed from: s */
        public boolean f1971s = false;
        /* renamed from: t */
        public boolean f1972t = false;
        /* renamed from: u */
        public TextureFilter f1973u = TextureFilter.Nearest;
        /* renamed from: v */
        public TextureFilter f1974v = TextureFilter.Nearest;
        /* renamed from: w */
        public boolean f1975w;
    }

    public FreeTypeFontGenerator(C0316a c0316a) {
        this.f1979c = c0316a.m898j();
        int e = (int) c0316a.mo271e();
        this.f1977a = FreeType.m1372a();
        if (this.f1977a == null) {
            throw new GdxRuntimeException("Couldn't initialize FreeType");
        }
        ByteBuffer c;
        InputStream b = c0316a.mo268b();
        if (e == 0) {
            try {
                byte[] a = ab.m2313a(b, e > 0 ? (int) (((float) e) * 1.5f) : 16384);
                c = BufferUtils.m2247c(a.length);
                BufferUtils.m2244a(a, (Buffer) c, a.length);
            } catch (Throwable e2) {
                throw new GdxRuntimeException(e2);
            } catch (Throwable th) {
                ab.m2310a(b);
            }
        } else {
            c = BufferUtils.m2247c(e);
            ab.m2312a(b, c);
        }
        ab.m2310a(b);
        Library library = this.f1977a;
        long newMemoryFace = Library.newMemoryFace(library.b, c, c.remaining(), 0);
        if (newMemoryFace == 0) {
            BufferUtils.m2243a(c);
            throw new GdxRuntimeException("Couldn't load font, FreeType error code: " + FreeType.getLastErrorCode());
        }
        library.f1884a.m2443a(newMemoryFace, c);
        this.f1978b = new Face(newMemoryFace, library);
        if (this.f1978b == null) {
            throw new GdxRuntimeException("Couldn't create face for font: " + c0316a);
        }
        e = Face.getFaceFlags(this.f1978b.b);
        if ((FreeType.f1933w & e) == FreeType.f1933w && (e & FreeType.f1936z) == FreeType.f1936z && m1376a(32, FreeType.f1896L | FreeType.f1902R) && GlyphSlot.getFormat(this.f1978b.m1359a().b) == 1651078259) {
            this.f1980d = true;
        }
        if (!this.f1980d) {
            m1381a(15);
        }
    }

    /* renamed from: a */
    private boolean m1376a(int i, int i2) {
        return Face.loadChar(this.f1978b.b, i, i2);
    }

    /* renamed from: b */
    private static int m1377b(C0457b c0457b) {
        int i = FreeType.f1896L;
        switch (c0457b.f1955c) {
            case None:
                return i | FreeType.f1898N;
            case Slight:
                return i | FreeType.ab;
            case Medium:
                return i | FreeType.aa;
            case Full:
                return i | FreeType.ac;
            case AutoSlight:
                return i | (FreeType.f1902R | FreeType.ab);
            case AutoMedium:
                return i | (FreeType.f1902R | FreeType.aa);
            case AutoFull:
                return i | (FreeType.f1902R | FreeType.ac);
            default:
                return i;
        }
    }

    /* renamed from: b */
    public static void m1378b(int i) {
        f1976e = i;
    }

    /* renamed from: a */
    final C0446b m1379a(char c, C0456a c0456a, C0457b c0457b, Stroker stroker, float f, C0469h c0469h) {
        Object obj = (this.f1978b.m1357a(c) != 0 || c == '\u0000') ? null : 1;
        if (obj != null) {
            return null;
        }
        if (!m1376a(c, m1377b(c0457b))) {
            return null;
        }
        GlyphSlot a = this.f1978b.m1359a();
        Glyph b = a.m1367b();
        try {
            Pixmap pixmap;
            Glyph glyph;
            int d;
            int c2;
            int max;
            int i;
            b.m1362a(c0457b.f1954b ? FreeType.ah : FreeType.af);
            Bitmap a2 = b.m1361a();
            Pixmap a3 = a2.m1355a(Format.RGBA8888, c0457b.f1956d, c0457b.f1957e);
            if (Bitmap.getWidth(a2.b) == 0 || Bitmap.getRows(a2.b) == 0) {
                pixmap = a3;
                glyph = b;
            } else {
                int i2;
                int i3;
                if (c0457b.f1959g > 0.0f) {
                    d = b.m1365d();
                    c2 = b.m1364c();
                    Glyph b2 = a.m1367b();
                    b2.b = Glyph.strokeBorder(b2.b, stroker.b, false);
                    b2.m1362a(c0457b.f1954b ? FreeType.ah : FreeType.af);
                    c2 -= b2.m1364c();
                    i2 = -(d - b2.m1365d());
                    pixmap = b2.m1361a().m1355a(Format.RGBA8888, c0457b.f1960h, c0457b.f1962j);
                    i3 = c0457b.f1958f;
                    for (d = 0; d < i3; d++) {
                        pixmap.m1114a(a3, c2, i2);
                    }
                    a3.dispose();
                    b.dispose();
                    glyph = b2;
                } else {
                    pixmap = a3;
                    glyph = b;
                }
                int i4;
                if (c0457b.f1963k != 0 || c0457b.f1964l != 0) {
                    c2 = pixmap.f1378a.f1654b;
                    i2 = pixmap.f1378a.f1655c;
                    i3 = Math.max(c0457b.f1963k, 0);
                    max = Math.max(c0457b.f1964l, 0);
                    int abs = c2 + Math.abs(c0457b.f1963k);
                    Pixmap pixmap2 = new Pixmap(abs, i2 + Math.abs(c0457b.f1964l), pixmap.m1123g());
                    C0430b c0430b = c0457b.f1965m;
                    float f2 = c0430b.f1647L;
                    if (f2 != 0.0f) {
                        byte b3 = (byte) ((int) (c0430b.f1644I * 255.0f));
                        byte b4 = (byte) ((int) (c0430b.f1645J * 255.0f));
                        byte b5 = (byte) ((int) (c0430b.f1646K * 255.0f));
                        ByteBuffer f3 = pixmap.m1122f();
                        ByteBuffer f4 = pixmap2.m1122f();
                        for (d = 0; d < i2; d++) {
                            int i5 = ((d + max) * abs) + i3;
                            for (i4 = 0; i4 < c2; i4++) {
                                byte b6 = f3.get((((c2 * d) + i4) * 4) + 3);
                                if (b6 != (byte) 0) {
                                    int i6 = (i5 + i4) * 4;
                                    f4.put(i6, b3);
                                    f4.put(i6 + 1, b4);
                                    f4.put(i6 + 2, b5);
                                    f4.put(i6 + 3, (byte) ((int) (((float) (b6 & 255)) * f2)));
                                }
                            }
                        }
                    }
                    d = c0457b.f1958f;
                    for (i4 = 0; i4 < d; i4++) {
                        pixmap2.m1114a(pixmap, Math.max(-c0457b.f1963k, 0), Math.max(-c0457b.f1964l, 0));
                    }
                    pixmap.dispose();
                    pixmap = pixmap2;
                } else if (c0457b.f1959g == 0.0f) {
                    i4 = c0457b.f1958f - 1;
                    for (i = 0; i < i4; i++) {
                        pixmap.m1114a(pixmap, 0, 0);
                    }
                }
            }
            GlyphMetrics a4 = a.m1366a();
            C0446b c0446b = new C0446b();
            c0446b.f1806a = c;
            c0446b.f1809d = pixmap.f1378a.f1654b;
            c0446b.f1810e = pixmap.f1378a.f1655c;
            c0446b.f1815j = glyph.m1364c();
            c0446b.f1816k = c0457b.f1971s ? (-glyph.m1365d()) + ((int) f) : (-(c0446b.f1810e - glyph.m1365d())) - ((int) f);
            c0446b.f1817l = (FreeType.m1371a(GlyphMetrics.getHoriAdvance(a4.b)) + ((int) c0457b.f1959g)) + c0457b.f1966n;
            if (this.f1980d) {
                pixmap.m1117a(C0430b.f1618a);
                pixmap.m1111a();
                ByteBuffer a5 = a2.m1356a();
                d = C0430b.f1620c.m1220b();
                int b7 = C0430b.f1618a.m1220b();
                for (c2 = 0; c2 < c0446b.f1810e; c2++) {
                    max = c2 * Bitmap.getPitch(a2.b);
                    for (i = 0; i < c0446b.f1809d + c0446b.f1815j; i++) {
                        Gdx2DPixmap.setPixel(pixmap.f1378a.f1653a, i, c2, ((a5.get((i / 8) + max) >>> (7 - (i % 8))) & 1) == 1 ? d : b7);
                    }
                }
            }
            Rectangle a6 = c0469h.m1393a(pixmap);
            c0446b.f1820o = c0469h.f2008i.f3001b - 1;
            c0446b.f1807b = (int) a6.f2332x;
            c0446b.f1808c = (int) a6.f2333y;
            if (c0457b.f1975w && c0456a.f1950x != null && c0456a.f1950x.f3001b <= c0446b.f1820o) {
                c0469h.m1395a(c0456a.f1950x, c0457b.f1973u, c0457b.f1974v, c0457b.f1972t);
            }
            pixmap.dispose();
            glyph.dispose();
            return c0446b;
        } catch (GdxRuntimeException e) {
            b.dispose();
            Gdx.app.log("FreeTypeFontGenerator", "Couldn't render char: " + c);
            return null;
        }
    }

    /* renamed from: a */
    public final BitmapFont m1380a(C0457b c0457b) {
        int i;
        int i2;
        BitmapFontData c0456a = new C0456a();
        char[] toCharArray = c0457b.f1968p.toCharArray();
        int length = toCharArray.length;
        boolean z = c0457b.f1975w;
        int b = m1377b(c0457b);
        m1381a(c0457b.f1953a);
        SizeMetrics sizeMetrics = new SizeMetrics(Size.getMetrics(new Size(Face.getSize(this.f1978b.b)).b));
        c0456a.c = c0457b.f1971s;
        c0456a.j = (float) FreeType.m1371a(SizeMetrics.getAscender(sizeMetrics.b));
        c0456a.k = (float) FreeType.m1371a(SizeMetrics.getDescender(sizeMetrics.b));
        c0456a.h = (float) FreeType.m1371a(SizeMetrics.getHeight(sizeMetrics.b));
        float f = c0456a.j;
        if (this.f1980d && c0456a.h == 0.0f) {
            for (i = 32; i < Face.getNumGlyphs(this.f1978b.b) + 32; i++) {
                if (m1376a(i, b)) {
                    int a = FreeType.m1371a(GlyphMetrics.getHeight(this.f1978b.m1359a().m1366a().b));
                    c0456a.h = ((float) a) > c0456a.h ? (float) a : c0456a.h;
                }
            }
        }
        c0456a.h += (float) c0457b.f1967o;
        if (m1376a(32, b) || m1376a(108, b)) {
            c0456a.s = (float) FreeType.m1371a(GlyphMetrics.getHoriAdvance(this.f1978b.m1359a().m1366a().b));
        } else {
            c0456a.s = (float) Face.getMaxAdvanceWidth(this.f1978b.b);
        }
        for (char a2 : c0456a.v) {
            if (m1376a(a2, b)) {
                c0456a.t = (float) FreeType.m1371a(GlyphMetrics.getHeight(this.f1978b.m1359a().m1366a().b));
                break;
            }
        }
        if (c0456a.t == 0.0f) {
            throw new GdxRuntimeException("No x-height character found in font");
        }
        for (char a22 : c0456a.w) {
            if (m1376a(a22, b)) {
                c0456a.i = (float) FreeType.m1371a(GlyphMetrics.getHeight(this.f1978b.m1359a().m1366a().b));
                break;
            }
        }
        if (this.f1980d || c0456a.i != 1.0f) {
            Object obj;
            Object obj2;
            c0456a.j -= c0456a.i;
            c0456a.l = -c0456a.h;
            if (c0457b.f1971s) {
                c0456a.j = -c0456a.j;
                c0456a.l = -c0456a.l;
            }
            C0469h c0469h = c0457b.f1970r;
            if (c0469h == null) {
                C0463b c0464a;
                if (z) {
                    a = f1976e;
                    c0464a = new C0464a();
                } else {
                    i = (int) Math.ceil((double) c0456a.h);
                    i = C0549f.m1768b((int) Math.sqrt((double) ((i * i) * length)));
                    if (f1976e > 0) {
                        i = Math.min(i, f1976e);
                    }
                    C0468d c0468d = new C0468d();
                    a = i;
                    obj = c0468d;
                }
                c0469h = new C0469h(a, a, Format.RGBA8888, c0464a);
                c0469h.m1394a(c0457b.f1956d);
                c0469h.f2007h.f1647L = 0.0f;
                if (c0457b.f1959g > 0.0f) {
                    c0469h.m1394a(c0457b.f1960h);
                    c0469h.f2007h.f1647L = 0.0f;
                }
                obj2 = 1;
            } else {
                obj2 = null;
            }
            if (z) {
                c0456a.f1948C = new C0676a(length + 32);
            }
            Stroker stroker = null;
            if (c0457b.f1959g > 0.0f) {
                long strokerNew = Library.strokerNew(this.f1977a.b);
                if (strokerNew == 0) {
                    throw new GdxRuntimeException("Couldn't create FreeType stroker, FreeType error code: " + FreeType.getLastErrorCode());
                }
                Stroker stroker2 = new Stroker(strokerNew);
                Stroker.set(stroker2.b, (int) (c0457b.f1959g * 64.0f), c0457b.f1961i ? FreeType.ao : FreeType.ap, c0457b.f1961i ? FreeType.av : FreeType.ar, 0);
                stroker = stroker2;
            }
            obj = m1379a('\u0000', c0456a, c0457b, stroker, f, c0469h);
            if (!(obj == null || obj.f1809d == 0 || obj.f1810e == 0)) {
                c0456a.m1325a(0, (C0446b) obj);
                if (z) {
                    c0456a.f1948C.m2296a(obj);
                }
            }
            int[] iArr = new int[length];
            for (a = 0; a < length; a++) {
                iArr[a] = m1376a(toCharArray[a], b) ? FreeType.m1371a(GlyphMetrics.getHeight(this.f1978b.m1359a().m1366a().b)) : 0;
            }
            b = length;
            while (b > 0) {
                int i3 = 0;
                a = iArr[0];
                i2 = 1;
                while (i2 < b) {
                    i = iArr[i2];
                    if (i > a) {
                        a = i2;
                    } else {
                        i = a;
                        a = i3;
                    }
                    i2++;
                    i3 = a;
                    a = i;
                }
                char c = toCharArray[i3];
                obj = m1379a(c, c0456a, c0457b, stroker, f, c0469h);
                if (obj != null) {
                    c0456a.m1325a((int) c, (C0446b) obj);
                    if (z) {
                        c0456a.f1948C.m2296a(obj);
                    }
                }
                i = b - 1;
                iArr[i3] = iArr[i];
                c = toCharArray[i3];
                toCharArray[i3] = toCharArray[i];
                toCharArray[i] = c;
                b = i;
            }
            if (!(stroker == null || z)) {
                stroker.dispose();
            }
            if (z) {
                c0456a.f1951y = this;
                c0456a.f1952z = c0457b;
                c0456a.f1946A = stroker;
                c0456a.f1947B = c0469h;
            }
            c0457b.f1969q &= Face.hasKerning(this.f1978b.b);
            if (c0457b.f1969q) {
                for (i = 0; i < length; i++) {
                    char c2 = toCharArray[i];
                    C0446b a3 = c0456a.mo361a(c2);
                    if (a3 != null) {
                        int a4 = this.f1978b.m1357a(c2);
                        for (a = i; a < length; a++) {
                            char c3 = toCharArray[a];
                            C0446b a5 = c0456a.mo361a(c3);
                            if (a5 != null) {
                                b = this.f1978b.m1357a(c3);
                                int a6 = this.f1978b.m1358a(a4, b);
                                if (a6 != 0) {
                                    a3.m1328a(c3, FreeType.m1371a(a6));
                                }
                                int a7 = this.f1978b.m1358a(b, a4);
                                if (a7 != 0) {
                                    a5.m1328a(c2, FreeType.m1371a(a7));
                                }
                            }
                        }
                    }
                }
            }
            if (obj2 != null) {
                c0456a.f1950x = new C0676a();
                c0469h.m1395a(c0456a.f1950x, c0457b.f1973u, c0457b.f1974v, c0457b.f1972t);
            }
            C0446b a8 = c0456a.mo361a(' ');
            if (a8 == null) {
                a8 = new C0446b();
                a8.f1817l = ((int) c0456a.s) + c0457b.f1966n;
                a8.f1806a = 32;
                c0456a.m1325a(32, a8);
            }
            if (a8.f1809d == 0) {
                a8.f1809d = (int) (((float) a8.f1817l) + c0456a.e);
            }
            if (c0456a.f1950x == null && c0457b.f1970r != null) {
                c0456a.f1950x = new C0676a();
                c0457b.f1970r.m1395a(c0456a.f1950x, c0457b.f1973u, c0457b.f1974v, c0457b.f1972t);
            }
            BitmapFont bitmapFont = new BitmapFont(c0456a, c0456a.f1950x);
            bitmapFont.f1826f = c0457b.f1970r == null;
            return bitmapFont;
        }
        throw new GdxRuntimeException("No cap character found in font");
    }

    /* renamed from: a */
    final void m1381a(int i) {
        this.f1981f = 0;
        this.f1982g = i;
        if (!this.f1980d && !Face.setPixelSizes(this.f1978b.b, 0, i)) {
            throw new GdxRuntimeException("Couldn't set size for font");
        }
    }

    /* renamed from: b */
    public final void dispose() {
        this.f1978b.dispose();
        this.f1977a.dispose();
    }
}
