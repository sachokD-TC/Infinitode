package com.prineside.tdi.screens.components.tabs;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0444a;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Matrix4;
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
import com.prineside.tdi.DailyQuest.QuestType;
import com.prineside.tdi.Game;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.Statistics.StatisticsType;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.screens.components.Dialog;
import com.prineside.tdi.screens.components.Dialog.C11866;
import com.prineside.tdi.screens.components.SpaceTileBonuses;
import com.prineside.tdi.screens.components.SpaceTileBonuses.BonusData;
import com.prineside.tdi.screens.components.TileMenu;
import com.prineside.tdi.tiles.SpaceTileBonus;
import com.prineside.tdi.tiles.types.SpaceTile;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.TowerStat;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.towers.TowerUpgrade;
import com.prineside.tdi.towers.TowerUpgrade.TowerUpgradeType;
import com.prineside.tdi.utility.MaterialColor.AMBER;
import com.prineside.tdi.utility.MaterialColor.CYAN;
import com.prineside.tdi.utility.MaterialColor.RED;
import com.prineside.tdi.utility.QuadActor;

public class TowerInfoTab extends AbstractTileMenuTab {
    /* renamed from: c */
    private C0655f f7917c = new C0663k(Game.game.f6561E.m1442a("tile-menu-icon-tower"));
    /* renamed from: d */
    private boolean f7918d = false;
    /* renamed from: e */
    private Tower f7919e;
    /* renamed from: f */
    private long f7920f;
    /* renamed from: g */
    private int f7921g = -1;
    /* renamed from: h */
    private float f7922h = -1.0f;
    /* renamed from: i */
    private float f7923i = -1.0f;
    /* renamed from: j */
    private C0602b f7924j;
    /* renamed from: k */
    private C0629f f7925k;
    /* renamed from: l */
    private C0629f f7926l;
    /* renamed from: m */
    private C0629f f7927m;
    /* renamed from: n */
    private C0629f f7928n;
    /* renamed from: o */
    private C0629f f7929o;
    /* renamed from: p */
    private C0629f f7930p;
    /* renamed from: q */
    private C0629f f7931q;
    /* renamed from: r */
    private UpgradeButton[] f7932r;
    /* renamed from: s */
    private C0645h f7933s = new C0645h();
    /* renamed from: t */
    private C0605e f7934t;
    /* renamed from: u */
    private SpaceTileBonuses f7935u;
    /* renamed from: v */
    private C0430b f7936v = new C0430b(1431655935);
    /* renamed from: w */
    private C0625d f7937w;
    /* renamed from: x */
    private UpgradeButton f7938x = null;

    class UpgradeButton {
        /* renamed from: a */
        public int f7900a;
        /* renamed from: b */
        public C0605e f7901b;
        /* renamed from: c */
        public QuadActor f7902c;
        /* renamed from: d */
        public C0625d f7903d;
        /* renamed from: e */
        public C0629f f7904e;
        /* renamed from: f */
        public C0629f f7905f;
        /* renamed from: g */
        public String f7906g = "";
        /* renamed from: h */
        final /* synthetic */ TowerInfoTab f7907h;
        /* renamed from: i */
        private final int[] f7908i = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        /* renamed from: j */
        private final int[] f7909j = new int[]{1, 87, 155, 255, 1, 87, 155, 255, 1, 87, 155, 255, 1, 87, 155, 255};
        /* renamed from: k */
        private final int[] f7910k = new int[]{2, 119, 189, 255, 2, 119, 189, 255, 2, 119, 189, 255, 2, 119, 189, 255};
        /* renamed from: l */
        private final int[] f7911l = new int[]{46, 125, 50, 255, 46, 125, 50, 255, 46, 125, 50, 255, 46, 125, 50, 255};
        /* renamed from: m */
        private final int[] f7912m = new int[]{56, 142, 60, 255, 56, 142, 60, 255, 56, 142, 60, 255, 56, 142, 60, 255};
        /* renamed from: n */
        private final C0430b f7913n = new C0430b(-279752449);
        /* renamed from: o */
        private boolean f7914o = true;
        /* renamed from: p */
        private boolean f7915p = false;
        /* renamed from: q */
        private boolean f7916q = false;

