package com.badlogic.gdx.pay.android.googleplay.p031a;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidEventListener;
import com.badlogic.gdx.backends.android.C0321h;

/* renamed from: com.badlogic.gdx.pay.android.googleplay.a.a */
public interface C0561a {

    /* renamed from: com.badlogic.gdx.pay.android.googleplay.a.a$a */
    public static class C0562a implements C0561a {
        /* renamed from: a */
        private final AndroidApplication f2492a;

        public C0562a(AndroidApplication androidApplication) {
            this.f2492a = androidApplication;
        }

        /* renamed from: a */
        public final String mo442a() {
            return this.f2492a.getPackageName();
        }

        /* renamed from: a */
        public final void mo443a(IntentSender intentSender, int i, Intent intent) {
            this.f2492a.startIntentSenderForResult(intentSender, i, intent, 0, 0, 0);
        }

        /* renamed from: a */
        public final void mo444a(ServiceConnection serviceConnection) {
            this.f2492a.getContext().getApplicationContext().unbindService(serviceConnection);
        }

        /* renamed from: a */
        public final void mo445a(AndroidEventListener androidEventListener) {
            this.f2492a.addAndroidEventListener(androidEventListener);
        }

        /* renamed from: a */
        public final void mo446a(Runnable runnable) {
            this.f2492a.postRunnable(runnable);
        }

        /* renamed from: a */
        public final boolean mo447a(Intent intent, ServiceConnection serviceConnection) {
            return this.f2492a.getApplicationContext().bindService(intent, serviceConnection, 1);
        }

        /* renamed from: b */
        public final void mo448b(AndroidEventListener androidEventListener) {
            this.f2492a.removeAndroidEventListener(androidEventListener);
        }
    }

    /* renamed from: com.badlogic.gdx.pay.android.googleplay.a.a$b */
    public static class C0563b implements C0561a {
        /* renamed from: a */
        private Activity f2493a;
        /* renamed from: b */
        private final C0321h f2494b;

        public C0563b(Activity activity, C0321h c0321h) {
            this.f2493a = activity;
            this.f2494b = c0321h;
        }

        /* renamed from: a */
        public final String mo442a() {
            return this.f2493a.getPackageName();
        }

        /* renamed from: a */
        public final void mo443a(IntentSender intentSender, int i, Intent intent) {
            this.f2493a.startIntentSenderForResult(intentSender, i, intent, 0, 0, 0);
        }

        /* renamed from: a */
        public final void mo444a(ServiceConnection serviceConnection) {
            this.f2494b.getContext().getApplicationContext().unbindService(serviceConnection);
        }

        /* renamed from: a */
        public final void mo445a(AndroidEventListener androidEventListener) {
            C0321h c0321h = this.f2494b;
            synchronized (c0321h.am) {
                c0321h.am.m2296a((Object) androidEventListener);
            }
        }

        /* renamed from: a */
        public final void mo446a(Runnable runnable) {
            this.f2494b.postRunnable(runnable);
        }

        /* renamed from: a */
        public final boolean mo447a(Intent intent, ServiceConnection serviceConnection) {
            return this.f2493a.getApplicationContext().bindService(intent, serviceConnection, 1);
        }

        /* renamed from: b */
        public final void mo448b(AndroidEventListener androidEventListener) {
            C0321h c0321h = this.f2494b;
            synchronized (c0321h.am) {
                c0321h.am.mo529b((Object) androidEventListener, true);
            }
        }
    }

    /* renamed from: a */
    String mo442a();

    /* renamed from: a */
    void mo443a(IntentSender intentSender, int i, Intent intent);

    /* renamed from: a */
    void mo444a(ServiceConnection serviceConnection);

    /* renamed from: a */
    void mo445a(AndroidEventListener androidEventListener);

    /* renamed from: a */
    void mo446a(Runnable runnable);

    /* renamed from: a */
    boolean mo447a(Intent intent, ServiceConnection serviceConnection);

    /* renamed from: b */
    void mo448b(AndroidEventListener androidEventListener);
}
