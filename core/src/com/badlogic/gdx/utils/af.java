package com.badlogic.gdx.utils;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.C0280i;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.Gdx;

public final class af {
    /* renamed from: a */
    static final Object f3024a = new Object();
    /* renamed from: b */
    static C0678b f3025b;
    /* renamed from: c */
    private final C0676a<C0361a> f3026c = new C0676a(false, 8);

    /* renamed from: com.badlogic.gdx.utils.af$a */
    public static abstract class C0361a implements Runnable {
        /* renamed from: b */
        final Application f1289b = Gdx.app;
        /* renamed from: c */
        long f1290c;
        /* renamed from: d */
        long f1291d;
        /* renamed from: e */
        int f1292e = -1;

        public C0361a() {
            if (this.f1289b == null) {
                throw new IllegalStateException("Gdx.app not available.");
            }
        }

        /* renamed from: a */
        public final synchronized void m1024a() {
            this.f1290c = 0;
            this.f1292e = -1;
        }

        /* renamed from: b */
        public final synchronized boolean m1025b() {
            return this.f1292e != -1;
        }
    }

    /* renamed from: com.badlogic.gdx.utils.af$b */
    static class C0678b implements C0280i, Runnable {
        /* renamed from: a */
        final Files f3020a = Gdx.files;
        /* renamed from: b */
        final C0676a<af> f3021b = new C0676a(1);
        /* renamed from: c */
        af f3022c;
        /* renamed from: d */
        private long f3023d;

        public C0678b() {
            Gdx.app.addLifecycleListener(this);
            resume();
            Thread thread = new Thread(this, "Timer");
            thread.setDaemon(true);
            thread.start();
        }

        public final void dispose() {
            synchronized (af.f3024a) {
                if (af.f3025b == this) {
                    af.f3025b = null;
                }
                this.f3021b.mo530d();
                af.f3024a.notifyAll();
            }
            Gdx.app.removeLifecycleListener(this);
        }

        public final void pause() {
            synchronized (af.f3024a) {
                this.f3023d = System.nanoTime() / 1000000;
                af.f3024a.notifyAll();
            }
        }

        public final void resume() {
            synchronized (af.f3024a) {
                long nanoTime = (System.nanoTime() / 1000000) - this.f3023d;
                int i = this.f3021b.f3001b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((af) this.f3021b.m2291a(i2)).m2344a(nanoTime);
                }
                this.f3023d = 0;
                af.f3024a.notifyAll();
            }
        }

        public final void run() {
            while (true) {
                synchronized (af.f3024a) {
                    if (af.f3025b == this && this.f3020a == Gdx.files) {
                        long j = 5000;
                        if (this.f3023d == 0) {
                            long nanoTime = System.nanoTime() / 1000000;
                            int i = this.f3021b.f3001b;
                            int i2 = 0;
                            long j2 = 5000;
                            while (i2 < i) {
                                try {
                                    j2 = ((af) this.f3021b.m2291a(i2)).m2343a(nanoTime, j2);
                                    i2++;
                                } catch (Throwable th) {
                                    GdxRuntimeException gdxRuntimeException = new GdxRuntimeException("Task failed: " + ((af) this.f3021b.m2291a(i2)).getClass().getName(), th);
                                }
                            }
                            j = j2;
                        }
                        if (af.f3025b != this || this.f3020a != Gdx.files) {
                        } else if (j > 0) {
                            try {
                                af.f3024a.wait(j);
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                    dispose();
                }
            }
            dispose();
        }
    }

    public af() {
        synchronized (f3024a) {
            C0676a c0676a = m2342b().f3021b;
            if (c0676a.m2302b((Object) this)) {
                return;
            }
            c0676a.m2296a((Object) this);
            f3024a.notifyAll();
        }
    }

    /* renamed from: a */
    public static C0361a m2339a(C0361a c0361a, float f) {
        return m2340a().m2341b(c0361a, f);
    }

    /* renamed from: a */
    private static af m2340a() {
        af afVar;
        synchronized (f3024a) {
            C0678b b = m2342b();
            if (b.f3022c == null) {
                b.f3022c = new af();
            }
            afVar = b.f3022c;
        }
        return afVar;
    }

    /* renamed from: b */
    private C0361a m2341b(C0361a c0361a, float f) {
        synchronized (c0361a) {
            if (c0361a.f1292e != -1) {
                throw new IllegalArgumentException("The same task may not be scheduled twice.");
            }
            c0361a.f1290c = (System.nanoTime() / 1000000) + ((long) (1000.0f * f));
            c0361a.f1291d = 0;
            c0361a.f1292e = 0;
        }
        synchronized (this) {
            this.f3026c.m2296a((Object) c0361a);
        }
        synchronized (f3024a) {
            f3024a.notifyAll();
        }
        return c0361a;
    }

    /* renamed from: b */
    private static C0678b m2342b() {
        C0678b c0678b;
        synchronized (f3024a) {
            if (f3025b == null || f3025b.f3020a != Gdx.files) {
                if (f3025b != null) {
                    f3025b.dispose();
                }
                f3025b = new C0678b();
            }
            c0678b = f3025b;
        }
        return c0678b;
    }

    /* renamed from: a */
    final synchronized long m2343a(long j, long j2) {
        long j3;
        int i = 0;
        int i2 = this.f3026c.f3001b;
        j3 = j2;
        while (i < i2) {
            int i3;
            long j4;
            C0361a c0361a = (C0361a) this.f3026c.m2291a(i);
            synchronized (c0361a) {
                if (c0361a.f1290c > j) {
                    j3 = Math.min(j3, c0361a.f1290c - j);
                    i3 = i2;
                    i2 = i;
                    j4 = j3;
                } else {
                    if (c0361a.f1292e != -1) {
                        if (c0361a.f1292e == 0) {
                            c0361a.f1292e = -1;
                        }
                        c0361a.f1289b.postRunnable(c0361a);
                    }
                    if (c0361a.f1292e == -1) {
                        this.f3026c.mo527b(i);
                        i--;
                        i2--;
                    } else {
                        c0361a.f1290c = c0361a.f1291d + j;
                        j3 = Math.min(j3, c0361a.f1291d);
                        if (c0361a.f1292e > 0) {
                            c0361a.f1292e--;
                        }
                    }
                    i3 = i2;
                    i2 = i;
                    j4 = j3;
                }
            }
            j3 = j4;
            i = i2 + 1;
            i2 = i3;
        }
        return j3;
    }

    /* renamed from: a */
    public final synchronized void m2344a(long j) {
        int i = this.f3026c.f3001b;
        for (int i2 = 0; i2 < i; i2++) {
            C0361a c0361a = (C0361a) this.f3026c.m2291a(i2);
            synchronized (c0361a) {
                c0361a.f1290c += j;
            }
        }
    }
}
