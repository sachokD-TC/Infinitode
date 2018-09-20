package com.prineside.tdi.utility;

import com.badlogic.gdx.scenes.scene2d.C0609g;
import com.badlogic.gdx.utils.C0710q;
import com.prineside.tdi.Game;

public class Debug {
    /* renamed from: a */
    public static int f8376a = 420;
    /* renamed from: b */
    public static C0710q<String, String> f8377b = new C0710q();
    /* renamed from: c */
    private static C0609g f8378c;
    /* renamed from: d */
    private static boolean f8379d = false;
    /* renamed from: e */
    private static long f8380e;
    /* renamed from: f */
    private static int[] f8381f = new int[f8376a];
    /* renamed from: g */
    private static int f8382g = 0;
    /* renamed from: h */
    private static long f8383h = 0;
    /* renamed from: i */
    private static int f8384i = 0;
    /* renamed from: j */
    private static int f8385j = 0;

    /* renamed from: a */
    public static void m8804a() {
        Game.game.m7478u();
        f8380e = Game.game.m7478u();
        if (Game.game.m7478u() - f8383h > 1000000) {
            f8383h = Game.game.m7478u();
            f8385j = f8384i;
            f8384i = 0;
            return;
        }
        f8384i++;
    }

    /* renamed from: a */
    public static void m8805a(int i, int i2) {
        if (f8378c != null) {
            f8378c.f2641b.mo522a(i, i2);
        }
    }
}
