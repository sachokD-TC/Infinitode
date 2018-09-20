package com.prineside.tdi.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0438n;
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
import com.badlogic.gdx.utils.p034b.C0684b;
import com.prineside.tdi.Game;
import com.prineside.tdi.Game.GameMode;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgrade.FilteringMode;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.screens.components.GameOverProperties;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.utility.MaterialColor.AMBER;
import com.prineside.tdi.utility.MaterialColor.RED;
import com.prineside.tdi.utility.StringFormatter;
import java.util.Iterator;
import java.util.Locale;

public class GameOverScreen extends AbstractScreen {
    /* renamed from: b */
    C0684b f7120b;
    /* renamed from: c */
    final C0628a f7121c;
    /* renamed from: d */
    private C0609g f7122d;
    /* renamed from: e */
    private C0438n f7123e = Game.game.f6561E.m1442a("logo-with-title");
    /* renamed from: f */
    private GameOverProperties f7124f;
    /* renamed from: g */
    private MenuItem[] f7125g;

    /* renamed from: com.prineside.tdi.screens.GameOverScreen$2 */
    class C10932 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ GameOverScreen f7108a;

        C10932(GameOverScreen gameOverScreen) {
            this.f7108a = gameOverScreen;
        }

        public void run() {
            Game.game.m7473p();
        }
    }

    private class MenuItem {
        /* renamed from: a */
        final C0430b f7112a = new C0430b(12375295);
        /* renamed from: b */
        final C0430b f7113b = C0430b.f1620c.m1222c();
        /* renamed from: c */
        final C0430b f7114c = new C0430b(-171);
        /* renamed from: d */
        public C0605e f7115d = new C0605e();
        /* renamed from: e */
        public C0629f f7116e;
        /* renamed from: f */
        final /* synthetic */ GameOverScreen f7117f;
        /* renamed from: g */
        private boolean f7118g = true;
        /* renamed from: h */
        private C0625d f7119h;

        public MenuItem(final GameOverScreen gameOverScreen, C0645h c0645h, String str, String str2, final Runnable runnable) {
            this.f7117f = gameOverScreen;
            this.f7115d.m1956c(600.0f, 96.0f);
            this.f7119h = new C0625d(c0645h.m2197c(str2));
            this.f7119h.m1956c(64.0f, 64.0f);
            this.f7119h.m1935a(456.0f, 16.0f);
            this.f7119h.m1937a(this.f7113b);
            this.f7115d.mo510b(this.f7119h);
            this.f7116e = new C0629f(str, gameOverScreen.f7121c);
            this.f7116e.m1956c(400.0f, 96.0f);
            this.f7116e.m2127a(16);
            this.f7116e.m1937a(this.f7113b);
            this.f7115d.mo510b(this.f7116e);
            this.f7115d.f2610d = Touchable.enabled;
            this.f7115d.m1947a(new C0607f(this) {
                /* renamed from: c */
                final /* synthetic */ MenuItem f7111c;

                /* renamed from: a */
                public final void mo495a(int i) {
                    if (this.f7111c.f7118g) {
                        this.f7111c.f7119h.m1937a(this.f7111c.f7112a);
                        this.f7111c.f7116e.m1937a(this.f7111c.f7112a);
                    }
                }

                /* renamed from: a */
                public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                    Sound.m7569a(Type.SINGLE);
                    runnable.run();
                    return true;
                }

                /* renamed from: b */
                public final void mo498b(int i) {
                    if (this.f7111c.f7118g) {
                        this.f7111c.f7119h.m1937a(this.f7111c.f7113b);
                        this.f7111c.f7116e.m1937a(this.f7111c.f7113b);
                    }
                }
            });
        }
    }

    public GameOverScreen(final GameOverProperties gameOverProperties) {
        C0602b c0629f;
        CharSequence charSequence;
        GlobalUpgrade.m7491a(FilteringMode.NONE, null);
        C0645h c0645h = new C0645h();
        c0645h.m2192a(Game.game.f6561E);
        this.f7124f = gameOverProperties;
        this.f7120b = new C0684b();
        this.f7121c = new C0628a(Game.game.m7463g(60), C0430b.f1620c);
        this.f7122d = new C0609g(this.f7120b);
        C0602b table = new Table();
        table.mo487a(false);
        table.f2677Y = true;
        this.f7122d.m2004a(table);
        C0602b table2 = new Table();
        table2.f2677Y = true;
        this.f7122d.m2004a(table2);
        C0628a c0628a = new C0628a(Game.game.m7463g(36), new C0430b(1.0f, 1.0f, 1.0f, 0.56f));
        C0628a c0628a2 = new C0628a(Game.game.m7463g(60), new C0430b(1.0f, 1.0f, 1.0f, 1.0f));
        C0628a c0628a3 = new C0628a(Game.game.m7463g(48), new C0430b(AMBER.f8397f));
        if (gameOverProperties.f7721h == GameMode.BASIC_LEVELS) {
            c0629f = new C0629f(Game.f6551e.m2416a("level_select_level") + " " + gameOverProperties.f7722i.f6443c, new C0628a(Game.game.m7463g(48), C0430b.f1620c));
            c0629f.m2127a(1);
            table2.m2059d(c0629f).m2090b(1200.0f).m2093c(96.0f).m2086a(3);
            table2.m2066q();
        }
        if (gameOverProperties.f7718e) {
            c0629f = new C0629f(Game.f6551e.m2416a("hardcore_mode"), new C0628a(Game.game.m7463g(36), new C0430b(RED.f8609f)));
            c0629f.m2127a(1);
            table2.m2059d(c0629f).m2090b(1200.0f).m2093c(48.0f).m2086a(3).m2101g(24.0f);
            table2.m2066q();
        }
        if (gameOverProperties.f7725l) {
            c0629f = new C0629f(Game.f6551e.m2416a("game_over_new_global_highest_wave"), c0628a3);
            c0629f.m2127a(1);
            table2.m2059d(c0629f).m2090b(1200.0f).m2093c(96.0f).m2086a(3);
            table2.m2066q();
        }
        if (gameOverProperties.f7724k) {
            c0629f = new C0629f(Game.f6551e.m2416a("game_over_new_level_highest_wave"), c0628a3);
            c0629f.m2127a(1);
            table2.m2059d(c0629f).m2090b(1200.0f).m2093c(96.0f).m2086a(3);
            table2.m2066q();
        }
        table = new C0629f(Game.f6551e.m2416a("game_over_game_time"), c0628a);
        table.m2127a(16);
        table2.m2059d(table).m2090b(600.0f).m2093c(96.0f);
        table2.m2059d(new C0625d(c0645h.m2197c("main-menu-icon-clock"))).m2090b(64.0f).m2093c(64.0f).m2097e(16.0f).m2099f(48.0f).m2103h(48.0f);
        table = new C0629f(StringFormatter.m8847a(gameOverProperties.f7717d), c0628a2);
        table.m2127a(8);
        table2.m2059d(table).m2090b(600.0f).m2093c(96.0f);
        table2.m2066q();
        table = new C0629f(Game.f6551e.m2416a("game_over_completed_waves"), c0628a);
        table.m2127a(16);
        table2.m2059d(table).m2090b(600.0f).m2093c(96.0f);
        table2.m2059d(new C0625d(c0645h.m2197c("icon-waves"))).m2090b(64.0f).m2093c(64.0f).m2097e(16.0f).m2099f(48.0f).m2103h(48.0f);
        table = new C0629f(String.valueOf(gameOverProperties.f7714a), c0628a2);
        table.m2127a(8);
        table2.m2059d(table).m2090b(600.0f).m2093c(96.0f);
        table2.m2066q();
        table = new C0629f(Game.f6551e.m2416a("game_over_gained_money"), c0628a);
        table.m2127a(16);
        table2.m2059d(table).m2090b(600.0f).m2093c(96.0f);
        table2.m2059d(new C0625d(c0645h.m2197c("main-menu-icon-money"))).m2090b(64.0f).m2093c(64.0f).m2097e(16.0f).m2099f(48.0f).m2103h(48.0f);
        if (gameOverProperties.f7719f != 1.0f || Game.game.f6593z) {
            String format = String.format(Locale.ENGLISH, "%,d", new Object[]{Integer.valueOf(gameOverProperties.f7716c)});
            if (gameOverProperties.f7719f != 1.0f) {
                format = format + String.format(Locale.ENGLISH, " [#808080FF]x %.2f[]", new Object[]{Float.valueOf(gameOverProperties.f7719f)});
            }
            if (Game.game.f6593z) {
                format = format + " [#FFC107FF]x 2[]";
            }
            charSequence = format + String.format(Locale.ENGLISH, " = %,d", new Object[]{Integer.valueOf(gameOverProperties.f7715b)});
        } else {
            charSequence = String.format(Locale.ENGLISH, "%,d", new Object[]{Integer.valueOf(gameOverProperties.f7715b)});
        }
        c0629f = new C0629f(charSequence, c0628a2);
        c0629f.m2127a(8);
        table2.m2059d(c0629f).m2090b(600.0f).m2093c(96.0f);
        if (!(gameOverProperties.f7720g == null || gameOverProperties.f7720g.f3001b == 0)) {
            table2.m2066q();
            C0602b table3 = new Table();
            table2.m2059d(table3).m2086a(3).m2097e(30.0f);
            table = new C0629f(Game.f6551e.m2416a("game_over_gained_tiles"), c0628a);
            table.m2127a(1);
            table3.m2059d(table).m2086a(5);
            table3.m2066q();
            Iterator it = gameOverProperties.f7720g.iterator();
            int i = 0;
            while (it.hasNext()) {
                table = Tile.m8365a((Tile) it.next(), 100);
                table.m1956c(100.0f, 100.0f);
                table3.m2059d(table).m2099f(10.0f).m2103h(10.0f).m2097e(20.0f);
                int i2 = i + 1;
                if (i2 % 8 == 0) {
                    table3.m2066q();
                }
                i = i2;
            }
        }
        table = new Table();
        table.mo487a(false);
        table.f2677Y = true;
        this.f7122d.m2004a(table);
        C0602b table4 = new Table();
        table.m2059d(table4).m2104i().m2100g().m2102h().m2090b(600.0f).m2101g(64.0f);
        this.f7125g = new MenuItem[2];
        this.f7125g[0] = new MenuItem(this, c0645h, Game.f6551e.m2416a("game_over_restart"), "main-menu-icon-new-game", new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ GameOverScreen f7107b;

            public void run() {
                if (gameOverProperties.f7721h == GameMode.BASIC_LEVELS) {
                    Game.game.m7449a(gameOverProperties.f7722i, gameOverProperties.f7718e);
                } else if (gameOverProperties.f7721h == GameMode.USER_MAPS) {
                    Game.game.m7447a(gameOverProperties.f7723j.f6867b);
                }
            }
        });
        table4.m2059d(this.f7125g[0].f7115d);
        table4.m2066q();
        this.f7125g[1] = new MenuItem(this, c0645h, Game.f6551e.m2416a("game_over_main_menu"), "main-menu-icon-home", new C10932(this));
        table4.m2059d(this.f7125g[1].f7115d);
        table4.m2066q();
        Gdx.input.mo304a(this.f7122d);
    }

    /* renamed from: a */
    public final void resize(int i, int i2) {
        super.resize(i, i2);
        this.f7120b.f3064a = 1200.0f / ((float) Gdx.graphics.mo295d());
        this.f7120b.mo522a(i, i2);
    }

    /* renamed from: b */
    public final void mo1781b(float f) {
        if (Gdx.input.mo307b(4) || Gdx.input.mo307b(131)) {
            Game.game.m7473p();
        }
        this.a.f6559C.mo372a(this.f7120b.f3055b.f1595f);
        this.a.f6559C.mo365a();
        this.a.f6559C.m1410a(C0430b.f1620c);
        this.a.f6559C.mo370a(this.f7123e, 80.0f, 80.0f, 352.5f, 90.0f);
        this.a.f6559C.mo374c();
        this.f7122d.m2002a(f);
        this.f7122d.m2001a();
    }

    /* renamed from: d */
    public final void mo1778d() {
        this.f7122d.dispose();
        Game.game.logger.log("GameOverScreen", "disposed");
    }
}
