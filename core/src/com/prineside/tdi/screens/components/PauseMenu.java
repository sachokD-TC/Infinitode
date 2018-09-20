package com.prineside.tdi.screens.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0444a;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.C0607f;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f.C0628a;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.C0618d;
import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.Game;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.utility.FastBadRandom;
import com.prineside.tdi.utility.MaterialColor.LIGHT_BLUE;
import com.prineside.tdi.utility.QuadActor;
import java.util.Iterator;

public class PauseMenu {
    /* renamed from: a */
    public C0605e f7761a;
    /* renamed from: b */
    public C0602b f7762b;
    /* renamed from: c */
    private C0676a<PauseMenuItem> f7763c;
    /* renamed from: d */
    private final Table f7764d;
    /* renamed from: e */
    private float[] f7765e = new float[8];

    /* renamed from: com.prineside.tdi.screens.components.PauseMenu$1 */
    class C11981 extends C0602b {
        /* renamed from: q */
        final /* synthetic */ PauseMenu f7740q;

        C11981(PauseMenu pauseMenu) {
            this.f7740q = pauseMenu;
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
            Game.game.f6560D.m1455a(new C0430b(0.07f, 0.07f, 0.07f, 0.7f));
            Game.game.f6560D.m1460b(this.f2613g, this.f2614h, this.f2615i, this.f2616j);
            Game.game.f6560D.m1451a();
            Game.game.f6560D.m1458a(a2);
            Game.game.f6560D.m1462b(a);
            c0444a.mo365a();
        }
    }

    /* renamed from: com.prineside.tdi.screens.components.PauseMenu$2 */
    class C11992 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ PauseMenu f7741a;

        C11992(PauseMenu pauseMenu) {
            this.f7741a = pauseMenu;
        }

