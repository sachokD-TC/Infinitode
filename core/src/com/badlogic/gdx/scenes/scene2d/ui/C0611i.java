package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.utils.C0616g;

/* renamed from: com.badlogic.gdx.scenes.scene2d.ui.i */
public abstract class C0611i {
    /* renamed from: a */
    public static final C0652a f2663a = new C0652a(0.0f);
    /* renamed from: b */
    public static C0611i f2664b = new C06461();
    /* renamed from: c */
    public static C0611i f2665c = new C06472();
    /* renamed from: d */
    public static C0611i f2666d = new C06483();
    /* renamed from: e */
    public static C0611i f2667e = new C06494();
    /* renamed from: f */
    public static C0611i f2668f = new C06505();
    /* renamed from: g */
    public static C0611i f2669g = new C06516();

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.i$1 */
    static class C06461 extends C0611i {
        C06461() {
        }

        /* renamed from: a */
        public final float mo478a(C0602b c0602b) {
            return c0602b instanceof C0616g ? ((C0616g) c0602b).mo485n() : c0602b == null ? 0.0f : c0602b.f2615i;
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.i$2 */
    static class C06472 extends C0611i {
        C06472() {
        }

        /* renamed from: a */
        public final float mo478a(C0602b c0602b) {
            return c0602b instanceof C0616g ? ((C0616g) c0602b).mo486o() : c0602b == null ? 0.0f : c0602b.f2616j;
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.i$3 */
    static class C06483 extends C0611i {
        C06483() {
        }

        /* renamed from: a */
        public final float mo478a(C0602b c0602b) {
            return c0602b instanceof C0616g ? ((C0616g) c0602b).mo483l() : c0602b == null ? 0.0f : c0602b.f2615i;
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.i$4 */
    static class C06494 extends C0611i {
        C06494() {
        }

        /* renamed from: a */
        public final float mo478a(C0602b c0602b) {
            return c0602b instanceof C0616g ? ((C0616g) c0602b).mo484m() : c0602b == null ? 0.0f : c0602b.f2616j;
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.i$5 */
    static class C06505 extends C0611i {
        C06505() {
        }

        /* renamed from: a */
        public final float mo478a(C0602b c0602b) {
            return ((c0602b instanceof C0616g) || c0602b == null) ? 0.0f : c0602b.f2615i;
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.i$6 */
    static class C06516 extends C0611i {
        C06516() {
        }

        /* renamed from: a */
        public final float mo478a(C0602b c0602b) {
            return ((c0602b instanceof C0616g) || c0602b == null) ? 0.0f : c0602b.f2616j;
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.i$a */
    public static class C0652a extends C0611i {
        /* renamed from: h */
        private final float f2909h;

        public C0652a(float f) {
            this.f2909h = f;
        }

        /* renamed from: a */
        public final float mo478a(C0602b c0602b) {
            return this.f2909h;
        }
    }

    /* renamed from: a */
    public abstract float mo478a(C0602b c0602b);
}
