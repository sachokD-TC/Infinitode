package com.prineside.tdi.projectiles.types;

import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.C0328t;
import com.badlogic.gdx.utils.C0328t.C0449a;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0712r;
import com.prineside.tdi.AsyncUpdatable;
import com.prineside.tdi.AsyncUpdater;
import com.prineside.tdi.Game;
import com.prineside.tdi.enemies.Enemy;
import com.prineside.tdi.projectiles.Projectile;
import com.prineside.tdi.screens.GameScreen;
import com.prineside.tdi.tiles.WalkableTile;
import com.prineside.tdi.towers.Tower;
import com.prineside.tdi.utility.Draw;
import com.prineside.tdi.utility.FastBadRandom;
import com.prineside.tdi.utility.PMath;
import java.util.Iterator;

public class ChainLightningProjectile implements C0449a, AsyncUpdatable, Projectile {
    /* renamed from: a */
    public static final C0328t<ChainLightningProjectile> f7020a = new C10851();
    /* renamed from: p */
    private static Texture f7021p;
    /* renamed from: q */
    private static float f7022q;
    /* renamed from: r */
    private static float f7023r;
    /* renamed from: s */
    private static float f7024s;
    /* renamed from: t */
    private static float f7025t;
    /* renamed from: u */
    private static final float[] f7026u = new float[32];
    /* renamed from: v */
    private static int f7027v = 0;
    /* renamed from: A */
    private WalkableTile f7028A = null;
    /* renamed from: B */
    private Vector2 f7029B = new Vector2();
    /* renamed from: C */
    private Vector2 f7030C = new Vector2();
    /* renamed from: D */
    private C0430b f7031D = new C0430b(C0430b.f1620c);
    /* renamed from: b */
    public boolean f7032b;
    /* renamed from: c */
    public boolean f7033c;
    /* renamed from: d */
    public long f7034d;
    /* renamed from: e */
    public long f7035e;
    /* renamed from: f */
    public Vector2 f7036f = new Vector2();
    /* renamed from: g */
    public Tower f7037g = null;
    /* renamed from: h */
    public float f7038h;
    /* renamed from: i */
    public float f7039i;
    /* renamed from: j */
    public float f7040j;
    /* renamed from: k */
    public ChainLightningTarget f7041k = null;
    /* renamed from: l */
    public ChainLightningTarget f7042l = null;
    /* renamed from: m */
    public C0676a<Vector2> f7043m = new C0676a();
    /* renamed from: n */
    public C0676a<Float> f7044n = new C0676a();
    /* renamed from: o */
    public float f7045o = 0.0f;
    /* renamed from: w */
    private AsyncUpdater f7046w;
    /* renamed from: x */
    private long f7047x;
    /* renamed from: y */
    private final C0712r<Enemy> f7048y = new C0712r();
    /* renamed from: z */
    private final C0676a<ChainLightningTarget> f7049z = new C0676a();

    /* renamed from: com.prineside.tdi.projectiles.types.ChainLightningProjectile$1 */
    static class C10851 extends C0328t<ChainLightningProjectile> {
        C10851() {
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo301a() {
            return new ChainLightningProjectile();
        }
    }

    private class ChainLightningTarget {
        /* renamed from: a */
        public Enemy f7014a;
        /* renamed from: b */
        float f7015b = 0.0f;
        /* renamed from: c */
        float f7016c = 0.0f;
        /* renamed from: d */
        Vector2 f7017d;
        /* renamed from: e */
        Vector2 f7018e;
        /* renamed from: f */
        final /* synthetic */ ChainLightningProjectile f7019f;

        ChainLightningTarget(ChainLightningProjectile chainLightningProjectile, Enemy enemy, Vector2 vector2, Vector2 vector22) {
            this.f7019f = chainLightningProjectile;
            this.f7014a = enemy;
            this.f7017d = vector2;
            this.f7018e = vector22;
        }
    }

    /* renamed from: b */
    private boolean m7749b(Enemy enemy) {
        boolean c;
        synchronized (this.f7048y) {
            c = this.f7048y.m2490c((Object) enemy);
        }
        return c;
    }

    /* renamed from: k */
    public static void m7750k() {
        C0438n a = Game.game.f6561E.m1442a("chain-lightning");
        f7021p = a.f1686z;
        f7022q = a.f1680A;
        f7023r = a.f1681B;
        f7024s = a.f1682C;
        f7025t = a.f1683D;
        for (int i = 0; i < 32; i++) {
            f7026u[i] = (FastBadRandom.m8809b() * 3.7000003f) + 1.1f;
        }
    }

    /* renamed from: l */
    public static ChainLightningProjectile m7751l() {
        Game.m7445k();
        return (ChainLightningProjectile) f7020a.m965b();
    }

    /* renamed from: m */
    public static synchronized float m7752m() {
        float f;
        synchronized (ChainLightningProjectile.class) {
            int i = f7027v + 1;
            f7027v = i;
            if (i >= 32) {
                f7027v = 0;
            }
            f = f7026u[f7027v];
        }
        return f;
    }

