package com.badlogic.gdx.scenes.scene2d.utils;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.p017d.C0368a;
import com.badlogic.gdx.p017d.C0368a.C0364a;
import com.badlogic.gdx.scenes.scene2d.C0586c;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0603d;
import com.badlogic.gdx.scenes.scene2d.InputEvent;

/* renamed from: com.badlogic.gdx.scenes.scene2d.utils.a */
public class C0631a implements C0603d {
    /* renamed from: b */
    static final Vector2 f2837b = new Vector2();
    /* renamed from: c */
    static final Vector2 f2838c = new Vector2();
    /* renamed from: d */
    public final C0368a f2839d;
    /* renamed from: e */
    InputEvent f2840e;
    /* renamed from: f */
    C0602b f2841f;
    /* renamed from: g */
    C0602b f2842g;

    /* renamed from: com.badlogic.gdx.scenes.scene2d.utils.a$1 */
    class C06531 extends C0364a {
        /* renamed from: a */
        final /* synthetic */ C0631a f2916a;
        /* renamed from: b */
        private final Vector2 f2917b = new Vector2();
        /* renamed from: c */
        private final Vector2 f2918c = new Vector2();
        /* renamed from: d */
        private final Vector2 f2919d = new Vector2();
        /* renamed from: e */
        private final Vector2 f2920e = new Vector2();

        C06531(C0631a c0631a) {
            this.f2916a = c0631a;
        }

        /* renamed from: a */
        private void m2206a(Vector2 vector2) {
            this.f2916a.f2841f.m1932a(vector2);
            vector2.m1704b(this.f2916a.f2841f.m1932a(C0631a.f2838c.m1701a(0.0f, 0.0f)));
        }

        /* renamed from: a */
        public final boolean mo324a() {
            InputEvent inputEvent = this.f2916a.f2840e;
            C0631a.m2144c();
            return true;
        }

        /* renamed from: a */
        public final boolean mo325a(float f, float f2) {
            this.f2916a.f2841f.m1932a(C0631a.f2837b.m1701a(f, f2));
            InputEvent inputEvent = this.f2916a.f2840e;
            float f3 = C0631a.f2837b.f2337x;
            f3 = C0631a.f2837b.f2338y;
            C0631a.m2142a();
            return true;
        }

        /* renamed from: a */
        public final boolean mo326a(float f, float f2, float f3, float f4) {
            m2206a(C0631a.f2837b.m1701a(f3, f4));
            float f5 = C0631a.f2837b.f2337x;
            float f6 = C0631a.f2837b.f2338y;
            this.f2916a.f2841f.m1932a(C0631a.f2837b.m1701a(f, f2));
            C0631a c0631a = this.f2916a;
            InputEvent inputEvent = this.f2916a.f2840e;
            float f7 = C0631a.f2837b.f2337x;
            f7 = C0631a.f2837b.f2338y;
            c0631a.mo507a(f5, f6);
            return true;
        }

        /* renamed from: a */
        public final boolean mo327a(Vector2 vector2, Vector2 vector22, Vector2 vector23, Vector2 vector24) {
            this.f2916a.f2841f.m1932a(this.f2917b.m1702a(vector2));
            this.f2916a.f2841f.m1932a(this.f2918c.m1702a(vector22));
            this.f2916a.f2841f.m1932a(this.f2919d.m1702a(vector23));
            this.f2916a.f2841f.m1932a(this.f2920e.m1702a(vector24));
            InputEvent inputEvent = this.f2916a.f2840e;
            C0631a.m2145d();
            return true;
        }

        /* renamed from: b */
        public final boolean mo328b(float f, float f2) {
            this.f2916a.f2841f.m1932a(C0631a.f2837b.m1701a(f, f2));
            C0602b c0602b = this.f2916a.f2841f;
            float f3 = C0631a.f2837b.f2337x;
            f3 = C0631a.f2837b.f2338y;
            return C0631a.m2143b();
        }

        /* renamed from: c */
        public final boolean mo329c(float f, float f2) {
            m2206a(C0631a.f2837b.m1701a(f, f2));
            C0631a c0631a = this.f2916a;
            InputEvent inputEvent = this.f2916a.f2840e;
            c0631a.mo508b(C0631a.f2837b.f2337x, C0631a.f2837b.f2338y);
            return true;
        }
    }

    public C0631a() {
        this((byte) 0);
    }

    private C0631a(byte b) {
        this.f2839d = new C0368a(new C06531(this));
    }

    /* renamed from: a */
    public static void m2142a() {
    }

    /* renamed from: b */
    public static boolean m2143b() {
        return false;
    }

    /* renamed from: c */
    public static void m2144c() {
    }

    /* renamed from: d */
    public static void m2145d() {
    }

    /* renamed from: a */
    public void mo507a(float f, float f2) {
    }

    /* renamed from: a */
    public boolean mo477a(C0586c c0586c) {
        if (!(c0586c instanceof InputEvent)) {
            return false;
        }
        InputEvent inputEvent = (InputEvent) c0586c;
        float f;
        switch (inputEvent.f2559i) {
            case touchDown:
                this.f2841f = inputEvent.f2553c;
                this.f2842g = inputEvent.f2552b;
                this.f2839d.m1059a(inputEvent.f2560j, inputEvent.f2561k, inputEvent.f2562l);
                this.f2841f.m1932a(f2837b.m1701a(inputEvent.f2560j, inputEvent.f2561k));
                f = f2837b.f2337x;
                f = f2837b.f2338y;
                return true;
            case touchUp:
                boolean z = inputEvent.f2560j == -2.14748365E9f || inputEvent.f2561k == -2.14748365E9f;
                if (z) {
                    return false;
                }
                this.f2840e = inputEvent;
                this.f2841f = inputEvent.f2553c;
                this.f2839d.m1060a(inputEvent.f2560j, inputEvent.f2561k, inputEvent.f2562l, inputEvent.f2563m);
                this.f2841f.m1932a(f2837b.m1701a(inputEvent.f2560j, inputEvent.f2561k));
                f = f2837b.f2337x;
                f = f2837b.f2338y;
                return true;
            case touchDragged:
                this.f2840e = inputEvent;
                this.f2841f = inputEvent.f2553c;
                this.f2839d.m1063b(inputEvent.f2560j, inputEvent.f2561k, inputEvent.f2562l);
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public void mo508b(float f, float f2) {
    }
}
