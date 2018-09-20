package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.C0451d.C0450a;
import com.badlogic.gdx.graphics.g2d.C0480m.C0475a;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0689h;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.ab;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.badlogic.gdx.graphics.g2d.b */
public class BitmapFont implements Disposable {
    /* renamed from: a */
    public final BitmapFontData f1821a;
    /* renamed from: b */
    C0676a<C0438n> f1822b;
    /* renamed from: c */
    public final BitmapFontCache f1823c;
    /* renamed from: d */
    public boolean f1824d;
    /* renamed from: e */
    boolean f1825e;
    /* renamed from: f */
    public boolean f1826f;

    /* renamed from: com.badlogic.gdx.graphics.g2d.b$a */
    public static class BitmapFontData {
        /* renamed from: a */
        public String[] f1783a;
        /* renamed from: b */
        public C0316a f1784b;
        /* renamed from: c */
        public boolean f1785c;
        /* renamed from: d */
        public float f1786d;
        /* renamed from: e */
        public float f1787e;
        /* renamed from: f */
        public float f1788f;
        /* renamed from: g */
        public float f1789g;
        /* renamed from: h */
        public float f1790h;
        /* renamed from: i */
        public float f1791i;
        /* renamed from: j */
        public float f1792j;
        /* renamed from: k */
        public float f1793k;
        /* renamed from: l */
        public float f1794l;
        /* renamed from: m */
        public float f1795m;
        /* renamed from: n */
        public float f1796n;
        /* renamed from: o */
        public float f1797o;
        /* renamed from: p */
        public boolean f1798p;
        /* renamed from: q */
        public final C0446b[][] f1799q;
        /* renamed from: r */
        public C0446b f1800r;
        /* renamed from: s */
        public float f1801s;
        /* renamed from: t */
        public float f1802t;
        /* renamed from: u */
        public char[] f1803u;
        /* renamed from: v */
        public char[] f1804v;
        /* renamed from: w */
        public char[] f1805w;

