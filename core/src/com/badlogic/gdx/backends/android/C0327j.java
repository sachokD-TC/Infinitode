package com.badlogic.gdx.backends.android;

import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.EGLConfigChooser;
import android.opengl.GLSurfaceView.Renderer;
import android.os.Build.VERSION;
import android.os.Process;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.C0280i;
import com.badlogic.gdx.C0326e;
import com.badlogic.gdx.C0366h;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.android.C0341k.C0338a;
import com.badlogic.gdx.backends.android.C0341k.C0340c;
import com.badlogic.gdx.backends.android.p015a.C0285f;
import com.badlogic.gdx.backends.android.p015a.C0290b;
import com.badlogic.gdx.backends.android.p015a.C0295d;
import com.badlogic.gdx.backends.android.p015a.C0295d.C0303h;
import com.badlogic.gdx.backends.android.p015a.C0296c;
import com.badlogic.gdx.backends.android.p015a.C0308e;
import com.badlogic.gdx.graphics.C0284f;
import com.badlogic.gdx.graphics.C0322g;
import com.badlogic.gdx.graphics.C0433d;
import com.badlogic.gdx.graphics.C0510k;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.C0484d;
import com.badlogic.gdx.graphics.glutils.C0501p;
import com.badlogic.gdx.graphics.glutils.GLVersion;
import com.badlogic.gdx.math.C0550g;
import com.badlogic.gdx.utils.C0728z;
import com.badlogic.gdx.utils.GdxRuntimeException;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.badlogic.gdx.backends.android.j */
public final class C0327j implements Renderer, C0326e {
    /* renamed from: a */
    static volatile boolean f1141a = false;
    /* renamed from: A */
    private float f1142A;
    /* renamed from: B */
    private float f1143B;
    /* renamed from: C */
    private float f1144C;
    /* renamed from: D */
    private float f1145D;
    /* renamed from: E */
    private float f1146E;
    /* renamed from: F */
    private C0370a f1147F;
    /* renamed from: b */
    final View f1148b;
    /* renamed from: c */
    int f1149c;
    /* renamed from: d */
    int f1150d;
    /* renamed from: e */
    C0283a f1151e;
    /* renamed from: f */
    C0284f f1152f;
    /* renamed from: g */
    C0322g f1153g;
    /* renamed from: h */
    EGLContext f1154h;
    /* renamed from: i */
    GLVersion f1155i;
    /* renamed from: j */
    String f1156j;
    /* renamed from: k */
    protected long f1157k;
    /* renamed from: l */
    protected float f1158l;
    /* renamed from: m */
    protected long f1159m;
    /* renamed from: n */
    protected long f1160n;
    /* renamed from: o */
    protected int f1161o;
    /* renamed from: p */
    protected int f1162p;
    /* renamed from: q */
    protected C0550g f1163q;
    /* renamed from: r */
    volatile boolean f1164r;
    /* renamed from: s */
    volatile boolean f1165s;
    /* renamed from: t */
    volatile boolean f1166t;
    /* renamed from: u */
    volatile boolean f1167u;
    /* renamed from: v */
    volatile boolean f1168v;
    /* renamed from: w */
    protected final C0310b f1169w;
    /* renamed from: x */
    boolean f1170x;
    /* renamed from: y */
    int[] f1171y;
    /* renamed from: z */
    Object f1172z;

    /* renamed from: com.badlogic.gdx.backends.android.j$a */
    private class C0325a extends C0324b {
        /* renamed from: e */
        final /* synthetic */ C0327j f1140e;

        protected C0325a(C0327j c0327j, int i, int i2) {
            this.f1140e = c0327j;
            super(i, i2);
        }
    }

    public C0327j(C0283a c0283a, C0310b c0310b, C0285f c0285f) {
        this(c0283a, c0310b, c0285f, (byte) 0);
    }

