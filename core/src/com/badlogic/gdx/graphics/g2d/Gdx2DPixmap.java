package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.IOException;
import java.nio.ByteBuffer;

public class Gdx2DPixmap implements Disposable {
    /* renamed from: a */
    public long f1653a;
    /* renamed from: b */
    public int f1654b;
    /* renamed from: c */
    public int f1655c;
    /* renamed from: d */
    public int f1656d;
    /* renamed from: e */
    public ByteBuffer f1657e;
    /* renamed from: f */
    long[] f1658f;

    public Gdx2DPixmap(int i, int i2, int i3) {
        this.f1658f = new long[4];
        this.f1657e = newPixmap(this.f1658f, i, i2, i3);
        if (this.f1657e == null) {
            throw new GdxRuntimeException("Error loading pixmap.");
        }
        this.f1653a = this.f1658f[0];
        this.f1654b = (int) this.f1658f[1];
        this.f1655c = (int) this.f1658f[2];
        this.f1656d = (int) this.f1658f[3];
    }

    public Gdx2DPixmap(byte[] bArr, int i) {
        this.f1658f = new long[4];
        this.f1657e = load(this.f1658f, bArr, 0, i);
        if (this.f1657e == null) {
            throw new IOException("Error loading pixmap: " + getFailureReason());
        }
        this.f1653a = this.f1658f[0];
        this.f1654b = (int) this.f1658f[1];
        this.f1655c = (int) this.f1658f[2];
        this.f1656d = (int) this.f1658f[3];
    }

    /* renamed from: a */
    public static int m1235a(int i) {
        switch (i) {
            case 1:
                return 6406;
            case 2:
                return 6410;
            case 3:
            case 5:
                return 6407;
            case 4:
            case 6:
                return 6408;
            default:
                throw new GdxRuntimeException("unknown format: " + i);
        }
    }

    /* renamed from: b */
    public static int m1236b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                return 5121;
            case 5:
                return 33635;
            case 6:
                return 32819;
            default:
                throw new GdxRuntimeException("unknown format: " + i);
        }
    }

    public static native void clear(long j, int i);

    public static native void drawPixmap(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public static native void fillRect(long j, int i, int i2, int i3, int i4, int i5);

    private static native void free(long j);

    public static native String getFailureReason();

    private static native ByteBuffer load(long[] jArr, byte[] bArr, int i, int i2);

    private static native ByteBuffer newPixmap(long[] jArr, int i, int i2, int i3);

    public static native void setBlend(long j, int i);

    public static native void setPixel(long j, int i, int i2, int i3);

    /* renamed from: b */
    public final void dispose() {
        free(this.f1653a);
    }
}
