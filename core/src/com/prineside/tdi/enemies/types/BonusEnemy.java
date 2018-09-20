package com.prineside.tdi.enemies.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.C0710q.C0707b;
import com.prineside.tdi.Game;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.screens.components.GameGoals.ReachedGoalPrize;
import com.prineside.tdi.screens.components.GameGoals.ReachedGoalPrize.PrizeType;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.Tower.TowerType;
import com.prineside.tdi.utility.FastBadRandom;
import com.prineside.tdi.utility.MaterialColor.YELLOW;
import java.util.Iterator;

public class BonusEnemy extends Enemy {
    /* renamed from: E */
    public static final C0710q<TowerType, Float> f6951E;
    /* renamed from: J */
    private static C0430b f6952J = C0430b.f1620c.m1222c();
    /* renamed from: F */
    private TowerType f6953F;
    /* renamed from: G */
    private C0438n f6954G = Game.game.f6561E.m1442a("bonus-enemy-glow");
    /* renamed from: H */
    private C0438n f6955H = Game.game.f6561E.m1442a("enemy-dialog");
    /* renamed from: I */
    private C0438n f6956I;
    /* renamed from: K */
    private int f6957K = 0;

    /* renamed from: com.prineside.tdi.enemies.types.BonusEnemy$1TowerTypeSpent */
    class AnonymousClass1TowerTypeSpent {
        /* renamed from: a */
        public TowerType f6948a;
        /* renamed from: b */
        public int f6949b = 0;
        /* renamed from: c */
        final /* synthetic */ BonusEnemy f6950c;

        public AnonymousClass1TowerTypeSpent(BonusEnemy bonusEnemy, TowerType towerType) {
            this.f6950c = bonusEnemy;
            this.f6948a = towerType;
        }
    }

    static {
        C0710q c0710q = new C0710q();
        f6951E = c0710q;
        c0710q.mo542a(TowerType.BASIC, Float.valueOf(1.0f));
        f6951E.mo542a(TowerType.SNIPER, Float.valueOf(1.0f));
        f6951E.mo542a(TowerType.CANNON, Float.valueOf(2.0f));
        f6951E.mo542a(TowerType.VENOM, Float.valueOf(2.0f));
        f6951E.mo542a(TowerType.SPLASH, Float.valueOf(2.0f));
        f6951E.mo542a(TowerType.BLAST, Float.valueOf(5.0f));
        f6951E.mo542a(TowerType.MULTISHOT, Float.valueOf(1.5f));
        f6951E.mo542a(TowerType.MINIGUN, Float.valueOf(1.0f));
        f6951E.mo542a(TowerType.TESLA, Float.valueOf(1.25f));
        f6951E.mo542a(TowerType.MISSILE, Float.valueOf(2.0f));
    }

