package com.badlogic.gdx.graphics;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.C0494l;
import com.badlogic.gdx.graphics.glutils.C0495i;
import com.badlogic.gdx.graphics.glutils.C0496j;
import com.badlogic.gdx.graphics.glutils.C0497k;
import com.badlogic.gdx.graphics.glutils.C0501p;
import com.badlogic.gdx.graphics.glutils.C0502u;
import com.badlogic.gdx.graphics.glutils.C0503q;
import com.badlogic.gdx.graphics.glutils.C0504r;
import com.badlogic.gdx.graphics.glutils.C0505s;
import com.badlogic.gdx.graphics.glutils.C0506t;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.Buffer;
import java.nio.ShortBuffer;
import java.util.HashMap;
import java.util.Map;

public final class Mesh implements Disposable {
    /* renamed from: a */
    static final Map<Application, C0676a<Mesh>> f1358a = new HashMap();
    /* renamed from: b */
    public final C0502u f1359b;
    /* renamed from: c */
    public final C0494l f1360c;
    /* renamed from: d */
    public boolean f1361d;
    /* renamed from: e */
    final boolean f1362e;
    /* renamed from: f */
    public final Vector3 f1363f;

    public enum VertexDataType {
        VertexArray,
        VertexBufferObject,
        VertexBufferObjectSubData,
        VertexBufferObjectWithVAO
    }

    public Mesh(int i, int i2, C0515n c0515n) {
        this.f1361d = true;
        this.f1363f = new Vector3();
        this.f1359b = m1091a(true, i, c0515n);
        this.f1360c = new C0496j(true, i2);
        this.f1362e = false;
        m1093a(Gdx.app, this);
    }

    private Mesh(VertexDataType vertexDataType, C0515n c0515n) {
        this.f1361d = true;
        this.f1363f = new Vector3();
        switch (vertexDataType) {
            case VertexBufferObject:
                this.f1359b = new C0504r(false, 4000, c0515n);
                this.f1360c = new C0496j(false, 6000);
                this.f1362e = false;
                break;
            case VertexBufferObjectSubData:
                this.f1359b = new C0505s(c0515n);
                this.f1360c = new C0497k();
                this.f1362e = false;
                break;
            case VertexBufferObjectWithVAO:
                this.f1359b = new C0506t(false, 4000, c0515n);
                this.f1360c = new C0497k();
                this.f1362e = false;
                break;
            default:
                this.f1359b = new C0503q(c0515n);
                this.f1360c = new C0495i(6000);
                this.f1362e = true;
                break;
        }
        m1093a(Gdx.app, this);
    }

    public Mesh(VertexDataType vertexDataType, C0512m... c0512mArr) {
        this(vertexDataType, new C0515n(c0512mArr));
    }

    public Mesh(boolean z, int i, int i2, C0512m... c0512mArr) {
        this.f1361d = true;
        this.f1363f = new Vector3();
        this.f1359b = m1091a(z, i, new C0515n(c0512mArr));
        this.f1360c = new C0496j(z, i2);
        this.f1362e = false;
        m1093a(Gdx.app, this);
    }

    /* renamed from: a */
    private static C0502u m1091a(boolean z, int i, C0515n c0515n) {
        return Gdx.gl30 != null ? new C0506t(z, i, c0515n) : new C0504r(z, i, c0515n);
    }

    /* renamed from: a */
    public static void m1092a(Application application) {
        C0676a c0676a = (C0676a) f1358a.get(application);
        if (c0676a != null) {
            for (int i = 0; i < c0676a.f3001b; i++) {
                ((Mesh) c0676a.m2291a(i)).f1359b.mo428e();
                ((Mesh) c0676a.m2291a(i)).f1360c.mo420g();
            }
        }
    }

    /* renamed from: a */
    private static void m1093a(Application application, Mesh mesh) {
        C0676a c0676a = (C0676a) f1358a.get(application);
        if (c0676a == null) {
            c0676a = new C0676a();
        }
        c0676a.m2296a((Object) mesh);
        f1358a.put(application, c0676a);
    }

    /* renamed from: b */
    public static void m1094b(Application application) {
        f1358a.remove(application);
    }

    /* renamed from: f */
    public static String m1095f() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Managed meshes/app: { ");
        for (Application application : f1358a.keySet()) {
            stringBuilder.append(((C0676a) f1358a.get(application)).f3001b);
            stringBuilder.append(" ");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final int m1096a() {
        return this.f1360c.mo414a();
    }

    /* renamed from: a */
    public final Mesh m1097a(float[] fArr) {
        this.f1359b.mo424a(fArr, fArr.length);
        return this;
    }

    /* renamed from: a */
    public final Mesh m1098a(float[] fArr, int i) {
        this.f1359b.mo424a(fArr, i);
        return this;
    }

    /* renamed from: a */
    public final Mesh m1099a(short[] sArr) {
        this.f1360c.mo415a(sArr, sArr.length);
        return this;
    }

    /* renamed from: a */
    public final C0512m m1100a(int i) {
        C0515n d = this.f1359b.mo427d();
        int length = d.f2299a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (d.f2299a[i2].f2285a == i) {
                return d.f2299a[i2];
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void m1101a(C0501p c0501p, int i) {
        m1102a(c0501p, 4, i, this.f1361d);
    }

    /* renamed from: a */
    public final void m1102a(C0501p c0501p, int i, int i2, boolean z) {
        if (i2 != 0) {
            if (z) {
                this.f1359b.mo423a(c0501p);
                if (this.f1360c.mo414a() > 0) {
                    this.f1360c.mo418e();
                }
            }
            if (this.f1362e) {
                if (this.f1360c.mo414a() > 0) {
                    Buffer d = this.f1360c.mo417d();
                    int position = d.position();
                    int limit = d.limit();
                    d.position(0);
                    d.limit(i2 + 0);
                    Gdx.gl20.glDrawElements(i, i2, 5123, d);
                    d.position(position);
                    d.limit(limit);
                } else {
                    Gdx.gl20.glDrawArrays(i, 0, i2);
                }
            } else if (this.f1360c.mo414a() <= 0) {
                Gdx.gl20.glDrawArrays(i, 0, i2);
            } else if (i2 + 0 > this.f1360c.mo416c()) {
                throw new GdxRuntimeException("Mesh attempting to access memory outside of the index buffer (count: " + i2 + ", offset: 0, max: " + this.f1360c.mo416c() + ")");
            } else {
                Gdx.gl20.glDrawElements(i, i2, 5123, 0);
            }
            if (z) {
                this.f1359b.mo425b(c0501p);
                if (this.f1360c.mo414a() > 0) {
                    this.f1360c.mo419f();
                }
            }
        }
    }

    /* renamed from: b */
    public final void dispose() {
        if (f1358a.get(Gdx.app) != null) {
            ((C0676a) f1358a.get(Gdx.app)).mo529b((Object) this, true);
        }
        this.f1359b.dispose();
        this.f1360c.dispose();
    }

    /* renamed from: c */
    public final int m1104c() {
        return this.f1359b.mo426c();
    }

    /* renamed from: d */
    public final C0515n m1105d() {
        return this.f1359b.mo427d();
    }

    /* renamed from: e */
    public final ShortBuffer m1106e() {
        return this.f1360c.mo417d();
    }
}
