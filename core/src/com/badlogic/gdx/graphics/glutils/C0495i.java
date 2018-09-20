package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.badlogic.gdx.graphics.glutils.i */
public final class C0495i implements C0494l {
    /* renamed from: a */
    final ShortBuffer f2183a;
    /* renamed from: b */
    final ByteBuffer f2184b;
    /* renamed from: c */
    private final boolean f2185c = false;

    public C0495i(int i) {
        if (this.f2185c) {
            i = 1;
        }
        this.f2184b = BufferUtils.m2247c(i * 2);
        this.f2183a = this.f2184b.asShortBuffer();
        this.f2183a.flip();
        this.f2184b.flip();
    }

    /* renamed from: a */
    public final int mo414a() {
        return this.f2185c ? 0 : this.f2183a.limit();
    }

    /* renamed from: a */
    public final void mo415a(short[] sArr, int i) {
        this.f2183a.clear();
        this.f2183a.put(sArr, 0, i);
        this.f2183a.flip();
        this.f2184b.position(0);
        this.f2184b.limit(i << 1);
    }

    /* renamed from: b */
    public final void dispose() {
        BufferUtils.m2243a(this.f2184b);
    }

    /* renamed from: c */
    public final int mo416c() {
        return this.f2185c ? 0 : this.f2183a.capacity();
    }

    /* renamed from: d */
    public final ShortBuffer mo417d() {
        return this.f2183a;
    }

    /* renamed from: e */
    public final void mo418e() {
    }

    /* renamed from: f */
    public final void mo419f() {
    }

    /* renamed from: g */
    public final void mo420g() {
    }
}
