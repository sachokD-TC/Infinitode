package com.badlogic.gdx.utils;

import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.C0710q.C0707b;
import java.io.Reader;
import java.util.Iterator;

public final class ah {
    /* renamed from: e */
    private static final byte[] f3033e = new byte[]{(byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 1, (byte) 3, (byte) 1, (byte) 4, (byte) 1, (byte) 5, (byte) 1, (byte) 6, (byte) 1, (byte) 7, (byte) 2, (byte) 0, (byte) 6, (byte) 2, (byte) 1, (byte) 4, (byte) 2, (byte) 2, (byte) 4};
    /* renamed from: f */
    private static final byte[] f3034f = new byte[]{(byte) 0, (byte) 0, (byte) 4, (byte) 9, (byte) 14, (byte) 20, (byte) 26, (byte) 30, (byte) 35, (byte) 36, (byte) 37, (byte) 42, (byte) 46, (byte) 50, (byte) 51, (byte) 52, (byte) 56, (byte) 57, (byte) 62, (byte) 67, (byte) 73, (byte) 79, (byte) 83, (byte) 88, (byte) 89, (byte) 90, (byte) 95, (byte) 99, (byte) 103, (byte) 104, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 115};
    /* renamed from: g */
    private static final char[] f3035g = new char[]{' ', '<', '\t', '\r', ' ', '/', '>', '\t', '\r', ' ', '/', '>', '\t', '\r', ' ', '/', '=', '>', '\t', '\r', ' ', '/', '=', '>', '\t', '\r', ' ', '=', '\t', '\r', ' ', '\"', '\'', '\t', '\r', '\"', '\"', ' ', '/', '>', '\t', '\r', ' ', '>', '\t', '\r', ' ', '>', '\t', '\r', '\'', '\'', ' ', '<', '\t', '\r', '<', ' ', '/', '>', '\t', '\r', ' ', '/', '>', '\t', '\r', ' ', '/', '=', '>', '\t', '\r', ' ', '/', '=', '>', '\t', '\r', ' ', '=', '\t', '\r', ' ', '\"', '\'', '\t', '\r', '\"', '\"', ' ', '/', '>', '\t', '\r', ' ', '>', '\t', '\r', ' ', '>', '\t', '\r', '<', ' ', '/', '\t', '\r', '>', '>', '\'', '\'', ' ', '\t', '\r', '\u0000'};
    /* renamed from: h */
    private static final byte[] f3036h = new byte[]{(byte) 0, (byte) 2, (byte) 3, (byte) 3, (byte) 4, (byte) 4, (byte) 2, (byte) 3, (byte) 1, (byte) 1, (byte) 3, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 2, (byte) 1, (byte) 3, (byte) 3, (byte) 4, (byte) 4, (byte) 2, (byte) 3, (byte) 1, (byte) 1, (byte) 3, (byte) 2, (byte) 2, (byte) 1, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0};
    /* renamed from: i */
    private static final byte[] f3037i = new byte[]{(byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0};
    /* renamed from: j */
    private static final short[] f3038j = new short[]{(short) 0, (short) 0, (short) 4, (short) 9, (short) 14, (short) 20, (short) 26, (short) 30, (short) 35, (short) 37, (short) 39, (short) 44, (short) 48, (short) 52, (short) 54, (short) 56, (short) 60, (short) 62, (short) 67, (short) 72, (short) 78, (short) 84, (short) 88, (short) 93, (short) 95, (short) 97, (short) 102, (short) 106, (short) 110, (short) 112, (short) 116, (short) 118, (short) 120, (short) 122, (short) 124, (short) 127};
    /* renamed from: k */
    private static final byte[] f3039k = new byte[]{(byte) 0, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 1, (byte) 2, (byte) 3, (byte) 5, (byte) 6, (byte) 7, (byte) 5, (byte) 4, (byte) 9, (byte) 10, (byte) 1, (byte) 11, (byte) 9, (byte) 8, (byte) 13, (byte) 1, (byte) 14, (byte) 1, (byte) 13, (byte) 12, (byte) 15, (byte) 16, (byte) 15, (byte) 1, (byte) 16, (byte) 17, (byte) 18, (byte) 16, (byte) 1, (byte) 20, (byte) 19, (byte) 22, (byte) 21, (byte) 9, (byte) 10, (byte) 11, (byte) 9, (byte) 1, (byte) 23, (byte) 24, (byte) 23, (byte) 1, (byte) 25, (byte) 11, (byte) 25, (byte) 1, (byte) 20, (byte) 26, (byte) 22, (byte) 27, (byte) 29, (byte) 30, (byte) 29, (byte) 28, (byte) 32, (byte) 31, (byte) 30, (byte) 34, (byte) 1, (byte) 30, (byte) 33, (byte) 36, (byte) 37, (byte) 38, (byte) 36, (byte) 35, (byte) 40, (byte) 41, (byte) 1, (byte) 42, (byte) 40, (byte) 39, (byte) 44, (byte) 1, (byte) 45, (byte) 1, (byte) 44, (byte) 43, (byte) 46, (byte) 47, (byte) 46, (byte) 1, (byte) 47, (byte) 48, (byte) 49, (byte) 47, (byte) 1, (byte) 51, (byte) 50, (byte) 53, (byte) 52, (byte) 40, (byte) 41, (byte) 42, (byte) 40, (byte) 1, (byte) 54, (byte) 55, (byte) 54, (byte) 1, (byte) 56, (byte) 42, (byte) 56, (byte) 1, (byte) 57, (byte) 1, (byte) 57, (byte) 34, (byte) 57, (byte) 1, (byte) 1, (byte) 58, (byte) 59, (byte) 58, (byte) 51, (byte) 60, (byte) 53, (byte) 61, (byte) 62, (byte) 62, (byte) 1, (byte) 1, (byte) 0};
    /* renamed from: l */
    private static final byte[] f3040l = new byte[]{(byte) 1, (byte) 0, (byte) 2, (byte) 3, (byte) 3, (byte) 4, (byte) 11, (byte) 34, (byte) 5, (byte) 4, (byte) 11, (byte) 34, (byte) 5, (byte) 6, (byte) 7, (byte) 6, (byte) 7, (byte) 8, (byte) 13, (byte) 9, (byte) 10, (byte) 9, (byte) 10, (byte) 12, (byte) 34, (byte) 12, (byte) 14, (byte) 14, (byte) 16, (byte) 15, (byte) 17, (byte) 16, (byte) 17, (byte) 18, (byte) 30, (byte) 18, (byte) 19, (byte) 26, (byte) 28, (byte) 20, (byte) 19, (byte) 26, (byte) 28, (byte) 20, (byte) 21, (byte) 22, (byte) 21, (byte) 22, (byte) 23, (byte) 32, (byte) 24, (byte) 25, (byte) 24, (byte) 25, (byte) 27, (byte) 28, (byte) 27, (byte) 29, (byte) 31, (byte) 35, (byte) 33, (byte) 33, (byte) 34};
    /* renamed from: m */
    private static final byte[] f3041m = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 3, (byte) 3, (byte) 20, (byte) 1, (byte) 0, (byte) 0, (byte) 9, (byte) 0, (byte) 11, (byte) 11, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 17, (byte) 0, (byte) 13, (byte) 5, (byte) 23, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 15, (byte) 1, (byte) 0, (byte) 0, (byte) 3, (byte) 3, (byte) 20, (byte) 1, (byte) 0, (byte) 0, (byte) 9, (byte) 0, (byte) 11, (byte) 11, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 17, (byte) 0, (byte) 13, (byte) 5, (byte) 23, (byte) 0, (byte) 0, (byte) 0, (byte) 7, (byte) 1, (byte) 0, (byte) 0};
    /* renamed from: a */
    private final C0676a<C0680a> f3042a = new C0676a(8);
    /* renamed from: b */
    private C0680a f3043b;
    /* renamed from: c */
    private C0680a f3044c;
    /* renamed from: d */
    private final ac f3045d = new ac(64);

    /* renamed from: com.badlogic.gdx.utils.ah$a */
    public static class C0680a {
        /* renamed from: a */
        public final String f3028a;
        /* renamed from: b */
        public C0710q<String, String> f3029b;
        /* renamed from: c */
        C0676a<C0680a> f3030c;
        /* renamed from: d */
        public String f3031d;
        /* renamed from: e */
        private C0680a f3032e;

        public C0680a(String str, C0680a c0680a) {
            this.f3028a = str;
            this.f3032e = c0680a;
        }

        /* renamed from: e */
        private String m2355e(String str) {
            Iterator c;
            ac acVar = new ac(128);
            acVar.m2324a(str);
            acVar.m2322a('<');
            acVar.m2324a(this.f3028a);
            if (this.f3029b != null) {
                c = this.f3029b.mo546c();
                while (c.hasNext()) {
                    C0707b c0707b = (C0707b) c.next();
                    acVar.m2322a(' ');
                    acVar.m2324a((String) c0707b.f3163a);
                    acVar.m2324a("=\"");
                    acVar.m2324a((String) c0707b.f3164b);
                    acVar.m2322a('\"');
                }
            }
            if (this.f3030c == null && (this.f3031d == null || this.f3031d.length() == 0)) {
                acVar.m2324a("/>");
            } else {
                acVar.m2324a(">\n");
                String str2 = str + '\t';
                if (this.f3031d != null && this.f3031d.length() > 0) {
                    acVar.m2324a(str2);
                    acVar.m2324a(this.f3031d);
                    acVar.m2322a('\n');
                }
                if (this.f3030c != null) {
                    c = this.f3030c.iterator();
                    while (c.hasNext()) {
                        acVar.m2324a(((C0680a) c.next()).m2355e(str2));
                        acVar.m2322a('\n');
                    }
                }
                acVar.m2324a(str);
                acVar.m2324a("</");
                acVar.m2324a(this.f3028a);
                acVar.m2322a('>');
            }
            return acVar.toString();
        }

        /* renamed from: a */
        public final int m2356a() {
            return this.f3030c == null ? 0 : this.f3030c.f3001b;
        }

        /* renamed from: a */
        public final int m2357a(String str, int i) {
            String a = m2360a(str, null);
            return a == null ? i : Integer.parseInt(a);
        }

        /* renamed from: a */
        public final C0680a m2358a(int i) {
            if (this.f3030c != null) {
                return (C0680a) this.f3030c.m2291a(i);
            }
            throw new GdxRuntimeException("Element has no children: " + this.f3028a);
        }

        /* renamed from: a */
        public final String m2359a(String str) {
            if (this.f3029b == null) {
                throw new GdxRuntimeException("Element " + this.f3028a + " doesn't have attribute: " + str);
            }
            String str2 = (String) this.f3029b.m2467a((Object) str);
            if (str2 != null) {
                return str2;
            }
            throw new GdxRuntimeException("Element " + this.f3028a + " doesn't have attribute: " + str);
        }

        /* renamed from: a */
        public final String m2360a(String str, String str2) {
            if (this.f3029b == null) {
                return str2;
            }
            String str3 = (String) this.f3029b.m2467a((Object) str);
            return str3 != null ? str3 : str2;
        }

        /* renamed from: b */
        public final C0680a m2361b(String str) {
            if (this.f3030c == null) {
                return null;
            }
            for (int i = 0; i < this.f3030c.f3001b; i++) {
                C0680a c0680a = (C0680a) this.f3030c.m2291a(i);
                if (c0680a.f3028a.equals(str)) {
                    return c0680a;
                }
            }
            return null;
        }

        /* renamed from: c */
        public final float m2362c(String str) {
            return Float.parseFloat(m2359a(str));
        }

        /* renamed from: d */
        public final int m2363d(String str) {
            return Integer.parseInt(m2359a(str));
        }

        public final String toString() {
            return m2355e("");
        }
    }

    /* renamed from: a */
    private C0680a m2364a(Reader reader) {
        int i = 0;
        try {
            Object obj = new char[1024];
            while (true) {
                int read = reader.read(obj, i, obj.length - i);
                if (read == -1) {
                    C0680a a = m2365a(obj, i);
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
    private C0680a m2365a(char[] r17, int r18) {
        /*
        r16 = this;
        r2 = 0;
        r6 = 0;
        r7 = 0;
        r4 = 0;
        r5 = 1;
        r1 = 0;
        r14 = r1;
        r1 = r2;
        r2 = r14;
        r15 = r7;
        r7 = r5;
        r5 = r15;
    L_0x000c:
        switch(r2) {
            case 0: goto L_0x0026;
            case 1: goto L_0x0030;
            case 2: goto L_0x0384;
            default: goto L_0x000f;
        };
    L_0x000f:
        r3 = r1;
        r0 = r18;
        if (r3 >= r0) goto L_0x0341;
    L_0x0014:
        r2 = 1;
        r1 = 0;
        r14 = r1;
        r1 = r2;
        r2 = r14;
    L_0x0019:
        if (r2 >= r3) goto L_0x0313;
    L_0x001b:
        r4 = r17[r2];
        r5 = 10;
        if (r4 != r5) goto L_0x0023;
    L_0x0021:
        r1 = r1 + 1;
    L_0x0023:
        r2 = r2 + 1;
        goto L_0x0019;
    L_0x0026:
        r0 = r18;
        if (r1 != r0) goto L_0x002c;
    L_0x002a:
        r2 = 4;
        goto L_0x000c;
    L_0x002c:
        if (r7 != 0) goto L_0x0030;
    L_0x002e:
        r2 = 5;
        goto L_0x000c;
    L_0x0030:
        r2 = f3034f;
        r2 = r2[r7];
        r3 = f3038j;
        r3 = r3[r7];
        r8 = f3036h;
        r10 = r8[r7];
        if (r10 <= 0) goto L_0x0093;
    L_0x003e:
        r8 = r2 + r10;
        r8 = r8 + -1;
        r9 = r2;
    L_0x0043:
        if (r8 < r9) goto L_0x0091;
    L_0x0045:
        r11 = r8 - r9;
        r11 = r11 >> 1;
        r11 = r11 + r9;
        r12 = r17[r1];
        r13 = f3035g;
        r13 = r13[r11];
        if (r12 >= r13) goto L_0x0055;
    L_0x0052:
        r8 = r11 + -1;
        goto L_0x0043;
    L_0x0055:
        r9 = r17[r1];
        r12 = f3035g;
        r12 = r12[r11];
        if (r9 <= r12) goto L_0x0060;
    L_0x005d:
        r9 = r11 + 1;
        goto L_0x0043;
    L_0x0060:
        r2 = r11 - r2;
        r3 = r3 + r2;
    L_0x0063:
        r2 = f3039k;
        r2 = r2[r3];
        r3 = f3040l;
        r8 = r3[r2];
        r3 = f3041m;
        r3 = r3[r2];
        if (r3 == 0) goto L_0x02f5;
    L_0x0071:
        r3 = f3041m;
        r2 = r3[r2];
        r7 = f3033e;
        r3 = r2 + 1;
        r2 = r7[r2];
        r7 = r5;
        r14 = r3;
        r3 = r2;
        r2 = r6;
        r6 = r4;
        r4 = r14;
    L_0x0081:
        r11 = r3 + -1;
        if (r3 <= 0) goto L_0x038f;
    L_0x0085:
        r3 = f3033e;
        r12 = r4 + 1;
        r3 = r3[r4];
        switch(r3) {
            case 0: goto L_0x00c8;
            case 1: goto L_0x00cc;
            case 2: goto L_0x01c2;
            case 3: goto L_0x01d0;
            case 4: goto L_0x01de;
            case 5: goto L_0x01eb;
            case 6: goto L_0x01f8;
            case 7: goto L_0x021b;
            default: goto L_0x008e;
        };
    L_0x008e:
        r3 = r11;
        r4 = r12;
        goto L_0x0081;
    L_0x0091:
        r2 = r2 + r10;
        r3 = r3 + r10;
    L_0x0093:
        r8 = f3037i;
        r9 = r8[r7];
        if (r9 <= 0) goto L_0x0063;
    L_0x0099:
        r7 = r9 << 1;
        r7 = r7 + r2;
        r7 = r7 + -2;
        r8 = r2;
    L_0x009f:
        if (r7 < r8) goto L_0x00c6;
    L_0x00a1:
        r10 = r7 - r8;
        r10 = r10 >> 1;
        r10 = r10 & -2;
        r10 = r10 + r8;
        r11 = r17[r1];
        r12 = f3035g;
        r12 = r12[r10];
        if (r11 >= r12) goto L_0x00b3;
    L_0x00b0:
        r7 = r10 + -2;
        goto L_0x009f;
    L_0x00b3:
        r8 = r17[r1];
        r11 = f3035g;
        r12 = r10 + 1;
        r11 = r11[r12];
        if (r8 <= r11) goto L_0x00c0;
    L_0x00bd:
        r8 = r10 + 2;
        goto L_0x009f;
    L_0x00c0:
        r2 = r10 - r2;
        r2 = r2 >> 1;
        r3 = r3 + r2;
        goto L_0x0063;
    L_0x00c6:
        r3 = r3 + r9;
        goto L_0x0063;
    L_0x00c8:
        r3 = r11;
        r4 = r12;
        r2 = r1;
        goto L_0x0081;
    L_0x00cc:
        r3 = r17[r2];
        r4 = 63;
        if (r3 == r4) goto L_0x00d6;
    L_0x00d2:
        r4 = 33;
        if (r3 != r4) goto L_0x0188;
    L_0x00d6:
        r4 = r2 + 1;
        r4 = r17[r4];
        r5 = 91;
        if (r4 != r5) goto L_0x014a;
    L_0x00de:
        r4 = r2 + 2;
        r4 = r17[r4];
        r5 = 67;
        if (r4 != r5) goto L_0x014a;
    L_0x00e6:
        r4 = r2 + 3;
        r4 = r17[r4];
        r5 = 68;
        if (r4 != r5) goto L_0x014a;
    L_0x00ee:
        r4 = r2 + 4;
        r4 = r17[r4];
        r5 = 65;
        if (r4 != r5) goto L_0x014a;
    L_0x00f6:
        r4 = r2 + 5;
        r4 = r17[r4];
        r5 = 84;
        if (r4 != r5) goto L_0x014a;
    L_0x00fe:
        r4 = r2 + 6;
        r4 = r17[r4];
        r5 = 65;
        if (r4 != r5) goto L_0x014a;
    L_0x0106:
        r4 = r2 + 7;
        r4 = r17[r4];
        r5 = 91;
        if (r4 != r5) goto L_0x014a;
    L_0x010e:
        r2 = r2 + 8;
        r1 = r2 + 2;
    L_0x0112:
        r3 = r1 + -2;
        r3 = r17[r3];
        r4 = 93;
        if (r3 != r4) goto L_0x0128;
    L_0x011a:
        r3 = r1 + -1;
        r3 = r17[r3];
        r4 = 93;
        if (r3 != r4) goto L_0x0128;
    L_0x0122:
        r3 = r17[r1];
        r4 = 62;
        if (r3 == r4) goto L_0x012b;
    L_0x0128:
        r1 = r1 + 1;
        goto L_0x0112;
    L_0x012b:
        r3 = new java.lang.String;
        r4 = r1 - r2;
        r4 = r4 + -2;
        r0 = r17;
        r3.<init>(r0, r2, r4);
        r0 = r16;
        r0.m2367b(r3);
        r14 = r2;
        r2 = r1;
        r1 = r14;
    L_0x013e:
        r5 = 15;
        r3 = 2;
        r4 = r6;
        r6 = r1;
        r1 = r2;
        r2 = r3;
        r14 = r7;
        r7 = r5;
        r5 = r14;
        goto L_0x000c;
    L_0x014a:
        r4 = 33;
        if (r3 != r4) goto L_0x017f;
    L_0x014e:
        r3 = r2 + 1;
        r3 = r17[r3];
        r4 = 45;
        if (r3 != r4) goto L_0x017f;
    L_0x0156:
        r3 = r2 + 2;
        r3 = r17[r3];
        r4 = 45;
        if (r3 != r4) goto L_0x017f;
    L_0x015e:
        r1 = r2 + 3;
    L_0x0160:
        r3 = r17[r1];
        r4 = 45;
        if (r3 != r4) goto L_0x0176;
    L_0x0166:
        r3 = r1 + 1;
        r3 = r17[r3];
        r4 = 45;
        if (r3 != r4) goto L_0x0176;
    L_0x016e:
        r3 = r1 + 2;
        r3 = r17[r3];
        r4 = 62;
        if (r3 == r4) goto L_0x0179;
    L_0x0176:
        r1 = r1 + 1;
        goto L_0x0160;
    L_0x0179:
        r1 = r1 + 2;
        r14 = r2;
        r2 = r1;
        r1 = r14;
        goto L_0x013e;
    L_0x017f:
        r3 = r17[r1];
        r4 = 62;
        if (r3 == r4) goto L_0x038a;
    L_0x0185:
        r1 = r1 + 1;
        goto L_0x017f;
    L_0x0188:
        r6 = 1;
        r3 = new java.lang.String;
        r4 = r1 - r2;
        r0 = r17;
        r3.<init>(r0, r2, r4);
        r4 = new com.badlogic.gdx.utils.ah$a;
        r0 = r16;
        r5 = r0.f3044c;
        r4.<init>(r3, r5);
        r0 = r16;
        r3 = r0.f3044c;
        if (r3 == 0) goto L_0x01b3;
    L_0x01a1:
        r5 = r3.f3030c;
        if (r5 != 0) goto L_0x01ae;
    L_0x01a5:
        r5 = new com.badlogic.gdx.utils.a;
        r9 = 8;
        r5.<init>(r9);
        r3.f3030c = r5;
    L_0x01ae:
        r3 = r3.f3030c;
        r3.m2296a(r4);
    L_0x01b3:
        r0 = r16;
        r3 = r0.f3042a;
        r3.m2296a(r4);
        r0 = r16;
        r0.f3044c = r4;
        r3 = r11;
        r4 = r12;
        goto L_0x0081;
    L_0x01c2:
        r4 = 0;
        r16.m2366a();
        r5 = 15;
        r3 = 2;
        r6 = r2;
        r2 = r3;
        r14 = r7;
        r7 = r5;
        r5 = r14;
        goto L_0x000c;
    L_0x01d0:
        r16.m2366a();
        r5 = 15;
        r3 = 2;
        r4 = r6;
        r6 = r2;
        r2 = r3;
        r14 = r7;
        r7 = r5;
        r5 = r14;
        goto L_0x000c;
    L_0x01de:
        if (r6 == 0) goto L_0x008e;
    L_0x01e0:
        r5 = 15;
        r3 = 2;
        r4 = r6;
        r6 = r2;
        r2 = r3;
        r14 = r7;
        r7 = r5;
        r5 = r14;
        goto L_0x000c;
    L_0x01eb:
        r7 = new java.lang.String;
        r3 = r1 - r2;
        r0 = r17;
        r7.<init>(r0, r2, r3);
        r3 = r11;
        r4 = r12;
        goto L_0x0081;
    L_0x01f8:
        r3 = new java.lang.String;
        r4 = r1 - r2;
        r0 = r17;
        r3.<init>(r0, r2, r4);
        r0 = r16;
        r4 = r0.f3044c;
        r5 = r4.f3029b;
        if (r5 != 0) goto L_0x0212;
    L_0x0209:
        r5 = new com.badlogic.gdx.utils.q;
        r9 = 8;
        r5.<init>(r9);
        r4.f3029b = r5;
    L_0x0212:
        r4 = r4.f3029b;
        r4.mo542a(r7, r3);
        r3 = r11;
        r4 = r12;
        goto L_0x0081;
    L_0x021b:
        r10 = r1;
    L_0x021c:
        if (r10 == r2) goto L_0x0225;
    L_0x021e:
        r3 = r10 + -1;
        r3 = r17[r3];
        switch(r3) {
            case 9: goto L_0x026e;
            case 10: goto L_0x026e;
            case 13: goto L_0x026e;
            case 32: goto L_0x026e;
            default: goto L_0x0225;
        };
    L_0x0225:
        r3 = 0;
        r5 = r2;
        r14 = r2;
        r2 = r3;
        r3 = r14;
    L_0x022a:
        if (r3 == r10) goto L_0x02bb;
    L_0x022c:
        r9 = r3 + 1;
        r3 = r17[r3];
        r4 = 38;
        if (r3 != r4) goto L_0x0381;
    L_0x0234:
        r3 = r9;
    L_0x0235:
        if (r3 == r10) goto L_0x037e;
    L_0x0237:
        r4 = r3 + 1;
        r3 = r17[r3];
        r13 = 59;
        if (r3 != r13) goto L_0x037b;
    L_0x023f:
        r0 = r16;
        r2 = r0.f3045d;
        r3 = r9 - r5;
        r3 = r3 + -1;
        r0 = r17;
        r2.m2326b(r0, r5, r3);
        r3 = new java.lang.String;
        r2 = r4 - r9;
        r2 = r2 + -1;
        r0 = r17;
        r3.<init>(r0, r9, r2);
        r2 = "lt";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x0272;
    L_0x025f:
        r2 = "<";
    L_0x0261:
        r0 = r16;
        r5 = r0.f3045d;
        if (r2 == 0) goto L_0x02b9;
    L_0x0267:
        r5.m2324a(r2);
        r2 = 1;
        r3 = r4;
    L_0x026c:
        r5 = r4;
        goto L_0x022a;
    L_0x026e:
        r3 = r10 + -1;
        r10 = r3;
        goto L_0x021c;
    L_0x0272:
        r2 = "gt";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x027d;
    L_0x027a:
        r2 = ">";
        goto L_0x0261;
    L_0x027d:
        r2 = "amp";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x0288;
    L_0x0285:
        r2 = "&";
        goto L_0x0261;
    L_0x0288:
        r2 = "apos";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x0293;
    L_0x0290:
        r2 = "'";
        goto L_0x0261;
    L_0x0293:
        r2 = "quot";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x029e;
    L_0x029b:
        r2 = "\"";
        goto L_0x0261;
    L_0x029e:
        r2 = "#x";
        r2 = r3.startsWith(r2);
        if (r2 == 0) goto L_0x02b7;
    L_0x02a6:
        r2 = 2;
        r2 = r3.substring(r2);
        r5 = 16;
        r2 = java.lang.Integer.parseInt(r2, r5);
        r2 = (char) r2;
        r2 = java.lang.Character.toString(r2);
        goto L_0x0261;
    L_0x02b7:
        r2 = 0;
        goto L_0x0261;
    L_0x02b9:
        r2 = r3;
        goto L_0x0267;
    L_0x02bb:
        if (r2 == 0) goto L_0x02e4;
    L_0x02bd:
        if (r5 >= r10) goto L_0x02ca;
    L_0x02bf:
        r0 = r16;
        r2 = r0.f3045d;
        r3 = r10 - r5;
        r0 = r17;
        r2.m2326b(r0, r5, r3);
    L_0x02ca:
        r0 = r16;
        r2 = r0.f3045d;
        r2 = r2.toString();
        r0 = r16;
        r0.m2367b(r2);
        r0 = r16;
        r2 = r0.f3045d;
        r3 = 0;
        r2.m2327b(r3);
        r3 = r11;
        r4 = r12;
        r2 = r5;
        goto L_0x0081;
    L_0x02e4:
        r2 = new java.lang.String;
        r3 = r10 - r5;
        r0 = r17;
        r2.<init>(r0, r5, r3);
        r0 = r16;
        r0.m2367b(r2);
        r2 = r5;
        goto L_0x008e;
    L_0x02f5:
        r2 = r4;
        r3 = r5;
        r4 = r6;
        r5 = r8;
    L_0x02f9:
        if (r5 != 0) goto L_0x0304;
    L_0x02fb:
        r6 = 5;
        r7 = r5;
        r5 = r3;
        r14 = r2;
        r2 = r6;
        r6 = r4;
        r4 = r14;
        goto L_0x000c;
    L_0x0304:
        r1 = r1 + 1;
        r0 = r18;
        if (r1 == r0) goto L_0x000f;
    L_0x030a:
        r6 = 1;
        r7 = r5;
        r5 = r3;
        r14 = r2;
        r2 = r6;
        r6 = r4;
        r4 = r14;
        goto L_0x000c;
    L_0x0313:
        r2 = new com.badlogic.gdx.utils.SerializationException;
        r4 = new java.lang.StringBuilder;
        r5 = "Error parsing XML on line ";
        r4.<init>(r5);
        r1 = r4.append(r1);
        r4 = " near: ";
        r1 = r1.append(r4);
        r4 = new java.lang.String;
        r5 = 32;
        r6 = r18 - r3;
        r5 = java.lang.Math.min(r5, r6);
        r0 = r17;
        r4.<init>(r0, r3, r5);
        r1 = r1.append(r4);
        r1 = r1.toString();
        r2.<init>(r1);
        throw r2;
    L_0x0341:
        r0 = r16;
        r1 = r0.f3042a;
        r1 = r1.f3001b;
        if (r1 == 0) goto L_0x0371;
    L_0x0349:
        r0 = r16;
        r1 = r0.f3042a;
        r1 = r1.m2299b();
        r1 = (com.badlogic.gdx.utils.ah.C0680a) r1;
        r0 = r16;
        r2 = r0.f3042a;
        r2.mo530d();
        r2 = new com.badlogic.gdx.utils.SerializationException;
        r3 = new java.lang.StringBuilder;
        r4 = "Error parsing XML, unclosed element: ";
        r3.<init>(r4);
        r1 = r1.f3028a;
        r1 = r3.append(r1);
        r1 = r1.toString();
        r2.<init>(r1);
        throw r2;
    L_0x0371:
        r0 = r16;
        r1 = r0.f3043b;
        r2 = 0;
        r0 = r16;
        r0.f3043b = r2;
        return r1;
    L_0x037b:
        r3 = r4;
        goto L_0x0235;
    L_0x037e:
        r4 = r5;
        goto L_0x026c;
    L_0x0381:
        r3 = r9;
        goto L_0x022a;
    L_0x0384:
        r2 = r4;
        r3 = r5;
        r4 = r6;
        r5 = r7;
        goto L_0x02f9;
    L_0x038a:
        r14 = r2;
        r2 = r1;
        r1 = r14;
        goto L_0x013e;
    L_0x038f:
        r3 = r7;
        r4 = r2;
        r5 = r8;
        r2 = r6;
        goto L_0x02f9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.ah.a(char[], int):com.badlogic.gdx.utils.ah$a");
    }

    /* renamed from: a */
    private void m2366a() {
        this.f3043b = (C0680a) this.f3042a.mo523a();
        this.f3044c = this.f3042a.f3001b > 0 ? (C0680a) this.f3042a.m2299b() : null;
    }

    /* renamed from: b */
    private void m2367b(String str) {
        String str2 = this.f3044c.f3031d;
        C0680a c0680a = this.f3044c;
        if (str2 != null) {
            str = str2 + str;
        }
        c0680a.f3031d = str;
    }

    /* renamed from: a */
    public final C0680a m2368a(C0316a c0316a) {
        try {
            return m2364a(c0316a.m891c("UTF-8"));
        } catch (Throwable e) {
            throw new SerializationException("Error parsing file: " + c0316a, e);
        }
    }

    /* renamed from: a */
    public final C0680a m2369a(String str) {
        char[] toCharArray = str.toCharArray();
        return m2365a(toCharArray, toCharArray.length);
    }
}
