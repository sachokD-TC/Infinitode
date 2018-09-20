package com.badlogic.gdx.backends.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout.LayoutParams;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.C0279b;
import com.badlogic.gdx.C0280i;
import com.badlogic.gdx.C0312c;
import com.badlogic.gdx.C0326e;
import com.badlogic.gdx.C0350j;
import com.badlogic.gdx.C0353k;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.android.p015a.C0286a;
import com.badlogic.gdx.utils.C0314e;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0690i;
import com.badlogic.gdx.utils.C0728z;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.lang.reflect.Method;

public class AndroidApplication extends Activity implements C0283a {
    /* renamed from: a */
    private final C0676a<AndroidEventListener> f992a = new C0676a();
    protected C0279b applicationLogger;
    protected C0313d audio;
    /* renamed from: b */
    private int f993b = -1;
    /* renamed from: c */
    private boolean f994c = false;
    protected C0315e clipboard;
    protected final C0676a<Runnable> executedRunnables = new C0676a();
    protected C0318g files;
    protected boolean firstResume = true;
    protected C0327j graphics;
    public Handler handler;
    protected boolean hideStatusBar = false;
    protected C0341k input;
    protected final C0728z<C0280i> lifecycleListeners = new C0728z(C0280i.class, (byte) 0);
    protected ApplicationListener listener;
    protected int logLevel = 2;
    protected C0351q net;
    protected final C0676a<Runnable> runnables = new C0676a();
    protected boolean useImmersiveMode = false;

    /* renamed from: com.badlogic.gdx.backends.android.AndroidApplication$1 */
    class C02811 implements C0280i {
        /* renamed from: a */
        final /* synthetic */ AndroidApplication f990a;

        C02811(AndroidApplication androidApplication) {
            this.f990a = androidApplication;
        }

        public final void dispose() {
            this.f990a.audio.m884c();
        }

        public final void pause() {
            this.f990a.audio.m881a();
        }

        public final void resume() {
        }
    }

    /* renamed from: com.badlogic.gdx.backends.android.AndroidApplication$2 */
    class C02822 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ AndroidApplication f991a;

        C02822(AndroidApplication androidApplication) {
            this.f991a = androidApplication;
        }

