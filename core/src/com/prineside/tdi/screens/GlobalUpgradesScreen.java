package com.prineside.tdi.screens;

import com.badlogic.gdx.C0367f;
import com.badlogic.gdx.C0377g;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.C0507i;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
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
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.C0710q.C0707b;
import com.badlogic.gdx.utils.p034b.C0684b;
import com.prineside.tdi.CameraController;
import com.prineside.tdi.Game;
import com.prineside.tdi.GameListener;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgrade.FilteringMode;
import com.prineside.tdi.GlobalUpgradeCategory;
import com.prineside.tdi.GlobalUpgradeType;
import com.prineside.tdi.Something;
import com.prineside.tdi.Something.EasterEggType;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.screens.components.Dialog;
import com.prineside.tdi.utility.MaterialColor.AMBER;
import com.prineside.tdi.utility.MaterialColor.CYAN;
import com.prineside.tdi.utility.MaterialColor.GREEN;
import com.prineside.tdi.utility.MaterialColor.RED;
import com.prineside.tdi.utility.QuadActor;
import java.util.Iterator;
import java.util.Locale;

public class GlobalUpgradesScreen extends AbstractScreen implements GameListener {
    /* renamed from: c */
    private static final C0430b f7196c = GREEN.f8490i;
    /* renamed from: d */
    private static final C0430b f7197d = GREEN.f8489h;
    /* renamed from: e */
    private static final C0430b f7198e = C0430b.f1619b;
    /* renamed from: h */
    private static final C0430b f7199h = C0430b.f1620c;
    /* renamed from: i */
    private static final C0430b f7200i = CYAN.f8445f;
    /* renamed from: j */
    private static final C0430b f7201j = new C0430b(1431655935);
    /* renamed from: k */
    private static final C0430b f7202k = CYAN.f8445f.m1222c();
    /* renamed from: l */
    private static final C0430b f7203l = AMBER.f8397f.m1222c();
    /* renamed from: m */
    private static final C0430b f7204m = RED.f8609f.m1222c();
    /* renamed from: n */
    private static final C0430b f7205n = C0430b.f1620c;
    /* renamed from: o */
    private static final C0430b f7206o = GREEN.f8487f.m1222c();
    /* renamed from: A */
    private C0605e f7207A;
    /* renamed from: B */
    private C0605e f7208B;
    /* renamed from: C */
    private QuadActor f7209C;
    /* renamed from: D */
    private C0629f f7210D;
    /* renamed from: E */
    private C0625d f7211E;
    /* renamed from: F */
    private C0605e f7212F;
    /* renamed from: G */
    private C0605e f7213G;
    /* renamed from: H */
    private Dialog f7214H;
    /* renamed from: I */
    private boolean f7215I = false;
    /* renamed from: J */
    private GlobalUpgradeType f7216J = null;
    /* renamed from: b */
    public final C0609g f7217b;
    /* renamed from: f */
    private C0507i f7218f;
    /* renamed from: g */
    private CameraController f7219g;
    /* renamed from: p */
    private C0377g f7220p;
    /* renamed from: q */
    private C0438n f7221q = Game.game.f6561E.m1442a("global-upgrades-icon-background");
    /* renamed from: r */
    private C0438n f7222r = Game.game.f6561E.m1442a("tile-menu-upgrade-button-active-check");
    /* renamed from: s */
    private C0710q<Integer, C0438n> f7223s = new C0710q();
    /* renamed from: t */
    private final C0684b f7224t;
    /* renamed from: u */
    private GlobalUpgrade f7225u = null;
    /* renamed from: v */
    private GlobalUpgrade f7226v = null;
    /* renamed from: w */
    private C0629f f7227w;
    /* renamed from: x */
    private C0629f f7228x;
    /* renamed from: y */
    private C0629f f7229y;
    /* renamed from: z */
    private C0605e f7230z;

    /* renamed from: com.prineside.tdi.screens.GlobalUpgradesScreen$2 */
    class C11002 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ GlobalUpgradesScreen f7188a;

        C11002(GlobalUpgradesScreen globalUpgradesScreen) {
            this.f7188a = globalUpgradesScreen;
        }

