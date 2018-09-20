package com.badlogic.gdx.pay.android;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.badlogic.gdx.C0280i;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.android.AndroidEventListener;
import com.badlogic.gdx.pay.C0560d;
import com.badlogic.gdx.pay.C0584g;

public class IAP implements AndroidEventListener, C0280i {
    public IAP(Activity activity, int i) {
        Class cls;
        try {
            cls = Class.forName("com.badlogic.gdx.pay.android.googleplay.AndroidGooglePlayPurchaseManager");
            if (((Boolean) cls.getMethod("isRunningViaGooglePlay", new Class[]{Activity.class}).invoke(cls, new Object[]{activity})).booleanValue()) {
                C0584g.m1870a((C0560d) cls.getConstructor(new Class[]{Activity.class, Integer.TYPE}).newInstance(new Object[]{activity, Integer.valueOf(i)}));
                return;
            }
        } catch (Throwable e) {
            Log.d("GdxPay/IAP", "Failed to locate purchase manager for GooglePlay (gdx-pay-android-googleplay.jar file not installed)", e);
        }
        try {
            C0584g.m1870a((C0560d) Class.forName("com.badlogic.gdx.pay.android.openiab.PurchaseManagerAndroidOpenIAB").getConstructor(new Class[]{Activity.class, Integer.TYPE}).newInstance(new Object[]{activity, Integer.valueOf(i)}));
        } catch (Throwable e2) {
            Log.d("GdxPay/IAP", "Failed to locate purchase manager for OpenIAB-IAP (gdx-pay-android-openiab.jar file not installed)", e2);
        }
        try {
            cls = Class.forName("com.badlogic.gdx.pay.android.ouya.PurchaseManagerAndroidOUYA");
            if (((Boolean) cls.getMethod("isRunningOnOUYAHardware", new Class[0]).invoke(cls, new Object[0])).booleanValue()) {
                C0584g.m1870a((C0560d) cls.getConstructor(new Class[]{Activity.class, Integer.TYPE}).newInstance(new Object[]{activity, Integer.valueOf(i)}));
            }
        } catch (Throwable e22) {
            Log.d("GdxPay/IAP", "Failed to locate purchase manager for OUYA-IAP (gdx-pay-android-ouya.jar file not installed)", e22);
        }
    }

    /* renamed from: a */
    private static Class<?> m1776a(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e) {
            return null;
        }
    }

    public static void setup() {
        Activity activity = null;
        try {
            if (Gdx.app instanceof Activity) {
                activity = (Activity) Gdx.app;
            } else {
                Class a = m1776a("android.support.v4.app.Fragment");
                if (a == null || !a.isAssignableFrom(Gdx.app.getClass())) {
                    a = m1776a("android.app.Fragment");
                    if (a != null && a.isAssignableFrom(Gdx.app.getClass())) {
                        activity = (Activity) a.getMethod("getActivity", new Class[0]).invoke(Gdx.app, new Object[0]);
                    }
                } else {
                    activity = (Activity) a.getMethod("getActivity", new Class[0]).invoke(Gdx.app, new Object[0]);
                }
            }
            if (activity == null) {
                throw new RuntimeException("Can't find your gdx activity to instantiate Android IAP. Looks like you have implemented AndroidApplication without using Activity or Fragment classes or Activity is not available at the moment");
            }
            Gdx.app.addLifecycleListener(new IAP(activity, 1032));
            Gdx.app.getClass().getMethod("addAndroidEventListener", new Class[]{AndroidEventListener.class}).invoke(Gdx.app, new Object[]{r1});
            Gdx.app.log("GdxPay/IAP", "IAP: gdx-pay successfully instantiated.");
        } catch (Throwable e) {
            Gdx.app.log("GdxPay/IAP", "IAP: Error creating IAP for Android.", e);
        }
    }

    public void dispose() {
        C0584g.m1875c();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C0560d a = C0584g.m1869a();
        if (a != null) {
            try {
                a.getClass().getMethod("onActivityResult", new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}).invoke(a, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent});
            } catch (Throwable e) {
                Log.d("GdxPay/IAP", "Failed to invoke onActivityResult(...) on purchase manager.", e);
            }
        }
    }

    public void pause() {
    }

    public void resume() {
    }
}
