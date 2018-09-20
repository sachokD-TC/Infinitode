package com.badlogic.gdx.utils;

import com.badlogic.gdx.p016c.C0316a;
import java.io.Reader;

/* renamed from: com.badlogic.gdx.utils.m */
public final class C0694m implements C0679d {
    /* renamed from: a */
    private static final byte[] f3095a = new byte[]{(byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 1, (byte) 3, (byte) 1, (byte) 4, (byte) 1, (byte) 5, (byte) 1, (byte) 6, (byte) 1, (byte) 7, (byte) 1, (byte) 8, (byte) 2, (byte) 0, (byte) 7, (byte) 2, (byte) 0, (byte) 8, (byte) 2, (byte) 1, (byte) 3, (byte) 2, (byte) 1, (byte) 5};
    /* renamed from: b */
    private static final short[] f3096b = new short[]{(short) 0, (short) 0, (short) 11, (short) 13, (short) 14, (short) 16, (short) 25, (short) 31, (short) 37, (short) 39, (short) 50, (short) 57, (short) 64, (short) 73, (short) 74, (short) 83, (short) 85, (short) 87, (short) 96, (short) 98, (short) 100, (short) 101, (short) 103, (short) 105, (short) 116, (short) 123, (short) 130, (short) 141, (short) 142, (short) 153, (short) 155, (short) 157, (short) 168, (short) 170, (short) 172, (short) 174, (short) 179, (short) 184, (short) 184};
    /* renamed from: c */
    private static final char[] f3097c = new char[]{'\r', ' ', '\"', ',', '/', ':', '[', ']', '{', '\t', '\n', '*', '/', '\"', '*', '/', '\r', ' ', '\"', ',', '/', ':', '}', '\t', '\n', '\r', ' ', '/', ':', '\t', '\n', '\r', ' ', '/', ':', '\t', '\n', '*', '/', '\r', ' ', '\"', ',', '/', ':', '[', ']', '{', '\t', '\n', '\t', '\n', '\r', ' ', ',', '/', '}', '\t', '\n', '\r', ' ', ',', '/', '}', '\r', ' ', '\"', ',', '/', ':', '}', '\t', '\n', '\"', '\r', ' ', '\"', ',', '/', ':', '}', '\t', '\n', '*', '/', '*', '/', '\r', ' ', '\"', ',', '/', ':', '}', '\t', '\n', '*', '/', '*', '/', '\"', '*', '/', '*', '/', '\r', ' ', '\"', ',', '/', ':', '[', ']', '{', '\t', '\n', '\t', '\n', '\r', ' ', ',', '/', ']', '\t', '\n', '\r', ' ', ',', '/', ']', '\r', ' ', '\"', ',', '/', ':', '[', ']', '{', '\t', '\n', '\"', '\r', ' ', '\"', ',', '/', ':', '[', ']', '{', '\t', '\n', '*', '/', '*', '/', '\r', ' ', '\"', ',', '/', ':', '[', ']', '{', '\t', '\n', '*', '/', '*', '/', '*', '/', '\r', ' ', '/', '\t', '\n', '\r', ' ', '/', '\t', '\n', '\u0000'};
    /* renamed from: d */
    private static final byte[] f3098d = new byte[]{(byte) 0, (byte) 9, (byte) 2, (byte) 1, (byte) 2, (byte) 7, (byte) 4, (byte) 4, (byte) 2, (byte) 9, (byte) 7, (byte) 7, (byte) 7, (byte) 1, (byte) 7, (byte) 2, (byte) 2, (byte) 7, (byte) 2, (byte) 2, (byte) 1, (byte) 2, (byte) 2, (byte) 9, (byte) 7, (byte) 7, (byte) 9, (byte) 1, (byte) 9, (byte) 2, (byte) 2, (byte) 9, (byte) 2, (byte) 2, (byte) 2, (byte) 3, (byte) 3, (byte) 0, (byte) 0};
    /* renamed from: e */
    private static final byte[] f3099e = new byte[]{(byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 0};
    /* renamed from: f */
    private static final short[] f3100f = new short[]{(short) 0, (short) 0, (short) 11, (short) 14, (short) 16, (short) 19, (short) 28, (short) 34, (short) 40, (short) 43, (short) 54, (short) 62, (short) 70, (short) 79, (short) 81, (short) 90, (short) 93, (short) 96, (short) 105, (short) 108, (short) 111, (short) 113, (short) 116, (short) 119, (short) 130, (short) 138, (short) 146, (short) 157, (short) 159, (short) 170, (short) 173, (short) 176, (short) 187, (short) 190, (short) 193, (short) 196, (short) 201, (short) 206, (short) 207};
    /* renamed from: g */
    private static final byte[] f3101g = new byte[]{(byte) 1, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 3, (byte) 5, (byte) 3, (byte) 6, (byte) 1, (byte) 0, (byte) 7, (byte) 7, (byte) 3, (byte) 8, (byte) 3, (byte) 9, (byte) 9, (byte) 3, (byte) 11, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 3, (byte) 15, (byte) 11, (byte) 10, (byte) 16, (byte) 16, (byte) 17, (byte) 18, (byte) 16, (byte) 3, (byte) 19, (byte) 19, (byte) 20, (byte) 21, (byte) 19, (byte) 3, (byte) 22, (byte) 22, (byte) 3, (byte) 21, (byte) 21, (byte) 24, (byte) 3, (byte) 25, (byte) 3, (byte) 26, (byte) 3, (byte) 27, (byte) 21, (byte) 23, (byte) 28, (byte) 29, (byte) 29, (byte) 28, (byte) 30, (byte) 31, (byte) 32, (byte) 3, (byte) 33, (byte) 34, (byte) 34, (byte) 33, (byte) 13, (byte) 35, (byte) 15, (byte) 3, (byte) 34, (byte) 34, (byte) 12, (byte) 36, (byte) 37, (byte) 3, (byte) 15, (byte) 34, (byte) 10, (byte) 16, (byte) 3, (byte) 36, (byte) 36, (byte) 12, (byte) 3, (byte) 38, (byte) 3, (byte) 3, (byte) 36, (byte) 10, (byte) 39, (byte) 39, (byte) 3, (byte) 40, (byte) 40, (byte) 3, (byte) 13, (byte) 13, (byte) 12, (byte) 3, (byte) 41, (byte) 3, (byte) 15, (byte) 13, (byte) 10, (byte) 42, (byte) 42, (byte) 3, (byte) 43, (byte) 43, (byte) 3, (byte) 28, (byte) 3, (byte) 44, (byte) 44, (byte) 3, (byte) 45, (byte) 45, (byte) 3, (byte) 47, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 3, (byte) 51, (byte) 52, (byte) 53, (byte) 47, (byte) 46, (byte) 54, (byte) 55, (byte) 55, (byte) 54, (byte) 56, (byte) 57, (byte) 58, (byte) 3, (byte) 59, (byte) 60, (byte) 60, (byte) 59, (byte) 49, (byte) 61, (byte) 52, (byte) 3, (byte) 60, (byte) 60, (byte) 48, (byte) 62, (byte) 63, (byte) 3, (byte) 51, (byte) 52, (byte) 53, (byte) 60, (byte) 46, (byte) 54, (byte) 3, (byte) 62, (byte) 62, (byte) 48, (byte) 3, (byte) 64, (byte) 3, (byte) 51, (byte) 3, (byte) 53, (byte) 62, (byte) 46, (byte) 65, (byte) 65, (byte) 3, (byte) 66, (byte) 66, (byte) 3, (byte) 49, (byte) 49, (byte) 48, (byte) 3, (byte) 67, (byte) 3, (byte) 51, (byte) 52, (byte) 53, (byte) 49, (byte) 46, (byte) 68, (byte) 68, (byte) 3, (byte) 69, (byte) 69, (byte) 3, (byte) 70, (byte) 70, (byte) 3, (byte) 8, (byte) 8, (byte) 71, (byte) 8, (byte) 3, (byte) 72, (byte) 72, (byte) 73, (byte) 72, (byte) 3, (byte) 3, (byte) 3, (byte) 0};
    /* renamed from: h */
    private static final byte[] f3102h = new byte[]{(byte) 35, (byte) 1, (byte) 3, (byte) 0, (byte) 4, (byte) 36, (byte) 36, (byte) 36, (byte) 36, (byte) 1, (byte) 6, (byte) 5, (byte) 13, (byte) 17, (byte) 22, (byte) 37, (byte) 7, (byte) 8, (byte) 9, (byte) 7, (byte) 8, (byte) 9, (byte) 7, (byte) 10, (byte) 20, (byte) 21, (byte) 11, (byte) 11, (byte) 11, (byte) 12, (byte) 17, (byte) 19, (byte) 37, (byte) 11, (byte) 12, (byte) 19, (byte) 14, (byte) 16, (byte) 15, (byte) 14, (byte) 12, (byte) 18, (byte) 17, (byte) 11, (byte) 9, (byte) 5, (byte) 24, (byte) 23, (byte) 27, (byte) 31, (byte) 34, (byte) 25, (byte) 38, (byte) 25, (byte) 25, (byte) 26, (byte) 31, (byte) 33, (byte) 38, (byte) 25, (byte) 26, (byte) 33, (byte) 28, (byte) 30, (byte) 29, (byte) 28, (byte) 26, (byte) 32, (byte) 31, (byte) 25, (byte) 23, (byte) 2, (byte) 36, (byte) 2};
    /* renamed from: i */
    private static final byte[] f3103i = new byte[]{(byte) 13, (byte) 0, (byte) 15, (byte) 0, (byte) 0, (byte) 7, (byte) 3, (byte) 11, (byte) 1, (byte) 11, (byte) 17, (byte) 0, (byte) 20, (byte) 0, (byte) 0, (byte) 5, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 11, (byte) 13, (byte) 15, (byte) 0, (byte) 7, (byte) 3, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 23, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 11, (byte) 11, (byte) 0, (byte) 11, (byte) 11, (byte) 11, (byte) 11, (byte) 13, (byte) 0, (byte) 15, (byte) 0, (byte) 0, (byte) 7, (byte) 9, (byte) 3, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 26, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 11, (byte) 11, (byte) 0, (byte) 11, (byte) 11, (byte) 11, (byte) 1, (byte) 0, (byte) 0};
    /* renamed from: j */
    private static final byte[] f3104j = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0};
    /* renamed from: k */
    private final C0676a<JsonValue> f3105k = new C0676a(8);
    /* renamed from: l */
    private final C0676a<JsonValue> f3106l = new C0676a(8);
    /* renamed from: m */
    private JsonValue f3107m;
    /* renamed from: n */
    private JsonValue f3108n;

    /* renamed from: a */
    private JsonValue m2423a(Reader reader) {
        int i = 0;
        try {
            Object obj = new char[1024];
            while (true) {
                int read = reader.read(obj, i, obj.length - i);
                if (read == -1) {
                    JsonValue a = m2424a((char[]) obj, i);
                    ab.m2310a(reader);
                    return a;
                } else if (read == 0) {
                    Object obj2 = new char[(obj.length * 2)];
                    System.arraycopy(obj, 0, obj2, 0, obj.length);
                    obj = obj2;
                } else {
                    i += read;
                }
            }
        } catch (Throwable e) {
            throw new SerializationException(e);
        } catch (Throwable th) {
            ab.m2310a(reader);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private JsonValue m2424a(char[] r22, int r23) {
        /*
        r21 = this;
        r9 = 0;
        r2 = 4;
        r11 = new int[r2];
        r7 = 0;
        r16 = new com.badlogic.gdx.utils.a;
        r2 = 8;
        r0 = r16;
        r0.<init>(r2);
        r3 = 0;
        r6 = 0;
        r4 = 0;
        r8 = 0;
        r10 = 1;
        r5 = 0;
        r2 = 0;
        r15 = r5;
        r5 = r9;
        r9 = r2;
        r2 = r3;
        r3 = r10;
    L_0x001a:
        switch(r9) {
            case 0: goto L_0x0046;
            case 1: goto L_0x0050;
            case 2: goto L_0x0303;
            case 3: goto L_0x001d;
            case 4: goto L_0x0311;
            default: goto L_0x001d;
        };
    L_0x001d:
        r2 = r8;
    L_0x001e:
        r0 = r21;
        r3 = r0.f3107m;
        r4 = 0;
        r0 = r21;
        r0.f3107m = r4;
        r4 = 0;
        r0 = r21;
        r0.f3108n = r4;
        r0 = r21;
        r4 = r0.f3106l;
        r4.mo530d();
        r0 = r23;
        if (r5 >= r0) goto L_0x0415;
    L_0x0037:
        r3 = 1;
        r4 = 0;
    L_0x0039:
        if (r4 >= r5) goto L_0x03cd;
    L_0x003b:
        r6 = r22[r4];
        r7 = 10;
        if (r6 != r7) goto L_0x0043;
    L_0x0041:
        r3 = r3 + 1;
    L_0x0043:
        r4 = r4 + 1;
        goto L_0x0039;
    L_0x0046:
        r0 = r23;
        if (r5 != r0) goto L_0x004c;
    L_0x004a:
        r9 = 4;
        goto L_0x001a;
    L_0x004c:
        if (r3 != 0) goto L_0x0050;
    L_0x004e:
        r9 = 5;
        goto L_0x001a;
    L_0x0050:
        r9 = f3096b;	 Catch:{ RuntimeException -> 0x0465 }
        r12 = r9[r3];	 Catch:{ RuntimeException -> 0x0465 }
        r9 = f3100f;	 Catch:{ RuntimeException -> 0x0465 }
        r9 = r9[r3];	 Catch:{ RuntimeException -> 0x0465 }
        r10 = f3098d;	 Catch:{ RuntimeException -> 0x0465 }
        r14 = r10[r3];	 Catch:{ RuntimeException -> 0x0465 }
        if (r14 <= 0) goto L_0x00c3;
    L_0x005e:
        r10 = r12 + r14;
        r10 = r10 + -1;
        r13 = r12;
    L_0x0063:
        if (r10 < r13) goto L_0x00c1;
    L_0x0065:
        r17 = r10 - r13;
        r17 = r17 >> 1;
        r17 = r17 + r13;
        r18 = r22[r5];	 Catch:{ RuntimeException -> 0x0465 }
        r19 = f3097c;	 Catch:{ RuntimeException -> 0x0465 }
        r19 = r19[r17];	 Catch:{ RuntimeException -> 0x0465 }
        r0 = r18;
        r1 = r19;
        if (r0 >= r1) goto L_0x007a;
    L_0x0077:
        r10 = r17 + -1;
        goto L_0x0063;
    L_0x007a:
        r13 = r22[r5];	 Catch:{ RuntimeException -> 0x0465 }
        r18 = f3097c;	 Catch:{ RuntimeException -> 0x0465 }
        r18 = r18[r17];	 Catch:{ RuntimeException -> 0x0465 }
        r0 = r18;
        if (r13 <= r0) goto L_0x0087;
    L_0x0084:
        r13 = r17 + 1;
        goto L_0x0063;
    L_0x0087:
        r3 = r17 - r12;
        r3 = r3 + r9;
    L_0x008a:
        r9 = f3101g;	 Catch:{ RuntimeException -> 0x0465 }
        r3 = r9[r3];	 Catch:{ RuntimeException -> 0x0465 }
        r9 = f3102h;	 Catch:{ RuntimeException -> 0x0465 }
        r10 = r9[r3];	 Catch:{ RuntimeException -> 0x0465 }
        r9 = f3103i;	 Catch:{ RuntimeException -> 0x0465 }
        r9 = r9[r3];	 Catch:{ RuntimeException -> 0x0465 }
        if (r9 == 0) goto L_0x0486;
    L_0x0098:
        r9 = f3103i;	 Catch:{ RuntimeException -> 0x0465 }
        r3 = r9[r3];	 Catch:{ RuntimeException -> 0x0465 }
        r12 = f3095a;	 Catch:{ RuntimeException -> 0x0465 }
        r9 = r3 + 1;
        r3 = r12[r3];	 Catch:{ RuntimeException -> 0x0465 }
        r20 = r3;
        r3 = r7;
        r7 = r5;
        r5 = r4;
        r4 = r6;
        r6 = r2;
        r2 = r20;
    L_0x00ab:
        r13 = r2 + -1;
        if (r2 <= 0) goto L_0x02fd;
    L_0x00af:
        r2 = f3095a;	 Catch:{ RuntimeException -> 0x0468 }
        r14 = r9 + 1;
        r2 = r2[r9];	 Catch:{ RuntimeException -> 0x0468 }
        switch(r2) {
            case 0: goto L_0x00ff;
            case 1: goto L_0x0103;
            case 2: goto L_0x019a;
            case 3: goto L_0x01e4;
            case 4: goto L_0x01f6;
            case 5: goto L_0x0240;
            case 6: goto L_0x0252;
            case 7: goto L_0x028b;
            case 8: goto L_0x02e3;
            default: goto L_0x00b8;
        };
    L_0x00b8:
        r2 = r5;
        r5 = r3;
        r3 = r6;
    L_0x00bb:
        r9 = r14;
        r6 = r3;
        r3 = r5;
        r5 = r2;
        r2 = r13;
        goto L_0x00ab;
    L_0x00c1:
        r12 = r12 + r14;
        r9 = r9 + r14;
    L_0x00c3:
        r10 = f3099e;	 Catch:{ RuntimeException -> 0x0465 }
        r13 = r10[r3];	 Catch:{ RuntimeException -> 0x0465 }
        if (r13 <= 0) goto L_0x0489;
    L_0x00c9:
        r3 = r13 << 1;
        r3 = r3 + r12;
        r3 = r3 + -2;
        r10 = r12;
    L_0x00cf:
        if (r3 < r10) goto L_0x00fc;
    L_0x00d1:
        r14 = r3 - r10;
        r14 = r14 >> 1;
        r14 = r14 & -2;
        r14 = r14 + r10;
        r17 = r22[r5];	 Catch:{ RuntimeException -> 0x0465 }
        r18 = f3097c;	 Catch:{ RuntimeException -> 0x0465 }
        r18 = r18[r14];	 Catch:{ RuntimeException -> 0x0465 }
        r0 = r17;
        r1 = r18;
        if (r0 >= r1) goto L_0x00e7;
    L_0x00e4:
        r3 = r14 + -2;
        goto L_0x00cf;
    L_0x00e7:
        r10 = r22[r5];	 Catch:{ RuntimeException -> 0x0465 }
        r17 = f3097c;	 Catch:{ RuntimeException -> 0x0465 }
        r18 = r14 + 1;
        r17 = r17[r18];	 Catch:{ RuntimeException -> 0x0465 }
        r0 = r17;
        if (r10 <= r0) goto L_0x00f6;
    L_0x00f3:
        r10 = r14 + 2;
        goto L_0x00cf;
    L_0x00f6:
        r3 = r14 - r12;
        r3 = r3 >> 1;
        r3 = r3 + r9;
        goto L_0x008a;
    L_0x00fc:
        r3 = r9 + r13;
        goto L_0x008a;
    L_0x00ff:
        r4 = 1;
        r2 = r13;
        r9 = r14;
        goto L_0x00ab;
    L_0x0103:
        r2 = new java.lang.String;	 Catch:{ RuntimeException -> 0x0468 }
        r9 = r7 - r3;
        r0 = r22;
        r2.<init>(r0, r3, r9);	 Catch:{ RuntimeException -> 0x0468 }
        if (r6 == 0) goto L_0x0483;
    L_0x010e:
        r2 = com.badlogic.gdx.utils.C0694m.m2431b(r2);	 Catch:{ RuntimeException -> 0x0468 }
        r12 = r2;
    L_0x0113:
        if (r4 == 0) goto L_0x0121;
    L_0x0115:
        r2 = 0;
        r0 = r16;
        r0.m2296a(r12);	 Catch:{ RuntimeException -> 0x0468 }
    L_0x011b:
        r5 = 0;
        r9 = r14;
        r4 = r2;
        r3 = r7;
        r2 = r13;
        goto L_0x00ab;
    L_0x0121:
        r0 = r16;
        r2 = r0.f3001b;	 Catch:{ RuntimeException -> 0x0468 }
        if (r2 <= 0) goto L_0x0140;
    L_0x0127:
        r2 = r16.mo523a();	 Catch:{ RuntimeException -> 0x0468 }
        r2 = (java.lang.String) r2;	 Catch:{ RuntimeException -> 0x0468 }
        r9 = r2;
    L_0x012e:
        if (r5 == 0) goto L_0x0193;
    L_0x0130:
        r2 = "true";
        r2 = r12.equals(r2);	 Catch:{ RuntimeException -> 0x0468 }
        if (r2 == 0) goto L_0x0143;
    L_0x0138:
        r2 = 1;
        r0 = r21;
        r0.m2430a(r9, r2);	 Catch:{ RuntimeException -> 0x0468 }
        r2 = r4;
        goto L_0x011b;
    L_0x0140:
        r2 = 0;
        r9 = r2;
        goto L_0x012e;
    L_0x0143:
        r2 = "false";
        r2 = r12.equals(r2);	 Catch:{ RuntimeException -> 0x0468 }
        if (r2 == 0) goto L_0x0153;
    L_0x014b:
        r2 = 0;
        r0 = r21;
        r0.m2430a(r9, r2);	 Catch:{ RuntimeException -> 0x0468 }
        r2 = r4;
        goto L_0x011b;
    L_0x0153:
        r2 = "null";
        r2 = r12.equals(r2);	 Catch:{ RuntimeException -> 0x0468 }
        if (r2 == 0) goto L_0x0163;
    L_0x015b:
        r2 = 0;
        r0 = r21;
        r0.m2429a(r9, r2);	 Catch:{ RuntimeException -> 0x0468 }
        r2 = r4;
        goto L_0x011b;
    L_0x0163:
        r2 = 0;
        r5 = 1;
        r20 = r5;
        r5 = r3;
        r3 = r20;
    L_0x016a:
        if (r5 >= r7) goto L_0x0173;
    L_0x016c:
        r17 = r22[r5];	 Catch:{ RuntimeException -> 0x0468 }
        switch(r17) {
            case 43: goto L_0x0182;
            case 45: goto L_0x0182;
            case 46: goto L_0x0180;
            case 48: goto L_0x0182;
            case 49: goto L_0x0182;
            case 50: goto L_0x0182;
            case 51: goto L_0x0182;
            case 52: goto L_0x0182;
            case 53: goto L_0x0182;
            case 54: goto L_0x0182;
            case 55: goto L_0x0182;
            case 56: goto L_0x0182;
            case 57: goto L_0x0182;
            case 69: goto L_0x0180;
            case 101: goto L_0x0180;
            default: goto L_0x0171;
        };
    L_0x0171:
        r2 = 0;
        r3 = 0;
    L_0x0173:
        if (r2 == 0) goto L_0x0185;
    L_0x0175:
        r2 = java.lang.Double.parseDouble(r12);	 Catch:{ NumberFormatException -> 0x0477 }
        r0 = r21;
        r0.m2426a(r9, r2, r12);	 Catch:{ NumberFormatException -> 0x0477 }
        r2 = r4;
        goto L_0x011b;
    L_0x0180:
        r2 = 1;
        r3 = 0;
    L_0x0182:
        r5 = r5 + 1;
        goto L_0x016a;
    L_0x0185:
        if (r3 == 0) goto L_0x0193;
    L_0x0187:
        r2 = java.lang.Long.parseLong(r12);	 Catch:{ NumberFormatException -> 0x0192 }
        r0 = r21;
        r0.m2427a(r9, r2, r12);	 Catch:{ NumberFormatException -> 0x0192 }
        r2 = r4;
        goto L_0x011b;
    L_0x0192:
        r2 = move-exception;
    L_0x0193:
        r0 = r21;
        r0.m2429a(r9, r12);	 Catch:{ RuntimeException -> 0x0468 }
        r2 = r4;
        goto L_0x011b;
    L_0x019a:
        r0 = r16;
        r2 = r0.f3001b;	 Catch:{ RuntimeException -> 0x0468 }
        if (r2 <= 0) goto L_0x01e2;
    L_0x01a0:
        r2 = r16.mo523a();	 Catch:{ RuntimeException -> 0x0468 }
        r2 = (java.lang.String) r2;	 Catch:{ RuntimeException -> 0x0468 }
    L_0x01a6:
        r9 = new com.badlogic.gdx.utils.JsonValue;	 Catch:{ RuntimeException -> 0x0468 }
        r12 = com.badlogic.gdx.utils.JsonValue.ValueType.object;	 Catch:{ RuntimeException -> 0x0468 }
        r9.<init>(r12);	 Catch:{ RuntimeException -> 0x0468 }
        r0 = r21;
        r12 = r0.f3108n;	 Catch:{ RuntimeException -> 0x0468 }
        if (r12 == 0) goto L_0x01b8;
    L_0x01b3:
        r0 = r21;
        r0.m2428a(r2, r9);	 Catch:{ RuntimeException -> 0x0468 }
    L_0x01b8:
        r0 = r21;
        r2 = r0.f3105k;	 Catch:{ RuntimeException -> 0x0468 }
        r2.m2296a(r9);	 Catch:{ RuntimeException -> 0x0468 }
        r0 = r21;
        r0.f3108n = r9;	 Catch:{ RuntimeException -> 0x0468 }
        r2 = r11.length;	 Catch:{ RuntimeException -> 0x0468 }
        if (r15 != r2) goto L_0x01d2;
    L_0x01c6:
        r2 = r11.length;	 Catch:{ RuntimeException -> 0x0468 }
        r2 = r2 * 2;
        r2 = new int[r2];	 Catch:{ RuntimeException -> 0x0468 }
        r9 = 0;
        r12 = 0;
        r13 = r11.length;	 Catch:{ RuntimeException -> 0x0468 }
        java.lang.System.arraycopy(r11, r9, r2, r12, r13);	 Catch:{ RuntimeException -> 0x0468 }
        r11 = r2;
    L_0x01d2:
        r9 = r15 + 1;
        r11[r15] = r10;	 Catch:{ RuntimeException -> 0x0468 }
        r10 = 5;
        r2 = 2;
        r15 = r9;
        r9 = r2;
        r2 = r6;
        r6 = r4;
        r4 = r5;
        r5 = r7;
        r7 = r3;
        r3 = r10;
        goto L_0x001a;
    L_0x01e2:
        r2 = 0;
        goto L_0x01a6;
    L_0x01e4:
        r21.m2425a();	 Catch:{ RuntimeException -> 0x0468 }
        r9 = r15 + -1;
        r10 = r11[r9];	 Catch:{ RuntimeException -> 0x0468 }
        r2 = 2;
        r15 = r9;
        r9 = r2;
        r2 = r6;
        r6 = r4;
        r4 = r5;
        r5 = r7;
        r7 = r3;
        r3 = r10;
        goto L_0x001a;
    L_0x01f6:
        r0 = r16;
        r2 = r0.f3001b;	 Catch:{ RuntimeException -> 0x0468 }
        if (r2 <= 0) goto L_0x023e;
    L_0x01fc:
        r2 = r16.mo523a();	 Catch:{ RuntimeException -> 0x0468 }
        r2 = (java.lang.String) r2;	 Catch:{ RuntimeException -> 0x0468 }
    L_0x0202:
        r9 = new com.badlogic.gdx.utils.JsonValue;	 Catch:{ RuntimeException -> 0x0468 }
        r12 = com.badlogic.gdx.utils.JsonValue.ValueType.array;	 Catch:{ RuntimeException -> 0x0468 }
        r9.<init>(r12);	 Catch:{ RuntimeException -> 0x0468 }
        r0 = r21;
        r12 = r0.f3108n;	 Catch:{ RuntimeException -> 0x0468 }
        if (r12 == 0) goto L_0x0214;
    L_0x020f:
        r0 = r21;
        r0.m2428a(r2, r9);	 Catch:{ RuntimeException -> 0x0468 }
    L_0x0214:
        r0 = r21;
        r2 = r0.f3105k;	 Catch:{ RuntimeException -> 0x0468 }
        r2.m2296a(r9);	 Catch:{ RuntimeException -> 0x0468 }
        r0 = r21;
        r0.f3108n = r9;	 Catch:{ RuntimeException -> 0x0468 }
        r2 = r11.length;	 Catch:{ RuntimeException -> 0x0468 }
        if (r15 != r2) goto L_0x0480;
    L_0x0222:
        r2 = r11.length;	 Catch:{ RuntimeException -> 0x0468 }
        r2 = r2 * 2;
        r2 = new int[r2];	 Catch:{ RuntimeException -> 0x0468 }
        r9 = 0;
        r12 = 0;
        r13 = r11.length;	 Catch:{ RuntimeException -> 0x0468 }
        java.lang.System.arraycopy(r11, r9, r2, r12, r13);	 Catch:{ RuntimeException -> 0x0468 }
    L_0x022d:
        r11 = r15 + 1;
        r2[r15] = r10;	 Catch:{ RuntimeException -> 0x0468 }
        r10 = 23;
        r9 = 2;
        r15 = r11;
        r11 = r2;
        r2 = r6;
        r6 = r4;
        r4 = r5;
        r5 = r7;
        r7 = r3;
        r3 = r10;
        goto L_0x001a;
    L_0x023e:
        r2 = 0;
        goto L_0x0202;
    L_0x0240:
        r21.m2425a();	 Catch:{ RuntimeException -> 0x0468 }
        r9 = r15 + -1;
        r10 = r11[r9];	 Catch:{ RuntimeException -> 0x0468 }
        r2 = 2;
        r15 = r9;
        r9 = r2;
        r2 = r6;
        r6 = r4;
        r4 = r5;
        r5 = r7;
        r7 = r3;
        r3 = r10;
        goto L_0x001a;
    L_0x0252:
        r9 = r7 + 1;
        r2 = r22[r7];	 Catch:{ RuntimeException -> 0x046c }
        r7 = 47;
        if (r2 != r7) goto L_0x047d;
    L_0x025a:
        r7 = r9;
    L_0x025b:
        r0 = r23;
        if (r7 == r0) goto L_0x0268;
    L_0x025f:
        r2 = r22[r7];	 Catch:{ RuntimeException -> 0x0468 }
        r9 = 10;
        if (r2 == r9) goto L_0x0268;
    L_0x0265:
        r7 = r7 + 1;
        goto L_0x025b;
    L_0x0268:
        r7 = r7 + -1;
        r2 = r13;
        r9 = r14;
        goto L_0x00ab;
    L_0x026e:
        r2 = r7 + 1;
        r0 = r23;
        if (r2 >= r0) goto L_0x027a;
    L_0x0274:
        r2 = r22[r7];	 Catch:{ RuntimeException -> 0x0468 }
        r9 = 42;
        if (r2 != r9) goto L_0x0282;
    L_0x027a:
        r2 = r7 + 1;
        r2 = r22[r2];	 Catch:{ RuntimeException -> 0x0468 }
        r9 = 47;
        if (r2 == r9) goto L_0x0285;
    L_0x0282:
        r7 = r7 + 1;
        goto L_0x026e;
    L_0x0285:
        r7 = r7 + 1;
        r2 = r13;
        r9 = r14;
        goto L_0x00ab;
    L_0x028b:
        r3 = 0;
        r2 = 1;
        if (r4 == 0) goto L_0x02c1;
    L_0x028f:
        r5 = r7;
    L_0x0290:
        r6 = r22[r5];	 Catch:{ RuntimeException -> 0x0465 }
        switch(r6) {
            case 10: goto L_0x029b;
            case 13: goto L_0x029b;
            case 47: goto L_0x02ae;
            case 58: goto L_0x029b;
            case 92: goto L_0x02ac;
            default: goto L_0x0295;
        };	 Catch:{ RuntimeException -> 0x0465 }
    L_0x0295:
        r5 = r5 + 1;
        r0 = r23;
        if (r5 != r0) goto L_0x0290;
    L_0x029b:
        r5 = r5 + -1;
        r6 = r22[r5];	 Catch:{ RuntimeException -> 0x0465 }
        r6 = java.lang.Character.isSpace(r6);	 Catch:{ RuntimeException -> 0x0465 }
        if (r6 != 0) goto L_0x029b;
    L_0x02a5:
        r20 = r7;
        r7 = r5;
        r5 = r20;
        goto L_0x00bb;
    L_0x02ac:
        r3 = 1;
        goto L_0x0295;
    L_0x02ae:
        r6 = r5 + 1;
        r0 = r23;
        if (r6 == r0) goto L_0x0295;
    L_0x02b4:
        r6 = r5 + 1;
        r6 = r22[r6];	 Catch:{ RuntimeException -> 0x0465 }
        r9 = 47;
        if (r6 == r9) goto L_0x029b;
    L_0x02bc:
        r9 = 42;
        if (r6 != r9) goto L_0x0295;
    L_0x02c0:
        goto L_0x029b;
    L_0x02c1:
        r5 = r7;
    L_0x02c2:
        r6 = r22[r5];	 Catch:{ RuntimeException -> 0x0465 }
        switch(r6) {
            case 10: goto L_0x029b;
            case 13: goto L_0x029b;
            case 44: goto L_0x029b;
            case 47: goto L_0x02d0;
            case 92: goto L_0x02ce;
            case 93: goto L_0x029b;
            case 125: goto L_0x029b;
            default: goto L_0x02c7;
        };	 Catch:{ RuntimeException -> 0x0465 }
    L_0x02c7:
        r5 = r5 + 1;
        r0 = r23;
        if (r5 != r0) goto L_0x02c2;
    L_0x02cd:
        goto L_0x029b;
    L_0x02ce:
        r3 = 1;
        goto L_0x02c7;
    L_0x02d0:
        r6 = r5 + 1;
        r0 = r23;
        if (r6 == r0) goto L_0x02c7;
    L_0x02d6:
        r6 = r5 + 1;
        r6 = r22[r6];	 Catch:{ RuntimeException -> 0x0465 }
        r9 = 47;
        if (r6 == r9) goto L_0x029b;
    L_0x02de:
        r9 = 42;
        if (r6 != r9) goto L_0x02c7;
    L_0x02e2:
        goto L_0x029b;
    L_0x02e3:
        r6 = r7 + 1;
        r2 = 0;
        r3 = r6;
    L_0x02e7:
        r7 = r22[r3];	 Catch:{ RuntimeException -> 0x0470 }
        switch(r7) {
            case 34: goto L_0x02f2;
            case 92: goto L_0x02f9;
            default: goto L_0x02ec;
        };
    L_0x02ec:
        r3 = r3 + 1;
        r0 = r23;
        if (r3 != r0) goto L_0x02e7;
    L_0x02f2:
        r7 = r3 + -1;
        r3 = r2;
        r2 = r5;
        r5 = r6;
        goto L_0x00bb;
    L_0x02f9:
        r2 = 1;
        r3 = r3 + 1;
        goto L_0x02ec;
    L_0x02fd:
        r2 = r6;
        r6 = r4;
        r4 = r5;
        r5 = r7;
        r7 = r3;
        r3 = r10;
    L_0x0303:
        if (r3 != 0) goto L_0x0308;
    L_0x0305:
        r9 = 5;
        goto L_0x001a;
    L_0x0308:
        r5 = r5 + 1;
        r0 = r23;
        if (r5 == r0) goto L_0x0311;
    L_0x030e:
        r9 = 1;
        goto L_0x001a;
    L_0x0311:
        r12 = r2;
        r2 = r3;
        r0 = r23;
        if (r5 != r0) goto L_0x001d;
    L_0x0317:
        r3 = f3104j;	 Catch:{ RuntimeException -> 0x0465 }
        r2 = r3[r2];	 Catch:{ RuntimeException -> 0x0465 }
        r9 = f3095a;	 Catch:{ RuntimeException -> 0x0465 }
        r3 = r2 + 1;
        r2 = r9[r2];	 Catch:{ RuntimeException -> 0x0465 }
        r20 = r3;
        r3 = r4;
        r4 = r6;
        r6 = r7;
        r7 = r20;
    L_0x0328:
        r10 = r2 + -1;
        if (r2 <= 0) goto L_0x001d;
    L_0x032c:
        r2 = f3095a;	 Catch:{ RuntimeException -> 0x0465 }
        r11 = r7 + 1;
        r2 = r2[r7];	 Catch:{ RuntimeException -> 0x0465 }
        switch(r2) {
            case 1: goto L_0x033c;
            default: goto L_0x0335;
        };	 Catch:{ RuntimeException -> 0x0465 }
    L_0x0335:
        r2 = r3;
        r3 = r6;
    L_0x0337:
        r7 = r11;
        r6 = r3;
        r3 = r2;
        r2 = r10;
        goto L_0x0328;
    L_0x033c:
        r2 = new java.lang.String;	 Catch:{ RuntimeException -> 0x0465 }
        r7 = r5 - r6;
        r0 = r22;
        r2.<init>(r0, r6, r7);	 Catch:{ RuntimeException -> 0x0465 }
        if (r12 == 0) goto L_0x047a;
    L_0x0347:
        r2 = com.badlogic.gdx.utils.C0694m.m2431b(r2);	 Catch:{ RuntimeException -> 0x0465 }
        r9 = r2;
    L_0x034c:
        if (r4 == 0) goto L_0x0359;
    L_0x034e:
        r2 = 0;
        r0 = r16;
        r0.m2296a(r9);	 Catch:{ RuntimeException -> 0x0465 }
    L_0x0354:
        r3 = 0;
        r4 = r2;
        r2 = r3;
        r3 = r5;
        goto L_0x0337;
    L_0x0359:
        r0 = r16;
        r2 = r0.f3001b;	 Catch:{ RuntimeException -> 0x0465 }
        if (r2 <= 0) goto L_0x0378;
    L_0x035f:
        r2 = r16.mo523a();	 Catch:{ RuntimeException -> 0x0465 }
        r2 = (java.lang.String) r2;	 Catch:{ RuntimeException -> 0x0465 }
        r7 = r2;
    L_0x0366:
        if (r3 == 0) goto L_0x03c6;
    L_0x0368:
        r2 = "true";
        r2 = r9.equals(r2);	 Catch:{ RuntimeException -> 0x0465 }
        if (r2 == 0) goto L_0x037b;
    L_0x0370:
        r2 = 1;
        r0 = r21;
        r0.m2430a(r7, r2);	 Catch:{ RuntimeException -> 0x0465 }
        r2 = r4;
        goto L_0x0354;
    L_0x0378:
        r2 = 0;
        r7 = r2;
        goto L_0x0366;
    L_0x037b:
        r2 = "false";
        r2 = r9.equals(r2);	 Catch:{ RuntimeException -> 0x0465 }
        if (r2 == 0) goto L_0x038b;
    L_0x0383:
        r2 = 0;
        r0 = r21;
        r0.m2430a(r7, r2);	 Catch:{ RuntimeException -> 0x0465 }
        r2 = r4;
        goto L_0x0354;
    L_0x038b:
        r2 = "null";
        r2 = r9.equals(r2);	 Catch:{ RuntimeException -> 0x0465 }
        if (r2 == 0) goto L_0x039b;
    L_0x0393:
        r2 = 0;
        r0 = r21;
        r0.m2429a(r7, r2);	 Catch:{ RuntimeException -> 0x0465 }
        r2 = r4;
        goto L_0x0354;
    L_0x039b:
        r2 = 0;
        r3 = 1;
    L_0x039d:
        if (r6 >= r5) goto L_0x03a6;
    L_0x039f:
        r13 = r22[r6];	 Catch:{ RuntimeException -> 0x0465 }
        switch(r13) {
            case 43: goto L_0x03b5;
            case 45: goto L_0x03b5;
            case 46: goto L_0x03b3;
            case 48: goto L_0x03b5;
            case 49: goto L_0x03b5;
            case 50: goto L_0x03b5;
            case 51: goto L_0x03b5;
            case 52: goto L_0x03b5;
            case 53: goto L_0x03b5;
            case 54: goto L_0x03b5;
            case 55: goto L_0x03b5;
            case 56: goto L_0x03b5;
            case 57: goto L_0x03b5;
            case 69: goto L_0x03b3;
            case 101: goto L_0x03b3;
            default: goto L_0x03a4;
        };
    L_0x03a4:
        r2 = 0;
        r3 = 0;
    L_0x03a6:
        if (r2 == 0) goto L_0x03b8;
    L_0x03a8:
        r2 = java.lang.Double.parseDouble(r9);	 Catch:{ NumberFormatException -> 0x0474 }
        r0 = r21;
        r0.m2426a(r7, r2, r9);	 Catch:{ NumberFormatException -> 0x0474 }
        r2 = r4;
        goto L_0x0354;
    L_0x03b3:
        r2 = 1;
        r3 = 0;
    L_0x03b5:
        r6 = r6 + 1;
        goto L_0x039d;
    L_0x03b8:
        if (r3 == 0) goto L_0x03c6;
    L_0x03ba:
        r2 = java.lang.Long.parseLong(r9);	 Catch:{ NumberFormatException -> 0x03c5 }
        r0 = r21;
        r0.m2427a(r7, r2, r9);	 Catch:{ NumberFormatException -> 0x03c5 }
        r2 = r4;
        goto L_0x0354;
    L_0x03c5:
        r2 = move-exception;
    L_0x03c6:
        r0 = r21;
        r0.m2429a(r7, r9);	 Catch:{ RuntimeException -> 0x0465 }
        r2 = r4;
        goto L_0x0354;
    L_0x03cd:
        r4 = 0;
        r6 = r5 + -32;
        r4 = java.lang.Math.max(r4, r6);
        r6 = new com.badlogic.gdx.utils.SerializationException;
        r7 = new java.lang.StringBuilder;
        r8 = "Error parsing JSON on line ";
        r7.<init>(r8);
        r3 = r7.append(r3);
        r7 = " near: ";
        r3 = r3.append(r7);
        r7 = new java.lang.String;
        r8 = r5 - r4;
        r0 = r22;
        r7.<init>(r0, r4, r8);
        r3 = r3.append(r7);
        r4 = "*ERROR*";
        r3 = r3.append(r4);
        r4 = new java.lang.String;
        r7 = 64;
        r8 = r23 - r5;
        r7 = java.lang.Math.min(r7, r8);
        r0 = r22;
        r4.<init>(r0, r5, r7);
        r3 = r3.append(r4);
        r3 = r3.toString();
        r6.<init>(r3, r2);
        throw r6;
    L_0x0415:
        r0 = r21;
        r4 = r0.f3105k;
        r4 = r4.f3001b;
        if (r4 == 0) goto L_0x0446;
    L_0x041d:
        r0 = r21;
        r2 = r0.f3105k;
        r2 = r2.m2299b();
        r2 = (com.badlogic.gdx.utils.JsonValue) r2;
        r0 = r21;
        r3 = r0.f3105k;
        r3.mo530d();
        if (r2 == 0) goto L_0x043e;
    L_0x0430:
        r2 = r2.m2276k();
        if (r2 == 0) goto L_0x043e;
    L_0x0436:
        r2 = new com.badlogic.gdx.utils.SerializationException;
        r3 = "Error parsing JSON, unmatched brace.";
        r2.<init>(r3);
        throw r2;
    L_0x043e:
        r2 = new com.badlogic.gdx.utils.SerializationException;
        r3 = "Error parsing JSON, unmatched bracket.";
        r2.<init>(r3);
        throw r2;
    L_0x0446:
        if (r2 == 0) goto L_0x0464;
    L_0x0448:
        r3 = new com.badlogic.gdx.utils.SerializationException;
        r4 = new java.lang.StringBuilder;
        r5 = "Error parsing JSON: ";
        r4.<init>(r5);
        r5 = new java.lang.String;
        r0 = r22;
        r5.<init>(r0);
        r4 = r4.append(r5);
        r4 = r4.toString();
        r3.<init>(r4, r2);
        throw r3;
    L_0x0464:
        return r3;
    L_0x0465:
        r2 = move-exception;
        goto L_0x001e;
    L_0x0468:
        r2 = move-exception;
        r5 = r7;
        goto L_0x001e;
    L_0x046c:
        r2 = move-exception;
        r5 = r9;
        goto L_0x001e;
    L_0x0470:
        r2 = move-exception;
        r5 = r3;
        goto L_0x001e;
    L_0x0474:
        r2 = move-exception;
        goto L_0x03c6;
    L_0x0477:
        r2 = move-exception;
        goto L_0x0193;
    L_0x047a:
        r9 = r2;
        goto L_0x034c;
    L_0x047d:
        r7 = r9;
        goto L_0x026e;
    L_0x0480:
        r2 = r11;
        goto L_0x022d;
    L_0x0483:
        r12 = r2;
        goto L_0x0113;
    L_0x0486:
        r3 = r10;
        goto L_0x0303;
    L_0x0489:
        r3 = r9;
        goto L_0x008a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.m.a(char[], int):com.badlogic.gdx.utils.JsonValue");
    }

    /* renamed from: a */
    private void m2425a() {
        this.f3107m = (JsonValue) this.f3105k.mo523a();
        if (this.f3108n.f2961j > 0) {
            this.f3106l.mo523a();
        }
        this.f3108n = this.f3105k.f3001b > 0 ? (JsonValue) this.f3105k.m2299b() : null;
    }

    /* renamed from: a */
    private void m2426a(String str, double d, String str2) {
        m2428a(str, new JsonValue(d, str2));
    }

    /* renamed from: a */
    private void m2427a(String str, long j, String str2) {
        m2428a(str, new JsonValue(j, str2));
    }

    /* renamed from: a */
    private void m2428a(String str, JsonValue jsonValue) {
        jsonValue.f2956e = str;
        if (this.f3108n == null) {
            this.f3108n = jsonValue;
            this.f3107m = jsonValue;
        } else if (this.f3108n.m2275j() || this.f3108n.m2276k()) {
            JsonValue jsonValue2;
            jsonValue.f2960i = this.f3108n;
            if (this.f3108n.f2961j == 0) {
                this.f3108n.f2957f = jsonValue;
            } else {
                jsonValue2 = (JsonValue) this.f3106l.mo523a();
                jsonValue2.f2958g = jsonValue;
                jsonValue.f2959h = jsonValue2;
            }
            this.f3106l.m2296a((Object) jsonValue);
            jsonValue2 = this.f3108n;
            jsonValue2.f2961j++;
        } else {
            this.f3107m = this.f3108n;
        }
    }

    /* renamed from: a */
    private void m2429a(String str, String str2) {
        m2428a(str, new JsonValue(str2));
    }

    /* renamed from: a */
    private void m2430a(String str, boolean z) {
        m2428a(str, new JsonValue(z));
    }

    /* renamed from: b */
    private static String m2431b(String str) {
        int length = str.length();
        ac acVar = new ac(length + 16);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != '\\') {
                acVar.m2322a(charAt);
                i = i2;
            } else if (i2 == length) {
                return acVar.toString();
            } else {
                int i3 = i2 + 1;
                charAt = str.charAt(i2);
                if (charAt == 'u') {
                    Object toChars = Character.toChars(Integer.parseInt(str.substring(i3, i3 + 4), 16));
                    i2 = acVar.f3009b + toChars.length;
                    if (i2 > acVar.f3008a.length) {
                        acVar.m2323a(i2);
                    }
                    System.arraycopy(toChars, 0, acVar.f3008a, acVar.f3009b, toChars.length);
                    acVar.f3009b = i2;
                    i = i3 + 4;
                } else {
                    switch (charAt) {
                        case '\"':
                        case '/':
                        case '\\':
                            break;
                        case 'b':
                            charAt = '\b';
                            break;
                        case 'f':
                            charAt = '\f';
                            break;
                        case 'n':
                            charAt = '\n';
                            break;
                        case 'r':
                            charAt = '\r';
                            break;
                        case 't':
                            charAt = '\t';
                            break;
                        default:
                            throw new SerializationException("Illegal escaped character: \\" + charAt);
                    }
                    acVar.m2322a(charAt);
                    i = i3;
                }
            }
        }
        return acVar.toString();
    }

    /* renamed from: a */
    public final JsonValue mo521a(C0316a c0316a) {
        try {
            return m2423a(c0316a.m891c("UTF-8"));
        } catch (Throwable e) {
            throw new SerializationException("Error parsing file: " + c0316a, e);
        }
    }

    /* renamed from: a */
    public final JsonValue m2433a(String str) {
        char[] toCharArray = str.toCharArray();
        return m2424a(toCharArray, toCharArray.length);
    }
}
