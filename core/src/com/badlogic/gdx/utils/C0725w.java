package com.badlogic.gdx.utils;

import com.badlogic.gdx.utils.reflect.C0713a;
import com.badlogic.gdx.utils.reflect.C0714b;
import com.badlogic.gdx.utils.reflect.ReflectionException;

/* renamed from: com.badlogic.gdx.utils.w */
public final class C0725w<T> extends C0328t<T> {
    /* renamed from: a */
    private final C0714b f3226a;

    public C0725w(Class<T> cls) {
        super(4, 100);
        this.f3226a = C0725w.m2518a(cls);
        if (this.f3226a == null) {
            throw new RuntimeException("Class cannot be created (missing no-arg constructor): " + cls.getName());
        }
    }

    /* renamed from: a */
    private static C0714b m2518a(Class<T> cls) {
        try {
            return C0713a.m2495b(cls);
        } catch (Exception e) {
            try {
                C0714b a = C0713a.m2491a(cls, null);
                a.m2498a();
                return a;
            } catch (ReflectionException e2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    protected final T mo301a() {
        try {
            return this.f3226a.m2497a(null);
        } catch (Throwable e) {
            throw new GdxRuntimeException("Unable to create new instance: " + this.f3226a.f3199a.getDeclaringClass().getName(), e);
        }
    }
}
