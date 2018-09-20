package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.C0431c;
import com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData;
import com.badlogic.gdx.graphics.g2d.BitmapFont.C0446b;
import com.badlogic.gdx.utils.C0328t;
import com.badlogic.gdx.utils.C0328t.C0449a;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0689h;
import com.badlogic.gdx.utils.C0721u;

/* renamed from: com.badlogic.gdx.graphics.g2d.d */
public class C0451d implements C0449a {
    /* renamed from: a */
    public final C0676a<C0450a> f1848a = new C0676a();
    /* renamed from: b */
    public float f1849b;
    /* renamed from: c */
    public float f1850c;
    /* renamed from: d */
    private final C0676a<C0430b> f1851d = new C0676a(4);

    /* renamed from: com.badlogic.gdx.graphics.g2d.d$a */
    public static class C0450a implements C0449a {
        /* renamed from: a */
        public C0676a<C0446b> f1842a = new C0676a();
        /* renamed from: b */
        public C0689h f1843b = new C0689h();
        /* renamed from: c */
        public float f1844c;
        /* renamed from: d */
        public float f1845d;
        /* renamed from: e */
        public float f1846e;
        /* renamed from: f */
        public final C0430b f1847f = new C0430b();

        /* renamed from: a */
        public final void mo360a() {
            this.f1842a.mo530d();
            this.f1843b.f3079b = 0;
            this.f1846e = 0.0f;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(this.f1842a.f3001b);
            C0676a c0676a = this.f1842a;
            int i = c0676a.f3001b;
            for (int i2 = 0; i2 < i; i2++) {
                stringBuilder.append((char) ((C0446b) c0676a.m2291a(i2)).f1806a);
            }
            stringBuilder.append(", #");
            stringBuilder.append(this.f1847f);
            stringBuilder.append(", ");
            stringBuilder.append(this.f1844c);
            stringBuilder.append(", ");
            stringBuilder.append(this.f1845d);
            stringBuilder.append(", ");
            stringBuilder.append(this.f1846e);
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    private static void m1344a(BitmapFontData bitmapFontData, C0450a c0450a) {
        C0446b c0446b = (C0446b) c0450a.f1842a.m2299b();
        if (!BitmapFontData.m1322b((char) c0446b.f1806a)) {
            float f = (((float) (c0446b.f1809d + c0446b.f1815j)) * bitmapFontData.f1796n) - bitmapFontData.f1787e;
            float f2 = c0450a.f1846e;
            C0689h c0689h = c0450a.f1843b;
            c0450a.f1846e = f2 + (f - c0689h.f3078a[c0689h.f3079b - 1]);
            c0450a.f1843b.m2406a(c0450a.f1843b.f3079b - 1, f);
        }
    }

    /* renamed from: a */
    public final void mo360a() {
        C0721u.m2511a(C0450a.class).m963a(this.f1848a);
        this.f1848a.mo530d();
        this.f1849b = 0.0f;
        this.f1850c = 0.0f;
    }

    /* renamed from: a */
    public final void m1346a(BitmapFont bitmapFont, CharSequence charSequence, int i, int i2, C0430b c0430b, float f, int i3, boolean z, String str) {
        if (str != null) {
            z = true;
        } else if (f <= bitmapFont.f1821a.f1801s) {
            z = false;
        }
        BitmapFontData bitmapFontData = bitmapFont.f1821a;
        boolean z2 = bitmapFontData.f1798p;
        C0328t a = C0721u.m2511a(C0450a.class);
        C0676a c0676a = this.f1848a;
        a.m963a(c0676a);
        c0676a.mo530d();
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        C0676a c0676a2 = this.f1851d;
        c0676a2.m2296a((Object) c0430b);
        C0328t a2 = C0721u.m2511a(C0430b.class);
        int i6 = 0;
        C0430b c0430b2 = c0430b;
        C0430b c0430b3 = c0430b;
        int i7 = i;
        while (true) {
            int i8;
            int i9;
            int i10;
            Object obj;
            Object obj2;
            float f5;
            float f6;
            int i11;
            int i12;
            C0450a c0450a;
            float f7;
            float f8;
            float f9;
            float max;
            C0430b c0430b4;
            boolean z3 = false;
            if (i7 != i2) {
                int i13 = i7 + 1;
                switch (charSequence.charAt(i7)) {
                    case '\n':
                        i8 = i13 - 1;
                        i7 = i13;
                        i13 = 1;
                        break;
                    case '[':
                        if (z2) {
                            if (i13 != i2) {
                                switch (charSequence.charAt(i13)) {
                                    case '#':
                                        i7 = i13 + 1;
                                        i9 = 0;
                                        while (i7 < i2) {
                                            char charAt = charSequence.charAt(i7);
                                            if (charAt == ']') {
                                                if (i7 >= i13 + 2 && i7 <= i13 + 9) {
                                                    if (i7 - i13 <= 7) {
                                                        i10 = i9;
                                                        for (i9 = 0; i9 < 9 - (i7 - i13); i9++) {
                                                            i10 <<= 4;
                                                        }
                                                        i10 |= 255;
                                                    } else {
                                                        i10 = i9;
                                                    }
                                                    C0430b c0430b5 = (C0430b) a2.m965b();
                                                    this.f1851d.m2296a((Object) c0430b5);
                                                    C0430b.m1211a(c0430b5, i10);
                                                    i9 = i7 - i13;
                                                    break;
                                                }
                                            }
                                            if (charAt >= '0' && charAt <= '9') {
                                                i9 = (i9 * 16) + (charAt - 48);
                                            } else if (charAt >= 'a' && charAt <= 'f') {
                                                i9 = (i9 * 16) + (charAt - 87);
                                            } else if (charAt >= 'A' && charAt <= 'F') {
                                                i9 = (i9 * 16) + (charAt - 55);
                                            }
                                            i7++;
                                            i9 = -1;
                                            break;
                                        }
                                        i9 = -1;
                                        break;
                                    case '[':
                                        i9 = -2;
                                        break;
                                    case ']':
                                        if (this.f1851d.f3001b > 1) {
                                            a2.mo363a(this.f1851d.mo523a());
                                        }
                                        i9 = 0;
                                        break;
                                    default:
                                        for (i10 = i13 + 1; i10 < i2; i10++) {
                                            if (charSequence.charAt(i10) == ']') {
                                                C0430b a3 = C0431c.m1223a(charSequence.subSequence(i13, i10).toString());
                                                if (a3 != null) {
                                                    Object obj3 = (C0430b) a2.m965b();
                                                    this.f1851d.m2296a(obj3);
                                                    obj3.m1218a(a3);
                                                    i9 = i10 - i13;
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                }
                            }
                            i9 = -1;
                            if (i9 >= 0) {
                                i10 = i13 - 1;
                                i7 = i13 + (i9 + 1);
                                z3 = true;
                                obj = null;
                                c0430b2 = (C0430b) c0676a2.m2299b();
                                i8 = i10;
                                break;
                            } else if (i9 == -2) {
                                i7 = i13 + 1;
                                continue;
                            }
                        }
                        break;
                }
                i7 = i13;
                obj = null;
                i8 = -1;
            } else if (i6 != i2) {
                obj = null;
                i8 = i2;
            } else {
                f2 = Math.max(f4, f2);
                i10 = c0676a2.f3001b;
                for (i9 = 1; i9 < i10; i9++) {
                    a2.mo363a(c0676a2.m2291a(i9));
                }
                c0676a2.mo530d();
                if ((i3 & 8) == 0) {
                    obj2 = (i3 & 1) != 0 ? 1 : null;
                    f5 = 0.0f;
                    f6 = -2.14748365E9f;
                    i10 = 0;
                    i11 = c0676a.f3001b;
                    for (i12 = 0; i12 < i11; i12++) {
                        c0450a = (C0450a) c0676a.m2291a(i12);
                        if (c0450a.f1845d == f6) {
                            f6 = c0450a.f1845d;
                            f5 = f - f5;
                            if (obj2 != null) {
                                f5 /= 2.0f;
                            }
                            while (i10 < i12) {
                                int i14 = i10 + 1;
                                C0450a c0450a2 = (C0450a) c0676a.m2291a(i10);
                                c0450a2.f1844c += f5;
                                i10 = i14;
                            }
                            f5 = 0.0f;
                        }
                        f5 += c0450a.f1846e;
                    }
                    f7 = f - f5;
                    if (obj2 != null) {
                        f8 = f7 / 2.0f;
                        i9 = i10;
                        f9 = f8;
                    } else {
                        f8 = f7;
                        i9 = i10;
                        f9 = f8;
                    }
                    while (i9 < i11) {
                        i6 = i9 + 1;
                        c0450a = (C0450a) c0676a.m2291a(i9);
                        c0450a.f1844c += f9;
                        i9 = i6;
                    }
                }
                this.f1849b = f2;
                this.f1850c = (bitmapFontData.f1795m * (((float) i5) * bitmapFontData.f1790h)) + (bitmapFontData.f1791i + (((float) i4) * bitmapFontData.f1790h));
                return;
            }
            if (i8 != -1) {
                int i15;
                if (i8 != i6) {
                    c0450a = (C0450a) a.m965b();
                    c0450a.f1847f.m1218a(c0430b3);
                    c0450a.f1844c = f2;
                    c0450a.f1845d = f3;
                    bitmapFontData.mo362a(c0450a, charSequence, i6, i8, z3);
                    if (c0450a.f1842a.f3001b == 0) {
                        a.mo363a((Object) c0450a);
                        i15 = i4;
                        f7 = f4;
                        f9 = f2;
                        f4 = f3;
                    } else {
                        c0676a.m2296a((Object) c0450a);
                        float[] fArr = c0450a.f1843b.f3078a;
                        i15 = 0;
                        i10 = c0450a.f1843b.f3079b;
                        C0450a c0450a3 = c0450a;
                        f7 = f2;
                        f2 = f3;
                        f3 = f4;
                        i14 = i4;
                        Object obj4 = c0450a3;
                        while (i15 < i10) {
                            float[] fArr2;
                            int i16;
                            float f10 = fArr[i15];
                            float f11 = f7 + f10;
                            if (z && f11 > f && i15 > 1) {
                                if (((((float) (((C0446b) obj4.f1842a.m2291a(i15 - 1)).f1809d + ((C0446b) obj4.f1842a.m2291a(i15 - 1)).f1815j)) * bitmapFontData.f1796n) + (f11 - f10)) - 1.0E-4f > f) {
                                    if (str != null) {
                                        C0689h c0689h;
                                        C0689h c0689h2;
                                        obj3 = (C0450a) a.m965b();
                                        bitmapFontData.mo362a(obj3, str, 0, str.length(), true);
                                        i10 = 1;
                                        f6 = 0.0f;
                                        while (i10 < obj3.f1843b.f3079b) {
                                            i10++;
                                            f6 = obj3.f1843b.m2404a(i10) + f6;
                                        }
                                        f5 = f - f6;
                                        float f12 = obj4.f1844c;
                                        for (i10 = 0; i10 < obj4.f1843b.f3079b; i10++) {
                                            f2 = obj4.f1843b.m2404a(i10);
                                            f12 += f2;
                                            if (f12 > f5) {
                                                obj4.f1846e = (f12 - obj4.f1844c) - f2;
                                                if (i10 <= 1) {
                                                    obj4.f1842a.mo531e(i10 - 1);
                                                    c0689h = obj4.f1843b;
                                                    if (c0689h.f3079b > i10) {
                                                        c0689h.f3079b = i10;
                                                    }
                                                    C0451d.m1344a(bitmapFontData, obj4);
                                                    if (obj3.f1843b.f3079b > 0) {
                                                        obj4.f1843b.m2407a(obj3.f1843b, 1, obj3.f1843b.f3079b - 1);
                                                    }
                                                } else {
                                                    obj4.f1842a.mo530d();
                                                    obj4.f1843b.f3079b = 0;
                                                    c0689h2 = obj4.f1843b;
                                                    c0689h = obj3.f1843b;
                                                    c0689h2.m2407a(c0689h, 0, c0689h.f3079b);
                                                    if (obj3.f1843b.f3079b > 0) {
                                                        obj4.f1846e += obj3.f1843b.m2404a(0);
                                                    }
                                                }
                                                obj4.f1842a.m2294a(obj3.f1842a);
                                                obj4.f1846e += f6;
                                                a.mo363a(obj3);
                                                f2 = obj4.f1844c + obj4.f1846e;
                                                i4 = i14;
                                                f4 = f3;
                                                f2 = Math.max(f4, f2);
                                                i10 = c0676a2.f3001b;
                                                for (i9 = 1; i9 < i10; i9++) {
                                                    a2.mo363a(c0676a2.m2291a(i9));
                                                }
                                                c0676a2.mo530d();
                                                if ((i3 & 8) == 0) {
                                                    if ((i3 & 1) != 0) {
                                                    }
                                                    f5 = 0.0f;
                                                    f6 = -2.14748365E9f;
                                                    i10 = 0;
                                                    i11 = c0676a.f3001b;
                                                    for (i12 = 0; i12 < i11; i12++) {
                                                        c0450a = (C0450a) c0676a.m2291a(i12);
                                                        if (c0450a.f1845d == f6) {
                                                            f6 = c0450a.f1845d;
                                                            f5 = f - f5;
                                                            if (obj2 != null) {
                                                                f5 /= 2.0f;
                                                            }
                                                            while (i10 < i12) {
                                                                int i142 = i10 + 1;
                                                                C0450a c0450a22 = (C0450a) c0676a.m2291a(i10);
                                                                c0450a22.f1844c += f5;
                                                                i10 = i142;
                                                            }
                                                            f5 = 0.0f;
                                                        }
                                                        f5 += c0450a.f1846e;
                                                    }
                                                    f7 = f - f5;
                                                    if (obj2 != null) {
                                                        f8 = f7;
                                                        i9 = i10;
                                                        f9 = f8;
                                                    } else {
                                                        f8 = f7 / 2.0f;
                                                        i9 = i10;
                                                        f9 = f8;
                                                    }
                                                    while (i9 < i11) {
                                                        i6 = i9 + 1;
                                                        c0450a = (C0450a) c0676a.m2291a(i9);
                                                        c0450a.f1844c += f9;
                                                        i9 = i6;
                                                    }
                                                }
                                                this.f1849b = f2;
                                                this.f1850c = (bitmapFontData.f1795m * (((float) i5) * bitmapFontData.f1790h)) + (bitmapFontData.f1791i + (((float) i4) * bitmapFontData.f1790h));
                                                return;
                                            }
                                        }
                                        if (i10 <= 1) {
                                            obj4.f1842a.mo530d();
                                            obj4.f1843b.f3079b = 0;
                                            c0689h2 = obj4.f1843b;
                                            c0689h = obj3.f1843b;
                                            c0689h2.m2407a(c0689h, 0, c0689h.f3079b);
                                            if (obj3.f1843b.f3079b > 0) {
                                                obj4.f1846e += obj3.f1843b.m2404a(0);
                                            }
                                        } else {
                                            obj4.f1842a.mo531e(i10 - 1);
                                            c0689h = obj4.f1843b;
                                            if (c0689h.f3079b > i10) {
                                                c0689h.f3079b = i10;
                                            }
                                            C0451d.m1344a(bitmapFontData, obj4);
                                            if (obj3.f1843b.f3079b > 0) {
                                                obj4.f1843b.m2407a(obj3.f1843b, 1, obj3.f1843b.f3079b - 1);
                                            }
                                        }
                                        obj4.f1842a.m2294a(obj3.f1842a);
                                        obj4.f1846e += f6;
                                        a.mo363a(obj3);
                                        f2 = obj4.f1844c + obj4.f1846e;
                                        i4 = i142;
                                        f4 = f3;
                                        f2 = Math.max(f4, f2);
                                        i10 = c0676a2.f3001b;
                                        for (i9 = 1; i9 < i10; i9++) {
                                            a2.mo363a(c0676a2.m2291a(i9));
                                        }
                                        c0676a2.mo530d();
                                        if ((i3 & 8) == 0) {
                                            if ((i3 & 1) != 0) {
                                            }
                                            f5 = 0.0f;
                                            f6 = -2.14748365E9f;
                                            i10 = 0;
                                            i11 = c0676a.f3001b;
                                            for (i12 = 0; i12 < i11; i12++) {
                                                c0450a = (C0450a) c0676a.m2291a(i12);
                                                if (c0450a.f1845d == f6) {
                                                    f6 = c0450a.f1845d;
                                                    f5 = f - f5;
                                                    if (obj2 != null) {
                                                        f5 /= 2.0f;
                                                    }
                                                    while (i10 < i12) {
                                                        int i1422 = i10 + 1;
                                                        C0450a c0450a222 = (C0450a) c0676a.m2291a(i10);
                                                        c0450a222.f1844c += f5;
                                                        i10 = i1422;
                                                    }
                                                    f5 = 0.0f;
                                                }
                                                f5 += c0450a.f1846e;
                                            }
                                            f7 = f - f5;
                                            if (obj2 != null) {
                                                f8 = f7 / 2.0f;
                                                i9 = i10;
                                                f9 = f8;
                                            } else {
                                                f8 = f7;
                                                i9 = i10;
                                                f9 = f8;
                                            }
                                            while (i9 < i11) {
                                                i6 = i9 + 1;
                                                c0450a = (C0450a) c0676a.m2291a(i9);
                                                c0450a.f1844c += f9;
                                                i9 = i6;
                                            }
                                        }
                                        this.f1849b = f2;
                                        this.f1850c = (bitmapFontData.f1795m * (((float) i5) * bitmapFontData.f1790h)) + (bitmapFontData.f1791i + (((float) i4) * bitmapFontData.f1790h));
                                        return;
                                    }
                                    Object obj5;
                                    int i17;
                                    C0676a c0676a3;
                                    C0676a c0676a4;
                                    C0689h c0689h3;
                                    C0689h c0689h4;
                                    Object obj6;
                                    int i18;
                                    int i19;
                                    C0450a c0450a4;
                                    C0676a c0676a5 = obj4.f1842a;
                                    i10 = i15 - 1;
                                    while (i10 > 0 && BitmapFontData.m1322b((char) ((C0446b) c0676a5.m2291a(i10)).f1806a)) {
                                        i10--;
                                    }
                                    while (i10 > 0) {
                                        char c = (char) ((C0446b) c0676a5.m2291a(i10)).f1806a;
                                        if (!BitmapFontData.m1322b(c)) {
                                            if (bitmapFontData.f1803u != null) {
                                                char[] cArr = bitmapFontData.f1803u;
                                                int length = cArr.length;
                                                i9 = 0;
                                                while (i9 < length) {
                                                    if (c == cArr[i9]) {
                                                        obj3 = 1;
                                                        if (obj3 != null) {
                                                            i10--;
                                                        }
                                                    } else {
                                                        i9++;
                                                    }
                                                }
                                            }
                                            obj3 = null;
                                            if (obj3 != null) {
                                                i10--;
                                            }
                                        }
                                        i9 = i10 + 1;
                                        i11 = ((obj4.f1844c == 0.0f || i9 != 0) && i9 < obj4.f1842a.f3001b) ? i9 : i15 - 1;
                                        if (i11 != 0) {
                                            obj4.f1846e = 0.0f;
                                            f7 = Math.max(f3, obj4.f1844c);
                                            c0450a222 = obj4;
                                        } else {
                                            obj5 = (C0450a) a.m965b();
                                            obj5.f1847f.m1218a(obj4.f1847f);
                                            i17 = obj4.f1842a.f3001b;
                                            i9 = i15;
                                            while (i9 < i11) {
                                                i15 = i9 + 1;
                                                obj4.f1846e = obj4.f1843b.m2404a(i9) + obj4.f1846e;
                                                i9 = i15;
                                            }
                                            while (i9 > i11 + 1) {
                                                i9--;
                                                obj4.f1846e -= obj4.f1843b.m2404a(i9);
                                            }
                                            if (i11 < i17) {
                                                c0676a3 = obj5.f1842a;
                                                c0676a4 = obj4.f1842a;
                                                c0676a3.m2295a(c0676a4, i11);
                                                c0676a4.mo528b(0, i11 - 1);
                                                obj4.f1842a = c0676a3;
                                                obj5.f1842a = c0676a4;
                                                c0689h3 = obj5.f1843b;
                                                c0689h4 = obj4.f1843b;
                                                c0689h3.m2407a(c0689h4, 0, i11 + 1);
                                                if (i11 >= c0689h4.f3079b) {
                                                    throw new IndexOutOfBoundsException("end can't be >= size: " + i11 + " >= " + c0689h4.f3079b);
                                                } else if (i11 > 0) {
                                                    throw new IndexOutOfBoundsException("start can't be > end: 1 > " + i11);
                                                } else {
                                                    obj6 = c0689h4.f3078a;
                                                    i18 = (i11 - 1) + 1;
                                                    if (c0689h4.f3080c) {
                                                        i19 = c0689h4.f3079b - 1;
                                                        for (i9 = 0; i9 < i18; i9++) {
                                                            obj6[i9 + 1] = obj6[i19 - i9];
                                                        }
                                                    } else {
                                                        System.arraycopy(obj6, i18 + 1, obj6, 1, c0689h4.f3079b - (i18 + 1));
                                                    }
                                                    c0689h4.f3079b -= i18;
                                                    c0689h4.m2406a(0, (((float) (-((C0446b) c0676a4.m2304c()).f1815j)) * bitmapFontData.f1796n) - bitmapFontData.f1789g);
                                                    obj4.f1843b = c0689h3;
                                                    obj5.f1843b = c0689h4;
                                                }
                                            }
                                            if (i11 != 0) {
                                                a.mo363a(obj4);
                                                this.f1848a.mo523a();
                                            } else {
                                                C0451d.m1344a(bitmapFontData, obj4);
                                            }
                                            c0676a.m2296a(obj5);
                                            f7 = Math.max(f3, obj4.f1844c + obj4.f1846e);
                                        }
                                        f3 = f2 + bitmapFontData.f1794l;
                                        i1422++;
                                        c0450a222.f1844c = 0.0f;
                                        c0450a222.f1845d = f3;
                                        i15 = i1422;
                                        f4 = f7;
                                        i9 = c0450a222.f1843b.f3079b;
                                        c0450a4 = c0450a222;
                                        i10 = -1;
                                        obj4 = c0450a4;
                                        fArr2 = c0450a222.f1843b.f3078a;
                                        f2 = 0.0f;
                                        fArr = fArr2;
                                        i16 = i10 + 1;
                                        i10 = i9;
                                        f7 = f2;
                                        f2 = f3;
                                        f3 = f4;
                                        i1422 = i15;
                                        i15 = i16;
                                    }
                                    i9 = 0;
                                    if (obj4.f1844c == 0.0f) {
                                    }
                                    if (i11 != 0) {
                                        obj5 = (C0450a) a.m965b();
                                        obj5.f1847f.m1218a(obj4.f1847f);
                                        i17 = obj4.f1842a.f3001b;
                                        i9 = i15;
                                        while (i9 < i11) {
                                            i15 = i9 + 1;
                                            obj4.f1846e = obj4.f1843b.m2404a(i9) + obj4.f1846e;
                                            i9 = i15;
                                        }
                                        while (i9 > i11 + 1) {
                                            i9--;
                                            obj4.f1846e -= obj4.f1843b.m2404a(i9);
                                        }
                                        if (i11 < i17) {
                                            c0676a3 = obj5.f1842a;
                                            c0676a4 = obj4.f1842a;
                                            c0676a3.m2295a(c0676a4, i11);
                                            c0676a4.mo528b(0, i11 - 1);
                                            obj4.f1842a = c0676a3;
                                            obj5.f1842a = c0676a4;
                                            c0689h3 = obj5.f1843b;
                                            c0689h4 = obj4.f1843b;
                                            c0689h3.m2407a(c0689h4, 0, i11 + 1);
                                            if (i11 >= c0689h4.f3079b) {
                                                throw new IndexOutOfBoundsException("end can't be >= size: " + i11 + " >= " + c0689h4.f3079b);
                                            } else if (i11 > 0) {
                                                obj6 = c0689h4.f3078a;
                                                i18 = (i11 - 1) + 1;
                                                if (c0689h4.f3080c) {
                                                    i19 = c0689h4.f3079b - 1;
                                                    for (i9 = 0; i9 < i18; i9++) {
                                                        obj6[i9 + 1] = obj6[i19 - i9];
                                                    }
                                                } else {
                                                    System.arraycopy(obj6, i18 + 1, obj6, 1, c0689h4.f3079b - (i18 + 1));
                                                }
                                                c0689h4.f3079b -= i18;
                                                c0689h4.m2406a(0, (((float) (-((C0446b) c0676a4.m2304c()).f1815j)) * bitmapFontData.f1796n) - bitmapFontData.f1789g);
                                                obj4.f1843b = c0689h3;
                                                obj5.f1843b = c0689h4;
                                            } else {
                                                throw new IndexOutOfBoundsException("start can't be > end: 1 > " + i11);
                                            }
                                        }
                                        if (i11 != 0) {
                                            C0451d.m1344a(bitmapFontData, obj4);
                                        } else {
                                            a.mo363a(obj4);
                                            this.f1848a.mo523a();
                                        }
                                        c0676a.m2296a(obj5);
                                        f7 = Math.max(f3, obj4.f1844c + obj4.f1846e);
                                    } else {
                                        obj4.f1846e = 0.0f;
                                        f7 = Math.max(f3, obj4.f1844c);
                                        c0450a222 = obj4;
                                    }
                                    f3 = f2 + bitmapFontData.f1794l;
                                    i1422++;
                                    c0450a222.f1844c = 0.0f;
                                    c0450a222.f1845d = f3;
                                    i15 = i1422;
                                    f4 = f7;
                                    i9 = c0450a222.f1843b.f3079b;
                                    c0450a4 = c0450a222;
                                    i10 = -1;
                                    obj4 = c0450a4;
                                    fArr2 = c0450a222.f1843b.f3078a;
                                    f2 = 0.0f;
                                    fArr = fArr2;
                                    i16 = i10 + 1;
                                    i10 = i9;
                                    f7 = f2;
                                    f2 = f3;
                                    f3 = f4;
                                    i1422 = i15;
                                    i15 = i16;
                                }
                            }
                            obj4.f1846e += f10;
                            i9 = i10;
                            i10 = i15;
                            i15 = i1422;
                            f4 = f3;
                            f3 = f2;
                            f2 = f11;
                            fArr2 = fArr;
                            fArr = fArr2;
                            i16 = i10 + 1;
                            i10 = i9;
                            f7 = f2;
                            f2 = f3;
                            f3 = f4;
                            i1422 = i15;
                            i15 = i16;
                        }
                        i15 = i1422;
                        f9 = f7;
                        f4 = f2;
                        f7 = f3;
                    }
                } else {
                    i15 = i4;
                    f7 = f4;
                    f9 = f2;
                    f4 = f3;
                }
                if (obj != null) {
                    max = Math.max(f7, f9);
                    f7 = bitmapFontData.f1794l;
                    if (i8 == i6) {
                        f7 *= bitmapFontData.f1795m;
                        i10 = i5 + 1;
                        i6 = i15;
                    } else {
                        i6 = i15 + 1;
                        i10 = i5;
                    }
                    f6 = f7 + f4;
                    f5 = 0.0f;
                    f7 = max;
                } else {
                    i6 = i15;
                    f6 = f4;
                    f5 = f9;
                    i10 = i5;
                }
                max = f5;
                c0430b4 = c0430b2;
                f5 = f6;
                f6 = f7;
                i9 = i6;
                i6 = i7;
            } else {
                i10 = i5;
                i9 = i4;
                f6 = f4;
                f5 = f3;
                max = f2;
                c0430b4 = c0430b3;
            }
            i5 = i10;
            f3 = f5;
            f2 = max;
            c0430b3 = c0430b4;
            f4 = f6;
            i4 = i9;
        }
    }

    public String toString() {
        if (this.f1848a.f3001b == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(this.f1849b);
        stringBuilder.append('x');
        stringBuilder.append(this.f1850c);
        stringBuilder.append('\n');
        int i = this.f1848a.f3001b;
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append(((C0450a) this.f1848a.m2291a(i2)).toString());
            stringBuilder.append('\n');
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