        public BitmapFontData() {
            this.f1791i = 1.0f;
            this.f1795m = 1.0f;
            this.f1796n = 1.0f;
            this.f1797o = 1.0f;
            this.f1799q = new C0446b[128][];
            this.f1802t = 1.0f;
            this.f1804v = new char[]{'x', 'e', 'a', 'o', 'n', 's', 'r', 'c', 'u', 'm', 'v', 'w', 'z'};
            this.f1805w = new char[]{'M', 'N', 'B', 'D', 'C', 'E', 'F', 'K', 'A', 'G', 'H', 'I', 'J', 'L', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        }

        public BitmapFontData(C0316a c0316a, boolean z) {
            this.f1791i = 1.0f;
            this.f1795m = 1.0f;
            this.f1796n = 1.0f;
            this.f1797o = 1.0f;
            this.f1799q = new C0446b[128][];
            this.f1802t = 1.0f;
            this.f1804v = new char[]{'x', 'e', 'a', 'o', 'n', 's', 'r', 'c', 'u', 'm', 'v', 'w', 'z'};
            this.f1805w = new char[]{'M', 'N', 'B', 'D', 'C', 'E', 'F', 'K', 'A', 'G', 'H', 'I', 'J', 'L', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            this.f1784b = c0316a;
            this.f1785c = z;
            m1321a(c0316a, z);
        }

        /* renamed from: a */
        private C0446b m1320a() {
            for (C0446b[] c0446bArr : this.f1799q) {
                if (c0446bArr != null) {
                    for (C0446b c0446b : c0446bArr) {
                        if (c0446b != null && c0446b.f1810e != 0 && c0446b.f1809d != 0) {
                            return c0446b;
                        }
                    }
                    continue;
                }
            }
            throw new GdxRuntimeException("No glyphs found.");
        }

        /* renamed from: a */
        private void m1321a(C0316a c0316a, boolean z) {
            int i = 1;
            if (this.f1783a != null) {
                throw new IllegalStateException("Already loaded.");
            }
            Closeable bufferedReader = new BufferedReader(new InputStreamReader(c0316a.mo268b()), 512);
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                throw new GdxRuntimeException("File is empty.");
            }
            readLine = readLine.substring(readLine.indexOf("padding=") + 8);
            String[] split = readLine.substring(0, readLine.indexOf(32)).split(",", 4);
            if (split.length != 4) {
                throw new GdxRuntimeException("Invalid padding.");
            }
            this.f1786d = (float) Integer.parseInt(split[0]);
            this.f1787e = (float) Integer.parseInt(split[1]);
            this.f1788f = (float) Integer.parseInt(split[2]);
            this.f1789g = (float) Integer.parseInt(split[3]);
            float f = this.f1788f + this.f1786d;
            readLine = bufferedReader.readLine();
            if (readLine == null) {
                throw new GdxRuntimeException("Missing common header.");
            }
            split = readLine.split(" ", 7);
            if (split.length < 3) {
                throw new GdxRuntimeException("Invalid common header.");
            } else if (split[1].startsWith("lineHeight=")) {
                this.f1790h = (float) Integer.parseInt(split[1].substring(11));
                if (split[2].startsWith("base=")) {
                    int max;
                    CharSequence readLine2;
                    Matcher matcher;
                    String group;
                    Matcher matcher2;
                    String readLine3;
                    C0446b c0446b;
                    C0446b a;
                    float parseInt = (float) Integer.parseInt(split[2].substring(5));
                    if (split.length >= 6 && split[5] != null && split[5].startsWith("pages=")) {
                        try {
                            max = Math.max(1, Integer.parseInt(split[5].substring(6)));
                        } catch (NumberFormatException e) {
                        }
                        this.f1783a = new String[max];
                        for (i = 0; i < max; i++) {
                            readLine2 = bufferedReader.readLine();
                            if (readLine2 != null) {
                                throw new GdxRuntimeException("Missing additional page definitions.");
                            }
                            matcher = Pattern.compile(".*id=(\\d+)").matcher(readLine2);
                            if (matcher.find()) {
                                group = matcher.group(1);
                                if (Integer.parseInt(group) != i) {
                                    throw new GdxRuntimeException("Page IDs must be indices starting at 0: " + group);
                                }
                            }
                            matcher2 = Pattern.compile(".*file=\"?([^\"]+)\"?").matcher(readLine2);
                            if (matcher2.find()) {
                                throw new GdxRuntimeException("Missing: file");
                            }
                            this.f1783a[i] = c0316a.mo265a().mo266a(matcher2.group(1)).m896h().replaceAll("\\\\", "/");
                        }
                        this.f1793k = 0.0f;
                        while (true) {
                            readLine3 = bufferedReader.readLine();
                            if (readLine3 == null || readLine3.startsWith("kernings ")) {
                                this.f1793k += this.f1788f;
                            } else if (readLine3.startsWith("char ")) {
                                c0446b = new C0446b();
                                StringTokenizer stringTokenizer = new StringTokenizer(readLine3, " =");
                                stringTokenizer.nextToken();
                                stringTokenizer.nextToken();
                                i = Integer.parseInt(stringTokenizer.nextToken());
                                if (i <= 0) {
                                    this.f1800r = c0446b;
                                } else if (i <= 65535) {
                                    m1325a(i, c0446b);
                                } else {
                                    continue;
                                }
                                c0446b.f1806a = i;
                                stringTokenizer.nextToken();
                                c0446b.f1807b = Integer.parseInt(stringTokenizer.nextToken());
                                stringTokenizer.nextToken();
                                c0446b.f1808c = Integer.parseInt(stringTokenizer.nextToken());
                                stringTokenizer.nextToken();
                                c0446b.f1809d = Integer.parseInt(stringTokenizer.nextToken());
                                stringTokenizer.nextToken();
                                c0446b.f1810e = Integer.parseInt(stringTokenizer.nextToken());
                                stringTokenizer.nextToken();
                                c0446b.f1815j = Integer.parseInt(stringTokenizer.nextToken());
                                stringTokenizer.nextToken();
                                if (z) {
                                    c0446b.f1816k = Integer.parseInt(stringTokenizer.nextToken());
                                } else {
                                    c0446b.f1816k = -(c0446b.f1810e + Integer.parseInt(stringTokenizer.nextToken()));
                                }
                                stringTokenizer.nextToken();
                                c0446b.f1817l = Integer.parseInt(stringTokenizer.nextToken());
                                if (stringTokenizer.hasMoreTokens()) {
                                    stringTokenizer.nextToken();
                                }
                                if (stringTokenizer.hasMoreTokens()) {
                                    try {
                                        c0446b.f1820o = Integer.parseInt(stringTokenizer.nextToken());
                                    } catch (NumberFormatException e2) {
                                    }
                                }
                                if (c0446b.f1809d > 0 && c0446b.f1810e > 0) {
                                    this.f1793k = Math.min(((float) c0446b.f1816k) + parseInt, this.f1793k);
                                }
                            }
                        }
                        this.f1793k += this.f1788f;
                        while (true) {
                            readLine3 = bufferedReader.readLine();
                            if (readLine3 != null && readLine3.startsWith("kerning ")) {
                                StringTokenizer stringTokenizer2 = new StringTokenizer(readLine3, " =");
                                stringTokenizer2.nextToken();
                                stringTokenizer2.nextToken();
                                i = Integer.parseInt(stringTokenizer2.nextToken());
                                stringTokenizer2.nextToken();
                                int parseInt2 = Integer.parseInt(stringTokenizer2.nextToken());
                                if (i >= 0 && i <= 65535 && parseInt2 >= 0 && parseInt2 <= 65535) {
                                    a = mo361a((char) i);
                                    stringTokenizer2.nextToken();
                                    max = Integer.parseInt(stringTokenizer2.nextToken());
                                    if (a != null) {
                                        a.m1328a(parseInt2, max);
                                    }
                                }
                            } else {
                                a = mo361a(' ');
                            }
                        }
                        a = mo361a(' ');
                        if (a == null) {
                            a = new C0446b();
                            a.f1806a = 32;
                            c0446b = mo361a('l');
                            if (c0446b == null) {
                                c0446b = m1320a();
                            }
                            a.f1817l = c0446b.f1817l;
                            m1325a(32, a);
                        }
                        if (a.f1809d == 0) {
                            a.f1809d = (int) ((this.f1789g + ((float) a.f1817l)) + this.f1787e);
                            a.f1815j = (int) (-this.f1789g);
                        }
                        this.f1801s = (float) a.f1809d;
                        a = null;
                        for (char a2 : this.f1804v) {
                            a = mo361a(a2);
                            if (a == null) {
                                break;
                            }
                        }
                        if (a == null) {
                            a = m1320a();
                        }
                        this.f1802t = ((float) a.f1810e) - f;
                        a = null;
                        for (char a22 : this.f1805w) {
                            a = mo361a(a22);
                            if (a == null) {
                                break;
                            }
                        }
                        if (a != null) {
                            for (C0446b[] c0446bArr : this.f1799q) {
                                if (c0446bArr != null) {
                                    for (C0446b c0446b2 : c0446bArr) {
                                        if (!(c0446b2 == null || c0446b2.f1810e == 0 || c0446b2.f1809d == 0)) {
                                            this.f1791i = Math.max(this.f1791i, (float) c0446b2.f1810e);
                                        }
                                    }
                                }
                            }
                        } else {
                            this.f1791i = (float) a.f1810e;
                        }
                        this.f1791i -= f;
                        this.f1792j = parseInt - this.f1791i;
                        this.f1794l = -this.f1790h;
                        if (z) {
                            this.f1792j = -this.f1792j;
                            this.f1794l = -this.f1794l;
                        }
                        ab.m2310a(bufferedReader);
                    }
                    max = i;
                    try {
                        this.f1783a = new String[max];
                        while (i < max) {
                            readLine2 = bufferedReader.readLine();
                            if (readLine2 != null) {
                                matcher = Pattern.compile(".*id=(\\d+)").matcher(readLine2);
                                if (matcher.find()) {
                                    group = matcher.group(1);
                                    if (Integer.parseInt(group) != i) {
                                        throw new GdxRuntimeException("Page IDs must be indices starting at 0: " + group);
                                    }
                                }
                                matcher2 = Pattern.compile(".*file=\"?([^\"]+)\"?").matcher(readLine2);
                                if (matcher2.find()) {
                                    this.f1783a[i] = c0316a.mo265a().mo266a(matcher2.group(1)).m896h().replaceAll("\\\\", "/");
                                } else {
                                    throw new GdxRuntimeException("Missing: file");
                                }
                            }
                            throw new GdxRuntimeException("Missing additional page definitions.");
                        }
                        this.f1793k = 0.0f;
                        while (true) {
                            readLine3 = bufferedReader.readLine();
                            if (readLine3 == null) {
                                break;
                            }
                            break;
                        }
                        this.f1793k += this.f1788f;
                        while (true) {
                            readLine3 = bufferedReader.readLine();
                            if (readLine3 != null) {
                                break;
                            }
                            break;
                        }
                        a = mo361a(' ');
                        if (a == null) {
                            a = new C0446b();
                            a.f1806a = 32;
                            c0446b = mo361a('l');
                            if (c0446b == null) {
                                c0446b = m1320a();
                            }
                            a.f1817l = c0446b.f1817l;
                            m1325a(32, a);
                        }
                        if (a.f1809d == 0) {
                            a.f1809d = (int) ((this.f1789g + ((float) a.f1817l)) + this.f1787e);
                            a.f1815j = (int) (-this.f1789g);
                        }
                        this.f1801s = (float) a.f1809d;
                        a = null;
                        while (max < r7) {
                            a = mo361a(a22);
                            if (a == null) {
                                break;
                            }
                        }
                        if (a == null) {
                            a = m1320a();
                        }
                        this.f1802t = ((float) a.f1810e) - f;
                        a = null;
                        while (max < r7) {
                            a = mo361a(a22);
                            if (a == null) {
                                break;
                            }
                        }
                        if (a != null) {
                            this.f1791i = (float) a.f1810e;
                        } else {
                            for (i = 0; i < r7; i++) {
                                if (c0446bArr != null) {
                                    for (C0446b c0446b22 : c0446bArr) {
                                        this.f1791i = Math.max(this.f1791i, (float) c0446b22.f1810e);
                                    }
                                }
                            }
                        }
                        this.f1791i -= f;
                        this.f1792j = parseInt - this.f1791i;
                        this.f1794l = -this.f1790h;
                        if (z) {
                            this.f1792j = -this.f1792j;
                            this.f1794l = -this.f1794l;
                        }
                        ab.m2310a(bufferedReader);
                    } catch (Throwable e3) {
                        throw new GdxRuntimeException("Invalid page id: " + group, e3);
                    } catch (Throwable e32) {
                        throw new GdxRuntimeException("Error loading font file: " + c0316a, e32);
                    } catch (Throwable th) {
                        ab.m2310a(bufferedReader);
                    }
                } else {
                    throw new GdxRuntimeException("Missing: base");
                }
            } else {
                throw new GdxRuntimeException("Missing: lineHeight");
            }
        }

        /* renamed from: b */
        public static boolean m1322b(char c) {
            switch (c) {
                case '\t':
                case '\n':
                case '\r':
                case ' ':
                    return true;
                default:
                    return false;
            }
        }

        /* renamed from: a */
        public C0446b mo361a(char c) {
            C0446b[] c0446bArr = this.f1799q[c / 512];
            return c0446bArr != null ? c0446bArr[c & 511] : null;
        }

        /* renamed from: a */
        public final void m1324a(float f, float f2) {
            if (f == 0.0f) {
                throw new IllegalArgumentException("scaleX cannot be 0.");
            } else if (f2 == 0.0f) {
                throw new IllegalArgumentException("scaleY cannot be 0.");
            } else {
                float f3 = f / this.f1796n;
                float f4 = f2 / this.f1797o;
                this.f1790h *= f4;
                this.f1801s = f3 * this.f1801s;
                this.f1802t *= f4;
                this.f1791i *= f4;
                this.f1792j *= f4;
                this.f1793k *= f4;
                this.f1794l *= f4;
                this.f1786d *= f4;
                this.f1789g *= f4;
                this.f1788f *= f4;
                this.f1787e *= f4;
                this.f1796n = f;
                this.f1797o = f2;
            }
        }

        /* renamed from: a */
        public final void m1325a(int i, C0446b c0446b) {
            C0446b[] c0446bArr = this.f1799q[i / 512];
            if (c0446bArr == null) {
                c0446bArr = new C0446b[512];
                this.f1799q[i / 512] = c0446bArr;
            }
            c0446bArr[i & 511] = c0446b;
        }

        /* renamed from: a */
        public final void m1326a(C0446b c0446b, C0438n c0438n) {
            Texture texture = c0438n.f1686z;
            float c = 1.0f / ((float) texture.m1144c());
            float k = 1.0f / ((float) texture.m1145k());
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = c0438n.f1680A;
            float f4 = c0438n.f1681B;
            float f5 = (float) c0438n.f1684E;
            float f6 = (float) c0438n.f1685F;
            if (c0438n instanceof C0475a) {
                C0475a c0475a = (C0475a) c0438n;
                f = c0475a.f2045c;
                f2 = ((float) (c0475a.f2050h - c0475a.f2048f)) - c0475a.f2046d;
            }
            float f7 = (float) c0446b.f1807b;
            float f8 = (float) (c0446b.f1807b + c0446b.f1809d);
            float f9 = (float) c0446b.f1808c;
            float f10 = (float) (c0446b.f1808c + c0446b.f1810e);
            if (f > 0.0f) {
                f7 -= f;
                if (f7 < 0.0f) {
                    c0446b.f1809d = (int) (((float) c0446b.f1809d) + f7);
                    c0446b.f1815j = (int) (((float) c0446b.f1815j) - f7);
                    f7 = 0.0f;
                }
                f = f8 - f;
                if (f > f5) {
                    c0446b.f1809d = (int) (((float) c0446b.f1809d) - (f - f5));
                    f8 = f7;
                } else {
                    f5 = f;
                    f8 = f7;
                }
            } else {
                f5 = f8;
                f8 = f7;
            }
            if (f2 > 0.0f) {
                f = f9 - f2;
                if (f < 0.0f) {
                    c0446b.f1810e = (int) (f + ((float) c0446b.f1810e));
                    f = 0.0f;
                }
                f2 = f10 - f2;
                if (f2 > f6) {
                    f2 -= f6;
                    c0446b.f1810e = (int) (((float) c0446b.f1810e) - f2);
                    c0446b.f1816k = (int) (f2 + ((float) c0446b.f1816k));
                    f2 = f6;
                }
            } else {
                f2 = f10;
                f = f9;
            }
            c0446b.f1811f = (f8 * c) + f3;
            c0446b.f1813h = (f5 * c) + f3;
            if (this.f1785c) {
                c0446b.f1812g = (f * k) + f4;
                c0446b.f1814i = (f2 * k) + f4;
                return;
            }
            c0446b.f1814i = (f * k) + f4;
            c0446b.f1812g = (f2 * k) + f4;
        }

        /* renamed from: a */
        public void mo362a(C0450a c0450a, CharSequence charSequence, int i, int i2, boolean z) {
            boolean z2 = this.f1798p;
            float f = this.f1796n;
            C0446b c0446b = this.f1800r;
            C0676a c0676a = c0450a.f1842a;
            C0689h c0689h = c0450a.f1843b;
            c0676a.m2305c(i2 - i);
            int i3 = ((i2 - i) + 1) + c0689h.f3079b;
            if (i3 > c0689h.f3078a.length) {
                c0689h.m2408b(Math.max(8, i3));
            }
            C0446b c0446b2 = null;
            while (i < i2) {
                i3 = i + 1;
                char charAt = charSequence.charAt(i);
                C0446b a = mo361a(charAt);
                if (a == null) {
                    if (c0446b != null) {
                        a = c0446b;
                    } else {
                        i = i3;
                    }
                }
                c0676a.m2296a((Object) a);
                if (c0446b2 == null) {
                    float f2 = (!z || a.f1819n) ? 0.0f : (((float) (-a.f1815j)) * f) - this.f1789g;
                    c0689h.m2405a(f2);
                } else {
                    int i4;
                    int i5 = c0446b2.f1817l;
                    if (c0446b2.f1818m != null) {
                        byte[] bArr = c0446b2.f1818m[charAt >>> 9];
                        if (bArr != null) {
                            i4 = bArr[charAt & 511];
                            c0689h.m2405a(((float) (i4 + i5)) * f);
                        }
                    }
                    i4 = 0;
                    c0689h.m2405a(((float) (i4 + i5)) * f);
                }
                if (z2 && charAt == '[' && i3 < i2 && charSequence.charAt(i3) == '[') {
                    i3++;
                }
                c0446b2 = a;
                i = i3;
            }
            if (c0446b2 != null) {
                float f3 = (!z || c0446b2.f1819n) ? (float) c0446b2.f1817l : ((float) (c0446b2.f1815j + c0446b2.f1809d)) - this.f1787e;
                c0689h.m2405a(f3 * f);
            }
        }
    }

