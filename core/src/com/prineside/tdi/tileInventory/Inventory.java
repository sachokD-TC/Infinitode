package com.prineside.tdi.tileInventory;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.C0522d;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.C0710q.C0707b;
import com.badlogic.gdx.utils.C0712r;
import com.badlogic.gdx.utils.ah;
import com.badlogic.gdx.utils.ah.C0680a;
import com.badlogic.gdx.utils.ai;
import com.prineside.tdi.Game;
import com.prineside.tdi.Logger;
import com.prineside.tdi.tiles.SpaceTileBonus;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.tiles.Tile.TileType;
import com.prineside.tdi.tiles.types.RoadTile;
import com.prineside.tdi.tiles.types.SpaceTile;
import com.prineside.tdi.tiles.types.SpawnTile;
import com.prineside.tdi.tiles.types.TargetTile;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.Random;

public class Inventory implements StackListener {
    /* renamed from: b */
    private static Inventory f7939b;
    /* renamed from: c */
    private static final C0710q<TileType, TileTypeGenerationChance> f7940c;
    /* renamed from: d */
    private static final C0676a<Stack> f7941d;
    /* renamed from: a */
    public C0676a<Stack> f7942a = new C0676a();
    /* renamed from: e */
    private Random f7943e = new Random();

    interface TileTypeGenerationChance {
        /* renamed from: a */
        boolean mo1797a(Inventory inventory);
    }

    /* renamed from: com.prineside.tdi.tileInventory.Inventory$1 */
    static class C12361 implements TileTypeGenerationChance {
        C12361() {
        }

        /* renamed from: a */
        public final boolean mo1797a(Inventory inventory) {
            return inventory.m8355a(TileType.SPAWN) == 0 || Math.random() < 0.05d;
        }
    }

    /* renamed from: com.prineside.tdi.tileInventory.Inventory$2 */
    static class C12372 implements TileTypeGenerationChance {
        C12372() {
        }

        /* renamed from: a */
        public final boolean mo1797a(Inventory inventory) {
            return inventory.m8355a(TileType.TARGET) == 0;
        }
    }

    /* renamed from: com.prineside.tdi.tileInventory.Inventory$3 */
    static class C12383 implements TileTypeGenerationChance {
        C12383() {
        }

        /* renamed from: a */
        public final boolean mo1797a(Inventory inventory) {
            int a = inventory.m8355a(TileType.ROAD);
            if (a >= 500) {
                return false;
            }
            return Math.random() < ((double) (1.0f - C0522d.f2375G.mo430a(((float) a) / 500.0f)));
        }
    }

    /* renamed from: com.prineside.tdi.tileInventory.Inventory$4 */
    static class C12394 implements TileTypeGenerationChance {
        C12394() {
        }

        /* renamed from: a */
        public final boolean mo1797a(Inventory inventory) {
            return true;
        }
    }

    static {
        C0710q c0710q = new C0710q();
        f7940c = c0710q;
        c0710q.mo542a(TileType.SPAWN, new C12361());
        f7940c.mo542a(TileType.TARGET, new C12372());
        f7940c.mo542a(TileType.ROAD, new C12383());
        f7940c.mo542a(TileType.SPACE, new C12394());
        C0676a c0676a = new C0676a();
        f7941d = c0676a;
        c0676a.m2296a(new Stack(Tile.m8367a(TileType.ROAD, 0, 0), 4));
        f7941d.m2296a(new Stack(Tile.m8367a(TileType.SPACE, 0, 0), 4));
        f7941d.m2296a(new Stack(Tile.m8367a(TileType.SPAWN, 0, 0), 1));
        f7941d.m2296a(new Stack(Tile.m8367a(TileType.TARGET, 0, 0), 1));
    }

