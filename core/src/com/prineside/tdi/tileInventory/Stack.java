package com.prineside.tdi.tileInventory;

import com.badlogic.gdx.utils.C0712r;
import com.prineside.tdi.tiles.Tile;

public class Stack {
    /* renamed from: a */
    public Tile f7944a;
    /* renamed from: b */
    public int f7945b;
    /* renamed from: c */
    C0712r<StackListener> f7946c = new C0712r();

    public Stack(Tile tile, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Item count in stack can't be less than zero, " + i + " given");
        }
        this.f7944a = tile;
        this.f7945b = i;
    }
}
