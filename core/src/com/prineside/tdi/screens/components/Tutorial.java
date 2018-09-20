package com.prineside.tdi.screens.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.g2d.C0444a;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Matrix4;
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
import com.badlogic.gdx.scenes.scene2d.utils.C0663k;
import com.badlogic.gdx.utils.Disposable;
import com.prineside.tdi.Game;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.utility.MaterialColor.LIGHT_BLUE;

public class Tutorial implements Disposable {
    /* renamed from: a */
    public static TutorialSlide[] f7815a;
    /* renamed from: b */
    public C0605e f7816b;
    /* renamed from: c */
    public C0602b f7817c;
    /* renamed from: d */
    public boolean f7818d = false;
    /* renamed from: e */
    private int f7819e = 0;
    /* renamed from: f */
    private C0645h f7820f;
    /* renamed from: g */
    private C0605e f7821g;
    /* renamed from: h */
    private C0625d f7822h;
    /* renamed from: i */
    private C0629f f7823i;
    /* renamed from: j */
    private C0629f f7824j;
    /* renamed from: k */
    private C0625d f7825k;
    /* renamed from: l */
    private C0629f f7826l;

    /* renamed from: com.prineside.tdi.screens.components.Tutorial$1 */
    class C12141 extends C0602b {
        /* renamed from: q */
        final /* synthetic */ Tutorial f7794q;

        C12141(Tutorial tutorial) {
            this.f7794q = tutorial;
        }

        /* renamed from: a */
        public final void mo471a(C0444a c0444a, float f) {
            c0444a.mo374c();
            Matrix4 a = Game.game.f6560D.f2112c.m1687a();
            Matrix4 a2 = Game.game.f6560D.f2111b.m1687a();
            Gdx.gl.glEnable(3042);
            Gdx.gl.glBlendFunc(770, 771);
            Game.game.f6560D.m1458a(c0444a.mo378g());
            Game.game.f6560D.m1462b(c0444a.mo379h());
            Game.game.f6560D.m1456a(ShapeType.Filled);
            Game.game.f6560D.m1455a(Game.f6556q);
            Game.game.f6560D.m1460b(this.f2613g, this.f2614h, this.f2615i, this.f2616j);
            Game.game.f6560D.m1451a();
            Game.game.f6560D.m1458a(a2);
            Game.game.f6560D.m1462b(a);
            c0444a.mo365a();
        }
    }

    /* renamed from: com.prineside.tdi.screens.components.Tutorial$2 */
    class C12152 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ Tutorial f7795a;

        C12152(Tutorial tutorial) {
            this.f7795a = tutorial;
        }

