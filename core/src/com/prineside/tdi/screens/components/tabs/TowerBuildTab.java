package com.prineside.tdi.screens.components.tabs;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.C0607f;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.C0624j;
import com.badlogic.gdx.scenes.scene2d.ui.C0625d;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f.C0628a;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h;
import com.badlogic.gdx.scenes.scene2d.utils.C0618d;
import com.badlogic.gdx.scenes.scene2d.utils.C0655f;
import com.badlogic.gdx.scenes.scene2d.utils.C0663k;
import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.Game;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.screens.components.SpaceTileBonuses;
import com.prineside.tdi.screens.components.SpaceTileBonuses.BonusData;
import com.prineside.tdi.screens.components.TileMenu;
import com.prineside.tdi.tiles.SpaceTileBonus;
import com.prineside.tdi.tiles.types.SpaceTile;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.Tower.TowerType;
import com.prineside.tdi.towers.TowerStat;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.utility.MaterialColor.AMBER;
import com.prineside.tdi.utility.QuadActor;

public class TowerBuildTab extends AbstractTileMenuTab {
    /* renamed from: e */
    private static final Vector2[] f7848e = new Vector2[]{new Vector2(32.0f, 296.0f), new Vector2(160.0f, 296.0f), new Vector2(288.0f, 296.0f), new Vector2(416.0f, 296.0f), new Vector2(32.0f, 168.0f), new Vector2(160.0f, 166.0f), new Vector2(288.0f, 164.0f), new Vector2(416.0f, 162.0f), new Vector2(32.0f, 40.0f), new Vector2(160.0f, 36.0f), new Vector2(288.0f, 32.0f), new Vector2(416.0f, 28.0f)};
    /* renamed from: c */
    private C0655f f7849c;
    /* renamed from: d */
    private boolean f7850d = false;
    /* renamed from: f */
    private C0605e f7851f;
    /* renamed from: g */
    private C0629f f7852g;
    /* renamed from: h */
    private C0629f f7853h;
    /* renamed from: i */
    private SpaceTileBonuses f7854i;
    /* renamed from: j */
    private C0625d f7855j;
    /* renamed from: k */
    private C0625d f7856k;
    /* renamed from: l */
    private C0628a f7857l;
    /* renamed from: m */
    private C0628a f7858m;
    /* renamed from: n */
    private C0629f[] f7859n;
    /* renamed from: o */
    private C0605e f7860o;
    /* renamed from: p */
    private C0629f f7861p;
    /* renamed from: q */
    private C0430b f7862q = new C0430b(1431655935);
    /* renamed from: r */
    private TowerType f7863r;
    /* renamed from: s */
    private int f7864s = -1;
    /* renamed from: t */
    private Tower f7865t;
    /* renamed from: u */
    private C0645h f7866u = new C0645h();

    /* renamed from: com.prineside.tdi.screens.components.tabs.TowerBuildTab$1 */
    class C12191 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ TowerBuildTab f7835a;

        C12191(TowerBuildTab towerBuildTab) {
            this.f7835a = towerBuildTab;
        }

