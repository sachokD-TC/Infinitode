package com.prineside.tdi.screens.components.tabs;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f.C0628a;
import com.badlogic.gdx.scenes.scene2d.utils.C0655f;
import com.badlogic.gdx.scenes.scene2d.utils.C0663k;
import com.prineside.tdi.Game;
import com.prineside.tdi.screens.components.TileMenu;
import com.prineside.tdi.tiles.Tile.TileType;

public class TileInfoTab extends AbstractTileMenuTab {
    /* renamed from: c */
    private C0655f f7829c = new C0663k(Game.game.f6561E.m1442a("tile-menu-icon-tile-log"));
    /* renamed from: d */
    private boolean f7830d = false;
    /* renamed from: e */
    private C0629f f7831e = new C0629f("Tile title", new C0628a(Game.game.m7463g(60), C0430b.f1620c));
    /* renamed from: f */
    private C0629f f7832f;
    /* renamed from: g */
    private C0605e f7833g;
    /* renamed from: h */
    private C0629f f7834h;

    public TileInfoTab(TileMenu tileMenu) {
        super(tileMenu);
        this.f7831e.m1935a(55.0f, 790.0f);
        this.f7831e.m1955c(521.0f);
        this.f7831e.m2132d(Game.game.m7463g(60).f1821a.f1796n * 0.9f, Game.game.m7463g(60).f1821a.f1797o);
        this.a.mo510b(this.f7831e);
        this.f7832f = new C0629f("Tile description", new C0628a(Game.game.m7463g(36), C0430b.f1620c));
        this.f7832f.m1935a(55.0f, 597.0f);
        this.f7832f.m1955c(480.0f);
        this.f7832f.m1959d(190.0f);
        this.f7832f.m2127a(10);
        this.f7832f.m2135h();
        this.a.mo510b(this.f7832f);
        this.f7833g = new C0605e();
        this.f7833g.f2628r = false;
        this.f7833g.m1956c(576.0f, 884.0f);
        this.f7833g.m1935a(0.0f, 0.0f);
        this.a.mo510b(this.f7833g);
        this.f7834h = new C0629f("Level difficulty: [#FFC107]100%", new C0628a(Game.game.m7465h(36), C0430b.f1620c));
        this.f7834h.m1935a(55.0f, 502.0f);
        this.f7834h.m1955c(480.0f);
        this.f7834h.m1959d(190.0f);
        this.f7834h.m2127a(10);
        this.f7834h.m2135h();
        this.f7833g.mo510b(this.f7834h);
    }

    /* renamed from: a */
    public final void mo1793a() {
        this.f7831e.m2130a(this.b.f7782c.mo1803h());
        this.f7832f.m2130a(this.b.f7782c.mo1804i());
        if (this.b.f7782c.f7960a == TileType.SPAWN) {
            this.f7834h.m2130a(Game.f6551e.m2416a("tile_info_level_difficulty") + ": [#FFC107]" + ((float) Math.round(this.b.f7780a.f7179t.f6762f.f7995t * 100.0f)) + "%");
            this.f7833g.f2611e = true;
            return;
        }
        this.f7833g.f2611e = false;
    }

    /* renamed from: b */
    public final C0655f mo1794b() {
        return this.f7829c;
    }

    /* renamed from: c */
    public final void mo1795c() {
        if (!this.f7830d) {
            this.f7830d = true;
        }
    }

    /* renamed from: d */
    public final void mo1796d() {
        if (this.f7830d) {
            this.f7830d = false;
        }
    }
}
