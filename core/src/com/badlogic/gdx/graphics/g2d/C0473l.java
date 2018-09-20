package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0284f;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.C0512m;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Mesh.VertexDataType;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.C0501p;
import com.badlogic.gdx.math.C0549f;
import com.badlogic.gdx.math.Matrix4;

/* renamed from: com.badlogic.gdx.graphics.g2d.l */
public final class C0473l implements C0444a {
    @Deprecated
    /* renamed from: a */
    public static VertexDataType f2019a = VertexDataType.VertexArray;
    /* renamed from: b */
    public final float[] f2020b;
    /* renamed from: c */
    public int f2021c;
    /* renamed from: d */
    public Texture f2022d;
    /* renamed from: e */
    float f2023e;
    /* renamed from: f */
    float f2024f;
    /* renamed from: g */
    public boolean f2025g;
    /* renamed from: h */
    public final Matrix4 f2026h;
    /* renamed from: i */
    public final Matrix4 f2027i;
    /* renamed from: j */
    public float f2028j;
    /* renamed from: k */
    public int f2029k;
    /* renamed from: l */
    public int f2030l;
    /* renamed from: m */
    public int f2031m;
    /* renamed from: n */
    private Mesh f2032n;
    /* renamed from: o */
    private final Matrix4 f2033o;
    /* renamed from: p */
    private boolean f2034p;
    /* renamed from: q */
    private int f2035q;
    /* renamed from: r */
    private int f2036r;
    /* renamed from: s */
    private int f2037s;
    /* renamed from: t */
    private int f2038t;
    /* renamed from: u */
    private final C0501p f2039u;
    /* renamed from: v */
    private C0501p f2040v;
    /* renamed from: w */
    private boolean f2041w;
    /* renamed from: x */
    private C0430b f2042x;

    public C0473l() {
        this((byte) 0);
    }

    private C0473l(byte b) {
        short s = (short) 0;
        this.f2021c = 0;
        this.f2022d = null;
        this.f2023e = 0.0f;
        this.f2024f = 0.0f;
        this.f2025g = false;
        this.f2026h = new Matrix4();
        this.f2027i = new Matrix4();
        this.f2033o = new Matrix4();
        this.f2034p = false;
        this.f2035q = 770;
        this.f2036r = 771;
        this.f2037s = 770;
        this.f2038t = 771;
        this.f2040v = null;
        this.f2028j = C0430b.f1620c.m1216a();
        this.f2042x = new C0430b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f2029k = 0;
        this.f2030l = 0;
        this.f2031m = 0;
        this.f2032n = new Mesh(Gdx.gl30 != null ? VertexDataType.VertexBufferObjectWithVAO : f2019a, new C0512m(1, 2, "a_position"), new C0512m(4, 4, "a_color"), new C0512m(16, 2, "a_texCoord0"));
        this.f2027i.m1688a((float) Gdx.graphics.mo294c(), (float) Gdx.graphics.mo295d());
        this.f2020b = new float[20000];
        short[] sArr = new short[6000];
        int i = 0;
        while (i < 6000) {
            sArr[i] = s;
            sArr[i + 1] = (short) (s + 1);
            sArr[i + 2] = (short) (s + 2);
            sArr[i + 3] = (short) (s + 2);
            sArr[i + 4] = (short) (s + 3);
            sArr[i + 5] = s;
            i += 6;
            s = (short) (s + 4);
        }
        this.f2032n.m1099a(sArr);
        C0501p c0501p = new C0501p("attribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_texCoord0;\nuniform mat4 u_projTrans;\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\n\nvoid main()\n{\n   v_color = a_color;\n   v_color.a = v_color.a * (255.0/254.0);\n   v_texCoords = a_texCoord0;\n   gl_Position =  u_projTrans * a_position;\n}\n", "#ifdef GL_ES\n#define LOWP lowp\nprecision mediump float;\n#else\n#define LOWP \n#endif\nvarying LOWP vec4 v_color;\nvarying vec2 v_texCoords;\nuniform sampler2D u_texture;\nvoid main()\n{\n  gl_FragColor = v_color * texture2D(u_texture, v_texCoords);\n}");
        if (c0501p.f2227d) {
            this.f2039u = c0501p;
            this.f2041w = true;
            return;
        }
        throw new IllegalArgumentException("Error compiling shader: " + c0501p.m1605a());
    }

