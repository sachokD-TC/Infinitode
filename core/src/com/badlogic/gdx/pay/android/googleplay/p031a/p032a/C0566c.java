package com.badlogic.gdx.pay.android.googleplay.p031a.p032a;

import com.badlogic.gdx.pay.C0585h;
import java.util.Date;
import org.json.JSONObject;

/* renamed from: com.badlogic.gdx.pay.android.googleplay.a.a.c */
public final class C0566c {
    /* renamed from: a */
    public static C0585h m1820a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        C0585h c0585h = new C0585h();
        c0585h.f2528b = "GooglePlay";
        if (jSONObject.has("purchaseToken")) {
            c0585h.f2535i = jSONObject.getString("purchaseToken");
        }
        if (jSONObject.has("orderId")) {
            c0585h.f2529c = jSONObject.getString("orderId");
        }
        c0585h.f2527a = jSONObject.getString("productId");
        c0585h.f2530d = new Date(jSONObject.getLong("purchaseTime"));
        if (jSONObject.has("purchaseState")) {
            switch (jSONObject.getInt("purchaseState")) {
                case 1:
                    c0585h.f2533g = new Date();
                    c0585h.f2534h = "Cancelled";
                    break;
                case 2:
                    c0585h.f2533g = new Date();
                    c0585h.f2534h = "Refunded";
                    break;
            }
        }
        return c0585h;
    }
}
