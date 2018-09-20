package com.prineside.tdi.towers.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.C0710q;
import com.prineside.tdi.AsyncUpdatable;
import com.prineside.tdi.Game;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgradeType;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.projectiles.Projectile;
import com.prineside.tdi.projectiles.types.ChainLightningProjectile;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.TowerStat;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.towers.TowerUpgrade.TowerUpgradeType;
import com.prineside.tdi.utility.FastBadRandom;
import com.prineside.tdi.utility.MaterialColor.INDIGO;
import com.prineside.tdi.utility.PMath;

public class TeslaTower extends Tower {
    /* renamed from: F */
    private static final GlobalUpgradeType[] f8334F = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_TESLA_PRICE_V, GlobalUpgradeType.TOWER_TESLA_PRICE_IV, GlobalUpgradeType.TOWER_TESLA_PRICE_III, GlobalUpgradeType.TOWER_TESLA_PRICE_II, GlobalUpgradeType.TOWER_TESLA_PRICE_I};
    /* renamed from: G */
    private static final GlobalUpgradeType[] f8335G = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_TESLA_MAX_TOWER_LEVEL_V, GlobalUpgradeType.TOWER_TESLA_MAX_TOWER_LEVEL_IV, GlobalUpgradeType.TOWER_TESLA_MAX_TOWER_LEVEL_III, GlobalUpgradeType.TOWER_TESLA_MAX_TOWER_LEVEL_II, GlobalUpgradeType.TOWER_TESLA_MAX_TOWER_LEVEL_I};
    /* renamed from: H */
    private static final GlobalUpgradeType[] f8336H = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_TESLA_MAX_UPGRADE_LEVEL_III, GlobalUpgradeType.TOWER_TESLA_MAX_UPGRADE_LEVEL_II, GlobalUpgradeType.TOWER_TESLA_MAX_UPGRADE_LEVEL_I};
    /* renamed from: I */
    private static final GlobalUpgradeType[] f8337I = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_TESLA_EXPERIENCE_BONUS_II, GlobalUpgradeType.TOWER_TESLA_EXPERIENCE_BONUS};
    /* renamed from: J */
    private static final GlobalUpgradeType[] f8338J = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_TESLA_EXPERIENCE_GENERATION_II, GlobalUpgradeType.TOWER_TESLA_EXPERIENCE_GENERATION};
    /* renamed from: K */
    private static final GlobalUpgradeType[] f8339K = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_TESLA_UPGRADE_PRICE_V, GlobalUpgradeType.TOWER_TESLA_UPGRADE_PRICE_IV, GlobalUpgradeType.TOWER_TESLA_UPGRADE_PRICE_III, GlobalUpgradeType.TOWER_TESLA_UPGRADE_PRICE_II, GlobalUpgradeType.TOWER_TESLA_UPGRADE_PRICE_I};
    /* renamed from: L */
    private static final C0710q<TowerStatType, TowerStatConfig> f8340L;
    /* renamed from: M */
    private static final TowerStatType[] f8341M = new TowerStatType[]{TowerStatType.RANGE, TowerStatType.DAMAGE, TowerStatType.ATTACK_SPEED, TowerStatType.ROTATION_SPEED, TowerStatType.CHAIN_LIGHTNING_DAMAGE, TowerStatType.U_CHAIN_LIGHTNING_LENGTH};
    /* renamed from: N */
    private static final TowerUpgradeType[] f8342N = new TowerUpgradeType[]{TowerUpgradeType.RANGE, TowerUpgradeType.DAMAGE, TowerUpgradeType.ATTACK_SPEED, TowerUpgradeType.LIGHTNING_DAMAGE};
    /* renamed from: O */
    private static final C0710q<TowerStatType, Integer> f8343O;
    /* renamed from: P */
    private static final C0710q<TowerUpgradeType, Integer[]> f8344P;
    /* renamed from: Q */
    private static final C0710q<TowerStatType, Float[]> f8345Q;
    /* renamed from: R */
    private float f8346R;
    /* renamed from: S */
    private float f8347S;
    /* renamed from: T */
    private float f8348T;
    /* renamed from: U */
    private float f8349U;
    /* renamed from: V */
    private float f8350V;
    /* renamed from: W */
    private int f8351W;

    static {
        C0710q c0710q = new C0710q();
        f8340L = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new TowerStatConfig(2.8f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_TESLA_RANGE_V, GlobalUpgradeType.TOWER_TESLA_RANGE_IV, GlobalUpgradeType.TOWER_TESLA_RANGE_III, GlobalUpgradeType.TOWER_TESLA_RANGE_II, GlobalUpgradeType.TOWER_TESLA_RANGE_I}));
        f8340L.mo542a(TowerStatType.DAMAGE, new TowerStatConfig(2.75f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_TESLA_DAMAGE_V, GlobalUpgradeType.TOWER_TESLA_DAMAGE_IV, GlobalUpgradeType.TOWER_TESLA_DAMAGE_III, GlobalUpgradeType.TOWER_TESLA_DAMAGE_II, GlobalUpgradeType.TOWER_TESLA_DAMAGE_I}));
        f8340L.mo542a(TowerStatType.ATTACK_SPEED, new TowerStatConfig(0.7f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_TESLA_ATTACK_SPEED_V, GlobalUpgradeType.TOWER_TESLA_ATTACK_SPEED_IV, GlobalUpgradeType.TOWER_TESLA_ATTACK_SPEED_III, GlobalUpgradeType.TOWER_TESLA_ATTACK_SPEED_II, GlobalUpgradeType.TOWER_TESLA_ATTACK_SPEED_I}));
        f8340L.mo542a(TowerStatType.ROTATION_SPEED, new TowerStatConfig(90.0f, new GlobalUpgradeType[0]));
        f8340L.mo542a(TowerStatType.CHAIN_LIGHTNING_DAMAGE, new TowerStatConfig(25.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_TESLA_CHAIN_DAMAGE_V, GlobalUpgradeType.TOWER_TESLA_CHAIN_DAMAGE_IV, GlobalUpgradeType.TOWER_TESLA_CHAIN_DAMAGE_III, GlobalUpgradeType.TOWER_TESLA_CHAIN_DAMAGE_II, GlobalUpgradeType.TOWER_TESLA_CHAIN_DAMAGE_I}));
        f8340L.mo542a(TowerStatType.U_CHAIN_LIGHTNING_LENGTH, new TowerStatConfig(0.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_TESLA_U_CHAIN_LIGHTNING_LENGTH_V, GlobalUpgradeType.TOWER_TESLA_U_CHAIN_LIGHTNING_LENGTH_IV, GlobalUpgradeType.TOWER_TESLA_U_CHAIN_LIGHTNING_LENGTH_III, GlobalUpgradeType.TOWER_TESLA_U_CHAIN_LIGHTNING_LENGTH_II, GlobalUpgradeType.TOWER_TESLA_U_CHAIN_LIGHTNING_LENGTH_I}));
        c0710q = new C0710q();
        f8343O = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, Integer.valueOf(0));
        f8343O.mo542a(TowerStatType.DAMAGE, Integer.valueOf(1));
        f8343O.mo542a(TowerStatType.ATTACK_SPEED, Integer.valueOf(2));
        f8343O.mo542a(TowerStatType.CHAIN_LIGHTNING_DAMAGE, Integer.valueOf(3));
        c0710q = new C0710q();
        f8344P = c0710q;
        c0710q.mo542a(TowerUpgradeType.RANGE, new Integer[]{Integer.valueOf(56), Integer.valueOf(80), Integer.valueOf(116), Integer.valueOf(171), Integer.valueOf(257), Integer.valueOf(393), Integer.valueOf(611), Integer.valueOf(967), Integer.valueOf(1557), Integer.valueOf(2549)});
        f8344P.mo542a(TowerUpgradeType.DAMAGE, new Integer[]{Integer.valueOf(103), Integer.valueOf(148), Integer.valueOf(214), Integer.valueOf(311), Integer.valueOf(455), Integer.valueOf(669), Integer.valueOf(991), Integer.valueOf(1477), Integer.valueOf(2216), Integer.valueOf(3347)});
        f8344P.mo542a(TowerUpgradeType.ATTACK_SPEED, new Integer[]{Integer.valueOf(59), Integer.valueOf(80), Integer.valueOf(111), Integer.valueOf(159), Integer.valueOf(239), Integer.valueOf(352), Integer.valueOf(552), Integer.valueOf(870), Integer.valueOf(1348), Integer.valueOf(2173)});
        f8344P.mo542a(TowerUpgradeType.LIGHTNING_DAMAGE, new Integer[]{Integer.valueOf(88), Integer.valueOf(124), Integer.valueOf(178), Integer.valueOf(251), Integer.valueOf(361), Integer.valueOf(523), Integer.valueOf(783), Integer.valueOf(1180), Integer.valueOf(1761), Integer.valueOf(2699)});
        c0710q = new C0710q();
        f8345Q = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new Float[]{Float.valueOf(1.15f), Float.valueOf(1.317f), Float.valueOf(1.49f), Float.valueOf(1.669f), Float.valueOf(1.862f), Float.valueOf(2.064f), Float.valueOf(2.272f), Float.valueOf(2.496f), Float.valueOf(2.725f), Float.valueOf(2.965f)});
        f8345Q.mo542a(TowerStatType.DAMAGE, new Float[]{Float.valueOf(1.918f), Float.valueOf(3.031f), Float.valueOf(4.267f), Float.valueOf(5.606f), Float.valueOf(7.113f), Float.valueOf(8.676f), Float.valueOf(10.22f), Float.valueOf(12.09f), Float.valueOf(13.85f), Float.valueOf(15.86f)});
        f8345Q.mo542a(TowerStatType.ATTACK_SPEED, new Float[]{Float.valueOf(1.14f), Float.valueOf(1.296f), Float.valueOf(1.459f), Float.valueOf(1.647f), Float.valueOf(1.859f), Float.valueOf(2.08f), Float.valueOf(2.287f), Float.valueOf(2.523f), Float.valueOf(2.779f), Float.valueOf(3.087f)});
        f8345Q.mo542a(TowerStatType.CHAIN_LIGHTNING_DAMAGE, new Float[]{Float.valueOf(1.1f), Float.valueOf(1.209f), Float.valueOf(1.323f), Float.valueOf(1.435f), Float.valueOf(1.547f), Float.valueOf(1.655f), Float.valueOf(1.763f), Float.valueOf(1.88f), Float.valueOf(2.005f), Float.valueOf(2.155f)});
    }

    public TeslaTower() {
        super(TowerType.TESLA);
    }

    /* renamed from: A */
    public final GlobalUpgradeType mo1811A() {
        return GlobalUpgradeType.TOWER_TESLA;
    }

    /* renamed from: B */
    public final GlobalUpgradeType mo1812B() {
        return GlobalUpgradeType.TOWER_TESLA_STARTING_EXPERIENCE;
    }

    /* renamed from: C */
    public final GlobalUpgradeType[] mo1813C() {
        return f8337I;
    }

    /* renamed from: D */
    public final GlobalUpgradeType[] mo1814D() {
        return f8338J;
    }

    /* renamed from: E */
    public final GlobalUpgradeType[] mo1815E() {
        return f8334F;
    }

    /* renamed from: F */
    public final GlobalUpgradeType[] mo1816F() {
        return f8335G;
    }

    /* renamed from: G */
    public final GlobalUpgradeType[] mo1817G() {
        return f8336H;
    }

    /* renamed from: a */
    public final float mo1818a(TowerStatType towerStatType, int i) {
        switch (towerStatType) {
            case U_CHAIN_LIGHTNING_LENGTH:
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
        Game.game.logger.m7510b("TeslaTower", "Can't calculate unique bonus for stat type: " + towerStatType);
        return 1.0f;
    }

    /* renamed from: a */
    public final int mo1819a(int i, int i2) {
        int intValue = ((Integer[]) f8344P.m2467a(f8342N[i]))[i2 - 1].intValue();
        float f = 1.0f;
        for (GlobalUpgradeType globalUpgradeType : f8339K) {
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
            if (towerStatType == TowerStatType.U_CHAIN_LIGHTNING_LENGTH) {
                float f;
                for (GlobalUpgradeType globalUpgradeType2 : ((TowerStatConfig) f8340L.m2467a((Object) towerStatType)).f8001b) {
                    if (GlobalUpgrade.m7492a(globalUpgradeType2)) {
                        f = GlobalUpgrade.m7495c(globalUpgradeType2).f6630u[0];
                        break;
                    }
                }
                f = 0.0f;
                return 3.5f + ((f + 7.0f) * (((float) (i - 1)) / 19.0f));
            }
            throw new RuntimeException("Tower type " + this.k.name() + " has no unique stat named " + towerStatType.name());
        } else if (f8340L.m2474c((Object) towerStatType)) {
            TowerStatConfig towerStatConfig = (TowerStatConfig) f8340L.m2467a((Object) towerStatType);
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
            if (!f8343O.m2474c((Object) towerStatType)) {
                return f2;
            }
            i2 = iArr[((Integer) f8343O.m2467a((Object) towerStatType)).intValue()];
            return i2 != 0 ? f2 * ((Float[]) f8345Q.m2467a((Object) towerStatType))[i2 - 1].floatValue() : f2;
        } else {
            throw new RuntimeException("Tower type " + this.k.name() + " has no stat named " + towerStatType.name());
        }
    }

    /* renamed from: d */
    public final void mo1821d(int i) {
        Enemy h = m8465h();
        if (h != null) {
            float c = PMath.m8827c((float) this.j.f, (float) this.j.g, h.f6909d.f2337x, h.f6909d.f2338y);
            float a = PMath.m8819a(this.o, c);
            float f = (((float) i) / 1000000.0f) * this.f8348T;
            if (f >= Math.abs(a)) {
                this.o = c;
            } else if (a < 0.0f) {
                this.o -= f;
            } else {
                this.o += f;
            }
        }
    }

    /* renamed from: j */
    public final void mo1822j() {
        super.mo1822j();
        this.f8346R = m8442a(TowerStatType.DAMAGE);
        this.f8347S = m8442a(TowerStatType.ATTACK_SPEED);
        this.f8348T = m8442a(TowerStatType.ROTATION_SPEED);
        this.f8349U = m8442a(TowerStatType.CHAIN_LIGHTNING_DAMAGE) * 0.01f;
        this.f8350V = m8442a(TowerStatType.U_CHAIN_LIGHTNING_LENGTH);
        this.f8351W = (int) (1000000.0f / this.f8347S);
    }

    /* renamed from: n */
    public final String mo1823n() {
        return Game.f6551e.m2416a("tower_name_TESLA");
    }

    /* renamed from: o */
    public final String mo1824o() {
        return Game.f6551e.m2416a("tower_description_TESLA");
    }

    /* renamed from: p */
    public final C0430b mo1825p() {
        return INDIGO.f8511f;
    }

    /* renamed from: q */
    public final String mo1826q() {
        return Game.f6551e.m2416a("tower_unique_stat_description_TESLA");
    }

    /* renamed from: r */
    public final C0710q<TowerStatType, TowerStatConfig> mo1827r() {
        return f8340L;
    }

    /* renamed from: s */
    public final Type mo1828s() {
        return Type.SHOT_THUNDER;
    }

    /* renamed from: t */
    public final int mo1829t() {
        return 110;
    }

    /* renamed from: u */
    public final TowerStatType[] mo1830u() {
        return f8341M;
    }

    /* renamed from: v */
    public final TowerUpgradeType[] mo1831v() {
        return f8342N;
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
        return Math.abs(PMath.m8819a(this.o, PMath.m8827c((float) this.j.f, (float) this.j.g, h.f6909d.f2337x, h.f6909d.f2338y))) < 3.0f;
    }

    /* renamed from: y */
    public final int mo1834y() {
        return this.f8351W;
    }

    /* renamed from: z */
    public final void mo1835z() {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            Enemy h = m8465h();
            if (this.i.m7529b(h)) {
                Object d = PMath.m8828d((float) this.j.f, (float) this.j.g, this.o, 24.0f);
                Projectile l = ChainLightningProjectile.m7751l();
                float f = this.f8346R;
                float f2 = this.f8349U;
                float f3 = this.f8350V;
                GameScreen gameScreen2 = Game.f6553g;
                if (gameScreen2 != null) {
                    l.f7034d = Game.game.m7477t();
                    l.f7033c = false;
                    l.f7041k = null;
                    l.f7037g = this;
                    l.f7036f.f2337x = d.f2337x;
                    l.f7036f.f2338y = d.f2338y;
                    l.f7038h = f;
                    l.f7039i = f2;
                    l.f7040j = f3;
                    l.f7045o = 0.0f;
                    l.f7035e = Game.game.m7477t();
                    l.f7042l = null;
                    gameScreen2.m7851a(this, h, f);
                    l.m7755a(h);
                    f2 = PMath.m8820a(d.f2337x, d.f2338y, h.f6909d.f2337x, h.f6909d.f2338y);
                    if (f2 < 64.0f) {
                        l.f7043m.m2296a(d);
                        l.f7044n.m2296a(Float.valueOf(2.0f));
                        l.f7043m.m2296a(new Vector2(h.f6909d.f2337x, h.f6909d.f2338y));
                        l.f7044n.m2296a(Float.valueOf(ChainLightningProjectile.m7752m()));
                    } else {
                        l.f7043m.m2296a(d);
                        l.f7044n.m2296a(Float.valueOf(2.0f));
                        f3 = PMath.m8827c(d.f2337x, d.f2338y, h.f6909d.f2337x, h.f6909d.f2338y);
                        Vector2 vector2 = new Vector2(d);
                        while (f2 > 0.0f) {
                            f = ((FastBadRandom.m8809b() * 64.0f) + 64.0f) * 0.5f;
                            if (f > f2) {
                                f = f2;
                            }
                            d = PMath.m8828d(vector2.f2337x, vector2.f2338y, ((FastBadRandom.m8809b() * 40.0f) - 20.0f) + f3, f);
                            l.f7043m.m2296a(d);
                            l.f7044n.m2296a(Float.valueOf(ChainLightningProjectile.m7752m()));
                            f2 -= f;
                        }
                        l.f7043m.m2296a(new Vector2(h.f6909d.f2337x, h.f6909d.f2338y));
                        l.f7044n.m2296a(Float.valueOf(0.0f));
                    }
                    l.f7032b = true;
                    gameScreen2.m7844a((AsyncUpdatable) l);
                }
                gameScreen.m7847a(l);
                m8469l();
            }
        }
    }
}
