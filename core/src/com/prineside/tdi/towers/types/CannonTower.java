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
import com.prineside.tdi.projectiles.types.CannonProjectile;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.TowerStat;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.towers.TowerUpgrade.TowerUpgradeType;
import com.prineside.tdi.utility.MaterialColor.RED;
import com.prineside.tdi.utility.PMath;

public class CannonTower extends Tower {
    /* renamed from: F */
    private static final GlobalUpgradeType[] f8187F = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_CANNON_PRICE_V, GlobalUpgradeType.TOWER_CANNON_PRICE_IV, GlobalUpgradeType.TOWER_CANNON_PRICE_III, GlobalUpgradeType.TOWER_CANNON_PRICE_II, GlobalUpgradeType.TOWER_CANNON_PRICE_I};
    /* renamed from: G */
    private static final GlobalUpgradeType[] f8188G = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_CANNON_MAX_TOWER_LEVEL_V, GlobalUpgradeType.TOWER_CANNON_MAX_TOWER_LEVEL_IV, GlobalUpgradeType.TOWER_CANNON_MAX_TOWER_LEVEL_III, GlobalUpgradeType.TOWER_CANNON_MAX_TOWER_LEVEL_II, GlobalUpgradeType.TOWER_CANNON_MAX_TOWER_LEVEL_I};
    /* renamed from: H */
    private static final GlobalUpgradeType[] f8189H = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_CANNON_MAX_UPGRADE_LEVEL_III, GlobalUpgradeType.TOWER_CANNON_MAX_UPGRADE_LEVEL_II, GlobalUpgradeType.TOWER_CANNON_MAX_UPGRADE_LEVEL_I};
    /* renamed from: I */
    private static final GlobalUpgradeType[] f8190I = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_CANNON_EXPERIENCE_BONUS_II, GlobalUpgradeType.TOWER_CANNON_EXPERIENCE_BONUS};
    /* renamed from: J */
    private static final GlobalUpgradeType[] f8191J = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_CANNON_EXPERIENCE_GENERATION_II, GlobalUpgradeType.TOWER_CANNON_EXPERIENCE_GENERATION};
    /* renamed from: K */
    private static final GlobalUpgradeType[] f8192K = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_CANNON_UPGRADE_PRICE_V, GlobalUpgradeType.TOWER_CANNON_UPGRADE_PRICE_IV, GlobalUpgradeType.TOWER_CANNON_UPGRADE_PRICE_III, GlobalUpgradeType.TOWER_CANNON_UPGRADE_PRICE_II, GlobalUpgradeType.TOWER_CANNON_UPGRADE_PRICE_I};
    /* renamed from: L */
    private static final C0710q<TowerStatType, TowerStatConfig> f8193L;
    /* renamed from: M */
    private static final TowerStatType[] f8194M = new TowerStatType[]{TowerStatType.RANGE, TowerStatType.DAMAGE, TowerStatType.ATTACK_SPEED, TowerStatType.ROTATION_SPEED, TowerStatType.PROJECTILE_SPEED, TowerStatType.U_EXPLOSION_RANGE};
    /* renamed from: N */
    private static final TowerUpgradeType[] f8195N = new TowerUpgradeType[]{TowerUpgradeType.RANGE, TowerUpgradeType.DAMAGE, TowerUpgradeType.ATTACK_SPEED, TowerUpgradeType.ROTATION_N_PROJECTILE_SPEED};
    /* renamed from: O */
    private static final C0710q<TowerStatType, Integer> f8196O;
    /* renamed from: P */
    private static final C0710q<TowerUpgradeType, Integer[]> f8197P;
    /* renamed from: Q */
    private static final C0710q<TowerStatType, Float[]> f8198Q;
    /* renamed from: R */
    private float f8199R;
    /* renamed from: S */
    private float f8200S;
    /* renamed from: T */
    private float f8201T;
    /* renamed from: U */
    private float f8202U;
    /* renamed from: V */
    private float f8203V;
    /* renamed from: W */
    private int f8204W;

    static {
        C0710q c0710q = new C0710q();
        f8193L = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new TowerStatConfig(1.75f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_CANNON_RANGE_V, GlobalUpgradeType.TOWER_CANNON_RANGE_IV, GlobalUpgradeType.TOWER_CANNON_RANGE_III, GlobalUpgradeType.TOWER_CANNON_RANGE_II, GlobalUpgradeType.TOWER_CANNON_RANGE_I}));
        f8193L.mo542a(TowerStatType.DAMAGE, new TowerStatConfig(3.1f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_CANNON_DAMAGE_V, GlobalUpgradeType.TOWER_CANNON_DAMAGE_IV, GlobalUpgradeType.TOWER_CANNON_DAMAGE_III, GlobalUpgradeType.TOWER_CANNON_DAMAGE_II, GlobalUpgradeType.TOWER_CANNON_DAMAGE_I}));
        f8193L.mo542a(TowerStatType.ATTACK_SPEED, new TowerStatConfig(0.65f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_CANNON_ATTACK_SPEED_V, GlobalUpgradeType.TOWER_CANNON_ATTACK_SPEED_IV, GlobalUpgradeType.TOWER_CANNON_ATTACK_SPEED_III, GlobalUpgradeType.TOWER_CANNON_ATTACK_SPEED_II, GlobalUpgradeType.TOWER_CANNON_ATTACK_SPEED_I}));
        f8193L.mo542a(TowerStatType.PROJECTILE_SPEED, new TowerStatConfig(2.2f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_CANNON_ROTATION_N_PROJECTILE_SPEED_V, GlobalUpgradeType.TOWER_CANNON_ROTATION_N_PROJECTILE_SPEED_IV, GlobalUpgradeType.TOWER_CANNON_ROTATION_N_PROJECTILE_SPEED_III, GlobalUpgradeType.TOWER_CANNON_ROTATION_N_PROJECTILE_SPEED_II, GlobalUpgradeType.TOWER_CANNON_ROTATION_N_PROJECTILE_SPEED_I}, 0));
        f8193L.mo542a(TowerStatType.ROTATION_SPEED, new TowerStatConfig(60.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_CANNON_ROTATION_N_PROJECTILE_SPEED_V, GlobalUpgradeType.TOWER_CANNON_ROTATION_N_PROJECTILE_SPEED_IV, GlobalUpgradeType.TOWER_CANNON_ROTATION_N_PROJECTILE_SPEED_III, GlobalUpgradeType.TOWER_CANNON_ROTATION_N_PROJECTILE_SPEED_II, GlobalUpgradeType.TOWER_CANNON_ROTATION_N_PROJECTILE_SPEED_I}, 1));
        f8193L.mo542a(TowerStatType.U_EXPLOSION_RANGE, new TowerStatConfig(0.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_CANNON_U_PROJECTILE_EXPLOSION_RANGE_V, GlobalUpgradeType.TOWER_CANNON_U_PROJECTILE_EXPLOSION_RANGE_IV, GlobalUpgradeType.TOWER_CANNON_U_PROJECTILE_EXPLOSION_RANGE_III, GlobalUpgradeType.TOWER_CANNON_U_PROJECTILE_EXPLOSION_RANGE_II, GlobalUpgradeType.TOWER_CANNON_U_PROJECTILE_EXPLOSION_RANGE_I}));
        c0710q = new C0710q();
        f8196O = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, Integer.valueOf(0));
        f8196O.mo542a(TowerStatType.DAMAGE, Integer.valueOf(1));
        f8196O.mo542a(TowerStatType.ATTACK_SPEED, Integer.valueOf(2));
        f8196O.mo542a(TowerStatType.ROTATION_SPEED, Integer.valueOf(3));
        f8196O.mo542a(TowerStatType.PROJECTILE_SPEED, Integer.valueOf(3));
        c0710q = new C0710q();
        f8197P = c0710q;
        c0710q.mo542a(TowerUpgradeType.RANGE, new Integer[]{Integer.valueOf(42), Integer.valueOf(64), Integer.valueOf(99), Integer.valueOf(157), Integer.valueOf(255), Integer.valueOf(423), Integer.valueOf(717), Integer.valueOf(1243), Integer.valueOf(2202), Integer.valueOf(3984)});
        f8197P.mo542a(TowerUpgradeType.DAMAGE, new Integer[]{Integer.valueOf(53), Integer.valueOf(81), Integer.valueOf(128), Integer.valueOf(209), Integer.valueOf(353), Integer.valueOf(615), Integer.valueOf(1104), Integer.valueOf(2043), Integer.valueOf(3892), Integer.valueOf(7629)});
        f8197P.mo542a(TowerUpgradeType.ATTACK_SPEED, new Integer[]{Integer.valueOf(24), Integer.valueOf(36), Integer.valueOf(54), Integer.valueOf(82), Integer.valueOf(128), Integer.valueOf(210), Integer.valueOf(341), Integer.valueOf(583), Integer.valueOf(1021), Integer.valueOf(1841)});
        f8197P.mo542a(TowerUpgradeType.ROTATION_N_PROJECTILE_SPEED, new Integer[]{Integer.valueOf(39), Integer.valueOf(57), Integer.valueOf(84), Integer.valueOf(127), Integer.valueOf(194), Integer.valueOf(314), Integer.valueOf(522), Integer.valueOf(872), Integer.valueOf(1513), Integer.valueOf(2685)});
        c0710q = new C0710q();
        f8198Q = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new Float[]{Float.valueOf(1.13f), Float.valueOf(1.278f), Float.valueOf(1.423f), Float.valueOf(1.579f), Float.valueOf(1.733f), Float.valueOf(1.9f), Float.valueOf(2.066f), Float.valueOf(2.242f), Float.valueOf(2.421f), Float.valueOf(2.599f)});
        f8198Q.mo542a(TowerStatType.DAMAGE, new Float[]{Float.valueOf(1.88f), Float.valueOf(2.951f), Float.valueOf(4.15f), Float.valueOf(5.386f), Float.valueOf(6.867f), Float.valueOf(8.407f), Float.valueOf(10.16f), Float.valueOf(11.77f), Float.valueOf(13.53f), Float.valueOf(15.37f)});
        f8198Q.mo542a(TowerStatType.ATTACK_SPEED, new Float[]{Float.valueOf(1.22f), Float.valueOf(1.441f), Float.valueOf(1.673f), Float.valueOf(1.914f), Float.valueOf(2.17f), Float.valueOf(2.437f), Float.valueOf(2.718f), Float.valueOf(2.989f), Float.valueOf(3.295f), Float.valueOf(3.594f)});
        f8198Q.mo542a(TowerStatType.ROTATION_SPEED, new Float[]{Float.valueOf(1.18f), Float.valueOf(1.387f), Float.valueOf(1.609f), Float.valueOf(1.841f), Float.valueOf(2.1f), Float.valueOf(2.366f), Float.valueOf(2.658f), Float.valueOf(3.001f), Float.valueOf(3.328f), Float.valueOf(3.674f)});
        f8198Q.mo542a(TowerStatType.PROJECTILE_SPEED, new Float[]{Float.valueOf(1.147f), Float.valueOf(1.3f), Float.valueOf(1.464f), Float.valueOf(1.644f), Float.valueOf(1.852f), Float.valueOf(2.088f), Float.valueOf(2.323f), Float.valueOf(2.578f), Float.valueOf(2.829f), Float.valueOf(3.141f)});
    }

    public CannonTower() {
        super(TowerType.CANNON);
    }

    /* renamed from: A */
    public final GlobalUpgradeType mo1811A() {
        return GlobalUpgradeType.TOWER_CANNON;
    }

    /* renamed from: B */
    public final GlobalUpgradeType mo1812B() {
        return GlobalUpgradeType.TOWER_CANNON_STARTING_EXPERIENCE;
    }

    /* renamed from: C */
    public final GlobalUpgradeType[] mo1813C() {
        return f8190I;
    }

    /* renamed from: D */
    public final GlobalUpgradeType[] mo1814D() {
        return f8191J;
    }

    /* renamed from: E */
    public final GlobalUpgradeType[] mo1815E() {
        return f8187F;
    }

    /* renamed from: F */
    public final GlobalUpgradeType[] mo1816F() {
        return f8188G;
    }

    /* renamed from: G */
    public final GlobalUpgradeType[] mo1817G() {
        return f8189H;
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
                    default:
                        break;
                }
        }
        Game.game.logger.m7510b("CannonTower", "Can't calculate unique bonus for stat type: " + towerStatType);
        return 1.0f;
    }

    /* renamed from: a */
    public final int mo1819a(int i, int i2) {
        int intValue = ((Integer[]) f8197P.m2467a(f8195N[i]))[i2 - 1].intValue();
        float f = 1.0f;
        for (GlobalUpgradeType globalUpgradeType : f8192K) {
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
            if (towerStatType == TowerStatType.U_EXPLOSION_RANGE) {
                float f;
                for (GlobalUpgradeType globalUpgradeType2 : ((TowerStatConfig) f8193L.m2467a((Object) towerStatType)).f8001b) {
                    if (GlobalUpgrade.m7492a(globalUpgradeType2)) {
                        f = GlobalUpgrade.m7495c(globalUpgradeType2).f6630u[0];
                        break;
                    }
                }
                f = 0.0f;
                return (0.66f + f) + ((f + 1.1f) * (((float) (i - 1)) / 19.0f));
            }
            throw new RuntimeException("Tower type " + this.k.name() + " has no unique stat named " + towerStatType.name());
        } else if (f8193L.m2474c((Object) towerStatType)) {
            TowerStatConfig towerStatConfig = (TowerStatConfig) f8193L.m2467a((Object) towerStatType);
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
            if (!f8196O.m2474c((Object) towerStatType)) {
                return f2;
            }
            i2 = iArr[((Integer) f8196O.m2467a((Object) towerStatType)).intValue()];
            return i2 != 0 ? f2 * ((Float[]) f8198Q.m2467a((Object) towerStatType))[i2 - 1].floatValue() : f2;
        } else {
            throw new RuntimeException("Tower type " + this.k.name() + " has no stat named " + towerStatType.name());
        }
    }

    /* renamed from: d */
    public final void mo1821d(int i) {
        Enemy h = m8465h();
        if (h != null) {
            Vector2 a = h.f6912g.m7540a(h.f6907b, h.f6911f, (float) this.j.f, (float) this.j.g, h.mo1765e(), this.f8202U);
            float c = PMath.m8827c((float) this.j.f, (float) this.j.g, a.f2337x, a.f2338y);
            float a2 = PMath.m8819a(this.o, c);
            float f = (((float) i) / 1000000.0f) * this.f8201T;
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
        this.f8199R = m8442a(TowerStatType.DAMAGE);
        this.f8200S = m8442a(TowerStatType.ATTACK_SPEED);
        this.f8201T = m8442a(TowerStatType.ROTATION_SPEED);
        this.f8202U = m8442a(TowerStatType.PROJECTILE_SPEED);
        this.f8203V = m8442a(TowerStatType.U_EXPLOSION_RANGE);
        this.f8204W = (int) (1000000.0f / this.f8200S);
    }

    /* renamed from: n */
    public final String mo1823n() {
        return Game.f6551e.m2416a("tower_name_CANNON");
    }

    /* renamed from: o */
    public final String mo1824o() {
        return Game.f6551e.m2416a("tower_description_CANNON");
    }

    /* renamed from: p */
    public final C0430b mo1825p() {
        return RED.f8609f;
    }

    /* renamed from: q */
    public final String mo1826q() {
        return Game.f6551e.m2416a("tower_unique_stat_description_CANNON");
    }

    /* renamed from: r */
    public final C0710q<TowerStatType, TowerStatConfig> mo1827r() {
        return f8193L;
    }

    /* renamed from: s */
    public final Type mo1828s() {
        return Type.SHOT_CANNON;
    }

    /* renamed from: t */
    public final int mo1829t() {
        return 60;
    }

    /* renamed from: u */
    public final TowerStatType[] mo1830u() {
        return f8194M;
    }

    /* renamed from: v */
    public final TowerUpgradeType[] mo1831v() {
        return f8195N;
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
        Vector2 a = h.f6912g.m7540a(h.f6907b, h.f6911f, (float) this.j.f, (float) this.j.g, h.mo1765e(), this.f8202U);
        return Math.abs(PMath.m8819a(this.o, PMath.m8827c((float) this.j.f, (float) this.j.g, a.f2337x, a.f2338y))) < 5.0f;
    }

    /* renamed from: y */
    public final int mo1834y() {
        return this.f8204W;
    }

    /* renamed from: z */
    public final void mo1835z() {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            Enemy h = m8465h();
            if (this.i.m7529b(h)) {
                Vector2 d = PMath.m8828d((float) this.j.f, (float) this.j.g, this.o, 12.0f);
                Vector2 a = h.f6912g.m7540a(h.f6907b, h.f6911f, (float) this.j.f, (float) this.j.g, h.mo1765e(), this.f8202U);
                Projectile d2 = CannonProjectile.m7742d();
                d2.m7743a(this, this.f8199R, this.f8203V, d, a, this.f8202U);
                gameScreen.m7847a(d2);
                m8469l();
            }
        }
    }
}
