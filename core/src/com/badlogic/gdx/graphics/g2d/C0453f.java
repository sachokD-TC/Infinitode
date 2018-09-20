package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.ab;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.badlogic.gdx.graphics.g2d.f */
public class C0453f implements Disposable {
    /* renamed from: a */
    public final C0676a<ParticleEmitter> f1876a;
    /* renamed from: b */
    protected float f1877b;
    /* renamed from: c */
    protected float f1878c;
    /* renamed from: d */
    protected float f1879d;
    /* renamed from: e */
    private boolean f1880e;

    public C0453f() {
        this.f1877b = 1.0f;
        this.f1878c = 1.0f;
        this.f1879d = 1.0f;
        this.f1876a = new C0676a(8);
    }

    public C0453f(C0453f c0453f) {
        this.f1877b = 1.0f;
        this.f1878c = 1.0f;
        this.f1879d = 1.0f;
        this.f1876a = new C0676a(true, c0453f.f1876a.f3001b);
        int i = c0453f.f1876a.f3001b;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1876a.m2296a(new ParticleEmitter((ParticleEmitter) c0453f.f1876a.m2291a(i2)));
        }
    }

    /* renamed from: a */
    private void m1351a(C0316a c0316a) {
        Throwable e;
        InputStream b = c0316a.mo268b();
        this.f1876a.mo530d();
        Closeable bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(b), 512);
            do {
                try {
                    this.f1876a.m2296a(new ParticleEmitter((BufferedReader) bufferedReader));
                } catch (IOException e2) {
                    e = e2;
                }
            } while (bufferedReader.readLine() != null);
            ab.m2310a(bufferedReader);
        } catch (IOException e3) {
            e = e3;
            bufferedReader = null;
            try {
                throw new GdxRuntimeException("Error loading effect: " + c0316a, e);
            } catch (Throwable th) {
                e = th;
                ab.m2310a(bufferedReader);
                throw e;
            }
        } catch (Throwable th2) {
            e = th2;
            bufferedReader = null;
            ab.m2310a(bufferedReader);
            throw e;
        }
    }

    /* renamed from: a */
    public final void m1352a(C0316a c0316a, C0316a c0316a2) {
        m1351a(c0316a);
        this.f1880e = true;
        HashMap hashMap = new HashMap(this.f1876a.f3001b);
        int i = this.f1876a.f3001b;
        for (int i2 = 0; i2 < i; i2++) {
            ParticleEmitter particleEmitter = (ParticleEmitter) this.f1876a.m2291a(i2);
            if (particleEmitter.f1766j.f3001b != 0) {
                C0676a c0676a = new C0676a();
                Iterator it = particleEmitter.f1766j.iterator();
                while (it.hasNext()) {
                    String name = new File(((String) it.next()).replace('\\', '/')).getName();
                    Object obj = (C0439k) hashMap.get(name);
                    if (obj == null) {
                        obj = new C0439k(new Texture(c0316a2.mo266a(name)));
                        hashMap.put(name, obj);
                    }
                    c0676a.m2296a(obj);
                }
                particleEmitter.m1298a(c0676a);
            }
        }
    }

    /* renamed from: a */
    public final void m1353a(C0316a c0316a, C0480m c0480m, String str) {
        m1351a(c0316a);
        int i = this.f1876a.f3001b;
        for (int i2 = 0; i2 < i; i2++) {
            ParticleEmitter particleEmitter = (ParticleEmitter) this.f1876a.m2291a(i2);
            if (particleEmitter.f1766j.f3001b != 0) {
                C0676a c0676a = new C0676a();
                Iterator it = particleEmitter.f1766j.iterator();
                while (it.hasNext()) {
                    String name = new File(((String) it.next()).replace('\\', '/')).getName();
                    int lastIndexOf = name.lastIndexOf(46);
                    if (lastIndexOf != -1) {
                        name = name.substring(0, lastIndexOf);
                    }
                    if (str != null) {
                        name = str + name;
                    }
                    Object b = c0480m.m1443b(name);
                    if (b == null) {
                        throw new IllegalArgumentException("SpriteSheet missing image: " + name);
                    }
                    c0676a.m2296a(b);
                }
                particleEmitter.m1298a(c0676a);
            }
        }
    }

    /* renamed from: b */
    public final void dispose() {
        if (this.f1880e) {
            int i = this.f1876a.f3001b;
            for (int i2 = 0; i2 < i; i2++) {
                Iterator it = ((ParticleEmitter) this.f1876a.m2291a(i2)).f1760d.iterator();
                while (it.hasNext()) {
                    ((C0439k) it.next()).f1686z.dispose();
                }
            }
        }
    }
}