        public UpgradeButton(final TowerInfoTab towerInfoTab, final int i, float[] fArr) {
            this.f7907h = towerInfoTab;
            this.f7900a = i;
            this.f7901b = new C0605e();
            this.f7901b.f2628r = false;
            this.f7901b.f2610d = Touchable.enabled;
            this.f7901b.m1956c(234.0f, 96.0f);
            this.f7902c = new QuadActor(fArr, this.f7908i);
            this.f7902c.m1956c(234.0f, 96.0f);
            this.f7902c.f2610d = Touchable.disabled;
            this.f7901b.mo510b(this.f7902c);
            this.f7903d = new C0625d(Game.game.f6561E.m1442a("blank"));
            this.f7903d.f2610d = Touchable.disabled;
            this.f7903d.m1956c(64.0f, 64.0f);
            this.f7903d.m1935a(20.0f, 16.0f);
            this.f7901b.mo510b(this.f7903d);
            this.f7904e = new C0629f("10 lvl", new C0628a(Game.game.m7463g(30), C0430b.f1620c));
            this.f7904e.m1955c(100.0f);
            this.f7904e.m1935a(106.0f, 46.0f);
            this.f7904e.m2127a(16);
            this.f7901b.mo510b(this.f7904e);
            this.f7905f = new C0629f("12345", new C0628a(Game.game.m7463g(30), C0430b.f1620c));
            this.f7905f.m1955c(100.0f);
            this.f7905f.m1935a(76.0f, 12.0f);
            this.f7905f.m2127a(16);
            this.f7901b.mo510b(this.f7905f);
            C0602b c0625d = new C0625d(Game.game.f6561E.m1442a("game-gui-money"));
            c0625d.m1956c(48.0f, 48.0f);
            c0625d.m1935a(174.0f, 4.0f);
            this.f7901b.mo510b(c0625d);
            this.f7901b.m1947a(new C0607f(this) {
                /* renamed from: b */
                final /* synthetic */ UpgradeButton f7895b;

                /* renamed from: a */
                public final void mo495a(int i) {
                    this.f7895b.f7916q = true;
                    this.f7895b.m8335a();
                }

                /* renamed from: b */
                public final void mo498b(int i) {
                    this.f7895b.f7916q = false;
                    this.f7895b.m8335a();
                }
            });
            this.f7901b.m1947a(new C0618d(this) {
                /* renamed from: h */
                final /* synthetic */ UpgradeButton f7899h;

                /* renamed from: b */
                public final void mo500b() {
                    if (this != this.f7899h.f7907h.f7938x) {
                        Sound.m7569a(Type.CLICK);
                        this.f7899h.f7907h.m8341a(this);
                        this.f7899h.f7907h.mo1793a();
                        GameScreen gameScreen = Game.f6553g;
                        if (gameScreen != null && gameScreen.f7182w != null) {
                            gameScreen.f7182w.m8231a(this.f7899h.f7906g, 3.0f);
                        }
                    } else if (Game.f6553g != null && this.f7899h.f7907h.b.f7782c != null && this.f7899h.f7907h.b.f7782c.f7962c != null && this.f7899h.f7907h.b.f7782c.f7962c.f8058t[i] < this.f7899h.f7907h.b.f7782c.f7962c.m8464g() && Game.f6553g.m7853a(this.f7899h.f7907h.b.f7782c.f7962c, i)) {
                        Sound.m7569a(Type.CLICK);
                        this.f7899h.f7907h.mo1793a();
                    }
                }
            });
            m8335a();
        }

        /* renamed from: a */
        private void m8335a() {
            if (this.f7914o) {
                this.f7901b.f2610d = Touchable.enabled;
                this.f7905f.m1937a(C0430b.f1620c);
                if (this.f7915p) {
                    if (this.f7916q) {
                        this.f7902c.m8832a(this.f7912m);
                        return;
                    } else {
                        this.f7902c.m8832a(this.f7911l);
                        return;
                    }
                } else if (this.f7916q) {
                    this.f7902c.m8832a(this.f7910k);
                    return;
                } else {
                    this.f7902c.m8832a(this.f7909j);
                    return;
                }
            }
            this.f7902c.m8832a(this.f7908i);
            this.f7901b.f2610d = Touchable.disabled;
            this.f7905f.m1937a(this.f7913n);
        }

        /* renamed from: a */
        public final void m8338a(boolean z) {
            if (this.f7914o != z) {
                this.f7914o = z;
                m8335a();
            }
        }