        public final void run() {
            this.f991a.finish();
        }
    }

    static {
        C0690i.m2409a();
    }

    /* renamed from: a */
    private void m817a(ApplicationListener applicationListener, C0310b c0310b, boolean z) {
        if (getVersion() < 8) {
            throw new GdxRuntimeException("LibGDX requires Android API Level 8 or later.");
        }
        setApplicationLogger(new C0311c());
        this.graphics = new C0327j(this, c0310b, c0310b.f1109r == null ? new C0286a() : c0310b.f1109r);
        this.input = C0342l.m981a(this, this, this.graphics.f1148b, c0310b);
        this.audio = new C0313d(this, c0310b);
        getFilesDir();
        this.files = new C0318g(getAssets(), getFilesDir().getAbsolutePath());
        this.net = new C0351q(this);
        this.listener = applicationListener;
        this.handler = new Handler();
        this.useImmersiveMode = c0310b.f1111t;
        this.hideStatusBar = c0310b.f1106o;
        this.clipboard = new C0315e(this);
        addLifecycleListener(new C02811(this));
        Gdx.app = this;
        Gdx.input = getInput();
        Gdx.audio = getAudio();
        Gdx.files = getFiles();
        Gdx.graphics = getGraphics();
        Gdx.net = getNet();
        if (!z) {
            try {
                requestWindowFeature(1);
            } catch (Throwable e) {
                log("AndroidApplication", "Content already displayed, cannot request FEATURE_NO_TITLE", e);
            }
            getWindow().setFlags(1024, 1024);
            getWindow().clearFlags(2048);
            setContentView(this.graphics.f1148b, createLayoutParams());
        }
        createWakeLock(c0310b.f1105n);
        hideStatusBar(this.hideStatusBar);
        useImmersiveMode(this.useImmersiveMode);
        if (this.useImmersiveMode && getVersion() >= 19) {
            try {
                Class cls = Class.forName("com.badlogic.gdx.backends.android.v");
                cls.getDeclaredMethod("createListener", new Class[]{C0283a.class}).invoke(cls.newInstance(), new Object[]{this});
            } catch (Throwable e2) {
                log("AndroidApplication", "Failed to create AndroidVisibilityListener", e2);
            }
        }
    }

    public void addAndroidEventListener(AndroidEventListener androidEventListener) {
        synchronized (this.f992a) {
            this.f992a.m2296a((Object) androidEventListener);
        }
    }

    public void addLifecycleListener(C0280i c0280i) {
        synchronized (this.lifecycleListeners) {
            this.lifecycleListeners.m2296a((Object) c0280i);
        }
    }

    protected LayoutParams createLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    protected void createWakeLock(boolean z) {
        if (z) {
            getWindow().addFlags(128);
        }
    }

    public void debug(String str, String str2) {
        if (this.logLevel >= 3) {
            getApplicationLogger().mo261c(str, str2);
        }
    }

    public void debug(String str, String str2, Throwable th) {
        if (this.logLevel >= 3) {
            getApplicationLogger().mo262c(str, str2, th);
        }
    }

    public void error(String str, String str2) {
        if (this.logLevel > 0) {
            getApplicationLogger().mo259b(str, str2);
        }
    }

    public void error(String str, String str2, Throwable th) {
        if (this.logLevel > 0) {
            getApplicationLogger().mo260b(str, str2, th);
        }
    }

    public void exit() {
        this.handler.post(new C02822(this));
    }

    public ApplicationListener getApplicationListener() {
        return this.listener;
    }

    public C0279b getApplicationLogger() {
        return this.applicationLogger;
    }

    public Window getApplicationWindow() {
        return getWindow();
    }

    public C0312c getAudio() {
        return this.audio;
    }

    public C0314e getClipboard() {
        return this.clipboard;
    }

    public Context getContext() {
        return this;
    }

    public C0676a<Runnable> getExecutedRunnables() {
        return this.executedRunnables;
    }

    public Files getFiles() {
        return this.files;
    }

    public C0326e getGraphics() {
        return this.graphics;
    }

    public Handler getHandler() {
        return this.handler;
    }

    public C0341k getInput() {
        return this.input;
    }

    public long getJavaHeap() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    public C0728z<C0280i> getLifecycleListeners() {
        return this.lifecycleListeners;
    }

    public int getLogLevel() {
        return this.logLevel;
    }

    public long getNativeHeap() {
        return Debug.getNativeHeapAllocatedSize();
    }

    public C0350j getNet() {
        return this.net;
    }

    public C0353k getPreferences(String str) {
        return new C0354s(getSharedPreferences(str, 0));
    }

    public C0676a<Runnable> getRunnables() {
        return this.runnables;
    }

    public ApplicationType getType() {
        return ApplicationType.Android;
    }

    public int getVersion() {
        return VERSION.SDK_INT;
    }

    protected void hideStatusBar(boolean z) {
        if (z && getVersion() >= 11) {
            View decorView = getWindow().getDecorView();
            try {
                Method method = View.class.getMethod("setSystemUiVisibility", new Class[]{Integer.TYPE});
                if (getVersion() <= 13) {
                    method.invoke(decorView, new Object[]{Integer.valueOf(0)});
                }
                method.invoke(decorView, new Object[]{Integer.valueOf(1)});
            } catch (Throwable e) {
                log("AndroidApplication", "Can't hide status bar", e);
            }
        }
    }

    public void initialize(ApplicationListener applicationListener) {
        initialize(applicationListener, new C0310b());
    }

    public void initialize(ApplicationListener applicationListener, C0310b c0310b) {
        m817a(applicationListener, c0310b, false);
    }

    public View initializeForView(ApplicationListener applicationListener) {
        return initializeForView(applicationListener, new C0310b());
    }

    public View initializeForView(ApplicationListener applicationListener, C0310b c0310b) {
        m817a(applicationListener, c0310b, true);
        return this.graphics.f1148b;
    }

    public void log(String str, String str2) {
        if (this.logLevel >= 2) {
            getApplicationLogger().mo257a(str, str2);
        }
    }

    public void log(String str, String str2, Throwable th) {
        if (this.logLevel >= 2) {
            getApplicationLogger().mo258a(str, str2, th);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        synchronized (this.f992a) {
            for (int i3 = 0; i3 < this.f992a.f3001b; i3++) {
                ((AndroidEventListener) this.f992a.m2291a(i3)).onActivityResult(i, i2, intent);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        boolean z = true;
        super.onConfigurationChanged(configuration);
        if (configuration.hardKeyboardHidden != 1) {
            z = false;
        }
        this.input.f1251x = z;
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    protected void onPause() {
        boolean z = this.graphics.f1170x;
        boolean z2 = C0327j.f1141a;
        C0327j.f1141a = true;
        this.graphics.m944a(true);
        this.graphics.m958m();
        this.input.m979f();
        if (isFinishing()) {
            this.graphics.m960o();
            this.graphics.m959n();
        }
        C0327j.f1141a = z2;
        this.graphics.m944a(z);
        this.graphics.m955j();
        super.onPause();
    }

    protected void onResume() {
        Gdx.app = this;
        Gdx.input = getInput();
        Gdx.audio = getAudio();
        Gdx.files = getFiles();
        Gdx.graphics = getGraphics();
        Gdx.net = getNet();
        this.input.m980g();
        if (this.graphics != null) {
            this.graphics.m956k();
        }
        if (this.firstResume) {
            this.firstResume = false;
        } else {
            this.graphics.m957l();
        }
        this.f994c = true;
        if (this.f993b == 1 || this.f993b == -1) {
            this.audio.m883b();
            this.f994c = false;
        }
        super.onResume();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        useImmersiveMode(this.useImmersiveMode);
        hideStatusBar(this.hideStatusBar);
        if (z) {
            this.f993b = 1;
            if (this.f994c) {
                this.audio.m883b();
                this.f994c = false;
                return;
            }
            return;
        }
        this.f993b = 0;
    }

    public void postRunnable(Runnable runnable) {
        synchronized (this.runnables) {
            this.runnables.m2296a((Object) runnable);
            Gdx.graphics.mo300i();
        }
    }

    public void removeAndroidEventListener(AndroidEventListener androidEventListener) {
        synchronized (this.f992a) {
            this.f992a.mo529b((Object) androidEventListener, true);
        }
    }

    public void removeLifecycleListener(C0280i c0280i) {
        synchronized (this.lifecycleListeners) {
            this.lifecycleListeners.mo529b((Object) c0280i, true);
        }
    }

    public void setApplicationLogger(C0279b c0279b) {
        this.applicationLogger = c0279b;
    }

    public void setLogLevel(int i) {
        this.logLevel = i;
    }

    @TargetApi(19)
    public void useImmersiveMode(boolean z) {
        if (z && getVersion() >= 19) {
            View decorView = getWindow().getDecorView();
            try {
                View.class.getMethod("setSystemUiVisibility", new Class[]{Integer.TYPE}).invoke(decorView, new Object[]{Integer.valueOf(5894)});
            } catch (Throwable e) {
                log("AndroidApplication", "Can't set immersive mode", e);
            }
        }
    }
}
