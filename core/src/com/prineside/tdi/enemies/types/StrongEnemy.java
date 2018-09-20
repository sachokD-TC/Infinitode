package com.prineside.tdi.enemies.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.utils.C0710q;
import com.prineside.tdi.Game;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.towers.Tower.TowerType;
import com.prineside.tdi.utility.MaterialColor.DEEP_ORANGE;

public class StrongEnemy extends Enemy {
    /* renamed from: E */
    public static final C0710q<TowerType, Boolean> f6975E;
    /* renamed from: F */
    public static final C0710q<TowerType, Float> f6976F;

    static {
        C0710q c0710q = new C0710q();
        f6975E = c0710q;
        c0710q.mo542a(TowerType.BASIC, Boolean.valueOf(true));
        f6975E.mo542a(TowerType.SNIPER, Boolean.valueOf(true));
        f6975E.mo542a(TowerType.CANNON, Boolean.valueOf(true));
        f6975E.mo542a(TowerType.FROST, Boolean.valueOf(true));
        f6975E.mo542a(TowerType.VENOM, Boolean.valueOf(true));
        f6975E.mo542a(TowerType.SPLASH, Boolean.valueOf(true));
        f6975E.mo542a(TowerType.BLAST, Boolean.valueOf(true));
        f6975E.mo542a(TowerType.MULTISHOT, Boolean.valueOf(true));
        f6975E.mo542a(TowerType.MINIGUN, Boolean.valueOf(true));
        f6975E.mo542a(TowerType.AIR, Boolean.valueOf(false));
        f6975E.mo542a(TowerType.TESLA, Boolean.valueOf(true));
        f6975E.mo542a(TowerType.MISSILE, Boolean.valueOf(true));
        c0710q = new C0710q();
        f6976F = c0710q;
        c0710q.mo542a(TowerType.BASIC, Float.valueOf(0.75f));
        f6976F.mo542a(TowerType.SNIPER, Float.valueOf(1.0f));
        f6976F.mo542a(TowerType.CANNON, Float.valueOf(1.0f));
        f6976F.mo542a(TowerType.FROST, Float.valueOf(1.0f));
        f6976F.mo542a(TowerType.VENOM, Float.valueOf(1.0f));
        f6976F.mo542a(TowerType.SPLASH, Float.valueOf(0.75f));
        f6976F.mo542a(TowerType.BLAST, Float.valueOf(1.0f));
        f6976F.mo542a(TowerType.MULTISHOT, Float.valueOf(0.75f));
        f6976F.mo542a(TowerType.MINIGUN, Float.valueOf(0.5f));
        f6976F.mo542a(TowerType.AIR, Float.valueOf(1.0f));
        f6976F.mo542a(TowerType.TESLA, Float.valueOf(1.0f));
        f6976F.mo542a(TowerType.MISSILE, Float.valueOf(1.0f));
    }

    public StrongEnemy() {
        super(EnemyType.STRONG);
    }

    /* renamed from: a */
    public final void mo1754a(float f) {
        super.mo1754a(f);
        Game.game.f6559C.mo371a(this.D, this.d.f2337x - 32.0f, this.d.f2338y - 32.0f, 32.0f, 32.0f, 64.0f, 64.0f, 1.0f, 1.0f, this.e);
    }

    /* renamed from: a */
    public final boolean mo1755a(TowerType towerType) {
        return ((Boolean) f6975E.m2467a((Object) towerType)).booleanValue();
    }

    /* renamed from: b */
    public final float mo1756b(TowerType towerType) {
        return ((Float) f6976F.m2467a((Object) towerType)).floatValue();
    }

    /* renamed from: f */
    public final String mo1757f() {
        return Game.f6551e.m2416a("enemy_name_STRONG");
    }

    /* renamed from: g */
    public final String mo1758g() {
        return Game.f6551e.m2416a("enemy_description_STRONG");
    }

    /* renamed from: h */
    public final C0430b mo1759h() {
        return DEEP_ORANGE.f8459f;
    }

    /* renamed from: j */
    public final boolean mo1760j() {
        return false;
    }

    /* renamed from: k */
    public final int mo1762k() {
        return 2;
    }
}
