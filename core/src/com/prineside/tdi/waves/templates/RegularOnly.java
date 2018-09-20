package com.prineside.tdi.waves.templates;

import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.enemies.Enemy.EnemyType;
import com.prineside.tdi.waves.EnemyGroup;
import com.prineside.tdi.waves.WaveTemplate;

public class RegularOnly extends WaveTemplate {
    /* renamed from: a */
    public final int mo1844a(int i, float f) {
        int i2 = (int) (10.0f - (f / 28.0f));
        if (i2 <= 0) {
            i2 = 1;
        }
        return f > 300.0f ? 0 : i2;
    }

    /* renamed from: a */
    public final C0676a<EnemyGroup> mo1845a(float f) {
        C0676a<EnemyGroup> c0676a = new C0676a();
        c0676a.m2296a(new EnemyGroup(EnemyType.REGULAR, 1.0f, 4.3f + ((float) Math.pow(((double) f) * 0.52d, 1.7000000476837158d)), ((int) Math.pow((double) f, 0.65d)) + 12, 0.0f, 0.5f, 3.5f + ((float) Math.pow((double) f, 0.55d))));
        return c0676a;
    }

    /* renamed from: b */
    public final String mo1846b() {
        return null;
    }
}
