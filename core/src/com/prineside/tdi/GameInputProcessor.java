package com.prineside.tdi;

import com.badlogic.gdx.C0367f;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.towers.Tower.TowerType;
import java.util.HashMap;
import java.util.Map.Entry;

public class GameInputProcessor extends C0367f {
    /* renamed from: a */
    public HashMap<GameInputListener, Boolean> f6594a = new HashMap();
    /* renamed from: b */
    private GameScreen f6595b;
    /* renamed from: c */
    private CameraController f6596c;
    /* renamed from: d */
    private Map f6597d;
    /* renamed from: e */
    private Tile f6598e;

    public GameInputProcessor(GameScreen gameScreen) {
        this.f6595b = gameScreen;
        this.f6596c = gameScreen.f7162c;
        this.f6597d = gameScreen.f7179t;
    }

    /* renamed from: a */
    public final boolean mo331a(int i) {
        if (i == 131 || i == 4) {
            for (Entry key : this.f6594a.entrySet()) {
                key.getKey();
            }
            return true;
        }
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            Gdx.app.log("GameInputProcessor", "key pressed " + i);
            if (i == 45) {
                gameScreen.m7849a(TowerType.BASIC);
            } else if (i == 51) {
                gameScreen.m7849a(TowerType.SNIPER);
            } else if (i == 33) {
                gameScreen.m7849a(TowerType.CANNON);
            } else if (i == 46) {
                gameScreen.m7849a(TowerType.FROST);
            } else if (i == 29) {
                gameScreen.m7849a(TowerType.VENOM);
            } else if (i == 47) {
                gameScreen.m7849a(TowerType.SPLASH);
            } else if (i == 32) {
                gameScreen.m7849a(TowerType.BLAST);
            } else if (i == 34) {
                gameScreen.m7849a(TowerType.MULTISHOT);
            } else if (i == 54) {
                gameScreen.m7849a(TowerType.MINIGUN);
            } else if (i == 52) {
                gameScreen.m7849a(TowerType.AIR);
            } else if (i == 31) {
                gameScreen.m7849a(TowerType.TESLA);
            } else if (i == 50) {
                gameScreen.m7849a(TowerType.MISSILE);
            }
            if (i == 62) {
                gameScreen.m7872s();
            }
            if (i == 69) {
                gameScreen.f7162c.m7415a(gameScreen.f7162c.f6471b * 2.0d);
            } else if (i == 81) {
                gameScreen.f7162c.m7415a(gameScreen.f7162c.f6471b / 2.0d);
            }
            Game game;
            if (i == 72) {
                game = Game.game;
                game.f6585r *= 2.0d;
            } else if (i == 71) {
                game = Game.game;
                game.f6585r /= 2.0d;
            }
            if (i == 41) {
                gameScreen.m7875v();
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo332a(int i, int i2) {
        Vector2 c = this.f6596c.m7424c(i, i2);
        Tile b = this.f6597d.m7527b((int) c.f2337x, (int) c.f2338y);
        if (this.f6598e != b) {
            for (Entry key : this.f6594a.entrySet()) {
                ((GameInputListener) key.getKey()).mo1786b(b);
            }
            this.f6598e = b;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo336b(int i, int i2, int i3, int i4) {
        Vector2 c = this.f6596c.m7424c(i, i2);
        Tile b = this.f6597d.m7527b((int) c.f2337x, (int) c.f2338y);
        for (Entry key : this.f6594a.entrySet()) {
            ((GameInputListener) key.getKey()).mo1783a(b);
        }
        return false;
    }
}
