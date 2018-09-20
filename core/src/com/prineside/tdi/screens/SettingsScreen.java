package com.prineside.tdi.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.C0237a;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.pay.C0584g;
import com.badlogic.gdx.scenes.scene2d.C0602b;
import com.badlogic.gdx.scenes.scene2d.C0605e;
import com.badlogic.gdx.scenes.scene2d.C0607f;
import com.badlogic.gdx.scenes.scene2d.C0609g;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.C0625d;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f;
import com.badlogic.gdx.scenes.scene2d.ui.C0629f.C0628a;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.C0618d;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.p034b.C0684b;
import com.prineside.tdi.Game;
import com.prineside.tdi.Language;
import com.prineside.tdi.Something;
import com.prineside.tdi.Something.CodeValidationResult;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.Statistics;
import com.prineside.tdi.UserMap;
import com.prineside.tdi.screens.components.Dialog;
import com.prineside.tdi.towers.Tower.TowerType;
import com.prineside.tdi.utility.MaterialColor.LIGHT_BLUE;
import com.prineside.tdi.utility.ObjectRetriever;
import com.prineside.tdi.utility.SafePreferences;
import java.util.Iterator;

public class SettingsScreen extends AbstractScreen {
    /* renamed from: b */
    private C0684b f7612b = new C0684b();
    /* renamed from: c */
    private C0609g f7613c;
    /* renamed from: d */
    private Dialog f7614d;
    /* renamed from: e */
    private boolean f7615e = false;
    /* renamed from: f */
    private C0629f f7616f;
    /* renamed from: g */
    private Table f7617g;
    /* renamed from: h */
    private Table f7618h;
    /* renamed from: i */
    private C0710q<String, LocaleButton> f7619i;

    private class LocaleButton {
        /* renamed from: c */
        public C0625d f7566c;
        /* renamed from: d */
        public C0629f f7567d;
        /* renamed from: e */
        public Table f7568e = new Table();
        /* renamed from: f */
        final /* synthetic */ SettingsScreen f7569f;

        public LocaleButton(final SettingsScreen settingsScreen, C0645h c0645h, String str) {
            this.f7569f = settingsScreen;
            this.f7566c = new C0625d(c0645h.m2197c("tile-menu-upgrade-button-active-check"));
            this.f7567d = new C0629f(str, new C0628a(Game.game.m7463g(36), C0430b.f1620c));
            this.f7567d.m1937a(LIGHT_BLUE.f8523d);
            this.f7568e.m2059d(this.f7566c).m2103h(32.0f).m2085a(51.0f, 48.0f);
            this.f7568e.m2059d(this.f7567d);
            this.f7568e.f2610d = Touchable.enabled;
            this.f7568e.m1947a(new C0618d(this) {
                /* renamed from: f */
                final /* synthetic */ LocaleButton f7601f;

                /* renamed from: b */
                public final void mo500b() {
                    this.f7601f.mo1792a();
                }
            });
            this.f7568e.m1947a(new C0607f(this) {
                /* renamed from: b */
                final /* synthetic */ LocaleButton f7603b;

                /* renamed from: a */
                public final void mo495a(int i) {
                    this.f7603b.f7567d.m1937a(C0430b.f1620c);
                }

                /* renamed from: b */
                public final void mo498b(int i) {
                    this.f7603b.f7567d.m1937a(LIGHT_BLUE.f8523d);
                }
            });
            m8158a(false);
        }

        /* renamed from: a */
        public void mo1792a() {
        }

        /* renamed from: a */
        public final void m8158a(boolean z) {
            if (z) {
                this.f7566c.f2611e = true;
            } else {
                this.f7566c.f2611e = false;
            }
        }
    }

    /* renamed from: com.prineside.tdi.screens.SettingsScreen$2 */
    class C11642 implements ObjectRetriever<Boolean> {
        /* renamed from: a */
        final /* synthetic */ SettingsScreen f7586a;

        C11642(SettingsScreen settingsScreen) {
            this.f7586a = settingsScreen;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo1711a(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                Game.game.f6580l = true;
                Game.game.preferences.m8839b("soundEnabled", "true");
                Game.game.preferences.m8844d();
                return;
            }
            Game.game.f6580l = false;
            Game.game.preferences.m8839b("soundEnabled", "false");
            Game.game.preferences.m8844d();
        }
    }

