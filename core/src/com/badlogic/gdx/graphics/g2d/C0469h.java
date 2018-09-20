package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Blending;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.graphics.glutils.C0500o;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0720s;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.Iterator;

/* renamed from: com.badlogic.gdx.graphics.g2d.h */
public final class C0469h implements Disposable {
    /* renamed from: a */
    public boolean f2000a;
    /* renamed from: b */
    boolean f2001b;
    /* renamed from: c */
    int f2002c;
    /* renamed from: d */
    int f2003d;
    /* renamed from: e */
    Format f2004e;
    /* renamed from: f */
    int f2005f;
    /* renamed from: g */
    boolean f2006g;
    /* renamed from: h */
    public C0430b f2007h = new C0430b(0.0f, 0.0f, 0.0f, 0.0f);
    /* renamed from: i */
    public final C0676a<C0460c> f2008i = new C0676a();
    /* renamed from: j */
    C0463b f2009j;

    /* renamed from: com.badlogic.gdx.graphics.g2d.h$c */
    public static class C0460c {
        /* renamed from: b */
        C0720s<String, Rectangle> f1985b = new C0720s();
        /* renamed from: c */
        Pixmap f1986c;
        /* renamed from: d */
        Texture f1987d;
        /* renamed from: e */
        final C0676a<String> f1988e = new C0676a();
        /* renamed from: f */
        boolean f1989f;

        /* renamed from: com.badlogic.gdx.graphics.g2d.h$c$1 */
        class C04651 extends Texture {
            /* renamed from: i */
            final /* synthetic */ C0460c f1995i;

            C04651(C0460c c0460c, TextureData textureData) {
                this.f1995i = c0460c;
                super(textureData);
            }

            /* renamed from: b */
            public final void dispose() {
                super.dispose();
                this.f1995i.f1986c.dispose();
            }
        }

        public C0460c(C0469h c0469h) {
            this.f1986c = new Pixmap(c0469h.f2002c, c0469h.f2003d, c0469h.f2004e);
            this.f1986c.m1117a(c0469h.f2007h);
            this.f1986c.m1111a();
        }
    }

    /* renamed from: com.badlogic.gdx.graphics.g2d.h$b */
    public interface C0463b {
        /* renamed from: a */
        C0460c mo364a(C0469h c0469h, Rectangle rectangle);
    }

    /* renamed from: com.badlogic.gdx.graphics.g2d.h$a */
    public static class C0464a implements C0463b {

        /* renamed from: com.badlogic.gdx.graphics.g2d.h$a$a */
        static class C0461a extends C0460c {
            /* renamed from: a */
            C0462b f1990a = new C0462b();

            public C0461a(C0469h c0469h) {
                super(c0469h);
                this.f1990a.f1993c.f2332x = (float) c0469h.f2005f;
                this.f1990a.f1993c.f2333y = (float) c0469h.f2005f;
                this.f1990a.f1993c.width = (float) (c0469h.f2002c - (c0469h.f2005f * 2));
                this.f1990a.f1993c.height = (float) (c0469h.f2003d - (c0469h.f2005f * 2));
            }
        }

        /* renamed from: com.badlogic.gdx.graphics.g2d.h$a$b */
        static final class C0462b {
            /* renamed from: a */
            public C0462b f1991a;
            /* renamed from: b */
            public C0462b f1992b;
            /* renamed from: c */
            public final Rectangle f1993c = new Rectangle();
            /* renamed from: d */
            public boolean f1994d;

            C0462b() {
            }
        }

