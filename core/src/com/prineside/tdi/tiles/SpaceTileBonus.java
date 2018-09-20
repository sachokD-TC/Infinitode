package com.prineside.tdi.tiles;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0710q;
import com.prineside.tdi.towers.TowerStat;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.utility.MaterialColor.AMBER;
import com.prineside.tdi.utility.MaterialColor.BLUE;
import com.prineside.tdi.utility.MaterialColor.CYAN;
import com.prineside.tdi.utility.MaterialColor.DEEP_ORANGE;
import com.prineside.tdi.utility.MaterialColor.DEEP_PURPLE;
import com.prineside.tdi.utility.MaterialColor.GREEN;
import com.prineside.tdi.utility.MaterialColor.INDIGO;
import com.prineside.tdi.utility.MaterialColor.LIME;
import com.prineside.tdi.utility.MaterialColor.ORANGE;
import com.prineside.tdi.utility.MaterialColor.PINK;
import com.prineside.tdi.utility.MaterialColor.PURPLE;
import com.prineside.tdi.utility.MaterialColor.RED;
import com.prineside.tdi.utility.MaterialColor.TEAL;

public class SpaceTileBonus {
    /* renamed from: a */
    public static C0710q<TowerStatType, C0676a<Float>> f7947a;
    /* renamed from: b */
    public static C0710q<TowerStatType, C0430b> f7948b;
    /* renamed from: c */
    public static C0710q<TowerStatType, C0430b> f7949c;
    /* renamed from: d */
    public TowerStatType f7950d;
    /* renamed from: e */
    public int f7951e;

