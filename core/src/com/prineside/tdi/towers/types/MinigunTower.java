package com.prineside.tdi.towers.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.C0710q;
import com.prineside.tdi.Game;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgradeType;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.TowerStat;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.towers.TowerUpgrade.TowerUpgradeType;
import com.prineside.tdi.utility.FastBadRandom;
import com.prineside.tdi.utility.MaterialColor.PURPLE;
import com.prineside.tdi.utility.PMath;

public class MinigunTower extends Tower {
    /* renamed from: F */
    private static final GlobalUpgradeType[] f8226F = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MINIGUN_PRICE_V, GlobalUpgradeType.TOWER_MINIGUN_PRICE_IV, GlobalUpgradeType.TOWER_MINIGUN_PRICE_III, GlobalUpgradeType.TOWER_MINIGUN_PRICE_II, GlobalUpgradeType.TOWER_MINIGUN_PRICE_I};
    /* renamed from: G */
    private static final GlobalUpgradeType[] f8227G = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MINIGUN_MAX_TOWER_LEVEL_V, GlobalUpgradeType.TOWER_MINIGUN_MAX_TOWER_LEVEL_IV, GlobalUpgradeType.TOWER_MINIGUN_MAX_TOWER_LEVEL_III, GlobalUpgradeType.TOWER_MINIGUN_MAX_TOWER_LEVEL_II, GlobalUpgradeType.TOWER_MINIGUN_MAX_TOWER_LEVEL_I};
    /* renamed from: H */
    private static final GlobalUpgradeType[] f8228H = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MINIGUN_MAX_UPGRADE_LEVEL_III, GlobalUpgradeType.TOWER_MINIGUN_MAX_UPGRADE_LEVEL_II, GlobalUpgradeType.TOWER_MINIGUN_MAX_UPGRADE_LEVEL_I};
    /* renamed from: I */
    private static final GlobalUpgradeType[] f8229I = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MINIGUN_EXPERIENCE_BONUS_II, GlobalUpgradeType.TOWER_MINIGUN_EXPERIENCE_BONUS};
    /* renamed from: J */
    private static final GlobalUpgradeType[] f8230J = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MINIGUN_EXPERIENCE_GENERATION_II, GlobalUpgradeType.TOWER_MINIGUN_EXPERIENCE_GENERATION};
    /* renamed from: K */
    private static final GlobalUpgradeType[] f8231K = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MINIGUN_UPGRADE_PRICE_V, GlobalUpgradeType.TOWER_MINIGUN_UPGRADE_PRICE_IV, GlobalUpgradeType.TOWER_MINIGUN_UPGRADE_PRICE_III, GlobalUpgradeType.TOWER_MINIGUN_UPGRADE_PRICE_II, GlobalUpgradeType.TOWER_MINIGUN_UPGRADE_PRICE_I};
    /* renamed from: L */
    private static final C0710q<TowerStatType, TowerStatConfig> f8232L;
    /* renamed from: M */
    private static final TowerStatType[] f8233M = new TowerStatType[]{TowerStatType.RANGE, TowerStatType.DAMAGE, TowerStatType.ATTACK_SPEED, TowerStatType.ROTATION_SPEED, TowerStatType.U_SPEED_UP_TIME};
    /* renamed from: N */
    private static final TowerUpgradeType[] f8234N = new TowerUpgradeType[]{TowerUpgradeType.RANGE, TowerUpgradeType.DAMAGE, TowerUpgradeType.ATTACK_SPEED, TowerUpgradeType.ROTATION_SPEED};
    /* renamed from: O */
    private static final C0710q<TowerStatType, Integer> f8235O;
    /* renamed from: P */
    private static final C0710q<TowerUpgradeType, Integer[]> f8236P;
    /* renamed from: Q */
    private static final C0710q<TowerStatType, Float[]> f8237Q;
    /* renamed from: R */
    private static C0438n f8238R;
    /* renamed from: S */
    private static C0438n f8239S;
    /* renamed from: T */
    private static C0430b f8240T = C0430b.f1620c.m1222c();
    /* renamed from: U */
    private long f8241U;
    /* renamed from: V */
    private Vector2 f8242V = new Vector2();
    /* renamed from: W */
    private Vector2 f8243W = new Vector2();
    /* renamed from: X */
    private Vector2 f8244X = new Vector2();
    /* renamed from: Y */
    private C0430b f8245Y = C0430b.f1620c.m1222c();
    /* renamed from: Z */
    private boolean f8246Z = false;
    private boolean aa = false;
    private long ab = 0;
    private float ac;
    private float ad;
    private float ae;
    private float af;

    static {
        C0710q c0710q = new C0710q();
        f8232L = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new TowerStatConfig(2.8f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MINIGUN_RANGE_V, GlobalUpgradeType.TOWER_MINIGUN_RANGE_IV, GlobalUpgradeType.TOWER_MINIGUN_RANGE_III, GlobalUpgradeType.TOWER_MINIGUN_RANGE_II, GlobalUpgradeType.TOWER_MINIGUN_RANGE_I}));
        f8232L.mo542a(TowerStatType.DAMAGE, new TowerStatConfig(3.2f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MINIGUN_DAMAGE_V, GlobalUpgradeType.TOWER_MINIGUN_DAMAGE_IV, GlobalUpgradeType.TOWER_MINIGUN_DAMAGE_III, GlobalUpgradeType.TOWER_MINIGUN_DAMAGE_II, GlobalUpgradeType.TOWER_MINIGUN_DAMAGE_I}));
        f8232L.mo542a(TowerStatType.ATTACK_SPEED, new TowerStatConfig(3.8f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MINIGUN_ATTACK_SPEED_V, GlobalUpgradeType.TOWER_MINIGUN_ATTACK_SPEED_IV, GlobalUpgradeType.TOWER_MINIGUN_ATTACK_SPEED_III, GlobalUpgradeType.TOWER_MINIGUN_ATTACK_SPEED_II, GlobalUpgradeType.TOWER_MINIGUN_ATTACK_SPEED_I}));
        f8232L.mo542a(TowerStatType.ROTATION_SPEED, new TowerStatConfig(80.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MINIGUN_ROTATION_SPEED_V, GlobalUpgradeType.TOWER_MINIGUN_ROTATION_SPEED_IV, GlobalUpgradeType.TOWER_MINIGUN_ROTATION_SPEED_III, GlobalUpgradeType.TOWER_MINIGUN_ROTATION_SPEED_II, GlobalUpgradeType.TOWER_MINIGUN_ROTATION_SPEED_I}));
        f8232L.mo542a(TowerStatType.U_SPEED_UP_TIME, new TowerStatConfig(0.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_MINIGUN_U_SPEED_UP_TIME_V, GlobalUpgradeType.TOWER_MINIGUN_U_SPEED_UP_TIME_IV, GlobalUpgradeType.TOWER_MINIGUN_U_SPEED_UP_TIME_III, GlobalUpgradeType.TOWER_MINIGUN_U_SPEED_UP_TIME_II, GlobalUpgradeType.TOWER_MINIGUN_U_SPEED_UP_TIME_I}));
        c0710q = new C0710q();
        f8235O = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, Integer.valueOf(0));
        f8235O.mo542a(TowerStatType.DAMAGE, Integer.valueOf(1));
        f8235O.mo542a(TowerStatType.ATTACK_SPEED, Integer.valueOf(2));
        f8235O.mo542a(TowerStatType.ROTATION_SPEED, Integer.valueOf(3));
        c0710q = new C0710q();
        f8236P = c0710q;
        c0710q.mo542a(TowerUpgradeType.RANGE, new Integer[]{Integer.valueOf(101), Integer.valueOf(143), Integer.valueOf(206), Integer.valueOf(303), Integer.valueOf(455), Integer.valueOf(697), Integer.valueOf(1088), Integer.valueOf(1730), Integer.valueOf(2803), Integer.valueOf(4625)});
        f8236P.mo542a(TowerUpgradeType.DAMAGE, new Integer[]{Integer.valueOf(154), Integer.valueOf(216), Integer.valueOf(305), Integer.valueOf(434), Integer.valueOf(621), Integer.valueOf(895), Integer.valueOf(1298), Integer.valueOf(1896), Integer.valueOf(2788), Integer.valueOf(4127)});
        f8236P.mo542a(TowerUpgradeType.ATTACK_SPEED, new Integer[]{Integer.valueOf(94), Integer.valueOf(126), Integer.valueOf(171), Integer.valueOf(241), Integer.valueOf(343), Integer.valueOf(465), Integer.valueOf(666), Integer.valueOf(921), Integer.valueOf(1293), Integer.valueOf(1816)});
        f8236P.mo542a(TowerUpgradeType.ROTATION_SPEED, new Integer[]{Integer.valueOf(71), Integer.valueOf(98), Integer.valueOf(138), Integer.valueOf(203), Integer.valueOf(302), Integer.valueOf(449), Integer.valueOf(697), Integer.valueOf(1108), Integer.valueOf(1783), Integer.valueOf(2943)});
        c0710q = new C0710q();
        f8237Q = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new Float[]{Float.valueOf(1.142f), Float.valueOf(1.306f), Float.valueOf(1.454f), Float.valueOf(1.616f), Float.valueOf(1.773f), Float.valueOf(1.957f), Float.valueOf(2.151f), Float.valueOf(2.332f), Float.valueOf(2.528f), Float.valueOf(2.73f)});
        f8237Q.mo542a(TowerStatType.DAMAGE, new Float[]{Float.valueOf(1.94f), Float.valueOf(3.062f), Float.valueOf(4.315f), Float.valueOf(5.59f), Float.valueOf(6.976f), Float.valueOf(8.51f), Float.valueOf(10.24f), Float.valueOf(12.11f), Float.valueOf(13.79f), Float.valueOf(15.62f)});
        f8237Q.mo542a(TowerStatType.ATTACK_SPEED, new Float[]{Float.valueOf(1.131f), Float.valueOf(1.283f), Float.valueOf(1.462f), Float.valueOf(1.64f), Float.valueOf(1.83f), Float.valueOf(2.05f), Float.valueOf(2.245f), Float.valueOf(2.478f), Float.valueOf(2.738f), Float.valueOf(2.975f)});
        f8237Q.mo542a(TowerStatType.ROTATION_SPEED, new Float[]{Float.valueOf(1.175f), Float.valueOf(1.393f), Float.valueOf(1.634f), Float.valueOf(1.894f), Float.valueOf(2.156f), Float.valueOf(2.453f), Float.valueOf(2.786f), Float.valueOf(3.106f), Float.valueOf(3.447f), Float.valueOf(3.797f)});
    }

    public MinigunTower() {
        super(TowerType.MINIGUN);
        if (f8238R == null) {
            f8238R = Game.game.f6561E.m1442a("muzzle-flash");
            f8239S = Game.game.f6561E.m1442a("minigun-spinup");
        }
    }

    /* renamed from: A */
    public final GlobalUpgradeType mo1811A() {
        return GlobalUpgradeType.TOWER_MINIGUN;
    }

    /* renamed from: B */
    public final GlobalUpgradeType mo1812B() {
        return GlobalUpgradeType.TOWER_MINIGUN_STARTING_EXPERIENCE;
    }

    /* renamed from: C */
    public final GlobalUpgradeType[] mo1813C() {
        return f8229I;
    }

    /* renamed from: D */
    public final GlobalUpgradeType[] mo1814D() {
        return f8230J;
    }

    /* renamed from: E */
    public final GlobalUpgradeType[] mo1815E() {
        return f8226F;
    }

    /* renamed from: F */
    public final GlobalUpgradeType[] mo1816F() {
        return f8227G;
    }

    /* renamed from: G */
    public final GlobalUpgradeType[] mo1817G() {
        return f8228H;
    }

    /* renamed from: a */
    public final float mo1818a(TowerStatType towerStatType, int i) {
        switch (towerStatType) {
            case U_SPEED_UP_TIME:
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
        }
        Game.game.logger.m7510b("MinigunTower", "Can't calculate unique bonus for stat type: " + towerStatType);
        return 1.0f;
    }

    /* renamed from: a */
    public final int mo1819a(int i, int i2) {
        int intValue = ((Integer[]) f8236P.m2467a(f8234N[i]))[i2 - 1].intValue();
        float f = 1.0f;
        for (GlobalUpgradeType globalUpgradeType : f8231K) {
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
            if (towerStatType == TowerStatType.U_SPEED_UP_TIME) {
                float f;
                for (GlobalUpgradeType globalUpgradeType2 : ((TowerStatConfig) f8232L.m2467a((Object) towerStatType)).f8001b) {
                    if (GlobalUpgrade.m7492a(globalUpgradeType2)) {
                        f = GlobalUpgrade.m7495c(globalUpgradeType2).f6630u[0];
                        break;
                    }
                }
                f = 0.0f;
                return 7.0f - ((4.0f - f) * (((float) (i - 1)) / 19.0f));
            }
            throw new RuntimeException("Tower type " + this.k.name() + " has no unique stat named " + towerStatType.name());
        } else if (f8232L.m2474c((Object) towerStatType)) {
            TowerStatConfig towerStatConfig = (TowerStatConfig) f8232L.m2467a((Object) towerStatType);
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
            if (!f8235O.m2474c((Object) towerStatType)) {
                return f2;
            }
            i2 = iArr[((Integer) f8235O.m2467a((Object) towerStatType)).intValue()];
            return i2 != 0 ? f2 * ((Float[]) f8237Q.m2467a((Object) towerStatType))[i2 - 1].floatValue() : f2;
        } else {
            throw new RuntimeException("Tower type " + this.k.name() + " has no stat named " + towerStatType.name());
        }
    }

    /* renamed from: c */
    public final void mo1836c(float f) {
        long t = Game.game.m7477t() - this.f8241U;
        if (t < 150000) {
            f8240T.f1647L = 1.0f - (((float) t) / 150000.0f);
            Game.game.f6559C.m1410a(f8240T);
            Game.game.f6559C.mo371a(f8238R, this.f8244X.f2337x, this.f8244X.f2338y, 0.0f, 0.0f, 8.0f, 16.0f, 1.0f, 1.0f, this.o);
        }
        if (this.ab != 0) {
            GameScreen gameScreen = Game.f6553g;
            if (gameScreen != null && gameScreen.f7179t != null && gameScreen.f7179t.f6759c != 2) {
                this.f8245Y.f1647L = ((float) this.ab) / (this.af * 1000000.0f);
                this.h.f6559C.m1410a(this.f8245Y);
                this.h.f6559C.mo371a(f8239S, (float) this.j.i, (float) this.j.k, 32.0f, 32.0f, 64.0f, 64.0f, 1.0f, 1.0f, this.o);
            }
        }
    }

    /* renamed from: c */
    public final void mo1837c(int i) {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            Enemy h = m8465h();
            if (h == null || !gameScreen.f7179t.m7529b(h)) {
                this.f8246Z = false;
            }
            if (this.f8246Z) {
                if (this.aa) {
                    long j = (long) (this.af * 1000000.0f);
                    if (this.ab != j) {
                        this.ab += (long) i;
                        if (this.ab > j) {
                            this.ab = j;
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.aa = true;
            } else if (this.aa) {
                this.aa = false;
            } else if (this.ab != 0) {
                this.ab -= (long) (i * 3);
                if (this.ab < 0) {
                    this.ab = 0;
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo1821d(int i) {
        Enemy h = m8465h();
        if (h != null) {
            float c = PMath.m8827c((float) this.j.f, (float) this.j.g, h.f6909d.f2337x, h.f6909d.f2338y);
            float a = PMath.m8819a(this.o, c);
            float f = (((float) i) / 1000000.0f) * this.ae;
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
        this.ac = m8442a(TowerStatType.DAMAGE);
        this.ad = m8442a(TowerStatType.ATTACK_SPEED);
        this.ae = m8442a(TowerStatType.ROTATION_SPEED);
        this.af = m8442a(TowerStatType.U_SPEED_UP_TIME);
    }

    /* renamed from: m */
    public final void mo1839m() {
        long t = Game.game.m7477t() - this.f8241U;
        if (t < 150000) {
            f8240T.f1647L = 0.5f - ((((float) t) / 150000.0f) * 0.5f);
            Game.game.f6560D.m1455a(f8240T);
            Game.game.f6560D.m1452a(this.f8242V.f2337x, this.f8242V.f2338y, this.f8243W.f2337x, this.f8243W.f2338y);
        }
    }

    /* renamed from: n */
    public final String mo1823n() {
        return Game.f6551e.m2416a("tower_name_MINIGUN");
    }

    /* renamed from: o */
    public final String mo1824o() {
        return Game.f6551e.m2416a("tower_description_MINIGUN");
    }

    /* renamed from: p */
    public final C0430b mo1825p() {
        return PURPLE.f8595f;
    }

    /* renamed from: q */
    public final String mo1826q() {
        return Game.f6551e.m2416a("tower_unique_stat_description_MINIGUN");
    }

    /* renamed from: r */
    public final C0710q<TowerStatType, TowerStatConfig> mo1827r() {
        return f8232L;
    }

    /* renamed from: s */
    public final Type mo1828s() {
        return Type.SHOT_GUN;
    }

    /* renamed from: t */
    public final int mo1829t() {
        return 160;
    }

    /* renamed from: u */
    public final TowerStatType[] mo1830u() {
        return f8233M;
    }

    /* renamed from: v */
    public final TowerUpgradeType[] mo1831v() {
        return f8234N;
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
        if (Math.abs(PMath.m8819a(this.o, PMath.m8827c((float) this.j.f, (float) this.j.g, h.f6909d.f2337x, h.f6909d.f2338y))) < 3.0f) {
            this.f8246Z = true;
            return true;
        }
        this.f8246Z = false;
        return false;
    }

    /* renamed from: y */
    public final int mo1834y() {
        return (int) (1000000.0f / ((((float) this.ab) / (this.af * 1000000.0f)) * this.ad));
    }

    /* renamed from: z */
    public final void mo1835z() {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            Enemy h = m8465h();
            if (this.i.m7529b(h)) {
                this.f8241U = Game.game.m7477t();
                this.f8242V.f2337x = (float) this.j.f;
                this.f8242V.f2338y = (float) this.j.g;
                PMath.m8823a(this.f8242V, this.o, 20.0f);
                this.f8244X.f2337x = this.f8242V.f2337x;
                this.f8244X.f2338y = this.f8242V.f2338y;
                PMath.m8823a(this.f8244X, this.o + 90.0f, 4.0f);
                this.f8243W.f2337x = h.f6909d.f2337x + (FastBadRandom.m8809b() * 4.0f);
                this.f8243W.f2338y = h.f6909d.f2338y + (FastBadRandom.m8809b() * 4.0f);
                gameScreen.m7851a(this, h, this.ac);
                m8469l();
            }
        }
    }
}