        /* renamed from: a */
        private C0462b m1387a(C0462b c0462b, Rectangle rectangle) {
            while (true) {
                if (!c0462b.f1994d && c0462b.f1991a != null && c0462b.f1992b != null) {
                    break;
                } else if (c0462b.f1994d) {
                    return null;
                } else {
                    if (c0462b.f1993c.width == rectangle.width && c0462b.f1993c.height == rectangle.height) {
                        return c0462b;
                    }
                    if (c0462b.f1993c.width < rectangle.width || c0462b.f1993c.height < rectangle.height) {
                        return null;
                    }
                    c0462b.f1991a = new C0462b();
                    c0462b.f1992b = new C0462b();
                    if (((int) c0462b.f1993c.width) - ((int) rectangle.width) > ((int) c0462b.f1993c.height) - ((int) rectangle.height)) {
                        c0462b.f1991a.f1993c.f2332x = c0462b.f1993c.f2332x;
                        c0462b.f1991a.f1993c.f2333y = c0462b.f1993c.f2333y;
                        c0462b.f1991a.f1993c.width = rectangle.width;
                        c0462b.f1991a.f1993c.height = c0462b.f1993c.height;
                        c0462b.f1992b.f1993c.f2332x = c0462b.f1993c.f2332x + rectangle.width;
                        c0462b.f1992b.f1993c.f2333y = c0462b.f1993c.f2333y;
                        c0462b.f1992b.f1993c.width = c0462b.f1993c.width - rectangle.width;
                        c0462b.f1992b.f1993c.height = c0462b.f1993c.height;
                    } else {
                        c0462b.f1991a.f1993c.f2332x = c0462b.f1993c.f2332x;
                        c0462b.f1991a.f1993c.f2333y = c0462b.f1993c.f2333y;
                        c0462b.f1991a.f1993c.width = c0462b.f1993c.width;
                        c0462b.f1991a.f1993c.height = rectangle.height;
                        c0462b.f1992b.f1993c.f2332x = c0462b.f1993c.f2332x;
                        c0462b.f1992b.f1993c.f2333y = c0462b.f1993c.f2333y + rectangle.height;
                        c0462b.f1992b.f1993c.width = c0462b.f1993c.width;
                        c0462b.f1992b.f1993c.height = c0462b.f1993c.height - rectangle.height;
                    }
                    c0462b = c0462b.f1991a;
                }
            }
            C0462b a = m1387a(c0462b.f1991a, rectangle);
            return a == null ? m1387a(c0462b.f1992b, rectangle) : a;
        }

        /* renamed from: a */
        public final C0460c mo364a(C0469h c0469h, Rectangle rectangle) {
            C0460c c0461a;
            C0460c c0461a2;
            C0462b a;
            if (c0469h.f2008i.f3001b == 0) {
                c0461a = new C0461a(c0469h);
                c0469h.f2008i.m2296a((Object) c0461a);
            } else {
                C0461a c0461a3 = (C0461a) c0469h.f2008i.m2299b();
            }
            int i = c0469h.f2005f;
            rectangle.width += (float) i;
            rectangle.height += (float) i;
            C0462b a2 = m1387a(c0461a.f1990a, rectangle);
            if (a2 == null) {
                c0461a2 = new C0461a(c0469h);
                c0469h.f2008i.m2296a((Object) c0461a2);
                a = m1387a(c0461a2.f1990a, rectangle);
            } else {
                C0462b c0462b = a2;
                c0461a2 = c0461a;
                a = c0462b;
            }
            a.f1994d = true;
            rectangle.m1698a(a.f1993c.f2332x, a.f1993c.f2333y, a.f1993c.width - ((float) i), a.f1993c.height - ((float) i));
            return c0461a2;
        }
    }

    /* renamed from: com.badlogic.gdx.graphics.g2d.h$d */
    public static class C0468d implements C0463b {

        /* renamed from: com.badlogic.gdx.graphics.g2d.h$d$a */
        static class C0467a extends C0460c {
            /* renamed from: a */
            C0676a<C0466a> f1999a = new C0676a();

            /* renamed from: com.badlogic.gdx.graphics.g2d.h$d$a$a */
            static class C0466a {
                /* renamed from: a */
                int f1996a;
                /* renamed from: b */
                int f1997b;
                /* renamed from: c */
                int f1998c;

