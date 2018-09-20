package com.badlogic.gdx.backends.android;

import android.util.Log;
import com.badlogic.gdx.C0279b;

/* renamed from: com.badlogic.gdx.backends.android.c */
public final class C0311c implements C0279b {
    /* renamed from: a */
    public final void mo257a(String str, String str2) {
        Log.i(str, str2);
    }

    /* renamed from: a */
    public final void mo258a(String str, String str2, Throwable th) {
        Log.i(str, str2, th);
    }

    /* renamed from: b */
    public final void mo259b(String str, String str2) {
        Log.e(str, str2);
    }

    /* renamed from: b */
    public final void mo260b(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    /* renamed from: c */
    public final void mo261c(String str, String str2) {
        Log.d(str, str2);
    }

    /* renamed from: c */
    public final void mo262c(String str, String str2, Throwable th) {
        Log.d(str, str2, th);
    }
}
