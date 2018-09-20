package com.badlogic.gdx.graphics.g2d.freetype;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Blending;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.C0700o;
import com.badlogic.gdx.utils.C0700o.C0699d;
import com.badlogic.gdx.utils.C0726x;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Iterator;

public class FreeType {
    /* renamed from: A */
    public static int f1885A = 32;
    /* renamed from: B */
    public static int f1886B = 64;
    /* renamed from: C */
    public static int f1887C = 128;
    /* renamed from: D */
    public static int f1888D = 256;
    /* renamed from: E */
    public static int f1889E = 512;
    /* renamed from: F */
    public static int f1890F = 1024;
    /* renamed from: G */
    public static int f1891G = 2048;
    /* renamed from: H */
    public static int f1892H = 4096;
    /* renamed from: I */
    public static int f1893I = 8192;
    /* renamed from: J */
    public static int f1894J = 1;
    /* renamed from: K */
    public static int f1895K = 2;
    /* renamed from: L */
    public static int f1896L = 0;
    /* renamed from: M */
    public static int f1897M = 1;
    /* renamed from: N */
    public static int f1898N = 2;
    /* renamed from: O */
    public static int f1899O = 4;
    /* renamed from: P */
    public static int f1900P = 8;
    /* renamed from: Q */
    public static int f1901Q = 16;
    /* renamed from: R */
    public static int f1902R = 32;
    /* renamed from: S */
    public static int f1903S = 64;
    /* renamed from: T */
    public static int f1904T = 128;
    /* renamed from: U */
    public static int f1905U = 512;
    /* renamed from: V */
    public static int f1906V = 1024;
    /* renamed from: W */
    public static int f1907W = 2048;
    /* renamed from: X */
    public static int f1908X = 4096;
    /* renamed from: Y */
    public static int f1909Y = 8192;
    /* renamed from: Z */
    public static int f1910Z = 32768;
    /* renamed from: a */
    public static int f1911a = 0;
    public static int aa = 0;
    public static int ab = 65536;
    public static int ac = 131072;
    public static int ad = 196608;
    public static int ae = 262144;
    public static int af = 0;
    public static int ag = 1;
    public static int ah = 2;
    public static int ai = 3;
    public static int aj = 4;
    public static int ak = 5;
    public static int al = 0;
    public static int am = 1;
    public static int an = 2;
    public static int ao = 0;
    public static int ap = 1;
    public static int aq = 2;
    public static int ar = 0;
    public static int as = 1;
    public static int at = 2;
    public static int au = 2;
    public static int av = 3;
    /* renamed from: b */
    public static int f1912b = 1;
    /* renamed from: c */
    public static int f1913c = 2;
    /* renamed from: d */
    public static int f1914d = 3;
    /* renamed from: e */
    public static int f1915e = 4;
    /* renamed from: f */
    public static int f1916f = 5;
    /* renamed from: g */
    public static int f1917g = 6;
    /* renamed from: h */
    public static int f1918h = 0;
    /* renamed from: i */
    public static int f1919i = m1370a('s', 'y', 'm', 'b');
    /* renamed from: j */
    public static int f1920j = m1370a('u', 'n', 'i', 'c');
    /* renamed from: k */
    public static int f1921k = m1370a('s', 'j', 'i', 's');
    /* renamed from: l */
    public static int f1922l = m1370a('g', 'b', ' ', ' ');
    /* renamed from: m */
    public static int f1923m = m1370a('b', 'i', 'g', '5');
    /* renamed from: n */
    public static int f1924n = m1370a('w', 'a', 'n', 's');
    /* renamed from: o */
    public static int f1925o = m1370a('j', 'o', 'h', 'a');
    /* renamed from: p */
    public static int f1926p = m1370a('A', 'D', 'O', 'B');
    /* renamed from: q */
    public static int f1927q = m1370a('A', 'D', 'B', 'E');
    /* renamed from: r */
    public static int f1928r = m1370a('A', 'D', 'B', 'C');
    /* renamed from: s */
    public static int f1929s = m1370a('l', 'a', 't', '1');
    /* renamed from: t */
    public static int f1930t = m1370a('l', 'a', 't', '2');
    /* renamed from: u */
    public static int f1931u = m1370a('a', 'r', 'm', 'n');
    /* renamed from: v */
    public static int f1932v = 1;
    /* renamed from: w */
    public static int f1933w = 2;
    /* renamed from: x */
    public static int f1934x = 4;
    /* renamed from: y */
    public static int f1935y = 8;
    /* renamed from: z */
    public static int f1936z = 16;

