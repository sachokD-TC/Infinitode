package com.badlogic.gdx.utils;

import java.io.Writer;
import java.util.regex.Pattern;

public final class JsonWriter extends Writer {
    /* renamed from: a */
    final Writer f2972a;
    /* renamed from: b */
    private final C0676a<C0668a> f2973b;
    /* renamed from: c */
    private C0668a f2974c;
    /* renamed from: d */
    private boolean f2975d;

    /* renamed from: com.badlogic.gdx.utils.JsonWriter$1 */
    static /* synthetic */ class C06671 {
        /* renamed from: a */
        static final /* synthetic */ int[] f2962a = new int[OutputType.values().length];

        static {
            try {
                f2962a[OutputType.minimal.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f2962a[OutputType.javascript.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    public enum OutputType {
        json,
        javascript,
        minimal;
        
        /* renamed from: d */
        static Pattern f2966d;
        /* renamed from: e */
        static Pattern f2967e;
        /* renamed from: f */
        static Pattern f2968f;

        static {
            f2966d = Pattern.compile("^[a-zA-Z_$][a-zA-Z_$0-9]*$");
            f2967e = Pattern.compile("^[^\":,}/ ][^:]*$");
            f2968f = Pattern.compile("^[^\":,{\\[\\]/ ][^}\\],]*$");
        }
    }

    /* renamed from: com.badlogic.gdx.utils.JsonWriter$a */
    private class C0668a {
        /* renamed from: a */
        final boolean f2970a;
        /* renamed from: b */
        final /* synthetic */ JsonWriter f2971b;
    }

    public final void close() {
        while (this.f2973b.f3001b > 0) {
            if (this.f2975d) {
                throw new IllegalStateException("Expected an object, array, or value since a name was set.");
            }
            C0668a c0668a = (C0668a) this.f2973b.mo523a();
            c0668a.f2971b.f2972a.write(c0668a.f2970a ? 93 : 125);
            this.f2974c = this.f2973b.f3001b == 0 ? null : (C0668a) this.f2973b.m2299b();
        }
        this.f2972a.close();
    }

    public final void flush() {
        this.f2972a.flush();
    }

    public final void write(char[] cArr, int i, int i2) {
        this.f2972a.write(cArr, i, i2);
    }
}
