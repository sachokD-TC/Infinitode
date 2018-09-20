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
import com.prineside.tdi.projectiles.types.SplashProjectile;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.tiles.WalkableTile;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.TowerStat;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.towers.TowerUpgrade.TowerUpgradeType;
import com.prineside.tdi.utility.MaterialColor.DEEP_ORANGE;
import com.prineside.tdi.utility.PMath;
import java.util.Iterator;

public class SplashTower extends Tower {
    /* renamed from: F */
    private static final GlobalUpgradeType[] f8312F = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SPLASH_PRICE_V, GlobalUpgradeType.TOWER_SPLASH_PRICE_IV, GlobalUpgradeType.TOWER_SPLASH_PRICE_III, GlobalUpgradeType.TOWER_SPLASH_PRICE_II, GlobalUpgradeType.TOWER_SPLASH_PRICE_I};
    /* renamed from: G */
    private static final GlobalUpgradeType[] f8313G = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SPLASH_MAX_TOWER_LEVEL_V, GlobalUpgradeType.TOWER_SPLASH_MAX_TOWER_LEVEL_IV, GlobalUpgradeType.TOWER_SPLASH_MAX_TOWER_LEVEL_III, GlobalUpgradeType.TOWER_SPLASH_MAX_TOWER_LEVEL_II, GlobalUpgradeType.TOWER_SPLASH_MAX_TOWER_LEVEL_I};
    /* renamed from: H */
    private static final GlobalUpgradeType[] f8314H = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SPLASH_MAX_UPGRADE_LEVEL_III, GlobalUpgradeType.TOWER_SPLASH_MAX_UPGRADE_LEVEL_II, GlobalUpgradeType.TOWER_SPLASH_MAX_UPGRADE_LEVEL_I};
    /* renamed from: I */
    private static final GlobalUpgradeType[] f8315I = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SPLASH_EXPERIENCE_BONUS_II, GlobalUpgradeType.TOWER_SPLASH_EXPERIENCE_BONUS};
    /* renamed from: J */
    private static final GlobalUpgradeType[] f8316J = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SPLASH_EXPERIENCE_GENERATION_II, GlobalUpgradeType.TOWER_SPLASH_EXPERIENCE_GENERATION};
    /* renamed from: K */
    private static final GlobalUpgradeType[] f8317K = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SPLASH_UPGRADE_PRICE_V, GlobalUpgradeType.TOWER_SPLASH_UPGRADE_PRICE_IV, GlobalUpgradeType.TOWER_SPLASH_UPGRADE_PRICE_III, GlobalUpgradeType.TOWER_SPLASH_UPGRADE_PRICE_II, GlobalUpgradeType.TOWER_SPLASH_UPGRADE_PRICE_I};
    /* renamed from: L */
    private static final C0710q<TowerStatType, TowerStatConfig> f8318L;
    /* renamed from: M */
    private static final TowerStatType[] f8319M = new TowerStatType[]{TowerStatType.RANGE, TowerStatType.DAMAGE, TowerStatType.ATTACK_SPEED, TowerStatType.ACCURACY, TowerStatType.PROJECTILE_SPEED, TowerStatType.U_PROJECTILE_COUNT};
    /* renamed from: N */
    private static final TowerUpgradeType[] f8320N = new TowerUpgradeType[]{TowerUpgradeType.RANGE, TowerUpgradeType.DAMAGE, TowerUpgradeType.ATTACK_SPEED, TowerUpgradeType.ACCURACY};
    /* renamed from: O */
    private static final C0710q<TowerStatType, Integer> f8321O;
    /* renamed from: P */
    private static final C0710q<TowerUpgradeType, Integer[]> f8322P;
    /* renamed from: Q */
    private static final C0710q<TowerStatType, Float[]> f8323Q;
    /* renamed from: R */
    private boolean f8324R = false;
    /* renamed from: S */
    private long f8325S;
    /* renamed from: T */
    private float f8326T = 0.0f;
    /* renamed from: U */
    private long f8327U;
    /* renamed from: V */
    private Vector2 f8328V = new Vector2();
    /* renamed from: W */
    private Vector2 f8329W = new Vector2();
    /* renamed from: X */
    private float f8330X;
    /* renamed from: Y */
    private float f8331Y;
    /* renamed from: Z */
    private float f8332Z;
    private float aa;
    private float ab;
    private int ac;

    static {
        C0710q c0710q = new C0710q();
        f8318L = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new TowerStatConfig(1.85f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SPLASH_RANGE_V, GlobalUpgradeType.TOWER_SPLASH_RANGE_IV, GlobalUpgradeType.TOWER_SPLASH_RANGE_III, GlobalUpgradeType.TOWER_SPLASH_RANGE_II, GlobalUpgradeType.TOWER_SPLASH_RANGE_I}));
        f8318L.mo542a(TowerStatType.DAMAGE, new TowerStatConfig(2.9f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SPLASH_DAMAGE_V, GlobalUpgradeType.TOWER_SPLASH_DAMAGE_IV, GlobalUpgradeType.TOWER_SPLASH_DAMAGE_III, GlobalUpgradeType.TOWER_SPLASH_DAMAGE_II, GlobalUpgradeType.TOWER_SPLASH_DAMAGE_I}));
        f8318L.mo542a(TowerStatType.ATTACK_SPEED, new TowerStatConfig(0.8f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SPLASH_ATTACK_SPEED_V, GlobalUpgradeType.TOWER_SPLASH_ATTACK_SPEED_IV, GlobalUpgradeType.TOWER_SPLASH_ATTACK_SPEED_III, GlobalUpgradeType.TOWER_SPLASH_ATTACK_SPEED_II, GlobalUpgradeType.TOWER_SPLASH_ATTACK_SPEED_I}));
        f8318L.mo542a(TowerStatType.ACCURACY, new TowerStatConfig(13.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SPLASH_ACCURACY_V, GlobalUpgradeType.TOWER_SPLASH_ACCURACY_IV, GlobalUpgradeType.TOWER_SPLASH_ACCURACY_III, GlobalUpgradeType.TOWER_SPLASH_ACCURACY_II, GlobalUpgradeType.TOWER_SPLASH_ACCURACY_I}));
        f8318L.mo542a(TowerStatType.PROJECTILE_SPEED, new TowerStatConfig(3.0f, new GlobalUpgradeType[0]));
        f8318L.mo542a(TowerStatType.U_PROJECTILE_COUNT, new TowerStatConfig(0.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SPLASH_U_PROJECTILE_COUNT_V, GlobalUpgradeType.TOWER_SPLASH_U_PROJECTILE_COUNT_IV, GlobalUpgradeType.TOWER_SPLASH_U_PROJECTILE_COUNT_III, GlobalUpgradeType.TOWER_SPLASH_U_PROJECTILE_COUNT_II, GlobalUpgradeType.TOWER_SPLASH_U_PROJECTILE_COUNT_I}));
        c0710q = new C0710q();
        f8321O = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, Integer.valueOf(0));
        f8321O.mo542a(TowerStatType.DAMAGE, Integer.valueOf(1));
        f8321O.mo542a(TowerStatType.ATTACK_SPEED, Integer.valueOf(2));
        f8321O.mo542a(TowerStatType.ACCURACY, Integer.valueOf(3));
        c0710q = new C0710q();
        f8322P = c0710q;
        c0710q.mo542a(TowerUpgradeType.RANGE, new Integer[]{Integer.valueOf(51), Integer.valueOf(79), Integer.valueOf(125), Integer.valueOf(203), Integer.valueOf(338), Integer.valueOf(578), Integer.valueOf(1015), Integer.valueOf(1827), Integer.valueOf(3371), Integer.valueOf(6372)});
        f8322P.mo542a(TowerUpgradeType.DAMAGE, new Integer[]{Integer.valueOf(71), Integer.valueOf(101), Integer.valueOf(145), Integer.valueOf(211), Integer.valueOf(311), Integer.valueOf(464), Integer.valueOf(701), Integer.valueOf(1073), Integer.valueOf(1664), Integer.valueOf(2613)});
        f8322P.mo542a(TowerUpgradeType.ATTACK_SPEED, new Integer[]{Integer.valueOf(33), Integer.valueOf(43), Integer.valueOf(57), Integer.valueOf(80), Integer.valueOf(110), Integer.valueOf(160), Integer.valueOf(229), Integer.valueOf(335), Integer.valueOf(519), Integer.valueOf(801)});
        f8322P.mo542a(TowerUpgradeType.ACCURACY, new Integer[]{Integer.valueOf(54), Integer.valueOf(80), Integer.valueOf(124), Integer.valueOf(199), Integer.valueOf(320), Integer.valueOf(548), Integer.valueOf(967), Integer.valueOf(1716), Integer.valueOf(3091), Integer.valueOf(5774)});
        c0710q = new C0710q();
        f8323Q = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new Float[]{Float.valueOf(1.13f), Float.valueOf(1.275f), Float.valueOf(1.409f), Float.valueOf(1.556f), Float.valueOf(1.704f), Float.valueOf(1.855f), Float.valueOf(2.02f), Float.valueOf(2.188f), Float.valueOf(2.356f), Float.valueOf(2.531f)});
        f8323Q.mo542a(TowerStatType.DAMAGE, new Float[]{Float.valueOf(1.8f), Float.valueOf(2.92f), Float.valueOf(4.149f), Float.valueOf(5.555f), Float.valueOf(7.149f), Float.valueOf(8.867f), Float.valueOf(10.51f), Float.valueOf(12.28f), Float.valueOf(14.19f), Float.valueOf(16.23f)});
        f8323Q.mo542a(TowerStatType.ATTACK_SPEED, new Float[]{Float.valueOf(1.137f), Float.valueOf(1.296f), Float.valueOf(1.475f), Float.valueOf(1.669f), Float.valueOf(1.888f), Float.valueOf(2.117f), Float.valueOf(2.357f), Float.valueOf(2.591f), Float.valueOf(2.83f), Float.valueOf(3.1f)});
        f8323Q.mo542a(TowerStatType.ACCURACY, new Float[]{Float.valueOf(1.11f), Float.valueOf(1.235f), Float.valueOf(1.374f), Float.valueOf(1.523f), Float.valueOf(1.69f), Float.valueOf(1.871f), Float.valueOf(2.043f), Float.valueOf(2.221f), Float.valueOf(2.398f), Float.valueOf(2.598f)});
    }

    public SplashTower() {
        super(TowerType.SPLASH);
    }

    /* renamed from: A */
    public final GlobalUpgradeType mo1811A() {
        return GlobalUpgradeType.TOWER_SPLASH;
    }

    /* renamed from: B */
    public final GlobalUpgradeType mo1812B() {
        return GlobalUpgradeType.TOWER_SPLASH_STARTING_EXPERIENCE;
    }

    /* renamed from: C */
    public final GlobalUpgradeType[] mo1813C() {
        return f8315I;
    }

    /* renamed from: D */
    public final GlobalUpgradeType[] mo1814D() {
        return f8316J;
    }

    /* renamed from: E */
    public final GlobalUpgradeType[] mo1815E() {
        return f8312F;
    }

    /* renamed from: F */
    public final GlobalUpgradeType[] mo1816F() {
        return f8313G;
    }

    /* renamed from: G */
    public final GlobalUpgradeType[] mo1817G() {
        return f8314H;
    }

    /* renamed from: a */
    public final float mo1818a(TowerStatType towerStatType, int i) {
        switch (towerStatType) {
            case U_PROJECTILE_COUNT:
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
        Game.game.logger.m7510b("SplashTower", "Can't calculate unique bonus for stat type: " + towerStatType);
        return 1.0f;
    }

    /* renamed from: a */
    public final int mo1819a(int i, int i2) {
        int intValue = ((Integer[]) f8322P.m2467a(f8320N[i]))[i2 - 1].intValue();
        float f = 1.0f;
        for (GlobalUpgradeType globalUpgradeType : f8317K) {
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
            if (towerStatType == TowerStatType.U_PROJECTILE_COUNT) {
                float f;
                for (GlobalUpgradeType globalUpgradeType2 : ((TowerStatConfig) f8318L.m2467a((Object) towerStatType)).f8001b) {
                    if (GlobalUpgrade.m7492a(globalUpgradeType2)) {
                        f = GlobalUpgrade.m7495c(globalUpgradeType2).f6630u[0];
                        break;
                    }
                }
                f = 0.0f;
                return 6.0f + ((f + 8.0f) * ((((float) i) - 1.0f) / 19.0f));
            }
            throw new RuntimeException("Tower type " + this.k.name() + " has no unique stat named " + towerStatType.name());
        } else if (f8318L.m2474c((Object) towerStatType)) {
            TowerStatConfig towerStatConfig = (TowerStatConfig) f8318L.m2467a((Object) towerStatType);
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
            if (!f8321O.m2474c((Object) towerStatType)) {
                return f2;
            }
            i2 = iArr[((Integer) f8321O.m2467a((Object) towerStatType)).intValue()];
            return i2 != 0 ? f2 * ((Float[]) f8323Q.m2467a((Object) towerStatType))[i2 - 1].floatValue() : f2;
        } else {
            throw new RuntimeException("Tower type " + this.k.name() + " has no stat named " + towerStatType.name());
        }
    }

    /* renamed from: c */
    public final void mo1837c(int i) {
        if (Game.game.m7477t() - this.f8327U >= 100000) {
            this.f8327U = Game.game.m7477t();
            WalkableTile[] walkableTileArr = this.E;
            int length = walkableTileArr.length;
            int i2 = 0;
            boolean z = false;
            while (i2 < length) {
                boolean z2;
                WalkableTile walkableTile = walkableTileArr[i2];
                if (walkableTile.f7986r != 0) {
                    synchronized (walkableTile.f7984p) {
                        Iterator c = walkableTile.f7984p.m2489c();
                        while (c.hasNext()) {
                            if (((Enemy) c.next()).mo1755a(this.k)) {
                                z2 = true;
                                break;
                            }
                        }
                        z2 = z;
                    }
                } else {
                    z2 = z;
                }
                i2++;
                z = z2;
            }
            this.f8324R = z;
        }
    }

    /* renamed from: d */
    public final void mo1821d(int i) {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null && this.f8324R) {
            if (Game.game.m7477t() - this.f8325S > ((long) ((int) (((float) this.ac) / this.ab)))) {
                float f = ((360.0f / this.ab) + this.f8326T) % 360.0f;
                this.f8328V.f2337x = (float) this.j.f;
                this.f8328V.f2338y = (float) this.j.g;
                PMath.m8823a(this.f8328V, f, 32.0f);
                this.f8329W.f2337x = (float) this.j.f;
                this.f8329W.f2338y = (float) this.j.g;
                PMath.m8823a(this.f8329W, f, this.z);
                Projectile n = SplashProjectile.m7792n();
                n.m7796a(this, this.f8330X, this.f8332Z, this.f8328V, this.f8329W, this.aa);
                gameScreen.m7847a(n);
                this.f8326T = 2.5f + f;
                this.f8325S = Game.game.m7477t();
                m8469l();
            }
        }
    }

    /* renamed from: j */
    public final void mo1822j() {
        super.mo1822j();
        this.f8330X = m8442a(TowerStatType.DAMAGE);
        this.f8331Y = m8442a(TowerStatType.ATTACK_SPEED);
        this.f8332Z = m8442a(TowerStatType.ACCURACY);
        this.aa = m8442a(TowerStatType.PROJECTILE_SPEED);
        this.ab = m8442a(TowerStatType.U_PROJECTILE_COUNT);
        this.ac = (int) (1000000.0f / this.f8331Y);
    }

    /* renamed from: n */
    public final String mo1823n() {
        return Game.f6551e.m2416a("tower_name_SPLASH");
    }

    /* renamed from: o */
    public final String mo1824o() {
        return Game.f6551e.m2416a("tower_description_SPLASH");
    }

    /* renamed from: p */
    public final C0430b mo1825p() {
        return DEEP_ORANGE.f8459f;
    }

    /* renamed from: q */
    public final String mo1826q() {
        return Game.f6551e.m2416a("tower_unique_stat_description_SPLASH");
    }

    /* renamed from: r */
    public final C0710q<TowerStatType, TowerStatConfig> mo1827r() {
        return f8318L;
    }

    /* renamed from: s */
    public final Type mo1828s() {
        return Type.SHOT_BASIC;
    }

    /* renamed from: t */
    public final int mo1829t() {
        return 70;
    }

    /* renamed from: u */
    public final TowerStatType[] mo1830u() {
        return f8319M;
    }

    /* renamed from: v */
    public final TowerUpgradeType[] mo1831v() {
        return f8320N;
    }

    /* renamed from: w */
    public final boolean mo1832w() {
        return false;
    }

    /* renamed from: y */
    public final int mo1834y() {
        return this.ac;
    }
}
