package com.badlogic.gdx.backends.android.p015a;

import android.content.Context;
import android.opengl.GLSurfaceView.EGLConfigChooser;
import android.opengl.GLSurfaceView.Renderer;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.badlogic.gdx.backends.android.a.d */
public class C0295d extends SurfaceView implements Callback {
    /* renamed from: a */
    private static final C0304i f1020a = new C0304i();
    /* renamed from: b */
    private final WeakReference<C0295d> f1021b = new WeakReference(this);
    /* renamed from: c */
    public C0303h f1022c;
    /* renamed from: d */
    private Renderer f1023d;
    /* renamed from: e */
    private boolean f1024e;
    /* renamed from: f */
    private EGLConfigChooser f1025f;
    /* renamed from: g */
    private C0293e f1026g;
    /* renamed from: h */
    private C0300f f1027h;
    /* renamed from: i */
    private C0305j f1028i;
    /* renamed from: j */
    private int f1029j;
    /* renamed from: k */
    private int f1030k;
    /* renamed from: l */
    private boolean f1031l;

    /* renamed from: com.badlogic.gdx.backends.android.a.d$e */
    public interface C0293e {
        /* renamed from: a */
        EGLContext mo252a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        /* renamed from: a */
        void mo253a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* renamed from: com.badlogic.gdx.backends.android.a.d$a */
    private abstract class C0297a implements EGLConfigChooser {
        /* renamed from: a */
        protected int[] f1034a;
        /* renamed from: b */
        final /* synthetic */ C0295d f1035b;

        public C0297a(C0295d c0295d, int[] iArr) {
            this.f1035b = c0295d;
            if (this.f1035b.f1030k == 2) {
                Object obj = new int[15];
                System.arraycopy(iArr, 0, obj, 0, 12);
                obj[12] = 12352;
                obj[13] = 4;
                obj[14] = 12344;
                Object obj2 = obj;
            }
            this.f1034a = iArr;
        }

