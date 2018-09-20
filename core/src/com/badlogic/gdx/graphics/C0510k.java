package com.badlogic.gdx.graphics;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.badlogic.gdx.graphics.k */
public final class C0510k extends C0380h {
    /* renamed from: a */
    static final Map<Application, C0676a<C0510k>> f2283a = new HashMap();
    /* renamed from: b */
    private C0511l f2284b;

    /* renamed from: a */
    public static void m1660a(Application application) {
        f2283a.remove(application);
    }

    /* renamed from: b */
    public static void m1661b(Application application) {
        C0676a c0676a = (C0676a) f2283a.get(application);
        if (c0676a != null) {
            for (int i = 0; i < c0676a.f3001b; i++) {
                ((C0510k) c0676a.m2291a(i)).mo345a();
            }
        }
    }

    /* renamed from: a */
    protected final void mo345a() {
        if (this.f2284b.m1666d()) {
            this.d = Gdx.gl.glGenTexture();
            C0511l c0511l = this.f2284b;
            if (this.f2284b == null || c0511l.m1666d() == this.f2284b.m1666d()) {
                this.f2284b = c0511l;
                m1131d();
                Gdx.gl30.mo287a(c0511l.m1667e(), c0511l.m1663a(), c0511l.m1664b(), c0511l.m1665c(), c0511l.m1667e(), c0511l.m1668f());
                m1129b(this.e, this.f);
                m1130b(this.g, this.h);
                Gdx.gl.glBindTexture(this.c, 0);
                return;
            }
            throw new GdxRuntimeException("New data must have the same managed status as the old data");
        }
        throw new GdxRuntimeException("Tried to reload an unmanaged TextureArray");
    }
}
