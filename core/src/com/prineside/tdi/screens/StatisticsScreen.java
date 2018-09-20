package com.prineside.tdi.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.C0522d;
import com.badlogic.gdx.math.C0549f;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0603d;
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
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.C0710q.C0707b;
import com.badlogic.gdx.utils.p034b.C0684b;
import com.prineside.tdi.Game;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgrade.FilteringMode;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.Statistics;
import com.prineside.tdi.Statistics.StatisticsType;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.Tower.TowerType;
import com.prineside.tdi.utility.FastBadRandom;
import com.prineside.tdi.utility.MaterialColor.LIGHT_BLUE;
import com.prineside.tdi.utility.StringFormatter;
import java.util.Iterator;

public class StatisticsScreen extends AbstractScreen {
    /* renamed from: b */
    private C0684b f7638b;
    /* renamed from: c */
    private C0609g f7639c;
    /* renamed from: d */
    private C0710q<TowerType, ChartSegment> f7640d;
    /* renamed from: e */
    private C0676a<ChartSegment> f7641e;

    /* renamed from: com.prineside.tdi.screens.StatisticsScreen$1TowerTypeToDamage */
    class AnonymousClass1TowerTypeToDamage {
        /* renamed from: a */
        public TowerType f7625a;
        /* renamed from: b */
        public long f7626b;
        /* renamed from: c */
        final /* synthetic */ StatisticsScreen f7627c;

        public AnonymousClass1TowerTypeToDamage(StatisticsScreen statisticsScreen, TowerType towerType, long j) {
            this.f7627c = statisticsScreen;
            this.f7625a = towerType;
            this.f7626b = j;
        }
    }

    class ChartSegment {
        /* renamed from: a */
        public C0430b f7630a;
        /* renamed from: b */
        public TowerType f7631b;
        /* renamed from: c */
        public float f7632c;
        /* renamed from: d */
        public float f7633d;
        /* renamed from: e */
        public boolean f7634e;
        /* renamed from: f */
        public long f7635f;
        /* renamed from: g */
        public long f7636g;
        /* renamed from: h */
        final /* synthetic */ StatisticsScreen f7637h;

        ChartSegment(StatisticsScreen statisticsScreen) {
            this.f7637h = statisticsScreen;
        }

        /* renamed from: a */
        public final void m8199a(boolean z) {
            if (this.f7634e != z) {
                this.f7634e = z;
                if (z) {
                    this.f7635f = Game.game.m7478u();
                } else {
                    this.f7636g = Game.game.m7478u();
                }
                Sound.m7569a(Type.CLICK);
            }
        }
    }

