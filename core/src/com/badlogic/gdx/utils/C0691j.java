package com.badlogic.gdx.utils;

import com.badlogic.gdx.p016c.C0316a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;

/* renamed from: com.badlogic.gdx.utils.j */
public class C0691j {
    /* renamed from: b */
    private static final Locale f3083b = new Locale("", "", "");
    /* renamed from: c */
    private static boolean f3084c = false;
    /* renamed from: d */
    private static boolean f3085d = true;
    /* renamed from: a */
    public Locale f3086a;
    /* renamed from: e */
    private C0691j f3087e;
    /* renamed from: f */
    private C0710q<String, String> f3088f;
    /* renamed from: g */
    private ad f3089g;

    /* renamed from: a */
    private static C0691j m2410a(C0316a c0316a, String str, List<Locale> list, int i, C0691j c0691j) {
        Locale locale = (Locale) list.get(i);
        C0691j c0691j2 = null;
        if (i != list.size() - 1) {
            c0691j2 = C0691j.m2410a(c0316a, str, list, i + 1, c0691j);
        } else if (c0691j != null && locale.equals(f3083b)) {
            return c0691j;
        }
        c0691j = C0691j.m2411a(c0316a, str, locale);
        if (c0691j == null) {
            return c0691j2;
        }
        c0691j.f3087e = c0691j2;
        return c0691j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static C0691j m2411a(C0316a r18, String r19, Locale r20) {
        /*
        r2 = 0;
        r1 = 0;
        r3 = new com.badlogic.gdx.utils.ac;	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r0 = r18;
        r4 = r0.f1119a;	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r4 = r4.getName();	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r3.<init>(r4);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r4 = f3083b;	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r0 = r20;
        r4 = r0.equals(r4);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        if (r4 != 0) goto L_0x0057;
    L_0x0019:
        r4 = r20.getLanguage();	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r5 = r20.getCountry();	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r6 = r20.getVariant();	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r7 = "";
        r7 = r7.equals(r4);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r8 = "";
        r8 = r8.equals(r5);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r9 = "";
        r9 = r9.equals(r6);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        if (r7 == 0) goto L_0x003d;
    L_0x0039:
        if (r8 == 0) goto L_0x003d;
    L_0x003b:
        if (r9 != 0) goto L_0x0057;
    L_0x003d:
        r7 = 95;
        r3.m2322a(r7);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        if (r9 != 0) goto L_0x0096;
    L_0x0044:
        r3.m2324a(r4);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r4 = 95;
        r3.m2322a(r4);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r3.m2324a(r5);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r4 = 95;
        r3.m2322a(r4);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r3.m2324a(r6);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
    L_0x0057:
        r4 = ".properties";
        r3.m2324a(r4);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r3 = r3.toString();	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r0 = r18;
        r3 = r0.mo267b(r3);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r4 = com.badlogic.gdx.utils.C0691j.m2414a(r3);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        if (r4 == 0) goto L_0x0247;
    L_0x006c:
        r4 = new com.badlogic.gdx.utils.j;	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r4.<init>();	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r0 = r19;
        r3 = r3.m891c(r0);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r1 = new com.badlogic.gdx.utils.q;	 Catch:{ IOException -> 0x008a }
        r1.<init>();	 Catch:{ IOException -> 0x008a }
        r4.f3088f = r1;	 Catch:{ IOException -> 0x008a }
        r12 = r4.f3088f;	 Catch:{ IOException -> 0x008a }
        if (r12 != 0) goto L_0x00b0;
    L_0x0082:
        r1 = new java.lang.NullPointerException;	 Catch:{ IOException -> 0x008a }
        r2 = "ObjectMap cannot be null";
        r1.<init>(r2);	 Catch:{ IOException -> 0x008a }
        throw r1;	 Catch:{ IOException -> 0x008a }
    L_0x008a:
        r1 = move-exception;
    L_0x008b:
        r2 = new com.badlogic.gdx.utils.GdxRuntimeException;	 Catch:{ all -> 0x0091 }
        r2.<init>(r1);	 Catch:{ all -> 0x0091 }
        throw r2;	 Catch:{ all -> 0x0091 }
    L_0x0091:
        r1 = move-exception;
    L_0x0092:
        com.badlogic.gdx.utils.ab.m2310a(r3);
        throw r1;
    L_0x0096:
        if (r8 != 0) goto L_0x00a8;
    L_0x0098:
        r3.m2324a(r4);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r4 = 95;
        r3.m2322a(r4);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        r3.m2324a(r5);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        goto L_0x0057;
    L_0x00a4:
        r2 = move-exception;
        r3 = r1;
        r1 = r2;
        goto L_0x008b;
    L_0x00a8:
        r3.m2324a(r4);	 Catch:{ IOException -> 0x00a4, all -> 0x00ac }
        goto L_0x0057;
    L_0x00ac:
        r2 = move-exception;
        r3 = r1;
        r1 = r2;
        goto L_0x0092;
    L_0x00b0:
        r6 = 0;
        r8 = 0;
        r7 = 0;
        r1 = 40;
        r2 = new char[r1];	 Catch:{ IOException -> 0x008a }
        r9 = 0;
        r5 = -1;
        r1 = 1;
        r13 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x008a }
        r13.<init>(r3);	 Catch:{ IOException -> 0x008a }
        r10 = r1;
        r1 = r5;
        r16 = r7;
        r7 = r6;
        r6 = r16;
        r17 = r2;
        r2 = r9;
        r9 = r17;
    L_0x00cb:
        r5 = r13.read();	 Catch:{ IOException -> 0x008a }
        r11 = -1;
        if (r5 == r11) goto L_0x0207;
    L_0x00d2:
        r5 = (char) r5;	 Catch:{ IOException -> 0x008a }
        r11 = r9.length;	 Catch:{ IOException -> 0x008a }
        if (r2 != r11) goto L_0x0282;
    L_0x00d6:
        r11 = r9.length;	 Catch:{ IOException -> 0x008a }
        r11 = r11 * 2;
        r11 = new char[r11];	 Catch:{ IOException -> 0x008a }
        r14 = 0;
        r15 = 0;
        java.lang.System.arraycopy(r9, r14, r11, r15, r2);	 Catch:{ IOException -> 0x008a }
    L_0x00e0:
        r9 = 2;
        if (r7 != r9) goto L_0x027b;
    L_0x00e3:
        r9 = 16;
        r9 = java.lang.Character.digit(r5, r9);	 Catch:{ IOException -> 0x008a }
        if (r9 < 0) goto L_0x00f5;
    L_0x00eb:
        r8 = r8 << 4;
        r8 = r8 + r9;
        r6 = r6 + 1;
        r9 = 4;
        if (r6 >= r9) goto L_0x0100;
    L_0x00f3:
        r9 = r11;
        goto L_0x00cb;
    L_0x00f5:
        r7 = 4;
        if (r6 > r7) goto L_0x0100;
    L_0x00f8:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x008a }
        r2 = "Invalid Unicode sequence: illegal character";
        r1.<init>(r2);	 Catch:{ IOException -> 0x008a }
        throw r1;	 Catch:{ IOException -> 0x008a }
    L_0x0100:
        r7 = 0;
        r9 = r2 + 1;
        r14 = (char) r8;	 Catch:{ IOException -> 0x008a }
        r11[r2] = r14;	 Catch:{ IOException -> 0x008a }
        r2 = 10;
        if (r5 != r2) goto L_0x0277;
    L_0x010a:
        r2 = r9;
        r16 = r7;
        r7 = r6;
        r6 = r16;
    L_0x0110:
        r9 = 1;
        if (r6 != r9) goto L_0x0170;
    L_0x0113:
        r6 = 0;
        switch(r5) {
            case 10: goto L_0x0135;
            case 13: goto L_0x012d;
            case 98: goto L_0x013d;
            case 102: goto L_0x0145;
            case 110: goto L_0x014d;
            case 114: goto L_0x0155;
            case 116: goto L_0x015d;
            case 117: goto L_0x0165;
            default: goto L_0x0117;
        };	 Catch:{ IOException -> 0x008a }
    L_0x0117:
        r16 = r5;
        r5 = r6;
        r6 = r16;
    L_0x011c:
        r9 = 0;
        r10 = 4;
        if (r5 != r10) goto L_0x0261;
    L_0x0120:
        r1 = 0;
        r5 = r2;
    L_0x0122:
        r10 = r2 + 1;
        r11[r2] = r6;	 Catch:{ IOException -> 0x008a }
        r6 = r7;
        r2 = r10;
        r10 = r9;
        r7 = r1;
        r1 = r5;
        r9 = r11;
        goto L_0x00cb;
    L_0x012d:
        r6 = 3;
        r9 = r11;
        r16 = r7;
        r7 = r6;
        r6 = r16;
        goto L_0x00cb;
    L_0x0135:
        r6 = 5;
        r9 = r11;
        r16 = r7;
        r7 = r6;
        r6 = r16;
        goto L_0x00cb;
    L_0x013d:
        r5 = 8;
        r16 = r5;
        r5 = r6;
        r6 = r16;
        goto L_0x011c;
    L_0x0145:
        r5 = 12;
        r16 = r5;
        r5 = r6;
        r6 = r16;
        goto L_0x011c;
    L_0x014d:
        r5 = 10;
        r16 = r5;
        r5 = r6;
        r6 = r16;
        goto L_0x011c;
    L_0x0155:
        r5 = 13;
        r16 = r5;
        r5 = r6;
        r6 = r16;
        goto L_0x011c;
    L_0x015d:
        r5 = 9;
        r16 = r5;
        r5 = r6;
        r6 = r16;
        goto L_0x011c;
    L_0x0165:
        r6 = 2;
        r7 = 0;
        r9 = r11;
        r8 = r7;
        r16 = r6;
        r6 = r7;
        r7 = r16;
        goto L_0x00cb;
    L_0x0170:
        switch(r5) {
            case 10: goto L_0x01aa;
            case 13: goto L_0x01b6;
            case 33: goto L_0x0190;
            case 35: goto L_0x0190;
            case 58: goto L_0x01ec;
            case 61: goto L_0x01ec;
            case 92: goto L_0x01df;
            default: goto L_0x0173;
        };	 Catch:{ IOException -> 0x008a }
    L_0x0173:
        r9 = java.lang.Character.isSpace(r5);	 Catch:{ IOException -> 0x008a }
        if (r9 == 0) goto L_0x01f9;
    L_0x0179:
        r9 = 3;
        if (r6 != r9) goto L_0x017d;
    L_0x017c:
        r6 = 5;
    L_0x017d:
        if (r2 == 0) goto L_0x026f;
    L_0x017f:
        if (r2 == r1) goto L_0x026f;
    L_0x0181:
        r9 = 5;
        if (r6 == r9) goto L_0x026f;
    L_0x0184:
        r9 = -1;
        if (r1 != r9) goto L_0x01f9;
    L_0x0187:
        r6 = 4;
        r9 = r11;
        r16 = r7;
        r7 = r6;
        r6 = r16;
        goto L_0x00cb;
    L_0x0190:
        if (r10 == 0) goto L_0x0173;
    L_0x0192:
        r5 = r13.read();	 Catch:{ IOException -> 0x008a }
        r9 = -1;
        if (r5 == r9) goto L_0x026f;
    L_0x0199:
        r5 = (char) r5;	 Catch:{ IOException -> 0x008a }
        r9 = 13;
        if (r5 == r9) goto L_0x026f;
    L_0x019e:
        r9 = 10;
        if (r5 != r9) goto L_0x0192;
    L_0x01a2:
        r9 = r11;
        r16 = r7;
        r7 = r6;
        r6 = r16;
        goto L_0x00cb;
    L_0x01aa:
        r5 = 3;
        if (r6 != r5) goto L_0x01b6;
    L_0x01ad:
        r6 = 5;
        r9 = r11;
        r16 = r7;
        r7 = r6;
        r6 = r16;
        goto L_0x00cb;
    L_0x01b6:
        r6 = 0;
        r5 = 1;
        if (r2 > 0) goto L_0x01be;
    L_0x01ba:
        if (r2 != 0) goto L_0x01d4;
    L_0x01bc:
        if (r1 != 0) goto L_0x01d4;
    L_0x01be:
        r9 = -1;
        if (r1 != r9) goto L_0x01c2;
    L_0x01c1:
        r1 = r2;
    L_0x01c2:
        r9 = new java.lang.String;	 Catch:{ IOException -> 0x008a }
        r10 = 0;
        r9.<init>(r11, r10, r2);	 Catch:{ IOException -> 0x008a }
        r2 = 0;
        r2 = r9.substring(r2, r1);	 Catch:{ IOException -> 0x008a }
        r1 = r9.substring(r1);	 Catch:{ IOException -> 0x008a }
        r12.mo542a(r2, r1);	 Catch:{ IOException -> 0x008a }
    L_0x01d4:
        r1 = -1;
        r2 = 0;
        r10 = r5;
        r9 = r11;
        r16 = r7;
        r7 = r6;
        r6 = r16;
        goto L_0x00cb;
    L_0x01df:
        r5 = 4;
        if (r6 != r5) goto L_0x01e3;
    L_0x01e2:
        r1 = r2;
    L_0x01e3:
        r6 = 1;
        r9 = r11;
        r16 = r7;
        r7 = r6;
        r6 = r16;
        goto L_0x00cb;
    L_0x01ec:
        r9 = -1;
        if (r1 != r9) goto L_0x0173;
    L_0x01ef:
        r6 = 0;
        r9 = r11;
        r1 = r2;
        r16 = r6;
        r6 = r7;
        r7 = r16;
        goto L_0x00cb;
    L_0x01f9:
        r9 = 5;
        if (r6 == r9) goto L_0x01ff;
    L_0x01fc:
        r9 = 3;
        if (r6 != r9) goto L_0x0268;
    L_0x01ff:
        r6 = 0;
        r16 = r5;
        r5 = r6;
        r6 = r16;
        goto L_0x011c;
    L_0x0207:
        r5 = 2;
        if (r7 != r5) goto L_0x0215;
    L_0x020a:
        r5 = 4;
        if (r6 > r5) goto L_0x0215;
    L_0x020d:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x008a }
        r2 = "Invalid Unicode sequence: expected format \\uxxxx";
        r1.<init>(r2);	 Catch:{ IOException -> 0x008a }
        throw r1;	 Catch:{ IOException -> 0x008a }
    L_0x0215:
        r5 = -1;
        if (r1 != r5) goto L_0x021b;
    L_0x0218:
        if (r2 <= 0) goto L_0x021b;
    L_0x021a:
        r1 = r2;
    L_0x021b:
        if (r1 < 0) goto L_0x0245;
    L_0x021d:
        r5 = new java.lang.String;	 Catch:{ IOException -> 0x008a }
        r6 = 0;
        r5.<init>(r9, r6, r2);	 Catch:{ IOException -> 0x008a }
        r2 = 0;
        r2 = r5.substring(r2, r1);	 Catch:{ IOException -> 0x008a }
        r1 = r5.substring(r1);	 Catch:{ IOException -> 0x008a }
        r5 = 1;
        if (r7 != r5) goto L_0x0242;
    L_0x022f:
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x008a }
        r5.<init>();	 Catch:{ IOException -> 0x008a }
        r1 = r5.append(r1);	 Catch:{ IOException -> 0x008a }
        r5 = "\u0000";
        r1 = r1.append(r5);	 Catch:{ IOException -> 0x008a }
        r1 = r1.toString();	 Catch:{ IOException -> 0x008a }
    L_0x0242:
        r12.mo542a(r2, r1);	 Catch:{ IOException -> 0x008a }
    L_0x0245:
        r1 = r3;
        r2 = r4;
    L_0x0247:
        com.badlogic.gdx.utils.ab.m2310a(r1);
        if (r2 == 0) goto L_0x025e;
    L_0x024c:
        r0 = r20;
        r2.f3086a = r0;
        r3 = new com.badlogic.gdx.utils.ad;
        r1 = f3084c;
        if (r1 != 0) goto L_0x025f;
    L_0x0256:
        r1 = 1;
    L_0x0257:
        r0 = r20;
        r3.<init>(r0, r1);
        r2.f3089g = r3;
    L_0x025e:
        return r2;
    L_0x025f:
        r1 = 0;
        goto L_0x0257;
    L_0x0261:
        r16 = r5;
        r5 = r1;
        r1 = r16;
        goto L_0x0122;
    L_0x0268:
        r16 = r5;
        r5 = r6;
        r6 = r16;
        goto L_0x011c;
    L_0x026f:
        r9 = r11;
        r16 = r7;
        r7 = r6;
        r6 = r16;
        goto L_0x00cb;
    L_0x0277:
        r2 = r9;
        r9 = r11;
        goto L_0x00cb;
    L_0x027b:
        r16 = r6;
        r6 = r7;
        r7 = r16;
        goto L_0x0110;
    L_0x0282:
        r11 = r9;
        goto L_0x00e0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.j.a(com.badlogic.gdx.c.a, java.lang.String, java.util.Locale):com.badlogic.gdx.utils.j");
    }

    /* renamed from: a */
    public static C0691j m2412a(C0316a c0316a, Locale locale) {
        return C0691j.m2415b(c0316a, locale, "UTF-8");
    }

    /* renamed from: a */
    public static C0691j m2413a(C0316a c0316a, Locale locale, String str) {
        return C0691j.m2415b(c0316a, locale, str);
    }

    /* renamed from: a */
    private static boolean m2414a(C0316a c0316a) {
        try {
            c0316a.mo268b().close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: b */
    private static C0691j m2415b(C0316a c0316a, Locale locale, String str) {
        if (c0316a == null || locale == null || str == null) {
            throw new NullPointerException();
        }
        Locale locale2 = locale;
        C0691j c0691j = null;
        do {
            Locale locale3;
            String language = locale2.getLanguage();
            String country = locale2.getCountry();
            String variant = locale2.getVariant();
            List arrayList = new ArrayList(4);
            if (variant.length() > 0) {
                arrayList.add(locale2);
            }
            if (country.length() > 0) {
                arrayList.add(arrayList.size() == 0 ? locale2 : new Locale(language, country));
            }
            if (language.length() > 0) {
                arrayList.add(arrayList.size() == 0 ? locale2 : new Locale(language));
            }
            arrayList.add(f3083b);
            C0691j a = C0691j.m2410a(c0316a, str, arrayList, 0, c0691j);
            if (a != null) {
                locale3 = a.f3086a;
                boolean equals = locale3.equals(f3083b);
                if (!equals || locale3.equals(locale) || (arrayList.size() == 1 && locale3.equals(arrayList.get(0)))) {
                    if (a == null) {
                        return a;
                    }
                    if (c0691j == null) {
                        return c0691j;
                    }
                    throw new MissingResourceException("Can't find bundle for base file handle " + c0316a.m896h() + ", locale " + locale, c0316a + "_" + locale, "");
                } else if (equals && c0691j == null) {
                    c0691j = a;
                }
            }
            locale3 = Locale.getDefault();
            if (locale2.equals(locale3)) {
                locale2 = null;
                continue;
            } else {
                locale2 = locale3;
                continue;
            }
        } while (locale2 != null);
        if (a == null) {
            return a;
        }
        if (c0691j == null) {
            return c0691j;
        }
        throw new MissingResourceException("Can't find bundle for base file handle " + c0316a.m896h() + ", locale " + locale, c0316a + "_" + locale, "");
    }

    /* renamed from: a */
    public final String m2416a(String str) {
        String str2 = (String) this.f3088f.m2467a((Object) str);
        if (str2 != null) {
            return str2;
        }
        if (this.f3087e != null) {
            str2 = this.f3087e.m2416a(str);
        }
        if (str2 != null) {
            return str2;
        }
        if (!f3085d) {
            return "???" + str + "???";
        }
        throw new MissingResourceException("Can't find bundle key " + str, getClass().getName(), str);
    }
}
