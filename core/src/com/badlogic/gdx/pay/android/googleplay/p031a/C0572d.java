package com.badlogic.gdx.pay.android.googleplay.p031a;

/* renamed from: com.badlogic.gdx.pay.android.googleplay.a.d */
public final class C0572d implements C0569b {
    /* renamed from: a */
    public final void mo449a(final Runnable runnable) {
        new Thread(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ long f2496a = 3000;
            /* renamed from: c */
            final /* synthetic */ C0572d f2498c;

            public final void run() {
                try {
                    Thread.sleep(this.f2496a);
                    runnable.run();
                } catch (InterruptedException e) {
                }
            }
        }).start();
    }
}
