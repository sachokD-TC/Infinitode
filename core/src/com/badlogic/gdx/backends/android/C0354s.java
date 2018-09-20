package com.badlogic.gdx.backends.android;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import com.badlogic.gdx.C0353k;
import java.util.Map;

/* renamed from: com.badlogic.gdx.backends.android.s */
public final class C0354s implements C0353k {
    /* renamed from: a */
    SharedPreferences f1272a;
    /* renamed from: b */
    Editor f1273b;

    public C0354s(SharedPreferences sharedPreferences) {
        this.f1272a = sharedPreferences;
    }

    /* renamed from: d */
    private void m1003d() {
        if (this.f1273b == null) {
            this.f1273b = this.f1272a.edit();
        }
    }

    /* renamed from: a */
    public final C0353k mo315a(String str, String str2) {
        m1003d();
        this.f1273b.putString(str, str2);
        return this;
    }

    /* renamed from: a */
    public final String mo316a(String str) {
        return this.f1272a.getString(str, "");
    }

    /* renamed from: a */
    public final Map<String, ?> mo317a() {
        return this.f1272a.getAll();
    }

    /* renamed from: b */
    public final void mo318b() {
        m1003d();
        this.f1273b.clear();
    }

    /* renamed from: b */
    public final boolean mo319b(String str) {
        return this.f1272a.contains(str);
    }

    /* renamed from: c */
    public final void mo320c() {
        if (this.f1273b != null) {
            if (VERSION.SDK_INT >= 9) {
                this.f1273b.apply();
            } else {
                this.f1273b.commit();
            }
            this.f1273b = null;
        }
    }

    /* renamed from: c */
    public final void mo321c(String str) {
        m1003d();
        this.f1273b.remove(str);
    }
}
