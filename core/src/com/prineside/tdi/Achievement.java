package com.prineside.tdi;

import com.badlogic.gdx.utils.C0710q;

public class Achievement {
    /* renamed from: a */
    private static C0710q<Type, AchievementInfo> f6382a = new C0710q();

    private static class AchievementInfo {
        /* renamed from: a */
        public Type f6362a;
        /* renamed from: b */
        public AchievementLevelInfo[] f6363b;
        /* renamed from: c */
        public double f6364c;
        /* renamed from: d */
        public int f6365d = 0;

        public AchievementInfo(Type type, double d, AchievementLevelInfo[] achievementLevelInfoArr) {
            this.f6362a = type;
            this.f6363b = achievementLevelInfoArr;
            this.f6364c = d;
            Achievement.f6382a.mo542a(this.f6362a, this);
        }
    }

    private static class AchievementLevelInfo {
        /* renamed from: a */
        public String f6366a;
        /* renamed from: b */
        public int f6367b;
        /* renamed from: c */
        public int f6368c;
        /* renamed from: d */
        public boolean f6369d = false;
        /* renamed from: e */
        public boolean f6370e = false;

        public AchievementLevelInfo(String str) {
            this.f6366a = str;
            this.f6367b = 1;
            this.f6368c = 2;
        }

        public AchievementLevelInfo(String str, int i) {
            this.f6366a = str;
            this.f6367b = i;
            this.f6368c = i;
        }
    }

    public enum Type {
        REACHED_WAVE,
        COMPLETED_WAVES,
        DEFEATED_ENEMIES,
        BUILT_TOWERS,
        UPGRADED_TOWERS,
        GLOBAL_UPGRADES,
        DEFEATED_BONUS_ENEMIES,
        MAP_EDITOR,
        EARNED_PAPERS,
        EARNED_COINS
    }