    public BonusEnemy() {
        super(EnemyType.BONUS);
        try {
            this.f6957K = Integer.valueOf(Game.game.f6564H.m8838a("bonusEnemyFreeGuTime", "0")).intValue();
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public final void mo1754a(float f) {
        super.mo1754a(f);
        f6952J.f1647L = (float) Math.abs(Math.sin((double) ((((float) Game.game.m7477t()) / 1000.0f) / 1000.0f)));
        Game.game.f6559C.m1410a(f6952J);
        Game.game.f6559C.mo371a(this.f6954G, this.d.f2337x - 32.0f, this.d.f2338y - 32.0f, 32.0f, 32.0f, 64.0f, 64.0f, 1.0f, 1.0f, this.e);
        Game.game.f6559C.m1410a(C0430b.f1620c);
        Game.game.f6559C.mo371a(this.D, this.d.f2337x - 32.0f, this.d.f2338y - 32.0f, 32.0f, 32.0f, 64.0f, 64.0f, 1.0f, 1.0f, this.e);
    }

    /* renamed from: a */
    public final boolean mo1755a(TowerType towerType) {
        return f6951E.m2474c((Object) towerType);
    }

    /* renamed from: b */
    public final float mo1756b(TowerType towerType) {
        return towerType == this.f6953F ? ((Float) f6951E.m2467a((Object) towerType)).floatValue() : 0.02f;
    }

    /* renamed from: b */
    public final void mo1761b() {
        super.mo1761b();
        if (this.f6956I != null) {
            Game.game.f6559C.m1410a(C0430b.f1620c);
            Game.game.f6559C.mo370a(this.f6955H, this.d.f2337x - 22.0f, this.d.f2338y + 30.0f, 44.0f, 40.0f);
            Game.game.f6559C.mo370a(this.f6956I, this.d.f2337x - 16.0f, this.d.f2338y + 37.0f, 32.0f, 32.0f);
        }
    }

    /* renamed from: f */
    public final String mo1757f() {
        return Game.f6551e.m2416a("enemy_name_BONUS");
    }

    /* renamed from: g */
    public final String mo1758g() {
        return Game.f6551e.m2416a("enemy_description_BONUS");
    }

    /* renamed from: h */
    public final C0430b mo1759h() {
        return YELLOW.f8637f;
    }

    /* renamed from: j */
    public final boolean mo1760j() {
        return true;
    }

    /* renamed from: k */
    public final int mo1762k() {
        return 0;
    }

    /* renamed from: l */
    public final void mo1763l() {
        int i = 0;
        try {
            AnonymousClass1TowerTypeSpent[] anonymousClass1TowerTypeSpentArr = new AnonymousClass1TowerTypeSpent[f6951E.f3165a];
            Iterator e = f6951E.mo548e();
            int i2 = 0;
            while (e.hasNext()) {
                anonymousClass1TowerTypeSpentArr[i2] = new AnonymousClass1TowerTypeSpent(this, (TowerType) e.next());
                i2++;
            }
            GameScreen gameScreen = Game.f6553g;
            if (gameScreen != null) {
                int i3;
                AnonymousClass1TowerTypeSpent anonymousClass1TowerTypeSpent;
                e = gameScreen.f7179t.f6768l.m2489c();
                while (e.hasNext()) {
                    Tower tower = (Tower) e.next();
                    if (f6951E.m2474c(tower.f8049k)) {
                        for (i2 = 0; i2 < anonymousClass1TowerTypeSpentArr.length; i2++) {
                            if (anonymousClass1TowerTypeSpentArr[i2].f6948a == tower.f8049k) {
                                AnonymousClass1TowerTypeSpent anonymousClass1TowerTypeSpent2 = anonymousClass1TowerTypeSpentArr[i2];
                                anonymousClass1TowerTypeSpent2.f6949b = tower.f8051m.m8800a() + anonymousClass1TowerTypeSpent2.f6949b;
                                break;
                            }
                        }
                    }
                }
                for (i2 = 0; i2 < anonymousClass1TowerTypeSpentArr.length; i2++) {
                    for (i3 = i2 + 1; i3 < anonymousClass1TowerTypeSpentArr.length; i3++) {
                        if (anonymousClass1TowerTypeSpentArr[i2].f6949b > anonymousClass1TowerTypeSpentArr[i3].f6949b) {
                            anonymousClass1TowerTypeSpent = anonymousClass1TowerTypeSpentArr[i2];
                            anonymousClass1TowerTypeSpentArr[i2] = anonymousClass1TowerTypeSpentArr[i3];
                            anonymousClass1TowerTypeSpentArr[i3] = anonymousClass1TowerTypeSpent;
                        }
                    }
                }
                for (AnonymousClass1TowerTypeSpent anonymousClass1TowerTypeSpent3 : anonymousClass1TowerTypeSpentArr) {
                    Game.game.logger.log("?", anonymousClass1TowerTypeSpent3.f6948a.name() + " " + anonymousClass1TowerTypeSpent3.f6949b);
                }
                i3 = 0;
                for (i2 = 0; i2 < 6; i2++) {
                    anonymousClass1TowerTypeSpent3 = anonymousClass1TowerTypeSpentArr[i2];
                    if (anonymousClass1TowerTypeSpent3.f6949b > i3) {
                        i3 = anonymousClass1TowerTypeSpent3.f6949b;
                    }
                }
                int i4 = 0;
                for (i2 = 0; i2 < 6; i2++) {
                    AnonymousClass1TowerTypeSpent anonymousClass1TowerTypeSpent4 = anonymousClass1TowerTypeSpentArr[i2];
                    int pow = (int) Math.pow((double) (i3 - anonymousClass1TowerTypeSpent4.f6949b), 1.3d);
                    i4 += pow;
                    Game.game.logger.log("BonusEnemy", anonymousClass1TowerTypeSpent4.f6948a.name() + " " + pow);
                }
                Game.game.logger.log("BonusEnemy", "- Sum: " + i4);
                if (i4 == 0) {
                    this.f6953F = anonymousClass1TowerTypeSpentArr[FastBadRandom.m8810b(6)].f6948a;
                } else {
                    TowerType towerType;
                    int b = FastBadRandom.m8810b(i4);
                    Game.game.logger.log("BonusEnemy", "- Rand: " + b);
                    i4 = 0;
                    while (i4 < 6) {
                        AnonymousClass1TowerTypeSpent anonymousClass1TowerTypeSpent5 = anonymousClass1TowerTypeSpentArr[i4];
                        int pow2 = (int) Math.pow((double) (i3 - anonymousClass1TowerTypeSpent5.f6949b), 1.3d);
                        int i5 = i + pow2;
                        if (b >= i && b < i5) {
                            towerType = anonymousClass1TowerTypeSpent5.f6948a;
                            break;
                        } else {
                            i += pow2;
                            i4++;
                        }
                    }
                    towerType = null;
                    this.f6953F = towerType;
                }
                if (this.f6953F != null) {
                    this.f6956I = ((Tower) Tower.f8029g.m2467a(this.f6953F)).f8060v;
                }
            }
        } catch (Throwable e2) {
            Game.game.logger.log("BonusEnemy", e2.getMessage());
            Game.game.logger.m7509a(e2);
            f6951E.mo548e().mo536b();
            this.f6953F = (TowerType) f6951E.mo548e().next();
        }
    }

    /* renamed from: m */
    public final void mo1764m() {
        int i = 0;
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            Sound.m7569a(Type.SUCCESS);
            C0676a c0676a = new C0676a();
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            float f = 0.2f + (((((float) gameScreen.f7174o) / 60.0f) / 30.0f) * 0.8f);
            if (currentTimeMillis - this.f6957K < 86400) {
                f = 0.0f;
            }
            int i2 = f > FastBadRandom.m8811c() ? 1 : 0;
            float c = FastBadRandom.m8811c();
            Object reachedGoalPrize;
            if (c < 0.3f) {
                i2 = this.o * 2;
                gameScreen.f7172m.m8802b(i2);
                reachedGoalPrize = new ReachedGoalPrize();
                reachedGoalPrize.f7678a = PrizeType.GAME_COINS;
                reachedGoalPrize.f7683f = i2 + this.o;
                c0676a.m2296a(reachedGoalPrize);
            } else if (c < 0.5f) {
                gameScreen.f7171l.m8802b(50);
                gameScreen.f7182w.m8233b();
                Object reachedGoalPrize2 = new ReachedGoalPrize();
                reachedGoalPrize2.f7678a = PrizeType.GAME_HEALTH;
                reachedGoalPrize2.f7682e = 50;
                c0676a.m2296a(reachedGoalPrize2);
            } else if (c < 0.8f || i2 == 0) {
                i2 = ((int) Math.sqrt(Math.pow((double) (((((float) gameScreen.f7174o) / 60.0f) / 60.0f) * 60000.0f), 1.399999976158142d))) + 2000;
                Game.game.m7454b(i2);
                reachedGoalPrize = new ReachedGoalPrize();
                reachedGoalPrize.f7678a = PrizeType.MONEY;
                reachedGoalPrize.f7680c = i2;
                c0676a.m2296a(reachedGoalPrize);
            } else {
                C0676a c0676a2 = new C0676a();
                Iterator b = GlobalUpgrade.f6606a.mo544b();
                while (b.hasNext()) {
                    C0707b c0707b = (C0707b) b.next();
                    if (((GlobalUpgrade) c0707b.f3164b).m7500e() && !GlobalUpgrade.m7492a(((GlobalUpgrade) c0707b.f3164b).f6620k)) {
                        c0676a2.m2296a(c0707b.f3164b);
                    }
                }
                while (i < c0676a2.f3001b) {
                    for (int i3 = i + 1; i3 < c0676a2.f3001b; i3++) {
                        if (((GlobalUpgrade) c0676a2.m2291a(i)).f6627r > ((GlobalUpgrade) c0676a2.m2291a(i3)).f6627r) {
                            c0676a2.mo524a(i, i3);
                        }
                    }
                    i++;
                }
                i2 = 5;
                if (c0676a2.f3001b < 5) {
                    i2 = c0676a2.f3001b;
                }
                if (i2 != 0) {
                    GlobalUpgrade globalUpgrade = (GlobalUpgrade) c0676a2.m2308e();
                    GlobalUpgrade.m7494b(globalUpgrade.f6620k);
                    reachedGoalPrize = new ReachedGoalPrize();
                    reachedGoalPrize.f7678a = PrizeType.GLOBAL_UPGRADE;
                    reachedGoalPrize.f7679b = globalUpgrade.f6620k;
                    c0676a.m2296a(reachedGoalPrize);
                    this.f6957K = currentTimeMillis;
                    Game.game.f6564H.m8839b("bonusEnemyFreeGuTime", String.valueOf(currentTimeMillis));
                    Game.game.f6564H.m8844d();
                } else {
                    Game.game.logger.log("BonusEnemy", "All upgrades are installed");
                    i2 = ((int) Math.sqrt(Math.pow((double) (((((float) gameScreen.f7174o) / 60.0f) / 60.0f) * 60000.0f), 1.399999976158142d))) + 2000;
                    Game.game.m7454b(i2);
                    reachedGoalPrize = new ReachedGoalPrize();
                    reachedGoalPrize.f7678a = PrizeType.MONEY;
                    reachedGoalPrize.f7680c = i2;
                    c0676a.m2296a(reachedGoalPrize);
                }
            }
            gameScreen.f7184y.m8220a(Game.f6551e.m2416a("game_goal_bonus_enemy_defeated"), c0676a);
        }
    }
}
