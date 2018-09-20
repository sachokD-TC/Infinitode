package com.prineside.tdi.waves.templates;

import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.enemies.Enemy.EnemyType;
import com.prineside.tdi.waves.EnemyGroup;
import com.prineside.tdi.waves.WaveTemplate;

public class Boss extends WaveTemplate {
    /* renamed from: a */
    public final int mo1844a(int i, float f) {
        return (i % 20 != 0 || i % 100 == 0) ? 0 : 101;
    }

    /* renamed from: a */
    public final C0676a<EnemyGroup> mo1845a(float f) {
        C0676a<EnemyGroup> c0676a = new C0676a();
        c0676a.m2296a(new EnemyGroup(EnemyType.ARMORED, 1.0f, 2.0f + ((float) Math.pow(((double) f) * 0.35d, 1.6799999475479126d)), ((int) Math.pow((double) (f / 12.0f), 0.6d)) + 2, 0.0f, 0.5f, 4.0f + ((float) Math.pow((double) f, 0.6d)), 2.0f));
        c0676a.m2296a(new EnemyGroup(EnemyType.FAST, 1.5f, 2.45f + ((float) Math.pow(((double) f) * 0.4d, 1.7000000476837158d)), ((int) Math.pow((double) (f / 8.0f), 0.6d)) + 3, 7.0f, 0.65f, 4.0f + ((float) Math.pow((double) f, 0.6d))));
        c0676a.m2296a(new EnemyGroup(EnemyType.FIGHTER, 0.95f, 10.0f + ((float) Math.pow(((double) f) * 1.2d, 1.75d)), 1, 1.0f, 0.5f, 24.0f + ((float) Math.pow((double) (5.0f * f), 0.6d)), 10.0f));
        return c0676a;
    }

    /* renamed from: b */
    public final String mo1846b() {
        return "[#F44336]Boss wave[]";
    }
}
