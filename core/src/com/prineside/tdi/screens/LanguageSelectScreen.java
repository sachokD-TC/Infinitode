package com.prineside.tdi.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.C0607f;
import com.badlogic.gdx.scenes.scene2d.C0609g;
import com.badlogic.gdx.scenes.scene2d.ui.C0625d;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f.C0628a;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.C0618d;
import com.badlogic.gdx.utils.p034b.C0684b;
import com.prineside.tdi.Game;
import com.prineside.tdi.Language;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.utility.MaterialColor.LIGHT_BLUE;
import java.util.Iterator;

public class LanguageSelectScreen extends AbstractScreen {
    /* renamed from: b */
    private C0684b f7263b = new C0684b();
    /* renamed from: c */
    private C0609g f7264c;

    public LanguageSelectScreen() {
        int i = 0;
        C0628a c0628a = new C0628a(Game.game.m7463g(60), C0430b.f1620c);
        C0645h c0645h = new C0645h();
        c0645h.m2192a(Game.game.f6561E);
        this.f7264c = new C0609g(this.f7263b);
        C0602b table = new Table();
        table.mo487a(false);
        table.f2677Y = true;
        this.f7264c.m2004a(table);
        C0602b c0605e = new C0605e();
        c0605e.f2628r = false;
        c0605e.m1956c(600.0f, 64.0f);
        table.m2059d(c0605e).m2104i().m2096e().m2098f().m2097e(80.0f);
        C0430b c0430b = new C0430b(0.5f, 0.5f, 0.5f, 1.0f);
        C0602b c0625d = new C0625d(c0645h.m2197c("main-menu-icon-language"));
        c0625d.m1956c(64.0f, 64.0f);
        c0625d.m1935a(80.0f, 0.0f);
        c0625d.m1937a(c0430b);
        c0605e.mo510b(c0625d);
        C0602b c0629f = new C0629f("Language", c0628a);
        c0629f.m1956c(320.0f, 64.0f);
        c0629f.m1935a(204.0f, 0.0f);
        c0629f.m1937a(c0430b);
        c0605e.mo510b(c0629f);
        table = new Table();
        table.mo487a(false);
        table.f2677Y = true;
        this.f7264c.m2004a(table);
        C0628a c0628a2 = new C0628a(Game.game.m7463g(48), C0430b.f1620c);
        int i2 = Language.f6744a.f3001b;
        int i3 = i2 > 10 ? 3 : i2 > 5 ? 2 : 1;
        Iterator it = Language.f6744a.iterator();
        while (it.hasNext()) {
            final Language language = (Language) it.next();
            final C0602b c0629f2 = new C0629f(language.f6745b, c0628a2);
            c0629f2.m2127a(1);
            table.m2059d(c0629f2).m2085a(460.0f, 120.0f);
            c0629f2.m1947a(new C0607f(this) {
                /* renamed from: b */
                final /* synthetic */ LanguageSelectScreen f7260b;

                /* renamed from: a */
                public final void mo495a(int i) {
                    c0629f2.m1937a(LIGHT_BLUE.f8525f);
                }

                /* renamed from: b */
                public final void mo498b(int i) {
                    c0629f2.m1937a(C0430b.f1620c);
                }
            });
            c0629f2.m1947a(new C0618d(this) {
                /* renamed from: f */
                final /* synthetic */ LanguageSelectScreen f7262f;

                /* renamed from: b */
                public final void mo500b() {
                    Game.game.m7451a(language.f6746c);
                    Game.game.m7473p();
                    Sound.m7569a(Type.SUCCESS);
                }
            });
            i2 = i + 1;
            if (i2 % i3 == 0) {
                table.m2066q();
            }
            i = i2;
        }
    }

    /* renamed from: a */
    public final void resize(int i, int i2) {
        super.resize(i, i2);
        this.f7263b.f3064a = 1200.0f / ((float) Gdx.graphics.mo295d());
        this.f7263b.mo522a(i, i2);
    }

    /* renamed from: b */
    public final void mo1781b(float f) {
        this.f7264c.m2015c();
        this.f7264c.m2001a();
    }

    public final void j_() {
        Gdx.input.mo304a(this.f7264c);
    }
}
