package com.prineside.tdi.tiles.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.g2d.C0473l;
import com.badlogic.gdx.utils.ah.C0680a;
import com.badlogic.gdx.utils.ai;
import com.prineside.tdi.Game;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.tiles.SpaceTileBonus;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.utility.MaterialColor.AMBER;
import com.prineside.tdi.utility.MaterialColor.BLUE;
import com.prineside.tdi.utility.MaterialColor.GREEN;
import java.util.HashMap;

public class SpaceTile extends Tile {
    /* renamed from: p */
    public static final C0430b f7988p = new C0430b(1077952767);
    /* renamed from: q */
    public static C0438n[] f7989q;
    /* renamed from: r */
    public static C0438n f7990r;
    /* renamed from: s */
    public SpaceTileBonus[] f7991s;
    /* renamed from: t */
    public int f7992t = 0;
    /* renamed from: u */
    public HashMap<TowerStatType, Float> f7993u;

    public SpaceTile(int i, int i2) {
        super(TileType.SPACE, i, i2);
        if (f7989q == null) {
            r0 = new C0438n[3];
            f7989q = r0;
            r0[0] = Game.game.f6561E.m1442a("space-tile-bonus-level-1");
            f7989q[1] = Game.game.f6561E.m1442a("space-tile-bonus-level-2");
            f7989q[2] = Game.game.f6561E.m1442a("space-tile-bonus-level-3");
            f7990r = Game.game.f6561E.m1442a("space-tile-bonus-unique");
        }
        this.f7991s = new SpaceTileBonus[4];
        m8397k();
        m8375c();
    }

    /* renamed from: b */
    public static SpaceTile m8396b(int i, int i2, C0680a c0680a) {
        SpaceTile spaceTile = new SpaceTile(i, i2);
        int a = c0680a.m2356a();
        for (int i3 = 0; i3 < a; i3++) {
            C0680a a2 = c0680a.m2358a(i3);
            if (a2.f3028a.equals("uniqueBonusLevel")) {
                try {
                    spaceTile.f7992t = Integer.valueOf(a2.f3031d).intValue();
                } catch (Exception e) {
                    Game.game.logger.m7510b("SpaceTile", "fromXML - invalid \"uniqueBonusLevel\" (" + a2.f3031d + ")");
                }
            } else if (a2.f3028a.equals("bonuses")) {
                int a3 = a2.m2356a();
                int i4 = 0;
                for (int i5 = 0; i5 < a3; i5++) {
                    if (i4 == 4) {
                        Game.game.logger.m7510b("SpaceTile", "fromXML - too many bonuses (" + a2.toString() + ")");
                        break;
                    }
                    C0680a a4 = a2.m2358a(i5);
                    try {
                        spaceTile.f7991s[i4] = new SpaceTileBonus(TowerStatType.valueOf(a4.m2359a("stat")), Integer.valueOf(a4.m2359a("level")).intValue());
                        i4++;
                    } catch (Exception e2) {
                        Game.game.logger.m7510b("SpaceTile", "fromXML - invalid bonus element (" + a4.toString() + ")");
                    }
                }
                spaceTile.m8397k();
            }
        }
        return spaceTile;
    }

    /* renamed from: k */
    private void m8397k() {
        this.f7993u = new HashMap();
        int i = 0;
        while (i < 4) {
            if (!(this.f7991s[i] == null || this.f7991s[i].f7951e == 0)) {
                this.f7993u.put(this.f7991s[i].f7950d, Float.valueOf(this.f7991s[i].m8361a()));
            }
            i++;
        }
    }

    /* renamed from: a */
    public final void m8398a(int i, SpaceTileBonus spaceTileBonus) {
        if (i < 0 || i >= 4) {
            Game.game.logger.m7510b("SpaceTile", "Invalid bonus index: " + i);
        }
        this.f7991s[i] = spaceTileBonus;
        m8397k();
        m8375c();
    }

