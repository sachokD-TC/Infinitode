package com.prineside.tdi;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.utility.PMath;
import java.util.Iterator;
import java.util.Random;

public class Path {
    /* renamed from: a */
    public static int f6780a = 0;
    /* renamed from: b */
    int f6781b;
    /* renamed from: c */
    public float f6782c;
    /* renamed from: d */
    public Tile[] f6783d;
    /* renamed from: e */
    public int f6784e;
    /* renamed from: f */
    public int f6785f = 0;
    /* renamed from: g */
    Vector2[][] f6786g;
    /* renamed from: h */
    public float[] f6787h;

    public Path(C0676a<Tile> c0676a) {
        this.f6783d = new Tile[c0676a.f3001b];
        Iterator it = c0676a.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.f6783d[i] = (Tile) it.next();
            i++;
        }
        this.f6784e = c0676a.f3001b - 1;
    }

    /* renamed from: a */
    public static int m7536a() {
        return new Random().nextInt(5);
    }

    /* renamed from: a */
    private static Vector2 m7537a(Vector2 vector2, int i) {
        Vector2 vector22 = new Vector2((((((float) (i - 2)) / 2.0f) * 0.25f) * 64.0f) / 2.0f, 0.0f);
        float atan2 = ((float) Math.atan2((double) vector2.f2338y, (double) vector2.f2337x)) * 57.295776f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        }
        atan2 = (atan2 - 0.049804688f) * 0.017453292f;
        float cos = (float) Math.cos((double) atan2);
        atan2 = (float) Math.sin((double) atan2);
        float f = (vector22.f2337x * cos) - (vector22.f2338y * atan2);
        atan2 = (atan2 * vector22.f2337x) + (cos * vector22.f2338y);
        vector22.f2337x = f;
        vector22.f2338y = atan2;
        return vector22;
    }

    /* renamed from: a */
    public final Vector2 m7538a(float f) {
        if (f < 0.0f || f >= 1.0f) {
            return null;
        }
        this.f6786g[0][(int) (this.f6782c * f)] = null;
        return m7541b(f, 0);
    }

    /* renamed from: a */
    public final Vector2 m7539a(float f, int i) {
        try {
            return this.f6786g[i][(int) (this.f6782c * f)];
        } catch (ArrayIndexOutOfBoundsException e) {
            Game.game.logger.m7510b("Path", "getPositionByProgressCached - ArrayIndexOutOfBoundsException: " + e.getMessage() + ", progress: " + f + ", sideShiftIdx: " + i);
            Game.game.logger.m7509a(new Exception());
            return new Vector2(0.0f, 0.0f);
        }
    }

    /* renamed from: a */
    public final Vector2 m7540a(float f, int i, float f2, float f3, float f4, float f5) {
        float f6 = 0.9999f;
        if (f >= 1.0f) {
            f = 0.9999f;
        }
        Vector2 a = m7539a(f, i);
        float a2 = ((((PMath.m8820a(f2, f3, a.f2337x, a.f2338y) / 64.0f) / f5) * f4) / ((float) this.f6784e)) + f;
        if (a2 < 1.0f) {
            f6 = a2;
        }
        return m7539a(f6, i);
    }

    /* renamed from: b */
    public final Vector2 m7541b(float f, int i) {
        if (f < 0.0f || f >= 1.0f) {
            return null;
        }
        int i2 = (int) (this.f6782c * f);
        if (this.f6786g[i][i2] != null) {
            return this.f6786g[i][i2];
        }
        float f2 = ((float) this.f6784e) * f;
        int floor = (int) Math.floor((double) (0.5f + f2));
        if (floor == 0 || floor == this.f6783d.length - 1) {
            floor = (int) Math.floor((double) f2);
            int ceil = (int) Math.ceil((double) f2);
            Tile tile = this.f6783d[floor];
            Tile tile2 = this.f6783d[ceil];
            f2 -= (float) floor;
            Vector2 a = m7537a(new Vector2((float) (tile2.f7963d - tile.f7963d), (float) (tile2.f7964e - tile.f7964e)), i);
            this.f6786g[i][i2] = new Vector2((((float) tile.f7965f) + (((float) (tile2.f7965f - tile.f7965f)) * f2)) + a.f2337x, ((f2 * ((float) (tile2.f7966g - tile.f7966g))) + ((float) tile.f7966g)) + a.f2338y);
            return this.f6786g[i][i2];
        }
        tile2 = this.f6783d[floor];
        tile = this.f6783d[floor - 1];
        Tile tile3 = this.f6783d[floor + 1];
        f2 = ((f2 - ((float) floor)) - 0.5f) + 1.0f;
        float f3 = ((float) tile.f7965f) + (((float) (tile2.f7965f - tile.f7965f)) / 2.0f);
        float f4 = ((float) tile.f7966g) + (((float) (tile2.f7966g - tile.f7966g)) / 2.0f);
        Vector2 a2 = m7537a(new Vector2((float) (tile2.f7963d - tile.f7963d), (float) (tile2.f7964e - tile.f7964e)), i);
        float f5 = ((float) tile2.f7965f) + (((float) (tile3.f7965f - tile2.f7965f)) / 2.0f);
        float f6 = ((float) tile2.f7966g) + (((float) (tile3.f7966g - tile2.f7966g)) / 2.0f);
        Vector2 a3 = m7537a(new Vector2((float) (tile3.f7963d - tile2.f7963d), (float) (tile3.f7964e - tile2.f7964e)), i);
        float f7 = (float) tile2.f7965f;
        float f8 = (float) tile2.f7966g;
        Vector2 vector2 = new Vector2(a2);
        if (vector2.f2337x != a3.f2337x) {
            vector2.f2337x += a3.f2337x;
        }
        if (vector2.f2338y != a3.f2338y) {
            vector2.f2338y += a3.f2338y;
        }
        this.f6786g[i][i2] = PMath.m8822a(new Vector2(f3 + a2.f2337x, a2.f2338y + f4), new Vector2(vector2.f2337x + f7, f8 + vector2.f2338y), new Vector2(a3.f2337x + f5, a3.f2338y + f6), f2);
        return this.f6786g[i][i2];
    }
}
