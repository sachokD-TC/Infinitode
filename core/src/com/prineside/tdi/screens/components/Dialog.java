package com.prineside.tdi.screens.components;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.math.C0547e;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.C0609g;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f.C0628a;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.C0618d;
import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.Game;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.utility.QuadActor;

public class Dialog {
    /* renamed from: a */
    public static final C0430b f7650a = new C0430b(427217663);
    /* renamed from: b */
    public boolean f7651b = false;
    /* renamed from: c */
    private C0605e f7652c;
    /* renamed from: d */
    private C0629f f7653d;
    /* renamed from: e */
    private C0605e f7654e;
    /* renamed from: f */
    private QuadActor f7655f;
    /* renamed from: g */
    private C0629f f7656g;
    /* renamed from: h */
    private C0605e f7657h;
    /* renamed from: i */
    private QuadActor f7658i;
    /* renamed from: j */
    private C0629f f7659j;
    /* renamed from: k */
    private int[] f7660k = new int[16];
    /* renamed from: l */
    private Runnable f7661l;
    /* renamed from: m */
    private Runnable f7662m;

    /* renamed from: com.prineside.tdi.screens.components.Dialog$2 */
    class C11822 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ Dialog f7644a;

        C11822(Dialog dialog) {
            this.f7644a = dialog;
        }

