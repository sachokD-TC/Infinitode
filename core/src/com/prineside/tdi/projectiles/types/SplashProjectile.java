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
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgradeType;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.projectiles.SimpleProjectile;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.tiles.WalkableTile;
import com.prineside.tdi.towers.Tower;
import java.util.HashMap;
import java.util.Iterator;

public class SplashProjectile extends SimpleProjectile implements C0449a, AsyncUpdatable {
    /* renamed from: h */
    public static final C0328t<SplashProjectile> f7082h = new C10881();
    /* renamed from: i */
    public static C0438n f7083i;
    /* renamed from: j */
    private static final GlobalUpgradeType[] f7084j = new GlobalUpgradeType[]{GlobalUpgradeType.TOWER_SPLASH_S_COMBO_HIT_DAMAGE_V, GlobalUpgradeType.TOWER_SPLASH_S_COMBO_HIT_DAMAGE_IV, GlobalUpgradeType.TOWER_SPLASH_S_COMBO_HIT_DAMAGE_III, GlobalUpgradeType.TOWER_SPLASH_S_COMBO_HIT_DAMAGE_II, GlobalUpgradeType.TOWER_SPLASH_S_COMBO_HIT_DAMAGE_I};
    /* renamed from: k */
    private static C0430b f7085k = C0430b.f1620c.m1222c();
    /* renamed from: l */
    private AsyncUpdater f7086l;
    /* renamed from: m */
    private Tower f7087m;
    /* renamed from: n */
    private float f7088n;
    /* renamed from: o */
    private float f7089o;
    /* renamed from: p */
    private HashMap<Enemy, Boolean> f7090p = new HashMap();
    /* renamed from: q */
    private float f7091q = 1.0f;
    /* renamed from: r */
    private Vector2 f7092r = new Vector2();

    /* renamed from: com.prineside.tdi.projectiles.types.SplashProjectile$1 */
    static class C10881 extends C0328t<SplashProjectile> {
        C10881() {
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo301a() {
            return new SplashProjectile();
        }
    }

    /* renamed from: m */
    public static void m7791m() {
        f7083i = Game.game.f6561E.m1442a("projectile-splash");
    }

    /* renamed from: n */
    public static SplashProjectile m7792n() {
        Game.m7445k();
        return (SplashProjectile) f7082h.m965b();
    }

    /* renamed from: o */
    private void m7793o() {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            Vector2 l = m7725l();
            Tile b = gameScreen.f7179t.m7527b((int) l.f2337x, (int) l.f2338y);
            if (b != null) {
                for (int i = 0; i < b.f7974o.f3001b; i++) {
                    Tile tile = (Tile) b.f7974o.m2291a(i);
                    if (tile instanceof WalkableTile) {
                        WalkableTile walkableTile = (WalkableTile) tile;
                        if (walkableTile.f7986r != 0) {
                            synchronized (walkableTile.f7984p) {
                                Iterator c = walkableTile.f7984p.m2489c();
                                while (c.hasNext()) {
                                    Enemy enemy = (Enemy) c.next();
                                    if (enemy.mo1755a(this.f7087m.f8049k) && C0547e.m1758a(this.f7092r, l, enemy.f6909d, this.f7089o) && !this.f7090p.containsKey(enemy)) {
                                        this.f7090p.put(enemy, Boolean.valueOf(true));
                                        GameScreen gameScreen2 = Game.f6553g;
                                        if (gameScreen2 != null) {
                                            gameScreen2.m7851a(this.f7087m, enemy, this.f7088n * this.f7091q);
                                        }
                                        float f = 0.5f;
                                        for (GlobalUpgradeType globalUpgradeType : f7084j) {
                                            if (GlobalUpgrade.m7492a(globalUpgradeType)) {
                                                f = (100.0f - GlobalUpgrade.m7495c(globalUpgradeType).f6630u[0]) / 100.0f;
                                                break;
                                            }
                                        }
                                        this.f7091q = f * this.f7091q;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            this.f7092r = l;
        }
    }

    /* renamed from: a */
    public final void mo360a() {
        super.mo360a();
        this.f7090p.clear();
        this.f7091q = 1.0f;
    }

    /* renamed from: a */
    public final void mo1751a(AsyncUpdater asyncUpdater) {
        this.f7086l = asyncUpdater;
    }

    /* renamed from: a */
    public final void m7796a(Tower tower, float f, float f2, Vector2 vector2, Vector2 vector22, float f3) {
        super.m7718a(vector2, vector22, f3);
        this.f7090p.clear();
        this.f7087m = tower;
        this.f7088n = f;
        this.f7089o = f2 * f2;
        this.f7092r.f2337x = vector2.f2337x;
        this.f7092r.f2338y = vector2.f2338y;
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            gameScreen.m7844a((AsyncUpdatable) this);
        }
    }

    /* renamed from: c */
    public final AsyncUpdater mo1752c() {
        return this.f7086l;
    }

    /* renamed from: d */
    public final void mo1753d() {
        m7793o();
    }

    /* renamed from: g */
    public final void mo1771g() {
        super.mo1771g();
        if (Game.f6553g != null) {
            GameScreen.m7831b((AsyncUpdatable) this);
        }
        m7793o();
    }

    /* renamed from: i */
    public final void mo1773i() {
        Vector2 l = m7725l();
        if (m7724k() < 200000) {
            f7085k.f1647L = ((float) m7724k()) / 200000.0f;
            Game.game.f6559C.m1410a(f7085k);
        }
        Game.game.f6559C.mo371a(f7083i, l.f2337x - 1.5f, l.f2338y - 14.0f, 1.5f, 14.0f, 3.0f, 16.0f, 1.0f, 1.0f, this.f);
        Game.game.f6559C.m1410a(C0430b.f1620c);
    }

    /* renamed from: j */
    public final void mo1774j() {
        f7082h.mo363a((Object) this);
    }
}
