package com.prineside.tdi.projectiles.types;

import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.C0328t;
import com.badlogic.gdx.utils.C0328t.C0449a;
import com.prineside.tdi.Game;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgradeType;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.projectiles.SimpleProjectile;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.types.AirTower;
import com.prineside.tdi.utility.FastBadRandom;

public class AirProjectile extends SimpleProjectile implements C0449a {
    /* renamed from: h */
    public static final C0328t<AirProjectile> f6993h = new C10821();
    /* renamed from: i */
    public static C0438n f6994i;
    /* renamed from: j */
    private static final GlobalUpgradeType[] f6995j = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_AIR_S_BURN_DURATION_V, GlobalUpgradeType.TOWER_AIR_S_BURN_DURATION_IV, GlobalUpgradeType.TOWER_AIR_S_BURN_DURATION_III, GlobalUpgradeType.TOWER_AIR_S_BURN_DURATION_II, GlobalUpgradeType.TOWER_AIR_S_BURN_DURATION_I};
    /* renamed from: k */
    private AirTower f6996k;
    /* renamed from: l */
    private Enemy f6997l;
    /* renamed from: m */
    private float f6998m;
    /* renamed from: n */
    private float f6999n;

    /* renamed from: com.prineside.tdi.projectiles.types.AirProjectile$1 */
    static class C10821 extends C0328t<AirProjectile> {
        C10821() {
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo301a() {
            return new AirProjectile();
        }
    }

    /* renamed from: c */
    public static void m7727c() {
        f6994i = Game.game.f6561E.m1442a("projectile-air");
    }

    /* renamed from: d */
    public static AirProjectile m7728d() {
        Game.m7445k();
        return (AirProjectile) f6993h.m965b();
    }

    /* renamed from: a */
    public final void m7729a(AirTower airTower, Enemy enemy, float f, Vector2 vector2, Vector2 vector22, float f2, float f3) {
        super.m7718a(vector2, vector22, f2);
        this.f6996k = airTower;
        this.f6997l = enemy;
        this.f6998m = f;
        this.f6999n = f3;
    }

    /* renamed from: g */
    public final void mo1771g() {
        float f = 7.0f;
        super.mo1771g();
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null && gameScreen.f7179t.m7529b(this.f6997l) && !this.f6997l.m7599a(this.f6996k, this.f6998m) && FastBadRandom.m8809b() < this.f6999n) {
            for (GlobalUpgradeType globalUpgradeType : f6995j) {
                if (GlobalUpgrade.m7492a(globalUpgradeType)) {
                    f = 7.0f + GlobalUpgrade.m7495c(globalUpgradeType).f6630u[0];
                    break;
                }
            }
            Enemy enemy = this.f6997l;
            Tower tower = this.f6996k;
            if (enemy.f6896C < ((long) ((int) (f * 1000000.0f)))) {
                enemy.f6895B = tower;
                enemy.f6896C = (long) ((int) (f * 1000000.0f));
            }
            AirTower airTower = this.f6996k;
            if (airTower.m8465h() == this.f6997l) {
                airTower.m8450a(null);
            }
        }
    }

    /* renamed from: i */
    public final void mo1773i() {
        Vector2 l = m7725l();
        Game.game.f6559C.mo371a(f6994i, l.f2337x - 1.5f, l.f2338y - 22.5f, 1.5f, 24.0f, 3.0f, 24.0f, 1.0f, 1.0f, this.f);
    }

    /* renamed from: j */
    public final void mo1774j() {
        f6993h.mo363a((Object) this);
    }
}
