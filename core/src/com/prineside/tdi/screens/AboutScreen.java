package com.prineside.tdi.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.C0607f;
import com.badlogic.gdx.scenes.scene2d.C0609g;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.C0625d;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f.C0628a;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.C0618d;
import com.badlogic.gdx.utils.p034b.C0684b;
import com.prineside.tdi.Game;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.utility.MaterialColor.LIGHT_BLUE;

public class AboutScreen extends AbstractScreen {
    /* renamed from: b */
    private final C0684b f7104b = new C0684b();
    /* renamed from: c */
    private final C0609g f7105c;

    /* renamed from: com.prineside.tdi.screens.AboutScreen$2 */
    class C10912 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ AboutScreen f7102a;

        C10912(AboutScreen aboutScreen) {
            this.f7102a = aboutScreen;
        }

        /* renamed from: b */
        public final void mo500b() {
            Gdx.net.mo314a("http://infinitode.prineside.com");
        }
    }

    public AboutScreen() {
        C0628a c0628a = new C0628a(Game.game.m7463g(60), C0430b.f1620c);
        C0645h c0645h = new C0645h();
        c0645h.m2192a(Game.game.f6561E);
        this.f7105c = new C0609g(this.f7104b);
        final C0430b c0430b = C0430b.f1620c;
        final C0430b c0430b2 = LIGHT_BLUE.f8525f;
        C0602b c0605e = new C0605e();
        c0605e.f2628r = false;
        c0605e.m1956c(400.0f, 96.0f);
        c0605e.m1935a(80.0f, 64.0f);
        c0605e.f2610d = Touchable.enabled;
        this.f7105c.m2004a(c0605e);
        final C0602b c0625d = new C0625d(c0645h.m2197c("icon-triangle-left"));
        c0625d.m1956c(64.0f, 64.0f);
        c0625d.m1935a(0.0f, 16.0f);
        c0625d.m1937a(c0430b);
        c0605e.mo510b(c0625d);
        final C0602b c0629f = new C0629f(Game.f6551e.m2416a("back"), c0628a);
        c0629f.m1956c(336.0f, 96.0f);
        c0629f.m1935a(124.0f, 0.0f);
        c0629f.m1937a(c0430b);
        c0605e.mo510b(c0629f);
        c0605e.m1947a(new C0607f(this) {
            /* renamed from: e */
            final /* synthetic */ AboutScreen f7101e;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0625d.m1937a(c0430b2);
                c0629f.m1937a(c0430b2);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                Sound.m7569a(Type.NO);
                Game.game.m7473p();
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0625d.m1937a(c0430b);
                c0629f.m1937a(c0430b);
            }
        });
        c0628a = new C0628a(Game.game.m7463g(60), C0430b.f1620c);
        C0628a c0628a2 = new C0628a(Game.game.m7463g(36), new C0430b(1.0f, 1.0f, 1.0f, 0.56f));
        c0625d = new Table();
        c0625d.mo487a(false);
        c0625d.f2677Y = true;
        this.f7105c.m2004a(c0625d);
        c0625d.m2059d(new C0625d(c0645h.m2197c("logo"))).m2101g(20.0f);
        c0625d.m2066q();
        c0625d.m2059d(new C0629f("Infinitode", new C0628a(Game.game.m7463g(60), C0430b.f1620c))).m2101g(40.0f);
        c0625d.m2066q();
        c0625d.m2059d(new C0629f(Game.f6551e.m2416a("about_version"), c0628a2)).m2093c(40.0f).m2097e(20.0f);
        c0625d.m2066q();
        c0625d.m2059d(new C0629f("0.53 (66)", c0628a)).m2093c(80.0f);
        c0625d.m2066q();
        c0625d.m2059d(new C0629f(Game.f6551e.m2416a("about_developer"), c0628a2)).m2093c(40.0f).m2097e(20.0f);
        c0625d.m2066q();
        c0625d.m2059d(new C0629f("Vadym Sakhno (therainycat)", c0628a)).m2093c(80.0f);
        c0625d.m2066q();
        c0625d.m2059d(new C0629f("web.prineside@gmail.com", new C0628a(Game.game.m7463g(36), C0430b.f1620c))).m2093c(60.0f).m2097e(60.0f);
        c0625d.m2066q();
        C0602b c0629f2 = new C0629f("infinitode.prineside.com", new C0628a(Game.game.m7463g(36), LIGHT_BLUE.f8525f));
        c0629f2.f2610d = Touchable.enabled;
        c0629f2.m1947a(new C10912(this));
        c0625d.m2059d(c0629f2).m2093c(60.0f);
        c0625d.m2066q();
    }

    /* renamed from: a */
    public final void resize(int i, int i2) {
        super.resize(i, i2);
        this.f7104b.f3064a = 1200.0f / ((float) Gdx.graphics.mo295d());
        this.f7104b.mo522a(i, i2);
    }

    /* renamed from: b */
    public final void mo1781b(float f) {
        if (Gdx.input.mo307b(4) || Gdx.input.mo307b(131)) {
            Game.game.m7473p();
        }
        this.f7105c.m2015c();
        this.f7105c.m2001a();
    }

    public final void j_() {
        Gdx.input.mo304a(this.f7105c);
    }
}
