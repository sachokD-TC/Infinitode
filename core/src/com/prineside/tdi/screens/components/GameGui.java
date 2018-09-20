package com.prineside.tdi.screens.components;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.math.C0522d;
import com.badlogic.gdx.scenes.scene2d.C0588a;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.C0607f;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.p033a.C0587a;
import com.badlogic.gdx.scenes.scene2d.p033a.C0598j;
import com.badlogic.gdx.scenes.scene2d.p033a.C0600l;
import com.badlogic.gdx.scenes.scene2d.ui.C0625d;
import com.badlogic.gdx.scenes.scene2d.ui.C0627e;
import com.badlogic.gdx.scenes.scene2d.ui.C0627e.C0626a;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f.C0628a;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.C0618d;
import com.badlogic.gdx.scenes.scene2d.utils.C0663k;
import com.badlogic.gdx.utils.af;
import com.badlogic.gdx.utils.af.C0361a;
import com.prineside.tdi.Game;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgradeType;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.utility.MaterialColor.AMBER;
import com.prineside.tdi.utility.MaterialColor.GREEN;
import com.prineside.tdi.utility.MaterialColor.RED;

public class GameGui {
    /* renamed from: a */
    public C0629f f7697a;
    /* renamed from: b */
    public boolean f7698b = false;
    /* renamed from: c */
    private final GameScreen f7699c;
    /* renamed from: d */
    private C0629f f7700d;
    /* renamed from: e */
    private C0629f f7701e;
    /* renamed from: f */
    private C0629f f7702f;
    /* renamed from: g */
    private C0629f f7703g;
    /* renamed from: h */
    private C0625d f7704h;
    /* renamed from: i */
    private C0625d f7705i;
    /* renamed from: j */
    private C0629f f7706j;
    /* renamed from: k */
    private C0627e f7707k;
    /* renamed from: l */
    private C0625d f7708l;
    /* renamed from: m */
    private C0626a f7709m;
    /* renamed from: n */
    private C0626a f7710n;
    /* renamed from: o */
    private C0625d f7711o;
    /* renamed from: p */
    private C0629f f7712p;
    /* renamed from: q */
    private C0629f f7713q;

    /* renamed from: com.prineside.tdi.screens.components.GameGui$1 */
    class C11901 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ GameGui f7689a;

        C11901(GameGui gameGui) {
            this.f7689a = gameGui;
        }

