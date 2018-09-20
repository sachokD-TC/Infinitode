package com.badlogic.gdx.scenes.scene2d;

import com.badlogic.gdx.math.Vector2;

/* renamed from: com.badlogic.gdx.scenes.scene2d.f */
public class C0607f implements C0603d {
    /* renamed from: a */
    private static final Vector2 f2634a = new Vector2();

    /* renamed from: a */
    public void mo495a(int i) {
    }

    /* renamed from: a */
    public void mo496a(InputEvent inputEvent, float f, float f2, int i) {
    }

    /* renamed from: a */
    public boolean mo506a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
        return false;
    }

    /* renamed from: a */
    public final boolean mo477a(C0586c c0586c) {
        if (!(c0586c instanceof InputEvent)) {
            return false;
        }
        InputEvent inputEvent = (InputEvent) c0586c;
        switch (inputEvent.f2559i) {
            case keyDown:
            case keyUp:
            case keyTyped:
                return false;
            default:
                C0602b c0602b = inputEvent.f2553c;
                Vector2 vector2 = f2634a;
                vector2.m1701a(inputEvent.f2560j, inputEvent.f2561k);
                c0602b.m1932a(vector2);
                float f;
                float f2;
                switch (inputEvent.f2559i) {
                    case touchDown:
                        return mo497a(inputEvent, f2634a.f2337x, f2634a.f2338y, inputEvent.f2562l, inputEvent.f2563m);
                    case touchUp:
                        mo499b(inputEvent, f2634a.f2337x, f2634a.f2338y, inputEvent.f2562l, inputEvent.f2563m);
                        return true;
                    case touchDragged:
                        mo496a(inputEvent, f2634a.f2337x, f2634a.f2338y, inputEvent.f2562l);
                        return true;
                    case mouseMoved:
                        f = f2634a.f2337x;
                        f = f2634a.f2338y;
                        return mo506a();
                    case scrolled:
                        f = f2634a.f2337x;
                        f = f2634a.f2338y;
                        return mo509c(inputEvent.f2565o);
                    case enter:
                        f2 = f2634a.f2337x;
                        f2 = f2634a.f2338y;
                        mo495a(inputEvent.f2562l);
                        return false;
                    case exit:
                        f2 = f2634a.f2337x;
                        f2 = f2634a.f2338y;
                        mo498b(inputEvent.f2562l);
                        return false;
                    default:
                        return false;
                }
        }
    }

    /* renamed from: b */
    public void mo498b(int i) {
    }

    /* renamed from: b */
    public void mo499b(InputEvent inputEvent, float f, float f2, int i, int i2) {
    }

    /* renamed from: c */
    public boolean mo509c(int i) {
        return false;
    }
}
