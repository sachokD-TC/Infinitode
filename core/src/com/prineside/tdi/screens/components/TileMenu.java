package com.prineside.tdi.screens.components;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.C0607f;
import com.badlogic.gdx.scenes.scene2d.C0609g;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.C0625d;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h;
import com.badlogic.gdx.scenes.scene2d.utils.C0663k;
import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.Game;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.screens.components.tabs.AbstractTileMenuTab;
import com.prineside.tdi.screens.components.tabs.TileInfoTab;
import com.prineside.tdi.screens.components.tabs.TowerBuildTab;
import com.prineside.tdi.screens.components.tabs.TowerInfoTab;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.tiles.Tile.TileType;
import com.prineside.tdi.utility.QuadActor;

public class TileMenu {
    /* renamed from: a */
    public GameScreen f7780a;
    /* renamed from: b */
    public C0605e f7781b;
    /* renamed from: c */
    public Tile f7782c = null;
    /* renamed from: d */
    public boolean f7783d = true;
    /* renamed from: e */
    public boolean f7784e = false;
    /* renamed from: f */
    public boolean f7785f = false;
    /* renamed from: g */
    public float f7786g = 0.0f;
    /* renamed from: h */
    private C0609g f7787h;
    /* renamed from: i */
    private AbstractTileMenuTab f7788i;
    /* renamed from: j */
    private AbstractTileMenuTab[] f7789j;
    /* renamed from: k */
    private AbstractTileMenuTab f7790k;
    /* renamed from: l */
    private AbstractTileMenuTab f7791l;
    /* renamed from: m */
    private AbstractTileMenuTab f7792m;
    /* renamed from: n */
    private C0625d f7793n;

    /* renamed from: com.prineside.tdi.screens.components.TileMenu$1 */
    class C12101 extends C0605e {
        /* renamed from: s */
        final /* synthetic */ TileMenu f7774s;

        C12101(TileMenu tileMenu) {
            this.f7774s = tileMenu;
        }
    }

    /* renamed from: com.prineside.tdi.screens.components.TileMenu$2 */
    class C12112 extends C0607f {
        /* renamed from: a */
        final /* synthetic */ TileMenu f7775a;
        /* renamed from: b */
        private Vector2 f7776b = new Vector2();
        /* renamed from: c */
        private boolean f7777c = false;

        C12112(TileMenu tileMenu) {
            this.f7775a = tileMenu;
        }

        /* renamed from: a */
        public final void mo496a(InputEvent inputEvent, float f, float f2, int i) {
            float f3 = inputEvent.f2560j - this.f7776b.f2337x;
            if (this.f7775a.f7783d) {
                if (f3 < -20.0f) {
                    this.f7777c = true;
                }
                if (this.f7777c && f3 <= 0.0f) {
                    this.f7775a.f7781b.m1935a(f3 + 0.0f, this.f7775a.f7781b.f2614h);
                }
            }
        }

        /* renamed from: a */
        public final boolean mo506a() {
            return true;
        }

        /* renamed from: a */
        public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
            this.f7775a.f7785f = false;
            this.f7777c = false;
            this.f7776b.f2337x = f;
            this.f7776b.f2338y = f2;
            return true;
        }

