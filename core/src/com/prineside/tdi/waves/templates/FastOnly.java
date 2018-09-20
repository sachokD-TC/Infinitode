package com.prineside.tdi.waves.templates;

import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.enemies.Enemy.EnemyType;
import com.prineside.tdi.waves.EnemyGroup;
import com.prineside.tdi.waves.WaveTemplate;

public class FastOnly extends WaveTemplate {
    /* renamed from: a */
    public final int mo1844a(int i, float f) {
        if (f < 7.0f) {
            return 0;
        }
        int i2 = ((int) (f / 10.0f)) + 1;
        return i2 <= 5 ? i2 : 5;
    }

    /* renamed from: a */
    public final C0676a<EnemyGroup> mo1845a(float f) {
        C0676a<EnemyGroup> c0676a = new C0676a();
        float pow = 2.95f + ((float) Math.pow(((double) f) * 0.45d, 1.6950000524520874d));
        c0676a.m2296a(new EnemyGroup(EnemyType.FAST, ((float) Math.sqrt(Math.pow((double) (f / 1500.0f), 1.25d))) + 1.4f, pow, ((int) Math.pow((double) (0.8f * f), 0.65d)) + 10, 0.0f, 0.6f, 4.0f + ((float) Math.pow((double) f, 0.55d))));
        return c0676a;
    }

    /* renamed from: b */
    public final String mo1846b() {
        return null;
    }
}
