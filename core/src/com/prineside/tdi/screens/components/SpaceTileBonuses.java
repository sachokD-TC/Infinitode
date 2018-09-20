package com.prineside.tdi.screens.components;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.C0624j;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f.C0628a;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.C0618d;
import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.Game;
import java.util.Iterator;

public class SpaceTileBonuses {
    /* renamed from: a */
    public Table f7771a = new Table();
    /* renamed from: b */
    public C0629f f7772b = new C0629f(Game.f6551e.m2416a("game_gui_no_bonuses"), new C0628a(Game.game.m7463g(36), new C0430b(1.0f, 1.0f, 1.0f, 0.56f)));
    /* renamed from: c */
    public C0676a<BonusData> f7773c;

    public static class BonusData {
        /* renamed from: a */
        public C0624j f7768a;
        /* renamed from: b */
        public C0629f f7769b;
        /* renamed from: c */
        public Runnable f7770c;

        public BonusData(C0624j c0624j, C0629f c0629f, Runnable runnable) {
            this.f7768a = c0624j;
            this.f7769b = c0629f;
            this.f7770c = runnable;
        }
    }

    public SpaceTileBonuses() {
        m8262a(null);
    }

    /* renamed from: a */
    public final void m8262a(C0676a<BonusData> c0676a) {
        C0676a c0676a2;
        if (c0676a == null || c0676a.f3001b == 0) {
            c0676a2 = null;
        }
        this.f7773c = c0676a2;
        this.f7771a.mo475c();
        if (c0676a2 == null) {
            this.f7771a.m2059d(this.f7772b);
            return;
        }
        Iterator it = this.f7773c.iterator();
        while (it.hasNext()) {
            final BonusData bonusData = (BonusData) it.next();
            C0602b c0605e = new C0605e();
            c0605e.f2628r = false;
            c0605e.m1956c(96.0f, 96.0f);
            this.f7771a.m2059d(c0605e);
            c0605e.f2610d = Touchable.enabled;
            c0605e.m1947a(new C0618d(this) {
                /* renamed from: f */
                final /* synthetic */ SpaceTileBonuses f7767f;

                /* renamed from: b */
                public final void mo500b() {
                    bonusData.f7770c.run();
                }
            });
            bonusData.f7768a.m1956c(64.0f, 64.0f);
            bonusData.f7768a.m1935a(12.0f, 20.0f);
            c0605e.mo510b(bonusData.f7768a);
            bonusData.f7769b.m1956c(96.0f, 24.0f);
            bonusData.f7769b.m1935a(0.0f, 6.0f);
            bonusData.f7769b.m2127a(16);
            c0605e.mo510b(bonusData.f7769b);
        }
    }
}
