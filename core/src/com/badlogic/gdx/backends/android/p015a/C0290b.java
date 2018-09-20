package com.badlogic.gdx.backends.android.p015a;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.EGLConfigChooser;
import android.opengl.GLSurfaceView.EGLContextFactory;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.badlogic.gdx.backends.android.p015a.C0285f.C0309a;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: com.badlogic.gdx.backends.android.a.b */
public final class C0290b extends GLSurfaceView {
    /* renamed from: a */
    static String f1006a = "GL2JNIView";
    /* renamed from: c */
    static int f1007c;
    /* renamed from: b */
    final C0285f f1008b;

    /* renamed from: com.badlogic.gdx.backends.android.a.b$a */
    private static class C0288a implements EGLConfigChooser {
        /* renamed from: g */
        private static int f996g = 4;
        /* renamed from: h */
        private static int[] f997h = new int[]{12324, 4, 12323, 4, 12322, 4, 12352, f996g, 12344};
        /* renamed from: a */
        protected int f998a = 5;
        /* renamed from: b */
        protected int f999b = 6;
        /* renamed from: c */
        protected int f1000c = 5;
        /* renamed from: d */
        protected int f1001d = 0;
        /* renamed from: e */
        protected int f1002e = 16;
        /* renamed from: f */
        protected int f1003f = 0;
        /* renamed from: i */
        private int[] f1004i = new int[1];

        /* renamed from: a */
        private int m820a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f1004i) ? this.f1004i[0] : 0;
        }

        /* renamed from: a */
        private EGLConfig m821a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int a = m820a(egl10, eGLDisplay, eGLConfig, 12325);
                int a2 = m820a(egl10, eGLDisplay, eGLConfig, 12326);
                if (a >= this.f1002e && a2 >= this.f1003f) {
                    a = m820a(egl10, eGLDisplay, eGLConfig, 12324);
                    a2 = m820a(egl10, eGLDisplay, eGLConfig, 12323);
                    int a3 = m820a(egl10, eGLDisplay, eGLConfig, 12322);
                    int a4 = m820a(egl10, eGLDisplay, eGLConfig, 12321);
                    if (a == this.f998a && a2 == this.f999b && a3 == this.f1000c && a4 == this.f1001d) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            egl10.eglChooseConfig(eGLDisplay, f997h, null, 0, iArr);
            int i = iArr[0];
            if (i <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            egl10.eglChooseConfig(eGLDisplay, f997h, eGLConfigArr, i, iArr);
            return m821a(egl10, eGLDisplay, eGLConfigArr);
        }
    }

    /* renamed from: com.badlogic.gdx.backends.android.a.b$b */
    static class C0289b implements EGLContextFactory {
        /* renamed from: a */
        private static int f1005a = 12440;

        C0289b() {
        }

        public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            EGLContext eglCreateContext;
            while (true) {
                Log.w(C0290b.f1006a, "creating OpenGL ES " + C0290b.f1007c + ".0 context");
                C0290b.m822a("Before eglCreateContext " + C0290b.f1007c, egl10);
                eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{f1005a, C0290b.f1007c, 12344});
                if ((!C0290b.m822a("After eglCreateContext " + C0290b.f1007c, egl10) || eglCreateContext == null) && C0290b.f1007c > 2) {
                    Log.w(C0290b.f1006a, "Falling back to GLES 2");
                    C0290b.f1007c = 2;
                }
            }
            Log.w(C0290b.f1006a, "Returning a GLES " + C0290b.f1007c + " context");
            return eglCreateContext;
        }

        public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }
    }

    public C0290b(Context context, C0285f c0285f, int i) {
        super(context);
        f1007c = i;
        this.f1008b = c0285f;
        setEGLContextFactory(new C0289b());
        setEGLConfigChooser(new C0288a());
    }

    /* renamed from: a */
    static boolean m822a(String str, EGL10 egl10) {
        boolean z = true;
        while (egl10.eglGetError() != 12288) {
            Log.e(f1006a, String.format("%s: EGL error: 0x%x", new Object[]{str, Integer.valueOf(r3)}));
            z = false;
        }
        return z;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (editorInfo != null) {
            editorInfo.imeOptions |= 268435456;
        }
        return new BaseInputConnection(this, this) {
            /* renamed from: a */
            final /* synthetic */ C0290b f995a;

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
        C0309a a = this.f1008b.mo251a(i, i2);
        setMeasuredDimension(a.f1090a, a.f1091b);
    }
}
