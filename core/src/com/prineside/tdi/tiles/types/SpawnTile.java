package com.prineside.tdi.tiles.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.utils.ah.C0680a;
import com.badlogic.gdx.utils.ai;
import com.prineside.tdi.Game;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.tiles.WalkableTile;

public class SpawnTile extends WalkableTile {
    /* renamed from: s */
    public static final C0430b f7994s = new C0430b(1715058687);
    /* renamed from: t */
    public float f7995t = 1.0f;

    public SpawnTile(int i, int i2) {
        super(TileType.SPAWN, i, i2);
    }

    /* renamed from: b */
    public static SpawnTile m8410b(int i, int i2, C0680a c0680a) {
        SpawnTile spawnTile = new SpawnTile(i, i2);
        int a = c0680a.m2356a();
        for (int i3 = 0; i3 < a; i3++) {
            C0680a a2 = c0680a.m2358a(i3);
            if (a2.f3028a.equals("difficulty")) {
                try {
                    spawnTile.f7995t = Float.valueOf(a2.f3031d).floatValue();
                } catch (Exception e) {
                    Game.game.logger.m7510b("SpaceTile", "fromXML - invalid \"difficulty\" (" + a2.f3031d + ")");
                }
            }
        }
        return spawnTile;
    }

    /* renamed from: a */
    public final void mo1800a(ai aiVar) {
        try {
            ai a = aiVar.m2374a("tile");
            a.m2375a("x", String.valueOf(this.d));
            a.m2375a("y", String.valueOf(this.e));
            a.m2375a("type", "SPAWN");
            a.m2374a("difficulty").m2373a(String.valueOf(this.f7995t)).m2372a();
            a.m2372a();
        } catch (Throwable e) {
            Game.game.logger.m7509a(e);
        }
    }

    /* renamed from: a */
    public final boolean mo1807a(Tile tile) {
        return this.a == tile.f7960a && ((SpawnTile) tile).f7995t == this.f7995t;
    }

    /* renamed from: b */
    public final Tile mo1808b() {
        SpawnTile spawnTile = (SpawnTile) Tile.m8367a(this.a, this.d, this.e);
        spawnTile.f7995t = this.f7995t;
        return spawnTile;
    }

    /* renamed from: d */
    public final float mo1809d() {
        return this.f7995t;
    }

    /* renamed from: e */
    public final int mo1801e() {
        return 250;
    }

    /* renamed from: f */
    public final int mo1802f() {
        return (((double) this.f7995t) < 0.66d || ((double) this.f7995t) > 4.0d) ? 12 : 8;
    }

    /* renamed from: h */
    public final String mo1803h() {
        return Game.f6551e.m2416a("tile_name_SPAWN");
    }

    /* renamed from: i */
    public final String mo1804i() {
        return Game.f6551e.m2416a("tile_description_SPAWN");
    }

    /* renamed from: j */
    public final C0430b mo1805j() {
        return f7994s;
    }
}
