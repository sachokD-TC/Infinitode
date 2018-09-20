package com.badlogic.gdx.backends.android;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.ClipboardManager;
import com.badlogic.gdx.utils.C0314e;

/* renamed from: com.badlogic.gdx.backends.android.e */
public final class C0315e implements C0314e {
    /* renamed from: a */
    private ClipboardManager f1117a;
    /* renamed from: b */
    private android.content.ClipboardManager f1118b;

    public C0315e(Context context) {
        if (VERSION.SDK_INT < 11) {
            this.f1117a = (ClipboardManager) context.getSystemService("clipboard");
        } else {
            this.f1118b = (android.content.ClipboardManager) context.getSystemService("clipboard");
        }
    }
}
