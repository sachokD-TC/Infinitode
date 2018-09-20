package com.prineside.tdi;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.ah;
import com.badlogic.gdx.utils.ah.C0680a;
import com.badlogic.gdx.utils.ai;
import com.prineside.tdi.utility.SafePreferences;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;

public class BasicLevel {
    /* renamed from: a */
    public static C0676a<BasicLevel> f6441a = new C0676a();
    /* renamed from: b */
    public static C0710q<Integer, BasicLevel> f6442b = new C0710q();
    /* renamed from: c */
    public int f6443c;
    /* renamed from: d */
    public int f6444d;
    /* renamed from: e */
    public int f6445e;
    /* renamed from: f */
    public boolean f6446f;
    /* renamed from: g */
    public int f6447g = 0;
    /* renamed from: h */
    public int f6448h = 0;
    /* renamed from: i */
    public int f6449i = 0;
    /* renamed from: j */
    public int f6450j = 0;
    /* renamed from: k */
    public C0676a<BasicLevelGoal> f6451k;
    /* renamed from: l */
    public C0676a<BasicLevelGoal> f6452l;
    /* renamed from: m */
    public int f6453m;
    /* renamed from: n */
    public int f6454n;
    /* renamed from: o */
    public String f6455o;
    /* renamed from: p */
    public String f6456p;

    /* renamed from: com.prineside.tdi.BasicLevel$1 */
    static class C10541 extends GameListenerAdapter {
        C10541() {
        }

        public final void k_() {
            BasicLevel.m7408e();
        }
    }

    public static class BasicLevelGoal {
        /* renamed from: a */
        public int f6435a;
        /* renamed from: b */
        public int f6436b = 0;
        /* renamed from: c */
        public int f6437c = 0;
        /* renamed from: d */
        public C0676a<BasicLevelGoalTileBonus> f6438d = new C0676a();
    }

    public static class BasicLevelGoalTileBonus {
        /* renamed from: a */
        public float f6439a;
        /* renamed from: b */
        public int f6440b;

        public BasicLevelGoalTileBonus(float f, int i) {
            this.f6439a = f;
            this.f6440b = i;
        }
    }

    private BasicLevel(int i, int i2, int i3, String str, String str2) {
        this.f6443c = i;
        this.f6444d = i2;
        this.f6445e = i3;
        this.f6455o = str;
        this.f6456p = str2;
    }

    /* renamed from: a */
    public static BasicLevel m7404a(int i) {
        return f6442b.m2474c(Integer.valueOf(i)) ? (BasicLevel) f6442b.m2467a(Integer.valueOf(i)) : null;
    }

    /* renamed from: a */
    public static void m7405a() {
        Game.game.m7450a(new C10541());
        m7408e();
    }

    /* renamed from: b */
    public static void m7406b() {
        Writer stringWriter = new StringWriter();
        try {
            BasicLevel basicLevel;
            ai a = new ai(stringWriter).m2374a("purchasedLevels");
            Iterator it = f6441a.iterator();
            while (it.hasNext()) {
                basicLevel = (BasicLevel) it.next();
                if (basicLevel.f6446f) {
                    ai a2 = a.m2374a("purchasedLevel");
                    a2.m2373a(String.valueOf(basicLevel.f6443c));
                    a2.m2372a();
                }
            }
            a.m2372a();
            SafePreferences a3 = SafePreferences.m8835a("Progress");
            a3.m8839b("purchasedLevels", stringWriter.toString());
            stringWriter = new StringWriter();
            try {
                ai a4;
                ai a5 = new ai(stringWriter).m2374a("maxLevelWaves");
                Iterator it2 = f6441a.iterator();
                while (it2.hasNext()) {
                    basicLevel = (BasicLevel) it2.next();
                    a4 = a5.m2374a("levelWave");
                    a4.m2375a("level", String.valueOf(basicLevel.f6443c));
                    a4.m2375a("waves", String.valueOf(basicLevel.f6447g));
                    a4.m2375a("last-goal", String.valueOf(basicLevel.f6448h));
                    a4.m2372a();
                }
                a5.m2372a();
                a3.m8839b("maxLevelWaves", stringWriter.toString());
                stringWriter = new StringWriter();
                try {
                    a5 = new ai(stringWriter).m2374a("maxLevelWavesHardcore");
                    it2 = f6441a.iterator();
                    while (it2.hasNext()) {
                        basicLevel = (BasicLevel) it2.next();
                        a4 = a5.m2374a("levelWave");
                        a4.m2375a("level", String.valueOf(basicLevel.f6443c));
                        a4.m2375a("waves", String.valueOf(basicLevel.f6449i));
                        a4.m2375a("last-goal-v2", String.valueOf(basicLevel.f6450j));
                        a4.m2372a();
                    }
                    a5.m2372a();
                    a3.m8839b("maxLevelWavesHardcore", stringWriter.toString());
                    a3.m8844d();
                } catch (Throwable e) {
                    throw new RuntimeException("Error while saving purchased basic levels", e);
                }
            } catch (Throwable e2) {
                throw new RuntimeException("Error while saving purchased basic levels", e2);
            }
        } catch (Throwable e22) {
            throw new RuntimeException("Error while saving purchased basic levels", e22);
        }
    }

