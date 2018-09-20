package com.prineside.tdi.screens;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.C0367f;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0609g;
import com.badlogic.gdx.scenes.scene2d.p033a.C0587a;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f.C0628a;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.p034b.C0684b;
import com.prineside.tdi.Game;
import com.prineside.tdi.GameListener;
import com.prineside.tdi.GameSyncLoader;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;

public class LoadingScreen extends AbstractScreen {
    /* renamed from: b */
    public final C0609g f7330b = new C0609g(this.f7336h);
    /* renamed from: c */
    private GameSyncLoader f7331c;
    /* renamed from: d */
    private boolean f7332d = false;
    /* renamed from: e */
    private Texture f7333e;
    /* renamed from: f */
    private Texture f7334f;
    /* renamed from: g */
    private String f7335g;
    /* renamed from: h */
    private final C0684b f7336h = new C0684b();
    /* renamed from: i */
    private Table f7337i;

    /* renamed from: com.prineside.tdi.screens.LoadingScreen$1 */
    class C11211 extends C0367f {
        /* renamed from: a */
        final /* synthetic */ LoadingScreen f7329a;

        C11211(LoadingScreen loadingScreen) {
            this.f7329a = loadingScreen;
        }

        /* renamed from: a */
        public final boolean mo334a(int i, int i2, int i3, int i4) {
            if (Gdx.app.getType() == ApplicationType.iOS) {
                if (this.f7329a.f7332d && !Game.game.f6566J.mo1730d()) {
                    Sound.m7569a(Type.UPGRADE);
                    Game.game.m7473p();
                }
            } else if (this.f7329a.f7332d) {
                Sound.m7569a(Type.UPGRADE);
                Game.game.m7473p();
            }
            return true;
        }
    }

    public LoadingScreen(GameSyncLoader gameSyncLoader) {
        this.f7331c = gameSyncLoader;
        this.f7333e = new Texture(Gdx.files.mo277b("textures/loading.png"), Format.RGBA8888, true);
        this.f7333e.m1129b(TextureFilter.MipMapLinearNearest, TextureFilter.Linear);
        this.f7334f = new Texture(Gdx.files.mo277b("textures/loading-prineside.png"), Format.RGBA8888, true);
        this.f7334f.m1129b(TextureFilter.MipMapLinearNearest, TextureFilter.Linear);
        Gdx.input.mo304a(new C11211(this));
        this.f7337i = new Table();
        this.f7337i.f2677Y = true;
        this.f7330b.m2004a(this.f7337i);
    }

    /* renamed from: a */
    public final void resize(int i, int i2) {
        super.resize(i, i2);
        this.f7336h.f3064a = 1200.0f / ((float) Gdx.graphics.mo295d());
        this.f7336h.mo522a(i, i2);
    }

    /* renamed from: b */
    public final void mo1781b(float f) {
        Game.game.f6559C.f2027i.m1688a((float) Gdx.graphics.mo294c(), (float) Gdx.graphics.mo295d());
        Game.game.f6560D.f2111b.m1688a((float) Gdx.graphics.mo294c(), (float) Gdx.graphics.mo295d());
        float d = ((float) Gdx.graphics.mo295d()) / 1200.0f;
        float c = ((float) Gdx.graphics.mo294c()) / 2.0f;
        Game.game.f6559C.mo365a();
        Game.game.f6559C.m1410a(C0430b.f1620c);
        Game.game.f6559C.m1407a(this.f7333e, c - (512.0f * d), 146.0f * d, 1024.0f * d, 1024.0f * d);
        Game.game.f6559C.m1407a(this.f7334f, c - (160.0f * d), 0.0f, 320.0f * d, 320.0f * d);
        Game.game.f6559C.mo374c();
        if (this.f7331c.m7488c()) {
            if (!(this.f7332d || Game.game.f6566J.mo1730d())) {
                Game.game.logger.log("LoadingScreen", "SyncLoader is done");
                this.f7332d = true;
                Game.f6555i = true;
                C0602b c0629f = new C0629f("Touch the screen to continue", new C0628a(Game.game.m7463g(36), new C0430b(45995519)));
                this.f7337i.m2059d(c0629f).m2097e(500.0f);
                c0629f.m1940a(C0587a.m1884a(C0587a.m1885a(C0587a.m1881a(0.0f, 1.0f, null), C0587a.m1881a(1.0f, 0.65f, null))));
                Game game = Game.game;
                Object[] f2 = game.f6568L.m2540f();
                int i = game.f6568L.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((GameListener) f2[i2]).mo1712a();
                }
                game.f6568L.m2541g();
                if (game.f6557A) {
                    game.m7479v();
                }
            }
            if (this.f7335g == null) {
                this.f7335g = Game.f6551e.m2416a("loading_touchToContinue");
            }
        } else {
            GameSyncLoader gameSyncLoader = this.f7331c;
            Game.game.logger.log("LoadingScreen", "Working (" + ((int) (this.f7331c.m7487b() * 100.0f)) + "): " + (gameSyncLoader.m7488c() ? null : (String) gameSyncLoader.f6599a.m2291a(gameSyncLoader.f6600b)));
            Game.game.f6560D.m1456a(ShapeType.Filled);
            Game.game.f6560D.m1455a(C0430b.f1619b);
            Game.game.f6560D.m1460b(c - (170.0f * d), 350.0f * d, 340.0f * d, 2.0f);
            Game.game.f6560D.m1455a(new C0430b(1102822911));
            Game.game.f6560D.m1460b(c - (170.0f * d), 350.0f * d, (340.0f * d) * this.f7331c.m7487b(), 2.0f);
            Game.game.f6560D.m1451a();
            this.f7331c.m7485a();
        }
        this.f7330b.m2015c();
        this.f7330b.m2001a();
    }

    /* renamed from: d */
    public final void mo1778d() {
        this.f7333e.dispose();
        this.f7334f.dispose();
        this.f7330b.dispose();
    }
}
