package com.prineside.tdi.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.C0607f;
import com.badlogic.gdx.scenes.scene2d.C0609g;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.C0611i.C0652a;
import com.badlogic.gdx.scenes.scene2d.ui.C0623c;
import com.badlogic.gdx.scenes.scene2d.ui.C0625d;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f.C0628a;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.C0618d;
import com.badlogic.gdx.utils.p034b.C0684b;
import com.prineside.tdi.Game;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.enemies.Enemy.EnemyType;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.Tower.TowerType;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.utility.FastBadRandom;
import com.prineside.tdi.utility.MaterialColor.GREEN;
import com.prineside.tdi.utility.MaterialColor.LIGHT_BLUE;
import com.prineside.tdi.utility.MaterialColor.ORANGE;
import com.prineside.tdi.utility.MaterialColor.RED;
import com.prineside.tdi.utility.QuadActor;

public class HandbookScreen extends AbstractScreen {
    /* renamed from: b */
    private final C0684b f7242b = new C0684b();
    /* renamed from: c */
    private final C0609g f7243c;
    /* renamed from: d */
    private int f7244d;
    /* renamed from: e */
    private C0629f f7245e;
    /* renamed from: f */
    private QuadActor f7246f;
    /* renamed from: g */
    private Table f7247g;
    /* renamed from: h */
    private Table f7248h;
    /* renamed from: i */
    private Table f7249i;
    /* renamed from: j */
    private Table f7250j;
    /* renamed from: k */
    private Table f7251k;
    /* renamed from: l */
    private C0605e f7252l;
    /* renamed from: m */
    private C0629f f7253m;
    /* renamed from: n */
    private C0629f f7254n;
    /* renamed from: o */
    private Table f7255o;
    /* renamed from: p */
    private C0605e f7256p;
    /* renamed from: q */
    private C0629f f7257q;
    /* renamed from: r */
    private Table f7258r;

    /* renamed from: com.prineside.tdi.screens.HandbookScreen$2 */
    class C11072 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ HandbookScreen f7236a;

        C11072(HandbookScreen handbookScreen) {
            this.f7236a = handbookScreen;
        }

