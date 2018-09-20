package com.badlogic.gdx.graphics;

import com.badlogic.gdx.graphics.C0509j.C0508a;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.glutils.C0482a;
import com.badlogic.gdx.graphics.glutils.C0483b;
import com.badlogic.gdx.graphics.glutils.C0498m;
import com.badlogic.gdx.p016c.C0316a;

public interface TextureData {

    public enum TextureDataType {
        Pixmap,
        Custom
    }

    /* renamed from: com.badlogic.gdx.graphics.TextureData$a */
    public static class C0381a {
        /* renamed from: a */
        public static TextureData m1146a(C0316a c0316a, Format format, boolean z) {
            return c0316a == null ? null : c0316a.f1119a.getName().endsWith(".cim") ? new C0483b(c0316a, C0508a.m1659a(c0316a), format, z) : c0316a.f1119a.getName().endsWith(".etc1") ? new C0482a(c0316a, z) : (c0316a.f1119a.getName().endsWith(".ktx") || c0316a.f1119a.getName().endsWith(".zktx")) ? new C0498m(c0316a, z) : new C0483b(c0316a, new Pixmap(c0316a), format, z);
        }
    }

    /* renamed from: a */
    void mo390a(int i);

    /* renamed from: a */
    boolean mo391a();

    /* renamed from: b */
    void mo392b();

    /* renamed from: d */
    boolean mo393d();

    /* renamed from: e */
    TextureDataType mo394e();

    /* renamed from: f */
    Pixmap mo395f();

    /* renamed from: g */
    boolean mo396g();

    /* renamed from: h */
    int mo397h();

    /* renamed from: i */
    int mo398i();

    /* renamed from: j */
    Format mo399j();

    /* renamed from: k */
    boolean mo400k();
}
