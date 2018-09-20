package com.prineside.tdi;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.C0473l;
import com.badlogic.gdx.graphics.glutils.C0484d;
import com.badlogic.gdx.graphics.glutils.C0485c;
import com.badlogic.gdx.math.C0549f;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0688f;
import com.badlogic.gdx.utils.C0712r;
import com.badlogic.gdx.utils.ah;
import com.badlogic.gdx.utils.ah.C0680a;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.exceptions.InvalidMapFormatException;
import com.prineside.tdi.exceptions.InvalidMapFormatException.Reason;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.tiles.Tile.TileType;
import com.prineside.tdi.tiles.WalkableTile;
import com.prineside.tdi.tiles.types.RoadTile;
import com.prineside.tdi.tiles.types.SpaceTile;
import com.prineside.tdi.tiles.types.SpawnTile;
import com.prineside.tdi.tiles.types.TargetTile;
import com.prineside.tdi.tiles.types.VoidTile;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.utility.PMath;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Map {
    /* renamed from: q */
    private static final Vector2[] f6755q = new Vector2[]{new Vector2(0.0f, 54.0f), new Vector2(32.0f, 54.0f), new Vector2(0.0f, 22.0f), new Vector2(32.0f, 22.0f)};
    /* renamed from: r */
    private static final C0430b f6756r = new C0430b(1.0f, 1.0f, 1.0f, 0.5f);
    /* renamed from: a */
    public C0473l f6757a = new C0473l();
    /* renamed from: b */
    public TowerStatType[] f6758b = null;
    /* renamed from: c */
    public int f6759c = 0;
    /* renamed from: d */
    public Tile[][] f6760d;
    /* renamed from: e */
    public WalkableTile[] f6761e;
    /* renamed from: f */
    public SpawnTile f6762f;
    /* renamed from: g */
    public TargetTile f6763g;
    /* renamed from: h */
    public int f6764h;
    /* renamed from: i */
    public int f6765i;
    /* renamed from: j */
    public int f6766j;
    /* renamed from: k */
    public int f6767k;
    /* renamed from: l */
    public C0712r<Tower> f6768l = new C0712r();
    /* renamed from: m */
    public final C0712r<Enemy> f6769m;
    /* renamed from: n */
    public C0485c f6770n;
    /* renamed from: o */
    public boolean f6771o;
    /* renamed from: p */
    public C0676a<Path> f6772p;
    /* renamed from: s */
    private C0473l f6773s = Game.game.f6559C;
    /* renamed from: t */
    private C0688f<FlyingCoin> f6774t = new C0688f();
    /* renamed from: u */
    private float f6775u = 1.0f;
    /* renamed from: v */
    private C0438n f6776v;
    /* renamed from: w */
    private C0712r<Tile> f6777w = new C0712r();
    /* renamed from: x */
    private int f6778x;
    /* renamed from: y */
    private HashMap<MapListener, Boolean> f6779y = new HashMap();

    public Map(Tile[][] tileArr) {
        this.f6760d = tileArr;
        this.f6765i = tileArr.length;
        this.f6764h = tileArr[0].length;
        this.f6766j = this.f6764h * 64;
        this.f6767k = this.f6765i * 64;
        this.f6769m = new C0712r();
        m7514d();
        Game.game.logger.log("Map", "level size: " + this.f6764h + "x" + this.f6765i);
        try {
            if (Game.f6549c <= this.f6766j || Game.f6549c <= this.f6767k) {
                this.f6775u = 2.0f;
                this.f6770n = new C0485c(Format.RGBA8888, this.f6766j / 2, this.f6767k / 2);
                Game.game.logger.m7510b("Map", "using half-size FB because of small MAX_TEXTURE_SIZE " + Game.f6549c);
                Game.game.logger.log("Map", "frame buffer size: " + this.f6770n.m1499g() + "x" + this.f6770n.m1498f());
                this.f6776v = new C0438n((Texture) this.f6770n.m1491a());
                this.f6776v.mo353a(false, true);
                this.f6776v.f1686z.m1129b(TextureFilter.Linear, TextureFilter.Nearest);
                Game.game.logger.log("Map ascii: ", m7517g());
                m7515e();
            }
            try {
                this.f6770n = new C0485c(Format.RGBA8888, this.f6766j, this.f6767k);
            } catch (Exception e) {
                this.f6775u = 2.0f;
                this.f6770n = new C0485c(Format.RGBA8888, this.f6766j / 2, this.f6767k / 2);
                Game.game.logger.m7510b("Map", "using half-size FB because failed to create normal-size FB");
            }
            Game.game.logger.log("Map", "frame buffer size: " + this.f6770n.m1499g() + "x" + this.f6770n.m1498f());
            this.f6776v = new C0438n((Texture) this.f6770n.m1491a());
            this.f6776v.mo353a(false, true);
            this.f6776v.f1686z.m1129b(TextureFilter.Linear, TextureFilter.Nearest);
            Game.game.logger.log("Map ascii: ", m7517g());
            m7515e();
        } catch (Exception e2) {
            Game.game.logger.m7510b("Map", "failed to create frame buffer, trying POT");
            this.f6766j = C0549f.m1768b(this.f6766j);
            this.f6767k = C0549f.m1768b(this.f6767k);
            if (Game.f6549c <= this.f6766j || Game.f6549c <= this.f6767k) {
                this.f6775u = 2.0f;
                this.f6770n = new C0485c(Format.RGBA8888, this.f6766j / 2, this.f6767k / 2);
                Game.game.logger.m7510b("Map", "using half-size POT FB because of small MAX_TEXTURE_SIZE " + Game.f6549c);
            } else {
                try {
                    this.f6770n = new C0485c(Format.RGBA8888, this.f6766j, this.f6767k);
                } catch (Exception e3) {
                    this.f6775u = 2.0f;
                    this.f6770n = new C0485c(Format.RGBA8888, this.f6766j / 2, this.f6767k / 2);
                    Game.game.logger.m7510b("Map", "using half-size POT FB because failed to create normal-size FB");
                }
            }
        }
    }

    /* renamed from: a */
    private C0676a<Path> m7511a(C0712r<Tile> c0712r, Tile tile, Tile tile2) {
        if (this.f6778x >= 16) {
            Game.game.logger.log("foundPaths", this.f6778x + "/16 END");
            return null;
        }
        C0712r c0712r2 = new C0712r((C0712r) c0712r);
        C0676a c0676a = new C0676a();
        c0676a.m2296a((Object) tile);
        C0676a c0676a2 = new C0676a();
        if (tile == tile2) {
            C0676a<Path> c0676a3 = new C0676a();
            c0676a3.m2296a(new Path(c0676a));
            this.f6778x++;
            return c0676a3;
        }
        while (true) {
            Object obj;
            c0712r2.m2486a(obj);
            c0676a2.mo530d();
            if (obj.f7963d != 0) {
                c0676a2.m2296a(m7518a(obj.f7963d - 1, obj.f7964e));
            }
            if (obj.f7964e != 0) {
                c0676a2.m2296a(m7518a(obj.f7963d, obj.f7964e - 1));
            }
            if (obj.f7963d != this.f6764h - 1) {
                c0676a2.m2296a(m7518a(obj.f7963d + 1, obj.f7964e));
            }
            if (obj.f7964e != this.f6765i - 1) {
                c0676a2.m2296a(m7518a(obj.f7963d, obj.f7964e + 1));
            }
            Iterator it = c0676a2.iterator();
            while (it.hasNext()) {
                Object obj2 = (Tile) it.next();
                if ((obj2.f7960a != TileType.ROAD && obj2.f7960a != TileType.TARGET) || c0712r2.m2490c(obj2)) {
                    it.remove();
                }
            }
            int i = c0676a2.f3001b;
            if (i != 0) {
                if (i != 1) {
                    break;
                }
                obj2 = (Tile) c0676a2.m2291a(0);
                if (obj2 == tile2) {
                    c0676a.m2296a(obj2);
                    c0676a3 = new C0676a();
                    c0676a3.m2296a(new Path(c0676a));
                    this.f6778x++;
                    return c0676a3;
                }
                c0676a.m2296a(obj2);
                obj = obj2;
            } else {
                return null;
            }
        }
        C0676a<Path> c0676a4 = new C0676a();
        Iterator it2 = c0676a2.iterator();
        while (it2.hasNext()) {
            C0676a a = m7511a(c0712r2, (Tile) it2.next(), tile2);
            if (a != null) {
                Iterator it3 = a.iterator();
                while (it3.hasNext()) {
                    Path path = (Path) it3.next();
                    C0676a c0676a5 = new C0676a();
                    Iterator it4 = c0676a.iterator();
                    while (it4.hasNext()) {
                        c0676a5.m2296a((Tile) it4.next());
                    }
                    for (Object a2 : path.f6783d) {
                        c0676a5.m2296a(a2);
                    }
                    c0676a4.m2296a(new Path(c0676a5));
                }
            }
        }
        return c0676a4.f3001b != 0 ? c0676a4 : null;
    }

    /* renamed from: a */
    public static Tile[][] m7512a(String str, boolean z) {
        int i;
        C0680a a = new ah().m2369a(str);
        int d = a.m2363d("width");
        int d2 = a.m2363d("height");
        Tile[][] tileArr = (Tile[][]) Array.newInstance(Tile.class, new int[]{d2, d});
        int a2 = a.m2356a();
        for (i = 0; i < a2; i++) {
            C0680a a3 = a.m2358a(i);
            int d3 = a3.m2363d("x");
            int d4 = z ? (d2 - a3.m2363d("y")) - 1 : a3.m2363d("y");
            tileArr[d4][d3] = Tile.m8366a(d3, d4, a3);
        }
        for (i = 0; i < d; i++) {
            for (d4 = 0; d4 < d2; d4++) {
                if (tileArr[d4][i] == null) {
                    tileArr[d4][i] = Tile.m8367a(TileType.VOID, i, d4);
                }
            }
        }
        return tileArr;
    }

    /* renamed from: b */
    private void m7513b(Tile tile) {
        this.f6770n.m1497d();
        Matrix4 matrix4 = new Matrix4();
        matrix4.m1688a((float) this.f6766j, (float) this.f6767k);
        this.f6757a.mo372a(matrix4);
        this.f6757a.mo373b(new Matrix4());
        this.f6757a.mo365a();
        tile.mo1806a(this.f6757a, this.f6759c);
        if (this.f6759c == 0) {
            if (tile.f7962c != null) {
                this.f6757a.mo370a(tile.f7962c.f8059u, (float) (tile.f7963d * 64), (float) (tile.f7964e * 64), 64.0f, 64.0f);
                this.f6757a.mo370a(tile.f7962c.f8060v, (float) (tile.f7963d * 64), (float) (tile.f7964e * 64), 64.0f, 64.0f);
                this.f6757a.mo370a(Tower.m8430a(tile.f7962c.f8057s), (float) ((tile.f7963d * 64) + 32), (float) (tile.f7964e * 64), 32.0f, 32.0f);
            }
        } else if (this.f6759c == 1) {
            BitmapFont h = Game.game.m7465h(18);
            if (tile.f7962c != null) {
                this.f6757a.m1410a(C0430b.f1620c);
                this.f6757a.mo370a(tile.f7962c.f8059u, (float) (tile.f7963d * 64), (float) (tile.f7964e * 64), 64.0f, 64.0f);
                this.f6757a.m1410a(f6756r);
                this.f6757a.mo370a(tile.f7962c.f8060v, (float) (tile.f7963d * 64), (float) (tile.f7964e * 64), 64.0f, 64.0f);
                this.f6757a.m1410a(C0430b.f1620c);
                float g = (float) tile.f7962c.m8464g();
                for (int i = 0; i < 4; i++) {
                    float f = ((float) tile.f7962c.f8058t[i]) / g;
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                    if (((double) f) < 0.5d) {
                        h.m1334a(new C0430b(1286557951).m1219a(new C0430b(563540991), f / 0.5f));
                    } else {
                        h.m1334a(new C0430b(563540991).m1219a(new C0430b(-4126721), (f - 0.5f) / 0.5f));
                    }
                    h.m1331a(this.f6757a, String.valueOf(tile.f7962c.f8058t[i]), f6755q[i].f2337x + ((float) (tile.f7963d * 64)), f6755q[i].f2338y + ((float) (tile.f7964e * 64)), 32.0f, 1);
                }
                this.f6757a.m1410a(C0430b.f1620c);
            }
        } else if (this.f6759c == 2 && tile.f7962c != null) {
            this.f6757a.m1410a(C0430b.f1620c);
            this.f6757a.mo370a(tile.f7962c.f8059u, (float) (tile.f7963d * 64), (float) (tile.f7964e * 64), 64.0f, 64.0f);
            this.f6757a.m1410a(f6756r);
            this.f6757a.m1411a(tile.f7962c.f8060v, (float) (tile.f7963d * 64), (float) (tile.f7964e * 64));
            this.f6757a.m1410a(C0430b.f1620c);
        }
        this.f6757a.mo374c();
        C0484d.m1489e();
    }

    /* renamed from: d */
    private void m7514d() {
        C0676a c0676a = new C0676a();
        int i = 0;
        while (i < this.f6764h) {
            int i2 = 0;
            while (i2 < this.f6765i) {
                if (this.f6760d[i2][i] != null && (this.f6760d[i2][i] instanceof WalkableTile)) {
                    c0676a.m2296a((WalkableTile) this.f6760d[i2][i]);
                }
                i2++;
            }
            i++;
        }
        this.f6761e = (WalkableTile[]) c0676a.m2298a(WalkableTile.class);
        Game.game.logger.log("Map walkable tile search", "Found walkable tiles: " + this.f6761e.length);
        for (int i3 = 0; i3 < this.f6764h; i3++) {
            for (i = 0; i < this.f6765i; i++) {
                if (this.f6760d[i][i3] != null) {
                    C0676a c0676a2 = new C0676a();
                    if (this.f6760d[i][i3].f7963d != 0) {
                        c0676a2.m2296a(m7518a(this.f6760d[i][i3].f7963d - 1, this.f6760d[i][i3].f7964e));
                        if (this.f6760d[i][i3].f7964e != 0) {
                            c0676a2.m2296a(m7518a(this.f6760d[i][i3].f7963d - 1, this.f6760d[i][i3].f7964e - 1));
                        }
                        if (this.f6760d[i][i3].f7964e != this.f6765i - 1) {
                            c0676a2.m2296a(m7518a(this.f6760d[i][i3].f7963d - 1, this.f6760d[i][i3].f7964e + 1));
                        }
                    }
                    if (this.f6760d[i][i3].f7963d != this.f6764h - 1) {
                        c0676a2.m2296a(m7518a(this.f6760d[i][i3].f7963d + 1, this.f6760d[i][i3].f7964e));
                        if (this.f6760d[i][i3].f7964e != 0) {
                            c0676a2.m2296a(m7518a(this.f6760d[i][i3].f7963d + 1, this.f6760d[i][i3].f7964e - 1));
                        }
                        if (this.f6760d[i][i3].f7964e != this.f6765i - 1) {
                            c0676a2.m2296a(m7518a(this.f6760d[i][i3].f7963d + 1, this.f6760d[i][i3].f7964e + 1));
                        }
                    }
                    if (this.f6760d[i][i3].f7964e != 0) {
                        c0676a2.m2296a(m7518a(this.f6760d[i][i3].f7963d, this.f6760d[i][i3].f7964e - 1));
                    }
                    if (this.f6760d[i][i3].f7964e != this.f6765i - 1) {
                        c0676a2.m2296a(m7518a(this.f6760d[i][i3].f7963d, this.f6760d[i][i3].f7964e + 1));
                    }
                    this.f6760d[i][i3].m8371a(c0676a2);
                }
            }
        }
        Iterator it = c0676a.iterator();
        while (it.hasNext()) {
            Tile a;
            WalkableTile walkableTile = (WalkableTile) it.next();
            ArrayList arrayList = new ArrayList();
            if (walkableTile.d != 0) {
                a = m7518a(walkableTile.d - 1, walkableTile.e);
                if (a instanceof WalkableTile) {
                    arrayList.add((WalkableTile) a);
                }
            }
            if (walkableTile.e != 0) {
                a = m7518a(walkableTile.d, walkableTile.e - 1);
                if (a instanceof WalkableTile) {
                    arrayList.add((WalkableTile) a);
                }
            }
            if (walkableTile.d != this.f6764h - 1) {
                a = m7518a(walkableTile.d + 1, walkableTile.e);
                if (a instanceof WalkableTile) {
                    arrayList.add((WalkableTile) a);
                }
            }
            if (walkableTile.e != this.f6765i - 1) {
                a = m7518a(walkableTile.d, walkableTile.e + 1);
                if (a instanceof WalkableTile) {
                    arrayList.add((WalkableTile) a);
                }
            }
            walkableTile.m8389a(arrayList);
        }
    }

    /* renamed from: e */
    private void m7515e() {
        Game.game.m7478u();
        this.f6770n.m1497d();
        Gdx.gl.glClearColor(0.0941f, 0.0941f, 0.0941f, 0.0f);
        Gdx.gl.glClear(16384);
        Matrix4 matrix4 = new Matrix4();
        matrix4.m1688a((float) this.f6766j, (float) this.f6767k);
        this.f6757a.mo372a(matrix4);
        this.f6757a.mo373b(new Matrix4());
        this.f6757a.mo365a();
        for (int i = 0; i < this.f6765i; i++) {
            for (int i2 = 0; i2 < this.f6764h; i2++) {
                this.f6760d[i][i2].mo1806a(this.f6757a, this.f6759c);
            }
        }
        int i3;
        int i4;
        Tile tile;
        if (this.f6759c == 0) {
            for (i3 = 0; i3 < this.f6765i; i3++) {
                for (i4 = 0; i4 < this.f6764h; i4++) {
                    tile = this.f6760d[i3][i4];
                    if (tile.f7962c != null) {
                        this.f6757a.mo370a(tile.f7962c.f8059u, (float) (i4 * 64), (float) (i3 * 64), 64.0f, 64.0f);
                        this.f6757a.mo370a(tile.f7962c.f8060v, (float) (i4 * 64), (float) (i3 * 64), 64.0f, 64.0f);
                        this.f6757a.mo370a(Tower.m8430a(tile.f7962c.f8057s), (float) ((i4 * 64) + 32), (float) (i3 * 64), 32.0f, 32.0f);
                    }
                }
            }
        } else if (this.f6759c == 1) {
            BitmapFont h = Game.game.m7465h(18);
            for (i4 = 0; i4 < this.f6765i; i4++) {
                for (int i5 = 0; i5 < this.f6764h; i5++) {
                    Tile tile2 = this.f6760d[i4][i5];
                    if (tile2.f7962c != null) {
                        this.f6757a.m1410a(C0430b.f1620c);
                        this.f6757a.mo370a(tile2.f7962c.f8059u, (float) (i5 * 64), (float) (i4 * 64), 64.0f, 64.0f);
                        this.f6757a.m1410a(f6756r);
                        this.f6757a.mo370a(tile2.f7962c.f8060v, (float) (i5 * 64), (float) (i4 * 64), 64.0f, 64.0f);
                        this.f6757a.m1410a(C0430b.f1620c);
                        float g = (float) tile2.f7962c.m8464g();
                        for (int i6 = 0; i6 < 4; i6++) {
                            float f = ((float) tile2.f7962c.f8058t[i6]) / g;
                            if (f > 1.0f) {
                                f = 1.0f;
                            }
                            if (((double) f) < 0.5d) {
                                h.m1334a(new C0430b(1286557951).m1219a(new C0430b(563540991), f / 0.5f));
                            } else {
                                h.m1334a(new C0430b(563540991).m1219a(new C0430b(-4126721), (f - 0.5f) / 0.5f));
                            }
                            h.m1331a(this.f6757a, String.valueOf(tile2.f7962c.f8058t[i6]), f6755q[i6].f2337x + ((float) (i5 * 64)), f6755q[i6].f2338y + ((float) (i4 * 64)), 32.0f, 1);
                        }
                    }
                }
            }
            this.f6757a.m1410a(C0430b.f1620c);
        } else if (this.f6759c == 2) {
            for (i3 = 0; i3 < this.f6765i; i3++) {
                for (i4 = 0; i4 < this.f6764h; i4++) {
                    tile = this.f6760d[i3][i4];
                    if (tile.f7962c != null) {
                        this.f6757a.m1410a(C0430b.f1620c);
                        this.f6757a.mo370a(tile.f7962c.f8059u, (float) (i4 * 64), (float) (i3 * 64), 64.0f, 64.0f);
                        this.f6757a.m1410a(f6756r);
                        this.f6757a.m1411a(tile.f7962c.f8060v, (float) (tile.f7963d * 64), (float) (tile.f7964e * 64));
                        this.f6757a.m1410a(C0430b.f1620c);
                    }
                }
            }
        }
        this.f6757a.mo374c();
        C0484d.m1489e();
    }

    /* renamed from: f */
    private C0676a<Path> m7516f() {
        long u = Game.game.m7478u();
        this.f6762f = null;
        this.f6763g = null;
        for (WalkableTile walkableTile : this.f6761e) {
            if (walkableTile.a == TileType.SPAWN) {
                if (this.f6762f == null) {
                    this.f6762f = (SpawnTile) walkableTile;
                    if (this.f6763g != null) {
                        break;
                    }
                }
                return new C0676a();
            }
            if (walkableTile.a == TileType.TARGET) {
                if (this.f6763g == null) {
                    this.f6763g = (TargetTile) walkableTile;
                    if (this.f6762f != null) {
                        break;
                    }
                } else {
                    return new C0676a();
                }
            }
        }
        if (this.f6762f == null) {
            return new C0676a();
        }
        if (this.f6763g == null) {
            return new C0676a();
        }
        this.f6778x = 0;
        C0676a<Path> a = m7511a(new C0712r(), this.f6762f, this.f6763g);
        Game.game.logger.log("Map", "Paths found in " + (Game.game.m7478u() - u) + "ns, " + String.valueOf(a) + " (" + (a != null ? a.f3001b : 0) + ")");
        return a;
    }

    /* renamed from: g */
    private String m7517g() {
        StringBuilder stringBuilder = new StringBuilder();
        int i = this.f6765i - 1;
        while (i >= 0) {
            int i2 = 0;
            while (i2 < this.f6764h) {
                if (this.f6760d[i][i2] == null || (this.f6760d[i][i2] instanceof VoidTile)) {
                    stringBuilder.append(" ");
                } else if (this.f6760d[i][i2] instanceof SpaceTile) {
                    stringBuilder.append("S");
                } else if (this.f6760d[i][i2] instanceof RoadTile) {
                    stringBuilder.append("R");
                } else if (this.f6760d[i][i2] instanceof SpawnTile) {
                    stringBuilder.append("O");
                } else if (this.f6760d[i][i2] instanceof TargetTile) {
                    stringBuilder.append("T");
                } else {
                    stringBuilder.append("?");
                }
                i2++;
            }
            stringBuilder.append("\n");
            i--;
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final Tile m7518a(int i, int i2) {
        return (i2 < 0 || i2 >= this.f6765i || i < 0 || i >= this.f6764h) ? null : this.f6760d[i2][i];
    }

    /* renamed from: a */
    public final void m7519a() {
        this.f6772p = m7516f();
        Iterator it = this.f6772p.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            ((Path) it.next()).f6785f = i;
            i = i2;
        }
        Iterator it2 = this.f6772p.iterator();
        while (it2.hasNext()) {
            final Path path = (Path) it2.next();
            Thread thread = new Thread(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ Map f6754b;

                public void run() {
                    Path path = path;
                    path.f6781b = (int) ((((float) path.f6784e) * 1.0f) * 64.0f);
                    path.f6782c = ((float) path.f6781b) - 1.0f;
                    path.f6786g = (Vector2[][]) Array.newInstance(Vector2.class, new int[]{5, path.f6781b});
                    path.f6787h = new float[path.f6781b];
                    Game.game.m7478u();
                    float f = (1.0f / ((float) path.f6781b)) * 0.9f;
                    float f2 = 0.0f;
                    while (f2 < 1.0f) {
                        for (int i = 0; i < 5; i++) {
                            path.m7541b(f2, i);
                            if (f2 >= 0.0f && f2 < 1.0f) {
                                int i2 = (int) (path.f6782c * f2);
                                if (path.f6787h[i2] == 0.0f) {
                                    Vector2 a = path.m7538a(f2);
                                    Vector2 a2 = path.m7538a(f2 + 1.0E-4f);
                                    if (a2 == null) {
                                        a = path.m7538a(f2 - 1.0E-4f);
                                        a2 = path.m7538a(f2);
                                    }
                                    path.f6787h[i2] = PMath.m8827c(a.f2337x, a.f2338y, a2.f2337x, a2.f2338y);
                                }
                            }
                        }
                        f2 += f;
                    }
                    Game.game.logger.log("Path " + path.hashCode(), "Position cache prepared");
                }
            });
            try {
                thread.run();
                thread.join();
            } catch (Throwable e) {
                throw new RuntimeException("Unable to prepare map paths: " + e.getMessage(), e);
            }
        }
        Game.game.logger.log("Map#preparePaths", "Found paths: " + this.f6772p.f3001b);
    }

    /* renamed from: a */
    public final synchronized void m7520a(int i, float f, float f2) {
        this.f6774t.m2296a((Object) new FlyingCoin(i, f, f2));
    }

    /* renamed from: a */
    public final void m7521a(int i, int i2, Tower tower) {
        Tile a = m7518a(i, i2);
        if (a == null || !(a instanceof SpaceTile)) {
            throw new RuntimeException("can't set tower - tile " + i + "," + i2 + " not exists or not a space tile\n" + m7517g());
        }
        if (a.f7962c != null) {
            m7526a(a.f7962c);
        }
        a.f7962c = tower;
        tower.m8451a((SpaceTile) a);
        this.f6768l.m2486a((Object) tower);
        m7513b(a);
        for (Entry key : this.f6779y.entrySet()) {
            ((MapListener) key.getKey()).mo1787b(tower);
        }
    }

    /* renamed from: a */
    public final void m7522a(C0676a<Enemy> c0676a, float f, float f2, float f3) {
        float f4 = f3 * f3;
        float pow = (float) Math.pow((double) (90.88f + f3), 2.0d);
        for (WalkableTile walkableTile : this.f6761e) {
            if (PMath.m8826b(f, f2, (float) walkableTile.f, (float) walkableTile.g) < pow && walkableTile.f7986r != 0) {
                synchronized (walkableTile.f7984p) {
                    Iterator c = walkableTile.f7984p.m2489c();
                    while (c.hasNext()) {
                        Object obj = (Enemy) c.next();
                        if (PMath.m8826b(f, f2, obj.f6909d.f2337x, obj.f6909d.f2338y) < f4) {
                            c0676a.m2296a(obj);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m7523a(MapListener mapListener) {
        this.f6779y.put(mapListener, Boolean.valueOf(true));
    }

    /* renamed from: a */
    public final void m7524a(Enemy enemy) {
        synchronized (this.f6769m) {
            if (this.f6769m.m2490c((Object) enemy)) {
                Game.game.logger.m7510b("Map#spawnEnemy", enemy.hashCode() + " enemy is already spawned!");
            } else {
                this.f6769m.m2486a((Object) enemy);
                for (Entry key : this.f6779y.entrySet()) {
                    ((MapListener) key.getKey()).mo1785b(enemy);
                }
                enemy.mo1763l();
            }
        }
    }

    /* renamed from: a */
    public final void m7525a(Tile tile) {
        this.f6777w.m2486a((Object) tile);
    }

    /* renamed from: a */
    public final void m7526a(Tower tower) {
        Tile tile = tower.f8048j;
        tower.m8451a(null);
        tile.f7962c = null;
        this.f6768l.m2488b((Object) tower);
        m7513b(tile);
        for (Entry key : this.f6779y.entrySet()) {
            ((MapListener) key.getKey()).mo1784a(tower);
        }
    }

    /* renamed from: b */
    public final Tile m7527b(int i, int i2) {
        return (i2 < 0 || i < 0) ? null : m7518a(i / 64, i2 / 64);
    }

    /* renamed from: b */
    public final void m7528b() {
        Iterator c;
        if (this.f6771o) {
            this.f6771o = false;
            m7515e();
        } else {
            c = this.f6777w.m2489c();
            while (c.hasNext()) {
                m7513b((Tile) c.next());
            }
        }
        this.f6777w.m2484a();
        this.f6773s.mo365a();
        this.f6773s.mo370a(this.f6776v, 0.0f, 0.0f, this.f6775u * ((float) this.f6776v.f1684E), this.f6775u * ((float) this.f6776v.f1685F));
        long t = Game.game.m7477t();
        this.f6774t.m2402f();
        int i = 0;
        while (i < this.f6774t.b && t - ((FlyingCoin) this.f6774t.m2291a(i)).f6510f > 1000000) {
            this.f6774t.mo527b(i);
            i++;
        }
        this.f6774t.m2403g();
        c = this.f6774t.iterator();
        while (c.hasNext()) {
            FlyingCoin flyingCoin = (FlyingCoin) c.next();
            float f = ((float) (t - flyingCoin.f6510f)) / 1000000.0f;
            float f2 = flyingCoin.f6509e + (32.0f * f);
            this.f6773s.mo367a(1.0f, 1.0f, 1.0f, 1.0f - f);
            this.f6773s.m1411a(FlyingCoin.f6505a, flyingCoin.f6508d, f2);
            FlyingCoin.f6506b.m1333a(1.0f, 1.0f, 1.0f, 1.0f - f);
            FlyingCoin.f6506b.m1330a(this.f6773s, String.valueOf(flyingCoin.f6507c), flyingCoin.f6508d + 19.0f, f2 + 14.0f);
        }
        this.f6773s.m1410a(C0430b.f1620c);
        this.f6773s.mo374c();
    }

    /* renamed from: b */
    public final boolean m7529b(Enemy enemy) {
        boolean z;
        synchronized (this.f6769m) {
            if (enemy != null) {
                if (this.f6769m.m2490c((Object) enemy)) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public final void m7530c() {
        Tile tile = null;
        m7514d();
        int length = this.f6760d.length;
        int length2 = this.f6760d[0].length;
        Object obj = null;
        for (int i = 0; i < length2; i++) {
            int i2 = 0;
            while (i2 < length) {
                Tile tile2 = this.f6760d[i2][i];
                if (tile2.f7960a == TileType.SPAWN) {
                    if (obj != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(obj);
                        arrayList.add(tile2);
                        throw new InvalidMapFormatException(Reason.MULTIPLE_SPAWNS, arrayList);
                    } else if (tile != null) {
                        obj = tile2;
                        break;
                    } else {
                        obj = tile2;
                    }
                }
                if (tile2.f7960a != TileType.TARGET) {
                    tile2 = tile;
                } else if (tile != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(tile);
                    arrayList2.add(tile2);
                    throw new InvalidMapFormatException(Reason.MULTIPLE_TARGETS, arrayList2);
                } else if (obj != null) {
                    tile = tile2;
                    break;
                }
                i2++;
                tile = tile2;
            }
        }
        if (obj == null) {
            throw new InvalidMapFormatException(Reason.SPAWN_NOT_FOUND, new ArrayList());
        } else if (tile == null) {
            throw new InvalidMapFormatException(Reason.TARGET_NOT_FOUND, new ArrayList());
        } else {
            this.f6778x = 0;
            C0676a f = m7516f();
            if (f == null || f.f3001b == 0) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(obj);
                arrayList3.add(tile);
                throw new InvalidMapFormatException(Reason.NO_PATH_FOUND, arrayList3);
            }
        }
    }

    /* renamed from: c */
    public final void m7531c(Enemy enemy) {
        synchronized (this.f6769m) {
            if (this.f6769m.m2490c((Object) enemy)) {
                this.f6769m.m2488b((Object) enemy);
                if (enemy.f6915j != null) {
                    enemy.f6915j.m8388a(enemy);
                }
                for (Entry key : this.f6779y.entrySet()) {
                    ((MapListener) key.getKey()).mo1782a(enemy);
                }
            }
        }
    }
}