        /* renamed from: b */
        public final void mo500b() {
            Sound.m7569a(Type.NO);
            Game.game.m7473p();
        }
    }

    /* renamed from: com.prineside.tdi.screens.GlobalUpgradesScreen$4 */
    class C11024 extends C0607f {
        /* renamed from: a */
        final /* synthetic */ GlobalUpgradesScreen f7192a;

        C11024(GlobalUpgradesScreen globalUpgradesScreen) {
            this.f7192a = globalUpgradesScreen;
        }

        /* renamed from: a */
        public final boolean mo506a() {
            return true;
        }

        /* renamed from: a */
        public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
            return true;
        }
    }

    /* renamed from: com.prineside.tdi.screens.GlobalUpgradesScreen$5 */
    class C11045 extends C0607f {
        /* renamed from: a */
        final /* synthetic */ GlobalUpgradesScreen f7194a;

        /* renamed from: com.prineside.tdi.screens.GlobalUpgradesScreen$5$1 */
        class C11031 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C11045 f7193a;

            C11031(C11045 c11045) {
                this.f7193a = c11045;
            }

            public void run() {
                Game.game.m7470m();
                this.f7193a.f7194a.f7214H.m8211a();
            }
        }

        C11045(GlobalUpgradesScreen globalUpgradesScreen) {
            this.f7194a = globalUpgradesScreen;
        }

        /* renamed from: a */
        public final void mo495a(int i) {
            if (this.f7194a.f7226v != null && this.f7194a.f7226v.f6627r <= Game.game.f6590w.m8800a()) {
                this.f7194a.f7209C.m1937a(GlobalUpgradesScreen.f7197d);
            }
        }

        /* renamed from: a */
        public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
            if (!(this.f7194a.f7226v == null || GlobalUpgrade.m7492a(this.f7194a.f7226v.f6620k) || !this.f7194a.f7226v.m7500e())) {
                if (this.f7194a.f7226v.f6627r > Game.game.f6590w.m8800a()) {
                    this.f7194a.f7214H.m8213a(Game.f6551e.m2416a("not_enough_money_purchase_confirm"), new C11031(this));
                } else if (Game.game.m7457c(this.f7194a.f7226v.f6627r)) {
                    Sound.m7569a(Type.UPGRADE);
                    GlobalUpgrade.m7494b(this.f7194a.f7226v.f6620k);
                    this.f7194a.m7905n();
                    Game.game.m7466h();
                }
            }
            return true;
        }

        /* renamed from: b */
        public final void mo498b(int i) {
            if (this.f7194a.f7226v != null && this.f7194a.f7226v.f6627r <= Game.game.f6590w.m8800a()) {
                this.f7194a.f7209C.m1937a(GlobalUpgradesScreen.f7196c);
            }
        }
    }

    /* renamed from: com.prineside.tdi.screens.GlobalUpgradesScreen$6 */
    class C11056 extends C0367f {
        /* renamed from: a */
        final /* synthetic */ GlobalUpgradesScreen f7195a;

        C11056(GlobalUpgradesScreen globalUpgradesScreen) {
            this.f7195a = globalUpgradesScreen;
        }

        /* renamed from: a */
        public final boolean mo332a(int i, int i2) {
            Vector2 c = this.f7195a.f7219g.m7424c(i, i2);
            c.f2337x += (float) GlobalUpgrade.f6607b;
            c.f2338y += (float) GlobalUpgrade.f6609d;
            Iterator b = GlobalUpgrade.f6606a.mo544b();
            while (b.hasNext()) {
                C0707b c0707b = (C0707b) b.next();
                if (c.f2337x > ((float) (((GlobalUpgrade) c0707b.f3164b).f6623n - 64)) && c.f2337x < ((float) (((GlobalUpgrade) c0707b.f3164b).f6623n + 64)) && c.f2338y > ((float) (((GlobalUpgrade) c0707b.f3164b).f6624o - 64)) && c.f2338y < ((float) (((GlobalUpgrade) c0707b.f3164b).f6624o + 64))) {
                    GlobalUpgradesScreen.m7892a(this.f7195a, (GlobalUpgrade) c0707b.f3164b);
                    break;
                }
            }
            GlobalUpgradesScreen.m7892a(this.f7195a, null);
            return false;
        }

        /* renamed from: b */
        public final boolean mo336b(int i, int i2, int i3, int i4) {
            Vector2 c = this.f7195a.f7219g.m7424c(i, i2);
            c.f2337x += (float) GlobalUpgrade.f6607b;
            c.f2338y += (float) GlobalUpgrade.f6609d;
            Iterator b = GlobalUpgrade.f6606a.mo544b();
            while (b.hasNext()) {
                C0707b c0707b = (C0707b) b.next();
                if (c.f2337x > ((float) (((GlobalUpgrade) c0707b.f3164b).f6623n - 64)) && c.f2337x < ((float) (((GlobalUpgrade) c0707b.f3164b).f6623n + 64)) && c.f2338y > ((float) (((GlobalUpgrade) c0707b.f3164b).f6624o - 64)) && c.f2338y < ((float) (((GlobalUpgrade) c0707b.f3164b).f6624o + 64))) {
                    GlobalUpgradesScreen.m7895b(this.f7195a, (GlobalUpgrade) c0707b.f3164b);
                    break;
                }
            }
            GlobalUpgradesScreen.m7895b(this.f7195a, null);
            return false;
        }
    }

    public GlobalUpgradesScreen() {
        for (int i = 1; i <= 10; i++) {
            this.f7223s.mo542a(Integer.valueOf(i), Game.game.f6561E.m1442a("global-upgrade-level-" + i));
        }
        this.f7224t = new C0684b();
        C0628a c0628a = new C0628a(Game.game.m7463g(60), C0430b.f1620c);
        C0645h c0645h = new C0645h();
        c0645h.m2192a(Game.game.f6561E);
        this.f7217b = new C0609g(this.f7224t);
        C0602b table = new Table();
        table.mo487a(false);
        table.f2677Y = true;
        this.f7217b.m2004a(table);
        C0602b table2 = new Table();
        table2.mo487a(false);
        table2.f2677Y = true;
        this.f7217b.m2004a(table2);
        C0602b c0605e = new C0605e();
        c0605e.f2628r = false;
        c0605e.m1956c(400.0f, 64.0f);
        c0605e.f2610d = Touchable.enabled;
        table2.m2059d(c0605e).m2104i().m2096e().m2102h().m2086a(2).m2097e(80.0f);
        final C0602b c0625d = new C0625d(c0645h.m2197c("main-menu-icon-money"));
        c0625d.m1956c(64.0f, 64.0f);
        c0625d.m1935a(256.0f, 0.0f);
        c0625d.m1937a(f7199h);
        c0605e.mo510b(c0625d);
        this.f7227w = new C0629f(String.valueOf(Game.game.f6590w.m8800a()), c0628a);
        this.f7227w.m1956c(384.0f, 64.0f);
        this.f7227w.m1935a(-184.0f, 0.0f);
        this.f7227w.m2127a(16);
        this.f7227w.m1937a(f7199h);
        c0605e.mo510b(this.f7227w);
        c0605e.m1947a(new C0607f(this) {
            /* renamed from: b */
            final /* synthetic */ GlobalUpgradesScreen f7187b;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0625d.m1937a(GlobalUpgradesScreen.f7200i);
                this.f7187b.f7227w.m1937a(GlobalUpgradesScreen.f7200i);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                Game.game.m7470m();
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0625d.m1937a(GlobalUpgradesScreen.f7199h);
                this.f7187b.f7227w.m1937a(GlobalUpgradesScreen.f7199h);
            }
        });
        table2.m2066q();
        c0605e = new C0605e();
        c0605e.f2628r = false;
        c0605e.m1956c(400.0f, 96.0f);
        c0605e.f2610d = Touchable.enabled;
        table2.m2059d(c0605e).m2104i().m2100g().m2098f().m2101g(64.0f).m2099f(80.0f);
        table2 = new C0625d(c0645h.m2197c("main-menu-icon-home"));
        table2.m1956c(64.0f, 64.0f);
        table2.m1935a(0.0f, 16.0f);
        table2.m1937a(f7199h);
        c0605e.mo510b(table2);
        c0625d = new C0629f(Game.f6551e.m2416a("upgrades_back_to_menu"), c0628a);
        c0625d.m1956c(336.0f, 96.0f);
        c0625d.m1935a(124.0f, 0.0f);
        c0625d.m1937a(f7199h);
        c0605e.mo510b(c0625d);
        c0605e.m1947a(new C11002(this));
        c0605e.m1947a(new C0607f(this) {
            /* renamed from: c */
            final /* synthetic */ GlobalUpgradesScreen f7191c;

            /* renamed from: a */
            public final void mo495a(int i) {
                table2.m1937a(GlobalUpgradesScreen.f7200i);
                c0625d.m1937a(GlobalUpgradesScreen.f7200i);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                table2.m1937a(GlobalUpgradesScreen.f7199h);
                c0625d.m1937a(GlobalUpgradesScreen.f7199h);
            }
        });
        this.f7213G = new C0605e();
        this.f7213G.f2628r = false;
        this.f7213G.f2611e = false;
        this.f7213G.f2610d = Touchable.enabled;
        this.f7213G.m1947a(new C11024(this));
        table.m2059d(this.f7213G).m2104i().m2100g().m2102h().m2090b(620.0f).m2093c(1200.0f);
        C0602b quadActor = new QuadActor(new float[]{0.07f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f}, new int[]{0, 0, 0, 204, 0, 0, 0, 204, 0, 0, 0, 204, 0, 0, 0, 204});
        quadActor.m1956c(620.0f, 1200.0f);
        this.f7213G.mo510b(quadActor);
        this.f7228x = new C0629f("Upgrade title", new C0628a(Game.game.m7463g(60), C0430b.f1620c));
        this.f7228x.m2127a(10);
        this.f7228x.m1955c(512.0f);
        this.f7228x.m1959d(300.0f);
        this.f7228x.m2135h();
        this.f7228x.m1935a(75.0f, 685.0f);
        this.f7213G.mo510b(this.f7228x);
        this.f7229y = new C0629f("Upgrade description", new C0628a(Game.game.m7463g(36), C0430b.f1620c));
        this.f7229y.m2127a(10);
        this.f7229y.m1955c(512.0f);
        this.f7229y.m1959d(960.0f);
        this.f7229y.m2135h();
        this.f7229y.m1935a(75.0f, 0.0f);
        this.f7213G.mo510b(this.f7229y);
        c0628a = new C0628a(Game.game.m7463g(48), C0430b.f1620c);
        this.f7212F = new C0605e();
        this.f7212F.f2628r = false;
        this.f7212F.m1956c(512.0f, 64.0f);
        this.f7212F.m1935a(75.0f, 218.0f);
        this.f7213G.mo510b(this.f7212F);
        table = new Table();
        table.f2677Y = true;
        this.f7212F.mo510b(table);
        table.m2059d(new C0625d(c0645h.m2197c("tower-stat-poison-damage"))).m2084a(32.0f);
        table.m2059d(new C0629f(Game.f6551e.m2416a("hardcore_mode"), new C0628a(Game.game.m7463g(30), C0430b.f1620c))).m2099f(40.0f);
        this.f7208B = new C0605e();
        this.f7208B.f2628r = false;
        this.f7208B.m1956c(512.0f, 139.0f);
        this.f7208B.m1935a(75.0f, 63.0f);
        this.f7213G.mo510b(this.f7208B);
        this.f7209C = new QuadActor(new float[]{0.012f, 0.0f, 0.0f, 1.0f, 1.0f, 0.94f, 1.0f, 0.05f}, C0430b.f1620c);
        this.f7209C.m1937a(f7196c);
        this.f7209C.m1956c(512.0f, 131.0f);
        this.f7208B.mo510b(this.f7209C);
        table = new Table();
        table.f2677Y = true;
        table.f2610d = Touchable.disabled;
        this.f7208B.mo510b(table);
        this.f7211E = new C0625d(c0645h.m2197c("main-menu-icon-money"));
        table.m2059d(this.f7211E).m2090b(64.0f).m2093c(64.0f).m2103h(24.0f);
        this.f7210D = new C0629f("3,000", c0628a);
        table.m2059d(this.f7210D);
        this.f7208B.m1947a(new C11045(this));
        this.f7230z = new C0605e();
        this.f7230z.f2628r = false;
        this.f7230z.m1956c(512.0f, 139.0f);
        this.f7230z.m1935a(75.0f, 63.0f);
        this.f7213G.mo510b(this.f7230z);
        table = new Table();
        table.f2677Y = true;
        this.f7230z.mo510b(table);
        table.m2059d(new C0625d(c0645h.m2197c("tile-menu-upgrade-button-active-check"))).m2090b(64.0f).m2093c(64.0f).m2103h(24.0f);
        C0602b c0629f = new C0629f(Game.f6551e.m2416a("upgrades_installed"), c0628a);
        c0629f.m1937a(GREEN.f8487f);
        table.m2059d(c0629f);
        this.f7207A = new C0605e();
        this.f7207A.f2628r = false;
        this.f7207A.m1956c(512.0f, 139.0f);
        this.f7207A.m1935a(75.0f, 63.0f);
        this.f7213G.mo510b(this.f7207A);
        c0629f = new Table();
        c0629f.f2677Y = true;
        this.f7207A.mo510b(c0629f);
        C0602b c0629f2 = new C0629f(Game.f6551e.m2416a("upgrades_locked"), c0628a);
        c0629f2.m1937a(new C0430b(1.0f, 1.0f, 1.0f, 0.56f));
        c0629f.m2059d(c0629f2);
        quadActor = new C0629f(Game.f6551e.m2416a("upgrades_previous_upgrade_required"), new C0628a(Game.game.m7463g(36), new C0430b(1.0f, 1.0f, 1.0f, 0.56f)));
        c0629f.m2066q();
        c0629f.m2059d(quadActor);
        this.f7218f = new C0507i((float) Gdx.graphics.mo294c(), (float) Gdx.graphics.mo295d());
        this.f7219g = new CameraController(this.f7218f, GlobalUpgrade.f6611f, GlobalUpgrade.f6612g);
        this.f7219g.f6476g = 1.0d;
        this.f7219g.f6477h = 8.0d;
        this.f7219g.f6471b = 4.0d;
        this.f7219g.m7421b(GlobalUpgrade.f6611f / 2, GlobalUpgrade.f6612g / 2);
        this.f7218f.mo429a();
        this.f7220p = new C0377g();
        this.f7220p.m1082a(this.f7217b);
        this.f7220p.m1082a(this.f7219g);
        this.f7220p.m1082a(new C11056(this));
        this.f7214H = new Dialog(this.f7217b);
        mo1713c();
        Game.game.m7450a((GameListener) this);
    }

    /* renamed from: a */
    private void m7891a(GlobalUpgrade globalUpgrade) {
        if (globalUpgrade.f6618i != null) {
            if (GlobalUpgrade.m7492a(globalUpgrade.f6618i.f6620k)) {
                this.a.f6560D.m1455a(f7202k);
            } else {
                this.a.f6560D.m1455a(f7201j);
            }
            if (((float) globalUpgrade.f6625p) == 0.0f && ((float) globalUpgrade.f6626q) == 0.0f) {
                this.a.f6560D.m1453a((float) (globalUpgrade.f6623n - GlobalUpgrade.f6607b), (float) (globalUpgrade.f6624o - GlobalUpgrade.f6609d), (float) (globalUpgrade.f6618i.f6623n - GlobalUpgrade.f6607b), (float) (globalUpgrade.f6618i.f6624o - GlobalUpgrade.f6609d), 8.0f);
            } else {
                this.a.f6560D.m1453a((float) (globalUpgrade.f6623n - GlobalUpgrade.f6607b), (float) (globalUpgrade.f6624o - GlobalUpgrade.f6609d), (float) ((globalUpgrade.f6623n - GlobalUpgrade.f6607b) + globalUpgrade.f6625p), (float) ((globalUpgrade.f6624o + globalUpgrade.f6626q) - GlobalUpgrade.f6609d), 8.0f);
                this.a.f6560D.m1453a((float) ((globalUpgrade.f6623n - GlobalUpgrade.f6607b) + globalUpgrade.f6625p), (float) ((globalUpgrade.f6624o + globalUpgrade.f6626q) - GlobalUpgrade.f6609d), (float) (globalUpgrade.f6618i.f6623n - GlobalUpgrade.f6607b), (float) (globalUpgrade.f6618i.f6624o - GlobalUpgrade.f6609d), 8.0f);
            }
        }
        Iterator it = globalUpgrade.f6619j.iterator();
        while (it.hasNext()) {
            m7891a((GlobalUpgrade) it.next());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m7892a(GlobalUpgradesScreen globalUpgradesScreen, GlobalUpgrade globalUpgrade) {
        if (globalUpgrade != globalUpgradesScreen.f7225u) {
            globalUpgradesScreen.f7225u = globalUpgrade;
        }
    }

    /* renamed from: b */
    private void m7894b(GlobalUpgrade globalUpgrade) {
        if (this.f7226v == globalUpgrade) {
            this.a.f6559C.m1410a(f7206o);
        } else if (this.f7225u == globalUpgrade) {
            this.a.f6559C.m1410a(f7205n);
        } else if (GlobalUpgrade.m7492a(globalUpgrade.f6620k)) {
            this.a.f6559C.m1410a(f7202k);
        } else if (!globalUpgrade.m7500e()) {
            this.a.f6559C.m1410a(f7201j);
        } else if (Game.game.f6590w.m8800a() < globalUpgrade.f6627r) {
            this.a.f6559C.m1410a(f7204m);
        } else {
            this.a.f6559C.m1410a(f7203l);
        }
        this.a.f6559C.mo370a(this.f7221q, (float) ((globalUpgrade.f6623n - GlobalUpgrade.f6607b) - 64), (float) ((globalUpgrade.f6624o - GlobalUpgrade.f6609d) - 64), 128.0f, 128.0f);
        Iterator it = globalUpgrade.f6619j.iterator();
        while (it.hasNext()) {
            m7894b((GlobalUpgrade) it.next());
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m7895b(GlobalUpgradesScreen globalUpgradesScreen, GlobalUpgrade globalUpgrade) {
        globalUpgradesScreen.f7226v = globalUpgrade;
        if (globalUpgrade != null) {
            globalUpgradesScreen.f7228x.m2130a(globalUpgrade.m7498c());
            globalUpgradesScreen.f7229y.m1935a(69.0f, -globalUpgradesScreen.f7228x.mo484m());
            C0629f c0629f = globalUpgradesScreen.f7229y;
            GlobalUpgradeCategory globalUpgradeCategory = globalUpgrade.f6621l;
            c0629f.m2130a(String.format(Game.f6551e.f3086a, Game.f6551e.m2416a(globalUpgradeCategory.f6687d), new Object[]{Float.valueOf(globalUpgrade.f6630u[0]), Float.valueOf(globalUpgrade.f6630u[1]), Float.valueOf(globalUpgrade.f6630u[2]), Float.valueOf(globalUpgrade.f6630u[3])}));
        }
        globalUpgradesScreen.m7905n();
        Sound.m7569a(Type.CLICK);
        if (globalUpgrade != null) {
            if (globalUpgrade.f6620k == GlobalUpgradeType.TOWER_BASIC_ATTACK_SPEED_I) {
                globalUpgradesScreen.f7215I = true;
            } else if (globalUpgradesScreen.f7215I) {
                if (globalUpgradesScreen.f7216J == GlobalUpgradeType.TOWER_BASIC_ATTACK_SPEED_I && globalUpgrade.f6620k == GlobalUpgradeType.TOWER_BASIC_U_DAMAGE_MULTIPLIER_I) {
                    Sound.m7569a(Type.CLICK);
                } else if (globalUpgradesScreen.f7216J == GlobalUpgradeType.TOWER_BASIC_U_DAMAGE_MULTIPLIER_I && globalUpgrade.f6620k == GlobalUpgradeType.TOWER_BASIC_ATTACK_SPEED_III) {
                    Sound.m7569a(Type.CLICK);
                } else if (globalUpgradesScreen.f7216J == GlobalUpgradeType.TOWER_BASIC_ATTACK_SPEED_III && globalUpgrade.f6620k == GlobalUpgradeType.TOWER_BASIC_DAMAGE_III) {
                    Sound.m7569a(Type.CLICK);
                } else if (globalUpgradesScreen.f7216J == GlobalUpgradeType.TOWER_BASIC_DAMAGE_III && globalUpgrade.f6620k == GlobalUpgradeType.TOWER_BASIC_ROTATION_N_PROJECTILE_SPEED_I) {
                    Something.m7545a(EasterEggType.GU_SCREEN_RESISTANCE);
                } else {
                    globalUpgradesScreen.f7215I = false;
                }
            }
            globalUpgradesScreen.f7216J = globalUpgrade.f6620k;
            return;
        }
        globalUpgradesScreen.f7215I = false;
    }

    /* renamed from: c */
    private void m7896c(GlobalUpgrade globalUpgrade) {
        if (GlobalUpgrade.m7492a(globalUpgrade.f6620k) || globalUpgrade.m7500e()) {
            this.a.f6559C.m1410a(C0430b.f1620c);
        } else {
            this.a.f6559C.m1410a(f7201j);
        }
        this.a.f6559C.mo370a(globalUpgrade.f6621l.f6688e, (float) ((globalUpgrade.f6623n - GlobalUpgrade.f6607b) - 48), (float) ((globalUpgrade.f6624o - GlobalUpgrade.f6609d) - 48), 96.0f, 96.0f);
        if (globalUpgrade.f6622m != 0) {
            this.a.f6559C.mo370a((C0438n) this.f7223s.m2467a(Integer.valueOf(globalUpgrade.f6622m)), ((float) (globalUpgrade.f6623n - GlobalUpgrade.f6607b)) - 56.0f, ((float) (globalUpgrade.f6624o - GlobalUpgrade.f6609d)) - 56.0f, 32.0f, 32.0f);
        }
        if (GlobalUpgrade.m7492a(globalUpgrade.f6620k)) {
            this.a.f6559C.mo370a(this.f7222r, ((float) (globalUpgrade.f6623n - GlobalUpgrade.f6607b)) + 26.0f, ((float) (globalUpgrade.f6624o - GlobalUpgrade.f6609d)) - 76.0f, 64.0f, 64.0f);
        }
        Iterator it = globalUpgrade.f6619j.iterator();
        while (it.hasNext()) {
            m7896c((GlobalUpgrade) it.next());
        }
    }

    /* renamed from: n */
    private void m7905n() {
        if (this.f7226v == null) {
            this.f7213G.f2611e = false;
            return;
        }
        this.f7213G.f2611e = true;
        this.f7208B.f2611e = false;
        this.f7230z.f2611e = false;
        this.f7207A.f2611e = false;
        this.f7212F.f2611e = GameScreen.f7141b.m2490c(this.f7226v.f6620k);
        if (GlobalUpgrade.m7492a(this.f7226v.f6620k)) {
            this.f7230z.f2611e = true;
        } else if (this.f7226v.m7500e()) {
            this.f7208B.f2611e = true;
            this.f7210D.m2130a(String.format(Locale.ENGLISH, "%,d", new Object[]{Integer.valueOf(this.f7226v.f6627r)}));
            if (this.f7226v.f6627r <= Game.game.f6590w.m8800a()) {
                this.f7209C.m1937a(f7196c);
                this.f7210D.m1937a(C0430b.f1620c);
                this.f7211E.m1937a(C0430b.f1620c);
                return;
            }
            this.f7209C.m1937a(f7198e);
            this.f7210D.m1937a(RED.f8609f);
            this.f7211E.m1937a(RED.f8609f);
        } else {
            this.f7207A.f2611e = true;
        }
    }

    /* renamed from: a */
    public final void mo1712a() {
    }

    /* renamed from: a */
    public final void resize(int i, int i2) {
        super.resize(i, i2);
        this.f7224t.f3064a = 1200.0f / ((float) Gdx.graphics.mo295d());
        this.f7224t.mo522a(i, i2);
        this.f7219g.m7414a();
    }

    /* renamed from: b */
    public final void mo1781b(float f) {
        if (Gdx.input.mo307b(4) || Gdx.input.mo307b(131)) {
            Game.game.m7473p();
        }
        this.f7218f.mo429a();
        this.a.f6559C.mo372a(this.f7218f.f);
        this.a.f6560D.m1458a(this.f7218f.f);
        this.a.f6560D.m1462b(new Matrix4());
        this.a.f6560D.m1456a(ShapeType.Filled);
        m7891a(GlobalUpgrade.m7495c(GlobalUpgradeType.ROOT));
        this.a.f6560D.m1451a();
        this.a.f6559C.mo365a();
        m7894b(GlobalUpgrade.m7495c(GlobalUpgradeType.ROOT));
        this.a.f6559C.mo374c();
        this.a.f6559C.mo365a();
        m7896c(GlobalUpgrade.m7495c(GlobalUpgradeType.ROOT));
        this.a.f6559C.mo374c();
        this.f7217b.m2015c();
        this.f7217b.m2001a();
    }

    /* renamed from: c */
    public final void mo1713c() {
        this.f7227w.m2130a(String.format(Locale.ENGLISH, "%,d", new Object[]{Integer.valueOf(Game.game.f6590w.m8800a())}));
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
    }

    /* renamed from: g */
    public final void mo1716g() {
    }

    /* renamed from: h */
    public final void mo1717h() {
    }

    /* renamed from: i */
    public final void mo1718i() {
    }

    public final void j_() {
        GlobalUpgrade.m7491a(FilteringMode.NONE, null);
        Gdx.input.mo304a(this.f7220p);
    }

    public final void k_() {
        Game.game.m7474q();
    }
}
