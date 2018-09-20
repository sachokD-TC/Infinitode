package com.badlogic.gdx.utils;

/* renamed from: com.badlogic.gdx.utils.c */
public final class C0687c {
    /* renamed from: a */
    public static final C0686a f3073a = new C0686a('+', '/');
    /* renamed from: b */
    public static final C0686a f3074b = new C0686a('-', '_');

    /* renamed from: com.badlogic.gdx.utils.c$a */
    public static class C0686a {
        /* renamed from: a */
        protected final char[] f3071a = new char[64];
        /* renamed from: b */
        protected final byte[] f3072b = new byte[128];

        public C0686a(char c, char c2) {
            int i;
            int i2 = 0;
            char c3 = 'A';
            int i3 = 0;
            while (c3 <= 'Z') {
                i = i3 + 1;
                this.f3071a[i3] = c3;
                c3 = (char) (c3 + 1);
                i3 = i;
            }
            c3 = 'a';
            while (c3 <= 'z') {
                i = i3 + 1;
                this.f3071a[i3] = c3;
                c3 = (char) (c3 + 1);
                i3 = i;
            }
            c3 = '0';
            while (c3 <= '9') {
                i = i3 + 1;
                this.f3071a[i3] = c3;
                c3 = (char) (c3 + 1);
                i3 = i;
            }
            i = i3 + 1;
            this.f3071a[i3] = c;
            this.f3071a[i] = c2;
            for (int i4 = 0; i4 < this.f3072b.length; i4++) {
                this.f3072b[i4] = (byte) -1;
            }
            while (i2 < 64) {
                this.f3072b[this.f3071a[i2]] = (byte) i2;
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static String m2386a(String str) {
        return new String(C0687c.m2389a(str.getBytes(), f3073a.f3071a));
    }

    /* renamed from: a */
    private static byte[] m2387a(char[] cArr, int i, byte[] bArr) {
        int i2 = 0;
        if (i % 4 != 0) {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        while (i > 0 && cArr[(i + 0) - 1] == '=') {
            i--;
        }
        int i3 = (i * 3) / 4;
        byte[] bArr2 = new byte[i3];
        int i4 = i + 0;
        int i5 = 0;
        while (i2 < i4) {
            int i6;
            int i7;
            int i8 = i2 + 1;
            char c = cArr[i2];
            i2 = i8 + 1;
            char c2 = cArr[i8];
            if (i2 < i4) {
                i8 = i2 + 1;
                i6 = cArr[i2];
                i2 = i8;
            } else {
                i6 = 65;
            }
            if (i2 < i4) {
                i8 = i2 + 1;
                i2 = cArr[i2];
                i7 = i8;
            } else {
                i7 = i2;
                i2 = 65;
            }
            if (c > '' || c2 > '' || i6 > 127 || i2 > 127) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            byte b = bArr[c];
            byte b2 = bArr[c2];
            byte b3 = bArr[i6];
            byte b4 = bArr[i2];
            if (b < (byte) 0 || b2 < (byte) 0 || b3 < (byte) 0 || b4 < (byte) 0) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            i8 = (b << 2) | (b2 >>> 4);
            int i9 = ((b2 & 15) << 4) | (b3 >>> 2);
            i6 = ((b3 & 3) << 6) | b4;
            i2 = i5 + 1;
            bArr2[i5] = (byte) i8;
            if (i2 < i3) {
                i8 = i2 + 1;
                bArr2[i2] = (byte) i9;
            } else {
                i8 = i2;
            }
            if (i8 < i3) {
                i2 = i8 + 1;
                bArr2[i8] = (byte) i6;
            } else {
                i2 = i8;
            }
            i5 = i2;
            i2 = i7;
        }
        return bArr2;
    }

    /* renamed from: a */
    public static char[] m2388a(byte[] bArr) {
        return C0687c.m2389a(bArr, f3073a.f3071a);
    }

    /* renamed from: a */
    private static char[] m2389a(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        int i = ((length * 4) + 2) / 3;
        char[] cArr2 = new char[(((length + 2) / 3) * 4)];
        int i2 = length + 0;
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            int i5;
            length = i4 + 1;
            int i6 = bArr[i4] & 255;
            if (length < i2) {
                i5 = bArr[length] & 255;
                length++;
            } else {
                i5 = 0;
            }
            if (length < i2) {
                i4 = length + 1;
                length = bArr[length] & 255;
            } else {
                i4 = length;
                length = 0;
            }
            int i7 = i6 >>> 2;
            i6 = ((i6 & 3) << 4) | (i5 >>> 4);
            i5 = ((i5 & 15) << 2) | (length >>> 6);
            int i8 = length & 63;
            length = i3 + 1;
            cArr2[i3] = cArr[i7];
            i3 = length + 1;
            cArr2[length] = cArr[i6];
            cArr2[i3] = i3 < i ? cArr[i5] : '=';
            i5 = i3 + 1;
            cArr2[i5] = i5 < i ? cArr[i8] : '=';
            i3 = i5 + 1;
        }
        return cArr2;
    }

    /* renamed from: b */
    public static String m2390b(String str) {
        char[] toCharArray = str.toCharArray();
        return new String(C0687c.m2387a(toCharArray, toCharArray.length, f3073a.f3072b));
    }

    /* renamed from: c */
    public static byte[] m2391c(String str) {
        char[] toCharArray = str.toCharArray();
        return C0687c.m2387a(toCharArray, toCharArray.length, f3073a.f3072b);
    }
}
