package com.prineside.tdi.waves.templates;

import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.enemies.Enemy.EnemyType;
import com.prineside.tdi.waves.EnemyGroup;
import com.prineside.tdi.waves.WaveTemplate;

public class IcyOnly extends WaveTemplate {
    /* renamed from: a */
    public final int mo1844a(int i, float f) {
        if (f < 40.0f) {
            return 0;
        }
        int i2 = ((int) (f / 80.0f)) + 1;
        return i2 <= 4 ? i2 : 4;
    }

    /* renamed from: a */
    public final C0676a<EnemyGroup> mo1845a(float f) {
        C0676a<EnemyGroup> c0676a = new C0676a();
        c0676a.m2296a(new EnemyGroup(EnemyType.ICY, 0.9f, 5.4f + ((float) Math.pow(((double) f) * 0.59d, 1.5099999904632568d)), ((int) Math.pow(((double) f) * 1.5d, 0.7d)) + 24, 0.0f, 0.2f, 1.5f + ((float) Math.pow((double) (0.26f * f), 0.6d)), 0.5f));
        return c0676a;
    }

    /* renamed from: b */
    public final String mo1846b() {
        return null;
    }
}
