package com.prineside.tdi.utility;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.g2d.C0444a;
import com.badlogic.gdx.scenes.scene2d.ui.C0624j;
import com.prineside.tdi.Game;

public class QuadActor extends C0624j {
    /* renamed from: s */
    private static float[] f8658s = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    /* renamed from: q */
    private float[] f8659q = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    /* renamed from: r */
    private int[] f8660r = new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255};

    public QuadActor() {
        m8831a(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f});
        m8832a(new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255});
    }

    public QuadActor(float[] fArr, C0430b c0430b) {
        m8831a(fArr);
        m8833b(c0430b);
    }

    public QuadActor(float[] fArr, C0430b c0430b, C0430b c0430b2, C0430b c0430b3, C0430b c0430b4) {
        m8831a(fArr);
        m8829a(c0430b, c0430b2, c0430b3, c0430b4);
    }

    public QuadActor(float[] fArr, int[] iArr) {
        m8831a(fArr);
        m8832a(iArr);
    }

    /* renamed from: a */
    private void m8829a(C0430b c0430b, C0430b c0430b2, C0430b c0430b3, C0430b c0430b4) {
        this.f8660r[0] = (int) (c0430b.f1644I * 255.0f);
        this.f8660r[1] = (int) (c0430b.f1645J * 255.0f);
        this.f8660r[2] = (int) (c0430b.f1646K * 255.0f);
        this.f8660r[3] = (int) (c0430b.f1647L * 255.0f);
        this.f8660r[4] = (int) (c0430b2.f1644I * 255.0f);
        this.f8660r[5] = (int) (c0430b2.f1645J * 255.0f);
        this.f8660r[6] = (int) (c0430b2.f1646K * 255.0f);
        this.f8660r[7] = (int) (c0430b2.f1647L * 255.0f);
        this.f8660r[8] = (int) (c0430b3.f1644I * 255.0f);
        this.f8660r[9] = (int) (c0430b3.f1645J * 255.0f);
        this.f8660r[10] = (int) (c0430b3.f1646K * 255.0f);
        this.f8660r[11] = (int) (c0430b3.f1647L * 255.0f);
        this.f8660r[12] = (int) (c0430b4.f1644I * 255.0f);
        this.f8660r[13] = (int) (c0430b4.f1645J * 255.0f);
        this.f8660r[14] = (int) (c0430b4.f1646K * 255.0f);
        this.f8660r[15] = (int) (c0430b4.f1647L * 255.0f);
    }

    /* renamed from: a */
    public final void mo471a(C0444a c0444a, float f) {
        super.b_();
        float f2 = this.f2613g;
        float f3 = this.f2614h;
        float f4 = this.f2615i;
        float f5 = this.f2616j;
        C0430b c0430b = this.f2622p;
        for (int i = 0; i < 4; i++) {
            f8658s[i * 5] = (this.f8659q[i * 2] * f4) + f2;
            f8658s[(i * 5) + 1] = (this.f8659q[(i * 2) + 1] * f5) + f3;
            f8658s[(i * 5) + 2] = C0430b.m1209a((int) (((float) this.f8660r[i * 4]) * c0430b.f1644I), (int) (((float) this.f8660r[(i * 4) + 1]) * c0430b.f1645J), (int) (((float) this.f8660r[(i * 4) + 2]) * c0430b.f1646K), (int) ((((float) this.f8660r[(i * 4) + 3]) * f) * c0430b.f1647L));
        }
        c0444a.mo369a(Game.game.f6562F.f1686z, f8658s, 0, 20);
    }

    /* renamed from: a */
    public final void m8831a(float[] fArr) {
        int i = 0;
        if (fArr.length != 8) {
            throw new RuntimeException("vertices must be an array of 8 floats, " + fArr.length + " passed");
        }
        System.arraycopy(fArr, 0, this.f8659q, 0, this.f8659q.length);
        C0438n c0438n = Game.game.f6562F;
        float f = c0438n.f1680A;
        float f2 = c0438n.f1681B;
        while (i < 4) {
            f8658s[(i * 5) + 3] = f;
            f8658s[(i * 5) + 4] = f2;
            i++;
        }
    }

    /* renamed from: a */
    public final void m8832a(int[] iArr) {
        if (iArr.length != 16) {
            throw new RuntimeException("colors must be an array of 16 ints, " + iArr.length + " passed");
        }
        System.arraycopy(iArr, 0, this.f8660r, 0, this.f8660r.length);
    }

    /* renamed from: b */
    public final void m8833b(C0430b c0430b) {
        m8829a(c0430b, c0430b, c0430b, c0430b);
    }
}
