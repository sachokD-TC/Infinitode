package com.prineside.tdi;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.C0350j.C0374b;
import com.badlogic.gdx.C0350j.C0516a;
import com.badlogic.gdx.C0350j.C0517c;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.C0473l;
import com.badlogic.gdx.graphics.g2d.C0480m;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.C0457b;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.p030b.C0429b;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.p010a.C0273e;
import com.badlogic.gdx.p018e.C0371a;
import com.badlogic.gdx.pay.C0581c;
import com.badlogic.gdx.pay.C0582e;
import com.badlogic.gdx.pay.C0583f;
import com.badlogic.gdx.pay.C0584g;
import com.badlogic.gdx.pay.C0585h;
import com.badlogic.gdx.pay.OfferType;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.C0636l;
import com.badlogic.gdx.utils.C0687c;
import com.badlogic.gdx.utils.C0691j;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.C0710q.C0707b;
import com.badlogic.gdx.utils.C0712r;
import com.badlogic.gdx.utils.C0728z;
import com.badlogic.gdx.utils.JsonWriter.OutputType;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.Statistics.StatisticsType;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.enemies.Enemy.EnemyType;
import com.prineside.tdi.projectiles.types.AirProjectile;
import com.prineside.tdi.projectiles.types.BasicProjectile;
import com.prineside.tdi.projectiles.types.CannonProjectile;
import com.prineside.tdi.projectiles.types.ChainLightningProjectile;
import com.prineside.tdi.projectiles.types.MissileProjectile;
import com.prineside.tdi.projectiles.types.MultishotProjectile;
import com.prineside.tdi.projectiles.types.SplashProjectile;
import com.prineside.tdi.projectiles.types.VenomProjectile;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.screens.GameScreen.C10962;
import com.prineside.tdi.screens.GameScreen.C10973;
import com.prineside.tdi.screens.GlobalUpgradesScreen;
import com.prineside.tdi.screens.LanguageSelectScreen;
import com.prineside.tdi.screens.LevelSelectScreen;
import com.prineside.tdi.screens.LoadingScreen;
import com.prineside.tdi.screens.MainMenuScreen;
import com.prineside.tdi.screens.MapEditorMapSelectScreen;
import com.prineside.tdi.screens.MapEditorScreen;
import com.prineside.tdi.screens.MoneyScreen;
import com.prineside.tdi.screens.SettingsScreen;
import com.prineside.tdi.screens.components.Tutorial;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.towers.Tower.TowerType;
import com.prineside.tdi.towers.TowerStat;
import com.prineside.tdi.towers.TowerUpgrade;
import com.prineside.tdi.utility.CheatSafeInt;
import com.prineside.tdi.utility.FastBadRandom;
import com.prineside.tdi.utility.MeshedCircle;
import com.prineside.tdi.utility.ObjectRetriever;
import com.prineside.tdi.utility.SafePreferences;
import com.prineside.tdi.waves.WaveTemplate;
import java.lang.Thread.UncaughtExceptionHandler;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public class Game extends com.badlogic.gdx.Game {
    /* renamed from: M */
    private static int f6543M = 0;
    /* renamed from: N */
    private static Thread f6544N;
    /* renamed from: X */
    private static float f6545X = 1.0f;
    /* renamed from: Y */
    private static final int[] f6546Y = new int[]{24, 30, 36, 48, 60, 192};
    /* renamed from: Z */
    private static final int[] f6547Z = new int[]{18, 24, 30, 36, 48, 60};
    /* renamed from: b */
    public static final int[] f6548b = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    /* renamed from: c */
    public static int f6549c = 2048;
    /* renamed from: d */
    public static UncaughtExceptionHandler f6550d = new C10561();
    /* renamed from: e */
    public static C0691j f6551e;
    /* renamed from: f */
    public static Game game;
    /* renamed from: g */
    public static GameScreen f6553g;
    /* renamed from: h */
    public static Statistics f6554h;
    /* renamed from: i */
    public static boolean f6555i = false;
    /* renamed from: q */
    public static C0430b f6556q = new C0430b(303174399);
    /* renamed from: A */
    public boolean f6557A = false;
    /* renamed from: B */
    public C0273e f6558B;
    /* renamed from: C */
    public C0473l f6559C;
    /* renamed from: D */
    public ShapeRenderer f6560D;
    /* renamed from: E */
    public C0480m f6561E;
    /* renamed from: F */
    public C0438n f6562F;
    /* renamed from: G */
    public DailyQuest f6563G;
    /* renamed from: H */
    public SafePreferences f6564H;
    /* renamed from: I */
    public SafePreferences preferences;
    /* renamed from: J */
    public ActionResolver f6566J;
    /* renamed from: K */
    public String f6567K = "";
    /* renamed from: L */
    public C0728z<GameListener> f6568L = new C0728z();
    /* renamed from: O */
    private String f6569O = "Loading...";
    /* renamed from: P */
    private C0438n f6570P;
    /* renamed from: Q */
    private long f6571Q;
    /* renamed from: R */
    private long f6572R;
    /* renamed from: S */
    private long f6573S = 0;
    /* renamed from: T */
    private GameSyncLoader gameSyncLoader;
    /* renamed from: U */
    private Matrix4 f6575U;
    /* renamed from: V */
    private Matrix4 f6576V;
    /* renamed from: W */
    private BitmapFont f6577W;
    private FreeTypeFontGenerator aa;
    private String ab = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ 0123456789@&~:-=?!#*()[]%$<>/,.+|_'\"";
    private C0710q<Integer, BitmapFont> ac;
    private C0710q<Integer, BitmapFont> ad;
    private String ae;
    /* renamed from: j */
    public C0429b f6578j;
    /* renamed from: k */
    public boolean f6579k = false;
    /* renamed from: l */
    public boolean f6580l = true;
    /* renamed from: m */
    public boolean f6581m = false;
    /* renamed from: n */
    public boolean f6582n = false;
    /* renamed from: o */
    public boolean f6583o = false;
    /* renamed from: p */
    public boolean f6584p = false;
    /* renamed from: r */
    public double f6585r = 1.0d;
    /* renamed from: s */
    public boolean f6586s = false;
    /* renamed from: t */
    public long f6587t = 75000;
    /* renamed from: u */
    public float f6588u = 1.0f;
    /* renamed from: v */
    public final Logger logger;
    /* renamed from: w */
    public CheatSafeInt f6590w;
    /* renamed from: x */
    public CheatSafeInt f6591x;
    /* renamed from: y */
    public CheatSafeInt f6592y;
    /* renamed from: z */
    public boolean f6593z;

    public Game() {
        logger = new Logger();
    }

    /* renamed from: com.prineside.tdi.Game$1 */
    static class C10561 implements UncaughtExceptionHandler {
        C10561() {
        }

        public final void uncaughtException(Thread thread, Throwable th) {
            System.out.println("Handling uncaught exception in thread " + thread.getName());
            if (com.prineside.tdi.Game.game != null) {
                com.prineside.tdi.Game.game.logger.m7508a("Uncaught exception in thread " + thread.getName(), th);
            } else {
                new Logger().m7508a("Uncaught exception in thread " + thread.getName(), th);
            }
            Gdx.app.error("Exception", "Uncaught exception in thread " + thread.getName());
            th.printStackTrace();
            throw new RuntimeException(th);
        }
    }

    /* renamed from: com.prineside.tdi.Game$2 */
    class C10572 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ Game game;

        C10572(Game game) {
            this.game = game;
        }

        public void run() {
            SafePreferences.m8836a();
            this.game.f6564H = SafePreferences.m8835a("Progress");
            this.game.preferences = SafePreferences.m8835a("Settings");
            if (this.game.preferences.m8841b("soundEnabled")) {
                String a = this.game.preferences.m8838a("soundEnabled", "false");
                this.game.f6580l = a.equals("true");
                if (this.game.f6580l) {
                    com.prineside.tdi.Game.game.logger.log("Game", "Sound enabled by settings");
                }
            }
            if (this.game.preferences.m8841b("upgradeAllButtonEnabled")) {
                String a = this.game.preferences.m8838a("upgradeAllButtonEnabled", "false");
                this.game.f6581m = a.equals("true");
                if (this.game.f6581m) {
                    com.prineside.tdi.Game.game.logger.log("Game", "Fast upgrade button enabled by settings");
                }
            }
            if (this.game.preferences.m8841b("explosionsDrawingDisabled")) {
                String a = this.game.preferences.m8838a("explosionsDrawingDisabled", "false");
                this.game.f6582n = a.equals("true");
                if (this.game.f6582n) {
                    com.prineside.tdi.Game.game.logger.log("Game", "Explosions drawing disabled by settings");
                }
            }
            if (this.game.preferences.m8841b("projectilesDrawingDisabled")) {
                String a = this.game.preferences.m8838a("projectilesDrawingDisabled", "false");
                this.game.f6583o = a.equals("true");
                if (this.game.f6583o) {
                    com.prineside.tdi.Game.game.logger.log("Game", "Projectiles drawing disabled by settings");
                }
            }
            try {
                IntBuffer b = BufferUtils.m2246b(16);
                Gdx.gl20.glGetIntegerv(3379, b);
                com.prineside.tdi.Game.f6549c = b.get();
                com.prineside.tdi.Game.game.logger.log("Game", "Max texture size: " + com.prineside.tdi.Game.f6549c);
            } catch (Exception e) {
                com.prineside.tdi.Game.game.logger.log("Game", "Failed to retrieve Max texture size");
            }
        }
    }

    /* renamed from: com.prineside.tdi.Game$3 */
    class C10583 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ Game f6531a;

        C10583(Game game) {
            this.f6531a = game;
        }

        public void run() {
            Language.m7503a();
            Locale locale = Locale.getDefault();
            if (this.f6531a.preferences.m8841b("locale")) {
                String[] split = this.f6531a.preferences.m8838a("locale", "en_US").split("_");
                if (split.length == 2) {
                    locale = new Locale(split[0], split[1]);
                } else {
                    this.f6531a.preferences.m8843c("locale");
                    this.f6531a.preferences.m8844d();
                }
            }
            com.prineside.tdi.Game.f6551e = C0691j.m2412a(Gdx.files.mo277b("i18n/MainBundle"), locale);
            this.f6531a.m7476s();
            com.prineside.tdi.Game.game.logger.log("i18n", "Locale set to: " + locale.getLanguage() + "_" + locale.getCountry());
            com.prineside.tdi.Game.game.logger.log("i18n", "Real locale set to: " + com.prineside.tdi.Game.f6551e.f3086a.getLanguage() + "_" + com.prineside.tdi.Game.f6551e.f3086a.getCountry());
        }
    }

    /* renamed from: com.prineside.tdi.Game$4 */
    class C10594 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ Game f6532a;

        C10594(Game game) {
            this.f6532a = game;
        }

        public void run() {
            FreeTypeFontGenerator.m1378b(com.prineside.tdi.Game.f6549c);
            this.f6532a.aa = new FreeTypeFontGenerator(Gdx.files.mo277b("font.ttf"));
        }
    }

    /* renamed from: com.prineside.tdi.Game$6 */
    class C10616 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ Game f6535a;

        C10616(Game game) {
            this.f6535a = game;
        }

        public void run() {
            this.f6535a.f6561E = new C0480m("textures/all.pack");
            this.f6535a.f6562F = this.f6535a.f6561E.m1442a("blank");
            if (this.f6535a.f6562F == null) {
                Pixmap pixmap = new Pixmap(1, 1, Format.RGBA8888);
                pixmap.m1117a(C0430b.f1620c);
                pixmap.m1111a();
                this.f6535a.f6562F = new C0438n(new Texture(pixmap));
                return;
            }
            float f = ((this.f6535a.f6562F.f1682C - this.f6535a.f6562F.f1680A) * 0.5f) + this.f6535a.f6562F.f1680A;
            float f2 = ((this.f6535a.f6562F.f1683D - this.f6535a.f6562F.f1681B) * 0.5f) + this.f6535a.f6562F.f1681B;
            this.f6535a.f6562F.mo354c(f);
            this.f6535a.f6562F.mo357e(f);
            this.f6535a.f6562F.mo356d(f2);
            this.f6535a.f6562F.mo358f(f2);
        }
    }

    /* renamed from: com.prineside.tdi.Game$7 */
    class C10627 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ Game f6536a;

        C10627(Game game) {
            this.f6536a = game;
        }

        public void run() {
            Sound.m7567a();
        }
    }

    /* renamed from: com.prineside.tdi.Game$8 */
    class C10648 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ Game f6538a;

        /* renamed from: com.prineside.tdi.Game$8$1 */
        class C10631 implements C0583f {
            /* renamed from: a */
            final /* synthetic */ C10648 f6537a;

            C10631(C10648 c10648) {
                this.f6537a = c10648;
            }

            /* renamed from: a */
            public final void mo1742a() {
                com.prineside.tdi.Game.game.logger.log("PurchaseObserver", "Installed");
                this.f6537a.f6538a.f6579k = true;
            }

            /* renamed from: a */
            public final void mo1743a(C0585h c0585h) {
                com.prineside.tdi.Game.game.logger.log("PurchaseObserver", "handlePurchase " + c0585h.f2527a);
                com.prineside.tdi.Game.game.logger.log("Purchase: ", c0585h.f2527a);
                if (c0585h.f2527a.equals("pack_small")) {
                    com.prineside.tdi.Game.game.m7454b(25000);
                } else if (c0585h.f2527a.equals("pack_medium")) {
                    com.prineside.tdi.Game.game.m7454b(200000);
                } else if (c0585h.f2527a.equals("pack_large")) {
                    com.prineside.tdi.Game.game.m7454b(1000000);
                } else if (c0585h.f2527a.equals("double_gain")) {
                    com.prineside.tdi.Game.game.m7475r();
                }
                Sound.m7569a(Type.SUCCESS);
                Iterator it = this.f6537a.f6538a.f6568L.iterator();
                while (it.hasNext()) {
                    ((GameListener) it.next()).mo1717h();
                }
            }

            /* renamed from: a */
            public final void mo1744a(Throwable th) {
                com.prineside.tdi.Game.game.logger.log("PurchaseObserver", "Installation error: " + th.getMessage());
            }

            /* renamed from: a */
            public final void mo1745a(C0585h[] c0585hArr) {
                com.prineside.tdi.Game.game.logger.log("PurchaseObserver", "handleRestore");
                for (C0585h c0585h : c0585hArr) {
                    com.prineside.tdi.Game.game.logger.log("Restore: ", c0585h.f2527a);
                    if (c0585h.f2527a.equals("double_gain")) {
                        com.prineside.tdi.Game.game.m7475r();
                    }
                }
                Iterator it = this.f6537a.f6538a.f6568L.iterator();
                while (it.hasNext()) {
                    ((GameListener) it.next()).mo1718i();
                }
            }

            /* renamed from: b */
            public final void mo1746b() {
                com.prineside.tdi.Game.game.logger.m7510b("PurchaseObserver", "handleRestoreError");
            }

            /* renamed from: b */
            public final void mo1747b(Throwable th) {
                com.prineside.tdi.Game.game.logger.log("PurchaseObserver", "handlePurchaseError");
                com.prineside.tdi.Game.game.logger.m7509a(th);
                C0584g.m1876d();
                Sound.m7569a(Type.FAIL);
                Iterator it = this.f6537a.f6538a.f6568L.iterator();
                while (it.hasNext()) {
                    ((GameListener) it.next()).mo1717h();
                }
            }

            /* renamed from: c */
            public final void mo1748c() {
                com.prineside.tdi.Game.game.logger.log("PurchaseObserver", "handlePurchaseCanceled");
                Iterator it = this.f6537a.f6538a.f6568L.iterator();
                while (it.hasNext()) {
                    ((GameListener) it.next()).mo1717h();
                }
            }
        }

        C10648(Game game) {
            this.f6538a = game;
        }

        public void run() {
            C0584g.m1877e();
            if (C0584g.m1874b()) {
                com.prineside.tdi.Game.game.logger.log("Pay", "Has manager!");
                C0582e c0582e = new C0582e();
                c0582e.m1860a(new C0581c().m1854a(OfferType.CONSUMABLE).m1855a("pack_small"));
                c0582e.m1860a(new C0581c().m1854a(OfferType.CONSUMABLE).m1855a("pack_medium"));
                c0582e.m1860a(new C0581c().m1854a(OfferType.CONSUMABLE).m1855a("pack_large"));
                c0582e.m1860a(new C0581c().m1854a(OfferType.ENTITLEMENT).m1855a("double_gain"));
                c0582e.m1861a("GooglePlay", C0687c.m2390b("TUlJQklqQU5CZ2txaGtpRzl3MEJBUUVGQUFPQ0FROEFNSUlCQ2dLQ0FRRUF2VHJxSGNGZnVUK01rUTEydG1sNHJTbWY3b3VSbUMrRDZUMENJV2ZwaUU2Uk5rdUJGR2tVYlg4dk9haDY0Nm4wd2h6d2xKdGVKZVZKS0JEMnlyL0toYmIzb0RpY3lBNmdmNVB4NVdmSTkyUXYybmVEVG1nMDJzRU1wUzU0UFlWOTN4ZFZia1htTFVvRmExcWdGd0ZCYUhkVU42bWtRY0NCRWpVRDFKNjVrSjVXRndLSjlBL1Z4ZktZN0JucC9MRnBjWDJtVWduT2VXRGdNL1ZRSW1wVTQrVFhjM0Zva1UwOW9sOVhnaUdWMWtLK3lIUVJQMlRXNnpjaWw5WURXYnBXT2VtV3JOMWM0R2EwVnNRdk02SDcybDFhVjRZUCtBNXNHeFhzTFB3NFZkTUtEVWJlRW5QeFRtMlMrUG16N0QwSzFxZUxoOGZ3dEQ2THlwN0JFZXpj") + "/QIDAQAB");
                C0584g.m1871a(new C10631(this), c0582e);
                return;
            }
            com.prineside.tdi.Game.game.logger.log("Pay", "Has NO manager");
        }
    }

    /* renamed from: com.prineside.tdi.Game$9 */
    class C10659 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ Game f6539a;

        C10659(Game game) {
            this.f6539a = game;
        }

        public void run() {
            FastBadRandom.m8808a();
        }
    }

    public enum GameMode {
        BASIC_LEVELS,
        USER_MAPS
    }

    public Game(ActionResolver actionResolver) {
        game = this;
        this.logger = new Logger();
        this.f6566J = actionResolver;
    }

    /* renamed from: i */
    private void m7444i(int i) {
        this.f6590w.m8801a(i);
        this.f6564H.m8839b("money", String.valueOf(i));
        this.f6564H.m8844d();
        Iterator it = this.f6568L.iterator();
        while (it.hasNext()) {
            ((GameListener) it.next()).mo1713c();
        }
    }

    /* renamed from: k */
    public static void m7445k() {
        if ((Thread.currentThread() == f6544N ? 1 : null) == null) {
            game.logger.m7510b("Threading", "Method must be called only in main thread!");
            game.logger.m7509a(new Exception());
        }
    }

    /* renamed from: a */
    public final void create() {
        f6544N = Thread.currentThread();
        this.f6571Q = System.nanoTime() / 1000;
        f6544N.setUncaughtExceptionHandler(f6550d);
        this.f6558B = new C0273e();
        Gdx.input.mo310e();
        this.f6560D = new ShapeRenderer();
        this.f6576V = new Matrix4(this.f6560D.f2112c);
        this.f6559C = new C0473l();
        this.f6575U = new Matrix4(this.f6559C.f2026h);
        this.f6577W = new BitmapFont();
        this.f6577W.m1334a(C0430b.f1620c);
        float d = ((float) Gdx.graphics.mo295d()) / 1000.0f;
        f6545X = d;
        if (d > 1.0f) {
            f6545X = 1.0f;
        }
        if (f6545X < 0.5f) {
            f6545X = 0.5f;
        }
        game.logger.log("Game", "screen size " + Gdx.graphics.mo294c() + "x" + Gdx.graphics.mo295d());
        game.logger.log("Game", "fontDisplayScale " + f6545X);
        this.ac = new C0710q();
        this.ad = new C0710q();
        game.logger.log("Game", "Player ID: " + m7464g());
        this.gameSyncLoader = new GameSyncLoader();
        this.gameSyncLoader.m7486a(new C10572(this), "Settings...");
        this.gameSyncLoader.m7486a(new C10583(this), "Internationalization...");
        this.gameSyncLoader.m7486a(new C10594(this), "Fonts...");
        for (final int i : f6546Y) {
            this.gameSyncLoader.m7486a(new FintSyncLoadingRunnable(this), "Fonts: size " + i + "...");
        }
        this.gameSyncLoader.m7486a(new C10616(this), "Textures...");
        this.gameSyncLoader.m7486a(new C10627(this), "Sounds...");
        this.gameSyncLoader.m7486a(new C10648(this), "Payments...");
        this.gameSyncLoader.m7486a(new C10659(this), "Random generator...");
        this.gameSyncLoader.m7486a(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ Game f6511a;

            {
                this.f6511a = r1;
            }

            public void run() {
                BasicLevel.m7405a();
            }
        }, "Basic levels...");
        this.gameSyncLoader.m7486a(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ Game f6512a;

            {
                this.f6512a = r1;
            }

            public void run() {
                this.f6512a.m7467i();
                try {
                    Something.m7542a();
                } catch (Exception e) {
                    com.prineside.tdi.Game.game.logger.log("Game", "Something was not init");
                }
                this.f6512a.f6570P = this.f6512a.f6561E.m1442a("loading-icon");
            }
        }, "Initialization...");
        this.gameSyncLoader.m7486a(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ Game f6513a;

            {
                this.f6513a = r1;
            }

            public void run() {
                MeshedCircle.m8813a();
            }
        }, "Shaders...");
        this.gameSyncLoader.m7486a(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ Game f6514a;

            {
                this.f6514a = r1;
            }

            public void run() {
                com.prineside.tdi.Game.f6554h = new Statistics();
            }
        }, "Statistics...");
        this.gameSyncLoader.m7486a(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ Game f6515a;

            {
                this.f6515a = r1;
            }

            public void run() {
                Enemy.m7592a();
            }
        }, "Enemies...");
        this.gameSyncLoader.m7486a(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ Game f6516a;

            {
                this.f6516a = r1;
            }

            public void run() {
                WaveTemplate.m8850a();
            }
        }, "Enemy wave templates...");
        this.gameSyncLoader.m7486a(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ Game f6517a;

            {
                this.f6517a = r1;
            }

            public void run() {
                Tile.m8369a();
            }
        }, "Tiles...");
        this.gameSyncLoader.m7486a(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ Game f6518a;

            {
                this.f6518a = r1;
            }

            public void run() {
                FlyingCoin.m7430a();
            }
        }, "Flying coins...");
        this.gameSyncLoader.m7486a(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ Game f6519a;

            {
                this.f6519a = r1;
            }

            public void run() {
                TowerStat.m8485a();
            }
        }, "Tower stats...");
        this.gameSyncLoader.m7486a(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ Game f6520a;

            {
                this.f6520a = r1;
            }

            public void run() {
                TowerUpgrade.m8490a();
            }
        }, "Tower upgrades...");
        this.gameSyncLoader.m7486a(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ Game f6521a;

            {
                this.f6521a = r1;
            }

            public void run() {
                GlobalUpgradeCategory.m7502a();
                GlobalUpgrade.m7489a();
            }
        }, "Global upgrades...");
        this.gameSyncLoader.m7486a(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ Game f6522a;

            {
                this.f6522a = r1;
            }

            public void run() {
                Tower.m8432a();
            }
        }, "Towers...");
        this.gameSyncLoader.m7486a(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ Game f6523a;

            {
                this.f6523a = r1;
            }

            public void run() {
                Tutorial.m8291a();
            }
        }, "Tutorial...");
        this.gameSyncLoader.m7486a(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ Game f6524a;

            {
                this.f6524a = r1;
            }

            public void run() {
                BasicProjectile.m7734c();
                CannonProjectile.m7741c();
                VenomProjectile.m7803c();
                SplashProjectile.m7791m();
                MultishotProjectile.m7781m();
                AirProjectile.m7727c();
                ChainLightningProjectile.m7750k();
                MissileProjectile.m7766k();
            }
        }, "Projectiles...");
        this.gameSyncLoader.m7486a(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ Game f6525a;

            {
                this.f6525a = r1;
            }

            public void run() {
                GameScreen.m7833e();
                MapEditorScreen.m8118e();
            }
        }, "Screens...");
        this.gameSyncLoader.m7486a(new Runnable(this) {
            /* renamed from: a */
            final /* synthetic */ Game f6526a;

            {
                this.f6526a = r1;
            }

            public void run() {
                this.f6526a.f6563G = new DailyQuest();
            }
        }, "Daily quests...");
        if (Gdx.app.getType() == ApplicationType.iOS) {
            this.gameSyncLoader.m7486a(new Runnable(this) {
                /* renamed from: a */
                final /* synthetic */ Game f6527a;

                {
                    this.f6527a = r1;
                }

                public void run() {
                    this.f6527a.f6566J.mo1720a();
                }
            }, "Connecting to Game Center...");
        }
        if (getScreen() != null) {
            getScreen().mo1778d();
        }
        setScreen(new LoadingScreen(this.gameSyncLoader));
    }

    /* renamed from: a */
    public final void m7447a(int i) {
        if (UserMap.m7585a(i)) {
            if (getScreen() != null) {
                getScreen().mo1778d();
            }
            UserMap b = UserMap.m7586b(i);
            MapListener gameScreen = new GameScreen();
            f6553g = gameScreen;
            gameScreen.f7164e = GameMode.USER_MAPS;
            gameScreen.f7166g = b;
            gameScreen.f7179t = b.m7588c();
            gameScreen.f7179t.m7523a(gameScreen);
            gameScreen.f7172m.m8801a(gameScreen.m7862f());
            gameScreen.f7171l.m8801a(gameScreen.m7863g());
            gameScreen.m7864h();
            game.logger.log("GameScreen", "Starting async screen loader...");
            game.m7469l();
            gameScreen.f7168i = new Thread(new C10973(gameScreen));
            gameScreen.f7168i.start();
            setScreen(f6553g);
        }
    }

    /* renamed from: a */
    public final void m7448a(int i, int i2, int i3, C0710q<TowerType, Long> c0710q, C0710q<TowerType, Long> c0710q2, EnemyType enemyType, boolean z) {
        if (f6555i && f6554h != null && !this.f6566J.mo1737k()) {
            try {
                C0707b c0707b;
                C0516a c0516a = new C0516a("POST");
                c0516a.f2304b = "http://infinitode.prineside.com/?m=api&a=playerGameStatsReport";
                Map hashMap = new HashMap();
                C0636l c0636l = new C0636l();
                c0636l.f2885b = null;
                c0636l.f2887d = OutputType.json;
                String str = (("[main]\n" + "OS:" + Gdx.app.getType().name() + "\n") + "VERSION:66\n") + "PLAYERID:" + game.m7464g() + "\n";
                Iterator b = f6554h.f6861c.mo544b();
                String str2 = str;
                while (b.hasNext()) {
                    c0707b = (C0707b) b.next();
                    str2 = str2 + ((StatisticsType) c0707b.f3163a).name() + ":" + c0707b.f3164b + "\n";
                }
                str = ((((str2 + "[gameStats]\n") + "BASIC_LEVEL_ID:" + i + "\n") + "COMPLETED_WAVES:" + i2 + "\n") + "PLAY_TIME:" + i3 + "\n") + "HARDCORE_MODE:" + String.valueOf(z) + "\n";
                if (enemyType != null) {
                    str = str + "LAST_ENEMY:" + enemyType.name() + "\n";
                }
                str = str + "[gameTowerDamage]\n";
                b = c0710q.mo544b();
                str2 = str;
                while (b.hasNext()) {
                    c0707b = (C0707b) b.next();
                    str2 = str2 + ((TowerType) c0707b.f3163a).name() + ":" + c0707b.f3164b + "\n";
                }
                str = str2 + "[gameTowerSpentMoney]\n";
                b = c0710q2.mo544b();
                str2 = str;
                while (b.hasNext()) {
                    c0707b = (C0707b) b.next();
                    str2 = str2 + ((TowerType) c0707b.f3163a).name() + ":" + c0707b.f3164b + "\n";
                }
                hashMap.put("report", str2);
                c0516a.f2307e = C0371a.m1073a(hashMap);
                Gdx.net.mo313a(c0516a, new C0517c(this) {
                    /* renamed from: a */
                    final /* synthetic */ Game f6529a;

                    {
                        this.f6529a = r1;
                    }

                    /* renamed from: a */
                    public final void mo1740a(C0374b c0374b) {
                    }

                    /* renamed from: a */
                    public final void mo1741a(Throwable th) {
                    }
                });
            } catch (Exception e) {
                game.logger.log("GameStatReport", "Failed (" + e.getMessage() + ")");
            }
        }
    }

    /* renamed from: a */
    public final void m7449a(BasicLevel basicLevel, boolean z) {
        if (getScreen() != null) {
            getScreen().mo1778d();
        }
        MapListener gameScreen = new GameScreen();
        f6553g = gameScreen;
        gameScreen.f7164e = GameMode.BASIC_LEVELS;
        gameScreen.f7173n = z;
        gameScreen.f7165f = basicLevel;
        gameScreen.f7179t = gameScreen.f7165f.m7410c();
        gameScreen.f7179t.m7523a(gameScreen);
        gameScreen.f7172m.m8801a(gameScreen.m7862f());
        gameScreen.f7171l.m8801a(gameScreen.m7863g());
        gameScreen.m7864h();
        game.logger.log("GameScreen", "Starting async screen loader...");
        game.m7469l();
        gameScreen.f7168i = new Thread(new C10962(gameScreen));
        gameScreen.f7168i.start();
        setScreen(f6553g);
    }

    /* renamed from: a */
    public final void m7450a(GameListener gameListener) {
        if (!this.f6568L.m2302b((Object) gameListener)) {
            this.f6568L.m2296a((Object) gameListener);
        }
    }

    /* renamed from: a */
    public final void m7451a(String str) {
        int i;
        Iterator it = Language.f6744a.iterator();
        while (it.hasNext()) {
            if (((Language) it.next()).f6746c.equals(str)) {
                i = 1;
                break;
            }
        }
        i = 0;
        if (i == 0) {
            game.logger.m7510b("Game#setLocale", "Invalid locale: " + str);
            return;
        }
        SafePreferences a = SafePreferences.m8835a("Settings");
        a.m8839b("locale", str);
        a.m8844d();
        String[] split = str.split("_");
        f6551e = C0691j.m2412a(Gdx.files.mo277b("i18n/MainBundle"), new Locale(split[0], split[1]));
        m7476s();
        game.logger.log("Settings", "Locale set to '" + str + "'");
    }

    /* renamed from: a */
    public final void m7452a(boolean z, int i) {
        if (getScreen() != null) {
            getScreen().mo1778d();
        }
        setScreen(new LevelSelectScreen(z, i));
    }

    /* renamed from: b */
    public final void render() {
        try {
            Gdx.gl.glClearColor(f6556q.f1644I, f6556q.f1645J, f6556q.f1646K, f6556q.f1647L);
            Gdx.gl.glClear(16384);
            super.render();
            if (this.f6584p) {
                Gdx.gl.glClearColor(f6556q.f1644I, f6556q.f1645J, f6556q.f1646K, f6556q.f1647L);
                Gdx.gl.glClear(16384);
                if (this.f6570P != null) {
                    this.f6559C.mo372a(new Matrix4().m1688a((1200.0f / ((float) Gdx.graphics.mo295d())) * ((float) Gdx.graphics.mo294c()), 1200.0f));
                    this.f6559C.mo365a();
                    this.f6559C.m1410a(C0430b.f1622e);
                    this.f6559C.mo371a(this.f6570P, 32.0f, 32.0f, 32.0f, 32.0f, 64.0f, 64.0f, 1.0f, 1.0f, (((float) (m7478u() % 1000000)) / 1000000.0f) * 360.0f);
                    BitmapFont g = m7463g(36);
                    if (g != null) {
                        g.m1334a(C0430b.f1622e);
                        g.m1330a(this.f6559C, this.f6569O, 128.0f, 74.0f);
                    }
                    this.f6559C.mo374c();
                }
            }
        } catch (Throwable e) {
            f6550d.uncaughtException(Thread.currentThread(), e);
        }
    }

    /* renamed from: b */
    public final void m7454b(int i) {
        m7444i(this.f6590w.m8800a() + i);
    }

    /* renamed from: b */
    public final void m7455b(GameListener gameListener) {
        if (this.f6568L.m2302b((Object) gameListener)) {
            this.f6568L.mo529b((Object) gameListener, true);
        }
    }

    /* renamed from: c */
    public final void pause() {
        super.pause();
        game.logger.log("Game", "Paused");
        this.f6586s = true;
        if (f6554h != null) {
            f6554h.m7580a();
        }
    }

    /* renamed from: c */
    public final boolean m7457c(int i) {
        int a = this.f6590w.m8800a();
        if (a < i) {
            return false;
        }
        m7444i(a - i);
        return true;
    }

    /* renamed from: d */
    public final void resume() {
        super.resume();
        game.logger.log("Game", "Resumed");
        this.f6586s = false;
    }

    /* renamed from: d */
    public final void m7459d(int i) {
        this.f6591x.m8801a(i);
        this.f6564H.m8839b("materials", String.valueOf(i));
        this.f6564H.m8844d();
    }

    /* renamed from: e */
    public final void dispose() {
        super.dispose();
        game.logger.log("Game", "Disposed");
        if (f6554h != null) {
            f6554h.m7580a();
        }
        this.f6558B.dispose();
        FlyingCoin.m7431b();
    }

    /* renamed from: e */
    public final void m7461e(int i) {
        m7459d(this.f6591x.m8800a() + i);
    }

    /* renamed from: f */
    public final void m7462f(int i) {
        if (this.f6592y.m8800a() >= i) {
            game.logger.log("GlobalHighestWave", "It's not a highest score...");
            return;
        }
        this.f6592y.m8801a(i);
        this.f6564H.m8839b("globalHighestWave", String.valueOf(i));
        this.f6564H.m8844d();
        Iterator it = this.f6568L.iterator();
        while (it.hasNext()) {
            ((GameListener) it.next()).mo1714e();
        }
    }

    /* renamed from: g */
    public final BitmapFont m7463g(int i) {
        if (this.ac.m2474c(Integer.valueOf(i))) {
            return (BitmapFont) this.ac.m2467a(Integer.valueOf(i));
        }
        game.logger.log("Game", "Creating normal font instance with size " + i);
        float f = f6545X;
        if (i < 36) {
            f = 1.0f;
        }
        C0457b c0457b = new C0457b();
        c0457b.f1953a = (int) (f * ((float) i));
        game.logger.log("Game", "Parameter size " + c0457b.f1953a);
        float f2 = ((float) i) / ((float) c0457b.f1953a);
        if (i < 100) {
            c0457b.f1968p = this.f6567K;
        } else {
            c0457b.f1968p = "0123456789 ";
        }
        c0457b.f1957e = 0.65f;
        c0457b.f1973u = TextureFilter.Linear;
        c0457b.f1974v = TextureFilter.Linear;
        BitmapFont a = this.aa.m1380a(c0457b);
        game.logger.log("Game", "Font scale " + f2);
        a.f1821a.m1324a(f2, f2);
        this.ac.mo542a(Integer.valueOf(i), a);
        a.f1821a.f1798p = true;
        return a;
    }

    /* renamed from: g */
    public final String m7464g() {
        if (this.ae == null) {
            SafePreferences a;
            try {
                a = SafePreferences.m8835a("Settings");
                if (a.m8841b("playerid")) {
                    this.ae = a.m8838a("playerid", null);
                }
            } catch (Exception e) {
                this.ae = null;
            }
            if (this.ae == null) {
                this.ae = FastBadRandom.m8812d();
                try {
                    a = SafePreferences.m8835a("Settings");
                    a.m8839b("playerid", this.ae);
                    a.m8844d();
                } catch (Exception e2) {
                }
            }
        }
        return this.ae;
    }

    /* renamed from: h */
    public final BitmapFont m7465h(int i) {
        if (this.ad.m2474c(Integer.valueOf(i))) {
            return (BitmapFont) this.ad.m2467a(Integer.valueOf(i));
        }
        game.logger.log("Game", "Creating outlined font instance with size " + i);
        float f = f6545X;
        if (i < 36) {
            f = 1.0f;
        }
        C0457b c0457b = new C0457b();
        c0457b.f1953a = (int) (f * ((float) i));
        float f2 = ((float) i) / ((float) c0457b.f1953a);
        if (i < 100) {
            c0457b.f1968p = this.f6567K;
        } else {
            c0457b.f1968p = "0123456789 ";
        }
        c0457b.f1957e = 0.65f;
        c0457b.f1973u = TextureFilter.Linear;
        c0457b.f1974v = TextureFilter.Linear;
        c0457b.f1960h = new C0430b(0.0f, 0.0f, 0.0f, 0.75f);
        c0457b.f1959g = ((float) c0457b.f1953a) * 0.12f;
        BitmapFont a = this.aa.m1380a(c0457b);
        game.logger.log("Game", "Font scale " + f2 + ", parameter size " + c0457b.f1953a);
        a.f1821a.m1324a(f2, f2);
        this.ad.mo542a(Integer.valueOf(i), a);
        a.f1821a.f1798p = true;
        return a;
    }

    /* renamed from: h */
    public final void m7466h() {
        if (this.f6566J.mo1728c() && !this.f6566J.mo1737k() && ((Long) f6554h.f6861c.m2467a(StatisticsType.PLAY_TIME)).longValue() >= 600) {
            this.f6566J.mo1725b(new ObjectRetriever<Boolean>(this) {
                /* renamed from: a */
                final /* synthetic */ Game f6528a;

                {
                    this.f6528a = r1;
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo1711a(Object obj) {
                }
            });
        }
    }

    /* renamed from: i */
    public final void m7467i() {
        int intValue;
        int i = 0;
        try {
            this.f6590w = new CheatSafeInt(Integer.valueOf(this.f6564H.m8838a("money", "0")).intValue());
        } catch (Exception e) {
            game.logger.m7510b("Game", "applyPreferences - money failed: " + e.getMessage());
            this.f6590w = new CheatSafeInt(i);
        }
        try {
            this.f6591x = new CheatSafeInt(Integer.valueOf(this.f6564H.m8838a("materials", "0")).intValue());
        } catch (Exception e2) {
            game.logger.m7510b("Game", "applyPreferences - materials failed: " + e2.getMessage());
            this.f6591x = new CheatSafeInt(i);
        }
        String a = this.f6564H.m8838a("doubleGainEnabled", null);
        if (a != null && a.equals("true")) {
            game.logger.log("DoubleGain", "Enabled from preferences");
            this.f6593z = true;
        }
        this.f6592y = new CheatSafeInt(i);
        try {
            intValue = Integer.valueOf(this.f6564H.m8838a("globalHighestWave", "0")).intValue();
        } catch (Exception e22) {
            game.logger.m7510b("Game", "applyPreferences - highestWaveNumber failed: " + e22.getMessage());
            intValue = i;
        }
        try {
            i = Integer.valueOf(this.f6564H.m8838a("globalHighestWaveBasicLevelID", "-1")).intValue();
        } catch (Exception e3) {
            game.logger.m7510b("Game", "applyPreferences - highestWaveBasicLevelID failed: " + e3.getMessage());
        }
        if (i != -1 && BasicLevel.m7404a(i) == null) {
            game.logger.m7510b("Game loading", "highest wave basic level id " + i + " not found");
        }
        m7462f(intValue);
        Iterator it = this.f6568L.iterator();
        while (it.hasNext()) {
            ((GameListener) it.next()).k_();
        }
    }

    /* renamed from: j */
    public final void m7468j() {
        this.f6559C.mo373b(this.f6575U);
        this.f6560D.m1462b(this.f6576V);
    }

    /* renamed from: l */
    public final void m7469l() {
        this.f6584p = true;
        this.f6569O = f6551e.m2416a("loading") + "...";
    }

    /* renamed from: m */
    public final void m7470m() {
        if (this.f6579k) {
            setScreen(new MoneyScreen(getScreen()));
        }
    }

    /* renamed from: n */
    public final void m7471n() {
        if (getScreen() != null) {
            getScreen().mo1778d();
        }
        setScreen(new MapEditorMapSelectScreen());
    }

    /* renamed from: o */
    public final void m7472o() {
        if (getScreen() != null) {
            getScreen().mo1778d();
        }
        setScreen(new SettingsScreen());
    }

    /* renamed from: p */
    public final void m7473p() {
        f6554h.m7580a();
        if (this.preferences.m8841b("locale")) {
            if (getScreen() != null) {
                getScreen().mo1778d();
            }
            setScreen(new MainMenuScreen());
            return;
        }
        if (getScreen() != null) {
            getScreen().mo1778d();
        }
        setScreen(new LanguageSelectScreen());
    }

    /* renamed from: q */
    public final void m7474q() {
        if (getScreen() != null) {
            getScreen().mo1778d();
        }
        setScreen(new GlobalUpgradesScreen());
    }

    /* renamed from: r */
    public final void m7475r() {
        if (!this.f6593z) {
            this.f6593z = true;
            this.f6564H.m8839b("doubleGainEnabled", "true");
            this.f6564H.m8844d();
            Iterator it = this.f6568L.iterator();
            while (it.hasNext()) {
                ((GameListener) it.next()).mo1715f();
            }
        }
    }

    /* renamed from: s */
    public final void m7476s() {
        int i = 0;
        Iterator b = this.ac.mo544b();
        while (b.hasNext()) {
            ((BitmapFont) ((C0707b) b.next()).f3164b).dispose();
        }
        this.ac.mo543a();
        b = this.ad.mo544b();
        while (b.hasNext()) {
            ((BitmapFont) ((C0707b) b.next()).f3164b).dispose();
        }
        this.ad.mo543a();
        C0712r c0712r = new C0712r();
        for (char valueOf : this.ab.toCharArray()) {
            c0712r.m2486a(Character.valueOf(valueOf));
        }
        for (char valueOf2 : f6551e.m2416a("CHARACTER_SET").toCharArray()) {
            c0712r.m2486a(Character.valueOf(valueOf2));
        }
        char[] cArr = new char[c0712r.f3187a];
        b = c0712r.m2489c();
        while (b.hasNext()) {
            cArr[i] = ((Character) b.next()).charValue();
            i++;
        }
        this.f6567K = new String(cArr);
        game.logger.log("Chars", this.f6567K);
    }

    /* renamed from: t */
    public final long m7477t() {
        long nanoTime = (System.nanoTime() / 1000) - this.f6571Q;
        this.f6573S = (long) (((double) this.f6573S) + (((double) (nanoTime - this.f6572R)) * this.f6585r));
        this.f6572R = nanoTime;
        return this.f6573S;
    }

    /* renamed from: u */
    public final long m7478u() {
        return (System.nanoTime() / 1000) - this.f6571Q;
    }

    /* renamed from: v */
    public final void m7479v() {
        game.logger.log("Game", "gpgsConnectionUpdated, connected: " + String.valueOf(this.f6566J.mo1728c()));
        if (f6555i) {
            if (this.f6566J.mo1728c()) {
                if (this.f6564H != null && this.f6564H.m8840b()) {
                    game.logger.log("Game", "Connected to Game Services, current progress is empty - trying to load from cloud...");
                    this.f6566J.mo1733g();
                } else if (!(this.f6564H == null || this.f6564H.m8840b())) {
                    game.logger.log("Game", "Connected to Game Services, current progress is not empty");
                }
            }
            Iterator it = this.f6568L.iterator();
            while (it.hasNext()) {
                ((GameListener) it.next()).mo1716g();
            }
            return;
        }
        this.f6557A = true;
    }
}