    /* renamed from: i */
    private void m1401i() {
        this.f2033o.m1691a(this.f2027i).m1693b(this.f2026h);
        if (this.f2040v != null) {
            this.f2040v.m1611a("u_projTrans", this.f2033o);
            this.f2040v.m1610a("u_texture", 0);
            return;
        }
        this.f2039u.m1611a("u_projTrans", this.f2033o);
        this.f2039u.m1610a("u_texture", 0);
    }

    /* renamed from: a */
    public final void mo365a() {
        if (this.f2025g) {
            throw new IllegalStateException("SpriteBatch.end must be called before begin.");
        }
        this.f2029k = 0;
        Gdx.gl.glDepthMask(false);
        if (this.f2040v != null) {
            this.f2040v.m1614c();
        } else {
            this.f2039u.m1614c();
        }
        m1401i();
        this.f2025g = true;
    }

    /* renamed from: a */
    public final void mo366a(float f) {
        this.f2028j = f;
    }

    /* renamed from: a */
    public final void mo367a(float f, float f2, float f3, float f4) {
        this.f2028j = Float.intBitsToFloat(((((((int) (255.0f * f4)) << 24) | (((int) (255.0f * f3)) << 16)) | (((int) (255.0f * f2)) << 8)) | ((int) (255.0f * f))) & -16777217);
    }

    /* renamed from: a */
    public final void mo368a(int i, int i2) {
        if (this.f2035q != i || this.f2036r != i2 || this.f2037s != i || this.f2038t != i2) {
            mo377f();
            this.f2035q = i;
            this.f2036r = i2;
            this.f2037s = i;
            this.f2038t = i2;
        }
    }

    /* renamed from: a */
    public final void m1406a(Texture texture) {
        mo377f();
        this.f2022d = texture;
        this.f2023e = 1.0f / ((float) texture.m1144c());
        this.f2024f = 1.0f / ((float) texture.m1145k());
    }

    /* renamed from: a */
    public final void m1407a(Texture texture, float f, float f2, float f3, float f4) {
        if (this.f2025g) {
            float[] fArr = this.f2020b;
            if (texture != this.f2022d) {
                m1406a(texture);
            } else if (this.f2021c == fArr.length) {
                mo377f();
            }
            float f5 = f + f3;
            float f6 = f2 + f4;
            float f7 = this.f2028j;
            int i = this.f2021c;
            fArr[i] = f;
            fArr[i + 1] = f2;
            fArr[i + 2] = f7;
            fArr[i + 3] = 0.0f;
            fArr[i + 4] = 1.0f;
            fArr[i + 5] = f;
            fArr[i + 6] = f6;
            fArr[i + 7] = f7;
            fArr[i + 8] = 0.0f;
            fArr[i + 9] = 0.0f;
            fArr[i + 10] = f5;
            fArr[i + 11] = f6;
            fArr[i + 12] = f7;
            fArr[i + 13] = 1.0f;
            fArr[i + 14] = 0.0f;
            fArr[i + 15] = f5;
            fArr[i + 16] = f2;
            fArr[i + 17] = f7;
            fArr[i + 18] = 1.0f;
            fArr[i + 19] = 1.0f;
            this.f2021c = i + 20;
            return;
        }
        throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
    }

    /* renamed from: a */
    public final void m1408a(Texture texture, float f, float f2, float f3, int i, int i2) {
        if (this.f2025g) {
            float[] fArr = this.f2020b;
            if (texture != this.f2022d) {
                m1406a(texture);
            } else if (this.f2021c == fArr.length) {
                mo377f();
            }
            float f4 = 0.0f * this.f2023e;
            float f5 = ((float) (i2 + 0)) * this.f2024f;
            float f6 = ((float) (i + 0)) * this.f2023e;
            float f7 = 0.0f * this.f2024f;
            float f8 = f + f3;
            float f9 = 705.0f + f2;
            float f10 = this.f2028j;
            int i3 = this.f2021c;
            fArr[i3] = f;
            fArr[i3 + 1] = f2;
            fArr[i3 + 2] = f10;
            fArr[i3 + 3] = f4;
            fArr[i3 + 4] = f5;
            fArr[i3 + 5] = f;
            fArr[i3 + 6] = f9;
            fArr[i3 + 7] = f10;
            fArr[i3 + 8] = f4;
            fArr[i3 + 9] = f7;
            fArr[i3 + 10] = f8;
            fArr[i3 + 11] = f9;
            fArr[i3 + 12] = f10;
            fArr[i3 + 13] = f6;
            fArr[i3 + 14] = f7;
            fArr[i3 + 15] = f8;
            fArr[i3 + 16] = f2;
            fArr[i3 + 17] = f10;
            fArr[i3 + 18] = f6;
            fArr[i3 + 19] = f5;
            this.f2021c = i3 + 20;
            return;
        }
        throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
    }

