package com.badlogic.gdx.backends.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.WindowManager;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.C0279b;
import com.badlogic.gdx.C0280i;
import com.badlogic.gdx.C0312c;
import com.badlogic.gdx.C0326e;
import com.badlogic.gdx.C0350j;
import com.badlogic.gdx.C0353k;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.C0314e;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0690i;
import com.badlogic.gdx.utils.C0728z;

/* renamed from: com.badlogic.gdx.backends.android.h */
public final class C0321h extends Fragment implements C0283a {
    /* renamed from: a */
    protected C0327j f1127a;
    protected final C0676a<Runnable> aj;
    protected final C0676a<Runnable> ak;
    protected final C0728z<C0280i> al;
    public final C0676a<AndroidEventListener> am;
    protected int an;
    protected C0279b ao;
    protected C0320a ap;
    /* renamed from: b */
    protected C0341k f1128b;
    /* renamed from: c */
    protected C0313d f1129c;
    /* renamed from: d */
    protected C0318g f1130d;
    /* renamed from: e */
    protected C0351q f1131e;
    /* renamed from: f */
    protected C0315e f1132f;
    /* renamed from: g */
    protected ApplicationListener f1133g;
    /* renamed from: h */
    public Handler f1134h;
    /* renamed from: i */
    protected boolean f1135i;

    /* renamed from: com.badlogic.gdx.backends.android.h$1 */
    class C03191 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0321h f1126a;

        C03191(C0321h c0321h) {
            this.f1126a = c0321h;
        }

