package com.badlogic.gdx.utils.p013a;

import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.badlogic.gdx.utils.a.b */
public final class C0675b<T> {
    /* renamed from: a */
    private final Future<T> f2999a;

    C0675b(Future<T> future) {
        this.f2999a = future;
    }

    /* renamed from: a */
    public final boolean m2286a() {
        return this.f2999a.isDone();
    }

    /* renamed from: b */
    public final T m2287b() {
        try {
            return this.f2999a.get();
        } catch (InterruptedException e) {
            return null;
        } catch (ExecutionException e2) {
            throw new GdxRuntimeException(e2.getCause());
        }
    }
}
