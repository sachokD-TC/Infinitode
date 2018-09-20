package com.badlogic.gdx.pay.android.googleplay.p031a;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.android.vending.billing.IInAppBillingService;
import com.android.vending.billing.IInAppBillingService.Stub;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidEventListener;
import com.badlogic.gdx.pay.C0552a;
import com.badlogic.gdx.pay.C0583f;
import com.badlogic.gdx.pay.C0585h;
import com.badlogic.gdx.pay.android.googleplay.AndroidGooglePlayPurchaseManager;
import com.badlogic.gdx.pay.android.googleplay.ConsumeException;
import com.badlogic.gdx.pay.android.googleplay.GdxPayException;
import com.badlogic.gdx.pay.android.googleplay.ResponseCode;
import com.badlogic.gdx.pay.android.googleplay.p031a.C0561a.C0562a;
import com.badlogic.gdx.pay.android.googleplay.p031a.C0570c.C0553a;
import com.badlogic.gdx.pay.android.googleplay.p031a.C0570c.C0555b;
import com.badlogic.gdx.pay.android.googleplay.p031a.p032a.C0564a;
import com.badlogic.gdx.pay.android.googleplay.p031a.p032a.C0565b;
import com.badlogic.gdx.pay.android.googleplay.p031a.p032a.C0567d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.badlogic.gdx.pay.android.googleplay.a.e */
public final class C0580e implements C0570c {
    /* renamed from: a */
    IInAppBillingService f2511a;
    /* renamed from: b */
    final C0561a f2512b;
    /* renamed from: c */
    int f2513c;
    /* renamed from: d */
    C0567d f2514d;
    /* renamed from: e */
    C0574b f2515e;
    /* renamed from: f */
    C0553a f2516f;
    /* renamed from: g */
    private ServiceConnection f2517g;
    /* renamed from: h */
    private C0569b f2518h;
    /* renamed from: i */
    private final String f2519i;
    /* renamed from: j */
    private C0579d f2520j;

    /* renamed from: com.badlogic.gdx.pay.android.googleplay.a.e$b */
    private interface C0574b {
        /* renamed from: a */
        void mo450a(int i, Intent intent);
    }

    /* renamed from: com.badlogic.gdx.pay.android.googleplay.a.e$a */
    private class C0576a implements ServiceConnection {
        /* renamed from: a */
        final /* synthetic */ C0580e f2504a;

        private C0576a(C0580e c0580e) {
            this.f2504a = c0580e;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("GdxPay/V3GoogleIABS", "start onServiceConnected(), isConnected() is: " + this.f2504a.m1851f());
            if (!this.f2504a.m1851f()) {
                this.f2504a.f2511a = Stub.m713a(iBinder);
                this.f2504a.f2516f.mo432a();
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            this.f2504a.m1852g();
            this.f2504a.f2511a = null;
            this.f2504a.f2516f.mo433a(new GdxPayException("onServiceDisconnected() received."));
        }
    }

    /* renamed from: com.badlogic.gdx.pay.android.googleplay.a.e$c */
    private class C0578c implements Runnable {
        /* renamed from: a */
        final C0585h f2507a;
        /* renamed from: b */
        final C0583f f2508b;
        /* renamed from: c */
        final /* synthetic */ C0580e f2509c;

        public C0578c(C0580e c0580e, C0585h c0585h, C0583f c0583f) {
            this.f2509c = c0580e;
            this.f2507a = c0585h;
            this.f2508b = c0583f;
        }

        public final void run() {
            try {
                Log.d("GdxPay/V3GoogleIABS", "Purchase consumer starting");
                int a = this.f2509c.m1840a(this.f2507a.f2535i);
                if (a == 0) {
                    this.f2508b.mo1743a(this.f2507a);
                    return;
                }
                this.f2508b.mo1747b(new ConsumeException("Consuming " + this.f2507a.f2527a + " failed, " + ResponseCode.m1794a(a), this.f2507a));
            } catch (final RemoteException e) {
                this.f2509c.f2512b.mo446a(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C0578c f2506b;

                    public final void run() {
                        this.f2506b.f2508b.mo1747b(new ConsumeException("Failed consuming product: " + this.f2506b.f2507a.f2527a, this.f2506b.f2507a, e));
                    }
                });
            }
        }
    }

    /* renamed from: com.badlogic.gdx.pay.android.googleplay.a.e$d */
    private final class C0579d implements AndroidEventListener {
        /* renamed from: a */
        final /* synthetic */ C0580e f2510a;

