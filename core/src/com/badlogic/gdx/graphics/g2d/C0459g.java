package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.graphics.g2d.ParticleEmitter.C0441d;
import com.badlogic.gdx.utils.C0328t;
import com.badlogic.gdx.utils.C0676a;

/* renamed from: com.badlogic.gdx.graphics.g2d.g */
public final class C0459g extends C0328t<C0458a> {
    /* renamed from: a */
    private final C0453f f1984a;

    /* renamed from: com.badlogic.gdx.graphics.g2d.g$a */
    public class C0458a extends C0453f {
        /* renamed from: e */
        final /* synthetic */ C0459g f1983e;

        C0458a(C0459g c0459g, C0453f c0453f) {
            this.f1983e = c0459g;
            super(c0453f);
        }
    }

    public C0459g(C0453f c0453f) {
        super(16, 1024);
        this.f1984a = c0453f;
    }

    /* renamed from: a */
    protected final /* synthetic */ Object mo301a() {
        return new C0458a(this, this.f1984a);
    }

    /* renamed from: a */
    public final void m1384a(C0458a c0458a) {
        int i;
        super.mo363a((Object) c0458a);
        int i2 = c0458a.f1876a.f3001b;
        for (i = 0; i < i2; i++) {
            ParticleEmitter particleEmitter = (ParticleEmitter) c0458a.f1876a.m2291a(i);
            particleEmitter.f1773q = 0;
            particleEmitter.f1775s = particleEmitter.f1774r;
            boolean[] zArr = particleEmitter.f1768l;
            int length = zArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                zArr[i3] = false;
            }
            particleEmitter.f1767k = 0;
            particleEmitter.m1300b();
        }
        if (c0458a.b != this.f1984a.f1877b || c0458a.c != this.f1984a.f1878c || c0458a.d != this.f1984a.f1879d) {
            C0676a c0676a = c0458a.f1876a;
            C0676a c0676a2 = this.f1984a.f1876a;
            for (i2 = 0; i2 < c0676a.f3001b; i2++) {
                particleEmitter = (ParticleEmitter) c0676a.m2291a(i2);
                ParticleEmitter particleEmitter2 = (ParticleEmitter) c0676a2.m2291a(i2);
                C0441d[] d = particleEmitter.m1302d();
                C0441d[] d2 = particleEmitter2.m1302d();
                for (i = 0; i < d.length; i++) {
                    d[i].mo359a(d2[i]);
                }
                d = particleEmitter.m1303e();
                d2 = particleEmitter2.m1303e();
                for (i = 0; i < d.length; i++) {
                    d[i].mo359a(d2[i]);
                }
                C0441d[] f = particleEmitter.m1304f();
                C0441d[] f2 = particleEmitter2.m1304f();
                for (int i4 = 0; i4 < f.length; i4++) {
                    f[i4].mo359a(f2[i4]);
                }
            }
            c0458a.b = this.f1984a.f1877b;
            c0458a.c = this.f1984a.f1878c;
            c0458a.d = this.f1984a.f1879d;
        }
    }
}
