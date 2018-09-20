package com.badlogic.gdx.graphics;

import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.ab;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.nio.ByteBuffer;
import java.util.zip.InflaterInputStream;

/* renamed from: com.badlogic.gdx.graphics.j */
public final class C0509j {

    /* renamed from: com.badlogic.gdx.graphics.j$a */
    private static class C0508a {
        /* renamed from: a */
        private static final byte[] f2281a = new byte[32000];
        /* renamed from: b */
        private static final byte[] f2282b = new byte[32000];

        /* renamed from: a */
        public static Pixmap m1659a(C0316a c0316a) {
            Closeable dataInputStream;
            Throwable e;
            try {
                dataInputStream = new DataInputStream(new InflaterInputStream(new BufferedInputStream(c0316a.mo268b())));
                try {
                    Pixmap pixmap = new Pixmap(dataInputStream.readInt(), dataInputStream.readInt(), Format.m1108a(dataInputStream.readInt()));
                    ByteBuffer f = pixmap.m1122f();
                    f.position(0);
                    f.limit(f.capacity());
                    synchronized (f2282b) {
                        while (true) {
                            int read = dataInputStream.read(f2282b);
                            if (read > 0) {
                                f.put(f2282b, 0, read);
                            }
                        }
                    }
                    f.position(0);
                    f.limit(f.capacity());
                    ab.m2310a(dataInputStream);
                    return pixmap;
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                dataInputStream = null;
                try {
                    throw new GdxRuntimeException("Couldn't read Pixmap from file '" + c0316a + "'", e);
                } catch (Throwable th) {
                    e = th;
                    ab.m2310a(dataInputStream);
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                dataInputStream = null;
                ab.m2310a(dataInputStream);
                throw e;
            }
        }
    }
}
