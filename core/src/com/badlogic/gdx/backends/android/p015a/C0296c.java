package com.badlogic.gdx.backends.android.p015a;

import android.content.Context;
import android.opengl.GLSurfaceView.EGLConfigChooser;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.badlogic.gdx.backends.android.p015a.C0285f.C0309a;
import com.badlogic.gdx.backends.android.p015a.C0295d.C0293e;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: com.badlogic.gdx.backends.android.a.c */
public final class C0296c extends C0295d {
    /* renamed from: a */
    static String f1032a = "GL2JNIView";
    /* renamed from: b */
    final C0285f f1033b;

    /* renamed from: com.badlogic.gdx.backends.android.a.c$a */
    private static class C0292a implements EGLConfigChooser {
        /* renamed from: g */
        private static int f1010g = 4;
        /* renamed from: h */
        private static int[] f1011h = new int[]{12324, 4, 12323, 4, 12322, 4, 12352, f1010g, 12344};
        /* renamed from: a */
        protected int f1012a = 5;
        /* renamed from: b */
        protected int f1013b = 6;
        /* renamed from: c */
        protected int f1014c = 5;
        /* renamed from: d */
        protected int f1015d = 0;
        /* renamed from: e */
        protected int f1016e = 16;
        /* renamed from: f */
        protected int f1017f = 0;
        /* renamed from: i */
        private int[] f1018i = new int[1];

        /* renamed from: a */
        private int m823a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f1018i) ? this.f1018i[0] : 0;
        }

        /* renamed from: a */
        private EGLConfig m824a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int a = m823a(egl10, eGLDisplay, eGLConfig, 12325);
                int a2 = m823a(egl10, eGLDisplay, eGLConfig, 12326);
                if (a >= this.f1016e && a2 >= this.f1017f) {
                    a = m823a(egl10, eGLDisplay, eGLConfig, 12324);
                    a2 = m823a(egl10, eGLDisplay, eGLConfig, 12323);
                    int a3 = m823a(egl10, eGLDisplay, eGLConfig, 12322);
                    int a4 = m823a(egl10, eGLDisplay, eGLConfig, 12321);
                    if (a == this.f1012a && a2 == this.f1013b && a3 == this.f1014c && a4 == this.f1015d) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            egl10.eglChooseConfig(eGLDisplay, f1011h, null, 0, iArr);
            int i = iArr[0];
            if (i <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            egl10.eglChooseConfig(eGLDisplay, f1011h, eGLConfigArr, i, iArr);
            return m824a(egl10, eGLDisplay, eGLConfigArr);
        }
    }

    /* renamed from: com.badlogic.gdx.backends.android.a.c$b */
    static class C0294b implements C0293e {
        /* renamed from: a */
        private static int f1019a = 12440;

        C0294b() {
        }

        /* renamed from: a */
        public final EGLContext mo252a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            Log.w(C0296c.f1032a, "creating OpenGL ES 2.0 context");
            C0296c.m839a("Before eglCreateContext", egl10);
            EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{f1019a, 2, 12344});
            C0296c.m839a("After eglCreateContext", egl10);
            return eglCreateContext;
        }

        /* renamed from: a */
        public final void mo253a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }
    }

    public C0296c(Context context, C0285f c0285f) {
        super(context);
        this.f1033b = c0285f;
        setEGLContextFactory(new C0294b());
        setEGLConfigChooser(new C0292a());
    }

    /* renamed from: a */
    static void m839a(String str, EGL10 egl10) {
        while (egl10.eglGetError() != 12288) {
            Log.e(f1032a, String.format("%s: EGL error: 0x%x", new Object[]{str, Integer.valueOf(r0)}));
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (editorInfo != null) {
            editorInfo.imeOptions |= 268435456;
        }
        return new BaseInputConnection(this, this) {
            /* renamed from: a */
            final /* synthetic */ C0296c f1009a;

            public final boolean deleteSurroundingText(int i, int i2) {
                if (VERSION.SDK_INT < 16 || i != 1 || i2 != 0) {
                    return super.deleteSurroundingText(i, i2);
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                super.sendKeyEvent(new KeyEvent(uptimeMillis, uptimeMillis, 0, 67, 0, 0, -1, 0, 6));
                super.sendKeyEvent(new KeyEvent(SystemClock.uptimeMillis(), uptimeMillis, 1, 67, 0, 0, -1, 0, 6));
                return true;
            }
        };
    }

    protected final void onMeasure(int i, int i2) {
        C0309a a = this.f1033b.mo251a(i, i2);
        setMeasuredDimension(a.f1090a, a.f1091b);
    }
}