                C0466a() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/2043318969.run(Unknown Source)
*/
                    /*
                    r0 = this;
                    r0.<init>();
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.graphics.g2d.h.d.a.a.<init>():void");
                }
            }

            public C0467a(C0469h r2) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/2043318969.run(Unknown Source)
*/
                /*
                r1 = this;
                r1.<init>(r2);
                r0 = new com.badlogic.gdx.utils.a;
                r0.<init>();
                r1.f1999a = r0;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.graphics.g2d.h.d.a.<init>(com.badlogic.gdx.graphics.g2d.h):void");
            }
        }

        /* renamed from: a */
        public final C0460c mo364a(C0469h r16, Rectangle r17) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/2043318969.run(Unknown Source)
*/
            /*
            r15 = this;
            r0 = r16;
            r6 = r0.f2005f;
            r0 = r16;
            r1 = r0.f2002c;
            r2 = r6 * 2;
            r7 = r1 - r2;
            r0 = r16;
            r1 = r0.f2003d;
            r2 = r6 * 2;
            r8 = r1 - r2;
            r0 = r17;
            r1 = r0.width;
            r1 = (int) r1;
            r9 = r1 + r6;
            r0 = r17;
            r1 = r0.height;
            r1 = (int) r1;
            r10 = r1 + r6;
            r1 = 0;
            r0 = r16;
            r2 = r0.f2008i;
            r11 = r2.f3001b;
            r5 = r1;
        L_0x002a:
            if (r5 >= r11) goto L_0x00b0;
        L_0x002c:
            r0 = r16;
            r1 = r0.f2008i;
            r1 = r1.m2291a(r5);
            r1 = (com.badlogic.gdx.graphics.g2d.C0469h.C0468d.C0467a) r1;
            r3 = 0;
            r2 = 0;
            r4 = r1.f1999a;
            r4 = r4.f3001b;
            r12 = r4 + -1;
            r4 = r2;
        L_0x003f:
            if (r4 >= r12) goto L_0x0064;
        L_0x0041:
            r2 = r1.f1999a;
            r2 = r2.m2291a(r4);
            r2 = (com.badlogic.gdx.graphics.g2d.C0469h.C0468d.C0467a.C0466a) r2;
            r13 = r2.f1996a;
            r13 = r13 + r9;
            if (r13 >= r7) goto L_0x00dd;
        L_0x004e:
            r13 = r2.f1997b;
            r13 = r13 + r10;
            if (r13 >= r8) goto L_0x00dd;
        L_0x0053:
            r13 = r2.f1998c;
            if (r10 > r13) goto L_0x00dd;
        L_0x0057:
            if (r3 == 0) goto L_0x005f;
        L_0x0059:
            r13 = r2.f1998c;
            r14 = r3.f1998c;
            if (r13 >= r14) goto L_0x00dd;
        L_0x005f:
            r3 = r4 + 1;
            r4 = r3;
            r3 = r2;
            goto L_0x003f;
        L_0x0064:
            if (r3 != 0) goto L_0x00db;
        L_0x0066:
            r2 = r1.f1999a;
            r2 = r2.m2299b();
            r2 = (com.badlogic.gdx.graphics.g2d.C0469h.C0468d.C0467a.C0466a) r2;
            r3 = r2.f1997b;
            r3 = r3 + r10;
            if (r3 >= r8) goto L_0x00ab;
        L_0x0073:
            r3 = r2.f1996a;
            r3 = r3 + r9;
            if (r3 >= r7) goto L_0x0096;
        L_0x0078:
            r3 = r2.f1998c;
            r3 = java.lang.Math.max(r3, r10);
            r2.f1998c = r3;
        L_0x0080:
            if (r2 == 0) goto L_0x00ab;
        L_0x0082:
            r3 = r2.f1996a;
            r3 = (float) r3;
            r0 = r17;
            r0.f2332x = r3;
            r3 = r2.f1997b;
            r3 = (float) r3;
            r0 = r17;
            r0.f2333y = r3;
            r3 = r2.f1996a;
            r3 = r3 + r9;
            r2.f1996a = r3;
        L_0x0095:
            return r1;
        L_0x0096:
            r3 = new com.badlogic.gdx.graphics.g2d.h$d$a$a;
            r3.<init>();
            r4 = r2.f1997b;
            r2 = r2.f1998c;
            r2 = r2 + r4;
            r3.f1997b = r2;
            r3.f1998c = r10;
            r2 = r1.f1999a;
            r2.m2296a(r3);
            r2 = r3;
            goto L_0x0080;
        L_0x00ab:
            r1 = r5 + 1;
            r5 = r1;
            goto L_0x002a;
        L_0x00b0:
            r1 = new com.badlogic.gdx.graphics.g2d.h$d$a;
            r0 = r16;
            r1.<init>(r0);
            r0 = r16;
            r2 = r0.f2008i;
            r2.m2296a(r1);
            r2 = new com.badlogic.gdx.graphics.g2d.h$d$a$a;
            r2.<init>();
            r3 = r6 + r9;
            r2.f1996a = r3;
            r2.f1997b = r6;
            r2.f1998c = r10;
            r3 = r1.f1999a;
            r3.m2296a(r2);
            r2 = (float) r6;
            r0 = r17;
            r0.f2332x = r2;
            r2 = (float) r6;
            r0 = r17;
            r0.f2333y = r2;
            goto L_0x0095;
        L_0x00db:
            r2 = r3;
            goto L_0x0080;
        L_0x00dd:
            r2 = r3;
            goto L_0x005f;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.graphics.g2d.h.d.a(com.badlogic.gdx.graphics.g2d.h, com.badlogic.gdx.math.Rectangle):com.badlogic.gdx.graphics.g2d.h$c");
        }
    }

    public C0469h(int i, int i2, Format format, C0463b c0463b) {
        this.f2002c = i;
        this.f2003d = i2;
        this.f2004e = format;
        this.f2005f = 1;
        this.f2006g = false;
        this.f2009j = c0463b;
    }

    /* renamed from: a */
    private synchronized void m1391a(TextureFilter textureFilter, TextureFilter textureFilter2, boolean z) {
        Iterator it = this.f2008i.iterator();
        while (it.hasNext()) {
            C0460c c0460c = (C0460c) it.next();
            if (c0460c.f1987d == null) {
                c0460c.f1987d = new C04651(c0460c, new C0500o(c0460c.f1986c, c0460c.f1986c.m1123g(), z, false, true));
                c0460c.f1987d.m1129b(textureFilter, textureFilter2);
            } else if (c0460c.f1989f) {
                c0460c.f1987d.m1142a(c0460c.f1987d.f1404b);
            }
            c0460c.f1989f = false;
        }
    }

