package com.badlogic.gdx.scenes.scene2d.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0607f;
import com.badlogic.gdx.scenes.scene2d.InputEvent;

/* renamed from: com.badlogic.gdx.scenes.scene2d.utils.d */
public class C0618d extends C0607f {
    /* renamed from: b */
    public static float f2713b = 0.1f;
    /* renamed from: a */
    private float f2714a = 14.0f;
    /* renamed from: c */
    public boolean f2715c;
    /* renamed from: d */
    public boolean f2716d;
    /* renamed from: e */
    public long f2717e;
    /* renamed from: f */
    private float f2718f = -1.0f;
    /* renamed from: g */
    private float f2719g = -1.0f;
    /* renamed from: h */
    private int f2720h = -1;
    /* renamed from: i */
    private int f2721i = -1;
    /* renamed from: j */
    private int f2722j;
    /* renamed from: k */
    private boolean f2723k;
    /* renamed from: l */
    private long f2724l = 400000000;
    /* renamed from: m */
    private int f2725m;
    /* renamed from: n */
    private long f2726n;

    /* renamed from: a */
    private boolean m2068a(C0602b c0602b, float f, float f2) {
        C0602b a = c0602b.mo469a(f, f2, true);
        return (a == null || !a.m1944a(c0602b)) ? !(this.f2718f == -1.0f && this.f2719g == -1.0f) && Math.abs(f - this.f2718f) < this.f2714a && Math.abs(f2 - this.f2719g) < this.f2714a : true;
    }

    /* renamed from: a */
    public final void mo495a(int i) {
        if (i == -1 && !this.f2723k) {
            this.f2716d = true;
        }
    }

    /* renamed from: a */
    public final void mo496a(InputEvent inputEvent, float f, float f2, int i) {
        if (i == this.f2720h && !this.f2723k) {
            this.f2715c = m2068a(inputEvent.f2553c, f, f2);
            if (this.f2715c && i == 0 && this.f2722j != -1 && !Gdx.input.mo305a(this.f2722j)) {
                this.f2715c = false;
            }
            if (!this.f2715c) {
                this.f2718f = -1.0f;
                this.f2719g = -1.0f;
            }
        }
    }

    /* renamed from: a */
    public boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
        if (this.f2715c) {
            return false;
        }
        if (i == 0 && this.f2722j != -1 && i2 != this.f2722j) {
            return false;
        }
        this.f2715c = true;
        this.f2720h = i;
        this.f2721i = i2;
        this.f2718f = f;
        this.f2719g = f2;
        this.f2717e = System.currentTimeMillis() + ((long) (f2713b * 1000.0f));
        return true;
    }

    /* renamed from: b */
    public void mo500b() {
    }

    /* renamed from: b */
    public final void mo498b(int i) {
        if (i == -1 && !this.f2723k) {
            this.f2716d = false;
        }
    }

    /* renamed from: b */
    public final void mo499b(InputEvent inputEvent, float f, float f2, int i, int i2) {
        if (i == this.f2720h) {
            if (!this.f2723k) {
                boolean a = m2068a(inputEvent.f2553c, f, f2);
                if (a && i == 0 && this.f2722j != -1 && i2 != this.f2722j) {
                    a = false;
                }
                if (a) {
                    long nanoTime = System.nanoTime();
                    if (nanoTime - this.f2726n > this.f2724l) {
                        this.f2725m = 0;
                    }
                    this.f2725m++;
                    this.f2726n = nanoTime;
                    mo500b();
                }
            }
            this.f2715c = false;
            this.f2720h = -1;
            this.f2721i = -1;
            this.f2723k = false;
        }
    }
}
