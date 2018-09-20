package com.prineside.tdi.towers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.C0507i;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0710q;
import com.prineside.tdi.AsyncUpdatable;
import com.prineside.tdi.AsyncUpdater;
import com.prineside.tdi.Game;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgradeType;
import com.prineside.tdi.Map;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.tiles.WalkableTile;
import com.prineside.tdi.tiles.types.RoadTile;
import com.prineside.tdi.tiles.types.SpaceTile;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.towers.TowerUpgrade.TowerUpgradeType;
import com.prineside.tdi.towers.types.AirTower;
import com.prineside.tdi.towers.types.BasicTower;
import com.prineside.tdi.towers.types.BlastTower;
import com.prineside.tdi.towers.types.CannonTower;
import com.prineside.tdi.towers.types.FrostTower;
import com.prineside.tdi.towers.types.MinigunTower;
import com.prineside.tdi.towers.types.MissileTower;
import com.prineside.tdi.towers.types.MultishotTower;
import com.prineside.tdi.towers.types.SniperTower;
import com.prineside.tdi.towers.types.SplashTower;
import com.prineside.tdi.towers.types.TeslaTower;
import com.prineside.tdi.towers.types.VenomTower;
import com.prineside.tdi.utility.CheatSafeInt;
import com.prineside.tdi.utility.FastBadRandom;
import com.prineside.tdi.utility.MeshedCircle;
import com.prineside.tdi.utility.PMath;
import java.util.HashMap;
import java.util.Iterator;