    /* renamed from: com.badlogic.gdx.graphics.g2d.freetype.FreeType$a */
    private static class C0454a {
        /* renamed from: b */
        long f1881b;

        C0454a(long j) {
            this.f1881b = j;
        }
    }

    public static class Bitmap extends C0454a {
        Bitmap(long j) {
            super(j);
        }

        private static native ByteBuffer getBuffer(long j);

        static native int getPitch(long j);

        private static native int getPixelMode(long j);

        static native int getRows(long j);

        static native int getWidth(long j);

        /* renamed from: a */
        public final Pixmap m1355a(Format format, C0430b c0430b, float f) {
            Pixmap pixmap;
            int width = getWidth(this.b);
            int rows = getRows(this.b);
            Buffer a = m1356a();
            int pixelMode = getPixelMode(this.b);
            int abs = Math.abs(getPitch(this.b));
            if (c0430b == C0430b.f1620c && pixelMode == FreeType.f1913c && abs == width && f == 1.0f) {
                pixmap = new Pixmap(width, rows, Format.Alpha);
                BufferUtils.m2242a(a, pixmap.m1122f(), pixmap.m1122f().capacity());
            } else {
                pixmap = new Pixmap(width, rows, Format.RGBA8888);
                int c = C0430b.m1214c(c0430b);
                byte[] bArr = new byte[abs];
                int[] iArr = new int[width];
                IntBuffer asIntBuffer = pixmap.m1122f().asIntBuffer();
                int i;
                int i2;
                if (pixelMode == FreeType.f1912b) {
                    for (pixelMode = 0; pixelMode < rows; pixelMode++) {
                        a.get(bArr);
                        i = 0;
                        for (abs = 0; abs < width; abs += 8) {
                            byte b = bArr[i];
                            int min = Math.min(8, width - abs);
                            for (i2 = 0; i2 < min; i2++) {
                                if (((1 << (7 - i2)) & b) != 0) {
                                    iArr[abs + i2] = c;
                                } else {
                                    iArr[abs + i2] = 0;
                                }
                            }
                            i++;
                        }
                        asIntBuffer.put(iArr);
                    }
                } else {
                    i = c & -256;
                    i2 = c & 255;
                    for (abs = 0; abs < rows; abs++) {
                        a.get(bArr);
                        for (pixelMode = 0; pixelMode < width; pixelMode++) {
                            c = bArr[pixelMode] & 255;
                            if (c == 0) {
                                iArr[pixelMode] = i;
                            } else if (c == 255) {
                                iArr[pixelMode] = i | i2;
                            } else {
                                iArr[pixelMode] = ((int) (((float) Math.pow((double) (((float) c) / 255.0f), (double) f)) * ((float) i2))) | i;
                            }
                        }
                        asIntBuffer.put(iArr);
                    }
                }
            }
            if (format == pixmap.m1123g()) {
                return pixmap;
            }
            Pixmap pixmap2 = new Pixmap(pixmap.f1378a.f1654b, pixmap.f1378a.f1655c, format);
            pixmap2.m1113a(Blending.None);
            pixmap2.m1114a(pixmap, 0, 0);
            pixmap.dispose();
            return pixmap2;
        }