        public final void run() {
            C0320a c0320a = this.f1126a.ap;
        }
    }

    /* renamed from: com.badlogic.gdx.backends.android.h$a */
    public interface C0320a {
    }

    static {
        C0690i.m2409a();
    }

    /* renamed from: a */
    public final void mo17a() {
        super.mo17a();
        this.ap = null;
    }

    /* renamed from: a */
    public final void mo279a(int i, int i2, Intent intent) {
        super.mo279a(i, i2, intent);
        synchronized (this.am) {
            for (int i3 = 0; i3 < this.am.f3001b; i3++) {
                ((AndroidEventListener) this.am.m2291a(i3)).onActivityResult(i, i2, intent);
            }
        }
    }

    /* renamed from: a */
    public final void mo280a(Activity activity) {
        if (activity instanceof C0320a) {
            this.ap = (C0320a) activity;
        } else if (m35i() instanceof C0320a) {
            this.ap = (C0320a) m35i();
        } else if (m31f() instanceof C0320a) {
            this.ap = (C0320a) m31f();
        } else {
            throw new RuntimeException("Missing AndroidFragmentApplication.Callbacks. Please implement AndroidFragmentApplication.Callbacks on the parent activity, fragment or target fragment.");
        }
        super.mo280a(activity);
    }

    public final void addLifecycleListener(C0280i c0280i) {
        synchronized (this.al) {
            this.al.m2296a((Object) c0280i);
        }
    }

    public final void debug(String str, String str2) {
        if (this.an >= 3) {
            Log.d(str, str2);
        }
    }

    public final void debug(String str, String str2, Throwable th) {
        if (this.an >= 3) {
            Log.d(str, str2, th);
        }
    }

    public final void error(String str, String str2) {
        if (this.an > 0) {
            Log.e(str, str2);
        }
    }

    public final void error(String str, String str2, Throwable th) {
        if (this.an > 0) {
            Log.e(str, str2, th);
        }
    }

    public final void exit() {
        this.f1134h.post(new C03191(this));
    }

    public final ApplicationListener getApplicationListener() {
        return this.f1133g;
    }

    public final C0279b getApplicationLogger() {
        return this.ao;
    }

    public final C0312c getAudio() {
        return this.f1129c;
    }

    public final C0314e getClipboard() {
        return this.f1132f;
    }

    public final Context getContext() {
        return m33g();
    }

    public final C0676a<Runnable> getExecutedRunnables() {
        return this.ak;
    }

    public final Files getFiles() {
        return this.f1130d;
    }

    public final C0326e getGraphics() {
        return this.f1127a;
    }

    public final C0341k getInput() {
        return this.f1128b;
    }

    public final long getJavaHeap() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    public final C0728z<C0280i> getLifecycleListeners() {
        return this.al;
    }

    public final int getLogLevel() {
        return this.an;
    }

    public final long getNativeHeap() {
        return Debug.getNativeHeapAllocatedSize();
    }

    public final C0350j getNet() {
        return this.f1131e;
    }

    public final C0353k getPreferences(String str) {
        return new C0354s(m33g().getSharedPreferences(str, 0));
    }

    public final C0676a<Runnable> getRunnables() {
        return this.aj;
    }

    public final ApplicationType getType() {
        return ApplicationType.Android;
    }

    public final int getVersion() {
        return VERSION.SDK_INT;
    }

    public final WindowManager getWindowManager() {
        return (WindowManager) getContext().getSystemService("window");
    }

    public final void log(String str, String str2) {
        if (this.an >= 2) {
            Log.i(str, str2);
        }
    }

    public final void log(String str, String str2, Throwable th) {
        if (this.an >= 2) {
            Log.i(str, str2, th);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        boolean z = true;
        super.onConfigurationChanged(configuration);
        if (configuration.hardKeyboardHidden != 1) {
            z = false;
        }
        this.f1128b.f1251x = z;
    }

    public final void postRunnable(Runnable runnable) {
        synchronized (this.aj) {
            this.aj.m2296a((Object) runnable);
            Gdx.graphics.mo300i();
        }
    }

    /* renamed from: r */
    public final void mo283r() {
        Gdx.app = this;
        Gdx.input = getInput();
        Gdx.audio = getAudio();
        Gdx.files = getFiles();
        Gdx.graphics = getGraphics();
        Gdx.net = getNet();
        this.f1128b.m980g();
        if (this.f1127a != null) {
            this.f1127a.m956k();
        }
        if (this.f1135i) {
            this.f1135i = false;
        } else {
            this.f1127a.m957l();
        }
        super.mo283r();
    }

    public final void removeLifecycleListener(C0280i c0280i) {
        synchronized (this.al) {
            this.al.mo529b((Object) c0280i, true);
        }
    }

    public final void runOnUiThread(Runnable runnable) {
        m33g().runOnUiThread(runnable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: s */
    public final void mo285s() {
        /*
        r5 = this;
        r0 = 1;
        r1 = r5.f1127a;
        r2 = r1.f1170x;
        r3 = com.badlogic.gdx.backends.android.C0327j.f1141a;
        com.badlogic.gdx.backends.android.C0327j.f1141a = r0;
        r1 = r5.f1127a;
        r1.m944a(r0);
        r1 = r5.f1127a;
        r1.m958m();
        r1 = r5.f1128b;
        r1.m979f();
        r1 = r5.m37k();
        if (r1 != 0) goto L_0x0036;
    L_0x001e:
        r1 = r5.m35i();
    L_0x0022:
        if (r1 == 0) goto L_0x0055;
    L_0x0024:
        r4 = r1.m37k();
        if (r4 == 0) goto L_0x0050;
    L_0x002a:
        if (r0 != 0) goto L_0x0036;
    L_0x002c:
        r0 = r5.m33g();
        r0 = r0.isFinishing();
        if (r0 == 0) goto L_0x0040;
    L_0x0036:
        r0 = r5.f1127a;
        r0.m960o();
        r0 = r5.f1127a;
        r0.m959n();
    L_0x0040:
        com.badlogic.gdx.backends.android.C0327j.f1141a = r3;
        r0 = r5.f1127a;
        r0.m944a(r2);
        r0 = r5.f1127a;
        r0.m955j();
        super.mo285s();
        return;
    L_0x0050:
        r1 = r1.m35i();
        goto L_0x0022;
    L_0x0055:
        r0 = 0;
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.backends.android.h.s():void");
    }

    public final void setApplicationLogger(C0279b c0279b) {
        this.ao = c0279b;
    }

    public final void setLogLevel(int i) {
        this.an = i;
    }
}
