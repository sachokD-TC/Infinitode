package com.prineside.tdi.towers.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.C0710q;
import com.prineside.tdi.Game;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgradeType;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.enemies.effects.PoisonEffect;
import com.prineside.tdi.projectiles.Projectile;
import com.prineside.tdi.projectiles.types.VenomProjectile;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.TowerStat;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.towers.TowerUpgrade.TowerUpgradeType;
import com.prineside.tdi.utility.MaterialColor.LIGHT_GREEN;
import com.prineside.tdi.utility.PMath;

public class VenomTower extends Tower {
    /* renamed from: F */
    private static final GlobalUpgradeType[] f8353F = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_VENOM_PRICE_V, GlobalUpgradeType.TOWER_VENOM_PRICE_IV, GlobalUpgradeType.TOWER_VENOM_PRICE_III, GlobalUpgradeType.TOWER_VENOM_PRICE_II, GlobalUpgradeType.TOWER_VENOM_PRICE_I};
    /* renamed from: G */
    private static final GlobalUpgradeType[] f8354G = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_VENOM_MAX_TOWER_LEVEL_V, GlobalUpgradeType.TOWER_VENOM_MAX_TOWER_LEVEL_IV, GlobalUpgradeType.TOWER_VENOM_MAX_TOWER_LEVEL_III, GlobalUpgradeType.TOWER_VENOM_MAX_TOWER_LEVEL_II, GlobalUpgradeType.TOWER_VENOM_MAX_TOWER_LEVEL_I};
    /* renamed from: H */
    private static final GlobalUpgradeType[] f8355H = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_VENOM_MAX_UPGRADE_LEVEL_III, GlobalUpgradeType.TOWER_VENOM_MAX_UPGRADE_LEVEL_II, GlobalUpgradeType.TOWER_VENOM_MAX_UPGRADE_LEVEL_I};
    /* renamed from: I */
    private static final GlobalUpgradeType[] f8356I = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_VENOM_EXPERIENCE_BONUS_II, GlobalUpgradeType.TOWER_VENOM_EXPERIENCE_BONUS};
    /* renamed from: J */
    private static final GlobalUpgradeType[] f8357J = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_VENOM_EXPERIENCE_GENERATION_II, GlobalUpgradeType.TOWER_VENOM_EXPERIENCE_GENERATION};
    /* renamed from: K */
    private static final GlobalUpgradeType[] f8358K = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_VENOM_UPGRADE_PRICE_V, GlobalUpgradeType.TOWER_VENOM_UPGRADE_PRICE_IV, GlobalUpgradeType.TOWER_VENOM_UPGRADE_PRICE_III, GlobalUpgradeType.TOWER_VENOM_UPGRADE_PRICE_II, GlobalUpgradeType.TOWER_VENOM_UPGRADE_PRICE_I};
    /* renamed from: L */
    private static final C0710q<TowerStatType, TowerStatConfig> f8359L;
    /* renamed from: M */
    private static final TowerStatType[] f8360M = new TowerStatType[]{TowerStatType.RANGE, TowerStatType.POISON_DAMAGE, TowerStatType.ATTACK_SPEED, TowerStatType.ROTATION_SPEED, TowerStatType.PROJECTILE_SPEED, TowerStatType.U_POISON_DURATION};
    /* renamed from: N */
    private static final TowerUpgradeType[] f8361N = new TowerUpgradeType[]{TowerUpgradeType.RANGE, TowerUpgradeType.POISON_DAMAGE, TowerUpgradeType.ATTACK_SPEED, TowerUpgradeType.ROTATION_N_PROJECTILE_SPEED};
    /* renamed from: O */
    private static final C0710q<TowerStatType, Integer> f8362O;
    /* renamed from: P */
    private static final C0710q<TowerUpgradeType, Integer[]> f8363P;
    /* renamed from: Q */
    private static final C0710q<TowerStatType, Float[]> f8364Q;
    /* renamed from: R */
    private PoisonEffect f8365R;
    /* renamed from: S */
    private boolean f8366S;
    /* renamed from: T */
    private float f8367T;
    /* renamed from: U */
    private float f8368U;
    /* renamed from: V */
    private float f8369V;
    /* renamed from: W */
    private int f8370W;

    static {
        C0710q c0710q = new C0710q();
        f8359L = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new TowerStatConfig(2.1f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_VENOM_RANGE_V, GlobalUpgradeType.TOWER_VENOM_RANGE_IV, GlobalUpgradeType.TOWER_VENOM_RANGE_III, GlobalUpgradeType.TOWER_VENOM_RANGE_II, GlobalUpgradeType.TOWER_VENOM_RANGE_I}));
        f8359L.mo542a(TowerStatType.POISON_DAMAGE, new TowerStatConfig(1.8f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_VENOM_POISON_DAMAGE_V, GlobalUpgradeType.TOWER_VENOM_POISON_DAMAGE_IV, GlobalUpgradeType.TOWER_VENOM_POISON_DAMAGE_III, GlobalUpgradeType.TOWER_VENOM_POISON_DAMAGE_II, GlobalUpgradeType.TOWER_VENOM_POISON_DAMAGE_I}));
        f8359L.mo542a(TowerStatType.ATTACK_SPEED, new TowerStatConfig(0.85f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_VENOM_ATTACK_SPEED_V, GlobalUpgradeType.TOWER_VENOM_ATTACK_SPEED_IV, GlobalUpgradeType.TOWER_VENOM_ATTACK_SPEED_III, GlobalUpgradeType.TOWER_VENOM_ATTACK_SPEED_II, GlobalUpgradeType.TOWER_VENOM_ATTACK_SPEED_I}));
        f8359L.mo542a(TowerStatType.PROJECTILE_SPEED, new TowerStatConfig(3.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_VENOM_ROTATION_N_PROJECTILE_SPEED_V, GlobalUpgradeType.TOWER_VENOM_ROTATION_N_PROJECTILE_SPEED_IV, GlobalUpgradeType.TOWER_VENOM_ROTATION_N_PROJECTILE_SPEED_III, GlobalUpgradeType.TOWER_VENOM_ROTATION_N_PROJECTILE_SPEED_II, GlobalUpgradeType.TOWER_VENOM_ROTATION_N_PROJECTILE_SPEED_I}, 0));
        f8359L.mo542a(TowerStatType.ROTATION_SPEED, new TowerStatConfig(90.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_VENOM_ROTATION_N_PROJECTILE_SPEED_V, GlobalUpgradeType.TOWER_VENOM_ROTATION_N_PROJECTILE_SPEED_IV, GlobalUpgradeType.TOWER_VENOM_ROTATION_N_PROJECTILE_SPEED_III, GlobalUpgradeType.TOWER_VENOM_ROTATION_N_PROJECTILE_SPEED_II, GlobalUpgradeType.TOWER_VENOM_ROTATION_N_PROJECTILE_SPEED_I}, 1));
        f8359L.mo542a(TowerStatType.U_POISON_DURATION, new TowerStatConfig(0.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_VENOM_U_POISON_DURATION_V, GlobalUpgradeType.TOWER_VENOM_U_POISON_DURATION_IV, GlobalUpgradeType.TOWER_VENOM_U_POISON_DURATION_III, GlobalUpgradeType.TOWER_VENOM_U_POISON_DURATION_II, GlobalUpgradeType.TOWER_VENOM_U_POISON_DURATION_I}));
        c0710q = new C0710q();
        f8362O = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, Integer.valueOf(0));
        f8362O.mo542a(TowerStatType.POISON_DAMAGE, Integer.valueOf(1));
        f8362O.mo542a(TowerStatType.ATTACK_SPEED, Integer.valueOf(2));
        f8362O.mo542a(TowerStatType.ROTATION_SPEED, Integer.valueOf(3));
        f8362O.mo542a(TowerStatType.PROJECTILE_SPEED, Integer.valueOf(3));
        c0710q = new C0710q();
        f8363P = c0710q;
        c0710q.mo542a(TowerUpgradeType.RANGE, new Integer[]{Integer.valueOf(84), Integer.valueOf(127), Integer.valueOf(196), Integer.valueOf(309), Integer.valueOf(498), Integer.valueOf(820), Integer.valueOf(1380), Integer.valueOf(2371), Integer.valueOf(4159), Integer.valueOf(7445)});
        f8363P.mo542a(TowerUpgradeType.POISON_DAMAGE, new Integer[]{Integer.valueOf(134), Integer.valueOf(185), Integer.valueOf(261), Integer.valueOf(376), Integer.valueOf(553), Integer.valueOf(830), Integer.valueOf(1270), Integer.valueOf(1982), Integer.valueOf(3152), Integer.valueOf(5107)});
        f8363P.mo542a(TowerUpgradeType.ATTACK_SPEED, new Integer[]{Integer.valueOf(49), Integer.valueOf(65), Integer.valueOf(89), Integer.valueOf(122), Integer.valueOf(170), Integer.valueOf(247), Integer.valueOf(352), Integer.valueOf(514), Integer.valueOf(754), Integer.valueOf(1146)});
        f8363P.mo542a(TowerUpgradeType.ROTATION_N_PROJECTILE_SPEED, new Integer[]{Integer.valueOf(78), Integer.valueOf(114), Integer.valueOf(168), Integer.valueOf(261), Integer.valueOf(409), Integer.valueOf(651), Integer.valueOf(1097), Integer.valueOf(1900), Integer.valueOf(3303), Integer.valueOf(5980)});
        c0710q = new C0710q();
        f8364Q = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new Float[]{Float.valueOf(1.13f), Float.valueOf(1.28f), Float.valueOf(1.431f), Float.valueOf(1.596f), Float.valueOf(1.762f), Float.valueOf(1.932f), Float.valueOf(2.121f), Float.valueOf(2.311f), Float.valueOf(2.505f), Float.valueOf(2.706f)});
        f8364Q.mo542a(TowerStatType.POISON_DAMAGE, new Float[]{Float.valueOf(2.04f), Float.valueOf(3.088f), Float.valueOf(4.261f), Float.valueOf(5.405f), Float.valueOf(6.556f), Float.valueOf(7.748f), Float.valueOf(9.185f), Float.valueOf(10.45f), Float.valueOf(11.76f), Float.valueOf(13.23f)});
        f8364Q.mo542a(TowerStatType.ATTACK_SPEED, new Float[]{Float.valueOf(1.16f), Float.valueOf(1.343f), Float.valueOf(1.541f), Float.valueOf(1.744f), Float.valueOf(1.958f), Float.valueOf(2.191f), Float.valueOf(2.416f), Float.valueOf(2.666f), Float.valueOf(2.914f), Float.valueOf(3.153f)});
        f8364Q.mo542a(TowerStatType.ROTATION_SPEED, new Float[]{Float.valueOf(1.18f), Float.valueOf(1.384f), Float.valueOf(1.609f), Float.valueOf(1.854f), Float.valueOf(2.111f), Float.valueOf(2.404f), Float.valueOf(2.729f), Float.valueOf(3.062f), Float.valueOf(3.422f), Float.valueOf(3.808f)});
        f8364Q.mo542a(TowerStatType.PROJECTILE_SPEED, new Float[]{Float.valueOf(1.134f), Float.valueOf(1.281f), Float.valueOf(1.455f), Float.valueOf(1.647f), Float.valueOf(1.836f), Float.valueOf(2.028f), Float.valueOf(2.261f), Float.valueOf(2.493f), Float.valueOf(2.735f), Float.valueOf(3.006f)});
    }

    public VenomTower() {
        super(TowerType.VENOM);
    }

    /* renamed from: A */
    public final GlobalUpgradeType mo1811A() {
        return GlobalUpgradeType.TOWER_VENOM;
    }

    /* renamed from: B */
    public final GlobalUpgradeType mo1812B() {
        return GlobalUpgradeType.TOWER_VENOM_STARTING_EXPERIENCE;
    }

    /* renamed from: C */
    public final GlobalUpgradeType[] mo1813C() {
        return f8356I;
    }

    /* renamed from: D */
    public final GlobalUpgradeType[] mo1814D() {
        return f8357J;
    }

    /* renamed from: E */
    public final GlobalUpgradeType[] mo1815E() {
        return f8353F;
    }

    /* renamed from: F */
    public final GlobalUpgradeType[] mo1816F() {
        return f8354G;
    }

    /* renamed from: G */
    public final GlobalUpgradeType[] mo1817G() {
        return f8355H;
    }

    /* renamed from: a */
    public final float mo1818a(TowerStatType towerStatType, int i) {
        switch (towerStatType) {
            case U_POISON_DURATION:
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
        Game.game.logger.m7510b("VenomTower", "Can't calculate unique bonus for stat type: " + towerStatType);
        return 1.0f;
    }

    /* renamed from: a */
    public final int mo1819a(int i, int i2) {
        int intValue = ((Integer[]) f8363P.m2467a(f8361N[i]))[i2 - 1].intValue();
        float f = 1.0f;
        for (GlobalUpgradeType globalUpgradeType : f8358K) {
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
            if (towerStatType == TowerStatType.U_POISON_DURATION) {
                float f;
                for (GlobalUpgradeType globalUpgradeType2 : ((TowerStatConfig) f8359L.m2467a((Object) towerStatType)).f8001b) {
                    if (GlobalUpgrade.m7492a(globalUpgradeType2)) {
                        f = GlobalUpgrade.m7495c(globalUpgradeType2).f6630u[0];
                        break;
                    }
                }
                f = 0.0f;
                return 5.0f + ((f + 10.0f) * (((float) (i - 1)) / 19.0f));
            }
            throw new RuntimeException("Tower type " + this.k.name() + " has no unique stat named " + towerStatType.name());
        } else if (f8359L.m2474c((Object) towerStatType)) {
            TowerStatConfig towerStatConfig = (TowerStatConfig) f8359L.m2467a((Object) towerStatType);
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
            if (!f8362O.m2474c((Object) towerStatType)) {
                return f2;
            }
            i2 = iArr[((Integer) f8362O.m2467a((Object) towerStatType)).intValue()];
            return i2 != 0 ? f2 * ((Float[]) f8364Q.m2467a((Object) towerStatType))[i2 - 1].floatValue() : f2;
        } else {
            throw new RuntimeException("Tower type " + this.k.name() + " has no stat named " + towerStatType.name());
        }
    }

    /* renamed from: b */
    protected final boolean mo1842b(Enemy enemy) {
        return enemy.f6926u == 0.0f;
    }

    /* renamed from: d */
    public final void mo1821d(int i) {
        Enemy h = m8465h();
        if (h != null) {
            Vector2 a = h.f6912g.m7540a(h.f6907b, h.f6911f, (float) this.j.f, (float) this.j.g, h.mo1765e(), this.f8369V);
            float c = PMath.m8827c((float) this.j.f, (float) this.j.g, a.f2337x, a.f2338y);
            float a2 = PMath.m8819a(this.o, c);
            float f = (((float) i) / 1000000.0f) * this.f8368U;
            if (f >= Math.abs(a2)) {
                this.o = c;
            } else if (a2 < 0.0f) {
                this.o -= f;
            } else {
                this.o += f;
            }
        }
    }

    /* renamed from: i */
    protected final Enemy mo1843i() {
        Enemy i = super.mo1843i();
        if (i != null) {
            this.f8366S = i.f6926u != 0.0f;
        }
        return i;
    }

    /* renamed from: j */
    public final void mo1822j() {
        super.mo1822j();
        this.f8367T = m8442a(TowerStatType.ATTACK_SPEED);
        this.f8368U = m8442a(TowerStatType.ROTATION_SPEED);
        this.f8369V = m8442a(TowerStatType.PROJECTILE_SPEED);
        if (this.f8365R == null) {
            this.f8365R = new PoisonEffect();
            this.f8365R.f6941a = this;
        }
        this.f8365R.f6943c = m8442a(TowerStatType.U_POISON_DURATION);
        this.f8365R.f6942b = m8442a(TowerStatType.POISON_DAMAGE);
        this.f8370W = (int) (1000000.0f / this.f8367T);
    }

    /* renamed from: n */
    public final String mo1823n() {
        return Game.f6551e.m2416a("tower_name_VENOM");
    }

    /* renamed from: o */
    public final String mo1824o() {
        return Game.f6551e.m2416a("tower_description_VENOM");
    }

    /* renamed from: p */
    public final C0430b mo1825p() {
        return LIGHT_GREEN.f8539f;
    }

    /* renamed from: q */
    public final String mo1826q() {
        return Game.f6551e.m2416a("tower_unique_stat_description_VENOM");
    }

    /* renamed from: r */
    public final C0710q<TowerStatType, TowerStatConfig> mo1827r() {
        return f8359L;
    }

    /* renamed from: s */
    public final Type mo1828s() {
        return Type.SHOT_BASIC;
    }

    /* renamed from: t */
    public final int mo1829t() {
        return 120;
    }

    /* renamed from: u */
    public final TowerStatType[] mo1830u() {
        return f8360M;
    }

    /* renamed from: v */
    public final TowerUpgradeType[] mo1831v() {
        return f8361N;
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
        Vector2 a = h.f6912g.m7540a(h.f6907b, h.f6911f, (float) this.j.f, (float) this.j.g, h.mo1765e(), this.f8369V);
        return Math.abs(PMath.m8819a(this.o, PMath.m8827c((float) this.j.f, (float) this.j.g, a.f2337x, a.f2338y))) < 3.0f;
    }

    /* renamed from: y */
    public final int mo1834y() {
        return this.f8370W;
    }

    /* renamed from: z */
    public final synchronized void mo1835z() {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            Enemy h = m8465h();
            if (this.i.m7529b(h)) {
                Vector2 d = PMath.m8828d((float) this.j.f, (float) this.j.g, this.o, 12.0f);
                Vector2 a = h.f6912g.m7540a(h.f6907b, h.f6911f, (float) this.j.f, (float) this.j.g, h.mo1765e(), this.f8369V);
                Projectile d2 = VenomProjectile.m7804d();
                d2.m7805a(h, this.f8365R, d, a, this.f8369V);
                gameScreen.m7847a(d2);
                m8469l();
                if (!this.f8366S) {
                    m8450a(null);
                }
            }
        }
    }
}
