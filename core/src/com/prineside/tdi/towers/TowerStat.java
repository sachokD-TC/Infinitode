package com.prineside.tdi.towers;

import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.g2d.C0480m;
import com.badlogic.gdx.scenes.scene2d.utils.C0663k;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0710q;
import com.prineside.tdi.Game;
import java.util.Iterator;
import java.util.Locale;

public class TowerStat {
    /* renamed from: f */
    private static C0710q<TowerStatType, TowerStat> f8097f = new C0710q();
    /* renamed from: a */
    public String f8098a;
    /* renamed from: b */
    public String f8099b;
    /* renamed from: c */
    public TowerStatType f8100c;
    /* renamed from: d */
    public boolean f8101d;
    /* renamed from: e */
    public C0663k f8102e;

    public enum TowerStatType {
        RANGE,
        DAMAGE,
        ATTACK_SPEED,
        ROTATION_SPEED,
        PROJECTILE_SPEED,
        AIM_TIME,
        FREEZE_PERCENT,
        FREEZE_TIME,
        FREEZE_MELTDOWN_TIME,
        POISON_DAMAGE,
        ACCURACY,
        STUN_CHANCE,
        CHAIN_LIGHTNING_DAMAGE,
        U_DAMAGE_MULTIPLY,
        U_CRIT_CHANCE,
        U_CRIT_MULTIPLIER,
        U_EXPLOSION_RANGE,
        U_POISON_DURATION_BONUS,
        U_CHAIN_LIGHTNING_BONUS_LENGTH,
        U_POISON_DURATION,
        U_PROJECTILE_COUNT,
        U_STUN_DURATION,
        U_BURN_CHANCE,
        U_SPEED_UP_TIME,
        U_SHOOT_ANGLE,
        U_CHAIN_LIGHTNING_LENGTH,
        U_LRM_AIM_TIME;
        
        /* renamed from: B */
        public static final TowerStatType[] f8067B = null;
        /* renamed from: C */
        public static final TowerStatType[] f8068C = null;
        /* renamed from: D */
        public static final TowerStatType[] f8069D = null;

        static {
            f8067B = values();
            C0676a c0676a = new C0676a();
            C0676a c0676a2 = new C0676a();
            for (Object obj : f8067B) {
                if (obj.name().startsWith("U_")) {
                    c0676a2.m2296a(obj);
                } else {
                    c0676a.m2296a(obj);
                }
            }
            f8068C = new TowerStatType[c0676a.f3001b];
            f8069D = new TowerStatType[c0676a2.f3001b];
            Iterator it = c0676a.iterator();
            int i = 0;
            while (it.hasNext()) {
                f8068C[i] = (TowerStatType) it.next();
                i++;
            }
            Iterator it2 = c0676a2.iterator();
            while (it2.hasNext()) {
                f8069D[r2] = (TowerStatType) it2.next();
                int i2++;
            }
        }
    }

    private TowerStat(TowerStatType towerStatType, String str, C0438n c0438n) {
        if (c0438n == null) {
            Game.game.logger.m7510b("TowerStat", "Icon texture region is null for stat type " + towerStatType);
        }
        this.f8100c = towerStatType;
        this.f8099b = str;
        this.f8098a = str + "_short";
        this.f8101d = towerStatType.name().startsWith("U_");
        this.f8102e = new C0663k(c0438n);
        f8097f.mo542a(towerStatType, this);
    }

    /* renamed from: a */
    public static TowerStat m8484a(TowerStatType towerStatType) {
        return (TowerStat) f8097f.m2467a((Object) towerStatType);
    }