    /* renamed from: com.badlogic.gdx.graphics.g2d.b$b */
    public static class C0446b {
        /* renamed from: a */
        public int f1806a;
        /* renamed from: b */
        public int f1807b;
        /* renamed from: c */
        public int f1808c;
        /* renamed from: d */
        public int f1809d;
        /* renamed from: e */
        public int f1810e;
        /* renamed from: f */
        public float f1811f;
        /* renamed from: g */
        public float f1812g;
        /* renamed from: h */
        public float f1813h;
        /* renamed from: i */
        public float f1814i;
        /* renamed from: j */
        public int f1815j;
        /* renamed from: k */
        public int f1816k;
        /* renamed from: l */
        public int f1817l;
        /* renamed from: m */
        public byte[][] f1818m;
        /* renamed from: n */
        public boolean f1819n;
        /* renamed from: o */
        public int f1820o = 0;

        /* renamed from: a */
        public final void m1328a(int i, int i2) {
            if (this.f1818m == null) {
                this.f1818m = new byte[128][];
            }
            byte[] bArr = this.f1818m[i >>> 9];
            if (bArr == null) {
                bArr = new byte[512];
                this.f1818m[i >>> 9] = bArr;
            }
            bArr[i & 511] = (byte) i2;
        }

        public final String toString() {
            return Character.toString((char) this.f1806a);
        }
    }

