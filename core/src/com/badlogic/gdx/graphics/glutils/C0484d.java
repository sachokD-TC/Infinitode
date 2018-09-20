package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0284f;
import com.badlogic.gdx.graphics.C0380h;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.badlogic.gdx.graphics.glutils.d */
public abstract class C0484d<T extends C0380h> implements Disposable {
    /* renamed from: a */
    protected static final Map<Application, C0676a<C0484d>> f2133a = new HashMap();
    /* renamed from: c */
    protected static int f2134c;
    /* renamed from: d */
    protected static boolean f2135d = false;
    /* renamed from: b */
    protected C0676a<T> f2136b = new C0676a();
    /* renamed from: e */
    protected int f2137e;
    /* renamed from: f */
    protected int f2138f;
    /* renamed from: g */
    protected int f2139g;
    /* renamed from: h */
    protected int f2140h;
    /* renamed from: i */
    protected boolean f2141i;
    /* renamed from: j */
    protected boolean f2142j;
    /* renamed from: k */
    protected C0486d<? extends C0484d<T>> f2143k;

    /* renamed from: com.badlogic.gdx.graphics.glutils.d$d */
    protected static abstract class C0486d<U extends C0484d<? extends C0380h>> {
        /* renamed from: a */
        protected int f2144a;
        /* renamed from: b */
        protected int f2145b;
        /* renamed from: c */
        protected C0676a<C0489c> f2146c = new C0676a();
        /* renamed from: d */
        protected C0488b f2147d;
        /* renamed from: e */
        protected C0488b f2148e;
        /* renamed from: f */
        protected C0488b f2149f;
        /* renamed from: g */
        protected boolean f2150g;
        /* renamed from: h */
        protected boolean f2151h;
        /* renamed from: i */
        protected boolean f2152i;

        public C0486d(int i, int i2) {
            this.f2144a = i;
            this.f2145b = i2;
        }

        /* renamed from: a */
        public C0486d<U> mo404a(int i, int i2, int i3) {
            this.f2146c.m2296a(new C0489c(i, i2, i3));
            return this;
        }

        /* renamed from: a */
        public C0486d<U> mo405a(Format format) {
            int b = Format.m1109b(format);
            return mo404a(b, b, Format.m1110c(format));
        }
    }

