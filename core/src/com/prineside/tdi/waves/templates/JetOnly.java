package com.prineside.tdi.waves.templates;

import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.enemies.Enemy.EnemyType;
import com.prineside.tdi.waves.EnemyGroup;
import com.prineside.tdi.waves.WaveTemplate;

public class JetOnly extends WaveTemplate {
    /* renamed from: a */
    public final int mo1844a(int i, float f) {
        if (f < 75.0f) {
            return 0;
        }
        int i2 = ((int) (f / 70.0f)) + 1;
        return i2 <= 5 ? i2 : 5;
    }

    /* renamed from: a */
    public final C0676a<EnemyGroup> mo1845a(float f) {
        C0676a<EnemyGroup> c0676a = new C0676a();
        c0676a.m2296a(new EnemyGroup(EnemyType.JET, 1.25f, 1.7f + ((float) Math.pow(((double) f) * 0.21d, 1.7100000381469727d)), ((int) Math.pow((double) (f / 10.0f), 0.7d)) + 6, 0.0f, 0.5f, 4.0f + ((float) Math.pow((double) f, 0.6d))));
        return c0676a;
    }

    /* renamed from: b */
    public final String mo1846b() {
        return null;
    }
}