        /* renamed from: a */
        public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
            return true;
        }
    }

    private static class TutorialSlide implements Disposable {
        /* renamed from: a */
        public String f7811a;
        /* renamed from: b */
        public String f7812b;
        /* renamed from: c */
        public String f7813c;
        /* renamed from: d */
        private Texture f7814d;

        public TutorialSlide(String str, String str2, String str3) {
            this.f7811a = str;
            this.f7812b = str2;
            this.f7813c = str3;
        }

        /* renamed from: a */
        public final Texture m8288a() {
            if (this.f7814d == null) {
                this.f7814d = new Texture(Gdx.files.mo277b("textures/tutorial/" + this.f7813c), Format.RGB888, false);
                this.f7814d.m1129b(TextureFilter.Linear, TextureFilter.Linear);
            }
            return this.f7814d;
        }

        /* renamed from: b */
        public final void dispose() {
            if (this.f7814d != null) {
                this.f7814d.dispose();
                this.f7814d = null;
            }
        }
    }

    public Tutorial(final GameScreen gameScreen) {
        C0609g c0609g = gameScreen.f7181v;
        this.f7820f = new C0645h();
        this.f7820f.m2192a(Game.game.f6561E);
        this.f7816b = new C0605e();
        this.f7816b.f2628r = false;
        this.f7816b.f2610d = Touchable.enabled;
        this.f7816b.m1956c(0.0f, 0.0f);
        this.f7816b.m1935a(0.0f, 0.0f);
        this.f7816b.f2611e = false;
        c0609g.m2004a(this.f7816b);
        this.f7817c = new C12141(this);
        this.f7817c.m1956c(c0609g.f2641b.f3056c, c0609g.f2641b.f3057d);
        this.f7817c.f2610d = Touchable.enabled;
        this.f7817c.m1947a(new C12152(this));
        this.f7816b.mo510b(this.f7817c);
        C0628a c0628a = new C0628a(Game.game.m7463g(60), C0430b.f1620c);
        final C0430b c0430b = C0430b.f1620c;
        final C0430b c0430b2 = LIGHT_BLUE.f8525f;
        C0602b table = new Table();
        table.f2677Y = true;
        this.f7816b.mo510b(table);
        C0602b c0605e = new C0605e();
        c0605e.f2628r = false;
        c0605e.f2610d = Touchable.enabled;
        table.m2059d(c0605e).m2104i().m2100g().m2098f().m2085a(400.0f, 96.0f).m2099f(80.0f).m2101g(64.0f);
        final C0602b c0625d = new C0625d(this.f7820f.m2197c("icon-skip"));
        c0625d.m1956c(64.0f, 64.0f);
        c0625d.m1935a(0.0f, 16.0f);
        c0625d.m1937a(c0430b);
        c0605e.mo510b(c0625d);
        final C0602b c0629f = new C0629f(Game.f6551e.m2416a("tutorial_skip"), c0628a);
        c0629f.m1956c(336.0f, 96.0f);
        c0629f.m1935a(124.0f, 0.0f);
        c0629f.m1937a(c0430b);
        c0605e.mo510b(c0629f);
        final GameScreen gameScreen2 = gameScreen;
        c0605e.m1947a(new C0607f(this) {
            /* renamed from: f */
            final /* synthetic */ Tutorial f7801f;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0625d.m1937a(c0430b2);
                c0629f.m1937a(c0430b2);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                Sound.m7569a(Type.NO);
                gameScreen2.m7868o();
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0625d.m1937a(c0430b);
                c0629f.m1937a(c0430b);
            }
        });
        this.f7821g = new C0605e();
        this.f7821g.f2628r = false;
        this.f7821g.f2610d = Touchable.enabled;
        table.m2059d(this.f7821g).m2104i().m2100g().m2102h().m2085a(300.0f, 96.0f).m2103h(20.0f).m2101g(64.0f);
        c0625d = new C0625d(this.f7820f.m2197c("icon-triangle-left"));
        c0625d.m1956c(64.0f, 64.0f);
        c0625d.m1935a(0.0f, 16.0f);
        c0625d.m1937a(c0430b);
        this.f7821g.mo510b(c0625d);
        c0629f = new C0629f(Game.f6551e.m2416a("tutorial_previous"), c0628a);
        c0629f.m1956c(236.0f, 96.0f);
        c0629f.m1935a(124.0f, 0.0f);
        c0629f.m1937a(c0430b);
        this.f7821g.mo510b(c0629f);
        this.f7821g.m1947a(new C0607f(this) {
            /* renamed from: e */
            final /* synthetic */ Tutorial f7806e;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0625d.m1937a(c0430b2);
                c0629f.m1937a(c0430b2);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                if (this.f7806e.f7819e - 1 >= 0) {
                    this.f7806e.m8295a(this.f7806e.f7819e - 1);
                    Sound.m7569a(Type.CLICK);
                }
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0625d.m1937a(c0430b);
                c0629f.m1937a(c0430b);
            }
        });
        C0602b c0605e2 = new C0605e();
        c0605e2.f2628r = false;
        c0605e2.f2610d = Touchable.enabled;
        table.m2059d(c0605e2).m2104i().m2100g().m2102h().m2085a(300.0f, 96.0f).m2103h(80.0f).m2101g(64.0f);
        this.f7825k = new C0625d(this.f7820f.m2197c("icon-triangle-right"));
        this.f7825k.m1956c(64.0f, 64.0f);
        this.f7825k.m1935a(236.0f, 16.0f);
        this.f7825k.m1937a(c0430b);
        c0605e2.mo510b(this.f7825k);
        this.f7826l = new C0629f(Game.f6551e.m2416a("tutorial_next"), c0628a);
        this.f7826l.m1956c(176.0f, 96.0f);
        this.f7826l.m2127a(16);
        this.f7826l.m1937a(c0430b);
        c0605e2.mo510b(this.f7826l);
        c0605e2.m1947a(new C0607f(this) {
            /* renamed from: d */
            final /* synthetic */ Tutorial f7810d;

            /* renamed from: a */
            public final void mo495a(int i) {
                this.f7810d.f7825k.m1937a(c0430b2);
                this.f7810d.f7826l.m1937a(c0430b2);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                if (this.f7810d.f7819e + 1 < Tutorial.f7815a.length) {
                    this.f7810d.m8295a(this.f7810d.f7819e + 1);
                } else {
                    gameScreen.m7868o();
                }
                Sound.m7569a(Type.CLICK);
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                this.f7810d.f7825k.m1937a(c0430b);
                this.f7810d.f7826l.m1937a(c0430b);
            }
        });
        c0605e2 = new Table();
        c0605e2.f2677Y = true;
        this.f7816b.mo510b(c0605e2);
        this.f7822h = new C0625d(f7815a[0].m8288a());
        c0605e2.m2059d(this.f7822h).m2098f().m2085a(512.0f, 512.0f).m2099f(204.0f);
        C0602b table2 = new Table();
        c0605e2.m2059d(table2).m2099f(204.0f).m2103h(204.0f).m2104i().m2094d();
        this.f7823i = new C0629f("Title", new C0628a(Game.game.m7463g(60), C0430b.f1620c));
        this.f7823i.m2127a(16);
        table2.m2059d(this.f7823i).m2104i().m2094d();
        table2.m2066q();
        this.f7824j = new C0629f("Description", new C0628a(Game.game.m7463g(36), C0430b.f1620c));
        this.f7824j.m2135h();
        this.f7824j.m2127a(16);
        table2.m2059d(this.f7824j).m2094d().m2097e(40.0f);
    }

    /* renamed from: a */
    public static void m8291a() {
        f7815a = new TutorialSlide[]{new TutorialSlide("tutorial_SPAWN_title", "tutorial_SPAWN_description", "spawn.png"), new TutorialSlide("tutorial_TARGET_title", "tutorial_TARGET_description", "target.png"), new TutorialSlide("tutorial_SPACE_title", "tutorial_SPACE_description", "space.png"), new TutorialSlide("tutorial_TOWER_BUILD_MENU_title", "tutorial_TOWER_BUILD_MENU_description", "tower-build-menu.png"), new TutorialSlide("tutorial_TOWER_MENU_title", "tutorial_TOWER_MENU_description", "tower-menu.png"), new TutorialSlide("tutorial_TOWER_MENU_LEVEL_title", "tutorial_TOWER_MENU_LEVEL_description", "tower-menu-level.png"), new TutorialSlide("tutorial_TOWER_MENU_UPGRADES_title", "tutorial_TOWER_MENU_UPGRADES_description", "tower-menu-upgrades.png"), new TutorialSlide("tutorial_TOWER_MENU_BUTTONS_title", "tutorial_TOWER_MENU_BUTTONS_description", "tower-menu-buttons.png"), new TutorialSlide("tutorial_HEALTH_N_MONEY_title", "tutorial_HEALTH_N_MONEY_description", "health-n-money.png"), new TutorialSlide("tutorial_PAUSE_MENU_title", "tutorial_PAUSE_MENU_description", "pause-menu.png"), new TutorialSlide("tutorial_GAME_SPEED_title", "tutorial_GAME_SPEED_description", "game-speed.png"), new TutorialSlide("tutorial_DRAW_MODE_title", "tutorial_DRAW_MODE_description", "draw-mode.png"), new TutorialSlide("tutorial_DRAW_MODE_BONUSES_title", "tutorial_DRAW_MODE_BONUSES_description", "draw-mode-bonuses.png"), new TutorialSlide("tutorial_FORCE_WAVE_title", "tutorial_FORCE_WAVE_description", "force-wave.png"), new TutorialSlide("tutorial_GLOBAL_UPGRADES_title", "tutorial_GLOBAL_UPGRADES_description", "global-upgrades.png"), new TutorialSlide("tutorial_MORE_INFO_title", "tutorial_MORE_INFO_description", "more-log.png")};
    }

    /* renamed from: a */
    public final void m8295a(int i) {
        if (i < 0 || i >= f7815a.length) {
            Game.game.logger.m7510b("Tutorial", "Invalid slide index: " + i);
            return;
        }
        this.f7819e = i;
        this.f7822h.m2117a(new C0663k(new C0438n(f7815a[i].m8288a())));
        this.f7823i.m2130a(Game.f6551e.m2416a(f7815a[i].f7811a));
        this.f7824j.m2130a(Game.f6551e.m2416a(f7815a[i].f7812b));
        if (i == 0) {
            this.f7821g.f2611e = false;
        } else {
            this.f7821g.f2611e = true;
        }
        if (i + 1 == f7815a.length) {
            this.f7826l.m2130a(Game.f6551e.m2416a("tutorial_return_the_to_game"));
            this.f7825k.m2117a(this.f7820f.m2197c("main-menu-icon-new-game"));
            return;
        }
        this.f7826l.m2130a(Game.f6551e.m2416a("tutorial_next"));
        this.f7825k.m2117a(this.f7820f.m2197c("icon-triangle-right"));
    }

    /* renamed from: b */
    public final void dispose() {
        for (TutorialSlide b : f7815a) {
            b.dispose();
        }
    }
}
