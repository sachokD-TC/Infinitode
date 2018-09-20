package com.prineside.tdi.projectiles.types;

import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.C0328t;
import com.badlogic.gdx.utils.C0328t.C0449a;
import com.prineside.tdi.Game;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.projectiles.SimpleProjectile;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.towers.Tower;

public class BasicProjectile extends SimpleProjectile implements C0449a {
    /* renamed from: h */
    public static C0438n f7000h;
    /* renamed from: i */
    public static final C0328t<BasicProjectile> f7001i = new C10831();
    /* renamed from: j */
    private Tower f7002j;
    /* renamed from: k */
    private Enemy f7003k;
    /* renamed from: l */
    private float f7004l;

    /* renamed from: com.prineside.tdi.projectiles.types.BasicProjectile$1 */
    static class C10831 extends C0328t<BasicProjectile> {
        C10831() {
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo301a() {
            return new BasicProjectile();
        }
    }

    /* renamed from: c */
    public static void m7734c() {
        f7000h = Game.game.f6561E.m1442a("projectile-basic");
    }

    /* renamed from: d */
    public static BasicProjectile m7735d() {
        Game.m7445k();
        return (BasicProjectile) f7001i.m965b();
    }

    /* renamed from: a */
    public final void m7736a(Tower tower, Enemy enemy, float f, Vector2 vector2, Vector2 vector22, float f2) {
        super.m7718a(vector2, vector22, f2);
        this.f7002j = tower;
        this.f7003k = enemy;
        this.f7004l = f;
    }

    /* renamed from: g */
    public final void mo1771g() {
        super.mo1771g();
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null && gameScreen.f7179t.m7529b(this.f7003k)) {
            this.f7003k.m7599a(this.f7002j, this.f7004l);
        }
    }

    /* renamed from: i */
    public final void mo1773i() {
        Vector2 l = m7725l();
        Game.game.f6559C.mo371a(f7000h, l.f2337x - 2.0f, l.f2338y - 30.0f, 2.0f, 30.0f, 4.0f, 32.0f, 1.0f, 1.0f, this.f);
    }

    /* renamed from: j */
    public final void mo1774j() {
        f7001i.mo363a((Object) this);
    }
}
