package com.prineside.tdi.screens;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.C0367f;
import com.badlogic.gdx.C0377g;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.math.C0522d;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
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
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.p034b.C0684b;
import com.prineside.tdi.BasicLevel;
import com.prineside.tdi.BasicLevel.BasicLevelGoal;
import com.prineside.tdi.Game;
import com.prineside.tdi.GameListener;
import com.prineside.tdi.Sound;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.screens.components.Dialog;
import com.prineside.tdi.utility.MaterialColor.RED;
import java.util.Iterator;
import java.util.Locale;

public class LevelSelectScreen extends AbstractScreen implements GameListener {
    /* renamed from: A */
    private C0438n f7292A;
    /* renamed from: B */
    private C0684b f7293B;
    /* renamed from: C */
    private C0609g f7294C;
    /* renamed from: D */
    private C0629f f7295D;
    /* renamed from: E */
    private C0629f f7296E;
    /* renamed from: F */
    private C0629f f7297F;
    /* renamed from: G */
    private C0605e f7298G;
    /* renamed from: H */
    private C0605e f7299H;
    /* renamed from: I */
    private C0625d f7300I;
    /* renamed from: J */
    private C0629f f7301J;
    /* renamed from: K */
    private C0625d f7302K;
    /* renamed from: L */
    private C0629f f7303L;
    /* renamed from: b */
    final C0430b f7304b = new C0430b(269488196);
    /* renamed from: c */
    final C0430b f7305c = new C0430b(12375295);
    /* renamed from: d */
    C0430b f7306d;
    /* renamed from: e */
    C0430b f7307e;
    /* renamed from: f */
    public Dialog f7308f;
    /* renamed from: g */
    private C0377g f7309g;
    /* renamed from: h */
    private float f7310h;
    /* renamed from: i */
    private float f7311i;
    /* renamed from: j */
    private float f7312j = 0.0f;
    /* renamed from: k */
    private boolean f7313k = true;
    /* renamed from: l */
    private int f7314l = 0;
    /* renamed from: m */
    private int f7315m = 0;
    /* renamed from: n */
    private float f7316n = 2.0f;
    /* renamed from: o */
    private int f7317o = -1;
    /* renamed from: p */
    private boolean f7318p = false;
    /* renamed from: q */
    private boolean f7319q = false;
    /* renamed from: r */
    private int f7320r = 0;
    /* renamed from: s */
    private int f7321s = 0;
    /* renamed from: t */
    private C0676a<LevelMenuElement> f7322t = new C0676a();
    /* renamed from: u */
    private C0676a<LevelMenuElement> f7323u = new C0676a();
    /* renamed from: v */
    private Texture f7324v;
    /* renamed from: w */
    private C0438n f7325w;
    /* renamed from: x */
    private C0438n f7326x;
    /* renamed from: y */
    private C0438n f7327y;
    /* renamed from: z */
    private C0438n f7328z;

    /* renamed from: com.prineside.tdi.screens.LevelSelectScreen$6 */
    class C11196 extends C0607f {
        /* renamed from: a */
        final /* synthetic */ LevelSelectScreen f7279a;

        C11196(LevelSelectScreen levelSelectScreen) {
            this.f7279a = levelSelectScreen;
        }

        /* renamed from: a */
        public final void mo495a(int i) {
            LevelMenuElement levelMenuElement = (LevelMenuElement) this.f7279a.f7322t.m2291a(this.f7279a.f7317o);
            if (this.f7279a.a.f6590w.m8800a() >= levelMenuElement.f7285a.f6444d && this.f7279a.f7321s >= levelMenuElement.f7285a.f6445e) {
                this.f7279a.f7302K.m1937a(this.f7279a.f7305c);
                this.f7279a.f7303L.m1937a(this.f7279a.f7305c);
            }
        }

        /* renamed from: a */
        public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
            LevelMenuElement levelMenuElement = (LevelMenuElement) this.f7279a.f7322t.m2291a(this.f7279a.f7317o);
            if (this.f7279a.a.f6590w.m8800a() < levelMenuElement.f7285a.f6444d || this.f7279a.f7321s < levelMenuElement.f7285a.f6445e) {
                if (this.f7279a.f7321s < levelMenuElement.f7285a.f6445e) {
                    this.f7279a.f7308f.m8212a(Game.f6551e.m2416a("level_select_purchase_need_more_waves"));
                } else {
                    this.f7279a.f7308f.m8212a(Game.f6551e.m2416a("level_select_purchase_need_more_money"));
                }
            } else if (this.f7279a.a.m7457c(levelMenuElement.f7285a.f6444d)) {
                levelMenuElement.f7285a.f6446f = true;
                BasicLevel.m7406b();
                this.f7279a.m7979l();
                Game.game.m7466h();
            }
            return true;
        }

