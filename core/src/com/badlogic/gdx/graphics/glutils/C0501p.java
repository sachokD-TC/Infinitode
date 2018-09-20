package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0284f;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0704p;
import com.badlogic.gdx.utils.C0710q;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Iterator;

/* renamed from: com.badlogic.gdx.graphics.glutils.p */
public class C0501p implements Disposable {
    /* renamed from: a */
    public static boolean f2222a = true;
    /* renamed from: b */
    public static String f2223b = "";
    /* renamed from: c */
    public static String f2224c = "";
    /* renamed from: e */
    static final IntBuffer f2225e = BufferUtils.m2246b(1);
    /* renamed from: h */
    private static final C0710q<Application, C0676a<C0501p>> f2226h = new C0710q();
    /* renamed from: d */
    public boolean f2227d;
    /* renamed from: f */
    IntBuffer f2228f = BufferUtils.m2246b(1);
    /* renamed from: g */
    IntBuffer f2229g = BufferUtils.m2246b(1);
    /* renamed from: i */
    private String f2230i = "";
    /* renamed from: j */
    private final C0704p<String> f2231j = new C0704p();
    /* renamed from: k */
    private final C0704p<String> f2232k = new C0704p();
    /* renamed from: l */
    private final C0704p<String> f2233l = new C0704p();
    /* renamed from: m */
    private String[] f2234m;
    /* renamed from: n */
    private final C0704p<String> f2235n = new C0704p();
    /* renamed from: o */
    private final C0704p<String> f2236o = new C0704p();
    /* renamed from: p */
    private final C0704p<String> f2237p = new C0704p();
    /* renamed from: q */
    private String[] f2238q;
    /* renamed from: r */
    private int f2239r;
    /* renamed from: s */
    private int f2240s;
    /* renamed from: t */
    private int f2241t;
    /* renamed from: u */
    private final FloatBuffer f2242u;
    /* renamed from: v */
    private final String f2243v;
    /* renamed from: w */
    private final String f2244w;
    /* renamed from: x */
    private boolean f2245x;
    /* renamed from: y */
    private int f2246y = 0;

