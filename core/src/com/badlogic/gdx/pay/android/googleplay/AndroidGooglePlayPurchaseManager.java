package com.badlogic.gdx.pay.android.googleplay;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.util.Log;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.C0321h;
import com.badlogic.gdx.pay.C0552a;
import com.badlogic.gdx.pay.C0560d;
import com.badlogic.gdx.pay.C0581c;
import com.badlogic.gdx.pay.C0582e;
import com.badlogic.gdx.pay.C0583f;
import com.badlogic.gdx.pay.C0584g;
import com.badlogic.gdx.pay.C0585h;
import com.badlogic.gdx.pay.OfferType;
import com.badlogic.gdx.pay.android.googleplay.p031a.C0561a.C0563b;
import com.badlogic.gdx.pay.android.googleplay.p031a.C0570c;
import com.badlogic.gdx.pay.android.googleplay.p031a.C0570c.C0553a;
import com.badlogic.gdx.pay.android.googleplay.p031a.C0570c.C0555b;
import com.badlogic.gdx.pay.android.googleplay.p031a.C0572d;
import com.badlogic.gdx.pay.android.googleplay.p031a.C0580e;
import com.badlogic.gdx.pay.android.googleplay.p031a.p032a.C0567d;
import com.badlogic.gdx.utils.C0676a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AndroidGooglePlayPurchaseManager implements C0560d {
    public static final String GOOGLE_MARKET_NAME = "com.google.market";
    public static final String GOOGLE_PLAY_STORE_NAME = "com.android.vending";
    public static final String LOG_TAG = "GdxPay/AndroidPlay";
    /* renamed from: a */
    private final C0570c f2478a;
    /* renamed from: b */
    private final Map<String, C0552a> f2479b = new ConcurrentHashMap();
    /* renamed from: c */
    private C0583f f2480c;
    /* renamed from: d */
    private C0582e f2481d;

    public AndroidGooglePlayPurchaseManager(Activity activity, int i) {
        if (activity instanceof AndroidApplication) {
            this.f2478a = new C0580e((AndroidApplication) activity, i, new C0567d(this), new C0572d());
            return;
        }
        throw new IllegalArgumentException("Bootstrapping gdx-pay only supported with AndroidApplication activity.");
    }

    public AndroidGooglePlayPurchaseManager(Activity activity, C0321h c0321h, int i) {
        this.f2478a = new C0580e(new C0563b(activity, c0321h), i, new C0567d(this), new C0572d());
        C0584g.m1870a((C0560d) this);
    }

    public AndroidGooglePlayPurchaseManager(C0570c c0570c) {
        this.f2478a = c0570c;
    }

    /* renamed from: a */
    private OfferType m1788a(String str) {
        C0581c a = this.f2481d.m1859a(str);
        if (a != null && a.m1853a() != null) {
            return a.m1853a();
        }
        throw new IllegalStateException("No offer or offerType configured for identifier: " + str + ", offer: " + a);
    }

    /* renamed from: a */
    private void m1791a(List<String> list, List<String> list2) {
        for (int i = 0; i < this.f2481d.m1857a(); i++) {
            C0581c a = this.f2481d.m1858a(i);
            if (a.m1853a().equals(OfferType.SUBSCRIPTION)) {
                list2.add(a.m1856b());
            } else {
                list.add(a.m1856b());
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m1793c(AndroidGooglePlayPurchaseManager androidGooglePlayPurchaseManager) {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        androidGooglePlayPurchaseManager.m1791a(arrayList, arrayList2);
        androidGooglePlayPurchaseManager.f2479b.clear();
        if (!arrayList.isEmpty()) {
            androidGooglePlayPurchaseManager.f2479b.putAll(androidGooglePlayPurchaseManager.f2478a.mo451a(arrayList, "inapp"));
        }
        if (!arrayList2.isEmpty()) {
            androidGooglePlayPurchaseManager.f2479b.putAll(androidGooglePlayPurchaseManager.f2478a.mo451a(arrayList2, "subs"));
        }
    }

    public static boolean isRunningViaGooglePlay(Activity activity) {
        for (PackageInfo packageInfo : activity.getPackageManager().getInstalledPackages(0)) {
            String str = packageInfo.packageName;
            if (!str.equals(GOOGLE_MARKET_NAME)) {
                if (str.equals(GOOGLE_PLAY_STORE_NAME)) {
                }
            }
            return true;
        }
        return false;
    }

    public void cancelTestPurchases() {
        this.f2478a.mo452a();
    }

    public void dispose() {
        this.f2478a.mo459e();
        this.f2479b.clear();
        this.f2480c = null;
    }

    public C0552a getInformation(String str) {
        C0552a c0552a = (C0552a) this.f2479b.get(str);
        return c0552a == null ? C0552a.f2462a : c0552a;
    }

    public void install(final C0583f c0583f, C0582e c0582e, final boolean z) {
        this.f2480c = c0583f;
        this.f2481d = c0582e;
        if (this.f2478a.mo457c()) {
            this.f2478a.mo456b();
        }
        this.f2478a.mo453a(new C0553a(this) {
            /* renamed from: c */
            final /* synthetic */ AndroidGooglePlayPurchaseManager f2470c;

            /* renamed from: a */
            public final void mo432a() {
                this.f2470c.runAsync(new Runnable(this.f2470c, z, c0583f) {
                    /* renamed from: c */
                    final /* synthetic */ AndroidGooglePlayPurchaseManager f2476c;

                    public final void run() {
                        try {
                            if (r3) {
                                AndroidGooglePlayPurchaseManager.m1793c(this.f2476c);
                            }
                        } catch (Throwable e) {
                            Log.e(AndroidGooglePlayPurchaseManager.LOG_TAG, "Failed to load skus in onServiceConnected()", e);
                        }
                        r2.mo1742a();
                    }
                });
            }

            /* renamed from: a */
            public final void mo433a(GdxPayException gdxPayException) {
                c0583f.mo1744a(new GdxPayException("Failed to bind to service", gdxPayException));
            }
        });
    }

    public boolean installed() {
        return this.f2478a.mo457c();
    }

    public void purchase(final String str) {
        if (installed()) {
            final OfferType a = m1788a(str);
            this.f2478a.mo455a(str, a.equals(OfferType.SUBSCRIPTION) ? "subs" : "inapp", new C0555b(this) {
                /* renamed from: c */
                final /* synthetic */ AndroidGooglePlayPurchaseManager f2473c;

                /* renamed from: a */
                public final void mo434a() {
                    if (this.f2473c.f2480c != null) {
                        this.f2473c.f2480c.mo1748c();
                    }
                }

                /* renamed from: a */
                public final void mo435a(GdxPayException gdxPayException) {
                    if (this.f2473c.f2480c != null) {
                        this.f2473c.f2480c.mo1747b(gdxPayException);
                    }
                }

                /* renamed from: a */
                public final void mo436a(C0585h c0585h) {
                    if (this.f2473c.f2480c != null) {
                        switch (a) {
                            case CONSUMABLE:
                                this.f2473c.f2478a.mo454a(c0585h, this.f2473c.f2480c);
                                return;
                            case ENTITLEMENT:
                            case SUBSCRIPTION:
                                this.f2473c.f2480c.mo1743a(c0585h);
                                return;
                            default:
                                throw new GdxPayException("Unsupported OfferType=" + this.f2473c.m1788a(str) + " for identifier=" + str);
                        }
                    }
                }
            });
            return;
        }
        throw new GdxPayException("Payment system must be installed to perform this action.");
    }

    public void purchaseRestore() {
        try {
            List d = this.f2478a.mo458d();
            C0676a c0676a = new C0676a(C0585h.class);
            for (int i = 0; i < d.size(); i++) {
                Object obj = (C0585h) d.get(i);
                if (OfferType.CONSUMABLE == m1788a(obj.f2527a)) {
                    this.f2478a.mo454a((C0585h) obj, this.f2480c);
                } else {
                    c0676a.m2296a(obj);
                }
            }
            if (this.f2480c != null) {
                this.f2480c.mo1745a((C0585h[]) c0676a.m2298a(c0676a.f3000a.getClass().getComponentType()));
            }
        } catch (GdxPayException e) {
            if (this.f2480c != null) {
                this.f2480c.mo1746b();
            }
        }
    }

    protected void runAsync(Runnable runnable) {
        new Thread(runnable).start();
    }

    public String storeName() {
        return "GooglePlay";
    }
}