        /* renamed from: a */
        public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
            return true;
        }
    }

    /* renamed from: com.prineside.tdi.screens.components.Dialog$3 */
    class C11833 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ Dialog f7645a;

        C11833(Dialog dialog) {
            this.f7645a = dialog;
        }

        /* renamed from: b */
        public final void mo500b() {
            if (this.f7645a.f7661l != null) {
                Sound.m7569a(Type.CLICK);
                this.f7645a.f7661l.run();
            }
        }
    }

    /* renamed from: com.prineside.tdi.screens.components.Dialog$4 */
    class C11844 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ Dialog f7646a;

        C11844(Dialog dialog) {
            this.f7646a = dialog;
        }

        /* renamed from: b */
        public final void mo500b() {
            if (this.f7646a.f7662m != null) {
                Sound.m7569a(Type.CLICK);
                this.f7646a.f7662m.run();
            }
        }
    }

    /* renamed from: com.prineside.tdi.screens.components.Dialog$5 */
    class C11855 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ Dialog f7647a;

        C11855(Dialog dialog) {
            this.f7647a = dialog;
        }

        public void run() {
            this.f7647a.m8211a();
        }
    }

    /* renamed from: com.prineside.tdi.screens.components.Dialog$6 */
    class C11866 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ Dialog f7648a;

        public C11866(Dialog dialog) {
            this.f7648a = dialog;
        }

        public void run() {
            this.f7648a.m8211a();
        }
    }

    /* renamed from: com.prineside.tdi.screens.components.Dialog$7 */
    class C11877 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ Dialog f7649a;

        C11877(Dialog dialog) {
            this.f7649a = dialog;
        }

        public void run() {
            this.f7649a.m8211a();
        }
    }

    public Dialog(C0609g c0609g) {
        new C0645h().m2192a(Game.game.f6561E);
        final C0676a c0676a = new C0676a();
        c0676a.m2296a(new Vector2(24.0f, 0.0f));
        c0676a.m2296a(new Vector2(0.0f, 294.0f));
        c0676a.m2296a(new Vector2(605.0f, 339.0f));
        c0676a.m2296a(new Vector2(565.0f, 0.0f));
        this.f7652c = new C0605e(this) {
            /* renamed from: t */
            final /* synthetic */ Dialog f7643t;

            /* renamed from: a */
            public final C0602b mo469a(float f, float f2, boolean z) {
                return C0547e.m1759a(c0676a, new Vector2(f, f2)) ? super.mo469a(f, f2, z) : null;
            }
        };
        this.f7652c.f2628r = false;
        this.f7652c.f2610d = Touchable.enabled;
        this.f7652c.m1947a(new C11822(this));
        this.f7652c.m1956c(605.0f, 339.0f);
        this.f7652c.f2611e = false;
        C0602b table = new Table();
        table.f2677Y = true;
        table.f2610d = Touchable.childrenOnly;
        table.m2059d(this.f7652c);
        c0609g.m2004a(table);
        table = new QuadActor(new float[]{0.04f, 0.0f, 0.0f, 0.87f, 1.0f, 1.0f, 0.94f, 0.0f}, new int[]{0, 0, 0, 204, 0, 0, 0, 204, 0, 0, 0, 204, 0, 0, 0, 204});
        table.m1956c(605.0f, 339.0f);
        this.f7652c.mo510b(table);
        this.f7654e = new C0605e();
        this.f7654e.f2628r = false;
        this.f7654e.m1935a(52.0f, 35.0f);
        this.f7654e.m1956c(229.0f, 89.0f);
        this.f7652c.mo510b(this.f7654e);
        this.f7655f = new QuadActor(new float[]{0.026f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f}, this.f7660k);
        this.f7655f.m1956c(this.f7654e.f2615i, this.f7654e.f2616j);
        this.f7654e.mo510b(this.f7655f);
        this.f7656g = new C0629f(Game.f6551e.m2416a("cancel"), new C0628a(Game.game.m7463g(48), C0430b.f1620c));
        this.f7656g.m1956c(229.0f, 89.0f);
        this.f7656g.m2127a(1);
        this.f7654e.mo510b(this.f7656g);
        this.f7654e.m1947a(new C11833(this));
        this.f7657h = new C0605e();
        this.f7657h.f2628r = false;
        this.f7657h.m1935a(313.0f, 35.0f);
        this.f7657h.m1956c(231.0f, 89.0f);
        this.f7652c.mo510b(this.f7657h);
        this.f7658i = new QuadActor(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.966f, 0.0f}, this.f7660k);
        this.f7658i.m1956c(this.f7657h.f2615i, this.f7657h.f2616j);
        this.f7657h.mo510b(this.f7658i);
        this.f7659j = new C0629f("OK", new C0628a(Game.game.m7463g(48), C0430b.f1620c));
        this.f7659j.m1956c(231.0f, 89.0f);
        this.f7659j.m2127a(1);
        this.f7657h.mo510b(this.f7659j);
        this.f7657h.m1947a(new C11844(this));
        this.f7653d = new C0629f("Default label", new C0628a(Game.game.m7463g(36), C0430b.f1620c));
        this.f7653d.m1935a(52.0f, 124.0f);
        this.f7653d.m1956c(492.0f, 169.0f);
        this.f7653d.m2135h();
        this.f7653d.m2127a(1);
        this.f7652c.mo510b(this.f7653d);
    }

    /* renamed from: a */
    private void m8209a(boolean z, C0430b c0430b) {
        int i = (int) (c0430b.f1644I * 255.0f);
        int i2 = (int) (c0430b.f1645J * 255.0f);
        int i3 = (int) (c0430b.f1646K * 255.0f);
        int i4 = (int) (c0430b.f1647L * 255.0f);
        for (int i5 = 0; i5 < 4; i5++) {
            this.f7660k[i5 * 4] = i;
            this.f7660k[(i5 * 4) + 1] = i2;
            this.f7660k[(i5 * 4) + 2] = i3;
            this.f7660k[(i5 * 4) + 3] = i4;
        }
        if (z) {
            this.f7658i.m8832a(this.f7660k);
        } else {
            this.f7655f.m8832a(this.f7660k);
        }
    }

    /* renamed from: a */
    public final void m8211a() {
        this.f7652c.f2611e = false;
        this.f7651b = false;
    }

    /* renamed from: a */
    public final void m8212a(String str) {
        Runnable c11855 = new C11855(this);
        this.f7654e.f2611e = false;
        this.f7653d.m2130a((CharSequence) str);
        this.f7653d.f2611e = true;
        this.f7659j.m2130a((CharSequence) "OK");
        m8209a(true, f7650a);
        this.f7657h.f2611e = true;
        this.f7662m = c11855;
        this.f7652c.f2611e = true;
        this.f7651b = true;
    }

    /* renamed from: a */
    public final void m8213a(String str, Runnable runnable) {
        m8214a(str, Game.f6551e.m2416a("cancel"), Game.f6551e.m2416a("yes"), f7650a, f7650a, new C11877(this), runnable);
    }

    /* renamed from: a */
    public final void m8214a(String str, String str2, String str3, C0430b c0430b, C0430b c0430b2, Runnable runnable, Runnable runnable2) {
        this.f7653d.m2130a((CharSequence) str);
        this.f7653d.f2611e = true;
        this.f7656g.m2130a((CharSequence) str2);
        if (c0430b == null) {
            c0430b = f7650a;
        }
        m8209a(false, c0430b);
        this.f7654e.f2611e = true;
        this.f7661l = runnable;
        this.f7659j.m2130a((CharSequence) str3);
        if (c0430b2 == null) {
            c0430b2 = f7650a;
        }
        m8209a(true, c0430b2);
        this.f7657h.f2611e = true;
        this.f7662m = runnable2;
        this.f7652c.f2611e = true;
        this.f7651b = true;
        Sound.m7569a(Type.QUESTION);
    }
}
