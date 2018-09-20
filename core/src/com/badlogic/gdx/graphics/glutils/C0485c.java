package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0380h;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.Texture.TextureWrap;

/* renamed from: com.badlogic.gdx.graphics.glutils.c */
public final class C0485c extends C0484d<Texture> {
    C0485c() {
    }

    public C0485c(Format format, int i, int i2) {
        this(format, i, i2, (byte) 0);
    }

    private C0485c(Format format, int i, int i2, byte b) {
        C0486d c0487a = new C0487a(i, i2);
        c0487a.mo405a(format);
        this.k = c0487a;
        m1496c();
    }

    /* renamed from: a */
    protected final /* synthetic */ C0380h mo401a(C0489c c0489c) {
        C0380h texture = new Texture(new C0490e(this.k.f2144a, this.k.f2145b, c0489c.f2154a, c0489c.f2155b, c0489c.f2156c));
        texture.m1129b(TextureFilter.Linear, TextureFilter.Linear);
        texture.m1130b(TextureWrap.ClampToEdge, TextureWrap.ClampToEdge);
        return texture;
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo402a(C0380h c0380h) {
        Gdx.gl20.glFramebufferTexture2D(36160, 36064, 3553, ((Texture) c0380h).m1136i(), 0);
    }

    /* renamed from: b */
    protected final /* bridge */ /* synthetic */ void mo403b(C0380h c0380h) {
        ((Texture) c0380h).dispose();
    }
}