    public BitmapFont() {
        this(Gdx.files.mo274a("com/badlogic/gdx/utils/arial-15.fnt"), Gdx.files.mo274a("com/badlogic/gdx/utils/arial-15.png"), false, (byte) 0);
    }

    public BitmapFont(C0316a c0316a, C0316a c0316a2, boolean z) {
        this(c0316a, c0316a2, z, (byte) 0);
    }

    private BitmapFont(C0316a c0316a, C0316a c0316a2, boolean z, byte b) {
        this(new BitmapFontData(c0316a, z), new C0438n(new Texture(c0316a2)));
        this.f1826f = true;
    }

    public BitmapFont(C0316a c0316a, C0438n c0438n) {
        this(c0316a, c0438n, false);
    }

    public BitmapFont(C0316a c0316a, C0438n c0438n, boolean z) {
        this(new BitmapFontData(c0316a, z), c0438n);
    }

    public BitmapFont(C0316a c0316a, boolean z) {
        this(new BitmapFontData(c0316a, z), null);
    }

    private BitmapFont(BitmapFontData bitmapFontData, C0438n c0438n) {
        C0676a a;
        if (c0438n != null) {
            a = C0676a.m2288a(c0438n);
        } else {
            a = null;
        }
        this(bitmapFontData, a);
    }

