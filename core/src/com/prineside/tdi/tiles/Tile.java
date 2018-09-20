package com.prineside.tdi.tiles;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.g2d.C0473l;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.ui.C0625d;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.ah.C0680a;
import com.badlogic.gdx.utils.ai;
import com.prineside.tdi.Game;
import com.prineside.tdi.tiles.types.RoadTile;
import com.prineside.tdi.tiles.types.SpaceTile;
import com.prineside.tdi.tiles.types.SpawnTile;
import com.prineside.tdi.tiles.types.TargetTile;
import com.prineside.tdi.tiles.types.VoidTile;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.utility.MaterialColor.AMBER;
import com.prineside.tdi.utility.MaterialColor.GREEN;
import com.prineside.tdi.utility.MaterialColor.LIGHT_BLUE;
import java.util.Iterator;

public abstract class Tile {
    /* renamed from: p */
    private static C0438n[] f7959p;
    /* renamed from: a */
    public TileType f7960a;
    /* renamed from: b */
    public String f7961b;
    /* renamed from: c */
    public Tower f7962c;
    /* renamed from: d */
    public int f7963d;
    /* renamed from: e */
    public int f7964e;
    /* renamed from: f */
    public int f7965f;
    /* renamed from: g */
    public int f7966g;
    /* renamed from: h */
    public int f7967h;
    /* renamed from: i */
    public int f7968i;
    /* renamed from: j */
    public int f7969j;
    /* renamed from: k */
    public int f7970k;
    /* renamed from: l */
    public boolean f7971l = true;
    /* renamed from: m */
    public float f7972m = 0.0f;
    /* renamed from: n */
    public C0676a<Tile> f7973n = new C0676a();
    /* renamed from: o */
    public C0676a<Tile> f7974o = new C0676a();

    public enum TileType {
        ROAD,
        SPAWN,
        TARGET,
        SPACE,
        VOID
    }

    public Tile(TileType tileType, int i, int i2) {
        this.f7960a = tileType;
        this.f7963d = i;
        this.f7964e = i2;
        m8375c();
        switch (this.f7960a) {
            case ROAD:
                this.f7961b = "road";
                return;
            case SPAWN:
                this.f7961b = "spawn";
                return;
            case TARGET:
                this.f7961b = "target";
                return;
            case SPACE:
                this.f7961b = "space";
                return;
            case VOID:
                this.f7961b = "void";
                return;
            default:
                Game.game.logger.m7510b("tileConstructor", "Error: invalid map tile '" + this.f7960a.name() + "'");
                return;
        }
    }

    /* renamed from: a */
    public static C0605e m8365a(Tile tile, int i) {
        C0605e c0605e = new C0605e();
        c0605e.f2628r = false;
        C0602b c0625d;
        if (tile.f7960a == TileType.ROAD) {
            c0625d = new C0625d(Game.game.f6561E.m1442a("tile-" + TileType.ROAD.ordinal()));
            c0625d.m1956c((float) i, (float) i);
            c0605e.mo510b(c0625d);
        } else if (tile.f7960a == TileType.SPAWN) {
            c0625d = new C0625d(Game.game.f6561E.m1442a("tile-" + TileType.SPAWN.ordinal()));
            c0625d.m1956c((float) i, (float) i);
            c0605e.mo510b(c0625d);
        } else if (tile.f7960a == TileType.TARGET) {
            c0625d = new C0625d(Game.game.f6561E.m1442a("tile-" + TileType.TARGET.ordinal()));
            c0625d.m1956c((float) i, (float) i);
            c0605e.mo510b(c0625d);
        } else if (tile.f7960a == TileType.SPACE) {
            SpaceTile spaceTile = (SpaceTile) tile;
            c0625d = new C0625d(Game.game.f6561E.m1442a("tile-" + TileType.SPACE.ordinal()));
            c0625d.m1956c((float) i, (float) i);
            c0605e.mo510b(c0625d);
            if (spaceTile.f7992t != 0) {
                c0625d = new C0625d(SpaceTile.f7990r);
                if (spaceTile.f7992t == 1) {
                    c0625d.m1937a(GREEN.f8487f);
                } else if (spaceTile.f7992t == 2) {
                    c0625d.m1937a(LIGHT_BLUE.f8525f);
                } else if (spaceTile.f7992t == 3) {
                    c0625d.m1937a(AMBER.f8397f);
                }
                c0625d.m1956c((float) i, (float) i);
                c0605e.mo510b(c0625d);
            }
            int i2 = i / 2;
            SpaceTileBonus[] spaceTileBonusArr = spaceTile.f7991s;
            int i3 = 0;
            while (i3 < 4) {
                if (!(spaceTileBonusArr[i3] == null || spaceTileBonusArr[i3].f7951e == 0)) {
                    float f;
                    int i4;
                    int i5;
                    if (i3 == 0) {
                        f = 0.0f;
                        i4 = i2;
                        i5 = 0;
                    } else if (i3 == 1) {
                        i4 = i2 * 2;
                        f = 270.0f;
                        i5 = i2;
                    } else if (i3 == 2) {
                        f = 180.0f;
                        i5 = i2 * 2;
                        i4 = i2;
                    } else {
                        f = 90.0f;
                        i4 = 0;
                        i5 = i2;
                    }
                    C0602b c0625d2 = new C0625d(SpaceTile.f7989q[spaceTileBonusArr[i3].f7951e - 1]);
                    c0625d2.m1935a((float) i5, (float) i4);
                    c0625d2.m1956c((float) (i / 2), (float) (i / 2));
                    c0625d2.m1962f(f);
                    c0625d2.m1937a(spaceTileBonusArr[i3].m8362b());
                    c0605e.mo510b(c0625d2);
                }
                i3++;
            }
        }
        return c0605e;
    }

