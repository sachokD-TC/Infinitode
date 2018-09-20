package com.prineside.tdi.towers.types;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.g2d.C0444a;
import com.badlogic.gdx.graphics.g2d.C0453f;
import com.badlogic.gdx.graphics.g2d.C0459g;
import com.badlogic.gdx.graphics.g2d.C0459g.C0458a;
import com.badlogic.gdx.graphics.g2d.ParticleEmitter;
import com.badlogic.gdx.graphics.g2d.ParticleEmitter.C0440b;
import com.badlogic.gdx.graphics.g2d.ParticleEmitter.C0442e;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.C0710q;
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
import com.prineside.tdi.utility.MaterialColor.GREEN;
import com.prineside.tdi.utility.PMath;
import java.util.Iterator;

public class SniperTower extends Tower {
    /* renamed from: F */
    private static C0438n f8290F;
    /* renamed from: G */
    private static final GlobalUpgradeType[] f8291G = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SNIPER_PRICE_V, GlobalUpgradeType.TOWER_SNIPER_PRICE_IV, GlobalUpgradeType.TOWER_SNIPER_PRICE_III, GlobalUpgradeType.TOWER_SNIPER_PRICE_II, GlobalUpgradeType.TOWER_SNIPER_PRICE_I};
    /* renamed from: H */
    private static final GlobalUpgradeType[] f8292H = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SNIPER_MAX_TOWER_LEVEL_V, GlobalUpgradeType.TOWER_SNIPER_MAX_TOWER_LEVEL_IV, GlobalUpgradeType.TOWER_SNIPER_MAX_TOWER_LEVEL_III, GlobalUpgradeType.TOWER_SNIPER_MAX_TOWER_LEVEL_II, GlobalUpgradeType.TOWER_SNIPER_MAX_TOWER_LEVEL_I};
    /* renamed from: I */
    private static final GlobalUpgradeType[] f8293I = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SNIPER_MAX_UPGRADE_LEVEL_III, GlobalUpgradeType.TOWER_SNIPER_MAX_UPGRADE_LEVEL_II, GlobalUpgradeType.TOWER_SNIPER_MAX_UPGRADE_LEVEL_I};
    /* renamed from: J */
    private static final GlobalUpgradeType[] f8294J = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SNIPER_EXPERIENCE_BONUS_II, GlobalUpgradeType.TOWER_SNIPER_EXPERIENCE_BONUS};
    /* renamed from: K */
    private static final GlobalUpgradeType[] f8295K = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SNIPER_EXPERIENCE_GENERATION_II, GlobalUpgradeType.TOWER_SNIPER_EXPERIENCE_GENERATION};
    /* renamed from: L */
    private static final GlobalUpgradeType[] f8296L = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SNIPER_UPGRADE_PRICE_V, GlobalUpgradeType.TOWER_SNIPER_UPGRADE_PRICE_IV, GlobalUpgradeType.TOWER_SNIPER_UPGRADE_PRICE_III, GlobalUpgradeType.TOWER_SNIPER_UPGRADE_PRICE_II, GlobalUpgradeType.TOWER_SNIPER_UPGRADE_PRICE_I};
    /* renamed from: M */
    private static final C0710q<TowerStatType, TowerStatConfig> f8297M;
    /* renamed from: N */
    private static final TowerStatType[] f8298N = new TowerStatType[]{TowerStatType.RANGE, TowerStatType.DAMAGE, TowerStatType.ATTACK_SPEED, TowerStatType.ROTATION_SPEED, TowerStatType.AIM_TIME, TowerStatType.U_CRIT_CHANCE, TowerStatType.U_CRIT_MULTIPLIER};
    /* renamed from: O */
    private static final TowerUpgradeType[] f8299O = new TowerUpgradeType[]{TowerUpgradeType.RANGE, TowerUpgradeType.DAMAGE, TowerUpgradeType.ATTACK_SPEED, TowerUpgradeType.AIM_TIME};
    /* renamed from: P */
    private static final C0710q<TowerStatType, Integer> f8300P;
    /* renamed from: Q */
    private static final C0710q<TowerUpgradeType, Integer[]> f8301Q;
    /* renamed from: R */
    private static final C0710q<TowerStatType, Float[]> f8302R;
    /* renamed from: S */
    private static C0453f f8303S;
    /* renamed from: T */
    private static C0459g f8304T;
    /* renamed from: U */
    private static C0430b f8305U = C0430b.f1620c.m1222c();
    /* renamed from: V */
    private C0458a f8306V;
    /* renamed from: W */
    private Vector2 f8307W = new Vector2();
    /* renamed from: X */
    private float f8308X;
    /* renamed from: Y */
    private boolean f8309Y = false;
    /* renamed from: Z */
    private Enemy f8310Z;
    private boolean aa;
    private float ab = 0.0f;
    private long ac;
    private float ad;
    private float ae;
    private float af;
    private float ag;
    private float ah;
    private float ai;
    private int aj;

    static {
        C0710q c0710q = new C0710q();
        f8297M = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new TowerStatConfig(4.5f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SNIPER_RANGE_V, GlobalUpgradeType.TOWER_SNIPER_RANGE_IV, GlobalUpgradeType.TOWER_SNIPER_RANGE_III, GlobalUpgradeType.TOWER_SNIPER_RANGE_II, GlobalUpgradeType.TOWER_SNIPER_RANGE_I}));
        f8297M.mo542a(TowerStatType.DAMAGE, new TowerStatConfig(16.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SNIPER_DAMAGE_V, GlobalUpgradeType.TOWER_SNIPER_DAMAGE_IV, GlobalUpgradeType.TOWER_SNIPER_DAMAGE_III, GlobalUpgradeType.TOWER_SNIPER_DAMAGE_II, GlobalUpgradeType.TOWER_SNIPER_DAMAGE_I}));
        f8297M.mo542a(TowerStatType.ATTACK_SPEED, new TowerStatConfig(0.2f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SNIPER_ATTACK_SPEED_V, GlobalUpgradeType.TOWER_SNIPER_ATTACK_SPEED_IV, GlobalUpgradeType.TOWER_SNIPER_ATTACK_SPEED_III, GlobalUpgradeType.TOWER_SNIPER_ATTACK_SPEED_II, GlobalUpgradeType.TOWER_SNIPER_ATTACK_SPEED_I}));
        f8297M.mo542a(TowerStatType.ROTATION_SPEED, new TowerStatConfig(50.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SNIPER_ROTATION_SPEED_V, GlobalUpgradeType.TOWER_SNIPER_ROTATION_SPEED_IV, GlobalUpgradeType.TOWER_SNIPER_ROTATION_SPEED_III, GlobalUpgradeType.TOWER_SNIPER_ROTATION_SPEED_II, GlobalUpgradeType.TOWER_SNIPER_ROTATION_SPEED_I}));
        f8297M.mo542a(TowerStatType.AIM_TIME, new TowerStatConfig(0.6f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SNIPER_AIM_TIME_V, GlobalUpgradeType.TOWER_SNIPER_AIM_TIME_IV, GlobalUpgradeType.TOWER_SNIPER_AIM_TIME_III, GlobalUpgradeType.TOWER_SNIPER_AIM_TIME_II, GlobalUpgradeType.TOWER_SNIPER_AIM_TIME_I}));
        f8297M.mo542a(TowerStatType.U_CRIT_CHANCE, new TowerStatConfig(0.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SNIPER_U_CRIT_CHANCE_V, GlobalUpgradeType.TOWER_SNIPER_U_CRIT_CHANCE_IV, GlobalUpgradeType.TOWER_SNIPER_U_CRIT_CHANCE_III, GlobalUpgradeType.TOWER_SNIPER_U_CRIT_CHANCE_II, GlobalUpgradeType.TOWER_SNIPER_U_CRIT_CHANCE_I}));
        f8297M.mo542a(TowerStatType.U_CRIT_MULTIPLIER, new TowerStatConfig(0.0f, new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SNIPER_U_CRIT_DAMAGE_V, GlobalUpgradeType.TOWER_SNIPER_U_CRIT_DAMAGE_IV, GlobalUpgradeType.TOWER_SNIPER_U_CRIT_DAMAGE_III, GlobalUpgradeType.TOWER_SNIPER_U_CRIT_DAMAGE_II, GlobalUpgradeType.TOWER_SNIPER_U_CRIT_DAMAGE_I}));
        c0710q = new C0710q();
        f8300P = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, Integer.valueOf(0));
        f8300P.mo542a(TowerStatType.DAMAGE, Integer.valueOf(1));
        f8300P.mo542a(TowerStatType.ATTACK_SPEED, Integer.valueOf(2));
        f8300P.mo542a(TowerStatType.AIM_TIME, Integer.valueOf(3));
        c0710q = new C0710q();
        f8301Q = c0710q;
        c0710q.mo542a(TowerUpgradeType.RANGE, new Integer[]{Integer.valueOf(60), Integer.valueOf(89), Integer.valueOf(136), Integer.valueOf(212), Integer.valueOf(338), Integer.valueOf(550), Integer.valueOf(915), Integer.valueOf(1554), Integer.valueOf(2695), Integer.valueOf(4771)});
        f8301Q.mo542a(TowerUpgradeType.DAMAGE, new Integer[]{Integer.valueOf(107), Integer.valueOf(152), Integer.valueOf(220), Integer.valueOf(321), Integer.valueOf(484), Integer.valueOf(781), Integer.valueOf(1282), Integer.valueOf(2098), Integer.valueOf(3548), Integer.valueOf(6083)});
        f8301Q.mo542a(TowerUpgradeType.ATTACK_SPEED, new Integer[]{Integer.valueOf(76), Integer.valueOf(102), Integer.valueOf(135), Integer.valueOf(189), Integer.valueOf(270), Integer.valueOf(383), Integer.valueOf(577), Integer.valueOf(886), Integer.valueOf(1348), Integer.valueOf(2077)});
        f8301Q.mo542a(TowerUpgradeType.AIM_TIME, new Integer[]{Integer.valueOf(92), Integer.valueOf(138), Integer.valueOf(212), Integer.valueOf(330), Integer.valueOf(527), Integer.valueOf(870), Integer.valueOf(1487), Integer.valueOf(2582), Integer.valueOf(4660), Integer.valueOf(8341)});
        c0710q = new C0710q();
        f8302R = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new Float[]{Float.valueOf(1.172f), Float.valueOf(1.349f), Float.valueOf(1.532f), Float.valueOf(1.715f), Float.valueOf(1.903f), Float.valueOf(2.096f), Float.valueOf(2.296f), Float.valueOf(2.501f), Float.valueOf(2.704f), Float.valueOf(2.916f)});
        f8302R.mo542a(TowerStatType.DAMAGE, new Float[]{Float.valueOf(1.86f), Float.valueOf(3.048f), Float.valueOf(4.48f), Float.valueOf(5.925f), Float.valueOf(7.439f), Float.valueOf(9.399f), Float.valueOf(11.51f), Float.valueOf(13.43f), Float.valueOf(15.84f), Float.valueOf(18.0f)});
        f8302R.mo542a(TowerStatType.ATTACK_SPEED, new Float[]{Float.valueOf(1.25f), Float.valueOf(1.543f), Float.valueOf(1.843f), Float.valueOf(2.185f), Float.valueOf(2.524f), Float.valueOf(2.891f), Float.valueOf(3.268f), Float.valueOf(3.66f), Float.valueOf(4.04f), Float.valueOf(4.507f)});
        f8302R.mo542a(TowerStatType.AIM_TIME, new Float[]{Float.valueOf(0.93f), Float.valueOf(0.851f), Float.valueOf(0.7723f), Float.valueOf(0.6917f), Float.valueOf(0.6133f), Float.valueOf(0.5438f), Float.valueOf(0.4771f), Float.valueOf(0.414f), Float.valueOf(0.3617f), Float.valueOf(0.3141f)});
    }

    public SniperTower() {
        super(TowerType.SNIPER);
        if (f8290F == null) {
            f8290F = Game.game.f6561E.m1442a("tower-aim");
            C0453f c0453f = new C0453f();
            f8303S = c0453f;
            c0453f.m1353a(Gdx.files.mo277b("particles/crit_hit.prt"), Game.game.f6561E, null);
            C0453f c0453f2 = f8303S;
            int i = c0453f2.f1876a.f3001b;
            for (int i2 = 0; i2 < i; i2++) {
                ((ParticleEmitter) c0453f2.f1876a.m2291a(i2)).f1782z = false;
            }
            f8304T = new C0459g(f8303S);
        }
        this.ac = Game.game.m7477t();
    }

    /* renamed from: A */
    public final GlobalUpgradeType mo1811A() {
        return GlobalUpgradeType.TOWER_SNIPER;
    }

    /* renamed from: B */
    public final GlobalUpgradeType mo1812B() {
        return GlobalUpgradeType.TOWER_SNIPER_STARTING_EXPERIENCE;
    }

    /* renamed from: C */
    public final GlobalUpgradeType[] mo1813C() {
        return f8294J;
    }

    /* renamed from: D */
    public final GlobalUpgradeType[] mo1814D() {
        return f8295K;
    }

    /* renamed from: E */
    public final GlobalUpgradeType[] mo1815E() {
        return f8291G;
    }

    /* renamed from: F */
    public final GlobalUpgradeType[] mo1816F() {
        return f8292H;
    }

    /* renamed from: G */
    public final GlobalUpgradeType[] mo1817G() {
        return f8293I;
    }

    /* renamed from: a */
    public final float mo1818a(TowerStatType towerStatType, int i) {
        switch (towerStatType) {
            case U_CRIT_CHANCE:
                switch (i) {
                    case 1:
                        return 1.1f;
                    case 2:
                        return 1.25f;
                    case 3:
                        return 1.5f;
                }
                break;
            case U_CRIT_MULTIPLIER:
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
        Game.game.logger.m7510b("SniperTower", "Can't calculate unique bonus for stat type: " + towerStatType);
        return 1.0f;
    }

    /* renamed from: a */
    public final int mo1819a(int i, int i2) {
        int intValue = ((Integer[]) f8301Q.m2467a(f8299O[i]))[i2 - 1].intValue();
        float f = 1.0f;
        for (GlobalUpgradeType globalUpgradeType : f8296L) {
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
            if (towerStatType == TowerStatType.U_CRIT_CHANCE) {
                float f2;
                for (GlobalUpgradeType globalUpgradeType2 : ((TowerStatConfig) f8297M.m2467a((Object) towerStatType)).f8001b) {
                    if (GlobalUpgrade.m7492a(globalUpgradeType2)) {
                        f2 = GlobalUpgrade.m7495c(globalUpgradeType2).f6630u[0];
                        break;
                    }
                }
                f2 = 0.0f;
                return ((((float) (i - 1)) / 19.0f) * 24.0f) + (f2 + 10.0f);
            } else if (towerStatType == TowerStatType.U_CRIT_MULTIPLIER) {
                for (GlobalUpgradeType globalUpgradeType22 : ((TowerStatConfig) f8297M.m2467a((Object) towerStatType)).f8001b) {
                    if (GlobalUpgrade.m7492a(globalUpgradeType22)) {
                        f = GlobalUpgrade.m7495c(globalUpgradeType22).f6630u[0];
                        break;
                    }
                }
                return 2.0f + ((((float) (i - 1)) / 9.0f) * ((f * 0.01f) + 2.0f));
            } else {
                throw new RuntimeException("Tower type " + this.k.name() + " has no unique stat named " + towerStatType.name());
            }
        } else if (f8297M.m2474c((Object) towerStatType)) {
            TowerStatConfig towerStatConfig = (TowerStatConfig) f8297M.m2467a((Object) towerStatType);
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
            if (!f8300P.m2474c((Object) towerStatType)) {
                return f;
            }
            i2 = iArr[((Integer) f8300P.m2467a((Object) towerStatType)).intValue()];
            return i2 != 0 ? f * ((Float[]) f8302R.m2467a((Object) towerStatType))[i2 - 1].floatValue() : f;
        } else {
            throw new RuntimeException("Tower type " + this.k.name() + " has no stat named " + towerStatType.name());
        }
    }

    /* renamed from: b */
    public final void dispose() {
        if (this.f8306V != null) {
            f8304T.m1384a(this.f8306V);
        }
    }

    /* renamed from: c */
    public final void mo1836c(float f) {
        int i;
        int i2;
        ParticleEmitter particleEmitter;
        boolean[] zArr;
        int length;
        int i3;
        C0453f c0453f;
        int i4;
        if (this.j.l && m8465h() != null && this.aa) {
            float f2 = (60.0f * (1.0f - this.ab)) + 4.0f;
            f8305U.f1647L = this.ab;
            this.h.f6559C.m1410a(f8305U);
            this.h.f6559C.mo371a(f8290F, ((float) this.j.f) - (f2 / 2.0f), (float) this.j.g, f2 / 2.0f, 0.0f, f2, 64.0f, 1.0f, 1.0f, this.o);
            this.h.f6559C.m1410a(C0430b.f1620c);
        }
        float f3 = f * ((float) Game.game.f6585r);
        if (this.f8309Y) {
            if (this.f8306V == null) {
                this.f8306V = (C0458a) f8304T.m965b();
            }
            this.f8309Y = false;
            C0453f c0453f2 = this.f8306V;
            float f4 = this.f8307W.f2337x;
            f2 = this.f8307W.f2338y;
            i = c0453f2.f1876a.f3001b;
            for (i2 = 0; i2 < i; i2++) {
                particleEmitter = (ParticleEmitter) c0453f2.f1876a.m2291a(i2);
                if (particleEmitter.f1778v) {
                    float f5 = f4 - particleEmitter.f1764h;
                    float f6 = f2 - particleEmitter.f1765i;
                    zArr = particleEmitter.f1768l;
                    length = zArr.length;
                    for (i3 = 0; i3 < length; i3++) {
                        if (zArr[i3]) {
                            particleEmitter.f1761e[i3].m1262b(f5, f6);
                        }
                    }
                }
                particleEmitter.f1764h = f4;
                particleEmitter.f1765i = f2;
            }
            C0442e c0442e = ((ParticleEmitter) this.f8306V.f1876a.m2304c()).f1758b;
            float f7 = this.f8308X - 270.0f;
            float f8 = f7 - 15.0f;
            f7 += 15.0f;
            c0442e.f1724d = f8;
            c0442e.f1725e = f7;
            c0453f = this.f8306V;
            i4 = c0453f.f1876a.f3001b;
            for (i3 = 0; i3 < i4; i3++) {
                ((ParticleEmitter) c0453f.f1876a.m2291a(i3)).m1300b();
            }
        }
        if (this.f8306V != null) {
            Object obj;
            c0453f = this.f8306V;
            i4 = c0453f.f1876a.f3001b;
            for (i3 = 0; i3 < i4; i3++) {
                particleEmitter = (ParticleEmitter) c0453f.f1876a.m2291a(i3);
                obj = ((!particleEmitter.f1779w || particleEmitter.f1770n) && particleEmitter.f1777u >= particleEmitter.f1776t && particleEmitter.f1775s >= particleEmitter.f1774r && particleEmitter.f1767k == 0) ? 1 : null;
                if (obj == null) {
                    obj = null;
                    break;
                }
            }
            obj = 1;
            if (obj == null) {
                boolean[] zArr2;
                C0440b[] c0440bArr;
                C0453f c0453f3 = this.f8306V;
                int i5 = c0453f3.f1876a.f3001b;
                for (i4 = 0; i4 < i5; i4++) {
                    particleEmitter = (ParticleEmitter) c0453f3.f1876a.m2291a(i4);
                    particleEmitter.f1759c += 1000.0f * f3;
                    if (particleEmitter.f1759c >= 1.0f) {
                        i = (int) particleEmitter.f1759c;
                        particleEmitter.f1759c -= (float) i;
                        if (particleEmitter.f1777u < particleEmitter.f1776t) {
                            particleEmitter.f1777u += (float) i;
                        } else {
                            Object obj2 = null;
                            if (particleEmitter.f1769m) {
                                particleEmitter.f1769m = false;
                                particleEmitter.m1296a();
                            }
                            if (particleEmitter.f1775s < particleEmitter.f1774r) {
                                particleEmitter.f1775s += (float) i;
                            } else if (!particleEmitter.f1779w || particleEmitter.f1770n) {
                                obj2 = 1;
                            } else {
                                particleEmitter.m1301c();
                            }
                            if (obj2 == null) {
                                particleEmitter.f1773q += i;
                                f7 = ((float) particleEmitter.f1771o) + (((float) particleEmitter.f1772p) * particleEmitter.f1757a.m1280a(particleEmitter.f1775s / particleEmitter.f1774r));
                                if (f7 > 0.0f) {
                                    f7 = 1000.0f / f7;
                                    if (((float) particleEmitter.f1773q) >= f7) {
                                        i2 = Math.min((int) (((float) particleEmitter.f1773q) / f7), particleEmitter.f1763g - particleEmitter.f1767k);
                                        particleEmitter.f1773q = (int) (((float) particleEmitter.f1773q) - (((float) i2) * f7));
                                        particleEmitter.f1773q = (int) (((float) particleEmitter.f1773q) % f7);
                                        particleEmitter.m1297a(i2);
                                    }
                                }
                                if (particleEmitter.f1767k < particleEmitter.f1762f) {
                                    particleEmitter.m1297a(particleEmitter.f1762f - particleEmitter.f1767k);
                                }
                            }
                        }
                        zArr2 = particleEmitter.f1768l;
                        i2 = particleEmitter.f1767k;
                        c0440bArr = particleEmitter.f1761e;
                        int length2 = zArr2.length;
                        i3 = i2;
                        i2 = 0;
                        while (i2 < length2) {
                            if (zArr2[i2] && !particleEmitter.m1299a(c0440bArr[i2], f3, i)) {
                                zArr2[i2] = false;
                                i3--;
                            }
                            i2++;
                        }
                        particleEmitter.f1767k = i3;
                    }
                }
                c0453f3 = this.f8306V;
                C0444a c0444a = Game.game.f6559C;
                i = c0453f3.f1876a.f3001b;
                for (i2 = 0; i2 < i; i2++) {
                    particleEmitter = (ParticleEmitter) c0453f3.f1876a.m2291a(i2);
                    particleEmitter.f1759c += 1000.0f * f3;
                    if (particleEmitter.f1759c < 1.0f) {
                        if (particleEmitter.f1781y) {
                            c0444a.mo368a(1, 771);
                        } else if (particleEmitter.f1780x) {
                            c0444a.mo368a(770, 1);
                        } else {
                            c0444a.mo368a(770, 771);
                        }
                        C0440b[] c0440bArr2 = particleEmitter.f1761e;
                        zArr2 = particleEmitter.f1768l;
                        int length3 = zArr2.length;
                        for (i3 = 0; i3 < length3; i3++) {
                            if (zArr2[i3]) {
                                c0440bArr2[i3].m1256a(c0444a);
                            }
                        }
                        if (particleEmitter.f1782z && (particleEmitter.f1780x || particleEmitter.f1781y)) {
                            c0444a.mo368a(770, 771);
                        }
                    } else {
                        int i6 = (int) particleEmitter.f1759c;
                        particleEmitter.f1759c -= (float) i6;
                        if (particleEmitter.f1781y) {
                            c0444a.mo368a(1, 771);
                        } else if (particleEmitter.f1780x) {
                            c0444a.mo368a(770, 1);
                        } else {
                            c0444a.mo368a(770, 771);
                        }
                        c0440bArr = particleEmitter.f1761e;
                        zArr = particleEmitter.f1768l;
                        i4 = particleEmitter.f1767k;
                        length = zArr.length;
                        i3 = i4;
                        for (i4 = 0; i4 < length; i4++) {
                            if (zArr[i4]) {
                                C0440b c0440b = c0440bArr[i4];
                                if (particleEmitter.m1299a(c0440b, f3, i6)) {
                                    c0440b.m1256a(c0444a);
                                } else {
                                    zArr[i4] = false;
                                    i3--;
                                }
                            }
                        }
                        particleEmitter.f1767k = i3;
                        if (particleEmitter.f1782z && (particleEmitter.f1780x || particleEmitter.f1781y)) {
                            c0444a.mo368a(770, 771);
                        }
                        if (particleEmitter.f1777u < particleEmitter.f1776t) {
                            particleEmitter.f1777u += (float) i6;
                        } else {
                            if (particleEmitter.f1769m) {
                                particleEmitter.f1769m = false;
                                particleEmitter.m1296a();
                            }
                            if (particleEmitter.f1775s < particleEmitter.f1774r) {
                                particleEmitter.f1775s += (float) i6;
                            } else if (particleEmitter.f1779w && !particleEmitter.f1770n) {
                                particleEmitter.m1301c();
                            }
                            particleEmitter.f1773q += i6;
                            float a = ((float) particleEmitter.f1771o) + (((float) particleEmitter.f1772p) * particleEmitter.f1757a.m1280a(particleEmitter.f1775s / particleEmitter.f1774r));
                            if (a > 0.0f) {
                                a = 1000.0f / a;
                                if (((float) particleEmitter.f1773q) >= a) {
                                    i6 = Math.min((int) (((float) particleEmitter.f1773q) / a), particleEmitter.f1763g - i3);
                                    particleEmitter.f1773q = (int) (((float) particleEmitter.f1773q) - (((float) i6) * a));
                                    particleEmitter.f1773q = (int) (((float) particleEmitter.f1773q) % a);
                                    particleEmitter.m1297a(i6);
                                }
                            }
                            if (i3 < particleEmitter.f1762f) {
                                particleEmitter.m1297a(particleEmitter.f1762f - i3);
                            }
                        }
                    }
                }
                return;
            }
            f8304T.m1384a(this.f8306V);
            this.f8306V = null;
        }
    }

    /* renamed from: d */
    public final void mo1821d(int i) {
        int i2 = 0;
        Enemy h = m8465h();
        if (h != null) {
            float c = PMath.m8827c((float) this.j.f, (float) this.j.g, h.f6909d.f2337x, h.f6909d.f2338y);
            float a = PMath.m8819a(this.o, c);
            float f = (((float) i) / 1000000.0f) * this.af;
            if (f >= Math.abs(a)) {
                this.o = c;
            } else if (a < 0.0f) {
                this.o -= f;
            } else {
                this.o += f;
            }
            if (PMath.m8819a(this.o, c) < 3.0f) {
                if (this.f8310Z != h) {
                    this.f8310Z = h;
                    this.ab = 0.0f;
                }
                this.aa = true;
            } else {
                this.aa = false;
                this.ab = 0.0f;
            }
            if (this.aa) {
                float f2;
                if (h.f6915j != null) {
                    Iterator it = h.f6915j.f7985q.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        i3 = ((WalkableTile) it.next()).f7986r + i3;
                    }
                    int i4 = i3 - 1;
                    if (i4 >= 0) {
                        i2 = i4;
                    }
                    f2 = 1.0f - (((float) i2) * 0.05f);
                    if (f2 < 0.3f) {
                        f2 = 0.3f;
                    }
                } else {
                    f2 = 1.0f;
                }
                long t = Game.game.m7477t() - this.ac;
                this.ab = (f2 * (((float) t) / (this.ag * 1000000.0f))) + this.ab;
                if (this.ab > 1.0f) {
                    this.ab = 1.0f;
                }
            } else {
                this.ab = 0.0f;
            }
        } else {
            this.ab = 0.0f;
            this.aa = false;
        }
        this.ac = Game.game.m7477t();
    }

    /* renamed from: j */
    public final void mo1822j() {
        super.mo1822j();
        this.ad = m8442a(TowerStatType.DAMAGE);
        this.ae = m8442a(TowerStatType.ATTACK_SPEED);
        this.af = m8442a(TowerStatType.ROTATION_SPEED);
        this.ag = m8442a(TowerStatType.AIM_TIME);
        this.ah = m8442a(TowerStatType.U_CRIT_CHANCE) * 0.01f;
        this.ai = m8442a(TowerStatType.U_CRIT_MULTIPLIER);
        this.aj = (int) (1000000.0f / this.ae);
    }

    /* renamed from: m */
    public final void mo1839m() {
        float f = 0.0f;
        Gdx.graphics.mo293b().glEnable(3042);
        if (!Game.game.f6583o && Game.game.m7477t() - this.y < 300000) {
            float t = 1.0f - (((float) (Game.game.m7477t() - this.y)) / 300000.0f);
            Vector2 d = PMath.m8828d((float) this.j.f, (float) this.j.g, this.o, 12.0f);
            this.h.f6560D.m1455a(new C0430b(1.0f, 1.0f, 1.0f, 0.3f * t));
            this.h.f6560D.m1452a(d.f2337x, d.f2338y, this.f8307W.f2337x, this.f8307W.f2338y);
            float f2 = 1.0f - t;
            float f3 = f2 - 0.25f;
            t = f2 + 0.25f;
            if (f3 >= 0.0f) {
                f = f3;
            }
            if (t > 1.0f) {
                t = 1.0f;
            }
            f3 = d.f2337x + ((this.f8307W.f2337x - d.f2337x) * f);
            f = (f * (this.f8307W.f2338y - d.f2338y)) + d.f2338y;
            float f4 = d.f2337x + ((this.f8307W.f2337x - d.f2337x) * t);
            t = (t * (this.f8307W.f2338y - d.f2338y)) + d.f2338y;
            this.h.f6560D.m1455a(new C0430b(1.0f, 1.0f, 1.0f, (1.0f - f2) * 0.6f));
            this.h.f6560D.m1452a(f3, f, f4, t);
        }
    }

    /* renamed from: n */
    public final String mo1823n() {
        return Game.f6551e.m2416a("tower_name_SNIPER");
    }

    /* renamed from: o */
    public final String mo1824o() {
        return Game.f6551e.m2416a("tower_description_SNIPER");
    }

    /* renamed from: p */
    public final C0430b mo1825p() {
        return GREEN.f8487f;
    }

    /* renamed from: q */
    public final String mo1826q() {
        return Game.f6551e.m2416a("tower_unique_stat_description_SNIPER");
    }

    /* renamed from: r */
    public final C0710q<TowerStatType, TowerStatConfig> mo1827r() {
        return f8297M;
    }

    /* renamed from: s */
    public final Type mo1828s() {
        return Type.SHOT_SNIPER;
    }

    /* renamed from: t */
    public final int mo1829t() {
        return 100;
    }

    /* renamed from: u */
    public final TowerStatType[] mo1830u() {
        return f8298N;
    }

    /* renamed from: v */
    public final TowerUpgradeType[] mo1831v() {
        return f8299O;
    }

    /* renamed from: w */
    public final boolean mo1832w() {
        return true;
    }

    /* renamed from: x */
    public final boolean mo1833x() {
        return m8465h() != null && this.aa && this.ab >= 1.0f;
    }

    /* renamed from: y */
    public final int mo1834y() {
        return this.aj;
    }

    /* renamed from: z */
    public final synchronized void mo1835z() {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            Enemy h = m8465h();
            if (this.i.m7529b(h)) {
                this.f8307W.f2337x = h.f6909d.f2337x;
                this.f8307W.f2338y = h.f6909d.f2338y;
                this.f8308X = this.o;
                if (FastBadRandom.m8809b() < this.ah) {
                    this.f8309Y = true;
                    gameScreen.m7851a(this, h, this.ad * this.ai);
                } else {
                    gameScreen.m7851a(this, h, this.ad);
                }
                m8469l();
            }
        }
    }
}
