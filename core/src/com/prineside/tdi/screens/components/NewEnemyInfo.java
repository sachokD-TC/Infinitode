package com.prineside.tdi.screens.components;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
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
import com.prineside.tdi.Game;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.utility.MaterialColor.LIGHT_BLUE;
import com.prineside.tdi.utility.QuadActor;

public class NewEnemyInfo {
    /* renamed from: a */
    public Table f7732a;
    /* renamed from: b */
    public boolean f7733b = false;
    /* renamed from: c */
    public long f7734c;
    /* renamed from: d */
    public C0625d[] f7735d = new C0625d[4];
    /* renamed from: e */
    public C0629f[] f7736e = new C0629f[12];
    /* renamed from: f */
    public C0629f f7737f;
    /* renamed from: g */
    public C0629f f7738g;
    /* renamed from: h */
    private C0645h f7739h;

    /* renamed from: com.prineside.tdi.screens.components.NewEnemyInfo$2 */
    class C11962 extends C0607f {
        /* renamed from: a */
        final /* synthetic */ NewEnemyInfo f7728a;

        C11962(NewEnemyInfo newEnemyInfo) {
            this.f7728a = newEnemyInfo;
        }

        /* renamed from: a */
        public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
            inputEvent.m1879b();
            return true;
        }
    }

    public NewEnemyInfo(final GameScreen gameScreen) {
        int i = 0;
        C0609g c0609g = gameScreen.f7181v;
        this.f7739h = new C0645h();
        this.f7739h.m2192a(Game.game.f6561E);
        this.f7732a = new Table();
        this.f7732a.f2677Y = true;
        Pixmap pixmap = new Pixmap(1, 1, Format.RGBA8888);
        C0430b c = Game.f6556q.m1222c();
        c.f1647L = 0.5f;
        pixmap.m1117a(c);
        pixmap.m1111a();
        this.f7732a.m2054a(new C0625d(new Texture(pixmap)).f2802r);
        this.f7732a.f2610d = Touchable.enabled;
        this.f7732a.m1947a(new C0607f(this) {
            /* renamed from: b */
            final /* synthetic */ NewEnemyInfo f7727b;

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                if (Game.game.m7478u() - this.f7727b.f7734c > 2000000) {
                    gameScreen.m7869p();
                }
                return true;
            }
        });
        this.f7732a.f2611e = false;
        c0609g.m2004a(this.f7732a);
        C0602b c0605e = new C0605e();
        c0605e.f2628r = false;
        c0605e.m1956c(800.0f, 650.0f);
        this.f7732a.m2059d(c0605e);
        c0605e.f2610d = Touchable.enabled;
        c0605e.m1947a(new C11962(this));
        C0602b quadActor = new QuadActor(new float[]{0.043f, 0.023f, 0.0f, 0.98f, 1.0f, 1.0f, 0.954f, 0.0f}, new int[]{0, 0, 0, 208, 0, 0, 0, 208, 0, 0, 0, 208, 0, 0, 0, 208});
        quadActor.m1956c(800.0f, 650.0f);
        c0605e.mo510b(quadActor);
        for (int i2 = 0; i2 < 4; i2++) {
            this.f7735d[i2] = new C0625d(Game.game.f6561E.m1442a("enemy-0"));
            this.f7735d[i2].m1956c(128.0f, 128.0f);
            c0605e.mo510b(this.f7735d[i2]);
        }
        this.f7735d[0].m1935a(-72.0f, 492.0f);
        this.f7735d[1].m1935a(-25.0f, 430.0f);
        this.f7735d[2].m1935a(-70.0f, 392.0f);
        this.f7735d[3].m1935a(-50.0f, 298.0f);
        this.f7737f = new C0629f("Enemy name", new C0628a(Game.game.m7463g(60), C0430b.f1620c));
        this.f7737f.m1935a(93.0f, 530.0f);
        this.f7737f.m1956c(616.0f, 66.0f);
        c0605e.mo510b(this.f7737f);
        quadActor = new C0629f(Game.f6551e.m2416a("new_enemy_info_hint_new_enemy"), new C0628a(Game.game.m7463g(30), new C0430b(1.0f, 1.0f, 1.0f, 0.56f)));
        quadActor.m1935a(93.0f, 485.0f);
        quadActor.m1956c(616.0f, 45.0f);
        c0605e.mo510b(quadActor);
        this.f7738g = new C0629f("Перемещается по воздуху на большой скорости, избегает снарядов многих башен, но уязвим к молнии", new C0628a(Game.game.m7463g(36), C0430b.f1620c));
        this.f7738g.m1935a(93.0f, 375.0f);
        this.f7738g.m1956c(616.0f, 77.0f);
        this.f7738g.m2135h();
        this.f7738g.m2127a(8);
        c0605e.mo510b(this.f7738g);
        quadActor = new C0625d(Game.game.f6561E.m1442a("main-menu-icon-times"));
        quadActor.m1956c(64.0f, 64.0f);
        quadActor.m1935a(668.0f, 530.0f);
        c0605e.mo510b(quadActor);
        quadActor.f2610d = Touchable.enabled;
        quadActor.m1947a(new C0607f(this) {
            /* renamed from: c */
            final /* synthetic */ NewEnemyInfo f7731c;

            /* renamed from: a */
            public final void mo495a(int i) {
                quadActor.m1937a(LIGHT_BLUE.f8525f);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                gameScreen.m7869p();
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                quadActor.m1937a(C0430b.f1620c);
            }
        });
        quadActor = new C0629f(Game.f6551e.m2416a("new_enemy_info_hint_tower_efficiency"), new C0628a(Game.game.m7463g(30), new C0430b(1.0f, 1.0f, 1.0f, 0.56f)));
        quadActor.m1935a(93.0f, 307.0f);
        quadActor.m1956c(616.0f, 42.0f);
        quadActor.m2127a(1);
        c0605e.mo510b(quadActor);
        Vector2[] vector2Arr = new Vector2[]{new Vector2(93.0f, 236.0f), new Vector2(93.0f, 172.0f), new Vector2(93.0f, 108.0f), new Vector2(93.0f, 44.0f), new Vector2(313.0f, 236.0f), new Vector2(313.0f, 172.0f), new Vector2(313.0f, 108.0f), new Vector2(313.0f, 44.0f), new Vector2(533.0f, 236.0f), new Vector2(533.0f, 172.0f), new Vector2(533.0f, 108.0f), new Vector2(533.0f, 44.0f)};
        C0628a c0628a = new C0628a(Game.game.m7463g(36), C0430b.f1620c);
        while (i < 12) {
            C0602b c0625d = new C0625d(Game.game.f6561E.m1442a("tower-base-" + i));
            c0625d.m1956c(64.0f, 64.0f);
            c0625d.m1935a(vector2Arr[i].f2337x, vector2Arr[i].f2338y);
            c0605e.mo510b(c0625d);
            c0625d = new C0625d(Game.game.f6561E.m1442a("tower-weapon-" + i));
            c0625d.m1956c(64.0f, 64.0f);
            c0625d.m1935a(vector2Arr[i].f2337x, vector2Arr[i].f2338y);
            c0605e.mo510b(c0625d);
            this.f7736e[i] = new C0629f("100%", c0628a);
            this.f7736e[i].m1935a((vector2Arr[i].f2337x + 64.0f) + 32.0f, vector2Arr[i].f2338y);
            this.f7736e[i].m1956c(128.0f, 64.0f);
            c0605e.mo510b(this.f7736e[i]);
            i++;
        }
    }
}
