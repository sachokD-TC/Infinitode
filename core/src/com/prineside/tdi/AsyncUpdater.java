package com.prineside.tdi;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0712r;
import java.util.Iterator;

public class AsyncUpdater implements Runnable {
    /* renamed from: a */
    public int f6430a;
    /* renamed from: b */
    public int f6431b = 0;
    /* renamed from: c */
    public final C0712r<AsyncUpdatable> f6432c = new C0712r();
    /* renamed from: d */
    public final C0676a<AsyncUpdatable> f6433d = new C0676a();
    /* renamed from: e */
    private final C0676a<AsyncUpdatable> f6434e = new C0676a();

    public AsyncUpdater(int i) {
        this.f6430a = i;
    }

    /* renamed from: a */
    public final synchronized void m7403a(AsyncUpdatable asyncUpdatable) {
        this.f6431b++;
        synchronized (this.f6434e) {
            this.f6434e.m2296a((Object) asyncUpdatable);
        }
    }

    public void run() {
        Game.game.logger.log("TU-" + this.f6430a, "run");
        Thread.currentThread().setUncaughtExceptionHandler(Game.f6550d);
        while (true) {
            try {
                Iterator it;
                synchronized (this.f6433d) {
                    if (this.f6433d.f3001b != 0) {
                        it = this.f6433d.iterator();
                        while (it.hasNext()) {
                            if (this.f6432c.m2488b((AsyncUpdatable) it.next())) {
                                this.f6431b--;
                            }
                        }
                        this.f6433d.mo530d();
                    }
                }
                synchronized (this.f6434e) {
                    if (this.f6434e.f3001b != 0) {
                        it = this.f6434e.iterator();
                        while (it.hasNext()) {
                            this.f6432c.m2486a((AsyncUpdatable) it.next());
                        }
                        this.f6434e.mo530d();
                    }
                }
                long u = Game.game.m7478u();
                if (!Game.game.f6586s) {
                    Iterator c = this.f6432c.m2489c();
                    while (c.hasNext()) {
                        ((AsyncUpdatable) c.next()).mo1753d();
                    }
                }
                long u2 = (Game.game.f6587t - (Game.game.m7478u() - u)) / 1000;
                if (u2 < 0) {
                    u2 = 0;
                }
                Thread.sleep(u2);
            } catch (InterruptedException e) {
                Game.game.logger.log("AU-" + this.f6430a, "Interrupted");
                return;
            } catch (final Throwable e2) {
                Game.game.logger.m7510b("AU-" + this.f6430a, "exception: " + e2.getMessage());
                Game.game.logger.m7509a(e2);
                Gdx.app.postRunnable(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ AsyncUpdater f6429b;

                    public void run() {
                        throw new RuntimeException("Exception in AsyncUpdater: " + e2.getMessage(), e2);
                    }
                });
                return;
            }
        }
    }
}
