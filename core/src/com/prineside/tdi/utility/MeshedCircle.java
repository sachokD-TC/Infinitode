package com.prineside.tdi.utility;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.C0507i;
import com.badlogic.gdx.graphics.C0512m;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.glutils.C0501p;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.prineside.tdi.Game;

public class MeshedCircle implements Disposable {
    /* renamed from: f */
    private static C0501p f8646f;
    /* renamed from: a */
    public Mesh f8647a = new Mesh(true, this.f8652g, this.f8654i.length, new C0512m(1, 2, "a_position"), new C0512m(4, 4, "a_color"));
    /* renamed from: b */
    public float f8648b;
    /* renamed from: c */
    public float f8649c;
    /* renamed from: d */
    public float f8650d;
    /* renamed from: e */
    public float f8651e;
    /* renamed from: g */
    private int f8652g = 144;
    /* renamed from: h */
    private float[] f8653h = new float[(this.f8652g * 3)];
    /* renamed from: i */
    private short[] f8654i = new short[144];
    /* renamed from: j */
    private int f8655j = 24;
    /* renamed from: k */
    private boolean f8656k;

    public MeshedCircle(float f, float f2, float f3, float f4, C0430b c0430b, C0430b c0430b2) {
        m8815a(f, f2, f3, f4, c0430b, c0430b2);
    }

    /* renamed from: a */
    public static void m8813a() {
        C0501p.f2222a = false;
        C0501p c0501p = new C0501p("attribute vec2 a_position;\nattribute vec4 a_color;\nuniform mat4 u_projTrans;\nvarying vec4 vColor;\nvoid main() {\n\tvColor = a_color;\n\tgl_Position =  u_projTrans * vec4(a_position.xy, 0.0, 1.0);\n}", "#ifdef GL_ES\nprecision mediump float;\n#endif\nvarying vec4 vColor;\nvoid main() {\n\tgl_FragColor = vColor;\n}");
        f8646f = c0501p;
        String a = c0501p.m1605a();
        if (!f8646f.f2227d) {
            throw new GdxRuntimeException(a);
        } else if (a != null && a.length() != 0) {
            Game.game.logger.log("MeshedCircle", "Shader Logger: " + a);
        }
    }

    /* renamed from: a */
    public final void m8814a(float f, float f2) {
        int i = 0;
        if (this.f8656k) {
            Game.game.logger.m7510b("MeshedCircle#setPosition", "Already disposed");
            return;
        }
        float f3 = f - this.f8648b;
        float f4 = f2 - this.f8649c;
        this.f8648b = f;
        this.f8649c = f2;
        int i2 = 0;
        while (i < this.f8655j) {
            int i3 = i2 * 3;
            float[] fArr = this.f8653h;
            fArr[i3] = fArr[i3] + f3;
            fArr = this.f8653h;
            i3++;
            fArr[i3] = fArr[i3] + f4;
            short s = (short) (i2 + 1);
            i3 = s * 3;
            fArr = this.f8653h;
            fArr[i3] = fArr[i3] + f3;
            fArr = this.f8653h;
            i3++;
            fArr[i3] = fArr[i3] + f4;
            i2 = (short) (s + 1);
            i++;
        }
        this.f8647a.m1097a(this.f8653h);
    }

    /* renamed from: a */
    public final void m8815a(float f, float f2, float f3, float f4, C0430b c0430b, C0430b c0430b2) {
        if (this.f8656k) {
            Game.game.logger.m7510b("MeshedCircle#update", "Already disposed");
            return;
        }
        int i;
        this.f8648b = f;
        this.f8649c = f2;
        this.f8650d = f3;
        this.f8651e = f4;
        float a = c0430b.m1216a();
        float a2 = c0430b2.m1216a();
        float f5 = 360.0f / ((float) this.f8655j);
        Vector2 vector2 = new Vector2();
        int i2 = 0;
        for (i = 0; i < this.f8655j; i++) {
            int i3 = i2 * 3;
            vector2.f2337x = f;
            vector2.f2338y = f2;
            PMath.m8823a(vector2, ((float) i) * f5, f4);
            this.f8653h[i3] = vector2.f2337x;
            this.f8653h[i3 + 1] = vector2.f2338y;
            this.f8653h[i3 + 2] = a2;
            short s = (short) (i2 + 1);
            i3 = s * 3;
            vector2.f2337x = f;
            vector2.f2338y = f2;
            PMath.m8823a(vector2, ((float) i) * f5, f3);
            this.f8653h[i3] = vector2.f2337x;
            this.f8653h[i3 + 1] = vector2.f2338y;
            this.f8653h[i3 + 2] = a;
            i2 = (short) (s + 1);
        }
        i = 0;
        for (i2 = 0; i2 < this.f8655j; i2 = (short) (i2 + 1)) {
            int i4;
            int i5;
            if (i2 == this.f8655j - 1) {
                i4 = i + 1;
                this.f8654i[i] = (short) (i2 * 2);
                i5 = i4 + 1;
                this.f8654i[i4] = (short) ((i2 * 2) + 1);
                i4 = i5 + 1;
                this.f8654i[i5] = (short) 0;
                i5 = i4 + 1;
                this.f8654i[i4] = (short) ((i2 * 2) + 1);
                i4 = i5 + 1;
                this.f8654i[i5] = (short) 0;
                i = i4 + 1;
                this.f8654i[i4] = (short) 1;
            } else {
                i4 = i + 1;
                this.f8654i[i] = (short) (i2 * 2);
                i5 = i4 + 1;
                this.f8654i[i4] = (short) ((i2 * 2) + 1);
                i4 = i5 + 1;
                this.f8654i[i5] = (short) ((i2 * 2) + 2);
                i5 = i4 + 1;
                this.f8654i[i4] = (short) ((i2 * 2) + 2);
                i4 = i5 + 1;
                this.f8654i[i5] = (short) ((i2 * 2) + 3);
                i = i4 + 1;
                this.f8654i[i4] = (short) ((i2 * 2) + 1);
            }
        }
        this.f8647a.m1097a(this.f8653h);
        this.f8647a.m1099a(this.f8654i);
    }

    /* renamed from: a */
    public final void m8816a(C0507i c0507i) {
        if (this.f8656k) {
            Game.game.logger.m7510b("MeshedCircle#draw", "Already disposed");
            return;
        }
        Gdx.gl.glEnable(3042);
        Gdx.gl.glBlendFunc(770, 771);
        f8646f.m1614c();
        f8646f.m1611a("u_projTrans", c0507i.f);
        this.f8647a.m1101a(f8646f, this.f8652g);
        C0501p.m1601d();
    }

    /* renamed from: b */
    public final void dispose() {
        if (this.f8656k) {
            Game.game.logger.m7510b("MeshedCircle#dispose", "Already disposed");
            Game.game.logger.m7509a(new Exception());
            return;
        }
        this.f8647a.dispose();
        this.f8656k = true;
    }
}
