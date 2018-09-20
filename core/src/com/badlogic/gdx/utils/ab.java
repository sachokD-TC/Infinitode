package com.badlogic.gdx.utils;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class ab {
    /* renamed from: a */
    public static final byte[] f3006a = new byte[0];

    /* renamed from: com.badlogic.gdx.utils.ab$a */
    public static class C0677a extends ByteArrayOutputStream {
        public C0677a(int i) {
            super(i);
        }

        public final synchronized byte[] toByteArray() {
            return this.count == this.buf.length ? this.buf : super.toByteArray();
        }
    }

    /* renamed from: a */
    public static void m2310a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
            }
        }
    }

    /* renamed from: a */
    public static void m2311a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m2312a(InputStream inputStream, ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4096];
        int position = byteBuffer.position();
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                BufferUtils.m2244a(bArr, (Buffer) byteBuffer, read);
                i += read;
                byteBuffer.position(position + i);
            } else {
                byteBuffer.position(position);
                return;
            }
        }
    }

    /* renamed from: a */
    public static byte[] m2313a(InputStream inputStream, int i) {
        OutputStream c0677a = new C0677a(Math.max(0, i));
        m2311a(inputStream, c0677a);
        return c0677a.toByteArray();
    }

    /* renamed from: b */
    public static String m2314b(InputStream inputStream, int i) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        StringWriter stringWriter = new StringWriter(Math.max(0, i));
        char[] cArr = new char[4096];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, read);
        }
    }
}