    /* renamed from: com.prineside.tdi.screens.SettingsScreen$3 */
    class C11653 implements ObjectRetriever<Boolean> {
        /* renamed from: a */
        final /* synthetic */ SettingsScreen f7587a;

        C11653(SettingsScreen settingsScreen) {
            this.f7587a = settingsScreen;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo1711a(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                Game.game.f6581m = true;
                Game.game.preferences.m8839b("upgradeAllButtonEnabled", "true");
                Game.game.preferences.m8844d();
                return;
            }
            Game.game.f6581m = false;
            Game.game.preferences.m8839b("upgradeAllButtonEnabled", "false");
            Game.game.preferences.m8844d();
        }
    }

    /* renamed from: com.prineside.tdi.screens.SettingsScreen$4 */
    class C11674 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ SettingsScreen f7589a;

        /* renamed from: com.prineside.tdi.screens.SettingsScreen$4$1 */
        class C11661 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C11674 f7588a;

            C11661(C11674 c11674) {
                this.f7588a = c11674;
            }

            public void run() {
                C0584g.m1876d();
                this.f7588a.f7589a.f7614d.m8212a(Game.f6551e.m2416a("settings_purchases_restored"));
            }
        }

        C11674(SettingsScreen settingsScreen) {
            this.f7589a = settingsScreen;
        }

        /* renamed from: b */
        public final void mo500b() {
            if (Game.game.f6579k) {
                this.f7589a.f7614d.m8213a(Game.f6551e.m2416a("settings_restore_purchases") + "?", new C11661(this));
            }
            Sound.m7569a(Type.CLICK);
        }
    }

    /* renamed from: com.prineside.tdi.screens.SettingsScreen$6 */
    class C11706 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ SettingsScreen f7593a;

        /* renamed from: com.prineside.tdi.screens.SettingsScreen$6$1 */
        class C11691 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C11706 f7592a;

            C11691(C11706 c11706) {
                this.f7592a = c11706;
            }

            public void run() {
                int i = 0;
                Statistics statistics = Game.f6554h;
                statistics.f6860b.m8843c("towerDamage");
                statistics.f6860b.m8844d();
                for (Object a : TowerType.f8015m) {
                    statistics.f6862d.mo542a(a, Long.valueOf(0));
                }
                TowerType[] towerTypeArr = TowerType.f8015m;
                int length = towerTypeArr.length;
                while (i < length) {
                    statistics.f6863e.mo542a(towerTypeArr[i], Long.valueOf(0));
                    i++;
                }
                this.f7592a.f7593a.f7614d.m8212a(Game.f6551e.m2416a("settings_reset_statistics_message"));
            }
        }

        C11706(SettingsScreen settingsScreen) {
            this.f7593a = settingsScreen;
        }

        /* renamed from: b */
        public final void mo500b() {
            this.f7593a.f7614d.m8213a(Game.f6551e.m2416a("settings_reset_statistics_question"), new C11691(this));
            Sound.m7569a(Type.CLICK);
        }
    }

    /* renamed from: com.prineside.tdi.screens.SettingsScreen$8 */
    class C11738 extends C0618d {
        /* renamed from: a */
        final /* synthetic */ SettingsScreen f7597a;

        /* renamed from: com.prineside.tdi.screens.SettingsScreen$8$1 */
        class C11721 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C11738 f7596a;

            C11721(C11738 c11738) {
                this.f7596a = c11738;
            }

            public void run() {
                int i = 0;
                Game game = Game.game;
                String[] strArr = new String[]{"Progress", "Statistics", "UserMaps", "Settings"};
                while (i < 4) {
                    SafePreferences.m8835a(strArr[i]).m8845e();
                    i++;
                }
                game.f6566J.mo1736j();
                game.m7467i();
                this.f7596a.f7597a.f7614d.m8212a(Game.f6551e.m2416a("settings_reset_progress_message"));
            }
        }

        C11738(SettingsScreen settingsScreen) {
            this.f7597a = settingsScreen;
        }

        /* renamed from: b */
        public final void mo500b() {
            this.f7597a.f7614d.m8213a(Game.f6551e.m2416a("settings_reset_progress_question"), new C11721(this));
            Sound.m7569a(Type.CLICK);
        }
    }

    public static class ToggleButton {
        /* renamed from: a */
        public Table f7610a = new Table();
        /* renamed from: b */
        public boolean f7611b;

        public ToggleButton(String str, boolean z, final C0645h c0645h, final ObjectRetriever<Boolean> objectRetriever) {
            this.f7611b = z;
            final C0602b c0629f = new C0629f(str, new C0628a(Game.game.m7463g(36), C0430b.f1620c));
            c0629f.m1937a(LIGHT_BLUE.f8523d);
            this.f7610a.m2059d(c0629f).m2098f().m2103h(64.0f);
            final C0602b c0625d = new C0625d(c0645h.m2197c("settings-toggle-off"));
            if (z) {
                c0625d.m2117a(c0645h.m2197c("settings-toggle-on"));
            }
            this.f7610a.m2059d(c0625d).m2085a(96.0f, 48.0f);
            this.f7610a.m1947a(new C0618d(this) {
                /* renamed from: h */
                final /* synthetic */ ToggleButton f7607h;

                /* renamed from: b */
                public final void mo500b() {
                    this.f7607h.f7611b = !this.f7607h.f7611b;
                    objectRetriever.mo1711a(Boolean.valueOf(this.f7607h.f7611b));
                    if (this.f7607h.f7611b) {
                        c0625d.m2117a(c0645h.m2197c("settings-toggle-on"));
                    } else {
                        c0625d.m2117a(c0645h.m2197c("settings-toggle-off"));
                    }
                    Sound.m7569a(Type.CLICK);
                }
            });
            this.f7610a.m1947a(new C0607f(this) {
                /* renamed from: b */
                final /* synthetic */ ToggleButton f7609b;

                /* renamed from: a */
                public final void mo495a(int i) {
                    c0629f.m1937a(C0430b.f1620c);
                }

                /* renamed from: b */
                public final void mo498b(int i) {
                    c0629f.m1937a(LIGHT_BLUE.f8523d);
                }
            });
        }
    }

    public SettingsScreen() {
        C0628a c0628a = new C0628a(Game.game.m7463g(60), C0430b.f1620c);
        C0645h c0645h = new C0645h();
        c0645h.m2192a(Game.game.f6561E);
        this.f7613c = new C0609g(this.f7612b);
        C0602b table = new Table();
        table.mo487a(false);
        table.f2677Y = true;
        this.f7613c.m2004a(table);
        C0602b c0605e = new C0605e();
        c0605e.m1956c(600.0f, 64.0f);
        table.m2059d(c0605e).m2104i().m2096e().m2098f().m2097e(80.0f);
        C0430b c0430b = new C0430b(0.5f, 0.5f, 0.5f, 1.0f);
        C0602b c0625d = new C0625d(c0645h.m2197c("main-menu-icon-settings"));
        c0625d.m1956c(64.0f, 64.0f);
        c0625d.m1935a(80.0f, 0.0f);
        c0625d.m1937a(c0430b);
        c0605e.mo510b(c0625d);
        this.f7616f = new C0629f(Game.f6551e.m2416a("settings_title"), c0628a);
        this.f7616f.m1956c(320.0f, 64.0f);
        this.f7616f.m1935a(204.0f, 0.0f);
        this.f7616f.m1937a(c0430b);
        c0605e.mo510b(this.f7616f);
        final C0430b c0430b2 = C0430b.f1620c;
        final C0430b c0430b3 = LIGHT_BLUE.f8525f;
        C0602b c0605e2 = new C0605e();
        c0605e2.m1956c(400.0f, 96.0f);
        c0605e2.m1935a(80.0f, 64.0f);
        c0605e2.f2610d = Touchable.enabled;
        this.f7613c.m2004a(c0605e2);
        c0605e = new C0625d(c0645h.m2197c("icon-triangle-left"));
        c0605e.m1956c(64.0f, 64.0f);
        c0605e.m1935a(0.0f, 16.0f);
        c0605e.m1937a(c0430b2);
        c0605e2.mo510b(c0605e);
        final C0602b c0629f = new C0629f(Game.f6551e.m2416a("back"), c0628a);
        c0629f.m1956c(336.0f, 96.0f);
        c0629f.m1935a(124.0f, 0.0f);
        c0629f.m1937a(c0430b2);
        c0605e2.mo510b(c0629f);
        c0605e2.m1947a(new C0607f(this) {
            /* renamed from: e */
            final /* synthetic */ SettingsScreen f7583e;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0605e.m1937a(c0430b3);
                c0629f.m1937a(c0430b3);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                Sound.m7569a(Type.NO);
                if (this.f7583e.f7615e) {
                    this.f7583e.m8193a(false);
                } else {
                    Game.game.m7473p();
                }
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0605e.m1937a(c0430b2);
                c0629f.m1937a(c0430b2);
            }
        });
        this.f7617g = new Table();
        this.f7617g.mo487a(false);
        this.f7617g.f2677Y = true;
        this.f7613c.m2004a(this.f7617g);
        C0628a c0628a2 = new C0628a(Game.game.m7463g(36), C0430b.f1620c);
        C0602b table2 = new Table();
        table2.mo487a(false);
        this.f7617g.m2059d(table2).m2089b();
        table2.m2059d(new ToggleButton(Game.f6551e.m2416a("settings_sound"), Game.game.f6580l, c0645h, new C11642(this)).f7610a).m2093c(96.0f).m2106k();
        table2.m2059d(new ToggleButton(Game.f6551e.m2416a("settings_upgrade_all"), Game.game.f6581m, c0645h, new C11653(this)).f7610a).m2093c(96.0f).m2106k();
        c0605e = new C0629f(Game.f6551e.m2416a("settings_restore_purchases"), c0628a2);
        c0605e.m1937a(LIGHT_BLUE.f8523d);
        table2.m2059d(c0605e).m2093c(96.0f);
        c0605e.f2610d = Touchable.enabled;
        c0605e.m1947a(new C11674(this));
        c0605e.m1947a(new C0607f(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsScreen f7591b;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0605e.m1937a(C0430b.f1620c);
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0605e.m1937a(LIGHT_BLUE.f8523d);
            }
        });
        table2.m2066q();
        c0605e = new C0629f(Game.f6551e.m2416a("settings_reset_statistics"), c0628a2);
        c0605e.m1937a(LIGHT_BLUE.f8523d);
        table2.m2059d(c0605e).m2093c(96.0f);
        c0605e.f2610d = Touchable.enabled;
        c0605e.m1947a(new C11706(this));
        c0605e.m1947a(new C0607f(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsScreen f7595b;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0605e.m1937a(C0430b.f1620c);
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0605e.m1937a(LIGHT_BLUE.f8523d);
            }
        });
        table2.m2066q();
        c0605e = new C0629f(Game.f6551e.m2416a("settings_reset_progress"), c0628a2);
        c0605e.m1937a(LIGHT_BLUE.f8523d);
        table2.m2059d(c0605e).m2093c(96.0f);
        c0605e.f2610d = Touchable.enabled;
        c0605e.m1947a(new C11738(this));
        c0605e.m1947a(new C0607f(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsScreen f7599b;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0605e.m1937a(C0430b.f1620c);
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0605e.m1937a(LIGHT_BLUE.f8523d);
            }
        });
        table2.m2066q();
        c0605e = new C0629f(Game.f6551e.m2416a("settings_secret_code"), c0628a2);
        c0605e.m1937a(LIGHT_BLUE.f8523d);
        table2.m2059d(c0605e).m2093c(96.0f);
        c0605e.f2610d = Touchable.enabled;
        c0605e.m1947a(new C0618d(this) {
            /* renamed from: a */
            final /* synthetic */ SettingsScreen f7560a;

            /* renamed from: com.prineside.tdi.screens.SettingsScreen$10$1 */
            class C11611 implements C0237a {
                /* renamed from: a */
                final /* synthetic */ AnonymousClass10 f7559a;

                /* renamed from: com.prineside.tdi.screens.SettingsScreen$10$1$1 */
                class C11601 implements ObjectRetriever<CodeValidationResult> {
                    /* renamed from: a */
                    final /* synthetic */ C11611 f7558a;

                    C11601(C11611 c11611) {
                        this.f7558a = c11611;
                    }

                    /* renamed from: a */
                    public final /* synthetic */ void mo1711a(Object obj) {
                        CodeValidationResult codeValidationResult = (CodeValidationResult) obj;
                        String str = codeValidationResult.f6794a + "\n";
                        Iterator it = codeValidationResult.f6796c.iterator();
                        String str2 = str;
                        while (it.hasNext()) {
                            str2 = str2 + ((String) it.next()) + "\n";
                        }
                        this.f7558a.f7559a.f7560a.f7614d.m8212a(str2.trim());
                    }
                }

                C11611(AnonymousClass10 anonymousClass10) {
                    this.f7559a = anonymousClass10;
                }

                /* renamed from: a */
                public final void mo1791a(String str) {
                    Something.m7544a(str, new C11601(this));
                }
            }

            {
                this.f7560a = r1;
            }

            /* renamed from: b */
            public final void mo500b() {
                Gdx.input.mo303a(new C11611(this), "Secret code", "", "");
            }
        });
        c0605e.m1947a(new C0607f(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsScreen f7562b;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0605e.m1937a(C0430b.f1620c);
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0605e.m1937a(LIGHT_BLUE.f8523d);
            }
        });
        table2.m2066q();
        c0605e = new C0629f(Game.f6551e.m2416a("settings_advanced"), c0628a2);
        c0605e.m1937a(LIGHT_BLUE.f8523d);
        table2.m2059d(c0605e).m2093c(96.0f);
        c0605e.f2610d = Touchable.enabled;
        c0605e.m1947a(new C0618d(this) {
            /* renamed from: a */
            final /* synthetic */ SettingsScreen f7563a;

            {
                this.f7563a = r1;
            }

            /* renamed from: b */
            public final void mo500b() {
                this.f7563a.m8193a(true);
            }
        });
        c0605e.m1947a(new C0607f(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsScreen f7565b;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0605e.m1937a(C0430b.f1620c);
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0605e.m1937a(LIGHT_BLUE.f8523d);
            }
        });
        table2.m2066q();
        c0605e = new Table();
        c0605e.mo487a(true);
        c0605e.mo487a(false);
        this.f7617g.m2059d(c0605e).m2089b();
        table2 = new Table();
        c0605e.m2059d(table2).m2101g(40.0f);
        table2.m2059d(new C0625d(c0645h.m2197c("main-menu-icon-language"))).m2084a(48.0f).m2103h(32.0f);
        table2.m2059d(new C0629f(Game.f6551e.m2416a("settings_language"), new C0628a(Game.game.m7463g(60), C0430b.f1620c)));
        c0605e.m2066q();
        this.f7619i = new C0710q();
        Iterator it = Language.f6744a.iterator();
        while (it.hasNext()) {
            final Language language = (Language) it.next();
            LocaleButton anonymousClass14 = new LocaleButton(this, c0645h, language.f6745b) {
                /* renamed from: b */
                final /* synthetic */ SettingsScreen f7571b;

                /* renamed from: a */
                public final void mo1792a() {
                    SettingsScreen.m8189a(language.f6746c);
                    Sound.m7569a(Type.CLICK);
                }
            };
            anonymousClass14.m8158a(language.f6746c.equals(Game.f6551e.f3086a.getLanguage() + "_" + Game.f6551e.f3086a.getCountry()));
            c0605e.m2059d(anonymousClass14.f7568e).m2093c(96.0f);
            this.f7619i.mo542a(language.f6746c, anonymousClass14);
            c0605e.m2066q();
        }
        this.f7618h = new Table();
        this.f7618h.mo487a(false);
        this.f7618h.f2677Y = true;
        this.f7618h.f2611e = false;
        this.f7613c.m2004a(this.f7618h);
        this.f7618h.m2059d(new ToggleButton(Game.f6551e.m2416a("settings_dont_draw_explosions"), Game.game.f6582n, c0645h, new ObjectRetriever<Boolean>(this) {
            /* renamed from: a */
            final /* synthetic */ SettingsScreen f7572a;

            {
                this.f7572a = r1;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo1711a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    Game.game.f6582n = true;
                    Game.game.preferences.m8839b("explosionsDrawingDisabled", "true");
                    Game.game.preferences.m8844d();
                    return;
                }
                Game.game.f6582n = false;
                Game.game.preferences.m8839b("explosionsDrawingDisabled", "false");
                Game.game.preferences.m8844d();
            }
        }).f7610a).m2093c(96.0f).m2106k();
        this.f7618h.m2059d(new ToggleButton(Game.f6551e.m2416a("settings_dont_draw_projectiles"), Game.game.f6583o, c0645h, new ObjectRetriever<Boolean>(this) {
            /* renamed from: a */
            final /* synthetic */ SettingsScreen f7573a;

            {
                this.f7573a = r1;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo1711a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    Game.game.f6583o = true;
                    Game.game.preferences.m8839b("projectilesDrawingDisabled", "true");
                    Game.game.preferences.m8844d();
                    return;
                }
                Game.game.f6583o = false;
                Game.game.preferences.m8839b("projectilesDrawingDisabled", "false");
                Game.game.preferences.m8844d();
            }
        }).f7610a).m2093c(96.0f).m2106k();
        table2 = new C0629f(Game.f6551e.m2416a("settings_issue_report"), c0628a2);
        table2.m1937a(LIGHT_BLUE.f8523d);
        this.f7618h.m2059d(table2).m2093c(96.0f).m2106k();
        table2.f2610d = Touchable.enabled;
        table2.m1947a(new C0618d(this) {
            /* renamed from: a */
            final /* synthetic */ SettingsScreen f7575a;

            /* renamed from: com.prineside.tdi.screens.SettingsScreen$17$1 */
            class C11621 implements C0237a {
                /* renamed from: a */
                final /* synthetic */ AnonymousClass17 f7574a;

                C11621(AnonymousClass17 anonymousClass17) {
                    this.f7574a = anonymousClass17;
                }

                /* renamed from: a */
                public final void mo1791a(String str) {
                    Game.game.logger.m7508a(str, null);
                    this.f7574a.f7575a.f7614d.m8212a("Thanks!");
                }
            }

            {
                this.f7575a = r1;
            }

            /* renamed from: b */
            public final void mo500b() {
                C0237a c11621 = new C11621(this);
                Sound.m7569a(Type.CLICK);
                Gdx.input.mo303a(c11621, "Bug report", "", "");
            }
        });
        table2.m1947a(new C0607f(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsScreen f7577b;

            /* renamed from: a */
            public final void mo495a(int i) {
                table2.m1937a(C0430b.f1620c);
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                table2.m1937a(LIGHT_BLUE.f8523d);
            }
        });
        table2 = new C0629f("Reset my maps", c0628a2);
        table2.m1937a(LIGHT_BLUE.f8523d);
        this.f7618h.m2059d(table2).m2093c(96.0f).m2106k();
        table2.f2610d = Touchable.enabled;
        table2.m1947a(new C0618d(this) {
            /* renamed from: a */
            final /* synthetic */ SettingsScreen f7578a;

            {
                this.f7578a = r1;
            }

            /* renamed from: b */
            public final void mo500b() {
                for (int i = 1; i <= 3; i++) {
                    if (UserMap.m7585a(i)) {
                        UserMap.m7586b(i).m7590e();
                    }
                }
                this.f7578a.f7614d.m8212a("User maps were reset");
                Sound.m7569a(Type.CLICK);
            }
        });
        table2.m1947a(new C0607f(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsScreen f7585b;

            /* renamed from: a */
            public final void mo495a(int i) {
                table2.m1937a(C0430b.f1620c);
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                table2.m1937a(LIGHT_BLUE.f8523d);
            }
        });
        this.f7614d = new Dialog(this.f7613c);
    }

    /* renamed from: a */
    static /* synthetic */ void m8189a(String str) {
        Game.game.m7451a(str);
        Game.game.m7472o();
    }

    /* renamed from: a */
    public final void resize(int i, int i2) {
        super.resize(i, i2);
        this.f7612b.f3064a = 1200.0f / ((float) Gdx.graphics.mo295d());
        this.f7612b.mo522a(i, i2);
    }

    /* renamed from: a */
    public final void m8193a(boolean z) {
        this.f7615e = z;
        if (z) {
            this.f7616f.m2130a(Game.f6551e.m2416a("settings_advanced"));
            this.f7617g.f2611e = false;
            this.f7618h.f2611e = true;
            return;
        }
        this.f7616f.m2130a(Game.f6551e.m2416a("settings_title"));
        this.f7618h.f2611e = false;
        this.f7617g.f2611e = true;
    }

    /* renamed from: b */
    public final void mo1781b(float f) {
        if (Gdx.input.mo307b(4) || Gdx.input.mo307b(131)) {
            Game.game.m7473p();
        }
        this.f7613c.m2015c();
        this.f7613c.m2001a();
    }

    public final void j_() {
        Gdx.input.mo304a(this.f7613c);
    }
}