    private C0327j(C0283a c0283a, C0310b c0310b, C0285f c0285f, byte b) {
        this.f1157k = System.nanoTime();
        this.f1158l = 0.0f;
        this.f1159m = System.nanoTime();
        this.f1160n = -1;
        this.f1161o = 0;
        this.f1163q = new C0550g();
        this.f1164r = false;
        this.f1165s = false;
        this.f1166t = false;
        this.f1167u = false;
        this.f1168v = false;
        this.f1142A = 0.0f;
        this.f1143B = 0.0f;
        this.f1144C = 0.0f;
        this.f1145D = 0.0f;
        this.f1146E = 1.0f;
        this.f1147F = new C0370a(5, 6, 5, 0, 16, 0, 0, false);
        this.f1170x = true;
        this.f1171y = new int[1];
        this.f1172z = new Object();
        AndroidGL20.init();
        this.f1169w = c0310b;
        this.f1151e = c0283a;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eglGetDisplay, new int[2]);
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eglGetDisplay, new int[]{12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344}, new EGLConfig[10], 10, iArr);
        egl10.eglTerminate(eglGetDisplay);
        if ((iArr[0] > 0 ? 1 : null) == null) {
            throw new GdxRuntimeException("Libgdx requires OpenGL ES 2.0");
        }
        View view;
        EGLConfigChooser c0308e = new C0308e(this.f1169w.f1092a, this.f1169w.f1093b, this.f1169w.f1094c, this.f1169w.f1095d, this.f1169w.f1096e, this.f1169w.f1097f, this.f1169w.f1098g);
        if (VERSION.SDK_INT > 10 || !this.f1169w.f1113v) {
            View c0290b = new C0290b(c0283a.getContext(), c0285f, this.f1169w.f1112u ? 3 : 2);
            c0290b.setEGLConfigChooser(c0308e);
            c0290b.setRenderer(this);
            view = c0290b;
        } else {
            View c0296c = new C0296c(c0283a.getContext(), c0285f);
            c0296c.setEGLConfigChooser(c0308e);
            c0296c.setRenderer(this);
            view = c0296c;
        }
        this.f1148b = view;
        if ((VERSION.SDK_INT >= 11 && (this.f1148b instanceof C0290b)) || (this.f1148b instanceof C0296c)) {
            try {
                this.f1148b.getClass().getMethod("setPreserveEGLContextOnPause", new Class[]{Boolean.TYPE}).invoke(this.f1148b, new Object[]{Boolean.valueOf(true)});
            } catch (Exception e) {
                Gdx.app.log("AndroidGraphics", "Method GLSurfaceView.setPreserveEGLContextOnPause not found");
            }
        }
        this.f1148b.setFocusable(true);
        this.f1148b.setFocusableInTouchMode(true);
    }

    /* renamed from: a */
    private int m941a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f1171y) ? this.f1171y[0] : 0;
    }

    /* renamed from: p */
    private void m942p() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f1151e.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f1142A = displayMetrics.xdpi;
        this.f1143B = displayMetrics.ydpi;
        this.f1144C = displayMetrics.xdpi / 2.54f;
        this.f1145D = displayMetrics.ydpi / 2.54f;
        this.f1146E = displayMetrics.density;
    }

    /* renamed from: q */
    private static void m943q() {
        Gdx.app.log("AndroidGraphics", Mesh.m1095f());
        Gdx.app.log("AndroidGraphics", Texture.m1140l());
        Gdx.app.log("AndroidGraphics", C0433d.m1227c());
        Gdx.app.log("AndroidGraphics", C0501p.m1602f());
        Gdx.app.log("AndroidGraphics", C0484d.m1490h());
    }

    /* renamed from: a */
    public final void m944a(boolean z) {
        int i = 1;
        if (this.f1148b != null) {
            boolean z2 = f1141a || z;
            this.f1170x = z2;
            if (!this.f1170x) {
                i = 0;
            }
            if (this.f1148b instanceof C0295d) {
                ((C0295d) this.f1148b).setRenderMode(i);
            }
            if (this.f1148b instanceof GLSurfaceView) {
                ((GLSurfaceView) this.f1148b).setRenderMode(i);
            }
            this.f1163q.m1773a();
        }
    }

    /* renamed from: a */
    public final boolean mo291a() {
        return this.f1153g != null;
    }

    /* renamed from: a */
    public final boolean mo292a(String str) {
        if (this.f1156j == null) {
            this.f1156j = Gdx.gl.glGetString(7939);
        }
        return this.f1156j.contains(str);
    }

    /* renamed from: b */
    public final C0284f mo293b() {
        return this.f1152f;
    }

    /* renamed from: c */
    public final int mo294c() {
        return this.f1149c;
    }

    /* renamed from: d */
    public final int mo295d() {
        return this.f1150d;
    }

    /* renamed from: e */
    public final int mo296e() {
        return this.f1149c;
    }

    /* renamed from: f */
    public final int mo297f() {
        return this.f1150d;
    }

    /* renamed from: g */
    public final float getDeltaTime() {
        return this.f1163q.m1774b() == 0.0f ? this.f1158l : this.f1163q.m1774b();
    }

    /* renamed from: h */
    public final C0324b mo299h() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f1151e.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return new C0325a(this, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* renamed from: i */
    public final void mo300i() {
        if (this.f1148b != null) {
            if (this.f1148b instanceof C0295d) {
                C0303h c0303h = ((C0295d) this.f1148b).f1022c;
                synchronized (C0295d.f1020a) {
                    c0303h.f1063l = true;
                    C0295d.f1020a.notifyAll();
                }
            }
            if (this.f1148b instanceof GLSurfaceView) {
                ((GLSurfaceView) this.f1148b).requestRender();
            }
        }
    }

    /* renamed from: j */
    public final void m955j() {
        if (this.f1148b != null) {
            if (this.f1148b instanceof C0295d) {
                C0303h c0303h = ((C0295d) this.f1148b).f1022c;
                synchronized (C0295d.f1020a) {
                    c0303h.f1053b = true;
                    C0295d.f1020a.notifyAll();
                    while (!c0303h.f1052a && !c0303h.f1054c) {
                        try {
                            C0295d.f1020a.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
            if (this.f1148b instanceof GLSurfaceView) {
                ((GLSurfaceView) this.f1148b).onPause();
            }
        }
    }

    /* renamed from: k */
    public final void m956k() {
        if (this.f1148b != null) {
            if (this.f1148b instanceof C0295d) {
                C0303h c0303h = ((C0295d) this.f1148b).f1022c;
                synchronized (C0295d.f1020a) {
                    c0303h.f1053b = false;
                    c0303h.f1063l = true;
                    c0303h.f1064m = false;
                    C0295d.f1020a.notifyAll();
                    while (!c0303h.f1052a && c0303h.f1054c && !c0303h.f1064m) {
                        try {
                            C0295d.f1020a.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
            if (this.f1148b instanceof GLSurfaceView) {
                ((GLSurfaceView) this.f1148b).onResume();
            }
        }
    }

    /* renamed from: l */
    final void m957l() {
        synchronized (this.f1172z) {
            this.f1165s = true;
            this.f1167u = true;
        }
    }

    /* renamed from: m */
    final void m958m() {
        synchronized (this.f1172z) {
            if (this.f1165s) {
                this.f1165s = false;
                this.f1166t = true;
                while (this.f1166t) {
                    try {
                        this.f1172z.wait(4000);
                        if (this.f1166t) {
                            Gdx.app.error("AndroidGraphics", "waiting for pause synchronization took too long; assuming deadlock and killing");
                            Process.killProcess(Process.myPid());
                        }
                    } catch (InterruptedException e) {
                        Gdx.app.log("AndroidGraphics", "waiting for pause synchronization failed!");
                    }
                }
                return;
            }
        }
    }

    /* renamed from: n */
    final void m959n() {
        synchronized (this.f1172z) {
            this.f1165s = false;
            this.f1168v = true;
            while (this.f1168v) {
                try {
                    this.f1172z.wait();
                } catch (InterruptedException e) {
                    Gdx.app.log("AndroidGraphics", "waiting for destroy synchronization failed!");
                }
            }
        }
    }

    /* renamed from: o */
    public final void m960o() {
        Mesh.m1094b(this.f1151e);
        Texture.m1138a(this.f1151e);
        C0433d.m1225a(this.f1151e);
        C0510k.m1660a(this.f1151e);
        C0501p.m1599b(this.f1151e);
        C0484d.m1488b(this.f1151e);
        C0327j.m943q();
    }

    public final void onDrawFrame(GL10 gl10) {
        C0280i[] c0280iArr;
        int i;
        int i2;
        C0728z lifecycleListeners;
        long nanoTime = System.nanoTime();
        this.f1158l = ((float) (nanoTime - this.f1157k)) / 1.0E9f;
        this.f1157k = nanoTime;
        if (this.f1167u) {
            this.f1158l = 0.0f;
        } else {
            C0550g c0550g = this.f1163q;
            float f = this.f1158l;
            if (c0550g.f2449b < c0550g.f2448a.length) {
                c0550g.f2449b++;
            }
            float[] fArr = c0550g.f2448a;
            int i3 = c0550g.f2450c;
            c0550g.f2450c = i3 + 1;
            fArr[i3] = f;
            if (c0550g.f2450c > c0550g.f2448a.length - 1) {
                c0550g.f2450c = 0;
            }
            c0550g.f2452e = true;
        }
        synchronized (this.f1172z) {
            boolean z = this.f1165s;
            boolean z2 = this.f1166t;
            boolean z3 = this.f1168v;
            boolean z4 = this.f1167u;
            if (this.f1167u) {
                this.f1167u = false;
            }
            if (this.f1166t) {
                this.f1166t = false;
                this.f1172z.notifyAll();
            }
            if (this.f1168v) {
                this.f1168v = false;
                this.f1172z.notifyAll();
            }
        }
        if (z4) {
            C0728z lifecycleListeners2 = this.f1151e.getLifecycleListeners();
            synchronized (lifecycleListeners2) {
                c0280iArr = (C0280i[]) lifecycleListeners2.m2540f();
                i = lifecycleListeners2.b;
                for (i2 = 0; i2 < i; i2++) {
                    c0280iArr[i2].resume();
                }
                lifecycleListeners2.m2541g();
            }
            this.f1151e.getApplicationListener().resume();
            Gdx.app.log("AndroidGraphics", "resumed");
        }
        if (z) {
            synchronized (this.f1151e.getRunnables()) {
                this.f1151e.getExecutedRunnables().mo530d();
                this.f1151e.getExecutedRunnables().m2294a(this.f1151e.getRunnables());
                this.f1151e.getRunnables().mo530d();
            }
            for (i2 = 0; i2 < this.f1151e.getExecutedRunnables().f3001b; i2++) {
                try {
                    ((Runnable) this.f1151e.getExecutedRunnables().m2291a(i2)).run();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            C0341k input = this.f1151e.getInput();
            synchronized (input) {
                int i4;
                input.f1202A = false;
                if (input.f1241n) {
                    input.f1241n = false;
                    for (i4 = 0; i4 < input.f1242o.length; i4++) {
                        input.f1242o[i4] = false;
                    }
                }
                Object obj;
                if (input.f1203B != null) {
                    C0366h c0366h = input.f1203B;
                    i = input.f1231d.size();
                    for (i2 = 0; i2 < i; i2++) {
                        obj = (C0338a) input.f1231d.get(i2);
                        input.f1205D = obj.f1190a;
                        switch (obj.f1191b) {
                            case 0:
                                c0366h.mo331a(obj.f1192c);
                                input.f1241n = true;
                                input.f1242o[obj.f1192c] = true;
                                break;
                            case 1:
                                c0366h.mo335b(obj.f1192c);
                                break;
                            case 2:
                                c0366h.mo330a(obj.f1193d);
                                break;
                            default:
                                break;
                        }
                        input.f1228a.mo363a(obj);
                    }
                    i = input.f1232e.size();
                    for (i2 = 0; i2 < i; i2++) {
                        obj = (C0340c) input.f1232e.get(i2);
                        input.f1205D = obj.f1195a;
                        switch (obj.f1196b) {
                            case 0:
                                c0366h.mo334a(obj.f1197c, obj.f1198d, obj.f1201g, obj.f1200f);
                                input.f1202A = true;
                                break;
                            case 1:
                                c0366h.mo336b(obj.f1197c, obj.f1198d, obj.f1201g, obj.f1200f);
                                break;
                            case 2:
                                c0366h.mo333a(obj.f1197c, obj.f1198d, obj.f1201g);
                                break;
                            case 3:
                                c0366h.mo337c(obj.f1199e);
                                break;
                            case 4:
                                c0366h.mo332a(obj.f1197c, obj.f1198d);
                                break;
                            default:
                                break;
                        }
                        input.f1229b.mo363a(obj);
                    }
                } else {
                    int size = input.f1232e.size();
                    for (i2 = 0; i2 < size; i2++) {
                        obj = (C0340c) input.f1232e.get(i2);
                        if (obj.f1196b == 0) {
                            input.f1202A = true;
                        }
                        input.f1229b.mo363a(obj);
                    }
                    i2 = input.f1231d.size();
                    for (i4 = 0; i4 < i2; i4++) {
                        input.f1228a.mo363a(input.f1231d.get(i4));
                    }
                }
                if (input.f1232e.size() == 0) {
                    for (i4 = 0; i4 < input.f1235h.length; i4++) {
                        input.f1235h[0] = 0;
                        input.f1236i[0] = 0;
                    }
                }
                input.f1231d.clear();
                input.f1232e.clear();
            }
            this.f1160n++;
            this.f1151e.getApplicationListener().render();
        }
        if (z2) {
            lifecycleListeners = this.f1151e.getLifecycleListeners();
            synchronized (lifecycleListeners) {
                c0280iArr = (C0280i[]) lifecycleListeners.m2540f();
                i3 = lifecycleListeners.b;
                for (i2 = 0; i2 < i3; i2++) {
                    c0280iArr[i2].pause();
                }
            }
            this.f1151e.getApplicationListener().pause();
            Gdx.app.log("AndroidGraphics", "paused");
        }
        if (z3) {
            lifecycleListeners = this.f1151e.getLifecycleListeners();
            synchronized (lifecycleListeners) {
                c0280iArr = (C0280i[]) lifecycleListeners.m2540f();
                i3 = lifecycleListeners.b;
                for (i2 = 0; i2 < i3; i2++) {
                    c0280iArr[i2].dispose();
                }
            }
            this.f1151e.getApplicationListener().dispose();
            Gdx.app.log("AndroidGraphics", "destroyed");
        }
        if (nanoTime - this.f1159m > 1000000000) {
            this.f1162p = this.f1161o;
            this.f1161o = 0;
            this.f1159m = nanoTime;
        }
        this.f1161o++;
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f1149c = i;
        this.f1150d = i2;
        m942p();
        gl10.glViewport(0, 0, this.f1149c, this.f1150d);
        if (!this.f1164r) {
            this.f1151e.getApplicationListener().create();
            this.f1164r = true;
            synchronized (this) {
                this.f1165s = true;
            }
        }
        this.f1151e.getApplicationListener().resize(i, i2);
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        EGL10 egl10;
        EGLDisplay eglGetDisplay;
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int max;
        boolean z;
        Display defaultDisplay;
        this.f1154h = ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
        this.f1155i = new GLVersion(ApplicationType.Android, gl10.glGetString(7938), gl10.glGetString(7936), gl10.glGetString(7937));
        if (!this.f1169w.f1112u || this.f1155i.f2099a <= 2) {
            if (this.f1152f == null) {
                this.f1152f = new AndroidGL20();
                Gdx.gl = this.f1152f;
                Gdx.gl20 = this.f1152f;
            }
            egl10 = (EGL10) EGLContext.getEGL();
            eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            a = m941a(egl10, eglGetDisplay, eGLConfig, 12324);
            a2 = m941a(egl10, eglGetDisplay, eGLConfig, 12323);
            a3 = m941a(egl10, eglGetDisplay, eGLConfig, 12322);
            a4 = m941a(egl10, eglGetDisplay, eGLConfig, 12321);
            a5 = m941a(egl10, eglGetDisplay, eGLConfig, 12325);
            a6 = m941a(egl10, eglGetDisplay, eGLConfig, 12326);
            max = Math.max(m941a(egl10, eglGetDisplay, eGLConfig, 12337), m941a(egl10, eglGetDisplay, eGLConfig, 12513));
            z = m941a(egl10, eglGetDisplay, eGLConfig, 12513) != 0;
            Gdx.app.log("AndroidGraphics", "framebuffer: (" + a + ", " + a2 + ", " + a3 + ", " + a4 + ")");
            Gdx.app.log("AndroidGraphics", "depthbuffer: (" + a5 + ")");
            Gdx.app.log("AndroidGraphics", "stencilbuffer: (" + a6 + ")");
            Gdx.app.log("AndroidGraphics", "samples: (" + max + ")");
            Gdx.app.log("AndroidGraphics", "coverage sampling: (" + z + ")");
            this.f1147F = new C0370a(a, a2, a3, a4, a5, a6, max, z);
            m942p();
            Mesh.m1092a(this.f1151e);
            Texture.m1139b(this.f1151e);
            C0433d.m1226b(this.f1151e);
            C0510k.m1661b(this.f1151e);
            C0501p.m1597a(this.f1151e);
            C0484d.m1487a(this.f1151e);
            C0327j.m943q();
            defaultDisplay = this.f1151e.getWindowManager().getDefaultDisplay();
            this.f1149c = defaultDisplay.getWidth();
            this.f1150d = defaultDisplay.getHeight();
            this.f1163q = new C0550g();
            this.f1157k = System.nanoTime();
            gl10.glViewport(0, 0, this.f1149c, this.f1150d);
        }
        if (this.f1153g == null) {
            C0284f c0323i = new C0323i();
            this.f1153g = c0323i;
            this.f1152f = c0323i;
            Gdx.gl = this.f1153g;
            Gdx.gl20 = this.f1153g;
            Gdx.gl30 = this.f1153g;
        }
        egl10 = (EGL10) EGLContext.getEGL();
        eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        a = m941a(egl10, eglGetDisplay, eGLConfig, 12324);
        a2 = m941a(egl10, eglGetDisplay, eGLConfig, 12323);
        a3 = m941a(egl10, eglGetDisplay, eGLConfig, 12322);
        a4 = m941a(egl10, eglGetDisplay, eGLConfig, 12321);
        a5 = m941a(egl10, eglGetDisplay, eGLConfig, 12325);
        a6 = m941a(egl10, eglGetDisplay, eGLConfig, 12326);
        max = Math.max(m941a(egl10, eglGetDisplay, eGLConfig, 12337), m941a(egl10, eglGetDisplay, eGLConfig, 12513));
        if (m941a(egl10, eglGetDisplay, eGLConfig, 12513) != 0) {
        }
        Gdx.app.log("AndroidGraphics", "framebuffer: (" + a + ", " + a2 + ", " + a3 + ", " + a4 + ")");
        Gdx.app.log("AndroidGraphics", "depthbuffer: (" + a5 + ")");
        Gdx.app.log("AndroidGraphics", "stencilbuffer: (" + a6 + ")");
        Gdx.app.log("AndroidGraphics", "samples: (" + max + ")");
        Gdx.app.log("AndroidGraphics", "coverage sampling: (" + z + ")");
        this.f1147F = new C0370a(a, a2, a3, a4, a5, a6, max, z);
        m942p();
        Mesh.m1092a(this.f1151e);
        Texture.m1139b(this.f1151e);
        C0433d.m1226b(this.f1151e);
        C0510k.m1661b(this.f1151e);
        C0501p.m1597a(this.f1151e);
        C0484d.m1487a(this.f1151e);
        C0327j.m943q();
        defaultDisplay = this.f1151e.getWindowManager().getDefaultDisplay();
        this.f1149c = defaultDisplay.getWidth();
        this.f1150d = defaultDisplay.getHeight();
        this.f1163q = new C0550g();
        this.f1157k = System.nanoTime();
        gl10.glViewport(0, 0, this.f1149c, this.f1150d);
        Gdx.app.log("AndroidGraphics", "OGL renderer: " + gl10.glGetString(7937));
        Gdx.app.log("AndroidGraphics", "OGL vendor: " + gl10.glGetString(7936));
        Gdx.app.log("AndroidGraphics", "OGL version: " + gl10.glGetString(7938));
        Gdx.app.log("AndroidGraphics", "OGL extensions: " + gl10.glGetString(7939));
        egl10 = (EGL10) EGLContext.getEGL();
        eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        a = m941a(egl10, eglGetDisplay, eGLConfig, 12324);
        a2 = m941a(egl10, eglGetDisplay, eGLConfig, 12323);
        a3 = m941a(egl10, eglGetDisplay, eGLConfig, 12322);
        a4 = m941a(egl10, eglGetDisplay, eGLConfig, 12321);
        a5 = m941a(egl10, eglGetDisplay, eGLConfig, 12325);
        a6 = m941a(egl10, eglGetDisplay, eGLConfig, 12326);
        max = Math.max(m941a(egl10, eglGetDisplay, eGLConfig, 12337), m941a(egl10, eglGetDisplay, eGLConfig, 12513));
        if (m941a(egl10, eglGetDisplay, eGLConfig, 12513) != 0) {
        }
        Gdx.app.log("AndroidGraphics", "framebuffer: (" + a + ", " + a2 + ", " + a3 + ", " + a4 + ")");
        Gdx.app.log("AndroidGraphics", "depthbuffer: (" + a5 + ")");
        Gdx.app.log("AndroidGraphics", "stencilbuffer: (" + a6 + ")");
        Gdx.app.log("AndroidGraphics", "samples: (" + max + ")");
        Gdx.app.log("AndroidGraphics", "coverage sampling: (" + z + ")");
        this.f1147F = new C0370a(a, a2, a3, a4, a5, a6, max, z);
        m942p();
        Mesh.m1092a(this.f1151e);
        Texture.m1139b(this.f1151e);
        C0433d.m1226b(this.f1151e);
        C0510k.m1661b(this.f1151e);
        C0501p.m1597a(this.f1151e);
        C0484d.m1487a(this.f1151e);
        C0327j.m943q();
        defaultDisplay = this.f1151e.getWindowManager().getDefaultDisplay();
        this.f1149c = defaultDisplay.getWidth();
        this.f1150d = defaultDisplay.getHeight();
        this.f1163q = new C0550g();
        this.f1157k = System.nanoTime();
        gl10.glViewport(0, 0, this.f1149c, this.f1150d);
    }
}
