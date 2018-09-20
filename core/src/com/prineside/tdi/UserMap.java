package com.prineside.tdi;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.ai;
import com.prineside.tdi.Achievement.Type;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.tiles.Tile.TileType;
import com.prineside.tdi.tiles.types.VoidTile;
import com.prineside.tdi.utility.SafePreferences;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;

public class UserMap {
    /* renamed from: a */
    public static final C0430b f6865a = new C0430b(656877567);
    /* renamed from: d */
    private static C0710q<Integer, UserMap> f6866d = new C0710q();
    /* renamed from: b */
    public int f6867b;
    /* renamed from: c */
    public Tile[][] f6868c;

    private UserMap(int i, String str) {
        this.f6867b = i;
        if (str != null) {
            this.f6868c = Map.m7512a(str, false);
            if (this.f6868c.length != 32 || this.f6868c[0].length != 32) {
                throw new RuntimeException("Invalid map size loaded from XML");
            }
            return;
        }
        this.f6868c = (Tile[][]) Array.newInstance(Tile.class, new int[]{32, 32});
        for (int i2 = 0; i2 < 32; i2++) {
            for (int i3 = 0; i3 < 32; i3++) {
                this.f6868c[i2][i3] = new VoidTile(i3, i2);
            }
        }
    }

    /* renamed from: a */
    public static int m7584a() {
        return GlobalUpgrade.m7492a(GlobalUpgradeType.MAP_EDITOR_MAP_SIZE_VI) ? 32 : GlobalUpgrade.m7492a(GlobalUpgradeType.MAP_EDITOR_MAP_SIZE_V) ? 28 : GlobalUpgrade.m7492a(GlobalUpgradeType.MAP_EDITOR_MAP_SIZE_IV) ? 24 : GlobalUpgrade.m7492a(GlobalUpgradeType.MAP_EDITOR_MAP_SIZE_III) ? 20 : GlobalUpgrade.m7492a(GlobalUpgradeType.MAP_EDITOR_MAP_SIZE_II) ? 16 : GlobalUpgrade.m7492a(GlobalUpgradeType.MAP_EDITOR_MAP_SIZE_I) ? 12 : 8;
    }

    /* renamed from: a */
    public static boolean m7585a(int i) {
        return SafePreferences.m8835a("UserMaps").m8841b("map_" + i);
    }

    /* renamed from: b */
    public static UserMap m7586b(int i) {
        if (!f6866d.m2474c(Integer.valueOf(i))) {
            try {
                f6866d.mo542a(Integer.valueOf(i), new UserMap(i, SafePreferences.m8835a("UserMaps").m8838a("map_" + i, null)));
            } catch (Throwable e) {
                Game.game.logger.m7510b("UserMap", "Failed to load map " + i + " from preferences: " + e.getMessage());
                Game.game.logger.m7509a(e);
                f6866d.mo542a(Integer.valueOf(i), new UserMap(i, null));
            }
        }
        return (UserMap) f6866d.m2467a(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final Tile[][] m7587b() {
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        while (i < this.f6868c.length) {
            int i6 = 0;
            while (i6 < this.f6868c[0].length) {
                int i7;
                if (this.f6868c[i][i6].f7960a != TileType.VOID) {
                    i7 = (i5 == -1 || i5 > i6) ? i6 : i5;
                    i5 = (i4 == -1 || i4 < i6) ? i6 : i4;
                    i4 = (i3 == -1 || i3 > i) ? i : i3;
                    i3 = (i2 == -1 || i2 < i) ? i : i2;
                } else {
                    i7 = i5;
                    i5 = i4;
                    i4 = i3;
                    i3 = i2;
                }
                i6++;
                i2 = i3;
                i3 = i4;
                i4 = i5;
                i5 = i7;
            }
            i++;
        }
        if (i5 == -1) {
            Tile[][] tileArr = new Tile[1][];
            tileArr[0] = new Tile[]{new VoidTile(0, 0)};
            return tileArr;
        }
        i4 = (i4 - i5) + 1;
        i6 = (i2 - i3) + 1;
        tileArr = (Tile[][]) Array.newInstance(Tile.class, new int[]{i6, i4});
        i2 = 0;
        while (i2 < this.f6868c.length) {
            int i8 = 0;
            while (i8 < this.f6868c[0].length) {
                if (this.f6868c[i2][i8].f7960a != TileType.VOID) {
                    tileArr[i2 - i3][i8 - i5] = this.f6868c[i2][i8].mo1808b();
                    tileArr[i2 - i3][i8 - i5].f7963d = i8 - i5;
                    tileArr[i2 - i3][i8 - i5].f7964e = i2 - i3;
                    tileArr[i2 - i3][i8 - i5].m8375c();
                } else if (i2 - i3 >= 0 && i2 - i3 < i6 && i8 - i5 >= 0 && i8 - i5 < i4) {
                    tileArr[i2 - i3][i8 - i5] = new VoidTile(i8 - i5, i2 - i3);
                }
                i8++;
            }
            i2++;
        }
        return tileArr;
    }

    /* renamed from: c */
    public final Map m7588c() {
        return new Map(m7587b());
    }

    /* renamed from: d */
    public final void m7589d() {
        Writer stringWriter = new StringWriter();
        try {
            ai a = new ai(stringWriter).m2374a("map");
            a.m2375a("width", "32");
            a.m2375a("height", "32");
            int i = 0;
            for (int i2 = 0; i2 < 32; i2++) {
                for (int i3 = 0; i3 < 32; i3++) {
                    this.f6868c[i2][i3].mo1800a(a);
                    if (this.f6868c[i2][i3].f7960a != TileType.VOID) {
                        i++;
                    }
                }
            }
            a.m2372a();
            SafePreferences.m8835a("UserMaps").m8839b("map_" + this.f6867b, stringWriter.toString());
            SafePreferences.m8835a("UserMaps").m8844d();
            Game.game.logger.log("UserMap", "Saved");
            Achievement.m7332a(Type.MAP_EDITOR, i);
        } catch (Exception e) {
            Game.game.logger.m7510b("UserMap", "Unable to save user map: " + e.getMessage());
        }
    }

    /* renamed from: e */
    public final void m7590e() {
        SafePreferences.m8835a("UserMaps").m8843c("map_" + this.f6867b);
        SafePreferences.m8835a("UserMaps").m8844d();
        f6866d.mo545b(Integer.valueOf(this.f6867b));
    }
}
