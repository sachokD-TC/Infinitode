package com.prineside.tdi.screens;

import com.badlogic.gdx.C0377g;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.C0507i;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.g2d.C0444a;
import com.badlogic.gdx.graphics.g2d.C0473l;
import com.badlogic.gdx.graphics.g2d.C0480m.C0475a;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.C0549f;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.C0607f;
import com.badlogic.gdx.scenes.scene2d.C0609g;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.p033a.C0587a;
import com.badlogic.gdx.scenes.scene2d.ui.C0625d;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f.C0628a;
import com.badlogic.gdx.scenes.scene2d.ui.C0635g;
import com.badlogic.gdx.scenes.scene2d.ui.C0635g.C0634a;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.C0618d;
import com.badlogic.gdx.scenes.scene2d.utils.C0655f;
import com.badlogic.gdx.scenes.scene2d.utils.C0663k;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.C0710q.C0707b;
import com.badlogic.gdx.utils.C0712r;
import com.badlogic.gdx.utils.af;
import com.badlogic.gdx.utils.af.C0361a;
import com.badlogic.gdx.utils.p034b.C0684b;
import com.prineside.tdi.CameraController;
import com.prineside.tdi.Game;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgrade.FilteringMode;
import com.prineside.tdi.Map;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.UserMap;
import com.prineside.tdi.exceptions.InvalidMapFormatException;
import com.prineside.tdi.screens.SettingsScreen.ToggleButton;
import com.prineside.tdi.screens.components.Dialog;
import com.prineside.tdi.tileInventory.Inventory;
import com.prineside.tdi.tileInventory.Stack;
import com.prineside.tdi.tiles.SpaceTileBonus;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.tiles.Tile.TileType;
import com.prineside.tdi.tiles.types.SpaceTile;
import com.prineside.tdi.tiles.types.SpawnTile;
import com.prineside.tdi.tiles.types.VoidTile;
import com.prineside.tdi.towers.TowerStat;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.utility.MaterialColor.GREEN;
import com.prineside.tdi.utility.MaterialColor.LIGHT_BLUE;
import com.prineside.tdi.utility.MaterialColor.LIGHT_GREEN;
import com.prineside.tdi.utility.MaterialColor.ORANGE;
import com.prineside.tdi.utility.MaterialColor.RED;
import com.prineside.tdi.utility.ObjectRetriever;
import com.prineside.tdi.utility.QuadActor;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class MapEditorScreen extends AbstractScreen {
    /* renamed from: j */
    private static C0712r<TileType> f7492j;
    /* renamed from: m */
    private static C0438n f7493m;
    /* renamed from: n */
    private static C0438n f7494n;
    /* renamed from: o */
    private static C0438n f7495o;
    /* renamed from: p */
    private static C0438n f7496p;
    /* renamed from: A */
    private C0629f f7497A;
    /* renamed from: B */
    private C0605e f7498B;
    /* renamed from: C */
    private C0625d f7499C;
    /* renamed from: D */
    private C0629f f7500D;
    /* renamed from: E */
    private C0605e f7501E;
    /* renamed from: F */
    private C0625d f7502F;
    /* renamed from: G */
    private boolean f7503G;
    /* renamed from: H */
    private boolean f7504H;
    /* renamed from: I */
    private boolean f7505I;
    /* renamed from: J */
    private C0629f f7506J;
    /* renamed from: K */
    private C0629f f7507K;
    /* renamed from: L */
    private C0605e f7508L;
    /* renamed from: M */
    private C0602b f7509M;
    /* renamed from: N */
    private C0605e f7510N;
    /* renamed from: O */
    private C0605e f7511O;
    /* renamed from: P */
    private C0602b f7512P;
    /* renamed from: Q */
    private Table f7513Q;
    /* renamed from: R */
    private UpgradeMenuButton[] f7514R = new UpgradeMenuButton[5];
    /* renamed from: S */
    private Table f7515S;
    /* renamed from: T */
    private C0605e f7516T;
    /* renamed from: U */
    private Tile f7517U;
    /* renamed from: V */
    private ArrayList<Tile> f7518V = null;
    /* renamed from: W */
    private Tile f7519W;
    /* renamed from: X */
    private boolean f7520X = false;
    /* renamed from: Y */
    private boolean[] f7521Y = new boolean[TowerStatType.f8067B.length];
    /* renamed from: Z */
    private final float[][] f7522Z = ((float[][]) Array.newInstance(Float.TYPE, new int[]{4, 3}));
    /* renamed from: b */
    public final C0609g f7523b = new C0609g(this.f7531k);
    /* renamed from: c */
    public CameraController f7524c;
    /* renamed from: d */
    public Dialog f7525d;
    /* renamed from: e */
    public Inventory f7526e;
    /* renamed from: f */
    public Tile f7527f;
    /* renamed from: g */
    public boolean f7528g;
    /* renamed from: h */
    public int f7529h;
    /* renamed from: i */
    public int f7530i;
    /* renamed from: k */
    private final C0684b f7531k = new C0684b();
    /* renamed from: l */
    private C0507i f7532l;
    /* renamed from: q */
    private C0377g f7533q;
    /* renamed from: r */
    private UserMap f7534r;
    /* renamed from: s */
    private Map f7535s;
    /* renamed from: t */
    private int f7536t;
    /* renamed from: u */
    private int f7537u;
    /* renamed from: v */
    private int f7538v;
    /* renamed from: w */
    private C0635g f7539w;
    /* renamed from: x */
    private Table f7540x;
    /* renamed from: y */
    private C0605e f7541y;
    /* renamed from: z */
    private C0625d f7542z;

    private class UpgradeMenuButton {
        /* renamed from: a */
        private C0430b f7430a = new C0430b(1.0f, 1.0f, 1.0f, 0.14f);
        /* renamed from: b */
        public C0605e f7431b;
        /* renamed from: c */
        final /* synthetic */ MapEditorScreen f7432c;
        /* renamed from: d */
        private C0430b f7433d = new C0430b(22518783);
        /* renamed from: e */
        private C0629f f7434e;
        /* renamed from: f */
        private C0629f f7435f;
        /* renamed from: g */
        private QuadActor f7436g;
        /* renamed from: h */
        private C0625d f7437h;
        /* renamed from: i */
        private C0625d f7438i;
        /* renamed from: j */
        private boolean f7439j;
        /* renamed from: k */
        private boolean f7440k;

        public UpgradeMenuButton(final MapEditorScreen mapEditorScreen, float[] fArr, C0655f c0655f) {
            this.f7432c = mapEditorScreen;
            C0628a c0628a = new C0628a(Game.game.m7463g(30), C0430b.f1620c);
            this.f7431b = new C0605e();
            this.f7431b.m1956c(317.0f, 138.0f);
            this.f7431b.f2610d = Touchable.enabled;
            this.f7431b.m1947a(new C0618d(this) {
                /* renamed from: g */
                final /* synthetic */ UpgradeMenuButton f7491g;

                /* renamed from: b */
                public final void mo500b() {
                    if (this.f7491g.f7439j && this.f7491g.f7440k && this.f7491g.f7431b.f2611e) {
                        this.mo1790a();
                    }
                }
            });
            this.f7436g = new QuadActor(fArr, C0430b.f1620c);
            this.f7436g.m1956c(317.0f, 138.0f);
            this.f7431b.mo510b(this.f7436g);
            this.f7437h = new C0625d();
            this.f7437h.m1956c(64.0f, 64.0f);
            this.f7437h.m1935a(37.0f, 37.0f);
            this.f7431b.mo510b(this.f7437h);
            this.f7434e = new C0629f("Title", c0628a);
            this.f7434e.m1956c(256.0f, 32.0f);
            this.f7434e.m1935a(117.0f, 70.0f);
            this.f7431b.mo510b(this.f7434e);
            this.f7435f = new C0629f("100", c0628a);
            this.f7435f.m1956c(100.0f, 32.0f);
            this.f7435f.m1935a(133.0f, 28.0f);
            this.f7435f.m2127a(16);
            this.f7431b.mo510b(this.f7435f);
            this.f7438i = new C0625d(c0655f);
            this.f7438i.m1956c(32.0f, 32.0f);
            this.f7438i.m1935a(254.0f, 28.0f);
            this.f7431b.mo510b(this.f7438i);
            m8067b(true);
            m8068c(true);
        }

        /* renamed from: a */
        public void mo1790a() {
        }

        /* renamed from: a */
        public final void m8063a(int i) {
            if (i > 0) {
                this.f7435f.f2611e = true;
                this.f7435f.m2130a(String.valueOf(i));
                this.f7438i.f2611e = true;
                return;
            }
            this.f7435f.f2611e = false;
            this.f7438i.f2611e = false;
        }

        /* renamed from: a */
        public final void m8064a(C0655f c0655f) {
            this.f7437h.m2117a(c0655f);
        }

        /* renamed from: a */
        public final void m8065a(String str) {
            this.f7434e.m2130a((CharSequence) str);
        }

        /* renamed from: a */
        public final void m8066a(boolean z) {
            this.f7431b.f2611e = z;
        }

        /* renamed from: b */
        public final void m8067b(boolean z) {
            this.f7439j = z;
            if (z) {
                this.f7436g.m1937a(this.f7433d);
            } else {
                this.f7436g.m1937a(this.f7430a);
            }
        }

        /* renamed from: c */
        public final void m8068c(boolean z) {
            this.f7440k = z;
            if (this.f7440k) {
                this.f7435f.m1937a(C0430b.f1620c);
                this.f7438i.m1937a(C0430b.f1620c);
                return;
            }
            this.f7435f.m1937a(RED.f8609f);
            this.f7438i.m1937a(RED.f8609f);
        }
    }

    /* renamed from: com.prineside.tdi.screens.MapEditorScreen$5 */
    class C11495 extends C0602b {
        /* renamed from: q */
        final /* synthetic */ MapEditorScreen f7484q;

        C11495(MapEditorScreen mapEditorScreen) {
            this.f7484q = mapEditorScreen;
        }

        /* renamed from: a */
        public final void mo471a(C0444a c0444a, float f) {
            c0444a.mo374c();
            Matrix4 a = Game.game.f6560D.f2112c.m1687a();
            Matrix4 a2 = Game.game.f6560D.f2111b.m1687a();
            Gdx.gl.glEnable(3042);
            Gdx.gl.glBlendFunc(770, 771);
            Game.game.f6560D.m1458a(c0444a.mo378g());
            Game.game.f6560D.m1462b(c0444a.mo379h());
            Game.game.f6560D.m1456a(ShapeType.Filled);
            Game.game.f6560D.m1455a(new C0430b(0.07f, 0.07f, 0.07f, 0.7f));
            Game.game.f6560D.m1460b(this.f2613g, this.f2614h, this.f2615i, this.f2616j);
            Game.game.f6560D.m1451a();
            Game.game.f6560D.m1458a(a2);
            Game.game.f6560D.m1462b(a);
            c0444a.mo365a();
        }
    }

    /* renamed from: com.prineside.tdi.screens.MapEditorScreen$6 */
    class C11506 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ MapEditorScreen f7485a;

        C11506(MapEditorScreen mapEditorScreen) {
            this.f7485a = mapEditorScreen;
        }

        /* renamed from: a */
        public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
            MapEditorScreen.m8119f(this.f7485a);
            return true;
        }
    }

    /* renamed from: com.prineside.tdi.screens.MapEditorScreen$7 */
    class C11517 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ MapEditorScreen f7486a;

        C11517(MapEditorScreen mapEditorScreen) {
            this.f7486a = mapEditorScreen;
        }

        /* renamed from: b */
        public final void mo500b() {
            MapEditorScreen.m8119f(this.f7486a);
        }
    }

    static {
        C0712r c0712r = new C0712r();
        f7492j = c0712r;
        c0712r.m2486a(TileType.ROAD);
        f7492j.m2486a(TileType.SPAWN);
        f7492j.m2486a(TileType.TARGET);
    }

    public MapEditorScreen(int i) {
        this.f7534r = UserMap.m7586b(i);
        this.f7536t = UserMap.m7584a();
        this.f7537u = (32 - this.f7536t) / 2;
        this.f7538v = 31 - this.f7537u;
        int i2 = this.f7537u * 64;
        int i3 = (this.f7538v + 1) * 64;
        int i4 = (((i3 - i2) / 2) + i2) - 32;
        this.f7522Z[0][0] = (float) ((i2 - 64) - 16);
        this.f7522Z[0][1] = (float) i4;
        this.f7522Z[0][2] = 270.0f;
        this.f7522Z[2][0] = (float) (i3 + 16);
        this.f7522Z[2][1] = (float) i4;
        this.f7522Z[2][2] = 90.0f;
        this.f7522Z[1][0] = (float) i4;
        this.f7522Z[1][1] = (float) (i3 + 16);
        this.f7522Z[1][2] = 180.0f;
        this.f7522Z[3][0] = (float) i4;
        this.f7522Z[3][1] = (float) ((i2 - 64) - 16);
        this.f7522Z[3][2] = 0.0f;
        Inventory a = Inventory.m8354a();
        Inventory inventory = new Inventory();
        Iterator it = a.f7942a.iterator();
        while (it.hasNext()) {
            Stack stack = (Stack) it.next();
            inventory.m8358a(stack.f7944a, stack.f7945b);
        }
        this.f7526e = inventory;
        i2 = 0;
        while (i2 < 32) {
            i3 = 0;
            while (i3 < 32) {
                if (!(this.f7534r.f6868c[i2][i3].f7960a == TileType.VOID || this.f7526e.m8359a(this.f7534r.f6868c[i2][i3]))) {
                    this.f7534r.f6868c[i2][i3] = new VoidTile(i3, i2);
                    Game.game.logger.log("MapEditor", "Tile " + i3 + ":" + i2 + " not exists in inventory, replacing with void on map");
                }
                i3++;
            }
            i2++;
        }
        this.f7535s = new Map(this.f7534r.f6868c);
        this.f7535s.f6759c = 2;
        this.f7535s.f6771o = true;
        this.f7532l = new C0507i((float) Gdx.graphics.mo294c(), (float) Gdx.graphics.mo295d());
        this.f7524c = new CameraController(this, this.f7532l, this.f7535s.f6766j, this.f7535s.f6767k) {
            /* renamed from: n */
            final /* synthetic */ MapEditorScreen f7454n;
            /* renamed from: o */
            private int f7455o;
            /* renamed from: p */
            private int f7456p;
            /* renamed from: q */
            private int f7457q;
            /* renamed from: r */
            private int f7458r;
            /* renamed from: s */
            private boolean f7459s;
            /* renamed from: t */
            private boolean f7460t;
            /* renamed from: u */
            private C0361a f7461u;

            /* renamed from: a */
            public final boolean mo333a(int i, int i2, int i3) {
                if (this.f7460t) {
                    Vector2 a = this.f7454n.f7523b.m2000a(new Vector2((float) i, (float) i2));
                    MapEditorScreen.m8105a(this.f7454n, a.f2337x, a.f2338y);
                } else if (!this.f7459s && Math.sqrt(Math.pow((double) (this.f7455o - i), 2.0d) + Math.pow((double) (this.f7456p - i2), 2.0d)) > 15.0d) {
                    if (this.f7461u != null) {
                        this.f7461u.m1024a();
                        this.f7461u = null;
                    }
                    super.mo334a(i, i2, this.f7457q, this.f7458r);
                    this.f7459s = true;
                }
                return super.mo333a(i, i2, i3);
            }

            /* renamed from: a */
            public final boolean mo334a(final int i, final int i2, int i3, int i4) {
                Vector2 c = this.f7454n.f7524c.m7424c(i, i2);
                final Tile b = this.f7454n.f7535s.m7527b((int) c.f2337x, (int) c.f2338y);
                if (i3 != 0) {
                    if (this.f7460t) {
                        return true;
                    }
                    if (this.f7461u != null) {
                        this.f7461u.m1024a();
                        this.f7461u = null;
                    }
                }
                for (int i5 = 0; i5 < 4; i5++) {
                    float f = this.f7454n.f7522Z[i5][0];
                    float f2 = this.f7454n.f7522Z[i5][1];
                    float f3 = f + 64.0f;
                    float f4 = f2 + 64.0f;
                    if (c.f2337x >= f && c.f2337x <= f3 && c.f2338y >= f2 && c.f2338y <= f4) {
                        MapEditorScreen.m8106a(this.f7454n, i5);
                        break;
                    }
                }
                if (i3 != 0 || b == null || b.f7960a == TileType.VOID) {
                    this.f7459s = true;
                    return super.mo334a(i, i2, i3, i4);
                }
                this.f7455o = i;
                this.f7456p = i2;
                this.f7457q = i3;
                this.f7458r = i4;
                this.f7460t = false;
                this.f7459s = false;
                this.f7461u = af.m2339a(new C0361a(this) {
                    /* renamed from: h */
                    final /* synthetic */ C11441 f7429h;

                    public void run() {
                        this.f7429h.f7460t = true;
                        this.f7429h.f7454n.m8104a(b.f7963d, b.f7964e, new VoidTile(b.f7963d, b.f7964e));
                        this.f7429h.f7454n.m8110a(b, false, b.f7963d, b.f7964e);
                        Vector2 a = this.f7429h.f7454n.f7523b.m2000a(new Vector2((float) i, (float) i2));
                        MapEditorScreen.m8105a(this.f7429h.f7454n, a.f2337x, a.f2338y);
                    }
                }, 0.3f);
                return true;
            }

            /* renamed from: b */
            public final boolean mo336b(int i, int i2, int i3, int i4) {
                if (this.f7461u != null) {
                    this.f7461u.m1024a();
                    this.f7461u = null;
                }
                if (this.f7460t) {
                    Vector2 a = this.f7454n.f7523b.m2000a(new Vector2((float) i, (float) i2));
                    MapEditorScreen.m8112b(this.f7454n, a.f2337x, a.f2338y);
                    this.f7460t = false;
                }
                return super.mo336b(i, i2, i3, i4);
            }
        };
        this.f7524c.f6477h = 4.0d;
        this.f7524c.m7421b(this.f7535s.f6766j / 2, this.f7535s.f6767k / 2);
        this.f7532l.mo429a();
        C0645h c0645h = new C0645h();
        c0645h.m2192a(Game.game.f6561E);
        C0602b table = new Table();
        table.mo487a(false);
        table.f2677Y = true;
        this.f7523b.m2004a(table);
        final C0430b c0430b = C0430b.f1620c;
        final C0430b c0430b2 = LIGHT_BLUE.f8525f;
        C0602b c0605e = new C0605e();
        c0605e.mo487a(false);
        table.m2059d(c0605e).m2104i().m2098f().m2096e().m2099f(40.0f).m2085a(600.0f, 96.0f);
        C0602b c0625d = new C0625d(c0645h.m2197c("main-menu-icon-money"));
        c0625d.m1935a(0.0f, 0.0f);
        c0625d.m1956c(64.0f, 64.0f);
        c0605e.mo510b(c0625d);
        this.f7506J = new C0629f("0", new C0628a(Game.game.m7465h(48), C0430b.f1620c));
        this.f7506J.m1935a(96.0f, 0.0f);
        c0605e.mo510b(this.f7506J);
        c0625d = new C0625d(c0645h.m2197c("main-menu-icon-materials"));
        c0625d.m1935a(360.0f, 0.0f);
        c0625d.m1956c(64.0f, 64.0f);
        c0605e.mo510b(c0625d);
        this.f7507K = new C0629f("0", new C0628a(Game.game.m7465h(48), C0430b.f1620c));
        this.f7507K.m1935a(456.0f, 0.0f);
        c0605e.mo510b(this.f7507K);
        m8122h();
        c0605e = new C0605e();
        c0605e.mo487a(false);
        table.m2059d(c0605e).m2104i().m2102h().m2096e().m2103h(588.0f).m2097e(32.0f).m2085a(576.0f, 192.0f);
        this.f7501E = new C0605e();
        this.f7501E.m1935a(0.0f, 0.0f);
        this.f7501E.f2611e = false;
        this.f7501E.m1956c(128.0f, 192.0f);
        c0605e.mo510b(this.f7501E);
        this.f7502F = new C0625d(Game.game.f6561E.m1442a("main-menu-icon-global-upgrades"));
        this.f7502F.m1956c(128.0f, 128.0f);
        this.f7502F.m1935a(0.0f, 64.0f);
        this.f7502F.f2610d = Touchable.enabled;
        this.f7501E.mo510b(this.f7502F);
        c0625d = new C0629f(Game.f6551e.m2416a("map_editor_tile_upgrade"), new C0628a(Game.game.m7465h(24), C0430b.f1620c));
        c0625d.m1956c(128.0f, 32.0f);
        c0625d.f2610d = Touchable.disabled;
        c0625d.m2127a(1);
        this.f7501E.mo510b(c0625d);
        this.f7498B = new C0605e();
        this.f7498B.m1935a(256.0f, 0.0f);
        this.f7498B.f2611e = false;
        this.f7498B.m1956c(128.0f, 192.0f);
        this.f7498B.f2610d = Touchable.enabled;
        c0605e.mo510b(this.f7498B);
        this.f7499C = new C0625d(Game.game.f6561E.m1442a("main-menu-icon-break-tile"));
        this.f7499C.m1956c(128.0f, 128.0f);
        this.f7499C.m1935a(0.0f, 64.0f);
        this.f7499C.f2611e = true;
        this.f7498B.mo510b(this.f7499C);
        c0625d = new Table();
        c0625d.m1956c(128.0f, 32.0f);
        this.f7498B.mo510b(c0625d);
        c0625d.m2059d(new C0625d(Game.game.f6561E.m1442a("main-menu-icon-materials"))).m2084a(32.0f).m2103h(16.0f);
        this.f7500D = new C0629f("16", new C0628a(Game.game.m7465h(24), C0430b.f1620c));
        this.f7500D.m1956c(128.0f, 32.0f);
        this.f7500D.f2610d = Touchable.disabled;
        c0625d.m2059d(this.f7500D);
        this.f7541y = new C0605e();
        this.f7541y.m1935a(448.0f, 0.0f);
        this.f7541y.f2611e = false;
        this.f7541y.m1956c(128.0f, 192.0f);
        this.f7541y.f2610d = Touchable.enabled;
        c0605e.mo510b(this.f7541y);
        this.f7542z = new C0625d(Game.game.f6561E.m1442a("main-menu-icon-trash-bin-dollar"));
        this.f7542z.m1956c(128.0f, 128.0f);
        this.f7542z.m1935a(0.0f, 64.0f);
        this.f7542z.f2611e = true;
        this.f7541y.mo510b(this.f7542z);
        c0605e = new Table();
        c0605e.m1956c(128.0f, 32.0f);
        this.f7541y.mo510b(c0605e);
        c0605e.m2059d(new C0625d(Game.game.f6561E.m1442a("main-menu-icon-money"))).m2084a(32.0f).m2103h(16.0f);
        this.f7497A = new C0629f("2000", new C0628a(Game.game.m7465h(24), C0430b.f1620c));
        this.f7497A.m1956c(128.0f, 32.0f);
        this.f7497A.f2610d = Touchable.disabled;
        c0605e.m2059d(this.f7497A);
        table.m2066q();
        this.f7513Q = new Table();
        this.f7513Q.mo487a(false);
        table.m2059d(this.f7513Q).m2104i().m2096e().m2098f().m2086a(2).m2099f(32.0f);
        table.m2066q();
        c0605e = new Table();
        table.m2059d(c0605e).m2100g().m2098f();
        c0625d = new C0625d(Game.game.f6561E.m1442a("main-menu-icon-home"));
        c0625d.f2610d = Touchable.enabled;
        c0605e.m2059d(c0625d).m2084a(128.0f).m2099f(32.0f).m2101g(32.0f);
        c0625d.m1947a(new C0607f(this) {
            /* renamed from: d */
            final /* synthetic */ MapEditorScreen f7475d;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0625d.m1937a(c0430b2);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                this.f7475d.m8120g();
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0625d.m1937a(c0430b);
            }
        });
        c0625d = new C0625d(Game.game.f6561E.m1442a("tile-menu-icon-log"));
        c0625d.f2610d = Touchable.enabled;
        c0605e.m2059d(c0625d).m2084a(96.0f).m2099f(32.0f).m2101g(32.0f);
        c0625d.m1947a(new C0607f(this) {
            /* renamed from: d */
            final /* synthetic */ MapEditorScreen f7479d;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0625d.m1937a(c0430b2);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                this.f7479d.f7515S.f2611e = true;
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0625d.m1937a(c0430b);
            }
        });
        c0605e = new C0625d(Game.game.f6561E.m1442a("main-menu-icon-continue"));
        c0605e.m1956c(128.0f, 128.0f);
        c0605e.f2610d = Touchable.enabled;
        table.m2059d(c0605e).m2103h(588.0f).m2101g(32.0f).m2104i().m2100g().m2102h();
        c0605e.m1947a(new C0607f(this) {
            /* renamed from: d */
            final /* synthetic */ MapEditorScreen f7483d;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0605e.m1937a(c0430b2);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                try {
                    this.f7483d.f7535s.m7530c();
                    this.f7483d.f7534r.m7589d();
                    Game.game.m7466h();
                    Sound.m7569a(Type.CLICK);
                    Game.game.m7447a(this.f7483d.f7534r.f6867b);
                } catch (InvalidMapFormatException e) {
                    Game.game.logger.m7510b("MapEditor", "Unable to start map, reason code: " + e.reason.name());
                    this.f7483d.f7518V = e.invalidTiles;
                    this.f7483d.f7525d.m8212a(Game.f6551e.m2416a("invalid_map_format_hint_" + e.reason.name()));
                }
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0605e.m1937a(c0430b);
            }
        });
        this.f7533q = new C0377g();
        this.f7533q.m1082a(this.f7523b);
        this.f7533q.m1082a(this.f7524c);
        Gdx.input.mo304a(null);
        table = new Table();
        table.mo487a(false);
        table.f2677Y = true;
        this.f7523b.m2004a(table);
        C0602b c0605e2 = new C0605e();
        c0605e2.m1955c(556.0f);
        c0605e2.m1959d(1200.0f);
        table.m2059d(c0605e2).m2104i().m2102h();
        table = new C0625d(Game.game.f6562F);
        table.m1952b(0.0f, 0.0f, 0.0f, 0.85f);
        table.m1956c(556.0f, 1200.0f);
        c0605e2.mo510b(table);
        this.f7540x = new Table();
        this.f7540x.mo487a(false);
        this.f7539w = new C0635g(this.f7540x, new C0634a());
        this.f7539w.m1956c(556.0f, 1200.0f);
        c0605e2.mo510b(this.f7539w);
        m8129f();
        this.f7508L = new C0605e();
        this.f7508L.f2610d = Touchable.childrenOnly;
        this.f7508L.m1956c(0.0f, 0.0f);
        this.f7508L.m1935a(0.0f, 0.0f);
        this.f7508L.f2611e = false;
        this.f7523b.m2004a(this.f7508L);
        this.f7509M = new C11495(this);
        this.f7509M.m1956c(this.f7523b.f2641b.f3056c, this.f7523b.f2641b.f3057d);
        this.f7509M.f2610d = Touchable.enabled;
        this.f7509M.m1947a(new C11506(this));
        this.f7508L.mo510b(this.f7509M);
        table = new Table();
        table.f2677Y = true;
        this.f7508L.mo510b(table);
        c0605e2 = new C0605e();
        c0605e2.m1956c(1040.0f, 808.0f);
        table.m2059d(c0605e2);
        table = new QuadActor(new float[]{0.0f, 0.026f, 0.0f, 0.99f, 1.0f, 1.0f, 1.0f, 0.0f}, new C0430b(0.0f, 0.0f, 0.0f, 0.9f));
        table.m1956c(1040.0f, 808.0f);
        c0605e2.mo510b(table);
        table = new C0605e();
        table.m1956c(128.0f, 128.0f);
        table.m1935a(872.0f, 641.0f);
        table.f2610d = Touchable.enabled;
        c0605e2.mo510b(table);
        table.m1947a(new C11517(this));
        C0602b c0625d2 = new C0625d(c0645h.m2197c("main-menu-icon-times"));
        c0625d2.m1956c(64.0f, 64.0f);
        c0625d2.m1935a(32.0f, 32.0f);
        table.mo510b(c0625d2);
        table = new C0625d(c0645h.m2197c("main-menu-icon-global-upgrades"));
        table.m1956c(64.0f, 64.0f);
        table.m1935a(72.0f, 673.0f);
        table.m1937a(new C0430b(1.0f, 1.0f, 1.0f, 0.56f));
        c0605e2.mo510b(table);
        table = new C0629f(Game.f6551e.m2416a("map_editor_tile_upgrade"), new C0628a(Game.game.m7463g(48), C0430b.f1620c));
        table.m1956c(300.0f, 64.0f);
        table.m1935a(176.0f, 673.0f);
        table.m1937a(new C0430b(1.0f, 1.0f, 1.0f, 0.56f));
        c0605e2.mo510b(table);
        this.f7510N = new C0605e();
        this.f7510N.m1956c(192.0f, 192.0f);
        this.f7510N.m1935a(424.0f, 330.0f);
        c0605e2.mo510b(this.f7510N);
        this.f7514R[0] = new UpgradeMenuButton(this, new float[]{0.0f, 0.0f, 0.0f, 0.955f, 1.0f, 1.0f, 1.0f, 0.0f}, c0645h.m2197c("main-menu-icon-materials")) {
            /* renamed from: a */
            final /* synthetic */ MapEditorScreen f7487a;

            /* renamed from: a */
            public final void mo1790a() {
                MapEditorScreen.m8113b(this.f7487a, 0);
            }
        };
        this.f7514R[0].f7431b.m1935a(73.0f, 440.0f);
        c0605e2.mo510b(this.f7514R[0].f7431b);
        this.f7514R[1] = new UpgradeMenuButton(this, new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.955f, 1.0f, 0.0f}, c0645h.m2197c("main-menu-icon-materials")) {
            /* renamed from: a */
            final /* synthetic */ MapEditorScreen f7488a;

            /* renamed from: a */
            public final void mo1790a() {
                MapEditorScreen.m8113b(this.f7488a, 1);
            }
        };
        this.f7514R[1].f7431b.m1935a(641.0f, 440.0f);
        c0605e2.mo510b(this.f7514R[1].f7431b);
        this.f7514R[2] = new UpgradeMenuButton(this, new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.045f}, c0645h.m2197c("main-menu-icon-materials")) {
            /* renamed from: a */
            final /* synthetic */ MapEditorScreen f7441a;

            /* renamed from: a */
            public final void mo1790a() {
                MapEditorScreen.m8113b(this.f7441a, 2);
            }
        };
        this.f7514R[2].f7431b.m1935a(641.0f, 270.0f);
        c0605e2.mo510b(this.f7514R[2].f7431b);
        this.f7514R[3] = new UpgradeMenuButton(this, new float[]{0.0f, 0.045f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f}, c0645h.m2197c("main-menu-icon-materials")) {
            /* renamed from: a */
            final /* synthetic */ MapEditorScreen f7442a;

            /* renamed from: a */
            public final void mo1790a() {
                MapEditorScreen.m8113b(this.f7442a, 3);
            }
        };
        this.f7514R[3].f7431b.m1935a(73.0f, 270.0f);
        c0605e2.mo510b(this.f7514R[3].f7431b);
        this.f7514R[4] = new UpgradeMenuButton(this, new float[]{0.0f, 0.032f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f}, c0645h.m2197c("main-menu-icon-money")) {
            /* renamed from: a */
            final /* synthetic */ MapEditorScreen f7443a;

            /* renamed from: a */
            public final void mo1790a() {
                MapEditorScreen.m8113b(this.f7443a, 4);
            }
        };
        this.f7514R[4].f7431b.m1935a(357.0f, 85.0f);
        this.f7514R[4].m8065a("LVL 1");
        this.f7514R[4].m8064a(c0645h.m2197c("tower-stat-unique"));
        c0605e2.mo510b(this.f7514R[4].f7431b);
        this.f7511O = new C0605e();
        this.f7511O.f2610d = Touchable.childrenOnly;
        this.f7511O.m1956c(0.0f, 0.0f);
        this.f7511O.m1935a(0.0f, 0.0f);
        this.f7511O.f2611e = false;
        this.f7523b.m2004a(this.f7511O);
        this.f7512P = new C0602b(this) {
            /* renamed from: q */
            final /* synthetic */ MapEditorScreen f7444q;

            {
                this.f7444q = r1;
            }

            /* renamed from: a */
            public final void mo471a(C0444a c0444a, float f) {
                c0444a.mo374c();
                Matrix4 a = Game.game.f6560D.f2112c.m1687a();
                Matrix4 a2 = Game.game.f6560D.f2111b.m1687a();
                Gdx.gl.glEnable(3042);
                Gdx.gl.glBlendFunc(770, 771);
                Game.game.f6560D.m1458a(c0444a.mo378g());
                Game.game.f6560D.m1462b(c0444a.mo379h());
                Game.game.f6560D.m1456a(ShapeType.Filled);
                Game.game.f6560D.m1455a(new C0430b(0.07f, 0.07f, 0.07f, 0.7f));
                Game.game.f6560D.m1460b(this.f2613g, this.f2614h, this.f2615i, this.f2616j);
                Game.game.f6560D.m1451a();
                Game.game.f6560D.m1458a(a2);
                Game.game.f6560D.m1462b(a);
                c0444a.mo365a();
            }
        };
        this.f7512P.m1956c(this.f7523b.f2641b.f3056c, this.f7523b.f2641b.f3057d);
        this.f7512P.f2610d = Touchable.enabled;
        this.f7512P.m1947a(new C0618d(this) {
            /* renamed from: a */
            final /* synthetic */ MapEditorScreen f7445a;

            {
                this.f7445a = r1;
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                MapEditorScreen.m8121g(this.f7445a);
                return true;
            }
        });
        this.f7511O.mo510b(this.f7512P);
        table = new Table();
        table.f2677Y = true;
        this.f7511O.mo510b(table);
        c0605e2 = new C0605e();
        c0605e2.m1956c(1040.0f, 808.0f);
        table.m2059d(c0605e2);
        table = new QuadActor(new float[]{0.0f, 0.026f, 0.0f, 0.99f, 1.0f, 1.0f, 1.0f, 0.0f}, new C0430b(0.0f, 0.0f, 0.0f, 0.9f));
        table.m1956c(1040.0f, 808.0f);
        c0605e2.mo510b(table);
        table = new C0605e();
        table.m1956c(128.0f, 128.0f);
        table.m1935a(872.0f, 641.0f);
        table.f2610d = Touchable.enabled;
        c0605e2.mo510b(table);
        table.m1947a(new C0618d(this) {
            /* renamed from: a */
            final /* synthetic */ MapEditorScreen f7446a;

            {
                this.f7446a = r1;
            }

            /* renamed from: b */
            public final void mo500b() {
                MapEditorScreen.m8121g(this.f7446a);
            }
        });
        c0625d2 = new C0625d(c0645h.m2197c("main-menu-icon-times"));
        c0625d2.m1956c(64.0f, 64.0f);
        c0625d2.m1935a(32.0f, 32.0f);
        table.mo510b(c0625d2);
        table = new C0625d(c0645h.m2197c("icon-filter"));
        table.m1956c(64.0f, 64.0f);
        table.m1935a(72.0f, 673.0f);
        table.m1937a(new C0430b(1.0f, 1.0f, 1.0f, 0.56f));
        c0605e2.mo510b(table);
        table = new C0629f(Game.f6551e.m2416a("map_editor_filter"), new C0628a(Game.game.m7463g(48), C0430b.f1620c));
        table.m1956c(300.0f, 64.0f);
        table.m1935a(176.0f, 673.0f);
        table.m1937a(new C0430b(1.0f, 1.0f, 1.0f, 0.56f));
        c0605e2.mo510b(table);
        ToggleButton toggleButton = new ToggleButton(Game.f6551e.m2416a("enabled"), false, c0645h, new ObjectRetriever<Boolean>(this) {
            /* renamed from: a */
            final /* synthetic */ MapEditorScreen f7447a;

            {
                this.f7447a = r1;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo1711a(Object obj) {
                this.f7447a.f7520X = ((Boolean) obj).booleanValue();
                this.f7447a.m8129f();
            }
        });
        toggleButton.f7610a.m1956c(400.0f, 96.0f);
        toggleButton.f7610a.m1935a(40.0f, 570.0f);
        c0605e2.mo510b(toggleButton.f7610a);
        c0625d2 = new Table();
        c0625d2.m1956c(1000.0f, 560.0f);
        c0625d2.m1935a(20.0f, 30.0f);
        c0605e2.mo510b(c0625d2);
        it = SpaceTileBonus.f7947a.mo548e();
        i3 = 0;
        while (it.hasNext()) {
            final TowerStatType towerStatType = (TowerStatType) it.next();
            TowerStat a2 = TowerStat.m8484a(towerStatType);
            c0625d = new C0605e();
            c0625d2.m2059d(c0625d).m2085a(285.0f, 90.0f).m2095d(4.0f);
            final C0602b quadActor = new QuadActor();
            quadActor.m1952b(1.0f, 1.0f, 1.0f, 0.0f);
            quadActor.m1956c(285.0f, 90.0f);
            c0625d.mo510b(quadActor);
            final C0602b c0629f = new C0629f(Game.f6551e.m2416a(a2.f8099b), new C0628a(Game.game.m7463g(30), C0430b.f1620c));
            c0629f.m1952b(1.0f, 1.0f, 1.0f, 0.42f);
            c0629f.m1956c(250.0f, 90.0f);
            c0629f.m2135h();
            c0629f.m1935a(15.0f, 0.0f);
            c0625d.mo510b(c0629f);
            c0625d.m1947a(new C0618d(this) {
                /* renamed from: h */
                final /* synthetic */ MapEditorScreen f7451h;

                /* renamed from: b */
                public final void mo500b() {
                    this.f7451h.f7521Y[towerStatType.ordinal()] = !this.f7451h.f7521Y[towerStatType.ordinal()];
                    if (this.f7451h.f7521Y[towerStatType.ordinal()]) {
                        quadActor.m1952b(1.0f, 1.0f, 1.0f, 0.07f);
                        c0629f.m1937a((C0430b) SpaceTileBonus.f7949c.m2467a(towerStatType));
                    } else {
                        quadActor.m1952b(1.0f, 1.0f, 1.0f, 0.0f);
                        c0629f.m1952b(1.0f, 1.0f, 1.0f, 0.42f);
                    }
                    this.f7451h.m8129f();
                }
            });
            i2 = i3 + 1;
            if (i2 % 3 == 0) {
                c0625d2.m2066q();
            }
            i3 = i2;
        }
        this.f7515S = new Table();
        this.f7515S.mo487a(false);
        this.f7515S.f2677Y = true;
        this.f7515S.f2611e = false;
        this.f7523b.m2004a(this.f7515S);
        this.f7515S.f2610d = Touchable.enabled;
        this.f7515S.m1947a(new C0618d(this) {
            /* renamed from: a */
            final /* synthetic */ MapEditorScreen f7452a;

            {
                this.f7452a = r1;
            }

            /* renamed from: b */
            public final void mo500b() {
                this.f7452a.f7515S.f2611e = false;
            }
        });
        Pixmap pixmap = new Pixmap(1, 1, Format.RGBA8888);
        C0430b c = Game.f6556q.m1222c();
        c.f1647L = 0.85f;
        pixmap.m1117a(c);
        pixmap.m1111a();
        this.f7515S.m2054a(new C0625d(new Texture(pixmap)).f2802r);
        C0628a c0628a = new C0628a(Game.game.m7465h(36), C0430b.f1620c);
        this.f7515S.m2059d(new C0629f(Game.f6551e.m2416a("map_editor_help_title"), new C0628a(Game.game.m7465h(60), C0430b.f1620c))).m2101g(30.0f).m2106k();
        table = new C0629f(Game.f6551e.m2416a("map_editor_help_message_1"), c0628a);
        table.m2135h();
        this.f7515S.m2059d(table).m2095d(15.0f).m2090b(1200.0f).m2106k();
        table = new C0629f(Game.f6551e.m2416a("map_editor_help_message_2"), c0628a);
        table.m2135h();
        this.f7515S.m2059d(table).m2095d(15.0f).m2090b(1200.0f).m2106k();
        table = new C0629f(Game.f6551e.m2416a("map_editor_help_message_3"), c0628a);
        table.m2135h();
        this.f7515S.m2059d(table).m2095d(15.0f).m2090b(1200.0f).m2106k();
        table = new C0629f(Game.f6551e.m2416a("loading_touchToContinue"), c0628a);
        table.m2135h();
        table.m1937a(LIGHT_BLUE.f8525f);
        this.f7515S.m2059d(table).m2095d(15.0f).m2097e(45.0f).m2090b(1200.0f);
        if (!Game.game.f6564H.m8841b("viewedMapEditorTutorial")) {
            this.f7515S.f2611e = true;
            Game.game.f6564H.m8839b("viewedMapEditorTutorial", "yup!");
            Game.game.f6564H.m8844d();
        }
        this.f7525d = new Dialog(this.f7523b);
    }

    /* renamed from: a */
    private void m8104a(int i, int i2, Tile tile) {
        tile.f7963d = i;
        tile.f7964e = i2;
        tile.m8375c();
        this.f7534r.f6868c[i2][i] = tile;
        this.f7535s.f6760d[i2][i] = tile;
        this.f7535s.f6771o = true;
        this.f7518V = null;
    }

    /* renamed from: a */
    static /* synthetic */ void m8105a(MapEditorScreen mapEditorScreen, float f, float f2) {
        if (mapEditorScreen.f7516T != null) {
            float f3 = 160.0f + f2;
            if (f >= mapEditorScreen.f7523b.f2641b.f3056c) {
                f = mapEditorScreen.f7523b.f2641b.f3056c - 1.0f;
            }
            if (f3 >= mapEditorScreen.f7523b.f2641b.f3057d) {
                f3 = mapEditorScreen.f7523b.f2641b.f3057d - 1.0f;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            Vector2 a = mapEditorScreen.f7539w.m1932a(new Vector2(f, f3));
            float d = (a.f2337x < 0.0f || a.f2337x > mapEditorScreen.f7539w.f2615i || a.f2338y < 0.0f || a.f2338y > mapEditorScreen.f7539w.f2616j) ? (((mapEditorScreen.f7523b.f2641b.f3057d / ((float) Gdx.graphics.mo295d())) * (1.0f / ((float) mapEditorScreen.f7524c.f6471b))) * 0.64f) * 0.9f : 1.0f;
            C0602b c0602b = mapEditorScreen.f7516T;
            c0602b.f2619m = d;
            c0602b.f2620n = d;
            mapEditorScreen.f7516T.m1935a(f - (50.0f * d), f3 - (d * 50.0f));
            Vector2 vector2 = new Vector2((f / mapEditorScreen.f7523b.f2641b.f3056c) * ((float) Gdx.graphics.mo294c()), (1.0f - (f3 / mapEditorScreen.f7523b.f2641b.f3057d)) * ((float) Gdx.graphics.mo295d()));
            a = mapEditorScreen.f7524c.m7424c((int) vector2.f2337x, (int) vector2.f2338y);
            mapEditorScreen.f7503G = false;
            mapEditorScreen.f7504H = false;
            mapEditorScreen.f7505I = false;
            Vector2 a2 = mapEditorScreen.f7541y.m1932a(new Vector2(f, f3));
            vector2 = mapEditorScreen.f7498B.m1932a(new Vector2(f, f3));
            Vector2 a3 = mapEditorScreen.f7501E.m1932a(new Vector2(f, f3));
            if (mapEditorScreen.f7541y.f2611e && a2.f2337x >= 0.0f && a2.f2337x <= mapEditorScreen.f7541y.f2615i && a2.f2338y >= 0.0f && a2.f2338y <= mapEditorScreen.f7541y.f2616j) {
                mapEditorScreen.f7542z.m1937a(RED.f8607d);
                mapEditorScreen.f7517U = null;
                mapEditorScreen.f7503G = true;
            } else if (mapEditorScreen.f7498B.f2611e && vector2.f2337x >= 0.0f && vector2.f2337x <= mapEditorScreen.f7498B.f2615i && vector2.f2338y >= 0.0f && vector2.f2338y <= mapEditorScreen.f7498B.f2616j) {
                mapEditorScreen.f7499C.m1937a(ORANGE.f8565d);
                mapEditorScreen.f7517U = null;
                mapEditorScreen.f7504H = true;
            } else if (!mapEditorScreen.f7501E.f2611e || a3.f2337x < 0.0f || a3.f2337x > mapEditorScreen.f7501E.f2615i || a3.f2338y < 0.0f || a3.f2338y > mapEditorScreen.f7501E.f2616j) {
                int i = ((int) a.f2337x) / 64;
                int i2 = ((int) a.f2338y) / 64;
                if (i < mapEditorScreen.f7537u || i > mapEditorScreen.f7538v || i2 < mapEditorScreen.f7537u || i2 > mapEditorScreen.f7538v) {
                    mapEditorScreen.f7517U = null;
                } else {
                    mapEditorScreen.f7517U = mapEditorScreen.f7535s.m7518a(i, i2);
                }
                mapEditorScreen.f7542z.m1937a(C0430b.f1620c);
                mapEditorScreen.f7499C.m1937a(C0430b.f1620c);
                mapEditorScreen.f7502F.m1937a(C0430b.f1620c);
            } else {
                mapEditorScreen.f7502F.m1937a(GREEN.f8485d);
                mapEditorScreen.f7517U = null;
                mapEditorScreen.f7505I = true;
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m8106a(MapEditorScreen mapEditorScreen, int i) {
        int i2;
        int i3 = 0;
        Gdx.app.log("MapEditor", "shift map " + i);
        C0676a c0676a = new C0676a();
        for (int i4 = 0; i4 < mapEditorScreen.f7535s.f6760d.length; i4++) {
            for (i2 = 0; i2 < mapEditorScreen.f7535s.f6760d.length; i2++) {
                if (mapEditorScreen.f7535s.f6760d[i4][i2].f7960a != TileType.VOID) {
                    c0676a.m2296a(mapEditorScreen.f7535s.f6760d[i4][i2]);
                    mapEditorScreen.f7535s.f6760d[i4][i2] = new VoidTile(i2, i4);
                }
            }
        }
        i2 = i == 0 ? -1 : i == 2 ? 1 : 0;
        if (i == 3) {
            i3 = -1;
        } else if (i == 1) {
            i3 = 1;
        }
        Iterator it = c0676a.iterator();
        while (it.hasNext()) {
            Tile tile = (Tile) it.next();
            tile.f7963d += i2;
            tile.f7964e += i3;
            if (tile.f7963d >= mapEditorScreen.f7537u && tile.f7963d <= mapEditorScreen.f7538v && tile.f7964e >= mapEditorScreen.f7537u && tile.f7964e <= mapEditorScreen.f7538v) {
                mapEditorScreen.m8104a(tile.f7963d, tile.f7964e, tile);
            } else if (tile.f7960a != TileType.VOID) {
                mapEditorScreen.f7526e.m8358a(tile, 1);
            }
        }
        mapEditorScreen.m8129f();
        mapEditorScreen.f7535s.f6771o = true;
    }

    /* renamed from: a */
    private void m8109a(Tile tile) {
        this.f7519W = tile;
        this.f7508L.f2611e = true;
        C0602b a = Tile.m8365a(tile, 192);
        this.f7510N.mo475c();
        this.f7510N.mo510b(a);
        if (tile.f7960a == TileType.SPACE) {
            int i;
            SpaceTile spaceTile = (SpaceTile) tile;
            for (int i2 = 0; i2 < 4; i2++) {
                SpaceTileBonus spaceTileBonus = spaceTile.f7991s[i2];
                if (spaceTileBonus != null) {
                    this.f7514R[i2].m8066a(true);
                    this.f7514R[i2].m8064a(TowerStat.m8484a(spaceTileBonus.f7950d).f8102e);
                    if (spaceTileBonus.f7951e < 3) {
                        this.f7514R[i2].m8065a(TowerStat.m8484a(spaceTileBonus.f7950d).m8488c());
                        i = spaceTileBonus.f7951e == 1 ? 16 : spaceTileBonus.f7951e == 2 ? 32 : 0;
                        this.f7514R[i2].m8063a(i);
                        if (Game.game.f6591x.m8800a() < i) {
                            this.f7514R[i2].m8067b(false);
                            this.f7514R[i2].m8068c(false);
                        } else {
                            this.f7514R[i2].m8067b(true);
                            this.f7514R[i2].m8068c(true);
                        }
                    } else {
                        this.f7514R[i2].m8065a(TowerStat.m8484a(spaceTileBonus.f7950d).m8488c());
                        this.f7514R[i2].m8067b(false);
                        this.f7514R[i2].m8063a(0);
                    }
                } else {
                    this.f7514R[i2].m8066a(false);
                }
            }
            if (spaceTile.f7992t < 3) {
                if (spaceTile.f7992t == 0) {
                    this.f7514R[4].m8065a("LVL 1");
                    i = 2000;
                } else if (spaceTile.f7992t == 1) {
                    this.f7514R[4].m8065a("LVL 2");
                    i = 5000;
                } else if (spaceTile.f7992t == 2) {
                    this.f7514R[4].m8065a("LVL 3");
                    i = 15000;
                } else {
                    i = 0;
                }
                this.f7514R[4].m8063a(i);
                if (Game.game.f6590w.m8800a() < i) {
                    this.f7514R[4].m8067b(false);
                    this.f7514R[4].m8068c(false);
                    return;
                }
                this.f7514R[4].m8067b(true);
                this.f7514R[4].m8068c(true);
                return;
            }
            this.f7514R[4].m8065a("MAX LVL");
            this.f7514R[4].m8067b(false);
            this.f7514R[4].m8063a(0);
        }
    }

    /* renamed from: a */
    private void m8110a(Tile tile, boolean z, int i, int i2) {
        Tile tile2 = tile;
        while (tile2 != null) {
            if (this.f7527f != null) {
                tile2 = null;
            } else {
                int i3;
                this.f7516T = new C0605e();
                this.f7516T.f2610d = Touchable.disabled;
                this.f7523b.m2004a(this.f7516T);
                C0602b c0625d = new C0625d(Game.game.f6561E.m1442a("map-editor-dragging-tile-shadow"));
                c0625d.m1956c(112.0f, 112.0f);
                c0625d.m1935a(-6.0f, -7.0f);
                this.f7516T.mo510b(c0625d);
                this.f7516T.mo510b(Tile.m8365a(tile2, 100));
                this.f7527f = tile2.mo1808b();
                this.f7528g = z;
                this.f7529h = i;
                this.f7530i = i2;
                if (tile2.f7960a == TileType.SPACE) {
                    SpaceTile spaceTile = (SpaceTile) tile2;
                    this.f7513Q.mo475c();
                    for (i3 = 0; i3 < 4; i3++) {
                        SpaceTileBonus spaceTileBonus = spaceTile.f7991s[i3];
                        if (!(spaceTileBonus == null || spaceTileBonus.f7951e == 0)) {
                            C0602b c0629f = new C0629f(TowerStat.m8484a(spaceTileBonus.f7950d).m8487b() + " " + spaceTileBonus.f7951e + " (" + ((int) (spaceTileBonus.m8361a() * 100.0f)) + "%)", new C0628a(Game.game.m7465h(30), C0430b.f1620c));
                            c0629f.m2127a(8);
                            c0629f.m1937a(spaceTileBonus.m8362b());
                            this.f7513Q.m2059d(c0629f).m2098f().m2097e(8.0f).m2101g(8.0f);
                            this.f7513Q.m2066q();
                        }
                    }
                    this.f7513Q.f2611e = true;
                }
                if (f7492j.m2490c(tile2.f7960a)) {
                    int i4;
                    Iterator it = Inventory.m8354a().f7942a.iterator();
                    i3 = 0;
                    while (it.hasNext()) {
                        Stack stack = (Stack) it.next();
                        if (stack.f7944a.f7960a == tile2.f7960a) {
                            i4 = stack.f7945b + i3;
                            if (i4 >= 2) {
                                break;
                            }
                        } else {
                            i4 = i3;
                        }
                        i3 = i4;
                    }
                    i4 = i3;
                    if (i4 >= 2) {
                        this.f7541y.f2611e = true;
                        this.f7542z.m1937a(C0430b.f1620c);
                        this.f7497A.m2130a(tile2.mo1801e());
                        this.f7498B.f2611e = true;
                        this.f7499C.m1937a(C0430b.f1620c);
                        this.f7500D.m2130a(tile2.mo1802f());
                    }
                } else {
                    this.f7541y.f2611e = true;
                    this.f7542z.m1937a(C0430b.f1620c);
                    this.f7497A.m2130a(tile2.mo1801e());
                    this.f7498B.f2611e = true;
                    this.f7499C.m1937a(C0430b.f1620c);
                    this.f7500D.m2130a(tile2.mo1802f());
                }
                if (tile2.mo1810g()) {
                    this.f7501E.f2611e = true;
                    this.f7502F.m1937a(C0430b.f1620c);
                }
                Sound.m7569a(Type.CLICK);
                this.f7517U = null;
            }
        }
        if (this.f7516T != null) {
            this.f7516T.m1943a();
        }
        this.f7527f = null;
        this.f7541y.f2611e = false;
        this.f7498B.f2611e = false;
        this.f7501E.f2611e = false;
        this.f7513Q.f2611e = false;
        this.f7517U = null;
    }

    /* renamed from: b */
    static /* synthetic */ void m8112b(MapEditorScreen mapEditorScreen, float f, float f2) {
        int i = 1;
        if (mapEditorScreen.f7527f != null) {
            int i2;
            int i3;
            int i4;
            int i5;
            float f3 = 160.0f + f2;
            if (f >= mapEditorScreen.f7523b.f2641b.f3056c) {
                f = mapEditorScreen.f7523b.f2641b.f3056c - 1.0f;
            }
            if (f3 >= mapEditorScreen.f7523b.f2641b.f3057d) {
                f3 = mapEditorScreen.f7523b.f2641b.f3057d - 1.0f;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            Vector2 a = mapEditorScreen.f7539w.m1932a(new Vector2(f, f3));
            if (a.f2337x < 0.0f || a.f2337x > mapEditorScreen.f7539w.f2615i || a.f2338y < 0.0f || a.f2338y > mapEditorScreen.f7539w.f2616j) {
                i2 = 0;
                i3 = 0;
            } else {
                mapEditorScreen.f7526e.m8358a(mapEditorScreen.f7527f, 1);
                i2 = 1;
                i3 = 1;
            }
            if (mapEditorScreen.f7503G) {
                Game.game.m7454b(mapEditorScreen.f7527f.mo1801e());
                Sound.m7568a(0.0f, 1.0f);
                Inventory.m8354a().m8359a(mapEditorScreen.f7527f);
                Inventory.m8354a().m8360b();
                mapEditorScreen.m8122h();
                i3 = 1;
            } else if (mapEditorScreen.f7504H) {
                Game.game.m7461e(mapEditorScreen.f7527f.mo1802f());
                Sound.m7569a(Type.BUILD);
                Inventory.m8354a().m8359a(mapEditorScreen.f7527f);
                Inventory.m8354a().m8360b();
                mapEditorScreen.m8122h();
                i3 = 1;
            } else if (mapEditorScreen.f7505I) {
                mapEditorScreen.m8109a(mapEditorScreen.f7527f);
                mapEditorScreen.f7526e.m8358a(mapEditorScreen.f7527f, 1);
                i2 = 1;
                i3 = 1;
            }
            if (i3 == 0) {
                Vector2 vector2 = new Vector2((f / mapEditorScreen.f7523b.f2641b.f3056c) * ((float) Gdx.graphics.mo294c()), (1.0f - (f3 / mapEditorScreen.f7523b.f2641b.f3057d)) * ((float) Gdx.graphics.mo295d()));
                Vector2 c = mapEditorScreen.f7524c.m7424c((int) vector2.f2337x, (int) vector2.f2338y);
                int i6 = ((int) c.f2337x) / 64;
                i4 = ((int) c.f2338y) / 64;
                if (i6 >= mapEditorScreen.f7537u && i6 <= mapEditorScreen.f7538v && i4 >= mapEditorScreen.f7537u && i4 <= mapEditorScreen.f7538v) {
                    Tile tile = mapEditorScreen.f7534r.f6868c[i4][i6];
                    Sound.m7570a(Type.BUILD, 1.0f, 0.0f);
                    mapEditorScreen.m8104a(i6, i4, mapEditorScreen.f7527f);
                    if (!(tile == null || tile.f7960a == TileType.VOID)) {
                        if (mapEditorScreen.f7528g) {
                            mapEditorScreen.f7526e.m8358a(tile, 1);
                            i4 = 1;
                            i5 = 1;
                            if (i5 == 0) {
                                if (mapEditorScreen.f7528g) {
                                    mapEditorScreen.f7526e.m8358a(mapEditorScreen.f7527f, 1);
                                } else {
                                    mapEditorScreen.m8104a(mapEditorScreen.f7529h, mapEditorScreen.f7530i, mapEditorScreen.f7527f);
                                    i = i4;
                                }
                            } else if (!mapEditorScreen.f7528g) {
                                i = i4;
                            }
                            if (i != 0) {
                                mapEditorScreen.m8129f();
                            }
                            mapEditorScreen.m8110a(null, false, 0, 0);
                        }
                        mapEditorScreen.m8104a(mapEditorScreen.f7529h, mapEditorScreen.f7530i, tile);
                    }
                    i4 = i2;
                    i5 = 1;
                    if (i5 == 0) {
                        if (mapEditorScreen.f7528g) {
                            i = i4;
                        }
                    } else if (mapEditorScreen.f7528g) {
                        mapEditorScreen.m8104a(mapEditorScreen.f7529h, mapEditorScreen.f7530i, mapEditorScreen.f7527f);
                        i = i4;
                    } else {
                        mapEditorScreen.f7526e.m8358a(mapEditorScreen.f7527f, 1);
                    }
                    if (i != 0) {
                        mapEditorScreen.m8129f();
                    }
                    mapEditorScreen.m8110a(null, false, 0, 0);
                }
            }
            i4 = i2;
            i5 = i3;
            if (i5 == 0) {
                if (mapEditorScreen.f7528g) {
                    mapEditorScreen.f7526e.m8358a(mapEditorScreen.f7527f, 1);
                } else {
                    mapEditorScreen.m8104a(mapEditorScreen.f7529h, mapEditorScreen.f7530i, mapEditorScreen.f7527f);
                    i = i4;
                }
            } else if (mapEditorScreen.f7528g) {
                i = i4;
            }
            if (i != 0) {
                mapEditorScreen.m8129f();
            }
            mapEditorScreen.m8110a(null, false, 0, 0);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m8113b(MapEditorScreen mapEditorScreen, int i) {
        int i2 = 0;
        if (mapEditorScreen.f7519W.f7960a == TileType.SPACE) {
            SpaceTile spaceTile = (SpaceTile) mapEditorScreen.f7519W;
            Tile tile;
            if (i < 4) {
                SpaceTileBonus spaceTileBonus = spaceTile.f7991s[i];
                if (spaceTileBonus != null && spaceTileBonus.f7951e > 0 && spaceTileBonus.f7951e < 3) {
                    int i3 = spaceTileBonus.f7951e == 1 ? 16 : spaceTileBonus.f7951e == 2 ? 32 : 0;
                    Game game = Game.game;
                    int a = game.f6591x.m8800a();
                    if (a >= i3) {
                        game.m7459d(a - i3);
                        i2 = 1;
                    }
                    if (i2 != 0 && Inventory.m8354a().m8359a(mapEditorScreen.f7519W)) {
                        mapEditorScreen.f7526e.m8359a(mapEditorScreen.f7519W);
                        tile = (SpaceTile) spaceTile.mo1808b();
                        spaceTileBonus = tile.f7991s[i];
                        spaceTileBonus.f7951e++;
                        Inventory.m8354a().m8358a(tile, 1);
                        Inventory.m8354a().m8360b();
                        mapEditorScreen.f7526e.m8358a(tile, 1);
                        mapEditorScreen.m8129f();
                        mapEditorScreen.m8109a(tile);
                        mapEditorScreen.m8122h();
                        Sound.m7569a(Type.UPGRADE);
                    }
                }
            } else if (spaceTile.f7992t < 3) {
                if (spaceTile.f7992t == 0) {
                    i2 = 2000;
                } else if (spaceTile.f7992t == 1) {
                    i2 = 5000;
                } else if (spaceTile.f7992t == 2) {
                    i2 = 15000;
                }
                if (Game.game.m7457c(i2) && Inventory.m8354a().m8359a(mapEditorScreen.f7519W)) {
                    mapEditorScreen.f7526e.m8359a(mapEditorScreen.f7519W);
                    tile = (SpaceTile) spaceTile.mo1808b();
                    tile.f7992t++;
                    Inventory.m8354a().m8358a(tile, 1);
                    Inventory.m8354a().m8360b();
                    mapEditorScreen.f7526e.m8358a(tile, 1);
                    mapEditorScreen.m8129f();
                    mapEditorScreen.m8109a(tile);
                    mapEditorScreen.m8122h();
                    Sound.m7569a(Type.UPGRADE);
                }
            }
        }
    }

    /* renamed from: e */
    public static void m8118e() {
        f7493m = Game.game.f6561E.m1442a("tile-outline-active");
        f7494n = Game.game.f6561E.m1442a("tile-outline-hover");
        f7495o = Game.game.f6561E.m1442a("icon-triangle-left");
        f7496p = Game.game.f6561E.m1442a("icon-filter");
    }

    /* renamed from: f */
    static /* synthetic */ void m8119f(MapEditorScreen mapEditorScreen) {
        mapEditorScreen.f7508L.f2611e = false;
        mapEditorScreen.f7519W = null;
    }

    /* renamed from: g */
    private void m8120g() {
        this.f7534r.m7589d();
        Game.game.m7466h();
        Sound.m7569a(Type.NO);
        Game.game.m7471n();
    }

    /* renamed from: g */
    static /* synthetic */ void m8121g(MapEditorScreen mapEditorScreen) {
        mapEditorScreen.f7511O.f2611e = false;
        mapEditorScreen.m8129f();
    }

    /* renamed from: h */
    private void m8122h() {
        this.f7507K.m2130a(Game.game.f6591x.m8800a());
        this.f7506J.m2130a(Game.game.f6590w.m8800a());
    }

    /* renamed from: a */
    public final void resize(int i, int i2) {
        super.resize(i, i2);
        this.f7524c.m7414a();
        this.f7531k.f3064a = 1200.0f / ((float) Gdx.graphics.mo295d());
        this.f7531k.mo522a(i, i2);
        int i3 = (int) ((1200.0f / ((float) i2)) * ((float) i));
        this.f7508L.m1956c((float) i3, 1200.0f);
        this.f7509M.m1956c((float) i3, 1200.0f);
        this.f7511O.m1956c((float) i3, 1200.0f);
        this.f7512P.m1956c((float) i3, 1200.0f);
    }

    /* renamed from: b */
    public final void mo1781b(float f) {
        if (Gdx.input.mo307b(4) || Gdx.input.mo307b(131)) {
            m8120g();
            return;
        }
        this.a.f6559C.m1410a(C0430b.f1620c);
        this.f7532l.mo429a();
        this.a.f6559C.mo372a(this.f7532l.f);
        this.a.f6560D.m1458a(this.f7532l.f);
        ((C0475a) this.a.f6561E.f2087c.m2291a(0)).f1686z.m1129b(TextureFilter.MipMapLinearNearest, TextureFilter.Linear);
        Game.game.f6560D.m1456a(ShapeType.Filled);
        Game.game.f6560D.m1455a(new C0430b(572662527));
        Game.game.f6560D.m1460b((float) ((this.f7537u * 64) - 2), (float) ((this.f7537u * 64) - 2), (float) ((((this.f7538v - this.f7537u) + 1) * 64) + 5), (float) ((((this.f7538v - this.f7537u) + 1) * 64) + 5));
        Game.game.f6560D.m1455a(new C0430b(235802367));
        Game.game.f6560D.m1460b((float) (this.f7537u * 64), (float) (this.f7537u * 64), (float) ((((this.f7538v - this.f7537u) + 1) * 64) + 1), (float) ((((this.f7538v - this.f7537u) + 1) * 64) + 1));
        Game.game.f6560D.m1451a();
        this.a.f6559C.mo365a();
        this.a.f6559C.m1410a(LIGHT_BLUE.f8527h);
        int i = 0;
        while (i < 4) {
            C0473l c0473l = this.a.f6559C;
            C0438n c0438n = f7495o;
            float f2 = this.f7522Z[i][0];
            float f3 = this.f7522Z[i][1];
            float f4 = this.f7522Z[i][2];
            if (c0473l.f2025g) {
                float f5;
                float f6;
                float f7;
                float f8;
                float f9;
                float[] fArr = c0473l.f2020b;
                Texture texture = c0438n.f1686z;
                if (texture != c0473l.f2022d) {
                    c0473l.m1406a(texture);
                } else if (c0473l.f2021c == fArr.length) {
                    c0473l.mo377f();
                }
                float f10 = f2 + 32.0f;
                float f11 = f3 + 32.0f;
                if (f4 != 0.0f) {
                    f2 = C0549f.m1771d(f4);
                    f3 = C0549f.m1769c(f4);
                    f5 = (-32.0f * f2) - (-32.0f * f3);
                    f6 = (-32.0f * f3) + (-32.0f * f2);
                    f7 = (-32.0f * f2) - (32.0f * f3);
                    f8 = (32.0f * f2) + (-32.0f * f3);
                    f4 = (32.0f * f2) - (32.0f * f3);
                    f9 = (f3 * 32.0f) + (f2 * 32.0f);
                    f3 = f5 + (f4 - f7);
                    f2 = f9 - (f8 - f6);
                } else {
                    f5 = -32.0f;
                    f6 = -32.0f;
                    f7 = -32.0f;
                    f8 = 32.0f;
                    f4 = 32.0f;
                    f9 = 32.0f;
                    f3 = 32.0f;
                    f2 = -32.0f;
                }
                f5 += f10;
                f6 += f11;
                f7 += f10;
                f8 += f11;
                f4 += f10;
                f9 += f11;
                f3 += f10;
                f2 += f11;
                f10 = c0438n.f1680A;
                f11 = c0438n.f1681B;
                float f12 = c0438n.f1682C;
                float f13 = c0438n.f1681B;
                float f14 = c0438n.f1682C;
                float f15 = c0438n.f1683D;
                float f16 = c0438n.f1680A;
                float f17 = c0438n.f1683D;
                float f18 = c0473l.f2028j;
                int i2 = c0473l.f2021c;
                fArr[i2] = f5;
                fArr[i2 + 1] = f6;
                fArr[i2 + 2] = f18;
                fArr[i2 + 3] = f10;
                fArr[i2 + 4] = f11;
                fArr[i2 + 5] = f7;
                fArr[i2 + 6] = f8;
                fArr[i2 + 7] = f18;
                fArr[i2 + 8] = f12;
                fArr[i2 + 9] = f13;
                fArr[i2 + 10] = f4;
                fArr[i2 + 11] = f9;
                fArr[i2 + 12] = f18;
                fArr[i2 + 13] = f14;
                fArr[i2 + 14] = f15;
                fArr[i2 + 15] = f3;
                fArr[i2 + 16] = f2;
                fArr[i2 + 17] = f18;
                fArr[i2 + 18] = f16;
                fArr[i2 + 19] = f17;
                c0473l.f2021c = i2 + 20;
                i++;
            } else {
                throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
            }
        }
        this.a.f6559C.m1410a(C0430b.f1620c);
        this.a.f6559C.mo374c();
        this.f7535s.m7528b();
        if (this.f7517U != null) {
            this.a.f6559C.mo365a();
            this.a.f6559C.m1411a(f7493m, ((float) this.f7517U.f7968i) - 3.0f, ((float) this.f7517U.f7970k) - 3.0f);
            this.a.f6559C.mo374c();
        }
        if (this.f7518V != null) {
            this.a.f6559C.mo365a();
            this.a.f6559C.m1410a(RED.f8607d.m1222c().m1219a(RED.f8612i, (float) Math.sin((double) (((float) (Game.game.m7478u() / 1000)) / 100.0f))));
            Iterator it = this.f7518V.iterator();
            while (it.hasNext()) {
                Tile tile = (Tile) it.next();
                this.a.f6559C.m1411a(f7494n, ((float) tile.f7968i) - 3.0f, ((float) tile.f7970k) - 3.0f);
            }
            this.a.f6559C.mo374c();
        }
        ((C0475a) this.a.f6561E.f2087c.m2291a(0)).f1686z.m1129b(TextureFilter.MipMapLinearNearest, TextureFilter.Linear);
        this.f7523b.m2002a(f);
        this.f7523b.m2001a();
    }

    /* renamed from: d */
    public final void mo1778d() {
        super.mo1778d();
        this.f7523b.dispose();
    }

    /* renamed from: f */
    public final void m8129f() {
        this.f7540x.mo475c();
        C0628a c0628a = new C0628a(Game.game.m7463g(36), new C0430b(1431655935));
        C0628a c0628a2 = new C0628a(Game.game.m7465h(36), C0430b.f1620c);
        C0628a c0628a3 = new C0628a(Game.game.m7465h(30), C0430b.f1620c);
        C0628a c0628a4 = new C0628a(Game.game.m7465h(36), C0430b.f1620c);
        final C0430b c0430b = new C0430b(22518528);
        final C0430b c0430b2 = new C0430b(22518647);
        final C0430b c0430b3 = new C0430b(22518698);
        TileType[] tileTypeArr = new TileType[]{TileType.SPAWN, TileType.TARGET, TileType.ROAD, TileType.SPACE};
        C0602b c0605e = new C0605e();
        C0602b c0625d = new C0625d(new C0663k(f7496p));
        c0625d.m1956c(48.0f, 48.0f);
        c0625d.m1935a(40.0f, 16.0f);
        if (this.f7520X) {
            c0625d.m1937a(LIGHT_GREEN.f8539f);
            c0625d.m1940a(C0587a.m1884a(C0587a.m1885a(C0587a.m1882a(LIGHT_GREEN.f8542i), C0587a.m1882a(LIGHT_GREEN.f8538e))));
        } else {
            c0625d.m1937a(C0430b.f1620c);
        }
        c0625d.m1947a(new C0618d(this) {
            /* renamed from: a */
            final /* synthetic */ MapEditorScreen f7453a;

            {
                this.f7453a = r1;
            }

            /* renamed from: b */
            public final void mo500b() {
                this.f7453a.f7511O.f2611e = true;
            }
        });
        c0605e.mo510b(c0625d);
        c0625d = new C0629f(Game.f6551e.m2416a("inventory"), new C0628a(Game.game.m7463g(60), new C0430b(1431655935)));
        c0625d.m1935a(132.0f, 0.0f);
        c0605e.mo510b(c0625d);
        this.f7540x.m2059d(c0605e).m2090b(556.0f).m2093c(96.0f).m2097e(25.0f);
        this.f7540x.m2066q();
        Inventory inventory = this.f7526e;
        C0710q c0710q = new C0710q();
        Iterator it = inventory.f7942a.iterator();
        while (it.hasNext()) {
            Object obj = (Stack) it.next();
            if (!c0710q.m2474c(obj.f7944a.f7960a)) {
                c0710q.mo542a(obj.f7944a.f7960a, new C0676a());
            }
            ((C0676a) c0710q.m2467a(obj.f7944a.f7960a)).m2296a(obj);
        }
        Iterator b = c0710q.mo544b();
        while (b.hasNext()) {
            C0707b c0707b = (C0707b) b.next();
            for (int i = 0; i < ((C0676a) c0707b.f3164b).f3001b; i++) {
                for (int i2 = i + 1; i2 < ((C0676a) c0707b.f3164b).f3001b; i2++) {
                    if (((Stack) ((C0676a) c0707b.f3164b).m2291a(i)).f7944a.mo1809d() < ((Stack) ((C0676a) c0707b.f3164b).m2291a(i2)).f7944a.mo1809d()) {
                        ((C0676a) c0707b.f3164b).mo524a(i, i2);
                    }
                }
            }
        }
        for (int i3 = 0; i3 < 4; i3++) {
            TileType tileType = tileTypeArr[i3];
            if (c0710q.m2474c((Object) tileType) && (!this.f7520X || tileType == TileType.SPACE)) {
                c0605e = new Table();
                c0605e.mo487a(false);
                c0625d = new C0629f(Tile.m8368a(tileType), c0628a);
                c0625d.m2127a(8);
                c0605e.m2059d(c0625d).m2103h(25.0f);
                c0625d = new C0625d(Game.game.f6562F);
                c0625d.m1952b(1.0f, 1.0f, 1.0f, 0.25f);
                c0605e.m2059d(c0625d).m2105j().m2094d().m2093c(3.0f);
                this.f7540x.m2059d(c0605e).m2090b(506.0f).m2093c(64.0f);
                this.f7540x.m2066q();
                Iterator it2 = ((C0676a) c0710q.m2467a((Object) tileType)).iterator();
                while (it2.hasNext()) {
                    final Stack stack = (Stack) it2.next();
                    if (this.f7520X) {
                        Object obj2;
                        for (SpaceTileBonus spaceTileBonus : ((SpaceTile) stack.f7944a).f7991s) {
                            if (spaceTileBonus != null && this.f7521Y[spaceTileBonus.f7950d.ordinal()]) {
                                obj2 = 1;
                                break;
                            }
                        }
                        obj2 = null;
                        if (obj2 == null) {
                        }
                    }
                    C0602b c0605e2 = new C0605e();
                    final C0602b c0625d2 = new C0625d(Game.game.f6562F);
                    c0625d2.m1956c(556.0f, 105.0f);
                    c0625d2.m1935a(-25.0f, -2.0f);
                    c0625d2.m1937a(c0430b);
                    c0605e2.mo510b(c0625d2);
                    C0602b table = new Table();
                    table.f2677Y = true;
                    table.mo487a(false);
                    c0605e = Tile.m8365a(stack.f7944a, 100);
                    table.m2059d(c0605e).m2084a(100.0f).m2098f().m2103h(25.0f);
                    c0625d = new C0629f("x" + stack.f7945b, c0628a4);
                    c0625d.m2127a(1);
                    c0625d.m1935a(70.0f, -3.0f);
                    c0625d.m1955c(50.0f);
                    c0605e.mo510b(c0625d);
                    if (tileType == TileType.ROAD) {
                        c0605e = new C0629f("-", c0628a2);
                        c0605e.m2127a(8);
                        table.m2059d(c0605e).m2105j().m2094d();
                    } else if (tileType == TileType.SPAWN) {
                        c0625d = new C0629f(Game.f6551e.m2416a("difficulty") + ": " + Math.round(((SpawnTile) stack.f7944a).f7995t * 100.0f) + "%", c0628a2);
                        c0625d.m2127a(8);
                        table.m2059d(c0625d).m2105j().m2094d();
                    } else if (tileType == TileType.TARGET) {
                        c0605e = new C0629f("-", c0628a2);
                        c0605e.m2127a(8);
                        table.m2059d(c0605e).m2105j().m2094d();
                    } else if (tileType == TileType.SPACE) {
                        C0602b table2 = new Table();
                        table.m2059d(table2).m2105j().m2094d();
                        SpaceTileBonus[] spaceTileBonusArr = ((SpaceTile) stack.f7944a).f7991s;
                        int i4 = 0;
                        while (i4 < 4) {
                            if (!(spaceTileBonusArr[i4] == null || spaceTileBonusArr[i4].f7951e == 0)) {
                                TowerStat a = TowerStat.m8484a(spaceTileBonusArr[i4].f7950d);
                                int i5 = spaceTileBonusArr[i4].f7951e;
                                CharSequence a2 = Game.f6551e.m2416a(a.f8098a);
                                if (i5 == 1) {
                                    a2 = a2 + " I";
                                } else if (i5 == 2) {
                                    a2 = a2 + " II";
                                } else if (i5 == 3) {
                                    a2 = a2 + " III";
                                }
                                C0602b c0629f = new C0629f(a2, c0628a3);
                                c0629f.m2127a(8);
                                c0629f.m1937a(spaceTileBonusArr[i4].m8362b());
                                table2.m2059d(c0629f).m2090b(190.0f).m2104i().m2098f();
                            }
                            if (i4 == 1) {
                                table2.m2066q();
                            }
                            i4++;
                        }
                    }
                    c0605e2.mo510b(table);
                    c0605e2.f2610d = Touchable.enabled;
                    c0605e2.m1947a(new C0607f(this) {
                        /* renamed from: f */
                        final /* synthetic */ MapEditorScreen f7469f;
                        /* renamed from: g */
                        private C0361a f7470g;
                        /* renamed from: h */
                        private boolean f7471h;

                        /* renamed from: a */
                        public final void mo496a(InputEvent inputEvent, float f, float f2, int i) {
                            if (this.f7471h) {
                                MapEditorScreen.m8105a(this.f7469f, inputEvent.f2560j, inputEvent.f2561k);
                            }
                        }

                        /* renamed from: a */
                        public final boolean mo497a(final InputEvent inputEvent, float f, float f2, int i, int i2) {
                            c0625d2.m1940a(C0587a.m1882a(c0430b2));
                            this.f7471h = false;
                            this.f7470g = af.m2339a(new C0361a(this) {
                                /* renamed from: f */
                                final /* synthetic */ AnonymousClass20 f7463f;

                                public void run() {
                                    this.f7463f.f7471h = true;
                                    c0625d2.m1949b();
                                    c0625d2.m1937a(c0430b3);
                                    this.f7463f.f7469f.f7539w.m2168p();
                                    if (!this.f7463f.f7469f.f7526e.m8359a(stack.f7944a)) {
                                        Game.game.logger.m7510b("MapEditor", "Dragged tile not exists in inventory");
                                    }
                                    this.f7463f.f7469f.m8110a(stack.f7944a, true, 0, 0);
                                    MapEditorScreen.m8105a(this.f7463f.f7469f, inputEvent.f2560j, inputEvent.f2561k);
                                }
                            }, 0.3f);
                            return true;
                        }

                        /* renamed from: b */
                        public final void mo499b(InputEvent inputEvent, float f, float f2, int i, int i2) {
                            c0625d2.m1949b();
                            c0625d2.m1937a(c0430b);
                            if (this.f7471h) {
                                MapEditorScreen.m8112b(this.f7469f, inputEvent.f2560j, inputEvent.f2561k);
                            }
                            if (this.f7470g != null) {
                                this.f7470g.m1024a();
                            }
                        }
                    });
                    this.f7540x.m2059d(c0605e2).m2090b(506.0f).m2093c(100.0f).m2101g(6.0f).m2097e(4.0f);
                    this.f7540x.m2066q();
                }
            }
        }
    }

    public final void j_() {
        GlobalUpgrade.m7491a(FilteringMode.NONE, null);
        Gdx.input.mo304a(this.f7533q);
    }
}