        /* renamed from: b */
        public final void mo500b() {
            Sound.m7569a(Type.SINGLE);
            HandbookScreen.m7928c(this.f7236a);
        }
    }

    /* renamed from: com.prineside.tdi.screens.HandbookScreen$3 */
    class C11083 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ HandbookScreen f7237a;

        C11083(HandbookScreen handbookScreen) {
            this.f7237a = handbookScreen;
        }

        /* renamed from: b */
        public final void mo500b() {
            Sound.m7569a(Type.SINGLE);
            HandbookScreen.m7929d(this.f7237a);
        }
    }

    public HandbookScreen() {
        C0628a c0628a = new C0628a(Game.game.m7463g(60), C0430b.f1620c);
        C0645h c0645h = new C0645h();
        c0645h.m2192a(Game.game.f6561E);
        this.f7243c = new C0609g(this.f7242b);
        C0602b table = new Table();
        table.mo487a(false);
        table.f2677Y = true;
        this.f7243c.m2004a(table);
        C0602b c0605e = new C0605e();
        c0605e.f2628r = false;
        c0605e.m1956c(600.0f, 64.0f);
        table.m2059d(c0605e).m2104i().m2096e().m2098f().m2097e(80.0f);
        C0430b c0430b = new C0430b(0.5f, 0.5f, 0.5f, 1.0f);
        C0602b c0625d = new C0625d(c0645h.m2197c("main-menu-icon-handbook"));
        c0625d.m1956c(64.0f, 64.0f);
        c0625d.m1935a(80.0f, 0.0f);
        c0625d.m1937a(c0430b);
        c0605e.mo510b(c0625d);
        this.f7245e = new C0629f(Game.f6551e.m2416a("mainMenu_handbookButton"), c0628a);
        this.f7245e.m1956c(320.0f, 64.0f);
        this.f7245e.m1935a(204.0f, 0.0f);
        this.f7245e.m1937a(c0430b);
        c0605e.mo510b(this.f7245e);
        final C0430b c0430b2 = C0430b.f1620c;
        final C0430b c0430b3 = LIGHT_BLUE.f8525f;
        C0602b c0605e2 = new C0605e();
        c0605e2.f2628r = false;
        c0605e2.m1956c(400.0f, 96.0f);
        c0605e2.m1935a(80.0f, 64.0f);
        c0605e2.f2610d = Touchable.enabled;
        this.f7243c.m2004a(c0605e2);
        c0605e = new C0625d(c0645h.m2197c("icon-triangle-left"));
        c0605e.m1956c(64.0f, 64.0f);
        c0605e.m1935a(0.0f, 16.0f);
        c0605e.m1937a(c0430b2);
        c0605e2.mo510b(c0605e);
        final C0602b c0629f = new C0629f(Game.f6551e.m2416a("back"), c0628a);
        c0629f.m1956c(336.0f, 96.0f);
        c0629f.m1935a(124.0f, 0.0f);
        c0629f.m1937a(c0430b2);
        c0605e2.mo510b(c0629f);
        c0605e2.m1947a(new C0607f(this) {
            /* renamed from: e */
            final /* synthetic */ HandbookScreen f7235e;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0605e.m1937a(c0430b3);
                c0629f.m1937a(c0430b3);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                Sound.m7569a(Type.NO);
                if (this.f7235e.f7244d == 0) {
                    Game.game.m7473p();
                } else if (this.f7235e.f7244d == 2 || this.f7235e.f7244d == 1) {
                    this.f7235e.m7931f();
                } else if (this.f7235e.f7244d == 4) {
                    HandbookScreen.m7928c(this.f7235e);
                } else if (this.f7235e.f7244d == 3) {
                    HandbookScreen.m7929d(this.f7235e);
                }
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0605e.m1937a(c0430b2);
                c0629f.m1937a(c0430b2);
            }
        });
        C0602b table2 = new Table();
        table2.f2677Y = true;
        table2.mo487a(false);
        table2.f2610d = Touchable.disabled;
        this.f7246f = new QuadActor(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        C0623c d = table2.m2059d(this.f7246f);
        d.f2787p = C0623c.f2761a;
        d.f2788q = C0623c.f2761a;
        d.m2104i();
        this.f7243c.m2004a(table2);
        this.f7247g = new Table();
        this.f7247g.mo487a(false);
        this.f7247g.f2677Y = true;
        this.f7247g.f2611e = false;
        this.f7243c.m2004a(this.f7247g);
        table2 = new C0605e();
        table2.f2628r = false;
        table2.f2610d = Touchable.enabled;
        table2.m1947a(new C11072(this));
        table = new QuadActor(new float[]{0.09f, 0.0f, 0.0f, 1.0f, 1.0f, 0.932f, 1.0f, 0.068f}, new int[]{26, 26, 26, 255, 26, 26, 26, 255, 26, 26, 26, 255, 26, 26, 26, 255});
        table.m1956c(500.0f, 500.0f);
        table2.mo510b(table);
        table = new C0625d(Game.game.f6561E.m1442a("tower-stat-poison-damage"));
        table.m1956c(128.0f, 128.0f);
        table.m1935a(196.0f, 250.0f);
        table2.mo510b(table);
        table = new C0629f(Game.f6551e.m2416a("handbook_button_enemies"), c0628a);
        table.m1935a(20.0f, 122.0f);
        table.m1956c(480.0f, 128.0f);
        table.m2127a(1);
        table2.mo510b(table);
        this.f7247g.m2059d(table2).m2084a(500.0f).f2782k = new C0652a(40.0f);
        table2 = new C0605e();
        table2.f2628r = false;
        table2.f2610d = Touchable.enabled;
        table2.m1947a(new C11083(this));
        table = new QuadActor(new float[]{0.0f, 0.068f, 0.0f, 0.932f, 1.0f, 1.0f, 0.91f, 0.0f}, new int[]{26, 26, 26, 255, 26, 26, 26, 255, 26, 26, 26, 255, 26, 26, 26, 255});
        table.m1956c(500.0f, 500.0f);
        table2.mo510b(table);
        table = new C0625d(Game.game.f6561E.m1442a("tile-menu-icon-tower"));
        table.m1956c(128.0f, 128.0f);
        table.m1935a(176.0f, 250.0f);
        table2.mo510b(table);
        table = new C0629f(Game.f6551e.m2416a("handbook_button_towers"), c0628a);
        table.m1935a(0.0f, 122.0f);
        table.m1956c(480.0f, 128.0f);
        table.m2127a(1);
        table2.mo510b(table);
        this.f7247g.m2059d(table2).m2084a(500.0f).f2780i = new C0652a(40.0f);
        this.f7248h = new Table();
        this.f7248h.mo487a(false);
        this.f7248h.f2677Y = true;
        this.f7248h.f2611e = false;
        this.f7243c.m2004a(this.f7248h);
        c0430b3 = new C0430b(437918463);
        C0628a c0628a2 = new C0628a(Game.game.m7463g(36), C0430b.f1620c);
        int i = 0;
        for (final Object obj : TowerType.f8015m) {
            C0602b c0605e3 = new C0605e();
            c0605e3.f2628r = false;
            c0605e3.f2610d = Touchable.enabled;
            c0605e3.m1947a(new C0618d(this) {
                /* renamed from: f */
                final /* synthetic */ HandbookScreen f7239f;

                /* renamed from: b */
                public final void mo500b() {
                    Sound.m7569a(Type.SINGLE);
                    HandbookScreen.m7926a(this.f7239f, obj);
                }
            });
            this.f7248h.m2059d(c0605e3).m2085a(450.0f, 128.0f).m2092c();
            ((Tower) Tower.f8029g.m2467a(obj)).mo1825p().m1222c().m1219a(c0430b3, 0.8f);
            C0602b quadActor = new QuadActor(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f}, new int[]{(int) (c0430b3.f1644I * 255.0f), (int) (c0430b3.f1645J * 255.0f), (int) (c0430b3.f1646K * 255.0f), (int) (c0430b3.f1647L * 255.0f), (int) (r1.f1644I * 255.0f), (int) (r1.f1645J * 255.0f), (int) (r1.f1646K * 255.0f), (int) (r1.f1647L * 255.0f), (int) (c0430b3.f1644I * 255.0f), (int) (c0430b3.f1645J * 255.0f), (int) (c0430b3.f1646K * 255.0f), (int) (c0430b3.f1647L * 255.0f), (int) (c0430b3.f1644I * 255.0f), (int) (c0430b3.f1645J * 255.0f), (int) (c0430b3.f1646K * 255.0f), (int) (c0430b3.f1647L * 255.0f)});
            quadActor.m1956c(450.0f, 128.0f);
            c0605e3.mo510b(quadActor);
            table2 = new C0625d(Game.game.f6561E.m1442a("tower-base-" + obj.ordinal()));
            table2.m1956c(96.0f, 96.0f);
            table2.m1935a(16.0f, 16.0f);
            c0605e3.mo510b(table2);
            table2 = new C0625d(Game.game.f6561E.m1442a("tower-weapon-" + obj.ordinal()));
            table2.m1956c(96.0f, 96.0f);
            table2.m1935a(16.0f, 16.0f);
            c0605e3.mo510b(table2);
            quadActor = new C0629f(((Tower) Tower.f8029g.m2467a(obj)).mo1823n(), c0628a2);
            quadActor.m1956c(322.0f, 128.0f);
            quadActor.m1935a(128.0f, 0.0f);
            quadActor.m2127a(8);
            c0605e3.mo510b(quadActor);
            i++;
            if (i % 3 == 0) {
                this.f7248h.m2066q();
            }
        }
        this.f7249i = new Table();
        this.f7249i.mo487a(false);
        this.f7249i.f2677Y = true;
        this.f7249i.f2611e = false;
        this.f7243c.m2004a(this.f7249i);
        int i2 = 0;
        for (final EnemyType enemyType : EnemyType.f6882m) {
            C0602b c0605e4;
            if (Enemy.m7593b(enemyType)) {
                c0605e4 = new C0605e();
                c0605e4.f2628r = false;
                c0605e4.f2610d = Touchable.disabled;
                this.f7249i.m2059d(c0605e4).m2085a(450.0f, 128.0f).m2092c();
                c0605e2 = new C0625d(Game.game.f6561E.m1442a("main-menu-icon-question"));
                c0605e2.m1937a(new C0430b(-137));
                c0605e2.m1956c(96.0f, 96.0f);
                c0605e2.m1935a(16.0f, 16.0f);
                c0605e4.mo510b(c0605e2);
                c0605e2 = new C0629f("???", c0628a2);
                c0605e2.m1937a(new C0430b(-137));
                c0605e2.m1956c(322.0f, 128.0f);
                c0605e2.m1935a(128.0f, 0.0f);
                c0605e2.m2127a(8);
                c0605e4.mo510b(c0605e2);
            } else {
                c0605e2 = new C0605e();
                c0605e2.f2628r = false;
                c0605e2.f2610d = Touchable.enabled;
                c0605e2.m1947a(new C0618d(this) {
                    /* renamed from: f */
                    final /* synthetic */ HandbookScreen f7241f;

                    /* renamed from: b */
                    public final void mo500b() {
                        Sound.m7569a(Type.SINGLE);
                        HandbookScreen.m7925a(this.f7241f, enemyType);
                    }
                });
                this.f7249i.m2059d(c0605e2).m2085a(450.0f, 128.0f).m2092c();
                Enemy a = Enemy.m7591a(enemyType);
                a.mo1759h().m1222c().m1219a(c0430b3, 0.8f);
                C0602b quadActor2 = new QuadActor(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f}, new int[]{(int) (c0430b3.f1644I * 255.0f), (int) (c0430b3.f1645J * 255.0f), (int) (c0430b3.f1646K * 255.0f), (int) (c0430b3.f1647L * 255.0f), (int) (r10.f1644I * 255.0f), (int) (r10.f1645J * 255.0f), (int) (r10.f1646K * 255.0f), (int) (r10.f1647L * 255.0f), (int) (c0430b3.f1644I * 255.0f), (int) (c0430b3.f1645J * 255.0f), (int) (c0430b3.f1646K * 255.0f), (int) (c0430b3.f1647L * 255.0f), (int) (c0430b3.f1644I * 255.0f), (int) (c0430b3.f1645J * 255.0f), (int) (c0430b3.f1646K * 255.0f), (int) (c0430b3.f1647L * 255.0f)});
                quadActor2.m1956c(450.0f, 128.0f);
                c0605e2.mo510b(quadActor2);
                quadActor = new C0625d(Game.game.f6561E.m1442a("enemy-" + enemyType.ordinal()));
                quadActor.m1956c(96.0f, 96.0f);
                quadActor.m1935a(16.0f, 16.0f);
                c0605e2.mo510b(quadActor);
                c0605e4 = new C0629f(a.mo1757f(), c0628a2);
                c0605e4.m1956c(322.0f, 128.0f);
                c0605e4.m1935a(128.0f, 0.0f);
                c0605e4.m2127a(8);
                c0605e2.mo510b(c0605e4);
            }
            i2++;
            if (i2 % 3 == 0) {
                this.f7249i.m2066q();
            }
        }
        this.f7250j = new Table();
        this.f7250j.mo487a(false);
        this.f7250j.f2677Y = true;
        this.f7250j.f2611e = false;
        this.f7243c.m2004a(this.f7250j);
        this.f7252l = new C0605e();
        this.f7252l.f2628r = false;
        this.f7250j.m2059d(this.f7252l).m2085a(500.0f, 600.0f).m2099f(40.0f);
        table2 = new Table();
        this.f7253m = new C0629f("Fires missiles that inflict damage on multiple enemies at a great distance", new C0628a(Game.game.m7463g(36), C0430b.f1620c));
        this.f7253m.m2127a(8);
        this.f7253m.m2135h();
        table2.m2059d(this.f7253m).m2090b(1000.0f);
        table2.m2066q();
        table = new C0629f(Game.f6551e.m2416a("handbook_title_tower_unique_feature"), new C0628a(Game.game.m7463g(36), new C0430b(-137)));
        table.m2127a(1);
        table2.m2059d(table).m2090b(1000.0f).m2097e(20.0f).m2101g(20.0f);
        table2.m2066q();
        this.f7254n = new C0629f("Башня может стрелять по врагам с любого расстояния, но намного реже, чем по врагам в радиусе. Чем больше уровень башни, тем чаще она может стрелять на большое расстояние и больше радиус взрыва ракет.", new C0628a(Game.game.m7463g(36), C0430b.f1620c));
        this.f7254n.m2127a(8);
        this.f7254n.m2135h();
        table2.m2059d(this.f7254n).m2090b(1000.0f);
        table2.m2066q();
        table = new C0629f(Game.f6551e.m2416a("effectiveness"), new C0628a(Game.game.m7463g(36), new C0430b(-137)));
        table.m2127a(1);
        table2.m2059d(table).m2090b(1000.0f).m2097e(20.0f).m2101g(20.0f);
        table2.m2066q();
        this.f7255o = new Table();
        this.f7255o.mo487a(false);
        table2.m2059d(this.f7255o);
        table2.m2066q();
        this.f7250j.m2059d(table2).m2090b(1000.0f).m2103h(40.0f);
        this.f7251k = new Table();
        this.f7251k.mo487a(false);
        this.f7251k.f2677Y = true;
        this.f7251k.f2611e = false;
        this.f7243c.m2004a(this.f7251k);
        this.f7256p = new C0605e();
        this.f7256p.f2628r = false;
        this.f7251k.m2059d(this.f7256p).m2085a(500.0f, 600.0f).m2099f(40.0f);
        table2 = new Table();
        this.f7257q = new C0629f("Moves through the air at great speed, avoiding projectiles of many towers, but vulnerable to lightning.", new C0628a(Game.game.m7463g(36), C0430b.f1620c));
        this.f7257q.m2127a(8);
        this.f7257q.m2135h();
        table2.m2059d(this.f7257q).m2090b(1000.0f);
        table2.m2066q();
        table = new C0629f(Game.f6551e.m2416a("new_enemy_info_hint_tower_efficiency"), new C0628a(Game.game.m7463g(36), new C0430b(-137)));
        table.m2127a(1);
        table2.m2059d(table).m2090b(1000.0f).m2097e(20.0f).m2101g(20.0f);
        table2.m2066q();
        this.f7258r = new Table();
        this.f7258r.mo487a(false);
        table2.m2059d(this.f7258r);
        table2.m2066q();
        this.f7251k.m2059d(table2).m2090b(1000.0f).m2103h(40.0f);
    }

    /* renamed from: a */
    private void m7924a(C0430b c0430b) {
        if (c0430b == null) {
            this.f7246f.m8832a(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
            return;
        }
        c0430b.m1222c().f1647L = 0.0f;
        c0430b.m1222c().f1647L = 0.1f;
        this.f7246f.m8832a(new int[]{(int) (r0.f1644I * 255.0f), (int) (r0.f1645J * 255.0f), (int) (r0.f1646K * 255.0f), (int) (r0.f1647L * 255.0f), (int) (r1.f1644I * 255.0f), (int) (r1.f1645J * 255.0f), (int) (r1.f1646K * 255.0f), (int) (r1.f1647L * 255.0f), (int) (r0.f1644I * 255.0f), (int) (r0.f1645J * 255.0f), (int) (r0.f1646K * 255.0f), (int) (r0.f1647L * 255.0f), (int) (r0.f1644I * 255.0f), (int) (r0.f1645J * 255.0f), (int) (r0.f1646K * 255.0f), (int) (r0.f1647L * 255.0f)});
    }

    /* renamed from: a */
    static /* synthetic */ void m7925a(HandbookScreen handbookScreen, EnemyType enemyType) {
        int i;
        handbookScreen.m7930e();
        Enemy a = Enemy.m7591a(enemyType);
        handbookScreen.f7245e.m2130a(Game.f6551e.m2416a("mainMenu_handbookButton") + " / " + Game.f6551e.m2416a("handbook_button_enemies") + " / " + a.mo1757f());
        handbookScreen.f7244d = 4;
        handbookScreen.f7257q.m2130a(a.mo1758g());
        handbookScreen.f7256p.mo475c();
        float[] fArr = new float[]{30.0f, 430.0f, 240.0f, 380.0f, 80.0f, 190.0f, 180.0f, 10.0f};
        for (i = 0; i < 4; i++) {
            C0602b c0605e = new C0605e();
            c0605e.f2628r = false;
            c0605e.m1935a(fArr[i * 2], fArr[(i * 2) + 1]);
            c0605e.m1956c(192.0f, 192.0f);
            handbookScreen.f7256p.mo510b(c0605e);
            C0602b c0625d = new C0625d(Game.game.f6561E.m1442a("enemy-" + enemyType.ordinal()));
            c0625d.m1956c(192.0f, 192.0f);
            c0625d.m1960e();
            c0605e.mo510b(c0625d);
            c0625d.m1961e(90.0f * ((float) i));
        }
        handbookScreen.f7258r.mo475c();
        int i2 = 0;
        for (TowerType towerType : TowerType.f8015m) {
            float b = a.mo1756b(towerType);
            if (!a.mo1755a(towerType)) {
                b = 0.0f;
            }
            C0602b c0605e2 = new C0605e();
            c0605e2.f2628r = false;
            handbookScreen.f7258r.m2059d(c0605e2).m2085a(116.0f, 148.0f);
            C0602b c0625d2 = new C0625d(Game.game.f6561E.m1442a("tower-base-" + towerType.ordinal()));
            c0625d2.m1956c(116.0f, 116.0f);
            c0625d2.m1935a(0.0f, 16.0f);
            c0605e2.mo510b(c0625d2);
            C0430b c0430b = C0430b.f1620c;
            if (b > 1.0f) {
                c0430b = GREEN.f8487f;
            } else if (b <= 0.5f) {
                c0430b = RED.f8609f;
            } else if (b < 1.0f) {
                c0430b = ORANGE.f8567f;
            }
            c0625d2 = new C0629f(((int) (b * 100.0f)) + "%", new C0628a(Game.game.m7465h(30), c0430b));
            c0625d2.m1956c(116.0f, 24.0f);
            c0625d2.m2127a(1);
            c0605e2.mo510b(c0625d2);
            i = i2 + 1;
            if (i % 8 == 0) {
                handbookScreen.f7258r.m2066q();
            }
            i2 = i;
        }
        handbookScreen.f7251k.f2611e = true;
        handbookScreen.m7924a(a.mo1759h());
    }

    /* renamed from: a */
    static /* synthetic */ void m7926a(HandbookScreen handbookScreen, TowerType towerType) {
        int i;
        handbookScreen.m7930e();
        Tower tower = (Tower) Tower.f8029g.m2467a((Object) towerType);
        handbookScreen.f7252l.mo475c();
        float[] fArr = new float[]{30.0f, 430.0f, 240.0f, 380.0f, 80.0f, 190.0f, 180.0f, 10.0f};
        for (i = 0; i < 4; i++) {
            C0602b c0605e = new C0605e();
            c0605e.f2628r = false;
            c0605e.m1935a(fArr[i * 2], fArr[(i * 2) + 1]);
            c0605e.m1956c(192.0f, 192.0f);
            handbookScreen.f7252l.mo510b(c0605e);
            C0602b c0625d = new C0625d(Game.game.f6561E.m1442a("tower-base-" + towerType.ordinal()));
            c0625d.m1956c(192.0f, 192.0f);
            c0605e.mo510b(c0625d);
            c0625d = new C0625d(Game.game.f6561E.m1442a("tower-weapon-" + towerType.ordinal()));
            c0625d.m1956c(192.0f, 192.0f);
            c0625d.m1960e();
            c0605e.mo510b(c0625d);
            if (tower.mo1827r().m2474c(TowerStatType.ROTATION_SPEED)) {
                c0625d.m1961e(FastBadRandom.m8809b() * 360.0f);
            }
        }
        handbookScreen.f7245e.m2130a(Game.f6551e.m2416a("mainMenu_handbookButton") + " / " + Game.f6551e.m2416a("handbook_button_towers") + " / " + tower.mo1823n());
        handbookScreen.f7244d = 3;
        handbookScreen.f7253m.m2130a(tower.mo1824o());
        handbookScreen.f7254n.m2130a(tower.mo1826q());
        handbookScreen.f7255o.mo475c();
        int i2 = 0;
        EnemyType[] enemyTypeArr = EnemyType.f6882m;
        int length = enemyTypeArr.length;
        int i3 = 0;
        while (i3 < length) {
            EnemyType enemyType = enemyTypeArr[i3];
            if (Enemy.m7593b(enemyType)) {
                i = i2;
            } else {
                Enemy a = Enemy.m7591a(enemyType);
                float b = a.mo1756b(towerType);
                if (!a.mo1755a(towerType)) {
                    b = 0.0f;
                }
                C0602b c0605e2 = new C0605e();
                c0605e2.f2628r = false;
                handbookScreen.f7255o.m2059d(c0605e2).m2085a(116.0f, 132.0f);
                C0602b c0625d2 = new C0625d(Game.game.f6561E.m1442a("enemy-" + enemyType.ordinal()));
                c0625d2.m1956c(116.0f, 116.0f);
                c0625d2.m1935a(0.0f, 16.0f);
                c0605e2.mo510b(c0625d2);
                C0430b c0430b = C0430b.f1620c;
                if (b > 1.0f) {
                    c0430b = GREEN.f8487f;
                } else if (b <= 0.5f) {
                    c0430b = RED.f8609f;
                } else if (b < 1.0f) {
                    c0430b = ORANGE.f8567f;
                }
                c0625d2 = new C0629f(((int) (b * 100.0f)) + "%", new C0628a(Game.game.m7465h(30), c0430b));
                c0625d2.m1956c(116.0f, 32.0f);
                c0625d2.m2127a(1);
                c0605e2.mo510b(c0625d2);
                i = i2 + 1;
                if (i % 8 == 0) {
                    handbookScreen.f7255o.m2066q();
                }
            }
            i3++;
            i2 = i;
        }
        handbookScreen.f7250j.f2611e = true;
        handbookScreen.m7924a(tower.mo1825p());
    }

    /* renamed from: c */
    static /* synthetic */ void m7928c(HandbookScreen handbookScreen) {
        handbookScreen.m7930e();
        handbookScreen.f7245e.m2130a(Game.f6551e.m2416a("mainMenu_handbookButton") + " / " + Game.f6551e.m2416a("handbook_button_enemies"));
        handbookScreen.f7244d = 2;
        handbookScreen.f7249i.f2611e = true;
        handbookScreen.m7924a(null);
    }

    /* renamed from: d */
    static /* synthetic */ void m7929d(HandbookScreen handbookScreen) {
        handbookScreen.m7930e();
        handbookScreen.f7245e.m2130a(Game.f6551e.m2416a("mainMenu_handbookButton") + " / " + Game.f6551e.m2416a("handbook_button_towers"));
        handbookScreen.f7244d = 1;
        handbookScreen.f7248h.f2611e = true;
        handbookScreen.m7924a(null);
    }

    /* renamed from: e */
    private void m7930e() {
        switch (this.f7244d) {
            case 0:
                this.f7247g.f2611e = false;
                return;
            case 1:
                this.f7248h.f2611e = false;
                return;
            case 2:
                this.f7249i.f2611e = false;
                return;
            case 3:
                this.f7250j.f2611e = false;
                return;
            case 4:
                this.f7251k.f2611e = false;
                return;
            default:
                return;
        }
    }

    /* renamed from: f */
    private void m7931f() {
        m7930e();
        this.f7245e.m2130a(Game.f6551e.m2416a("mainMenu_handbookButton"));
        this.f7244d = 0;
        this.f7247g.f2611e = true;
        m7924a(null);
    }

    /* renamed from: a */
    public final void resize(int i, int i2) {
        super.resize(i, i2);
        this.f7242b.f3064a = 1200.0f / ((float) Gdx.graphics.mo295d());
        this.f7242b.mo522a(i, i2);
    }

    /* renamed from: b */
    public final void mo1781b(float f) {
        if (Gdx.input.mo307b(4) || Gdx.input.mo307b(131)) {
            Game.game.m7473p();
        }
        this.f7243c.m2015c();
        this.f7243c.m2001a();
    }

    public final void j_() {
        Gdx.input.mo304a(this.f7243c);
        m7931f();
    }
}
