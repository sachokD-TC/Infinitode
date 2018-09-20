package com.prineside.tdi.towers.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.math.C0522d;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0710q;
import com.prineside.tdi.DailyQuest.QuestType;
import com.prineside.tdi.Game;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgradeType;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.tiles.WalkableTile;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.TowerStat;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.towers.TowerUpgrade.TowerUpgradeType;
import com.prineside.tdi.utility.FastBadRandom;
import com.prineside.tdi.utility.MaterialColor.BLUE_GREY;
import com.prineside.tdi.utility.PMath;
import java.util.Iterator;

public class BlastTower extends Tower {
    /* renamed from: F */
    private static final GlobalUpgradeType[] f8165F = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BLAST_PRICE_V, GlobalUpgradeType.TOWER_BLAST_PRICE_IV, GlobalUpgradeType.TOWER_BLAST_PRICE_III, GlobalUpgradeType.TOWER_BLAST_PRICE_II, GlobalUpgradeType.TOWER_BLAST_PRICE_I};
    /* renamed from: G */
    private static final GlobalUpgradeType[] f8166G = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BLAST_MAX_TOWER_LEVEL_V, GlobalUpgradeType.TOWER_BLAST_MAX_TOWER_LEVEL_IV, GlobalUpgradeType.TOWER_BLAST_MAX_TOWER_LEVEL_III, GlobalUpgradeType.TOWER_BLAST_MAX_TOWER_LEVEL_II, GlobalUpgradeType.TOWER_BLAST_MAX_TOWER_LEVEL_I};
    /* renamed from: H */
    private static final GlobalUpgradeType[] f8167H = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BLAST_MAX_UPGRADE_LEVEL_III, GlobalUpgradeType.TOWER_BLAST_MAX_UPGRADE_LEVEL_II, GlobalUpgradeType.TOWER_BLAST_MAX_UPGRADE_LEVEL_I};
    /* renamed from: I */
    private static final GlobalUpgradeType[] f8168I = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BLAST_EXPERIENCE_BONUS_II, GlobalUpgradeType.TOWER_BLAST_EXPERIENCE_BONUS};
    /* renamed from: J */
    private static final GlobalUpgradeType[] f8169J = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BLAST_EXPERIENCE_GENERATION_II, GlobalUpgradeType.TOWER_BLAST_EXPERIENCE_GENERATION};
    /* renamed from: K */
    private static final GlobalUpgradeType[] f8170K = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BLAST_UPGRADE_PRICE_V, GlobalUpgradeType.TOWER_BLAST_UPGRADE_PRICE_IV, GlobalUpgradeType.TOWER_BLAST_UPGRADE_PRICE_III, GlobalUpgradeType.TOWER_BLAST_UPGRADE_PRICE_II, GlobalUpgradeType.TOWER_BLAST_UPGRADE_PRICE_I};
    /* renamed from: L */
    private static final C0710q<TowerStatType, TowerStatConfig> f8171L;
    /* renamed from: M */
    private static final TowerStatType[] f8172M = new TowerStatType[]{TowerStatType.RANGE, TowerStatType.DAMAGE, TowerStatType.ATTACK_SPEED, TowerStatType.STUN_CHANCE, TowerStatType.U_STUN_DURATION};
    /* renamed from: N */
    private static final TowerUpgradeType[] f8173N = new TowerUpgradeType[]{TowerUpgradeType.RANGE, TowerUpgradeType.DAMAGE, TowerUpgradeType.ATTACK_SPEED, TowerUpgradeType.STUN_CHANCE};
    /* renamed from: O */
    private static final C0710q<TowerStatType, Integer> f8174O;
    /* renamed from: P */
    private static final C0710q<TowerUpgradeType, Integer[]> f8175P;
    /* renamed from: Q */
    private static final C0710q<TowerStatType, Float[]> f8176Q;
    /* renamed from: R */
    private static C0438n f8177R;
    /* renamed from: V */
    private static final C0430b f8178V = new C0430b(-1868255489);
    /* renamed from: S */
    private long f8179S;
    /* renamed from: T */
    private final C0676a<Enemy> f8180T = new C0676a();
    /* renamed from: U */
    private boolean f8181U = false;
    /* renamed from: W */
    private long f8182W;
    /* renamed from: X */
    private long f8183X;
    /* renamed from: Y */
    private float f8184Y;
    /* renamed from: Z */
    private float f8185Z;
    private float aa;
    private float ab;
    private int ac;

    static {
        C0710q c0710q = new C0710q();
        f8171L = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new TowerStatConfig(1.75f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BLAST_RANGE_V, GlobalUpgradeType.TOWER_BLAST_RANGE_IV, GlobalUpgradeType.TOWER_BLAST_RANGE_III, GlobalUpgradeType.TOWER_BLAST_RANGE_II, GlobalUpgradeType.TOWER_BLAST_RANGE_I}));
        f8171L.mo542a(TowerStatType.DAMAGE, new TowerStatConfig(4.4f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BLAST_DAMAGE_V, GlobalUpgradeType.TOWER_BLAST_DAMAGE_IV, GlobalUpgradeType.TOWER_BLAST_DAMAGE_III, GlobalUpgradeType.TOWER_BLAST_DAMAGE_II, GlobalUpgradeType.TOWER_BLAST_DAMAGE_I}));
        f8171L.mo542a(TowerStatType.ATTACK_SPEED, new TowerStatConfig(0.4f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BLAST_ATTACK_SPEED_V, GlobalUpgradeType.TOWER_BLAST_ATTACK_SPEED_IV, GlobalUpgradeType.TOWER_BLAST_ATTACK_SPEED_III, GlobalUpgradeType.TOWER_BLAST_ATTACK_SPEED_II, GlobalUpgradeType.TOWER_BLAST_ATTACK_SPEED_I}));
        f8171L.mo542a(TowerStatType.STUN_CHANCE, new TowerStatConfig(10.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BLAST_STUN_CHANCE_V, GlobalUpgradeType.TOWER_BLAST_STUN_CHANCE_IV, GlobalUpgradeType.TOWER_BLAST_STUN_CHANCE_III, GlobalUpgradeType.TOWER_BLAST_STUN_CHANCE_II, GlobalUpgradeType.TOWER_BLAST_STUN_CHANCE_I}));
        f8171L.mo542a(TowerStatType.U_STUN_DURATION, new TowerStatConfig(0.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_BLAST_U_STUN_DURATION_V, GlobalUpgradeType.TOWER_BLAST_U_STUN_DURATION_IV, GlobalUpgradeType.TOWER_BLAST_U_STUN_DURATION_III, GlobalUpgradeType.TOWER_BLAST_U_STUN_DURATION_II, GlobalUpgradeType.TOWER_BLAST_U_STUN_DURATION_I}));
        c0710q = new C0710q();
        f8174O = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, Integer.valueOf(0));
        f8174O.mo542a(TowerStatType.DAMAGE, Integer.valueOf(1));
        f8174O.mo542a(TowerStatType.ATTACK_SPEED, Integer.valueOf(2));
        f8174O.mo542a(TowerStatType.STUN_CHANCE, Integer.valueOf(3));
        c0710q = new C0710q();
        f8175P = c0710q;
        c0710q.mo542a(TowerUpgradeType.RANGE, new Integer[]{Integer.valueOf(91), Integer.valueOf(138), Integer.valueOf(216), Integer.valueOf(347), Integer.valueOf(571), Integer.valueOf(964), Integer.valueOf(1669), Integer.valueOf(2961), Integer.valueOf(5381), Integer.valueOf(10009)});
        f8175P.mo542a(TowerUpgradeType.DAMAGE, new Integer[]{Integer.valueOf(137), Integer.valueOf(205), Integer.valueOf(312), Integer.valueOf(484), Integer.valueOf(765), Integer.valueOf(1232), Integer.valueOf(2021), Integer.valueOf(3376), Integer.valueOf(5740), Integer.valueOf(9931)});
        f8175P.mo542a(TowerUpgradeType.ATTACK_SPEED, new Integer[]{Integer.valueOf(79), Integer.valueOf(109), Integer.valueOf(155), Integer.valueOf(229), Integer.valueOf(337), Integer.valueOf(506), Integer.valueOf(801), Integer.valueOf(1304), Integer.valueOf(2070), Integer.valueOf(3460)});
        f8175P.mo542a(TowerUpgradeType.STUN_CHANCE, new Integer[]{Integer.valueOf(104), Integer.valueOf(150), Integer.valueOf(225), Integer.valueOf(349), Integer.valueOf(549), Integer.valueOf(908), Integer.valueOf(1467), Integer.valueOf(2473), Integer.valueOf(4219), Integer.valueOf(7558)});
        c0710q = new C0710q();
        f8176Q = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new Float[]{Float.valueOf(1.14f), Float.valueOf(1.282f), Float.valueOf(1.426f), Float.valueOf(1.577f), Float.valueOf(1.722f), Float.valueOf(1.872f), Float.valueOf(2.025f), Float.valueOf(2.193f), Float.valueOf(2.351f), Float.valueOf(2.526f)});
        f8176Q.mo542a(TowerStatType.DAMAGE, new Float[]{Float.valueOf(1.78f), Float.valueOf(2.676f), Float.valueOf(3.72f), Float.valueOf(4.874f), Float.valueOf(5.996f), Float.valueOf(7.391f), Float.valueOf(8.864f), Float.valueOf(10.46f), Float.valueOf(12.03f), Float.valueOf(13.51f)});
        f8176Q.mo542a(TowerStatType.ATTACK_SPEED, new Float[]{Float.valueOf(1.14f), Float.valueOf(1.314f), Float.valueOf(1.503f), Float.valueOf(1.69f), Float.valueOf(1.897f), Float.valueOf(2.12f), Float.valueOf(2.338f), Float.valueOf(2.588f), Float.valueOf(2.863f), Float.valueOf(3.147f)});
        f8176Q.mo542a(TowerStatType.STUN_CHANCE, new Float[]{Float.valueOf(1.115f), Float.valueOf(1.24f), Float.valueOf(1.376f), Float.valueOf(1.526f), Float.valueOf(1.682f), Float.valueOf(1.862f), Float.valueOf(2.043f), Float.valueOf(2.238f), Float.valueOf(2.446f), Float.valueOf(2.673f)});
    }

    public BlastTower() {
        super(TowerType.BLAST);
        if (f8177R == null) {
            f8177R = Game.game.f6561E.m1442a("range");
        }
    }

    /* renamed from: A */
    public final GlobalUpgradeType mo1811A() {
        return GlobalUpgradeType.TOWER_BLAST;
    }

    /* renamed from: B */
    public final GlobalUpgradeType mo1812B() {
        return GlobalUpgradeType.TOWER_BLAST_STARTING_EXPERIENCE;
    }

    /* renamed from: C */
    public final GlobalUpgradeType[] mo1813C() {
        return f8168I;
    }

    /* renamed from: D */
    public final GlobalUpgradeType[] mo1814D() {
        return f8169J;
    }

    /* renamed from: E */
    public final GlobalUpgradeType[] mo1815E() {
        return f8165F;
    }

    /* renamed from: F */
    public final GlobalUpgradeType[] mo1816F() {
        return f8166G;
    }

    /* renamed from: G */
    public final GlobalUpgradeType[] mo1817G() {
        return f8167H;
    }

    /* renamed from: a */
    public final float mo1818a(TowerStatType towerStatType, int i) {
        switch (towerStatType) {
            case U_STUN_DURATION:
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
        Game.game.logger.m7510b("BlastTower", "Can't calculate unique bonus for stat type: " + towerStatType);
        return 1.0f;
    }

    /* renamed from: a */
    public final int mo1819a(int i, int i2) {
        int intValue = ((Integer[]) f8175P.m2467a(f8173N[i]))[i2 - 1].intValue();
        float f = 1.0f;
        for (GlobalUpgradeType globalUpgradeType : f8170K) {
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
            if (towerStatType == TowerStatType.U_STUN_DURATION) {
                float f;
                for (GlobalUpgradeType globalUpgradeType2 : ((TowerStatConfig) f8171L.m2467a((Object) towerStatType)).f8001b) {
                    if (GlobalUpgrade.m7492a(globalUpgradeType2)) {
                        f = GlobalUpgrade.m7495c(globalUpgradeType2).f6630u[0];
                        break;
                    }
                }
                f = 0.0f;
                return 2.0f + ((f + 4.0f) * (((float) (i - 1)) / 19.0f));
            }
            throw new RuntimeException("Tower type " + this.k.name() + " has no unique stat named " + towerStatType.name());
        } else if (f8171L.m2474c((Object) towerStatType)) {
            TowerStatConfig towerStatConfig = (TowerStatConfig) f8171L.m2467a((Object) towerStatType);
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
            if (!f8174O.m2474c((Object) towerStatType)) {
                return f2;
            }
            i2 = iArr[((Integer) f8174O.m2467a((Object) towerStatType)).intValue()];
            return i2 != 0 ? f2 * ((Float[]) f8176Q.m2467a((Object) towerStatType))[i2 - 1].floatValue() : f2;
        } else {
            throw new RuntimeException("Tower type " + this.k.name() + " has no stat named " + towerStatType.name());
        }
    }

    /* renamed from: c */
    public final void mo1836c(float f) {
        long t = Game.game.m7477t() - this.f8179S;
        if (!Game.game.f6582n && t < 400000) {
            float f2 = ((float) t) / 400000.0f;
            float a = (this.z * 2.0f) * C0522d.f2372D.mo430a(f2);
            f8178V.f1647L = (1.0f - f2) * 0.2f;
            Game.game.f6559C.m1410a(f8178V);
            Game.game.f6559C.mo370a(f8177R, ((float) this.j.f) - (a / 2.0f), ((float) this.j.g) - (a / 2.0f), a, a);
        }
    }

    /* renamed from: c */
    public final void mo1837c(int i) {
        if (Game.game.m7477t() - this.f8183X > 150000) {
            synchronized (this.f8180T) {
                this.f8180T.mo530d();
                for (WalkableTile walkableTile : this.E) {
                    if (walkableTile.f7986r != 0) {
                        synchronized (walkableTile.f7984p) {
                            Iterator c = walkableTile.f7984p.m2489c();
                            while (c.hasNext()) {
                                Object obj = (Enemy) c.next();
                                if (obj.mo1755a(this.k) && PMath.m8820a((float) walkableTile.f, (float) walkableTile.g, obj.f6909d.f2337x, obj.f6909d.f2338y) < this.z) {
                                    this.f8180T.m2296a(obj);
                                }
                            }
                        }
                    }
                }
                if (!(this.f8181U || this.f8180T.f3001b == 0)) {
                    this.f8182W = Game.game.m7477t();
                }
                this.f8181U = this.f8180T.f3001b != 0;
            }
            this.f8183X = Game.game.m7477t();
        }
    }

    /* renamed from: d */
    public final void mo1821d(int i) {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            long t = Game.game.m7477t() - this.f8179S;
            if (this.f8181U && t >= ((long) this.ac) && Game.game.m7477t() - this.f8182W > 2000000) {
                Object obj;
                synchronized (this.f8180T) {
                    Iterator it = this.f8180T.iterator();
                    obj = null;
                    while (it.hasNext()) {
                        Object obj2;
                        Enemy enemy = (Enemy) it.next();
                        float a = PMath.m8820a((float) this.j.f, (float) this.j.g, enemy.f6909d.f2337x, enemy.f6909d.f2338y);
                        if (a < this.z) {
                            gameScreen.m7851a(this, enemy, this.f8184Y * (1.0f - (a / this.z)));
                            long j = (long) (this.ab * 1000000.0f);
                            float f = this.aa;
                            if (!enemy.mo1766i() || enemy.f6929x || FastBadRandom.m8809b() >= f * enemy.f6930y) {
                                obj2 = null;
                            } else {
                                enemy.f6931z = Game.game.m7477t();
                                enemy.f6894A = j;
                                enemy.f6929x = true;
                                enemy.f6930y *= 0.5f;
                                Game.game.f6563G.m7429a(QuestType.STUN_ENEMIES, 1);
                                obj2 = 1;
                            }
                            if (obj2 != null) {
                                m8455b(0.1f);
                            }
                            obj2 = 1;
                        } else {
                            obj2 = obj;
                        }
                        obj = obj2;
                    }
                }
                if (obj != null) {
                    this.f8179S = Game.game.m7477t();
                    m8469l();
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo1822j() {
        super.mo1822j();
        this.f8184Y = m8442a(TowerStatType.DAMAGE);
        this.f8185Z = m8442a(TowerStatType.ATTACK_SPEED);
        this.aa = m8442a(TowerStatType.STUN_CHANCE) * 0.01f;
        this.ab = m8442a(TowerStatType.U_STUN_DURATION);
        this.ac = (int) (1000000.0f / this.f8185Z);
    }

    /* renamed from: k */
    public final void mo1838k() {
        long t = Game.game.m7477t() - this.f8179S;
        float f = t > ((long) this.ac) ? 1.5f : 1.0f + ((((float) t) / ((float) this.ac)) * 0.5f);
        this.h.f6559C.mo371a(this.x, (float) this.j.i, (float) this.j.k, 32.0f, 32.0f, 64.0f, 64.0f, f, f, 0.0f);
    }

    /* renamed from: n */
    public final String mo1823n() {
        return Game.f6551e.m2416a("tower_name_BLAST");
    }

    /* renamed from: o */
    public final String mo1824o() {
        return Game.f6551e.m2416a("tower_description_BLAST");
    }

    /* renamed from: p */
    public final C0430b mo1825p() {
        return BLUE_GREY.f8425f;
    }

    /* renamed from: q */
    public final String mo1826q() {
        return Game.f6551e.m2416a("tower_unique_stat_description_BLAST");
    }

    /* renamed from: r */
    public final C0710q<TowerStatType, TowerStatConfig> mo1827r() {
        return f8171L;
    }

    /* renamed from: s */
    public final Type mo1828s() {
        return Type.SHOT_BLAST;
    }

    /* renamed from: t */
    public final int mo1829t() {
        return 120;
    }

    /* renamed from: u */
    public final TowerStatType[] mo1830u() {
        return f8172M;
    }

    /* renamed from: v */
    public final TowerUpgradeType[] mo1831v() {
        return f8173N;
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
