package com.prineside.tdi.enemies;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.g2d.C0473l;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.C0710q.C0706a;
import com.badlogic.gdx.utils.C0710q.C0707b;
import com.badlogic.gdx.utils.C0712r;
import com.prineside.tdi.Achievement;
import com.prineside.tdi.Achievement.Type;
import com.prineside.tdi.AsyncUpdatable;
import com.prineside.tdi.AsyncUpdater;
import com.prineside.tdi.DailyQuest.QuestType;
import com.prineside.tdi.Game;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgradeType;
import com.prineside.tdi.Path;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Statistics.StatisticsType;
import com.prineside.tdi.enemies.effects.FreezeEffect;
import com.prineside.tdi.enemies.effects.FreezeMeltdownEffect;
import com.prineside.tdi.enemies.effects.PoisonEffect;
import com.prineside.tdi.enemies.types.AirEnemy;
import com.prineside.tdi.enemies.types.ArmoredEnemy;
import com.prineside.tdi.enemies.types.BonusEnemy;
import com.prineside.tdi.enemies.types.BossEnemy;
import com.prineside.tdi.enemies.types.FastEnemy;
import com.prineside.tdi.enemies.types.FighterEnemy;
import com.prineside.tdi.enemies.types.IcyEnemy;
import com.prineside.tdi.enemies.types.JetEnemy;
import com.prineside.tdi.enemies.types.LightEnemy;
import com.prineside.tdi.enemies.types.RegularEnemy;
import com.prineside.tdi.enemies.types.StrongEnemy;
import com.prineside.tdi.enemies.types.ToxicEnemy;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.tiles.WalkableTile;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.Tower.TowerType;
import com.prineside.tdi.utility.FastBadRandom;
import com.prineside.tdi.waves.Wave;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class Enemy implements AsyncUpdatable {
    /* renamed from: E */
    private static final GlobalUpgradeType[] f6884E = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_AIR_S_BURN_DAMAGE_V, GlobalUpgradeType.TOWER_AIR_S_BURN_DAMAGE_IV, GlobalUpgradeType.TOWER_AIR_S_BURN_DAMAGE_III, GlobalUpgradeType.TOWER_AIR_S_BURN_DAMAGE_II, GlobalUpgradeType.TOWER_AIR_S_BURN_DAMAGE_I};
    /* renamed from: F */
    private static C0438n[] f6885F;
    /* renamed from: G */
    private static C0438n f6886G;
    /* renamed from: H */
    private static C0438n f6887H;
    /* renamed from: I */
    private static C0438n f6888I;
    /* renamed from: J */
    private static C0438n f6889J;
    /* renamed from: K */
    private static C0438n f6890K;
    /* renamed from: L */
    private static final C0430b f6891L = new C0430b(0.1f, 0.1f, 0.1f, 1.0f);
    /* renamed from: M */
    private static final C0712r<EnemyType> f6892M = new C0712r();
    /* renamed from: a */
    public static C0710q<EnemyType, Enemy> f6893a = new C0710q();
    /* renamed from: A */
    public long f6894A;
    /* renamed from: B */
    public Tower f6895B;
    /* renamed from: C */
    public long f6896C = 0;
    /* renamed from: D */
    public C0438n f6897D;
    /* renamed from: N */
    private float f6898N;
    /* renamed from: O */
    private long f6899O = 0;
    /* renamed from: P */
    private long f6900P;
    /* renamed from: Q */
    private long f6901Q;
    /* renamed from: R */
    private long f6902R;
    /* renamed from: S */
    private float f6903S = 0.0f;
    /* renamed from: T */
    private HashMap<PoisonEffect, Float> f6904T = new HashMap();
    /* renamed from: U */
    private C0430b f6905U;
    /* renamed from: V */
    private AsyncUpdater f6906V;
    /* renamed from: b */
    public float f6907b = 0.0f;
    /* renamed from: c */
    public float f6908c = 1.0f;
    /* renamed from: d */
    public Vector2 f6909d = new Vector2();
    /* renamed from: e */
    public float f6910e = 0.0f;
    /* renamed from: f */
    public int f6911f = 0;
    /* renamed from: g */
    public Path f6912g;
    /* renamed from: h */
    public int f6913h;
    /* renamed from: i */
    public EnemyType f6914i;
    /* renamed from: j */
    public WalkableTile f6915j;
    /* renamed from: k */
    public long f6916k = 0;
    /* renamed from: l */
    public float f6917l = 100.0f;
    /* renamed from: m */
    public float f6918m = 100.0f;
    /* renamed from: n */
    public float f6919n = 1.0f;
    /* renamed from: o */
    public int f6920o = 0;
    /* renamed from: p */
    public final C0710q<FreezeEffect, Long> f6921p = new C0710q();
    /* renamed from: q */
    public final C0712r<FreezeMeltdownEffect> f6922q = new C0712r();
    /* renamed from: r */
    public final C0710q<PoisonEffect, Long> f6923r = new C0710q();
    /* renamed from: s */
    public boolean f6924s = false;
    /* renamed from: t */
    public boolean f6925t = false;
    /* renamed from: u */
    public float f6926u = 0.0f;
    /* renamed from: v */
    public long f6927v = 0;
    /* renamed from: w */
    public float f6928w = 0.0f;
    /* renamed from: x */
    public boolean f6929x = false;
    /* renamed from: y */
    public float f6930y = 1.0f;
    /* renamed from: z */
    public long f6931z;

    public enum EnemyType {
        REGULAR,
        FAST,
        STRONG,
        AIR,
        JET,
        ARMORED,
        LIGHT,
        TOXIC,
        ICY,
        BONUS,
        FIGHTER,
        BOSS;
        
        /* renamed from: m */
        public static final EnemyType[] f6882m = null;

        static {
            f6882m = values();
        }
    }

    public Enemy(EnemyType enemyType) {
        this.f6914i = enemyType;
        this.f6897D = f6885F[enemyType.ordinal()];
        this.f6905U = new C0430b();
        m7602b(100.0f);
    }

    /* renamed from: a */
    public static Enemy m7591a(EnemyType enemyType) {
        switch (enemyType) {
            case REGULAR:
                return new RegularEnemy();
            case FAST:
                return new FastEnemy();
            case STRONG:
                return new StrongEnemy();
            case AIR:
                return new AirEnemy();
            case JET:
                return new JetEnemy();
            case ARMORED:
                return new ArmoredEnemy();
            case LIGHT:
                return new LightEnemy();
            case TOXIC:
                return new ToxicEnemy();
            case ICY:
                return new IcyEnemy();
            case BONUS:
                return new BonusEnemy();
            case FIGHTER:
                return new FighterEnemy();
            case BOSS:
                return new BossEnemy();
            default:
                throw new RuntimeException("Undefined enemy type: " + enemyType);
        }
    }

    /* renamed from: a */
    public static void m7592a() {
        int i = 0;
        f6885F = new C0438n[EnemyType.f6882m.length];
        for (int i2 = 0; i2 < EnemyType.f6882m.length; i2++) {
            f6885F[i2] = Game.game.f6561E.m1442a("enemy-" + i2);
        }
        f6890K = Game.game.f6561E.m1442a("blank");
        f6886G = Game.game.f6561E.m1442a("enemy-effect-freeze");
        f6887H = Game.game.f6561E.m1442a("enemy-effect-burn");
        f6888I = Game.game.f6561E.m1442a("enemy-effect-stun");
        f6889J = Game.game.f6561E.m1442a("enemy-effect-poison");
        try {
            String a = Game.game.preferences.m8838a("enemyTypesMetWith", null);
            if (a != null) {
                for (String valueOf : a.split(",")) {
                    f6892M.m2486a(EnemyType.valueOf(valueOf));
                }
            }
        } catch (Exception e) {
            Game.game.logger.m7510b("Enemy", "Failed loading log about enemy types met with");
        }
        EnemyType[] values = EnemyType.values();
        int length = values.length;
        while (i < length) {
            EnemyType enemyType = values[i];
            f6893a.mo542a(enemyType, m7591a(enemyType));
            i++;
        }
    }

    /* renamed from: b */
    public static boolean m7593b(EnemyType enemyType) {
        return !f6892M.m2490c((Object) enemyType);
    }

    /* renamed from: c */
    public static void m7594c(EnemyType enemyType) {
        if (!f6892M.m2490c((Object) enemyType)) {
            f6892M.m2486a((Object) enemyType);
            Iterator c = f6892M.m2489c();
            String str = "";
            int i = 0;
            while (c.hasNext()) {
                String str2 = str + ((EnemyType) c.next()).name();
                i++;
                if (i != f6892M.f3187a) {
                    str2 = str2 + ",";
                }
                str = str2;
            }
            Game.game.logger.log("typeNames", str);
            Game.game.preferences.m8839b("enemyTypesMetWith", str);
            Game.game.preferences.m8844d();
        }
    }

    /* renamed from: a */
    public void mo1754a(float f) {
    }

    /* renamed from: a */
    public void mo1767a(long j) {
        float f = 1.0f;
        float f2 = this.f6930y + (((0.01f * ((float) j)) / 1000.0f) / 1000.0f);
        if (f2 <= 1.0f) {
            f = f2;
        }
        this.f6930y = f;
    }

    /* renamed from: a */
    public final void mo1751a(AsyncUpdater asyncUpdater) {
        this.f6906V = asyncUpdater;
    }

    /* renamed from: a */
    public abstract boolean mo1755a(TowerType towerType);

    /* renamed from: a */
    public final boolean m7599a(Tower tower, float f) {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen == null) {
            Game.game.logger.log("Enemy#giveDamage", "gameScreen is null");
            return false;
        }
        float b = (Game.game.f6588u * f) * mo1756b(tower.f8049k);
        float f2 = b > this.f6917l ? this.f6917l : b;
        m7602b(this.f6917l - f2);
        tower.f8052n += f2;
        if (gameScreen.f7173n) {
            tower.m8455b((f2 * 0.03f) * 5.0f);
        } else {
            tower.m8455b(f2 * 0.03f);
        }
        if (gameScreen.f7183x.f7784e && gameScreen.f7183x.f7783d && gameScreen.f7183x.f7782c.f7962c == tower) {
            gameScreen.f7183x.m8274a();
        }
        synchronized (this.f6921p) {
            Iterator e;
            FreezeEffect freezeEffect;
            if (gameScreen.f7173n) {
                e = this.f6921p.mo548e();
                while (e.hasNext()) {
                    freezeEffect = (FreezeEffect) e.next();
                    freezeEffect.f6937f.m8455b(((freezeEffect.f6933b * (5.0f * f2)) / 100.0f) * 0.01f);
                }
            } else {
                e = this.f6921p.mo548e();
                while (e.hasNext()) {
                    freezeEffect = (FreezeEffect) e.next();
                    freezeEffect.f6937f.m8455b(((freezeEffect.f6933b * f2) / 100.0f) * 0.01f);
                }
            }
        }
        if (this.f6917l != 0.0f) {
            return false;
        }
        mo1764m();
        gameScreen.f7179t.m7520a(this.f6920o, this.f6909d.f2337x, this.f6909d.f2338y);
        if (this.f6915j != null && Game.game.m7478u() - gameScreen.f7170k > 50000) {
            gameScreen.f7170k = Game.game.m7478u();
            if (this.f6920o != 0) {
                b = (float) (1.5d - gameScreen.f7162c.f6471b);
                if (b > 0.0f) {
                    Sound.m7568a(this.f6915j.m, b * (0.1f + (FastBadRandom.m8809b() * 0.2f)));
                }
            }
        }
        gameScreen.f7179t.m7531c(this);
        if (gameScreen.f7173n) {
            tower.m8455b(this.f6908c * 5.0f);
        } else {
            tower.m8455b(this.f6908c);
        }
        if (this.f6914i == EnemyType.AIR || this.f6914i == EnemyType.JET) {
            Game.game.f6563G.m7429a(QuestType.KILL_AIR_ENEMIES, 1);
        }
        Game.game.f6563G.m7429a(QuestType.KILL_ENEMIES, 1);
        Game.f6554h.m7582b(StatisticsType.ENEMIES_KILLED, 1);
        Achievement.m7332a(Type.DEFEATED_ENEMIES, ((Long) Game.f6554h.f6861c.m2467a(StatisticsType.ENEMIES_KILLED)).intValue());
        gameScreen.m7841a(this.f6920o);
        Game.game.f6563G.m7429a(QuestType.GAIN_COINS, this.f6920o);
        Game.f6554h.m7582b(StatisticsType.COINS_GAINED, (long) this.f6920o);
        Achievement.m7332a(Type.EARNED_COINS, ((Long) Game.f6554h.f6861c.m2467a(StatisticsType.COINS_GAINED)).intValue());
        if (gameScreen.f7178s.f8675a == this.f6913h) {
            Wave wave = gameScreen.f7178s;
            wave.f8679e++;
            wave = gameScreen.f7178s;
            wave.f8680f += this.f6920o;
            if (gameScreen.f7180u != -1 && gameScreen.f7178s.f8679e * 2 >= gameScreen.f7178s.f8678d) {
                gameScreen.f7182w.m8236d();
            }
        }
        if (this.f6914i == EnemyType.BONUS) {
            Game.f6554h.m7582b(StatisticsType.BONUS_ENEMIES_KILLED, 1);
            Achievement.m7332a(Type.DEFEATED_BONUS_ENEMIES, ((Long) Game.f6554h.f6861c.m2467a(StatisticsType.BONUS_ENEMIES_KILLED)).intValue());
            gameScreen.m7870q();
        }
        return true;
    }

    /* renamed from: b */
    public abstract float mo1756b(TowerType towerType);

    /* renamed from: b */
    public void mo1761b() {
        C0473l c0473l = Game.game.f6559C;
        c0473l.m1410a(C0430b.f1620c);
        if (this.f6903S != 0.0f) {
            c0473l.m1411a(f6886G, this.f6909d.f2337x - 15.0f, this.f6909d.f2338y + 30.0f);
        }
        if (this.f6926u != 0.0f) {
            for (int i = 0; i < this.f6923r.f3165a; i++) {
                c0473l.m1411a(f6889J, this.f6909d.f2337x + 1.0f, (this.f6909d.f2338y + 30.0f) + ((float) (((this.f6923r.f3165a - i) - 1) * 3)));
            }
        }
        if (this.f6929x) {
            float t = ((float) ((this.f6931z + this.f6894A) - Game.game.m7477t())) / ((float) this.f6894A);
            if (t < 0.0f) {
                t = 0.0f;
            }
            if (t > 1.0f) {
                t = 1.0f;
            }
            c0473l.mo367a(1.0f, 1.0f, 1.0f, t);
            c0473l.m1411a(f6888I, this.f6909d.f2337x + 8.0f, this.f6909d.f2338y + 30.0f);
            c0473l.m1410a(C0430b.f1620c);
        }
        if (this.f6896C != 0) {
            c0473l.m1411a(f6887H, this.f6909d.f2337x - 6.0f, this.f6909d.f2338y + 30.0f);
        }
        float f = this.f6917l / this.f6918m;
        c0473l.m1410a(f6891L);
        c0473l.mo370a(f6890K, this.f6909d.f2337x - 14.0f, this.f6909d.f2338y + 26.0f, 28.0f, 4.0f);
        c0473l.m1410a(this.f6905U);
        c0473l.mo370a(f6890K, this.f6909d.f2337x - 13.0f, this.f6909d.f2338y + 27.0f, (float) ((int) (26.0f * f)), 2.0f);
    }

    /* renamed from: b */
    public final void m7602b(float f) {
        this.f6917l = f;
        float f2 = this.f6917l / this.f6918m;
        this.f6905U.m1217a(0.956f + (-0.658f * f2), 0.262f + (0.424f * f2), (f2 * 0.102f) + 0.211f, 1.0f);
    }

    /* renamed from: c */
    public final AsyncUpdater mo1752c() {
        return this.f6906V;
    }

    /* renamed from: c */
    public final void m7604c(float f) {
        this.f6919n = f;
        this.f6898N = (this.f6919n * (100.0f - this.f6903S)) / 100.0f;
        if (this.f6898N == Float.NEGATIVE_INFINITY) {
            Game.game.logger.m7510b("Enemy#setSpeed -Inf", "freeze %: " + this.f6903S);
            this.f6898N = this.f6919n;
        }
    }

    /* renamed from: d */
    public final void mo1753d() {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen == null) {
            Game.game.logger.log("Enemy#triggerAsyncUpdate()", "gameScreen is null");
            return;
        }
        float f;
        float f2;
        Object obj;
        Iterator e;
        int i;
        int i2;
        if (this.f6899O == 0) {
            if (this.f6900P == 0) {
                this.f6900P = Game.game.m7477t();
                return;
            }
            Iterator e2;
            FreezeEffect freezeEffect;
            float b;
            float t = ((float) (Game.game.m7477t() - this.f6900P)) / 1000000.0f;
            this.f6900P = Game.game.m7477t();
            f = 0.0f;
            f2 = 0.0f;
            synchronized (this.f6921p) {
                e2 = this.f6921p.mo548e();
                while (e2.hasNext()) {
                    float f3;
                    freezeEffect = (FreezeEffect) e2.next();
                    b = freezeEffect.f6933b * mo1756b(TowerType.FROST);
                    if (b >= this.f6903S) {
                        f3 = (freezeEffect.f6932a * t) + f;
                        if (b > f2) {
                            float f4 = b;
                            b = f3;
                            f3 = f4;
                        } else {
                            b = f3;
                            f3 = f2;
                        }
                    } else {
                        f3 = f2;
                        b = f;
                    }
                    f2 = f3;
                    f = b;
                }
            }
            t = 0.0f;
            synchronized (this.f6922q) {
                e2 = this.f6922q.m2489c();
                while (e2.hasNext()) {
                    obj = (FreezeMeltdownEffect) e2.next();
                    long t2 = Game.game.m7477t() - obj.f6939b;
                    if (t2 >= obj.f6940c) {
                        this.f6922q.m2488b(obj);
                    } else {
                        b = obj.f6938a * (1.0f - (((float) t2) / ((float) obj.f6940c)));
                        if (b >= 100.0f) {
                            Game.game.logger.m7510b("meltdownPercent WTF", obj.f6938a + " " + t2 + " " + obj.f6940c);
                        }
                        t = b > t ? b : t;
                    }
                }
            }
            if (f2 != 0.0f) {
                this.f6903S += f;
                if (this.f6903S > f2) {
                    this.f6903S = f2;
                }
            } else {
                this.f6903S = t;
            }
            if (this.f6903S >= 100.0f || this.f6903S < 0.0f) {
                Game.game.logger.m7510b("Enemy", "Freeze percent: " + this.f6903S + ", maxMeltdownPercent: " + t + ", maxFreezePercent: " + f2);
            }
            m7604c(this.f6919n);
            if (this.f6925t) {
                C0676a c0676a = new C0676a();
                synchronized (this.f6921p) {
                    e = this.f6921p.mo548e();
                    while (e.hasNext()) {
                        c0676a.m2296a((FreezeEffect) e.next());
                    }
                }
                for (i = 0; i < c0676a.f3001b - 1; i++) {
                    for (i2 = i + 1; i2 < c0676a.f3001b; i2++) {
                        if (((FreezeEffect) c0676a.m2291a(i)).f6935d < ((FreezeEffect) c0676a.m2291a(i2)).f6935d) {
                            obj = (FreezeEffect) c0676a.m2291a(i);
                            c0676a.mo525a(i, c0676a.m2291a(i2));
                            c0676a.mo525a(i2, obj);
                        }
                    }
                }
                this.f6927v = 0;
                this.f6928w = 0.0f;
                e = c0676a.iterator();
                b = 1.0f;
                while (e.hasNext()) {
                    freezeEffect = (FreezeEffect) e.next();
                    this.f6927v += (long) ((freezeEffect.f6935d * b) * 1000000.0f);
                    this.f6928w = (freezeEffect.f6936e * b) + this.f6928w;
                    b = 0.66f * b;
                }
                this.f6925t = false;
            }
        } else if (this.f6899O == 1) {
            if (this.f6901Q == 0) {
                this.f6901Q = Game.game.m7477t();
                return;
            }
            f = ((float) (Game.game.m7477t() - this.f6901Q)) / 1000000.0f;
            this.f6901Q = Game.game.m7477t();
            long t3 = Game.game.m7477t();
            synchronized (this.f6923r) {
                C0706a b2 = this.f6923r.mo544b();
                while (b2.hasNext()) {
                    C0707b a = b2.mo538a();
                    obj = (PoisonEffect) a.f3163a;
                    if (((Long) a.f3164b).longValue() < t3) {
                        this.f6923r.mo545b(obj);
                        this.f6924s = true;
                    }
                }
            }
            if (this.f6924s) {
                this.f6904T = new HashMap();
                C0676a c0676a2 = new C0676a();
                Iterator e3 = this.f6923r.mo548e();
                while (e3.hasNext()) {
                    c0676a2.m2296a((PoisonEffect) e3.next());
                }
                for (i = 0; i < c0676a2.f3001b - 1; i++) {
                    for (i2 = i + 1; i2 < c0676a2.f3001b; i2++) {
                        if (((PoisonEffect) c0676a2.m2291a(i)).f6942b < ((PoisonEffect) c0676a2.m2291a(i2)).f6942b) {
                            obj = (PoisonEffect) c0676a2.m2291a(i);
                            c0676a2.mo525a(i, c0676a2.m2291a(i2));
                            c0676a2.mo525a(i2, obj);
                        }
                    }
                }
                Iterator it = c0676a2.iterator();
                f2 = 0.0f;
                i2 = 0;
                while (it.hasNext()) {
                    PoisonEffect poisonEffect = (PoisonEffect) it.next();
                    float pow = poisonEffect.f6942b * ((float) Math.pow(0.75d, (double) i2));
                    f2 += pow;
                    this.f6904T.put(poisonEffect, Float.valueOf(pow));
                    i2++;
                }
                this.f6926u = f2;
                this.f6924s = false;
            }
            for (Entry entry : this.f6904T.entrySet()) {
                gameScreen.m7851a(((PoisonEffect) entry.getKey()).f6941a, this, ((Float) entry.getValue()).floatValue() * f);
            }
        } else if (this.f6902R == 0) {
            this.f6902R = Game.game.m7477t();
            return;
        } else {
            long t4 = Game.game.m7477t() - this.f6902R;
            this.f6902R = Game.game.m7477t();
            if (this.f6896C != 0) {
                if (t4 > this.f6896C) {
                    t4 = this.f6896C;
                }
                f2 = 0.02f;
                for (GlobalUpgradeType globalUpgradeType : f6884E) {
                    if (GlobalUpgrade.m7492a(globalUpgradeType)) {
                        f2 = GlobalUpgrade.m7495c(globalUpgradeType).f6630u[0] / 100.0f;
                        break;
                    }
                }
                gameScreen.m7851a(this.f6895B, this, (f2 * this.f6918m) * (((float) t4) / 1000000.0f));
                this.f6896C -= t4;
            }
        }
        this.f6929x = this.f6931z + this.f6894A > Game.game.m7477t();
        this.f6899O = (this.f6899O + 1) % 3;
    }

    /* renamed from: e */
    public float mo1765e() {
        return this.f6929x ? 0.0f : this.f6898N;
    }

    /* renamed from: f */
    public abstract String mo1757f();

    /* renamed from: g */
    public abstract String mo1758g();

    /* renamed from: h */
    public abstract C0430b mo1759h();

    /* renamed from: i */
    public boolean mo1766i() {
        return true;
    }

    /* renamed from: j */
    public abstract boolean mo1760j();

    /* renamed from: k */
    public int mo1762k() {
        return 1;
    }

    /* renamed from: l */
    public void mo1763l() {
    }

    /* renamed from: m */
    public void mo1764m() {
    }
}
