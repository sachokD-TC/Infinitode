package com.prineside.tdi;

import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.ac;
import com.prineside.tdi.screens.components.GameGoals.ReachedGoalPrize;
import com.prineside.tdi.screens.components.GameGoals.ReachedGoalPrize.PrizeType;
import com.prineside.tdi.tileInventory.Inventory;
import com.prineside.tdi.tiles.Tile.TileType;
import com.prineside.tdi.utility.FastBadRandom;

public class DailyQuest {
    /* renamed from: f */
    public static final ac f6497f = new ac();
    /* renamed from: a */
    public QuestType f6498a;
    /* renamed from: b */
    public boolean f6499b;
    /* renamed from: c */
    public int f6500c;
    /* renamed from: d */
    public int f6501d;
    /* renamed from: e */
    public int f6502e;
    /* renamed from: g */
    private long f6503g;
    /* renamed from: h */
    private int f6504h;

    public enum QuestType {
        GAIN_COINS,
        SELL_TOWERS_ON_SUM_OF,
        DEFEND_TIME,
        KILL_ENEMIES,
        KILL_AIR_ENEMIES,
        STUN_ENEMIES;
        
        /* renamed from: g */
        public static final QuestType[] f6495g = null;

        static {
            f6495g = values();
        }
    }

    public DailyQuest() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            long longValue = Long.valueOf(Game.game.f6564H.m8838a("dailyQuestAssignTime", "0")).longValue();
            if (currentTimeMillis - longValue < 86400000) {
                Game.game.logger.log("DailyQuest", "previous quest still active");
                this.f6503g = longValue;
                this.f6498a = QuestType.valueOf(Game.game.f6564H.m8838a("dailyQuestType", null));
                this.f6500c = Integer.valueOf(Game.game.f6564H.m8838a("dailyQuestValue", "0")).intValue();
                this.f6501d = Integer.valueOf(Game.game.f6564H.m8838a("dailyQuestTargetValue", "0")).intValue();
                this.f6499b = this.f6500c >= this.f6501d;
            }
            this.f6504h = Integer.valueOf(Game.game.f6564H.m8838a("dailyQuestsCompleted", "0")).intValue();
            this.f6502e = this.f6504h;
        } catch (Exception e) {
        }
        if (this.f6498a == null) {
            Game.game.logger.log("DailyQuest", "new quest");
            boolean z = false;
            while (!z) {
                this.f6498a = QuestType.f6495g[FastBadRandom.m8807a(QuestType.f6495g.length)];
                z = this.f6498a != QuestType.STUN_ENEMIES || GlobalUpgrade.m7492a(GlobalUpgradeType.TOWER_BLAST);
            }
            this.f6500c = 0;
            switch (this.f6498a) {
                case GAIN_COINS:
                    this.f6501d = (FastBadRandom.m8807a(11) * 1000) + 15000;
                    break;
                case SELL_TOWERS_ON_SUM_OF:
                    this.f6501d = (FastBadRandom.m8807a(6) * 500) + 5000;
                    break;
                case DEFEND_TIME:
                    this.f6501d = (FastBadRandom.m8807a(6) * 120) + 1200;
                    break;
                case KILL_ENEMIES:
                    this.f6501d = (FastBadRandom.m8807a(6) * 100) + 1500;
                    break;
                case KILL_AIR_ENEMIES:
                    this.f6501d = (FastBadRandom.m8807a(6) * 10) + 150;
                    break;
                case STUN_ENEMIES:
                    this.f6501d = (FastBadRandom.m8807a(4) * 50) + 250;
                    break;
            }
            this.f6499b = false;
            this.f6503g = currentTimeMillis;
        }
    }

    /* renamed from: a */
    public static void m7427a(ac acVar, int i) {
        acVar.m2328c(i / 60).m2322a(':');
        int i2 = i % 60;
        if (i2 < 10) {
            acVar.m2322a('0');
        }
        acVar.m2328c(i2);
    }

    /* renamed from: a */
    public final void m7428a() {
        Game.game.f6564H.m8839b("dailyQuestAssignTime", String.valueOf(this.f6503g));
        Game.game.f6564H.m8839b("dailyQuestType", this.f6498a.name());
        Game.game.f6564H.m8839b("dailyQuestValue", String.valueOf(this.f6500c));
        Game.game.f6564H.m8839b("dailyQuestTargetValue", String.valueOf(this.f6501d));
        Game.game.f6564H.m8839b("dailyQuestsCompleted", String.valueOf(this.f6504h));
        Game.game.f6564H.m8844d();
    }

    /* renamed from: a */
    public final void m7429a(QuestType questType, int i) {
        float f = 1.0f;
        if (!this.f6499b && questType == this.f6498a) {
            this.f6500c += i;
            if (this.f6500c >= this.f6501d) {
                this.f6504h++;
                this.f6499b = true;
                m7428a();
                if (Game.f6553g != null) {
                    C0676a c0676a = new C0676a();
                    Object reachedGoalPrize = new ReachedGoalPrize();
                    reachedGoalPrize.f7678a = PrizeType.MONEY;
                    reachedGoalPrize.f7680c = ((this.f6504h * 100) + 5000) + (FastBadRandom.m8807a((this.f6504h / 3) + 6) * 300);
                    c0676a.m2296a(reachedGoalPrize);
                    Game.game.m7454b(reachedGoalPrize.f7680c);
                    float f2 = 0.35f + (((float) this.f6504h) * 0.1f);
                    if (f2 <= 1.0f) {
                        f = f2;
                    }
                    reachedGoalPrize = new ReachedGoalPrize();
                    reachedGoalPrize.f7678a = PrizeType.TILE;
                    reachedGoalPrize.f7684g = Inventory.m8354a().m8356a(f, TileType.SPACE);
                    c0676a.m2296a(reachedGoalPrize);
                    Inventory.m8354a().m8358a(reachedGoalPrize.f7684g, 1);
                    Inventory.m8354a().m8360b();
                    Game.f6553g.f7184y.m8220a(Game.f6551e.m2416a("daily_quest"), c0676a);
                }
            }
        }
    }
}