        private C0579d(C0580e c0580e) {
            this.f2510a = c0580e;
        }

        public final void onActivityResult(int i, int i2, Intent intent) {
            if (this.f2510a.f2513c == i) {
                C0580e c0580e = this.f2510a;
                if (c0580e.f2515e != null) {
                    c0580e.f2515e.mo450a(i2, intent);
                    c0580e.f2515e = null;
                }
            }
        }
    }

    public C0580e(AndroidApplication androidApplication, int i, C0567d c0567d, C0569b c0569b) {
        this(new C0562a(androidApplication), i, c0567d, c0569b);
    }

    public C0580e(C0561a c0561a, int i, C0567d c0567d, C0569b c0569b) {
        this.f2512b = c0561a;
        this.f2513c = i;
        this.f2514d = c0567d;
        this.f2518h = c0569b;
        this.f2519i = c0561a.mo442a();
        this.f2520j = new C0579d();
        c0561a.mo445a(this.f2520j);
    }

    /* renamed from: a */
    private Bundle m1836a(Bundle bundle, String str) {
        try {
            return m1839i().mo144a(3, this.f2519i, str, bundle);
        } catch (Exception e) {
            throw new GdxPayException("getProductsDetails failed for bundle:" + bundle, e);
        }
    }

    /* renamed from: a */
    private static List<List<String>> m1837a(List<String> list) {
        List<List<String>> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list2 = arrayList2;
        for (String add : list) {
            list2.add(add);
            if (list2.size() >= 20) {
                arrayList.add(list2);
                arrayList2 = new ArrayList();
            } else {
                List list3 = list2;
            }
            Object obj = arrayList2;
        }
        if (list2.size() > 0) {
            arrayList.add(list2);
        }
        return arrayList;
    }

    /* renamed from: h */
    private void m1838h() {
        try {
            C0561a c0561a = this.f2512b;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage(AndroidGooglePlayPurchaseManager.GOOGLE_PLAY_STORE_NAME);
            if (!c0561a.mo447a(intent, this.f2517g)) {
                this.f2516f.mo433a(new GdxPayException("bindService() returns false."));
            }
        } catch (GdxPayException e) {
            throw e;
        } catch (Exception e2) {
            this.f2516f.mo433a(new GdxPayException("requestConnect() failed.", e2));
        }
    }

    /* renamed from: i */
    private IInAppBillingService m1839i() {
        if (m1851f()) {
            return this.f2511a;
        }
        throw new GdxPayException("Not connected to Google In-app Billing service");
    }

    /* renamed from: a */
    final int m1840a(String str) {
        return m1839i().mo148b(3, this.f2519i, str);
    }

