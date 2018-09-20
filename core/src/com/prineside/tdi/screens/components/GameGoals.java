package com.prineside.tdi.screens.components;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.scenes.scene2d.C0588a;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.C0609g;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.p033a.C0587a;
import com.badlogic.gdx.scenes.scene2d.p033a.C0593d;
import com.badlogic.gdx.scenes.scene2d.p033a.C0599k;
import com.badlogic.gdx.scenes.scene2d.ui.C0625d;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f.C0628a;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.C0618d;
import com.badlogic.gdx.scenes.scene2d.utils.C0663k;
import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.Game;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgradeType;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.utility.MaterialColor.AMBER;
import com.prineside.tdi.utility.MaterialColor.GREEN;
import com.prineside.tdi.utility.MaterialColor.LIGHT_BLUE;
import com.prineside.tdi.utility.QuadActor;
import java.util.Iterator;

public class GameGoals {
    /* renamed from: a */
    private Table f7685a;
    /* renamed from: b */
    private Table f7686b;
    /* renamed from: c */
    private Table f7687c;
    /* renamed from: d */
    private C0629f f7688d;

    /* renamed from: com.prineside.tdi.screens.components.GameGoals$1 */
    class C11881 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ GameGoals f7663a;

        C11881(GameGoals gameGoals) {
            this.f7663a = gameGoals;
        }