    public BitmapFont(BitmapFontData bitmapFontData, C0676a<C0438n> c0676a) {
        this.f1824d = bitmapFontData.f1785c;
        this.f1821a = bitmapFontData;
        this.f1825e = true;
        if (c0676a == null || c0676a.f3001b == 0) {
            int length = bitmapFontData.f1783a.length;
            this.f1822b = new C0676a(length);
            for (int i = 0; i < length; i++) {
                this.f1822b.m2296a(new C0438n(new Texture(bitmapFontData.f1784b == null ? Gdx.files.mo277b(bitmapFontData.f1783a[i]) : Gdx.files.mo275a(bitmapFontData.f1783a[i], bitmapFontData.f1784b.f1120b))));
            }
            this.f1826f = true;
        } else {
            this.f1822b = c0676a;
            this.f1826f = false;
        }
        this.f1823c = m1336c();
        m1329a(bitmapFontData);
    }

    /* renamed from: a */
    private void m1329a(BitmapFontData bitmapFontData) {
        for (C0446b[] c0446bArr : bitmapFontData.f1799q) {
            if (c0446bArr != null) {
                for (C0446b c0446b : c0446bArr) {
                    if (c0446b != null) {
                        bitmapFontData.m1326a(c0446b, (C0438n) this.f1822b.m2291a(c0446b.f1820o));
                    }
                }
            }
        }
        if (bitmapFontData.f1800r != null) {
            bitmapFontData.m1326a(bitmapFontData.f1800r, (C0438n) this.f1822b.m2291a(bitmapFontData.f1800r.f1820o));
        }
    }

