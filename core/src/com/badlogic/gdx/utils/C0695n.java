package com.badlogic.gdx.utils;

import com.badlogic.gdx.Gdx;

/* renamed from: com.badlogic.gdx.utils.n */
public final class C0695n {
    /* renamed from: a */
    public final String f3109a;
    /* renamed from: b */
    public int f3110b = 0;

    public C0695n(String str) {
        this.f3109a = str;
    }

    /* renamed from: a */
    public final void m2434a(String str) {
        if (this.f3110b >= 3) {
            Gdx.app.debug(this.f3109a, str);
        }
    }

    /* renamed from: b */
    public final void m2435b(String str) {
        if (this.f3110b >= 2) {
            Gdx.app.log(this.f3109a, str);
        }
    }
}