    /* renamed from: a */
    public static Inventory m8354a() {
        if (f7939b == null) {
            if (Game.game.f6564H.m8841b("TileInventory")) {
                String a = Game.game.f6564H.m8838a("TileInventory", null);
                if (a != null) {
                    f7939b = new Inventory();
                    try {
                        C0680a a2 = new ah().m2369a(a);
                        int a3 = a2.m2356a();
                        for (int i = 0; i < a3; i++) {
                            C0680a a4 = a2.m2358a(i);
                            int d = a4.m2363d("count");
                            f7939b.m8358a(Tile.m8366a(0, 0, a4.m2358a(0)), d);
                        }
                    } catch (Throwable e) {
                        Logger logger = Game.game.logger;
                        String str = "TileInventory";
                        String str2 = "Unable to load from settings";
                        Gdx.app.error(str, str2, e);
                        logger.m7507a("E", str, str2);
                        logger.m7509a(e);
                        Game.game.logger.m7510b("TileInventory", a);
                    }
                    Game.game.logger.log("TileInventory", "Loaded from settings");
                } else {
                    Game.game.logger.m7510b("TileInventory", "Failed to load from settings");
                }
            }
            if (f7939b == null) {
                f7939b = new Inventory();
                Iterator it = f7941d.iterator();
                while (it.hasNext()) {
                    Stack stack = (Stack) it.next();
                    f7939b.m8358a(stack.f7944a, stack.f7945b);
                }
                Game.game.logger.log("TileInventory", "Created new instance");
            }
        }
        return f7939b;
    }

    /* renamed from: a */
    public final int m8355a(TileType tileType) {
        Iterator it = this.f7942a.iterator();
        int i = 0;
        while (it.hasNext()) {
            Stack stack = (Stack) it.next();
            i = stack.f7944a.f7960a == tileType ? stack.f7945b + i : i;
        }
        return i;
    }

    /* renamed from: a */
    public final Tile m8356a(float f, TileType tileType) {
        C0676a c0676a;
        TileType tileType2;
        int i = 0;
        if (tileType == null) {
            c0676a = new C0676a();
            Iterator b = f7940c.mo544b();
            while (b.hasNext()) {
                C0707b c0707b = (C0707b) b.next();
                if (((TileTypeGenerationChance) c0707b.f3164b).mo1797a(this)) {
                    c0676a.m2296a(c0707b.f3163a);
                }
            }
            tileType2 = (TileType) c0676a.m2291a((int) (Math.random() * ((double) c0676a.f3001b)));
        } else {
            tileType2 = tileType;
        }
        if (tileType2 == TileType.ROAD) {
            return new RoadTile(0, 0);
        }
        if (tileType2 == TileType.TARGET) {
            return new TargetTile(0, 0);
        }
        if (tileType2 == TileType.SPAWN) {
            float f2 = Math.random() < 0.20000000298023224d ? -0.5f * f : 4.0f * f;
            f2 = (f2 + ((((float) this.f7943e.nextGaussian()) * 0.05f) * f2)) + 1.0f;
            if (f2 < 0.5f) {
                f2 = 0.5f;
            } else if (f2 > 5.0f) {
                f2 = 5.0f;
            }
            Tile spawnTile = new SpawnTile(0, 0);
            spawnTile.f7995t = ((float) Math.round(f2 * 100.0f)) / 100.0f;
            return spawnTile;
        } else if (tileType2 != TileType.SPACE) {
            return null;
        } else {
            int i2;
            int i3;
            Tile spaceTile = new SpaceTile(0, 0);
            int i4 = 0;
            for (i2 = 0; i2 < 3; i2++) {
                if (Math.random() < ((double) f)) {
                    i4++;
                }
            }
            spaceTile.f7992t = i4;
            c0676a = new C0676a();
            C0712r c0712r = new C0712r();
            for (i2 = 0; i2 < 4; i2++) {
                i4 = 0;
                for (i3 = 0; i3 < 3; i3++) {
                    if (Math.random() < ((double) f)) {
                        i4++;
                    }
                }
                if (i4 != 0) {
                    Object obj;
                    do {
                        obj = TowerStatType.f8068C[(int) (((float) TowerStatType.f8068C.length) * ((float) Math.random()))];
                    } while (c0712r.m2490c(obj));
                    Object spaceTileBonus = new SpaceTileBonus(obj, i4);
                    c0712r.m2486a(obj);
                    c0676a.m2296a(spaceTileBonus);
                }
            }
            if (c0676a.f3001b != 0) {
                for (i2 = 0; i2 < c0676a.f3001b; i2++) {
                    for (i3 = i2 + 1; i3 < c0676a.f3001b; i3++) {
                        if (((SpaceTileBonus) c0676a.m2291a(i2)).f7950d.ordinal() > ((SpaceTileBonus) c0676a.m2291a(i3)).f7950d.ordinal()) {
                            c0676a.mo524a(i2, i3);
                        }
                    }
                }
                while (i < c0676a.f3001b) {
                    spaceTile.m8398a(i, (SpaceTileBonus) c0676a.m2291a(i));
                    i++;
                }
            }
            return spaceTile;
        }
    }