    /* renamed from: a */
    public final C0451d m1330a(C0444a c0444a, CharSequence charSequence, float f, float f2) {
        this.f1823c.m1339a();
        C0451d a = this.f1823c.m1338a(charSequence, f, f2, charSequence.length(), 0.0f, 8);
        this.f1823c.m1340a(c0444a);
        return a;
    }

    /* renamed from: a */
    public final C0451d m1331a(C0444a c0444a, CharSequence charSequence, float f, float f2, float f3, int i) {
        this.f1823c.m1339a();
        C0451d a = this.f1823c.m1338a(charSequence, f, f2, charSequence.length(), f3, i);
        this.f1823c.m1340a(c0444a);
        return a;
    }

    /* renamed from: a */
    public final C0438n m1332a() {
        return (C0438n) this.f1822b.m2304c();
    }

    /* renamed from: a */
    public final void m1333a(float f, float f2, float f3, float f4) {
        this.f1823c.f1834g.m1217a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public final void m1334a(C0430b c0430b) {
        this.f1823c.f1834g.m1218a(c0430b);
    }

    /* renamed from: b */
    public final void dispose() {
        if (this.f1826f) {
            for (int i = 0; i < this.f1822b.f3001b; i++) {
                ((C0438n) this.f1822b.m2291a(i)).f1686z.dispose();
            }
        }
    }

    /* renamed from: c */
    public final BitmapFontCache m1336c() {
        return new BitmapFontCache(this, this.f1825e);
    }

    public String toString() {
        return this.f1821a.f1784b != null ? this.f1821a.f1784b.m897i() : super.toString();
    }
}
