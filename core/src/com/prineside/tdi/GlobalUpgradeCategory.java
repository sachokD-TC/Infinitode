package com.prineside.tdi;

import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.utils.C0710q;

public class GlobalUpgradeCategory {
    /* renamed from: a */
    public static final C0710q<Alias, GlobalUpgradeCategory> f6684a = new C0710q();
    /* renamed from: b */
    public Alias f6685b;
    /* renamed from: c */
    public String f6686c;
    /* renamed from: d */
    public String f6687d;
    /* renamed from: e */
    public C0438n f6688e;
    /* renamed from: f */
    public boolean f6689f;

    enum Alias {
        ROOT,
        MAP_EDITOR_MAP_SIZE,
        FORCE_WAVE_ABILITY,
        TOWER_TYPE_BASIC,
        TOWER_PRICE,
        TOWER_RANGE,
        TOWER_ATTACK_SPEED,
        TOWER_MAX_UPGRADE_LEVEL,
        TOWER_U_DAMAGE_MULTIPLIER,
        TOWER_ROTATION_N_PROJECTILE_SPEED,
        TOWER_MAX_TOWER_LEVEL,
        TOWER_DAMAGE,
        TOWER_STARTING_EXPERIENCE,
        TOWER_EXPERIENCE_BONUS,
        TOWER_EXPERIENCE_GENERATION,
        TOWER_UPGRADE_PRICE,
        TOWER_TYPE_VENOM,
        TOWER_POISON_DAMAGE,
        GAME_SPEED_X2,
        GAME_SPEED_X4,
        FORCED_WAVE_BONUS,
        TOWER_TYPE_SPLASH,
        TOWER_ACCURACY,
        TOWER_S_COMBO_HIT_DAMAGE,
        TOWER_U_PROJECTILE_COUNT,
        TOWER_TYPE_FROST,
        STARTING_HEALTH,
        TOWER_U_POISON_DURATION_BONUS,
        TOWER_U_CHAIN_LIGHTNING_LENGTH_BONUS,
        TOWER_FREEZE_SPEED,
        TOWER_MELTDOWN_SPEED,
        TOWER_FREEZE_PERCENT,
        TOWER_TYPE_AIR,
        TOWER_S_BURN_DAMAGE,
        TOWER_U_BURN_CHANCE,
        TOWER_S_BURN_DURATION,
        STARTING_MONEY,
        TOWER_TYPE_MULTISHOT,
        TOWER_U_SHOT_ANGLE,
        TOWER_TYPE_MINIGUN,
        TOWER_ROTATION_SPEED,
        TOWER_U_SPEED_UP_TIME,
        TOWER_TYPE_MISSILE,
        TOWER_S_MISSILE_LIFE_TIME,
        TOWER_U_PROJECTILE_EXPLOSION_RANGE,
        TOWER_U_LRM_AIM_TIME,
        TOWER_S_MISSILE_ROTATION_SPEED,
        TOWER_S_MINIMUM_RANGE,
        WAVE_DELAY,
        TOWER_TYPE_TESLA,
        TOWER_CHAIN_DAMAGE,
        TOWER_U_CHAIN_LIGHTNING_LENGTH,
        TOWER_TYPE_BLAST,
        TOWER_U_STUN_DURATION,
        TOWER_STUN_CHANCE,
        TOWER_TYPE_SNIPER,
        TOWER_U_CRIT_DAMAGE,
        TOWER_AIM_TIME,
        TOWER_U_CRIT_CHANCE,
        TOWER_SELL_REFUND,
        TOWER_TYPE_CANNON,
        TOWER_U_POISON_DURATION,
        GAME_PRIZES_MULTIPLIER;
        
        public static Alias[] al;

        static {
            al = values();
        }
    }

    private GlobalUpgradeCategory(Alias alias, String str, String str2, String str3, boolean z) {
        this.f6685b = alias;
        this.f6686c = str;
        this.f6687d = str2;
        this.f6689f = z;
        this.f6688e = Game.game.f6561E.m1442a(str3);
        if (this.f6688e == null) {
            throw new RuntimeException("GlobalUpgradeCategory - icon '" + str3 + "' not found");
        }
    }

    /* renamed from: a */
    public static GlobalUpgradeCategory m7501a(Alias alias) {
        return (GlobalUpgradeCategory) f6684a.m2467a((Object) alias);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static void m7502a() {
        /*
        r7 = 0;
        r6 = 0;
        r0 = new com.badlogic.gdx.utils.ah;
        r0.<init>();
        r1 = com.badlogic.gdx.Gdx.files;
        r2 = "global-upgrade-categories.xml";
        r1 = r1.mo277b(r2);
        r9 = r0.m2368a(r1);
        r10 = r9.m2356a();
        r8 = r6;
    L_0x0018:
        if (r8 >= r10) goto L_0x006e;
    L_0x001a:
        r1 = r9.m2358a(r8);
        r0 = "alias";
        r11 = r1.m2359a(r0);
        r0 = "title";
        r2 = r1.m2359a(r0);
        r0 = "description";
        r3 = r1.m2359a(r0);
        r0 = "icon";
        r4 = r1.m2359a(r0);
        r5 = "has-levels";
        r0 = r1.f3029b;
        if (r0 == 0) goto L_0x005b;
    L_0x003c:
        r0 = r1.f3029b;
        r0 = r0.m2467a(r5);
        r0 = (java.lang.String) r0;
        if (r0 == 0) goto L_0x005b;
    L_0x0046:
        if (r0 != 0) goto L_0x0069;
    L_0x0048:
        r5 = r6;
    L_0x0049:
        r1 = com.prineside.tdi.GlobalUpgradeCategory.Alias.valueOf(r11);
        r0 = new com.prineside.tdi.GlobalUpgradeCategory;
        r0.<init>(r1, r2, r3, r4, r5);
        r2 = f6684a;
        r2.mo542a(r1, r0);
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x0018;
    L_0x005b:
        r0 = r1.m2361b(r5);
        if (r0 != 0) goto L_0x0063;
    L_0x0061:
        r0 = r7;
        goto L_0x0046;
    L_0x0063:
        r0 = r0.f3031d;
        if (r0 != 0) goto L_0x0046;
    L_0x0067:
        r0 = r7;
        goto L_0x0046;
    L_0x0069:
        r5 = java.lang.Boolean.parseBoolean(r0);
        goto L_0x0049;
    L_0x006e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prineside.tdi.GlobalUpgradeCategory.a():void");
    }
}
