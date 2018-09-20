package com.prineside.tdi;

public class IconSyncLoadingRunnable implements Runnable {
    private final Game game;

    public IconSyncLoadingRunnable(Game game) {
        this.game = game;

    }

    public void run() {
        this.f6512a.m7467i();
        try {
            Something.m7542a();
        } catch (Exception e) {
            com.prineside.tdi.Game.game.logger.log("Game", "Something was not init");
        }
        this.f6512a.f6570P = this.f6512a.f6561E.m1442a("loading-icon");
    }
}

}