    /* renamed from: e */
    private static void m7408e() {
        C0680a a;
        int i;
        BasicLevel a2;
        f6441a.mo530d();
        f6442b.mo543a();
        C0680a a3 = new ah().m2368a(Gdx.files.mo277b("levels/levels.xml"));
        for (int i2 = 0; i2 < a3.m2356a(); i2++) {
            int i3;
            int i4;
            C0680a a4 = a3.m2358a(i2);
            Object basicLevel = new BasicLevel(a4.m2363d("id"), a4.m2357a("price", 0), a4.m2357a("required-waves", 0), a4.m2359a("leaderboard"), a4.m2359a("hardcore-leaderboard"));
            C0676a c0676a = new C0676a();
            C0680a b = a4.m2361b("wave-goals");
            int a5 = b.m2356a();
            for (i3 = 0; i3 < a5; i3++) {
                int i5;
                C0680a a6 = b.m2358a(i3);
                Object basicLevelGoal = new BasicLevelGoal();
                basicLevelGoal.f6435a = a6.m2363d("waves");
                basicLevelGoal.f6436b = a6.m2363d("prize-money");
                basicLevelGoal.f6437c = a6.m2357a("prize-materials", 0);
                if (a6.m2356a() != 0) {
                    for (i5 = 0; i5 < a6.m2356a(); i5++) {
                        C0680a a7 = a6.m2358a(i5);
                        if (a7.f3028a.equals("tile")) {
                            basicLevelGoal.f6438d.m2296a(new BasicLevelGoalTileBonus(a7.m2362c("quality"), a7.m2357a("amount", 1)));
                        }
                    }
                }
                c0676a.m2296a(basicLevelGoal);
            }
            for (i4 = 0; i4 < c0676a.f3001b; i4++) {
                for (i3 = i4 + 1; i3 < c0676a.f3001b; i3++) {
                    if (((BasicLevelGoal) c0676a.m2291a(i4)).f6435a > ((BasicLevelGoal) c0676a.m2291a(i3)).f6435a) {
                        c0676a.mo524a(i4, i3);
                    }
                }
            }
            basicLevel.f6453m = ((BasicLevelGoal) c0676a.m2291a(c0676a.f3001b - 1)).f6435a;
            basicLevel.f6451k = c0676a;
            c0676a = new C0676a();
            b = a4.m2361b("wave-goals-hardcore");
            a5 = b.m2356a();
            for (i3 = 0; i3 < a5; i3++) {
                a4 = b.m2358a(i3);
                Object basicLevelGoal2 = new BasicLevelGoal();
                basicLevelGoal2.f6435a = a4.m2363d("waves");
                basicLevelGoal2.f6436b = a4.m2363d("prize-money");
                basicLevelGoal2.f6437c = a4.m2357a("prize-materials", 0);
                if (a4.m2356a() != 0) {
                    for (i5 = 0; i5 < a4.m2356a(); i5++) {
                        C0680a a8 = a4.m2358a(i5);
                        if (a8.f3028a.equals("tile")) {
                            basicLevelGoal2.f6438d.m2296a(new BasicLevelGoalTileBonus(a8.m2362c("quality"), a8.m2357a("amount", 1)));
                        }
                    }
                }
                c0676a.m2296a(basicLevelGoal2);
            }
            for (i4 = 0; i4 < c0676a.f3001b; i4++) {
                for (i3 = i4 + 1; i3 < c0676a.f3001b; i3++) {
                    if (((BasicLevelGoal) c0676a.m2291a(i4)).f6435a > ((BasicLevelGoal) c0676a.m2291a(i3)).f6435a) {
                        c0676a.mo524a(i4, i3);
                    }
                }
            }
            basicLevel.f6454n = ((BasicLevelGoal) c0676a.m2291a(c0676a.f3001b - 1)).f6435a;
            basicLevel.f6452l = c0676a;
            f6441a.m2296a(basicLevel);
            f6442b.mo542a(Integer.valueOf(basicLevel.f6443c), basicLevel);
        }
        SafePreferences a9 = SafePreferences.m8835a("Progress");
        String a10 = a9.m8838a("purchasedLevels", null);
        if (a10 != null) {
            try {
                a = new ah().m2369a(a10);
                for (i = 0; i < a.m2356a(); i++) {
                    a2 = m7404a(Integer.valueOf(a.m2358a(i).f3031d).intValue());
                    if (a2 != null) {
                        a2.f6446f = true;
                    }
                }
            } catch (Exception e) {
                Game.game.logger.m7510b("BasicLevel", "Error loading purchased levels: " + e.getMessage());
            }
        }
        Iterator it = f6441a.iterator();
        while (it.hasNext()) {
            BasicLevel basicLevel2 = (BasicLevel) it.next();
            if (basicLevel2.f6444d == 0) {
                basicLevel2.f6446f = true;
            }
        }
        a10 = a9.m8838a("maxLevelWaves", null);
        if (a10 != null) {
            try {
                a = new ah().m2369a(a10);
                for (i = 0; i < a.m2356a(); i++) {
                    b = a.m2358a(i);
                    int d = b.m2363d("level");
                    a5 = b.m2363d("waves");
                    i4 = b.m2357a("last-goal", 0);
                    BasicLevel a11 = m7404a(d);
                    if (a11 != null) {
                        a11.f6447g = a5;
                        a11.f6448h = i4;
                    }
                }
            } catch (Exception e2) {
                Game.game.logger.m7510b("BasicLevel", "Error loading levels max waves: " + e2.getMessage());
            }
        }
        a10 = a9.m8838a("maxLevelWavesHardcore", null);
        if (a10 != null) {
            try {
                C0680a a12 = new ah().m2369a(a10);
                for (i = 0; i < a12.m2356a(); i++) {
                    a = a12.m2358a(i);
                    i4 = a.m2363d("level");
                    d = a.m2363d("waves");
                    i3 = a.m2357a("last-goal-v2", 0);
                    a2 = m7404a(i4);
                    if (a2 != null) {
                        a2.f6449i = d;
                        a2.f6450j = i3;
                    }
                }
            } catch (Exception e22) {
                Game.game.logger.m7510b("BasicLevel", "Error loading hardcore levels max waves: " + e22.getMessage());
            }
        }
    }

    /* renamed from: b */
    public final void m7409b(int i) {
        this.f6447g = i;
        m7406b();
    }

    /* renamed from: c */
    public final Map m7410c() {
        return new Map(Map.m7512a(Gdx.files.mo277b("levels/" + this.f6443c + "/map.xml").m899k(), true));
    }

    /* renamed from: c */
    public final void m7411c(int i) {
        this.f6449i = i;
        m7406b();
    }
}