        /* renamed from: a */
        abstract EGLConfig mo254a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, this.f1034a, null, 0, iArr)) {
                int i = iArr[0];
                if (i <= 0) {
                    throw new IllegalArgumentException("No configs match configSpec");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                if (egl10.eglChooseConfig(eGLDisplay, this.f1034a, eGLConfigArr, i, iArr)) {
                    EGLConfig a = mo254a(egl10, eGLDisplay, eGLConfigArr);
                    if (a != null) {
                        return a;
                    }
                    throw new IllegalArgumentException("No config chosen");
                }
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
    }

    /* renamed from: com.badlogic.gdx.backends.android.a.d$b */
    private class C0298b extends C0297a {
        /* renamed from: c */
        protected int f1036c = 8;
        /* renamed from: d */
        protected int f1037d = 8;
        /* renamed from: e */
        protected int f1038e = 8;
        /* renamed from: f */
        protected int f1039f = 0;
        /* renamed from: g */
        protected int f1040g;
        /* renamed from: h */
        protected int f1041h;
        /* renamed from: i */
        final /* synthetic */ C0295d f1042i;
        /* renamed from: j */
        private int[] f1043j = new int[1];

        public C0298b(C0295d c0295d, int i) {
            this.f1042i = c0295d;
            super(c0295d, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, i, 12326, 0, 12344});
            this.f1040g = i;
            this.f1041h = 0;
        }

        /* renamed from: a */
        private int m841a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f1043j) ? this.f1043j[0] : 0;
        }

        /* renamed from: a */
        public final EGLConfig mo254a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int a = m841a(egl10, eGLDisplay, eGLConfig, 12325);
                int a2 = m841a(egl10, eGLDisplay, eGLConfig, 12326);
                if (a >= this.f1040g && a2 >= this.f1041h) {
                    a = m841a(egl10, eGLDisplay, eGLConfig, 12324);
                    a2 = m841a(egl10, eGLDisplay, eGLConfig, 12323);
                    int a3 = m841a(egl10, eGLDisplay, eGLConfig, 12322);
                    int a4 = m841a(egl10, eGLDisplay, eGLConfig, 12321);
                    if (a == this.f1036c && a2 == this.f1037d && a3 == this.f1038e && a4 == this.f1039f) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: com.badlogic.gdx.backends.android.a.d$c */
    private class C0299c implements C0293e {
        /* renamed from: a */
        final /* synthetic */ C0295d f1044a;
        /* renamed from: b */
        private int f1045b;

        private C0299c(C0295d c0295d) {
            this.f1044a = c0295d;
            this.f1045b = 12440;
        }

        /* renamed from: a */
        public final EGLContext mo252a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = new int[]{this.f1045b, this.f1044a.f1030k, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (this.f1044a.f1030k == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        /* renamed from: a */
        public final void mo253a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
                C0302g.m849a("eglDestroyContex", egl10.eglGetError());
            }
        }
    }

    /* renamed from: com.badlogic.gdx.backends.android.a.d$f */
    public interface C0300f {
        /* renamed from: a */
        EGLSurface mo255a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        /* renamed from: a */
        void mo256a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* renamed from: com.badlogic.gdx.backends.android.a.d$d */
    private static class C0301d implements C0300f {
        private C0301d() {
        }

        /* renamed from: a */
        public final EGLSurface mo255a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            EGLSurface eGLSurface = null;
            try {
                eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (Throwable e) {
                Log.e("GLSurfaceViewAPI18", "eglCreateWindowSurface", e);
            }
            return eGLSurface;
        }

        /* renamed from: a */
        public final void mo256a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* renamed from: com.badlogic.gdx.backends.android.a.d$g */
    private static class C0302g {
        /* renamed from: a */
        WeakReference<C0295d> f1046a;
        /* renamed from: b */
        EGL10 f1047b;
        /* renamed from: c */
        EGLDisplay f1048c;
        /* renamed from: d */
        EGLSurface f1049d;
        /* renamed from: e */
        EGLConfig f1050e;
        /* renamed from: f */
        EGLContext f1051f;

        public C0302g(WeakReference<C0295d> weakReference) {
            this.f1046a = weakReference;
        }

        /* renamed from: a */
        public static void m849a(String str, int i) {
            throw new RuntimeException(C0302g.m851b(str, i));
        }

        /* renamed from: a */
        public static void m850a(String str, String str2, int i) {
            Log.w(str, C0302g.m851b(str2, i));
        }

        /* renamed from: b */
        private static String m851b(String str, int i) {
            String str2;
            StringBuilder append = new StringBuilder().append(str).append(" failed: ");
            switch (i) {
                case 12288:
                    str2 = "EGL_SUCCESS";
                    break;
                case 12289:
                    str2 = "EGL_NOT_INITIALIZED";
                    break;
                case 12290:
                    str2 = "EGL_BAD_ACCESS";
                    break;
                case 12291:
                    str2 = "EGL_BAD_ALLOC";
                    break;
                case 12292:
                    str2 = "EGL_BAD_ATTRIBUTE";
                    break;
                case 12293:
                    str2 = "EGL_BAD_CONFIG";
                    break;
                case 12294:
                    str2 = "EGL_BAD_CONTEXT";
                    break;
                case 12295:
                    str2 = "EGL_BAD_CURRENT_SURFACE";
                    break;
                case 12296:
                    str2 = "EGL_BAD_DISPLAY";
                    break;
                case 12297:
                    str2 = "EGL_BAD_MATCH";
                    break;
                case 12298:
                    str2 = "EGL_BAD_NATIVE_PIXMAP";
                    break;
                case 12299:
                    str2 = "EGL_BAD_NATIVE_WINDOW";
                    break;
                case 12300:
                    str2 = "EGL_BAD_PARAMETER";
                    break;
                case 12301:
                    str2 = "EGL_BAD_SURFACE";
                    break;
                case 12302:
                    str2 = "EGL_CONTEXT_LOST";
                    break;
                default:
                    str2 = "0x" + Integer.toHexString(i);
                    break;
            }
            return append.append(str2).toString();
        }

        /* renamed from: a */
        final void m852a() {
            if (this.f1049d != null && this.f1049d != EGL10.EGL_NO_SURFACE) {
                this.f1047b.eglMakeCurrent(this.f1048c, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                C0295d c0295d = (C0295d) this.f1046a.get();
                if (c0295d != null) {
                    c0295d.f1027h.mo256a(this.f1047b, this.f1048c, this.f1049d);
                }
                this.f1049d = null;
            }
        }

        /* renamed from: b */
        public final void m853b() {
            if (this.f1051f != null) {
                C0295d c0295d = (C0295d) this.f1046a.get();
                if (c0295d != null) {
                    c0295d.f1026g.mo253a(this.f1047b, this.f1048c, this.f1051f);
                }
                this.f1051f = null;
            }
            if (this.f1048c != null) {
                this.f1047b.eglTerminate(this.f1048c);
                this.f1048c = null;
            }
        }
    }

    /* renamed from: com.badlogic.gdx.backends.android.a.d$h */
    static class C0303h extends Thread {
        /* renamed from: a */
        public boolean f1052a;
        /* renamed from: b */
        public boolean f1053b;
        /* renamed from: c */
        public boolean f1054c;
        /* renamed from: d */
        boolean f1055d;
        /* renamed from: e */
        boolean f1056e;
        /* renamed from: f */
        boolean f1057f;
        /* renamed from: g */
        boolean f1058g;
        /* renamed from: h */
        boolean f1059h;
        /* renamed from: i */
        boolean f1060i;
        /* renamed from: j */
        int f1061j = 0;
        /* renamed from: k */
        int f1062k = 0;
        /* renamed from: l */
        public boolean f1063l = true;
        /* renamed from: m */
        public boolean f1064m;
        /* renamed from: n */
        boolean f1065n = true;
        /* renamed from: o */
        private boolean f1066o;
        /* renamed from: p */
        private boolean f1067p;
        /* renamed from: q */
        private int f1068q = 1;
        /* renamed from: r */
        private ArrayList<Runnable> f1069r = new ArrayList();
        /* renamed from: s */
        private C0302g f1070s;
        /* renamed from: t */
        private WeakReference<C0295d> f1071t;

        C0303h(WeakReference<C0295d> weakReference) {
            this.f1071t = weakReference;
        }

        /* renamed from: d */
        private void m855d() {
            if (this.f1058g) {
                this.f1058g = false;
                this.f1070s.m852a();
            }
        }

        /* renamed from: e */
        private void m856e() {
            if (this.f1057f) {
                this.f1070s.m853b();
                this.f1057f = false;
                C0295d.f1020a.m865b(this);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: f */
        private void m857f() {
            /*
            r22 = this;
            r3 = new com.badlogic.gdx.backends.android.a.d$g;
            r0 = r22;
            r4 = r0.f1071t;
            r3.<init>(r4);
            r0 = r22;
            r0.f1070s = r3;
            r3 = 0;
            r0 = r22;
            r0.f1057f = r3;
            r3 = 0;
            r0 = r22;
            r0.f1058g = r3;
            r3 = 0;
            r16 = 0;
            r5 = 0;
            r6 = 0;
            r15 = 0;
            r14 = 0;
            r13 = 0;
            r4 = 0;
            r12 = 0;
            r11 = 0;
            r10 = 0;
            r9 = 0;
            r7 = r12;
            r8 = r4;
            r17 = r3;
            r4 = r9;
            r12 = r6;
            r9 = r13;
            r6 = r11;
            r11 = r15;
            r13 = r5;
            r5 = r10;
            r10 = r14;
            r14 = r16;
        L_0x0032:
            r18 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x01fc }
            monitor-enter(r18);	 Catch:{ all -> 0x01fc }
        L_0x0037:
            r0 = r22;
            r3 = r0.f1066o;	 Catch:{ all -> 0x01f9 }
            if (r3 == 0) goto L_0x004e;
        L_0x003d:
            monitor-exit(r18);	 Catch:{ all -> 0x01f9 }
            r4 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;
            monitor-enter(r4);
            r22.m855d();	 Catch:{ all -> 0x004b }
            r22.m856e();	 Catch:{ all -> 0x004b }
            monitor-exit(r4);	 Catch:{ all -> 0x004b }
            return;
        L_0x004b:
            r3 = move-exception;
            monitor-exit(r4);	 Catch:{ all -> 0x004b }
            throw r3;
        L_0x004e:
            r0 = r22;
            r3 = r0.f1069r;	 Catch:{ all -> 0x01f9 }
            r3 = r3.isEmpty();	 Catch:{ all -> 0x01f9 }
            if (r3 != 0) goto L_0x0083;
        L_0x0058:
            r0 = r22;
            r3 = r0.f1069r;	 Catch:{ all -> 0x01f9 }
            r4 = 0;
            r3 = r3.remove(r4);	 Catch:{ all -> 0x01f9 }
            r3 = (java.lang.Runnable) r3;	 Catch:{ all -> 0x01f9 }
            r4 = r8;
            r15 = r11;
            r16 = r14;
            r14 = r10;
            r11 = r6;
            r10 = r5;
            r6 = r12;
            r12 = r7;
            r5 = r13;
            r13 = r9;
            r9 = r3;
        L_0x006f:
            monitor-exit(r18);	 Catch:{ all -> 0x01f9 }
            if (r9 == 0) goto L_0x02b2;
        L_0x0072:
            r9.run();	 Catch:{ all -> 0x01fc }
            r9 = 0;
            r7 = r12;
            r8 = r4;
            r4 = r9;
            r12 = r6;
            r9 = r13;
            r6 = r11;
            r11 = r15;
            r13 = r5;
            r5 = r10;
            r10 = r14;
            r14 = r16;
            goto L_0x0032;
        L_0x0083:
            r3 = 0;
            r0 = r22;
            r15 = r0.f1054c;	 Catch:{ all -> 0x01f9 }
            r0 = r22;
            r0 = r0.f1053b;	 Catch:{ all -> 0x01f9 }
            r16 = r0;
            r0 = r16;
            if (r15 == r0) goto L_0x04a9;
        L_0x0092:
            r0 = r22;
            r3 = r0.f1053b;	 Catch:{ all -> 0x01f9 }
            r0 = r22;
            r15 = r0.f1053b;	 Catch:{ all -> 0x01f9 }
            r0 = r22;
            r0.f1054c = r15;	 Catch:{ all -> 0x01f9 }
            r15 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x01f9 }
            r15.notifyAll();	 Catch:{ all -> 0x01f9 }
            r15 = r3;
        L_0x00a6:
            r0 = r22;
            r3 = r0.f1060i;	 Catch:{ all -> 0x01f9 }
            if (r3 == 0) goto L_0x00b8;
        L_0x00ac:
            r22.m855d();	 Catch:{ all -> 0x01f9 }
            r22.m856e();	 Catch:{ all -> 0x01f9 }
            r3 = 0;
            r0 = r22;
            r0.f1060i = r3;	 Catch:{ all -> 0x01f9 }
            r7 = 1;
        L_0x00b8:
            if (r11 == 0) goto L_0x00c1;
        L_0x00ba:
            r22.m855d();	 Catch:{ all -> 0x01f9 }
            r22.m856e();	 Catch:{ all -> 0x01f9 }
            r11 = 0;
        L_0x00c1:
            if (r15 == 0) goto L_0x00cc;
        L_0x00c3:
            r0 = r22;
            r3 = r0.f1058g;	 Catch:{ all -> 0x01f9 }
            if (r3 == 0) goto L_0x00cc;
        L_0x00c9:
            r22.m855d();	 Catch:{ all -> 0x01f9 }
        L_0x00cc:
            if (r15 == 0) goto L_0x00f0;
        L_0x00ce:
            r0 = r22;
            r3 = r0.f1057f;	 Catch:{ all -> 0x01f9 }
            if (r3 == 0) goto L_0x00f0;
        L_0x00d4:
            r0 = r22;
            r3 = r0.f1071t;	 Catch:{ all -> 0x01f9 }
            r3 = r3.get();	 Catch:{ all -> 0x01f9 }
            r3 = (com.badlogic.gdx.backends.android.p015a.C0295d) r3;	 Catch:{ all -> 0x01f9 }
            if (r3 != 0) goto L_0x01ac;
        L_0x00e0:
            r3 = 0;
        L_0x00e1:
            if (r3 == 0) goto L_0x00ed;
        L_0x00e3:
            r3 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x01f9 }
            r3 = r3.m864a();	 Catch:{ all -> 0x01f9 }
            if (r3 == 0) goto L_0x00f0;
        L_0x00ed:
            r22.m856e();	 Catch:{ all -> 0x01f9 }
        L_0x00f0:
            if (r15 == 0) goto L_0x0103;
        L_0x00f2:
            r3 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x01f9 }
            r3 = r3.m866b();	 Catch:{ all -> 0x01f9 }
            if (r3 == 0) goto L_0x0103;
        L_0x00fc:
            r0 = r22;
            r3 = r0.f1070s;	 Catch:{ all -> 0x01f9 }
            r3.m853b();	 Catch:{ all -> 0x01f9 }
        L_0x0103:
            r0 = r22;
            r3 = r0.f1055d;	 Catch:{ all -> 0x01f9 }
            if (r3 != 0) goto L_0x0129;
        L_0x0109:
            r0 = r22;
            r3 = r0.f1056e;	 Catch:{ all -> 0x01f9 }
            if (r3 != 0) goto L_0x0129;
        L_0x010f:
            r0 = r22;
            r3 = r0.f1058g;	 Catch:{ all -> 0x01f9 }
            if (r3 == 0) goto L_0x0118;
        L_0x0115:
            r22.m855d();	 Catch:{ all -> 0x01f9 }
        L_0x0118:
            r3 = 1;
            r0 = r22;
            r0.f1056e = r3;	 Catch:{ all -> 0x01f9 }
            r3 = 0;
            r0 = r22;
            r0.f1067p = r3;	 Catch:{ all -> 0x01f9 }
            r3 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x01f9 }
            r3.notifyAll();	 Catch:{ all -> 0x01f9 }
        L_0x0129:
            r0 = r22;
            r3 = r0.f1055d;	 Catch:{ all -> 0x01f9 }
            if (r3 == 0) goto L_0x0141;
        L_0x012f:
            r0 = r22;
            r3 = r0.f1056e;	 Catch:{ all -> 0x01f9 }
            if (r3 == 0) goto L_0x0141;
        L_0x0135:
            r3 = 0;
            r0 = r22;
            r0.f1056e = r3;	 Catch:{ all -> 0x01f9 }
            r3 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x01f9 }
            r3.notifyAll();	 Catch:{ all -> 0x01f9 }
        L_0x0141:
            if (r8 == 0) goto L_0x0151;
        L_0x0143:
            r9 = 0;
            r8 = 0;
            r3 = 1;
            r0 = r22;
            r0.f1064m = r3;	 Catch:{ all -> 0x01f9 }
            r3 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x01f9 }
            r3.notifyAll();	 Catch:{ all -> 0x01f9 }
        L_0x0151:
            r3 = r22.m859a();	 Catch:{ all -> 0x01f9 }
            if (r3 == 0) goto L_0x02a9;
        L_0x0157:
            r0 = r22;
            r3 = r0.f1057f;	 Catch:{ all -> 0x01f9 }
            if (r3 != 0) goto L_0x0160;
        L_0x015d:
            if (r7 == 0) goto L_0x01b2;
        L_0x015f:
            r7 = 0;
        L_0x0160:
            r0 = r22;
            r3 = r0.f1057f;	 Catch:{ all -> 0x01f9 }
            if (r3 == 0) goto L_0x04a5;
        L_0x0166:
            r0 = r22;
            r3 = r0.f1058g;	 Catch:{ all -> 0x01f9 }
            if (r3 != 0) goto L_0x04a5;
        L_0x016c:
            r3 = 1;
            r0 = r22;
            r0.f1058g = r3;	 Catch:{ all -> 0x01f9 }
            r13 = 1;
            r12 = 1;
            r10 = 1;
            r3 = r10;
            r10 = r12;
        L_0x0176:
            r0 = r22;
            r12 = r0.f1058g;	 Catch:{ all -> 0x01f9 }
            if (r12 == 0) goto L_0x02a7;
        L_0x017c:
            r0 = r22;
            r12 = r0.f1065n;	 Catch:{ all -> 0x01f9 }
            if (r12 == 0) goto L_0x049b;
        L_0x0182:
            r9 = 1;
            r0 = r22;
            r5 = r0.f1061j;	 Catch:{ all -> 0x01f9 }
            r0 = r22;
            r3 = r0.f1062k;	 Catch:{ all -> 0x01f9 }
            r6 = 1;
            r12 = 1;
            r13 = 0;
            r0 = r22;
            r0.f1065n = r13;	 Catch:{ all -> 0x01f9 }
        L_0x0192:
            r13 = 0;
            r0 = r22;
            r0.f1063l = r13;	 Catch:{ all -> 0x01f9 }
            r13 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x01f9 }
            r13.notifyAll();	 Catch:{ all -> 0x01f9 }
            r13 = r6;
            r15 = r11;
            r16 = r14;
            r14 = r9;
            r6 = r10;
            r11 = r5;
            r10 = r3;
            r5 = r12;
            r9 = r4;
            r12 = r7;
            r4 = r8;
            goto L_0x006f;
        L_0x01ac:
            r3 = r3.f1031l;	 Catch:{ all -> 0x01f9 }
            goto L_0x00e1;
        L_0x01b2:
            r3 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x01f9 }
            r15 = r3.f1074b;	 Catch:{ all -> 0x01f9 }
            r0 = r22;
            if (r15 == r0) goto L_0x01c0;
        L_0x01bc:
            r15 = r3.f1074b;	 Catch:{ all -> 0x01f9 }
            if (r15 != 0) goto L_0x020a;
        L_0x01c0:
            r0 = r22;
            r3.f1074b = r0;	 Catch:{ all -> 0x01f9 }
            r3.notifyAll();	 Catch:{ all -> 0x01f9 }
            r3 = 1;
        L_0x01c8:
            if (r3 == 0) goto L_0x0160;
        L_0x01ca:
            r0 = r22;
            r14 = r0.f1070s;	 Catch:{ RuntimeException -> 0x01ee }
            r3 = javax.microedition.khronos.egl.EGLContext.getEGL();	 Catch:{ RuntimeException -> 0x01ee }
            r3 = (javax.microedition.khronos.egl.EGL10) r3;	 Catch:{ RuntimeException -> 0x01ee }
            r14.f1047b = r3;	 Catch:{ RuntimeException -> 0x01ee }
            r3 = r14.f1047b;	 Catch:{ RuntimeException -> 0x01ee }
            r15 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY;	 Catch:{ RuntimeException -> 0x01ee }
            r3 = r3.eglGetDisplay(r15);	 Catch:{ RuntimeException -> 0x01ee }
            r14.f1048c = r3;	 Catch:{ RuntimeException -> 0x01ee }
            r3 = r14.f1048c;	 Catch:{ RuntimeException -> 0x01ee }
            r15 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;	 Catch:{ RuntimeException -> 0x01ee }
            if (r3 != r15) goto L_0x0225;
        L_0x01e6:
            r3 = new java.lang.RuntimeException;	 Catch:{ RuntimeException -> 0x01ee }
            r4 = "eglGetDisplay failed";
            r3.<init>(r4);	 Catch:{ RuntimeException -> 0x01ee }
            throw r3;	 Catch:{ RuntimeException -> 0x01ee }
        L_0x01ee:
            r3 = move-exception;
            r4 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x01f9 }
            r0 = r22;
            r4.m865b(r0);	 Catch:{ all -> 0x01f9 }
            throw r3;	 Catch:{ all -> 0x01f9 }
        L_0x01f9:
            r3 = move-exception;
            monitor-exit(r18);	 Catch:{ all -> 0x01f9 }
            throw r3;	 Catch:{ all -> 0x01fc }
        L_0x01fc:
            r3 = move-exception;
            r4 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;
            monitor-enter(r4);
            r22.m855d();	 Catch:{ all -> 0x048b }
            r22.m856e();	 Catch:{ all -> 0x048b }
            monitor-exit(r4);	 Catch:{ all -> 0x048b }
            throw r3;
        L_0x020a:
            r3.m867c();	 Catch:{ all -> 0x01f9 }
            r15 = r3.f1073a;	 Catch:{ all -> 0x01f9 }
            if (r15 == 0) goto L_0x0213;
        L_0x0211:
            r3 = 1;
            goto L_0x01c8;
        L_0x0213:
            r15 = r3.f1074b;	 Catch:{ all -> 0x01f9 }
            if (r15 == 0) goto L_0x0223;
        L_0x0217:
            r3 = r3.f1074b;	 Catch:{ all -> 0x01f9 }
            r15 = 1;
            r3.f1060i = r15;	 Catch:{ all -> 0x01f9 }
            r3 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x01f9 }
            r3.notifyAll();	 Catch:{ all -> 0x01f9 }
        L_0x0223:
            r3 = 0;
            goto L_0x01c8;
        L_0x0225:
            r3 = 2;
            r3 = new int[r3];	 Catch:{ RuntimeException -> 0x01ee }
            r15 = r14.f1047b;	 Catch:{ RuntimeException -> 0x01ee }
            r0 = r14.f1048c;	 Catch:{ RuntimeException -> 0x01ee }
            r16 = r0;
            r0 = r16;
            r3 = r15.eglInitialize(r0, r3);	 Catch:{ RuntimeException -> 0x01ee }
            if (r3 != 0) goto L_0x023e;
        L_0x0236:
            r3 = new java.lang.RuntimeException;	 Catch:{ RuntimeException -> 0x01ee }
            r4 = "eglInitialize failed";
            r3.<init>(r4);	 Catch:{ RuntimeException -> 0x01ee }
            throw r3;	 Catch:{ RuntimeException -> 0x01ee }
        L_0x023e:
            r3 = r14.f1046a;	 Catch:{ RuntimeException -> 0x01ee }
            r3 = r3.get();	 Catch:{ RuntimeException -> 0x01ee }
            r3 = (com.badlogic.gdx.backends.android.p015a.C0295d) r3;	 Catch:{ RuntimeException -> 0x01ee }
            if (r3 != 0) goto L_0x0278;
        L_0x0248:
            r3 = 0;
            r14.f1050e = r3;	 Catch:{ RuntimeException -> 0x01ee }
            r3 = 0;
            r14.f1051f = r3;	 Catch:{ RuntimeException -> 0x01ee }
        L_0x024e:
            r3 = r14.f1051f;	 Catch:{ RuntimeException -> 0x01ee }
            if (r3 == 0) goto L_0x0258;
        L_0x0252:
            r3 = r14.f1051f;	 Catch:{ RuntimeException -> 0x01ee }
            r15 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;	 Catch:{ RuntimeException -> 0x01ee }
            if (r3 != r15) goto L_0x0266;
        L_0x0258:
            r3 = 0;
            r14.f1051f = r3;	 Catch:{ RuntimeException -> 0x01ee }
            r3 = "createContext";
            r15 = r14.f1047b;	 Catch:{ RuntimeException -> 0x01ee }
            r15 = r15.eglGetError();	 Catch:{ RuntimeException -> 0x01ee }
            com.badlogic.gdx.backends.android.p015a.C0295d.C0302g.m849a(r3, r15);	 Catch:{ RuntimeException -> 0x01ee }
        L_0x0266:
            r3 = 0;
            r14.f1049d = r3;	 Catch:{ RuntimeException -> 0x01ee }
            r3 = 1;
            r0 = r22;
            r0.f1057f = r3;	 Catch:{ all -> 0x01f9 }
            r14 = 1;
            r3 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x01f9 }
            r3.notifyAll();	 Catch:{ all -> 0x01f9 }
            goto L_0x0160;
        L_0x0278:
            r15 = r3.f1025f;	 Catch:{ RuntimeException -> 0x01ee }
            r0 = r14.f1047b;	 Catch:{ RuntimeException -> 0x01ee }
            r16 = r0;
            r0 = r14.f1048c;	 Catch:{ RuntimeException -> 0x01ee }
            r19 = r0;
            r0 = r16;
            r1 = r19;
            r15 = r15.chooseConfig(r0, r1);	 Catch:{ RuntimeException -> 0x01ee }
            r14.f1050e = r15;	 Catch:{ RuntimeException -> 0x01ee }
            r3 = r3.f1026g;	 Catch:{ RuntimeException -> 0x01ee }
            r15 = r14.f1047b;	 Catch:{ RuntimeException -> 0x01ee }
            r0 = r14.f1048c;	 Catch:{ RuntimeException -> 0x01ee }
            r16 = r0;
            r0 = r14.f1050e;	 Catch:{ RuntimeException -> 0x01ee }
            r19 = r0;
            r0 = r16;
            r1 = r19;
            r3 = r3.mo252a(r15, r0, r1);	 Catch:{ RuntimeException -> 0x01ee }
            r14.f1051f = r3;	 Catch:{ RuntimeException -> 0x01ee }
            goto L_0x024e;
        L_0x02a7:
            r12 = r10;
            r10 = r3;
        L_0x02a9:
            r3 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x01f9 }
            r3.wait();	 Catch:{ all -> 0x01f9 }
            goto L_0x0037;
        L_0x02b2:
            if (r5 == 0) goto L_0x0498;
        L_0x02b4:
            r0 = r22;
            r7 = r0.f1070s;	 Catch:{ all -> 0x01fc }
            r3 = r7.f1047b;	 Catch:{ all -> 0x01fc }
            if (r3 != 0) goto L_0x02c4;
        L_0x02bc:
            r3 = new java.lang.RuntimeException;	 Catch:{ all -> 0x01fc }
            r4 = "egl not initialized";
            r3.<init>(r4);	 Catch:{ all -> 0x01fc }
            throw r3;	 Catch:{ all -> 0x01fc }
        L_0x02c4:
            r3 = r7.f1048c;	 Catch:{ all -> 0x01fc }
            if (r3 != 0) goto L_0x02d0;
        L_0x02c8:
            r3 = new java.lang.RuntimeException;	 Catch:{ all -> 0x01fc }
            r4 = "eglDisplay not initialized";
            r3.<init>(r4);	 Catch:{ all -> 0x01fc }
            throw r3;	 Catch:{ all -> 0x01fc }
        L_0x02d0:
            r3 = r7.f1050e;	 Catch:{ all -> 0x01fc }
            if (r3 != 0) goto L_0x02dc;
        L_0x02d4:
            r3 = new java.lang.RuntimeException;	 Catch:{ all -> 0x01fc }
            r4 = "mEglConfig not initialized";
            r3.<init>(r4);	 Catch:{ all -> 0x01fc }
            throw r3;	 Catch:{ all -> 0x01fc }
        L_0x02dc:
            r7.m852a();	 Catch:{ all -> 0x01fc }
            r3 = r7.f1046a;	 Catch:{ all -> 0x01fc }
            r3 = r3.get();	 Catch:{ all -> 0x01fc }
            r3 = (com.badlogic.gdx.backends.android.p015a.C0295d) r3;	 Catch:{ all -> 0x01fc }
            if (r3 == 0) goto L_0x0423;
        L_0x02e9:
            r8 = r3.f1027h;	 Catch:{ all -> 0x01fc }
            r0 = r7.f1047b;	 Catch:{ all -> 0x01fc }
            r18 = r0;
            r0 = r7.f1048c;	 Catch:{ all -> 0x01fc }
            r19 = r0;
            r0 = r7.f1050e;	 Catch:{ all -> 0x01fc }
            r20 = r0;
            r3 = r3.getHolder();	 Catch:{ all -> 0x01fc }
            r0 = r18;
            r1 = r19;
            r2 = r20;
            r3 = r8.mo255a(r0, r1, r2, r3);	 Catch:{ all -> 0x01fc }
            r7.f1049d = r3;	 Catch:{ all -> 0x01fc }
        L_0x0309:
            r3 = r7.f1049d;	 Catch:{ all -> 0x01fc }
            if (r3 == 0) goto L_0x0313;
        L_0x030d:
            r3 = r7.f1049d;	 Catch:{ all -> 0x01fc }
            r8 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;	 Catch:{ all -> 0x01fc }
            if (r3 != r8) goto L_0x0428;
        L_0x0313:
            r3 = r7.f1047b;	 Catch:{ all -> 0x01fc }
            r3 = r3.eglGetError();	 Catch:{ all -> 0x01fc }
            r7 = 12299; // 0x300b float:1.7235E-41 double:6.0765E-320;
            if (r3 != r7) goto L_0x0324;
        L_0x031d:
            r3 = "EglHelper";
            r7 = "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.";
            android.util.Log.e(r3, r7);	 Catch:{ all -> 0x01fc }
        L_0x0324:
            r3 = 0;
        L_0x0325:
            if (r3 == 0) goto L_0x045a;
        L_0x0327:
            r5 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x01fc }
            monitor-enter(r5);	 Catch:{ all -> 0x01fc }
            r3 = 1;
            r0 = r22;
            r0.f1059h = r3;	 Catch:{ all -> 0x0457 }
            r3 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x0457 }
            r3.notifyAll();	 Catch:{ all -> 0x0457 }
            monitor-exit(r5);	 Catch:{ all -> 0x0457 }
            r3 = 0;
            r8 = r3;
        L_0x033b:
            if (r6 == 0) goto L_0x0494;
        L_0x033d:
            r0 = r22;
            r3 = r0.f1070s;	 Catch:{ all -> 0x01fc }
            r5 = r3.f1051f;	 Catch:{ all -> 0x01fc }
            r5 = r5.getGL();	 Catch:{ all -> 0x01fc }
            r3 = r3.f1046a;	 Catch:{ all -> 0x01fc }
            r3 = r3.get();	 Catch:{ all -> 0x01fc }
            r3 = (com.badlogic.gdx.backends.android.p015a.C0295d) r3;	 Catch:{ all -> 0x01fc }
            if (r3 == 0) goto L_0x0491;
        L_0x0351:
            r6 = r3.f1028i;	 Catch:{ all -> 0x01fc }
            if (r6 == 0) goto L_0x035f;
        L_0x0357:
            r5 = r3.f1028i;	 Catch:{ all -> 0x01fc }
            r5 = r5.m868a();	 Catch:{ all -> 0x01fc }
        L_0x035f:
            r6 = r3.f1029j;	 Catch:{ all -> 0x01fc }
            r6 = r6 & 3;
            if (r6 == 0) goto L_0x0491;
        L_0x0367:
            r7 = 0;
            r6 = 0;
            r17 = r3.f1029j;	 Catch:{ all -> 0x01fc }
            r17 = r17 & 1;
            if (r17 == 0) goto L_0x0372;
        L_0x0371:
            r7 = 1;
        L_0x0372:
            r3 = r3.f1029j;	 Catch:{ all -> 0x01fc }
            r3 = r3 & 2;
            if (r3 == 0) goto L_0x048e;
        L_0x037a:
            r3 = new com.badlogic.gdx.backends.android.a.d$k;	 Catch:{ all -> 0x01fc }
            r3.<init>();	 Catch:{ all -> 0x01fc }
        L_0x037f:
            r3 = android.opengl.GLDebugHelper.wrap(r5, r7, r3);	 Catch:{ all -> 0x01fc }
        L_0x0383:
            r3 = (javax.microedition.khronos.opengles.GL10) r3;	 Catch:{ all -> 0x01fc }
            r5 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x01fc }
            r5.m863a(r3);	 Catch:{ all -> 0x01fc }
            r6 = 0;
            r5 = r3;
        L_0x038e:
            if (r16 == 0) goto L_0x03ab;
        L_0x0390:
            r0 = r22;
            r3 = r0.f1071t;	 Catch:{ all -> 0x01fc }
            r3 = r3.get();	 Catch:{ all -> 0x01fc }
            r3 = (com.badlogic.gdx.backends.android.p015a.C0295d) r3;	 Catch:{ all -> 0x01fc }
            if (r3 == 0) goto L_0x03a9;
        L_0x039c:
            r3 = r3.f1023d;	 Catch:{ all -> 0x01fc }
            r0 = r22;
            r7 = r0.f1070s;	 Catch:{ all -> 0x01fc }
            r7 = r7.f1050e;	 Catch:{ all -> 0x01fc }
            r3.onSurfaceCreated(r5, r7);	 Catch:{ all -> 0x01fc }
        L_0x03a9:
            r16 = 0;
        L_0x03ab:
            if (r14 == 0) goto L_0x03c1;
        L_0x03ad:
            r0 = r22;
            r3 = r0.f1071t;	 Catch:{ all -> 0x01fc }
            r3 = r3.get();	 Catch:{ all -> 0x01fc }
            r3 = (com.badlogic.gdx.backends.android.p015a.C0295d) r3;	 Catch:{ all -> 0x01fc }
            if (r3 == 0) goto L_0x03c0;
        L_0x03b9:
            r3 = r3.f1023d;	 Catch:{ all -> 0x01fc }
            r3.onSurfaceChanged(r5, r11, r10);	 Catch:{ all -> 0x01fc }
        L_0x03c0:
            r14 = 0;
        L_0x03c1:
            r0 = r22;
            r3 = r0.f1071t;	 Catch:{ all -> 0x01fc }
            r3 = r3.get();	 Catch:{ all -> 0x01fc }
            r3 = (com.badlogic.gdx.backends.android.p015a.C0295d) r3;	 Catch:{ all -> 0x01fc }
            if (r3 == 0) goto L_0x03d4;
        L_0x03cd:
            r3 = r3.f1023d;	 Catch:{ all -> 0x01fc }
            r3.onDrawFrame(r5);	 Catch:{ all -> 0x01fc }
        L_0x03d4:
            r0 = r22;
            r3 = r0.f1070s;	 Catch:{ all -> 0x01fc }
            r7 = r3.f1047b;	 Catch:{ all -> 0x01fc }
            r0 = r3.f1048c;	 Catch:{ all -> 0x01fc }
            r17 = r0;
            r0 = r3.f1049d;	 Catch:{ all -> 0x01fc }
            r18 = r0;
            r0 = r17;
            r1 = r18;
            r7 = r7.eglSwapBuffers(r0, r1);	 Catch:{ all -> 0x01fc }
            if (r7 != 0) goto L_0x0482;
        L_0x03ec:
            r3 = r3.f1047b;	 Catch:{ all -> 0x01fc }
            r3 = r3.eglGetError();	 Catch:{ all -> 0x01fc }
        L_0x03f2:
            switch(r3) {
                case 12288: goto L_0x0410;
                case 12302: goto L_0x0486;
                default: goto L_0x03f5;
            };	 Catch:{ all -> 0x01fc }
        L_0x03f5:
            r7 = "GLThread";
            r17 = "eglSwapBuffers";
            r0 = r17;
            com.badlogic.gdx.backends.android.p015a.C0295d.C0302g.m850a(r7, r0, r3);	 Catch:{ all -> 0x01fc }
            r7 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x01fc }
            monitor-enter(r7);	 Catch:{ all -> 0x01fc }
            r3 = 1;
            r0 = r22;
            r0.f1067p = r3;	 Catch:{ all -> 0x0488 }
            r3 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x0488 }
            r3.notifyAll();	 Catch:{ all -> 0x0488 }
            monitor-exit(r7);	 Catch:{ all -> 0x0488 }
        L_0x0410:
            if (r13 == 0) goto L_0x04ac;
        L_0x0412:
            r3 = 1;
        L_0x0413:
            r4 = r9;
            r7 = r12;
            r17 = r5;
            r5 = r10;
            r9 = r13;
            r12 = r6;
            r10 = r14;
            r13 = r8;
            r6 = r11;
            r11 = r15;
            r14 = r16;
            r8 = r3;
            goto L_0x0032;
        L_0x0423:
            r3 = 0;
            r7.f1049d = r3;	 Catch:{ all -> 0x01fc }
            goto L_0x0309;
        L_0x0428:
            r3 = r7.f1047b;	 Catch:{ all -> 0x01fc }
            r8 = r7.f1048c;	 Catch:{ all -> 0x01fc }
            r0 = r7.f1049d;	 Catch:{ all -> 0x01fc }
            r18 = r0;
            r0 = r7.f1049d;	 Catch:{ all -> 0x01fc }
            r19 = r0;
            r0 = r7.f1051f;	 Catch:{ all -> 0x01fc }
            r20 = r0;
            r0 = r18;
            r1 = r19;
            r2 = r20;
            r3 = r3.eglMakeCurrent(r8, r0, r1, r2);	 Catch:{ all -> 0x01fc }
            if (r3 != 0) goto L_0x0454;
        L_0x0444:
            r3 = "EGLHelper";
            r8 = "eglMakeCurrent";
            r7 = r7.f1047b;	 Catch:{ all -> 0x01fc }
            r7 = r7.eglGetError();	 Catch:{ all -> 0x01fc }
            com.badlogic.gdx.backends.android.p015a.C0295d.C0302g.m850a(r3, r8, r7);	 Catch:{ all -> 0x01fc }
            r3 = 0;
            goto L_0x0325;
        L_0x0454:
            r3 = 1;
            goto L_0x0325;
        L_0x0457:
            r3 = move-exception;
            monitor-exit(r5);	 Catch:{ all -> 0x0457 }
            throw r3;	 Catch:{ all -> 0x01fc }
        L_0x045a:
            r7 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x01fc }
            monitor-enter(r7);	 Catch:{ all -> 0x01fc }
            r3 = 1;
            r0 = r22;
            r0.f1059h = r3;	 Catch:{ all -> 0x047f }
            r3 = 1;
            r0 = r22;
            r0.f1067p = r3;	 Catch:{ all -> 0x047f }
            r3 = com.badlogic.gdx.backends.android.p015a.C0295d.f1020a;	 Catch:{ all -> 0x047f }
            r3.notifyAll();	 Catch:{ all -> 0x047f }
            monitor-exit(r7);	 Catch:{ all -> 0x047f }
            r7 = r12;
            r8 = r4;
            r4 = r9;
            r12 = r6;
            r9 = r13;
            r6 = r11;
            r11 = r15;
            r13 = r5;
            r5 = r10;
            r10 = r14;
            r14 = r16;
            goto L_0x0032;
        L_0x047f:
            r3 = move-exception;
            monitor-exit(r7);	 Catch:{ all -> 0x047f }
            throw r3;	 Catch:{ all -> 0x01fc }
        L_0x0482:
            r3 = 12288; // 0x3000 float:1.7219E-41 double:6.071E-320;
            goto L_0x03f2;
        L_0x0486:
            r15 = 1;
            goto L_0x0410;
        L_0x0488:
            r3 = move-exception;
            monitor-exit(r7);	 Catch:{ all -> 0x0488 }
            throw r3;	 Catch:{ all -> 0x01fc }
        L_0x048b:
            r3 = move-exception;
            monitor-exit(r4);	 Catch:{ all -> 0x048b }
            throw r3;
        L_0x048e:
            r3 = r6;
            goto L_0x037f;
        L_0x0491:
            r3 = r5;
            goto L_0x0383;
        L_0x0494:
            r5 = r17;
            goto L_0x038e;
        L_0x0498:
            r8 = r5;
            goto L_0x033b;
        L_0x049b:
            r12 = r13;
            r21 = r6;
            r6 = r9;
            r9 = r3;
            r3 = r5;
            r5 = r21;
            goto L_0x0192;
        L_0x04a5:
            r3 = r10;
            r10 = r12;
            goto L_0x0176;
        L_0x04a9:
            r15 = r3;
            goto L_0x00a6;
        L_0x04ac:
            r3 = r4;
            goto L_0x0413;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.backends.android.a.d.h.f():void");
        }

        /* renamed from: a */
        public final void m858a(int i) {
            if (i < 0 || i > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (C0295d.f1020a) {
                this.f1068q = i;
                C0295d.f1020a.notifyAll();
            }
        }

        /* renamed from: a */
        final boolean m859a() {
            return !this.f1054c && this.f1055d && !this.f1067p && this.f1061j > 0 && this.f1062k > 0 && (this.f1063l || this.f1068q == 1);
        }

        /* renamed from: b */
        public final int m860b() {
            int i;
            synchronized (C0295d.f1020a) {
                i = this.f1068q;
            }
            return i;
        }

        /* renamed from: c */
        public final void m861c() {
            synchronized (C0295d.f1020a) {
                this.f1066o = true;
                C0295d.f1020a.notifyAll();
                while (!this.f1052a) {
                    try {
                        C0295d.f1020a.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void run() {
            setName("GLThread " + getId());
            try {
                m857f();
            } catch (InterruptedException e) {
            } finally {
                C0295d.f1020a.m862a(this);
            }
        }
    }

    /* renamed from: com.badlogic.gdx.backends.android.a.d$i */
    private static class C0304i {
        /* renamed from: c */
        private static String f1072c = "GLThreadManager";
        /* renamed from: a */
        boolean f1073a;
        /* renamed from: b */
        C0303h f1074b;
        /* renamed from: d */
        private boolean f1075d;
        /* renamed from: e */
        private int f1076e;
        /* renamed from: f */
        private boolean f1077f;
        /* renamed from: g */
        private boolean f1078g;

        private C0304i() {
        }

        /* renamed from: a */
        public final synchronized void m862a(C0303h c0303h) {
            c0303h.f1052a = true;
            if (this.f1074b == c0303h) {
                this.f1074b = null;
            }
            notifyAll();
        }

        /* renamed from: a */
        public final synchronized void m863a(GL10 gl10) {
            boolean z = true;
            synchronized (this) {
                if (!this.f1077f) {
                    m867c();
                    String glGetString = gl10.glGetString(7937);
                    if (this.f1076e < 131072) {
                        this.f1073a = !glGetString.startsWith("Q3Dimension MSM7500 ");
                        notifyAll();
                    }
                    if (this.f1073a) {
                        z = false;
                    }
                    this.f1078g = z;
                    this.f1077f = true;
                }
            }
        }

        /* renamed from: a */
        public final synchronized boolean m864a() {
            return this.f1078g;
        }

        /* renamed from: b */
        public final void m865b(C0303h c0303h) {
            if (this.f1074b == c0303h) {
                this.f1074b = null;
            }
            notifyAll();
        }

        /* renamed from: b */
        public final synchronized boolean m866b() {
            m867c();
            return !this.f1073a;
        }

        /* renamed from: c */
        final void m867c() {
            if (!this.f1075d) {
                this.f1076e = 131072;
                if (this.f1076e >= 131072) {
                    this.f1073a = true;
                }
                this.f1075d = true;
            }
        }
    }

    /* renamed from: com.badlogic.gdx.backends.android.a.d$j */
    public interface C0305j {
        /* renamed from: a */
        GL m868a();
    }

    /* renamed from: com.badlogic.gdx.backends.android.a.d$k */
    static class C0306k extends Writer {
        /* renamed from: a */
        private StringBuilder f1079a = new StringBuilder();

        C0306k() {
        }

        /* renamed from: a */
        private void m869a() {
            if (this.f1079a.length() > 0) {
                Log.v("GLSurfaceView", this.f1079a.toString());
                this.f1079a.delete(0, this.f1079a.length());
            }
        }

        public final void close() {
            m869a();
        }

        public final void flush() {
            m869a();
        }

        public final void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    m869a();
                } else {
                    this.f1079a.append(c);
                }
            }
        }
    }

    /* renamed from: com.badlogic.gdx.backends.android.a.d$l */
    private class C0307l extends C0298b {
        /* renamed from: j */
        final /* synthetic */ C0295d f1080j;

        public C0307l(C0295d c0295d, boolean z) {
            this.f1080j = c0295d;
            super(c0295d, z ? 16 : 0);
        }
    }

    public C0295d(Context context) {
        super(context);
        SurfaceHolder holder = getHolder();
        holder.addCallback(this);
        if (VERSION.SDK_INT <= 8) {
            holder.setFormat(4);
        }
    }

    /* renamed from: b */
    private void m832b() {
        if (this.f1022c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    protected void finalize() {
        try {
            if (this.f1022c != null) {
                this.f1022c.m861c();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f1029j;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f1031l;
    }

    public int getRenderMode() {
        return this.f1022c.m860b();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1024e && this.f1023d != null) {
            int b = this.f1022c != null ? this.f1022c.m860b() : 1;
            this.f1022c = new C0303h(this.f1021b);
            if (b != 1) {
                this.f1022c.m858a(b);
            }
            this.f1022c.start();
        }
        this.f1024e = false;
    }

    protected void onDetachedFromWindow() {
        if (this.f1022c != null) {
            this.f1022c.m861c();
        }
        this.f1024e = true;
        super.onDetachedFromWindow();
    }

    public void setDebugFlags(int i) {
        this.f1029j = i;
    }

    public void setEGLConfigChooser(EGLConfigChooser eGLConfigChooser) {
        m832b();
        this.f1025f = eGLConfigChooser;
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new C0307l(this, z));
    }

    public void setEGLContextClientVersion(int i) {
        m832b();
        this.f1030k = i;
    }

    public void setEGLContextFactory(C0293e c0293e) {
        m832b();
        this.f1026g = c0293e;
    }

    public void setEGLWindowSurfaceFactory(C0300f c0300f) {
        m832b();
        this.f1027h = c0300f;
    }

    public void setGLWrapper(C0305j c0305j) {
        this.f1028i = c0305j;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f1031l = z;
    }

    public void setRenderMode(int i) {
        this.f1022c.m858a(i);
    }

    public void setRenderer(Renderer renderer) {
        m832b();
        if (this.f1025f == null) {
            this.f1025f = new C0307l(this, true);
        }
        if (this.f1026g == null) {
            this.f1026g = new C0299c();
        }
        if (this.f1027h == null) {
            this.f1027h = new C0301d();
        }
        this.f1023d = renderer;
        this.f1022c = new C0303h(this.f1021b);
        this.f1022c.start();
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C0303h c0303h = this.f1022c;
        synchronized (f1020a) {
            c0303h.f1061j = i2;
            c0303h.f1062k = i3;
            c0303h.f1065n = true;
            c0303h.f1063l = true;
            c0303h.f1064m = false;
            f1020a.notifyAll();
            while (!c0303h.f1052a && !c0303h.f1054c && !c0303h.f1064m) {
                Object obj = (c0303h.f1057f && c0303h.f1058g && c0303h.m859a()) ? 1 : null;
                if (obj != null) {
                    try {
                        f1020a.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        C0303h c0303h = this.f1022c;
        synchronized (f1020a) {
            c0303h.f1055d = true;
            c0303h.f1059h = false;
            f1020a.notifyAll();
            while (c0303h.f1056e && !c0303h.f1059h && !c0303h.f1052a) {
                try {
                    f1020a.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0303h c0303h = this.f1022c;
        synchronized (f1020a) {
            c0303h.f1055d = false;
            f1020a.notifyAll();
            while (!c0303h.f1056e && !c0303h.f1052a) {
                try {
                    f1020a.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