    /* renamed from: b */
    private synchronized Rectangle m1392b(Pixmap pixmap) {
        Rectangle rectangle;
        if (this.f2001b) {
            rectangle = null;
        } else {
            Rectangle rectangle2 = new Rectangle((float) pixmap.f1378a.f1654b, (float) pixmap.f1378a.f1655c);
            if (rectangle2.width > ((float) this.f2002c) || rectangle2.height > ((float) this.f2003d)) {
                throw new GdxRuntimeException("Page size too small for pixmap.");
            }
            C0460c a = this.f2009j.mo364a(this, rectangle2);
            int i = (int) rectangle2.f2332x;
            int i2 = (int) rectangle2.f2333y;
            int i3 = (int) rectangle2.width;
            int i4 = (int) rectangle2.height;
            if (!this.f2000a || this.f2006g || a.f1987d == null || a.f1989f) {
                a.f1989f = true;
            } else {
                a.f1987d.m1131d();
                Gdx.gl.glTexSubImage2D(a.f1987d.c, 0, i, i2, i3, i4, pixmap.m1119c(), pixmap.m1121e(), pixmap.m1122f());
            }
            a.f1986c.m1113a(Blending.None);
            a.f1986c.m1114a(pixmap, i, i2);
            if (this.f2006g) {
                int i5 = pixmap.f1378a.f1654b;
                int i6 = pixmap.f1378a.f1655c;
                a.f1986c.m1116a(pixmap, 0, 0, 1, 1, i - 1, i2 - 1, 1, 1);
                a.f1986c.m1116a(pixmap, i5 - 1, 0, 1, 1, i + i3, i2 - 1, 1, 1);
                a.f1986c.m1116a(pixmap, 0, i6 - 1, 1, 1, i - 1, i2 + i4, 1, 1);
                a.f1986c.m1116a(pixmap, i5 - 1, i6 - 1, 1, 1, i + i3, i2 + i4, 1, 1);
                a.f1986c.m1116a(pixmap, 0, 0, i5, 1, i, i2 - 1, i3, 1);
                a.f1986c.m1116a(pixmap, 0, i6 - 1, i5, 1, i, i2 + i4, i3, 1);
                a.f1986c.m1116a(pixmap, 0, 0, 1, i6, i - 1, i2, 1, i4);
                a.f1986c.m1116a(pixmap, i5 - 1, 0, 1, i6, i + i3, i2, 1, i4);
            }
            rectangle = rectangle2;
        }
        return rectangle;
    }

    /* renamed from: a */
    public final synchronized Rectangle m1393a(Pixmap pixmap) {
        return m1392b(pixmap);
    }

    /* renamed from: a */
    public final void m1394a(C0430b c0430b) {
        this.f2007h.m1218a(c0430b);
    }

    /* renamed from: a */
    public final synchronized void m1395a(C0676a<C0438n> c0676a, TextureFilter textureFilter, TextureFilter textureFilter2, boolean z) {
        m1391a(textureFilter, textureFilter2, z);
        while (c0676a.f3001b < this.f2008i.f3001b) {
            c0676a.m2296a(new C0438n(((C0460c) this.f2008i.m2291a(c0676a.f3001b)).f1987d));
        }
    }

    /* renamed from: b */
    public final synchronized void dispose() {
        Iterator it = this.f2008i.iterator();
        while (it.hasNext()) {
            C0460c c0460c = (C0460c) it.next();
            if (c0460c.f1987d == null) {
                c0460c.f1986c.dispose();
            }
        }
        this.f2001b = true;
    }
}
