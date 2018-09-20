package com.badlogic.gdx;

import com.badlogic.gdx.graphics.C0284f;

/* renamed from: com.badlogic.gdx.e */
public interface C0326e {

    /* renamed from: com.badlogic.gdx.e$b */
    public static class C0324b {
        /* renamed from: a */
        public final int f1136a;
        /* renamed from: b */
        public final int f1137b;
        /* renamed from: c */
        public final int f1138c = 0;
        /* renamed from: d */
        public final int f1139d = 0;

        public C0324b(int i, int i2) {
            this.f1136a = i;
            this.f1137b = i2;
        }

        public String toString() {
            return this.f1136a + "x" + this.f1137b + ", bpp: " + this.f1139d + ", hz: " + this.f1138c;
        }
    }

    /* renamed from: com.badlogic.gdx.e$a */
    public static class C0370a {
        /* renamed from: a */
        public final int f1329a;
        /* renamed from: b */
        public final int f1330b;
        /* renamed from: c */
        public final int f1331c;
        /* renamed from: d */
        public final int f1332d;
        /* renamed from: e */
        public final int f1333e;
        /* renamed from: f */
        public final int f1334f;
        /* renamed from: g */
        public final int f1335g;
        /* renamed from: h */
        public final boolean f1336h;

        public C0370a(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
            this.f1329a = i;
            this.f1330b = i2;
            this.f1331c = i3;
            this.f1332d = i4;
            this.f1333e = i5;
            this.f1334f = i6;
            this.f1335g = i7;
            this.f1336h = z;
        }

        public final String toString() {
            return "r: " + this.f1329a + ", g: " + this.f1330b + ", b: " + this.f1331c + ", a: " + this.f1332d + ", depth: " + this.f1333e + ", stencil: " + this.f1334f + ", num samples: " + this.f1335g + ", coverage sampling: " + this.f1336h;
        }
    }

    /* renamed from: a */
    boolean mo291a();

    /* renamed from: a */
    boolean mo292a(String str);

    /* renamed from: b */
    C0284f mo293b();

    /* renamed from: c */
    int mo294c();

    /* renamed from: d */
    int mo295d();

    /* renamed from: e */
    int mo296e();

    /* renamed from: f */
    int mo297f();

    /* renamed from: g */
    float getDeltaTime();

    /* renamed from: h */
    C0324b mo299h();

    /* renamed from: i */
    void mo300i();
}