    /* renamed from: a */
    public static Tile m8366a(int i, int i2, C0680a c0680a) {
        TileType valueOf = TileType.valueOf(c0680a.m2359a("type"));
        return valueOf == TileType.SPACE ? SpaceTile.m8396b(i, i2, c0680a) : valueOf == TileType.SPAWN ? SpawnTile.m8410b(i, i2, c0680a) : m8367a(valueOf, i, i2);
    }

    /* renamed from: a */
    public static Tile m8367a(TileType tileType, int i, int i2) {
        switch (tileType) {
            case ROAD:
                return new RoadTile(i, i2);
            case SPAWN:
                return new SpawnTile(i, i2);
            case TARGET:
                return new TargetTile(i, i2);
            case SPACE:
                return new SpaceTile(i, i2);
            case VOID:
                return new VoidTile(i, i2);
            default:
                Game.game.logger.m7510b("Tile", "Undefined tile type " + tileType.name());
                Game.game.logger.m7509a(new Exception());
                return new VoidTile(i, i2);
        }
    }

    /* renamed from: a */
    public static String m8368a(TileType tileType) {
        return Game.f6551e.m2416a("tile_category_title_" + tileType.name());
    }

    /* renamed from: a */
    public static void m8369a() {
        f7959p = new C0438n[TileType.values().length];
        for (int i = 0; i < TileType.values().length; i++) {
            f7959p[i] = Game.game.f6561E.m1442a("tile-" + i);
        }
    }

    /* renamed from: a */
    public void mo1806a(C0473l c0473l, int i) {
        c0473l.mo370a(f7959p[this.f7960a.ordinal()], (float) (this.f7963d * 64), (float) (this.f7964e * 64), 64.0f, 64.0f);
    }

    /* renamed from: a */
    public final void m8371a(C0676a<Tile> c0676a) {
        this.f7973n = c0676a;
        this.f7974o = new C0676a();
        this.f7974o.m2296a((Object) this);
        Iterator it = c0676a.iterator();
        while (it.hasNext()) {
            this.f7974o.m2296a((Tile) it.next());
        }
    }

    /* renamed from: a */
    public abstract void mo1800a(ai aiVar);

    /* renamed from: a */
    public boolean mo1807a(Tile tile) {
        return this.f7960a == tile.f7960a;
    }

    /* renamed from: b */
    public Tile mo1808b() {
        return m8367a(this.f7960a, this.f7963d, this.f7964e);
    }

    /* renamed from: c */
    public final void m8375c() {
        this.f7970k = this.f7964e * 64;
        this.f7967h = this.f7970k + 64;
        this.f7968i = this.f7963d * 64;
        this.f7969j = this.f7968i + 64;
        this.f7965f = this.f7968i + 32;
        this.f7966g = this.f7970k + 32;
    }

    /* renamed from: d */
    public float mo1809d() {
        return 1.0f;
    }

    /* renamed from: e */
    public int mo1801e() {
        return 0;
    }

    /* renamed from: f */
    public int mo1802f() {
        return 1;
    }

    /* renamed from: g */
    public boolean mo1810g() {
        return false;
    }

    /* renamed from: h */
    public abstract String mo1803h();

    /* renamed from: i */
    public abstract String mo1804i();

    /* renamed from: j */
    public abstract C0430b mo1805j();
}