    public StatisticsScreen() {
        int i;
        int i2 = 0;
        Iterator b = Game.f6554h.f6862d.mo544b();
        long j = 0;
        while (b.hasNext()) {
            j = ((Long) ((C0707b) b.next()).f3164b).longValue() + j;
        }
        this.f7641e = new C0676a();
        this.f7640d = new C0710q();
        b = Game.f6554h.f6862d.mo544b();
        while (b.hasNext()) {
            C0707b c0707b = (C0707b) b.next();
            if (((Long) c0707b.f3164b).longValue() != 0) {
                Object chartSegment = new ChartSegment(this);
                chartSegment.f7631b = (TowerType) c0707b.f3163a;
                chartSegment.f7630a = ((Tower) Tower.f8029g.m2467a(c0707b.f3163a)).mo1825p();
                chartSegment.f7633d = (((float) ((Long) c0707b.f3164b).longValue()) / ((float) j)) * 360.0f;
                this.f7641e.m2296a(chartSegment);
                this.f7640d.mo542a(c0707b.f3163a, chartSegment);
            }
        }
        for (i = 0; i < this.f7641e.f3001b; i++) {
            for (int i3 = i + 1; i3 < this.f7641e.f3001b; i3++) {
                if (((ChartSegment) this.f7641e.m2291a(i)).f7633d < ((ChartSegment) this.f7641e.m2291a(i3)).f7633d) {
                    Object obj = (ChartSegment) this.f7641e.m2291a(i);
                    this.f7641e.mo525a(i, this.f7641e.m2291a(i3));
                    this.f7641e.mo525a(i3, obj);
                }
            }
        }
        float f = 0.0f;
        for (i = 0; i < this.f7641e.f3001b; i++) {
            ((ChartSegment) this.f7641e.m2291a(i)).f7632c = f;
            f += ((ChartSegment) this.f7641e.m2291a(i)).f7633d;
        }
        this.f7638b = new C0684b();
        C0628a c0628a = new C0628a(Game.game.m7463g(60), C0430b.f1620c);
        C0645h c0645h = new C0645h();
        c0645h.m2192a(Game.game.f6561E);
        this.f7639c = new C0609g(this.f7638b);
        C0602b table = new Table();
        table.mo487a(false);
        table.f2677Y = true;
        this.f7639c.m2004a(table);
        C0602b c0605e = new C0605e();
        c0605e.m1956c(600.0f, 64.0f);
        table.m2059d(c0605e).m2104i().m2096e().m2098f().m2097e(80.0f);
        C0430b c0430b = new C0430b(0.5f, 0.5f, 0.5f, 1.0f);
        C0602b c0625d = new C0625d(c0645h.m2197c("main-menu-icon-statistics"));
        c0625d.m1956c(64.0f, 64.0f);
        c0625d.m1935a(80.0f, 0.0f);
        c0625d.m1937a(c0430b);
        c0605e.mo510b(c0625d);
        c0625d = new C0629f(Game.f6551e.m2416a("statistics_title"), c0628a);
        c0625d.m1956c(320.0f, 64.0f);
        c0625d.m1935a(204.0f, 0.0f);
        c0625d.m1937a(c0430b);
        c0605e.mo510b(c0625d);
        final C0430b c0430b2 = C0430b.f1620c;
        final C0430b c0430b3 = LIGHT_BLUE.f8525f;
        C0602b c0605e2 = new C0605e();
        c0605e2.m1956c(400.0f, 96.0f);
        c0605e2.m1935a(80.0f, 64.0f);
        c0605e2.f2610d = Touchable.enabled;
        this.f7639c.m2004a(c0605e2);
        table = new C0625d(c0645h.m2197c("icon-triangle-left"));
        table.m1956c(64.0f, 64.0f);
        table.m1935a(0.0f, 16.0f);
        table.m1937a(c0430b2);
        c0605e2.mo510b(table);
        c0625d = new C0629f(Game.f6551e.m2416a("back"), c0628a);
        c0625d.m1956c(336.0f, 96.0f);
        c0625d.m1935a(124.0f, 0.0f);
        c0625d.m1937a(c0430b2);
        c0605e2.mo510b(c0625d);
        c0605e2.m1947a(new C0607f(this) {
            /* renamed from: e */
            final /* synthetic */ StatisticsScreen f7624e;

            /* renamed from: a */
            public final void mo495a(int i) {
                table.m1937a(c0430b3);
                c0625d.m1937a(c0430b3);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                Sound.m7569a(Type.NO);
                Game.game.m7473p();
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                table.m1937a(c0430b2);
                c0625d.m1937a(c0430b2);
            }
        });
        table = new Table();
        table.mo487a(false);
        table.f2677Y = true;
        this.f7639c.m2004a(table);
        C0628a c0628a2 = new C0628a(Game.game.m7463g(36), C0430b.f1620c);
        c0625d = new Table();
        table.m2059d(c0625d).m2104i().m2096e().m2097e(220.0f).m2099f(192.0f).m2103h(40.0f);
        c0625d.m2059d(new C0629f(Game.f6551e.m2416a("statistics_general"), new C0628a(Game.game.m7463g(60), C0430b.f1620c))).m2093c(40.0f).m2086a(2).m2101g(40.0f);
        c0625d.m2066q();
        for (StatisticsType statisticsType : StatisticsType.f6857l) {
            if (Statistics.f6859a.m2474c((Object) statisticsType)) {
                C0602b c0629f = new C0629f(Game.f6551e.m2416a((String) Statistics.f6859a.m2467a((Object) statisticsType)), c0628a2);
                c0629f.m2127a(16);
                c0625d.m2059d(c0629f).m2102h().m2093c(60.0f).m2103h(20.0f).m2090b(200.0f);
                c0629f = new C0629f(Statistics.m7577a(statisticsType, ((Long) Game.f6554h.f6861c.m2467a((Object) statisticsType)).longValue()), c0628a2);
                c0629f.m2127a(8);
                c0625d.m2059d(c0629f).m2098f().m2093c(60.0f).m2099f(20.0f).m2090b(200.0f);
                c0625d.m2066q();
            }
        }
        c0625d = new Table();
        table.m2059d(c0625d).m2104i().m2096e().m2097e(220.0f).m2103h(550.0f);
        c0625d.m2059d(new C0629f(Game.f6551e.m2416a("statistics_tower_damage"), new C0628a(Game.game.m7463g(60), C0430b.f1620c))).m2093c(40.0f).m2086a(2).m2101g(40.0f);
        c0625d.m2066q();
        C0676a c0676a = new C0676a();
        for (Object obj2 : TowerType.f8015m) {
            if (obj2 != TowerType.FROST) {
                long longValue = ((Long) Game.f6554h.f6862d.m2467a(obj2)).longValue();
                if (longValue > 0) {
                    c0676a.m2296a(new AnonymousClass1TowerTypeToDamage(this, obj2, longValue));
                }
            }
        }
        if (c0676a.f3001b == 0) {
            c0625d.m2059d(new C0629f(Game.f6551e.m2416a("statistics_no_data"), new C0628a(Game.game.m7463g(36), new C0430b(1.0f, 1.0f, 1.0f, 0.56f)))).m2093c(60.0f);
            return;
        }
        while (i2 < c0676a.f3001b) {
            for (i = i2 + 1; i < c0676a.f3001b; i++) {
                if (((AnonymousClass1TowerTypeToDamage) c0676a.m2291a(i2)).f7626b < ((AnonymousClass1TowerTypeToDamage) c0676a.m2291a(i)).f7626b) {
                    obj = (AnonymousClass1TowerTypeToDamage) c0676a.m2291a(i2);
                    c0676a.mo525a(i2, c0676a.m2291a(i));
                    c0676a.mo525a(i, obj);
                }
            }
            i2++;
        }
        Iterator it = c0676a.iterator();
        while (it.hasNext()) {
            final AnonymousClass1TowerTypeToDamage anonymousClass1TowerTypeToDamage = (AnonymousClass1TowerTypeToDamage) it.next();
            C0602b c0629f2 = new C0629f(((Tower) Tower.f8029g.m2467a(anonymousClass1TowerTypeToDamage.f7625a)).mo1823n(), c0628a2);
            c0629f2.m1937a(((Tower) Tower.f8029g.m2467a(anonymousClass1TowerTypeToDamage.f7625a)).mo1825p());
            c0629f2.m2127a(16);
            c0625d.m2059d(c0629f2).m2102h().m2093c(60.0f).m2103h(20.0f).m2090b(100.0f);
            C0602b c0629f3 = new C0629f(StringFormatter.m8846a((float) anonymousClass1TowerTypeToDamage.f7626b), c0628a2);
            c0629f3.m2127a(8);
            c0625d.m2059d(c0629f3).m2098f().m2093c(60.0f).m2099f(20.0f).m2090b(100.0f);
            C0603d c11802 = new C0607f(this) {
                /* renamed from: b */
                final /* synthetic */ StatisticsScreen f7629b;

                /* renamed from: a */
                public final void mo495a(int i) {
                    this.f7629b.m8201a(anonymousClass1TowerTypeToDamage.f7625a);
                }
            };
            c0629f2.m1947a(c11802);
            c0629f3.m1947a(c11802);
            c0625d.m2066q();
        }
    }

