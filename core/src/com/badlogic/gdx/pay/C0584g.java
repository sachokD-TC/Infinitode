package com.badlogic.gdx.pay;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.reflect.C0713a;

/* renamed from: com.badlogic.gdx.pay.g */
public final class C0584g {
    /* renamed from: a */
    private static C0560d f2526a = null;

    /* renamed from: a */
    public static C0560d m1869a() {
        if (f2526a == null) {
            try {
                if (Gdx.app.getType() == ApplicationType.iOS) {
                    try {
                        f2526a = (C0560d) C0713a.m2494a(C0713a.m2493a("com.badlogic.gdx.pay.ios.apple.PurchaseManageriOSApple"));
                        Gdx.app.log("IAP", "IAP: gdx-pay successfully instantiated.");
                    } catch (Throwable e) {
                        Gdx.app.log("IAP", "IAP: Error creating IAP for iOS (are the gdx-pay**.jar files installed?).", e);
                    }
                } else if (Gdx.app.getType() == ApplicationType.Android) {
                    try {
                        C0713a.m2492a(C0713a.m2493a("com.badlogic.gdx.pay.android.IAP"), "setup", new Class[0]).m2499a(new Object[0]);
                    } catch (Throwable e2) {
                        Gdx.app.log("IAP", "IAP: Error creating IAP for Android (are the gdx-pay**.jar files installed?).", e2);
                    }
                } else {
                    Gdx.app.log("IAP", "IAP: gdx-pay not instantiated via reflection.");
                }
            } catch (Exception e3) {
            }
        }
        return f2526a;
    }

    /* renamed from: a */
    public static void m1870a(C0560d c0560d) {
        f2526a = c0560d;
    }

    /* renamed from: a */
    public static void m1871a(C0583f c0583f, C0582e c0582e) {
        if (C0584g.m1874b()) {
            f2526a.install(c0583f, c0582e, true);
        } else {
            c0583f.mo1744a(new RuntimeException("No purchase manager was available."));
        }
    }

    /* renamed from: a */
    public static void m1872a(String str) {
        if (C0584g.m1874b()) {
            f2526a.purchase(str);
            return;
        }
        throw new RuntimeException("No purchase manager was found.");
    }

    /* renamed from: b */
    public static C0552a m1873b(String str) {
        if (C0584g.m1874b()) {
            return f2526a.getInformation(str);
        }
        throw new RuntimeException("No purchase manager was found.");
    }

    /* renamed from: b */
    public static boolean m1874b() {
        return C0584g.m1869a() != null;
    }

    /* renamed from: c */
    public static void m1875c() {
        if (f2526a != null) {
            f2526a.dispose();
            f2526a = null;
        }
    }

    /* renamed from: d */
    public static void m1876d() {
        if (C0584g.m1874b()) {
            f2526a.purchaseRestore();
            return;
        }
        throw new RuntimeException("No purchase manager was found.");
    }

    /* renamed from: e */
    public static void m1877e() {
        if (f2526a != null) {
            C0584g.m1875c();
        }
    }
}