    static {
        C0710q c0710q = new C0710q();
        f7947a = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, new C0676a(new Float[]{Float.valueOf(1.1f), Float.valueOf(1.25f), Float.valueOf(1.5f)}));
        f7947a.mo542a(TowerStatType.DAMAGE, new C0676a(new Float[]{Float.valueOf(1.1f), Float.valueOf(1.25f), Float.valueOf(1.5f)}));
        f7947a.mo542a(TowerStatType.ATTACK_SPEED, new C0676a(new Float[]{Float.valueOf(1.1f), Float.valueOf(1.25f), Float.valueOf(1.5f)}));
        f7947a.mo542a(TowerStatType.ROTATION_SPEED, new C0676a(new Float[]{Float.valueOf(1.1f), Float.valueOf(1.25f), Float.valueOf(1.5f)}));
        f7947a.mo542a(TowerStatType.PROJECTILE_SPEED, new C0676a(new Float[]{Float.valueOf(1.1f), Float.valueOf(1.25f), Float.valueOf(1.5f)}));
        f7947a.mo542a(TowerStatType.AIM_TIME, new C0676a(new Float[]{Float.valueOf(0.91f), Float.valueOf(0.8f), Float.valueOf(0.67f)}));
        f7947a.mo542a(TowerStatType.FREEZE_PERCENT, new C0676a(new Float[]{Float.valueOf(1.05f), Float.valueOf(1.12f), Float.valueOf(1.2f)}));
        f7947a.mo542a(TowerStatType.FREEZE_TIME, new C0676a(new Float[]{Float.valueOf(0.91f), Float.valueOf(0.8f), Float.valueOf(0.67f)}));
        f7947a.mo542a(TowerStatType.FREEZE_MELTDOWN_TIME, new C0676a(new Float[]{Float.valueOf(1.1f), Float.valueOf(1.25f), Float.valueOf(1.5f)}));
        f7947a.mo542a(TowerStatType.POISON_DAMAGE, new C0676a(new Float[]{Float.valueOf(1.1f), Float.valueOf(1.25f), Float.valueOf(1.5f)}));
        f7947a.mo542a(TowerStatType.ACCURACY, new C0676a(new Float[]{Float.valueOf(1.1f), Float.valueOf(1.25f), Float.valueOf(1.5f)}));
        f7947a.mo542a(TowerStatType.STUN_CHANCE, new C0676a(new Float[]{Float.valueOf(1.1f), Float.valueOf(1.25f), Float.valueOf(1.5f)}));
        f7947a.mo542a(TowerStatType.CHAIN_LIGHTNING_DAMAGE, new C0676a(new Float[]{Float.valueOf(1.1f), Float.valueOf(1.25f), Float.valueOf(1.5f)}));
        c0710q = new C0710q();
        f7948b = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, GREEN.f8487f);
        f7948b.mo542a(TowerStatType.DAMAGE, RED.f8609f);
        f7948b.mo542a(TowerStatType.ATTACK_SPEED, PURPLE.f8595f);
        f7948b.mo542a(TowerStatType.ROTATION_SPEED, AMBER.f8397f);
        f7948b.mo542a(TowerStatType.PROJECTILE_SPEED, DEEP_PURPLE.f8473f);
        f7948b.mo542a(TowerStatType.AIM_TIME, LIME.f8553f);
        f7948b.mo542a(TowerStatType.FREEZE_PERCENT, CYAN.f8445f);
        f7948b.mo542a(TowerStatType.FREEZE_TIME, BLUE.f8411f);
        f7948b.mo542a(TowerStatType.FREEZE_MELTDOWN_TIME, INDIGO.f8511f);
        f7948b.mo542a(TowerStatType.POISON_DAMAGE, PINK.f8581f);
        f7948b.mo542a(TowerStatType.ACCURACY, TEAL.f8623f);
        f7948b.mo542a(TowerStatType.STUN_CHANCE, ORANGE.f8567f);
        f7948b.mo542a(TowerStatType.CHAIN_LIGHTNING_DAMAGE, DEEP_ORANGE.f8459f);
        c0710q = new C0710q();
        f7949c = c0710q;
        c0710q.mo542a(TowerStatType.RANGE, GREEN.f8485d);
        f7949c.mo542a(TowerStatType.DAMAGE, RED.f8607d);
        f7949c.mo542a(TowerStatType.ATTACK_SPEED, PURPLE.f8593d);
        f7949c.mo542a(TowerStatType.ROTATION_SPEED, AMBER.f8395d);
        f7949c.mo542a(TowerStatType.PROJECTILE_SPEED, DEEP_PURPLE.f8471d);
        f7949c.mo542a(TowerStatType.AIM_TIME, LIME.f8551d);
        f7949c.mo542a(TowerStatType.FREEZE_PERCENT, CYAN.f8443d);
        f7949c.mo542a(TowerStatType.FREEZE_TIME, BLUE.f8409d);
        f7949c.mo542a(TowerStatType.FREEZE_MELTDOWN_TIME, INDIGO.f8509d);
        f7949c.mo542a(TowerStatType.POISON_DAMAGE, PINK.f8579d);
        f7949c.mo542a(TowerStatType.ACCURACY, TEAL.f8621d);
        f7949c.mo542a(TowerStatType.STUN_CHANCE, ORANGE.f8565d);
        f7949c.mo542a(TowerStatType.CHAIN_LIGHTNING_DAMAGE, DEEP_ORANGE.f8457d);
    }

    public SpaceTileBonus(TowerStatType towerStatType, int i) {
        if (TowerStat.m8484a(towerStatType).f8101d) {
            throw new RuntimeException("Invalid stat type: " + towerStatType + ", must not be unique");
        } else if (i < 0 || i > 3) {
            throw new RuntimeException("Invalid bonus level: " + i);
        } else {
            this.f7950d = towerStatType;
            this.f7951e = i;
        }
    }

    /* renamed from: a */
    public final float m8361a() {
        return this.f7951e == 0 ? 1.0f : ((Float) ((C0676a) f7947a.m2467a(this.f7950d)).m2291a(this.f7951e - 1)).floatValue();
    }

    /* renamed from: b */
    public final C0430b m8362b() {
        return (C0430b) f7948b.m2467a(this.f7950d);
    }

    /* renamed from: c */
    public final float m8363c() {
        return ((Float) ((C0676a) f7947a.m2467a(this.f7950d)).m2291a(this.f7951e - 1)).floatValue();
    }

    /* renamed from: d */
    public final C0430b m8364d() {
        return (C0430b) f7949c.m2467a(this.f7950d);
    }
}
