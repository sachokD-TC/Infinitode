package com.badlogic.gdx.backends.android;

import android.content.Context;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;

/* renamed from: com.badlogic.gdx.backends.android.r */
final class C0352r implements OnKeyListener, OnTouchListener {
    /* renamed from: a */
    final Context f1269a;
    /* renamed from: b */
    final Handler f1270b;
    /* renamed from: c */
    final C0341k f1271c;

    public C0352r(Context context, Handler handler, C0341k c0341k) {
        this.f1269a = context;
        this.f1270b = handler;
        this.f1271c = c0341k;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}
