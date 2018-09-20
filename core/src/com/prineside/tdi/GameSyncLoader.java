package com.prineside.tdi;

import com.badlogic.gdx.utils.C0676a;

public class GameSyncLoader {
    /* renamed from: a */
    public C0676a<String> f6599a = new C0676a();
    /* renamed from: b */
    public int f6600b = 0;
    /* renamed from: c */
    private C0676a<Runnable> f6601c = new C0676a();

    /* renamed from: a */
    public final void m7485a() {
        if (this.f6600b >= this.f6601c.f3001b) {
            Game.game.logger.m7510b("GameSyncLoader", "All work is done, nothing to iterate through");
            return;
        }
        long t = Game.game.m7477t();
        while (this.f6600b < this.f6601c.f3001b) {
            try {
                ((Runnable) this.f6601c.m2291a(this.f6600b)).run();
                this.f6600b++;
                if (Game.game.m7477t() - t > 0) {
                    return;
                }
            } catch (Throwable e) {
                throw new RuntimeException("GameSyncLoader - exception while executing '" + ((String) this.f6599a.m2291a(this.f6600b)) + "'", e);
            }
        }
    }

    /* renamed from: a */
    public final void m7486a(Runnable runnable, String str) {
        this.f6601c.m2296a((Object) runnable);
        this.f6599a.m2296a((Object) str);
    }

    /* renamed from: b */
    public final float m7487b() {
        return ((float) this.f6600b) / ((float) (this.f6601c.f3001b - 1));
    }

    /* renamed from: c */
    public final boolean m7488c() {
        return this.f6600b >= this.f6601c.f3001b;
    }
}
