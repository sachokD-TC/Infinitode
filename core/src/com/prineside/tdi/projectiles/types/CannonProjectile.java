package com.prineside.tdi.projectiles.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.math.C0522d;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.C0328t;
import com.badlogic.gdx.utils.C0328t.C0449a;
import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.Game;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.projectiles.SimpleProjectile;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.utility.PMath;
import java.util.Iterator;

public class CannonProjectile extends SimpleProjectile implements C0449a {
    /* renamed from: h */
    public static final C0328t<CannonProjectile> f7005h = new C10841();
    /* renamed from: i */
    public static C0438n f7006i;
    /* renamed from: j */
    public static C0438n f7007j;
    /* renamed from: k */
    private static C0430b f7008k = new C0430b(0.898f, 0.45f, 0.45f, 1.0f);
    /* renamed from: l */
    private Tower f7009l;
    /* renamed from: m */
    private float f7010m;
    /* renamed from: n */
    private float f7011n;
    /* renamed from: o */
    private long f7012o;
    /* renamed from: p */
    private C0676a<Enemy> f7013p = new C0676a();

    /* renamed from: com.prineside.tdi.projectiles.types.CannonProjectile$1 */
    static class C10841 extends C0328t<CannonProjectile> {
        C10841() {
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo301a() {
            return new CannonProjectile();
        }
    }

    /* renamed from: c */
    public static void m7741c() {
        f7006i = Game.game.f6561E.m1442a("projectile-cannon");
        f7007j = Game.game.f6561E.m1442a("range");
    }

    /* renamed from: d */
    public static CannonProjectile m7742d() {
        Game.m7445k();
        return (CannonProjectile) f7005h.m965b();
    }

    /* renamed from: a */
    public final void m7743a(Tower tower, float f, float f2, Vector2 vector2, Vector2 vector22, float f3) {
        super.m7718a(vector2, vector22, f3);
        this.f7009l = tower;
        this.f7010m = f;
        this.f7011n = 64.0f * f2;
    }

    /* renamed from: e */
    public final boolean mo1769e() {
        return this.f6985a && Game.game.m7477t() - this.f7012o > 500000;
    }

    /* renamed from: g */
    public final void mo1771g() {
        super.mo1771g();
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            this.f7012o = Game.game.m7477t();
            this.f7013p.mo530d();
            gameScreen.f7179t.m7522a(this.f7013p, this.d.f2337x, this.d.f2338y, this.f7011n);
            Iterator it = this.f7013p.iterator();
            while (it.hasNext()) {
                Enemy enemy = (Enemy) it.next();
                if (enemy.mo1755a(this.f7009l.f8049k)) {
                    float a = 1.0f - (PMath.m8820a(enemy.f6909d.f2337x, enemy.f6909d.f2338y, this.d.f2337x, this.d.f2338y) / this.f7011n);
                    if (a > 0.0f) {
                        enemy.m7599a(this.f7009l, (a * this.f7010m) * enemy.mo1756b(this.f7009l.f8049k));
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo1773i() {
        if (!this.f6985a) {
            Vector2 l = m7725l();
            Game.game.f6559C.mo371a(f7006i, l.f2337x - 3.0f, l.f2338y - 21.0f, 3.0f, 21.0f, 6.0f, 24.0f, 1.0f, 1.0f, this.f);
        } else if (!Game.game.f6582n) {
            float a = C0522d.f2372D.mo430a(((float) (Game.game.m7477t() - this.f7012o)) / 500000.0f);
            float f = (this.f7011n * a) * 2.0f;
            f7008k.f1647L = 0.75f - (a * 0.75f);
            Game.game.f6559C.m1410a(f7008k);
            Game.game.f6559C.mo370a(f7007j, this.d.f2337x - (f / 2.0f), this.d.f2338y - (f / 2.0f), f, f);
            Game.game.f6559C.m1410a(C0430b.f1620c);
        }
    }

    /* renamed from: j */
    public final void mo1774j() {
        f7005h.mo363a((Object) this);
    }
}
