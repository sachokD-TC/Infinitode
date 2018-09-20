package com.badlogic.gdx.backends.android;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.p014b.C0277a;
import com.badlogic.gdx.p014b.C0277a.C0276a;

/* renamed from: com.badlogic.gdx.backends.android.p */
public final class C0348p implements OnCompletionListener, C0277a {
    /* renamed from: a */
    MediaPlayer f1259a;
    /* renamed from: b */
    boolean f1260b = true;
    /* renamed from: c */
    protected boolean f1261c = false;
    /* renamed from: d */
    protected C0276a f1262d;
    /* renamed from: e */
    private final C0313d f1263e;
    /* renamed from: f */
    private float f1264f = 1.0f;

    /* renamed from: com.badlogic.gdx.backends.android.p$1 */
    class C03471 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0348p f1258a;

        C03471(C0348p c0348p) {
            this.f1258a = c0348p;
        }

        public final void run() {
        }
    }

    C0348p(C0313d c0313d, MediaPlayer mediaPlayer) {
        this.f1263e = c0313d;
        this.f1259a = mediaPlayer;
        this.f1262d = null;
        this.f1259a.setOnCompletionListener(this);
    }

    /* renamed from: a */
    public final boolean m989a() {
        boolean z = false;
        if (this.f1259a != null) {
            try {
                z = this.f1259a.isPlaying();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void dispose() {
        if (this.f1259a != null) {
            try {
                this.f1259a.release();
                this.f1259a = null;
                this.f1262d = null;
                synchronized (this.f1263e.f1114a) {
                    this.f1263e.f1114a.remove(this);
                }
            } catch (Throwable th) {
                this.f1259a = null;
                this.f1262d = null;
                synchronized (this.f1263e.f1114a) {
                    this.f1263e.f1114a.remove(this);
                }
            }
        }
    }

    /* renamed from: c */
    public final void m991c() {
        if (this.f1259a != null) {
            try {
                if (this.f1259a.isPlaying()) {
                    this.f1259a.pause();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f1261c = false;
        }
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f1262d != null) {
            Gdx.app.postRunnable(new C03471(this));
        }
    }
}