public abstract class Tower implements Disposable, AsyncUpdatable {
    /* renamed from: F */
    private static int[] f8017F;
    /* renamed from: G */
    private static C0438n[] f8018G = new C0438n[TowerType.values().length];
    /* renamed from: H */
    private static C0438n[] f8019H = new C0438n[TowerType.values().length];
    /* renamed from: I */
    private static C0438n[] f8020I = new C0438n[TowerType.values().length];
    /* renamed from: J */
    private static C0438n[] f8021J = new C0438n[TowerType.values().length];
    /* renamed from: K */
    private static C0438n[] f8022K = new C0438n[20];
    /* renamed from: a */
    public static final GlobalUpgradeType[] f8023a = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SELL_REFUND_V, GlobalUpgradeType.TOWER_SELL_REFUND_IV, GlobalUpgradeType.TOWER_SELL_REFUND_III, GlobalUpgradeType.TOWER_SELL_REFUND_II, GlobalUpgradeType.TOWER_SELL_REFUND_I};
    /* renamed from: b */
    public static int[] f8024b = new int[]{0, 0, 30, 40, 60, 90, 140, 210, 280, 340, 500, 700, 940, 1240, 1600, 2020, 2520, 3120, 3820, 4670, 5670};
    /* renamed from: c */
    public static final C0430b f8025c = new C0430b(1.0f, 1.0f, 1.0f, 0.1f);
    /* renamed from: d */
    public static final C0430b f8026d = new C0430b(0.0f, 0.737f, 0.831f, 0.2f);
    /* renamed from: e */
    public static final C0430b f8027e = new C0430b(1.0f, 1.0f, 1.0f, 0.0f);
    /* renamed from: f */
    public static final C0430b f8028f = new C0430b(0.0f, 0.737f, 0.831f, 0.0f);
    /* renamed from: g */
    public static C0710q<TowerType, Tower> f8029g = new C0710q();
    /* renamed from: A */
    public float f8030A;
    /* renamed from: B */
    public float f8031B;
    /* renamed from: C */
    public HashMap<TowerStatType, Float> f8032C;
    /* renamed from: D */
    public long f8033D;
    /* renamed from: E */
    public WalkableTile[] f8034E;
    /* renamed from: L */
    private C0676a<Enemy> f8035L;
    /* renamed from: M */
    private C0676a<TowerListener> f8036M;
    /* renamed from: N */
    private long f8037N;
    /* renamed from: O */
    private long f8038O;
    /* renamed from: P */
    private HashMap<TowerStatType, Float> f8039P;
    /* renamed from: Q */
    private MeshedCircle f8040Q;
    /* renamed from: R */
    private MeshedCircle f8041R;
    /* renamed from: S */
    private MeshedCircle f8042S;
    /* renamed from: T */
    private MeshedCircle f8043T;
    /* renamed from: U */
    private Enemy f8044U;
    /* renamed from: V */
    private AsyncUpdater f8045V;
    /* renamed from: h */
    public Game f8046h;
    /* renamed from: i */
    public Map f8047i;
    /* renamed from: j */
    public SpaceTile f8048j;
    /* renamed from: k */
    public TowerType f8049k;
    /* renamed from: l */
    public int f8050l;
    /* renamed from: m */
    public CheatSafeInt f8051m;
    /* renamed from: n */
    public float f8052n;
    /* renamed from: o */
    public float f8053o;
    /* renamed from: p */
    public float f8054p;
    /* renamed from: q */
    public float f8055q;
    /* renamed from: r */
    public float f8056r;
    /* renamed from: s */
    public int f8057s;
    /* renamed from: t */
    public int[] f8058t;
    /* renamed from: u */
    public C0438n f8059u;
    /* renamed from: v */
    public C0438n f8060v;
    /* renamed from: w */
    public C0438n f8061w;
    /* renamed from: x */
    public C0438n f8062x;
    /* renamed from: y */
    public long f8063y;
    /* renamed from: z */
    public float f8064z;

    /* renamed from: com.prineside.tdi.towers.Tower$1 */
    class C12421 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ Tower f7998a;

        C12421(Tower tower) {
            this.f7998a = tower;
        }

        public void run() {
            this.f7998a.mo1835z();
        }
    }

    public static class TowerStatConfig {
        /* renamed from: a */
        public final float f8000a;
        /* renamed from: b */
        public final GlobalUpgradeType[] f8001b;
        /* renamed from: c */
        public int f8002c = 0;

        public TowerStatConfig(float f, GlobalUpgradeType[] globalUpgradeTypeArr) {
            this.f8000a = f;
            this.f8001b = globalUpgradeTypeArr;
        }

        public TowerStatConfig(float f, GlobalUpgradeType[] globalUpgradeTypeArr, int i) {
            this.f8000a = f;
            this.f8001b = globalUpgradeTypeArr;
            this.f8002c = i;
        }
    }

    public enum TowerType {
        BASIC,
        SNIPER,
        CANNON,
        FROST,
        VENOM,
        SPLASH,
        BLAST,
        MULTISHOT,
        MINIGUN,
        AIR,
        TESLA,
        MISSILE;
        
        /* renamed from: m */
        public static final TowerType[] f8015m = null;

        static {
            f8015m = values();
        }
    }

    public Tower(TowerType towerType) {
        this(towerType, (byte) 0);
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            this.f8047i = gameScreen.f7179t;
        }
        for (GlobalUpgradeType globalUpgradeType : mo1814D()) {
            if (GlobalUpgrade.m7492a(globalUpgradeType)) {
                this.f8030A = GlobalUpgrade.m7495c(globalUpgradeType).f6630u[0];
                break;
            }
        }
        for (GlobalUpgradeType globalUpgradeType2 : mo1813C()) {
            if (GlobalUpgrade.m7492a(globalUpgradeType2)) {
                this.f8031B = 1.0f + (GlobalUpgrade.m7495c(globalUpgradeType2).f6630u[0] / 100.0f);
                return;
            }
        }
    }

    private Tower(TowerType towerType, byte b) {
        this.f8035L = new C0676a();
        this.f8036M = new C0676a();
        this.f8050l = 0;
        this.f8051m = new CheatSafeInt(0);
        this.f8052n = 0.0f;
        this.f8053o = 0.0f;
        this.f8054p = 0.0f;
        this.f8055q = 0.0f;
        this.f8056r = 0.0f;
        this.f8057s = 1;
        this.f8058t = new int[]{0, 0, 0, 0};
        this.f8030A = 0.0f;
        this.f8031B = 1.0f;
        this.f8047i = null;
        this.f8046h = Game.game;
        this.f8049k = towerType;
        this.f8059u = f8018G[towerType.ordinal()];
        this.f8060v = f8020I[towerType.ordinal()];
        this.f8061w = f8021J[towerType.ordinal()];
        this.f8062x = f8019H[towerType.ordinal()];
        this.f8037N = Game.game.m7477t();
        m8455b(0.0f);
        mo1822j();
    }

    /* renamed from: a */
    public static C0438n m8430a(int i) {
        return f8022K[i - 1];
    }

    /* renamed from: a */
    public static Tower m8431a(TowerType towerType) {
        switch (towerType) {
            case BASIC:
                return new BasicTower();
            case SNIPER:
                return new SniperTower();
            case CANNON:
                return new CannonTower();
            case FROST:
                return new FrostTower();
            case VENOM:
                return new VenomTower();
            case SPLASH:
                return new SplashTower();
            case BLAST:
                return new BlastTower();
            case AIR:
                return new AirTower();
            case MINIGUN:
                return new MinigunTower();
            case MULTISHOT:
                return new MultishotTower();
            case TESLA:
                return new TeslaTower();
            case MISSILE:
                return new MissileTower();
            default:
                Game.game.logger.m7510b("Tower", "Undefined tower type " + towerType);
                Game.game.logger.m7509a(new Exception());
                return new BasicTower();
        }
    }

    /* renamed from: a */
    public static void m8432a() {
        int i;
        int i2 = 0;
        f8017F = new int[21];
        int i3 = 0;
        for (i = 0; i <= 20; i++) {
            i3 += f8024b[i];
            f8017F[i] = i3;
        }
        for (i = 0; i < TowerType.values().length; i++) {
            f8020I[i] = Game.game.f6561E.m1442a("tower-base-" + i);
            f8019H[i] = Game.game.f6561E.m1442a("tower-weapon-" + i);
            f8021J[i] = Game.game.f6561E.m1442a("tower-base-greyscale-" + i);
            f8018G[i] = Game.game.f6561E.m1442a("tower-shadow-" + i);
            if (f8020I[i] == null) {
                Game.game.logger.log("Tower init", "Texture region not loaded");
            }
        }
        for (i = 0; i < 20; i++) {
            f8022K[i] = Game.game.f6561E.m1442a("tower-level-" + i);
        }
        TowerType[] values = TowerType.values();
        i3 = values.length;
        while (i2 < i3) {
            TowerType towerType = values[i2];
            f8029g.mo542a(towerType, m8431a(towerType));
            i2++;
        }
    }

    /* renamed from: b */
    public static String m8433b(int i) {
        switch (i) {
            case 0:
                return Game.f6551e.m2416a("aim_strategy_FIRST");
            case 1:
                return Game.f6551e.m2416a("aim_strategy_WEAKEST");
            case 2:
                return Game.f6551e.m2416a("aim_strategy_STRONGEST");
            case 3:
                return Game.f6551e.m2416a("aim_strategy_RANDOM");
            default:
                return null;
        }
    }

    /* renamed from: e */
    public static void m8434e() {
    }

    /* renamed from: A */
    public abstract GlobalUpgradeType mo1811A();

    /* renamed from: B */
    public abstract GlobalUpgradeType mo1812B();

    /* renamed from: C */
    public abstract GlobalUpgradeType[] mo1813C();

    /* renamed from: D */
    public abstract GlobalUpgradeType[] mo1814D();

    /* renamed from: E */
    public abstract GlobalUpgradeType[] mo1815E();

    /* renamed from: F */
    public abstract GlobalUpgradeType[] mo1816F();

    /* renamed from: G */
    public abstract GlobalUpgradeType[] mo1817G();

    /* renamed from: a */
    public final float m8442a(TowerStatType towerStatType) {
        if (this.f8039P.containsKey(towerStatType)) {
            return ((Float) this.f8039P.get(towerStatType)).floatValue();
        }
        throw new RuntimeException("Tower has no stat " + towerStatType);
    }

    /* renamed from: a */
    public abstract float mo1818a(TowerStatType towerStatType, int i);

    /* renamed from: a */
    public final float m8444a(TowerStatType towerStatType, int i, int[] iArr) {
        float b = mo1820b(towerStatType, i, iArr);
        if (this.f8048j == null) {
            return b;
        }
        SpaceTile spaceTile = this.f8048j;
        return TowerStat.m8484a(towerStatType).f8101d ? spaceTile.f7992t != 0 ? mo1818a(towerStatType, spaceTile.f7992t) * b : b : spaceTile.f7993u.containsKey(towerStatType) ? ((Float) spaceTile.f7993u.get(towerStatType)).floatValue() * b : b;
    }

    /* renamed from: a */
    public abstract int mo1819a(int i, int i2);

    /* renamed from: a */
    public final int m8446a(boolean z) {
        if (z) {
            return (int) (((float) this.f8051m.m8800a()) * 0.95f);
        }
        for (GlobalUpgradeType globalUpgradeType : f8023a) {
            if (GlobalUpgrade.m7492a(globalUpgradeType)) {
                return (int) ((((float) this.f8051m.m8800a()) * GlobalUpgrade.m7495c(globalUpgradeType).f6630u[0]) / 100.0f);
            }
        }
        return (int) (((float) this.f8051m.m8800a()) * 0.5f);
    }

    /* renamed from: a */
    public final void m8447a(float f) {
        int i;
        this.f8054p = f;
        for (GlobalUpgradeType globalUpgradeType : mo1816F()) {
            if (GlobalUpgrade.m7492a(globalUpgradeType)) {
                i = (int) GlobalUpgrade.m7495c(globalUpgradeType).f6630u[0];
                break;
            }
        }
        i = 3;
        if (this.f8057s != i) {
            int i2 = this.f8057s + 1;
            while (i2 <= i && ((int) this.f8054p) >= f8017F[i2]) {
                this.f8057s = i2;
                mo1822j();
                Iterator it = this.f8036M.iterator();
                while (it.hasNext()) {
                    ((TowerListener) it.next()).mo1789d(this);
                }
                i2++;
            }
            if (this.f8057s != i) {
                this.f8055q = this.f8054p - ((float) f8017F[this.f8057s]);
                this.f8056r = (float) f8024b[this.f8057s + 1];
                return;
            }
            this.f8055q = 0.0f;
            this.f8056r = 0.0f;
        }
    }

    /* renamed from: a */
    public void mo1840a(C0507i c0507i) {
        if (this.f8040Q != null) {
            this.f8040Q.m8816a(c0507i);
            this.f8041R.m8816a(c0507i);
        }
    }

    /* renamed from: a */
    public final void mo1751a(AsyncUpdater asyncUpdater) {
        this.f8045V = asyncUpdater;
    }

    /* renamed from: a */
    public final synchronized void m8450a(Enemy enemy) {
        this.f8044U = enemy;
    }

    /* renamed from: a */
    public final void m8451a(SpaceTile spaceTile) {
        this.f8048j = spaceTile;
        mo1822j();
    }

    /* renamed from: a */
    public final void m8452a(TowerListener towerListener) {
        if (!this.f8036M.m2302b((Object) towerListener)) {
            this.f8036M.m2296a((Object) towerListener);
        }
    }

    /* renamed from: b */
    public abstract float mo1820b(TowerStatType towerStatType, int i, int[] iArr);

    /* renamed from: b */
    public void dispose() {
        if (this.f8040Q != null) {
            this.f8040Q.dispose();
            this.f8041R.dispose();
            this.f8042S.dispose();
            this.f8043T.dispose();
        }
        this.f8036M.mo530d();
    }

    /* renamed from: b */
    public final void m8455b(float f) {
        m8447a((this.f8031B * f) + this.f8054p);
        Iterator it = this.f8036M.iterator();
        while (it.hasNext()) {
            ((TowerListener) it.next()).mo1788c(this);
        }
    }

    /* renamed from: b */
    public void mo1841b(C0507i c0507i) {
        if (this.f8042S != null) {
            this.f8042S.m8816a(c0507i);
            this.f8043T.m8816a(c0507i);
        }
    }

    /* renamed from: b */
    public boolean mo1842b(Enemy enemy) {
        return true;
    }

    /* renamed from: c */
    public final AsyncUpdater mo1752c() {
        return this.f8045V;
    }

    /* renamed from: c */
    public void mo1836c(float f) {
    }

    /* renamed from: c */
    public void mo1837c(int i) {
    }

    /* renamed from: d */
    public final void mo1753d() {
        long t = this.f8046h.m7477t();
        if (this.f8048j != null) {
            long j = t - this.f8037N;
            this.f8037N = t;
            if (mo1832w()) {
                Enemy enemy = this.f8044U;
                if (enemy != null && this.f8047i.m7529b(enemy) && PMath.m8820a((float) this.f8048j.f, (float) this.f8048j.g, enemy.f6909d.f2337x, enemy.f6909d.f2338y) > this.f8064z) {
                    m8450a(null);
                    enemy = null;
                }
                if (enemy == null && t - this.f8038O > 450000) {
                    enemy = mo1843i();
                    m8450a(enemy);
                    if (enemy != null && mo1834y() > 0 && t - this.f8063y > ((long) mo1834y())) {
                        this.f8063y = (t - ((long) mo1834y())) - 1;
                    }
                    this.f8038O = t;
                }
                mo1837c((int) j);
                if (!this.f8047i.m7529b(enemy)) {
                    m8450a(null);
                    return;
                } else if (mo1833x()) {
                    int y = mo1834y();
                    int i = (int) (t - this.f8063y);
                    if (i > y) {
                        int i2;
                        while (i > y) {
                            if (enemy == null) {
                                i2 = 0;
                                break;
                            } else {
                                Gdx.app.postRunnable(new C12421(this));
                                i -= y;
                            }
                        }
                        i2 = i;
                        this.f8063y = t - ((long) i2);
                        return;
                    }
                    return;
                } else if (mo1834y() > 0 && t - this.f8063y > ((long) mo1834y())) {
                    this.f8063y = (t - ((long) mo1834y())) - 1;
                    return;
                } else {
                    return;
                }
            }
            mo1837c((int) j);
        }
    }

    /* renamed from: d */
    public abstract void mo1821d(int i);

    /* renamed from: f */
    public final int m8463f() {
        for (GlobalUpgradeType globalUpgradeType : mo1815E()) {
            if (GlobalUpgrade.m7492a(globalUpgradeType)) {
                return (int) GlobalUpgrade.m7495c(globalUpgradeType).f6630u[0];
            }
        }
        return mo1829t();
    }

    /* renamed from: g */
    public final int m8464g() {
        for (GlobalUpgradeType globalUpgradeType : mo1817G()) {
            if (GlobalUpgrade.m7492a(globalUpgradeType)) {
                return (int) GlobalUpgrade.m7495c(globalUpgradeType).f6630u[0];
            }
        }
        return 3;
    }

    /* renamed from: h */
    public final synchronized Enemy m8465h() {
        return this.f8044U;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: i */
    public Enemy mo1843i() {
        /*
        r15 = this;
        r14 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 0;
        r2 = 0;
        r0 = r15.f8064z;
        r1 = r15.f8064z;
        r5 = r0 * r1;
        r0 = r15.f8050l;
        if (r0 != 0) goto L_0x0123;
    L_0x000e:
        r6 = r15.f8034E;
        r7 = r6.length;
        r4 = r3;
        r0 = r3;
        r1 = r2;
    L_0x0014:
        if (r4 >= r7) goto L_0x009e;
    L_0x0016:
        r2 = r6[r4];
        r8 = r2.f7986r;
        if (r8 == 0) goto L_0x0096;
    L_0x001c:
        r8 = r2.f7984p;
        monitor-enter(r8);
        r2 = r2.f7984p;	 Catch:{ all -> 0x009b }
        r9 = r2.m2489c();	 Catch:{ all -> 0x009b }
        r2 = r0;
    L_0x0026:
        r0 = r9.hasNext();	 Catch:{ all -> 0x009b }
        if (r0 == 0) goto L_0x0094;
    L_0x002c:
        r0 = r9.next();	 Catch:{ all -> 0x009b }
        r0 = (com.prineside.tdi.enemies.Enemy) r0;	 Catch:{ all -> 0x009b }
        r2 = r2 + 1;
        r10 = r15.f8049k;	 Catch:{ all -> 0x009b }
        r10 = r0.mo1755a(r10);	 Catch:{ all -> 0x009b }
        if (r10 == 0) goto L_0x0026;
    L_0x003c:
        r10 = r15.mo1842b(r0);	 Catch:{ all -> 0x009b }
        if (r10 == 0) goto L_0x0026;
    L_0x0042:
        if (r1 != 0) goto L_0x0060;
    L_0x0044:
        r10 = r15.f8048j;	 Catch:{ all -> 0x009b }
        r10 = r10.f;	 Catch:{ all -> 0x009b }
        r10 = (float) r10;	 Catch:{ all -> 0x009b }
        r11 = r15.f8048j;	 Catch:{ all -> 0x009b }
        r11 = r11.g;	 Catch:{ all -> 0x009b }
        r11 = (float) r11;	 Catch:{ all -> 0x009b }
        r12 = r0.f6909d;	 Catch:{ all -> 0x009b }
        r12 = r12.f2337x;	 Catch:{ all -> 0x009b }
        r13 = r0.f6909d;	 Catch:{ all -> 0x009b }
        r13 = r13.f2338y;	 Catch:{ all -> 0x009b }
        r10 = com.prineside.tdi.utility.PMath.m8826b(r10, r11, r12, r13);	 Catch:{ all -> 0x009b }
        r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1));
        if (r10 >= 0) goto L_0x041b;
    L_0x005e:
        r1 = r0;
        goto L_0x0026;
    L_0x0060:
        r10 = r1.f6907b;	 Catch:{ all -> 0x009b }
        r10 = r14 - r10;
        r11 = r1.f6912g;	 Catch:{ all -> 0x009b }
        r11 = r11.f6784e;	 Catch:{ all -> 0x009b }
        r11 = (float) r11;	 Catch:{ all -> 0x009b }
        r10 = r10 * r11;
        r11 = r0.f6907b;	 Catch:{ all -> 0x009b }
        r11 = r14 - r11;
        r12 = r0.f6912g;	 Catch:{ all -> 0x009b }
        r12 = r12.f6784e;	 Catch:{ all -> 0x009b }
        r12 = (float) r12;	 Catch:{ all -> 0x009b }
        r11 = r11 * r12;
        r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1));
        if (r10 <= 0) goto L_0x041b;
    L_0x0078:
        r10 = r15.f8048j;	 Catch:{ all -> 0x009b }
        r10 = r10.f;	 Catch:{ all -> 0x009b }
        r10 = (float) r10;	 Catch:{ all -> 0x009b }
        r11 = r15.f8048j;	 Catch:{ all -> 0x009b }
        r11 = r11.g;	 Catch:{ all -> 0x009b }
        r11 = (float) r11;	 Catch:{ all -> 0x009b }
        r12 = r0.f6909d;	 Catch:{ all -> 0x009b }
        r12 = r12.f2337x;	 Catch:{ all -> 0x009b }
        r13 = r0.f6909d;	 Catch:{ all -> 0x009b }
        r13 = r13.f2338y;	 Catch:{ all -> 0x009b }
        r10 = com.prineside.tdi.utility.PMath.m8826b(r10, r11, r12, r13);	 Catch:{ all -> 0x009b }
        r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1));
        if (r10 >= 0) goto L_0x041b;
    L_0x0092:
        r1 = r0;
        goto L_0x0026;
    L_0x0094:
        monitor-exit(r8);	 Catch:{ all -> 0x009b }
        r0 = r2;
    L_0x0096:
        r2 = r4 + 1;
        r4 = r2;
        goto L_0x0014;
    L_0x009b:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x009b }
        throw r0;
    L_0x009e:
        if (r1 != 0) goto L_0x0404;
    L_0x00a0:
        if (r0 == 0) goto L_0x0404;
    L_0x00a2:
        r2 = r15.f8034E;
        r4 = r2.length;
    L_0x00a5:
        if (r3 >= r4) goto L_0x0404;
    L_0x00a7:
        r0 = r2[r3];
        r6 = r0.f7986r;
        if (r6 == 0) goto L_0x011d;
    L_0x00ad:
        r6 = r0.f7984p;
        monitor-enter(r6);
        r0 = r0.f7984p;	 Catch:{ all -> 0x0120 }
        r7 = r0.m2489c();	 Catch:{ all -> 0x0120 }
    L_0x00b6:
        r0 = r7.hasNext();	 Catch:{ all -> 0x0120 }
        if (r0 == 0) goto L_0x011c;
    L_0x00bc:
        r0 = r7.next();	 Catch:{ all -> 0x0120 }
        r0 = (com.prineside.tdi.enemies.Enemy) r0;	 Catch:{ all -> 0x0120 }
        r8 = r15.f8049k;	 Catch:{ all -> 0x0120 }
        r8 = r0.mo1755a(r8);	 Catch:{ all -> 0x0120 }
        if (r8 == 0) goto L_0x00b6;
    L_0x00ca:
        if (r1 != 0) goto L_0x00e8;
    L_0x00cc:
        r8 = r15.f8048j;	 Catch:{ all -> 0x0120 }
        r8 = r8.f;	 Catch:{ all -> 0x0120 }
        r8 = (float) r8;	 Catch:{ all -> 0x0120 }
        r9 = r15.f8048j;	 Catch:{ all -> 0x0120 }
        r9 = r9.g;	 Catch:{ all -> 0x0120 }
        r9 = (float) r9;	 Catch:{ all -> 0x0120 }
        r10 = r0.f6909d;	 Catch:{ all -> 0x0120 }
        r10 = r10.f2337x;	 Catch:{ all -> 0x0120 }
        r11 = r0.f6909d;	 Catch:{ all -> 0x0120 }
        r11 = r11.f2338y;	 Catch:{ all -> 0x0120 }
        r8 = com.prineside.tdi.utility.PMath.m8826b(r8, r9, r10, r11);	 Catch:{ all -> 0x0120 }
        r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1));
        if (r8 >= 0) goto L_0x0418;
    L_0x00e6:
        r1 = r0;
        goto L_0x00b6;
    L_0x00e8:
        r8 = r1.f6907b;	 Catch:{ all -> 0x0120 }
        r8 = r14 - r8;
        r9 = r1.f6912g;	 Catch:{ all -> 0x0120 }
        r9 = r9.f6784e;	 Catch:{ all -> 0x0120 }
        r9 = (float) r9;	 Catch:{ all -> 0x0120 }
        r8 = r8 * r9;
        r9 = r0.f6907b;	 Catch:{ all -> 0x0120 }
        r9 = r14 - r9;
        r10 = r0.f6912g;	 Catch:{ all -> 0x0120 }
        r10 = r10.f6784e;	 Catch:{ all -> 0x0120 }
        r10 = (float) r10;	 Catch:{ all -> 0x0120 }
        r9 = r9 * r10;
        r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1));
        if (r8 <= 0) goto L_0x0418;
    L_0x0100:
        r8 = r15.f8048j;	 Catch:{ all -> 0x0120 }
        r8 = r8.f;	 Catch:{ all -> 0x0120 }
        r8 = (float) r8;	 Catch:{ all -> 0x0120 }
        r9 = r15.f8048j;	 Catch:{ all -> 0x0120 }
        r9 = r9.g;	 Catch:{ all -> 0x0120 }
        r9 = (float) r9;	 Catch:{ all -> 0x0120 }
        r10 = r0.f6909d;	 Catch:{ all -> 0x0120 }
        r10 = r10.f2337x;	 Catch:{ all -> 0x0120 }
        r11 = r0.f6909d;	 Catch:{ all -> 0x0120 }
        r11 = r11.f2338y;	 Catch:{ all -> 0x0120 }
        r8 = com.prineside.tdi.utility.PMath.m8826b(r8, r9, r10, r11);	 Catch:{ all -> 0x0120 }
        r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1));
        if (r8 >= 0) goto L_0x0418;
    L_0x011a:
        r1 = r0;
        goto L_0x00b6;
    L_0x011c:
        monitor-exit(r6);	 Catch:{ all -> 0x0120 }
    L_0x011d:
        r3 = r3 + 1;
        goto L_0x00a5;
    L_0x0120:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0120 }
        throw r0;
    L_0x0123:
        r0 = r15.f8050l;
        r1 = 1;
        if (r0 != r1) goto L_0x021c;
    L_0x0128:
        r6 = r15.f8034E;
        r7 = r6.length;
        r4 = r3;
        r0 = r3;
        r1 = r2;
    L_0x012e:
        if (r4 >= r7) goto L_0x01a7;
    L_0x0130:
        r2 = r6[r4];
        r8 = r2.f7986r;
        if (r8 == 0) goto L_0x01a0;
    L_0x0136:
        r8 = r2.f7984p;
        monitor-enter(r8);
        r2 = r2.f7984p;	 Catch:{ all -> 0x01a4 }
        r9 = r2.m2489c();	 Catch:{ all -> 0x01a4 }
        r2 = r0;
    L_0x0140:
        r0 = r9.hasNext();	 Catch:{ all -> 0x01a4 }
        if (r0 == 0) goto L_0x019e;
    L_0x0146:
        r0 = r9.next();	 Catch:{ all -> 0x01a4 }
        r0 = (com.prineside.tdi.enemies.Enemy) r0;	 Catch:{ all -> 0x01a4 }
        r2 = r2 + 1;
        r10 = r15.f8049k;	 Catch:{ all -> 0x01a4 }
        r10 = r0.mo1755a(r10);	 Catch:{ all -> 0x01a4 }
        if (r10 == 0) goto L_0x0140;
    L_0x0156:
        r10 = r15.mo1842b(r0);	 Catch:{ all -> 0x01a4 }
        if (r10 == 0) goto L_0x0140;
    L_0x015c:
        if (r1 != 0) goto L_0x017a;
    L_0x015e:
        r10 = r15.f8048j;	 Catch:{ all -> 0x01a4 }
        r10 = r10.f;	 Catch:{ all -> 0x01a4 }
        r10 = (float) r10;	 Catch:{ all -> 0x01a4 }
        r11 = r15.f8048j;	 Catch:{ all -> 0x01a4 }
        r11 = r11.g;	 Catch:{ all -> 0x01a4 }
        r11 = (float) r11;	 Catch:{ all -> 0x01a4 }
        r12 = r0.f6909d;	 Catch:{ all -> 0x01a4 }
        r12 = r12.f2337x;	 Catch:{ all -> 0x01a4 }
        r13 = r0.f6909d;	 Catch:{ all -> 0x01a4 }
        r13 = r13.f2338y;	 Catch:{ all -> 0x01a4 }
        r10 = com.prineside.tdi.utility.PMath.m8826b(r10, r11, r12, r13);	 Catch:{ all -> 0x01a4 }
        r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1));
        if (r10 >= 0) goto L_0x0415;
    L_0x0178:
        r1 = r0;
        goto L_0x0140;
    L_0x017a:
        r10 = r1.f6917l;	 Catch:{ all -> 0x01a4 }
        r11 = r0.f6917l;	 Catch:{ all -> 0x01a4 }
        r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1));
        if (r10 <= 0) goto L_0x0415;
    L_0x0182:
        r10 = r15.f8048j;	 Catch:{ all -> 0x01a4 }
        r10 = r10.f;	 Catch:{ all -> 0x01a4 }
        r10 = (float) r10;	 Catch:{ all -> 0x01a4 }
        r11 = r15.f8048j;	 Catch:{ all -> 0x01a4 }
        r11 = r11.g;	 Catch:{ all -> 0x01a4 }
        r11 = (float) r11;	 Catch:{ all -> 0x01a4 }
        r12 = r0.f6909d;	 Catch:{ all -> 0x01a4 }
        r12 = r12.f2337x;	 Catch:{ all -> 0x01a4 }
        r13 = r0.f6909d;	 Catch:{ all -> 0x01a4 }
        r13 = r13.f2338y;	 Catch:{ all -> 0x01a4 }
        r10 = com.prineside.tdi.utility.PMath.m8826b(r10, r11, r12, r13);	 Catch:{ all -> 0x01a4 }
        r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1));
        if (r10 >= 0) goto L_0x0415;
    L_0x019c:
        r1 = r0;
        goto L_0x0140;
    L_0x019e:
        monitor-exit(r8);	 Catch:{ all -> 0x01a4 }
        r0 = r2;
    L_0x01a0:
        r2 = r4 + 1;
        r4 = r2;
        goto L_0x012e;
    L_0x01a4:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x01a4 }
        throw r0;
    L_0x01a7:
        if (r1 != 0) goto L_0x0404;
    L_0x01a9:
        if (r0 == 0) goto L_0x0404;
    L_0x01ab:
        r2 = r15.f8034E;
        r4 = r2.length;
    L_0x01ae:
        if (r3 >= r4) goto L_0x0404;
    L_0x01b0:
        r0 = r2[r3];
        r6 = r0.f7986r;
        if (r6 == 0) goto L_0x0216;
    L_0x01b6:
        r6 = r0.f7984p;
        monitor-enter(r6);
        r0 = r0.f7984p;	 Catch:{ all -> 0x0219 }
        r7 = r0.m2489c();	 Catch:{ all -> 0x0219 }
    L_0x01bf:
        r0 = r7.hasNext();	 Catch:{ all -> 0x0219 }
        if (r0 == 0) goto L_0x0215;
    L_0x01c5:
        r0 = r7.next();	 Catch:{ all -> 0x0219 }
        r0 = (com.prineside.tdi.enemies.Enemy) r0;	 Catch:{ all -> 0x0219 }
        r8 = r15.f8049k;	 Catch:{ all -> 0x0219 }
        r8 = r0.mo1755a(r8);	 Catch:{ all -> 0x0219 }
        if (r8 == 0) goto L_0x01bf;
    L_0x01d3:
        if (r1 != 0) goto L_0x01f1;
    L_0x01d5:
        r8 = r15.f8048j;	 Catch:{ all -> 0x0219 }
        r8 = r8.f;	 Catch:{ all -> 0x0219 }
        r8 = (float) r8;	 Catch:{ all -> 0x0219 }
        r9 = r15.f8048j;	 Catch:{ all -> 0x0219 }
        r9 = r9.g;	 Catch:{ all -> 0x0219 }
        r9 = (float) r9;	 Catch:{ all -> 0x0219 }
        r10 = r0.f6909d;	 Catch:{ all -> 0x0219 }
        r10 = r10.f2337x;	 Catch:{ all -> 0x0219 }
        r11 = r0.f6909d;	 Catch:{ all -> 0x0219 }
        r11 = r11.f2338y;	 Catch:{ all -> 0x0219 }
        r8 = com.prineside.tdi.utility.PMath.m8826b(r8, r9, r10, r11);	 Catch:{ all -> 0x0219 }
        r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1));
        if (r8 >= 0) goto L_0x0412;
    L_0x01ef:
        r1 = r0;
        goto L_0x01bf;
    L_0x01f1:
        r8 = r1.f6917l;	 Catch:{ all -> 0x0219 }
        r9 = r0.f6917l;	 Catch:{ all -> 0x0219 }
        r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1));
        if (r8 <= 0) goto L_0x0412;
    L_0x01f9:
        r8 = r15.f8048j;	 Catch:{ all -> 0x0219 }
        r8 = r8.f;	 Catch:{ all -> 0x0219 }
        r8 = (float) r8;	 Catch:{ all -> 0x0219 }
        r9 = r15.f8048j;	 Catch:{ all -> 0x0219 }
        r9 = r9.g;	 Catch:{ all -> 0x0219 }
        r9 = (float) r9;	 Catch:{ all -> 0x0219 }
        r10 = r0.f6909d;	 Catch:{ all -> 0x0219 }
        r10 = r10.f2337x;	 Catch:{ all -> 0x0219 }
        r11 = r0.f6909d;	 Catch:{ all -> 0x0219 }
        r11 = r11.f2338y;	 Catch:{ all -> 0x0219 }
        r8 = com.prineside.tdi.utility.PMath.m8826b(r8, r9, r10, r11);	 Catch:{ all -> 0x0219 }
        r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1));
        if (r8 >= 0) goto L_0x0412;
    L_0x0213:
        r1 = r0;
        goto L_0x01bf;
    L_0x0215:
        monitor-exit(r6);	 Catch:{ all -> 0x0219 }
    L_0x0216:
        r3 = r3 + 1;
        goto L_0x01ae;
    L_0x0219:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0219 }
        throw r0;
    L_0x021c:
        r0 = r15.f8050l;
        r1 = 2;
        if (r0 != r1) goto L_0x0315;
    L_0x0221:
        r6 = r15.f8034E;
        r7 = r6.length;
        r4 = r3;
        r0 = r3;
        r1 = r2;
    L_0x0227:
        if (r4 >= r7) goto L_0x02a0;
    L_0x0229:
        r2 = r6[r4];
        r8 = r2.f7986r;
        if (r8 == 0) goto L_0x0299;
    L_0x022f:
        r8 = r2.f7984p;
        monitor-enter(r8);
        r2 = r2.f7984p;	 Catch:{ all -> 0x029d }
        r9 = r2.m2489c();	 Catch:{ all -> 0x029d }
        r2 = r0;
    L_0x0239:
        r0 = r9.hasNext();	 Catch:{ all -> 0x029d }
        if (r0 == 0) goto L_0x0297;
    L_0x023f:
        r0 = r9.next();	 Catch:{ all -> 0x029d }
        r0 = (com.prineside.tdi.enemies.Enemy) r0;	 Catch:{ all -> 0x029d }
        r2 = r2 + 1;
        r10 = r15.f8049k;	 Catch:{ all -> 0x029d }
        r10 = r0.mo1755a(r10);	 Catch:{ all -> 0x029d }
        if (r10 == 0) goto L_0x0239;
    L_0x024f:
        r10 = r15.mo1842b(r0);	 Catch:{ all -> 0x029d }
        if (r10 == 0) goto L_0x0239;
    L_0x0255:
        if (r1 != 0) goto L_0x0273;
    L_0x0257:
        r10 = r15.f8048j;	 Catch:{ all -> 0x029d }
        r10 = r10.f;	 Catch:{ all -> 0x029d }
        r10 = (float) r10;	 Catch:{ all -> 0x029d }
        r11 = r15.f8048j;	 Catch:{ all -> 0x029d }
        r11 = r11.g;	 Catch:{ all -> 0x029d }
        r11 = (float) r11;	 Catch:{ all -> 0x029d }
        r12 = r0.f6909d;	 Catch:{ all -> 0x029d }
        r12 = r12.f2337x;	 Catch:{ all -> 0x029d }
        r13 = r0.f6909d;	 Catch:{ all -> 0x029d }
        r13 = r13.f2338y;	 Catch:{ all -> 0x029d }
        r10 = com.prineside.tdi.utility.PMath.m8826b(r10, r11, r12, r13);	 Catch:{ all -> 0x029d }
        r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1));
        if (r10 >= 0) goto L_0x040f;
    L_0x0271:
        r1 = r0;
        goto L_0x0239;
    L_0x0273:
        r10 = r1.f6917l;	 Catch:{ all -> 0x029d }
        r11 = r0.f6917l;	 Catch:{ all -> 0x029d }
        r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1));
        if (r10 >= 0) goto L_0x040f;
    L_0x027b:
        r10 = r15.f8048j;	 Catch:{ all -> 0x029d }
        r10 = r10.f;	 Catch:{ all -> 0x029d }
        r10 = (float) r10;	 Catch:{ all -> 0x029d }
        r11 = r15.f8048j;	 Catch:{ all -> 0x029d }
        r11 = r11.g;	 Catch:{ all -> 0x029d }
        r11 = (float) r11;	 Catch:{ all -> 0x029d }
        r12 = r0.f6909d;	 Catch:{ all -> 0x029d }
        r12 = r12.f2337x;	 Catch:{ all -> 0x029d }
        r13 = r0.f6909d;	 Catch:{ all -> 0x029d }
        r13 = r13.f2338y;	 Catch:{ all -> 0x029d }
        r10 = com.prineside.tdi.utility.PMath.m8826b(r10, r11, r12, r13);	 Catch:{ all -> 0x029d }
        r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1));
        if (r10 >= 0) goto L_0x040f;
    L_0x0295:
        r1 = r0;
        goto L_0x0239;
    L_0x0297:
        monitor-exit(r8);	 Catch:{ all -> 0x029d }
        r0 = r2;
    L_0x0299:
        r2 = r4 + 1;
        r4 = r2;
        goto L_0x0227;
    L_0x029d:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x029d }
        throw r0;
    L_0x02a0:
        if (r1 != 0) goto L_0x0404;
    L_0x02a2:
        if (r0 == 0) goto L_0x0404;
    L_0x02a4:
        r2 = r15.f8034E;
        r4 = r2.length;
    L_0x02a7:
        if (r3 >= r4) goto L_0x0404;
    L_0x02a9:
        r0 = r2[r3];
        r6 = r0.f7986r;
        if (r6 == 0) goto L_0x030f;
    L_0x02af:
        r6 = r0.f7984p;
        monitor-enter(r6);
        r0 = r0.f7984p;	 Catch:{ all -> 0x0312 }
        r7 = r0.m2489c();	 Catch:{ all -> 0x0312 }
    L_0x02b8:
        r0 = r7.hasNext();	 Catch:{ all -> 0x0312 }
        if (r0 == 0) goto L_0x030e;
    L_0x02be:
        r0 = r7.next();	 Catch:{ all -> 0x0312 }
        r0 = (com.prineside.tdi.enemies.Enemy) r0;	 Catch:{ all -> 0x0312 }
        r8 = r15.f8049k;	 Catch:{ all -> 0x0312 }
        r8 = r0.mo1755a(r8);	 Catch:{ all -> 0x0312 }
        if (r8 == 0) goto L_0x02b8;
    L_0x02cc:
        if (r1 != 0) goto L_0x02ea;
    L_0x02ce:
        r8 = r15.f8048j;	 Catch:{ all -> 0x0312 }
        r8 = r8.f;	 Catch:{ all -> 0x0312 }
        r8 = (float) r8;	 Catch:{ all -> 0x0312 }
        r9 = r15.f8048j;	 Catch:{ all -> 0x0312 }
        r9 = r9.g;	 Catch:{ all -> 0x0312 }
        r9 = (float) r9;	 Catch:{ all -> 0x0312 }
        r10 = r0.f6909d;	 Catch:{ all -> 0x0312 }
        r10 = r10.f2337x;	 Catch:{ all -> 0x0312 }
        r11 = r0.f6909d;	 Catch:{ all -> 0x0312 }
        r11 = r11.f2338y;	 Catch:{ all -> 0x0312 }
        r8 = com.prineside.tdi.utility.PMath.m8826b(r8, r9, r10, r11);	 Catch:{ all -> 0x0312 }
        r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1));
        if (r8 >= 0) goto L_0x040c;
    L_0x02e8:
        r1 = r0;
        goto L_0x02b8;
    L_0x02ea:
        r8 = r1.f6917l;	 Catch:{ all -> 0x0312 }
        r9 = r0.f6917l;	 Catch:{ all -> 0x0312 }
        r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1));
        if (r8 >= 0) goto L_0x040c;
    L_0x02f2:
        r8 = r15.f8048j;	 Catch:{ all -> 0x0312 }
        r8 = r8.f;	 Catch:{ all -> 0x0312 }
        r8 = (float) r8;	 Catch:{ all -> 0x0312 }
        r9 = r15.f8048j;	 Catch:{ all -> 0x0312 }
        r9 = r9.g;	 Catch:{ all -> 0x0312 }
        r9 = (float) r9;	 Catch:{ all -> 0x0312 }
        r10 = r0.f6909d;	 Catch:{ all -> 0x0312 }
        r10 = r10.f2337x;	 Catch:{ all -> 0x0312 }
        r11 = r0.f6909d;	 Catch:{ all -> 0x0312 }
        r11 = r11.f2338y;	 Catch:{ all -> 0x0312 }
        r8 = com.prineside.tdi.utility.PMath.m8826b(r8, r9, r10, r11);	 Catch:{ all -> 0x0312 }
        r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1));
        if (r8 >= 0) goto L_0x040c;
    L_0x030c:
        r1 = r0;
        goto L_0x02b8;
    L_0x030e:
        monitor-exit(r6);	 Catch:{ all -> 0x0312 }
    L_0x030f:
        r3 = r3 + 1;
        goto L_0x02a7;
    L_0x0312:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0312 }
        throw r0;
    L_0x0315:
        r0 = r15.f8050l;
        r1 = 3;
        if (r0 != r1) goto L_0x040a;
    L_0x031a:
        r0 = r15.f8035L;
        r0.mo530d();
        r6 = r15.f8034E;
        r7 = r6.length;
        r4 = r3;
        r1 = r3;
    L_0x0324:
        if (r4 >= r7) goto L_0x037b;
    L_0x0326:
        r0 = r6[r4];
        r8 = r0.f7986r;
        if (r8 == 0) goto L_0x0407;
    L_0x032c:
        r8 = r0.f7984p;
        monitor-enter(r8);
        r0 = r0.f7984p;	 Catch:{ all -> 0x0371 }
        r9 = r0.m2489c();	 Catch:{ all -> 0x0371 }
    L_0x0335:
        r0 = r9.hasNext();	 Catch:{ all -> 0x0371 }
        if (r0 == 0) goto L_0x0374;
    L_0x033b:
        r0 = r9.next();	 Catch:{ all -> 0x0371 }
        r0 = (com.prineside.tdi.enemies.Enemy) r0;	 Catch:{ all -> 0x0371 }
        r1 = r1 + 1;
        r10 = r15.f8049k;	 Catch:{ all -> 0x0371 }
        r10 = r0.mo1755a(r10);	 Catch:{ all -> 0x0371 }
        if (r10 == 0) goto L_0x0335;
    L_0x034b:
        r10 = r15.mo1842b(r0);	 Catch:{ all -> 0x0371 }
        if (r10 == 0) goto L_0x0335;
    L_0x0351:
        r10 = r15.f8048j;	 Catch:{ all -> 0x0371 }
        r10 = r10.f;	 Catch:{ all -> 0x0371 }
        r10 = (float) r10;	 Catch:{ all -> 0x0371 }
        r11 = r15.f8048j;	 Catch:{ all -> 0x0371 }
        r11 = r11.g;	 Catch:{ all -> 0x0371 }
        r11 = (float) r11;	 Catch:{ all -> 0x0371 }
        r12 = r0.f6909d;	 Catch:{ all -> 0x0371 }
        r12 = r12.f2337x;	 Catch:{ all -> 0x0371 }
        r13 = r0.f6909d;	 Catch:{ all -> 0x0371 }
        r13 = r13.f2338y;	 Catch:{ all -> 0x0371 }
        r10 = com.prineside.tdi.utility.PMath.m8826b(r10, r11, r12, r13);	 Catch:{ all -> 0x0371 }
        r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1));
        if (r10 >= 0) goto L_0x0335;
    L_0x036b:
        r10 = r15.f8035L;	 Catch:{ all -> 0x0371 }
        r10.m2296a(r0);	 Catch:{ all -> 0x0371 }
        goto L_0x0335;
    L_0x0371:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x0371 }
        throw r0;
    L_0x0374:
        monitor-exit(r8);	 Catch:{ all -> 0x0371 }
        r0 = r1;
    L_0x0376:
        r1 = r4 + 1;
        r4 = r1;
        r1 = r0;
        goto L_0x0324;
    L_0x037b:
        r0 = r15.f8035L;
        r0 = r0.f3001b;
        if (r0 == 0) goto L_0x0395;
    L_0x0381:
        r0 = r15.f8035L;
        r2 = com.prineside.tdi.utility.FastBadRandom.m8809b();
        r4 = r15.f8035L;
        r4 = r4.f3001b;
        r4 = (float) r4;
        r2 = r2 * r4;
        r2 = (int) r2;
        r0 = r0.m2291a(r2);
        r0 = (com.prineside.tdi.enemies.Enemy) r0;
        r2 = r0;
    L_0x0395:
        if (r2 != 0) goto L_0x0405;
    L_0x0397:
        if (r1 == 0) goto L_0x0405;
    L_0x0399:
        r4 = r15.f8034E;
        r6 = r4.length;
        r1 = r3;
    L_0x039d:
        if (r1 >= r6) goto L_0x03ea;
    L_0x039f:
        r0 = r4[r1];
        r3 = r0.f7986r;
        if (r3 == 0) goto L_0x03e6;
    L_0x03a5:
        r3 = r0.f7984p;
        monitor-enter(r3);
        r0 = r0.f7984p;	 Catch:{ all -> 0x03e2 }
        r7 = r0.m2489c();	 Catch:{ all -> 0x03e2 }
    L_0x03ae:
        r0 = r7.hasNext();	 Catch:{ all -> 0x03e2 }
        if (r0 == 0) goto L_0x03e5;
    L_0x03b4:
        r0 = r7.next();	 Catch:{ all -> 0x03e2 }
        r0 = (com.prineside.tdi.enemies.Enemy) r0;	 Catch:{ all -> 0x03e2 }
        r8 = r15.f8049k;	 Catch:{ all -> 0x03e2 }
        r8 = r0.mo1755a(r8);	 Catch:{ all -> 0x03e2 }
        if (r8 == 0) goto L_0x03ae;
    L_0x03c2:
        r8 = r15.f8048j;	 Catch:{ all -> 0x03e2 }
        r8 = r8.f;	 Catch:{ all -> 0x03e2 }
        r8 = (float) r8;	 Catch:{ all -> 0x03e2 }
        r9 = r15.f8048j;	 Catch:{ all -> 0x03e2 }
        r9 = r9.g;	 Catch:{ all -> 0x03e2 }
        r9 = (float) r9;	 Catch:{ all -> 0x03e2 }
        r10 = r0.f6909d;	 Catch:{ all -> 0x03e2 }
        r10 = r10.f2337x;	 Catch:{ all -> 0x03e2 }
        r11 = r0.f6909d;	 Catch:{ all -> 0x03e2 }
        r11 = r11.f2338y;	 Catch:{ all -> 0x03e2 }
        r8 = com.prineside.tdi.utility.PMath.m8826b(r8, r9, r10, r11);	 Catch:{ all -> 0x03e2 }
        r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1));
        if (r8 >= 0) goto L_0x03ae;
    L_0x03dc:
        r8 = r15.f8035L;	 Catch:{ all -> 0x03e2 }
        r8.m2296a(r0);	 Catch:{ all -> 0x03e2 }
        goto L_0x03ae;
    L_0x03e2:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x03e2 }
        throw r0;
    L_0x03e5:
        monitor-exit(r3);	 Catch:{ all -> 0x03e2 }
    L_0x03e6:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x039d;
    L_0x03ea:
        r0 = r15.f8035L;
        r0 = r0.f3001b;
        if (r0 == 0) goto L_0x0405;
    L_0x03f0:
        r0 = r15.f8035L;
        r1 = com.prineside.tdi.utility.FastBadRandom.m8809b();
        r2 = r15.f8035L;
        r2 = r2.f3001b;
        r2 = (float) r2;
        r1 = r1 * r2;
        r1 = (int) r1;
        r0 = r0.m2291a(r1);
        r0 = (com.prineside.tdi.enemies.Enemy) r0;
        r1 = r0;
    L_0x0404:
        return r1;
    L_0x0405:
        r1 = r2;
        goto L_0x0404;
    L_0x0407:
        r0 = r1;
        goto L_0x0376;
    L_0x040a:
        r1 = r2;
        goto L_0x0404;
    L_0x040c:
        r0 = r1;
        goto L_0x030c;
    L_0x040f:
        r0 = r1;
        goto L_0x0295;
    L_0x0412:
        r0 = r1;
        goto L_0x0213;
    L_0x0415:
        r0 = r1;
        goto L_0x019c;
    L_0x0418:
        r0 = r1;
        goto L_0x011a;
    L_0x041b:
        r0 = r1;
        goto L_0x0092;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prineside.tdi.towers.Tower.i():com.prineside.tdi.enemies.Enemy");
    }

    /* renamed from: j */
    public void mo1822j() {
        int i = 0;
        if (this.f8032C == null) {
            this.f8032C = new HashMap();
            this.f8039P = new HashMap();
        }
        for (TowerStatType towerStatType : mo1830u()) {
            this.f8032C.put(towerStatType, Float.valueOf(mo1820b(towerStatType, this.f8057s, this.f8058t)));
            this.f8039P.put(towerStatType, Float.valueOf(m8444a(towerStatType, this.f8057s, this.f8058t)));
        }
        this.f8064z = m8442a(TowerStatType.RANGE) * 64.0f;
        if (this.f8047i == null || this.f8048j == null) {
            this.f8034E = new RoadTile[0];
        } else {
            C0676a c0676a = new C0676a();
            while (i < this.f8047i.f6761e.length) {
                Object obj = this.f8047i.f6761e[i];
                if (PMath.m8820a((float) obj.f, (float) obj.g, (float) this.f8048j.f, (float) this.f8048j.g) - 64.0f < this.f8064z) {
                    c0676a.m2296a(obj);
                }
                i++;
            }
            this.f8034E = (WalkableTile[]) c0676a.m2298a(WalkableTile.class);
        }
        if (this.f8048j != null) {
            if (this.f8040Q == null) {
                this.f8040Q = new MeshedCircle((float) this.f8048j.f, (float) this.f8048j.g, this.f8064z * 0.75f, this.f8064z, f8028f, f8026d);
                this.f8041R = new MeshedCircle((float) this.f8048j.f, (float) this.f8048j.g, this.f8064z - 3.0f, this.f8064z, f8026d, f8026d);
                this.f8042S = new MeshedCircle((float) this.f8048j.f, (float) this.f8048j.g, this.f8064z * 0.75f, this.f8064z, f8027e, f8025c);
                this.f8043T = new MeshedCircle((float) this.f8048j.f, (float) this.f8048j.g, this.f8064z - 3.0f, this.f8064z, f8025c, f8025c);
            } else {
                this.f8040Q.m8815a((float) this.f8048j.f, (float) this.f8048j.g, this.f8064z * 0.75f, this.f8064z, f8028f, f8026d);
                this.f8041R.m8815a((float) this.f8048j.f, (float) this.f8048j.g, this.f8064z - 3.0f, this.f8064z, f8026d, f8026d);
                this.f8042S.m8815a((float) this.f8048j.f, (float) this.f8048j.g, this.f8064z * 0.75f, this.f8064z, f8027e, f8025c);
                this.f8043T.m8815a((float) this.f8048j.f, (float) this.f8048j.g, this.f8064z - 3.0f, this.f8064z, f8025c, f8025c);
            }
        }
        this.f8033D = Game.game.m7478u();
    }

    /* renamed from: k */
    public void mo1838k() {
        this.f8046h.f6559C.mo371a(this.f8062x, (float) this.f8048j.i, (float) this.f8048j.k, 32.0f, 32.0f, 64.0f, 64.0f, 1.0f, 1.0f, this.f8053o);
    }

    /* renamed from: l */
    public final void m8469l() {
        if (Game.game.f6580l) {
            GameScreen gameScreen = Game.f6553g;
            if (this.f8048j.l && gameScreen != null) {
                float f = (float) (1.5d - gameScreen.f7162c.f6471b);
                if (f > 0.0f) {
                    Sound.m7570a(mo1828s(), f * (0.8f + (0.2f * FastBadRandom.m8809b())), this.f8048j.m);
                }
            }
        }
    }

    /* renamed from: m */
    public void mo1839m() {
    }

    /* renamed from: n */
    public abstract String mo1823n();

    /* renamed from: o */
    public abstract String mo1824o();

    /* renamed from: p */
    public abstract C0430b mo1825p();

    /* renamed from: q */
    public abstract String mo1826q();

    /* renamed from: r */
    public abstract C0710q<TowerStatType, TowerStatConfig> mo1827r();

    /* renamed from: s */
    public Type mo1828s() {
        return null;
    }

    /* renamed from: t */
    public abstract int mo1829t();

    /* renamed from: u */
    public abstract TowerStatType[] mo1830u();

    /* renamed from: v */
    public abstract TowerUpgradeType[] mo1831v();

    /* renamed from: w */
    public abstract boolean mo1832w();

    /* renamed from: x */
    public boolean mo1833x() {
        return false;
    }

    /* renamed from: y */
    public int mo1834y() {
        return 0;
    }

    /* renamed from: z */
    public void mo1835z() {
    }
}
