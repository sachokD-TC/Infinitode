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
import com.prineside.tdi.projectiles.types.BasicProjectile;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.TowerStat;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.towers.TowerUpgrade.TowerUpgradeType;
import com.prineside.tdi.utility.MaterialColor.TEAL;
import com.prineside.tdi.utility.PMath;

public class BasicTower extends Tower {
    /* renamed from: F */
    private static final GlobalUpgradeType[] f8146F = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BASIC_PRICE_V, GlobalUpgradeType.TOWER_BASIC_PRICE_IV, GlobalUpgradeType.TOWER_BASIC_PRICE_III, GlobalUpgradeType.TOWER_BASIC_PRICE_II, GlobalUpgradeType.TOWER_BASIC_PRICE_I};
    /* renamed from: G */
    private static final GlobalUpgradeType[] f8147G = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BASIC_MAX_TOWER_LEVEL_V, GlobalUpgradeType.TOWER_BASIC_MAX_TOWER_LEVEL_IV, GlobalUpgradeType.TOWER_BASIC_MAX_TOWER_LEVEL_III, GlobalUpgradeType.TOWER_BASIC_MAX_TOWER_LEVEL_II, GlobalUpgradeType.TOWER_BASIC_MAX_TOWER_LEVEL_I};
    /* renamed from: H */
    private static final GlobalUpgradeType[] f8148H = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BASIC_MAX_UPGRADE_LEVEL_III, GlobalUpgradeType.TOWER_BASIC_MAX_UPGRADE_LEVEL_II, GlobalUpgradeType.TOWER_BASIC_MAX_UPGRADE_LEVEL_I};
    /* renamed from: I */
    private static final GlobalUpgradeType[] f8149I = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BASIC_EXPERIENCE_BONUS_II, GlobalUpgradeType.TOWER_BASIC_EXPERIENCE_BONUS};
    /* renamed from: J */
    private static final GlobalUpgradeType[] f8150J = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BASIC_EXPERIENCE_GENERATION_II, GlobalUpgradeType.TOWER_BASIC_EXPERIENCE_GENERATION};
    /* renamed from: K */
    private static final GlobalUpgradeType[] f8151K = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BASIC_UPGRADE_PRICE_V, GlobalUpgradeType.TOWER_BASIC_UPGRADE_PRICE_IV, GlobalUpgradeType.TOWER_BASIC_UPGRADE_PRICE_III, GlobalUpgradeType.TOWER_BASIC_UPGRADE_PRICE_II, GlobalUpgradeType.TOWER_BASIC_UPGRADE_PRICE_I};
    /* renamed from: L */
    private static final C0710q<TowerStatType, TowerStatConfig> f8152L;
    /* renamed from: M */
    private static final TowerStatType[] f8153M = new TowerStatType[]{TowerStatType.RANGE, TowerStatType.DAMAGE, TowerStatType.ATTACK_SPEED, TowerStatType.ROTATION_SPEED, TowerStatType.PROJECTILE_SPEED, TowerStatType.U_DAMAGE_MULTIPLY};
    /* renamed from: N */
    private static final TowerUpgradeType[] f8154N = new TowerUpgradeType[]{TowerUpgradeType.RANGE, TowerUpgradeType.DAMAGE, TowerUpgradeType.ATTACK_SPEED, TowerUpgradeType.ROTATION_N_PROJECTILE_SPEED};
    /* renamed from: O */
    private static final C0710q<TowerStatType, Integer> f8155O;
    /* renamed from: P */
    private static final C0710q<TowerUpgradeType, Integer[]> f8156P;
    /* renamed from: Q */
    private static final C0710q<TowerStatType, Float[]> f8157Q;
    /* renamed from: R */
    private float f8158R;
    /* renamed from: S */
    private float f8159S;
    /* renamed from: T */
    private float f8160T;
    /* renamed from: U */
    private float f8161U;
    /* renamed from: V */
    private float f8162V;
    /* renamed from: W */
    private int f8163W;

    static {
        C0710q c0710q = new C0710q();
        f8152L = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new TowerStatConfig(2.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BASIC_RANGE_V, GlobalUpgradeType.TOWER_BASIC_RANGE_IV, GlobalUpgradeType.TOWER_BASIC_RANGE_III, GlobalUpgradeType.TOWER_BASIC_RANGE_II, GlobalUpgradeType.TOWER_BASIC_RANGE_I}));
        f8152L.mo542a(TowerStatType.DAMAGE, new TowerStatConfig(2.3f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BASIC_DAMAGE_V, GlobalUpgradeType.TOWER_BASIC_DAMAGE_IV, GlobalUpgradeType.TOWER_BASIC_DAMAGE_III, GlobalUpgradeType.TOWER_BASIC_DAMAGE_II, GlobalUpgradeType.TOWER_BASIC_DAMAGE_I}));
        f8152L.mo542a(TowerStatType.ATTACK_SPEED, new TowerStatConfig(1.1f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BASIC_ATTACK_SPEED_V, GlobalUpgradeType.TOWER_BASIC_ATTACK_SPEED_IV, GlobalUpgradeType.TOWER_BASIC_ATTACK_SPEED_III, GlobalUpgradeType.TOWER_BASIC_ATTACK_SPEED_II, GlobalUpgradeType.TOWER_BASIC_ATTACK_SPEED_I}));
        f8152L.mo542a(TowerStatType.PROJECTILE_SPEED, new TowerStatConfig(3.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BASIC_ROTATION_N_PROJECTILE_SPEED_V, GlobalUpgradeType.TOWER_BASIC_ROTATION_N_PROJECTILE_SPEED_IV, GlobalUpgradeType.TOWER_BASIC_ROTATION_N_PROJECTILE_SPEED_III, GlobalUpgradeType.TOWER_BASIC_ROTATION_N_PROJECTILE_SPEED_II, GlobalUpgradeType.TOWER_BASIC_ROTATION_N_PROJECTILE_SPEED_I}, 0));
        f8152L.mo542a(TowerStatType.ROTATION_SPEED, new TowerStatConfig(90.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BASIC_ROTATION_N_PROJECTILE_SPEED_V, GlobalUpgradeType.TOWER_BASIC_ROTATION_N_PROJECTILE_SPEED_IV, GlobalUpgradeType.TOWER_BASIC_ROTATION_N_PROJECTILE_SPEED_III, GlobalUpgradeType.TOWER_BASIC_ROTATION_N_PROJECTILE_SPEED_II, GlobalUpgradeType.TOWER_BASIC_ROTATION_N_PROJECTILE_SPEED_I}, 1));
        f8152L.mo542a(TowerStatType.U_DAMAGE_MULTIPLY, new TowerStatConfig(0.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BASIC_U_DAMAGE_MULTIPLIER_V, GlobalUpgradeType.TOWER_BASIC_U_DAMAGE_MULTIPLIER_IV, GlobalUpgradeType.TOWER_BASIC_U_DAMAGE_MULTIPLIER_III, GlobalUpgradeType.TOWER_BASIC_U_DAMAGE_MULTIPLIER_II, GlobalUpgradeType.TOWER_BASIC_U_DAMAGE_MULTIPLIER_I}));
        c0710q = new C0710q();
        f8155O = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, Integer.valueOf(0));
        f8155O.mo542a(TowerStatType.DAMAGE, Integer.valueOf(1));
        f8155O.mo542a(TowerStatType.ATTACK_SPEED, Integer.valueOf(2));
        f8155O.mo542a(TowerStatType.ROTATION_SPEED, Integer.valueOf(3));
        f8155O.mo542a(TowerStatType.PROJECTILE_SPEED, Integer.valueOf(3));
        c0710q = new C0710q();
        f8156P = c0710q;
        c0710q.mo542a(TowerUpgradeType.RANGE, new Integer[]{Integer.valueOf(13), Integer.valueOf(16), Integer.valueOf(20), Integer.valueOf(26), Integer.valueOf(34), Integer.valueOf(46), Integer.valueOf(64), Integer.valueOf(91), Integer.valueOf(133), Integer.valueOf(200)});
        f8156P.mo542a(TowerUpgradeType.DAMAGE, new Integer[]{Integer.valueOf(22), Integer.valueOf(29), Integer.valueOf(38), Integer.valueOf(50), Integer.valueOf(66), Integer.valueOf(87), Integer.valueOf(115), Integer.valueOf(152), Integer.valueOf(202), Integer.valueOf(269)});
        f8156P.mo542a(TowerUpgradeType.ATTACK_SPEED, new Integer[]{Integer.valueOf(10), Integer.valueOf(13), Integer.valueOf(17), Integer.valueOf(23), Integer.valueOf(31), Integer.valueOf(42), Integer.valueOf(57), Integer.valueOf(78), Integer.valueOf(108), Integer.valueOf(152)});
        f8156P.mo542a(TowerUpgradeType.ROTATION_N_PROJECTILE_SPEED, new Integer[]{Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(10), Integer.valueOf(12), Integer.valueOf(15), Integer.valueOf(19), Integer.valueOf(24), Integer.valueOf(30), Integer.valueOf(38), Integer.valueOf(48)});
        c0710q = new C0710q();
        f8157Q = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new Float[]{Float.valueOf(1.07f), Float.valueOf(1.155f), Float.valueOf(1.249f), Float.valueOf(1.353f), Float.valueOf(1.461f), Float.valueOf(1.571f), Float.valueOf(1.686f), Float.valueOf(1.808f), Float.valueOf(1.934f), Float.valueOf(2.069f)});
        f8157Q.mo542a(TowerStatType.DAMAGE, new Float[]{Float.valueOf(1.55f), Float.valueOf(2.056f), Float.valueOf(2.54f), Float.valueOf(3.002f), Float.valueOf(3.442f), Float.valueOf(3.86f), Float.valueOf(4.256f), Float.valueOf(4.63f), Float.valueOf(4.982f), Float.valueOf(5.312f)});
        f8157Q.mo542a(TowerStatType.ATTACK_SPEED, new Float[]{Float.valueOf(1.15f), Float.valueOf(1.318f), Float.valueOf(1.498f), Float.valueOf(1.693f), Float.valueOf(1.902f), Float.valueOf(2.122f), Float.valueOf(2.356f), Float.valueOf(2.579f), Float.valueOf(2.834f), Float.valueOf(3.074f)});
        f8157Q.mo542a(TowerStatType.ROTATION_SPEED, new Float[]{Float.valueOf(1.17f), Float.valueOf(1.384f), Float.valueOf(1.597f), Float.valueOf(1.815f), Float.valueOf(2.054f), Float.valueOf(2.307f), Float.valueOf(2.577f), Float.valueOf(2.924f), Float.valueOf(3.314f), Float.valueOf(3.71f)});
        f8157Q.mo542a(TowerStatType.PROJECTILE_SPEED, new Float[]{Float.valueOf(1.13f), Float.valueOf(1.291f), Float.valueOf(1.453f), Float.valueOf(1.656f), Float.valueOf(1.841f), Float.valueOf(2.082f), Float.valueOf(2.301f), Float.valueOf(2.578f), Float.valueOf(2.872f), Float.valueOf(3.195f)});
    }

    public BasicTower() {
        super(TowerType.BASIC);
    }

    /* renamed from: A */
    public final GlobalUpgradeType mo1811A() {
        return GlobalUpgradeType.TOWER_BASIC;
    }

    /* renamed from: B */
    public final GlobalUpgradeType mo1812B() {
        return GlobalUpgradeType.TOWER_BASIC_STARTING_EXPERIENCE;
    }

    /* renamed from: C */
    public final GlobalUpgradeType[] mo1813C() {
        return f8149I;
    }

    /* renamed from: D */
    public final GlobalUpgradeType[] mo1814D() {
        return f8150J;
    }

    /* renamed from: E */
    public final GlobalUpgradeType[] mo1815E() {
        return f8146F;
    }

    /* renamed from: F */
    public final GlobalUpgradeType[] mo1816F() {
        return f8147G;
    }

    /* renamed from: G */
    public final GlobalUpgradeType[] mo1817G() {
        return f8148H;
    }

    /* renamed from: a */
    public final float mo1818a(TowerStatType towerStatType, int i) {
        switch (towerStatType) {
            case U_DAMAGE_MULTIPLY:
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
        }
        Game.game.logger.m7510b("BasicTower", "Can't calculate unique bonus for stat type: " + towerStatType);
        return 1.0f;
    }

    /* renamed from: a */
    public final int mo1819a(int i, int i2) {
        int intValue = ((Integer[]) f8156P.m2467a(f8154N[i]))[i2 - 1].intValue();
        float f = 1.0f;
        for (GlobalUpgradeType globalUpgradeType : f8151K) {
            if (GlobalUpgrade.m7492a(globalUpgradeType)) {
                f = (100.0f - GlobalUpgrade.m7495c(globalUpgradeType).f6630u[0]) / 100.0f;
                break;
            }
        }
        return (int) (f * ((float) intValue));
    }

    /* renamed from: b */
    public final float mo1820b(TowerStatType towerStatType, int i, int[] iArr) {
        int i2 = 0;
        int length;
        GlobalUpgradeType globalUpgradeType;
        if (TowerStat.m8484a(towerStatType).f8101d) {
            if (towerStatType == TowerStatType.U_DAMAGE_MULTIPLY) {
                float f;
                for (GlobalUpgradeType globalUpgradeType2 : ((TowerStatConfig) f8152L.m2467a((Object) towerStatType)).f8001b) {
                    if (GlobalUpgrade.m7492a(globalUpgradeType2)) {
                        f = GlobalUpgrade.m7495c(globalUpgradeType2).f6630u[0];
                        break;
                    }
                }
                f = 0.0f;
                return 1.0f + ((f + 1.0f) * (((float) (i - 1)) / 19.0f));
            }
            throw new RuntimeException("Tower type " + this.k.name() + " has no unique stat named " + towerStatType.name());
        } else if (f8152L.m2474c((Object) towerStatType)) {
            TowerStatConfig towerStatConfig = (TowerStatConfig) f8152L.m2467a((Object) towerStatType);
            float f2 = towerStatConfig.f8000a;
            GlobalUpgradeType[] globalUpgradeTypeArr = towerStatConfig.f8001b;
            length = globalUpgradeTypeArr.length;
            while (i2 < length) {
                globalUpgradeType2 = globalUpgradeTypeArr[i2];
                if (GlobalUpgrade.m7492a(globalUpgradeType2)) {
                    f2 = GlobalUpgrade.m7495c(globalUpgradeType2).f6630u[towerStatConfig.f8002c] + f2;
                    break;
                }
                i2++;
            }
            if (!f8155O.m2474c((Object) towerStatType)) {
                return f2;
            }
            i2 = iArr[((Integer) f8155O.m2467a((Object) towerStatType)).intValue()];
            return i2 != 0 ? f2 * ((Float[]) f8157Q.m2467a((Object) towerStatType))[i2 - 1].floatValue() : f2;
        } else {
            throw new RuntimeException("Tower type " + this.k.name() + " has no stat named " + towerStatType.name());
        }
    }

    /* renamed from: d */
    public final void mo1821d(int i) {
        Enemy h = m8465h();
        if (h != null) {
            Vector2 a = h.f6912g.m7540a(h.f6907b, h.f6911f, (float) this.j.f, (float) this.j.g, h.mo1765e(), this.f8161U);
            float c = PMath.m8827c((float) this.j.f, (float) this.j.g, a.f2337x, a.f2338y);
            float a2 = PMath.m8819a(this.o, c);
            float f = (((float) i) / 1000000.0f) * this.f8160T;
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
        this.f8162V = m8444a(TowerStatType.U_DAMAGE_MULTIPLY, this.s, this.t);
        super.mo1822j();
        this.f8158R = m8442a(TowerStatType.DAMAGE) * this.f8162V;
        this.f8159S = m8442a(TowerStatType.ATTACK_SPEED);
        this.f8160T = m8442a(TowerStatType.ROTATION_SPEED);
        this.f8161U = m8442a(TowerStatType.PROJECTILE_SPEED);
        this.f8163W = (int) (1000000.0f / this.f8159S);
    }

    /* renamed from: n */
    public final String mo1823n() {
        return Game.f6551e.m2416a("tower_name_BASIC");
    }

    /* renamed from: o */
    public final String mo1824o() {
        return Game.f6551e.m2416a("tower_description_BASIC");
    }

    /* renamed from: p */
    public final C0430b mo1825p() {
        return TEAL.f8623f;
    }

    /* renamed from: q */
    public final String mo1826q() {
        return Game.f6551e.m2416a("tower_unique_stat_description_BASIC");
    }

    /* renamed from: r */
    public final C0710q<TowerStatType, TowerStatConfig> mo1827r() {
        return f8152L;
    }

    /* renamed from: s */
    public final Type mo1828s() {
        return Type.SHOT_BASIC;
    }

    /* renamed from: t */
    public final int mo1829t() {
        return 40;
    }

    /* renamed from: u */
    public final TowerStatType[] mo1830u() {
        return f8153M;
    }

    /* renamed from: v */
    public final TowerUpgradeType[] mo1831v() {
        return f8154N;
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
        Vector2 a = h.f6912g.m7540a(h.f6907b, h.f6911f, (float) this.j.f, (float) this.j.g, h.mo1765e(), this.f8161U);
        return Math.abs(PMath.m8819a(this.o, PMath.m8827c((float) this.j.f, (float) this.j.g, a.f2337x, a.f2338y))) < 3.0f;
    }

    /* renamed from: y */
    public final int mo1834y() {
        return this.f8163W;
    }

    /* renamed from: z */
    public final void mo1835z() {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            Enemy h = m8465h();
            if (this.i.m7529b(h)) {
                Vector2 d = PMath.m8828d((float) this.j.f, (float) this.j.g, this.o, 12.0f);
                Vector2 a = h.f6912g.m7540a(h.f6907b, h.f6911f, (float) this.j.f, (float) this.j.g, h.mo1765e(), this.f8161U);
                Projectile d2 = BasicProjectile.m7735d();
                d2.m7736a(this, h, this.f8158R, d, a, this.f8161U);
                gameScreen.m7847a(d2);
                m8469l();
            }
        }
    }
}
