package com.prineside.tdi.tiles;

import com.badlogic.gdx.utils.C0712r;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.tiles.Tile.TileType;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class WalkableTile extends Tile {
    /* renamed from: p */
    public final C0712r<Enemy> f7984p = new C0712r();
    /* renamed from: q */
    public ArrayList<WalkableTile> f7985q;
    /* renamed from: r */
    public int f7986r = 0;

    public WalkableTile(TileType tileType, int i, int i2) {
        super(tileType, i, i2);
    }

    /* renamed from: a */
    public final void m8388a(Enemy enemy) {
        synchronized (this.f7984p) {
            this.f7984p.m2488b((Object) enemy);
        }
        enemy.f6915j = null;
        this.f7986r--;
    }

    /* renamed from: a */
    public final void m8389a(ArrayList<WalkableTile> arrayList) {
        this.f7985q = new ArrayList();
        this.f7985q.add(this);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f7985q.add((WalkableTile) it.next());
        }
    }
}
