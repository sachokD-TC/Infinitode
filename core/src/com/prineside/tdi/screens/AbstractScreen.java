package com.prineside.tdi.screens;

import com.badlogic.gdx.Screen;
import com.prineside.tdi.Game;
import com.prineside.tdi.utility.Debug;

public abstract class AbstractScreen implements Screen {
    /* renamed from: a */
    protected final Game f7103a = Game.game;

    /* renamed from: a */
    public final void render(float f) {
        Game.game.m7468j();
        if (!Game.game.f6586s) {
            mo1781b(f);
            if (Game.f6555i) {
                Debug.m8804a();
            }
        }
        if (Game.game.f6578j != null) {
            Game.game.f6578j.f1609a.m1208a();
        }
    }

    /* renamed from: a */
    public void resize(int i, int i2) {
        Debug.m8805a(i, i2);
    }

    /* renamed from: b */
    public void pause() {
    }

    /* renamed from: b */
    public abstract void mo1781b(float f);

    /* renamed from: d */
    public void mo1778d() {
    }

    public void j_() {
    }

    public void resume() {
    }
}
