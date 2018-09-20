package com.prineside.tdi.screens;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.C0350j.C0374b;
import com.badlogic.gdx.C0350j.C0516a;
import com.badlogic.gdx.C0350j.C0517c;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.scenes.scene2d.C0588a;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.C0607f;
import com.badlogic.gdx.scenes.scene2d.C0609g;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.p033a.C0587a;
import com.badlogic.gdx.scenes.scene2d.p033a.C0597i;
import com.badlogic.gdx.scenes.scene2d.ui.C0625d;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f.C0628a;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.C0618d;
import com.badlogic.gdx.scenes.scene2d.utils.C0663k;
import com.badlogic.gdx.utils.C0694m;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.p034b.C0684b;
import com.prineside.tdi.Game;
import com.prineside.tdi.GameListener;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgradeType;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.screens.components.Dialog;
import com.prineside.tdi.utility.MaterialColor.CYAN;
import com.prineside.tdi.utility.MaterialColor.GREEN;
import com.prineside.tdi.utility.MaterialColor.PINK;
import com.prineside.tdi.utility.ObjectRetriever;
import com.prineside.tdi.utility.QuadActor;
import java.util.Iterator;
import java.util.Locale;

public class MainMenuScreen extends AbstractScreen implements GameListener {
    /* renamed from: A */
    private static C0430b f7373A = new C0430b(437918463);
    /* renamed from: z */
    private static final C0430b f7374z = new C0430b(-1295304193);
    /* renamed from: B */
    private Table f7375B;
    /* renamed from: C */
    private C0629f f7376C;
    /* renamed from: D */
    private String f7377D;
    /* renamed from: b */
    C0684b f7378b;
    /* renamed from: c */
    private float f7379c;
    /* renamed from: d */
    private float f7380d;
    /* renamed from: e */
    private C0430b f7381e = new C0430b(673720575);
    /* renamed from: f */
    private C0430b f7382f = CYAN.f8445f;
    /* renamed from: g */
    private C0430b f7383g = PINK.f8581f;
    /* renamed from: h */
    private C0430b f7384h = C0430b.f1620c;
    /* renamed from: i */
    private C0430b f7385i = C0430b.f1620c.m1222c();
    /* renamed from: j */
    private float f7386j;
    /* renamed from: k */
    private C0609g f7387k;
    /* renamed from: l */
    private final C0628a f7388l;
    /* renamed from: m */
    private C0438n f7389m;
    /* renamed from: n */
    private C0438n f7390n;
    /* renamed from: o */
    private C0438n f7391o;
    /* renamed from: p */
    private C0438n f7392p;
    /* renamed from: q */
    private Dialog f7393q;
    /* renamed from: r */
    private MenuItem f7394r;
    /* renamed from: s */
    private C0629f f7395s;
    /* renamed from: t */
    private C0605e f7396t;
    /* renamed from: u */
    private C0625d f7397u;
    /* renamed from: v */
    private C0629f f7398v;
    /* renamed from: w */
    private C0629f f7399w;
    /* renamed from: x */
    private C0438n f7400x;
    /* renamed from: y */
    private Table f7401y;

    /* renamed from: com.prineside.tdi.screens.MainMenuScreen$1 */
    class C11231 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ MainMenuScreen f7348a;

        C11231(MainMenuScreen mainMenuScreen) {
            this.f7348a = mainMenuScreen;
        }

