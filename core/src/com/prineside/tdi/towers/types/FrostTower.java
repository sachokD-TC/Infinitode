package com.prineside.tdi.towers.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.C0710q.C0706a;
import com.badlogic.gdx.utils.C0710q.C0707b;
import com.prineside.tdi.Game;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgradeType;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.enemies.effects.FreezeEffect;
import com.prineside.tdi.enemies.effects.FreezeMeltdownEffect;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.TowerStat;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.towers.TowerUpgrade.TowerUpgradeType;
import com.prineside.tdi.utility.MaterialColor.BLUE;
import java.util.Iterator;

public class FrostTower extends Tower {
    /* renamed from: F */
    private static final GlobalUpgradeType[] f8206F = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_FROST_PRICE_V, GlobalUpgradeType.TOWER_FROST_PRICE_IV, GlobalUpgradeType.TOWER_FROST_PRICE_III, GlobalUpgradeType.TOWER_FROST_PRICE_II, GlobalUpgradeType.TOWER_FROST_PRICE_I};
    /* renamed from: G */
    private static final GlobalUpgradeType[] f8207G = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_FROST_MAX_TOWER_LEVEL_V, GlobalUpgradeType.TOWER_FROST_MAX_TOWER_LEVEL_IV, GlobalUpgradeType.TOWER_FROST_MAX_TOWER_LEVEL_III, GlobalUpgradeType.TOWER_FROST_MAX_TOWER_LEVEL_II, GlobalUpgradeType.TOWER_FROST_MAX_TOWER_LEVEL_I};
    /* renamed from: H */
    private static final GlobalUpgradeType[] f8208H = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_FROST_MAX_UPGRADE_LEVEL_III, GlobalUpgradeType.TOWER_FROST_MAX_UPGRADE_LEVEL_II, GlobalUpgradeType.TOWER_FROST_MAX_UPGRADE_LEVEL_I};
    /* renamed from: I */
    private static final GlobalUpgradeType[] f8209I = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_FROST_EXPERIENCE_BONUS_II, GlobalUpgradeType.TOWER_FROST_EXPERIENCE_BONUS};
    /* renamed from: J */
    private static final GlobalUpgradeType[] f8210J = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_FROST_EXPERIENCE_GENERATION_II, GlobalUpgradeType.TOWER_FROST_EXPERIENCE_GENERATION};
    /* renamed from: K */
    private static final GlobalUpgradeType[] f8211K = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_FROST_UPGRADE_PRICE_V, GlobalUpgradeType.TOWER_FROST_UPGRADE_PRICE_IV, GlobalUpgradeType.TOWER_FROST_UPGRADE_PRICE_III, GlobalUpgradeType.TOWER_FROST_UPGRADE_PRICE_II, GlobalUpgradeType.TOWER_FROST_UPGRADE_PRICE_I};
    /* renamed from: L */
    private static final C0710q<TowerStatType, TowerStatConfig> f8212L;
    /* renamed from: M */
    private static final TowerStatType[] f8213M = new TowerStatType[]{TowerStatType.RANGE, TowerStatType.FREEZE_PERCENT, TowerStatType.FREEZE_TIME, TowerStatType.FREEZE_MELTDOWN_TIME, TowerStatType.U_POISON_DURATION_BONUS, TowerStatType.U_CHAIN_LIGHTNING_BONUS_LENGTH};
    /* renamed from: N */
    private static final TowerUpgradeType[] f8214N = new TowerUpgradeType[]{TowerUpgradeType.RANGE, TowerUpgradeType.FREEZE_PERCENT, TowerUpgradeType.FREEZE_TIME, TowerUpgradeType.FREEZE_MELTDOWN_TIME};
    /* renamed from: O */
    private static final C0710q<TowerStatType, Integer> f8215O;
    /* renamed from: P */
    private static final C0710q<TowerUpgradeType, Integer[]> f8216P;
    /* renamed from: Q */
    private static final C0710q<TowerStatType, Float[]> f8217Q;
    /* renamed from: R */
    private final C0710q<Enemy, Long> f8218R = new C0710q();
    /* renamed from: S */
    private FreezeEffect f8219S;
    /* renamed from: T */
    private C0676a<Enemy> f8220T = new C0676a();
    /* renamed from: U */
    private float f8221U;
    /* renamed from: V */
    private float f8222V;
    /* renamed from: W */
    private float f8223W;
    /* renamed from: X */
    private float f8224X;

    static {
        C0710q c0710q = new C0710q();
        f8212L = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new TowerStatConfig(2.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_FROST_RANGE_V, GlobalUpgradeType.TOWER_FROST_RANGE_IV, GlobalUpgradeType.TOWER_FROST_RANGE_III, GlobalUpgradeType.TOWER_FROST_RANGE_II, GlobalUpgradeType.TOWER_FROST_RANGE_I}));
        f8212L.mo542a(TowerStatType.FREEZE_PERCENT, new TowerStatConfig(20.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_FROST_FREEZE_PERCENT_V, GlobalUpgradeType.TOWER_FROST_FREEZE_PERCENT_IV, GlobalUpgradeType.TOWER_FROST_FREEZE_PERCENT_III, GlobalUpgradeType.TOWER_FROST_FREEZE_PERCENT_II, GlobalUpgradeType.TOWER_FROST_FREEZE_PERCENT_I}));
        f8212L.mo542a(TowerStatType.FREEZE_TIME, new TowerStatConfig(2.5f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_FROST_FREEZE_SPEED_V, GlobalUpgradeType.TOWER_FROST_FREEZE_SPEED_IV, GlobalUpgradeType.TOWER_FROST_FREEZE_SPEED_III, GlobalUpgradeType.TOWER_FROST_FREEZE_SPEED_II, GlobalUpgradeType.TOWER_FROST_FREEZE_SPEED_I}));
        f8212L.mo542a(TowerStatType.FREEZE_MELTDOWN_TIME, new TowerStatConfig(1.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_FROST_MELTDOWN_SPEED_V, GlobalUpgradeType.TOWER_FROST_MELTDOWN_SPEED_IV, GlobalUpgradeType.TOWER_FROST_MELTDOWN_SPEED_III, GlobalUpgradeType.TOWER_FROST_MELTDOWN_SPEED_II, GlobalUpgradeType.TOWER_FROST_MELTDOWN_SPEED_I}));
        f8212L.mo542a(TowerStatType.U_POISON_DURATION_BONUS, new TowerStatConfig(0.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_FROST_U_POISON_DURATION_BONUS_V, GlobalUpgradeType.TOWER_FROST_U_POISON_DURATION_BONUS_IV, GlobalUpgradeType.TOWER_FROST_U_POISON_DURATION_BONUS_III, GlobalUpgradeType.TOWER_FROST_U_POISON_DURATION_BONUS_II, GlobalUpgradeType.TOWER_FROST_U_POISON_DURATION_BONUS_I}));
        f8212L.mo542a(TowerStatType.U_CHAIN_LIGHTNING_BONUS_LENGTH, new TowerStatConfig(0.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_FROST_U_CHAIN_LIGHTNING_LENGTH_BONUS_V, GlobalUpgradeType.TOWER_FROST_U_CHAIN_LIGHTNING_LENGTH_BONUS_IV, GlobalUpgradeType.TOWER_FROST_U_CHAIN_LIGHTNING_LENGTH_BONUS_III, GlobalUpgradeType.TOWER_FROST_U_CHAIN_LIGHTNING_LENGTH_BONUS_II, GlobalUpgradeType.TOWER_FROST_U_CHAIN_LIGHTNING_LENGTH_BONUS_I}));
        c0710q = new C0710q();
        f8215O = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, Integer.valueOf(0));
        f8215O.mo542a(TowerStatType.FREEZE_PERCENT, Integer.valueOf(1));
        f8215O.mo542a(TowerStatType.FREEZE_TIME, Integer.valueOf(2));
        f8215O.mo542a(TowerStatType.FREEZE_MELTDOWN_TIME, Integer.valueOf(3));
        c0710q = new C0710q();
        f8216P = c0710q;
        c0710q.mo542a(TowerUpgradeType.RANGE, new Integer[]{Integer.valueOf(50), Integer.valueOf(77), Integer.valueOf(122), Integer.valueOf(198), Integer.valueOf(330), Integer.valueOf(564), Integer.valueOf(989), Integer.valueOf(1777), Integer.valueOf(3271), Integer.valueOf(6166)});
        f8216P.mo542a(TowerUpgradeType.FREEZE_PERCENT, new Integer[]{Integer.valueOf(79), Integer.valueOf(121), Integer.valueOf(191), Integer.valueOf(310), Integer.valueOf(516), Integer.valueOf(882), Integer.valueOf(1546), Integer.valueOf(2777), Integer.valueOf(5112), Integer.valueOf(9637)});
        f8216P.mo542a(TowerUpgradeType.FREEZE_TIME, new Integer[]{Integer.valueOf(54), Integer.valueOf(81), Integer.valueOf(124), Integer.valueOf(196), Integer.valueOf(313), Integer.valueOf(510), Integer.valueOf(866), Integer.valueOf(1514), Integer.valueOf(2714), Integer.valueOf(4907)});
        f8216P.mo542a(TowerUpgradeType.FREEZE_MELTDOWN_TIME, new Integer[]{Integer.valueOf(51), Integer.valueOf(74), Integer.valueOf(110), Integer.valueOf(170), Integer.valueOf(271), Integer.valueOf(445), Integer.valueOf(754), Integer.valueOf(1317), Integer.valueOf(2368), Integer.valueOf(4381)});
        c0710q = new C0710q();
        f8217Q = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new Float[]{Float.valueOf(1.15f), Float.valueOf(1.305f), Float.valueOf(1.469f), Float.valueOf(1.637f), Float.valueOf(1.817f), Float.valueOf(1.986f), Float.valueOf(2.171f), Float.valueOf(2.353f), Float.valueOf(2.536f), Float.valueOf(2.736f)});
        f8217Q.mo542a(TowerStatType.FREEZE_PERCENT, new Float[]{Float.valueOf(1.07f), Float.valueOf(1.142f), Float.valueOf(1.211f), Float.valueOf(1.281f), Float.valueOf(1.353f), Float.valueOf(1.427f), Float.valueOf(1.5f), Float.valueOf(1.572f), Float.valueOf(1.643f), Float.valueOf(1.719f)});
        f8217Q.mo542a(TowerStatType.FREEZE_TIME, new Float[]{Float.valueOf(0.93f), Float.valueOf(0.8481f), Float.valueOf(0.7628f), Float.valueOf(0.6815f), Float.valueOf(0.5975f), Float.valueOf(0.5196f), Float.valueOf(0.4448f), Float.valueOf(0.3763f), Float.valueOf(0.3166f), Float.valueOf(0.2636f)});
        f8217Q.mo542a(TowerStatType.FREEZE_MELTDOWN_TIME, new Float[]{Float.valueOf(1.175f), Float.valueOf(1.376f), Float.valueOf(1.603f), Float.valueOf(1.838f), Float.valueOf(2.096f), Float.valueOf(2.381f), Float.valueOf(2.684f), Float.valueOf(3.005f), Float.valueOf(3.355f), Float.valueOf(3.715f)});
    }

    public FrostTower() {
        super(TowerType.FROST);
    }

    /* renamed from: A */
    public final GlobalUpgradeType mo1811A() {
        return GlobalUpgradeType.TOWER_FROST;
    }

    /* renamed from: B */
    public final GlobalUpgradeType mo1812B() {
        return GlobalUpgradeType.TOWER_FROST_STARTING_EXPERIENCE;
    }

    /* renamed from: C */
    public final GlobalUpgradeType[] mo1813C() {
        return f8209I;
    }

    /* renamed from: D */
    public final GlobalUpgradeType[] mo1814D() {
        return f8210J;
    }

    /* renamed from: E */
    public final GlobalUpgradeType[] mo1815E() {
        return f8206F;
    }

    /* renamed from: F */
    public final GlobalUpgradeType[] mo1816F() {
        return f8207G;
    }

    /* renamed from: G */
    public final GlobalUpgradeType[] mo1817G() {
        return f8208H;
    }

    /* renamed from: a */
    public final float mo1818a(TowerStatType towerStatType, int i) {
        switch (towerStatType) {
            case U_POISON_DURATION_BONUS:
                switch (i) {
                    case 1:
                        return 1.1f;
                    case 2:
                        return 1.25f;
                    case 3:
                        return 1.5f;
                }
                break;
            case U_CHAIN_LIGHTNING_BONUS_LENGTH:
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
        Game.game.logger.m7510b("FrostTower", "Can't calculate unique bonus for stat type: " + towerStatType);
        return 1.0f;
    }

    /* renamed from: a */
    public final int mo1819a(int i, int i2) {
        int intValue = ((Integer[]) f8216P.m2467a(f8214N[i]))[i2 - 1].intValue();
        float f = 1.0f;
        for (GlobalUpgradeType globalUpgradeType : f8211K) {
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
            if (towerStatType == TowerStatType.U_POISON_DURATION_BONUS) {
                float f2;
                for (GlobalUpgradeType globalUpgradeType2 : ((TowerStatConfig) f8212L.m2467a((Object) towerStatType)).f8001b) {
                    if (GlobalUpgrade.m7492a(globalUpgradeType2)) {
                        f2 = GlobalUpgrade.m7495c(globalUpgradeType2).f6630u[0];
                        break;
                    }
                }
                f2 = 0.0f;
                return ((((float) (i - 1)) / 19.0f) * 5.0f) + (f2 + 1.5f);
            } else if (towerStatType == TowerStatType.U_CHAIN_LIGHTNING_BONUS_LENGTH) {
                for (GlobalUpgradeType globalUpgradeType22 : ((TowerStatConfig) f8212L.m2467a((Object) towerStatType)).f8001b) {
                    if (GlobalUpgrade.m7492a(globalUpgradeType22)) {
                        f = GlobalUpgrade.m7495c(globalUpgradeType22).f6630u[0];
                        break;
                    }
                }
                return ((((float) (i - 1)) / 19.0f) * 1.5f) + (0.5f + f);
            } else {
                throw new RuntimeException("Tower type " + this.k.name() + " has no unique stat named " + towerStatType.name());
            }
        } else if (f8212L.m2474c((Object) towerStatType)) {
            TowerStatConfig towerStatConfig = (TowerStatConfig) f8212L.m2467a((Object) towerStatType);
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
            if (!f8215O.m2474c((Object) towerStatType)) {
                return f;
            }
            i2 = iArr[((Integer) f8215O.m2467a((Object) towerStatType)).intValue()];
            return i2 != 0 ? f * ((Float[]) f8217Q.m2467a((Object) towerStatType))[i2 - 1].floatValue() : f;
        } else {
            throw new RuntimeException("Tower type " + this.k.name() + " has no stat named " + towerStatType.name());
        }
    }

    /* renamed from: c */
    public final void mo1837c(int i) {
        long u = Game.game.m7478u();
        this.f8220T.mo530d();
        this.i.m7522a(this.f8220T, (float) this.j.f, (float) this.j.g, this.z);
        synchronized (this.f8218R) {
            Iterator it = this.f8220T.iterator();
            while (it.hasNext()) {
                Object obj = (Enemy) it.next();
                if (obj.mo1755a(this.k)) {
                    if (!this.f8218R.m2474c(obj)) {
                        Object obj2 = this.f8219S;
                        Object obj3 = null;
                        synchronized (obj.f6921p) {
                            if (!obj.f6921p.m2474c(obj2)) {
                                obj3 = 1;
                            }
                            obj.f6921p.mo542a(obj2, Long.valueOf(Game.game.m7477t()));
                        }
                        if (obj3 != null) {
                            obj.f6925t = true;
                        }
                    }
                    this.f8218R.mo542a(obj, Long.valueOf(u));
                }
            }
            C0706a b = this.f8218R.mo544b();
            while (b.hasNext()) {
                C0707b a = b.mo538a();
                if (((Long) a.f3164b).longValue() != u) {
                    long j = (long) ((this.f8222V * 1000.0f) * 1000.0f);
                    Enemy enemy = (Enemy) a.f3163a;
                    Object obj4 = this.f8219S;
                    obj = new FreezeMeltdownEffect(obj4.f6933b, Game.game.m7477t(), j);
                    synchronized (enemy.f6921p) {
                        j = Game.game.m7477t() - ((Long) enemy.f6921p.m2467a(obj4)).longValue();
                        enemy.f6921p.mo545b(obj4);
                    }
                    enemy.f6925t = true;
                    float f = (((float) j) / 1000000.0f) / obj4.f6934c;
                    if (f < 1.0f) {
                        obj.f6940c = (long) (((float) obj.f6940c) * f);
                        obj.f6938a = f * obj.f6938a;
                    }
                    synchronized (enemy.f6922q) {
                        enemy.f6922q.m2486a(obj);
                    }
                    b.remove();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo1821d(int i) {
        this.o = (((float) (Game.game.m7477t() % 1000000)) / 1000000.0f) * 360.0f;
    }

    /* renamed from: j */
    public final void mo1822j() {
        super.mo1822j();
        this.f8221U = m8442a(TowerStatType.FREEZE_PERCENT);
        this.f8222V = m8442a(TowerStatType.FREEZE_MELTDOWN_TIME);
        this.f8223W = m8442a(TowerStatType.U_POISON_DURATION_BONUS);
        this.f8224X = m8442a(TowerStatType.U_CHAIN_LIGHTNING_BONUS_LENGTH);
        if (this.f8219S == null) {
            this.f8219S = new FreezeEffect();
            this.f8219S.f6937f = this;
        }
        this.f8219S.f6933b = this.f8221U;
        this.f8219S.f6932a = this.f8219S.f6933b / m8442a(TowerStatType.FREEZE_TIME);
        this.f8219S.f6934c = this.f8219S.f6933b / this.f8219S.f6932a;
        this.f8219S.f6935d = this.f8223W;
        this.f8219S.f6936e = this.f8224X;
    }

    /* renamed from: n */
    public final String mo1823n() {
        return Game.f6551e.m2416a("tower_name_FROST");
    }

    /* renamed from: o */
    public final String mo1824o() {
        return Game.f6551e.m2416a("tower_description_FROST");
    }

    /* renamed from: p */
    public final C0430b mo1825p() {
        return BLUE.f8411f;
    }

    /* renamed from: q */
    public final String mo1826q() {
        return Game.f6551e.m2416a("tower_unique_stat_description_FROST");
    }

    /* renamed from: r */
    public final C0710q<TowerStatType, TowerStatConfig> mo1827r() {
        return f8212L;
    }

    /* renamed from: t */
    public final int mo1829t() {
        return 70;
    }

    /* renamed from: u */
    public final TowerStatType[] mo1830u() {
        return f8213M;
    }

    /* renamed from: v */
    public final TowerUpgradeType[] mo1831v() {
        return f8214N;
    }

    /* renamed from: w */
    public final boolean mo1832w() {
        return false;
    }
}