        /* renamed from: b */
        public final void mo498b(int i) {
            LevelMenuElement levelMenuElement = (LevelMenuElement) this.f7279a.f7322t.m2291a(this.f7279a.f7317o);
            if (this.f7279a.a.f6590w.m8800a() >= levelMenuElement.f7285a.f6444d && this.f7279a.f7321s >= levelMenuElement.f7285a.f6445e) {
                this.f7279a.f7302K.m1937a(this.f7279a.f7306d);
                this.f7279a.f7303L.m1937a(this.f7279a.f7306d);
            }
        }
    }

    /* renamed from: com.prineside.tdi.screens.LevelSelectScreen$7 */
    class C11207 extends C0367f {
        /* renamed from: a */
        final /* synthetic */ LevelSelectScreen f7280a;
        /* renamed from: b */
        private int f7281b;
        /* renamed from: c */
        private int f7282c;
        /* renamed from: d */
        private boolean f7283d = false;
        /* renamed from: e */
        private boolean f7284e = false;

        C11207(LevelSelectScreen levelSelectScreen) {
            this.f7280a = levelSelectScreen;
        }

        /* renamed from: a */
        public final boolean mo333a(int i, int i2, int i3) {
            float f = 1.0f;
            if (!this.f7284e && ((double) Math.abs(((float) (this.f7282c - i)) / ((float) Gdx.graphics.mo294c()))) > 0.05d) {
                this.f7284e = true;
            }
            int i4 = i - this.f7281b;
            this.f7281b = i;
            float d = (1200.0f / ((float) Gdx.graphics.mo295d())) * (((-((float) i4)) / 940.0f) * 2.0f);
            float pow = (float) Math.pow((double) Math.abs((((float) (i - this.f7282c)) / 940.0f) * 4.0f), 1.5d);
            if (pow >= 1.0f) {
                f = pow;
            }
            this.f7280a.f7312j = (f * d) + this.f7280a.f7312j;
            if (this.f7280a.f7312j < 0.0f) {
                this.f7280a.f7312j = 0.0f;
            } else if (this.f7280a.f7312j > ((float) this.f7280a.f7315m)) {
                this.f7280a.f7312j = (float) this.f7280a.f7315m;
            }
            this.f7280a.m7977k();
            return false;
        }

        /* renamed from: a */
        public final boolean mo334a(int i, int i2, int i3, int i4) {
            this.f7280a.f7313k = false;
            this.f7281b = i;
            this.f7282c = i;
            this.f7283d = true;
            this.f7284e = false;
            return false;
        }

        /* renamed from: b */
        public final boolean mo336b(int i, int i2, int i3, int i4) {
            this.f7280a.f7313k = true;
            if (this.f7284e || !this.f7283d) {
                this.f7280a.f7314l = Math.round(this.f7280a.f7312j);
            } else {
                float c = ((float) i) / ((float) Gdx.graphics.mo294c());
                float l = ((this.f7280a.f7310h - 940.0f) / 2.0f) / this.f7280a.f7310h;
                if (c < l) {
                    if (this.f7280a.f7314l != 0) {
                        this.f7280a.f7314l = this.f7280a.f7314l - 1;
                        if (Math.abs(((float) this.f7280a.f7314l) - this.f7280a.f7312j) > 1.0f) {
                            this.f7280a.f7316n = Math.abs(((float) this.f7280a.f7314l) - this.f7280a.f7312j) * 3.0f;
                        } else {
                            this.f7280a.f7316n = 3.0f;
                        }
                    }
                } else if (c > 1.0f - l && this.f7280a.f7314l != this.f7280a.f7315m) {
                    this.f7280a.f7314l = this.f7280a.f7314l + 1;
                    if (Math.abs(((float) this.f7280a.f7314l) - this.f7280a.f7312j) > 1.0f) {
                        this.f7280a.f7316n = Math.abs(((float) this.f7280a.f7314l) - this.f7280a.f7312j) * 3.0f;
                    } else {
                        this.f7280a.f7316n = 3.0f;
                    }
                }
            }
            this.f7283d = false;
            return false;
        }

        /* renamed from: c */
        public final boolean mo337c(int i) {
            if (i > 0) {
                if (this.f7280a.f7314l != this.f7280a.f7315m) {
                    this.f7280a.f7314l = this.f7280a.f7314l + 1;
                    if (Math.abs(((float) this.f7280a.f7314l) - this.f7280a.f7312j) > 1.0f) {
                        this.f7280a.f7316n = Math.abs(((float) this.f7280a.f7314l) - this.f7280a.f7312j) * 3.0f;
                    } else {
                        this.f7280a.f7316n = 3.0f;
                    }
                }
            } else if (this.f7280a.f7314l != 0) {
                this.f7280a.f7314l = this.f7280a.f7314l - 1;
                if (Math.abs(((float) this.f7280a.f7314l) - this.f7280a.f7312j) > 1.0f) {
                    this.f7280a.f7316n = Math.abs(((float) this.f7280a.f7314l) - this.f7280a.f7312j) * 3.0f;
                } else {
                    this.f7280a.f7316n = 3.0f;
                }
            }
            return false;
        }
    }

    private class LevelMenuElement {
        /* renamed from: a */
        public BasicLevel f7285a;
        /* renamed from: b */
        public Texture f7286b;
        /* renamed from: c */
        public C0430b f7287c;
        /* renamed from: d */
        public Vector2 f7288d;
        /* renamed from: e */
        public float f7289e;
        /* renamed from: f */
        public float f7290f;
        /* renamed from: g */
        final /* synthetic */ LevelSelectScreen f7291g;

        private LevelMenuElement(LevelSelectScreen levelSelectScreen) {
            this.f7291g = levelSelectScreen;
            this.f7287c = C0430b.f1620c.m1222c();
            this.f7288d = new Vector2();
            this.f7290f = 0.0f;
        }
    }

    public LevelSelectScreen(final boolean z, int i) {
        C0430b c;
        this.f7318p = z;
        Game.game.preferences.m8839b("level_select_hardcore", z ? "true" : "false");
        Game.game.preferences.m8844d();
        if (z) {
            this.f7306d = RED.f8609f.m1222c();
            this.f7307e = RED.f8609f.m1222c();
            this.f7307e.f1647L = 0.56f;
            c = this.f7307e.m1222c();
        } else {
            this.f7306d = C0430b.f1620c.m1222c();
            this.f7307e = C0430b.f1622e.m1222c();
            c = new C0430b(0.5f, 0.5f, 0.5f, 1.0f);
        }
        Pixmap pixmap = new Pixmap(1, 1, Format.RGBA8888);
        pixmap.m1117a(C0430b.f1620c);
        pixmap.m1112a(0, 0, 1, 1);
        this.f7324v = new Texture(pixmap, Format.RGBA8888);
        this.f7324v.m1129b(TextureFilter.Nearest, TextureFilter.Nearest);
        this.f7325w = Game.game.f6561E.m1442a("icon-waves");
        this.f7326x = Game.game.f6561E.m1442a("main-menu-icon-money");
        this.f7327y = Game.game.f6561E.m1442a("level-select-lock");
        this.f7328z = Game.game.f6561E.m1442a("level-select-goal-scale-triangle");
        this.f7292A = Game.game.f6561E.m1442a("level-select-goal-scale-check");
        this.f7322t.mo530d();
        Iterator it = BasicLevel.f6441a.iterator();
        while (it.hasNext()) {
            BasicLevel basicLevel = (BasicLevel) it.next();
            Object levelMenuElement = new LevelMenuElement();
            levelMenuElement.f7285a = basicLevel;
            this.f7322t.m2296a(levelMenuElement);
        }
        this.f7315m = this.f7322t.f3001b - 1;
        this.f7293B = new C0684b();
        C0628a c0628a = new C0628a(Game.game.m7463g(60), C0430b.f1620c);
        C0645h c0645h = new C0645h();
        c0645h.m2192a(Game.game.f6561E);
        this.f7294C = new C0609g(this.f7293B);
        C0602b table = new Table();
        table.mo487a(false);
        table.f2677Y = true;
        this.f7294C.m2004a(table);
        C0602b c0605e = new C0605e();
        c0605e.m1956c(600.0f, 64.0f);
        table.m2059d(c0605e).m2096e().m2098f().m2097e(80.0f);
        C0602b c0625d = new C0625d(c0645h.m2197c("main-menu-icon-new-game"));
        c0625d.m1956c(64.0f, 64.0f);
        c0625d.m1935a(80.0f, 0.0f);
        c0625d.m1937a(c);
        c0605e.mo510b(c0625d);
        c0625d = new C0629f(Game.f6551e.m2416a("level_select_title"), c0628a);
        c0625d.m1956c(320.0f, 64.0f);
        c0625d.m1935a(204.0f, 0.0f);
        c0625d.m1937a(c);
        c0605e.mo510b(c0625d);
        c0605e = new C0605e();
        c0605e.m1956c(800.0f, 64.0f);
        table.m2059d(c0605e).m2096e().m2102h().m2097e(80.0f);
        c0625d = new C0605e();
        c0625d.m1956c(400.0f, 64.0f);
        c0625d.m1935a(400.0f, 0.0f);
        c0625d.f2610d = Touchable.enabled;
        c0605e.mo510b(c0625d);
        final C0602b c0625d2 = new C0625d(c0645h.m2197c("main-menu-icon-money"));
        c0625d2.m1956c(64.0f, 64.0f);
        c0625d2.m1935a(256.0f, 0.0f);
        c0625d2.m1937a(this.f7306d);
        c0625d.mo510b(c0625d2);
        this.f7295D = new C0629f(String.valueOf(Game.game.f6590w.m8800a()), c0628a);
        this.f7295D.m1956c(384.0f, 64.0f);
        this.f7295D.m1935a(-184.0f, 0.0f);
        this.f7295D.m2127a(16);
        this.f7295D.m1937a(this.f7306d);
        c0625d.mo510b(this.f7295D);
        c0625d.m1947a(new C0607f(this) {
            /* renamed from: b */
            final /* synthetic */ LevelSelectScreen f7266b;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0625d2.m1937a(this.f7266b.f7305c);
                this.f7266b.f7295D.m1937a(this.f7266b.f7305c);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                this.f7266b.m7975j();
                Game.game.m7470m();
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0625d2.m1937a(this.f7266b.f7306d);
                this.f7266b.f7295D.m1937a(this.f7266b.f7306d);
            }
        });
        c0625d = new C0625d(c0645h.m2197c("icon-waves"));
        c0625d.m1956c(64.0f, 64.0f);
        c0625d.m1937a(this.f7306d);
        c0625d.m1935a(256.0f, 0.0f);
        c0605e.mo510b(c0625d);
        this.f7296E = new C0629f("112", c0628a);
        this.f7296E.m1956c(384.0f, 64.0f);
        this.f7296E.m1935a(-188.0f, 0.0f);
        this.f7296E.m2127a(16);
        this.f7296E.m1937a(this.f7306d);
        c0605e.mo510b(this.f7296E);
        table.m2066q();
        c0625d = new Table();
        c0625d.f2610d = Touchable.enabled;
        table.m2059d(c0625d).m2093c(128.0f).m2097e(40.0f).m2096e().m2098f();
        c0625d.m2059d(z ? new C0625d(c0645h.m2197c("settings-toggle-on")) : new C0625d(c0645h.m2197c("settings-toggle-off"))).m2090b(64.0f).m2093c(32.0f).m2103h(40.0f).m2099f(80.0f);
        c0605e = new C0629f(Game.f6551e.m2416a("hardcore_mode"), new C0628a(Game.game.m7463g(48), C0430b.f1620c));
        c0605e.m2127a(8);
        c0605e.m1937a(this.f7306d);
        c0625d.m2059d(c0605e).m2103h(40.0f);
        c0625d.m1947a(new C0607f(this) {
            /* renamed from: b */
            final /* synthetic */ LevelSelectScreen f7268b;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0605e.m1937a(this.f7268b.f7305c);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                LevelSelectScreen.m7967c(this.f7268b);
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0605e.m1937a(this.f7268b.f7306d);
            }
        });
        if (Game.game.f6566J.mo1728c() && Gdx.app.getType() == ApplicationType.Android) {
            c0605e = new Table();
            c0605e.f2610d = Touchable.enabled;
            table.m2059d(c0605e).m2097e(40.0f).m2103h(80.0f).m2093c(128.0f).m2096e().m2102h();
            c0625d = new C0629f(Game.f6551e.m2416a("game_gui_leaderboard"), new C0628a(Game.game.m7463g(48), C0430b.f1620c));
            c0625d.m2127a(16);
            c0625d.m1937a(this.f7306d);
            c0605e.m2059d(c0625d);
            c0625d2 = new C0625d(c0645h.m2197c("main-menu-icon-leaderboards"));
            c0625d2.m1937a(this.f7306d);
            c0605e.m2059d(c0625d2).m2084a(64.0f).m2099f(40.0f);
            c0605e.m1947a(new C0607f(this) {
                /* renamed from: d */
                final /* synthetic */ LevelSelectScreen f7272d;

                /* renamed from: a */
                public final void mo495a(int i) {
                    c0625d2.m1937a(this.f7272d.f7305c);
                    c0625d.m1937a(this.f7272d.f7305c);
                }

                /* renamed from: a */
                public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                    if (z) {
                        Game.game.f6566J.mo1722a(((LevelMenuElement) this.f7272d.f7322t.m2291a(this.f7272d.f7317o)).f7285a.f6456p);
                    } else {
                        Game.game.f6566J.mo1722a(((LevelMenuElement) this.f7272d.f7322t.m2291a(this.f7272d.f7317o)).f7285a.f6455o);
                    }
                    return true;
                }

                /* renamed from: b */
                public final void mo498b(int i) {
                    c0625d2.m1937a(this.f7272d.f7306d);
                    c0625d.m1937a(this.f7272d.f7306d);
                }
            });
        }
        table.m2066q();
        c0605e = new C0605e();
        c0605e.m1956c(400.0f, 96.0f);
        table.m2059d(c0605e).m2104i().m2100g().m2098f().m2101g(64.0f).m2099f(80.0f);
        c0625d = new C0605e();
        c0625d.m1956c(400.0f, 96.0f);
        c0625d.f2610d = Touchable.enabled;
        c0605e.mo510b(c0625d);
        c0605e = new C0625d(c0645h.m2197c("icon-triangle-left"));
        c0605e.m1956c(64.0f, 64.0f);
        c0605e.m1935a(0.0f, 16.0f);
        c0605e.m1937a(this.f7306d);
        c0625d.mo510b(c0605e);
        c0625d2 = new C0629f(Game.f6551e.m2416a("level_select_back_to_menu"), c0628a);
        c0625d2.m1956c(336.0f, 96.0f);
        c0625d2.m1935a(124.0f, 0.0f);
        c0625d2.m1937a(this.f7306d);
        c0625d.mo510b(c0625d2);
        c0625d.m1947a(new C0607f(this) {
            /* renamed from: c */
            final /* synthetic */ LevelSelectScreen f7275c;

            /* renamed from: a */
            public final void mo495a(int i) {
                c0605e.m1937a(this.f7275c.f7305c);
                c0625d2.m1937a(this.f7275c.f7305c);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                this.f7275c.m7975j();
                Sound.m7569a(Type.NO);
                Game.game.m7473p();
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                c0605e.m1937a(this.f7275c.f7306d);
                c0625d2.m1937a(this.f7275c.f7306d);
            }
        });
        c0605e = new C0605e();
        c0605e.m1956c(480.0f, 160.0f);
        c0605e.mo487a(false);
        table.m2059d(c0605e).m2104i().m2100g().m2102h().m2101g(0.0f).m2103h(0.0f);
        this.f7298G = new C0605e();
        this.f7298G.m1956c(480.0f, 160.0f);
        this.f7298G.f2610d = Touchable.enabled;
        c0605e.mo510b(this.f7298G);
        this.f7300I = new C0625d(c0645h.m2197c("icon-triangle-right"));
        this.f7300I.m1956c(64.0f, 64.0f);
        this.f7300I.m1935a(336.0f, 80.0f);
        this.f7300I.m1937a(this.f7306d);
        this.f7298G.mo510b(this.f7300I);
        this.f7301J = new C0629f(Game.f6551e.m2416a("continue"), c0628a);
        this.f7301J.m1956c(336.0f, 96.0f);
        this.f7301J.m1935a(-60.0f, 64.0f);
        this.f7301J.m1937a(this.f7306d);
        this.f7301J.m2127a(16);
        this.f7298G.mo510b(this.f7301J);
        this.f7298G.m1947a(new C0607f(this) {
            /* renamed from: b */
            final /* synthetic */ LevelSelectScreen f7278b;

            /* renamed from: com.prineside.tdi.screens.LevelSelectScreen$5$1 */
            class C11171 implements Runnable {
                /* renamed from: a */
                final /* synthetic */ C11185 f7276a;

                C11171(C11185 c11185) {
                    this.f7276a = c11185;
                }

                public void run() {
                    Sound.m7569a(Type.SINGLE);
                    GameScreen.m7835j();
                    this.f7276a.f7278b.m7975j();
                    Game.game.m7449a(((LevelMenuElement) this.f7276a.f7278b.f7322t.m2291a(this.f7276a.f7278b.f7317o)).f7285a, z);
                }
            }

            /* renamed from: a */
            public final void mo495a(int i) {
                this.f7278b.f7300I.m1937a(this.f7278b.f7305c);
                this.f7278b.f7301J.m1937a(this.f7278b.f7305c);
            }

            /* renamed from: a */
            public final boolean mo497a(InputEvent inputEvent, float f, float f2, int i, int i2) {
                if (GameScreen.m7834i()) {
                    this.f7278b.f7308f.m8213a(Game.f6551e.m2416a("level_select_progress_will_be_lost"), new C11171(this));
                } else {
                    Sound.m7569a(Type.SINGLE);
                    this.f7278b.m7975j();
                    Game.game.m7449a(((LevelMenuElement) this.f7278b.f7322t.m2291a(this.f7278b.f7317o)).f7285a, z);
                }
                return true;
            }

            /* renamed from: b */
            public final void mo498b(int i) {
                this.f7278b.f7300I.m1937a(this.f7278b.f7306d);
                this.f7278b.f7301J.m1937a(this.f7278b.f7306d);
            }
        });
        this.f7299H = new C0605e();
        this.f7299H.m1956c(480.0f, 160.0f);
        this.f7299H.f2610d = Touchable.enabled;
        c0605e.mo510b(this.f7299H);
        this.f7302K = new C0625d(c0645h.m2197c("main-menu-icon-money"));
        this.f7302K.m1956c(64.0f, 64.0f);
        this.f7302K.m1935a(336.0f, 80.0f);
        this.f7302K.m1937a(this.f7306d);
        this.f7299H.mo510b(this.f7302K);
        this.f7303L = new C0629f("Open for 1500", c0628a);
        this.f7303L.m1956c(336.0f, 96.0f);
        this.f7303L.m1935a(-60.0f, 64.0f);
        this.f7303L.m1937a(this.f7306d);
        this.f7303L.m2127a(16);
        this.f7299H.mo510b(this.f7303L);
        this.f7299H.m1947a(new C11196(this));
        c0605e = new Table();
        c0605e.mo487a(false);
        c0605e.f2677Y = true;
        this.f7294C.m2004a(c0605e);
        this.f7297F = new C0629f("Level: 1", c0628a);
        this.f7297F.m2127a(1);
        this.f7297F.m1937a(c);
        c0605e.m2059d(this.f7297F).m2104i().m2100g().m2101g(64.0f).m2093c(96.0f);
        it = this.f7322t.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = ((LevelMenuElement) it.next()).f7285a.f6447g + i2;
        }
        this.f7321s = i2;
        this.f7296E.m2130a(String.valueOf(i2));
        this.f7308f = new Dialog(this.f7294C);
        this.f7309g = new C0377g();
        this.f7309g.m1082a(this.f7294C);
        this.f7309g.m1082a(new C11207(this));
        mo1713c();
        Game.game.m7450a((GameListener) this);
        if (i > 0 && i < BasicLevel.f6441a.f3001b) {
            this.f7312j = (float) i;
            m7977k();
        }
        Game.game.m7469l();
    }

    /* renamed from: c */
    static /* synthetic */ void m7967c(LevelSelectScreen levelSelectScreen) {
        levelSelectScreen.m7975j();
        Game.game.m7452a(!levelSelectScreen.f7318p, levelSelectScreen.f7317o);
    }

    /* renamed from: j */
    private void m7975j() {
        Game.game.preferences.m8839b("level_select_idx", String.valueOf(this.f7317o));
        Game.game.preferences.m8844d();
    }

    /* renamed from: k */
    private void m7977k() {
        int i = 0;
        this.f7323u.mo530d();
        int round = Math.round(this.f7312j);
        if (round != this.f7317o) {
            this.f7317o = round;
            m7979l();
        }
        Iterator it = this.f7322t.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object obj = (LevelMenuElement) it.next();
            obj.f7290f = -(this.f7312j - ((float) i2));
            float abs = Math.abs(obj.f7290f) / 3.0f;
            if (abs < 1.0f) {
                obj.f7289e = 1.0f - (((abs * 0.5f) + (C0522d.f2391g.mo430a(abs) * 0.5f)) * 0.8f);
                float f = obj.f7289e * 705.0f;
                obj.f7288d.f2337x = (((obj.f7290f > 0.0f ? 1.0f : -1.0f) * (C0522d.f2392h.mo430a(abs) * 0.33f)) * this.f7310h) + ((this.f7310h / 2.0f) - ((obj.f7289e * 940.0f) / 2.0f));
                obj.f7288d.f2338y = (this.f7311i / 2.0f) - (f / 2.0f);
                obj.f7287c.m1218a(C0430b.f1620c);
                obj.f7287c.m1219a(C0430b.f1619b, 0.3f * abs);
                if (abs > 0.33f) {
                    obj.f7287c.f1647L = 1.0f - (abs - 0.33f);
                } else {
                    obj.f7287c.f1647L = 1.0f;
                }
                this.f7323u.m2296a(obj);
            }
            i2++;
        }
        while (i < this.f7323u.f3001b) {
            for (i2 = i + 1; i2 < this.f7323u.f3001b; i2++) {
                if (Math.abs(((LevelMenuElement) this.f7323u.m2291a(i)).f7290f) < Math.abs(((LevelMenuElement) this.f7323u.m2291a(i2)).f7290f)) {
                    obj = (LevelMenuElement) this.f7323u.m2291a(i);
                    this.f7323u.mo525a(i, this.f7323u.m2291a(i2));
                    this.f7323u.mo525a(i2, obj);
                }
            }
            i++;
        }
    }

    /* renamed from: l */
    private void m7979l() {
        LevelMenuElement levelMenuElement = (LevelMenuElement) this.f7322t.m2291a(this.f7317o);
        this.f7297F.m2130a(Game.f6551e.m2416a("level_select_level") + ": " + levelMenuElement.f7285a.f6443c);
        if (levelMenuElement.f7285a.f6446f) {
            this.f7298G.f2611e = true;
            this.f7299H.f2611e = false;
            return;
        }
        this.f7298G.f2611e = false;
        this.f7299H.f2611e = true;
        if (this.a.f6590w.m8800a() < levelMenuElement.f7285a.f6444d || this.f7321s < levelMenuElement.f7285a.f6445e) {
            this.f7303L.m1937a(this.f7307e);
            this.f7302K.m1937a(this.f7307e);
        } else {
            this.f7303L.m1937a(this.f7306d);
            this.f7302K.m1937a(this.f7306d);
        }
        this.f7303L.m2130a(Game.f6551e.m2416a("level_select_open_for") + " " + levelMenuElement.f7285a.f6444d);
    }

    /* renamed from: a */
    public final void mo1712a() {
    }

    /* renamed from: a */
    public final void resize(int i, int i2) {
        super.resize(i, i2);
        this.f7293B.f3064a = 1200.0f / ((float) Gdx.graphics.mo295d());
        this.f7293B.mo522a(i, i2);
        this.f7311i = 1200.0f;
        this.f7310h = (this.f7311i / ((float) Gdx.graphics.mo295d())) * ((float) Gdx.graphics.mo294c());
        this.a.f6559C.mo372a(new Matrix4().m1688a(this.f7310h, this.f7311i));
        m7977k();
    }

    /* renamed from: b */
    public final void mo1781b(float f) {
        if (this.f7319q) {
            float f2;
            if (Gdx.input.mo307b(4) || Gdx.input.mo307b(131)) {
                Game.game.m7473p();
            }
            if (this.f7313k && ((float) this.f7314l) != this.f7312j) {
                f2 = this.f7316n * f;
                float f3 = ((float) this.f7314l) - this.f7312j;
                if (f2 > Math.abs(f3)) {
                    this.f7312j = (float) this.f7314l;
                } else if (f3 < 0.0f) {
                    this.f7312j -= f2;
                } else {
                    this.f7312j = f2 + this.f7312j;
                }
                m7977k();
            }
            C0430b c0430b = this.f7318p ? RED.f8609f : C0430b.f1620c;
            Iterator it = this.f7323u.iterator();
            while (it.hasNext()) {
                float f4;
                LevelMenuElement levelMenuElement = (LevelMenuElement) it.next();
                this.a.f6559C.mo365a();
                this.a.f6559C.mo373b(new Matrix4(this.a.f6559C.f2026h).m1689a(levelMenuElement.f7289e, levelMenuElement.f7289e, levelMenuElement.f7289e));
                for (int i = 1; i <= 5; i++) {
                    float f5 = ((float) i) / 5.0f;
                    this.a.f6559C.mo367a(this.f7304b.f1644I, this.f7304b.f1645J, this.f7304b.f1646K, this.f7304b.f1647L * (1.0f - f5));
                    f4 = levelMenuElement.f7288d.f2338y / levelMenuElement.f7289e;
                    float f6 = ((36.0f * levelMenuElement.f7289e) * f5) / levelMenuElement.f7289e;
                    this.a.f6559C.m1408a(this.f7324v, (levelMenuElement.f7288d.f2337x - ((36.0f * levelMenuElement.f7289e) * f5)) / levelMenuElement.f7289e, f4, f6, 36, 36);
                    this.a.f6559C.m1408a(this.f7324v, ((((levelMenuElement.f7288d.f2337x + (940.0f * levelMenuElement.f7289e)) + 36.0f) - 36.0f) - f5) / levelMenuElement.f7289e, f4, f6, 36, 36);
                }
                this.a.f6559C.m1410a(levelMenuElement.f7287c);
                this.a.f6559C.m1408a(levelMenuElement.f7286b, levelMenuElement.f7288d.f2337x / levelMenuElement.f7289e, levelMenuElement.f7288d.f2338y / levelMenuElement.f7289e, 940.0f, 470, 352);
                if (levelMenuElement.f7285a.f6446f) {
                    C0676a c0676a;
                    int i2;
                    int i3;
                    int i4;
                    float f7;
                    float f8;
                    int i5;
                    int i6;
                    if (this.f7318p) {
                        i5 = levelMenuElement.f7285a.f6449i;
                        i6 = levelMenuElement.f7285a.f6453m;
                        c0676a = levelMenuElement.f7285a.f6452l;
                        i2 = levelMenuElement.f7285a.f6450j;
                        i3 = i6;
                        i4 = i5;
                    } else {
                        i5 = levelMenuElement.f7285a.f6447g;
                        i6 = levelMenuElement.f7285a.f6454n;
                        c0676a = levelMenuElement.f7285a.f6451k;
                        i2 = levelMenuElement.f7285a.f6448h;
                        i3 = i6;
                        i4 = i5;
                    }
                    float f9 = levelMenuElement.f7288d.f2337x / levelMenuElement.f7289e;
                    f4 = levelMenuElement.f7288d.f2338y / levelMenuElement.f7289e;
                    if (this.f7318p) {
                        f7 = 50.0f;
                        f8 = 5.0f;
                    } else {
                        f7 = 150.0f;
                        f8 = 10.0f;
                    }
                    float f10 = ((float) i4) + (f7 / 2.0f);
                    this.a.f6559C.mo367a(0.0f, 0.0f, 0.0f, 0.14f);
                    this.a.f6559C.mo370a(Game.game.f6562F, f9, f4, 940.0f, 135.0f);
                    if (this.f7318p) {
                        this.a.f6559C.mo367a(0.07f, 0.0f, 0.0f, 0.325f);
                    } else {
                        this.a.f6559C.mo367a(0.02f, 0.05f, 0.07f, 0.325f);
                    }
                    this.a.f6559C.mo370a(Game.game.f6562F, f9, f4, 940.0f, 128.0f);
                    this.a.f6559C.mo367a(1.0f, 1.0f, 1.0f, 0.25f);
                    this.a.f6559C.mo370a(Game.game.f6562F, f9, f4, 940.0f, 4.0f);
                    this.a.f6559C.m1410a(levelMenuElement.f7287c);
                    f2 = 1.0f;
                    if (f10 > ((float) i3)) {
                        f2 = 1.0f - ((f10 - ((float) i3)) / f7);
                    }
                    BitmapFont g = Game.game.m7463g(36);
                    g.m1333a(c0430b.f1644I, c0430b.f1645J, c0430b.f1646K, levelMenuElement.f7287c.f1647L);
                    if (f2 > 0.0f) {
                        this.a.f6559C.mo367a(c0430b.f1644I, c0430b.f1645J, c0430b.f1646K, levelMenuElement.f7287c.f1647L * 0.5f);
                        for (f2 = 0.0f; f2 <= ((float) i3); f2 += f8) {
                            f10 = ((f2 - ((float) i4)) + (0.5f * f7)) / f7;
                            if (f10 > 0.01f && f10 < 0.99f) {
                                this.a.f6559C.mo370a(Game.game.f6562F, ((f10 * 940.0f) + f9) - 1.0f, f4, 2.0f, 16.0f);
                            }
                        }
                        this.a.f6559C.mo367a(c0430b.f1644I, c0430b.f1645J, c0430b.f1646K, levelMenuElement.f7287c.f1647L);
                        Iterator it2 = c0676a.iterator();
                        while (it2.hasNext()) {
                            BasicLevelGoal basicLevelGoal = (BasicLevelGoal) it2.next();
                            float f11 = (((float) (basicLevelGoal.f6435a - i4)) + (0.5f * f7)) / f7;
                            if (f11 > 0.05f && f11 < 0.95f) {
                                this.a.f6559C.mo370a(Game.game.f6562F, ((940.0f * f11) + f9) - 2.0f, f4, 4.0f, 16.0f);
                                if (i2 >= basicLevelGoal.f6435a) {
                                    this.a.f6559C.mo370a(this.f7292A, ((940.0f * f11) + f9) - 12.0f, f4 + 28.0f, 24.0f, 24.0f);
                                } else {
                                    g.m1331a(this.a.f6559C, String.valueOf(basicLevelGoal.f6435a), f9 + (940.0f * f11), f4 + 52.0f, 2.0f, 1);
                                }
                            }
                        }
                    }
                    this.a.f6559C.mo370a(this.f7328z, (470.0f + f9) - 10.0f, f4 - 4.0f, 21.0f, -11.0f);
                    this.a.f6559C.mo370a(this.f7325w, (470.0f + f9) - 60.0f, f4 + 66.0f, 40.0f, 40.0f);
                    BitmapFont g2 = Game.game.m7463g(60);
                    g2.m1333a(c0430b.f1644I, c0430b.f1645J, c0430b.f1646K, levelMenuElement.f7287c.f1647L);
                    g2.m1330a(this.a.f6559C, String.valueOf(i4), f9 + 470.0f, f4 + 106.0f);
                } else {
                    C0430b c;
                    this.a.f6559C.m1410a(new C0430b(640825514));
                    this.a.f6559C.mo370a(Game.game.f6562F, levelMenuElement.f7288d.f2337x / levelMenuElement.f7289e, levelMenuElement.f7288d.f2338y / levelMenuElement.f7289e, 940.0f, 705.0f);
                    this.a.f6559C.m1410a(C0430b.f1620c);
                    this.a.f6559C.mo370a(this.f7327y, ((levelMenuElement.f7288d.f2337x / levelMenuElement.f7289e) + 470.0f) - 128.0f, ((levelMenuElement.f7288d.f2338y / levelMenuElement.f7289e) + 352.5f) - 128.0f, 256.0f, 256.0f);
                    BitmapFont g3 = Game.game.m7463g(60);
                    if (this.a.f6590w.m8800a() >= levelMenuElement.f7285a.f6444d) {
                        g3.m1334a(levelMenuElement.f7287c);
                        this.a.f6559C.m1410a(levelMenuElement.f7287c);
                    } else {
                        c = RED.f8610g.m1222c();
                        c.f1647L *= levelMenuElement.f7287c.f1647L;
                        g3.m1334a(c);
                        this.a.f6559C.m1410a(c);
                    }
                    this.a.f6559C.mo370a(this.f7326x, ((levelMenuElement.f7288d.f2337x / levelMenuElement.f7289e) + 940.0f) - 128.0f, (levelMenuElement.f7288d.f2338y / levelMenuElement.f7289e) + 152.0f, 64.0f, 64.0f);
                    g3.m1331a(this.a.f6559C, String.valueOf(levelMenuElement.f7285a.f6444d), 470.0f + (levelMenuElement.f7288d.f2337x / levelMenuElement.f7289e), 88.0f + (((levelMenuElement.f7288d.f2338y / levelMenuElement.f7289e) + 80.0f) + 36.0f), 300.0f, 16);
                    if (this.f7321s >= levelMenuElement.f7285a.f6445e) {
                        g3.m1334a(levelMenuElement.f7287c);
                        this.a.f6559C.m1410a(levelMenuElement.f7287c);
                    } else {
                        c = RED.f8610g.m1222c();
                        c.f1647L *= levelMenuElement.f7287c.f1647L;
                        g3.m1334a(c);
                        this.a.f6559C.m1410a(c);
                    }
                    g3.m1331a(this.a.f6559C, String.valueOf(levelMenuElement.f7285a.f6445e), 470.0f + (levelMenuElement.f7288d.f2337x / levelMenuElement.f7289e), 36.0f + ((levelMenuElement.f7288d.f2338y / levelMenuElement.f7289e) + 80.0f), 300.0f, 16);
                    this.a.f6559C.mo370a(this.f7325w, ((levelMenuElement.f7288d.f2337x / levelMenuElement.f7289e) + 940.0f) - 128.0f, (levelMenuElement.f7288d.f2338y / levelMenuElement.f7289e) + 64.0f, 64.0f, 64.0f);
                }
                this.a.f6559C.mo374c();
                Game.game.m7468j();
            }
            this.f7294C.m2015c();
            this.f7294C.m2001a();
            return;
        }
        long u = Game.game.m7478u();
        while (this.f7320r != this.f7322t.f3001b) {
            ((LevelMenuElement) this.f7322t.m2291a(this.f7320r)).f7286b = new Texture(Gdx.files.mo277b("levels/" + ((LevelMenuElement) this.f7322t.m2291a(this.f7320r)).f7285a.f6443c + "/preview.png"), Format.RGB888, false);
            ((LevelMenuElement) this.f7322t.m2291a(this.f7320r)).f7286b.m1129b(TextureFilter.Linear, TextureFilter.Linear);
            this.f7320r++;
            if (Game.game.m7478u() - u > 17000) {
                break;
            }
        }
        if (this.f7320r == this.f7322t.f3001b) {
            Game.game.f6584p = false;
            this.f7319q = true;
            Gdx.input.mo304a(this.f7309g);
        }
    }

    /* renamed from: c */
    public final void mo1713c() {
        this.f7295D.m2130a(String.format(Locale.ENGLISH, "%,d", new Object[]{Integer.valueOf(Game.game.f6590w.m8800a())}));
    }

    /* renamed from: d */
    public final void mo1778d() {
        Game.game.m7455b((GameListener) this);
    }

    /* renamed from: e */
    public final void mo1714e() {
    }

    /* renamed from: f */
    public final void mo1715f() {
    }

    /* renamed from: g */
    public final void mo1716g() {
    }

    /* renamed from: h */
    public final void mo1717h() {
    }

    /* renamed from: i */
    public final void mo1718i() {
    }

    public final void j_() {
        Gdx.input.mo304a(this.f7309g);
    }

    public final void k_() {
        m7975j();
        Game.game.m7452a(this.f7318p, this.f7317o);
    }
}
