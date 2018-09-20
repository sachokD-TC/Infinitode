package com.prineside.tdi.towers;

import com.badlogic.gdx.graphics.g2d.C0438n;
import com.prineside.tdi.Game;

public class TowerUpgrade {
    /* renamed from: c */
    private static TowerUpgrade[] f8119c;
    /* renamed from: a */
    public String f8120a;
    /* renamed from: b */
    public C0438n f8121b;
    /* renamed from: d */
    private TowerUpgradeType f8122d;

    public enum TowerUpgradeType {
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
        ROTATION_N_PROJECTILE_SPEED,
        LIGHTNING_DAMAGE;
        
        /* renamed from: o */
        public static final TowerUpgradeType[] f8117o = null;

        static {
            f8117o = values();
        }
    }

    private TowerUpgrade(TowerUpgradeType towerUpgradeType, String str, String str2) {
        this.f8122d = towerUpgradeType;
        this.f8120a = str;
        this.f8121b = Game.game.f6561E.m1442a(str2);
        f8119c[towerUpgradeType.ordinal()] = this;
    }

    /* renamed from: a */
    public static TowerUpgrade m8489a(TowerUpgradeType towerUpgradeType) {
        return f8119c[towerUpgradeType.ordinal()];
    }

    /* renamed from: a */
    public static void m8490a() {
        f8119c = new TowerUpgrade[TowerUpgradeType.f8117o.length];
        TowerUpgrade towerUpgrade = new TowerUpgrade(TowerUpgradeType.RANGE, "tower_upgrade_RANGE", "tower-stat-range");
        towerUpgrade = new TowerUpgrade(TowerUpgradeType.DAMAGE, "tower_upgrade_DAMAGE", "tower-stat-damage");
        towerUpgrade = new TowerUpgrade(TowerUpgradeType.ATTACK_SPEED, "tower_upgrade_ATTACK_SPEED", "tower-stat-attack-speed");
        towerUpgrade = new TowerUpgrade(TowerUpgradeType.ROTATION_SPEED, "tower_upgrade_ROTATION_SPEED", "tower-stat-rotation-speed");
        towerUpgrade = new TowerUpgrade(TowerUpgradeType.PROJECTILE_SPEED, "tower_upgrade_PROJECTILE_SPEED", "tower-stat-projectile-speed");
        towerUpgrade = new TowerUpgrade(TowerUpgradeType.AIM_TIME, "tower_upgrade_AIM_TIME", "tower-stat-aim-time");
        towerUpgrade = new TowerUpgrade(TowerUpgradeType.FREEZE_PERCENT, "tower_upgrade_FREEZE_PERCENT", "tower-stat-freeze-percent");
        towerUpgrade = new TowerUpgrade(TowerUpgradeType.FREEZE_TIME, "tower_upgrade_FREEZE_TIME", "tower-stat-freeze-time");
        towerUpgrade = new TowerUpgrade(TowerUpgradeType.FREEZE_MELTDOWN_TIME, "tower_upgrade_FREEZE_MELTDOWN_TIME", "tower-stat-freeze-meltdown-time");
        towerUpgrade = new TowerUpgrade(TowerUpgradeType.POISON_DAMAGE, "tower_upgrade_POISON_DAMAGE", "tower-stat-poison-damage");
        towerUpgrade = new TowerUpgrade(TowerUpgradeType.ACCURACY, "tower_upgrade_ACCURACY", "tower-stat-accuracy");
        towerUpgrade = new TowerUpgrade(TowerUpgradeType.STUN_CHANCE, "tower_upgrade_STUN_CHANCE", "tower-stat-stun-chance");
        towerUpgrade = new TowerUpgrade(TowerUpgradeType.ROTATION_N_PROJECTILE_SPEED, "tower_upgrade_ROTATION_N_PROJECTILE_SPEED", "tower-stat-rotation-n-projectile-speed");
        towerUpgrade = new TowerUpgrade(TowerUpgradeType.LIGHTNING_DAMAGE, "tower_upgrade_LIGHTNING_DAMAGE", "tower-stat-lightning-damage");
    }
}
