package com.badlogic.gdx.utils;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public final class BufferUtils {
    /* renamed from: a */
    static C0676a<ByteBuffer> f2935a = new C0676a();
    /* renamed from: b */
    static int f2936b = 0;

    /* renamed from: a */
    private static int m2238a(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            return buffer.position();
        }
        if (buffer instanceof ShortBuffer) {
            return buffer.position() << 1;
        }
        if (buffer instanceof CharBuffer) {
            return buffer.position() << 1;
        }
        if (buffer instanceof IntBuffer) {
            return buffer.position() << 2;
        }
        if (buffer instanceof LongBuffer) {
            return buffer.position() << 3;
        }
        if (buffer instanceof FloatBuffer) {
            return buffer.position() << 2;
        }
        if (buffer instanceof DoubleBuffer) {
            return buffer.position() << 3;
        }
        throw new GdxRuntimeException("Can't copy to a " + buffer.getClass().getName() + " instance");
    }

    /* renamed from: a */
    private static int m2239a(Buffer buffer, int i) {
        if (buffer instanceof ByteBuffer) {
            return i;
        }
        if (buffer instanceof ShortBuffer) {
            return i >>> 1;
        }
        if (buffer instanceof CharBuffer) {
            return i >>> 1;
        }
        if (buffer instanceof IntBuffer) {
            return i >>> 2;
        }
        if (buffer instanceof LongBuffer) {
            return i >>> 3;
        }
        if (buffer instanceof FloatBuffer) {
            return i >>> 2;
        }
        if (buffer instanceof DoubleBuffer) {
            return i >>> 3;
        }
        throw new GdxRuntimeException("Can't copy to a " + buffer.getClass().getName() + " instance");
    }

    /* renamed from: a */
    public static ByteBuffer m2240a(int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        allocateDirect.order(ByteOrder.nativeOrder());
        return allocateDirect;
    }

    /* renamed from: a */
    public static FloatBuffer m2241a() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(64);
        allocateDirect.order(ByteOrder.nativeOrder());
        return allocateDirect.asFloatBuffer();
    }

    /* renamed from: a */
    public static void m2242a(Buffer buffer, Buffer buffer2, int i) {
        if (!(buffer instanceof ByteBuffer)) {
            if (buffer instanceof ShortBuffer) {
                i <<= 1;
            } else if (buffer instanceof CharBuffer) {
                i <<= 1;
            } else if (buffer instanceof IntBuffer) {
                i <<= 2;
            } else if (buffer instanceof LongBuffer) {
                i <<= 3;
            } else if (buffer instanceof FloatBuffer) {
                i <<= 2;
            } else if (buffer instanceof DoubleBuffer) {
                i <<= 3;
            } else {
                throw new GdxRuntimeException("Can't copy to a " + buffer.getClass().getName() + " instance");
            }
        }
        buffer2.limit(buffer2.position() + m2239a(buffer2, i));
        copyJni(buffer, m2238a(buffer), buffer2, m2238a(buffer2), i);
    }

    /* renamed from: a */
    public static void m2243a(ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity();
        synchronized (f2935a) {
            if (f2935a.mo529b((Object) byteBuffer, true)) {
            } else {
                throw new IllegalArgumentException("buffer not allocated with newUnsafeByteBuffer or already disposed");
            }
        }
        f2936b -= capacity;
        freeMemory(byteBuffer);
    }

    /* renamed from: a */
    public static void m2244a(byte[] bArr, Buffer buffer, int i) {
        buffer.limit(buffer.position() + m2239a(buffer, i));
        copyJni(bArr, 0, buffer, m2238a(buffer), i);
    }

    /* renamed from: a */
    public static void m2245a(float[] fArr, Buffer buffer, int i) {
        if (buffer instanceof ByteBuffer) {
            buffer.limit(i << 2);
        } else if (buffer instanceof FloatBuffer) {
            buffer.limit(i);
        }
        copyJni(fArr, buffer, i, 0);
        buffer.position(0);
    }

    /* renamed from: b */
    public static IntBuffer m2246b(int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        return allocateDirect.asIntBuffer();
    }

    /* renamed from: c */
    public static ByteBuffer m2247c(int i) {
        Object newDisposableByteBuffer = newDisposableByteBuffer(i);
        newDisposableByteBuffer.order(ByteOrder.nativeOrder());
        f2936b += i;
        synchronized (f2935a) {
            f2935a.m2296a(newDisposableByteBuffer);
        }
        return newDisposableByteBuffer;
    }

    private static native void copyJni(Buffer buffer, int i, Buffer buffer2, int i2, int i3);

    private static native void copyJni(byte[] bArr, int i, Buffer buffer, int i2, int i3);

    private static native void copyJni(float[] fArr, Buffer buffer, int i, int i2);

    private static native void freeMemory(ByteBuffer byteBuffer);

    private static native ByteBuffer newDisposableByteBuffer(int i);
}