    /* renamed from: a */
    public final void mo369a(Texture texture, float[] fArr, int i, int i2) {
        if (this.f2025g) {
            int i3;
            int length = this.f2020b.length;
            if (texture != this.f2022d) {
                m1406a(texture);
                i3 = length;
            } else {
                i3 = length - this.f2021c;
                if (i3 == 0) {
                    mo377f();
                    i3 = length;
                }
            }
            int min = Math.min(i3, i2);
            System.arraycopy(fArr, 0, this.f2020b, this.f2021c, min);
            this.f2021c += min;
            i3 = i2 - min;
            while (i3 > 0) {
                i += min;
                mo377f();
                min = Math.min(length, i3);
                System.arraycopy(fArr, i, this.f2020b, 0, min);
                this.f2021c += min;
                i3 -= min;
            }
            return;
        }
        throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
    }

    /* renamed from: a */
    public final void m1410a(C0430b c0430b) {
        this.f2028j = c0430b.m1216a();
    }

    /* renamed from: a */
    public final void m1411a(C0438n c0438n, float f, float f2) {
        mo370a(c0438n, f, f2, (float) c0438n.f1684E, (float) c0438n.f1685F);
    }

    /* renamed from: a */
    public final void mo370a(C0438n c0438n, float f, float f2, float f3, float f4) {
        if (this.f2025g) {
            float[] fArr = this.f2020b;
            Texture texture = c0438n.f1686z;
            if (texture != this.f2022d) {
                m1406a(texture);
            } else if (this.f2021c == fArr.length) {
                mo377f();
            }
            float f5 = f + f3;
            float f6 = f2 + f4;
            float f7 = c0438n.f1680A;
            float f8 = c0438n.f1683D;
            float f9 = c0438n.f1682C;
            float f10 = c0438n.f1681B;
            float f11 = this.f2028j;
            int i = this.f2021c;
            fArr[i] = f;
            fArr[i + 1] = f2;
            fArr[i + 2] = f11;
            fArr[i + 3] = f7;
            fArr[i + 4] = f8;
            fArr[i + 5] = f;
            fArr[i + 6] = f6;
            fArr[i + 7] = f11;
            fArr[i + 8] = f7;
            fArr[i + 9] = f10;
            fArr[i + 10] = f5;
            fArr[i + 11] = f6;
            fArr[i + 12] = f11;
            fArr[i + 13] = f9;
            fArr[i + 14] = f10;
            fArr[i + 15] = f5;
            fArr[i + 16] = f2;
            fArr[i + 17] = f11;
            fArr[i + 18] = f9;
            fArr[i + 19] = f8;
            this.f2021c = i + 20;
            return;
        }
        throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
    }

    /* renamed from: a */
    public final void mo371a(C0438n c0438n, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        if (this.f2025g) {
            float d;
            float c;
            float f10;
            float f11;
            float f12;
            float f13;
            float[] fArr = this.f2020b;
            Texture texture = c0438n.f1686z;
            if (texture != this.f2022d) {
                m1406a(texture);
            } else if (this.f2021c == fArr.length) {
                mo377f();
            }
            float f14 = f + f3;
            float f15 = f2 + f4;
            float f16 = -f3;
            float f17 = -f4;
            float f18 = f5 - f3;
            float f19 = f6 - f4;
            if (!(f7 == 1.0f && f8 == 1.0f)) {
                f16 *= f7;
                f17 *= f8;
                f18 *= f7;
                f19 *= f8;
            }
            if (f9 != 0.0f) {
                d = C0549f.m1771d(f9);
                c = C0549f.m1769c(f9);
                f10 = (d * f16) - (c * f17);
                f11 = (c * f16) + (f17 * d);
                f12 = (d * f16) - (c * f19);
                f13 = (c * f16) + (d * f19);
                f16 = (d * f18) - (c * f19);
                f19 = (c * f18) + (d * f19);
                f18 = f10 + (f16 - f12);
                f17 = f19 - (f13 - f11);
                float f20 = f13;
                f13 = f12;
                f12 = f19;
                f19 = f11;
                f11 = f18;
                f18 = f20;
            } else {
                f10 = f16;
                f13 = f16;
                f12 = f19;
                f11 = f18;
                f16 = f18;
                f18 = f19;
                f19 = f17;
            }
            f10 += f14;
            f19 += f15;
            f13 += f14;
            f18 += f15;
            f16 += f14;
            f12 += f15;
            f11 += f14;
            f17 += f15;
            f14 = c0438n.f1680A;
            f15 = c0438n.f1683D;
            d = c0438n.f1682C;
            c = c0438n.f1681B;
            float f21 = this.f2028j;
            int i = this.f2021c;
            fArr[i] = f10;
            fArr[i + 1] = f19;
            fArr[i + 2] = f21;
            fArr[i + 3] = f14;
            fArr[i + 4] = f15;
            fArr[i + 5] = f13;
            fArr[i + 6] = f18;
            fArr[i + 7] = f21;
            fArr[i + 8] = f14;
            fArr[i + 9] = c;
            fArr[i + 10] = f16;
            fArr[i + 11] = f12;
            fArr[i + 12] = f21;
            fArr[i + 13] = d;
            fArr[i + 14] = c;
            fArr[i + 15] = f11;
            fArr[i + 16] = f17;
            fArr[i + 17] = f21;
            fArr[i + 18] = d;
            fArr[i + 19] = f15;
            this.f2021c = i + 20;
            return;
        }
        throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
    }