        /* renamed from: a */
        public final ByteBuffer m1356a() {
            return getRows(this.b) == 0 ? BufferUtils.m2240a(1) : getBuffer(this.b);
        }
    }

    public static class Face extends C0454a implements Disposable {
        /* renamed from: a */
        Library f1882a;

        public Face(long j, Library library) {
            super(j);
            this.f1882a = library;
        }

        private static native void doneFace(long j);

        private static native int getCharIndex(long j, int i);

        static native int getFaceFlags(long j);

        private static native long getGlyph(long j);

        private static native int getKerning(long j, int i, int i2, int i3);

        static native int getMaxAdvanceWidth(long j);

        static native int getNumGlyphs(long j);

        static native long getSize(long j);

        static native boolean hasKerning(long j);

        static native boolean loadChar(long j, int i, int i2);

        static native boolean setPixelSizes(long j, int i, int i2);

        /* renamed from: a */
        public final int m1357a(int i) {
            return getCharIndex(this.b, i);
        }

        /* renamed from: a */
        public final int m1358a(int i, int i2) {
            return getKerning(this.b, i, i2, 0);
        }

        /* renamed from: a */
        public final GlyphSlot m1359a() {
            return new GlyphSlot(getGlyph(this.b));
        }

        /* renamed from: b */
        public final void dispose() {
            doneFace(this.b);
            ByteBuffer byteBuffer = (ByteBuffer) this.f1882a.f1884a.m2442a(this.b);
            if (byteBuffer != null) {
                C0700o c0700o = this.f1882a.f1884a;
                long j = this.b;
                if (j != 0) {
                    int i = (int) (((long) c0700o.f3126h) & j);
                    if (c0700o.f3120b[i] == j) {
                        c0700o.f3120b[i] = 0;
                        c0700o.f3121c[i] = null;
                        c0700o.f3119a--;
                    } else {
                        i = c0700o.m2445b(j);
                        if (c0700o.f3120b[i] == j) {
                            c0700o.f3120b[i] = 0;
                            c0700o.f3121c[i] = null;
                            c0700o.f3119a--;
                        } else {
                            i = c0700o.m2446c(j);
                            if (c0700o.f3120b[i] == j) {
                                c0700o.f3120b[i] = 0;
                                c0700o.f3121c[i] = null;
                                c0700o.f3119a--;
                            } else {
                                long[] jArr = c0700o.f3120b;
                                i = c0700o.f3122d;
                                int i2 = c0700o.f3123e + i;
                                while (i < i2) {
                                    if (jArr[i] == j) {
                                        c0700o.m2444a(i);
                                        c0700o.f3119a--;
                                        break;
                                    }
                                    i++;
                                }
                            }
                        }
                    }
                } else if (c0700o.f3125g) {
                    c0700o.f3124f = null;
                    c0700o.f3125g = false;
                    c0700o.f3119a--;
                }
                BufferUtils.m2243a(byteBuffer);
            }
        }
    }

    public static class Glyph extends C0454a implements Disposable {
        /* renamed from: a */
        private boolean f1883a;

        Glyph(long j) {
            super(j);
        }

        private static native void done(long j);

        private static native long getBitmap(long j);

        private static native int getLeft(long j);

        private static native int getTop(long j);

        static native long strokeBorder(long j, long j2, boolean z);

        private static native long toBitmap(long j, int i);

        /* renamed from: a */
        public final Bitmap m1361a() {
            if (this.f1883a) {
                return new Bitmap(getBitmap(this.b));
            }
            throw new GdxRuntimeException("Glyph is not yet rendered");
        }

        /* renamed from: a */
        public final void m1362a(int i) {
            long toBitmap = toBitmap(this.b, i);
            if (toBitmap == 0) {
                throw new GdxRuntimeException("Couldn't render glyph, FreeType error code: " + FreeType.getLastErrorCode());
            }
            this.b = toBitmap;
            this.f1883a = true;
        }

        /* renamed from: b */
        public final void dispose() {
            done(this.b);
        }

