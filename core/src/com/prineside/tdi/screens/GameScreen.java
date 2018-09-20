package com.prineside.tdi.screens;

import com.badlogic.gdx.C0366h;
import com.badlogic.gdx.C0377g;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.C0507i;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.g2d.C0480m.C0475a;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.C0588a;
import com.badlogic.gdx.scenes.scene2d.C0609g;
import com.badlogic.gdx.scenes.scene2d.p033a.C0587a;
import com.badlogic.gdx.scenes.scene2d.p033a.C0600l;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f;
import com.badlogic.gdx.scenes.scene2d.utils.C0655f;
import com.badlogic.gdx.scenes.scene2d.utils.C0663k;
import com.badlogic.gdx.utils.C0328t;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0688f;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.C0712r;
import com.badlogic.gdx.utils.C0712r.C0711a;
import com.badlogic.gdx.utils.C0728z;
import com.badlogic.gdx.utils.ac;
import com.badlogic.gdx.utils.ah;
import com.badlogic.gdx.utils.ah.C0680a;
import com.badlogic.gdx.utils.ai;
import com.badlogic.gdx.utils.p034b.C0684b;
import com.prineside.tdi.Achievement;
import com.prineside.tdi.Achievement.Type;
import com.prineside.tdi.AsyncUpdatable;
import com.prineside.tdi.AsyncUpdater;
import com.prineside.tdi.BasicLevel;
import com.prineside.tdi.BasicLevel.BasicLevelGoal;
import com.prineside.tdi.BasicLevel.BasicLevelGoalTileBonus;
import com.prineside.tdi.CameraController;
import com.prineside.tdi.DailyQuest;
import com.prineside.tdi.DailyQuest.QuestType;
import com.prineside.tdi.Game;
import com.prineside.tdi.Game.GameMode;
import com.prineside.tdi.GameInputListener;
import com.prineside.tdi.GameInputProcessor;
import com.prineside.tdi.GlobalUpgrade;
import com.prineside.tdi.GlobalUpgrade.FilteringMode;
import com.prineside.tdi.GlobalUpgradeType;
import com.prineside.tdi.Map;
import com.prineside.tdi.MapListener;
import com.prineside.tdi.Path;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Statistics.StatisticsType;
import com.prineside.tdi.UserMap;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.enemies.Enemy.EnemyType;
import com.prineside.tdi.projectiles.Projectile;
import com.prineside.tdi.projectiles.types.AirProjectile;
import com.prineside.tdi.projectiles.types.BasicProjectile;
import com.prineside.tdi.projectiles.types.CannonProjectile;
import com.prineside.tdi.projectiles.types.ChainLightningProjectile;
import com.prineside.tdi.projectiles.types.MissileProjectile;
import com.prineside.tdi.projectiles.types.MultishotProjectile;
import com.prineside.tdi.projectiles.types.SplashProjectile;
import com.prineside.tdi.projectiles.types.VenomProjectile;
import com.prineside.tdi.screens.components.Dialog;
import com.prineside.tdi.screens.components.GameGoals;
import com.prineside.tdi.screens.components.GameGoals.Goal;
import com.prineside.tdi.screens.components.GameGoals.ReachedGoalPrize;
import com.prineside.tdi.screens.components.GameGoals.ReachedGoalPrize.PrizeType;
import com.prineside.tdi.screens.components.GameGui;
import com.prineside.tdi.screens.components.GameOverProperties;
import com.prineside.tdi.screens.components.NewEnemyInfo;
import com.prineside.tdi.screens.components.PauseMenu;
import com.prineside.tdi.screens.components.TileMenu;
import com.prineside.tdi.screens.components.Tutorial;
import com.prineside.tdi.tileInventory.Inventory;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.tiles.Tile.TileType;
import com.prineside.tdi.tiles.TileVisibilityHandler;
import com.prineside.tdi.tiles.WalkableTile;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.Tower.TowerType;
import com.prineside.tdi.towers.TowerListener;
import com.prineside.tdi.utility.CheatSafeInt;
import com.prineside.tdi.utility.FastBadRandom;
import com.prineside.tdi.utility.MaterialColor.GREEN;
import com.prineside.tdi.utility.MaterialColor.ORANGE;
import com.prineside.tdi.utility.MaterialColor.RED;
import com.prineside.tdi.utility.MaterialColor.YELLOW;
import com.prineside.tdi.utility.MeshedCircle;
import com.prineside.tdi.waves.EnemyGroup;
import com.prineside.tdi.waves.Wave;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;

public class GameScreen extends AbstractScreen implements GameInputListener, MapListener, TowerListener {
    /* renamed from: E */
    private static final GlobalUpgradeType[] f7135E = new GlobalUpgradeType[]{GlobalUpgradeType.FORCED_WAVE_BONUS_V, GlobalUpgradeType.FORCED_WAVE_BONUS_IV, GlobalUpgradeType.FORCED_WAVE_BONUS_III, GlobalUpgradeType.FORCED_WAVE_BONUS_II, GlobalUpgradeType.FORCED_WAVE_BONUS_I};
    /* renamed from: F */
    private static final GlobalUpgradeType[] f7136F = new GlobalUpgradeType[]{GlobalUpgradeType.STARTING_MONEY_V, GlobalUpgradeType.STARTING_MONEY_IV, GlobalUpgradeType.STARTING_MONEY_III, GlobalUpgradeType.STARTING_MONEY_II, GlobalUpgradeType.STARTING_MONEY_I};
    /* renamed from: G */
    private static final GlobalUpgradeType[] f7137G = new GlobalUpgradeType[]{GlobalUpgradeType.STARTING_HEALTH_V, GlobalUpgradeType.STARTING_HEALTH_IV, GlobalUpgradeType.STARTING_HEALTH_III, GlobalUpgradeType.STARTING_HEALTH_II, GlobalUpgradeType.STARTING_HEALTH_I};
    /* renamed from: H */
    private static final GlobalUpgradeType[] f7138H = new GlobalUpgradeType[]{GlobalUpgradeType.WAVE_DELAY_V, GlobalUpgradeType.WAVE_DELAY_IV, GlobalUpgradeType.WAVE_DELAY_III, GlobalUpgradeType.WAVE_DELAY_II, GlobalUpgradeType.WAVE_DELAY_I};
    /* renamed from: R */
    private static C0438n f7139R;
    /* renamed from: S */
    private static C0438n f7140S;
    /* renamed from: b */
    public static final C0712r<GlobalUpgradeType> f7141b;
    /* renamed from: A */
    public PauseMenu f7142A;
    /* renamed from: B */
    public NewEnemyInfo f7143B;
    /* renamed from: C */
    public Tutorial f7144C;
    /* renamed from: D */
    public MeshedCircle f7145D;
    /* renamed from: I */
    private C0507i f7146I;
    /* renamed from: J */
    private long f7147J;
    /* renamed from: K */
    private AsyncUpdater[] f7148K;
    /* renamed from: L */
    private Goal f7149L;
    /* renamed from: M */
    private Goal f7150M;
    /* renamed from: N */
    private boolean f7151N = false;
    /* renamed from: O */
    private double f7152O = 1.0d;
    /* renamed from: P */
    private Tile f7153P;
    /* renamed from: Q */
    private Tile f7154Q;
    /* renamed from: T */
    private long f7155T;
    /* renamed from: U */
    private boolean f7156U = false;
    /* renamed from: V */
    private final C0688f<Projectile> f7157V = new C0688f();
    /* renamed from: W */
    private final C0328t<QueuedTowerDamage> f7158W = new C10951(this);
    /* renamed from: X */
    private final C0728z<QueuedTowerDamage> f7159X = new C0728z();
    /* renamed from: Y */
    private final C0684b f7160Y = new C0684b();
    /* renamed from: Z */
    private C0377g f7161Z;
    private boolean aa = false;
    private MeshedCircle ab;
    /* renamed from: c */
    public CameraController f7162c;
    /* renamed from: d */
    public HashMap<Thread, AsyncUpdater> f7163d;
    /* renamed from: e */
    public GameMode f7164e;
    /* renamed from: f */
    public BasicLevel f7165f;
    /* renamed from: g */
    public UserMap f7166g;
    /* renamed from: h */
    public boolean f7167h = false;
    /* renamed from: i */
    public Thread f7168i;
    /* renamed from: j */
    public boolean f7169j = false;
    /* renamed from: k */
    public long f7170k;
    /* renamed from: l */
    public CheatSafeInt f7171l = new CheatSafeInt(0);
    /* renamed from: m */
    public CheatSafeInt f7172m = new CheatSafeInt(0);
    /* renamed from: n */
    public boolean f7173n = false;
    /* renamed from: o */
    public int f7174o = 0;
    /* renamed from: p */
    public long f7175p = 0;
    /* renamed from: q */
    public float f7176q = 0.0f;
    /* renamed from: r */
    public long f7177r;
    /* renamed from: s */
    public Wave f7178s;
    /* renamed from: t */
    public Map f7179t;
    /* renamed from: u */
    public long f7180u = -1;
    /* renamed from: v */
    public final C0609g f7181v = new C0609g(this.f7160Y);
    /* renamed from: w */
    public GameGui f7182w;
    /* renamed from: x */
    public TileMenu f7183x;
    /* renamed from: y */
    public GameGoals f7184y;
    /* renamed from: z */
    public Dialog f7185z;

    /* renamed from: com.prineside.tdi.screens.GameScreen$1 */
    class C10951 extends C0328t<QueuedTowerDamage> {
        /* renamed from: a */
        final /* synthetic */ GameScreen f7126a;

        C10951(GameScreen gameScreen) {
            this.f7126a = gameScreen;
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo301a() {
            return new QueuedTowerDamage();
        }
    }

    /* renamed from: com.prineside.tdi.screens.GameScreen$2 */
    class C10962 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ GameScreen f7127a;

