package com.prineside.tdi;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.p014b.C0278b;
import com.badlogic.gdx.utils.C0710q;
import com.prineside.tdi.utility.FastBadRandom;

public class Sound {
    /* renamed from: a */
    public static int f6839a = 44100;
    /* renamed from: b */
    private static final float[] f6840b = new float[Type.values().length];
    /* renamed from: c */
    private static final float[] f6841c = new float[Type.values().length];
    /* renamed from: d */
    private static final boolean[] f6842d = new boolean[Type.values().length];
    /* renamed from: e */
    private static C0710q<Type, SoundConfig> f6843e;
    /* renamed from: f */
    private static long f6844f;

    /* renamed from: com.prineside.tdi.Sound$1 */
    static class C10791 implements Runnable {
        C10791() {
        }

        public final void run() {
            Game.game.logger.log("Sound", "Sound thread started");
            while (true) {
                int i = 0;
                while (i < Sound.f6842d.length) {
                    try {
                        if (Sound.f6842d[i]) {
                            long u = Game.game.m7478u();
                            Object obj = Type.f6837s[i];
                            SoundConfig soundConfig = (SoundConfig) Sound.f6843e.m2467a(obj);
                            if ((soundConfig.f6817e || u - Sound.f6844f > 35000 || u - soundConfig.f6816d > soundConfig.f6815c) && u - soundConfig.f6816d > soundConfig.f6814b) {
                                soundConfig.f6816d = u;
                                Sound.f6844f = u;
                                C0278b c0278b = ((SoundConfig) Sound.f6843e.m2467a(obj)).f6813a;
                                c0278b.mo323a(c0278b.mo322a(), Sound.f6841c[i], Sound.f6840b[i]);
                            }
                            Sound.f6842d[i] = false;
                        }
                        i++;
                    } catch (Exception e) {
                    }
                }
                try {
                    Thread.sleep(20);
                } catch (Throwable e2) {
                    Game.game.logger.log("Sound", "Sound thread stopped: " + e2.getMessage());
                    Game.game.logger.m7509a(e2);
                    return;
                }
            }
        }
    }

    public static class SoundConfig {
        /* renamed from: a */
        public C0278b f6813a;
        /* renamed from: b */
        public long f6814b;
        /* renamed from: c */
        public long f6815c;
        /* renamed from: d */
        public long f6816d;
        /* renamed from: e */
        public boolean f6817e;
        /* renamed from: f */
        public float f6818f;

        public SoundConfig(C0278b c0278b) {
            this.f6818f = 1.0f;
            this.f6817e = true;
            this.f6814b = 150000;
            this.f6815c = 300000;
            this.f6813a = c0278b;
            this.f6818f = 0.5f;
        }

        public SoundConfig(boolean z, long j, long j2, C0278b c0278b) {
            this.f6818f = 1.0f;
            this.f6817e = z;
            this.f6814b = j;
            this.f6815c = j2;
            this.f6813a = c0278b;
        }
    }

    public enum Type {
        CLICK,
        FAIL,
        NO,
        QUESTION,
        SINGLE,
        SUCCESS,
        UPGRADE,
        BUILD,
        COIN_LOUD,
        COIN_FAINT,
        SHOT_BASIC,
        SHOT_CANNON,
        SHOT_THUNDER,
        SHOT_GUN,
        SHOT_AIR,
        SHOT_BLAST,
        SHOT_SNIPER,
        SHOT_MISSILE;
        
        /* renamed from: s */
        public static final Type[] f6837s = null;

        static {
            f6837s = values();
        }
    }

