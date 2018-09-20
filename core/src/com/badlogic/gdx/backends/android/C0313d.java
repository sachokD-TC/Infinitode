package com.badlogic.gdx.backends.android;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import com.badlogic.gdx.C0312c;
import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.p014b.C0277a;
import com.badlogic.gdx.p014b.C0278b;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.badlogic.gdx.backends.android.d */
public final class C0313d implements C0312c {
    /* renamed from: a */
    protected final List<C0348p> f1114a = new ArrayList();
    /* renamed from: b */
    private final SoundPool f1115b;
    /* renamed from: c */
    private final AudioManager f1116c;

    public C0313d(Context context, C0310b c0310b) {
        if (c0310b.f1107p) {
            this.f1115b = null;
            this.f1116c = null;
            return;
        }
        this.f1115b = new SoundPool(c0310b.f1108q, 3, 100);
        this.f1116c = (AudioManager) context.getSystemService("audio");
        if (context instanceof Activity) {
            ((Activity) context).setVolumeControlStream(3);
        }
    }

    /* renamed from: a */
    public final C0278b mo263a(C0316a c0316a) {
        if (this.f1115b == null) {
            throw new GdxRuntimeException("Android audio is not enabled by the application config.");
        }
        C0317f c0317f = (C0317f) c0316a;
        if (c0317f.f1120b == FileType.Internal) {
            try {
                AssetFileDescriptor g = c0317f.mo273g();
                C0278b c0355t = new C0355t(this.f1115b, this.f1116c, this.f1115b.load(g, 1));
                g.close();
                return c0355t;
            } catch (Throwable e) {
                throw new GdxRuntimeException("Error loading audio file: " + c0316a + "\nNote: Internal audio files must be placed in the assets directory.", e);
            }
        }
        try {
            return new C0355t(this.f1115b, this.f1116c, this.f1115b.load(c0317f.mo272f().getPath(), 1));
        } catch (Throwable e2) {
            throw new GdxRuntimeException("Error loading audio file: " + c0316a, e2);
        }
    }

    /* renamed from: a */
    protected final void m881a() {
        if (this.f1115b != null) {
            synchronized (this.f1114a) {
                for (C0348p c0348p : this.f1114a) {
                    if (c0348p.m989a()) {
                        c0348p.m991c();
                        c0348p.f1261c = true;
                    } else {
                        c0348p.f1261c = false;
                    }
                }
            }
            this.f1115b.autoPause();
        }
    }

    /* renamed from: b */
    public final C0277a mo264b(C0316a c0316a) {
        if (this.f1115b == null) {
            throw new GdxRuntimeException("Android audio is not enabled by the application config.");
        }
        C0317f c0317f = (C0317f) c0316a;
        MediaPlayer mediaPlayer = new MediaPlayer();
        C0348p c0348p;
        if (c0317f.f1120b == FileType.Internal) {
            try {
                AssetFileDescriptor g = c0317f.mo273g();
                mediaPlayer.setDataSource(g.getFileDescriptor(), g.getStartOffset(), g.getLength());
                g.close();
                mediaPlayer.prepare();
                c0348p = new C0348p(this, mediaPlayer);
                synchronized (this.f1114a) {
                    this.f1114a.add(c0348p);
                }
                return c0348p;
            } catch (Throwable e) {
                throw new GdxRuntimeException("Error loading audio file: " + c0316a + "\nNote: Internal audio files must be placed in the assets directory.", e);
            }
        }
        try {
            mediaPlayer.setDataSource(c0317f.mo272f().getPath());
            mediaPlayer.prepare();
            c0348p = new C0348p(this, mediaPlayer);
            synchronized (this.f1114a) {
                this.f1114a.add(c0348p);
            }
            return c0348p;
        } catch (Throwable e2) {
            throw new GdxRuntimeException("Error loading audio file: " + c0316a, e2);
        }
    }

    /* renamed from: b */
    protected final void m883b() {
        if (this.f1115b != null) {
            synchronized (this.f1114a) {
                for (int i = 0; i < this.f1114a.size(); i++) {
                    if (((C0348p) this.f1114a.get(i)).f1261c) {
                        C0348p c0348p = (C0348p) this.f1114a.get(i);
                        if (c0348p.f1259a != null) {
                            try {
                                if (c0348p.f1259a.isPlaying()) {
                                    continue;
                                } else {
                                    try {
                                        if (!c0348p.f1260b) {
                                            c0348p.f1259a.prepare();
                                            c0348p.f1260b = true;
                                        }
                                        c0348p.f1259a.start();
                                    } catch (IllegalStateException e) {
                                        e.printStackTrace();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            this.f1115b.autoResume();
        }
    }

    /* renamed from: c */
    public final void m884c() {
        if (this.f1115b != null) {
            synchronized (this.f1114a) {
                Iterator it = new ArrayList(this.f1114a).iterator();
                while (it.hasNext()) {
                    ((C0348p) it.next()).dispose();
                }
            }
            this.f1115b.release();
        }
    }
}
