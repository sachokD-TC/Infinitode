package com.prineside.tdi.tiles;

import com.prineside.tdi.CameraController;
import com.prineside.tdi.CameraControllerListener;
import com.prineside.tdi.Map;
import com.prineside.tdi.towers.Tower;

public class TileVisibilityHandler implements CameraControllerListener {
    /* renamed from: a */
    private Map f7977a;
    /* renamed from: b */
    private Thread f7978b;
    /* renamed from: c */
    private Runnable f7979c;
    /* renamed from: d */
    private int f7980d;
    /* renamed from: e */
    private int f7981e;
    /* renamed from: f */
    private int f7982f;
    /* renamed from: g */
    private int f7983g;

    public TileVisibilityHandler(final Map map) {
        this.f7977a = map;
        this.f7979c = new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ TileVisibilityHandler f7976b;

            public void run() {
                float a = (float) (this.f7976b.f7982f - this.f7976b.f7980d);
                int i = 0;
                while (i < map.f6764h) {
                    if (!Thread.currentThread().isInterrupted()) {
                        for (int i2 = 0; i2 < map.f6765i; i2++) {
                            Tile tile = map.f6760d[i2][i];
                            boolean z = tile.f7969j >= this.f7976b.f7980d && tile.f7968i <= this.f7976b.f7982f && tile.f7967h >= this.f7976b.f7981e && tile.f7970k <= this.f7976b.f7983g;
                            tile.f7971l = z;
                            tile.f7972m = ((((float) (tile.f7965f - this.f7976b.f7980d)) / a) - 0.5f) * 2.0f;
                            if (tile.f7972m < -1.0f) {
                                tile.f7972m = -1.0f;
                            } else if (tile.f7972m > 1.0f) {
                                tile.f7972m = 1.0f;
                            }
                        }
                        i++;
                    } else {
                        return;
                    }
                }
                Tower.m8434e();
            }
        };
    }

    /* renamed from: a */
    public final void mo1799a(CameraController cameraController) {
        if (this.f7978b != null && this.f7978b.isAlive()) {
            this.f7978b.interrupt();
        }
        this.f7980d = cameraController.f6472c;
        this.f7982f = cameraController.f6473d;
        this.f7981e = cameraController.f6474e;
        this.f7983g = cameraController.f6475f;
        this.f7978b = new Thread(this.f7979c);
        this.f7978b.start();
    }
}
