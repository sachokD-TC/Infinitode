package com.badlogic.gdx.utils.reflect;

import java.lang.reflect.Constructor;

/* renamed from: com.badlogic.gdx.utils.reflect.b */
public final class C0714b {
    /* renamed from: a */
    public final Constructor f3199a;

    C0714b(Constructor constructor) {
        this.f3199a = constructor;
    }

    /* renamed from: a */
    public final Object m2497a(Object... objArr) {
        try {
            return this.f3199a.newInstance(objArr);
        } catch (Throwable e) {
            throw new ReflectionException("Illegal argument(s) supplied to constructor for class: " + this.f3199a.getDeclaringClass().getName(), e);
        } catch (Throwable e2) {
            throw new ReflectionException("Could not instantiate instance of class: " + this.f3199a.getDeclaringClass().getName(), e2);
        } catch (Throwable e22) {
            throw new ReflectionException("Could not instantiate instance of class: " + this.f3199a.getDeclaringClass().getName(), e22);
        } catch (Throwable e222) {
            throw new ReflectionException("Exception occurred in constructor for class: " + this.f3199a.getDeclaringClass().getName(), e222);
        }
    }

    /* renamed from: a */
    public final void m2498a() {
        this.f3199a.setAccessible(true);
    }
}