        /* renamed from: b */
        public final void mo500b() {
            Sound.m7569a(Type.CLICK);
            this.f7835a.m8316e();
        }
    }

    public TowerBuildTab(TileMenu tileMenu) {
        super(tileMenu);
        this.f7866u.m2192a(Game.game.f6561E);
        this.f7849c = new C0663k(Game.game.f6561E.m1442a("tile-menu-icon-tools"));
        this.f7852g = new C0629f(Game.f6551e.m2416a("tower_build_tab_hint"), new C0628a(Game.game.m7463g(36), C0430b.f1620c));
        this.f7852g.m1935a(55.0f, 680.0f);
        this.f7852g.m1955c(460.0f);
        this.f7852g.m2135h();
        this.a.mo510b(this.f7852g);
        this.f7851f = new C0605e();
        this.f7851f.f2628r = false;
        this.f7851f.m1935a(0.0f, 482.0f);
        this.f7851f.m1956c(576.0f, 400.0f);
        this.f7851f.f2611e = false;
        this.a.mo510b(this.f7851f);
        this.f7853h = new C0629f("Tower name", new C0628a(Game.game.m7463g(60), C0430b.f1620c));
        this.f7853h.m1935a(55.0f, 308.0f);
        this.f7853h.m1955c(460.0f);
        this.f7853h.m2132d(Game.game.m7463g(60).f1821a.f1796n * 0.9f, Game.game.m7463g(60).f1821a.f1797o);
        this.f7851f.mo510b(this.f7853h);
        C0602b c0629f = new C0629f(Game.f6551e.m2416a("game_gui_tile_bonuses"), new C0628a(Game.game.m7463g(30), new C0430b(1.0f, 1.0f, 1.0f, 0.25f)));
        c0629f.m1935a(55.0f, 258.0f);
        c0629f.m1955c(460.0f);
        this.f7851f.mo510b(c0629f);
        this.f7854i = new SpaceTileBonuses();
        this.f7854i.f7771a.m1935a(48.0f, 144.0f);
        this.f7854i.f7771a.m1956c(480.0f, 96.0f);
        this.f7851f.mo510b(this.f7854i.f7771a);
        this.f7860o = new C0605e();
        this.f7860o.f2628r = false;
        this.f7860o.m1956c(480.0f, 118.0f);
        this.f7860o.m1935a(44.0f, 0.0f);
        this.f7851f.mo510b(this.f7860o);
        this.f7860o.f2610d = Touchable.enabled;
        this.f7860o.m1947a(new C12191(this));
        final int[] iArr = new int[]{1, 87, 155, 255, 1, 87, 155, 255, 1, 87, 155, 255, 1, 87, 155, 255};
        final int[] iArr2 = new int[]{2, 119, 189, 255, 2, 119, 189, 255, 2, 119, 189, 255, 2, 119, 189, 255};
        final C0602b quadActor = new QuadActor(new float[]{0.0f, 0.0f, 0.0f, 0.967f, 1.0f, 1.0f, 1.0f, 0.0f}, iArr);
        quadActor.m1956c(this.f7860o.f2615i, this.f7860o.f2616j);
        this.f7860o.mo510b(quadActor);
        this.f7860o.m1947a(new C0607f(this) {
            /* renamed from: d */
            final /* synthetic */ TowerBuildTab f7839d;

            /* renamed from: a */
            public final void mo495a(int i) {
                quadActor.m8832a(iArr2);
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                quadActor.m8832a(iArr);
            }
        });
        c0629f = new C0625d(this.f7866u.m2197c("tile-menu-icon-target"));
        c0629f.m1956c(64.0f, 64.0f);
        c0629f.m1935a(24.0f, 24.0f);
        this.f7860o.mo510b(c0629f);
        c0629f = new C0629f(Game.f6551e.m2416a("tower_build_tab_default_target"), new C0628a(Game.game.m7463g(30), new C0430b(1.0f, 1.0f, 1.0f, 0.56f)));
        c0629f.m1935a(116.0f, 18.0f);
        this.f7860o.mo510b(c0629f);
        this.f7861p = new C0629f("Target", new C0628a(Game.game.m7463g(36), C0430b.f1620c));
        this.f7861p.m1935a(116.0f, 52.0f);
        this.f7860o.mo510b(this.f7861p);
        this.f7855j = new C0625d(this.f7866u.m2197c("tile-menu-tower-build-hover"));
        this.f7855j.f2611e = false;
        this.a.mo510b(this.f7855j);
        this.f7856k = new C0625d(this.f7866u.m2197c("tile-menu-tower-build-active"));
        this.f7856k.f2611e = false;
        this.a.mo510b(this.f7856k);
        this.f7857l = new C0628a(Game.game.m7465h(36), C0430b.f1620c);
        this.f7858m = new C0628a(Game.game.m7465h(36), new C0430b(-279752449));
        this.f7859n = new C0629f[TowerType.f8015m.length];
        for (final Object obj : TowerType.f8015m) {
            C0602b c0625d = new C0625d(this.f7866u.m2197c("tower-base-" + obj.ordinal()));
            c0625d.m1956c(128.0f, 128.0f);
            c0625d.m1935a(f7848e[obj.ordinal()].f2337x, f7848e[obj.ordinal()].f2338y);
            c0625d.f2610d = Touchable.enabled;
            this.a.mo510b(c0625d);
            C0602b c0625d2 = new C0625d(this.f7866u.m2197c("tower-weapon-" + obj.ordinal()));
            c0625d2.m1956c(128.0f, 128.0f);
            c0625d2.m1935a(f7848e[obj.ordinal()].f2337x, f7848e[obj.ordinal()].f2338y);
            this.a.mo510b(c0625d2);
            c0625d2.f2610d = Touchable.disabled;
            Tower tower = (Tower) Tower.f8029g.m2467a(obj);
            if (GlobalUpgrade.m7492a(tower.mo1811A())) {
                c0625d.m1947a(new C0607f(this) {
                    /* renamed from: b */
                    final /* synthetic */ TowerBuildTab f7841b;

                    /* renamed from: a */
                    public final void mo495a(int i) {
                        TowerBuildTab.m8312a(this.f7841b, obj);
                    }

                    /* renamed from: a */
                    public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                        if (this.f7841b.f7863r == obj) {
                            GameScreen gameScreen = Game.f6553g;
                            if (gameScreen != null) {
                                gameScreen.m7852a(obj, this.f7841b.f7864s);
                            }
                        } else {
                            TowerBuildTab.m8314b(this.f7841b, obj);
                            Sound.m7569a(Type.CLICK);
                        }
                        return true;
                    }

                    /* renamed from: b */
                    public final void mo498b(int i) {
                        TowerBuildTab.m8312a(this.f7841b, null);
                    }
                });
                c0625d = new C0629f(String.valueOf(tower.m8463f()), this.f7857l);
                c0625d.m2127a(16);
                c0625d.m1955c(64.0f);
                c0625d.m1935a(f7848e[obj.ordinal()].f2337x + 60.0f, f7848e[obj.ordinal()].f2338y + 8.0f);
                c0625d.f2610d = Touchable.disabled;
                this.a.mo510b(c0625d);
                this.f7859n[obj.ordinal()] = c0625d;
            } else {
                c0625d.m2117a(this.f7866u.m2197c("tower-base-greyscale-" + obj.ordinal()));
                c0625d.m1937a(new C0430b(1.0f, 1.0f, 1.0f, 0.5f));
                c0625d2.m2117a(this.f7866u.m2197c("tower-weapon-greyscale-" + obj.ordinal()));
                c0625d2.m1937a(new C0430b(0.5f, 0.5f, 0.5f, 1.0f));
            }
        }
        m8316e();
    }

    /* renamed from: a */
    static /* synthetic */ void m8312a(TowerBuildTab towerBuildTab, TowerType towerType) {
        if (towerType == null || towerBuildTab.f7863r == towerType) {
            towerBuildTab.f7855j.f2611e = false;
            return;
        }
        towerBuildTab.f7855j.m1935a(f7848e[towerType.ordinal()].f2337x - 4.0f, f7848e[towerType.ordinal()].f2338y);
        towerBuildTab.f7855j.f2611e = true;
    }

    /* renamed from: b */
    static /* synthetic */ void m8314b(TowerBuildTab towerBuildTab, TowerType towerType) {
        towerBuildTab.f7863r = towerType;
        if (towerType == null) {
            towerBuildTab.f7855j.f2611e = false;
            GameScreen gameScreen = Game.f6553g;
            if (gameScreen != null) {
                gameScreen.m7871r();
            }
        } else {
            towerBuildTab.f7856k.m1935a(f7848e[towerType.ordinal()].f2337x - 4.0f, f7848e[towerType.ordinal()].f2338y);
            towerBuildTab.f7856k.f2611e = true;
        }
        towerBuildTab.mo1793a();
    }

    /* renamed from: e */
    private void m8316e() {
        this.f7864s++;
        if (this.f7864s == 4 || this.f7864s < 0) {
            this.f7864s = 0;
        }
        this.f7861p.m2130a(Tower.m8433b(this.f7864s));
    }

    /* renamed from: a */
    public final void mo1793a() {
        final GameScreen gameScreen = Game.f6553g;
        if (gameScreen == null) {
            Game.game.logger.log("TowerBuildTab#update()", "gameScreen is null");
            return;
        }
        if (this.f7863r == null) {
            gameScreen.m7871r();
            this.f7852g.f2611e = true;
            this.f7851f.f2611e = false;
        } else if (this.b.f7782c instanceof SpaceTile) {
            Tower tower;
            final SpaceTile spaceTile = (SpaceTile) this.b.f7782c;
            if (this.f7865t != null && this.f7865t.f8049k == this.f7863r && this.f7865t.f8048j == this.b.f7782c) {
                tower = this.f7865t;
            } else {
                if (this.f7865t != null) {
                    this.f7865t.dispose();
                }
                tower = Tower.m8431a(this.f7863r);
                tower.m8451a(spaceTile);
                this.f7865t = tower;
            }
            if (this.f7850d) {
                Object obj;
                int i;
                if (!(gameScreen.f7145D != null && gameScreen.f7145D.f8651e == tower.f8064z && gameScreen.f7145D.f8648b == ((float) this.b.f7782c.f7965f) && gameScreen.f7145D.f8649c == ((float) this.b.f7782c.f7966g))) {
                    gameScreen.m7843a(new Vector2((float) this.b.f7782c.f7965f, (float) this.b.f7782c.f7966g), tower.f8064z);
                }
                TowerStatType[] u = tower.mo1830u();
                if (gameScreen.f7179t.f6758b == null) {
                    obj = 1;
                } else if (gameScreen.f7179t.f6758b.length != u.length) {
                    obj = 1;
                } else {
                    for (i = 0; i < u.length; i++) {
                        if (u[i] != gameScreen.f7179t.f6758b[i]) {
                            obj = 1;
                            break;
                        }
                    }
                    obj = null;
                }
                gameScreen.f7179t.f6758b = u;
                if (obj != null) {
                    gameScreen.f7179t.f6771o = true;
                }
                C0676a c0676a = new C0676a();
                for (final SpaceTileBonus spaceTileBonus : spaceTile.f7991s) {
                    if (spaceTileBonus != null) {
                        C0624j c0625d = new C0625d(TowerStat.m8484a(spaceTileBonus.f7950d).f8102e);
                        C0629f c0629f = new C0629f(Math.round(spaceTileBonus.m8363c() * 100.0f) + "%", new C0628a(Game.game.m7465h(30), C0430b.f1620c));
                        c0629f.m2132d(Game.game.m7463g(30).f1821a.f1796n * 0.9f, Game.game.m7463g(30).f1821a.f1797o);
                        if (tower.mo1827r().m2474c(spaceTileBonus.f7950d)) {
                            c0625d.m1937a(spaceTileBonus.m8362b());
                            c0629f.m1937a(spaceTileBonus.m8364d());
                        } else {
                            c0625d.m1937a(this.f7862q);
                            c0629f.m1937a(this.f7862q);
                        }
                        c0676a.m2296a(new BonusData(c0625d, c0629f, new Runnable(this) {
                            /* renamed from: c */
                            final /* synthetic */ TowerBuildTab f7844c;

                            public void run() {
                                gameScreen.f7182w.m8230a(TowerStat.m8484a(spaceTileBonus.f7950d).m8487b() + " x" + (((float) Math.round(spaceTileBonus.m8363c() * 100.0f)) / 100.0f) + " (LVL " + spaceTileBonus.f7951e + ")");
                            }
                        }));
                    }
                }
                if (spaceTile.f7992t > 0) {
                    C0624j c0625d2 = new C0625d(this.f7866u.m2197c("tower-stat-unique"));
                    c0625d2.m1937a(AMBER.f8397f);
                    C0629f c0629f2 = new C0629f("L" + spaceTile.f7992t, new C0628a(Game.game.m7465h(30), C0430b.f1620c));
                    c0629f2.m1937a(AMBER.f8395d);
                    c0629f2.m2132d(Game.game.m7463g(30).f1821a.f1796n * 0.9f, Game.game.m7463g(30).f1821a.f1797o);
                    c0676a.m2296a(new BonusData(c0625d2, c0629f2, new Runnable(this) {
                        /* renamed from: c */
                        final /* synthetic */ TowerBuildTab f7847c;

                        public void run() {
                            switch (spaceTile.f7992t) {
                                case 1:
                                    gameScreen.f7182w.m8230a(Game.f6551e.m2416a("tile_info_unique_stats") + " +110%");
                                    return;
                                case 2:
                                    gameScreen.f7182w.m8230a(Game.f6551e.m2416a("tile_info_unique_stats") + " +125%");
                                    return;
                                case 3:
                                    gameScreen.f7182w.m8230a(Game.f6551e.m2416a("tile_info_unique_stats") + " +150%");
                                    return;
                                default:
                                    return;
                            }
                        }
                    }));
                }
                this.f7854i.m8262a(c0676a);
            } else {
                gameScreen.m7871r();
                if (gameScreen.f7179t.f6758b != null) {
                    gameScreen.f7179t.f6758b = null;
                    gameScreen.f7179t.f6771o = true;
                }
            }
            this.f7853h.m2130a(tower.mo1823n());
            this.f7852g.f2611e = false;
            this.f7851f.f2611e = true;
        } else {
            return;
        }
        for (Object obj2 : TowerType.f8015m) {
            Tower tower2 = (Tower) Tower.f8029g.m2467a(obj2);
            if (this.f7859n[obj2.ordinal()] != null) {
                if (tower2.m8463f() > gameScreen.f7172m.m8800a()) {
                    if (this.f7859n[obj2.ordinal()].f2827q == this.f7857l) {
                        this.f7859n[obj2.ordinal()].m2129a(this.f7858m);
                    }
                } else if (this.f7859n[obj2.ordinal()].f2827q == this.f7858m) {
                    this.f7859n[obj2.ordinal()].m2129a(this.f7857l);
                }
            }
        }
    }

    /* renamed from: b */
    public final C0655f mo1794b() {
        return this.f7849c;
    }

    /* renamed from: c */
    public final void mo1795c() {
        this.f7850d = true;
        mo1793a();
    }

    /* renamed from: d */
    public final void mo1796d() {
        this.f7850d = false;
        mo1793a();
    }
}