        /* renamed from: b */
        public final void mo500b() {
            this.f7689a.f7699c.m7866m();
        }
    }

    /* renamed from: com.prineside.tdi.screens.components.GameGui$2 */
    class C11912 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ GameGui f7690a;

        C11912(GameGui gameGui) {
            this.f7690a = gameGui;
        }

        /* renamed from: b */
        public final void mo500b() {
            Sound.m7569a(Type.CLICK);
            this.f7690a.f7699c.m7874u();
        }
    }

    /* renamed from: com.prineside.tdi.screens.components.GameGui$3 */
    class C11923 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ GameGui f7691a;

        C11923(GameGui gameGui) {
            this.f7691a = gameGui;
        }

        /* renamed from: b */
        public final void mo500b() {
            Sound.m7569a(Type.CLICK);
            this.f7691a.f7699c.m7875v();
        }
    }

    /* renamed from: com.prineside.tdi.screens.components.GameGui$4 */
    class C11944 extends C0607f {
        /* renamed from: a */
        final /* synthetic */ GameGui f7693a;
        /* renamed from: b */
        private C0361a f7694b;
        /* renamed from: c */
        private int f7695c = 0;
        /* renamed from: d */
        private long f7696d;

        /* renamed from: com.prineside.tdi.screens.components.GameGui$4$1 */
        class C11931 extends C0361a {
            /* renamed from: a */
            final /* synthetic */ C11944 f7692a;

            C11931(C11944 c11944) {
                this.f7692a = c11944;
            }

            public void run() {
                Sound.m7569a(Type.SUCCESS);
                this.f7692a.f7693a.m8232a(true);
                this.f7692a.f7694b = null;
            }
        }

        C11944(GameGui gameGui) {
            this.f7693a = gameGui;
        }

        /* renamed from: a */
        public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
            this.f7694b = af.m2339a(new C11931(this), 1.0f);
            return true;
        }

        /* renamed from: b */
        public final void mo499b(InputEvent inputEvent, float f, float f2, int i, int i2) {
            if (this.f7694b != null) {
                this.f7694b.m1024a();
                this.f7694b = null;
                Sound.m7569a(Type.CLICK);
                this.f7693a.f7699c.m7872s();
                this.f7693a.m8232a(false);
                if (Game.game.m7478u() - this.f7696d < 1000000) {
                    this.f7695c++;
                    if (this.f7695c > 7) {
                        this.f7693a.m8231a(Game.f6551e.m2416a("game_gui_forced_wave_auto_hint"), 3.0f);
                    }
                } else {
                    this.f7695c = 0;
                }
                this.f7696d = Game.game.m7478u();
            }
        }
    }

    public GameGui(GameScreen gameScreen) {
        C0645h c0645h = new C0645h();
        c0645h.m2192a(Game.game.f6561E);
        this.f7699c = gameScreen;
        C0602b table = new Table();
        table.mo487a(false);
        table.f2677Y = true;
        gameScreen.f7181v.m2004a(table);
        C0602b table2 = new Table();
        table2.mo487a(false);
        table.m2059d(table2).m2104i().m2096e().m2098f();
        table2.m2059d(new C0625d(c0645h.m2197c("game-gui-money")));
        table2.m2059d(new C0625d(c0645h.m2197c("game-gui-health"))).m2099f(256.0f);
        table2 = new C0627e(c0645h.m2197c("game-gui-menu-button"));
        table2.m1947a(new C11901(this));
        table.m2059d(table2).m2104i().m2085a(128.0f, 128.0f).m2097e(32.0f).m2103h(32.0f).m2096e().m2102h();
        table.m2066q();
        C0602b table3 = new Table();
        table3.mo487a(false);
        table.m2059d(table3).m2104i().m2100g().m2098f();
        C0602b c0605e = new C0605e();
        c0605e.f2628r = false;
        c0605e.m1947a(new C11912(this));
        table3.m2059d(c0605e).m2085a(160.0f, 160.0f);
        table2 = GlobalUpgrade.m7492a(GlobalUpgradeType.GAME_SPEED_X4) ? new C0625d(c0645h.m2197c("game-gui-speed-red")) : GlobalUpgrade.m7492a(GlobalUpgradeType.GAME_SPEED_X2) ? new C0625d(c0645h.m2197c("game-gui-speed-yellow")) : new C0625d(c0645h.m2197c("game-gui-speed-green"));
        table2.m1956c(128.0f, 128.0f);
        table2.m1935a(32.0f, 32.0f);
        c0605e.mo510b(table2);
        this.f7704h = new C0625d(c0645h.m2197c("game-gui-speed-needle"));
        this.f7704h.m1956c(128.0f, 128.0f);
        this.f7704h.m1935a(-12.0f, -12.0f);
        this.f7704h.m1960e();
        c0605e.mo510b(this.f7704h);
        this.f7705i = new C0625d(Game.game.f6561E.m1442a("game-gui-draw-mode-green"));
        this.f7705i.m1956c(107.0f, 107.0f);
        this.f7705i.m1947a(new C11923(this));
        table3.m2059d(this.f7705i).m2099f(53.0f).m2101g(15.0f);
        table2 = new Table();
        table2.mo487a(false);
        table.m2059d(table2).m2104i().m2100g().m2102h();
        table = new C0605e();
        table.f2628r = false;
        table2.m2059d(table).m2085a(160.0f, 160.0f);
        this.f7709m = new C0626a();
        this.f7709m.a = c0645h.m2197c("game-gui-stopwatch-active");
        this.f7710n = new C0626a();
        this.f7710n.a = c0645h.m2197c("game-gui-stopwatch-inactive");
        this.f7707k = new C0627e(this.f7709m);
        this.f7707k.m1956c(128.0f, 128.0f);
        this.f7707k.m1935a(0.0f, 32.0f);
        table.mo510b(this.f7707k);
        this.f7708l = new C0625d(c0645h.m2197c("game-gui-stopwatch-glow"));
        this.f7708l.m1956c(128.0f, 128.0f);
        this.f7708l.m1935a(0.0f, 32.0f);
        table.mo510b(this.f7708l);
        table.m1947a(new C11944(this));
        table2 = new Table();
        table2.mo487a(false);
        table2.f2677Y = true;
        gameScreen.f7181v.m2004a(table2);
        C0628a c0628a = new C0628a();
        c0628a.f2816a = Game.game.m7465h(60);
        c0605e = new Table();
        c0605e.mo487a(false);
        table2.m2059d(c0605e).m2104i().m2096e().m2098f();
        this.f7700d = new C0629f("1301", c0628a);
        c0605e.m2059d(this.f7700d).m2090b(256.0f).m2093c(128.0f).m2099f(128.0f);
        this.f7701e = new C0629f("100", c0628a);
        c0605e.m2059d(this.f7701e).m2093c(128.0f).m2099f(128.0f);
        table2.m2066q();
        this.f7706j = new C0629f("Mode: normal", new C0628a(Game.game.m7465h(48), C0430b.f1620c));
        this.f7706j.m1937a(new C0430b(1.0f, 1.0f, 1.0f, 0.0f));
        table2.m2059d(this.f7706j).m2104i().m2100g().m2098f().m2093c(160.0f).m2099f(384.0f);
        c0605e = new Table();
        c0605e.mo487a(false);
        table2.m2059d(c0605e).m2104i().m2100g().m2102h().m2093c(160.0f).m2103h(160.0f);
        this.f7702f = new C0629f("Wave: 1", c0628a);
        this.f7702f.m2127a(16);
        if (gameScreen.f7173n) {
            this.f7702f.m1937a(RED.f8609f);
        }
        c0605e.m2059d(this.f7702f).m2103h(32.0f);
        this.f7703g = new C0629f("15", c0628a);
        this.f7703g.m1959d(32.0f);
        this.f7703g.m1955c(64.0f);
        this.f7703g.m1935a(80.0f, 32.0f);
        this.f7703g.m2127a(1);
        table.mo510b(this.f7703g);
        this.f7711o = new C0625d(c0645h.m2197c("game-gui-money"));
        this.f7711o.m1956c(48.0f, 48.0f);
        this.f7711o.m1935a(-24.0f, 110.0f);
        table.mo510b(this.f7711o);
        this.f7712p = new C0629f("+13", new C0628a(Game.game.m7465h(36), AMBER.f8397f));
        this.f7712p.m1956c(48.0f, 48.0f);
        this.f7712p.m2127a(16);
        this.f7712p.m1935a(-76.0f, 112.0f);
        table.mo510b(this.f7712p);
        this.f7713q = new C0629f("AUTO", new C0628a(Game.game.m7465h(36), GREEN.f8487f));
        this.f7713q.f2611e = false;
        this.f7713q.f2610d = Touchable.disabled;
        this.f7713q.m1956c(128.0f, 64.0f);
        this.f7713q.m2127a(1);
        this.f7713q.m1935a(0.0f, 150.0f);
        table.mo510b(this.f7713q);
        table2 = new Table();
        table2.mo487a(false);
        table2.f2677Y = true;
        table2.f2610d = Touchable.disabled;
        gameScreen.f7181v.m2004a(table2);
        this.f7697a = new C0629f("Wave message", new C0628a(Game.game.m7465h(60), C0430b.f1620c));
        this.f7697a.f2611e = false;
        table2.m2059d(this.f7697a).m2104i().m2096e().m2097e(160.0f);
    }

    /* renamed from: c */
    private void m8228c(boolean z) {
        if (z) {
            if (this.f7707k.f2815v != this.f7709m) {
                this.f7707k.mo504a(this.f7709m);
                this.f7708l.f2611e = true;
                this.f7708l.m1949b();
                this.f7708l.m1940a(C0587a.m1884a(C0587a.m1885a(C0587a.m1881a(0.0f, 0.75f, C0522d.f2385a), C0587a.m1881a(1.0f, 0.25f, C0522d.f2370B))));
            }
        } else if (this.f7707k.f2815v != this.f7710n) {
            this.f7707k.mo504a(this.f7710n);
            this.f7708l.f2611e = false;
        }
    }

    /* renamed from: a */
    public final void m8229a() {
        this.f7700d.m2130a(String.valueOf(this.f7699c.f7172m));
    }

    /* renamed from: a */
    public final void m8230a(String str) {
        m8231a(str, 3.0f);
    }

    /* renamed from: a */
    public final void m8231a(String str, float f) {
        this.f7706j.m2130a((CharSequence) str);
        this.f7706j.m1937a(C0430b.f1620c);
        this.f7706j.m1949b();
        C0629f c0629f = this.f7706j;
        C0588a a = C0587a.m1886a(true);
        C0588a a2 = C0587a.m1883a(f);
        C0588a a3 = C0587a.m1881a(0.0f, 1.0f, null);
        C0588a a4 = C0587a.m1886a(false);
        C0600l c0600l = (C0600l) C0587a.m1887a(C0600l.class);
        c0600l.m1914a(a);
        c0600l.m1914a(a2);
        c0600l.m1914a(a3);
        c0600l.m1914a(a4);
        c0629f.m1940a((C0588a) c0600l);
    }

    /* renamed from: a */
    public final void m8232a(boolean z) {
        this.f7698b = z;
        this.f7713q.f2611e = z;
    }

    /* renamed from: b */
    public final void m8233b() {
        this.f7701e.m2130a(String.valueOf(this.f7699c.f7171l));
    }

    /* renamed from: b */
    public final void m8234b(boolean z) {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            String str = null;
            switch (gameScreen.f7179t.f6759c) {
                case 0:
                    this.f7705i.m2117a(new C0663k(Game.game.f6561E.m1442a("game-gui-draw-mode-green")));
                    str = Game.f6551e.m2416a("game_gui_DRAW_MODE_DEFAULT");
                    break;
                case 1:
                    this.f7705i.m2117a(new C0663k(Game.game.f6561E.m1442a("game-gui-draw-mode-yellow")));
                    str = Game.f6551e.m2416a("game_gui_DRAW_MODE_UPGRADES");
                    break;
                case 2:
                    this.f7705i.m2117a(new C0663k(Game.game.f6561E.m1442a("game-gui-draw-mode-blue")));
                    str = Game.f6551e.m2416a("game_gui_DRAW_MODE_TILE_BONUSES");
                    break;
            }
            if (z) {
                m8231a(str, 1.0f);
            }
        }
    }

    /* renamed from: c */
    public final void m8235c() {
        float f = Game.game.f6585r == 2.0d ? -45.0f : Game.game.f6585r == 4.0d ? -85.5f : -4.5f;
        this.f7704h.m1949b();
        C0625d c0625d = this.f7704h;
        C0598j c0598j = (C0598j) C0587a.m1887a(C0598j.class);
        c0598j.f2600d = f;
        c0598j.f2576e = 0.2f;
        c0598j.f2577f = null;
        c0625d.m1940a((C0588a) c0598j);
    }

    /* renamed from: d */
    public final void m8236d() {
        if (this.f7699c.f7178s == null) {
            this.f7702f.m2130a(Game.f6551e.m2416a("game_gui_start_game_button_hint"));
        } else {
            this.f7702f.m2130a(Game.f6551e.m2416a("game_gui_wave") + ": " + this.f7699c.f7178s.f8675a);
        }
        if (this.f7699c.f7180u != -1) {
            if (!this.f7703g.f2611e) {
                this.f7703g.f2611e = true;
            }
            this.f7703g.m2130a(String.valueOf((int) Math.ceil((double) (((float) ((this.f7699c.f7177r - (Game.game.m7477t() - this.f7699c.f7180u)) / 1000)) / 1000.0f))));
            if (!GlobalUpgrade.m7492a(GlobalUpgradeType.FORCE_WAVE_ABILITY) && this.f7699c.f7179t.f6769m.f3187a != 0) {
                return;
            }
            if (this.f7699c.f7178s == null) {
                m8228c(true);
                this.f7712p.f2611e = false;
                this.f7711o.f2611e = false;
                this.f7703g.f2611e = false;
                return;
            } else if (this.f7699c.f7178s.f8679e * 2 >= this.f7699c.f7178s.f8678d) {
                if (this.f7699c.f7182w.f7698b) {
                    this.f7699c.m7872s();
                } else {
                    m8228c(true);
                }
                int t = this.f7699c.m7873t();
                if (t != 0) {
                    this.f7712p.m2130a("+" + t);
                    this.f7712p.f2611e = true;
                    this.f7711o.f2611e = true;
                    return;
                }
                this.f7712p.f2611e = false;
                this.f7711o.f2611e = false;
                return;
            } else {
                return;
            }
        }
        if (this.f7703g.f2611e) {
            this.f7703g.f2611e = false;
        }
        m8228c(false);
        this.f7712p.f2611e = false;
        this.f7711o.f2611e = false;
    }

    /* renamed from: e */
    public final void m8237e() {
        m8233b();
        m8229a();
        m8236d();
        m8235c();
        m8234b(false);
    }
}
