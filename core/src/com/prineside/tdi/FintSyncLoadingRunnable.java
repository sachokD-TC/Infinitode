package com.prineside.tdi;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class FintSyncLoadingRunnable implements Runnable {
    final Game game;
    private final int i;

    public FintSyncLoadingRunnable(Game game, int i) {
        this.game = game;
        this.i= i;
    }

    public void run() {
        try {
            BitmapFont g = this.game.m7463g(i);
            com.prineside.tdi.Game.game.logger.log("Game:loading", "Font texture size: " + g.m1332a().f1686z.m1144c() + "x" + g.m1332a().f1686z.m1145k());
            g = this.game.m7465h(i);
            com.prineside.tdi.Game.game.logger.log("Game:loading", "Font outlined texture size: " + g.m1332a().f1686z.m1144c() + "x" + g.m1332a().f1686z.m1145k());
        } catch (Throwable e) {
            this.game.preferences.m8839b("locale", "en_US");
            this.game.preferences.m8844d();
            com.prineside.tdi.Game.game.logger.m7508a("failed to load locale fonts, falling back to en_US", e);
            Gdx.app.exit();
        }
    }

}
