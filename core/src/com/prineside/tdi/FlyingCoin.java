package com.prineside.tdi;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.C0480m;

public class FlyingCoin {
    /* renamed from: a */
    public static C0438n f6505a;
    /* renamed from: b */
    public static BitmapFont f6506b;
    /* renamed from: c */
    public int f6507c;
    /* renamed from: d */
    public float f6508d;
    /* renamed from: e */
    public float f6509e;
    /* renamed from: f */
    public long f6510f = Game.game.m7477t();

    public FlyingCoin(int i, float f, float f2) {
        this.f6507c = i;
        this.f6508d = f;
        this.f6509e = f2;
    }

    /* renamed from: a */
    public static void m7430a() {
        C0480m c0480m = new C0480m("textures/coin-font.pack");
        f6505a = c0480m.m1442a("coin");
        BitmapFont bitmapFont = new BitmapFont(Gdx.files.mo277b("coin.fnt"), c0480m.m1442a("font"));
        f6506b = bitmapFont;
        bitmapFont.f1821a.f1798p = false;
    }

    /* renamed from: b */
    public static void m7431b() {
        f6506b.dispose();
    }
}
