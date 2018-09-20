package com.prineside.tdi.waves.templates;

import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.enemies.Enemy.EnemyType;
import com.prineside.tdi.waves.EnemyGroup;
import com.prineside.tdi.waves.WaveTemplate;

public class SuperBoss extends WaveTemplate {
    /* renamed from: a */
    public final int mo1844a(int i, float f) {
        return i % 100 == 0 ? 101 : 0;
    }

    /* renamed from: a */
    public final C0676a<EnemyGroup> mo1845a(float f) {
        C0676a<EnemyGroup> c0676a = new C0676a();
        c0676a.m2296a(new EnemyGroup(EnemyType.BOSS, 0.7f, 28.0f + ((float) Math.pow(((double) f) * 1.92d, 1.8300000429153442d)), 1, 0.0f, 0.5f, 100.0f + ((float) Math.pow((double) (70.0f * f), 0.75d)), 25.0f));
        return c0676a;
    }

    /* renamed from: b */
    public final String mo1846b() {
        return "[#F44336]Super Boss wave![]";
    }
}
