package com.prineside.tdi.projectiles;

import com.badlogic.gdx.math.Vector2;
import com.prineside.tdi.Game;
import com.prineside.tdi.utility.PMath;

public abstract class SimpleProjectile implements Projectile {
    /* renamed from: a */
    public boolean f6985a;
    /* renamed from: b */
    public long f6986b;
    /* renamed from: c */
    public Vector2 f6987c = new Vector2();
    /* renamed from: d */
    public Vector2 f6988d = new Vector2();
    /* renamed from: e */
    public float f6989e;
    /* renamed from: f */
    public float f6990f;
    /* renamed from: g */
    protected Vector2 f6991g = new Vector2();
    /* renamed from: h */
    private long f6992h;

    /* renamed from: a */
    public void mo360a() {
    }

    /* renamed from: a */
    public final void m7718a(Vector2 vector2, Vector2 vector22, float f) {
        this.f6987c.f2337x = vector2.f2337x;
        this.f6987c.f2338y = vector2.f2338y;
        this.f6988d.f2337x = vector22.f2337x;
        this.f6988d.f2338y = vector22.f2338y;
        this.f6989e = f;
        this.f6990f = PMath.m8827c(vector2.f2337x, vector2.f2338y, vector22.f2337x, vector22.f2338y);
        this.f6992h = Game.game.m7477t();
        this.f6985a = false;
        this.f6986b = (long) ((PMath.m8820a(vector2.f2337x, vector2.f2338y, vector22.f2337x, vector22.f2338y) / (64.0f * f)) * 1000000.0f);
    }

    /* renamed from: b */
    public final boolean mo1768b() {
        return this.f6985a;
    }

    /* renamed from: e */
    public boolean mo1769e() {
        return this.f6985a;
    }

    /* renamed from: f */
    public final boolean mo1770f() {
        return Game.game.m7477t() - this.f6992h >= this.f6986b;
    }

    /* renamed from: g */
    public void mo1771g() {
        this.f6985a = true;
    }

    /* renamed from: h */
    public final void mo1772h() {
    }

    /* renamed from: k */
    public final long m7724k() {
        return this.f6986b - (Game.game.m7477t() - this.f6992h);
    }

    /* renamed from: l */
    public final Vector2 m7725l() {
        this.f6991g.f2337x = this.f6987c.f2337x;
        this.f6991g.f2338y = this.f6987c.f2338y;
        PMath.m8824a(this.f6991g, this.f6988d, ((float) (Game.game.m7477t() - this.f6992h)) / ((float) this.f6986b));
        return this.f6991g;
    }
}
