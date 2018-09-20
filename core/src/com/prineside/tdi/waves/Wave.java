package com.prineside.tdi.waves;

import com.badlogic.gdx.utils.C0676a;
import com.prineside.tdi.Game;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.enemies.Enemy.EnemyType;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.utility.FastBadRandom;
import java.util.Iterator;

public class Wave {
    /* renamed from: a */
    public int f8675a;
    /* renamed from: b */
    public float f8676b;
    /* renamed from: c */
    public float f8677c;
    /* renamed from: d */
    public int f8678d;
    /* renamed from: e */
    public int f8679e = 0;
    /* renamed from: f */
    public int f8680f = 0;
    /* renamed from: g */
    public int f8681g;
    /* renamed from: h */
    public C0676a<EnemyGroup> f8682h = new C0676a();
    /* renamed from: i */
    public String f8683i = null;
    /* renamed from: j */
    public boolean f8684j = false;
    /* renamed from: k */
    public float f8685k;
    /* renamed from: l */
    public C0676a<Enemy> f8686l = new C0676a();

    public Wave(int i, float f) {
        this.f8675a = i;
        this.f8676b = f;
        this.f8677c = ((float) this.f8675a) * f;
        m8848b();
    }

    /* renamed from: b */
    private void m8848b() {
        this.f8682h.mo530d();
        WaveTemplate waveTemplate = null;
        Iterator it = WaveTemplate.f8687a.iterator();
        int i = 0;
        while (it.hasNext()) {
            WaveTemplate waveTemplate2 = (WaveTemplate) it.next();
            int a = waveTemplate2.mo1844a(this.f8675a, this.f8677c);
            if (a > 100) {
                waveTemplate = waveTemplate2;
                break;
            }
            i += a;
        }
        if (waveTemplate != null || i > 0) {
            if (waveTemplate == null) {
                int b = FastBadRandom.m8810b(i);
                it = WaveTemplate.f8687a.iterator();
                i = b;
                while (it.hasNext()) {
                    waveTemplate2 = (WaveTemplate) it.next();
                    i -= waveTemplate2.mo1844a(this.f8675a, this.f8677c);
                    if (i < 0) {
                        break;
                    }
                }
                waveTemplate2 = waveTemplate;
                if (waveTemplate2 == null) {
                    throw new RuntimeException("Unable to select random wave template, final randomShift: " + i);
                }
            }
            waveTemplate2 = waveTemplate;
            this.f8683i = waveTemplate2.mo1846b();
            this.f8682h = waveTemplate2.mo1845a(this.f8677c);
            GameScreen gameScreen = Game.f6553g;
            if (gameScreen != null && !gameScreen.f7173n && this.f8683i == null && this.f8677c > 30.0f && FastBadRandom.m8811c() < 0.0075f) {
                float pow = 1.0f + (((float) Math.pow(((double) this.f8677c) * 1.2d, 1.7000000476837158d)) / 16.0f);
                this.f8682h.m2296a(new EnemyGroup(EnemyType.BONUS, 0.95f, pow, 1, FastBadRandom.m8809b() * 3.0f, 0.1f, 40.0f + (((float) Math.pow((double) this.f8677c, 0.6d)) * 10.0f)));
            }
            this.f8678d = 0;
            this.f8681g = 0;
            Iterator it2 = this.f8682h.iterator();
            while (it2.hasNext()) {
                EnemyGroup enemyGroup = (EnemyGroup) it2.next();
                this.f8678d = enemyGroup.f8673h + this.f8678d;
            }
            return;
        }
        throw new RuntimeException("Wave templates sum probability: " + i);
    }

    /* renamed from: a */
    public final void m8849a() {
        if (this.f8684j) {
            Game.game.logger.m7510b("Wave manager", "Can't start enemy template - already started!");
            return;
        }
        this.f8684j = true;
        this.f8685k = ((float) (Game.game.m7477t() / 1000)) / 1000.0f;
    }
}
