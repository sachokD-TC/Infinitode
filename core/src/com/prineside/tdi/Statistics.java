package com.prineside.tdi;

import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.ah;
import com.badlogic.gdx.utils.ah.C0680a;
import com.badlogic.gdx.utils.ai;
import com.prineside.tdi.towers.Tower.TowerType;
import com.prineside.tdi.utility.SafePreferences;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

public class Statistics {
    /* renamed from: a */
    public static C0710q<StatisticsType, String> f6859a;
    /* renamed from: b */
    public SafePreferences f6860b = SafePreferences.m8835a("Statistics");
    /* renamed from: c */
    public C0710q<StatisticsType, Long> f6861c;
    /* renamed from: d */
    public C0710q<TowerType, Long> f6862d;
    /* renamed from: e */
    public C0710q<TowerType, Long> f6863e;
    /* renamed from: f */
    private boolean f6864f = false;

    /* renamed from: com.prineside.tdi.Statistics$1 */
    class C10801 extends GameListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ Statistics f6845a;

        C10801(Statistics statistics) {
            this.f6845a = statistics;
        }

        public final void k_() {
            this.f6845a.m7579b();
        }
    }

    public enum StatisticsType {
        GAMES_PLAYED,
        ENEMIES_KILLED,
        ENEMIES_MISSED,
        PLAY_TIME,
        COINS_GAINED,
        MONEY_GAINED,
        TOWERS_BUILT,
        TOWERS_SOLD,
        UPGRADES_INSTALLED,
        WAVES_COMPLETED,
        BONUS_ENEMIES_KILLED;
        
        /* renamed from: l */
        public static final StatisticsType[] f6857l = null;

        static {
            f6857l = values();
        }
    }

    public Statistics() {
        Game.game.m7450a(new C10801(this));
        C0710q c0710q = new C0710q();
        f6859a = c0710q;
        c0710q.mo542a(StatisticsType.GAMES_PLAYED, "statistics_type_games_played");
        f6859a.mo542a(StatisticsType.ENEMIES_KILLED, "statistics_type_enemies_killed");
        f6859a.mo542a(StatisticsType.ENEMIES_MISSED, "statistics_type_enemies_missed");
        f6859a.mo542a(StatisticsType.PLAY_TIME, "statistics_type_play_time");
        f6859a.mo542a(StatisticsType.COINS_GAINED, "statistics_type_coins_gained");
        f6859a.mo542a(StatisticsType.MONEY_GAINED, "statistics_type_money_gained");
        f6859a.mo542a(StatisticsType.TOWERS_BUILT, "statistics_type_towers_built");
        f6859a.mo542a(StatisticsType.TOWERS_SOLD, "statistics_type_towers_sold");
        f6859a.mo542a(StatisticsType.UPGRADES_INSTALLED, "statistics_type_upgrades_installed");
        f6859a.mo542a(StatisticsType.WAVES_COMPLETED, "statistics_type_waves_completed");
        m7579b();
    }

    /* renamed from: a */
    public static String m7577a(StatisticsType statisticsType, long j) {
        if (statisticsType == StatisticsType.PLAY_TIME) {
            int i = (int) ((j / 60) / 60);
            int i2 = (int) ((j % 3600) / 60);
            int i3 = (int) (j % 60);
            return String.format(Locale.ENGLISH, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return String.format(Locale.ENGLISH, "%,d", new Object[]{Long.valueOf(j)});
    }

    /* renamed from: b */
    private void m7579b() {
        int i;
        C0680a a;
        C0680a a2;
        String a3;
        int i2 = 0;
        this.f6861c = new C0710q();
        for (Object a4 : StatisticsType.f6857l) {
            this.f6861c.mo542a(a4, Long.valueOf(0));
        }
        String a5 = this.f6860b.m8838a("main", null);
        if (a5 != null) {
            a = new ah().m2369a(a5);
            for (i = 0; i < a.m2356a(); i++) {
                a2 = a.m2358a(i);
                try {
                    a3 = a2.m2359a("t");
                    try {
                        this.f6861c.mo542a(StatisticsType.valueOf(a3), Long.valueOf(Long.valueOf(a2.f3031d).longValue()));
                    } catch (Exception e) {
                        Game.game.logger.log("Statistics", "Main stat '" + a3 + "' not found and was ignored");
                    }
                } catch (Exception e2) {
                    Game.game.logger.log("Statistics", "Failed to get attributes name/value for stats");
                }
            }
        }
        this.f6862d = new C0710q();
        for (Object a42 : TowerType.f8015m) {
            this.f6862d.mo542a(a42, Long.valueOf(0));
        }
        a5 = this.f6860b.m8838a("towerDamage", null);
        if (a5 != null) {
            a = new ah().m2369a(a5);
            for (i = 0; i < a.m2356a(); i++) {
                a2 = a.m2358a(i);
                try {
                    a3 = a2.m2359a("t");
                    try {
                        this.f6862d.mo542a(TowerType.valueOf(a3), Long.valueOf(Long.valueOf(a2.f3031d).longValue()));
                    } catch (Exception e3) {
                        Game.game.logger.log("Statistics", "Tower damage stat for '" + a3 + "' not found and was ignored");
                    }
                } catch (GdxRuntimeException e4) {
                    Game.game.logger.log("Statistics", "Failed to get attributes name/value for stats");
                }
            }
        }
        this.f6863e = new C0710q();
        for (Object a422 : TowerType.f8015m) {
            this.f6863e.mo542a(a422, Long.valueOf(0));
        }
        a5 = this.f6860b.m8838a("towerSpentMoney", null);
        if (a5 != null) {
            C0680a a6 = new ah().m2369a(a5);
            while (i2 < a6.m2356a()) {
                a = a6.m2358a(i2);
                try {
                    String a7 = a.m2359a("t");
                    try {
                        this.f6863e.mo542a(TowerType.valueOf(a7), Long.valueOf(Long.valueOf(a.f3031d).longValue()));
                    } catch (Exception e5) {
                        Game.game.logger.log("Statistics", "Tower spent money stat for '" + a7 + "' not found and was ignored");
                    }
                } catch (GdxRuntimeException e6) {
                    Game.game.logger.log("Statistics", "Failed to get attributes name/value for stats");
                }
                i2++;
            }
        }
    }

    /* renamed from: a */
    public final void m7580a() {
        int i = 0;
        if (this.f6864f) {
            try {
                ai a;
                Object obj;
                Writer stringWriter = new StringWriter();
                ai a2 = new ai(stringWriter).m2374a("statistics");
                for (Object obj2 : StatisticsType.f6857l) {
                    a = a2.m2374a("s");
                    a.m2375a("t", obj2.name());
                    a.m2373a(((Long) this.f6861c.m2467a(obj2)).toString());
                    a.m2372a();
                }
                a2.m2372a();
                this.f6860b.m8839b("main", stringWriter.toString());
                stringWriter = new StringWriter();
                a2 = new ai(stringWriter).m2374a("statistics");
                for (Object obj22 : TowerType.f8015m) {
                    a = a2.m2374a("s");
                    a.m2375a("t", obj22.name());
                    a.m2373a(((Long) this.f6862d.m2467a(obj22)).toString());
                    a.m2372a();
                }
                a2.m2372a();
                this.f6860b.m8839b("towerDamage", stringWriter.toString());
                Writer stringWriter2 = new StringWriter();
                ai a3 = new ai(stringWriter2).m2374a("statistics");
                TowerType[] towerTypeArr = TowerType.f8015m;
                int length = towerTypeArr.length;
                while (i < length) {
                    obj22 = towerTypeArr[i];
                    ai a4 = a3.m2374a("s");
                    a4.m2375a("t", obj22.name());
                    a4.m2373a(((Long) this.f6863e.m2467a(obj22)).toString());
                    a4.m2372a();
                    i++;
                }
                a3.m2372a();
                this.f6860b.m8839b("towerSpentMoney", stringWriter2.toString());
                this.f6860b.m8844d();
                Game.game.logger.log("Statistics", "Saved");
            } catch (Throwable e) {
                Game.game.logger.m7509a(e);
            }
        }
    }

    /* renamed from: a */
    public final void m7581a(TowerType towerType, long j) {
        this.f6864f = true;
        this.f6862d.mo542a(towerType, Long.valueOf(((Long) this.f6862d.m2467a((Object) towerType)).longValue() + j));
    }

    /* renamed from: b */
    public final void m7582b(StatisticsType statisticsType, long j) {
        this.f6864f = true;
        this.f6861c.mo542a(statisticsType, Long.valueOf(((Long) this.f6861c.m2467a((Object) statisticsType)).longValue() + j));
    }

    /* renamed from: b */
    public final void m7583b(TowerType towerType, long j) {
        this.f6864f = true;
        this.f6863e.mo542a(towerType, Long.valueOf(((Long) this.f6863e.m2467a((Object) towerType)).longValue() + j));
    }
}
