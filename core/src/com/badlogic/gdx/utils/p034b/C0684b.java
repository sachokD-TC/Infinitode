package com.badlogic.gdx.utils.p034b;

import com.badlogic.gdx.graphics.C0427a;
import com.badlogic.gdx.graphics.C0507i;

/* renamed from: com.badlogic.gdx.utils.b.b */
public final class C0684b extends C0682c {
    /* renamed from: a */
    public float f3064a;

    public C0684b() {
        this(new C0507i());
    }

    private C0684b(C0427a c0427a) {
        this.f3064a = 1.0f;
        this.f3055b = c0427a;
    }

    /* renamed from: a */
    public final void mo522a(int i, int i2) {
        m2379a(0, 0, i, i2);
        m2377a(((float) i) * this.f3064a, ((float) i2) * this.f3064a);
        m2376a();
    }
}
