package com.badlogic.gdx.backends.android;

import android.media.AudioManager;
import android.media.SoundPool;
import com.badlogic.gdx.p014b.C0278b;
import com.badlogic.gdx.utils.C0692k;

/* renamed from: com.badlogic.gdx.backends.android.t */
final class C0355t implements C0278b {
    /* renamed from: a */
    final SoundPool f1274a;
    /* renamed from: b */
    final AudioManager f1275b;
    /* renamed from: c */
    final int f1276c;
    /* renamed from: d */
    final C0692k f1277d = new C0692k(8);

    C0355t(SoundPool soundPool, AudioManager audioManager, int i) {
        this.f1274a = soundPool;
        this.f1275b = audioManager;
        this.f1276c = i;
    }

    /* renamed from: a */
    public final long mo322a() {
        if (this.f1277d.f3091b == 8) {
            this.f1277d.m2417a();
        }
        int play = this.f1274a.play(this.f1276c, 1.0f, 1.0f, 1, 0, 1.0f);
        if (play == 0) {
            return -1;
        }
        this.f1277d.m2419a(0, play);
        return (long) play;
    }

    /* renamed from: a */
    public final void mo323a(long j, float f, float f2) {
        float abs;
        if (f < 0.0f) {
            abs = (1.0f - Math.abs(f)) * f2;
        } else if (f > 0.0f) {
            abs = f2;
            f2 = (1.0f - Math.abs(f)) * f2;
        } else {
            abs = f2;
        }
        this.f1274a.setVolume((int) j, f2, abs);
    }

    /* renamed from: b */
    public final void dispose() {
        this.f1274a.unload(this.f1276c);
    }
}
