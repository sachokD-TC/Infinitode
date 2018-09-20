package com.prineside.tdi.waves.templates;

import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.enemies.Enemy.EnemyType;
import com.prineside.tdi.waves.EnemyGroup;
import com.prineside.tdi.waves.WaveTemplate;

public class ToxicOnly extends WaveTemplate {
    /* renamed from: a */
    public final int mo1844a(int i, float f) {
        if (f < 120.0f) {
            return 0;
        }
        int i2 = ((int) ((f - 120.0f) / 20.0f)) + 1;
        if (i2 > 5) {
            i2 = 5;
        }
        if (i2 >= 5) {
            i2 -= (int) ((f - 240.0f) / 40.0f);
            if (i2 < 0) {
                return 0;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public final C0676a<EnemyGroup> mo1845a(float f) {
        C0676a<EnemyGroup> c0676a = new C0676a();
        c0676a.m2296a(new EnemyGroup(EnemyType.TOXIC, 1.0f, 4.1f + ((float) Math.pow(((double) f) * 0.49d, 1.6699999570846558d)), ((int) Math.pow(((double) f) * 0.55d, 0.62d)) + 7, 0.0f, 0.65f, 3.5f + ((float) Math.pow(((double) f) * 0.94d, 0.55d))));
        return c0676a;
    }

    /* renamed from: b */
    public final String mo1846b() {
        return null;
    }
}