        /* renamed from: b */
        public final void mo500b() {
            Game.game.f6566J.mo1722a("CgkIsoHvgsEHEAIQZQ");
        }
    }

    /* renamed from: com.prineside.tdi.screens.MainMenuScreen$2 */
    class C11242 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ MainMenuScreen f7349a;

        C11242(MainMenuScreen mainMenuScreen) {
            this.f7349a = mainMenuScreen;
        }

        /* renamed from: b */
        public final void mo500b() {
            Game.game.f6566J.mo1734h();
        }
    }

    /* renamed from: com.prineside.tdi.screens.MainMenuScreen$3 */
    class C11253 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ MainMenuScreen f7350a;

        C11253(MainMenuScreen mainMenuScreen) {
            this.f7350a = mainMenuScreen;
        }

        /* renamed from: b */
        public final void mo500b() {
            Game.game.f6566J.mo1732f();
        }
    }

    /* renamed from: com.prineside.tdi.screens.MainMenuScreen$4 */
    class C11274 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ MainMenuScreen f7352a;

        /* renamed from: com.prineside.tdi.screens.MainMenuScreen$4$1 */
        class C11261 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C11274 f7351a;

            C11261(C11274 c11274) {
                this.f7351a = c11274;
            }

            public void run() {
                Game.game.f6566J.mo1724b();
                this.f7351a.f7352a.f7393q.m8211a();
            }
        }

        C11274(MainMenuScreen mainMenuScreen) {
            this.f7352a = mainMenuScreen;
        }

        /* renamed from: b */
        public final void mo500b() {
            if (Game.game.f6566J.mo1730d()) {
                Game.game.logger.log("MainMenuScreen", "Already connecting");
            } else if (Game.game.f6566J.mo1728c()) {
                this.f7352a.f7393q.m8213a(Game.f6551e.m2416a("game_services_sign_out_confirm"), new C11261(this));
            } else {
                Game.game.f6566J.mo1720a();
            }
            Sound.m7569a(Type.CLICK);
        }
    }

    /* renamed from: com.prineside.tdi.screens.MainMenuScreen$5 */
    class C11285 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ MainMenuScreen f7353a;

        C11285(MainMenuScreen mainMenuScreen) {
            this.f7353a = mainMenuScreen;
        }

        public void run() {
            Game.game.m7470m();
        }
    }

    /* renamed from: com.prineside.tdi.screens.MainMenuScreen$6 */
    class C11296 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ MainMenuScreen f7354a;

        C11296(MainMenuScreen mainMenuScreen) {
            this.f7354a = mainMenuScreen;
        }

        public void run() {
            if (GameScreen.m7834i()) {
                GameScreen.m7836k();
            }
        }
    }

    /* renamed from: com.prineside.tdi.screens.MainMenuScreen$7 */
    class C11307 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ MainMenuScreen f7355a;

        C11307(MainMenuScreen mainMenuScreen) {
            this.f7355a = mainMenuScreen;
        }

        public void run() {
            int i = 1;
            boolean z = false;
            if (Game.game.preferences.m8841b("level_select_hardcore") && !Game.game.preferences.m8838a("level_select_hardcore", "false").equals("false")) {
                z = i;
            }
            if (Game.game.preferences.m8841b("level_select_idx")) {
                try {
                    i = Integer.valueOf(Game.game.preferences.m8838a("level_select_idx", "1")).intValue();
                } catch (Exception e) {
                }
            }
            Game.game.m7452a(z, i);
        }
    }

    /* renamed from: com.prineside.tdi.screens.MainMenuScreen$8 */
    class C11318 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ MainMenuScreen f7356a;

        C11318(MainMenuScreen mainMenuScreen) {
            this.f7356a = mainMenuScreen;
        }

        public void run() {
            Game.game.m7471n();
        }
    }

    /* renamed from: com.prineside.tdi.screens.MainMenuScreen$9 */
    class C11329 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ MainMenuScreen f7357a;

        C11329(MainMenuScreen mainMenuScreen) {
            this.f7357a = mainMenuScreen;
        }

        public void run() {
            Game.game.m7474q();
        }
    }

    private class MenuItem {
        /* renamed from: a */
        final C0430b f7364a = new C0430b(12375295);
        /* renamed from: b */
        final C0430b f7365b = C0430b.f1620c.m1222c();
        /* renamed from: c */
        final C0430b f7366c = new C0430b(-171);
        /* renamed from: d */
        public C0605e f7367d = new C0605e();
        /* renamed from: e */
        boolean f7368e = true;
        /* renamed from: f */
        C0625d f7369f;
        /* renamed from: g */
        public C0629f f7370g;
        /* renamed from: h */
        final /* synthetic */ MainMenuScreen f7371h;
        /* renamed from: i */
        private C0625d f7372i;

        public MenuItem(final MainMenuScreen mainMenuScreen, C0645h c0645h, String str, String str2, final Runnable runnable) {
            this.f7371h = mainMenuScreen;
            this.f7367d.m1956c(680.0f, 108.0f);
            this.f7369f = new C0625d(c0645h.m2197c(str2));
            this.f7369f.m1956c(64.0f, 64.0f);
            this.f7369f.m1935a(536.0f, 22.0f);
            this.f7369f.m1937a(this.f7365b);
            this.f7367d.mo510b(this.f7369f);
            this.f7370g = new C0629f(str, mainMenuScreen.f7388l);
            this.f7370g.m1956c(480.0f, 108.0f);
            this.f7370g.m2127a(16);
            this.f7370g.m1937a(this.f7365b);
            this.f7367d.mo510b(this.f7370g);
            this.f7367d.f2610d = Touchable.enabled;
            this.f7367d.m1947a(new C0607f(this) {
                /* renamed from: c */
                final /* synthetic */ MenuItem f7360c;

                /* renamed from: a */
                public final void mo495a(int i) {
                    if (this.f7360c.f7368e) {
                        this.f7360c.f7369f.m1937a(this.f7360c.f7364a);
                        this.f7360c.f7370g.m1937a(this.f7360c.f7364a);
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
                    if (this.f7360c.f7368e) {
                        this.f7360c.f7369f.m1937a(this.f7360c.f7365b);
                        this.f7360c.f7370g.m1937a(this.f7360c.f7365b);
                    }
                }
            });
        }

        public MenuItem(final MainMenuScreen mainMenuScreen, C0645h c0645h, String str, String str2, String str3, final Runnable runnable) {
            this.f7371h = mainMenuScreen;
            this.f7367d.m1956c(680.0f, 108.0f);
            this.f7369f = new C0625d(c0645h.m2197c(str3));
            this.f7369f.m1956c(64.0f, 64.0f);
            this.f7369f.m1935a(536.0f, 22.0f);
            this.f7369f.m1937a(this.f7365b);
            this.f7367d.mo510b(this.f7369f);
            C0602b table = new Table();
            table.m1956c(480.0f, 108.0f);
            table.f2694E |= 16;
            table.f2694E &= -9;
            this.f7367d.mo510b(table);
            this.f7372i = new C0625d(c0645h.m2197c(str2));
            this.f7372i.m1937a(this.f7365b);
            table.m2059d(this.f7372i).m2084a(64.0f).m2103h(32.0f);
            this.f7370g = new C0629f(str, mainMenuScreen.f7388l);
            this.f7370g.m1937a(this.f7365b);
            table.m2059d(this.f7370g).m2102h().m2093c(108.0f);
            this.f7367d.f2610d = Touchable.enabled;
            this.f7367d.m1947a(new C0607f(this) {
                /* renamed from: c */
                final /* synthetic */ MenuItem f7363c;

                /* renamed from: a */
                public final void mo495a(int i) {
                    if (this.f7363c.f7368e) {
                        this.f7363c.f7369f.m1937a(this.f7363c.f7364a);
                        this.f7363c.f7370g.m1937a(this.f7363c.f7364a);
                        this.f7363c.f7372i.m1937a(this.f7363c.f7364a);
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
                    if (this.f7363c.f7368e) {
                        this.f7363c.f7369f.m1937a(this.f7363c.f7365b);
                        this.f7363c.f7370g.m1937a(this.f7363c.f7365b);
                        this.f7363c.f7372i.m1937a(this.f7363c.f7365b);
                    }
                }
            });
        }
    }

    public MainMenuScreen() {
        if (Game.game.f6566J.mo1737k()) {
            f7373A = new C0430b(622399743);
        }
        this.f7386j = 0.0f;
        C0645h c0645h = new C0645h();
        c0645h.m2192a(Game.game.f6561E);
        this.f7389m = Game.game.f6561E.m1442a("main-menu-global-upgrade-node");
        this.f7390n = Game.game.f6561E.m1442a("main-menu-global-upgrade-node-glow");
        this.f7391o = Game.game.f6561E.m1442a("blank");
        this.f7392p = Game.game.f6561E.m1442a("logo-with-title");
        this.f7378b = new C0684b();
        this.f7388l = new C0628a(Game.game.m7463g(60), C0430b.f1620c);
        this.f7387k = new C0609g(this.f7378b);
        C0602b table = new Table();
        table.mo487a(false);
        table.f2677Y = true;
        this.f7387k.m2004a(table);
        C0602b table2 = new Table();
        table.m2059d(table2).m2105j().m2093c(1200.0f);
        C0602b table3 = new Table();
        table.m2059d(table3).m2093c(1200.0f).m2090b(680.0f);
        table2.m2059d(new C0629f(Game.f6551e.m2416a("mainMenu_highScoreTitle"), new C0628a(Game.game.m7463g(48), C0430b.f1620c))).m2101g(32.0f);
        table2.m2066q();
        this.f7395s = new C0629f(String.valueOf(Game.game.f6592y.m8800a()), new C0628a(Game.game.m7463g(250), C0430b.f1620c));
        table2.m2059d(this.f7395s);
        if (Gdx.app.getType() != ApplicationType.Desktop) {
            if (Gdx.app.getType() == ApplicationType.Android) {
                table = new Table();
                table.f2677Y = true;
                table.f2610d = Touchable.childrenOnly;
                this.f7387k.m2004a(table);
                this.f7401y = new Table();
                table.m2059d(this.f7401y).m2104i().m2100g().m2098f();
                table = new C0625d(Game.game.f6561E.m1442a("main-menu-icon-leaderboards"));
                table.m1937a(f7374z);
                this.f7401y.m2059d(table).m2085a(128.0f, 128.0f).m2099f(64.0f).m2101g(32.0f);
                this.f7401y.m2066q();
                table.m1947a(new C11231(this));
                table = new C0625d(Game.game.f6561E.m1442a("main-menu-icon-achievements"));
                table.m1937a(f7374z);
                this.f7401y.m2059d(table).m2085a(128.0f, 128.0f).m2099f(64.0f).m2101g(32.0f);
                this.f7401y.m2066q();
                table.m1947a(new C11242(this));
                table = new C0625d(Game.game.f6561E.m1442a("main-menu-icon-cloud-save"));
                table.m1937a(f7374z);
                this.f7401y.m2059d(table).m2085a(128.0f, 128.0f).m2099f(64.0f).m2101g(240.0f);
                this.f7401y.m2066q();
                table.m1947a(new C11253(this));
                table = new Table();
                table.f2677Y = true;
                table.f2610d = Touchable.childrenOnly;
                this.f7387k.m2004a(table);
                this.f7396t = new C0605e();
                this.f7396t.f2610d = Touchable.enabled;
                this.f7396t.m1947a(new C11274(this));
                table.m2059d(this.f7396t).m2085a(512.0f, 128.0f).m2104i().m2100g().m2098f().m2099f(64.0f).m2101g(48.0f);
                this.f7397u = new C0625d(Game.game.f6561E.m1442a("ic_play_games_badge"));
                this.f7397u.m1935a(0.0f, 0.0f);
                table = this.f7397u;
                float f = this.f7397u.f2616j / 2.0f;
                table.f2617k = this.f7397u.f2615i / 2.0f;
                table.f2618l = f;
                this.f7396t.mo510b(this.f7397u);
                this.f7398v = new C0629f("Sign in", new C0628a(Game.game.m7463g(48), C0430b.f1620c));
                this.f7398v.m1935a(160.0f, 52.0f);
                this.f7398v.m1937a(f7374z);
                this.f7396t.mo510b(this.f7398v);
                this.f7399w = new C0629f("For achievements & cloud saved games", new C0628a(Game.game.m7463g(36), new C0430b(1.0f, 1.0f, 1.0f, 0.56f)));
                this.f7399w.m1935a(160.0f, 8.0f);
                this.f7396t.mo510b(this.f7399w);
            }
            m8029j();
        }
        this.f7394r = new MenuItem(this, c0645h, String.valueOf(Game.game.f6590w.m8800a()), "main-menu-icon-money", "main-menu-icon-shop-cart", new C11285(this));
        table3.m2059d(this.f7394r.f7367d).m2104i().m2096e().m2102h().m2090b(680.0f).m2097e(58.0f);
        table3.m2066q();
        C0602b table4 = new Table();
        table3.m2059d(table4).m2104i().m2100g().m2102h().m2090b(680.0f).m2101g(64.0f);
        MenuItem[] menuItemArr = new MenuItem[9];
        menuItemArr[0] = new MenuItem(this, c0645h, Game.f6551e.m2416a("mainMenu_continueButton"), "main-menu-icon-continue", new C11296(this));
        table4.m2059d(menuItemArr[0].f7367d);
        table4.m2066q();
        if (!GameScreen.m7834i()) {
            MenuItem menuItem = menuItemArr[0];
            if (menuItem.f7368e) {
                menuItem.f7368e = false;
                menuItem.f7369f.m1937a(menuItem.f7366c);
                menuItem.f7370g.m1937a(menuItem.f7366c);
            }
        }
        menuItemArr[1] = new MenuItem(this, c0645h, Game.f6551e.m2416a("mainMenu_newGameButton"), "main-menu-icon-new-game", new C11307(this));
        table4.m2059d(menuItemArr[1].f7367d);
        table4.m2066q();
        menuItemArr[2] = new MenuItem(this, c0645h, Game.f6551e.m2416a("mainMenu_mapEditorButton"), "main-menu-icon-map-editor", new C11318(this));
        table4.m2059d(menuItemArr[2].f7367d);
        table4.m2066q();
        menuItemArr[4] = new MenuItem(this, c0645h, Game.f6551e.m2416a("mainMenu_upgradesButton"), "main-menu-icon-global-upgrades", new C11329(this));
        table4.m2059d(menuItemArr[4].f7367d);
        int b = GlobalUpgrade.m7493b();
        if (b != 0) {
            table2 = new C0625d(c0645h.m2197c("main-menu-icon-circle"));
            table2.m1956c(42.0f, 42.0f);
            table2.m1935a(570.0f, 8.0f);
            menuItemArr[4].f7367d.mo510b(table2);
            table2 = new C0629f(String.valueOf(b), new C0628a(Game.game.m7463g(24), C0430b.f1620c));
            table2.m2127a(1);
            table2.m1937a(C0430b.f1619b);
            table2.m1956c(42.0f, 42.0f);
            table2.m1935a(570.0f, 8.0f);
            menuItemArr[4].f7367d.mo510b(table2);
        }
        table4.m2066q();
        menuItemArr[5] = new MenuItem(this, c0645h, Game.f6551e.m2416a("mainMenu_statisticsButton"), "main-menu-icon-statistics", new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ MainMenuScreen f7338a;

            {
                this.f7338a = r1;
            }

            public void run() {
                Game game = Game.game;
                if (game.getScreen() != null) {
                    game.getScreen().mo1778d();
                }
                game.setScreen(new StatisticsScreen());
            }
        });
        table4.m2059d(menuItemArr[5].f7367d);
        table4.m2066q();
        menuItemArr[6] = new MenuItem(this, c0645h, Game.f6551e.m2416a("mainMenu_settingsButton"), "main-menu-icon-settings", new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ MainMenuScreen f7339a;

            {
                this.f7339a = r1;
            }

            public void run() {
                Game.game.m7472o();
            }
        });
        table4.m2059d(menuItemArr[6].f7367d);
        table4.m2066q();
        menuItemArr[7] = new MenuItem(this, c0645h, Game.f6551e.m2416a("mainMenu_handbookButton"), "main-menu-icon-handbook", new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ MainMenuScreen f7340a;

            {
                this.f7340a = r1;
            }

            public void run() {
                Game game = Game.game;
                if (game.getScreen() != null) {
                    game.getScreen().mo1778d();
                }
                game.setScreen(new HandbookScreen());
            }
        });
        table4.m2059d(menuItemArr[7].f7367d);
        table4.m2066q();
        menuItemArr[8] = new MenuItem(this, c0645h, Game.f6551e.m2416a("mainMenu_aboutButton"), "main-menu-icon-about", new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ MainMenuScreen f7341a;

            {
                this.f7341a = r1;
            }

            public void run() {
                Game game = Game.game;
                if (game.getScreen() != null) {
                    game.getScreen().mo1778d();
                }
                game.setScreen(new AboutScreen());
            }
        });
        table4.m2059d(menuItemArr[8].f7367d);
        table4.m2066q();
        this.f7393q = new Dialog(this.f7387k);
        table = new Table();
        table.f2677Y = true;
        table.mo487a(false);
        table.f2610d = Touchable.childrenOnly;
        this.f7387k.m2004a(table);
        table2 = new C0605e();
        table.m2059d(table2).m2104i().m2100g().m2102h().m2101g(80.0f).m2103h(800.0f).m2085a(280.0f, 64.0f);
        table2.f2610d = Touchable.enabled;
        table2.m1947a(new C0618d(this) {
            /* renamed from: a */
            final /* synthetic */ MainMenuScreen f7342a;

            {
                this.f7342a = r1;
            }

            /* renamed from: b */
            public final void mo500b() {
                try {
                    Game.game.preferences.m8839b("visitedFacebook", "true");
                    Game.game.preferences.m8844d();
                    Gdx.net.mo314a("https://goo.gl/3GqNSZ");
                } catch (Exception e) {
                }
            }
        });
        table = new C0625d(c0645h.m2197c("icon-fb"));
        table.m1937a(C0430b.f1620c);
        table.m1956c(64.0f, 64.0f);
        table.m1935a(0.0f, 0.0f);
        table2.mo510b(table);
        C0602b c0629f = new C0629f(Game.f6551e.m2416a("join_us_on_facebook"), new C0628a(Game.game.m7463g(24), C0430b.f1620c));
        c0629f.m1956c(200.0f, 64.0f);
        c0629f.m1935a(88.0f, 0.0f);
        table2.mo510b(c0629f);
        if (Game.game.preferences.m8838a("visitedFacebook", null) != null) {
            c0629f.m1937a(new C0430b(858993663));
            table.m1937a(new C0430b(858993663));
        }
        this.f7375B = new Table();
        this.f7375B.f2677Y = true;
        this.f7375B.mo487a(false);
        this.f7375B.f2611e = false;
        this.f7375B.f2610d = Touchable.childrenOnly;
        this.f7387k.m2004a(this.f7375B);
        table = new C0605e();
        table.f2610d = Touchable.enabled;
        this.f7375B.m2059d(table).m2104i().m2100g().m2090b(500.0f).m2093c(200.0f).m2101g(32.0f);
        table.m1947a(new C0618d(this) {
            /* renamed from: a */
            final /* synthetic */ MainMenuScreen f7343a;

            {
                this.f7343a = r1;
            }

            /* renamed from: b */
            public final void mo500b() {
                try {
                    Gdx.net.mo314a(this.f7343a.f7377D);
                } catch (Exception e) {
                }
            }
        });
        c0629f = new QuadActor(new float[]{0.0f, 0.0f, 0.045f, 1.0f, 1.0f, 0.95f, 0.955f, 0.05f}, GREEN.f8490i, GREEN.f8489h, GREEN.f8490i, GREEN.f8491j);
        c0629f.m1956c(500.0f, 150.0f);
        table.mo510b(c0629f);
        this.f7376C = new C0629f("Infinitode v.2.0!\nGet it on Google Play", new C0628a(Game.game.m7463g(36), C0430b.f1620c));
        this.f7376C.m1956c(440.0f, 150.0f);
        this.f7376C.m1935a(30.0f, 0.0f);
        this.f7376C.m2127a(1);
        this.f7376C.m2135h();
        table.mo510b(this.f7376C);
        table2 = new C0625d(c0645h.m2190a("main-menu-icon-times"));
        table2.m1956c(48.0f, 48.0f);
        table2.m1935a(465.0f, 120.0f);
        table2.m1947a(new C0618d(this) {
            /* renamed from: a */
            final /* synthetic */ MainMenuScreen f7344a;

            {
                this.f7344a = r1;
            }

            /* renamed from: b */
            public final void mo500b() {
                Game.game.preferences.m8839b("doNotShowNewGameReleaseMessage", "true");
                Game.game.preferences.m8844d();
                this.f7344a.f7375B.f2611e = false;
            }
        });
        table.mo510b(table2);
        table = new C0629f(Game.game.m7464g(), new C0628a(Game.game.m7463g(30), C0430b.f1620c));
        table.m1935a(13.0f, 10.0f);
        table.m1937a(new C0430b(1.0f, 1.0f, 1.0f, 0.4f));
        this.f7387k.m2004a(table);
        mo1713c();
        Game.game.m7450a((GameListener) this);
    }

    /* renamed from: a */
    private void m8021a(GlobalUpgrade globalUpgrade) {
        if (GlobalUpgrade.m7492a(globalUpgrade.f6620k)) {
            float f = ((float) (globalUpgrade.f6623n - GlobalUpgrade.f6607b)) + this.f7380d;
            float f2 = ((float) (globalUpgrade.f6624o - GlobalUpgrade.f6609d)) + 512.0f;
            C0430b c0430b = this.f7385i;
            float abs = (float) Math.abs(Math.sin((double) (((((float) (Game.game.m7478u() / 1000)) + (globalUpgrade.f6629t * 3000.0f)) - ((float) (globalUpgrade.f6628s * 750))) / 2000.0f)));
            abs = abs < 0.25f ? 0.0f : (abs - 0.25f) / 0.75f;
            float f3 = ((1.0f - (f / ((float) GlobalUpgrade.f6608c))) + (f2 / ((float) GlobalUpgrade.f6610e))) * 0.5f;
            float f4 = 1.0f - f3;
            c0430b.f1644I = ((this.f7382f.f1644I * f3) + (this.f7383g.f1644I * f4)) - 0.15f;
            c0430b.f1645J = ((this.f7382f.f1645J * f3) + (this.f7383g.f1645J * f4)) - 0.15f;
            c0430b.f1646K = ((f3 * this.f7382f.f1646K) + (f4 * this.f7383g.f1646K)) - 0.15f;
            c0430b.f1644I = (c0430b.f1644I * abs) + 0.15f;
            c0430b.f1645J = (c0430b.f1645J * abs) + 0.15f;
            c0430b.f1646K = (abs * c0430b.f1646K) + 0.15f;
            c0430b.f1647L = this.f7386j * 1.0f;
            this.a.f6559C.m1410a(c0430b);
            this.a.f6559C.mo370a(this.f7389m, (f - 48.0f) * this.f7379c, (f2 - 48.0f) * this.f7379c, this.f7379c * 96.0f, this.f7379c * 96.0f);
            Iterator it = globalUpgrade.f6619j.iterator();
            while (it.hasNext()) {
                m8021a((GlobalUpgrade) it.next());
            }
        }
    }

    /* renamed from: b */
    private void m8023b(GlobalUpgrade globalUpgrade) {
        if (GlobalUpgrade.m7492a(globalUpgrade.f6620k)) {
            if (globalUpgrade.f6618i != null) {
                float f = ((float) (globalUpgrade.f6623n - GlobalUpgrade.f6607b)) + this.f7380d;
                float f2 = ((float) (globalUpgrade.f6624o - GlobalUpgrade.f6609d)) + 512.0f;
                float f3 = ((float) (globalUpgrade.f6618i.f6623n - GlobalUpgrade.f6607b)) + this.f7380d;
                float f4 = ((float) (globalUpgrade.f6618i.f6624o - GlobalUpgrade.f6609d)) + 512.0f;
                float ceil = (float) Math.ceil((double) (16.0f * this.f7379c));
                if (((float) globalUpgrade.f6625p) == 0.0f && ((float) globalUpgrade.f6626q) == 0.0f) {
                    this.a.f6560D.m1453a((float) Math.ceil((double) (this.f7379c * f)), (float) Math.ceil((double) (this.f7379c * f2)), (float) Math.ceil((double) (this.f7379c * f3)), (float) Math.ceil((double) (this.f7379c * f4)), ceil);
                } else {
                    this.a.f6560D.m1453a((float) Math.ceil((double) (this.f7379c * f)), (float) Math.ceil((double) (this.f7379c * f2)), (float) Math.ceil((double) ((((float) globalUpgrade.f6625p) + f) * this.f7379c)), (float) Math.ceil((double) ((((float) globalUpgrade.f6626q) + f2) * this.f7379c)), ceil);
                    this.a.f6560D.m1453a((float) Math.ceil((double) ((((float) globalUpgrade.f6625p) + f) * this.f7379c)), (float) Math.ceil((double) ((((float) globalUpgrade.f6626q) + f2) * this.f7379c)), (float) Math.ceil((double) (this.f7379c * f3)), (float) Math.ceil((double) (this.f7379c * f4)), ceil);
                }
            }
            Iterator it = globalUpgrade.f6619j.iterator();
            while (it.hasNext()) {
                m8023b((GlobalUpgrade) it.next());
            }
        }
    }

    /* renamed from: j */
    private void m8029j() {
        if (Game.game.f6566J.mo1728c()) {
            Game.game.logger.log("MainMenuScreen", "Game Services connected (" + String.valueOf(this.a.f6566J.mo1731e()) + ")");
            if (Gdx.app.getType() == ApplicationType.Android) {
                if (this.f7400x != null) {
                    this.f7397u.m1949b();
                    this.f7397u.m1961e(0.0f);
                    this.f7397u.m1937a(C0430b.f1620c);
                    this.f7397u.m2117a(new C0663k(this.f7400x));
                } else {
                    Game.game.f6566J.mo1721a(new ObjectRetriever<Texture>(this) {
                        /* renamed from: a */
                        final /* synthetic */ MainMenuScreen f7346a;

                        /* renamed from: com.prineside.tdi.screens.MainMenuScreen$17$1 */
                        class C11221 implements Runnable {
                            /* renamed from: a */
                            final /* synthetic */ AnonymousClass17 f7345a;

                            C11221(AnonymousClass17 anonymousClass17) {
                                this.f7345a = anonymousClass17;
                            }

                            public void run() {
                                this.f7345a.f7346a.f7397u.m1937a(C0430b.f1620c);
                                this.f7345a.f7346a.f7397u.m2117a(new C0663k(this.f7345a.f7346a.f7400x));
                                this.f7345a.f7346a.f7397u.m1949b();
                                this.f7345a.f7346a.f7397u.m1961e(0.0f);
                            }
                        }

                        {
                            this.f7346a = r1;
                        }

                        /* renamed from: a */
                        public final /* synthetic */ void mo1711a(Object obj) {
                            Texture texture = (Texture) obj;
                            Game.game.logger.log("MainMenu", "Retrieved avatar texture: " + String.valueOf(texture));
                            if (texture != null) {
                                texture.m1129b(TextureFilter.Linear, TextureFilter.Linear);
                                this.f7346a.f7400x = new C0438n(texture);
                            } else {
                                this.f7346a.f7400x = Game.game.f6561E.m1442a("ic_play_games_badge");
                            }
                            Gdx.app.postRunnable(new C11221(this));
                        }
                    });
                }
                this.f7398v.m2130a(this.a.f6566J.mo1731e());
                this.f7399w.m2130a(Game.f6551e.m2416a("game_services_tap_to_sign_out"));
                this.f7401y.f2611e = true;
            }
        } else if (Gdx.app.getType() != ApplicationType.iOS) {
            if (this.f7400x != null) {
                if (this.f7400x.f1686z != this.a.f6561E.f2086b.m2487b()) {
                    this.f7400x.f1686z.dispose();
                }
                this.f7400x = null;
            }
            this.f7401y.f2611e = false;
            if (Game.game.f6566J.mo1730d()) {
                Game.game.logger.log("MainMenuScreen", "GPGS connecting...");
                this.f7397u.m2117a(new C0663k(Game.game.f6561E.m1442a("loading-icon")));
                this.f7397u.m1937a(C0430b.f1620c);
                this.f7397u.m1949b();
                C0625d c0625d = this.f7397u;
                C0588a c0588a = (C0597i) C0587a.m1887a(C0597i.class);
                c0588a.f2599d = 90.0f;
                c0588a.f2576e = 1.0f;
                c0588a.f2577f = null;
                c0625d.m1940a(C0587a.m1884a(c0588a));
                return;
            }
            Game.game.logger.log("MainMenuScreen", "GPGS not connected");
            this.f7397u.m1949b();
            this.f7397u.m1961e(0.0f);
            this.f7397u.m2117a(new C0663k(Game.game.f6561E.m1442a("ic_play_games_badge")));
            this.f7397u.m1937a(f7374z);
            this.f7398v.m2130a(Game.f6551e.m2416a("sign_in"));
            this.f7399w.m2130a(Game.f6551e.m2416a("game_services_for_ach_n_cloud_saves"));
        }
    }

    /* renamed from: a */
    public final void mo1712a() {
    }

    /* renamed from: a */
    public final void resize(int i, int i2) {
        super.resize(i, i2);
        this.f7378b.f3064a = 1200.0f / ((float) Gdx.graphics.mo295d());
        this.f7378b.mo522a(i, i2);
    }

    /* renamed from: b */
    public final void mo1781b(float f) {
        if (Gdx.input.mo307b(4) || Gdx.input.mo307b(131)) {
            Game.game.f6566J.mo1735i();
        }
        if (this.f7386j < 1.0f) {
            this.f7386j += 0.1f * f;
            if (this.f7386j > 1.0f) {
                this.f7386j = 1.0f;
            }
        }
        Gdx.gl.glEnable(3042);
        Gdx.gl.glBlendFunc(770, 771);
        this.f7379c = ((float) Gdx.graphics.mo295d()) / (((float) GlobalUpgrade.f6612g) + 1024.0f);
        float d = (1200.0f / ((float) Gdx.graphics.mo295d())) * ((float) Gdx.graphics.mo294c());
        this.f7380d = (((((d - 680.0f) / d) * ((float) Gdx.graphics.mo294c())) / this.f7379c) - ((float) GlobalUpgrade.f6611f)) / 2.0f;
        TextureFilter e = this.f7391o.f1686z.m1132e();
        TextureFilter f2 = this.f7391o.f1686z.m1133f();
        this.f7391o.f1686z.m1129b(TextureFilter.Nearest, TextureFilter.Nearest);
        this.f7381e.f1647L = this.f7386j;
        this.a.f6560D.m1458a(new Matrix4().m1688a((float) Gdx.graphics.mo294c(), (float) Gdx.graphics.mo295d()));
        this.a.f6560D.m1456a(ShapeType.Filled);
        this.a.f6560D.m1455a(this.f7381e);
        m8023b(GlobalUpgrade.m7495c(GlobalUpgradeType.ROOT));
        this.a.f6560D.m1451a();
        this.a.f6559C.mo372a(new Matrix4().m1688a((float) Gdx.graphics.mo294c(), (float) Gdx.graphics.mo295d()));
        this.a.f6559C.mo365a();
        this.a.f6559C.m1410a(C0430b.f1620c);
        this.f7391o.f1686z.m1129b(e, f2);
        this.a.f6559C.m1410a(this.f7381e);
        m8021a(GlobalUpgrade.m7495c(GlobalUpgradeType.ROOT));
        this.a.f6559C.mo374c();
        this.a.f6559C.mo372a(this.f7378b.f3055b.f1595f);
        this.a.f6559C.mo365a();
        this.a.f6559C.m1410a(this.f7384h);
        this.a.f6559C.mo370a(this.f7392p, 80.0f, this.f7387k.f2641b.f3057d - 168.0f, 423.0f, 108.0f);
        this.a.f6559C.m1410a(C0430b.f1620c);
        this.a.f6559C.mo374c();
        this.a.f6560D.m1458a(this.f7378b.f3055b.f1595f);
        this.a.f6560D.m1456a(ShapeType.Filled);
        this.a.f6560D.m1455a(f7373A);
        this.a.f6560D.m1453a(d - 380.0f, -200.0f, d - 150.0f, 1400.0f, 820.0f);
        this.a.f6560D.m1451a();
        this.f7387k.m2002a(f);
        this.f7387k.m2001a();
    }

    /* renamed from: c */
    public final void mo1713c() {
        this.f7394r.f7370g.m2130a(String.format(Locale.ENGLISH, "%,d", new Object[]{Integer.valueOf(Game.game.f6590w.m8800a())}));
    }

    /* renamed from: d */
    public final void mo1778d() {
        this.f7387k.dispose();
        Game.game.m7455b((GameListener) this);
        Game.game.logger.log("MainMenu", "disposed");
    }

    /* renamed from: e */
    public final void mo1714e() {
        this.f7395s.m2130a(String.valueOf(Game.game.f6592y.m8800a()));
    }

    /* renamed from: f */
    public final void mo1715f() {
    }

    /* renamed from: g */
    public final void mo1716g() {
        m8029j();
    }

    /* renamed from: h */
    public final void mo1717h() {
    }

    /* renamed from: i */
    public final void mo1718i() {
    }

    public final void j_() {
        Gdx.input.mo304a(this.f7387k);
        if (Game.game.preferences.m8838a("doNotShowNewGameReleaseMessage", null) == null) {
            try {
                C0516a c0516a = new C0516a("POST");
                c0516a.f2304b = "http://infinitode.prineside.com/?m=api&a=checkNewGameRelease&locale=" + Game.f6551e.f3086a.getLanguage() + "&os=" + Gdx.app.getType().name();
                Gdx.net.mo313a(c0516a, new C0517c(this) {
                    /* renamed from: a */
                    final /* synthetic */ MainMenuScreen f7347a;

                    {
                        this.f7347a = r1;
                    }

                    /* renamed from: a */
                    public final void mo1740a(C0374b c0374b) {
                        try {
                            String a = c0374b.mo343a();
                            Game.game.logger.log("Check update", a);
                            JsonValue a2 = new C0694m().m2433a(a);
                            if (a2.m2259a("status").m2260a().equals("success")) {
                                this.f7347a.f7375B.f2611e = true;
                                CharSequence a3 = a2.m2259a("title").m2260a();
                                this.f7347a.f7377D = a2.m2259a("url").m2260a();
                                this.f7347a.f7376C.m2130a(a3);
                            }
                        } catch (Throwable e) {
                            Game.game.logger.log("Check update", "Exception: " + e.getMessage());
                            Game.game.logger.m7509a(e);
                        }
                    }

                    /* renamed from: a */
                    public final void mo1741a(Throwable th) {
                        Game.game.logger.log("Check update", th.getMessage());
                    }
                });
            } catch (Exception e) {
                Game.game.logger.log("Check update", "Failed (" + e.getMessage() + ")");
            }
        }
    }

    public final void k_() {
        Game.game.m7473p();
    }
}
