package com.badlogic.gdx.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.Texture.TextureWrap;
import com.badlogic.gdx.utils.Disposable;

/* renamed from: com.badlogic.gdx.graphics.h */
public abstract class C0380h implements Disposable {
    /* renamed from: c */
    public final int f1396c;
    /* renamed from: d */
    protected int f1397d;
    /* renamed from: e */
    protected TextureFilter f1398e;
    /* renamed from: f */
    protected TextureFilter f1399f;
    /* renamed from: g */
    protected TextureWrap f1400g;
    /* renamed from: h */
    protected TextureWrap f1401h;

    public C0380h() {
        this(34067, Gdx.gl.glGenTexture());
    }

    public C0380h(int i, int i2) {
        this.f1398e = TextureFilter.Nearest;
        this.f1399f = TextureFilter.Nearest;
        this.f1400g = TextureWrap.ClampToEdge;
        this.f1401h = TextureWrap.ClampToEdge;
        this.f1396c = i;
        this.f1397d = i2;
    }

    /* renamed from: a */
    protected abstract void mo345a();

    /* renamed from: a */
    public final void m1126a(TextureFilter textureFilter, TextureFilter textureFilter2) {
        if (textureFilter != null) {
            Gdx.gl.glTexParameterf(this.f1396c, 10241, (float) textureFilter.glEnum);
            this.f1398e = textureFilter;
        }
        if (textureFilter2 != null) {
            Gdx.gl.glTexParameterf(this.f1396c, 10240, (float) textureFilter2.glEnum);
            this.f1399f = textureFilter2;
        }
    }

    /* renamed from: a */
    public final void m1127a(TextureWrap textureWrap, TextureWrap textureWrap2) {
        if (textureWrap != null) {
            Gdx.gl.glTexParameterf(this.f1396c, 10242, (float) textureWrap.glEnum);
            this.f1400g = textureWrap;
        }
        if (textureWrap2 != null) {
            Gdx.gl.glTexParameterf(this.f1396c, 10243, (float) textureWrap2.glEnum);
            this.f1401h = textureWrap2;
        }
    }

    /* renamed from: b */
    public void dispose() {
        m1137j();
    }

    /* renamed from: b */
    public final void m1129b(TextureFilter textureFilter, TextureFilter textureFilter2) {
        this.f1398e = textureFilter;
        this.f1399f = textureFilter2;
        m1131d();
        Gdx.gl.glTexParameterf(this.f1396c, 10241, (float) textureFilter.glEnum);
        Gdx.gl.glTexParameterf(this.f1396c, 10240, (float) textureFilter2.glEnum);
    }

    /* renamed from: b */
    public final void m1130b(TextureWrap textureWrap, TextureWrap textureWrap2) {
        this.f1400g = textureWrap;
        this.f1401h = textureWrap2;
        m1131d();
        Gdx.gl.glTexParameterf(this.f1396c, 10242, (float) textureWrap.glEnum);
        Gdx.gl.glTexParameterf(this.f1396c, 10243, (float) textureWrap2.glEnum);
    }

    /* renamed from: d */
    public final void m1131d() {
        Gdx.gl.glBindTexture(this.f1396c, this.f1397d);
    }

    /* renamed from: e */
    public final TextureFilter m1132e() {
        return this.f1398e;
    }

    /* renamed from: f */
    public final TextureFilter m1133f() {
        return this.f1399f;
    }

    /* renamed from: g */
    public final TextureWrap m1134g() {
        return this.f1400g;
    }

    /* renamed from: h */
    public final TextureWrap m1135h() {
        return this.f1401h;
    }

    /* renamed from: i */
    public final int m1136i() {
        return this.f1397d;
    }

    /* renamed from: j */
    protected final void m1137j() {
        if (this.f1397d != 0) {
            Gdx.gl.glDeleteTexture(this.f1397d);
            this.f1397d = 0;
        }
    }
}
