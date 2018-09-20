package com.badlogic.gdx.backends.android;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.badlogic.gdx.C0350j;
import com.badlogic.gdx.C0350j.C0516a;
import com.badlogic.gdx.C0350j.C0517c;
import com.badlogic.gdx.p018e.C0376c;
import com.badlogic.gdx.p018e.C0376c.C03731;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map.Entry;

/* renamed from: com.badlogic.gdx.backends.android.q */
public final class C0351q implements C0350j {
    /* renamed from: a */
    final C0283a f1267a;
    /* renamed from: b */
    C0376c f1268b = new C0376c();

    public C0351q(C0283a c0283a) {
        this.f1267a = c0283a;
    }

    /* renamed from: a */
    public final void mo313a(C0516a c0516a, C0517c c0517c) {
        boolean z = true;
        C0376c c0376c = this.f1268b;
        if (c0516a.f2304b == null) {
            c0517c.mo1741a(new GdxRuntimeException("can't process a HTTP request without URL set"));
            return;
        }
        try {
            URL url;
            String str = c0516a.f2303a;
            if (str.equalsIgnoreCase("GET")) {
                String str2 = "";
                String str3 = c0516a.f2307e;
                str3 = (str3 == null || "".equals(str3)) ? str2 : "?" + str3;
                url = new URL(c0516a.f2304b + str3);
            } else {
                url = new URL(c0516a.f2304b);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            if (!(str.equalsIgnoreCase("POST") || str.equalsIgnoreCase("PUT"))) {
                z = false;
            }
            httpURLConnection.setDoOutput(z);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod(str);
            HttpURLConnection.setFollowRedirects(c0516a.f2309g);
            c0376c.m1080a(c0516a, c0517c, httpURLConnection);
            for (Entry entry : c0516a.f2305c.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(c0516a.f2306d);
            httpURLConnection.setReadTimeout(c0516a.f2306d);
            c0376c.f1348a.m2284a(new C03731(c0376c, z, c0516a, httpURLConnection, c0517c));
        } catch (Throwable e) {
            c0517c.mo1741a(e);
        } finally {
            c0376c.m1079a(c0516a);
        }
    }

    /* renamed from: a */
    public final boolean mo314a(String str) {
        final Uri parse = Uri.parse(str);
        if (this.f1267a.getContext().getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", parse), 65536) == null) {
            return false;
        }
        this.f1267a.runOnUiThread(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ C0351q f1266b;

            public final void run() {
                Intent intent = new Intent("android.intent.action.VIEW", parse);
                if (!(this.f1266b.f1267a.getContext() instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                this.f1266b.f1267a.startActivity(intent);
            }
        });
        return true;
    }
}
