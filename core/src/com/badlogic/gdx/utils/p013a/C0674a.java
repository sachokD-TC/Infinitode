package com.badlogic.gdx.utils.p013a;

import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: com.badlogic.gdx.utils.a.a */
public final class C0674a implements Disposable {
    /* renamed from: a */
    private final ExecutorService f2998a = Executors.newFixedThreadPool(1, new C06721(this));

    /* renamed from: com.badlogic.gdx.utils.a.a$1 */
    class C06721 implements ThreadFactory {
        /* renamed from: a */
        final /* synthetic */ C0674a f2995a;

        C06721(C0674a c0674a) {
            this.f2995a = c0674a;
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AsynchExecutor-Thread");
            thread.setDaemon(true);
            return thread;
        }
    }

    /* renamed from: a */
    public final <T> C0675b<T> m2284a(final C0270c<T> c0270c) {
        if (!this.f2998a.isShutdown()) {
            return new C0675b(this.f2998a.submit(new Callable<T>(this) {
                /* renamed from: b */
                final /* synthetic */ C0674a f2997b;

                public final T call() {
                    return c0270c.mo155b();
                }
            }));
        }
        throw new GdxRuntimeException("Cannot run tasks on an executor that has been shutdown (disposed)");
    }

    /* renamed from: b */
    public final void dispose() {
        this.f2998a.shutdown();
        try {
            this.f2998a.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch (Throwable e) {
            throw new GdxRuntimeException("Couldn't shutdown loading thread", e);
        }
    }
}
