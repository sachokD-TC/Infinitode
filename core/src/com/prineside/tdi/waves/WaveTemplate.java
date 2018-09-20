package com.prineside.tdi.waves;

import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.waves.templates.AirOnly;
import com.prineside.tdi.waves.templates.Boss;
import com.prineside.tdi.waves.templates.DenseRegular;
import com.prineside.tdi.waves.templates.FastOnly;
import com.prineside.tdi.waves.templates.IcyOnly;
import com.prineside.tdi.waves.templates.JetOnly;
import com.prineside.tdi.waves.templates.LightOnly;
import com.prineside.tdi.waves.templates.RegularOnly;
import com.prineside.tdi.waves.templates.StrongOnly;
import com.prineside.tdi.waves.templates.SuperBoss;
import com.prineside.tdi.waves.templates.ToxicOnly;

public abstract class WaveTemplate {
    /* renamed from: a */
    public static C0676a<WaveTemplate> f8687a;

    /* renamed from: a */
    public static void m8850a() {
        C0676a c0676a = new C0676a();
        f8687a = c0676a;
        c0676a.m2296a(new AirOnly());
        f8687a.m2296a(new Boss());
        f8687a.m2296a(new DenseRegular());
        f8687a.m2296a(new FastOnly());
        f8687a.m2296a(new JetOnly());
        f8687a.m2296a(new LightOnly());
        f8687a.m2296a(new RegularOnly());
        f8687a.m2296a(new StrongOnly());
        f8687a.m2296a(new SuperBoss());
        f8687a.m2296a(new IcyOnly());
        f8687a.m2296a(new ToxicOnly());
    }

    /* renamed from: a */
    public int mo1844a(int i, float f) {
        return 1;
    }

    /* renamed from: a */
    public abstract C0676a<EnemyGroup> mo1845a(float f);

    /* renamed from: b */
    public String mo1846b() {
        return null;
    }
}