        public C10962(GameScreen gameScreen) {
            this.f7127a = gameScreen;
        }

        public void run() {
            Game.game.logger.log("GameScreen", "Async loading done");
            this.f7127a.f7179t.m7519a();
        }
    }

    /* renamed from: com.prineside.tdi.screens.GameScreen$3 */
    class C10973 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ GameScreen f7128a;

        public C10973(GameScreen gameScreen) {
            this.f7128a = gameScreen;
        }

        public void run() {
            Game.game.logger.log("GameScreen", "Async loading done");
            this.f7128a.f7179t.m7519a();
        }
    }

    private class QueuedTowerDamage {
        /* renamed from: a */
        public Tower f7131a;
        /* renamed from: b */
        public Enemy f7132b;
        /* renamed from: c */
        public float f7133c;
        /* renamed from: d */
        final /* synthetic */ GameScreen f7134d;

        private QueuedTowerDamage(GameScreen gameScreen) {
            this.f7134d = gameScreen;
        }
    }

    static {
        C0712r c0712r = new C0712r();
        f7141b = c0712r;
        c0712r.m2486a(GlobalUpgradeType.ROOT);
        f7141b.m2486a(GlobalUpgradeType.FORCE_WAVE_ABILITY);
        f7141b.m2486a(GlobalUpgradeType.GAME_SPEED_X2);
        f7141b.m2486a(GlobalUpgradeType.GAME_SPEED_X4);
        f7141b.m2486a(GlobalUpgradeType.FORCED_WAVE_BONUS_I);
        f7141b.m2486a(GlobalUpgradeType.FORCED_WAVE_BONUS_II);
        f7141b.m2486a(GlobalUpgradeType.FORCED_WAVE_BONUS_III);
        f7141b.m2486a(GlobalUpgradeType.FORCED_WAVE_BONUS_IV);
        f7141b.m2486a(GlobalUpgradeType.FORCED_WAVE_BONUS_V);
        f7141b.m2486a(GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_I);
        f7141b.m2486a(GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_II);
        f7141b.m2486a(GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_III);
        f7141b.m2486a(GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_IV);
        f7141b.m2486a(GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_V);
        f7141b.m2486a(GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_VI);
        f7141b.m2486a(GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_VII);
        f7141b.m2486a(GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_VIII);
        f7141b.m2486a(GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_IX);
        f7141b.m2486a(GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_X);
        String[] strArr = new String[]{"BASIC", "MINIGUN", "BLAST", "SNIPER", "TESLA", "MISSILE", "MULTISHOT", "AIR", "FROST", "SPLASH", "VENOM", "CANNON"};
        for (int i = 0; i < 12; i++) {
            String str = strArr[i];
            f7141b.m2486a(GlobalUpgradeType.valueOf("TOWER_" + str));
            f7141b.m2486a(GlobalUpgradeType.valueOf("TOWER_" + str + "_MAX_UPGRADE_LEVEL_I"));
            f7141b.m2486a(GlobalUpgradeType.valueOf("TOWER_" + str + "_MAX_UPGRADE_LEVEL_II"));
            f7141b.m2486a(GlobalUpgradeType.valueOf("TOWER_" + str + "_MAX_UPGRADE_LEVEL_III"));
            f7141b.m2486a(GlobalUpgradeType.valueOf("TOWER_" + str + "_MAX_TOWER_LEVEL_I"));
            f7141b.m2486a(GlobalUpgradeType.valueOf("TOWER_" + str + "_MAX_TOWER_LEVEL_II"));
            f7141b.m2486a(GlobalUpgradeType.valueOf("TOWER_" + str + "_MAX_TOWER_LEVEL_III"));
            f7141b.m2486a(GlobalUpgradeType.valueOf("TOWER_" + str + "_MAX_TOWER_LEVEL_IV"));
            f7141b.m2486a(GlobalUpgradeType.valueOf("TOWER_" + str + "_MAX_TOWER_LEVEL_V"));
        }
    }

    /* renamed from: b */
    public static void m7831b(AsyncUpdatable asyncUpdatable) {
        if (asyncUpdatable.mo1752c() != null) {
            AsyncUpdater c = asyncUpdatable.mo1752c();
            synchronized (c.f6433d) {
                c.f6433d.m2296a((Object) asyncUpdatable);
            }
            asyncUpdatable.mo1751a(null);
        }
    }

    /* renamed from: b */
    private boolean m7832b(int i) {
        if (this.f7172m.m8800a() < i) {
            return false;
        }
        this.f7172m.m8803c(i);
        this.f7182w.m8229a();
        if (this.f7183x.f7783d) {
            this.f7183x.m8274a();
        }
        return true;
    }

    /* renamed from: e */
    public static void m7833e() {
        f7139R = Game.game.f6561E.m1442a("tile-outline-active");
        f7140S = Game.game.f6561E.m1442a("tile-outline-hover");
    }

    /* renamed from: i */
    public static boolean m7834i() {
        return Game.game.f6564H.m8841b("savedGame");
    }

    /* renamed from: j */
    public static void m7835j() {
        Game.game.f6564H.m8843c("savedGame");
        Game.game.f6564H.m8844d();
    }

    /* renamed from: k */
    public static void m7836k() {
        if (m7834i()) {
            String a = Game.game.f6564H.m8838a("savedGame", null);
            if (a != null) {
                final C0680a a2 = new ah().m2369a(a);
                GameMode valueOf = GameMode.valueOf(a2.m2359a("mode"));
                final TowerListener gameScreen = new GameScreen();
                Game.f6553g = gameScreen;
                try {
                    if (valueOf == GameMode.BASIC_LEVELS) {
                        BasicLevel a3 = BasicLevel.m7404a(Integer.valueOf(a2.m2361b("levelId").f3031d).intValue());
                        gameScreen.f7164e = GameMode.BASIC_LEVELS;
                        gameScreen.f7165f = a3;
                        gameScreen.f7179t = a3.m7410c();
                    } else if (valueOf == GameMode.USER_MAPS) {
                        UserMap b = UserMap.m7586b(Integer.valueOf(a2.m2361b("slotId").f3031d).intValue());
                        gameScreen.f7164e = GameMode.USER_MAPS;
                        gameScreen.f7166g = b;
                        gameScreen.f7179t = b.m7588c();
                    }
                    gameScreen.f7179t.m7523a((MapListener) gameScreen);
                    if (a2.m2361b("hardcoreMode") != null) {
                        gameScreen.f7173n = Boolean.valueOf(a2.m2361b("hardcoreMode").f3031d).booleanValue();
                    }
                    gameScreen.m7864h();
                    gameScreen.f7172m.m8801a(Integer.valueOf(a2.m2361b("money").f3031d).intValue());
                    gameScreen.f7171l.m8801a(Integer.valueOf(a2.m2361b("health").f3031d).intValue());
                    gameScreen.f7174o = 0;
                    C0680a b2 = a2.m2361b("gameTime");
                    if (b2 != null) {
                        gameScreen.f7174o = Integer.valueOf(b2.f3031d).intValue();
                    }
                    C0680a b3 = a2.m2361b("towers");
                    for (int i = 0; i < b3.m2356a(); i++) {
                        C0680a a4 = b3.m2358a(i);
                        Tower a5 = Tower.m8431a(TowerType.valueOf(a4.m2359a("t")));
                        int d = a4.m2363d("x");
                        int d2 = a4.m2363d("y");
                        a5.f8053o = a4.m2362c("a");
                        a5.f8050l = a4.m2363d("as");
                        a5.f8052n = a4.m2362c("dg");
                        a5.f8051m.m8801a(a4.m2363d("mso"));
                        a5.m8447a(a4.m2362c("e"));
                        String[] split = a4.m2359a("ul").split(",");
                        for (int i2 = 0; i2 < 4; i2++) {
                            a5.f8058t[i2] = Integer.valueOf(split[i2]).intValue();
                        }
                        gameScreen.f7179t.m7521a(d, d2, a5);
                        a5.f8047i = gameScreen.f7179t;
                        a5.m8452a(gameScreen);
                    }
                    gameScreen.f7178s = new Wave(Integer.valueOf(a2.m2361b("lastWave").f3031d).intValue(), 1.0f);
                    gameScreen.f7178s.m8849a();
                    gameScreen.f7178s.f8681g = gameScreen.f7178s.f8678d;
                    gameScreen.f7180u = Game.game.m7477t();
                    gameScreen.f7182w.m8237e();
                    Game.game.setScreen(gameScreen);
                    Game.game.logger.log("GameScreen", "Starting async screen loader...");
                    Game.game.m7469l();
                    gameScreen.f7168i = new Thread(new Runnable() {
                        public final void run() {
                            Game.game.logger.log("GameScreen", "Async loading done");
                            gameScreen.f7179t.m7519a();
                            C0680a b = a2.m2361b("enemies");
                            for (int i = 0; i < b.m2356a(); i++) {
                                C0680a a = b.m2358a(i);
                                Enemy a2 = Enemy.m7591a(EnemyType.valueOf(a.m2359a("t")));
                                a2.f6912g = (Path) gameScreen.f7179t.f6772p.m2291a(FastBadRandom.m8807a(gameScreen.f7179t.f6772p.f3001b));
                                a2.f6911f = Path.m7536a();
                                a2.f6918m = a.m2362c("mh");
                                a2.m7602b(a.m2362c("h"));
                                a2.f6907b = a.m2362c("p");
                                a2.f6920o = a.m2363d("b");
                                a2.f6913h = a.m2357a("wn", 0);
                                String a3 = a.m2360a("scm", null);
                                a2.f6930y = a3 == null ? 1.0f : Float.parseFloat(a3);
                                a2.m7604c(a.m2362c("s"));
                                gameScreen.f7179t.m7524a(a2);
                            }
                        }
                    });
                    gameScreen.f7168i.start();
                } catch (Throwable e) {
                    Game.game.logger.m7510b("GameScreen", "Failed to continue saved game: " + e.getMessage());
                    Game.game.logger.m7509a(e);
                    m7835j();
                    Game.game.m7473p();
                }
            }
        }
    }

    /* renamed from: w */
    private void m7837w() {
        if (!this.f7151N) {
            this.f7151N = true;
            if (this.f7169j) {
                this.f7152O = 1.0d;
                this.f7169j = false;
            } else {
                this.f7152O = Game.game.f6585r;
            }
            Game.game.f6585r = 0.0d;
            Gdx.input.mo304a(this.f7181v);
        }
    }

    /* renamed from: x */
    private void m7838x() {
        int i = 0;
        if (this.f7164e == GameMode.BASIC_LEVELS) {
            C0676a c0676a;
            int i2;
            BasicLevelGoal basicLevelGoal;
            if (this.f7149L == null) {
                this.f7149L = this.f7184y.m8218a("Wave: 99/100");
            }
            int i3 = this.f7178s != null ? this.f7178s.f8675a : 0;
            int i4;
            if (this.f7173n) {
                i4 = this.f7165f.f6450j;
                c0676a = this.f7165f.f6452l;
                i2 = i4;
            } else {
                i4 = this.f7165f.f6448h;
                c0676a = this.f7165f.f6451k;
                i2 = i4;
            }
            if (i3 > i2) {
                Iterator it = c0676a.iterator();
                while (it.hasNext()) {
                    basicLevelGoal = (BasicLevelGoal) it.next();
                    if (basicLevelGoal.f6435a > i2 && i3 >= basicLevelGoal.f6435a) {
                        Object reachedGoalPrize;
                        C0676a c0676a2 = new C0676a();
                        if (basicLevelGoal.f6436b != 0) {
                            reachedGoalPrize = new ReachedGoalPrize();
                            reachedGoalPrize.f7678a = PrizeType.MONEY;
                            reachedGoalPrize.f7680c = basicLevelGoal.f6436b;
                            c0676a2.m2296a(reachedGoalPrize);
                            Game.game.m7454b(basicLevelGoal.f6436b);
                        }
                        if (basicLevelGoal.f6437c != 0) {
                            reachedGoalPrize = new ReachedGoalPrize();
                            reachedGoalPrize.f7678a = PrizeType.MATERIALS;
                            reachedGoalPrize.f7681d = basicLevelGoal.f6437c;
                            c0676a2.m2296a(reachedGoalPrize);
                            Game.game.m7461e(basicLevelGoal.f6437c);
                        }
                        Iterator it2 = basicLevelGoal.f6438d.iterator();
                        while (it2.hasNext()) {
                            BasicLevelGoalTileBonus basicLevelGoalTileBonus = (BasicLevelGoalTileBonus) it2.next();
                            for (int i5 = 0; i5 < basicLevelGoalTileBonus.f6440b; i5++) {
                                Object reachedGoalPrize2 = new ReachedGoalPrize();
                                reachedGoalPrize2.f7678a = PrizeType.TILE;
                                reachedGoalPrize2.f7684g = Inventory.m8354a().m8356a(basicLevelGoalTileBonus.f6439a, null);
                                c0676a2.m2296a(reachedGoalPrize2);
                                Inventory.m8354a().m8358a(reachedGoalPrize2.f7684g, 1);
                                Inventory.m8354a().m8360b();
                            }
                        }
                        this.f7184y.m8220a(Game.f6551e.m2416a("game_gui_wave") + " " + basicLevelGoal.f6435a, c0676a2);
                        if (this.f7173n) {
                            this.f7165f.f6450j = basicLevelGoal.f6435a;
                        } else {
                            this.f7165f.f6448h = basicLevelGoal.f6435a;
                        }
                        BasicLevel.m7406b();
                    }
                }
            }
            Iterator it3;
            if (this.f7173n) {
                if (this.f7165f.f6450j < this.f7165f.f6454n) {
                    it3 = this.f7165f.f6452l.iterator();
                    while (it3.hasNext()) {
                        basicLevelGoal = (BasicLevelGoal) it3.next();
                        if (basicLevelGoal.f6435a > this.f7165f.f6450j) {
                            i = basicLevelGoal.f6435a;
                            break;
                        }
                    }
                    this.f7149L.m8216a(Game.f6551e.m2416a("game_gui_wave") + ": " + i3 + "/" + i);
                    return;
                }
                this.f7149L.m8216a(Game.f6551e.m2416a("game_gui_wave") + ": " + this.f7165f.f6453m + "/" + this.f7165f.f6453m);
                this.f7149L.m8217a(true);
            } else if (this.f7165f.f6448h < this.f7165f.f6453m) {
                it3 = this.f7165f.f6451k.iterator();
                while (it3.hasNext()) {
                    basicLevelGoal = (BasicLevelGoal) it3.next();
                    if (basicLevelGoal.f6435a > this.f7165f.f6448h) {
                        i = basicLevelGoal.f6435a;
                        break;
                    }
                }
                this.f7149L.m8216a(Game.f6551e.m2416a("game_gui_wave") + ": " + i3 + "/" + i);
            } else {
                this.f7149L.m8216a(Game.f6551e.m2416a("game_gui_wave") + ": " + this.f7165f.f6453m + "/" + this.f7165f.f6453m);
                this.f7149L.m8217a(true);
            }
        }
    }

    /* renamed from: y */
    private void m7839y() {
        int i = this.f7178s == null ? 1 : this.f7178s.f8675a + 1;
        if (this.f7173n) {
            this.f7178s = new Wave(i, (float) Math.pow((double) (this.f7179t.f6762f.f7995t + (((float) i) * 0.025f)), 1.0399999618530273d));
        } else {
            this.f7178s = new Wave(i, this.f7179t.f6762f.f7995t);
        }
        this.f7178s.m8849a();
        this.f7182w.m8237e();
        if (this.f7178s.f8683i != null) {
            GameGui gameGui = this.f7182w;
            gameGui.f7697a.m2130a(this.f7178s.f8683i);
            gameGui.f7697a.m1949b();
            C0629f c0629f = gameGui.f7697a;
            C0588a a = C0587a.m1886a(true);
            C0588a a2 = C0587a.m1881a(1.0f, 0.0f, null);
            C0588a a3 = C0587a.m1883a(3.0f);
            C0588a a4 = C0587a.m1881a(0.0f, 1.0f, null);
            C0588a a5 = C0587a.m1886a(false);
            C0600l c0600l = (C0600l) C0587a.m1887a(C0600l.class);
            c0600l.m1914a(a);
            c0600l.m1914a(a2);
            c0600l.m1914a(a3);
            c0600l.m1914a(a4);
            c0600l.m1914a(a5);
            c0629f.m1940a((C0588a) c0600l);
        }
    }

    /* renamed from: z */
    private void m7840z() {
        if (this.f7150M != null) {
            this.f7150M.m8217a(Game.game.f6563G.f6499b);
            C0629f c0629f = this.f7150M.f7667c;
            DailyQuest dailyQuest = Game.game.f6563G;
            DailyQuest.f6497f.m2327b(0);
            ac acVar = DailyQuest.f6497f;
            acVar.m2324a("[#00BCD4]");
            acVar.m2324a(Game.f6551e.m2416a("day"));
            acVar.m2324a(" ");
            acVar.m2328c(dailyQuest.f6502e + 1).m2324a(":[] ");
            switch (dailyQuest.f6498a) {
                case GAIN_COINS:
                    acVar = DailyQuest.f6497f;
                    acVar.m2324a(Game.f6551e.m2416a("quest_gain_coins"));
                    acVar.m2322a(' ');
                    if (dailyQuest.f6499b) {
                        DailyQuest.f6497f.m2328c(dailyQuest.f6501d);
                    } else {
                        DailyQuest.f6497f.m2328c(dailyQuest.f6500c);
                    }
                    acVar = DailyQuest.f6497f;
                    acVar.m2322a('/');
                    acVar.m2328c(dailyQuest.f6501d);
                    break;
                case SELL_TOWERS_ON_SUM_OF:
                    acVar = DailyQuest.f6497f;
                    acVar.m2324a(Game.f6551e.m2416a("quest_sell_towers_on_sum_of"));
                    acVar.m2322a(' ');
                    if (dailyQuest.f6499b) {
                        DailyQuest.f6497f.m2328c(dailyQuest.f6501d);
                    } else {
                        DailyQuest.f6497f.m2328c(dailyQuest.f6500c);
                    }
                    acVar = DailyQuest.f6497f;
                    acVar.m2322a('/');
                    acVar.m2328c(dailyQuest.f6501d);
                    break;
                case DEFEND_TIME:
                    acVar = DailyQuest.f6497f;
                    acVar.m2324a(Game.f6551e.m2416a("quest_defend_for"));
                    acVar.m2322a(' ');
                    if (dailyQuest.f6499b) {
                        DailyQuest.m7427a(DailyQuest.f6497f, dailyQuest.f6501d);
                    } else {
                        DailyQuest.m7427a(DailyQuest.f6497f, dailyQuest.f6500c);
                    }
                    DailyQuest.f6497f.m2322a('/');
                    DailyQuest.m7427a(DailyQuest.f6497f, dailyQuest.f6501d);
                    break;
                case KILL_ENEMIES:
                    acVar = DailyQuest.f6497f;
                    acVar.m2324a(Game.f6551e.m2416a("quest_kill_enemies"));
                    acVar.m2322a(' ');
                    if (dailyQuest.f6499b) {
                        DailyQuest.f6497f.m2328c(dailyQuest.f6501d);
                    } else {
                        DailyQuest.f6497f.m2328c(dailyQuest.f6500c);
                    }
                    acVar = DailyQuest.f6497f;
                    acVar.m2322a('/');
                    acVar.m2328c(dailyQuest.f6501d);
                    break;
                case KILL_AIR_ENEMIES:
                    acVar = DailyQuest.f6497f;
                    acVar.m2324a(Game.f6551e.m2416a("quest_kill_air_enemies"));
                    acVar.m2322a(' ');
                    if (dailyQuest.f6499b) {
                        DailyQuest.f6497f.m2328c(dailyQuest.f6501d);
                    } else {
                        DailyQuest.f6497f.m2328c(dailyQuest.f6500c);
                    }
                    acVar = DailyQuest.f6497f;
                    acVar.m2322a('/');
                    acVar.m2328c(dailyQuest.f6501d);
                    break;
                case STUN_ENEMIES:
                    acVar = DailyQuest.f6497f;
                    acVar.m2324a(Game.f6551e.m2416a("quest_stun_enemies"));
                    acVar.m2322a(' ');
                    if (dailyQuest.f6499b) {
                        DailyQuest.f6497f.m2328c(dailyQuest.f6501d);
                    } else {
                        DailyQuest.f6497f.m2328c(dailyQuest.f6500c);
                    }
                    acVar = DailyQuest.f6497f;
                    acVar.m2322a('/');
                    acVar.m2328c(dailyQuest.f6501d);
                    break;
            }
            c0629f.m2130a(DailyQuest.f6497f);
        }
    }

    /* renamed from: a */
    public final void m7841a(int i) {
        this.f7172m.m8802b(i);
        this.f7182w.m8229a();
        if (this.f7183x.f7783d) {
            this.f7183x.m8274a();
        }
    }

    /* renamed from: a */
    public final void resize(int i, int i2) {
        super.resize(i, i2);
        this.f7160Y.f3064a = 1200.0f / ((float) Gdx.graphics.mo295d());
        this.f7160Y.mo522a(i, i2);
        this.f7162c.m7414a();
        TileMenu tileMenu = this.f7183x;
        tileMenu.m8276b(tileMenu.f7783d);
        PauseMenu pauseMenu = this.f7142A;
        int i3 = (int) ((1200.0f / ((float) i2)) * ((float) i));
        pauseMenu.f7761a.m1956c((float) i3, 1200.0f);
        pauseMenu.f7762b.m1956c((float) i3, 1200.0f);
        Tutorial tutorial = this.f7144C;
        i3 = (int) ((1200.0f / ((float) i2)) * ((float) i));
        tutorial.f7816b.m1956c((float) i3, 1200.0f);
        tutorial.f7817c.m1956c((float) i3, 1200.0f);
    }

    /* renamed from: a */
    public final void m7843a(Vector2 vector2, float f) {
        if (this.f7145D != null) {
            this.f7145D.dispose();
        }
        if (this.ab != null) {
            this.ab.dispose();
        }
        this.f7145D = new MeshedCircle(vector2.f2337x, vector2.f2338y, 0.75f * f, f, new C0430b(1286557696), new C0430b(1286557747));
        this.ab = new MeshedCircle(vector2.f2337x, vector2.f2338y, f - 3.0f, f, new C0430b(1286557747), new C0430b(1286557747));
    }

    /* renamed from: a */
    public final void m7844a(AsyncUpdatable asyncUpdatable) {
        if (asyncUpdatable.mo1752c() == null) {
            AsyncUpdater[] asyncUpdaterArr = this.f7148K;
            int length = asyncUpdaterArr.length;
            int i = 0;
            int i2 = -1;
            AsyncUpdater asyncUpdater = null;
            while (i < length) {
                int i3;
                AsyncUpdater asyncUpdater2 = asyncUpdaterArr[i];
                int i4 = asyncUpdater2.f6431b;
                if (i2 == -1 || i4 < i2) {
                    asyncUpdater = asyncUpdater2;
                    i3 = i4;
                } else {
                    i3 = i2;
                }
                i++;
                i2 = i3;
            }
            if (asyncUpdater == null) {
                Game.game.logger.m7510b("addTowerToUpdatePool", "No updater found!");
                return;
            }
            asyncUpdater.m7403a(asyncUpdatable);
            asyncUpdatable.mo1751a(asyncUpdater);
        }
    }

    /* renamed from: a */
    public final void m7845a(EnemyType enemyType) {
        if (!this.f7156U) {
            this.f7156U = true;
            m7835j();
            if (this.f7178s == null) {
                this.a.m7473p();
                return;
            }
            float f;
            float f2;
            int i;
            Tower tower;
            Object obj;
            int i2 = this.f7178s.f8675a;
            if (this.f7173n) {
                f = ((float) i2) / 20.0f;
                f2 = 1.2f;
            } else {
                f = ((float) i2) / 50.0f;
                f2 = 1.1f;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            int pow = (int) (((double) f) * Math.pow(((double) i2) * 15.0d, (double) f2));
            int pow2 = (int) Math.pow(((double) this.f7174o) / 5.0d, 1.22d);
            float f3 = 1.0f;
            int i3 = (int) (((double) (pow + pow2)) * ((double) this.f7179t.f6762f.f7995t));
            GlobalUpgradeType[] globalUpgradeTypeArr = new GlobalUpgradeType[]{GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_X, GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_IX, GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_VIII, GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_VII, GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_VI, GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_V, GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_IV, GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_III, GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_II, GlobalUpgradeType.GAME_PRIZES_MULTIPLIER_I};
            for (i = 0; i < 10; i++) {
                GlobalUpgradeType globalUpgradeType = globalUpgradeTypeArr[i];
                if (GlobalUpgrade.m7492a(globalUpgradeType)) {
                    f3 = GlobalUpgrade.m7495c(globalUpgradeType).f6630u[0];
                    i = (int) (((float) i3) * f3);
                    break;
                }
            }
            i = i3;
            int i4 = Game.game.f6593z ? i * 2 : i;
            i = 0;
            if (this.f7174o > 450) {
                i = 1;
                if (Game.game.f6593z) {
                    i = 2;
                }
            }
            if (this.f7174o > 1800) {
                i++;
                if (Game.game.f6593z) {
                    i++;
                }
            }
            double pow3 = this.f7173n ? 0.16d * Math.pow((double) this.f7179t.f6762f.f7995t, 1.2d) : 0.08d * Math.pow((double) this.f7179t.f6762f.f7995t, 1.12d);
            if (Game.game.f6593z) {
                pow3 *= 2.0d;
            }
            int i5 = i;
            for (i = 0; i < this.f7174o; i += 60) {
                if (Math.random() < pow3) {
                    i5++;
                }
                pow3 *= 0.977d;
            }
            C0676a c0676a = new C0676a();
            if (i5 != 0) {
                Inventory a = Inventory.m8354a();
                float f4 = 0.5f;
                int i6 = 0;
                while (i6 < i5) {
                    f = (((float) i2) * this.f7179t.f6762f.f7995t) / 1000.0f;
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                    float f5 = f * f4;
                    f5 += (f - f5) * ((float) Math.random());
                    Tile a2 = a.m8356a(f5, null);
                    c0676a.m2296a((Object) a2);
                    a.m8358a(a2, 1);
                    f = (float) (((double) f4) + 0.05d);
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                    Game.game.logger.log("Game Over", "Tile quality: " + f5);
                    i6++;
                    f4 = f;
                }
                a.m8360b();
            }
            Game.game.logger.log("Game Over", "Completed waves: " + i2);
            Game.game.logger.log("Game Over", "Got money: " + i4 + " (W: " + pow + ", T: " + pow2 + ", D: " + this.f7179t.f6762f.f7995t + ")");
            Game.game.logger.log("Game Over", "Play time: " + this.f7174o);
            Game.game.logger.log("Game Over", "Bonus tile count: " + i5);
            Object obj2 = 1;
            if (i2 > 30) {
                try {
                    Iterator c = this.f7179t.f6768l.m2489c();
                    int i7 = 0;
                    float f6 = 0.0f;
                    while (c.hasNext()) {
                        tower = (Tower) c.next();
                        i7 += tower.f8051m.m8800a();
                        f6 = tower.f8052n + f6;
                    }
                    if (i2 > this.f7174o / 3) {
                        obj2 = null;
                    }
                    obj = i2 > i7 / 30 ? null : obj2;
                    if (((float) i2) > f6 / 400.0f) {
                        obj = null;
                    }
                } catch (Exception e) {
                    int i8 = 1;
                }
            } else {
                i = 1;
            }
            Object obj3 = obj;
            if (obj3 != null) {
                Game.game.logger.log("Game Over", "->");
            } else {
                Game.game.logger.log("Game Over", "-<");
            }
            Game.f6554h.m7582b(StatisticsType.GAMES_PLAYED, 1);
            Game.f6554h.m7582b(StatisticsType.PLAY_TIME, (long) this.f7174o);
            Game.f6554h.m7582b(StatisticsType.WAVES_COMPLETED, (long) i2);
            Achievement.m7332a(Type.COMPLETED_WAVES, ((Long) Game.f6554h.f6861c.m2467a(StatisticsType.WAVES_COMPLETED)).intValue());
            Game.f6554h.m7582b(StatisticsType.MONEY_GAINED, (long) i4);
            Achievement.m7332a(Type.EARNED_PAPERS, ((Long) Game.f6554h.f6861c.m2467a(StatisticsType.MONEY_GAINED)).intValue());
            Iterator c2 = this.f7179t.f6768l.m2489c();
            while (c2.hasNext()) {
                tower = (Tower) c2.next();
                if (tower.f8052n != 0.0f) {
                    Game.f6554h.m7581a(tower.f8049k, (long) ((int) tower.f8052n));
                }
            }
            Game.game.m7454b(i4);
            GameOverProperties gameOverProperties = new GameOverProperties(this.f7164e, i2, i4, i3, this.f7174o, f3, this.f7173n);
            gameOverProperties.f7718e = this.f7173n;
            gameOverProperties.f7720g = c0676a;
            if (this.f7164e == GameMode.BASIC_LEVELS) {
                gameOverProperties.f7722i = this.f7165f;
                if (this.f7173n) {
                    if (this.f7165f.f6449i < i2) {
                        Game.game.logger.log("Game Over", "Level hardcore high score!");
                        this.f7165f.m7411c(i2);
                        gameOverProperties.f7724k = true;
                        if (this.a.f6592y.m8800a() < i2) {
                            Game.game.logger.log("Game Over", "Global high score!");
                            Game.game.m7462f(i2);
                            gameOverProperties.f7725l = true;
                        }
                    }
                } else if (this.f7165f.f6447g < i2) {
                    Game.game.logger.log("Game Over", "Level high score!");
                    this.f7165f.m7409b(i2);
                    gameOverProperties.f7724k = true;
                    if (this.a.f6592y.m8800a() < i2) {
                        Game.game.logger.log("Game Over", "Global high score!");
                        Game.game.m7462f(i2);
                        gameOverProperties.f7725l = true;
                    }
                }
                if (obj3 != null && Game.game.f6566J.mo1728c()) {
                    if (this.f7173n) {
                        Game.game.f6566J.mo1723a(this.f7165f.f6456p, i2);
                    } else {
                        Game.game.f6566J.mo1723a(this.f7165f.f6455o, i2);
                    }
                }
            } else if (this.f7164e == GameMode.USER_MAPS) {
                gameOverProperties.f7723j = this.f7166g;
                if (this.a.f6592y.m8800a() < i2) {
                    Game.game.logger.log("Game Over", "Global high score!");
                    Game.game.m7462f(i2);
                    gameOverProperties.f7725l = true;
                }
            }
            if (obj3 != null && Game.game.f6566J.mo1728c()) {
                Game.game.f6566J.mo1723a("CgkIsoHvgsEHEAIQZQ", i2);
            }
            Game.f6554h.m7580a();
            Game.game.m7466h();
            try {
                if (this.f7164e == GameMode.BASIC_LEVELS && this.f7165f != null) {
                    Tower tower2;
                    C0710q c0710q = new C0710q();
                    Iterator c3 = this.f7179t.f6768l.m2489c();
                    while (c3.hasNext()) {
                        tower2 = (Tower) c3.next();
                        if (!c0710q.m2474c(tower2.f8049k)) {
                            c0710q.mo542a(tower2.f8049k, Long.valueOf(0));
                        }
                        c0710q.mo542a(tower2.f8049k, Long.valueOf(((Long) c0710q.m2467a(tower2.f8049k)).longValue() + ((long) tower2.f8052n)));
                    }
                    C0710q c0710q2 = new C0710q();
                    c3 = this.f7179t.f6768l.m2489c();
                    while (c3.hasNext()) {
                        tower2 = (Tower) c3.next();
                        if (!c0710q2.m2474c(tower2.f8049k)) {
                            c0710q2.mo542a(tower2.f8049k, Long.valueOf(0));
                        }
                        c0710q2.mo542a(tower2.f8049k, Long.valueOf(((Long) c0710q2.m2467a(tower2.f8049k)).longValue() + ((long) tower2.f8051m.m8800a())));
                    }
                    Game.game.m7448a(this.f7165f.f6443c, i2, this.f7174o, c0710q, c0710q2, enemyType, this.f7173n);
                }
            } catch (Exception e2) {
            }
            Game game = this.a;
            if (game.getScreen() != null) {
                game.getScreen().mo1778d();
            }
            game.setScreen(new GameOverScreen(gameOverProperties));
        }
    }

    /* renamed from: a */
    public final void mo1782a(Enemy enemy) {
        m7831b((AsyncUpdatable) enemy);
    }

    /* renamed from: a */
    public final void m7847a(Projectile projectile) {
        if (projectile == null) {
            Game.game.logger.m7510b("GameScreen#addProjectile", "Projectile is null");
            Game.game.logger.m7509a(new Exception());
            return;
        }
        this.f7157V.m2296a((Object) projectile);
    }

    /* renamed from: a */
    public final void mo1783a(Tile tile) {
        if (tile == null || tile.f7960a == TileType.VOID) {
            this.f7183x.m8275a(false);
            this.f7154Q = null;
        } else {
            this.f7154Q = tile;
            TileMenu tileMenu = this.f7183x;
            tileMenu.f7782c = tile;
            tileMenu.m8274a();
            if (!this.f7183x.f7784e) {
                this.f7183x.m8275a(true);
            }
        }
        this.f7185z.m8211a();
        Sound.m7569a(Sound.Type.CLICK);
    }

    /* renamed from: a */
    public final void m7849a(TowerType towerType) {
        m7852a(towerType, new Random().nextInt(4));
    }

    /* renamed from: a */
    public final void mo1784a(Tower tower) {
        m7831b((AsyncUpdatable) tower);
    }

    /* renamed from: a */
    public final void m7851a(Tower tower, Enemy enemy, float f) {
        synchronized (this.f7158W) {
            QueuedTowerDamage queuedTowerDamage = (QueuedTowerDamage) this.f7158W.m965b();
        }
        if (queuedTowerDamage == null) {
            Game.game.logger.m7510b("TD", "Null from pool");
            return;
        }
        synchronized (this.f7159X) {
            queuedTowerDamage.f7132b = enemy;
            queuedTowerDamage.f7131a = tower;
            queuedTowerDamage.f7133c = f;
            this.f7159X.m2296a((Object) queuedTowerDamage);
        }
    }

    /* renamed from: a */
    public final boolean m7852a(TowerType towerType, int i) {
        if (this.f7154Q != null && this.f7154Q.f7960a == TileType.SPACE && this.f7154Q.f7962c == null) {
            Tower a = Tower.m8431a(towerType);
            if (m7832b(a.m8463f())) {
                a.m8452a((TowerListener) this);
                a.f8051m.m8801a(a.m8463f());
                a.f8050l = i;
                Map map = this.f7179t;
                Tile tile = this.f7154Q;
                map.m7521a(tile.f7963d, tile.f7964e, a);
                Game.f6554h.m7583b(a.f8049k, (long) a.f8051m.m8800a());
                Game.f6554h.m7582b(StatisticsType.TOWERS_BUILT, 1);
                Achievement.m7332a(Type.BUILT_TOWERS, ((Long) Game.f6554h.f6861c.m2467a(StatisticsType.TOWERS_BUILT)).intValue());
                if (GlobalUpgrade.m7492a(a.mo1812B())) {
                    a.m8447a((float) Tower.f8024b[2]);
                }
                this.f7183x.m8274a();
                if (this.f7154Q.f7971l) {
                    float f = (float) (1.5d - this.f7162c.f6471b);
                    if (f > 0.0f) {
                        Sound.m7570a(Sound.Type.BUILD, f * (0.8f + (0.2f * FastBadRandom.m8809b())), this.f7154Q.f7972m);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m7853a(Tower tower, int i) {
        if (tower.f8058t[i] >= tower.m8464g()) {
            return false;
        }
        int a = tower.mo1819a(i, tower.f8058t[i] + 1);
        if (!m7832b(a)) {
            return false;
        }
        tower.f8051m.m8802b(a);
        int i2 = tower.f8058t[i] + 1;
        if (i2 > tower.m8464g()) {
            i2 = tower.m8464g();
        }
        tower.f8058t[i] = i2;
        tower.mo1822j();
        this.f7179t.m7525a(tower.f8048j);
        Sound.m7571b(Sound.Type.UPGRADE);
        Game.f6554h.m7583b(tower.f8049k, (long) a);
        Game.f6554h.m7582b(StatisticsType.UPGRADES_INSTALLED, 1);
        Achievement.m7332a(Type.UPGRADED_TOWERS, ((Long) Game.f6554h.f6861c.m2467a(StatisticsType.UPGRADES_INSTALLED)).intValue());
        return true;
    }

    /* renamed from: b */
    public final void pause() {
        super.pause();
        m7837w();
        this.f7142A.m8259a();
    }

    /* renamed from: b */
    public final void mo1781b(float f) {
        long t = this.a.m7477t() - this.f7147J;
        long j = (long) (200000.0d * Game.game.f6585r);
        if (t > j) {
            t = j;
        }
        this.f7147J = this.a.m7477t();
        if (this.f7167h) {
            Object[] f2;
            int i;
            int i2;
            float b;
            Iterator c;
            Tower tower;
            Enemy enemy;
            if (Gdx.input.mo307b(4) || Gdx.input.mo307b(131)) {
                if (this.f7151N) {
                    Game.game.m7473p();
                } else {
                    m7866m();
                }
            }
            Object obj = this.f7162c.f6471b <= 1.5d ? 1 : null;
            Object obj2 = this.f7162c.f6471b <= 1.0d ? 1 : null;
            if (!(this.f7151N || this.f7178s == null)) {
                if (Game.game.m7478u() - this.f7175p > 1000000) {
                    this.f7174o++;
                    this.f7175p = Game.game.m7478u();
                    m7840z();
                }
                this.f7176q = (float) (((double) this.f7176q) + (((double) f) * Game.game.f6585r));
                if (this.f7176q > 1.0f) {
                    Game.game.f6563G.m7429a(QuestType.DEFEND_TIME, 1);
                    this.f7176q = 0.0f;
                }
            }
            if (this.f7169j) {
                double d = (double) (f / 3.0f);
                if (Game.game.f6585r + d >= 1.0d) {
                    Game.game.f6585r = 0.0d;
                    m7874u();
                    this.f7169j = false;
                } else {
                    Game game = Game.game;
                    game.f6585r = d + game.f6585r;
                }
            }
            this.f7146I.mo429a();
            this.a.f6559C.mo372a(this.f7146I.f);
            this.a.f6560D.m1458a(this.f7146I.f);
            ((C0475a) this.a.f6561E.f2087c.m2291a(0)).f1686z.m1129b(TextureFilter.MipMapLinearNearest, TextureFilter.Linear);
            synchronized (this.f7159X) {
                f2 = this.f7159X.m2540f();
                i = this.f7159X.b;
                this.f7159X.mo530d();
            }
            for (i2 = 0; i2 < i; i2++) {
                QueuedTowerDamage queuedTowerDamage = (QueuedTowerDamage) f2[i2];
                if (this.f7179t.m7529b(queuedTowerDamage.f7132b)) {
                    queuedTowerDamage.f7132b.m7599a(queuedTowerDamage.f7131a, queuedTowerDamage.f7133c);
                }
            }
            synchronized (this.f7158W) {
                for (i2 = 0; i2 < i; i2++) {
                    this.f7158W.mo363a((QueuedTowerDamage) f2[i2]);
                }
            }
            this.f7159X.m2541g();
            this.f7179t.m7528b();
            if (this.f7178s != null) {
                if (this.f7178s.f8678d <= this.f7178s.f8681g) {
                    if (this.f7180u == -1) {
                        this.f7180u = this.a.m7477t();
                        m7870q();
                        Achievement.m7332a(Type.REACHED_WAVE, this.f7178s.f8675a);
                        m7838x();
                    }
                    if (this.a.m7477t() - this.f7180u > this.f7177r) {
                        this.f7180u = -1;
                        m7839y();
                    } else {
                        this.f7182w.m8236d();
                    }
                } else {
                    C0676a c0676a;
                    int i3;
                    Wave wave = this.f7178s;
                    if (!wave.f8684j) {
                        Game.game.logger.m7510b("Wave manager", "Can't spawn enemies - wave is not started yet! Call start() first");
                        c0676a = null;
                    } else if (wave.f8681g >= wave.f8678d) {
                        Game.game.logger.m7510b("Wave manager", "Can't spawn enemies - all enemies are spawned already! Check enemiesCount == spawnedEnemiesCount");
                        c0676a = null;
                    } else {
                        float t2 = (((float) (Game.game.m7477t() / 1000)) / 1000.0f) - wave.f8685k;
                        wave.f8686l.mo530d();
                        Iterator it = wave.f8682h.iterator();
                        while (it.hasNext()) {
                            EnemyGroup enemyGroup = (EnemyGroup) it.next();
                            float f3 = t2 - enemyGroup.f8669d;
                            if (f3 < 0.0f) {
                                i2 = 0;
                            } else if (enemyGroup.f8670e > 0.0f) {
                                i2 = ((int) Math.floor((double) (f3 / enemyGroup.f8670e))) + 1;
                                if (i2 > enemyGroup.f8673h) {
                                    i2 = enemyGroup.f8673h;
                                }
                            } else {
                                i2 = enemyGroup.f8673h;
                            }
                            if (i2 != enemyGroup.f8674i) {
                                for (i3 = 0; i3 < i2 - enemyGroup.f8674i; i3++) {
                                    Object a = Enemy.m7591a(enemyGroup.f8666a);
                                    a.f6918m = enemyGroup.f8668c;
                                    a.f6920o = (int) enemyGroup.f8671f;
                                    a.f6908c = enemyGroup.f8672g;
                                    float f4 = enemyGroup.f8671f % 1.0f;
                                    if (f4 != 0.0f && FastBadRandom.m8809b() < f4) {
                                        a.f6920o++;
                                    }
                                    a.m7604c(enemyGroup.f8667b);
                                    a.m7602b(enemyGroup.f8668c);
                                    wave.f8686l.m2296a(a);
                                    wave.f8681g++;
                                }
                                enemyGroup.f8674i = i2;
                                if (enemyGroup.f8674i >= enemyGroup.f8673h) {
                                    it.remove();
                                }
                            }
                        }
                        c0676a = wave.f8686l;
                    }
                    Iterator it2 = c0676a.iterator();
                    while (it2.hasNext()) {
                        Enemy enemy2 = (Enemy) it2.next();
                        if (Enemy.m7593b(enemy2.f6914i)) {
                            NewEnemyInfo newEnemyInfo = this.f7143B;
                            newEnemyInfo.f7733b = true;
                            newEnemyInfo.f7734c = Game.game.m7478u();
                            newEnemyInfo.f7732a.f2611e = true;
                            newEnemyInfo.f7737f.m2130a(enemy2.mo1757f());
                            newEnemyInfo.f7738g.m2130a(enemy2.mo1758g());
                            C0655f c0663k = new C0663k(enemy2.f6897D);
                            for (int i4 = 0; i4 < 4; i4++) {
                                newEnemyInfo.f7735d[i4].m2117a(c0663k);
                            }
                            for (i3 = 0; i3 < 12; i3++) {
                                TowerType towerType = TowerType.f8015m[i3];
                                b = enemy2.mo1755a(towerType) ? enemy2.mo1756b(towerType) : 0.0f;
                                if (b == 1.0f) {
                                    newEnemyInfo.f7736e[i3].m1937a(C0430b.f1620c);
                                } else if (b > 1.0f) {
                                    newEnemyInfo.f7736e[i3].m1937a(GREEN.f8487f);
                                } else if (b < 0.25f) {
                                    newEnemyInfo.f7736e[i3].m1937a(RED.f8609f);
                                } else if (b < 0.67f) {
                                    newEnemyInfo.f7736e[i3].m1937a(ORANGE.f8567f);
                                } else {
                                    newEnemyInfo.f7736e[i3].m1937a(YELLOW.f8637f);
                                }
                                newEnemyInfo.f7736e[i3].m2130a(Math.round(b * 100.0f) + "%");
                            }
                            m7837w();
                            Enemy.m7594c(enemy2.f6914i);
                        }
                        enemy2.f6912g = (Path) this.f7179t.f6772p.m2291a(new Random().nextInt(this.f7179t.f6772p.f3001b));
                        enemy2.f6911f = Path.m7536a();
                        enemy2.f6913h = this.f7178s.f8675a;
                        this.f7179t.m7524a(enemy2);
                    }
                }
            }
            this.a.f6559C.mo365a();
            C0711a c2 = this.f7179t.f6769m.m2489c();
            while (c2.hasNext()) {
                Object obj3 = (Enemy) c2.next();
                Path path = obj3.f6912g;
                obj3.f6907b += ((obj3.mo1765e() / ((float) path.f6784e)) * ((float) t)) / 1000000.0f;
                if (obj3.f6907b >= 1.0f) {
                    if (!this.f7156U) {
                        i2 = obj3.mo1762k();
                        if (i2 > 0) {
                            this.f7171l.m8803c(i2);
                        }
                        Game.f6554h.m7582b(StatisticsType.ENEMIES_MISSED, 1);
                        Sound.m7569a(Sound.Type.FAIL);
                        if (this.f7171l.m8800a() <= 0) {
                            m7845a(obj3.f6914i);
                        } else {
                            this.f7182w.m8233b();
                            if (this.f7178s != null && this.f7178s.f8675a == obj3.f6913h) {
                                Wave wave2 = this.f7178s;
                                wave2.f8679e++;
                            }
                        }
                    }
                    this.f7179t.m7531c(obj3);
                } else if (obj3.f6907b >= 0.0f) {
                    Vector2 a2 = path.m7539a(obj3.f6907b, obj3.f6911f);
                    obj3.f6909d.f2337x = a2.f2337x;
                    obj3.f6909d.f2338y = a2.f2338y;
                    obj3.f6910e = path.f6787h[(int) (path.f6782c * obj3.f6907b)];
                    if (this.a.m7477t() - obj3.f6916k > 100000) {
                        obj3.f6916k = this.a.m7477t();
                        WalkableTile walkableTile = (WalkableTile) this.f7179t.f6760d[(int) (a2.f2338y / 64.0f)][(int) (a2.f2337x / 64.0f)];
                        if (obj3.f6915j != walkableTile) {
                            if (obj3.f6915j != null) {
                                obj3.f6915j.m8388a((Enemy) obj3);
                            }
                            synchronized (walkableTile.f7984p) {
                                walkableTile.f7984p.m2486a(obj3);
                            }
                            obj3.f6915j = walkableTile;
                            walkableTile.f7986r++;
                        }
                    }
                    obj3.mo1767a(t);
                } else {
                    Game.game.logger.m7510b("Enemy progress", obj3.f6907b);
                    this.f7179t.m7531c(obj3);
                }
            }
            if (!(this.f7153P == null || this.f7153P == this.f7154Q)) {
                this.a.f6559C.m1411a(f7140S, ((float) this.f7153P.f7968i) - 3.0f, ((float) this.f7153P.f7970k) - 3.0f);
            }
            if (this.f7154Q != null) {
                this.a.f6559C.m1411a(f7139R, ((float) this.f7154Q.f7968i) - 3.0f, ((float) this.f7154Q.f7970k) - 3.0f);
            }
            if (this.f7178s != null && Game.game.m7477t() - this.f7155T > 20000000) {
                this.f7155T = Game.game.m7477t();
                c = this.f7179t.f6768l.m2489c();
                while (c.hasNext()) {
                    tower = (Tower) c.next();
                    if (tower.f8030A != 0.0f) {
                        tower.m8455b(tower.f8030A);
                    }
                }
            }
            if (obj == null) {
                c = this.f7179t.f6768l.m2489c();
                while (c.hasNext()) {
                    ((Tower) c.next()).mo1821d((int) t);
                }
            } else if (this.f7179t.f6759c == 0) {
                c = this.f7179t.f6768l.m2489c();
                while (c.hasNext()) {
                    tower = (Tower) c.next();
                    tower.mo1821d((int) t);
                    if (tower.f8048j.l) {
                        tower.mo1838k();
                    }
                }
            } else if (this.f7179t.f6759c == 1) {
                c = this.f7179t.f6768l.m2489c();
                while (c.hasNext()) {
                    tower = (Tower) c.next();
                    tower.mo1821d((int) t);
                    if (tower.f8048j.l) {
                        tower.mo1838k();
                    }
                }
            } else if (this.f7179t.f6759c == 2) {
                c = this.f7179t.f6768l.m2489c();
                while (c.hasNext()) {
                    ((Tower) c.next()).mo1821d((int) t);
                }
            }
            if (obj != null) {
                c = this.f7179t.f6768l.m2489c();
                while (c.hasNext()) {
                    ((Tower) c.next()).mo1836c(f);
                }
            }
            this.a.f6559C.m1410a(C0430b.f1620c);
            this.a.f6559C.mo374c();
            Game.game.f6560D.m1456a(ShapeType.Filled);
            Gdx.gl.glEnable(3042);
            Gdx.gl.glBlendFunc(770, 771);
            if (!(this.f7154Q == null || this.f7154Q.f7962c == null)) {
                this.f7154Q.f7962c.mo1840a(this.f7146I);
            }
            if (!(this.f7153P == null || this.f7153P == this.f7154Q || this.f7153P.f7962c == null)) {
                this.f7153P.f7962c.mo1841b(this.f7146I);
            }
            if (this.f7145D != null) {
                this.f7145D.m8816a(this.f7146I);
                this.ab.m8816a(this.f7146I);
            }
            if (obj != null) {
                c = this.f7179t.f6768l.m2489c();
                while (c.hasNext()) {
                    ((Tower) c.next()).mo1839m();
                }
            }
            this.a.f6560D.m1451a();
            this.a.f6559C.mo365a();
            this.a.f6559C.m1410a(C0430b.f1620c);
            c = this.f7179t.f6769m.m2489c();
            while (c.hasNext()) {
                enemy = (Enemy) c.next();
                if (!enemy.mo1760j() && enemy.f6915j.l) {
                    enemy.mo1754a(f);
                }
            }
            c = this.f7179t.f6769m.m2489c();
            while (c.hasNext()) {
                enemy = (Enemy) c.next();
                if (enemy.mo1760j() && enemy.f6915j.l) {
                    enemy.mo1754a(f);
                }
            }
            this.a.f6559C.mo374c();
            this.a.f6559C.mo365a();
            this.a.f6559C.m1410a(C0430b.f1620c);
            ((C0475a) this.a.f6561E.f2087c.m2291a(0)).f1686z.m1129b(TextureFilter.Nearest, TextureFilter.Nearest);
            this.a.f6559C.mo368a(770, 1);
            int i5;
            Projectile projectile;
            if (obj == null || Game.game.f6583o) {
                this.f7157V.m2402f();
                i5 = this.f7157V.b;
                for (i2 = 0; i2 < i5; i2++) {
                    projectile = (Projectile) this.f7157V.m2291a(i2);
                    if (!projectile.mo1768b() && projectile.mo1770f()) {
                        projectile.mo1771g();
                    }
                    if (projectile.mo1769e()) {
                        projectile.mo1774j();
                        this.f7157V.mo527b(i2);
                    } else {
                        projectile.mo1772h();
                    }
                }
                this.f7157V.m2403g();
            } else {
                this.f7157V.m2402f();
                i5 = this.f7157V.b;
                for (i2 = 0; i2 < i5; i2++) {
                    projectile = (Projectile) this.f7157V.m2291a(i2);
                    if (!projectile.mo1768b() && projectile.mo1770f()) {
                        projectile.mo1771g();
                    }
                    if (projectile.mo1769e()) {
                        projectile.mo1774j();
                        this.f7157V.mo527b(i2);
                    } else {
                        projectile.mo1772h();
                        projectile.mo1773i();
                    }
                }
                this.f7157V.m2403g();
            }
            this.a.f6559C.mo374c();
            this.a.f6559C.m1410a(C0430b.f1620c);
            this.a.f6559C.mo368a(770, 771);
            if (obj2 != null) {
                this.a.f6559C.mo365a();
                c = this.f7179t.f6769m.m2489c();
                while (c.hasNext()) {
                    enemy = (Enemy) c.next();
                    if (enemy.f6915j.l) {
                        enemy.mo1761b();
                    }
                }
                this.a.f6559C.mo374c();
                this.a.f6559C.m1410a(C0430b.f1620c);
            }
            ((C0475a) this.a.f6561E.f2087c.m2291a(0)).f1686z.m1129b(TextureFilter.MipMapLinearNearest, TextureFilter.Linear);
            this.f7181v.m2002a(f);
            this.f7181v.m2001a();
            TileMenu tileMenu = this.f7183x;
            if (tileMenu.f7785f) {
                float f5 = tileMenu.f7781b.f2613g;
                if (tileMenu.f7786g == f5) {
                    tileMenu.f7785f = false;
                    return;
                }
                b = 3200.0f * f;
                float f6 = tileMenu.f7786g - f5;
                if (b >= Math.abs(f6)) {
                    tileMenu.f7785f = false;
                    tileMenu.f7781b.m1950b(tileMenu.f7786g);
                    return;
                }
                if (f6 < 0.0f) {
                    b = -b;
                }
                tileMenu.f7781b.m1950b(b + f5);
            }
        } else if (!this.f7168i.isAlive() && !this.f7167h) {
            this.f7167h = true;
            Gdx.input.mo304a(this.f7161Z);
            Game.game.f6584p = false;
            Game.game.f6585r = 0.0d;
            this.f7169j = true;
            this.f7180u = this.a.m7477t();
            this.f7182w.m8237e();
            if (!Game.game.f6564H.m8841b("viewedTutorial")) {
                m7867n();
                Game.game.f6564H.m8839b("viewedTutorial", "yup!");
                Game.game.f6564H.m8844d();
            }
            m7838x();
        }
    }

    /* renamed from: b */
    public final void mo1785b(Enemy enemy) {
        m7844a((AsyncUpdatable) enemy);
    }

    /* renamed from: b */
    public final void mo1786b(Tile tile) {
        this.f7153P = tile;
    }

    /* renamed from: b */
    public final void mo1787b(Tower tower) {
        m7844a((AsyncUpdatable) tower);
    }

    /* renamed from: c */
    public final void mo1788c(Tower tower) {
        if (this.f7183x.f7782c == tower.f8048j) {
            this.f7183x.m8274a();
        }
    }

    /* renamed from: d */
    public final void mo1778d() {
        super.mo1778d();
        for (Entry key : this.f7163d.entrySet()) {
            ((Thread) key.getKey()).interrupt();
        }
        this.f7163d = new HashMap();
        Map map = this.f7179t;
        map.f6770n.dispose();
        map.f6757a.dispose();
        this.f7181v.dispose();
        if (this.f7145D != null) {
            this.f7145D.dispose();
            this.ab.dispose();
        }
        Iterator it = this.f7157V.iterator();
        while (it.hasNext()) {
            ((Projectile) it.next()).mo1774j();
        }
        this.f7157V.mo530d();
        AirProjectile.f6993h.f1175d.mo530d();
        BasicProjectile.f7001i.f1175d.mo530d();
        CannonProjectile.f7005h.f1175d.mo530d();
        ChainLightningProjectile.f7020a.f1175d.mo530d();
        MissileProjectile.f7050a.f1175d.mo530d();
        MultishotProjectile.f7074h.f1175d.mo530d();
        SplashProjectile.f7082h.f1175d.mo530d();
        VenomProjectile.f7093h.f1175d.mo530d();
    }

    /* renamed from: d */
    public final void mo1789d(Tower tower) {
        this.f7179t.m7525a(tower.f8048j);
    }

    /* renamed from: f */
    public final int m7862f() {
        if (this.f7173n) {
            return 5000;
        }
        for (GlobalUpgradeType globalUpgradeType : f7136F) {
            if (GlobalUpgrade.m7492a(globalUpgradeType)) {
                return ((int) GlobalUpgrade.m7495c(globalUpgradeType).f6630u[0]) + 200;
            }
        }
        return 200;
    }

    /* renamed from: g */
    public final int m7863g() {
        if (this.f7173n) {
            return 50;
        }
        for (GlobalUpgradeType globalUpgradeType : f7137G) {
            if (GlobalUpgrade.m7492a(globalUpgradeType)) {
                return ((int) GlobalUpgrade.m7495c(globalUpgradeType).f6630u[0]) + 100;
            }
        }
        return 100;
    }

    /* renamed from: h */
    public final void m7864h() {
        int i = 0;
        if (this.f7173n) {
            GlobalUpgrade.m7491a(FilteringMode.ONLY_FILTERED, f7141b);
        } else {
            GlobalUpgrade.m7491a(FilteringMode.NONE, null);
        }
        this.f7147J = this.a.m7477t();
        this.f7155T = this.a.m7477t();
        this.f7177r = 15000000;
        for (GlobalUpgradeType globalUpgradeType : f7138H) {
            if (GlobalUpgrade.m7492a(globalUpgradeType)) {
                this.f7177r = (long) ((((int) GlobalUpgrade.m7495c(globalUpgradeType).f6630u[0]) * 1000) * 1000);
                break;
            }
        }
        this.f7182w = new GameGui(this);
        this.f7183x = new TileMenu(this);
        this.f7184y = new GameGoals(this);
        this.f7142A = new PauseMenu(this);
        this.f7144C = new Tutorial(this);
        this.f7143B = new NewEnemyInfo(this);
        this.f7185z = new Dialog(this.f7181v);
        this.f7182w.m8237e();
        this.f7146I = new C0507i((float) Gdx.graphics.mo294c(), (float) Gdx.graphics.mo295d());
        this.f7162c = new CameraController(this.f7146I, this.f7179t.f6766j, this.f7179t.f6767k);
        this.f7162c.m7421b(this.f7179t.f6766j / 2, this.f7179t.f6767k / 2);
        this.f7146I.mo429a();
        C0366h gameInputProcessor = new GameInputProcessor(this);
        gameInputProcessor.f6594a.put(this, Boolean.valueOf(true));
        Gdx.input.mo310e();
        this.f7161Z = new C0377g();
        this.f7161Z.m1082a(this.f7181v);
        this.f7161Z.m1082a(this.f7162c);
        this.f7161Z.m1082a(gameInputProcessor);
        Gdx.input.mo304a(null);
        this.f7163d = new HashMap();
        int availableProcessors = Runtime.getRuntime().availableProcessors() * 2;
        this.f7148K = new AsyncUpdater[availableProcessors];
        Game.game.logger.log("asyncUpdaters", "Thread count: " + availableProcessors);
        while (i < availableProcessors) {
            Runnable asyncUpdater = new AsyncUpdater(i);
            this.f7148K[i] = asyncUpdater;
            Thread thread = new Thread(asyncUpdater, "AU " + i + "-" + i);
            thread.setPriority(4);
            thread.start();
            this.f7163d.put(thread, asyncUpdater);
            i++;
        }
        this.f7162c.f6482m.put(new TileVisibilityHandler(this.f7179t), Boolean.valueOf(true));
        Game.game.f6563G.m7428a();
        this.f7150M = this.f7184y.m8218a("Daily quest");
        m7840z();
    }

    /* renamed from: l */
    public final void m7865l() {
        if (this.f7151N && !this.f7144C.f7818d) {
            this.f7151N = false;
            Game.game.f6585r = this.f7152O;
            Gdx.input.mo304a(this.f7161Z);
            this.f7142A.m8260b();
        }
    }

    public final void resume() {
        super.resume();
        if (this.f7179t != null) {
            this.f7179t.f6771o = true;
        }
    }

    /* renamed from: m */
    public final void m7866m() {
        if (this.f7151N) {
            m7865l();
            return;
        }
        m7837w();
        this.f7142A.m8259a();
    }

    /* renamed from: n */
    public final void m7867n() {
        this.aa = this.f7151N;
        m7837w();
        Tutorial tutorial = this.f7144C;
        tutorial.f7818d = true;
        tutorial.f7816b.f2611e = true;
        tutorial.m8295a(0);
    }

    /* renamed from: o */
    public final void m7868o() {
        Tutorial tutorial = this.f7144C;
        tutorial.f7818d = false;
        tutorial.f7816b.f2611e = false;
        tutorial.dispose();
        if (this.aa) {
            m7837w();
            this.f7142A.m8259a();
            return;
        }
        m7865l();
        this.f7142A.m8260b();
    }

    /* renamed from: p */
    public final void m7869p() {
        NewEnemyInfo newEnemyInfo = this.f7143B;
        newEnemyInfo.f7733b = false;
        newEnemyInfo.f7732a.f2611e = false;
        m7865l();
    }

    /* renamed from: q */
    public final void m7870q() {
        Game.game.f6563G.m7428a();
        Writer stringWriter = new StringWriter();
        try {
            ai a;
            ai a2 = new ai(stringWriter).m2374a("game");
            a2.m2375a("mode", this.f7164e.name());
            if (this.f7164e == GameMode.BASIC_LEVELS) {
                a = a2.m2374a("levelId");
                a.m2373a(String.valueOf(this.f7165f.f6443c));
                a.m2372a();
            } else if (this.f7164e == GameMode.USER_MAPS) {
                a = a2.m2374a("slotId");
                a.m2373a(String.valueOf(this.f7166g.f6867b));
                a.m2372a();
            }
            a = a2.m2374a("hardcoreMode");
            a.m2373a(String.valueOf(this.f7173n));
            a.m2372a();
            a = a2.m2374a("money");
            a.m2373a(String.valueOf(this.f7172m));
            a.m2372a();
            a = a2.m2374a("health");
            a.m2373a(String.valueOf(this.f7171l));
            a.m2372a();
            a = a2.m2374a("gameTime");
            a.m2373a(String.valueOf(this.f7174o));
            a.m2372a();
            a = a2.m2374a("lastWave");
            a.m2373a(String.valueOf(this.f7178s.f8675a));
            a.m2372a();
            ai a3 = a2.m2374a("towers");
            Iterator c = this.f7179t.f6768l.m2489c();
            while (c.hasNext()) {
                Tower tower = (Tower) c.next();
                ai a4 = a3.m2374a("t");
                a4.m2375a("x", Integer.valueOf(tower.f8048j.d));
                a4.m2375a("y", Integer.valueOf(tower.f8048j.e));
                a4.m2375a("t", tower.f8049k.name());
                a4.m2375a("as", Integer.valueOf(tower.f8050l));
                a4.m2375a("a", Float.valueOf(tower.f8053o));
                a4.m2375a("dg", Float.valueOf(tower.f8052n));
                a4.m2375a("mso", Integer.valueOf(tower.f8051m.m8800a()));
                a4.m2375a("e", Float.valueOf(tower.f8054p));
                String str = "";
                for (int i = 0; i < 4; i++) {
                    str = str + tower.f8058t[i] + ",";
                }
                a4.m2375a("ul", str);
                a4.m2372a();
            }
            a3.m2372a();
            ai a5 = a2.m2374a("enemies");
            Iterator c2 = this.f7179t.f6769m.m2489c();
            while (c2.hasNext()) {
                Enemy enemy = (Enemy) c2.next();
                a3 = a5.m2374a("e");
                a3.m2375a("t", enemy.f6914i.name());
                a3.m2375a("pi", Integer.valueOf(enemy.f6912g.f6785f));
                a3.m2375a("s", Float.valueOf(enemy.f6919n));
                a3.m2375a("h", Float.valueOf(enemy.f6917l));
                a3.m2375a("mh", Float.valueOf(enemy.f6918m));
                a3.m2375a("b", Integer.valueOf(enemy.f6920o));
                a3.m2375a("p", Float.valueOf(enemy.f6907b));
                a3.m2375a("wn", Integer.valueOf(enemy.f6913h));
                a3.m2375a("scm", Float.valueOf(enemy.f6930y));
                a3.m2372a();
            }
            a5.m2372a();
            a2.m2372a();
        } catch (Throwable e) {
            Game.game.logger.m7509a(e);
        }
        Game.game.f6564H.m8839b("savedGame", stringWriter.toString());
        Game.game.f6564H.m8844d();
    }

    /* renamed from: r */
    public final void m7871r() {
        if (this.f7145D != null) {
            this.f7145D.dispose();
        }
        if (this.ab != null) {
            this.ab.dispose();
        }
        this.f7145D = null;
        this.ab = null;
    }

    /* renamed from: s */
    public final void m7872s() {
        if ((!GlobalUpgrade.m7492a(GlobalUpgradeType.FORCE_WAVE_ABILITY) && this.f7179t.f6769m.f3187a != 0) || this.f7180u == -1) {
            return;
        }
        if (this.f7178s == null || this.f7178s.f8679e * 2 >= this.f7178s.f8678d) {
            int t = m7873t();
            Game.f6554h.m7582b(StatisticsType.COINS_GAINED, (long) t);
            Achievement.m7332a(Type.EARNED_COINS, ((Long) Game.f6554h.f6861c.m2467a(StatisticsType.COINS_GAINED)).intValue());
            m7841a(t);
            this.f7180u = -1;
            m7839y();
        }
    }

    /* renamed from: t */
    public final int m7873t() {
        if (this.f7180u == -1 || this.f7178s == null) {
            return 0;
        }
        if (!GlobalUpgrade.m7492a(GlobalUpgradeType.FORCE_WAVE_ABILITY)) {
            return 0;
        }
        float t = ((float) ((this.f7177r - (this.a.m7477t() - this.f7180u)) / 1000)) / 1000.0f;
        float f = 0.08f;
        for (GlobalUpgradeType globalUpgradeType : f7135E) {
            if (GlobalUpgrade.m7492a(globalUpgradeType)) {
                f = GlobalUpgrade.m7495c(globalUpgradeType).f6630u[0] / 100.0f;
                break;
            }
        }
        return (int) Math.ceil((double) (f * ((t / (((float) (this.f7177r / 1000)) / 1000.0f)) * ((float) this.f7178s.f8680f))));
    }

    /* renamed from: u */
    public final void m7874u() {
        double d = GlobalUpgrade.m7492a(GlobalUpgradeType.GAME_SPEED_X2) ? GlobalUpgrade.m7492a(GlobalUpgradeType.GAME_SPEED_X4) ? this.a.f6585r == 1.0d ? 2.0d : this.a.f6585r == 2.0d ? 4.0d : 1.0d : this.a.f6585r == 1.0d ? 2.0d : 1.0d : 1.0d;
        if (this.a.f6585r != d) {
            this.a.f6585r = d;
            if (d == 1.0d) {
                this.a.f6588u = 1.0f;
                this.a.f6587t = 65000;
            } else if (d == 2.0d) {
                this.a.f6588u = 1.04f;
                this.a.f6587t = 50000;
            } else {
                this.a.f6588u = 1.08f;
                this.a.f6587t = 35000;
            }
            this.f7182w.m8235c();
        }
    }

    /* renamed from: v */
    public final void m7875v() {
        Map map = this.f7179t;
        map.f6759c++;
        if (this.f7179t.f6759c == 3) {
            this.f7179t.f6759c = 0;
        }
        this.f7179t.f6771o = true;
        this.f7182w.m8234b(true);
    }
}
