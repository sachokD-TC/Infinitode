package com.prineside.tdi.projectiles.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.math.C0547e;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.C0328t;
import com.badlogic.gdx.utils.C0328t.C0449a;
import com.prineside.tdi.AsyncUpdatable;
import com.prineside.tdi.AsyncUpdater;
import com.prineside.tdi.Game;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.projectiles.SimpleProjectile;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.tiles.WalkableTile;
import com.prineside.tdi.towers.Tower;
import java.util.Iterator;

public class MultishotProjectile extends SimpleProjectile implements C0449a, AsyncUpdatable {
    /* renamed from: h */
    public static final C0328t<MultishotProjectile> f7074h = new C10871();
    /* renamed from: i */
    public static C0438n f7075i;
    /* renamed from: j */
    private static C0430b f7076j = C0430b.f1620c.m1222c();
    /* renamed from: k */
    private AsyncUpdater f7077k;
    /* renamed from: l */
    private Tower f7078l;
    /* renamed from: m */
    private float f7079m;
    /* renamed from: n */
    private float f7080n;
    /* renamed from: o */
    private Vector2 f7081o;

    /* renamed from: com.prineside.tdi.projectiles.types.MultishotProjectile$1 */
    static class C10871 extends C0328t<MultishotProjectile> {
        C10871() {
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo301a() {
            return new MultishotProjectile();
        }
    }

    /* renamed from: m */
    public static void m7781m() {
        f7075i = Game.game.f6561E.m1442a("projectile-splash");
    }

    /* renamed from: n */
    public static MultishotProjectile m7782n() {
        Game.m7445k();
        return (MultishotProjectile) f7074h.m965b();
    }

    /* renamed from: a */
    public final void mo1751a(AsyncUpdater asyncUpdater) {
        this.f7077k = asyncUpdater;
    }

    /* renamed from: a */
    public final void m7784a(Tower tower, float f, Vector2 vector2, Vector2 vector22, float f2) {
        super.m7718a(vector2, vector22, f2);
        this.f7078l = tower;
        this.f7079m = f;
        this.f7080n = 256.0f;
        this.f7081o = vector2;
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            gameScreen.m7844a((AsyncUpdatable) this);
        }
    }

    /* renamed from: c */
    public final AsyncUpdater mo1752c() {
        return this.f7077k;
    }

    /* renamed from: d */
    public final void mo1753d() {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            Vector2 l = m7725l();
            Tile b = gameScreen.f7179t.m7527b((int) l.f2337x, (int) l.f2338y);
            if (b != null && (b instanceof WalkableTile)) {
                Iterator it = ((WalkableTile) b).f7985q.iterator();
                while (it.hasNext()) {
                    WalkableTile walkableTile = (WalkableTile) it.next();
                    if (walkableTile.f7986r != 0) {
                        synchronized (walkableTile.f7984p) {
                            Iterator c = walkableTile.f7984p.m2489c();
                            while (c.hasNext()) {
                                Enemy enemy = (Enemy) c.next();
                                if (enemy.mo1755a(this.f7078l.f8049k) && C0547e.m1758a(this.f7081o, l, enemy.f6909d, this.f7080n)) {
                                    gameScreen.m7851a(this.f7078l, enemy, this.f7079m);
                                    this.f6986b = 0;
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            this.f7081o = l;
        }
    }

    /* renamed from: g */
    public final void mo1771g() {
        super.mo1771g();
        if (Game.f6553g != null) {
            GameScreen.m7831b((AsyncUpdatable) this);
        }
        mo1753d();
    }

    /* renamed from: i */
    public final void mo1773i() {
        Vector2 l = m7725l();
        if (m7724k() < 200000) {
            f7076j.f1647L = ((float) m7724k()) / 200000.0f;
            Game.game.f6559C.m1410a(f7076j);
        }
        Game.game.f6559C.mo371a(f7075i, l.f2337x - 1.5f, l.f2338y - 14.0f, 1.5f, 14.0f, 3.0f, 16.0f, 1.0f, 1.0f, this.f);
        Game.game.f6559C.m1410a(C0430b.f1620c);
    }

    /* renamed from: j */
    public final void mo1774j() {
        f7074h.mo363a((Object) this);
    }
}
