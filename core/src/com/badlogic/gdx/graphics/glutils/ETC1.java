package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.math.C0549f;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.ab;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.nio.ByteBuffer;
import java.util.zip.GZIPInputStream;

public class ETC1 {
    /* renamed from: a */
    public static int f2092a = 16;
    /* renamed from: b */
    public static int f2093b = 36196;

    /* renamed from: com.badlogic.gdx.graphics.glutils.ETC1$a */
    public static final class C0481a implements Disposable {
        /* renamed from: a */
        public final int f2088a;
        /* renamed from: b */
        public final int f2089b;
        /* renamed from: c */
        public final ByteBuffer f2090c;
        /* renamed from: d */
        public final int f2091d;

        public C0481a(int i, int i2, ByteBuffer byteBuffer) {
            this.f2088a = i;
            this.f2089b = i2;
            this.f2090c = byteBuffer;
            this.f2091d = 0;
            m1445c();
        }

        public C0481a(C0316a c0316a) {
            Closeable dataInputStream;
            Throwable e;
            byte[] bArr = new byte[10240];
            try {
                dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(c0316a.mo268b())));
                try {
                    this.f2090c = BufferUtils.m2247c(dataInputStream.readInt());
                    while (true) {
                        int read = dataInputStream.read(bArr);
                        if (read != -1) {
                            this.f2090c.put(bArr, 0, read);
                        } else {
                            this.f2090c.position(0);
                            this.f2090c.limit(this.f2090c.capacity());
                            ab.m2310a(dataInputStream);
                            this.f2088a = ETC1.getWidthPKM(this.f2090c, 0);
                            this.f2089b = ETC1.getHeightPKM(this.f2090c, 0);
                            this.f2091d = ETC1.f2092a;
                            this.f2090c.position(this.f2091d);
                            m1445c();
                            return;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    try {
                        throw new GdxRuntimeException("Couldn't load pkm file '" + c0316a + "'", e);
                    } catch (Throwable th) {
                        e = th;
                        ab.m2310a(dataInputStream);
                        throw e;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                dataInputStream = null;
                throw new GdxRuntimeException("Couldn't load pkm file '" + c0316a + "'", e);
            } catch (Throwable th2) {
                e = th2;
                dataInputStream = null;
                ab.m2310a(dataInputStream);
                throw e;
            }
        }

        /* renamed from: c */
        private void m1445c() {
            if (!C0549f.m1770c(this.f2088a) || !C0549f.m1770c(this.f2089b)) {
                System.out.println("ETC1Data warning: non-power-of-two ETC1 textures may crash the driver of PowerVR GPUs");
            }
        }

        /* renamed from: a */
        public final boolean m1446a() {
            return this.f2091d == 16;
        }

        /* renamed from: b */
        public final void dispose() {
            BufferUtils.m2243a(this.f2090c);
        }

        public final String toString() {
            if (!m1446a()) {
                return "raw [" + this.f2088a + "x" + this.f2089b + "], compressed: " + (this.f2090c.capacity() - ETC1.f2092a);
            }
            return (ETC1.isValidPKM(this.f2090c, 0) ? "valid" : "invalid") + " pkm [" + ETC1.getWidthPKM(this.f2090c, 0) + "x" + ETC1.getHeightPKM(this.f2090c, 0) + "], compressed: " + (this.f2090c.capacity() - ETC1.f2092a);
        }
    }

    /* renamed from: a */
    public static Pixmap m1448a(C0481a c0481a, Format format) {
        int i;
        int widthPKM;
        int heightPKM;
        int i2;
        if (c0481a.m1446a()) {
            i = 16;
            widthPKM = getWidthPKM(c0481a.f2090c, 0);
            heightPKM = getHeightPKM(c0481a.f2090c, 0);
        } else {
            widthPKM = c0481a.f2088a;
            heightPKM = c0481a.f2089b;
            i = 0;
        }
        if (format == Format.RGB565) {
            i2 = 2;
        } else if (format == Format.RGB888) {
            i2 = 3;
        } else {
            throw new GdxRuntimeException("Can only handle RGB565 or RGB888 images");
        }
        Pixmap pixmap = new Pixmap(widthPKM, heightPKM, format);
        decodeImage(c0481a.f2090c, i, pixmap.m1122f(), 0, widthPKM, heightPKM, i2);
        return pixmap;
    }

    private static native void decodeImage(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4, int i5);

    static native int getHeightPKM(ByteBuffer byteBuffer, int i);

    static native int getWidthPKM(ByteBuffer byteBuffer, int i);

    static native boolean isValidPKM(ByteBuffer byteBuffer, int i);
}
