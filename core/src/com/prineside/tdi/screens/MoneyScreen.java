package com.prineside.tdi.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.pay.C0584g;
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
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0712r;
import com.badlogic.gdx.utils.p034b.C0684b;
import com.prineside.tdi.Game;
import com.prineside.tdi.GameListener;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.utility.MaterialColor.GREEN;
import com.prineside.tdi.utility.MaterialColor.LIGHT_BLUE;
import java.util.Iterator;
import java.util.Locale;

public class MoneyScreen extends AbstractScreen implements GameListener {
    /* renamed from: b */
    private C0684b f7552b = new C0684b();
    /* renamed from: c */
    private C0609g f7553c;
    /* renamed from: d */
    private Screen f7554d;
    /* renamed from: e */
    private C0629f f7555e;
    /* renamed from: f */
    private C0605e f7556f;
    /* renamed from: g */
    private C0629f f7557g;

    /* renamed from: com.prineside.tdi.screens.MoneyScreen$2 */
    class C11562 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ MoneyScreen f7548a;

        C11562(MoneyScreen moneyScreen) {
            this.f7548a = moneyScreen;
        }

        /* renamed from: b */
        public final void mo500b() {
            Sound.m7569a(Type.CLICK);
            C0584g.m1872a("double_gain");
            Game.game.m7466h();
            Game.game.m7469l();
        }
    }

    /* renamed from: com.prineside.tdi.screens.MoneyScreen$3 */
    class C11573 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ MoneyScreen f7549a;

        C11573(MoneyScreen moneyScreen) {
            this.f7549a = moneyScreen;
        }

        /* renamed from: b */
        public final void mo500b() {
            Sound.m7569a(Type.CLICK);
            C0584g.m1872a("pack_small");
            Game.game.m7466h();
            Game.game.m7469l();
        }
    }

    /* renamed from: com.prineside.tdi.screens.MoneyScreen$4 */
    class C11584 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ MoneyScreen f7550a;

        C11584(MoneyScreen moneyScreen) {
            this.f7550a = moneyScreen;
        }

        /* renamed from: b */
        public final void mo500b() {
            Sound.m7569a(Type.CLICK);
            C0584g.m1872a("pack_medium");
            Game.game.m7466h();
            Game.game.m7469l();
        }
    }

    /* renamed from: com.prineside.tdi.screens.MoneyScreen$5 */
    class C11595 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ MoneyScreen f7551a;

        C11595(MoneyScreen moneyScreen) {
            this.f7551a = moneyScreen;
        }

        /* renamed from: b */
        public final void mo500b() {
            Sound.m7569a(Type.CLICK);
            C0584g.m1872a("pack_large");
            Game.game.m7466h();
            Game.game.m7469l();
        }
    }

    public MoneyScreen(Screen screen) {
        this.f7554d = screen;
        C0628a c0628a = new C0628a(Game.game.m7463g(60), C0430b.f1620c);
        C0645h c0645h = new C0645h();
        c0645h.m2192a(Game.game.f6561E);
        this.f7553c = new C0609g(this.f7552b);
        C0602b table = new Table();
        table.mo487a(false);
        table.f2677Y = true;
        this.f7553c.m2004a(table);
        C0602b table2 = new Table();
        table.m2059d(table2).m2104i().m2096e().m2102h().m2093c(64.0f).m2097e(80.0f).m2103h(80.0f);
        this.f7555e = new C0629f(String.valueOf(Game.game.f6590w.m8800a()), c0628a);
        this.f7555e.m2127a(16);
        table2.m2059d(this.f7555e).m2085a(320.0f, 64.0f).m2103h(56.0f);
        table2.m2059d(new C0625d(c0645h.m2197c("main-menu-icon-money"))).m2085a(64.0f, 64.0f);
        table.m2066q();
        final C0430b c0430b = C0430b.f1620c;
        final C0430b c0430b2 = LIGHT_BLUE.f8525f;
        C0602b c0605e = new C0605e();
        c0605e.m1956c(400.0f, 96.0f);
        c0605e.f2610d = Touchable.enabled;
        table.m2059d(c0605e).m2099f(80.0f).m2101g(64.0f).m2104i().m2100g().m2098f();
        table2 = new C0625d(c0645h.m2197c("icon-triangle-left"));
        table2.m1956c(64.0f, 64.0f);
        table2.m1935a(0.0f, 16.0f);
        table2.m1937a(c0430b);
        c0605e.mo510b(table2);
        final C0602b c0629f = new C0629f(Game.f6551e.m2416a("back"), c0628a);
        c0629f.m1956c(336.0f, 96.0f);
        c0629f.m1935a(124.0f, 0.0f);
        c0629f.m1937a(c0430b);
        c0605e.mo510b(c0629f);
        c0605e.m1947a(new C0607f(this) {
            /* renamed from: e */
            final /* synthetic */ MoneyScreen f7547e;

            /* renamed from: a */
            public final void mo495a(int i) {
                table2.m1937a(c0430b2);
                c0629f.m1937a(c0430b2);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                this.f7547e.m8138j();
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                table2.m1937a(c0430b);
                c0629f.m1937a(c0430b);
            }
        });
        C0602b table3 = new Table();
        table3.f2677Y = true;
        table3.mo487a(false);
        this.f7553c.m2004a(table3);
        C0628a c0628a2 = new C0628a(Game.game.m7463g(60), C0430b.f1620c);
        C0628a c0628a3 = new C0628a(Game.game.m7463g(36), C0430b.f1620c);
        C0628a c0628a4 = new C0628a(Game.game.m7463g(48), C0430b.f1620c);
        c0629f = new C0605e();
        table3.m2059d(c0629f).m2090b(945.0f).m2093c(390.0f);
        C0602b c0625d = new C0625d(c0645h.m2197c("money-pack-double-gain"));
        c0625d.m1935a(67.0f, 67.0f);
        c0625d.m1956c(256.0f, 256.0f);
        c0629f.mo510b(c0625d);
        c0625d = new C0629f("Double gain", c0628a2);
        c0625d.m1935a(400.0f, 248.0f);
        c0629f.mo510b(c0625d);
        c0605e = new C0629f("Double gain description", c0628a3);
        c0605e.m1935a(400.0f, 200.0f);
        c0629f.mo510b(c0605e);
        this.f7557g = new C0629f(Game.f6551e.m2416a("money_installed"), c0628a4);
        this.f7557g.m1937a(GREEN.f8487f);
        this.f7557g.m1955c(323.0f);
        this.f7557g.m1959d(101.0f);
        this.f7557g.m1935a(400.0f, 67.0f);
        c0629f.mo510b(this.f7557g);
        this.f7556f = new C0605e();
        this.f7556f.m1955c(323.0f);
        this.f7556f.m1959d(101.0f);
        this.f7556f.m1935a(400.0f, 67.0f);
        c0629f.mo510b(this.f7556f);
        if (Game.game.f6593z) {
            this.f7556f.f2611e = false;
            this.f7557g.f2611e = true;
        } else {
            this.f7556f.f2611e = true;
            this.f7557g.f2611e = false;
        }
        c0629f = new C0625d(c0645h.m2197c("money-pack-button"));
        c0629f.m1956c(323.0f, 101.0f);
        this.f7556f.mo510b(c0629f);
        c0629f = new C0629f("$2.99", c0628a4);
        c0629f.m1956c(323.0f, 101.0f);
        c0629f.m2127a(1);
        this.f7556f.mo510b(c0629f);
        this.f7556f.f2610d = Touchable.enabled;
        this.f7556f.m1947a(new C11562(this));
        C0602b c0605e2 = new C0605e();
        table3.m2059d(c0605e2).m2090b(945.0f).m2093c(390.0f);
        C0602b c0625d2 = new C0625d(c0645h.m2197c("money-pack-small"));
        c0625d2.m1935a(67.0f, 67.0f);
        c0625d2.m1956c(256.0f, 256.0f);
        c0605e2.mo510b(c0625d2);
        c0625d2 = new C0629f("Small pack", c0628a2);
        c0625d2.m1935a(400.0f, 248.0f);
        c0605e2.mo510b(c0625d2);
        C0602b c0629f2 = new C0629f("Small pack description", c0628a3);
        c0629f2.m1935a(400.0f, 200.0f);
        c0605e2.mo510b(c0629f2);
        C0602b c0605e3 = new C0605e();
        c0605e3.m1955c(323.0f);
        c0605e3.m1959d(101.0f);
        c0605e3.m1935a(400.0f, 67.0f);
        c0605e2.mo510b(c0605e3);
        c0605e2 = new C0625d(c0645h.m2197c("money-pack-button"));
        c0605e2.m1956c(323.0f, 101.0f);
        c0605e3.mo510b(c0605e2);
        c0605e2 = new C0629f("$0.99", c0628a4);
        c0605e2.m1956c(323.0f, 101.0f);
        c0605e2.m2127a(1);
        c0605e3.mo510b(c0605e2);
        c0605e3.f2610d = Touchable.enabled;
        c0605e3.m1947a(new C11573(this));
        table3.m2066q();
        c0605e3 = new C0605e();
        table3.m2059d(c0605e3).m2090b(945.0f).m2093c(390.0f);
        C0602b c0625d3 = new C0625d(c0645h.m2197c("money-pack-medium"));
        c0625d3.m1935a(67.0f, 67.0f);
        c0625d3.m1956c(256.0f, 256.0f);
        c0605e3.mo510b(c0625d3);
        c0625d3 = new C0629f("Medium pack", c0628a2);
        c0625d3.m1935a(400.0f, 248.0f);
        c0605e3.mo510b(c0625d3);
        C0602b c0629f3 = new C0629f("Medium pack description", c0628a3);
        c0629f3.m1935a(400.0f, 200.0f);
        c0605e3.mo510b(c0629f3);
        C0602b c0605e4 = new C0605e();
        c0605e4.m1955c(323.0f);
        c0605e4.m1959d(101.0f);
        c0605e4.m1935a(400.0f, 67.0f);
        c0605e3.mo510b(c0605e4);
        c0605e3 = new C0625d(c0645h.m2197c("money-pack-button"));
        c0605e3.m1956c(323.0f, 101.0f);
        c0605e4.mo510b(c0605e3);
        c0605e3 = new C0629f("$4.99", c0628a4);
        c0605e3.m1956c(323.0f, 101.0f);
        c0605e3.m2127a(1);
        c0605e4.mo510b(c0605e3);
        c0605e4.f2610d = Touchable.enabled;
        c0605e4.m1947a(new C11584(this));
        c0605e4 = new C0605e();
        table3.m2059d(c0605e4).m2090b(945.0f).m2093c(390.0f);
        table3 = new C0625d(c0645h.m2197c("money-pack-large"));
        table3.m1935a(67.0f, 67.0f);
        table3.m1956c(256.0f, 256.0f);
        c0605e4.mo510b(table3);
        C0602b c0629f4 = new C0629f("Large pack", c0628a2);
        c0629f4.m1935a(400.0f, 248.0f);
        c0605e4.mo510b(c0629f4);
        c0629f4 = new C0629f("Large pack description", c0628a3);
        c0629f4.m1935a(400.0f, 200.0f);
        c0605e4.mo510b(c0629f4);
        table3 = new C0605e();
        table3.m1955c(323.0f);
        table3.m1959d(101.0f);
        table3.m1935a(400.0f, 67.0f);
        c0605e4.mo510b(table3);
        table = new C0625d(c0645h.m2197c("money-pack-button"));
        table.m1956c(323.0f, 101.0f);
        table3.mo510b(table);
        table = new C0629f("$19.99", c0628a4);
        table.m1956c(323.0f, 101.0f);
        table.m2127a(1);
        table3.mo510b(table);
        table3.f2610d = Touchable.enabled;
        table3.m1947a(new C11595(this));
        if (Game.game.f6579k) {
            try {
                int length;
                String str;
                c0629f.m2130a(C0584g.m1873b("double_gain").f2465d);
                c0605e2.m2130a(C0584g.m1873b("pack_small").f2465d);
                c0605e3.m2130a(C0584g.m1873b("pack_medium").f2465d);
                table.m2130a(C0584g.m1873b("pack_large").f2465d);
                C0676a c0676a = new C0676a();
                c0676a.m2296a(C0584g.m1873b("double_gain").f2463b);
                c0676a.m2296a(C0584g.m1873b("pack_small").f2463b);
                c0676a.m2296a(C0584g.m1873b("pack_medium").f2463b);
                c0676a.m2296a(C0584g.m1873b("pack_large").f2463b);
                c0676a.m2296a(C0584g.m1873b("double_gain").f2464c);
                c0676a.m2296a(C0584g.m1873b("pack_small").f2464c);
                c0676a.m2296a(C0584g.m1873b("pack_medium").f2464c);
                c0676a.m2296a(C0584g.m1873b("pack_large").f2464c);
                C0712r c0712r = new C0712r();
                for (char valueOf : Game.game.f6567K.toCharArray()) {
                    c0712r.m2486a(Character.valueOf(valueOf));
                }
                Iterator it = c0676a.iterator();
                while (it.hasNext()) {
                    str = (String) it.next();
                    length = str.length();
                    int i = 0;
                    while (i < length) {
                        if (str.charAt(i) == ' ' || c0712r.m2490c(Character.valueOf(str.charAt(i)))) {
                            i++;
                        } else {
                            throw new RuntimeException("MoneyScreen - Bad char '" + str.charAt(i) + "' " + str.charAt(i) + " in \"" + str + "\", fallback to defaults");
                        }
                    }
                }
                str = C0584g.m1873b("double_gain").f2463b;
                c0625d.m2130a(str.substring(0, str.indexOf(40)));
                str = C0584g.m1873b("pack_small").f2463b;
                c0625d2.m2130a(str.substring(0, str.indexOf(40)));
                str = C0584g.m1873b("pack_medium").f2463b;
                c0625d3.m2130a(str.substring(0, str.indexOf(40)));
                str = C0584g.m1873b("pack_large").f2463b;
                c0629f4.m2130a(str.substring(0, str.indexOf(40)));
                c0605e.m2130a(C0584g.m1873b("double_gain").f2464c);
                c0629f2.m2130a(C0584g.m1873b("pack_small").f2464c);
                c0629f3.m2130a(C0584g.m1873b("pack_medium").f2464c);
                c0629f4.m2130a(C0584g.m1873b("pack_large").f2464c);
            } catch (Exception e) {
                Game.game.logger.log("MoneyScreen", "Fallback to default names: " + e.getMessage());
                c0625d.m2130a((CharSequence) "Double Gain");
                c0625d2.m2130a((CharSequence) "Small Pack");
                c0625d3.m2130a((CharSequence) "Medium Pack");
                c0629f4.m2130a((CharSequence) "Large Pack");
                c0605e.m2130a((CharSequence) "x2 prizes for each game!");
                c0629f2.m2130a((CharSequence) "25,000 green papers!");
                c0629f3.m2130a((CharSequence) "200,000 green papers!");
                c0629f4.m2130a((CharSequence) "1,000,000 green papers!");
            }
        }
        mo1713c();
        Game.game.m7450a((GameListener) this);
    }

    /* renamed from: j */
    private void m8138j() {
        Sound.m7569a(Type.NO);
        Game.game.m7455b((GameListener) this);
        if (this.f7554d instanceof MoneyScreen) {
            Game.game.m7473p();
        } else {
            Game.game.setScreen(this.f7554d);
        }
    }

    /* renamed from: a */
    public final void mo1712a() {
    }

    /* renamed from: a */
    public final void resize(int i, int i2) {
        super.resize(i, i2);
        this.f7552b.f3064a = 1200.0f / ((float) Gdx.graphics.mo295d());
        this.f7552b.mo522a(i, i2);
    }

    /* renamed from: b */
    public final void mo1781b(float f) {
        if (Gdx.input.mo307b(4) || Gdx.input.mo307b(131)) {
            m8138j();
        }
        this.f7553c.m2015c();
        this.f7553c.m2001a();
    }

    /* renamed from: c */
    public final void mo1713c() {
        this.f7555e.m2130a(String.format(Locale.ENGLISH, "%,d", new Object[]{Integer.valueOf(Game.game.f6590w.m8800a())}));
    }

    /* renamed from: d */
    public final void mo1778d() {
        Game.game.m7455b((GameListener) this);
    }

    /* renamed from: e */
    public final void mo1714e() {
    }

    /* renamed from: f */
    public final void mo1715f() {
        this.f7556f.f2611e = false;
        this.f7557g.f2611e = true;
    }

    /* renamed from: g */
    public final void mo1716g() {
    }

    /* renamed from: h */
    public final void mo1717h() {
        Game.game.f6584p = false;
    }

    /* renamed from: i */
    public final void mo1718i() {
        Game.game.f6584p = false;
    }

    public final void j_() {
        Gdx.input.mo304a(this.f7553c);
    }

    public final void k_() {
        Game.game.m7473p();
        Game.game.m7470m();
    }
}
