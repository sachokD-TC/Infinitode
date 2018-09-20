package com.prineside.tdi.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.C0607f;
import com.badlogic.gdx.scenes.scene2d.C0609g;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.C0625d;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f.C0628a;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.p034b.C0684b;
import com.prineside.tdi.Game;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgrade.FilteringMode;
import com.prineside.tdi.Map;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.UserMap;
import com.prineside.tdi.exceptions.InvalidMapFormatException;
import com.prineside.tdi.screens.components.Dialog;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.tiles.Tile.TileType;
import com.prineside.tdi.utility.MaterialColor.GREEN;
import com.prineside.tdi.utility.MaterialColor.GREY;
import com.prineside.tdi.utility.MaterialColor.LIGHT_BLUE;
import com.prineside.tdi.utility.MaterialColor.RED;

public class MapEditorMapSelectScreen extends AbstractScreen {
    /* renamed from: b */
    public final C0609g f7422b = new C0609g(this.f7424d);
    /* renamed from: c */
    public Dialog f7423c;
    /* renamed from: d */
    private final C0684b f7424d = new C0684b();
    /* renamed from: e */
    private Pixmap[] f7425e = new Pixmap[3];

    public MapEditorMapSelectScreen() {
        C0628a c0628a = new C0628a(Game.game.m7463g(60), C0430b.f1620c);
        C0645h c0645h = new C0645h();
        c0645h.m2192a(Game.game.f6561E);
        C0602b table = new Table();
        table.mo487a(false);
        table.f2677Y = true;
        this.f7422b.m2004a(table);
        C0602b c0605e = new C0605e();
        c0605e.m1956c(600.0f, 64.0f);
        table.m2059d(c0605e).m2104i().m2096e().m2098f().m2097e(80.0f);
        C0430b c0430b = new C0430b(0.5f, 0.5f, 0.5f, 1.0f);
        C0602b c0625d = new C0625d(c0645h.m2197c("main-menu-icon-map-editor"));
        c0625d.m1956c(64.0f, 64.0f);
        c0625d.m1935a(80.0f, 0.0f);
        c0625d.m1937a(c0430b);
        c0605e.mo510b(c0625d);
        c0625d = new C0629f(Game.f6551e.m2416a("map_editor_map_select_title"), c0628a);
        c0625d.m1956c(320.0f, 64.0f);
        c0625d.m1935a(204.0f, 0.0f);
        c0625d.m1937a(c0430b);
        c0605e.mo510b(c0625d);
        table.m2066q();
        table.m2066q();
        C0602b table2 = new Table();
        table2.mo487a(false);
        for (int i = 1; i <= 3; i++) {
            C0602b c0605e2 = new C0605e();
            C0602b c0625d2;
            C0602b c0625d3;
            if (UserMap.m7585a(i)) {
                int i2;
                int i3;
                int i4;
                int i5;
                UserMap b = UserMap.m7586b(i);
                Pixmap[] pixmapArr = this.f7425e;
                int i6 = i - 1;
                Tile[][] b2 = b.m7587b();
                int length = b2.length;
                int length2 = b2[0].length;
                Pixmap pixmap = new Pixmap(length2 * 64, length * 64, Format.RGB888);
                pixmap.m1117a(UserMap.f6865a);
                pixmap.m1112a(0, 0, length2 * 64, length * 64);
                for (int i7 = 0; i7 < b2.length; i7++) {
                    for (int i8 = 0; i8 < b2[0].length; i8++) {
                        if (b2[i7][i8].f7960a != TileType.VOID) {
                            pixmap.m1117a(b2[i7][i8].mo1805j());
                            pixmap.m1112a((i8 * 64) + 2, (length * 64) - (((i7 + 1) * 64) - 2), 60, 60);
                        }
                    }
                }
                Pixmap pixmap2 = new Pixmap(512, 512, Format.RGB888);
                pixmap2.m1117a(UserMap.f6865a);
                pixmap2.m1112a(0, 0, 512, 512);
                length2 *= 64;
                length *= 64;
                float f;
                if (length2 > length) {
                    i2 = 48;
                    i3 = 416;
                    f = ((float) length2) / ((float) length);
                    i4 = (int) ((512.0f - (416.0f / f)) / 2.0f);
                    i5 = (int) (416.0f / f);
                } else {
                    i4 = 48;
                    i5 = 416;
                    f = ((float) length2) / ((float) length);
                    i2 = (int) ((512.0f - (416.0f * f)) / 2.0f);
                    i3 = (int) (f * 416.0f);
                }
                pixmap2.m1116a(pixmap, 0, 0, length2, length, i2, i4, i3, i5);
                pixmap.dispose();
                pixmapArr[i6] = pixmap2;
                c0625d2 = new C0625d(new C0438n(new Texture(this.f7425e[i - 1])));
                c0625d2.m1956c(512.0f, 512.0f);
                c0625d2.m1935a(0.0f, 137.0f);
                c0605e2.mo510b(c0625d2);
                c0605e = new Table();
                c0605e.m1956c(512.0f, 100.0f);
                c0605e.m1935a(0.0f, 0.0f);
                c0605e2.mo510b(c0605e);
                c0625d2 = new C0605e();
                c0625d2.m1956c(122.0f, 100.0f);
                c0625d = new C0625d(Game.game.f6561E.m1442a("map-editor-map-select-button-left"));
                c0625d.m1937a(LIGHT_BLUE.f8528i);
                c0625d2.mo510b(c0625d);
                c0625d3 = new C0625d(Game.game.f6561E.m1442a("main-menu-icon-map-editor"));
                c0625d3.m1956c(64.0f, 64.0f);
                c0625d3.m1935a(32.0f, 18.0f);
                c0625d2.mo510b(c0625d3);
                c0605e.m2059d(c0625d2).m2103h(25.0f);
                final UserMap userMap = b;
                c0625d2.m1947a(new C0607f(this) {
                    /* renamed from: c */
                    final /* synthetic */ MapEditorMapSelectScreen f7405c;

                    /* renamed from: com.prineside.tdi.screens.MapEditorMapSelectScreen$1$1 */
                    class C11351 implements Runnable {
                        /* renamed from: a */
                        final /* synthetic */ C11361 f7402a;

                        C11351(C11361 c11361) {
                            this.f7402a = c11361;
                        }

                        public void run() {
                            Sound.m7569a(Type.SINGLE);
                            GameScreen.m7835j();
                            MapEditorMapSelectScreen mapEditorMapSelectScreen = this.f7402a.f7405c;
                            MapEditorMapSelectScreen.m8055a(userMap.f6867b);
                        }
                    }

                    /* renamed from: a */
                    public final void mo495a(int i) {
                        c0625d.m1937a(LIGHT_BLUE.f8527h);
                    }

                    /* renamed from: a */
                    public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                        if (GameScreen.m7834i()) {
                            this.f7405c.f7423c.m8213a(Game.f6551e.m2416a("level_select_progress_will_be_lost"), new C11351(this));
                        } else {
                            Sound.m7569a(Type.SINGLE);
                            MapEditorMapSelectScreen.m8055a(userMap.f6867b);
                        }
                        return false;
                    }

                    /* renamed from: b */
                    public final void mo498b(int i) {
                        c0625d.m1937a(LIGHT_BLUE.f8528i);
                    }
                });
                c0625d2 = new C0605e();
                c0625d2.m1956c(110.0f, 100.0f);
                c0625d = new C0625d(Game.game.f6561E.m1442a("map-editor-map-select-button-middle"));
                c0625d.m1937a(GREY.f8505j);
                c0625d2.mo510b(c0625d);
                c0625d3 = new C0625d(Game.game.f6561E.m1442a("main-menu-icon-continue"));
                c0625d3.m1937a(GREY.f8504i);
                c0625d3.m1956c(64.0f, 64.0f);
                c0625d3.m1935a(23.0f, 18.0f);
                c0625d2.mo510b(c0625d3);
                c0605e.m2059d(c0625d2);
                try {
                    new Map(b.m7587b()).m7530c();
                    c0625d.m1937a(GREEN.f8490i);
                    c0625d3.m1937a(C0430b.f1620c);
                    userMap = b;
                    c0625d2.m1947a(new C0607f(this) {
                        /* renamed from: c */
                        final /* synthetic */ MapEditorMapSelectScreen f7409c;

                        /* renamed from: com.prineside.tdi.screens.MapEditorMapSelectScreen$2$1 */
                        class C11371 implements Runnable {
                            /* renamed from: a */
                            final /* synthetic */ C11382 f7406a;

                            C11371(C11382 c11382) {
                                this.f7406a = c11382;
                            }

                            public void run() {
                                Sound.m7569a(Type.SINGLE);
                                GameScreen.m7835j();
                                MapEditorMapSelectScreen mapEditorMapSelectScreen = this.f7406a.f7409c;
                                MapEditorMapSelectScreen.m8056b(userMap.f6867b);
                            }
                        }

                        /* renamed from: a */
                        public final void mo495a(int i) {
                            c0625d.m1937a(GREEN.f8489h);
                        }

                        /* renamed from: a */
                        public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                            if (GameScreen.m7834i()) {
                                this.f7409c.f7423c.m8213a(Game.f6551e.m2416a("level_select_progress_will_be_lost"), new C11371(this));
                            } else {
                                Sound.m7569a(Type.SINGLE);
                                MapEditorMapSelectScreen.m8056b(userMap.f6867b);
                            }
                            return false;
                        }

                        /* renamed from: b */
                        public final void mo498b(int i) {
                            c0625d.m1937a(GREEN.f8490i);
                        }
                    });
                } catch (InvalidMapFormatException e) {
                }
                c0625d2 = new C0605e();
                c0625d2.m1956c(122.0f, 100.0f);
                c0625d = new C0625d(Game.game.f6561E.m1442a("map-editor-map-select-button-right"));
                c0625d.m1937a(RED.f8612i);
                c0625d2.mo510b(c0625d);
                c0625d3 = new C0625d(Game.game.f6561E.m1442a("main-menu-icon-times"));
                c0625d3.m1956c(64.0f, 64.0f);
                c0625d3.m1935a(26.0f, 18.0f);
                c0625d2.mo510b(c0625d3);
                c0605e.m2059d(c0625d2).m2099f(25.0f);
                userMap = b;
                c0625d2.m1947a(new C0607f(this) {
                    /* renamed from: c */
                    final /* synthetic */ MapEditorMapSelectScreen f7413c;

                    /* renamed from: com.prineside.tdi.screens.MapEditorMapSelectScreen$3$1 */
                    class C11391 implements Runnable {
                        /* renamed from: a */
                        final /* synthetic */ C11403 f7410a;

                        C11391(C11403 c11403) {
                            this.f7410a = c11403;
                        }

                        public void run() {
                            userMap.m7590e();
                            Game.game.m7471n();
                        }
                    }

                    /* renamed from: a */
                    public final void mo495a(int i) {
                        c0625d.m1937a(RED.f8611h);
                    }

                    /* renamed from: a */
                    public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                        this.f7413c.f7423c.m8213a(Game.f6551e.m2416a("map_editor_map_select_confirm_delete"), new C11391(this));
                        return false;
                    }

                    /* renamed from: b */
                    public final void mo498b(int i) {
                        c0625d.m1937a(RED.f8612i);
                    }
                });
            } else {
                c0605e = new C0629f(Game.f6551e.m2416a("map_editor_map_select_empty_slot"), new C0628a(Game.game.m7463g(48), new C0430b(1431655935)));
                c0605e.m1956c(512.0f, 512.0f);
                c0605e.m1935a(0.0f, 137.0f);
                c0605e.m2127a(1);
                c0605e2.mo510b(c0605e);
                c0605e = new Table();
                c0605e.m1956c(512.0f, 100.0f);
                c0605e.m1935a(0.0f, 0.0f);
                c0605e2.mo510b(c0605e);
                c0625d2 = new C0605e();
                c0625d2.m1956c(110.0f, 100.0f);
                c0625d = new C0625d(Game.game.f6561E.m1442a("map-editor-map-select-button-middle"));
                c0625d.m1937a(LIGHT_BLUE.f8528i);
                c0625d2.mo510b(c0625d);
                c0625d3 = new C0625d(Game.game.f6561E.m1442a("main-menu-icon-map-editor"));
                c0625d3.m1956c(64.0f, 64.0f);
                c0625d3.m1935a(23.0f, 18.0f);
                c0625d2.mo510b(c0625d3);
                c0605e.m2059d(c0625d2);
                c0625d2.m1947a(new C0607f(this) {
                    /* renamed from: c */
                    final /* synthetic */ MapEditorMapSelectScreen f7416c;

                    /* renamed from: a */
                    public final void mo495a(int i) {
                        c0625d.m1937a(LIGHT_BLUE.f8527h);
                    }

                    /* renamed from: a */
                    public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                        MapEditorMapSelectScreen.m8055a(i);
                        return false;
                    }

                    /* renamed from: b */
                    public final void mo498b(int i) {
                        c0625d.m1937a(LIGHT_BLUE.f8528i);
                    }
                });
            }
            float f2 = 64.0f;
            if (i == 3) {
                f2 = 0.0f;
            }
            table2.m2059d(c0605e2).m2090b(512.0f).m2093c(649.0f).m2103h(f2);
        }
        table.m2059d(table2);
        table.m2066q();
        final C0430b c0430b2 = C0430b.f1620c;
        final C0430b c0430b3 = LIGHT_BLUE.f8525f;
        C0602b c0605e3 = new C0605e();
        c0605e3.m1956c(400.0f, 96.0f);
        c0605e3.f2610d = Touchable.enabled;
        table.m2059d(c0605e3).m2099f(80.0f).m2101g(64.0f).m2104i().m2100g().m2098f();
        c0625d = new C0625d(c0645h.m2197c("icon-triangle-left"));
        c0625d.m1956c(64.0f, 64.0f);
        c0625d.m1935a(0.0f, 16.0f);
        c0625d.m1937a(c0430b2);
        c0605e3.mo510b(c0625d);
        final C0602b c0629f = new C0629f(Game.f6551e.m2416a("back"), c0628a);
        c0629f.m1956c(336.0f, 96.0f);
        c0629f.m1935a(124.0f, 0.0f);
        c0629f.m1937a(c0430b2);
        c0605e3.mo510b(c0629f);
        c0605e3.m1947a(new C0607f(this) {
            /* renamed from: e */
            final /* synthetic */ MapEditorMapSelectScreen f7421e;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0625d.m1937a(c0430b3);
                c0629f.m1937a(c0430b3);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                Game.game.m7473p();
                Sound.m7569a(Type.NO);
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0625d.m1937a(c0430b2);
                c0629f.m1937a(c0430b2);
            }
        });
        this.f7423c = new Dialog(this.f7422b);
    }

    /* renamed from: a */
    static /* synthetic */ void m8055a(int i) {
        Game.game.logger.log("MapEditorMapSelectScreen", "editMap " + i);
        Game game = Game.game;
        if (game.getScreen() != null) {
            game.getScreen().mo1778d();
        }
        game.setScreen(new MapEditorScreen(i));
    }

    /* renamed from: b */
    static /* synthetic */ void m8056b(int i) {
        Game.game.logger.log("MapEditorMapSelectScreen", "playMap " + i);
        Game.game.m7447a(i);
    }

    /* renamed from: a */
    public final void resize(int i, int i2) {
        super.resize(i, i2);
        this.f7424d.f3064a = 1200.0f / ((float) Gdx.graphics.mo295d());
        this.f7424d.mo522a(i, i2);
    }

    /* renamed from: b */
    public final void mo1781b(float f) {
        if (Gdx.input.mo307b(4) || Gdx.input.mo307b(131)) {
            Game.game.m7473p();
        }
        this.f7422b.m2015c();
        this.f7422b.m2001a();
    }

    /* renamed from: d */
    public final void mo1778d() {
        super.mo1778d();
        for (int i = 0; i < 3; i++) {
            if (this.f7425e[i] != null) {
                this.f7425e[i].dispose();
                this.f7425e[i] = null;
            }
        }
        this.f7422b.dispose();
    }

    public final void j_() {
        GlobalUpgrade.m7491a(FilteringMode.NONE, null);
        Gdx.input.mo304a(this.f7422b);
    }
}