    public C0501p(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("vertex shader must not be null");
        } else if (str2 == null) {
            throw new IllegalArgumentException("fragment shader must not be null");
        } else {
            if (f2223b != null && f2223b.length() > 0) {
                str = f2223b + str;
            }
            if (f2224c != null && f2224c.length() > 0) {
                str2 = f2224c + str2;
            }
            this.f2243v = str;
            this.f2244w = str2;
            this.f2242u = BufferUtils.m2241a();
            m1598a(str, str2);
            if (this.f2227d) {
                m1604h();
                m1603g();
                Object obj = Gdx.app;
                C0676a c0676a = (C0676a) f2226h.m2467a(obj);
                if (c0676a == null) {
                    c0676a = new C0676a();
                }
                c0676a.m2296a((Object) this);
                f2226h.mo542a(obj, c0676a);
            }
        }
    }

    /* renamed from: a */
    private int m1596a(int i, String str) {
        C0284f c0284f = Gdx.gl20;
        IntBuffer b = BufferUtils.m2246b(1);
        int glCreateShader = c0284f.glCreateShader(i);
        if (glCreateShader == 0) {
            return -1;
        }
        c0284f.glShaderSource(glCreateShader, str);
        c0284f.glCompileShader(glCreateShader);
        c0284f.glGetShaderiv(glCreateShader, 35713, b);
        if (b.get(0) != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = c0284f.glGetShaderInfoLog(glCreateShader);
        this.f2230i += (i == 35633 ? "Vertex shader\n" : "Fragment shader:\n");
        this.f2230i += glGetShaderInfoLog;
        return -1;
    }

    /* renamed from: a */
    public static void m1597a(Application application) {
        if (Gdx.gl20 != null) {
            C0676a c0676a = (C0676a) f2226h.m2467a((Object) application);
            if (c0676a != null) {
                for (int i = 0; i < c0676a.f3001b; i++) {
                    ((C0501p) c0676a.m2291a(i)).f2245x = true;
                    ((C0501p) c0676a.m2291a(i)).m1615e();
                }
            }
        }
    }

    /* renamed from: a */
    private void m1598a(String str, String str2) {
        this.f2240s = m1596a(35633, str);
        this.f2241t = m1596a(35632, str2);
        if (this.f2240s == -1 || this.f2241t == -1) {
            this.f2227d = false;
            return;
        }
        int glCreateProgram = Gdx.gl20.glCreateProgram();
        if (glCreateProgram == 0) {
            glCreateProgram = -1;
        }
        C0284f c0284f = Gdx.gl20;
        if (glCreateProgram == -1) {
            glCreateProgram = -1;
        } else {
            c0284f.glAttachShader(glCreateProgram, this.f2240s);
            c0284f.glAttachShader(glCreateProgram, this.f2241t);
            c0284f.glLinkProgram(glCreateProgram);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4);
            allocateDirect.order(ByteOrder.nativeOrder());
            IntBuffer asIntBuffer = allocateDirect.asIntBuffer();
            c0284f.glGetProgramiv(glCreateProgram, 35714, asIntBuffer);
            if (asIntBuffer.get(0) == 0) {
                this.f2230i = Gdx.gl20.glGetProgramInfoLog(glCreateProgram);
                glCreateProgram = -1;
            }
        }
        this.f2239r = glCreateProgram;
        if (this.f2239r == -1) {
            this.f2227d = false;
        } else {
            this.f2227d = true;
        }
    }

    /* renamed from: b */
    public static void m1599b(Application application) {
        f2226h.mo545b((Object) application);
    }

    /* renamed from: c */
    private int m1600c(String str) {
        boolean z = f2222a;
        C0284f c0284f = Gdx.gl20;
        int b = this.f2231j.m2455b(str, -2);
        if (b == -2) {
            b = c0284f.glGetUniformLocation(this.f2239r, str);
            if (b == -1 && z) {
                throw new IllegalArgumentException("no uniform with name '" + str + "' in shader");
            }
            this.f2231j.m2454a(str, b);
        }
        return b;
    }

    /* renamed from: d */
    public static void m1601d() {
        Gdx.gl20.glUseProgram(0);
    }

    /* renamed from: f */
    public static String m1602f() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Managed shaders/app: { ");
        Iterator e = f2226h.mo548e();
        while (e.hasNext()) {
            stringBuilder.append(((C0676a) f2226h.m2467a((Application) e.next())).f3001b);
            stringBuilder.append(" ");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: g */
    private void m1603g() {
        this.f2228f.clear();
        Gdx.gl20.glGetProgramiv(this.f2239r, 35718, this.f2228f);
        int i = this.f2228f.get(0);
        this.f2234m = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f2228f.clear();
            this.f2228f.put(0, 1);
            this.f2229g.clear();
            String glGetActiveUniform = Gdx.gl20.glGetActiveUniform(this.f2239r, i2, this.f2228f, this.f2229g);
            this.f2231j.m2454a(glGetActiveUniform, Gdx.gl20.glGetUniformLocation(this.f2239r, glGetActiveUniform));
            this.f2232k.m2454a(glGetActiveUniform, this.f2229g.get(0));
            this.f2233l.m2454a(glGetActiveUniform, this.f2228f.get(0));
            this.f2234m[i2] = glGetActiveUniform;
        }
    }

    /* renamed from: h */
    private void m1604h() {
        this.f2228f.clear();
        Gdx.gl20.glGetProgramiv(this.f2239r, 35721, this.f2228f);
        int i = this.f2228f.get(0);
        this.f2238q = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f2228f.clear();
            this.f2228f.put(0, 1);
            this.f2229g.clear();
            String glGetActiveAttrib = Gdx.gl20.glGetActiveAttrib(this.f2239r, i2, this.f2228f, this.f2229g);
            this.f2235n.m2454a(glGetActiveAttrib, Gdx.gl20.glGetAttribLocation(this.f2239r, glGetActiveAttrib));
            this.f2236o.m2454a(glGetActiveAttrib, this.f2229g.get(0));
            this.f2237p.m2454a(glGetActiveAttrib, this.f2228f.get(0));
            this.f2238q[i2] = glGetActiveAttrib;
        }
    }

    /* renamed from: a */
    public final String m1605a() {
        if (!this.f2227d) {
            return this.f2230i;
        }
        this.f2230i = Gdx.gl20.glGetProgramInfoLog(this.f2239r);
        return this.f2230i;
    }

    /* renamed from: a */
    public final void m1606a(int i) {
        C0284f c0284f = Gdx.gl20;
        m1615e();
        c0284f.glEnableVertexAttribArray(i);
    }

    /* renamed from: a */
    public final void m1607a(int i, int i2, int i3, boolean z, int i4, int i5) {
        C0284f c0284f = Gdx.gl20;
        m1615e();
        c0284f.glVertexAttribPointer(i, i2, i3, z, i4, i5);
    }

    /* renamed from: a */
    public final void m1608a(int i, int i2, int i3, boolean z, int i4, Buffer buffer) {
        C0284f c0284f = Gdx.gl20;
        m1615e();
        c0284f.glVertexAttribPointer(i, i2, i3, z, i4, buffer);
    }

    /* renamed from: a */
    public final void m1609a(String str) {
        C0284f c0284f = Gdx.gl20;
        m1615e();
        C0284f c0284f2 = Gdx.gl20;
        int b = this.f2235n.m2455b(str, -2);
        if (b == -2) {
            b = c0284f2.glGetAttribLocation(this.f2239r, str);
            this.f2235n.m2454a(str, b);
        }
        if (b != -1) {
            c0284f.glDisableVertexAttribArray(b);
        }
    }

    /* renamed from: a */
    public final void m1610a(String str, int i) {
        C0284f c0284f = Gdx.gl20;
        m1615e();
        c0284f.glUniform1i(m1600c(str), i);
    }

    /* renamed from: a */
    public final void m1611a(String str, Matrix4 matrix4) {
        int c = m1600c(str);
        C0284f c0284f = Gdx.gl20;
        m1615e();
        c0284f.glUniformMatrix4fv(c, 1, false, matrix4.val, 0);
    }

    /* renamed from: b */
    public final int m1612b(String str) {
        return this.f2235n.m2455b(str, -1);
    }

    /* renamed from: b */
    public final void dispose() {
        C0284f c0284f = Gdx.gl20;
        c0284f.glUseProgram(0);
        c0284f.glDeleteShader(this.f2240s);
        c0284f.glDeleteShader(this.f2241t);
        c0284f.glDeleteProgram(this.f2239r);
        if (f2226h.m2467a(Gdx.app) != null) {
            ((C0676a) f2226h.m2467a(Gdx.app)).mo529b((Object) this, true);
        }
    }

    /* renamed from: c */
    public final void m1614c() {
        C0284f c0284f = Gdx.gl20;
        m1615e();
        c0284f.glUseProgram(this.f2239r);
    }

    /* renamed from: e */
    final void m1615e() {
        if (this.f2245x) {
            m1598a(this.f2243v, this.f2244w);
            this.f2245x = false;
        }
    }
}
