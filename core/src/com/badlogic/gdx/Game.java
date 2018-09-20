package com.badlogic.gdx;

/* renamed from: com.badlogic.gdx.d */
public abstract class Game implements ApplicationListener {
    /* renamed from: a */
    protected Screen screen;

    /* renamed from: a */
    public final void resize(int i, int i2) {
        if (this.screen != null) {
            this.screen.resize(i, i2);
        }
    }

    /* renamed from: a */
    public final void setScreen(Screen screen) {
        this.screen = screen;
        if (this.screen != null) {
            this.screen.j_();
            this.screen.resize(Gdx.graphics.mo294c(), Gdx.graphics.mo295d());
        }
    }

    /* renamed from: b */
    public void render() {
        if (this.screen != null) {
            this.screen.render(Gdx.graphics.getDeltaTime());
        }
    }

    /* renamed from: c */
    public void pause() {
        if (this.screen != null) {
            this.screen.pause();
        }
    }

    /* renamed from: d */
    public void resume() {
        if (this.screen != null) {
            this.screen.resume();
        }
    }

    /* renamed from: e */
    public void dispose() {
    }

    /* renamed from: f */
    public final Screen getScreen() {
        return this.screen;
    }
}
