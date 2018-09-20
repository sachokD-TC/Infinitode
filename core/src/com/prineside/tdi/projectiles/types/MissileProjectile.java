package com.prineside.tdi.projectiles.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.math.C0522d;
import com.badlogic.gdx.math.C0547e;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.C0328t;
import com.badlogic.gdx.utils.C0328t.C0449a;
import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.AsyncUpdatable;
import com.prineside.tdi.AsyncUpdater;
import com.prineside.tdi.Game;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgradeType;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.projectiles.Projectile;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.tiles.WalkableTile;
import com.prineside.tdi.towers.types.MissileTower;
import com.prineside.tdi.utility.PMath;
import java.util.Iterator;

public class MissileProjectile implements C0449a, AsyncUpdatable, Projectile {
    /* renamed from: a */
    public static final C0328t<MissileProjectile> f7050a = new C10861();
    /* renamed from: b */
    public static C0438n f7051b;
    /* renamed from: c */
    public static C0438n f7052c;
    /* renamed from: f */
    private static final GlobalUpgradeType[] f7053f = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MISSILE_S_MISSILE_LIFE_TIME_V, GlobalUpgradeType.TOWER_MISSILE_S_MISSILE_LIFE_TIME_IV, GlobalUpgradeType.TOWER_MISSILE_S_MISSILE_LIFE_TIME_III, GlobalUpgradeType.TOWER_MISSILE_S_MISSILE_LIFE_TIME_II, GlobalUpgradeType.TOWER_MISSILE_S_MISSILE_LIFE_TIME_I};
    /* renamed from: g */
    private static final GlobalUpgradeType[] f7054g = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MISSILE_S_MISSILE_ROTATION_SPEED_V, GlobalUpgradeType.TOWER_MISSILE_S_MISSILE_ROTATION_SPEED_IV, GlobalUpgradeType.TOWER_MISSILE_S_MISSILE_ROTATION_SPEED_III, GlobalUpgradeType.TOWER_MISSILE_S_MISSILE_ROTATION_SPEED_II, GlobalUpgradeType.TOWER_MISSILE_S_MISSILE_ROTATION_SPEED_I};
    /* renamed from: h */
    private static C0430b f7055h = new C0430b(-383884289);
    /* renamed from: i */
    private static long f7056i;
    /* renamed from: j */
    private static float f7057j;
    /* renamed from: d */
    public MissileTower f7058d;
    /* renamed from: e */
    public Enemy f7059e;
    /* renamed from: k */
    private boolean f7060k = false;
    /* renamed from: l */
    private boolean f7061l = false;
    /* renamed from: m */
    private long f7062m;
    /* renamed from: n */
    private long f7063n;
    /* renamed from: o */
    private long f7064o;
    /* renamed from: p */
    private float f7065p;
    /* renamed from: q */
    private Vector2 f7066q = new Vector2();
    /* renamed from: r */
    private float f7067r;
    /* renamed from: s */
    private Vector2 f7068s = new Vector2();
    /* renamed from: t */
    private Vector2 f7069t = new Vector2();
    /* renamed from: u */
    private float f7070u;
    /* renamed from: v */
    private float f7071v;
    /* renamed from: w */
    private AsyncUpdater f7072w;
    /* renamed from: x */
    private C0676a<Enemy> f7073x = new C0676a();

    /* renamed from: com.prineside.tdi.projectiles.types.MissileProjectile$1 */
    static class C10861 extends C0328t<MissileProjectile> {
        C10861() {
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo301a() {
            return new MissileProjectile();
        }
    }

    /* renamed from: k */
    public static void m7766k() {
        f7051b = Game.game.f6561E.m1442a("projectile-missile");
        f7052c = Game.game.f6561E.m1442a("range");
        f7056i = 10000000;
        for (GlobalUpgradeType globalUpgradeType : f7053f) {
            if (GlobalUpgrade.m7492a(globalUpgradeType)) {
                f7056i += (long) (GlobalUpgrade.m7495c(globalUpgradeType).f6630u[0] * 1000000.0f);
                break;
            }
        }
        f7057j = 5.0f;
        for (GlobalUpgradeType globalUpgradeType2 : f7054g) {
            if (GlobalUpgrade.m7492a(globalUpgradeType2)) {
                f7057j += GlobalUpgrade.m7495c(globalUpgradeType2).f6630u[0];
                return;
            }
        }
    }

    /* renamed from: l */
    public static MissileProjectile m7767l() {
        Game.m7445k();
        return (MissileProjectile) f7050a.m965b();
    }

    /* renamed from: a */
    public final void mo360a() {
    }

    /* renamed from: a */
    public final void mo1751a(AsyncUpdater asyncUpdater) {
        this.f7072w = asyncUpdater;
    }

    /* renamed from: a */
    public final void m7770a(MissileTower missileTower, float f, Vector2 vector2, Enemy enemy, float f2, float f3, float f4) {
        this.f7062m = Game.game.m7477t();
        this.f7064o = Game.game.m7477t();
        this.f7058d = missileTower;
        this.f7065p = f;
        this.f7060k = false;
        this.f7061l = false;
        this.f7059e = enemy;
        this.f7066q.f2337x = enemy.f6909d.f2337x;
        this.f7066q.f2338y = enemy.f6909d.f2338y;
        this.f7067r = 64.0f * f4;
        this.f7069t.f2337x = vector2.f2337x;
        this.f7069t.f2338y = vector2.f2338y;
        this.f7070u = f3;
        this.f7071v = f2;
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            gameScreen.m7844a((AsyncUpdatable) this);
        }
    }

    /* renamed from: b */
    public final boolean mo1768b() {
        return this.f7060k;
    }

    /* renamed from: c */
    public final AsyncUpdater mo1752c() {
        return this.f7072w;
    }

    /* renamed from: d */
    public final void mo1753d() {
        if (!this.f7061l) {
            GameScreen gameScreen = Game.f6553g;
            if (gameScreen != null) {
                Tile b = gameScreen.f7179t.m7527b((int) this.f7069t.f2337x, (int) this.f7069t.f2338y);
                if (b != null && (b instanceof WalkableTile)) {
                    Iterator it = ((WalkableTile) b).f7985q.iterator();
                    while (it.hasNext()) {
                        WalkableTile walkableTile = (WalkableTile) it.next();
                        if (walkableTile.f7986r != 0) {
                            synchronized (walkableTile.f7984p) {
                                Iterator c = walkableTile.f7984p.m2489c();
                                while (c.hasNext()) {
                                    Enemy enemy = (Enemy) c.next();
                                    if (PMath.m8826b(this.f7069t.f2337x, this.f7069t.f2338y, enemy.f6909d.f2337x, enemy.f6909d.f2338y) < 256.0f) {
                                        this.f7061l = true;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final boolean mo1769e() {
        return this.f7060k && Game.game.m7477t() - this.f7063n > 500000;
    }

    /* renamed from: f */
    public final boolean mo1770f() {
        return this.f7060k;
    }

    /* renamed from: g */
    public final void mo1771g() {
        Game.game.logger.log("MissileProjectile", "hit?...");
    }

    /* renamed from: h */
    public final void mo1772h() {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null && !this.f7060k) {
            float a;
            float t = ((float) (Game.game.m7477t() - this.f7064o)) / 1000000.0f;
            this.f7064o = Game.game.m7477t();
            if (this.f7059e == null || !gameScreen.f7179t.m7529b(this.f7059e)) {
                this.f7059e = null;
                this.f7058d.f8266F.m2296a((Object) this);
            } else {
                this.f7066q.f2337x = this.f7059e.f6909d.f2337x;
                this.f7066q.f2338y = this.f7059e.f6909d.f2338y;
            }
            float a2 = PMath.m8821a(this.f7069t, this.f7066q);
            if (a2 != this.f7070u) {
                a = PMath.m8819a(this.f7070u, a2);
                float f = (f7057j * t) * (this.f7071v * this.f7071v);
                if (Math.abs(a) <= f) {
                    this.f7070u = a2;
                } else if (a < 0.0f) {
                    this.f7070u -= f;
                } else {
                    this.f7070u += f;
                }
            }
            a2 = this.f7071v * 64.0f;
            long t2 = Game.game.m7477t() - this.f7062m;
            if (t2 < 1000000) {
                a2 *= ((((float) t2) / 1000000.0f) * 0.5f) + 0.5f;
            }
            this.f7068s.f2337x = this.f7069t.f2337x;
            this.f7068s.f2338y = this.f7069t.f2338y;
            PMath.m8823a(this.f7069t, this.f7070u, a2 * t);
            if (this.f7061l || t2 > f7056i || C0547e.m1758a(this.f7068s, this.f7069t, this.f7066q, 163.84001f)) {
                this.f7060k = true;
                this.f7063n = Game.game.m7477t();
                gameScreen = Game.f6553g;
                if (gameScreen != null) {
                    GameScreen.m7831b((AsyncUpdatable) this);
                    this.f7073x.mo530d();
                    gameScreen.f7179t.m7522a(this.f7073x, this.f7069t.f2337x, this.f7069t.f2338y, this.f7067r);
                    Iterator it = this.f7073x.iterator();
                    while (it.hasNext()) {
                        Enemy enemy = (Enemy) it.next();
                        if (enemy.mo1755a(this.f7058d.k)) {
                            a = 1.0f - (PMath.m8820a(enemy.f6909d.f2337x, enemy.f6909d.f2338y, this.f7069t.f2337x, this.f7069t.f2338y) / this.f7067r);
                            if (a > 0.0f) {
                                enemy.m7599a(this.f7058d, (a * this.f7065p) * enemy.mo1756b(this.f7058d.k));
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo1773i() {
        if (Game.f6553g != null) {
            if (!this.f7060k) {
                Game.game.f6559C.mo371a(f7051b, this.f7069t.f2337x - 5.0f, this.f7069t.f2338y - 10.0f, 5.0f, 10.0f, 10.0f, 20.0f, 1.0f, 1.0f, this.f7070u);
            } else if (!Game.game.f6582n) {
                float a = C0522d.f2372D.mo430a(((float) (Game.game.m7477t() - this.f7063n)) / 500000.0f);
                float f = (this.f7067r * a) * 2.0f;
                f7055h.f1647L = 0.75f - (a * 0.75f);
                Game.game.f6559C.m1410a(f7055h);
                Game.game.f6559C.mo370a(f7052c, this.f7069t.f2337x - (f / 2.0f), this.f7069t.f2338y - (f / 2.0f), f, f);
                Game.game.f6559C.m1410a(C0430b.f1620c);
            }
        }
    }

    /* renamed from: j */
    public final void mo1774j() {
        f7050a.mo363a((Object) this);
    }
}
