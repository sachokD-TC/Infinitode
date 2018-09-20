package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Blending;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* renamed from: com.badlogic.gdx.graphics.glutils.n */
public final class C0499n {
    /* renamed from: a */
    private static boolean f2216a = true;

    /* renamed from: a */
    public static void m1583a(int i, Pixmap pixmap, int i2, int i3) {
        if (!f2216a) {
            C0499n.m1584b(i, pixmap, i2, i3);
        } else if (Gdx.app.getType() == ApplicationType.Android || Gdx.app.getType() == ApplicationType.WebGL || Gdx.app.getType() == ApplicationType.iOS) {
            Gdx.gl.glTexImage2D(i, 0, pixmap.m1120d(), pixmap.f1378a.f1654b, pixmap.f1378a.f1655c, 0, pixmap.m1119c(), pixmap.m1121e(), pixmap.m1122f());
            Gdx.gl20.glGenerateMipmap(i);
        } else if (Gdx.graphics.mo292a("GL_ARB_framebuffer_object") || Gdx.graphics.mo292a("GL_EXT_framebuffer_object") || Gdx.gl30 != null) {
            Gdx.gl.glTexImage2D(i, 0, pixmap.m1120d(), pixmap.f1378a.f1654b, pixmap.f1378a.f1655c, 0, pixmap.m1119c(), pixmap.m1121e(), pixmap.m1122f());
            Gdx.gl20.glGenerateMipmap(i);
        } else {
            C0499n.m1584b(i, pixmap, i2, i3);
        }
    }

    /* renamed from: b */
    private static void m1584b(int i, Pixmap pixmap, int i2, int i3) {
        Gdx.gl.glTexImage2D(i, 0, pixmap.m1120d(), pixmap.f1378a.f1654b, pixmap.f1378a.f1655c, 0, pixmap.m1119c(), pixmap.m1121e(), pixmap.m1122f());
        if (Gdx.gl20 != null || i2 == i3) {
            int i4 = pixmap.f1378a.f1654b / 2;
            int i5 = pixmap.f1378a.f1655c / 2;
            int i6 = 1;
            Pixmap pixmap2 = pixmap;
            while (i4 > 0 && i5 > 0) {
                Pixmap pixmap3 = new Pixmap(i4, i5, pixmap2.m1123g());
                pixmap3.m1113a(Blending.None);
                pixmap3.m1116a(pixmap2, 0, 0, pixmap2.f1378a.f1654b, pixmap2.f1378a.f1655c, 0, 0, i4, i5);
                if (i6 > 1) {
                    pixmap2.dispose();
                }
                Gdx.gl.glTexImage2D(i, i6, pixmap3.m1120d(), pixmap3.f1378a.f1654b, pixmap3.f1378a.f1655c, 0, pixmap3.m1119c(), pixmap3.m1121e(), pixmap3.m1122f());
                i4 = pixmap3.f1378a.f1654b / 2;
                i5 = pixmap3.f1378a.f1655c / 2;
                i6++;
                pixmap2 = pixmap3;
            }
            return;
        }
        throw new GdxRuntimeException("texture width and height must be square when using mipmapping.");
    }
}
