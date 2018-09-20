package com.prineside.tdi.enemies.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.utils.C0710q;
import com.prineside.tdi.Game;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.towers.Tower.TowerType;
import com.prineside.tdi.utility.MaterialColor.PURPLE;

public class BossEnemy extends Enemy {
    /* renamed from: E */
    public static final C0710q<TowerType, Boolean> f6958E;
    /* renamed from: F */
    public static final C0710q<TowerType, Float> f6959F;

    static {
        C0710q c0710q = new C0710q();
        f6958E = c0710q;
        c0710q.mo542a(TowerType.BASIC, Boolean.valueOf(true));
        f6958E.mo542a(TowerType.SNIPER, Boolean.valueOf(true));
        f6958E.mo542a(TowerType.CANNON, Boolean.valueOf(true));
        f6958E.mo542a(TowerType.FROST, Boolean.valueOf(true));
        f6958E.mo542a(TowerType.VENOM, Boolean.valueOf(true));
        f6958E.mo542a(TowerType.SPLASH, Boolean.valueOf(true));
        f6958E.mo542a(TowerType.BLAST, Boolean.valueOf(true));
        f6958E.mo542a(TowerType.MULTISHOT, Boolean.valueOf(true));
        f6958E.mo542a(TowerType.MINIGUN, Boolean.valueOf(true));
        f6958E.mo542a(TowerType.AIR, Boolean.valueOf(false));
        f6958E.mo542a(TowerType.TESLA, Boolean.valueOf(true));
        f6958E.mo542a(TowerType.MISSILE, Boolean.valueOf(true));
        c0710q = new C0710q();
        f6959F = c0710q;
        c0710q.mo542a(TowerType.BASIC, Float.valueOf(1.0f));
        f6959F.mo542a(TowerType.SNIPER, Float.valueOf(1.0f));
        f6959F.mo542a(TowerType.CANNON, Float.valueOf(1.0f));
        f6959F.mo542a(TowerType.FROST, Float.valueOf(1.0f));
        f6959F.mo542a(TowerType.VENOM, Float.valueOf(1.0f));
        f6959F.mo542a(TowerType.SPLASH, Float.valueOf(1.0f));
        f6959F.mo542a(TowerType.BLAST, Float.valueOf(1.0f));
        f6959F.mo542a(TowerType.MULTISHOT, Float.valueOf(1.0f));
        f6959F.mo542a(TowerType.MINIGUN, Float.valueOf(1.0f));
        f6959F.mo542a(TowerType.AIR, Float.valueOf(1.0f));
        f6959F.mo542a(TowerType.TESLA, Float.valueOf(1.0f));
        f6959F.mo542a(TowerType.MISSILE, Float.valueOf(1.0f));
    }

    public BossEnemy() {
        super(EnemyType.BOSS);
    }

    /* renamed from: a */
    public final void mo1754a(float f) {
        super.mo1754a(f);
        Game.game.f6559C.mo371a(this.D, this.d.f2337x - 32.0f, this.d.f2338y - 32.0f, 32.0f, 32.0f, 64.0f, 64.0f, 1.0f, 1.0f, this.e);
    }

    /* renamed from: a */
    public final boolean mo1755a(TowerType towerType) {
        return ((Boolean) f6958E.m2467a((Object) towerType)).booleanValue();
    }

    /* renamed from: b */
    public final float mo1756b(TowerType towerType) {
        return ((Float) f6959F.m2467a((Object) towerType)).floatValue();
    }

    /* renamed from: f */
    public final String mo1757f() {
        return Game.f6551e.m2416a("enemy_name_BOSS");
    }

    /* renamed from: g */
    public final String mo1758g() {
        return Game.f6551e.m2416a("enemy_description_BOSS");
    }

    /* renamed from: h */
    public final C0430b mo1759h() {
        return PURPLE.f8595f;
    }

    /* renamed from: j */
    public final boolean mo1760j() {
        return false;
    }

    /* renamed from: k */
    public final int mo1762k() {
        return 25;
    }
}