    /* renamed from: a */
    public final void mo360a() {
        this.f7032b = false;
        synchronized (this.f7048y) {
            this.f7048y.m2484a();
        }
        synchronized (this.f7049z) {
            this.f7049z.mo530d();
        }
        this.f7043m.mo530d();
        this.f7044n.mo530d();
    }

    /* renamed from: a */
    public final void mo1751a(AsyncUpdater asyncUpdater) {
        this.f7046w = asyncUpdater;
    }

    /* renamed from: a */
    public final void m7755a(Enemy enemy) {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            if (enemy.f6928w > this.f7045o) {
                this.f7040j += enemy.f6928w - this.f7045o;
                this.f7045o = enemy.f6928w;
            }
            Object chainLightningTarget = new ChainLightningTarget(this, enemy, new Vector2((FastBadRandom.m8809b() * 24.0f) - 12.0f, (FastBadRandom.m8809b() * 24.0f) - 12.0f), new Vector2((FastBadRandom.m8809b() * 24.0f) - 12.0f, (FastBadRandom.m8809b() * 24.0f) - 12.0f));
            synchronized (this.f7049z) {
                this.f7049z.m2296a(chainLightningTarget);
            }
            synchronized (this.f7048y) {
                this.f7048y.m2486a((Object) enemy);
            }
            if (this.f7041k != null) {
                this.f7041k.f7015b = m7752m();
                this.f7041k.f7016c = m7752m();
            }
            if (this.f7042l == null) {
                this.f7042l = chainLightningTarget;
            }
            this.f7041k = chainLightningTarget;
            WalkableTile walkableTile = (WalkableTile) gameScreen.f7179t.m7527b((int) enemy.f6909d.f2337x, (int) enemy.f6909d.f2338y);
            if (walkableTile != null) {
                this.f7028A = walkableTile;
            } else if (this.f7028A == null) {
                Game.game.logger.m7510b("ChainLightningProjectile", "jumpOnEnemy - first enemy walkable tile is null, can't handle projectile!");
                this.f7035e = 0;
                return;
            }
            this.f7035e = Game.game.m7477t();
        }
    }

    /* renamed from: b */
    public final boolean mo1768b() {
        return this.f7033c;
    }

    /* renamed from: c */
    public final AsyncUpdater mo1752c() {
        return this.f7046w;
    }

    /* renamed from: d */
    public final void mo1753d() {
        if (this.f7032b) {
            GameScreen gameScreen = Game.f6553g;
            if (gameScreen != null && this.f7040j != 0.0f) {
                ChainLightningTarget chainLightningTarget = this.f7041k;
                if (chainLightningTarget == null) {
                    Game.game.logger.log("ChainLightningProjectile#triggerAsyncUpdate()", hashCode() + " last target is null");
                } else if (Game.game.m7477t() - this.f7047x > 30000) {
                    if (this.f7040j >= 1.0f) {
                        this.f7040j -= 1.0f;
                    } else if (FastBadRandom.m8809b() > this.f7040j) {
                        this.f7040j = 0.0f;
                        return;
                    } else {
                        this.f7040j = 0.0f;
                    }
                    Enemy enemy = null;
                    float f = 9001.0f;
                    Iterator it = this.f7028A.f7985q.iterator();
                    while (it.hasNext()) {
                        WalkableTile walkableTile = (WalkableTile) it.next();
                        synchronized (walkableTile.f7984p) {
                            Iterator c = walkableTile.f7984p.m2489c();
                            while (c.hasNext()) {
                                Enemy enemy2 = (Enemy) c.next();
                                if (enemy2.mo1755a(this.f7037g.f8049k) && !m7749b(enemy2)) {
                                    Enemy enemy3;
                                    float f2;
                                    float b = PMath.m8826b(enemy2.f6909d.f2337x, enemy2.f6909d.f2338y, chainLightningTarget.f7014a.f6909d.f2337x, chainLightningTarget.f7014a.f6909d.f2338y);
                                    if (enemy == null || b < f) {
                                        enemy3 = enemy2;
                                        f2 = b;
                                    } else {
                                        f2 = f;
                                        enemy3 = enemy;
                                    }
                                    enemy = enemy3;
                                    f = f2;
                                }
                            }
                        }
                    }
                    if (enemy == null) {
                        this.f7040j = 0.0f;
                    } else {
                        gameScreen.m7851a(this.f7037g, enemy, this.f7038h * this.f7039i);
                        this.f7039i *= 0.925f;
                        m7755a(enemy);
                    }
                    this.f7047x = Game.game.m7477t();
                }
            }
        }
    }

    /* renamed from: e */
    public final boolean mo1769e() {
        return mo1770f();
    }

    /* renamed from: f */
    public final boolean mo1770f() {
        return this.f7040j == 0.0f && Game.game.m7477t() - this.f7035e >= 300000;
    }

    /* renamed from: g */
    public final void mo1771g() {
        this.f7033c = true;
        if (Game.f6553g != null) {
            GameScreen.m7831b((AsyncUpdatable) this);
        }
    }

    /* renamed from: h */
    public final void mo1772h() {
    }

