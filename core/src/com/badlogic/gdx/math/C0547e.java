package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0689h;

/* renamed from: com.badlogic.gdx.math.e */
public final class C0547e {
    /* renamed from: a */
    static Vector3 f2425a = new Vector3();
    /* renamed from: b */
    static Vector3 f2426b = new Vector3();
    /* renamed from: c */
    static Vector3 f2427c = new Vector3();
    /* renamed from: d */
    static Vector3 f2428d = new Vector3();
    /* renamed from: e */
    static Vector3 f2429e = new Vector3();
    /* renamed from: f */
    static Vector2 f2430f = new Vector2();
    /* renamed from: g */
    static Vector3 f2431g = new Vector3();
    /* renamed from: h */
    private static final Vector3 f2432h = new Vector3();
    /* renamed from: i */
    private static final Vector3 f2433i = new Vector3();
    /* renamed from: j */
    private static final Vector3 f2434j = new Vector3();
    /* renamed from: k */
    private static final C0689h f2435k = new C0689h();
    /* renamed from: l */
    private static final C0689h f2436l = new C0689h();
    /* renamed from: m */
    private static final Vector2 f2437m = new Vector2();
    /* renamed from: n */
    private static final Vector2 f2438n = new Vector2();
    /* renamed from: o */
    private static final Vector2 f2439o = new Vector2();
    /* renamed from: p */
    private static final Vector2 f2440p = new Vector2();
    /* renamed from: q */
    private static final Vector2 f2441q = new Vector2();
    /* renamed from: r */
    private static final Plane f2442r = new Plane(new Vector3());
    /* renamed from: s */
    private static final Vector3 f2443s = new Vector3();
    /* renamed from: t */
    private static final Vector3 f2444t = new Vector3();
    /* renamed from: u */
    private static final Vector3 f2445u = new Vector3();

    /* renamed from: a */
    public static boolean m1758a(Vector2 vector2, Vector2 vector22, Vector2 vector23, float f) {
        f2426b.m1709a(vector22.f2337x - vector2.f2337x, vector22.f2338y - vector2.f2338y, 0.0f);
        f2427c.m1709a(vector23.f2337x - vector2.f2337x, vector23.f2338y - vector2.f2338y, 0.0f);
        float a = f2426b.m1707a();
        float d = f2427c.m1716d(f2426b.m1712b());
        if (d <= 0.0f) {
            f2428d.m1709a(vector2.f2337x, vector2.f2338y, 0.0f);
        } else if (d >= a) {
            f2428d.m1709a(vector22.f2337x, vector22.f2338y, 0.0f);
        } else {
            f2429e.m1711a(f2426b.m1708a(d));
            f2428d.m1709a(f2429e.f2344x + vector2.f2337x, f2429e.f2345y + vector2.f2338y, 0.0f);
        }
        a = vector23.f2337x - f2428d.f2344x;
        d = vector23.f2338y - f2428d.f2345y;
        return (a * a) + (d * d) <= f;
    }

    /* renamed from: a */
    public static boolean m1759a(C0676a<Vector2> c0676a, Vector2 vector2) {
        int i = 0;
        boolean z = false;
        Vector2 vector22 = (Vector2) c0676a.m2299b();
        while (i < c0676a.f3001b) {
            Vector2 vector23 = (Vector2) c0676a.m2291a(i);
            if ((vector23.f2338y < vector2.f2338y && vector22.f2338y >= vector2.f2338y) || (vector22.f2338y < vector2.f2338y && vector23.f2338y >= vector2.f2338y)) {
                if (((vector22.f2337x - vector23.f2337x) * ((vector2.f2338y - vector23.f2338y) / (vector22.f2338y - vector23.f2338y))) + vector23.f2337x < vector2.f2337x) {
                    z = !z;
                }
            }
            i++;
            vector22 = vector23;
        }
        return z;
    }
}
