package com.badlogic.gdx.utils.reflect;

import java.lang.reflect.Field;

/* renamed from: com.badlogic.gdx.utils.reflect.a */
public final class C0713a {
    /* renamed from: a */
    public static C0714b m2491a(Class cls, Class... clsArr) {
        try {
            return new C0714b(cls.getDeclaredConstructor(clsArr));
        } catch (Throwable e) {
            throw new ReflectionException("Security violation while getting constructor for class: " + cls.getName(), e);
        } catch (Throwable e2) {
            throw new ReflectionException("Constructor not found for class: " + cls.getName(), e2);
        }
    }

    /* renamed from: a */
    public static C0716d m2492a(Class cls, String str, Class... clsArr) {
        try {
            return new C0716d(cls.getMethod(str, clsArr));
        } catch (Throwable e) {
            throw new ReflectionException("Security violation while getting method: " + str + ", for class: " + cls.getName(), e);
        } catch (Throwable e2) {
            throw new ReflectionException("Method not found: " + str + ", for class: " + cls.getName(), e2);
        }
    }

    /* renamed from: a */
    public static Class m2493a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable e) {
            throw new ReflectionException("Class not found: " + str, e);
        }
    }

    /* renamed from: a */
    public static <T> T m2494a(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (Throwable e) {
            throw new ReflectionException("Could not instantiate instance of class: " + cls.getName(), e);
        } catch (Throwable e2) {
            throw new ReflectionException("Could not instantiate instance of class: " + cls.getName(), e2);
        }
    }

    /* renamed from: b */
    public static C0714b m2495b(Class cls) {
        try {
            return new C0714b(cls.getConstructor(null));
        } catch (Throwable e) {
            throw new ReflectionException("Security violation occurred while getting constructor for class: '" + cls.getName() + "'.", e);
        } catch (Throwable e2) {
            throw new ReflectionException("Constructor not found for class: " + cls.getName(), e2);
        }
    }

    /* renamed from: c */
    public static C0715c[] m2496c(Class cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        C0715c[] c0715cArr = new C0715c[declaredFields.length];
        int length = declaredFields.length;
        for (int i = 0; i < length; i++) {
            c0715cArr[i] = new C0715c(declaredFields[i]);
        }
        return c0715cArr;
    }
}
