package com.prineside.tdi.waves.templates;

import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.enemies.Enemy.EnemyType;
import com.prineside.tdi.waves.EnemyGroup;
import com.prineside.tdi.waves.WaveTemplate;

public class DenseRegular extends WaveTemplate {
    /* renamed from: a */
    public final int mo1844a(int i, float f) {
        if (f < 20.0f) {
            return 0;
        }
        int i2 = (int) (1.0f + (f / 50.0f));
        return i2 <= 5 ? i2 : 5;
    }

    /* renamed from: a */
    public final C0676a<EnemyGroup> mo1845a(float f) {
        C0676a<EnemyGroup> c0676a = new C0676a();
        c0676a.m2296a(new EnemyGroup(EnemyType.REGULAR, 1.0f, 4.1f + ((float) Math.pow(((double) f) * 0.4d, 1.6699999570846558d)), ((int) Math.pow(((double) f) * 1.2d, 0.65d)) + 16, 0.0f, 0.25f, 2.0f + ((float) Math.pow((double) (f / 0.45f), 0.6d)), 0.75f));
        return c0676a;
    }

    /* renamed from: b */
    public final String mo1846b() {
        return null;
    }
}
