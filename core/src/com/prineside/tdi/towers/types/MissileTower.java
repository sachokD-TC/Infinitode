package com.prineside.tdi.towers.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.C0507i;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0710q;
import com.prineside.tdi.Game;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgradeType;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.projectiles.Projectile;
import com.prineside.tdi.projectiles.types.MissileProjectile;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.tiles.WalkableTile;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.TowerStat;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.towers.TowerUpgrade.TowerUpgradeType;
import com.prineside.tdi.utility.FastBadRandom;
import com.prineside.tdi.utility.MaterialColor.PINK;
import com.prineside.tdi.utility.MeshedCircle;
import com.prineside.tdi.utility.PMath;
import java.util.Iterator;

public class MissileTower extends Tower {
    /* renamed from: G */
    private static MeshedCircle f8248G;
    /* renamed from: H */
    private static MeshedCircle f8249H;
    /* renamed from: I */
    private static MeshedCircle f8250I;
    /* renamed from: J */
    private static MeshedCircle f8251J;
    /* renamed from: K */
    private static C0438n f8252K;
    /* renamed from: L */
    private static final GlobalUpgradeType[] f8253L = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MISSILE_PRICE_V, GlobalUpgradeType.TOWER_MISSILE_PRICE_IV, GlobalUpgradeType.TOWER_MISSILE_PRICE_III, GlobalUpgradeType.TOWER_MISSILE_PRICE_II, GlobalUpgradeType.TOWER_MISSILE_PRICE_I};
    /* renamed from: M */
    private static final GlobalUpgradeType[] f8254M = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MISSILE_MAX_TOWER_LEVEL_V, GlobalUpgradeType.TOWER_MISSILE_MAX_TOWER_LEVEL_IV, GlobalUpgradeType.TOWER_MISSILE_MAX_TOWER_LEVEL_III, GlobalUpgradeType.TOWER_MISSILE_MAX_TOWER_LEVEL_II, GlobalUpgradeType.TOWER_MISSILE_MAX_TOWER_LEVEL_I};
    /* renamed from: N */
    private static final GlobalUpgradeType[] f8255N = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MISSILE_MAX_UPGRADE_LEVEL_III, GlobalUpgradeType.TOWER_MISSILE_MAX_UPGRADE_LEVEL_II, GlobalUpgradeType.TOWER_MISSILE_MAX_UPGRADE_LEVEL_I};
    /* renamed from: O */
    private static final GlobalUpgradeType[] f8256O = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MISSILE_EXPERIENCE_BONUS_II, GlobalUpgradeType.TOWER_MISSILE_EXPERIENCE_BONUS};
    /* renamed from: P */
    private static final GlobalUpgradeType[] f8257P = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MISSILE_EXPERIENCE_GENERATION_II, GlobalUpgradeType.TOWER_MISSILE_EXPERIENCE_GENERATION};
    /* renamed from: Q */
    private static final GlobalUpgradeType[] f8258Q = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MISSILE_UPGRADE_PRICE_V, GlobalUpgradeType.TOWER_MISSILE_UPGRADE_PRICE_IV, GlobalUpgradeType.TOWER_MISSILE_UPGRADE_PRICE_III, GlobalUpgradeType.TOWER_MISSILE_UPGRADE_PRICE_II, GlobalUpgradeType.TOWER_MISSILE_UPGRADE_PRICE_I};
    /* renamed from: R */
    private static final C0710q<TowerStatType, TowerStatConfig> f8259R;
    /* renamed from: S */
    private static final GlobalUpgradeType[] f8260S = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MISSILE_S_MINIMUM_RANGE_V, GlobalUpgradeType.TOWER_MISSILE_S_MINIMUM_RANGE_IV, GlobalUpgradeType.TOWER_MISSILE_S_MINIMUM_RANGE_III, GlobalUpgradeType.TOWER_MISSILE_S_MINIMUM_RANGE_II, GlobalUpgradeType.TOWER_MISSILE_S_MINIMUM_RANGE_I};
    /* renamed from: T */
    private static final TowerStatType[] f8261T = new TowerStatType[]{TowerStatType.RANGE, TowerStatType.DAMAGE, TowerStatType.ATTACK_SPEED, TowerStatType.ROTATION_SPEED, TowerStatType.PROJECTILE_SPEED, TowerStatType.U_EXPLOSION_RANGE, TowerStatType.U_LRM_AIM_TIME};
    /* renamed from: U */
    private static final TowerUpgradeType[] f8262U = new TowerUpgradeType[]{TowerUpgradeType.RANGE, TowerUpgradeType.DAMAGE, TowerUpgradeType.ATTACK_SPEED, TowerUpgradeType.ROTATION_N_PROJECTILE_SPEED};
    /* renamed from: V */
    private static final C0710q<TowerStatType, Integer> f8263V;
    /* renamed from: W */
    private static final C0710q<TowerUpgradeType, Integer[]> f8264W;
    /* renamed from: X */
    private static final C0710q<TowerStatType, Float[]> f8265X;
    /* renamed from: F */
    public final C0676a<MissileProjectile> f8266F = new C0676a();
    /* renamed from: Y */
    private long f8267Y;
    /* renamed from: Z */
    private boolean f8268Z = false;
    private Enemy aa = null;
    private float ab;
    private float ac;
    private float ad;
    private float ae;
    private float af;
    private float ag;
    private int ah;
    private float ai = 1.5f;
    private float aj;

    static {
        C0710q c0710q = new C0710q();
        f8259R = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new TowerStatConfig(4.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MISSILE_RANGE_V, GlobalUpgradeType.TOWER_MISSILE_RANGE_IV, GlobalUpgradeType.TOWER_MISSILE_RANGE_III, GlobalUpgradeType.TOWER_MISSILE_RANGE_II, GlobalUpgradeType.TOWER_MISSILE_RANGE_I}));
        f8259R.mo542a(TowerStatType.DAMAGE, new TowerStatConfig(11.25f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MISSILE_DAMAGE_V, GlobalUpgradeType.TOWER_MISSILE_DAMAGE_IV, GlobalUpgradeType.TOWER_MISSILE_DAMAGE_III, GlobalUpgradeType.TOWER_MISSILE_DAMAGE_II, GlobalUpgradeType.TOWER_MISSILE_DAMAGE_I}));
        f8259R.mo542a(TowerStatType.ATTACK_SPEED, new TowerStatConfig(0.3f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MISSILE_ATTACK_SPEED_V, GlobalUpgradeType.TOWER_MISSILE_ATTACK_SPEED_IV, GlobalUpgradeType.TOWER_MISSILE_ATTACK_SPEED_III, GlobalUpgradeType.TOWER_MISSILE_ATTACK_SPEED_II, GlobalUpgradeType.TOWER_MISSILE_ATTACK_SPEED_I}));
        f8259R.mo542a(TowerStatType.PROJECTILE_SPEED, new TowerStatConfig(4.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MISSILE_ROTATION_N_PROJECTILE_SPEED_V, GlobalUpgradeType.TOWER_MISSILE_ROTATION_N_PROJECTILE_SPEED_IV, GlobalUpgradeType.TOWER_MISSILE_ROTATION_N_PROJECTILE_SPEED_III, GlobalUpgradeType.TOWER_MISSILE_ROTATION_N_PROJECTILE_SPEED_II, GlobalUpgradeType.TOWER_MISSILE_ROTATION_N_PROJECTILE_SPEED_I}, 0));
        f8259R.mo542a(TowerStatType.ROTATION_SPEED, new TowerStatConfig(45.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MISSILE_ROTATION_N_PROJECTILE_SPEED_V, GlobalUpgradeType.TOWER_MISSILE_ROTATION_N_PROJECTILE_SPEED_IV, GlobalUpgradeType.TOWER_MISSILE_ROTATION_N_PROJECTILE_SPEED_III, GlobalUpgradeType.TOWER_MISSILE_ROTATION_N_PROJECTILE_SPEED_II, GlobalUpgradeType.TOWER_MISSILE_ROTATION_N_PROJECTILE_SPEED_I}, 1));
        f8259R.mo542a(TowerStatType.U_EXPLOSION_RANGE, new TowerStatConfig(0.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MISSILE_U_PROJECTILE_EXPLOSION_RANGE_V, GlobalUpgradeType.TOWER_MISSILE_U_PROJECTILE_EXPLOSION_RANGE_IV, GlobalUpgradeType.TOWER_MISSILE_U_PROJECTILE_EXPLOSION_RANGE_III, GlobalUpgradeType.TOWER_MISSILE_U_PROJECTILE_EXPLOSION_RANGE_II, GlobalUpgradeType.TOWER_MISSILE_U_PROJECTILE_EXPLOSION_RANGE_I}));
        f8259R.mo542a(TowerStatType.U_LRM_AIM_TIME, new TowerStatConfig(0.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MISSILE_U_LRM_AIM_TIME_V, GlobalUpgradeType.TOWER_MISSILE_U_LRM_AIM_TIME_IV, GlobalUpgradeType.TOWER_MISSILE_U_LRM_AIM_TIME_III, GlobalUpgradeType.TOWER_MISSILE_U_LRM_AIM_TIME_II, GlobalUpgradeType.TOWER_MISSILE_U_LRM_AIM_TIME_I}));
        c0710q = new C0710q();
        f8263V = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, Integer.valueOf(0));
        f8263V.mo542a(TowerStatType.DAMAGE, Integer.valueOf(1));
        f8263V.mo542a(TowerStatType.ATTACK_SPEED, Integer.valueOf(2));
        f8263V.mo542a(TowerStatType.ROTATION_SPEED, Integer.valueOf(3));
        f8263V.mo542a(TowerStatType.PROJECTILE_SPEED, Integer.valueOf(3));
        c0710q = new C0710q();
        f8264W = c0710q;
        c0710q.mo542a(TowerUpgradeType.RANGE, new Integer[]{Integer.valueOf(149), Integer.valueOf(212), Integer.valueOf(307), Integer.valueOf(453), Integer.valueOf(680), Integer.valueOf(1040), Integer.valueOf(1620), Integer.valueOf(2568), Integer.valueOf(4143), Integer.valueOf(6799)});
        f8264W.mo542a(TowerUpgradeType.DAMAGE, new Integer[]{Integer.valueOf(261), Integer.valueOf(379), Integer.valueOf(554), Integer.valueOf(815), Integer.valueOf(1207), Integer.valueOf(1799), Integer.valueOf(2699), Integer.valueOf(4076), Integer.valueOf(6196), Integer.valueOf(9480)});
        f8264W.mo542a(TowerUpgradeType.ATTACK_SPEED, new Integer[]{Integer.valueOf(109), Integer.valueOf(153), Integer.valueOf(218), Integer.valueOf(312), Integer.valueOf(439), Integer.valueOf(616), Integer.valueOf(825), Integer.valueOf(1133), Integer.valueOf(1512), Integer.valueOf(2029)});
        f8264W.mo542a(TowerUpgradeType.ROTATION_N_PROJECTILE_SPEED, new Integer[]{Integer.valueOf(128), Integer.valueOf(176), Integer.valueOf(248), Integer.valueOf(354), Integer.valueOf(535), Integer.valueOf(823), Integer.valueOf(1283), Integer.valueOf(2020), Integer.valueOf(3217), Integer.valueOf(5193)});
        c0710q = new C0710q();
        f8265X = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new Float[]{Float.valueOf(1.153f), Float.valueOf(1.32f), Float.valueOf(1.515f), Float.valueOf(1.712f), Float.valueOf(1.932f), Float.valueOf(2.146f), Float.valueOf(2.359f), Float.valueOf(2.593f), Float.valueOf(2.85f), Float.valueOf(3.1f)});
        f8265X.mo542a(TowerStatType.DAMAGE, new Float[]{Float.valueOf(2.04f), Float.valueOf(3.11f), Float.valueOf(4.247f), Float.valueOf(5.372f), Float.valueOf(6.386f), Float.valueOf(7.5f), Float.valueOf(8.703f), Float.valueOf(9.713f), Float.valueOf(10.78f), Float.valueOf(12.03f)});
        f8265X.mo542a(TowerStatType.ATTACK_SPEED, new Float[]{Float.valueOf(1.145f), Float.valueOf(1.31f), Float.valueOf(1.484f), Float.valueOf(1.694f), Float.valueOf(1.893f), Float.valueOf(2.107f), Float.valueOf(2.369f), Float.valueOf(2.593f), Float.valueOf(2.874f), Float.valueOf(3.152f)});
        f8265X.mo542a(TowerStatType.ROTATION_SPEED, new Float[]{Float.valueOf(1.172f), Float.valueOf(1.387f), Float.valueOf(1.628f), Float.valueOf(1.868f), Float.valueOf(2.109f), Float.valueOf(2.425f), Float.valueOf(2.715f), Float.valueOf(3.08f), Float.valueOf(3.499f), Float.valueOf(3.93f)});
        f8265X.mo542a(TowerStatType.PROJECTILE_SPEED, new Float[]{Float.valueOf(1.13f), Float.valueOf(1.285f), Float.valueOf(1.467f), Float.valueOf(1.646f), Float.valueOf(1.839f), Float.valueOf(2.039f), Float.valueOf(2.265f), Float.valueOf(2.527f), Float.valueOf(2.771f), Float.valueOf(3.062f)});
    }

    public MissileTower() {
        super(TowerType.MISSILE);
        for (GlobalUpgradeType globalUpgradeType : f8260S) {
            if (GlobalUpgrade.m7492a(globalUpgradeType)) {
                this.ai += GlobalUpgrade.m7495c(globalUpgradeType).f6630u[0];
                break;
            }
        }
        this.ai *= 64.0f;
        this.aj = this.ai * this.ai;
        if (f8248G == null) {
            f8248G = new MeshedCircle(0.0f, 0.0f, this.ai, this.ai + 64.0f, d, f);
            f8249H = new MeshedCircle(0.0f, 0.0f, this.ai, this.ai + 64.0f, c, e);
            f8250I = new MeshedCircle(0.0f, 0.0f, this.ai, this.ai + 3.0f, d, d);
            f8251J = new MeshedCircle(0.0f, 0.0f, this.ai, this.ai + 3.0f, c, c);
        }
        if (f8252K == null) {
            f8252K = Game.game.f6561E.m1442a("projectile-missile");
        }
        this.f8267Y = Game.game.m7477t();
    }

    /* renamed from: A */
    public final GlobalUpgradeType mo1811A() {
        return GlobalUpgradeType.TOWER_MISSILE;
    }

    /* renamed from: B */
    public final GlobalUpgradeType mo1812B() {
        return GlobalUpgradeType.TOWER_MISSILE_STARTING_EXPERIENCE;
    }

    /* renamed from: C */
    public final GlobalUpgradeType[] mo1813C() {
        return f8256O;
    }

    /* renamed from: D */
    public final GlobalUpgradeType[] mo1814D() {
        return f8257P;
    }

    /* renamed from: E */
    public final GlobalUpgradeType[] mo1815E() {
        return f8253L;
    }

    /* renamed from: F */
    public final GlobalUpgradeType[] mo1816F() {
        return f8254M;
    }

    /* renamed from: G */
    public final GlobalUpgradeType[] mo1817G() {
        return f8255N;
    }

    /* renamed from: a */
    public final float mo1818a(TowerStatType towerStatType, int i) {
        switch (towerStatType) {
            case U_EXPLOSION_RANGE:
                switch (i) {
                    case 1:
                        return 1.1f;
                    case 2:
                        return 1.25f;
                    case 3:
                        return 1.5f;
                }
                break;
            case U_LRM_AIM_TIME:
                break;
        }
        switch (i) {
            case 1:
                return 0.9f;
            case 2:
                return 0.8f;
            case 3:
                return 0.66f;
            default:
                break;
        }
        Game.game.logger.m7510b("MissileTower", "Can't calculate unique bonus for stat type: " + towerStatType);
        return 1.0f;
    }

    /* renamed from: a */
    public final int mo1819a(int i, int i2) {
        int intValue = ((Integer[]) f8264W.m2467a(f8262U[i]))[i2 - 1].intValue();
        float f = 1.0f;
        for (GlobalUpgradeType globalUpgradeType : f8258Q) {
            if (GlobalUpgrade.m7492a(globalUpgradeType)) {
                f = (100.0f - GlobalUpgrade.m7495c(globalUpgradeType).f6630u[0]) / 100.0f;
                break;
            }
        }
        return (int) (f * ((float) intValue));
    }

    /* renamed from: a */
    public final void mo1840a(C0507i c0507i) {
        super.mo1840a(c0507i);
        if (!(f8248G.f8648b == ((float) this.j.f) && f8248G.f8649c == ((float) this.j.g))) {
            f8248G.m8814a((float) this.j.f, (float) this.j.g);
            f8250I.m8814a((float) this.j.f, (float) this.j.g);
        }
        f8248G.m8816a(c0507i);
        f8250I.m8816a(c0507i);
    }

    /* renamed from: b */
    public final float mo1820b(TowerStatType towerStatType, int i, int[] iArr) {
        float f = 0.0f;
        int i2 = 0;
        int length;
        GlobalUpgradeType globalUpgradeType;
        if (TowerStat.m8484a(towerStatType).f8101d) {
            if (towerStatType == TowerStatType.U_EXPLOSION_RANGE) {
                float f2;
                for (GlobalUpgradeType globalUpgradeType2 : ((TowerStatConfig) f8259R.m2467a((Object) towerStatType)).f8001b) {
                    if (GlobalUpgrade.m7492a(globalUpgradeType2)) {
                        f2 = GlobalUpgrade.m7495c(globalUpgradeType2).f6630u[0];
                        break;
                    }
                }
                f2 = 0.0f;
                return ((((float) (i - 1)) / 19.0f) * 1.5f) + (f2 + 0.75f);
            } else if (towerStatType == TowerStatType.U_LRM_AIM_TIME) {
                for (GlobalUpgradeType globalUpgradeType22 : ((TowerStatConfig) f8259R.m2467a((Object) towerStatType)).f8001b) {
                    if (GlobalUpgrade.m7492a(globalUpgradeType22)) {
                        f = GlobalUpgrade.m7495c(globalUpgradeType22).f6630u[0];
                        break;
                    }
                }
                return 8.0f - ((6.0f - f) * (((float) (i - 1)) / 19.0f));
            } else {
                throw new RuntimeException("Tower type " + this.k.name() + " has no unique stat named " + towerStatType.name());
            }
        } else if (f8259R.m2474c((Object) towerStatType)) {
            TowerStatConfig towerStatConfig = (TowerStatConfig) f8259R.m2467a((Object) towerStatType);
            f = towerStatConfig.f8000a;
            GlobalUpgradeType[] globalUpgradeTypeArr = towerStatConfig.f8001b;
            length = globalUpgradeTypeArr.length;
            while (i2 < length) {
                globalUpgradeType22 = globalUpgradeTypeArr[i2];
                if (GlobalUpgrade.m7492a(globalUpgradeType22)) {
                    f = GlobalUpgrade.m7495c(globalUpgradeType22).f6630u[towerStatConfig.f8002c] + f;
                    break;
                }
                i2++;
            }
            if (!f8263V.m2474c((Object) towerStatType)) {
                return f;
            }
            i2 = iArr[((Integer) f8263V.m2467a((Object) towerStatType)).intValue()];
            return i2 != 0 ? f * ((Float[]) f8265X.m2467a((Object) towerStatType))[i2 - 1].floatValue() : f;
        } else {
            throw new RuntimeException("Tower type " + this.k.name() + " has no stat named " + towerStatType.name());
        }
    }

    /* renamed from: b */
    public final void mo1841b(C0507i c0507i) {
        super.mo1841b(c0507i);
        if (!(f8249H.f8648b == ((float) this.j.f) && f8251J.f8649c == ((float) this.j.g))) {
            f8249H.m8814a((float) this.j.f, (float) this.j.g);
            f8251J.m8814a((float) this.j.f, (float) this.j.g);
        }
        f8249H.m8816a(c0507i);
        f8251J.m8816a(c0507i);
    }

    /* renamed from: c */
    public final void mo1837c(int i) {
        if (Game.f6553g != null) {
            if (m8465h() != null) {
                this.f8267Y = Game.game.m7477t();
            } else if (!this.f8268Z && ((float) (Game.game.m7477t() - this.f8267Y)) / 1000000.0f > this.ag) {
                WalkableTile walkableTile = this.i.f6761e[FastBadRandom.m8807a(this.i.f6761e.length)];
                synchronized (walkableTile.f7984p) {
                    if (walkableTile.f7984p.f3187a != 0) {
                        int a = FastBadRandom.m8807a(walkableTile.f7984p.f3187a);
                        Iterator c = walkableTile.f7984p.m2489c();
                        int i2 = 0;
                        while (c.hasNext()) {
                            Enemy enemy = (Enemy) c.next();
                            if (i2 != a) {
                                i2++;
                            } else if (enemy.mo1755a(this.k)) {
                                this.aa = enemy;
                                this.f8268Z = true;
                                this.f8267Y = Game.game.m7477t();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo1821d(int i) {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            Enemy h = m8465h();
            if (h != null) {
                Vector2 a = h.f6912g.m7540a(h.f6907b, h.f6911f, (float) this.j.f, (float) this.j.g, h.mo1765e(), this.ae);
                float c = PMath.m8827c((float) this.j.f, (float) this.j.g, a.f2337x, a.f2338y);
                float a2 = PMath.m8819a(this.o, c);
                float f = (((float) i) / 1000000.0f) * this.ad;
                if (f >= Math.abs(a2)) {
                    this.o = c;
                } else if (a2 < 0.0f) {
                    this.o -= f;
                } else {
                    this.o += f;
                }
            } else if (this.f8268Z) {
                Enemy enemy = this.aa;
                if (this.i.m7529b(enemy)) {
                    Vector2 vector2 = new Vector2((float) this.j.f, (float) this.j.g);
                    Projectile l = MissileProjectile.m7767l();
                    l.m7770a(this, this.ab, vector2, enemy, this.ae, this.o, this.af);
                    gameScreen.m7847a(l);
                    this.y = Game.game.m7477t();
                    m8469l();
                }
            }
            this.f8268Z = false;
        }
    }

    /* renamed from: j */
    public final void mo1822j() {
        super.mo1822j();
        this.ab = m8442a(TowerStatType.DAMAGE);
        this.ac = m8442a(TowerStatType.ATTACK_SPEED);
        this.ad = m8442a(TowerStatType.ROTATION_SPEED);
        this.ae = m8442a(TowerStatType.PROJECTILE_SPEED);
        this.af = m8442a(TowerStatType.U_EXPLOSION_RANGE);
        this.ag = m8442a(TowerStatType.U_LRM_AIM_TIME);
        this.ah = (int) (1000000.0f / this.ac);
    }

    /* renamed from: k */
    public final void mo1838k() {
        this.h.f6559C.mo371a(this.x, (float) this.j.i, (float) this.j.k, 32.0f, 32.0f, 64.0f, 64.0f, 1.0f, 1.0f, this.o);
        long t = Game.game.m7477t() - this.y;
        long j = (long) this.ah;
        if (t > j / 2) {
            float f = ((float) (t - (j / 2))) / ((float) (j / 2));
            float f2 = f > 1.0f ? 1.0f : f;
            this.h.f6559C.mo371a(f8252K, ((float) this.j.f) - (5.0f * f2), ((float) this.j.g) - (10.0f * f2), 5.0f * f2, 10.0f * f2, 10.0f * f2, f2 * 20.0f, 1.0f, 1.0f, this.o);
        }
    }

    /* renamed from: n */
    public final String mo1823n() {
        return Game.f6551e.m2416a("tower_name_MISSILE");
    }

    /* renamed from: o */
    public final String mo1824o() {
        return Game.f6551e.m2416a("tower_description_MISSILE");
    }

    /* renamed from: p */
    public final C0430b mo1825p() {
        return PINK.f8581f;
    }

    /* renamed from: q */
    public final String mo1826q() {
        return Game.f6551e.m2416a("tower_unique_stat_description_MISSILE");
    }

    /* renamed from: r */
    public final C0710q<TowerStatType, TowerStatConfig> mo1827r() {
        return f8259R;
    }

    /* renamed from: s */
    public final Type mo1828s() {
        return Type.SHOT_MISSILE;
    }

    /* renamed from: t */
    public final int mo1829t() {
        return 250;
    }

    /* renamed from: u */
    public final TowerStatType[] mo1830u() {
        return f8261T;
    }

    /* renamed from: v */
    public final TowerUpgradeType[] mo1831v() {
        return f8262U;
    }

    /* renamed from: w */
    public final boolean mo1832w() {
        return true;
    }

    /* renamed from: x */
    public final boolean mo1833x() {
        Enemy h = m8465h();
        return h != null && PMath.m8826b(h.f6909d.f2337x, h.f6909d.f2338y, (float) this.j.f, (float) this.j.g) > this.aj;
    }

    /* renamed from: y */
    public final int mo1834y() {
        return this.ah;
    }

    /* renamed from: z */
    public final void mo1835z() {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            Enemy h = m8465h();
            if (this.i.m7529b(h)) {
                Vector2 vector2 = new Vector2((float) this.j.f, (float) this.j.g);
                Projectile l = MissileProjectile.m7767l();
                l.m7770a(this, this.ab, vector2, h, this.ae, this.o, this.af);
                gameScreen.m7847a(l);
                m8469l();
                synchronized (this.f8266F) {
                    if (this.f8266F.f3001b != 0) {
                        Iterator it = this.f8266F.iterator();
                        while (it.hasNext()) {
                            MissileProjectile missileProjectile = (MissileProjectile) it.next();
                            if (missileProjectile.f7058d == this && missileProjectile.f7059e == null) {
                                missileProjectile.f7059e = h;
                            }
                        }
                        this.f8266F.mo530d();
                    }
                }
                return;
            }
            Game.game.logger.log("MissileTower#attack", "Enemy is not valid");
        }
    }
}
