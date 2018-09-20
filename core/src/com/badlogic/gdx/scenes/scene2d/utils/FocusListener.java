package com.badlogic.gdx.scenes.scene2d.utils;

import com.badlogic.gdx.scenes.scene2d.C0586c;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0603d;

public abstract class FocusListener implements C0603d {

    public static class FocusEvent extends C0586c {
        /* renamed from: i */
        public boolean f2913i;
        /* renamed from: j */
        public Type f2914j;
        /* renamed from: k */
        public C0602b f2915k;

        public enum Type {
            keyboard,
            scroll
        }

        /* renamed from: a */
        public final void mo360a() {
            super.mo360a();
            this.f2915k = null;
        }
    }
}
