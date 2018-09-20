package com.prineside.tdi.waves.templates;

import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.enemies.Enemy.EnemyType;
import com.prineside.tdi.waves.EnemyGroup;
import com.prineside.tdi.waves.WaveTemplate;

public class LightOnly extends WaveTemplate {
    /* renamed from: a */
    public final int mo1844a(int i, float f) {
        if (f < 40.0f) {
            return 0;
        }
        int i2 = ((int) (f / 35.0f)) + 1;
        return i2 <= 5 ? i2 : 5;
    }

    /* renamed from: a */
    public final C0676a<EnemyGroup> mo1845a(float f) {
        C0676a<EnemyGroup> c0676a = new C0676a();
        c0676a.m2296a(new EnemyGroup(EnemyType.LIGHT, 1.05f, 4.1f + ((float) Math.pow(((double) f) * 0.5d, 1.6799999475479126d)), ((int) Math.pow((double) f, 0.6d)) + 10, 0.0f, 0.4f, 4.0f + ((float) Math.pow(((double) f) * 0.95d, 0.55d))));
        return c0676a;
    }

    /* renamed from: b */
    public final String mo1846b() {
        return null;
    }
}