        /* renamed from: b */
        public final void mo499b(InputEvent inputEvent, float f, float f2, int i, int i2) {
            if (inputEvent.f2560j - this.f7776b.f2337x < -192.0f) {
                this.f7775a.m8276b(false);
            } else {
                this.f7775a.m8276b(true);
            }
        }
    }

    /* renamed from: com.prineside.tdi.screens.components.TileMenu$3 */
    class C12123 extends C0607f {
        /* renamed from: a */
        final /* synthetic */ TileMenu f7778a;

        C12123(TileMenu tileMenu) {
            this.f7778a = tileMenu;
        }

        /* renamed from: a */
        public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
            this.f7778a.m8276b(!this.f7778a.f7783d);
            inputEvent.m1879b();
            Sound.m7569a(Type.CLICK);
            return true;
        }
    }

    /* renamed from: com.prineside.tdi.screens.components.TileMenu$4 */
    class C12134 extends C0607f {
        /* renamed from: a */
        final /* synthetic */ TileMenu f7779a;

        C12134(TileMenu tileMenu) {
            this.f7779a = tileMenu;
        }

        /* renamed from: a */
        public final void mo495a(int i) {
            this.f7779a.f7793n.m1952b(1.0f, 1.0f, 1.0f, 1.0f);
        }

        /* renamed from: b */
        public final void mo498b(int i) {
            this.f7779a.f7793n.m1952b(0.12941177f, 0.5882353f, 0.9529412f, 1.0f);
        }
    }

    public TileMenu(GameScreen gameScreen) {
        int i = 0;
        C0645h c0645h = new C0645h();
        c0645h.m2192a(Game.game.f6561E);
        this.f7780a = gameScreen;
        this.f7787h = gameScreen.f7181v;
        C0676a c0676a = new C0676a();
        c0676a.m2296a(new Vector2(0.0f, 18.0f));
        c0676a.m2296a(new Vector2(576.0f, 0.0f));
        c0676a.m2296a(new Vector2(576.0f, 135.0f));
        c0676a.m2296a(new Vector2(678.0f, 157.0f));
        c0676a.m2296a(new Vector2(706.0f, 342.0f));
        c0676a.m2296a(new Vector2(576.0f, 373.0f));
        c0676a.m2296a(new Vector2(576.0f, 913.0f));
        c0676a.m2296a(new Vector2(0.0f, 903.0f));
        Vector2 vector2 = new Vector2();
        this.f7781b = new C12101(this);
        this.f7781b.f2628r = false;
        this.f7781b.f2610d = Touchable.enabled;
        this.f7781b.m1955c(706.0f);
        this.f7781b.m1959d(906.0f);
        this.f7781b.m1935a(0.0f, 167.0f);
        this.f7781b.f2611e = false;
        this.f7781b.m1947a(new C12112(this));
        this.f7787h.m2004a(this.f7781b);
        C0602b quadActor = new QuadActor(new float[]{0.0f, 0.022f, 0.0f, 0.988f, 1.0f, 1.0f, 1.0f, 0.0f}, new int[]{0, 0, 0, 204, 0, 0, 0, 204, 0, 0, 0, 204, 0, 0, 0, 204});
        quadActor.m1956c(576.0f, 906.0f);
        this.f7781b.mo510b(quadActor);
        quadActor = new C0605e();
        quadActor.f2628r = false;
        quadActor.m1956c(130.0f, 238.0f);
        quadActor.m1935a(576.0f, 135.0f);
        quadActor.m1947a(new C12123(this));
        this.f7781b.mo510b(quadActor);
        C0602b quadActor2 = new QuadActor(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.87f, 0.8f, 0.1f}, new int[]{0, 0, 0, 204, 0, 0, 0, 204, 0, 0, 0, 204, 0, 0, 0, 204});
        quadActor2.m1956c(130.0f, 238.0f);
        quadActor2.m1935a(0.0f, 0.0f);
        quadActor.mo510b(quadActor2);
        this.f7793n = new C0625d(c0645h.m2197c("tile-menu-icon-hide"));
        this.f7793n.m1956c(62.0f, 62.0f);
        this.f7793n.m1935a(26.0f, 93.0f);
        this.f7793n.m1937a(new C0430b(61469951));
        quadActor.mo510b(this.f7793n);
        quadActor.m1947a(new C12134(this));
        this.f7790k = new TowerBuildTab(this);
        this.f7791l = new TileInfoTab(this);
        this.f7792m = new TowerInfoTab(this);
        this.f7789j = new AbstractTileMenuTab[]{this.f7790k, this.f7791l, this.f7792m};
        AbstractTileMenuTab[] abstractTileMenuTabArr = this.f7789j;
        int length = abstractTileMenuTabArr.length;
        while (i < length) {
            AbstractTileMenuTab abstractTileMenuTab = abstractTileMenuTabArr[i];
            abstractTileMenuTab.f7827a.m1935a(0.0f, 0.0f);
            abstractTileMenuTab.f7827a.m1956c(576.0f, 906.0f);
            this.f7781b.mo510b(abstractTileMenuTab.f7827a);
            i++;
        }
    }

    /* renamed from: a */
    private void m8270a(AbstractTileMenuTab abstractTileMenuTab) {
        for (AbstractTileMenuTab abstractTileMenuTab2 : this.f7789j) {
            if (abstractTileMenuTab2 != abstractTileMenuTab && abstractTileMenuTab2.f7827a.f2611e) {
                abstractTileMenuTab2.f7827a.f2611e = false;
                abstractTileMenuTab2.mo1796d();
            }
        }
        abstractTileMenuTab.f7827a.f2611e = true;
        if (this.f7783d) {
            abstractTileMenuTab.mo1795c();
        }
        if (!this.f7783d) {
            this.f7793n.m2117a(abstractTileMenuTab.mo1794b());
        }
        this.f7788i = abstractTileMenuTab;
    }

    /* renamed from: a */
    public final void m8274a() {
        if (this.f7784e) {
            if (this.f7782c.f7960a != TileType.SPACE) {
                m8270a(this.f7791l);
            } else if (this.f7782c.f7962c == null) {
                m8270a(this.f7790k);
            } else {
                m8270a(this.f7792m);
            }
            this.f7788i.mo1793a();
        }
    }

    /* renamed from: a */
    public final void m8275a(boolean z) {
        if (z && this.f7782c == null) {
            Game.game.logger.m7510b("TileMenu", "Can't enable menu without tile, use setTile() first");
            Game.game.logger.m7509a(new Exception());
            return;
        }
        this.f7784e = z;
        if (z) {
            this.f7781b.f2611e = true;
            if (this.f7783d && this.f7788i != null) {
                this.f7788i.mo1795c();
            }
        } else {
            this.f7781b.f2611e = false;
            if (this.f7783d && this.f7788i != null) {
                this.f7788i.mo1796d();
            }
        }
        m8274a();
    }

    /* renamed from: b */
    public final void m8276b(boolean z) {
        if (z) {
            this.f7793n.m2117a(new C0663k(Game.game.f6561E.m1442a("tile-menu-icon-hide")));
            this.f7785f = true;
            this.f7786g = 0.0f;
            if (this.f7788i != null) {
                this.f7788i.mo1795c();
            }
        } else {
            if (this.f7788i != null) {
                this.f7793n.m2117a(this.f7788i.mo1794b());
            }
            this.f7785f = true;
            this.f7786g = -576.0f;
            if (this.f7788i != null) {
                this.f7788i.mo1796d();
            }
        }
        this.f7783d = z;
    }
}
