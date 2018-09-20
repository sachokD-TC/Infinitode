package com.badlogic.gdx.backends.android;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnGenericMotionListener;
import com.badlogic.gdx.Application;
import java.util.ArrayList;

/* renamed from: com.badlogic.gdx.backends.android.m */
public class C0343m extends C0341k implements OnGenericMotionListener {
    /* renamed from: H */
    ArrayList<OnGenericMotionListener> f1254H = new ArrayList();
    /* renamed from: I */
    private final C0344n f1255I;

    public C0343m(Application application, Context context, Object obj, C0310b c0310b) {
        super(application, context, obj, c0310b);
        if (obj instanceof View) {
            ((View) obj).setOnGenericMotionListener(this);
        }
        this.f1255I = new C0344n();
    }

    public boolean onGenericMotion(View view, MotionEvent motionEvent) {
        if (this.f1255I.m983a(motionEvent, this)) {
            return true;
        }
        int size = this.f1254H.size();
        for (int i = 0; i < size; i++) {
            if (((OnGenericMotionListener) this.f1254H.get(i)).onGenericMotion(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
