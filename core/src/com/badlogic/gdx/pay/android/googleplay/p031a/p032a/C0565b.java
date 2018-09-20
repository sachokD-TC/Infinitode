package com.badlogic.gdx.pay.android.googleplay.p031a.p032a;

import android.os.Bundle;
import com.badlogic.gdx.pay.C0552a;
import com.badlogic.gdx.pay.C0552a.C0551a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.badlogic.gdx.pay.android.googleplay.a.a.b */
public final class C0565b {
    /* renamed from: a */
    public static Map<String, C0552a> m1818a(Bundle bundle) {
        C0568e.m1822a(bundle);
        List stringArrayList = bundle.getStringArrayList("DETAILS_LIST");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new IllegalArgumentException("No skus found in response");
        }
        try {
            return C0565b.m1819a(stringArrayList);
        } catch (Throwable e) {
            throw new IllegalArgumentException("Failed to parse : " + bundle, e);
        }
    }

    /* renamed from: a */
    private static Map<String, C0552a> m1819a(List<String> list) {
        Map<String, C0552a> hashMap = new HashMap();
        for (String jSONObject : list) {
            JSONObject jSONObject2 = new JSONObject(jSONObject);
            String string = jSONObject2.getString("productId");
            String jSONObject3 = jSONObject2.getString("price");
            String string2 = jSONObject2.getString("title");
            String string3 = jSONObject2.getString("description");
            C0551a a = C0552a.m1775a();
            a.f2457a = string2;
            a.f2458b = string3;
            a.f2459c = jSONObject3;
            a.f2460d = jSONObject2.has("price_amount_micros") ? Integer.valueOf(((int) jSONObject2.getLong("price_amount_micros")) / 10000) : null;
            a.f2461e = jSONObject2.getString("price_currency_code");
            hashMap.put(string, new C0552a(a));
        }
        return hashMap;
    }
}