    /* renamed from: a */
    public final Map<String, C0552a> mo451a(List<String> list, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Map<String, C0552a> hashMap = new HashMap();
            for (List list2 : C0580e.m1837a((List) list)) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list2);
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                bundle = m1836a(bundle, str);
                Map hashMap2 = new HashMap();
                hashMap2.putAll(C0565b.m1818a(bundle));
                hashMap.putAll(hashMap2);
            }
            return hashMap;
        } catch (Exception e) {
            throw new GdxPayException("getProductsDetails(" + list + " failed) after " + ((int) ((System.currentTimeMillis() - currentTimeMillis) / 1000)) + " seconds", e);
        }
    }

    /* renamed from: a */
    public final void mo452a() {
        for (C0585h c0585h : mo458d()) {
            Object obj = (c0585h.f2529c == null || c0585h.f2529c.length() == 0) ? 1 : null;
            if (obj != null) {
                try {
                    Log.d("GdxPay/V3GoogleIABS", "cancelTestPurchase " + c0585h + " response code: " + m1840a(c0585h.f2535i));
                } catch (Throwable e) {
                    Log.e("GdxPay/V3GoogleIABS", "Failed to cancel transaction: " + c0585h, e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo453a(C0553a c0553a) {
        if (this.f2516f != null) {
            throw new IllegalStateException("Already listening for connections.");
        }
        this.f2516f = c0553a;
        this.f2517g = new C0576a();
        m1838h();
    }

    /* renamed from: a */
    public final void mo454a(C0585h c0585h, C0583f c0583f) {
        Log.i("GdxPay/V3GoogleIABS", "consumePurchase: " + c0585h);
        new Thread(new C0578c(this, c0585h, c0583f)).start();
    }

    /* renamed from: a */
    public final void mo455a(String str, String str2, C0555b c0555b) {
        m1846a(str, str2, c0555b, true);
    }

    /* renamed from: a */
    final void m1846a(final String str, String str2, final C0555b c0555b, boolean z) {
        Exception e;
        try {
            Bundle a = m1839i().mo146a(3, this.f2519i, str, str2, "JustRandomStringTooHardToRememberTralala");
            ResponseCode a2 = ResponseCode.m1794a(a.getInt("RESPONSE_CODE"));
            if (a2 != ResponseCode.BILLING_RESPONSE_RESULT_OK) {
                throw new GdxPayException("Unexpected getBuyIntent() responseCode: " + a2 + " with response data: " + a);
            }
            PendingIntent pendingIntent = (PendingIntent) a.getParcelable("BUY_INTENT");
            if (pendingIntent == null) {
                throw new GdxPayException("Missing value for key: BUY_INTENTin getBuyIntent() response: " + a);
            }
            try {
                this.f2512b.mo443a(pendingIntent.getIntentSender(), this.f2513c, new Intent());
                this.f2515e = new C0574b(this) {
                    /* renamed from: b */
                    final /* synthetic */ C0580e f2503b;

                    /* renamed from: a */
                    public final void mo450a(int i, Intent intent) {
                        if (i == -1) {
                            try {
                                c0555b.mo436a(this.f2503b.f2514d.m1821a(intent));
                            } catch (Exception e) {
                                c0555b.mo435a(new GdxPayException("Error converting purchase success response: " + intent, e));
                            }
                        } else if (i == 0) {
                            c0555b.mo434a();
                        } else {
                            c0555b.mo435a(new GdxPayException("Unexpected resultCode:" + i + "with data:" + intent));
                        }
                    }
                };
            } catch (Exception e2) {
                c0555b.mo435a(new GdxPayException("startIntentSenderForResult failed for product: " + str, e2));
            }
        } catch (RemoteException e3) {
            e2 = e3;
            if (z) {
                c0555b.mo435a(new GdxPayException("startPurchaseRequest failed at getBuyIntent() for product: " + str, e2));
                return;
            }
            m1852g();
            m1838h();
            this.f2518h.mo449a(new Runnable(this) {
                /* renamed from: c */
                final /* synthetic */ C0580e f2501c;

                public final void run() {
                    this.f2501c.m1846a(str, str, c0555b, false);
                }
            });
        } catch (RuntimeException e4) {
            e2 = e4;
            if (z) {
                c0555b.mo435a(new GdxPayException("startPurchaseRequest failed at getBuyIntent() for product: " + str, e2));
                return;
            }
            m1852g();
            m1838h();
            this.f2518h.mo449a(/* anonymous class already generated */);
        }
    }

    /* renamed from: b */
    public final void mo456b() {
        this.f2511a = null;
        m1852g();
        this.f2516f = null;
    }

    /* renamed from: c */
    public final boolean mo457c() {
        return this.f2516f != null;
    }

    /* renamed from: d */
    public final List<C0585h> mo458d() {
        Exception e;
        try {
            Bundle a = m1839i().mo145a(3, this.f2519i, "inapp", null);
            Bundle a2 = m1839i().mo145a(3, this.f2519i, "subs", null);
            List<C0585h> arrayList = new ArrayList();
            arrayList.addAll(C0564a.m1816a(a));
            arrayList.addAll(C0564a.m1816a(a2));
            return arrayList;
        } catch (RemoteException e2) {
            e = e2;
            throw new GdxPayException("Unexpected exception in getPurchases()", e);
        } catch (RuntimeException e3) {
            e = e3;
            throw new GdxPayException("Unexpected exception in getPurchases()", e);
        }
    }

    /* renamed from: e */
    public final void mo459e() {
        this.f2512b.mo448b(this.f2520j);
        mo456b();
    }

    /* renamed from: f */
    final boolean m1851f() {
        return this.f2511a != null;
    }

    /* renamed from: g */
    final void m1852g() {
        if (this.f2517g != null) {
            try {
                this.f2512b.mo444a(this.f2517g);
                this.f2511a = null;
            } catch (Throwable e) {
                Log.e("GdxPay/V3GoogleIABS", "Unexpected exception in unbindService()", e);
            }
        }
    }
}
