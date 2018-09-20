package com.prineside.tdi.enemies.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.C0710q;
import com.prineside.tdi.Game;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.towers.Tower.TowerType;
import com.prineside.tdi.utility.MaterialColor.LIGHT_BLUE;
import com.prineside.tdi.utility.PMath;

public class JetEnemy extends Enemy {
    /* renamed from: E */
    public static final C0710q<TowerType, Boolean> f6966E;
    /* renamed from: F */
    public static final C0710q<TowerType, Float> f6967F;
    /* renamed from: G */
    private static C0438n f6968G;
    /* renamed from: H */
    private long f6969H = Game.game.m7477t();
    /* renamed from: I */
    private Vector2 f6970I = new Vector2();

    static {
        C0710q c0710q = new C0710q();
        f6966E = c0710q;
        c0710q.mo542a(TowerType.BASIC, Boolean.valueOf(false));
        f6966E.mo542a(TowerType.SNIPER, Boolean.valueOf(false));
        f6966E.mo542a(TowerType.CANNON, Boolean.valueOf(false));
        f6966E.mo542a(TowerType.FROST, Boolean.valueOf(true));
        f6966E.mo542a(TowerType.VENOM, Boolean.valueOf(false));
        f6966E.mo542a(TowerType.SPLASH, Boolean.valueOf(false));
        f6966E.mo542a(TowerType.BLAST, Boolean.valueOf(false));
        f6966E.mo542a(TowerType.MULTISHOT, Boolean.valueOf(false));
        f6966E.mo542a(TowerType.MINIGUN, Boolean.valueOf(true));
        f6966E.mo542a(TowerType.AIR, Boolean.valueOf(true));
        f6966E.mo542a(TowerType.TESLA, Boolean.valueOf(true));
        f6966E.mo542a(TowerType.MISSILE, Boolean.valueOf(false));
        c0710q = new C0710q();
        f6967F = c0710q;
        c0710q.mo542a(TowerType.BASIC, Float.valueOf(1.0f));
        f6967F.mo542a(TowerType.SNIPER, Float.valueOf(1.0f));
        f6967F.mo542a(TowerType.CANNON, Float.valueOf(1.0f));
        f6967F.mo542a(TowerType.FROST, Float.valueOf(1.0f));
        f6967F.mo542a(TowerType.VENOM, Float.valueOf(1.0f));
        f6967F.mo542a(TowerType.SPLASH, Float.valueOf(1.0f));
        f6967F.mo542a(TowerType.BLAST, Float.valueOf(1.0f));
        f6967F.mo542a(TowerType.MULTISHOT, Float.valueOf(1.0f));
        f6967F.mo542a(TowerType.MINIGUN, Float.valueOf(0.25f));
        f6967F.mo542a(TowerType.AIR, Float.valueOf(0.5f));
        f6967F.mo542a(TowerType.TESLA, Float.valueOf(1.25f));
        f6967F.mo542a(TowerType.MISSILE, Float.valueOf(1.0f));
    }

    public JetEnemy() {
        super(EnemyType.JET);
        if (f6968G == null) {
            f6968G = Game.game.f6561E.m1442a("jet-thrust");
        }
    }

    /* renamed from: a */
    public final void mo1754a(float f) {
        super.mo1754a(f);
        Game.game.f6559C.mo371a(this.D, this.d.f2337x - 32.0f, this.d.f2338y - 32.0f, 32.0f, 32.0f, 64.0f, 64.0f, 1.0f, 1.0f, this.e);
        float sin = 0.8f + (((float) Math.sin((double) (((float) (Game.game.m7477t() - this.f6969H)) / 150000.0f))) * 0.2f);
        float sin2 = 0.9f + (((float) Math.sin((double) (((float) ((Game.game.m7477t() - this.f6969H) + 250000)) / 150000.0f))) * 0.1f);
        this.f6970I.f2337x = this.d.f2337x;
        this.f6970I.f2338y = this.d.f2338y;
        PMath.m8823a(this.f6970I, this.e - 180.0f, 8.0f);
        PMath.m8823a(this.f6970I, this.e + 90.0f, 8.0f * sin2);
        Game.game.f6559C.mo371a(f6968G, this.f6970I.f2337x, this.f6970I.f2338y, 0.0f, 0.0f, 32.0f * sin, sin2 * 16.0f, 1.0f, 1.0f, this.e - 90.0f);
    }

    /* renamed from: a */
    public final boolean mo1755a(TowerType towerType) {
        return ((Boolean) f6966E.m2467a((Object) towerType)).booleanValue();
    }

    /* renamed from: b */
    public final float mo1756b(TowerType towerType) {
        return ((Float) f6967F.m2467a((Object) towerType)).floatValue();
    }

    /* renamed from: f */
    public final String mo1757f() {
        return Game.f6551e.m2416a("enemy_name_JET");
    }

    /* renamed from: g */
    public final String mo1758g() {
        return Game.f6551e.m2416a("enemy_description_JET");
    }

    /* renamed from: h */
    public final C0430b mo1759h() {
        return LIGHT_BLUE.f8525f;
    }

    /* renamed from: j */
    public final boolean mo1760j() {
        return true;
    }
}
