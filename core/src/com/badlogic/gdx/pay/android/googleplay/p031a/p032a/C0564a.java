package com.badlogic.gdx.pay.android.googleplay.p031a.p032a;

import android.os.Bundle;
import com.badlogic.gdx.pay.C0585h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.badlogic.gdx.pay.android.googleplay.a.a.a */
public final class C0564a {
    /* renamed from: a */
    public static List<C0585h> m1816a(Bundle bundle) {
        C0568e.m1822a(bundle);
        return C0564a.m1817a(bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST"));
    }

    /* renamed from: a */
    private static List<C0585h> m1817a(ArrayList<String> arrayList) {
        List<C0585h> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                arrayList2.add(C0566c.m1820a(str));
            } catch (Throwable e) {
                throw new IllegalArgumentException("JSON operation failed for json: " + str, e);
            }
        }
        return arrayList2;
    }
}
