package com.prineside.tdi.screens.components;

import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.BasicLevel;
import com.prineside.tdi.Game.GameMode;
import com.prineside.tdi.UserMap;
import com.prineside.tdi.tiles.Tile;

public class GameOverProperties {
    /* renamed from: a */
    public int f7714a;
    /* renamed from: b */
    public int f7715b;
    /* renamed from: c */
    public int f7716c;
    /* renamed from: d */
    public int f7717d;
    /* renamed from: e */
    public boolean f7718e;
    /* renamed from: f */
    public float f7719f;
    /* renamed from: g */
    public C0676a<Tile> f7720g;
    /* renamed from: h */
    public GameMode f7721h;
    /* renamed from: i */
    public BasicLevel f7722i = null;
    /* renamed from: j */
    public UserMap f7723j = null;
    /* renamed from: k */
    public boolean f7724k = false;
    /* renamed from: l */
    public boolean f7725l = false;

    public GameOverProperties(GameMode gameMode, int i, int i2, int i3, int i4, float f, boolean z) {
        this.f7721h = gameMode;
        this.f7714a = i;
        this.f7715b = i2;
        this.f7716c = i3;
        this.f7717d = i4;
        this.f7719f = f;
        this.f7718e = z;
    }
}
