package com.prineside.tdi.projectiles.types;

import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.C0328t;
import com.badlogic.gdx.utils.C0328t.C0449a;
import com.prineside.tdi.Game;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.enemies.effects.PoisonEffect;
import com.prineside.tdi.projectiles.SimpleProjectile;
import com.prineside.tdi.screens.GameScreen;

public class VenomProjectile extends SimpleProjectile implements C0449a {
    /* renamed from: h */
    public static final C0328t<VenomProjectile> f7093h = new C10891();
    /* renamed from: i */
    public static C0438n f7094i;
    /* renamed from: j */
    private Enemy f7095j;
    /* renamed from: k */
    private PoisonEffect f7096k;

    /* renamed from: com.prineside.tdi.projectiles.types.VenomProjectile$1 */
    static class C10891 extends C0328t<VenomProjectile> {
        C10891() {
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo301a() {
            return new VenomProjectile();
        }
    }

    /* renamed from: c */
    public static void m7803c() {
        f7094i = Game.game.f6561E.m1442a("projectile-venom");
    }

    /* renamed from: d */
    public static VenomProjectile m7804d() {
        Game.m7445k();
        return (VenomProjectile) f7093h.m965b();
    }

    /* renamed from: a */
    public final void m7805a(Enemy enemy, PoisonEffect poisonEffect, Vector2 vector2, Vector2 vector22, float f) {
        super.m7718a(vector2, vector22, f);
        this.f7095j = enemy;
        this.f7096k = poisonEffect;
    }

    /* renamed from: g */
    public final void mo1771g() {
        super.mo1771g();
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null && gameScreen.f7179t.m7529b(this.f7095j)) {
            gameScreen.m7851a(this.f7096k.f6941a, this.f7095j, this.f7096k.f6942b);
            Enemy enemy = this.f7095j;
            Object obj = this.f7096k;
            boolean z = false;
            synchronized (enemy.f6923r) {
                if (!enemy.f6923r.m2474c(obj)) {
                    z = true;
                }
                enemy.f6923r.mo542a(obj, Long.valueOf((Game.game.m7477t() + ((long) (obj.f6943c * 1000000.0f))) + enemy.f6927v));
            }
            if (z) {
                enemy.f6924s = true;
            }
            if (this.f7096k.f6941a.m8465h() == this.f7095j) {
                this.f7096k.f6941a.m8450a(null);
            }
        }
    }

    /* renamed from: i */
    public final void mo1773i() {
        Vector2 l = m7725l();
        Game.game.f6559C.mo371a(f7094i, l.f2337x - 3.0f, l.f2338y - 30.0f, 3.0f, 30.0f, 6.0f, 32.0f, 1.0f, 1.0f, this.f);
    }

    /* renamed from: j */
    public final void mo1774j() {
        f7093h.mo363a((Object) this);
    }
}