    /* renamed from: a */
    public final void mo372a(Matrix4 matrix4) {
        if (this.f2025g) {
            mo377f();
        }
        this.f2027i.m1691a(matrix4);
        if (this.f2025g) {
            m1401i();
        }
    }

    /* renamed from: b */
    public final void dispose() {
        this.f2032n.dispose();
        if (this.f2041w && this.f2039u != null) {
            this.f2039u.dispose();
        }
    }

    /* renamed from: b */
    public final void mo373b(Matrix4 matrix4) {
        if (this.f2025g) {
            mo377f();
        }
        this.f2026h.m1691a(matrix4);
        if (this.f2025g) {
            m1401i();
        }
    }

    /* renamed from: c */
    public final void mo374c() {
        boolean z = true;
        if (this.f2025g) {
            if (this.f2021c > 0) {
                mo377f();
            }
            this.f2022d = null;
            this.f2025g = false;
            C0284f c0284f = Gdx.gl;
            c0284f.glDepthMask(true);
            if (this.f2034p) {
                z = false;
            }
            if (z) {
                c0284f.glDisable(3042);
            }
            C0501p.m1601d();
            return;
        }
        throw new IllegalStateException("SpriteBatch.begin must be called before end.");
    }

    /* renamed from: d */
    public final C0430b mo375d() {
        int floatToRawIntBits = Float.floatToRawIntBits(this.f2028j);
        C0430b c0430b = this.f2042x;
        c0430b.f1644I = ((float) (floatToRawIntBits & 255)) / 255.0f;
        c0430b.f1645J = ((float) ((floatToRawIntBits >>> 8) & 255)) / 255.0f;
        c0430b.f1646K = ((float) ((floatToRawIntBits >>> 16) & 255)) / 255.0f;
        c0430b.f1647L = ((float) ((floatToRawIntBits >>> 24) & 255)) / 255.0f;
        return c0430b;
    }

    /* renamed from: e */
    public final float mo376e() {
        return this.f2028j;
    }

    /* renamed from: f */
    public final void mo377f() {
        if (this.f2021c != 0) {
            this.f2029k++;
            this.f2030l++;
            int i = this.f2021c / 20;
            if (i > this.f2031m) {
                this.f2031m = i;
            }
            int i2 = i * 6;
            this.f2022d.m1131d();
            Mesh mesh = this.f2032n;
            mesh.m1098a(this.f2020b, this.f2021c);
            mesh.m1106e().position(0);
            mesh.m1106e().limit(i2);
            if (this.f2034p) {
                Gdx.gl.glDisable(3042);
            } else {
                Gdx.gl.glEnable(3042);
                if (this.f2035q != -1) {
                    Gdx.gl.glBlendFuncSeparate(this.f2035q, this.f2036r, this.f2037s, this.f2038t);
                }
            }
            mesh.m1101a(this.f2040v != null ? this.f2040v : this.f2039u, i2);
            this.f2021c = 0;
        }
    }

    /* renamed from: g */
    public final Matrix4 mo378g() {
        return this.f2027i;
    }

    /* renamed from: h */
    public final Matrix4 mo379h() {
        return this.f2026h;
    }
}