        /* renamed from: a */
        public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
            return true;
        }
    }

    /* renamed from: com.prineside.tdi.screens.components.PauseMenu$6 */
    class C12076 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ PauseMenu f7752a;

        /* renamed from: com.prineside.tdi.screens.components.PauseMenu$6$1 */
        class C12051 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C12076 f7750a;

            C12051(C12076 c12076) {
                this.f7750a = c12076;
            }

            public void run() {
                this.f7750a.f7752a.f7764d.f2611e = true;
                Game.f6553g.f7185z.m8211a();
            }
        }

        /* renamed from: com.prineside.tdi.screens.components.PauseMenu$6$2 */
        class C12062 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C12076 f7751a;

            C12062(C12076 c12076) {
                this.f7751a = c12076;
            }

            public void run() {
                this.f7751a.f7752a.f7764d.f2611e = true;
                Game.game.m7473p();
                Game.f6553g.f7185z.m8211a();
            }
        }

        C12076(PauseMenu pauseMenu) {
            this.f7752a = pauseMenu;
        }

        public void run() {
            Sound.m7569a(Type.CLICK);
            this.f7752a.f7764d.f2611e = false;
            Game.f6553g.f7185z.m8214a(Game.f6551e.m2416a("game_pause_go_to_main_menu"), Game.f6551e.m2416a("no"), Game.f6551e.m2416a("yes"), null, null, new C12051(this), new C12062(this));
        }
    }

    class PauseMenuItem {
        /* renamed from: a */
        public C0605e f7758a = new C0605e();
        /* renamed from: b */
        public QuadActor f7759b;
        /* renamed from: c */
        final /* synthetic */ PauseMenu f7760c;

        public PauseMenuItem(PauseMenu pauseMenu, String str, Runnable runnable) {
            this.f7760c = pauseMenu;
            final C0430b c0430b = LIGHT_BLUE.f8529j;
            final C0430b c0430b2 = LIGHT_BLUE.f8527h;
            C0628a c0628a = new C0628a(Game.game.m7463g(48), C0430b.f1620c);
            this.f7758a.m1956c(512.0f, 128.0f);
            this.f7759b = new QuadActor(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f}, C0430b.f1620c);
            this.f7759b.m1956c(this.f7758a.f2615i, this.f7758a.f2616j);
            this.f7759b.m8833b(c0430b);
            this.f7758a.mo510b(this.f7759b);
            C0602b c0629f = new C0629f(str, c0628a);
            c0629f.m1956c(this.f7758a.f2615i, this.f7758a.f2616j);
            c0629f.m2127a(1);
            this.f7758a.mo510b(c0629f);
            this.f7758a.f2610d = Touchable.enabled;
            final PauseMenu pauseMenu2 = pauseMenu;
            final Runnable runnable2 = runnable;
            this.f7758a.m1947a(new C0607f(this) {
                /* renamed from: e */
                final /* synthetic */ PauseMenuItem f7757e;

                /* renamed from: a */
                public final void mo495a(int i) {
                    this.f7757e.f7759b.m8833b(c0430b2);
                }

                /* renamed from: a */
                public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                    runnable2.run();
                    return true;
                }

                /* renamed from: b */
                public final void mo498b(int i) {
                    this.f7757e.f7759b.m8833b(c0430b);
                }
            });
        }
    }

    public PauseMenu(final GameScreen gameScreen) {
        new C0645h().m2192a(Game.game.f6561E);
        this.f7763c = new C0676a();
        this.f7761a = new C0605e();
        this.f7761a.f2628r = false;
        this.f7761a.f2610d = Touchable.childrenOnly;
        this.f7761a.m1956c(0.0f, 0.0f);
        this.f7761a.m1935a(0.0f, 0.0f);
        this.f7761a.f2611e = false;
        gameScreen.f7181v.m2004a(this.f7761a);
        this.f7762b = new C11981(this);
        this.f7762b.m1956c(gameScreen.f7181v.f2641b.f3056c, gameScreen.f7181v.f2641b.f3057d);
        this.f7762b.f2610d = Touchable.enabled;
        this.f7762b.m1947a(new C11992(this));
        this.f7761a.mo510b(this.f7762b);
        this.f7764d = new Table();
        this.f7764d.f2677Y = true;
        this.f7761a.mo510b(this.f7764d);
        Object pauseMenuItem = new PauseMenuItem(this, Game.f6551e.m2416a("continue"), new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ PauseMenu f7743b;

            public void run() {
                Sound.m7569a(Type.CLICK);
                gameScreen.m7865l();
                this.f7743b.m8260b();
            }
        });
        this.f7763c.m2296a(pauseMenuItem);
        this.f7764d.m2059d(pauseMenuItem.f7758a).m2101g(8.0f);
        this.f7764d.m2066q();
        pauseMenuItem = new PauseMenuItem(this, Game.f6551e.m2416a("help"), new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ PauseMenu f7745b;

            public void run() {
                Sound.m7569a(Type.CLICK);
                gameScreen.m7867n();
            }
        });
        this.f7763c.m2296a(pauseMenuItem);
        this.f7764d.m2059d(pauseMenuItem.f7758a).m2101g(8.0f);
        this.f7764d.m2066q();
        pauseMenuItem = new PauseMenuItem(this, Game.f6551e.m2416a("game_pause_end_game"), new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ PauseMenu f7749b;

            /* renamed from: com.prineside.tdi.screens.components.PauseMenu$5$1 */
            class C12021 implements Runnable {
                /* renamed from: a */
                final /* synthetic */ C12045 f7746a;

                C12021(C12045 c12045) {
                    this.f7746a = c12045;
                }

                public void run() {
                    this.f7746a.f7749b.f7764d.f2611e = true;
                    Game.f6553g.f7185z.m8211a();
                }
            }

            /* renamed from: com.prineside.tdi.screens.components.PauseMenu$5$2 */
            class C12032 implements Runnable {
                /* renamed from: a */
                final /* synthetic */ C12045 f7747a;

                C12032(C12045 c12045) {
                    this.f7747a = c12045;
                }

                public void run() {
                    this.f7747a.f7749b.f7764d.f2611e = true;
                    gameScreen.m7845a(null);
                    Game.f6553g.f7185z.m8211a();
                }
            }

            public void run() {
                Sound.m7569a(Type.CLICK);
                this.f7749b.f7764d.f2611e = false;
                Game.f6553g.f7185z.m8214a(Game.f6551e.m2416a("game_pause_game_can_not_be_continued"), Game.f6551e.m2416a("no"), Game.f6551e.m2416a("yes"), null, null, new C12021(this), new C12032(this));
            }
        });
        this.f7763c.m2296a(pauseMenuItem);
        this.f7764d.m2059d(pauseMenuItem.f7758a).m2101g(8.0f);
        this.f7764d.m2066q();
        pauseMenuItem = new PauseMenuItem(this, Game.f6551e.m2416a("game_pause_main_menu"), new C12076(this));
        this.f7763c.m2296a(pauseMenuItem);
        this.f7764d.m2059d(pauseMenuItem.f7758a).m2101g(8.0f);
        this.f7764d.m2066q();
        m8258c();
    }

    /* renamed from: c */
    private void m8258c() {
        float c = FastBadRandom.m8811c() * 0.08f;
        float c2 = 1.0f - (FastBadRandom.m8811c() * 0.08f);
        float c3 = FastBadRandom.m8811c() * 0.08f;
        float c4 = FastBadRandom.m8811c() * 0.08f;
        Iterator it = this.f7763c.iterator();
        float f = c;
        c = c2;
        c2 = c3;
        c3 = c4;
        while (it.hasNext()) {
            PauseMenuItem pauseMenuItem = (PauseMenuItem) it.next();
            this.f7765e[0] = FastBadRandom.m8811c() * 0.08f;
            this.f7765e[1] = FastBadRandom.m8811c() * 0.08f;
            this.f7765e[2] = f;
            this.f7765e[3] = 1.0f - (0.08f - c2);
            this.f7765e[4] = c;
            this.f7765e[5] = 1.0f - (0.08f - c3);
            this.f7765e[6] = 1.0f - this.f7765e[0];
            this.f7765e[7] = FastBadRandom.m8811c() * 0.08f;
            pauseMenuItem.f7759b.m8831a(this.f7765e);
            c = this.f7765e[0];
            c2 = this.f7765e[6];
            f = c;
            c = c2;
            c2 = this.f7765e[1];
            c3 = this.f7765e[7];
        }
    }

    /* renamed from: a */
    public final void m8259a() {
        m8258c();
        this.f7761a.f2611e = true;
    }

    /* renamed from: b */
    public final void m8260b() {
        this.f7761a.f2611e = false;
    }
}
