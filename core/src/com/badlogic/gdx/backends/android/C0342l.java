package com.badlogic.gdx.backends.android;

import android.content.Context;
import android.os.Build.VERSION;
import com.badlogic.gdx.Application;

/* renamed from: com.badlogic.gdx.backends.android.l */
public final class C0342l {
    /* renamed from: a */
    public static C0341k m981a(Application application, Context context, Object obj, C0310b c0310b) {
        try {
            return (C0341k) (VERSION.SDK_INT >= 12 ? Class.forName("com.badlogic.gdx.backends.android.m") : Class.forName("com.badlogic.gdx.backends.android.k")).getConstructor(new Class[]{Application.class, Context.class, Object.class, C0310b.class}).newInstance(new Object[]{application, context, obj, c0310b});
        } catch (Throwable e) {
            throw new RuntimeException("Couldn't construct AndroidInput, this should never happen", e);
        }
    }
}
