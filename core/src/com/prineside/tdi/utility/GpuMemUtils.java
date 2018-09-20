package com.prineside.tdi.utility;

import com.badlogic.gdx.graphics.Pixmap.Format;

public class GpuMemUtils {

    /* renamed from: com.prineside.tdi.utility.GpuMemUtils$1 */
    static /* synthetic */ class C12571 {
        /* renamed from: a */
        static final /* synthetic */ int[] f8391a = new int[Format.values().length];

        static {
            try {
                f8391a[Format.Alpha.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f8391a[Format.Intensity.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f8391a[Format.LuminanceAlpha.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f8391a[Format.RGB565.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f8391a[Format.RGBA4444.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f8391a[Format.RGB888.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f8391a[Format.RGBA8888.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    public static class GpuMemInfo {
    }
}
