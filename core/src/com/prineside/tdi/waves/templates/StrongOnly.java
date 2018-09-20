package com.prineside.tdi.waves.templates;

import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.enemies.Enemy.EnemyType;
import com.prineside.tdi.waves.EnemyGroup;
import com.prineside.tdi.waves.WaveTemplate;

public class StrongOnly extends WaveTemplate {
    /* renamed from: a */
    public final int mo1844a(int i, float f) {
        if (f < 15.0f) {
            return 0;
        }
        int i2 = ((int) (f / 15.0f)) + 1;
        return i2 <= 4 ? i2 : 4;
    }

    /* renamed from: a */
    public final C0676a<EnemyGroup> mo1845a(float f) {
        C0676a<EnemyGroup> c0676a = new C0676a();
        c0676a.m2296a(new EnemyGroup(EnemyType.STRONG, 0.85f, 8.2f + ((float) Math.pow(((double) f) * 0.69d, 1.7000000476837158d)), ((int) Math.pow(((double) f) * 0.4d, 0.65d)) + 5, 0.0f, 0.75f, 8.0f + ((float) Math.pow((double) (2.0f * f), 0.6d))));
        return c0676a;
    }

    /* renamed from: b */
    public final String mo1846b() {
        return null;
    }
}
