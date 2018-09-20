package com.badlogic.gdx.utils;

import com.badlogic.gdx.utils.JsonWriter.OutputType;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class JsonValue implements Iterable<JsonValue> {
    /* renamed from: a */
    ValueType f2952a;
    /* renamed from: b */
    String f2953b;
    /* renamed from: c */
    double f2954c;
    /* renamed from: d */
    long f2955d;
    /* renamed from: e */
    public String f2956e;
    /* renamed from: f */
    public JsonValue f2957f;
    /* renamed from: g */
    public JsonValue f2958g;
    /* renamed from: h */
    public JsonValue f2959h;
    /* renamed from: i */
    public JsonValue f2960i;
    /* renamed from: j */
    public int f2961j;

    /* renamed from: com.badlogic.gdx.utils.JsonValue$1 */
    static /* synthetic */ class C06641 {
        /* renamed from: a */
        static final /* synthetic */ int[] f2937a = new int[ValueType.values().length];

        static {
            try {
                f2937a[ValueType.stringValue.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f2937a[ValueType.doubleValue.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f2937a[ValueType.longValue.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f2937a[ValueType.booleanValue.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f2937a[ValueType.nullValue.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    public enum ValueType {
        object,
        array,
        stringValue,
        doubleValue,
        longValue,
        booleanValue,
        nullValue
    }

    /* renamed from: com.badlogic.gdx.utils.JsonValue$a */
    public class C0665a implements Iterable<JsonValue>, Iterator<JsonValue> {
        /* renamed from: a */
        JsonValue f2946a = this.f2948c.f2957f;
        /* renamed from: b */
        JsonValue f2947b;
        /* renamed from: c */
        final /* synthetic */ JsonValue f2948c;

        public C0665a(JsonValue jsonValue) {
            this.f2948c = jsonValue;
        }

        public final boolean hasNext() {
            return this.f2946a != null;
        }

        public final Iterator<JsonValue> iterator() {
            return this;
        }

        public final /* synthetic */ Object next() {
            this.f2947b = this.f2946a;
            if (this.f2947b == null) {
                throw new NoSuchElementException();
            }
            this.f2946a = this.f2947b.f2958g;
            return this.f2947b;
        }

        public final void remove() {
            if (this.f2947b.f2959h == null) {
                this.f2948c.f2957f = this.f2947b.f2958g;
                if (this.f2948c.f2957f != null) {
                    this.f2948c.f2957f.f2959h = null;
                }
            } else {
                this.f2947b.f2959h.f2958g = this.f2947b.f2958g;
                if (this.f2947b.f2958g != null) {
                    this.f2947b.f2958g.f2959h = this.f2947b.f2959h;
                }
            }
            JsonValue jsonValue = this.f2948c;
            jsonValue.f2961j--;
        }
    }

    /* renamed from: com.badlogic.gdx.utils.JsonValue$b */
    public static class C0666b {
        /* renamed from: a */
        public OutputType f2949a;
        /* renamed from: b */
        public int f2950b;
        /* renamed from: c */
        public boolean f2951c;
    }

    public JsonValue(double d) {
        m2248a(d, null);
    }

    public JsonValue(double d, String str) {
        m2248a(d, str);
    }

    public JsonValue(long j) {
        m2250a(j, null);
    }

    public JsonValue(long j, String str) {
        m2250a(j, str);
    }

    public JsonValue(ValueType valueType) {
        this.f2952a = valueType;
    }

    public JsonValue(String str) {
        this.f2953b = str;
        this.f2952a = str == null ? ValueType.nullValue : ValueType.stringValue;
    }

    public JsonValue(boolean z) {
        this.f2955d = z ? 1 : 0;
        this.f2952a = ValueType.booleanValue;
    }

    /* renamed from: a */
    private void m2248a(double d, String str) {
        this.f2954c = d;
        this.f2955d = (long) d;
        this.f2953b = str;
        this.f2952a = ValueType.doubleValue;
    }

    /* renamed from: a */
    private static void m2249a(int i, ac acVar) {
        for (int i2 = 0; i2 < i; i2++) {
            acVar.m2322a('\t');
        }
    }

    /* renamed from: a */
    private void m2250a(long j, String str) {
        this.f2955d = j;
        this.f2954c = (double) j;
        this.f2953b = str;
        this.f2952a = ValueType.longValue;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m2251a(JsonValue r10, ac r11, int r12, C0666b r13) {
        /*
        r9 = this;
        r4 = r13.f2949a;
        r0 = r10.m2276k();
        if (r0 == 0) goto L_0x0105;
    L_0x0008:
        r0 = r10.f2957f;
        if (r0 != 0) goto L_0x0012;
    L_0x000c:
        r0 = "{}";
        r11.m2324a(r0);
    L_0x0011:
        return;
    L_0x0012:
        r0 = m2252a(r10);
        if (r0 != 0) goto L_0x00b6;
    L_0x0018:
        r0 = 1;
    L_0x0019:
        r3 = r11.length();
        r2 = r0;
    L_0x001e:
        if (r2 == 0) goto L_0x00b9;
    L_0x0020:
        r0 = "{\n";
    L_0x0022:
        r11.m2324a(r0);
        r0 = r10.f2957f;
        r1 = r0;
    L_0x0028:
        if (r1 == 0) goto L_0x00f7;
    L_0x002a:
        if (r2 == 0) goto L_0x002f;
    L_0x002c:
        m2249a(r12, r11);
    L_0x002f:
        r0 = r1.f2956e;
        r5 = new com.badlogic.gdx.utils.ac;
        r5.<init>(r0);
        r6 = 92;
        r7 = "\\\\";
        r6 = r5.m2316a(r6, r7);
        r7 = 13;
        r8 = "\\r";
        r6 = r6.m2316a(r7, r8);
        r7 = 10;
        r8 = "\\n";
        r6 = r6.m2316a(r7, r8);
        r7 = 9;
        r8 = "\\t";
        r6.m2316a(r7, r8);
        r6 = com.badlogic.gdx.utils.JsonWriter.C06671.f2962a;
        r7 = r4.ordinal();
        r6 = r6[r7];
        switch(r6) {
            case 1: goto L_0x00bd;
            case 2: goto L_0x00de;
            default: goto L_0x0060;
        };
    L_0x0060:
        r0 = new java.lang.StringBuilder;
        r6 = "\"";
        r0.<init>(r6);
        r6 = 34;
        r7 = "\\\"";
        r5 = r5.m2316a(r6, r7);
        r5 = r5.toString();
        r0 = r0.append(r5);
        r5 = 34;
        r0 = r0.append(r5);
        r0 = r0.toString();
    L_0x0081:
        r11.m2324a(r0);
        r0 = ": ";
        r11.m2324a(r0);
        r0 = r12 + 1;
        r9.m2251a(r1, r11, r0, r13);
        if (r2 == 0) goto L_0x0094;
    L_0x0090:
        r0 = com.badlogic.gdx.utils.JsonWriter.OutputType.minimal;
        if (r4 == r0) goto L_0x009d;
    L_0x0094:
        r0 = r1.f2958g;
        if (r0 == 0) goto L_0x009d;
    L_0x0098:
        r0 = 44;
        r11.m2322a(r0);
    L_0x009d:
        if (r2 == 0) goto L_0x00ef;
    L_0x009f:
        r0 = 10;
    L_0x00a1:
        r11.m2322a(r0);
        if (r2 != 0) goto L_0x00f2;
    L_0x00a6:
        r0 = r11.length();
        r0 = r0 - r3;
        r5 = r13.f2950b;
        if (r0 <= r5) goto L_0x00f2;
    L_0x00af:
        r11.m2327b(r3);
        r0 = 1;
        r2 = r0;
        goto L_0x001e;
    L_0x00b6:
        r0 = 0;
        goto L_0x0019;
    L_0x00b9:
        r0 = "{ ";
        goto L_0x0022;
    L_0x00bd:
        r6 = "//";
        r6 = r0.contains(r6);
        if (r6 != 0) goto L_0x00de;
    L_0x00c5:
        r6 = "/*";
        r0 = r0.contains(r6);
        if (r0 != 0) goto L_0x00de;
    L_0x00cd:
        r0 = com.badlogic.gdx.utils.JsonWriter.OutputType.f2967e;
        r0 = r0.matcher(r5);
        r0 = r0.matches();
        if (r0 == 0) goto L_0x00de;
    L_0x00d9:
        r0 = r5.toString();
        goto L_0x0081;
    L_0x00de:
        r0 = com.badlogic.gdx.utils.JsonWriter.OutputType.f2966d;
        r0 = r0.matcher(r5);
        r0 = r0.matches();
        if (r0 == 0) goto L_0x0060;
    L_0x00ea:
        r0 = r5.toString();
        goto L_0x0081;
    L_0x00ef:
        r0 = 32;
        goto L_0x00a1;
    L_0x00f2:
        r0 = r1.f2958g;
        r1 = r0;
        goto L_0x0028;
    L_0x00f7:
        if (r2 == 0) goto L_0x00fe;
    L_0x00f9:
        r0 = r12 + -1;
        m2249a(r0, r11);
    L_0x00fe:
        r0 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r11.m2322a(r0);
        goto L_0x0011;
    L_0x0105:
        r0 = r10.m2275j();
        if (r0 == 0) goto L_0x0188;
    L_0x010b:
        r0 = r10.f2957f;
        if (r0 != 0) goto L_0x0116;
    L_0x010f:
        r0 = "[]";
        r11.m2324a(r0);
        goto L_0x0011;
    L_0x0116:
        r0 = m2252a(r10);
        if (r0 != 0) goto L_0x016c;
    L_0x011c:
        r0 = 1;
    L_0x011d:
        r1 = r13.f2951c;
        if (r1 != 0) goto L_0x0127;
    L_0x0121:
        r1 = m2253b(r10);
        if (r1 != 0) goto L_0x016e;
    L_0x0127:
        r1 = 1;
    L_0x0128:
        r5 = r11.length();
        r3 = r0;
    L_0x012d:
        if (r3 == 0) goto L_0x0170;
    L_0x012f:
        r0 = "[\n";
    L_0x0131:
        r11.m2324a(r0);
        r0 = r10.f2957f;
        r2 = r0;
    L_0x0137:
        if (r2 == 0) goto L_0x017a;
    L_0x0139:
        if (r3 == 0) goto L_0x013e;
    L_0x013b:
        m2249a(r12, r11);
    L_0x013e:
        r0 = r12 + 1;
        r9.m2251a(r2, r11, r0, r13);
        if (r3 == 0) goto L_0x0149;
    L_0x0145:
        r0 = com.badlogic.gdx.utils.JsonWriter.OutputType.minimal;
        if (r4 == r0) goto L_0x0152;
    L_0x0149:
        r0 = r2.f2958g;
        if (r0 == 0) goto L_0x0152;
    L_0x014d:
        r0 = 44;
        r11.m2322a(r0);
    L_0x0152:
        if (r3 == 0) goto L_0x0173;
    L_0x0154:
        r0 = 10;
    L_0x0156:
        r11.m2322a(r0);
        if (r1 == 0) goto L_0x0176;
    L_0x015b:
        if (r3 != 0) goto L_0x0176;
    L_0x015d:
        r0 = r11.length();
        r0 = r0 - r5;
        r6 = r13.f2950b;
        if (r0 <= r6) goto L_0x0176;
    L_0x0166:
        r11.m2327b(r5);
        r0 = 1;
        r3 = r0;
        goto L_0x012d;
    L_0x016c:
        r0 = 0;
        goto L_0x011d;
    L_0x016e:
        r1 = 0;
        goto L_0x0128;
    L_0x0170:
        r0 = "[ ";
        goto L_0x0131;
    L_0x0173:
        r0 = 32;
        goto L_0x0156;
    L_0x0176:
        r0 = r2.f2958g;
        r2 = r0;
        goto L_0x0137;
    L_0x017a:
        if (r3 == 0) goto L_0x0181;
    L_0x017c:
        r0 = r12 + -1;
        m2249a(r0, r11);
    L_0x0181:
        r0 = 93;
        r11.m2322a(r0);
        goto L_0x0011;
    L_0x0188:
        r0 = r10.m2277l();
        if (r0 == 0) goto L_0x023c;
    L_0x018e:
        r1 = r10.m2260a();
        if (r1 != 0) goto L_0x019b;
    L_0x0194:
        r0 = "null";
    L_0x0196:
        r11.m2324a(r0);
        goto L_0x0011;
    L_0x019b:
        r0 = r1.toString();
        r2 = r1 instanceof java.lang.Number;
        if (r2 != 0) goto L_0x0196;
    L_0x01a3:
        r1 = r1 instanceof java.lang.Boolean;
        if (r1 != 0) goto L_0x0196;
    L_0x01a7:
        r1 = new com.badlogic.gdx.utils.ac;
        r1.<init>(r0);
        r2 = 92;
        r3 = "\\\\";
        r2 = r1.m2316a(r2, r3);
        r3 = 13;
        r5 = "\\r";
        r2 = r2.m2316a(r3, r5);
        r3 = 10;
        r5 = "\\n";
        r2 = r2.m2316a(r3, r5);
        r3 = 9;
        r5 = "\\t";
        r2.m2316a(r3, r5);
        r2 = com.badlogic.gdx.utils.JsonWriter.OutputType.minimal;
        if (r4 != r2) goto L_0x0219;
    L_0x01cf:
        r2 = "true";
        r2 = r0.equals(r2);
        if (r2 != 0) goto L_0x0219;
    L_0x01d7:
        r2 = "false";
        r2 = r0.equals(r2);
        if (r2 != 0) goto L_0x0219;
    L_0x01df:
        r2 = "null";
        r2 = r0.equals(r2);
        if (r2 != 0) goto L_0x0219;
    L_0x01e7:
        r2 = "//";
        r2 = r0.contains(r2);
        if (r2 != 0) goto L_0x0219;
    L_0x01ef:
        r2 = "/*";
        r0 = r0.contains(r2);
        if (r0 != 0) goto L_0x0219;
    L_0x01f7:
        r0 = r1.length();
        if (r0 <= 0) goto L_0x0219;
    L_0x01fd:
        r0 = r0 + -1;
        r0 = r1.charAt(r0);
        r2 = 32;
        if (r0 == r2) goto L_0x0219;
    L_0x0207:
        r0 = com.badlogic.gdx.utils.JsonWriter.OutputType.f2968f;
        r0 = r0.matcher(r1);
        r0 = r0.matches();
        if (r0 == 0) goto L_0x0219;
    L_0x0213:
        r0 = r1.toString();
        goto L_0x0196;
    L_0x0219:
        r0 = new java.lang.StringBuilder;
        r2 = "\"";
        r0.<init>(r2);
        r2 = 34;
        r3 = "\\\"";
        r1 = r1.m2316a(r2, r3);
        r1 = r1.toString();
        r0 = r0.append(r1);
        r1 = 34;
        r0 = r0.append(r1);
        r0 = r0.toString();
        goto L_0x0196;
    L_0x023c:
        r0 = r10.f2952a;
        r1 = com.badlogic.gdx.utils.JsonValue.ValueType.doubleValue;
        if (r0 != r1) goto L_0x025c;
    L_0x0242:
        r0 = 1;
    L_0x0243:
        if (r0 == 0) goto L_0x025e;
    L_0x0245:
        r0 = r10.m2265c();
        r2 = r10.m2267d();
        r4 = (double) r2;
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 != 0) goto L_0x0253;
    L_0x0252:
        r0 = (double) r2;
    L_0x0253:
        r0 = java.lang.Double.toString(r0);
        r11.m2324a(r0);
        goto L_0x0011;
    L_0x025c:
        r0 = 0;
        goto L_0x0243;
    L_0x025e:
        r0 = r10.f2952a;
        r1 = com.badlogic.gdx.utils.JsonValue.ValueType.longValue;
        if (r0 != r1) goto L_0x0270;
    L_0x0264:
        r0 = 1;
    L_0x0265:
        if (r0 == 0) goto L_0x0272;
    L_0x0267:
        r0 = r10.m2267d();
        r11.m2318a(r0);
        goto L_0x0011;
    L_0x0270:
        r0 = 0;
        goto L_0x0265;
    L_0x0272:
        r0 = r10.m2279n();
        if (r0 == 0) goto L_0x0288;
    L_0x0278:
        r0 = r10.m2271f();
        if (r0 == 0) goto L_0x0285;
    L_0x027e:
        r0 = "true";
    L_0x0280:
        r11.m2324a(r0);
        goto L_0x0011;
    L_0x0285:
        r0 = "false";
        goto L_0x0280;
    L_0x0288:
        r0 = r10.m2255q();
        if (r0 == 0) goto L_0x0295;
    L_0x028e:
        r0 = "null";
        r11.m2324a(r0);
        goto L_0x0011;
    L_0x0295:
        r0 = new com.badlogic.gdx.utils.SerializationException;
        r1 = new java.lang.StringBuilder;
        r2 = "Unknown object type: ";
        r1.<init>(r2);
        r1 = r1.append(r10);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.JsonValue.a(com.badlogic.gdx.utils.JsonValue, com.badlogic.gdx.utils.ac, int, com.badlogic.gdx.utils.JsonValue$b):void");
    }

    /* renamed from: a */
    private static boolean m2252a(JsonValue jsonValue) {
        JsonValue jsonValue2 = jsonValue.f2957f;
        while (jsonValue2 != null) {
            if (jsonValue2.m2276k() || jsonValue2.m2275j()) {
                return false;
            }
            jsonValue2 = jsonValue2.f2958g;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m2253b(JsonValue jsonValue) {
        for (JsonValue jsonValue2 = jsonValue.f2957f; jsonValue2 != null; jsonValue2 = jsonValue2.f2958g) {
            if (!jsonValue2.m2278m()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private JsonValue m2254c(int i) {
        JsonValue jsonValue = this.f2957f;
        while (jsonValue != null && i > 0) {
            i--;
            jsonValue = jsonValue.f2958g;
        }
        return jsonValue;
    }

    /* renamed from: q */
    private boolean m2255q() {
        return this.f2952a == ValueType.nullValue;
    }

    /* renamed from: r */
    private boolean m2256r() {
        switch (C06641.f2937a[this.f2952a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public final float m2257a(int i) {
        JsonValue c = m2254c(i);
        if (c != null) {
            return c.m2262b();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f2956e);
    }

    /* renamed from: a */
    public final float m2258a(String str, float f) {
        JsonValue a = m2259a(str);
        return (a == null || !a.m2256r()) ? f : a.m2262b();
    }

    /* renamed from: a */
    public final JsonValue m2259a(String str) {
        JsonValue jsonValue = this.f2957f;
        while (jsonValue != null && (jsonValue.f2956e == null || !jsonValue.f2956e.equalsIgnoreCase(str))) {
            jsonValue = jsonValue.f2958g;
        }
        return jsonValue;
    }

    /* renamed from: a */
    public final String m2260a() {
        switch (C06641.f2937a[this.f2952a.ordinal()]) {
            case 1:
                return this.f2953b;
            case 2:
                return this.f2953b != null ? this.f2953b : Double.toString(this.f2954c);
            case 3:
                return this.f2953b != null ? this.f2953b : Long.toString(this.f2955d);
            case 4:
                return this.f2955d != 0 ? "true" : "false";
            case 5:
                return null;
            default:
                throw new IllegalStateException("Value cannot be converted to string: " + this.f2952a);
        }
    }

    /* renamed from: a */
    public final String m2261a(String str, String str2) {
        JsonValue a = m2259a(str);
        return (a == null || !a.m2256r() || a.m2255q()) ? str2 : a.m2260a();
    }

    /* renamed from: b */
    public final float m2262b() {
        switch (C06641.f2937a[this.f2952a.ordinal()]) {
            case 1:
                return Float.parseFloat(this.f2953b);
            case 2:
                return (float) this.f2954c;
            case 3:
                return (float) this.f2955d;
            case 4:
                return this.f2955d != 0 ? 1.0f : 0.0f;
            default:
                throw new IllegalStateException("Value cannot be converted to float: " + this.f2952a);
        }
    }

    /* renamed from: b */
    public final JsonValue m2263b(String str) {
        JsonValue jsonValue = this.f2957f;
        while (jsonValue != null && (jsonValue.f2956e == null || !jsonValue.f2956e.equalsIgnoreCase(str))) {
            jsonValue = jsonValue.f2958g;
        }
        if (jsonValue != null) {
            return jsonValue;
        }
        throw new IllegalArgumentException("Child not found with name: " + str);
    }

    /* renamed from: b */
    public final short m2264b(int i) {
        JsonValue c = m2254c(i);
        if (c != null) {
            return c.m2272g();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.f2956e);
    }

    /* renamed from: c */
    public final double m2265c() {
        switch (C06641.f2937a[this.f2952a.ordinal()]) {
            case 1:
                return Double.parseDouble(this.f2953b);
            case 2:
                return this.f2954c;
            case 3:
                return (double) this.f2955d;
            case 4:
                return this.f2955d != 0 ? 1.0d : 0.0d;
            default:
                throw new IllegalStateException("Value cannot be converted to double: " + this.f2952a);
        }
    }

    /* renamed from: c */
    public final boolean m2266c(String str) {
        JsonValue a = m2259a(str);
        return (a == null ? null : a.f2957f) != null;
    }

    /* renamed from: d */
    public final long m2267d() {
        switch (C06641.f2937a[this.f2952a.ordinal()]) {
            case 1:
                return Long.parseLong(this.f2953b);
            case 2:
                return (long) this.f2954c;
            case 3:
                return this.f2955d;
            case 4:
                return this.f2955d != 0 ? 1 : 0;
            default:
                throw new IllegalStateException("Value cannot be converted to long: " + this.f2952a);
        }
    }

    /* renamed from: d */
    public final String m2268d(String str) {
        JsonValue a = m2259a(str);
        if (a != null) {
            return a.m2260a();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    /* renamed from: e */
    public final int m2269e() {
        switch (C06641.f2937a[this.f2952a.ordinal()]) {
            case 1:
                return Integer.parseInt(this.f2953b);
            case 2:
                return (int) this.f2954c;
            case 3:
                return (int) this.f2955d;
            case 4:
                return this.f2955d != 0 ? 1 : 0;
            default:
                throw new IllegalStateException("Value cannot be converted to int: " + this.f2952a);
        }
    }

    /* renamed from: e */
    public final int m2270e(String str) {
        JsonValue a = m2259a(str);
        if (a != null) {
            return a.m2269e();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    /* renamed from: f */
    public final boolean m2271f() {
        switch (C06641.f2937a[this.f2952a.ordinal()]) {
            case 1:
                return this.f2953b.equalsIgnoreCase("true");
            case 2:
                return this.f2954c != 0.0d;
            case 3:
                return this.f2955d != 0;
            case 4:
                return this.f2955d != 0;
            default:
                throw new IllegalStateException("Value cannot be converted to boolean: " + this.f2952a);
        }
    }

    /* renamed from: g */
    public final short m2272g() {
        switch (C06641.f2937a[this.f2952a.ordinal()]) {
            case 1:
                return Short.parseShort(this.f2953b);
            case 2:
                return (short) ((int) this.f2954c);
            case 3:
                return (short) ((int) this.f2955d);
            case 4:
                return this.f2955d != 0 ? (short) 1 : (short) 0;
            default:
                throw new IllegalStateException("Value cannot be converted to short: " + this.f2952a);
        }
    }

    /* renamed from: h */
    public final float[] m2273h() {
        if (this.f2952a != ValueType.array) {
            throw new IllegalStateException("Value is not an array: " + this.f2952a);
        }
        float[] fArr = new float[this.f2961j];
        int i = 0;
        for (JsonValue jsonValue = this.f2957f; jsonValue != null; jsonValue = jsonValue.f2958g) {
            float parseFloat;
            switch (C06641.f2937a[jsonValue.f2952a.ordinal()]) {
                case 1:
                    parseFloat = Float.parseFloat(jsonValue.f2953b);
                    break;
                case 2:
                    parseFloat = (float) jsonValue.f2954c;
                    break;
                case 3:
                    parseFloat = (float) jsonValue.f2955d;
                    break;
                case 4:
                    if (jsonValue.f2955d == 0) {
                        parseFloat = 0.0f;
                        break;
                    }
                    parseFloat = 1.0f;
                    break;
                default:
                    throw new IllegalStateException("Value cannot be converted to float: " + jsonValue.f2952a);
            }
            fArr[i] = parseFloat;
            i++;
        }
        return fArr;
    }

    /* renamed from: i */
    public final short[] m2274i() {
        if (this.f2952a != ValueType.array) {
            throw new IllegalStateException("Value is not an array: " + this.f2952a);
        }
        short[] sArr = new short[this.f2961j];
        int i = 0;
        for (JsonValue jsonValue = this.f2957f; jsonValue != null; jsonValue = jsonValue.f2958g) {
            short parseShort;
            switch (C06641.f2937a[jsonValue.f2952a.ordinal()]) {
                case 1:
                    parseShort = Short.parseShort(jsonValue.f2953b);
                    break;
                case 2:
                    parseShort = (short) ((int) jsonValue.f2954c);
                    break;
                case 3:
                    parseShort = (short) ((int) jsonValue.f2955d);
                    break;
                case 4:
                    if (jsonValue.f2955d == 0) {
                        parseShort = (short) 0;
                        break;
                    }
                    parseShort = (short) 1;
                    break;
                default:
                    throw new IllegalStateException("Value cannot be converted to short: " + jsonValue.f2952a);
            }
            sArr[i] = parseShort;
            i++;
        }
        return sArr;
    }

    public final /* synthetic */ Iterator iterator() {
        return m2280o();
    }

    /* renamed from: j */
    public final boolean m2275j() {
        return this.f2952a == ValueType.array;
    }

    /* renamed from: k */
    public final boolean m2276k() {
        return this.f2952a == ValueType.object;
    }

    /* renamed from: l */
    public final boolean m2277l() {
        return this.f2952a == ValueType.stringValue;
    }

    /* renamed from: m */
    public final boolean m2278m() {
        return this.f2952a == ValueType.doubleValue || this.f2952a == ValueType.longValue;
    }

    /* renamed from: n */
    public final boolean m2279n() {
        return this.f2952a == ValueType.booleanValue;
    }

    /* renamed from: o */
    public final C0665a m2280o() {
        return new C0665a(this);
    }

    /* renamed from: p */
    public final String m2281p() {
        if (this.f2960i == null) {
            return this.f2952a == ValueType.array ? "[]" : this.f2952a == ValueType.object ? "{}" : "";
        } else {
            String str;
            if (this.f2960i.f2952a == ValueType.array) {
                str = "[]";
                int i = 0;
                JsonValue jsonValue = this.f2960i.f2957f;
                while (jsonValue != null) {
                    if (jsonValue == this) {
                        str = "[" + i + "]";
                        break;
                    }
                    jsonValue = jsonValue.f2958g;
                    i++;
                }
            } else {
                str = this.f2956e.indexOf(46) != -1 ? ".\"" + this.f2956e.replace("\"", "\\\"") + "\"" : "." + this.f2956e;
            }
            return this.f2960i.m2281p() + str;
        }
    }

    public final String toString() {
        if (m2256r()) {
            return this.f2956e == null ? m2260a() : this.f2956e + ": " + m2260a();
        } else {
            StringBuilder append = new StringBuilder().append(this.f2956e == null ? "" : this.f2956e + ": ");
            OutputType outputType = OutputType.minimal;
            C0666b c0666b = new C0666b();
            c0666b.f2949a = outputType;
            c0666b.f2950b = 0;
            ac acVar = new ac(512);
            m2251a(this, acVar, 0, c0666b);
            return append.append(acVar.toString()).toString();
        }
    }
}
