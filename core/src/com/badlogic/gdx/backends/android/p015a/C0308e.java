package com.badlogic.gdx.backends.android.p015a;

import android.opengl.GLSurfaceView.EGLConfigChooser;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: com.badlogic.gdx.backends.android.a.e */
public final class C0308e implements EGLConfigChooser {
    /* renamed from: a */
    protected int f1081a;
    /* renamed from: b */
    protected int f1082b;
    /* renamed from: c */
    protected int f1083c;
    /* renamed from: d */
    protected int f1084d;
    /* renamed from: e */
    protected int f1085e;
    /* renamed from: f */
    protected int f1086f;
    /* renamed from: g */
    protected int f1087g;
    /* renamed from: h */
    protected final int[] f1088h;
    /* renamed from: i */
    private int[] f1089i = new int[1];

    public C0308e(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f1081a = i;
        this.f1082b = i2;
        this.f1083c = i3;
        this.f1084d = i4;
        this.f1085e = i5;
        this.f1086f = i6;
        this.f1087g = i7;
        this.f1088h = new int[]{12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};
    }

    /* renamed from: a */
    private int m870a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f1089i) ? this.f1089i[0] : 0;
    }

    /* renamed from: a */
    private EGLConfig m871a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        EGLConfig eGLConfig;
        EGLConfig eGLConfig2 = null;
        EGLConfig eGLConfig3 = null;
        int length = eGLConfigArr.length;
        int i = 0;
        EGLConfig eGLConfig4 = null;
        while (i < length) {
            eGLConfig = eGLConfigArr[i];
            int a = m870a(egl10, eGLDisplay, eGLConfig, 12325);
            int a2 = m870a(egl10, eGLDisplay, eGLConfig, 12326);
            if (a >= this.f1085e && a2 >= this.f1086f) {
                a = m870a(egl10, eGLDisplay, eGLConfig, 12324);
                a2 = m870a(egl10, eGLDisplay, eGLConfig, 12323);
                int a3 = m870a(egl10, eGLDisplay, eGLConfig, 12322);
                int a4 = m870a(egl10, eGLDisplay, eGLConfig, 12321);
                if (eGLConfig4 == null && a == 5 && a2 == 6 && a3 == 5 && a4 == 0) {
                    eGLConfig4 = eGLConfig;
                }
                if (eGLConfig2 == null && a == this.f1081a && a2 == this.f1082b && a3 == this.f1083c && a4 == this.f1084d) {
                    if (this.f1087g == 0) {
                        EGLConfig eGLConfig5 = eGLConfig4;
                        eGLConfig4 = eGLConfig;
                        eGLConfig = eGLConfig5;
                        break;
                    }
                    eGLConfig2 = eGLConfig;
                }
                int a5 = m870a(egl10, eGLDisplay, eGLConfig, 12338);
                int a6 = m870a(egl10, eGLDisplay, eGLConfig, 12337);
                if (eGLConfig3 == null && a5 == 1 && a6 >= this.f1087g && a == this.f1081a && a2 == this.f1082b && a3 == this.f1083c && a4 == this.f1084d) {
                    eGLConfig3 = eGLConfig2;
                    i++;
                    eGLConfig2 = eGLConfig3;
                    eGLConfig3 = eGLConfig;
                } else {
                    a5 = m870a(egl10, eGLDisplay, eGLConfig, 12512);
                    a6 = m870a(egl10, eGLDisplay, eGLConfig, 12513);
                    if (eGLConfig3 == null && a5 == 1 && a6 >= this.f1087g && a == this.f1081a && a2 == this.f1082b && a3 == this.f1083c && a4 == this.f1084d) {
                        eGLConfig3 = eGLConfig2;
                        i++;
                        eGLConfig2 = eGLConfig3;
                        eGLConfig3 = eGLConfig;
                    }
                }
            }
            eGLConfig = eGLConfig3;
            eGLConfig3 = eGLConfig2;
            i++;
            eGLConfig2 = eGLConfig3;
            eGLConfig3 = eGLConfig;
        }
        eGLConfig = eGLConfig4;
        eGLConfig4 = eGLConfig2;
        return eGLConfig3 != null ? eGLConfig3 : eGLConfig4 != null ? eGLConfig4 : eGLConfig;
    }

    public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplay, this.f1088h, null, 0, iArr);
        int i = iArr[0];
        if (i <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        egl10.eglChooseConfig(eGLDisplay, this.f1088h, eGLConfigArr, i, iArr);
        return m871a(egl10, eGLDisplay, eGLConfigArr);
    }
}