        /* renamed from: b */
        public final void mo500b() {
            this.f7663a.m8219a();
        }
    }

    /* renamed from: com.prineside.tdi.screens.components.GameGoals$2 */
    class C11892 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ GameGoals f7664a;

        C11892(GameGoals gameGoals) {
            this.f7664a = gameGoals;
        }

        public void run() {
            this.f7664a.m8219a();
        }
    }

    public static class Goal {
        /* renamed from: a */
        public static C0676a<Goal> f7665a = new C0676a();
        /* renamed from: b */
        public C0605e f7666b = new C0605e();
        /* renamed from: c */
        public C0629f f7667c;
        /* renamed from: d */
        public C0625d f7668d;
        /* renamed from: e */
        public boolean f7669e = false;
        /* renamed from: f */
        private C0628a f7670f = new C0628a(Game.game.m7465h(36), new C0430b(-137));

        public Goal(String str) {
            this.f7666b.m1956c(48.0f, 40.0f);
            this.f7667c = new C0629f(str, this.f7670f);
            this.f7667c.m1956c(1.0f, 40.0f);
            this.f7667c.m2127a(16);
            this.f7667c.m1935a(0.0f, 0.0f);
            this.f7666b.mo510b(this.f7667c);
            this.f7668d = new C0625d(Game.game.f6561E.m1442a("goal-checkbox"));
            this.f7668d.m1956c(32.0f, 32.0f);
            this.f7668d.m1935a(16.0f, 2.0f);
            this.f7666b.mo510b(this.f7668d);
        }

        /* renamed from: a */
        public final void m8216a(String str) {
            this.f7667c.m2130a((CharSequence) str);
        }

        /* renamed from: a */
        public final void m8217a(boolean z) {
            if (z != this.f7669e) {
                if (z) {
                    this.f7668d.m2117a(new C0663k(Game.game.f6561E.m1442a("goal-checkbox-checked")));
                } else {
                    this.f7668d.m2117a(new C0663k(Game.game.f6561E.m1442a("goal-checkbox")));
                }
                this.f7669e = z;
            }
        }
    }

    public static class ReachedGoalPrize {
        /* renamed from: a */
        public PrizeType f7678a;
        /* renamed from: b */
        public GlobalUpgradeType f7679b;
        /* renamed from: c */
        public int f7680c;
        /* renamed from: d */
        public int f7681d;
        /* renamed from: e */
        public int f7682e;
        /* renamed from: f */
        public int f7683f;
        /* renamed from: g */
        public Tile f7684g;

        public enum PrizeType {
            GAME_HEALTH,
            GAME_COINS,
            GLOBAL_UPGRADE,
            MONEY,
            MATERIALS,
            TILE
        }
    }

    public GameGoals(GameScreen gameScreen) {
        C0609g c0609g = gameScreen.f7181v;
        C0602b table = new Table();
        c0609g.m2004a(table);
        this.f7685a = new Table();
        this.f7685a.mo487a(false);
        table.m2059d(this.f7685a).m2103h(32.0f).m2097e(192.0f).m2104i().m2096e().m2102h();
        this.f7686b = new Table();
        this.f7686b.f2677Y = true;
        this.f7686b.f2611e = false;
        this.f7686b.f2610d = Touchable.childrenOnly;
        c0609g.m2004a(this.f7686b);
        C0602b c0605e = new C0605e();
        c0605e.f2628r = false;
        c0605e.f2610d = Touchable.enabled;
        c0605e.m1947a(new C11881(this));
        this.f7686b.m2059d(c0605e).m2085a(450.0f, 375.0f).m2097e(192.0f).m2104i().m2096e().m2102h();
        table = new QuadActor(new float[]{0.05f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.05f}, new int[]{0, 0, 0, 204, 0, 0, 0, 204, 0, 0, 0, 204, 0, 0, 0, 204});
        table.m1956c(450.0f, 375.0f);
        c0605e.mo510b(table);
        table = new C0629f(Game.f6551e.m2416a("game_goal_reached_title"), new C0628a(Game.game.m7463g(36), C0430b.f1620c));
        table.m1935a(50.0f, 290.0f);
        c0605e.mo510b(table);
        this.f7688d = new C0629f("Wave 450", new C0628a(Game.game.m7463g(24), new C0430b(-137)));
        this.f7688d.m1935a(50.0f, 255.0f);
        c0605e.mo510b(this.f7688d);
        this.f7687c = new Table();
        this.f7687c.mo487a(false);
        this.f7687c.m1956c(366.0f, 230.0f);
        this.f7687c.m1935a(52.0f, 20.0f);
        c0605e.mo510b(this.f7687c);
    }

    /* renamed from: a */
    public final Goal m8218a(String str) {
        Goal goal = new Goal(str);
        this.f7685a.m2059d(goal.f7666b).m2106k();
        return goal;
    }

    /* renamed from: a */
    public final void m8219a() {
        this.f7686b.m1940a(C0587a.m1885a(C0587a.m1881a(0.0f, 0.5f, null), C0587a.m1886a(false)));
    }

    /* renamed from: a */
    public final void m8220a(String str, C0676a<ReachedGoalPrize> c0676a) {
        C0602b table;
        this.f7686b.m1949b();
        this.f7686b.f2611e = true;
        this.f7686b.m1940a(C0587a.m1881a(1.0f, 0.0f, null));
        Table table2 = this.f7686b;
        C0599k c0599k = (C0599k) C0587a.m1887a(C0599k.class);
        c0599k.f2603d = new C11892(this);
        C0593d c0593d = (C0593d) C0587a.m1887a(C0593d.class);
        c0593d.f2591d = 7.5f;
        c0593d.m1905a((C0588a) c0599k);
        table2.m1940a((C0588a) c0593d);
        this.f7688d.m2130a((CharSequence) str);
        this.f7687c.mo475c();
        Iterator it = c0676a.iterator();
        while (it.hasNext()) {
            ReachedGoalPrize reachedGoalPrize = (ReachedGoalPrize) it.next();
            if (reachedGoalPrize.f7678a == PrizeType.MONEY) {
                table = new Table();
                this.f7687c.m2059d(table).m2086a(2);
                C0602b c0625d = new C0625d(Game.game.f6561E.m1442a("main-menu-icon-money"));
                c0625d.m1937a(GREEN.f8487f);
                table.m2059d(c0625d).m2084a(48.0f).m2103h(16.0f);
                table.m2059d(new C0629f(String.valueOf(reachedGoalPrize.f7680c), new C0628a(Game.game.m7463g(36), GREEN.f8487f)));
            }
        }
        this.f7687c.m2066q();
        it = c0676a.iterator();
        while (it.hasNext()) {
            reachedGoalPrize = (ReachedGoalPrize) it.next();
            if (reachedGoalPrize.f7678a == PrizeType.MATERIALS) {
                table = new Table();
                this.f7687c.m2059d(table).m2086a(2);
                c0625d = new C0625d(Game.game.f6561E.m1442a("main-menu-icon-materials"));
                c0625d.m1937a(LIGHT_BLUE.f8525f);
                table.m2059d(c0625d).m2084a(48.0f).m2103h(16.0f);
                table.m2059d(new C0629f(String.valueOf(reachedGoalPrize.f7681d), new C0628a(Game.game.m7463g(36), LIGHT_BLUE.f8525f)));
            }
        }
        this.f7687c.m2066q();
        it = c0676a.iterator();
        while (it.hasNext()) {
            reachedGoalPrize = (ReachedGoalPrize) it.next();
            if (reachedGoalPrize.f7678a == PrizeType.GAME_HEALTH) {
                table = new Table();
                this.f7687c.m2059d(table).m2086a(2);
                table.m2059d(new C0625d(Game.game.f6561E.m1442a("game-gui-health"))).m2084a(48.0f).m2103h(16.0f);
                table.m2059d(new C0629f(String.valueOf(reachedGoalPrize.f7682e), new C0628a(Game.game.m7463g(36), GREEN.f8487f)));
            }
        }
        this.f7687c.m2066q();
        it = c0676a.iterator();
        while (it.hasNext()) {
            reachedGoalPrize = (ReachedGoalPrize) it.next();
            if (reachedGoalPrize.f7678a == PrizeType.GAME_COINS) {
                table = new Table();
                this.f7687c.m2059d(table).m2086a(2);
                table.m2059d(new C0625d(Game.game.f6561E.m1442a("game-gui-money"))).m2084a(48.0f).m2103h(16.0f);
                table.m2059d(new C0629f(String.valueOf(reachedGoalPrize.f7683f), new C0628a(Game.game.m7463g(36), GREEN.f8487f)));
            }
        }
        this.f7687c.m2066q();
        it = c0676a.iterator();
        while (it.hasNext()) {
            reachedGoalPrize = (ReachedGoalPrize) it.next();
            if (reachedGoalPrize.f7678a == PrizeType.GLOBAL_UPGRADE) {
                table = new Table();
                table.mo487a(false);
                this.f7687c.m2059d(table).m2086a(2);
                GlobalUpgrade c = GlobalUpgrade.m7495c(reachedGoalPrize.f7679b);
                C0602b table3 = new Table();
                table.m2059d(table3).m2106k();
                table3.m2059d(new C0625d(c.f6621l.f6688e)).m2084a(64.0f);
                Object d = c.m7499d();
                if (d != null) {
                    Tower tower = (Tower) Tower.f8029g.m2467a(d);
                    C0602b c0605e = new C0605e();
                    c0605e.f2628r = false;
                    C0602b c0625d2 = new C0625d(tower.f8060v);
                    c0625d2.m1956c(80.0f, 80.0f);
                    c0605e.mo510b(c0625d2);
                    c0625d2 = new C0625d(tower.f8062x);
                    c0625d2.m1956c(80.0f, 80.0f);
                    c0605e.mo510b(c0625d2);
                    table3.m2059d(c0605e).m2084a(80.0f).m2099f(16.0f);
                }
                C0602b c0629f = new C0629f(c.m7498c(), new C0628a(Game.game.m7463g(30), AMBER.f8397f));
                c0629f.m2127a(1);
                c0629f.m2135h();
                table.m2059d(c0629f).m2097e(8.0f);
                table.m2066q();
                c0629f = new C0629f(Game.f6551e.m2416a("game_goal_free_global_upgrade"), new C0628a(Game.game.m7463g(24), C0430b.f1620c));
                c0629f.m2127a(1);
                table.m2059d(c0629f).m2097e(8.0f);
            }
        }
        this.f7687c.m2066q();
        table = new Table();
        this.f7687c.m2059d(table).m2097e(8.0f).m2086a(2);
        Iterator it2 = c0676a.iterator();
        int i = 0;
        while (it2.hasNext()) {
            int i2;
            reachedGoalPrize = (ReachedGoalPrize) it2.next();
            if (reachedGoalPrize.f7678a == PrizeType.TILE) {
                table.m2059d(Tile.m8365a(reachedGoalPrize.f7684g, 80)).m2084a(80.0f).m2095d(4.0f);
                i2 = i + 1;
                if (i2 % 4 == 0) {
                    table.m2066q();
                }
            } else {
                i2 = i;
            }
            i = i2;
        }
        Sound.m7569a(Type.SUCCESS);
    }
}
