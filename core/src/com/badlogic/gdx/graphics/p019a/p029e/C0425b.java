package com.badlogic.gdx.graphics.p019a.p029e;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.p010a.C0273e;

/* renamed from: com.badlogic.gdx.graphics.a.e.b */
public interface C0425b {

    /* renamed from: com.badlogic.gdx.graphics.a.e.b$a */
    public static class C0426a implements C0425b {
        /* renamed from: a */
        public final C0273e f1589a;

        public C0426a(C0273e c0273e) {
            this.f1589a = c0273e;
        }

        /* renamed from: a */
        public final Texture mo351a(String str) {
            return (Texture) this.f1589a.m792a(str, Texture.class);
        }
    }

    /* renamed from: a */
    Texture mo351a(String str);
}