    /* renamed from: a */
    private void m8201a(TowerType towerType) {
        Iterator it = this.f7641e.iterator();
        while (it.hasNext()) {
            ChartSegment chartSegment = (ChartSegment) it.next();
            if (chartSegment.f7634e && chartSegment.f7631b != towerType) {
                chartSegment.m8199a(false);
            }
        }
        if (this.f7640d.m2474c((Object) towerType)) {
            ((ChartSegment) this.f7640d.m2467a((Object) towerType)).m8199a(true);
        }
    }

    /* renamed from: a */
    public final void resize(int i, int i2) {
        super.resize(i, i2);
        this.f7638b.f3064a = 1200.0f / ((float) Gdx.graphics.mo295d());
        this.f7638b.mo522a(i, i2);
    }

    /* renamed from: b */
    public final void mo1781b(float f) {
        if (Gdx.input.mo307b(4) || Gdx.input.mo307b(131)) {
            Game.game.m7473p();
        }
        Game.game.f6560D.m1458a(this.f7639c.f2641b.f3055b.f1595f);
        if (Gdx.input.mo307b(29)) {
            m8201a(TowerType.f8015m[FastBadRandom.m8807a(TowerType.f8015m.length)]);
        }
        if (this.f7641e.f3001b != 0) {
            float a;
            float f2 = this.f7638b.f3056c - 400.0f;
            Game.game.f6560D.m1456a(ShapeType.Filled);
            Gdx.gl20.glEnable(3042);
            Iterator it = this.f7641e.iterator();
            while (it.hasNext()) {
                ChartSegment chartSegment = (ChartSegment) it.next();
                Game.game.f6560D.m1455a(chartSegment.f7630a);
                Game.game.f6560D.m1454a(f2, 180.0f, chartSegment.f7632c - 0.15f, chartSegment.f7633d + 0.3f, (int) Math.ceil((double) (chartSegment.f7633d / 2.0f)));
            }
            Iterator it2 = this.f7641e.iterator();
            while (it2.hasNext()) {
                ChartSegment chartSegment2 = (ChartSegment) it2.next();
                long u;
                if (chartSegment2.f7634e) {
                    u = Game.game.m7478u() - chartSegment2.f7635f;
                    a = u < 500000 ? C0522d.f2384P.mo430a(((float) u) / 500000.0f) : 1.0f;
                } else {
                    u = Game.game.m7478u() - chartSegment2.f7636g;
                    a = u < 500000 ? 1.0f - (((float) u) / 500000.0f) : 0.0f;
                }
                if (a != 0.0f) {
                    C0430b c = Game.f6556q.m1222c();
                    c.f1647L = 0.5f * a;
                    Game.game.f6560D.m1455a(c);
                    Game.game.f6560D.m1454a(f2, 220.0f, chartSegment2.f7632c - (3.0f * a), chartSegment2.f7633d + (6.0f * a), 8);
                    Game.game.f6560D.m1455a(chartSegment2.f7630a);
                    Game.game.f6560D.m1454a(f2, 180.0f + (40.0f * a), chartSegment2.f7632c - 0.15f, chartSegment2.f7633d + 0.3f, (int) Math.ceil((double) (chartSegment2.f7633d / 2.0f)));
                }
            }
            Game.game.f6560D.m1455a(Game.f6556q);
            ShapeRenderer shapeRenderer = Game.game.f6560D;
            float a2 = shapeRenderer.f2113d.m1216a();
            a = C0549f.m1766b(0.034906585f);
            float a3 = C0549f.m1760a(0.034906585f);
            float f3 = 100.0f;
            float f4 = 0.0f;
            int i;
            float f5;
            if (shapeRenderer.f2114e == ShapeType.Line) {
                shapeRenderer.m1457a(ShapeType.Line, ShapeType.Filled, 362);
                i = 0;
                while (i < 180) {
                    shapeRenderer.f2110a.mo407a(a2);
                    shapeRenderer.f2110a.mo408a(f2 + f3, 600.0f + f4);
                    f5 = (a * f3) - (a3 * f4);
                    f4 = (f4 * a) + (f3 * a3);
                    shapeRenderer.f2110a.mo407a(a2);
                    shapeRenderer.f2110a.mo408a(f2 + f5, 600.0f + f4);
                    i++;
                    f3 = f5;
                }
                shapeRenderer.f2110a.mo407a(a2);
                shapeRenderer.f2110a.mo408a(f3 + f2, f4 + 600.0f);
            } else {
                shapeRenderer.m1457a(ShapeType.Line, ShapeType.Filled, 543);
                i = 0;
                while (i < 179) {
                    shapeRenderer.f2110a.mo407a(a2);
                    shapeRenderer.f2110a.mo408a(f2, 600.0f);
                    shapeRenderer.f2110a.mo407a(a2);
                    shapeRenderer.f2110a.mo408a(f2 + f3, 600.0f + f4);
                    f5 = (a * f3) - (a3 * f4);
                    f4 = (f4 * a) + (f3 * a3);
                    shapeRenderer.f2110a.mo407a(a2);
                    shapeRenderer.f2110a.mo408a(f2 + f5, 600.0f + f4);
                    i++;
                    f3 = f5;
                }
                shapeRenderer.f2110a.mo407a(a2);
                shapeRenderer.f2110a.mo408a(f2, 600.0f);
                shapeRenderer.f2110a.mo407a(a2);
                shapeRenderer.f2110a.mo408a(f3 + f2, f4 + 600.0f);
            }
            shapeRenderer.f2110a.mo407a(a2);
            shapeRenderer.f2110a.mo408a(f2 + 100.0f, 600.0f);
            Game.game.f6560D.m1451a();
        }
        this.f7639c.m2015c();
        this.f7639c.m2001a();
    }

    public final void j_() {
        GlobalUpgrade.m7491a(FilteringMode.NONE, null);
        Gdx.input.mo304a(this.f7639c);
    }
}
