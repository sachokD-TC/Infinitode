package com.prineside.tdi.tiles.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.utils.ai;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.tiles.Tile.TileType;

public class VoidTile extends Tile {
    public VoidTile(int i, int i2) {
        super(TileType.VOID, i, i2);
    }

    /* renamed from: a */
    public final void mo1800a(ai aiVar) {
    }

    /* renamed from: h */
    public final String mo1803h() {
        return "Void";
    }

    /* renamed from: i */
    public final String mo1804i() {
        return "Dummy void";
    }

    /* renamed from: j */
    public final C0430b mo1805j() {
        return C0430b.f1619b;
    }
}
