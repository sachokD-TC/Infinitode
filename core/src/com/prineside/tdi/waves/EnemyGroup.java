package com.prineside.tdi.waves;

import com.prineside.tdi.enemies.Enemy.EnemyType;

public class EnemyGroup {
    /* renamed from: a */
    public EnemyType f8666a;
    /* renamed from: b */
    public float f8667b;
    /* renamed from: c */
    public float f8668c;
    /* renamed from: d */
    public float f8669d;
    /* renamed from: e */
    public float f8670e;
    /* renamed from: f */
    public float f8671f;
    /* renamed from: g */
    public float f8672g = 1.0f;
    /* renamed from: h */
    public int f8673h;
    /* renamed from: i */
    public int f8674i = 0;

    public EnemyGroup(EnemyType enemyType, float f, float f2, int i, float f3, float f4, float f5) {
        this.f8666a = enemyType;
        this.f8667b = f;
        this.f8668c = f2;
        this.f8673h = i;
        this.f8669d = f3;
        this.f8670e = f4;
        this.f8671f = f5;
    }

    public EnemyGroup(EnemyType enemyType, float f, float f2, int i, float f3, float f4, float f5, float f6) {
        this.f8666a = enemyType;
        this.f8667b = f;
        this.f8668c = f2;
        this.f8673h = i;
        this.f8669d = f3;
        this.f8670e = f4;
        this.f8671f = f5;
        this.f8672g = f6;
    }
}
