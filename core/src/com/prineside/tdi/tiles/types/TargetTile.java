package com.prineside.tdi.tiles.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.utils.ai;
import com.prineside.tdi.Game;
import com.prineside.tdi.tiles.WalkableTile;

public class TargetTile extends WalkableTile {
    /* renamed from: s */
    public static final C0430b f7996s = new C0430b(1286557951);
    /* renamed from: t */
    public int f7997t = 100;

    public TargetTile(int i, int i2) {
        super(TileType.TARGET, i, i2);
    }

    /* renamed from: a */
    public final void mo1800a(ai aiVar) {
        try {
            ai a = aiVar.m2374a("tile");
            a.m2375a("x", String.valueOf(this.d));
            a.m2375a("y", String.valueOf(this.e));
            a.m2375a("type", "TARGET");
            a.m2372a();
        } catch (Throwable e) {
            Game.game.logger.m7509a(e);
        }
    }

    /* renamed from: e */
    public final int mo1801e() {
        return 250;
    }

    /* renamed from: f */
    public final int mo1802f() {
        return 1;
    }

    /* renamed from: h */
    public final String mo1803h() {
        return Game.f6551e.m2416a("tile_name_TARGET");
    }

    /* renamed from: i */
    public final String mo1804i() {
        return Game.f6551e.m2416a("tile_description_TARGET");
    }

    /* renamed from: j */
    public final C0430b mo1805j() {
        return f7996s;
    }
}
