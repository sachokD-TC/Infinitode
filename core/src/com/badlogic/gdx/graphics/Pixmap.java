package com.badlogic.gdx.graphics;

import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.ByteBuffer;

public class Pixmap implements Disposable {
    /* renamed from: a */
    public final Gdx2DPixmap f1378a;
    /* renamed from: b */
    int f1379b = 0;
    /* renamed from: c */
    private Blending f1380c = Blending.SourceOver;
    /* renamed from: d */
    private Filter f1381d = Filter.BiLinear;
    /* renamed from: e */
    private boolean f1382e;

    public enum Blending {
        None,
        SourceOver
    }

    public enum Filter {
        NearestNeighbour,
        BiLinear
    }

    public enum Format {
        Alpha,
        Intensity,
        LuminanceAlpha,
        RGB565,
        RGBA4444,
        RGB888,
        RGBA8888;

        /* renamed from: a */
        public static int m1107a(Format format) {
            if (format == Alpha || format == Intensity) {
                return 1;
            }
            if (format == LuminanceAlpha) {
                return 2;
            }
            if (format == RGB565) {
                return 5;
            }
            if (format == RGBA4444) {
                return 6;
            }
            if (format == RGB888) {
                return 3;
            }
            if (format == RGBA8888) {
                return 4;
            }
            throw new GdxRuntimeException("Unknown Format: " + format);
        }

        /* renamed from: a */
        public static Format m1108a(int i) {
            if (i == 1) {
                return Alpha;
            }
            if (i == 2) {
                return LuminanceAlpha;
            }
            if (i == 5) {
                return RGB565;
            }
            if (i == 6) {
                return RGBA4444;
            }
            if (i == 3) {
                return RGB888;
            }
            if (i == 4) {
                return RGBA8888;
            }
            throw new GdxRuntimeException("Unknown Gdx2DPixmap Format: " + i);
        }

        /* renamed from: b */
        public static int m1109b(Format format) {
            return Gdx2DPixmap.m1235a(m1107a(format));
        }

        /* renamed from: c */
        public static int m1110c(Format format) {
            return Gdx2DPixmap.m1236b(m1107a(format));
        }
    }

    public Pixmap(int i, int i2, Format format) {
        this.f1378a = new Gdx2DPixmap(i, i2, Format.m1107a(format));
        this.f1379b = C0430b.m1213c(0.0f, 0.0f, 0.0f, 0.0f);
        m1111a();
    }

    public Pixmap(C0316a c0316a) {
        try {
            byte[] l = c0316a.m900l();
            this.f1378a = new Gdx2DPixmap(l, l.length);
        } catch (Throwable e) {
            throw new GdxRuntimeException("Couldn't load file: " + c0316a, e);
        }
    }

    /* renamed from: a */
    public final void m1111a() {
        Gdx2DPixmap gdx2DPixmap = this.f1378a;
        Gdx2DPixmap.clear(gdx2DPixmap.f1653a, this.f1379b);
    }

    /* renamed from: a */
    public final void m1112a(int i, int i2, int i3, int i4) {
        Gdx2DPixmap gdx2DPixmap = this.f1378a;
        Gdx2DPixmap.fillRect(gdx2DPixmap.f1653a, i, i2, i3, i4, this.f1379b);
    }

    /* renamed from: a */
    public final void m1113a(Blending blending) {
        this.f1380c = blending;
        Gdx2DPixmap.setBlend(this.f1378a.f1653a, blending == Blending.None ? 0 : 1);
    }

    /* renamed from: a */
    public final void m1114a(Pixmap pixmap, int i, int i2) {
        m1115a(pixmap, i, i2, pixmap.f1378a.f1654b, pixmap.f1378a.f1655c);
    }

    /* renamed from: a */
    public final void m1115a(Pixmap pixmap, int i, int i2, int i3, int i4) {
        Gdx2DPixmap.drawPixmap(pixmap.f1378a.f1653a, this.f1378a.f1653a, 0, 0, i3, i4, i, i2, i3, i4);
    }

    /* renamed from: a */
    public final void m1116a(Pixmap pixmap, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Gdx2DPixmap.drawPixmap(pixmap.f1378a.f1653a, this.f1378a.f1653a, i, i2, i3, i4, i5, i6, i7, i8);
    }

    /* renamed from: a */
    public final void m1117a(C0430b c0430b) {
        this.f1379b = C0430b.m1213c(c0430b.f1644I, c0430b.f1645J, c0430b.f1646K, c0430b.f1647L);
    }

    /* renamed from: b */
    public final void dispose() {
        if (this.f1382e) {
            throw new GdxRuntimeException("Pixmap already disposed!");
        }
        this.f1378a.dispose();
        this.f1382e = true;
    }

    /* renamed from: c */
    public final int m1119c() {
        return Gdx2DPixmap.m1235a(this.f1378a.f1656d);
    }

    /* renamed from: d */
    public final int m1120d() {
        return Gdx2DPixmap.m1235a(this.f1378a.f1656d);
    }

    /* renamed from: e */
    public final int m1121e() {
        return Gdx2DPixmap.m1236b(this.f1378a.f1656d);
    }

    /* renamed from: f */
    public final ByteBuffer m1122f() {
        if (!this.f1382e) {
            return this.f1378a.f1657e;
        }
        throw new GdxRuntimeException("Pixmap already disposed");
    }

    /* renamed from: g */
    public final Format m1123g() {
        return Format.m1108a(this.f1378a.f1656d);
    }
}