    /* renamed from: a */
    public static void m7567a() {
        if (!(f6839a == 44100 || f6839a == 48000)) {
            f6839a = 44100;
        }
        C0710q c0710q = new C0710q();
        f6843e = c0710q;
        c0710q.mo542a(Type.CLICK, new SoundConfig(Gdx.audio.mo263a(Gdx.files.mo277b("sounds/click-" + f6839a + ".wav"))));
        f6843e.mo542a(Type.FAIL, new SoundConfig(true, 150000, 300000, Gdx.audio.mo263a(Gdx.files.mo277b("sounds/fail-" + f6839a + ".wav"))));
        f6843e.mo542a(Type.NO, new SoundConfig(true, 50000, 100000, Gdx.audio.mo263a(Gdx.files.mo277b("sounds/no-" + f6839a + ".wav"))));
        f6843e.mo542a(Type.QUESTION, new SoundConfig(true, 50000, 50000, Gdx.audio.mo263a(Gdx.files.mo277b("sounds/question-" + f6839a + ".wav"))));
        f6843e.mo542a(Type.SINGLE, new SoundConfig(true, 50000, 100000, Gdx.audio.mo263a(Gdx.files.mo277b("sounds/single-" + f6839a + ".wav"))));
        f6843e.mo542a(Type.SUCCESS, new SoundConfig(true, 50000, 100000, Gdx.audio.mo263a(Gdx.files.mo277b("sounds/success-" + f6839a + ".wav"))));
        f6843e.mo542a(Type.UPGRADE, new SoundConfig(true, 200000, 300000, Gdx.audio.mo263a(Gdx.files.mo277b("sounds/upgrade-" + f6839a + ".wav"))));
        f6843e.mo542a(Type.BUILD, new SoundConfig(true, 50000, 100000, Gdx.audio.mo263a(Gdx.files.mo277b("sounds/build-" + f6839a + ".wav"))));
        f6843e.mo542a(Type.COIN_FAINT, new SoundConfig(false, 300000, 500000, Gdx.audio.mo263a(Gdx.files.mo277b("sounds/coin-faint-" + f6839a + ".wav"))));
        f6843e.mo542a(Type.COIN_LOUD, new SoundConfig(false, 300000, 500000, Gdx.audio.mo263a(Gdx.files.mo277b("sounds/coin-loud-" + f6839a + ".wav"))));
        f6843e.mo542a(Type.SHOT_BASIC, new SoundConfig(false, 120000, 250000, Gdx.audio.mo263a(Gdx.files.mo277b("sounds/shot-basic-" + f6839a + ".wav"))));
        f6843e.mo542a(Type.SHOT_CANNON, new SoundConfig(false, 120000, 250000, Gdx.audio.mo263a(Gdx.files.mo277b("sounds/shot-cannon-" + f6839a + ".wav"))));
        f6843e.mo542a(Type.SHOT_THUNDER, new SoundConfig(true, 200000, 400000, Gdx.audio.mo263a(Gdx.files.mo277b("sounds/thunder-" + f6839a + ".wav"))));
        f6843e.mo542a(Type.SHOT_GUN, new SoundConfig(false, 120000, 250000, Gdx.audio.mo263a(Gdx.files.mo277b("sounds/shot-gun-" + f6839a + ".wav"))));
        f6843e.mo542a(Type.SHOT_AIR, new SoundConfig(false, 100000, 250000, Gdx.audio.mo263a(Gdx.files.mo277b("sounds/shot-air-" + f6839a + ".wav"))));
        f6843e.mo542a(Type.SHOT_BLAST, new SoundConfig(true, 150000, 300000, Gdx.audio.mo263a(Gdx.files.mo277b("sounds/shot-blast-" + f6839a + ".wav"))));
        f6843e.mo542a(Type.SHOT_SNIPER, new SoundConfig(false, 120000, 250000, Gdx.audio.mo263a(Gdx.files.mo277b("sounds/shot-sniper-" + f6839a + ".wav"))));
        f6843e.mo542a(Type.SHOT_MISSILE, new SoundConfig(true, 200000, 400000, Gdx.audio.mo263a(Gdx.files.mo277b("sounds/shot-missile-" + f6839a + ".wav"))));
        new Thread(new C10791()).start();
    }

    /* renamed from: a */
    public static void m7568a(float f, float f2) {
        m7570a(FastBadRandom.m8809b() < 0.5f ? Type.COIN_FAINT : Type.COIN_LOUD, f2, f);
    }

    /* renamed from: a */
    public static void m7569a(Type type) {
        m7570a(type, ((SoundConfig) f6843e.m2467a((Object) type)).f6818f, 0.0f);
    }

    /* renamed from: a */
    public static void m7570a(Type type, float f, float f2) {
        if (Game.game.f6580l) {
            int ordinal = type.ordinal();
            f6840b[ordinal] = f;
            f6841c[ordinal] = f2;
            f6842d[ordinal] = true;
        }
    }

    /* renamed from: b */
    public static void m7571b(Type type) {
        m7570a(type, 0.65f, 0.0f);
    }
}