    /* renamed from: a */
    public final void mo1798a(Stack stack) {
        if (stack.f7945b <= 0) {
            if (stack.f7946c.m2490c((Object) this)) {
                stack.f7946c.m2488b((Object) this);
            }
            this.f7942a.mo529b((Object) stack, true);
        }
    }

    /* renamed from: a */
    public final void m8358a(Tile tile, int i) {
        Iterator it = this.f7942a.iterator();
        while (it.hasNext()) {
            Stack stack = (Stack) it.next();
            if (stack.f7944a.mo1807a(tile)) {
                stack.f7945b += i;
                Iterator c = stack.f7946c.m2489c();
                while (c.hasNext()) {
                    ((StackListener) c.next()).mo1798a(stack);
                }
                return;
            }
        }
        Object stack2 = new Stack(tile, i);
        stack2.f7946c.m2486a((Object) this);
        this.f7942a.m2296a(stack2);
    }

    /* renamed from: a */
    public final boolean m8359a(Tile tile) {
        Object obj;
        Iterator it;
        Iterator it2 = this.f7942a.iterator();
        while (it2.hasNext()) {
            Stack stack;
            Stack stack2 = (Stack) it2.next();
            if (stack2.f7944a.mo1807a(tile)) {
                obj = stack2.f7945b > 0 ? 1 : null;
                if (obj == null) {
                    return false;
                }
                it = this.f7942a.iterator();
                while (it.hasNext()) {
                    stack = (Stack) it.next();
                    if (!stack.f7944a.mo1807a(tile) && stack.f7945b > 0) {
                        if (stack.f7945b <= 0) {
                            throw new IllegalArgumentException("Can't remove more items than in stack");
                        }
                        stack.f7945b--;
                        Iterator c = stack.f7946c.m2489c();
                        while (c.hasNext()) {
                            ((StackListener) c.next()).mo1798a(stack);
                        }
                        return true;
                    }
                }
                return false;
            }
        }
        obj = null;
        if (obj == null) {
            return false;
        }
        it = this.f7942a.iterator();
        while (it.hasNext()) {
            stack = (Stack) it.next();
            if (!stack.f7944a.mo1807a(tile)) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m8360b() {
        Writer stringWriter = new StringWriter();
        try {
            ai a = new ai(stringWriter).m2374a("inventory");
            Iterator it = this.f7942a.iterator();
            while (it.hasNext()) {
                Stack stack = (Stack) it.next();
                ai a2 = a.m2374a("stack");
                a2.m2375a("count", String.valueOf(stack.f7945b));
                stack.f7944a.mo1800a(a2);
                a2.m2372a();
            }
            a.m2372a();
            Game.game.f6564H.m8839b("TileInventory", stringWriter.toString());
            Game.game.f6564H.m8844d();
            Game.game.logger.log("Tile Inventory", "Saved");
        } catch (Exception e) {
            Game.game.logger.m7510b("UserMap", "Unable to save user map: " + e.getMessage());
        }
    }
}