    /* renamed from: a */
    public static void m8485a() {
        C0480m c0480m = Game.game.f6561E;
        TowerStat towerStat = new TowerStat(TowerStatType.RANGE, "tower_stat_RANGE", c0480m.m1442a("tower-stat-range"));
        towerStat = new TowerStat(TowerStatType.DAMAGE, "tower_stat_DAMAGE", c0480m.m1442a("tower-stat-damage"));
        towerStat = new TowerStat(TowerStatType.ATTACK_SPEED, "tower_stat_ATTACK_SPEED", c0480m.m1442a("tower-stat-attack-speed"));
        towerStat = new TowerStat(TowerStatType.ROTATION_SPEED, "tower_stat_ROTATION_SPEED", c0480m.m1442a("tower-stat-rotation-speed"));
        towerStat = new TowerStat(TowerStatType.PROJECTILE_SPEED, "tower_stat_PROJECTILE_SPEED", c0480m.m1442a("tower-stat-projectile-speed"));
        towerStat = new TowerStat(TowerStatType.AIM_TIME, "tower_stat_AIM_TIME", c0480m.m1442a("tower-stat-aim-time"));
        towerStat = new TowerStat(TowerStatType.FREEZE_PERCENT, "tower_stat_FREEZE_PERCENT", c0480m.m1442a("tower-stat-freeze-percent"));
        towerStat = new TowerStat(TowerStatType.FREEZE_TIME, "tower_stat_FREEZE_TIME", c0480m.m1442a("tower-stat-freeze-time"));
        towerStat = new TowerStat(TowerStatType.FREEZE_MELTDOWN_TIME, "tower_stat_FREEZE_MELTDOWN_TIME", c0480m.m1442a("tower-stat-freeze-meltdown-time"));
        towerStat = new TowerStat(TowerStatType.POISON_DAMAGE, "tower_stat_POISON_DAMAGE", c0480m.m1442a("tower-stat-poison-damage"));
        towerStat = new TowerStat(TowerStatType.ACCURACY, "tower_stat_ACCURACY", c0480m.m1442a("tower-stat-accuracy"));
        towerStat = new TowerStat(TowerStatType.STUN_CHANCE, "tower_stat_STUN_CHANCE", c0480m.m1442a("tower-stat-stun-chance"));
        towerStat = new TowerStat(TowerStatType.CHAIN_LIGHTNING_DAMAGE, "tower_stat_CHAIN_LIGHTNING_DAMAGE", c0480m.m1442a("tower-stat-chain-damage"));
        C0438n a = c0480m.m1442a("tower-stat-unique");
        towerStat = new TowerStat(TowerStatType.U_DAMAGE_MULTIPLY, "tower_stat_U_DAMAGE_MULTIPLY", a);
        towerStat = new TowerStat(TowerStatType.U_CRIT_CHANCE, "tower_stat_U_CRIT_CHANCE", a);
        towerStat = new TowerStat(TowerStatType.U_CRIT_MULTIPLIER, "tower_stat_U_CRIT_MULTIPLIER", a);
        towerStat = new TowerStat(TowerStatType.U_EXPLOSION_RANGE, "tower_stat_U_EXPLOSION_RANGE", a);
        towerStat = new TowerStat(TowerStatType.U_POISON_DURATION_BONUS, "tower_stat_U_POISON_DURATION_BONUS", a);
        towerStat = new TowerStat(TowerStatType.U_CHAIN_LIGHTNING_BONUS_LENGTH, "tower_stat_U_CHAIN_LIGHTNING_BONUS_LENGTH", a);
        towerStat = new TowerStat(TowerStatType.U_POISON_DURATION, "tower_stat_U_POISON_DURATION", a);
        towerStat = new TowerStat(TowerStatType.U_PROJECTILE_COUNT, "tower_stat_U_PROJECTILE_COUNT", a);
        towerStat = new TowerStat(TowerStatType.U_STUN_DURATION, "tower_stat_U_STUN_DURATION", a);
        towerStat = new TowerStat(TowerStatType.U_BURN_CHANCE, "tower_stat_U_BURN_CHANCE", a);
        towerStat = new TowerStat(TowerStatType.U_SPEED_UP_TIME, "tower_stat_U_SPEED_UP_TIME", a);
        towerStat = new TowerStat(TowerStatType.U_SHOOT_ANGLE, "tower_stat_U_SHOOT_ANGLE", a);
        towerStat = new TowerStat(TowerStatType.U_CHAIN_LIGHTNING_LENGTH, "tower_stat_U_CHAIN_LIGHTNING_LENGTH", a);
        towerStat = new TowerStat(TowerStatType.U_LRM_AIM_TIME, "tower_stat_U_LRM_AIM_TIME", a);
    }

    /* renamed from: a */
    public final String m8486a(float f, boolean z) {
        String format;
        if (f < 1.0f) {
            format = String.format(Locale.ENGLISH, "%.3f", new Object[]{Float.valueOf(f)});
        } else if (f < 10.0f) {
            format = String.format(Locale.ENGLISH, "%.2f", new Object[]{Float.valueOf(f)});
        } else if (f < 100.0f) {
            format = String.format(Locale.ENGLISH, "%.1f", new Object[]{Float.valueOf(f)});
        } else {
            format = String.format(Locale.ENGLISH, "%d", new Object[]{Integer.valueOf(Math.round(f))});
        }
        if (!z) {
            return format;
        }
        switch (this.f8100c) {
            case ATTACK_SPEED:
            case ROTATION_SPEED:
            case POISON_DAMAGE:
                return format + "/s";
            case AIM_TIME:
            case FREEZE_TIME:
            case FREEZE_MELTDOWN_TIME:
            case U_POISON_DURATION:
            case U_STUN_DURATION:
            case U_SPEED_UP_TIME:
            case U_LRM_AIM_TIME:
                return format + "s";
            case FREEZE_PERCENT:
            case STUN_CHANCE:
            case CHAIN_LIGHTNING_DAMAGE:
            case U_CRIT_CHANCE:
            case U_BURN_CHANCE:
                return format + "%";
            case U_DAMAGE_MULTIPLY:
            case U_CRIT_MULTIPLIER:
                return "x" + format;
            case U_CHAIN_LIGHTNING_BONUS_LENGTH:
                return "+" + format;
            case U_POISON_DURATION_BONUS:
                return "+" + format + "s";
            default:
                return format;
        }
    }

    /* renamed from: b */
    public final String m8487b() {
        return Game.f6551e.m2416a(this.f8099b);
    }

    /* renamed from: c */
    public final String m8488c() {
        return Game.f6551e.m2416a(this.f8098a);
    }
}
