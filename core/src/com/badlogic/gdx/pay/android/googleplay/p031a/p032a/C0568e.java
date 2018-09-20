package com.badlogic.gdx.pay.android.googleplay.p031a.p032a;

import android.os.Bundle;
import com.badlogic.gdx.pay.android.googleplay.ResponseCode;

/* renamed from: com.badlogic.gdx.pay.android.googleplay.a.a.e */
final class C0568e {
    /* renamed from: a */
    protected static void m1822a(Bundle bundle) {
        ResponseCode a = ResponseCode.m1794a(bundle.getInt("RESPONSE_CODE", -1));
        if (a == null) {
            throw new IllegalArgumentException("Bundle is missing key: RESPONSE_CODE");
        } else if (a != ResponseCode.BILLING_RESPONSE_RESULT_OK) {
            throw new IllegalArgumentException("Unexpected response code: " + a + ", response: " + bundle);
        }
    }
}