        /* renamed from: c */
        public final int m1364c() {
            if (this.f1883a) {
                return getLeft(this.b);
            }
            throw new GdxRuntimeException("Glyph is not yet rendered");
        }

        /* renamed from: d */
        public final int m1365d() {
            if (this.f1883a) {
                return getTop(this.b);
            }
            throw new GdxRuntimeException("Glyph is not yet rendered");
        }
    }

    public static class GlyphMetrics extends C0454a {
        GlyphMetrics(long j) {
            super(j);
        }

        static native int getHeight(long j);

        static native int getHoriAdvance(long j);
    }

    public static class GlyphSlot extends C0454a {
        GlyphSlot(long j) {
            super(j);
        }

        static native int getFormat(long j);

        private static native long getGlyph(long j);

        private static native long getMetrics(long j);

        /* renamed from: a */
        public final GlyphMetrics m1366a() {
            return new GlyphMetrics(getMetrics(this.b));
        }

        /* renamed from: b */
        public final Glyph m1367b() {
            long glyph = getGlyph(this.b);
            if (glyph != 0) {
                return new Glyph(glyph);
            }
            throw new GdxRuntimeException("Couldn't get glyph, FreeType error code: " + FreeType.getLastErrorCode());
        }
    }

    public static class Library extends C0454a implements Disposable {
        /* renamed from: a */
        C0700o<ByteBuffer> f1884a = new C0700o();

        Library(long j) {
            super(j);
        }

        private static native void doneFreeType(long j);

        static native long newMemoryFace(long j, ByteBuffer byteBuffer, int i, int i2);

        static native long strokerNew(long j);

        /* renamed from: b */
        public final void dispose() {
            C0699d c0699d;
            doneFreeType(this.b);
            C0700o c0700o = this.f1884a;
            if (c0700o.f3127i == null) {
                c0700o.f3127i = new C0699d(c0700o);
                c0700o.f3128j = new C0699d(c0700o);
            }
            if (c0700o.f3127i.e) {
                c0700o.f3128j.mo532a();
                c0700o.f3128j.e = true;
                c0700o.f3127i.e = false;
                c0699d = c0700o.f3128j;
            } else {
                c0700o.f3127i.mo532a();
                c0700o.f3127i.e = true;
                c0700o.f3128j.e = false;
                c0699d = c0700o.f3127i;
            }
            Iterator it = c0699d.iterator();
            while (it.hasNext()) {
                BufferUtils.m2243a((ByteBuffer) it.next());
            }
        }
    }

    public static class Size extends C0454a {
        Size(long j) {
            super(j);
        }

        static native long getMetrics(long j);
    }

    public static class SizeMetrics extends C0454a {
        SizeMetrics(long j) {
            super(j);
        }

        static native int getAscender(long j);

        static native int getDescender(long j);

        static native int getHeight(long j);
    }

    public static class Stroker extends C0454a implements Disposable {
        Stroker(long j) {
            super(j);
        }

        private static native void done(long j);

        static native void set(long j, int i, int i2, int i3, int i4);

        /* renamed from: b */
        public final void dispose() {
            done(this.b);
        }
    }

    /* renamed from: a */
    private static int m1370a(char c, char c2, char c3, char c4) {
        return (((c << 24) | (c2 << 16)) | (c3 << 8)) | c4;
    }

    /* renamed from: a */
    public static int m1371a(int i) {
        return ((i + 63) & -64) >> 6;
    }

    /* renamed from: a */
    public static Library m1372a() {
        new C0726x().m2526a("gdx-freetype");
        long initFreeTypeJni = initFreeTypeJni();
        if (initFreeTypeJni != 0) {
            return new Library(initFreeTypeJni);
        }
        throw new GdxRuntimeException("Couldn't initialize FreeType library, FreeType error code: " + getLastErrorCode());
    }

    static native int getLastErrorCode();

    private static native long initFreeTypeJni();
}
