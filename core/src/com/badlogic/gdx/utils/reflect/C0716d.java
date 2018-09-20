package com.badlogic.gdx.utils.reflect;

import java.lang.reflect.Method;

/* renamed from: com.badlogic.gdx.utils.reflect.d */
public final class C0716d {
    /* renamed from: a */
    private final Method f3201a;

    C0716d(Method method) {
        this.f3201a = method;
    }

    /* renamed from: a */
    public final Object m2499a(Object... objArr) {
        try {
            return this.f3201a.invoke(null, objArr);
        } catch (Throwable e) {
            throw new ReflectionException("Illegal argument(s) supplied to method: " + this.f3201a.getName(), e);
        } catch (Throwable e2) {
            throw new ReflectionException("Illegal access to method: " + this.f3201a.getName(), e2);
        } catch (Throwable e22) {
            throw new ReflectionException("Exception occurred in method: " + this.f3201a.getName(), e22);
        }
    }
}
