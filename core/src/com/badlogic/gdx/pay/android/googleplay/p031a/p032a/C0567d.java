package com.badlogic.gdx.pay.android.googleplay.p031a.p032a;

import android.content.Intent;
import com.badlogic.gdx.pay.C0552a;
import com.badlogic.gdx.pay.C0560d;
import com.badlogic.gdx.pay.C0585h;
import com.badlogic.gdx.pay.android.googleplay.GdxPayException;

/* renamed from: com.badlogic.gdx.pay.android.googleplay.a.a.d */
public final class C0567d {
    /* renamed from: a */
    private C0560d f2495a;

    public C0567d(C0560d c0560d) {
        this.f2495a = c0560d;
    }

    /* renamed from: a */
    public final C0585h m1821a(Intent intent) {
        String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        try {
            C0585h a = C0566c.m1820a(stringExtra);
            a.f2536j = intent.getStringExtra("INAPP_DATA_SIGNATURE");
            C0552a information = this.f2495a.getInformation(a.f2527a);
            Integer num = information.f2466e;
            a.f2531e = num == null ? 0 : num.intValue();
            a.f2532f = information.f2467f;
            return a;
        } catch (Exception e) {
            throw new GdxPayException("JSON Exception while parsing: " + stringExtra, e);
        }
    }
}