    /* renamed from: a */
    public final void mo1806a(C0473l c0473l, int i) {
        super.mo1806a(c0473l, i);
        if (this.f7992t == 1) {
            c0473l.m1410a(GREEN.f8487f);
            c0473l.mo370a(f7990r, (float) (this.d * 64), (float) (this.e * 64), 64.0f, 64.0f);
            c0473l.m1410a(C0430b.f1620c);
        } else if (this.f7992t == 2) {
            c0473l.m1410a(BLUE.f8411f);
            c0473l.mo370a(f7990r, (float) (this.d * 64), (float) (this.e * 64), 64.0f, 64.0f);
            c0473l.m1410a(C0430b.f1620c);
        } else if (this.f7992t == 3) {
            c0473l.m1410a(AMBER.f8397f);
            c0473l.mo370a(f7990r, (float) (this.d * 64), (float) (this.e * 64), 64.0f, 64.0f);
            c0473l.m1410a(C0430b.f1620c);
        }
        int i2 = 0;
        while (i2 < 4) {
            if (!(this.f7991s[i2] == null || this.f7991s[i2].f7951e == 0)) {
                int i3;
                float f;
                int i4;
                if (i2 == 0) {
                    i3 = 32;
                    f = 0.0f;
                    i4 = 0;
                } else if (i2 == 1) {
                    i3 = 32;
                    f = 270.0f;
                    i4 = 32;
                } else if (i2 == 2) {
                    i3 = 0;
                    f = 180.0f;
                    i4 = 32;
                } else {
                    i3 = 0;
                    f = 90.0f;
                    i4 = 0;
                }
                GameScreen gameScreen = Game.f6553g;
                C0430b c0430b = null;
                int i5;
                Object obj;
                if (i == 2) {
                    if (gameScreen != null && gameScreen.f7179t != null && gameScreen.f7179t.f6758b != null) {
                        i5 = 0;
                        while (i5 < gameScreen.f7179t.f6758b.length) {
                            if (gameScreen.f7179t.f6758b[i5] != this.f7991s[i2].f7950d) {
                                i5++;
                            }
                        }
                        obj = null;
                        if (obj == null) {
                            c0430b = this.f7991s[i2].m8362b().m1222c();
                            if (this.c != null) {
                                c0430b.f1647L = 1.0f;
                            } else {
                                c0430b.f1647L = 0.4f;
                            }
                        } else {
                            c0430b = new C0430b(1.0f, 1.0f, 1.0f, 0.075f);
                        }
                    }
                    obj = 1;
                    if (obj == null) {
                        c0430b = new C0430b(1.0f, 1.0f, 1.0f, 0.075f);
                    } else {
                        c0430b = this.f7991s[i2].m8362b().m1222c();
                        if (this.c != null) {
                            c0430b.f1647L = 0.4f;
                        } else {
                            c0430b.f1647L = 1.0f;
                        }
                    }
                } else if (this.c == null) {
                    obj = null;
                    if (gameScreen != null && gameScreen.f7179t != null) {
                        if (gameScreen.f7179t.f6758b == null) {
                            obj = null;
                        } else {
                            for (TowerStatType towerStatType : gameScreen.f7179t.f6758b) {
                                if (towerStatType == this.f7991s[i2].f7950d) {
                                    obj = 1;
                                    break;
                                }
                            }
                            obj = null;
                        }
                    }
                    if (obj != null) {
                        c0430b = this.f7991s[i2].m8362b().m1222c();
                        if (this.c == null) {
                            c0430b.f1647L = 1.0f;
                        } else {
                            c0430b.f1647L = 0.4f;
                        }
                    } else {
                        c0430b = new C0430b(1.0f, 1.0f, 1.0f, 0.075f);
                    }
                }
                if (c0430b != null) {
                    c0473l.m1410a(c0430b);
                    c0473l.mo371a(f7989q[this.f7991s[i2].f7951e - 1], (float) (i4 + (this.d * 64)), (float) (i3 + (this.e * 64)), 16.0f, 16.0f, 32.0f, 32.0f, 1.0f, 1.0f, f);
                    c0473l.m1410a(C0430b.f1620c);
                }
            }
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo1800a(ai aiVar) {
        try {
            ai a = aiVar.m2374a("tile");
            a.m2375a("x", String.valueOf(this.d));
            a.m2375a("y", String.valueOf(this.e));
            a.m2375a("type", "SPACE");
            a.m2374a("uniqueBonusLevel").m2373a(String.valueOf(this.f7992t)).m2372a();
            ai a2 = a.m2374a("bonuses");
            int i = 0;
            while (i < 4) {
                if (!(this.f7991s[i] == null || this.f7991s[i].f7951e == 0)) {
                    a2.m2374a("bonus").m2375a("stat", this.f7991s[i].f7950d.name()).m2375a("level", String.valueOf(this.f7991s[i].f7951e)).m2372a();
                }
                i++;
            }
            a2.m2372a();
            a.m2372a();
        } catch (Throwable e) {
            Game.game.logger.m7509a(e);
        }
    }

    /* renamed from: a */
    public final boolean mo1807a(Tile tile) {
        if (this.a != tile.f7960a) {
            return false;
        }
        SpaceTile spaceTile = (SpaceTile) tile;
        if (spaceTile.f7992t != this.f7992t) {
            return false;
        }
        SpaceTileBonus[] spaceTileBonusArr = spaceTile.f7991s;
        int i = 0;
        while (i < 4) {
            if ((spaceTileBonusArr[i] != null || this.f7991s[i] != null) && (spaceTileBonusArr[i] == null || this.f7991s[i] == null || spaceTileBonusArr[i].f7950d != this.f7991s[i].f7950d || spaceTileBonusArr[i].f7951e != this.f7991s[i].f7951e)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: b */
    public final Tile mo1808b() {
        SpaceTile spaceTile = (SpaceTile) Tile.m8367a(this.a, this.d, this.e);
        spaceTile.f7992t = this.f7992t;
        int i = 0;
        while (i < 4) {
            if (!(this.f7991s[i] == null || this.f7991s[i].f7951e == 0)) {
                spaceTile.f7991s[i] = new SpaceTileBonus(this.f7991s[i].f7950d, this.f7991s[i].f7951e);
            }
            i++;
        }
        spaceTile.m8397k();
        return spaceTile;
    }

    /* renamed from: d */
    public final float mo1809d() {
        float f = 12.0f * ((float) this.f7992t);
        for (int i = 0; i < 4; i++) {
            if (this.f7991s[i] != null) {
                f = (float) (((double) f) + (((double) this.f7991s[i].f7951e) * (1.0d + (((double) ((float) this.f7991s[i].f7950d.ordinal())) * 0.001d))));
            }
        }
        return f;
    }

    /* renamed from: e */
    public final int mo1801e() {
        return (((int) mo1809d()) + 1) * 100;
    }

    /* renamed from: f */
    public final int mo1802f() {
        int i = (this.f7992t * 2) + 1;
        for (int i2 = 0; i2 < 4; i2++) {
            if (this.f7991s[i2] != null) {
                i += this.f7991s[i2].f7951e;
            }
        }
        return i;
    }

    /* renamed from: g */
    public final boolean mo1810g() {
        if (this.f7992t < 3) {
            return true;
        }
        int i = 0;
        while (i < 4) {
            if (this.f7991s[i] != null && this.f7991s[i].f7951e < 3) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: h */
    public final String mo1803h() {
        return Game.f6551e.m2416a("tile_name_SPACE");
    }

    /* renamed from: i */
    public final String mo1804i() {
        return Game.f6551e.m2416a("tile_description_SPACE");
    }

    /* renamed from: j */
    public final C0430b mo1805j() {
        return f7988p;
    }
}
