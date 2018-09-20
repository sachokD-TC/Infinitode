package com.prineside.tdi.towers.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.C0710q;
import com.prineside.tdi.Game;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgradeType;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.projectiles.Projectile;
import com.prineside.tdi.projectiles.types.MultishotProjectile;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.TowerStat;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.towers.TowerUpgrade.TowerUpgradeType;
import com.prineside.tdi.utility.FastBadRandom;
import com.prineside.tdi.utility.MaterialColor.YELLOW;
import com.prineside.tdi.utility.PMath;

public class MultishotTower extends Tower {
    /* renamed from: F */
    private static final GlobalUpgradeType[] f8270F = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MULTISHOT_PRICE_V, GlobalUpgradeType.TOWER_MULTISHOT_PRICE_IV, GlobalUpgradeType.TOWER_MULTISHOT_PRICE_III, GlobalUpgradeType.TOWER_MULTISHOT_PRICE_II, GlobalUpgradeType.TOWER_MULTISHOT_PRICE_I};
    /* renamed from: G */
    private static final GlobalUpgradeType[] f8271G = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MULTISHOT_MAX_TOWER_LEVEL_V, GlobalUpgradeType.TOWER_MULTISHOT_MAX_TOWER_LEVEL_IV, GlobalUpgradeType.TOWER_MULTISHOT_MAX_TOWER_LEVEL_III, GlobalUpgradeType.TOWER_MULTISHOT_MAX_TOWER_LEVEL_II, GlobalUpgradeType.TOWER_MULTISHOT_MAX_TOWER_LEVEL_I};
    /* renamed from: H */
    private static final GlobalUpgradeType[] f8272H = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MULTISHOT_MAX_UPGRADE_LEVEL_III, GlobalUpgradeType.TOWER_MULTISHOT_MAX_UPGRADE_LEVEL_II, GlobalUpgradeType.TOWER_MULTISHOT_MAX_UPGRADE_LEVEL_I};
    /* renamed from: I */
    private static final GlobalUpgradeType[] f8273I = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MULTISHOT_EXPERIENCE_BONUS_II, GlobalUpgradeType.TOWER_MULTISHOT_EXPERIENCE_BONUS};
    /* renamed from: J */
    private static final GlobalUpgradeType[] f8274J = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MULTISHOT_EXPERIENCE_GENERATION_II, GlobalUpgradeType.TOWER_MULTISHOT_EXPERIENCE_GENERATION};
    /* renamed from: K */
    private static final GlobalUpgradeType[] f8275K = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MULTISHOT_UPGRADE_PRICE_V, GlobalUpgradeType.TOWER_MULTISHOT_UPGRADE_PRICE_IV, GlobalUpgradeType.TOWER_MULTISHOT_UPGRADE_PRICE_III, GlobalUpgradeType.TOWER_MULTISHOT_UPGRADE_PRICE_II, GlobalUpgradeType.TOWER_MULTISHOT_UPGRADE_PRICE_I};
    /* renamed from: L */
    private static final C0710q<TowerStatType, TowerStatConfig> f8276L;
    /* renamed from: M */
    private static final TowerStatType[] f8277M = new TowerStatType[]{TowerStatType.RANGE, TowerStatType.DAMAGE, TowerStatType.ATTACK_SPEED, TowerStatType.ROTATION_SPEED, TowerStatType.PROJECTILE_SPEED, TowerStatType.U_SHOOT_ANGLE, TowerStatType.U_PROJECTILE_COUNT};
    /* renamed from: N */
    private static final TowerUpgradeType[] f8278N = new TowerUpgradeType[]{TowerUpgradeType.RANGE, TowerUpgradeType.DAMAGE, TowerUpgradeType.ATTACK_SPEED, TowerUpgradeType.ROTATION_N_PROJECTILE_SPEED};
    /* renamed from: O */
    private static final C0710q<TowerStatType, Integer> f8279O;
    /* renamed from: P */
    private static final C0710q<TowerUpgradeType, Integer[]> f8280P;
    /* renamed from: Q */
    private static final C0710q<TowerStatType, Float[]> f8281Q;
    /* renamed from: R */
    private float f8282R;
    /* renamed from: S */
    private float f8283S;
    /* renamed from: T */
    private float f8284T;
    /* renamed from: U */
    private float f8285U;
    /* renamed from: V */
    private float f8286V;
    /* renamed from: W */
    private float f8287W;
    /* renamed from: X */
    private int f8288X;

    static {
        C0710q c0710q = new C0710q();
        f8276L = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new TowerStatConfig(2.5f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MULTISHOT_RANGE_V, GlobalUpgradeType.TOWER_MULTISHOT_RANGE_IV, GlobalUpgradeType.TOWER_MULTISHOT_RANGE_III, GlobalUpgradeType.TOWER_MULTISHOT_RANGE_II, GlobalUpgradeType.TOWER_MULTISHOT_RANGE_I}));
        f8276L.mo542a(TowerStatType.DAMAGE, new TowerStatConfig(1.55f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MULTISHOT_DAMAGE_V, GlobalUpgradeType.TOWER_MULTISHOT_DAMAGE_IV, GlobalUpgradeType.TOWER_MULTISHOT_DAMAGE_III, GlobalUpgradeType.TOWER_MULTISHOT_DAMAGE_II, GlobalUpgradeType.TOWER_MULTISHOT_DAMAGE_I}));
        f8276L.mo542a(TowerStatType.ATTACK_SPEED, new TowerStatConfig(1.1f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MULTISHOT_ATTACK_SPEED_V, GlobalUpgradeType.TOWER_MULTISHOT_ATTACK_SPEED_IV, GlobalUpgradeType.TOWER_MULTISHOT_ATTACK_SPEED_III, GlobalUpgradeType.TOWER_MULTISHOT_ATTACK_SPEED_II, GlobalUpgradeType.TOWER_MULTISHOT_ATTACK_SPEED_I}));
        f8276L.mo542a(TowerStatType.PROJECTILE_SPEED, new TowerStatConfig(3.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MULTISHOT_ROTATION_N_PROJECTILE_SPEED_V, GlobalUpgradeType.TOWER_MULTISHOT_ROTATION_N_PROJECTILE_SPEED_IV, GlobalUpgradeType.TOWER_MULTISHOT_ROTATION_N_PROJECTILE_SPEED_III, GlobalUpgradeType.TOWER_MULTISHOT_ROTATION_N_PROJECTILE_SPEED_II, GlobalUpgradeType.TOWER_MULTISHOT_ROTATION_N_PROJECTILE_SPEED_I}, 0));
        f8276L.mo542a(TowerStatType.ROTATION_SPEED, new TowerStatConfig(75.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MULTISHOT_ROTATION_N_PROJECTILE_SPEED_V, GlobalUpgradeType.TOWER_MULTISHOT_ROTATION_N_PROJECTILE_SPEED_IV, GlobalUpgradeType.TOWER_MULTISHOT_ROTATION_N_PROJECTILE_SPEED_III, GlobalUpgradeType.TOWER_MULTISHOT_ROTATION_N_PROJECTILE_SPEED_II, GlobalUpgradeType.TOWER_MULTISHOT_ROTATION_N_PROJECTILE_SPEED_I}, 1));
        f8276L.mo542a(TowerStatType.U_PROJECTILE_COUNT, new TowerStatConfig(0.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MULTISHOT_U_PROJECTILE_COUNT_V, GlobalUpgradeType.TOWER_MULTISHOT_U_PROJECTILE_COUNT_IV, GlobalUpgradeType.TOWER_MULTISHOT_U_PROJECTILE_COUNT_III, GlobalUpgradeType.TOWER_MULTISHOT_U_PROJECTILE_COUNT_II, GlobalUpgradeType.TOWER_MULTISHOT_U_PROJECTILE_COUNT_I}));
        f8276L.mo542a(TowerStatType.U_SHOOT_ANGLE, new TowerStatConfig(0.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MULTISHOT_U_SHOT_ANGLE_V, GlobalUpgradeType.TOWER_MULTISHOT_U_SHOT_ANGLE_IV, GlobalUpgradeType.TOWER_MULTISHOT_U_SHOT_ANGLE_III, GlobalUpgradeType.TOWER_MULTISHOT_U_SHOT_ANGLE_II, GlobalUpgradeType.TOWER_MULTISHOT_U_SHOT_ANGLE_I}));
        c0710q = new C0710q();
        f8279O = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, Integer.valueOf(0));
        f8279O.mo542a(TowerStatType.DAMAGE, Integer.valueOf(1));
        f8279O.mo542a(TowerStatType.ATTACK_SPEED, Integer.valueOf(2));
        f8279O.mo542a(TowerStatType.ROTATION_SPEED, Integer.valueOf(3));
        f8279O.mo542a(TowerStatType.PROJECTILE_SPEED, Integer.valueOf(3));
        c0710q = new C0710q();
        f8280P = c0710q;
        c0710q.mo542a(TowerUpgradeType.RANGE, new Integer[]{Integer.valueOf(58), Integer.valueOf(85), Integer.valueOf(127), Integer.valueOf(194), Integer.valueOf(302), Integer.valueOf(481), Integer.valueOf(782), Integer.valueOf(1299), Integer.valueOf(2202), Integer.valueOf(3810)});
        f8280P.mo542a(TowerUpgradeType.DAMAGE, new Integer[]{Integer.valueOf(77), Integer.valueOf(111), Integer.valueOf(162), Integer.valueOf(240), Integer.valueOf(362), Integer.valueOf(554), Integer.valueOf(862), Integer.valueOf(1362), Integer.valueOf(2187), Integer.valueOf(3565)});
        f8280P.mo542a(TowerUpgradeType.ATTACK_SPEED, new Integer[]{Integer.valueOf(29), Integer.valueOf(41), Integer.valueOf(60), Integer.valueOf(87), Integer.valueOf(126), Integer.valueOf(185), Integer.valueOf(269), Integer.valueOf(401), Integer.valueOf(608), Integer.valueOf(929)});
        f8280P.mo542a(TowerUpgradeType.ROTATION_N_PROJECTILE_SPEED, new Integer[]{Integer.valueOf(53), Integer.valueOf(75), Integer.valueOf(111), Integer.valueOf(168), Integer.valueOf(261), Integer.valueOf(428), Integer.valueOf(716), Integer.valueOf(1211), Integer.valueOf(2127), Integer.valueOf(3842)});
        c0710q = new C0710q();
        f8281Q = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new Float[]{Float.valueOf(1.155f), Float.valueOf(1.313f), Float.valueOf(1.479f), Float.valueOf(1.661f), Float.valueOf(1.852f), Float.valueOf(2.047f), Float.valueOf(2.252f), Float.valueOf(2.467f), Float.valueOf(2.688f), Float.valueOf(2.918f)});
        f8281Q.mo542a(TowerStatType.DAMAGE, new Float[]{Float.valueOf(1.91f), Float.valueOf(3.012f), Float.valueOf(4.215f), Float.valueOf(5.543f), Float.valueOf(6.859f), Float.valueOf(8.286f), Float.valueOf(9.908f), Float.valueOf(11.61f), Float.valueOf(13.41f), Float.valueOf(15.33f)});
        f8281Q.mo542a(TowerStatType.ATTACK_SPEED, new Float[]{Float.valueOf(1.157f), Float.valueOf(1.327f), Float.valueOf(1.502f), Float.valueOf(1.692f), Float.valueOf(1.888f), Float.valueOf(2.08f), Float.valueOf(2.303f), Float.valueOf(2.524f), Float.valueOf(2.732f), Float.valueOf(2.975f)});
        f8281Q.mo542a(TowerStatType.ROTATION_SPEED, new Float[]{Float.valueOf(1.155f), Float.valueOf(1.346f), Float.valueOf(1.537f), Float.valueOf(1.747f), Float.valueOf(1.979f), Float.valueOf(2.246f), Float.valueOf(2.507f), Float.valueOf(2.805f), Float.valueOf(3.123f), Float.valueOf(3.44f)});
        f8281Q.mo542a(TowerStatType.PROJECTILE_SPEED, new Float[]{Float.valueOf(1.145f), Float.valueOf(1.315f), Float.valueOf(1.505f), Float.valueOf(1.703f), Float.valueOf(1.936f), Float.valueOf(2.16f), Float.valueOf(2.394f), Float.valueOf(2.628f), Float.valueOf(2.879f), Float.valueOf(3.174f)});
    }

    public MultishotTower() {
        super(TowerType.MULTISHOT);
    }

    /* renamed from: A */
    public final GlobalUpgradeType mo1811A() {
        return GlobalUpgradeType.TOWER_MULTISHOT;
    }

    /* renamed from: B */
    public final GlobalUpgradeType mo1812B() {
        return GlobalUpgradeType.TOWER_MULTISHOT_STARTING_EXPERIENCE;
    }

    /* renamed from: C */
    public final GlobalUpgradeType[] mo1813C() {
        return f8273I;
    }

    /* renamed from: D */
    public final GlobalUpgradeType[] mo1814D() {
        return f8274J;
    }

    /* renamed from: E */
    public final GlobalUpgradeType[] mo1815E() {
        return f8270F;
    }

    /* renamed from: F */
    public final GlobalUpgradeType[] mo1816F() {
        return f8271G;
    }

    /* renamed from: G */
    public final GlobalUpgradeType[] mo1817G() {
        return f8272H;
    }

    /* renamed from: a */
    public final float mo1818a(TowerStatType towerStatType, int i) {
        switch (towerStatType) {
            case U_SHOOT_ANGLE:
                switch (i) {
                    case 1:
                        return 1.1f;
                    case 2:
                        return 1.25f;
                    case 3:
                        return 1.5f;
                }
                break;
            case U_PROJECTILE_COUNT:
                break;
        }
        switch (i) {
            case 1:
                return 1.1f;
            case 2:
                return 1.25f;
            case 3:
                return 1.5f;
            default:
                break;
        }
        Game.game.logger.m7510b("MultishotTower", "Can't calculate unique bonus for stat type: " + towerStatType);
        return 1.0f;
    }

    /* renamed from: a */
    public final int mo1819a(int i, int i2) {
        int intValue = ((Integer[]) f8280P.m2467a(f8278N[i]))[i2 - 1].intValue();
        float f = 1.0f;
        for (GlobalUpgradeType globalUpgradeType : f8275K) {
            if (GlobalUpgrade.m7492a(globalUpgradeType)) {
                f = (100.0f - GlobalUpgrade.m7495c(globalUpgradeType).f6630u[0]) / 100.0f;
                break;
            }
        }
        return (int) (f * ((float) intValue));
    }

    /* renamed from: b */
    public final float mo1820b(TowerStatType towerStatType, int i, int[] iArr) {
        float f = 0.0f;
        int i2 = 0;
        int length;
        GlobalUpgradeType globalUpgradeType;
        if (TowerStat.m8484a(towerStatType).f8101d) {
            if (towerStatType == TowerStatType.U_PROJECTILE_COUNT) {
                float f2;
                for (GlobalUpgradeType globalUpgradeType2 : ((TowerStatConfig) f8276L.m2467a((Object) towerStatType)).f8001b) {
                    if (GlobalUpgrade.m7492a(globalUpgradeType2)) {
                        f2 = GlobalUpgrade.m7495c(globalUpgradeType2).f6630u[0];
                        break;
                    }
                }
                f2 = 0.0f;
                return 4.0f + ((f2 + 8.0f) * (((float) (i - 1)) / 19.0f));
            } else if (towerStatType == TowerStatType.U_SHOOT_ANGLE) {
                for (GlobalUpgradeType globalUpgradeType22 : ((TowerStatConfig) f8276L.m2467a((Object) towerStatType)).f8001b) {
                    if (GlobalUpgrade.m7492a(globalUpgradeType22)) {
                        f = GlobalUpgrade.m7495c(globalUpgradeType22).f6630u[0];
                        break;
                    }
                }
                return ((f + 50.0f) * (((float) (i - 1)) / 19.0f)) + 25.0f;
            } else {
                throw new RuntimeException("Tower type " + this.k.name() + " has no unique stat named " + towerStatType.name());
            }
        } else if (f8276L.m2474c((Object) towerStatType)) {
            TowerStatConfig towerStatConfig = (TowerStatConfig) f8276L.m2467a((Object) towerStatType);
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
            if (!f8279O.m2474c((Object) towerStatType)) {
                return f;
            }
            i2 = iArr[((Integer) f8279O.m2467a((Object) towerStatType)).intValue()];
            return i2 != 0 ? f * ((Float[]) f8281Q.m2467a((Object) towerStatType))[i2 - 1].floatValue() : f;
        } else {
            throw new RuntimeException("Tower type " + this.k.name() + " has no stat named " + towerStatType.name());
        }
    }

    /* renamed from: d */
    public final void mo1821d(int i) {
        Enemy h = m8465h();
        if (h != null) {
            Vector2 a = h.f6912g.m7540a(h.f6907b, h.f6911f, (float) this.j.f, (float) this.j.g, h.mo1765e(), this.f8285U);
            float c = PMath.m8827c((float) this.j.f, (float) this.j.g, a.f2337x, a.f2338y);
            float a2 = PMath.m8819a(this.o, c);
            float f = (((float) i) / 1000000.0f) * this.f8284T;
            if (f >= Math.abs(a2)) {
                this.o = c;
            } else if (a2 < 0.0f) {
                this.o -= f;
            } else {
                this.o += f;
            }
        }
    }

    /* renamed from: j */
    public final void mo1822j() {
        super.mo1822j();
        this.f8282R = m8442a(TowerStatType.DAMAGE);
        this.f8283S = m8442a(TowerStatType.ATTACK_SPEED);
        this.f8284T = m8442a(TowerStatType.ROTATION_SPEED);
        this.f8285U = m8442a(TowerStatType.PROJECTILE_SPEED);
        this.f8286V = m8442a(TowerStatType.U_SHOOT_ANGLE);
        this.f8287W = m8442a(TowerStatType.U_PROJECTILE_COUNT);
        this.f8288X = (int) (1000000.0f / this.f8283S);
    }

    /* renamed from: n */
    public final String mo1823n() {
        return Game.f6551e.m2416a("tower_name_MULTISHOT");
    }

    /* renamed from: o */
    public final String mo1824o() {
        return Game.f6551e.m2416a("tower_description_MULTISHOT");
    }

    /* renamed from: p */
    public final C0430b mo1825p() {
        return YELLOW.f8637f;
    }

    /* renamed from: q */
    public final String mo1826q() {
        return Game.f6551e.m2416a("tower_unique_stat_description_MULTISHOT");
    }

    /* renamed from: r */
    public final C0710q<TowerStatType, TowerStatConfig> mo1827r() {
        return f8276L;
    }

    /* renamed from: s */
    public final Type mo1828s() {
        return Type.SHOT_BASIC;
    }

    /* renamed from: t */
    public final int mo1829t() {
        return 90;
    }

    /* renamed from: u */
    public final TowerStatType[] mo1830u() {
        return f8277M;
    }

    /* renamed from: v */
    public final TowerUpgradeType[] mo1831v() {
        return f8278N;
    }

    /* renamed from: w */
    public final boolean mo1832w() {
        return true;
    }

    /* renamed from: x */
    public final boolean mo1833x() {
        Enemy h = m8465h();
        if (h == null) {
            return false;
        }
        Vector2 a = h.f6912g.m7540a(h.f6907b, h.f6911f, (float) this.j.f, (float) this.j.g, h.mo1765e(), this.f8285U);
        return Math.abs(PMath.m8819a(this.o, PMath.m8827c((float) this.j.f, (float) this.j.g, a.f2337x, a.f2338y))) < 3.0f + (this.f8286V / 2.0f);
    }

    /* renamed from: y */
    public final int mo1834y() {
        return this.f8288X;
    }

    /* renamed from: z */
    public final void mo1835z() {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            if (this.i.m7529b(m8465h())) {
                int i = (int) this.f8287W;
                int i2 = (this.f8287W % 1.0f == 0.0f || FastBadRandom.m8809b() >= this.f8287W % 1.0f) ? i : i + 1;
                float f = this.f8286V / this.f8287W;
                int i3 = 0;
                float f2 = this.o - (this.f8286V / 2.0f);
                while (i3 < i2) {
                    Vector2 d = PMath.m8828d((float) this.j.f, (float) this.j.g, f2, 12.0f);
                    Vector2 d2 = PMath.m8828d((float) this.j.f, (float) this.j.g, f2, this.z);
                    Projectile n = MultishotProjectile.m7782n();
                    n.m7784a(this, this.f8282R, d, d2, this.f8285U);
                    gameScreen.m7847a(n);
                    i3++;
                    f2 += f;
                }
                m8469l();
            }
        }
    }
}
