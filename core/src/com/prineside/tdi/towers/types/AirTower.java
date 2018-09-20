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
import com.prineside.tdi.projectiles.types.AirProjectile;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.TowerStat;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.towers.TowerUpgrade.TowerUpgradeType;
import com.prineside.tdi.utility.MaterialColor.CYAN;
import com.prineside.tdi.utility.PMath;

public class AirTower extends Tower {
    /* renamed from: F */
    private static final GlobalUpgradeType[] f8124F = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_AIR_PRICE_V, GlobalUpgradeType.TOWER_AIR_PRICE_IV, GlobalUpgradeType.TOWER_AIR_PRICE_III, GlobalUpgradeType.TOWER_AIR_PRICE_II, GlobalUpgradeType.TOWER_AIR_PRICE_I};
    /* renamed from: G */
    private static final GlobalUpgradeType[] f8125G = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_AIR_MAX_TOWER_LEVEL_V, GlobalUpgradeType.TOWER_AIR_MAX_TOWER_LEVEL_IV, GlobalUpgradeType.TOWER_AIR_MAX_TOWER_LEVEL_III, GlobalUpgradeType.TOWER_AIR_MAX_TOWER_LEVEL_II, GlobalUpgradeType.TOWER_AIR_MAX_TOWER_LEVEL_I};
    /* renamed from: H */
    private static final GlobalUpgradeType[] f8126H = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_AIR_MAX_UPGRADE_LEVEL_III, GlobalUpgradeType.TOWER_AIR_MAX_UPGRADE_LEVEL_II, GlobalUpgradeType.TOWER_AIR_MAX_UPGRADE_LEVEL_I};
    /* renamed from: I */
    private static final GlobalUpgradeType[] f8127I = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_AIR_EXPERIENCE_BONUS_II, GlobalUpgradeType.TOWER_AIR_EXPERIENCE_BONUS};
    /* renamed from: J */
    private static final GlobalUpgradeType[] f8128J = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_AIR_EXPERIENCE_GENERATION_II, GlobalUpgradeType.TOWER_AIR_EXPERIENCE_GENERATION};
    /* renamed from: K */
    private static final GlobalUpgradeType[] f8129K = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_AIR_UPGRADE_PRICE_V, GlobalUpgradeType.TOWER_AIR_UPGRADE_PRICE_IV, GlobalUpgradeType.TOWER_AIR_UPGRADE_PRICE_III, GlobalUpgradeType.TOWER_AIR_UPGRADE_PRICE_II, GlobalUpgradeType.TOWER_AIR_UPGRADE_PRICE_I};
    /* renamed from: L */
    private static final C0710q<TowerStatType, TowerStatConfig> f8130L;
    /* renamed from: M */
    private static final TowerStatType[] f8131M = new TowerStatType[]{TowerStatType.RANGE, TowerStatType.DAMAGE, TowerStatType.ATTACK_SPEED, TowerStatType.ROTATION_SPEED, TowerStatType.PROJECTILE_SPEED, TowerStatType.U_BURN_CHANCE};
    /* renamed from: N */
    private static final TowerUpgradeType[] f8132N = new TowerUpgradeType[]{TowerUpgradeType.RANGE, TowerUpgradeType.DAMAGE, TowerUpgradeType.ATTACK_SPEED, TowerUpgradeType.ROTATION_N_PROJECTILE_SPEED};
    /* renamed from: O */
    private static final C0710q<TowerStatType, Integer> f8133O;
    /* renamed from: P */
    private static final C0710q<TowerUpgradeType, Integer[]> f8134P;
    /* renamed from: Q */
    private static final C0710q<TowerStatType, Float[]> f8135Q;
    /* renamed from: R */
    private float f8136R = 90.0f;
    /* renamed from: S */
    private Vector2 f8137S = new Vector2();
    /* renamed from: T */
    private Vector2 f8138T = new Vector2();
    /* renamed from: U */
    private float f8139U;
    /* renamed from: V */
    private float f8140V;
    /* renamed from: W */
    private float f8141W;
    /* renamed from: X */
    private float f8142X;
    /* renamed from: Y */
    private float f8143Y;
    /* renamed from: Z */
    private int f8144Z;

    static {
        C0710q c0710q = new C0710q();
        f8130L = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new TowerStatConfig(4.5f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_AIR_RANGE_V, GlobalUpgradeType.TOWER_AIR_RANGE_IV, GlobalUpgradeType.TOWER_AIR_RANGE_III, GlobalUpgradeType.TOWER_AIR_RANGE_II, GlobalUpgradeType.TOWER_AIR_RANGE_I}));
        f8130L.mo542a(TowerStatType.DAMAGE, new TowerStatConfig(6.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_AIR_DAMAGE_V, GlobalUpgradeType.TOWER_AIR_DAMAGE_IV, GlobalUpgradeType.TOWER_AIR_DAMAGE_III, GlobalUpgradeType.TOWER_AIR_DAMAGE_II, GlobalUpgradeType.TOWER_AIR_DAMAGE_I}));
        f8130L.mo542a(TowerStatType.ATTACK_SPEED, new TowerStatConfig(4.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_AIR_ATTACK_SPEED_V, GlobalUpgradeType.TOWER_AIR_ATTACK_SPEED_IV, GlobalUpgradeType.TOWER_AIR_ATTACK_SPEED_III, GlobalUpgradeType.TOWER_AIR_ATTACK_SPEED_II, GlobalUpgradeType.TOWER_AIR_ATTACK_SPEED_I}));
        f8130L.mo542a(TowerStatType.PROJECTILE_SPEED, new TowerStatConfig(3.2f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_AIR_ROTATION_N_PROJECTILE_SPEED_V, GlobalUpgradeType.TOWER_AIR_ROTATION_N_PROJECTILE_SPEED_IV, GlobalUpgradeType.TOWER_AIR_ROTATION_N_PROJECTILE_SPEED_III, GlobalUpgradeType.TOWER_AIR_ROTATION_N_PROJECTILE_SPEED_II, GlobalUpgradeType.TOWER_AIR_ROTATION_N_PROJECTILE_SPEED_I}, 0));
        f8130L.mo542a(TowerStatType.ROTATION_SPEED, new TowerStatConfig(60.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_AIR_ROTATION_N_PROJECTILE_SPEED_V, GlobalUpgradeType.TOWER_AIR_ROTATION_N_PROJECTILE_SPEED_IV, GlobalUpgradeType.TOWER_AIR_ROTATION_N_PROJECTILE_SPEED_III, GlobalUpgradeType.TOWER_AIR_ROTATION_N_PROJECTILE_SPEED_II, GlobalUpgradeType.TOWER_AIR_ROTATION_N_PROJECTILE_SPEED_I}, 1));
        f8130L.mo542a(TowerStatType.U_BURN_CHANCE, new TowerStatConfig(0.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_AIR_U_BURN_CHANCE_V, GlobalUpgradeType.TOWER_AIR_U_BURN_CHANCE_IV, GlobalUpgradeType.TOWER_AIR_U_BURN_CHANCE_III, GlobalUpgradeType.TOWER_AIR_U_BURN_CHANCE_II, GlobalUpgradeType.TOWER_AIR_U_BURN_CHANCE_I}));
        c0710q = new C0710q();
        f8133O = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, Integer.valueOf(0));
        f8133O.mo542a(TowerStatType.DAMAGE, Integer.valueOf(1));
        f8133O.mo542a(TowerStatType.ATTACK_SPEED, Integer.valueOf(2));
        f8133O.mo542a(TowerStatType.ROTATION_SPEED, Integer.valueOf(3));
        f8133O.mo542a(TowerStatType.PROJECTILE_SPEED, Integer.valueOf(3));
        c0710q = new C0710q();
        f8134P = c0710q;
        c0710q.mo542a(TowerUpgradeType.RANGE, new Integer[]{Integer.valueOf(42), Integer.valueOf(65), Integer.valueOf(103), Integer.valueOf(167), Integer.valueOf(278), Integer.valueOf(474), Integer.valueOf(829), Integer.valueOf(1486), Integer.valueOf(2729), Integer.valueOf(5131)});
        f8134P.mo542a(TowerUpgradeType.DAMAGE, new Integer[]{Integer.valueOf(67), Integer.valueOf(100), Integer.valueOf(153), Integer.valueOf(240), Integer.valueOf(386), Integer.valueOf(636), Integer.valueOf(1073), Integer.valueOf(1852), Integer.valueOf(3269), Integer.valueOf(5898)});
        f8134P.mo542a(TowerUpgradeType.ATTACK_SPEED, new Integer[]{Integer.valueOf(41), Integer.valueOf(59), Integer.valueOf(90), Integer.valueOf(142), Integer.valueOf(221), Integer.valueOf(367), Integer.valueOf(603), Integer.valueOf(1041), Integer.valueOf(1788), Integer.valueOf(3173)});
        f8134P.mo542a(TowerUpgradeType.ROTATION_N_PROJECTILE_SPEED, new Integer[]{Integer.valueOf(47), Integer.valueOf(71), Integer.valueOf(111), Integer.valueOf(181), Integer.valueOf(297), Integer.valueOf(511), Integer.valueOf(894), Integer.valueOf(1612), Integer.valueOf(2961), Integer.valueOf(5540)});
        c0710q = new C0710q();
        f8135Q = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new Float[]{Float.valueOf(1.09f), Float.valueOf(1.188f), Float.valueOf(1.292f), Float.valueOf(1.4f), Float.valueOf(1.513f), Float.valueOf(1.623f), Float.valueOf(1.729f), Float.valueOf(1.851f), Float.valueOf(1.965f), Float.valueOf(2.081f)});
        f8135Q.mo542a(TowerStatType.DAMAGE, new Float[]{Float.valueOf(1.85f), Float.valueOf(2.956f), Float.valueOf(4.1f), Float.valueOf(5.346f), Float.valueOf(6.658f), Float.valueOf(8.23f), Float.valueOf(9.913f), Float.valueOf(11.68f), Float.valueOf(13.7f), Float.valueOf(15.55f)});
        f8135Q.mo542a(TowerStatType.ATTACK_SPEED, new Float[]{Float.valueOf(1.104f), Float.valueOf(1.228f), Float.valueOf(1.373f), Float.valueOf(1.536f), Float.valueOf(1.69f), Float.valueOf(1.871f), Float.valueOf(2.068f), Float.valueOf(2.256f), Float.valueOf(2.461f), Float.valueOf(2.677f)});
        f8135Q.mo542a(TowerStatType.ROTATION_SPEED, new Float[]{Float.valueOf(1.13f), Float.valueOf(1.29f), Float.valueOf(1.485f), Float.valueOf(1.675f), Float.valueOf(1.892f), Float.valueOf(2.134f), Float.valueOf(2.404f), Float.valueOf(2.707f), Float.valueOf(2.955f), Float.valueOf(3.23f)});
        f8135Q.mo542a(TowerStatType.PROJECTILE_SPEED, new Float[]{Float.valueOf(1.13f), Float.valueOf(1.282f), Float.valueOf(1.451f), Float.valueOf(1.622f), Float.valueOf(1.825f), Float.valueOf(2.04f), Float.valueOf(2.27f), Float.valueOf(2.495f), Float.valueOf(2.772f), Float.valueOf(3.051f)});
    }

    public AirTower() {
        super(TowerType.AIR);
    }

    /* renamed from: A */
    public final GlobalUpgradeType mo1811A() {
        return GlobalUpgradeType.TOWER_AIR;
    }

    /* renamed from: B */
    public final GlobalUpgradeType mo1812B() {
        return GlobalUpgradeType.TOWER_AIR_STARTING_EXPERIENCE;
    }

    /* renamed from: C */
    public final GlobalUpgradeType[] mo1813C() {
        return f8127I;
    }

    /* renamed from: D */
    public final GlobalUpgradeType[] mo1814D() {
        return f8128J;
    }

    /* renamed from: E */
    public final GlobalUpgradeType[] mo1815E() {
        return f8124F;
    }

    /* renamed from: F */
    public final GlobalUpgradeType[] mo1816F() {
        return f8125G;
    }

    /* renamed from: G */
    public final GlobalUpgradeType[] mo1817G() {
        return f8126H;
    }

    /* renamed from: a */
    public final float mo1818a(TowerStatType towerStatType, int i) {
        switch (towerStatType) {
            case U_BURN_CHANCE:
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
        Game.game.logger.m7510b("AirTower", "Can't calculate unique bonus for stat type: " + towerStatType);
        return 1.0f;
    }

    /* renamed from: a */
    public final int mo1819a(int i, int i2) {
        int intValue = ((Integer[]) f8134P.m2467a(f8132N[i]))[i2 - 1].intValue();
        float f = 1.0f;
        for (GlobalUpgradeType globalUpgradeType : f8129K) {
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
            if (towerStatType == TowerStatType.U_BURN_CHANCE) {
                float f;
                for (GlobalUpgradeType globalUpgradeType2 : ((TowerStatConfig) f8130L.m2467a((Object) towerStatType)).f8001b) {
                    if (GlobalUpgrade.m7492a(globalUpgradeType2)) {
                        f = GlobalUpgrade.m7495c(globalUpgradeType2).f6630u[0];
                        break;
                    }
                }
                f = 0.0f;
                return ((((float) (i - 1)) / 19.0f) * 10.0f) + (f + 5.0f);
            }
            throw new RuntimeException("Tower type " + this.k.name() + " has no unique stat named " + towerStatType.name());
        } else if (f8130L.m2474c((Object) towerStatType)) {
            TowerStatConfig towerStatConfig = (TowerStatConfig) f8130L.m2467a((Object) towerStatType);
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
            if (!f8133O.m2474c((Object) towerStatType)) {
                return f2;
            }
            i2 = iArr[((Integer) f8133O.m2467a((Object) towerStatType)).intValue()];
            return i2 != 0 ? f2 * ((Float[]) f8135Q.m2467a((Object) towerStatType))[i2 - 1].floatValue() : f2;
        } else {
            throw new RuntimeException("Tower type " + this.k.name() + " has no stat named " + towerStatType.name());
        }
    }

    /* renamed from: d */
    public final void mo1821d(int i) {
        Enemy h = m8465h();
        if (h != null) {
            Vector2 a = h.f6912g.m7540a(h.f6907b, h.f6911f, (float) this.j.f, (float) this.j.g, h.mo1765e(), this.f8139U);
            float c = PMath.m8827c((float) this.j.f, (float) this.j.g, a.f2337x, a.f2338y);
            float a2 = PMath.m8819a(this.o, c);
            float f = (((float) i) / 1000000.0f) * this.f8143Y;
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
        this.f8140V = m8442a(TowerStatType.DAMAGE);
        this.f8139U = m8442a(TowerStatType.PROJECTILE_SPEED);
        this.f8141W = m8442a(TowerStatType.U_BURN_CHANCE) * 0.01f;
        this.f8142X = m8442a(TowerStatType.ATTACK_SPEED);
        this.f8143Y = m8442a(TowerStatType.ROTATION_SPEED);
        this.f8144Z = (int) (1000000.0f / this.f8142X);
    }

    /* renamed from: n */
    public final String mo1823n() {
        return Game.f6551e.m2416a("tower_name_AIR");
    }

    /* renamed from: o */
    public final String mo1824o() {
        return Game.f6551e.m2416a("tower_description_AIR");
    }

    /* renamed from: p */
    public final C0430b mo1825p() {
        return CYAN.f8445f;
    }

    /* renamed from: q */
    public final String mo1826q() {
        return Game.f6551e.m2416a("tower_unique_stat_description_AIR");
    }

    /* renamed from: r */
    public final C0710q<TowerStatType, TowerStatConfig> mo1827r() {
        return f8130L;
    }

    /* renamed from: s */
    public final Type mo1828s() {
        return Type.SHOT_AIR;
    }

    /* renamed from: t */
    public final int mo1829t() {
        return 60;
    }

    /* renamed from: u */
    public final TowerStatType[] mo1830u() {
        return f8131M;
    }

    /* renamed from: v */
    public final TowerUpgradeType[] mo1831v() {
        return f8132N;
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
        Vector2 a = h.f6912g.m7540a(h.f6907b, h.f6911f, (float) this.j.f, (float) this.j.g, h.mo1765e(), this.f8139U);
        return Math.abs(PMath.m8819a(this.o, PMath.m8827c((float) this.j.f, (float) this.j.g, a.f2337x, a.f2338y))) < 3.0f;
    }

    /* renamed from: y */
    public final int mo1834y() {
        return this.f8144Z;
    }

    /* renamed from: z */
    public final void mo1835z() {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            Enemy h = m8465h();
            if (this.i.m7529b(h)) {
                this.f8136R = -this.f8136R;
                this.f8137S.f2337x = (float) this.j.f;
                this.f8137S.f2338y = (float) this.j.g;
                PMath.m8823a(this.f8137S, this.o, 18.0f);
                PMath.m8823a(this.f8137S, this.o + this.f8136R, 3.0f);
                this.f8138T = h.f6912g.m7540a(h.f6907b, h.f6911f, (float) this.j.f, (float) this.j.g, h.mo1765e(), this.f8139U);
                Projectile d = AirProjectile.m7728d();
                d.m7729a(this, h, this.f8140V, this.f8137S, this.f8138T, this.f8139U, this.f8141W);
                gameScreen.m7847a(d);
                m8469l();
            }
        }
    }
}