    /* renamed from: i */
    public final void mo1773i() {
        GameScreen gameScreen = Game.f6553g;
        if (gameScreen != null) {
            float a;
            float toRadians;
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            long t = Game.game.m7477t() - this.f7034d;
            this.f7029B.f2337x = this.f7036f.f2337x;
            this.f7029B.f2338y = this.f7036f.f2338y;
            this.f7030C.f2337x = this.f7036f.f2337x;
            this.f7030C.f2338y = this.f7036f.f2338y;
            if (t < 200000) {
                this.f7031D.f1647L = 0.85f - ((((float) t) / 200000.0f) * 0.85f);
                a = this.f7031D.m1216a();
                int i = 0;
                while (i < this.f7043m.f3001b) {
                    Vector2 vector2 = (Vector2) this.f7043m.m2291a(i);
                    toRadians = (float) Math.toRadians((double) PMath.m8827c(this.f7029B.f2337x, this.f7029B.f2338y, vector2.f2337x, vector2.f2338y));
                    Draw.m8806a(Game.game.f6559C, f7021p, f7022q, f7023r, f7024s, f7025t, this.f7029B.f2337x, this.f7029B.f2338y, vector2.f2337x, vector2.f2338y, f, ((Float) this.f7044n.m2291a(i)).floatValue(), f2, toRadians, a, a);
                    f = ((Float) this.f7044n.m2291a(i)).floatValue();
                    this.f7029B.f2337x = vector2.f2337x;
                    this.f7029B.f2338y = vector2.f2338y;
                    this.f7030C.f2337x = vector2.f2337x;
                    this.f7030C.f2338y = vector2.f2338y;
                    i++;
                    f2 = toRadians;
                }
            } else {
                synchronized (this.f7049z) {
                    Iterator it = this.f7049z.iterator();
                    while (it.hasNext()) {
                        ChainLightningTarget chainLightningTarget = (ChainLightningTarget) it.next();
                        if (gameScreen.f7179t.m7529b(chainLightningTarget.f7014a)) {
                            this.f7029B.f2337x = chainLightningTarget.f7014a.f6909d.f2337x;
                            this.f7029B.f2338y = chainLightningTarget.f7014a.f6909d.f2338y;
                            this.f7030C.f2337x = chainLightningTarget.f7014a.f6909d.f2337x;
                            this.f7030C.f2338y = chainLightningTarget.f7014a.f6909d.f2338y;
                            break;
                        }
                    }
                }
            }
            float t2 = ((float) (Game.game.m7477t() - this.f7035e)) / 300000.0f;
            if (t2 > 0.5f) {
                this.f7031D.f1647L = 0.85f - (((t2 - 0.5f) / 0.5f) * 0.85f);
            } else {
                this.f7031D.f1647L = 0.85f;
            }
            a = this.f7031D.m1216a();
            synchronized (this.f7049z) {
                Iterator it2 = this.f7049z.iterator();
                while (it2.hasNext()) {
                    float toRadians2;
                    ChainLightningTarget chainLightningTarget2 = (ChainLightningTarget) it2.next();
                    if (gameScreen.f7179t.m7529b(chainLightningTarget2.f7014a)) {
                        float f5 = chainLightningTarget2.f7014a.f6909d.f2337x + chainLightningTarget2.f7017d.f2337x;
                        float f6 = chainLightningTarget2.f7014a.f6909d.f2338y + chainLightningTarget2.f7017d.f2338y;
                        toRadians = (float) Math.toRadians((double) PMath.m8827c(this.f7029B.f2337x, this.f7029B.f2338y, chainLightningTarget2.f7014a.f6909d.f2337x, chainLightningTarget2.f7014a.f6909d.f2338y));
                        Draw.m8806a(Game.game.f6559C, f7021p, f7022q, f7023r, f7024s, f7025t, this.f7029B.f2337x, this.f7029B.f2338y, f5, f6, f, chainLightningTarget2.f7015b, f2, toRadians, a, a);
                        f = chainLightningTarget2.f7015b;
                        this.f7029B.f2337x = f5;
                        this.f7029B.f2338y = f6;
                        float f7 = chainLightningTarget2.f7014a.f6909d.f2337x + chainLightningTarget2.f7018e.f2337x;
                        float f8 = chainLightningTarget2.f7014a.f6909d.f2338y + chainLightningTarget2.f7018e.f2338y;
                        toRadians2 = (float) Math.toRadians((double) PMath.m8827c(this.f7030C.f2337x, this.f7030C.f2338y, chainLightningTarget2.f7014a.f6909d.f2337x, chainLightningTarget2.f7014a.f6909d.f2338y));
                        Draw.m8806a(Game.game.f6559C, f7021p, f7022q, f7023r, f7024s, f7025t, this.f7030C.f2337x, this.f7030C.f2338y, f7, f8, f3, chainLightningTarget2.f7016c, f4, toRadians2, a, a);
                        f3 = chainLightningTarget2.f7016c;
                        this.f7030C.f2337x = f7;
                        this.f7030C.f2338y = f8;
                    } else {
                        toRadians2 = f4;
                        toRadians = f2;
                    }
                    f4 = toRadians2;
                    f2 = toRadians;
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo1774j() {
        f7020a.mo363a((Object) this);
    }
}