        /* renamed from: b */
        public final void m8339b(boolean z) {
            if (this.f7915p != z) {
                this.f7915p = z;
                m8335a();
            }
        }
    }

    public TowerInfoTab(final TileMenu tileMenu) {
        C0602b c0605e;
        C0602b quadActor;
        super(tileMenu);
        this.f7933s.m2192a(Game.game.f6561E);
        this.f7925k = new C0629f("Tower name", new C0628a(Game.game.m7463g(60), C0430b.f1620c));
        this.f7925k.f2610d = Touchable.disabled;
        this.f7925k.m1935a(55.0f, 790.0f);
        this.f7925k.m1955c(521.0f);
        this.f7925k.m2132d(Game.game.m7463g(60).f1821a.f1796n * 0.9f, Game.game.m7463g(60).f1821a.f1797o);
        this.a.mo510b(this.f7925k);
        this.f7926l = new C0629f("L10", new C0628a(Game.game.m7465h(60), new C0430b(-4126721)));
        this.f7926l.f2610d = Touchable.disabled;
        this.f7926l.m1935a(432.0f, 790.0f);
        this.f7926l.m1955c(100.0f);
        this.f7926l.m2127a(16);
        this.a.mo510b(this.f7926l);
        this.f7927m = new C0629f("1390 / 1520", new C0628a(Game.game.m7463g(30), new C0430b(-137)));
        this.f7927m.f2610d = Touchable.disabled;
        this.f7927m.m1935a(424.0f, 757.0f);
        this.f7927m.m1955c(100.0f);
        this.f7927m.m2127a(16);
        this.a.mo510b(this.f7927m);
        final C0430b c0430b = new C0430b(0.3f, 0.3f, 0.3f, 1.0f);
        final Matrix4[] matrix4Arr = new Matrix4[]{new Matrix4()};
        final Matrix4[] matrix4Arr2 = new Matrix4[]{new Matrix4()};
        C0602b c12241 = new C0602b(this) {
            /* renamed from: t */
            final /* synthetic */ TowerInfoTab f7873t;

            /* renamed from: a */
            public final void mo471a(C0444a c0444a, float f) {
                c0444a.mo374c();
                matrix4Arr[0].m1691a(Game.game.f6560D.f2112c);
                matrix4Arr2[0].m1691a(Game.game.f6560D.f2111b);
                Game.game.f6560D.m1458a(c0444a.mo378g());
                Game.game.f6560D.m1462b(c0444a.mo379h());
                Game.game.f6560D.m1456a(ShapeType.Filled);
                Game.game.f6560D.m1455a(c0430b);
                Game.game.f6560D.m1460b(this.f2613g, this.f2614h, this.f2615i, this.f2616j);
                Game.game.f6560D.m1451a();
                Game.game.f6560D.m1458a(matrix4Arr2[0]);
                Game.game.f6560D.m1462b(matrix4Arr[0]);
                c0444a.mo365a();
            }
        };
        c12241.m1956c(310.0f, 18.0f);
        c12241.m1935a(55.0f, 763.0f);
        c12241.m1952b(1.0f, 1.0f, 1.0f, 0.3f);
        this.a.mo510b(c12241);
        this.f7924j = new C0602b(this) {
            /* renamed from: s */
            final /* synthetic */ TowerInfoTab f7876s;

            /* renamed from: a */
            public final void mo471a(C0444a c0444a, float f) {
                c0444a.mo374c();
                matrix4Arr[0].m1691a(Game.game.f6560D.f2112c);
                matrix4Arr2[0].m1691a(Game.game.f6560D.f2111b);
                Game.game.f6560D.m1458a(c0444a.mo378g());
                Game.game.f6560D.m1462b(c0444a.mo379h());
                Game.game.f6560D.m1456a(ShapeType.Filled);
                Game.game.f6560D.m1455a(C0430b.f1620c);
                Game.game.f6560D.m1460b(this.f2613g, this.f2614h, this.f2615i, this.f2616j);
                Game.game.f6560D.m1451a();
                Game.game.f6560D.m1458a(matrix4Arr2[0]);
                Game.game.f6560D.m1462b(matrix4Arr[0]);
                c0444a.mo365a();
            }
        };
        this.f7924j.m1956c(150.0f, 18.0f);
        this.f7924j.m1935a(55.0f, 763.0f);
        this.f7924j.m1952b(1.0f, 1.0f, 1.0f, 1.0f);
        this.a.mo510b(this.f7924j);
        this.f7935u = new SpaceTileBonuses();
        this.f7935u.f7771a.m1935a(48.0f, 384.0f);
        this.f7935u.f7771a.m1956c(480.0f, 96.0f);
        this.a.mo510b(this.f7935u.f7771a);
        this.f7932r = new UpgradeButton[4];
        this.f7932r[0] = new UpgradeButton(this, 0, new float[]{0.0f, 0.0f, 0.0f, 0.9375f, 1.0f, 1.0f, 1.0f, 0.0f});
        this.f7932r[0].f7901b.m1935a(46.0f, 260.0f);
        this.a.mo510b(this.f7932r[0].f7901b);
        this.f7932r[1] = new UpgradeButton(this, 1, new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.9375f, 1.0f, 0.0f});
        this.f7932r[1].f7901b.m1935a(292.0f, 260.0f);
        this.a.mo510b(this.f7932r[1].f7901b);
        this.f7932r[2] = new UpgradeButton(this, 2, new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f});
        this.f7932r[2].f7901b.m1935a(46.0f, 153.0f);
        this.a.mo510b(this.f7932r[2].f7901b);
        this.f7932r[3] = new UpgradeButton(this, 3, new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f});
        this.f7932r[3].f7901b.m1935a(292.0f, 153.0f);
        this.a.mo510b(this.f7932r[3].f7901b);
        if (Game.game.f6581m) {
            c0605e = new C0605e();
            c0605e.f2610d = Touchable.enabled;
            c0605e.f2628r = false;
            c0605e.m1956c(130.0f, 238.0f);
            c0605e.m1935a(576.0f, 435.0f);
            c0605e.m1947a(new C0607f(this) {
                /* renamed from: b */
                final /* synthetic */ TowerInfoTab f7878b;

                /* renamed from: a */
                public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                    boolean z = false;
                    if (!(Game.f6553g == null || tileMenu.f7782c == null || tileMenu.f7782c.f7962c == null)) {
                        int i3 = 0;
                        while (i3 < 4) {
                            if (tileMenu.f7782c.f7962c.f8058t[i3] < tileMenu.f7782c.f7962c.m8464g() && Game.f6553g.m7853a(tileMenu.f7782c.f7962c, i3)) {
                                z = true;
                            }
                            i3++;
                        }
                    }
                    if (z) {
                        this.f7878b.mo1793a();
                        Sound.m7569a(Type.UPGRADE);
                    } else {
                        Sound.m7569a(Type.CLICK);
                    }
                    inputEvent.m1879b();
                    return true;
                }
            });
            this.a.mo510b(c0605e);
            quadActor = new QuadActor(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 0.8f, 0.9f, 1.0f, 0.13f}, new int[]{2, 136, 209, 204, 2, 136, 209, 204, 2, 136, 209, 204, 2, 136, 209, 204});
            quadActor.m1956c(130.0f, 238.0f);
            quadActor.m1935a(0.0f, 0.0f);
            c0605e.mo510b(quadActor);
            quadActor = new C0625d(this.f7933s.m2197c("main-menu-icon-global-upgrades"));
            quadActor.m1956c(62.0f, 62.0f);
            quadActor.m1935a(26.0f, 93.0f);
            quadActor.m1952b(1.0f, 1.0f, 1.0f, 0.78f);
            c0605e.mo510b(quadActor);
            c0605e.m1947a(new C0607f(this) {
                /* renamed from: b */
                final /* synthetic */ TowerInfoTab f7880b;

                /* renamed from: a */
                public final void mo495a(int i) {
                    quadActor.m1952b(1.0f, 1.0f, 1.0f, 1.0f);
                }

                /* renamed from: b */
                public final void mo498b(int i) {
                    quadActor.m1952b(1.0f, 1.0f, 1.0f, 0.78f);
                }
            });
        }
        this.f7937w = new C0625d(Game.game.f6561E.m1442a("tile-menu-upgrade-button-active-check"));
        this.f7937w.m1956c(64.0f, 64.0f);
        this.f7937w.f2610d = Touchable.disabled;
        this.f7937w.f2611e = false;
        this.a.mo510b(this.f7937w);
        c0605e = new C0605e();
        c0605e.f2628r = false;
        c0605e.m1956c(234.0f, 96.0f);
        c0605e.m1935a(46.0f, 46.0f);
        this.a.mo510b(c0605e);
        quadActor = new QuadActor(new float[]{0.0f, 0.0625f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f}, C0430b.f1620c);
        quadActor.m1937a(RED.f8613j);
        quadActor.m1956c(c0605e.f2615i, c0605e.f2616j);
        c0605e.mo510b(quadActor);
        C0602b c0625d = new C0625d(Game.game.f6561E.m1442a("tile-menu-icon-sell"));
        c0625d.m1956c(48.0f, 48.0f);
        c0625d.m1935a(24.0f, 24.0f);
        c0605e.mo510b(c0625d);
        this.f7928n = new C0629f("90001", new C0628a(Game.game.m7463g(36), C0430b.f1620c));
        this.f7928n.f2610d = Touchable.disabled;
        this.f7928n.m1935a(72.0f, 4.0f);
        this.f7928n.m1955c(138.0f);
        this.f7928n.m1959d(92.0f);
        this.f7928n.m2127a(16);
        c0605e.mo510b(this.f7928n);
        c0605e.m1947a(new C0618d(this) {
            /* renamed from: f */
            final /* synthetic */ TowerInfoTab f7884f;

            /* renamed from: b */
            public final void mo500b() {
                final GameScreen gameScreen = Game.f6553g;
                if (gameScreen == null) {
                    Game.game.logger.log("TowerInfoTab.sellButton > clickListener", "gameScreen is null");
                } else if (tileMenu.f7782c != null && tileMenu.f7782c.f7962c != null) {
                    Dialog dialog = gameScreen.f7185z;
                    dialog.m8214a(Game.f6551e.m2416a("tower_info_tab_sell_the_tower"), Game.f6551e.m2416a("no"), Game.f6551e.m2416a("yes"), Dialog.f7650a, RED.f8611h, new C11866(dialog), new Runnable(this) {
                        /* renamed from: b */
                        final /* synthetic */ C12295 f7882b;

                        public void run() {
                            if (tileMenu.f7782c.f7962c != null) {
                                GameScreen gameScreen = gameScreen;
                                Tower tower = tileMenu.f7782c.f7962c;
                                int a = tower.m8446a(gameScreen.f7173n);
                                Game.game.f6563G.m7429a(QuestType.SELL_TOWERS_ON_SUM_OF, a);
                                gameScreen.m7841a(a);
                                gameScreen.f7179t.m7526a(tower);
                                gameScreen.f7183x.m8274a();
                                tower.dispose();
                                Game.f6554h.m7582b(StatisticsType.TOWERS_SOLD, 1);
                                if (tower.f8052n != 0.0f) {
                                    Game.f6554h.m7581a(tower.f8049k, (long) ((int) tower.f8052n));
                                }
                                this.f7882b.f7884f.mo1793a();
                            }
                            gameScreen.f7185z.m8211a();
                        }
                    });
                }
            }
        });
        c0605e.m1947a(new C0607f(this) {
            /* renamed from: b */
            final /* synthetic */ TowerInfoTab f7886b;

            /* renamed from: a */
            public final void mo495a(int i) {
                quadActor.m1937a(RED.f8611h);
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                quadActor.m1937a(RED.f8613j);
            }
        });
        this.f7934t = new C0605e();
        this.f7934t.f2628r = false;
        this.f7934t.m1956c(234.0f, 96.0f);
        this.f7934t.m1935a(292.0f, 46.0f);
        this.a.mo510b(this.f7934t);
        c0605e = new QuadActor(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0625f}, C0430b.f1620c);
        c0605e.m1937a(CYAN.f8448i);
        c0605e.m1956c(this.f7934t.f2615i, this.f7934t.f2616j);
        this.f7934t.mo510b(c0605e);
        this.f7929o = new C0629f("Target", new C0628a(Game.game.m7463g(36), C0430b.f1620c));
        this.f7929o.f2610d = Touchable.disabled;
        this.f7929o.m1935a(0.0f, 4.0f);
        this.f7929o.m1956c(this.f7934t.f2615i, this.f7934t.f2616j - 4.0f);
        this.f7929o.m2127a(1);
        this.f7934t.mo510b(this.f7929o);
        this.f7934t.m1947a(new C0618d(this) {
            /* renamed from: f */
            final /* synthetic */ TowerInfoTab f7888f;

            /* renamed from: b */
            public final void mo500b() {
                GameScreen gameScreen = Game.f6553g;
                if (gameScreen == null) {
                    Game.game.logger.log("TowerInfoTab.targetingModeButton > clickListener", "gameScreen is null");
                } else if (tileMenu.f7782c != null && tileMenu.f7782c.f7962c != null) {
                    this.f7888f.f7920f = 0;
                    Tower tower = tileMenu.f7782c.f7962c;
                    tower.f8050l++;
                    if (tower.f8050l >= 4) {
                        tower.f8050l = 0;
                    }
                    tower.m8450a(null);
                    gameScreen.f7183x.m8274a();
                    Sound.m7569a(Type.CLICK);
                }
            }
        });
        this.f7934t.m1947a(new C0607f(this) {
            /* renamed from: b */
            final /* synthetic */ TowerInfoTab f7890b;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0605e.m1937a(CYAN.f8447h);
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0605e.m1937a(CYAN.f8448i);
            }
        });
        c0605e = new C0605e();
        c0605e.f2628r = false;
        c0605e.m1955c(475.0f);
        c0605e.m1959d(320.0f);
        c0605e.m1935a(55.0f, 416.0f);
        c0605e.f2610d = Touchable.disabled;
        this.a.mo510b(c0605e);
        this.f7930p = new C0629f("Stat type\nStat type\nStat type\nStat type\nStat type\n[#FFC107]Stat type[]\n[#FFC107]Stat type[]", new C0628a(Game.game.m7465h(30), C0430b.f1620c));
        this.f7930p.m2127a(10);
        this.f7930p.m1956c(475.0f, 320.0f);
        this.f7930p.m2132d(Game.game.m7463g(30).f1821a.f1796n * 0.9f, Game.game.m7463g(30).f1821a.f1797o);
        c0605e.mo510b(this.f7930p);
        this.f7931q = new C0629f("15.0 [#4caf50]+ 11.2[]\n16422 [#4caf50]+ 18141[]\n0.32 [#4caf50]+ 0.05[]\n175 [#4caf50]+ 14.2[]\n1.5 [#4caf50]- 0.2[]\n[#FFC107]20%[] [#4caf50]+ 5%[]\n[#FFC107]x4.2[] [#4caf50]+ 2.1[]", new C0628a(Game.game.m7465h(30), C0430b.f1620c));
        this.f7931q.m2127a(18);
        this.f7931q.m1956c(475.0f, 320.0f);
        this.f7931q.m2132d(Game.game.m7463g(30).f1821a.f1796n * 0.9f, Game.game.m7463g(30).f1821a.f1797o);
        c0605e.mo510b(this.f7931q);
    }

    /* renamed from: a */
    private void m8341a(UpgradeButton upgradeButton) {
        if (this.f7938x != null) {
            this.f7938x.m8339b(false);
        }
        if (upgradeButton != null) {
            upgradeButton.m8339b(true);
            float f = upgradeButton.f7901b.f2613g;
            float f2 = upgradeButton.f7901b.f2614h;
            this.f7937w.f2611e = true;
            this.f7937w.m1935a(f + 200.0f, f2 - 10.0f);
        } else {
            this.f7937w.f2611e = false;
        }
        this.f7938x = upgradeButton;
        this.f7920f = 0;
    }

    /* renamed from: a */
    public final void mo1793a() {
        final GameScreen gameScreen = Game.f6553g;
        if (gameScreen == null) {
            Game.game.logger.log("TowerInfoTab#update()", "gameScreen is null");
        } else if (this.b.f7782c.f7962c != null) {
            int i;
            int i2;
            Tower tower = this.b.f7782c.f7962c;
            final SpaceTile spaceTile = (SpaceTile) this.b.f7782c;
            if (this.f7919e == null || this.f7919e.f8049k != tower.f8049k) {
                this.f7925k.m2130a(tower.mo1823n());
                this.f7920f = 0;
                TowerUpgradeType[] v = tower.mo1831v();
                for (i = 0; i < 4; i++) {
                    TowerUpgrade a = TowerUpgrade.m8489a(v[i]);
                    this.f7932r[i].f7903d.m2117a(new C0663k(a.f8121b));
                    this.f7932r[i].f7906g = Game.f6551e.m2416a(a.f8120a);
                }
            }
            if (this.f7919e != tower) {
                m8341a(null);
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
                            c0625d.m1937a(this.f7936v);
                            c0629f.m1937a(this.f7936v);
                        }
                        c0676a.m2296a(new BonusData(c0625d, c0629f, new Runnable(this) {
                            /* renamed from: c */
                            final /* synthetic */ TowerInfoTab f7893c;

                            public void run() {
                                gameScreen.f7182w.m8230a(TowerStat.m8484a(spaceTileBonus.f7950d).m8487b() + " x" + (((float) Math.round(spaceTileBonus.m8363c() * 100.0f)) / 100.0f) + " (LVL " + spaceTileBonus.f7951e + ")");
                            }
                        }));
                    }
                }
                if (spaceTile.f7992t > 0) {
                    C0624j c0625d2 = new C0625d(this.f7933s.m2197c("tower-stat-unique"));
                    c0625d2.m1937a(AMBER.f8397f);
                    C0629f c0629f2 = new C0629f("L" + spaceTile.f7992t, new C0628a(Game.game.m7465h(30), C0430b.f1620c));
                    c0629f2.m1937a(AMBER.f8395d);
                    c0629f2.m2132d(Game.game.m7463g(30).f1821a.f1796n * 0.9f, Game.game.m7463g(30).f1821a.f1797o);
                    c0676a.m2296a(new BonusData(c0625d2, c0629f2, new Runnable(this) {
                        /* renamed from: c */
                        final /* synthetic */ TowerInfoTab f7869c;

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
                this.f7935u.m8262a(c0676a);
            }
            if (this.f7921g != tower.f8057s) {
                this.f7921g = tower.f8057s;
                this.f7926l.m2130a("L" + tower.f8057s);
                if (tower.f8057s <= 3) {
                    this.f7926l.f2827q.f2817b = new C0430b(1286557951);
                } else if (tower.f8057s <= 6) {
                    this.f7926l.f2827q.f2817b = new C0430b(12375295);
                } else {
                    this.f7926l.f2827q.f2817b = new C0430b(-4126721);
                }
            }
            if (!(this.f7922h == tower.f8055q && this.f7923i == tower.f8056r)) {
                this.f7922h = tower.f8055q;
                this.f7923i = tower.f8056r;
                if (tower.f8056r == 0.0f) {
                    this.f7927m.m2130a((CharSequence) "MAX");
                    this.f7924j.m1955c(310.0f);
                } else {
                    this.f7927m.m2130a(((int) Math.floor((double) tower.f8055q)) + " / " + ((int) Math.floor((double) tower.f8056r)));
                    this.f7924j.m1955c(310.0f * (tower.f8055q / tower.f8056r));
                }
            }
            for (i2 = 0; i2 < 4; i2++) {
                if (tower.f8058t[i2] >= tower.m8464g()) {
                    if (this.f7938x == this.f7932r[i2]) {
                        m8341a(null);
                    }
                    this.f7932r[i2].m8338a(false);
                    if (!this.f7932r[i2].f7905f.m2131b("MAX")) {
                        this.f7932r[i2].f7905f.m2130a((CharSequence) "MAX");
                    }
                } else if (gameScreen.f7172m.m8800a() < tower.mo1819a(i2, tower.f8058t[i2] + 1)) {
                    if (this.f7938x == this.f7932r[i2]) {
                        m8341a(null);
                    }
                    this.f7932r[i2].m8338a(false);
                } else {
                    this.f7932r[i2].m8338a(true);
                }
            }
            if (this.f7920f != tower.f8033D) {
                CharSequence charSequence = "";
                CharSequence charSequence2 = "";
                float f = 0.0f;
                SpaceTileBonus[] spaceTileBonusArr = tower.f8048j.f7991s;
                TowerStatType[] u = tower.mo1830u();
                int length = u.length;
                int i3 = 0;
                while (i3 < length) {
                    String str;
                    String str2;
                    String str3;
                    int i4;
                    float f2;
                    String str4;
                    Object obj;
                    Object obj2;
                    TowerStatType towerStatType = u[i3];
                    TowerStat a2 = TowerStat.m8484a(towerStatType);
                    float floatValue = ((Float) tower.f8032C.get(towerStatType)).floatValue();
                    float a3 = tower.m8442a(towerStatType);
                    if (a2.f8101d) {
                        str = charSequence + "[#FFC107]";
                    }
                    if (a2.f8101d) {
                        str2 = charSequence2 + "[#FFC107]";
                    } else {
                        CharSequence charSequence3 = charSequence2;
                    }
                    String str5 = str + a2.m8487b() + "\n";
                    if (a3 == floatValue) {
                        str3 = str2 + "[#FFFFFF]" + a2.m8486a(floatValue, true) + "[]";
                    } else {
                        i = 0;
                        if (a2.f8101d) {
                            i = tower.f8048j.f7992t;
                        } else {
                            for (SpaceTileBonus spaceTileBonus2 : spaceTileBonusArr) {
                                if (spaceTileBonus2.f7950d == towerStatType) {
                                    i = spaceTileBonus2.f7951e;
                                    break;
                                }
                            }
                        }
                        str2 = i == 0 ? str2 + "[#FFFFFF]" : i == 1 ? str2 + "[#4CAF50]" : i == 2 ? str2 + "[#2196F3]" : str2 + "[#FFC107]";
                        str3 = str2 + a2.m8486a(a3, true) + "[]";
                    }
                    if (this.f7938x != null) {
                        int[] iArr = (int[]) tower.f8058t.clone();
                        i4 = this.f7938x.f7900a;
                        iArr[i4] = iArr[i4] + 1;
                        float a4 = tower.m8444a(towerStatType, tower.f8057s, iArr);
                        if (a4 != a3) {
                            floatValue = a4 - a3;
                            str2 = str3 + " [#4caf50]";
                            if (floatValue > 0.0f) {
                                str2 = str2 + "+";
                            }
                            str3 = str2 + a2.m8486a(floatValue, false) + "[]";
                            if (towerStatType == TowerStatType.RANGE) {
                                f2 = a4;
                                str = str3 + "\n";
                                str3 = a2.f8101d ? str5 + "[]" : str5;
                                if (a2.f8101d) {
                                    str = str + "[]";
                                }
                                i3++;
                                f = f2;
                                str4 = str;
                                obj = str3;
                                obj2 = str4;
                            }
                        }
                    }
                    f2 = f;
                    str = str3 + "\n";
                    if (a2.f8101d) {
                    }
                    if (a2.f8101d) {
                        str = str + "[]";
                    }
                    i3++;
                    f = f2;
                    str4 = str;
                    obj = str3;
                    obj2 = str4;
                }
                this.f7930p.m2130a(charSequence);
                this.f7931q.m2130a(charSequence2);
                if (f != 0.0f) {
                    gameScreen.m7843a(new Vector2((float) this.b.f7782c.f7965f, (float) this.b.f7782c.f7966g), 64.0f * f);
                } else if (gameScreen.f7145D != null) {
                    gameScreen.m7871r();
                }
                i = tower.m8464g();
                for (i2 = 0; i2 < 4; i2++) {
                    if (tower.f8058t[i2] == i) {
                        this.f7932r[i2].f7904e.m2130a(tower.f8058t[i2] + " lvl");
                        this.f7932r[i2].f7905f.m2130a((CharSequence) "MAX");
                    } else {
                        this.f7932r[i2].f7904e.m2130a(tower.f8058t[i2] + " lvl");
                        this.f7932r[i2].f7905f.m2130a(String.valueOf(tower.mo1819a(i2, tower.f8058t[i2] + 1)));
                    }
                }
                this.f7920f = tower.f8033D;
                this.f7928n.m2130a(String.valueOf(tower.m8446a(gameScreen.f7173n)));
                if (tower.mo1832w()) {
                    this.f7929o.m2130a(Tower.m8433b(tower.f8050l));
                    this.f7934t.f2611e = true;
                    this.f7929o.f2611e = true;
                } else {
                    this.f7934t.f2611e = false;
                    this.f7929o.f2611e = false;
                }
            }
            this.f7919e = this.b.f7782c.f7962c;
        }
    }

    /* renamed from: b */
    public final C0655f mo1794b() {
        return this.f7917c;
    }

    /* renamed from: c */
    public final void mo1795c() {
        if (!this.f7918d) {
            this.f7918d = true;
        }
    }

    /* renamed from: d */
    public final void mo1796d() {
        if (this.f7918d) {
            this.f7918d = false;
            GameScreen gameScreen = Game.f6553g;
            if (gameScreen != null) {
                gameScreen.m7871r();
            }
        }
    }
}