    /* renamed from: com.badlogic.gdx.graphics.glutils.d$a */
    public static class C0487a extends C0486d<C0485c> {
        public C0487a(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C0486d mo404a(int i, int i2, int i3) {
            return super.mo404a(i, i2, i3);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C0486d mo405a(Format format) {
            return super.mo405a(format);
        }
    }

    /* renamed from: com.badlogic.gdx.graphics.glutils.d$b */
    protected static class C0488b {
        /* renamed from: a */
        int f2153a;
    }

    /* renamed from: com.badlogic.gdx.graphics.glutils.d$c */
    protected static class C0489c {
        /* renamed from: a */
        int f2154a;
        /* renamed from: b */
        int f2155b;
        /* renamed from: c */
        int f2156c;
        /* renamed from: d */
        boolean f2157d;
        /* renamed from: e */
        boolean f2158e;
        /* renamed from: f */
        boolean f2159f;

        public C0489c(int i, int i2, int i3) {
            this.f2154a = i;
            this.f2155b = i2;
            this.f2156c = i3;
        }
    }

    C0484d() {
    }

    /* renamed from: a */
    private static StringBuilder m1486a(StringBuilder stringBuilder) {
        stringBuilder.append("Managed buffers/app: { ");
        for (Application application : f2133a.keySet()) {
            stringBuilder.append(((C0676a) f2133a.get(application)).f3001b);
            stringBuilder.append(" ");
        }
        stringBuilder.append("}");
        return stringBuilder;
    }

    /* renamed from: a */
    public static void m1487a(Application application) {
        if (Gdx.gl20 != null) {
            C0676a c0676a = (C0676a) f2133a.get(application);
            if (c0676a != null) {
                for (int i = 0; i < c0676a.f3001b; i++) {
                    ((C0484d) c0676a.m2291a(i)).m1496c();
                }
            }
        }
    }

    /* renamed from: b */
    public static void m1488b(Application application) {
        f2133a.remove(application);
    }

    /* renamed from: e */
    public static void m1489e() {
        int e = Gdx.graphics.mo296e();
        int f = Gdx.graphics.mo297f();
        Gdx.gl20.glBindFramebuffer(36160, f2134c);
        Gdx.gl20.glViewport(0, 0, e, f);
    }

    /* renamed from: h */
    public static String m1490h() {
        return C0484d.m1486a(new StringBuilder()).toString();
    }

    /* renamed from: a */
    public final T m1491a() {
        return (C0380h) this.f2136b.m2304c();
    }

    /* renamed from: a */
    protected abstract T mo401a(C0489c c0489c);

    /* renamed from: a */
    protected abstract void mo402a(T t);

    /* renamed from: b */
    public final void dispose() {
        C0284f c0284f = Gdx.gl20;
        Iterator it = this.f2136b.iterator();
        while (it.hasNext()) {
            mo403b((C0380h) it.next());
        }
        if (this.f2141i) {
            c0284f.glDeleteRenderbuffer(this.f2140h);
        } else {
            if (this.f2143k.f2151h) {
                c0284f.glDeleteRenderbuffer(this.f2138f);
            }
            if (this.f2143k.f2150g) {
                c0284f.glDeleteRenderbuffer(this.f2139g);
            }
        }
        c0284f.glDeleteFramebuffer(this.f2137e);
        if (f2133a.get(Gdx.app) != null) {
            ((C0676a) f2133a.get(Gdx.app)).mo529b((Object) this, true);
        }
    }

    /* renamed from: b */
    protected abstract void mo403b(T t);

    /* renamed from: c */
    protected final void m1496c() {
        C0489c c0489c;
        int i;
        int i2;
        C0284f c0284f = Gdx.gl20;
        if (!Gdx.graphics.mo291a()) {
            if (this.f2143k.f2152i) {
                throw new GdxRuntimeException("Packed Stencil/Render render buffers are not available on GLES 2.0");
            } else if (this.f2143k.f2146c.f3001b > 1) {
                throw new GdxRuntimeException("Multiple render targets not available on GLES 2.0");
            } else {
                Iterator it = this.f2143k.f2146c.iterator();
                while (it.hasNext()) {
                    c0489c = (C0489c) it.next();
                    if (c0489c.f2158e) {
                        throw new GdxRuntimeException("Depth texture FrameBuffer Attachment not available on GLES 2.0");
                    } else if (c0489c.f2159f) {
                        throw new GdxRuntimeException("Stencil texture FrameBuffer Attachment not available on GLES 2.0");
                    } else if (c0489c.f2157d && !Gdx.graphics.mo292a("OES_texture_float")) {
                        throw new GdxRuntimeException("Float texture FrameBuffer Attachment not available on GLES 2.0");
                    }
                }
            }
        }
        if (!f2135d) {
            f2135d = true;
            if (Gdx.app.getType() == ApplicationType.iOS) {
                IntBuffer asIntBuffer = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asIntBuffer();
                c0284f.glGetIntegerv(36006, asIntBuffer);
                f2134c = asIntBuffer.get(0);
            } else {
                f2134c = 0;
            }
        }
        this.f2137e = c0284f.glGenFramebuffer();
        c0284f.glBindFramebuffer(36160, this.f2137e);
        int i3 = this.f2143k.f2144a;
        int i4 = this.f2143k.f2145b;
        if (this.f2143k.f2151h) {
            this.f2138f = c0284f.glGenRenderbuffer();
            c0284f.glBindRenderbuffer(36161, this.f2138f);
            c0284f.glRenderbufferStorage(36161, this.f2143k.f2148e.f2153a, i3, i4);
        }
        if (this.f2143k.f2150g) {
            this.f2139g = c0284f.glGenRenderbuffer();
            c0284f.glBindRenderbuffer(36161, this.f2139g);
            c0284f.glRenderbufferStorage(36161, this.f2143k.f2147d.f2153a, i3, i4);
        }
        if (this.f2143k.f2152i) {
            this.f2140h = c0284f.glGenRenderbuffer();
            c0284f.glBindRenderbuffer(36161, this.f2140h);
            c0284f.glRenderbufferStorage(36161, this.f2143k.f2149f.f2153a, i3, i4);
        }
        this.f2142j = this.f2143k.f2146c.f3001b > 1;
        if (this.f2142j) {
            Iterator it2 = this.f2143k.f2146c.iterator();
            i = 0;
            while (it2.hasNext()) {
                c0489c = (C0489c) it2.next();
                Object a = mo401a(c0489c);
                this.f2136b.m2296a(a);
                boolean z = (c0489c.f2158e || c0489c.f2159f) ? false : true;
                if (z) {
                    c0284f.glFramebufferTexture2D(36160, 36064 + i, 3553, a.m1136i(), 0);
                    i++;
                } else if (c0489c.f2158e) {
                    c0284f.glFramebufferTexture2D(36160, 36096, 3553, a.m1136i(), 0);
                } else if (c0489c.f2159f) {
                    c0284f.glFramebufferTexture2D(36160, 36128, 3553, a.m1136i(), 0);
                }
            }
        } else {
            Object a2 = mo401a((C0489c) this.f2143k.f2146c.m2304c());
            this.f2136b.m2296a(a2);
            c0284f.glBindTexture(a2.f1396c, a2.m1136i());
            i = 0;
        }
        if (this.f2142j) {
            IntBuffer b = BufferUtils.m2246b(i);
            for (i2 = 0; i2 < i; i2++) {
                b.put(36064 + i2);
            }
            b.position(0);
            Gdx.gl30.mo288a(i, b);
        } else {
            mo402a((C0380h) this.f2136b.m2304c());
        }
        if (this.f2143k.f2151h) {
            c0284f.glFramebufferRenderbuffer(36160, 36096, 36161, this.f2138f);
        }
        if (this.f2143k.f2150g) {
            c0284f.glFramebufferRenderbuffer(36160, 36128, 36161, this.f2139g);
        }
        if (this.f2143k.f2152i) {
            c0284f.glFramebufferRenderbuffer(36160, 33306, 36161, this.f2140h);
        }
        c0284f.glBindRenderbuffer(36161, 0);
        Iterator it3 = this.f2136b.iterator();
        while (it3.hasNext()) {
            c0284f.glBindTexture(((C0380h) it3.next()).f1396c, 0);
        }
        i2 = c0284f.glCheckFramebufferStatus(36160);
        if (i2 == 36061 && this.f2143k.f2151h && this.f2143k.f2150g && (Gdx.graphics.mo292a("GL_OES_packed_depth_stencil") || Gdx.graphics.mo292a("GL_EXT_packed_depth_stencil"))) {
            if (this.f2143k.f2151h) {
                c0284f.glDeleteRenderbuffer(this.f2138f);
                this.f2138f = 0;
            }
            if (this.f2143k.f2150g) {
                c0284f.glDeleteRenderbuffer(this.f2139g);
                this.f2139g = 0;
            }
            if (this.f2143k.f2152i) {
                c0284f.glDeleteRenderbuffer(this.f2140h);
                this.f2140h = 0;
            }
            this.f2140h = c0284f.glGenRenderbuffer();
            this.f2141i = true;
            c0284f.glBindRenderbuffer(36161, this.f2140h);
            c0284f.glRenderbufferStorage(36161, 35056, i3, i4);
            c0284f.glBindRenderbuffer(36161, 0);
            c0284f.glFramebufferRenderbuffer(36160, 36096, 36161, this.f2140h);
            c0284f.glFramebufferRenderbuffer(36160, 36128, 36161, this.f2140h);
            i2 = c0284f.glCheckFramebufferStatus(36160);
        }
        c0284f.glBindFramebuffer(36160, f2134c);
        if (i2 != 36053) {
            it3 = this.f2136b.iterator();
            while (it3.hasNext()) {
                mo403b((C0380h) it3.next());
            }
            if (this.f2141i) {
                c0284f.glDeleteBuffer(this.f2140h);
            } else {
                if (this.f2143k.f2151h) {
                    c0284f.glDeleteRenderbuffer(this.f2138f);
                }
                if (this.f2143k.f2150g) {
                    c0284f.glDeleteRenderbuffer(this.f2139g);
                }
            }
            c0284f.glDeleteFramebuffer(this.f2137e);
            if (i2 == 36054) {
                throw new IllegalStateException("frame buffer couldn't be constructed: incomplete attachment");
            } else if (i2 == 36057) {
                throw new IllegalStateException("frame buffer couldn't be constructed: incomplete dimensions");
            } else if (i2 == 36055) {
                throw new IllegalStateException("frame buffer couldn't be constructed: missing attachment");
            } else if (i2 == 36061) {
                throw new IllegalStateException("frame buffer couldn't be constructed: unsupported combination of formats");
            } else {
                throw new IllegalStateException("frame buffer couldn't be constructed: unknown error " + i2);
            }
        }
        Application application = Gdx.app;
        C0676a c0676a = (C0676a) f2133a.get(application);
        if (c0676a == null) {
            c0676a = new C0676a();
        }
        c0676a.m2296a((Object) this);
        f2133a.put(application, c0676a);
    }

    /* renamed from: d */
    public final void m1497d() {
        Gdx.gl20.glBindFramebuffer(36160, this.f2137e);
        Gdx.gl20.glViewport(0, 0, this.f2143k.f2144a, this.f2143k.f2145b);
    }

    /* renamed from: f */
    public final int m1498f() {
        return this.f2143k.f2145b;
    }

    /* renamed from: g */
    public final int m1499g() {
        return this.f2143k.f2144a;
    }
}