    static {
        AchievementInfo achievementInfo = new AchievementInfo(Type.REACHED_WAVE, 0.0d, new AchievementLevelInfo[]{new AchievementLevelInfo("CgkIsoHvgsEHEAIQAQ", 100), new AchievementLevelInfo("CgkIsoHvgsEHEAIQAg", 200), new AchievementLevelInfo("CgkIsoHvgsEHEAIQAw", 300), new AchievementLevelInfo("CgkIsoHvgsEHEAIQBA", 400), new AchievementLevelInfo("CgkIsoHvgsEHEAIQBQ", 500), new AchievementLevelInfo("CgkIsoHvgsEHEAIQBg", 600), new AchievementLevelInfo("CgkIsoHvgsEHEAIQBw", 700), new AchievementLevelInfo("CgkIsoHvgsEHEAIQCA", 800), new AchievementLevelInfo("CgkIsoHvgsEHEAIQCQ", 900), new AchievementLevelInfo("CgkIsoHvgsEHEAIQCg", 1000)});
        achievementInfo = new AchievementInfo(Type.COMPLETED_WAVES, 0.1d, new AchievementLevelInfo[]{new AchievementLevelInfo("CgkIsoHvgsEHEAIQCw", 500), new AchievementLevelInfo("CgkIsoHvgsEHEAIQDA", 1500), new AchievementLevelInfo("CgkIsoHvgsEHEAIQDQ", 3500), new AchievementLevelInfo("CgkIsoHvgsEHEAIQDg", 7500), new AchievementLevelInfo("CgkIsoHvgsEHEAIQDw", 15000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQEA", 25000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQEQ", 40000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQEg", 60000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQEw", 80000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQFA", 100000)});
        achievementInfo = new AchievementInfo(Type.DEFEATED_ENEMIES, 0.001d, new AchievementLevelInfo[]{new AchievementLevelInfo("CgkIsoHvgsEHEAIQFQ", 15000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQFg", 40000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQFw", 60000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQGA", 125000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQGQ", 250000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQGg", 500000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQGw", 750000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQHA", 1100000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQHQ", 1500000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQHg", 1850000)});
        achievementInfo = new AchievementInfo(Type.BUILT_TOWERS, 1.0d, new AchievementLevelInfo[]{new AchievementLevelInfo("CgkIsoHvgsEHEAIQHw", 250), new AchievementLevelInfo("CgkIsoHvgsEHEAIQIA", 500), new AchievementLevelInfo("CgkIsoHvgsEHEAIQIQ", 750), new AchievementLevelInfo("CgkIsoHvgsEHEAIQIg", 1000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQIw", 1500), new AchievementLevelInfo("CgkIsoHvgsEHEAIQJA", 2000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQJQ", 2500), new AchievementLevelInfo("CgkIsoHvgsEHEAIQJg", 3000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQJw", 4000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQKA", 5000)});
        achievementInfo = new AchievementInfo(Type.UPGRADED_TOWERS, 0.01d, new AchievementLevelInfo[]{new AchievementLevelInfo("CgkIsoHvgsEHEAIQKQ", 1000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQKg", 3000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQKw", 6000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQLA", 10000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQLQ", 20000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQLg", 35000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQLw", 60000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQMA", 90000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQMQ", 125000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQMg", 150000)});
        achievementInfo = new AchievementInfo(Type.GLOBAL_UPGRADES, 1.0d, new AchievementLevelInfo[]{new AchievementLevelInfo("CgkIsoHvgsEHEAIQMw", 5), new AchievementLevelInfo("CgkIsoHvgsEHEAIQNA", 10), new AchievementLevelInfo("CgkIsoHvgsEHEAIQNQ", 25), new AchievementLevelInfo("CgkIsoHvgsEHEAIQNg", 50), new AchievementLevelInfo("CgkIsoHvgsEHEAIQNw", 75), new AchievementLevelInfo("CgkIsoHvgsEHEAIQOA", 100), new AchievementLevelInfo("CgkIsoHvgsEHEAIQOQ", 200), new AchievementLevelInfo("CgkIsoHvgsEHEAIQOg", 300), new AchievementLevelInfo("CgkIsoHvgsEHEAIQOw", 400), new AchievementLevelInfo("CgkIsoHvgsEHEAIQPA", 500)});
        achievementInfo = new AchievementInfo(Type.DEFEATED_BONUS_ENEMIES, 1.0d, new AchievementLevelInfo[]{new AchievementLevelInfo("CgkIsoHvgsEHEAIQPQ"), new AchievementLevelInfo("CgkIsoHvgsEHEAIQPg", 5), new AchievementLevelInfo("CgkIsoHvgsEHEAIQPw", 10), new AchievementLevelInfo("CgkIsoHvgsEHEAIQQA", 25), new AchievementLevelInfo("CgkIsoHvgsEHEAIQQQ", 50), new AchievementLevelInfo("CgkIsoHvgsEHEAIQQg", 75), new AchievementLevelInfo("CgkIsoHvgsEHEAIQQw", 100), new AchievementLevelInfo("CgkIsoHvgsEHEAIQRA", 150), new AchievementLevelInfo("CgkIsoHvgsEHEAIQRQ", 200), new AchievementLevelInfo("CgkIsoHvgsEHEAIQRg", 250)});
        achievementInfo = new AchievementInfo(Type.MAP_EDITOR, 1.0d, new AchievementLevelInfo[]{new AchievementLevelInfo("CgkIsoHvgsEHEAIQRw", 16), new AchievementLevelInfo("CgkIsoHvgsEHEAIQSA", 32), new AchievementLevelInfo("CgkIsoHvgsEHEAIQSQ", 64), new AchievementLevelInfo("CgkIsoHvgsEHEAIQSg", 96), new AchievementLevelInfo("CgkIsoHvgsEHEAIQSw", 160), new AchievementLevelInfo("CgkIsoHvgsEHEAIQTA", 256), new AchievementLevelInfo("CgkIsoHvgsEHEAIQTQ", 384), new AchievementLevelInfo("CgkIsoHvgsEHEAIQTg", 512), new AchievementLevelInfo("CgkIsoHvgsEHEAIQTw", 768), new AchievementLevelInfo("CgkIsoHvgsEHEAIQUA", 1024)});
        achievementInfo = new AchievementInfo(Type.EARNED_PAPERS, 0.001d, new AchievementLevelInfo[]{new AchievementLevelInfo("CgkIsoHvgsEHEAIQUQ", 20000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQUg", 75000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQUw", 125000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQVA", 350000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQVQ", 700000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQVg", 1000000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQVw", 1350000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQWA", 1800000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQWQ", 2100000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQWg", 2500000)});
        achievementInfo = new AchievementInfo(Type.EARNED_COINS, 1.0E-4d, new AchievementLevelInfo[]{new AchievementLevelInfo("CgkIsoHvgsEHEAIQWw", 50000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQXA", 250000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQXQ", 750000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQXg", 2500000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQXw", 5000000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQYA", 7500000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQYQ", 10000000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQYg", 12500000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQYw", 15000000), new AchievementLevelInfo("CgkIsoHvgsEHEAIQZA", 20000000)});
    }

    /* renamed from: a */
    public static void m7332a(Type type, int i) {
        AchievementInfo achievementInfo = (AchievementInfo) f6382a.m2467a((Object) type);
        int i2 = 0;
        while (i2 < achievementInfo.f6363b.length) {
            AchievementLevelInfo achievementLevelInfo = achievementInfo.f6363b[i2];
            if (i >= achievementLevelInfo.f6367b) {
                int i3;
                if (!achievementLevelInfo.f6370e) {
                    if (achievementInfo.f6364c != 0.0d) {
                        i3 = (int) (((double) achievementLevelInfo.f6368c) * achievementInfo.f6364c);
                        if (i3 != 0) {
                            Game.game.f6566J.mo1727b(achievementLevelInfo.f6366a, i3);
                        }
                    }
                    if (Game.game.f6566J.mo1726b(achievementLevelInfo.f6366a)) {
                        achievementLevelInfo.f6370e = true;
                    }
                }
                if (i2 != achievementInfo.f6363b.length - 1) {
                    achievementLevelInfo = achievementInfo.f6363b[i2 + 1];
                    if (!achievementLevelInfo.f6369d) {
                        if (Game.game.f6566J.mo1729c(achievementLevelInfo.f6366a)) {
                            achievementLevelInfo.f6369d = true;
                        }
                        if (achievementInfo.f6364c != 0.0d) {
                            i3 = (int) Math.floor(((double) i) * achievementInfo.f6364c);
                            if (i3 > 0 && Game.game.f6566J.mo1727b(achievementLevelInfo.f6366a, i3)) {
                                achievementInfo.f6365d = i3;
                            }
                        }
                    }
                }
                i2++;
            } else if (achievementInfo.f6364c != 0.0d) {
                i2 = (int) Math.floor(((double) i) * achievementInfo.f6364c);
                if (i2 > 0 && achievementInfo.f6365d != i2 && Game.game.f6566J.mo1727b(achievementLevelInfo.f6366a, i2)) {
                    achievementInfo.f6365d = i2;
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }
}
