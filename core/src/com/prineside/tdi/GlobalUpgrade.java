package com.prineside.tdi;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.C0710q.C0707b;
import com.badlogic.gdx.utils.C0712r;
import com.badlogic.gdx.utils.ah;
import com.badlogic.gdx.utils.ah.C0680a;
import com.badlogic.gdx.utils.ai;
import com.prineside.tdi.Achievement.Type;
import com.prineside.tdi.towers.Tower.TowerType;
import com.prineside.tdi.utility.PMath;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;

public class GlobalUpgrade {
    /* renamed from: a */
    public static C0710q<GlobalUpgradeType, GlobalUpgrade> f6606a = new C0710q();
    /* renamed from: b */
    public static int f6607b = Integer.MAX_VALUE;
    /* renamed from: c */
    public static int f6608c = Integer.MIN_VALUE;
    /* renamed from: d */
    public static int f6609d = Integer.MAX_VALUE;
    /* renamed from: e */
    public static int f6610e = Integer.MIN_VALUE;
    /* renamed from: f */
    public static int f6611f;
    /* renamed from: g */
    public static int f6612g;
    /* renamed from: h */
    public static final String[] f6613h = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};
    /* renamed from: v */
    private static int f6614v = 0;
    /* renamed from: w */
    private static boolean[] f6615w;
    /* renamed from: x */
    private static C0712r<GlobalUpgradeType> f6616x;
    /* renamed from: y */
    private static FilteringMode f6617y = FilteringMode.NONE;
    /* renamed from: i */
    public GlobalUpgrade f6618i = null;
    /* renamed from: j */
    public final C0676a<GlobalUpgrade> f6619j = new C0676a();
    /* renamed from: k */
    public final GlobalUpgradeType f6620k;
    /* renamed from: l */
    public GlobalUpgradeCategory f6621l;
    /* renamed from: m */
    public int f6622m;
    /* renamed from: n */
    public int f6623n;
    /* renamed from: o */
    public int f6624o;
    /* renamed from: p */
    public int f6625p;
    /* renamed from: q */
    public int f6626q;
    /* renamed from: r */
    public int f6627r;
    /* renamed from: s */
    public int f6628s = 0;
    /* renamed from: t */
    public float f6629t;
    /* renamed from: u */
    public float[] f6630u = new float[4];
    /* renamed from: z */
    private final C0712r<GlobalUpgradeType> f6631z = new C0712r();

    /* renamed from: com.prineside.tdi.GlobalUpgrade$1 */
    static class C10661 extends GameListenerAdapter {
        C10661() {
        }

        public final void k_() {
            GlobalUpgrade.m7497g();
        }
    }

    public enum FilteringMode {
        NONE,
        ONLY_FILTERED,
        EXCEPT_FILTERED
    }

    private GlobalUpgrade(GlobalUpgradeType globalUpgradeType) {
        if (m7495c(globalUpgradeType) != null) {
            Game.game.logger.m7510b("GlobalUpgrade", "Instance " + globalUpgradeType.name() + " is already created");
            Gdx.app.exit();
        }
        this.f6620k = globalUpgradeType;
        f6606a.mo542a(globalUpgradeType, this);
    }

    /* renamed from: a */
    public static void m7489a() {
        Game.game.m7450a(new C10661());
        m7497g();
    }

    /* renamed from: a */
    private static void m7490a(C0680a c0680a, GlobalUpgrade globalUpgrade) {
        int i;
        int i2;
        f6614v++;
        Object globalUpgrade2 = new GlobalUpgrade(GlobalUpgradeType.valueOf(c0680a.m2359a("name")));
        if (globalUpgrade == null) {
            globalUpgrade2.f6628s = 0;
        } else {
            globalUpgrade2.f6628s = globalUpgrade.f6628s + 1;
        }
        try {
            globalUpgrade2.f6621l = GlobalUpgradeCategory.m7501a(Alias.valueOf(c0680a.m2359a("category")));
            globalUpgrade2.f6622m = c0680a.m2363d("level");
            globalUpgrade2.f6623n = c0680a.m2363d("x");
            globalUpgrade2.f6624o = 8192 - c0680a.m2363d("y");
            globalUpgrade2.f6625p = c0680a.m2363d("pivot-x");
            globalUpgrade2.f6626q = -c0680a.m2363d("pivot-y");
            globalUpgrade2.f6627r = c0680a.m2363d("price");
            String a = c0680a.m2360a("values", "");
            globalUpgrade2.f6629t = 1.0f - ((PMath.m8820a((float) globalUpgrade2.f6623n, (float) globalUpgrade2.f6624o, 4096.0f, 4096.0f) / 8192.0f) * 1.4142f);
            if (!a.equals("")) {
                i = 0;
                for (String parseFloat : a.split(",")) {
                    globalUpgrade2.f6630u[i] = Float.parseFloat(parseFloat);
                    i++;
                }
            }
            if (globalUpgrade2.f6623n < f6607b) {
                f6607b = globalUpgrade2.f6623n;
            }
            if (globalUpgrade2.f6623n > f6608c) {
                f6608c = globalUpgrade2.f6623n;
            }
            if (globalUpgrade2.f6624o < f6609d) {
                f6609d = globalUpgrade2.f6624o;
            }
            if (globalUpgrade2.f6624o > f6610e) {
                f6610e = globalUpgrade2.f6624o;
            }
        } catch (Throwable e) {
            Throwable th = e;
            Game.game.logger.m7510b("GlobalUpgrade", "error while reading xml element: " + c0680a.m2359a("name"));
            Game.game.logger.m7510b("GlobalUpgrade", "available attributes:");
            Iterator b = c0680a.f3029b.mo544b();
            while (b.hasNext()) {
                C0707b c0707b = (C0707b) b.next();
                Game.game.logger.m7510b((String) c0707b.f3163a, (String) c0707b.f3164b);
            }
            Game.game.logger.m7509a(th);
        }
        if (globalUpgrade != null) {
            if (globalUpgrade2.f6618i == null || globalUpgrade2.f6618i == globalUpgrade) {
                if (!globalUpgrade.f6631z.m2490c(globalUpgrade2.f6620k)) {
                    globalUpgrade.f6619j.m2296a(globalUpgrade2);
                    globalUpgrade.f6631z.m2486a(globalUpgrade2.f6620k);
                    globalUpgrade2.f6618i = globalUpgrade;
                }
            } else {
                Game.game.logger.m7510b("GlobalUpgrade", globalUpgrade2.f6620k.name() + " already has parent");
                Game.game.logger.m7509a(new Exception());
            }
        }
        i = c0680a.m2356a();
        if (i != 0) {
            for (i2 = 0; i2 < i; i2++) {
                m7490a(c0680a.m2358a(i2), (GlobalUpgrade) globalUpgrade2);
            }
        }
    }

    /* renamed from: a */
    public static void m7491a(FilteringMode filteringMode, C0712r<GlobalUpgradeType> c0712r) {
        f6616x = c0712r;
        f6617y = filteringMode;
    }

    /* renamed from: a */
    public static boolean m7492a(GlobalUpgradeType globalUpgradeType) {
        boolean z = f6615w[globalUpgradeType.ordinal()];
        if (f6617y == FilteringMode.EXCEPT_FILTERED) {
            if (f6616x.m2490c((Object) globalUpgradeType)) {
                return false;
            }
        } else if (f6617y == FilteringMode.ONLY_FILTERED && !f6616x.m2490c((Object) globalUpgradeType)) {
            return false;
        }
        return z;
    }

    /* renamed from: b */
    public static int m7493b() {
        int a = Game.game.f6590w.m8800a();
        GlobalUpgradeType[] globalUpgradeTypeArr = GlobalUpgradeType.mm;
        int length = globalUpgradeTypeArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3;
            Object obj = globalUpgradeTypeArr[i];
            if (!m7492a(obj)) {
                GlobalUpgrade globalUpgrade = (GlobalUpgrade) f6606a.m2467a(obj);
                if (globalUpgrade.m7500e() && globalUpgrade.f6627r <= a) {
                    i3 = i2 + 1;
                    i++;
                    i2 = i3;
                }
            }
            i3 = i2;
            i++;
            i2 = i3;
        }
        return i2;
    }

    /* renamed from: b */
    public static void m7494b(GlobalUpgradeType globalUpgradeType) {
        int i = 0;
        if (!m7492a(globalUpgradeType)) {
            f6615w[globalUpgradeType.ordinal()] = true;
            Writer stringWriter = new StringWriter();
            try {
                ai a = new ai(stringWriter).m2374a("installedUpgrades");
                for (GlobalUpgradeType globalUpgradeType2 : GlobalUpgradeType.mm) {
                    if (f6615w[globalUpgradeType2.ordinal()]) {
                        ai a2 = a.m2374a("u");
                        a2.m2373a(globalUpgradeType2.name());
                        a2.m2372a();
                    }
                }
                a.m2372a();
            } catch (Throwable e) {
                Game.game.logger.m7509a(e);
            }
            Game.game.f6564H.m8839b("installedGlobalUpgrades", stringWriter.toString());
            Game.game.f6564H.m8844d();
            boolean[] zArr = f6615w;
            int length = zArr.length;
            int i2 = 0;
            while (i < length) {
                if (Boolean.valueOf(zArr[i]).booleanValue()) {
                    i2++;
                }
                i++;
            }
            Achievement.m7332a(Type.GLOBAL_UPGRADES, i2);
        }
    }

    /* renamed from: c */
    public static GlobalUpgrade m7495c(GlobalUpgradeType globalUpgradeType) {
        return (GlobalUpgrade) f6606a.m2467a((Object) globalUpgradeType);
    }

    /* renamed from: g */
    private static void m7497g() {
        f6614v = 0;
        f6615w = new boolean[GlobalUpgradeType.values().length];
        f6606a.mo543a();
        f6607b = Integer.MAX_VALUE;
        f6608c = Integer.MIN_VALUE;
        f6609d = Integer.MAX_VALUE;
        f6610e = Integer.MIN_VALUE;
        m7490a(new ah().m2368a(Gdx.files.mo277b("global-upgrades.xml")), null);
        if (f6614v != GlobalUpgradeType.values().length) {
            Game.game.logger.m7510b("GlobalUpgrade", "Number of upgrade types (" + GlobalUpgradeType.values().length + ") doesn't match the number in XML file (" + f6614v + ")");
        }
        Iterator b = f6606a.mo544b();
        while (b.hasNext()) {
            C0707b c0707b = (C0707b) b.next();
            if (((GlobalUpgrade) c0707b.f3164b).f6627r == 0) {
                f6615w[((GlobalUpgradeType) c0707b.f3163a).ordinal()] = true;
            }
        }
        String a = Game.game.f6564H.m8838a("installedGlobalUpgrades", null);
        if (a != null) {
            C0680a a2 = new ah().m2369a(a);
            for (int i = 0; i < a2.m2356a(); i++) {
                C0680a a3 = a2.m2358a(i);
                try {
                    f6615w[GlobalUpgradeType.valueOf(a3.f3031d).ordinal()] = true;
                } catch (Exception e) {
                    Game.game.logger.m7510b("GlobalUpgrade", "Saved installed upgrade '" + a3.f3031d + "' not found and was ignored");
                }
            }
        }
        f6611f = f6608c - f6607b;
        f6612g = f6610e - f6609d;
    }

    /* renamed from: c */
    public final String m7498c() {
        GlobalUpgradeCategory globalUpgradeCategory = this.f6621l;
        return globalUpgradeCategory.f6689f ? Game.f6551e.m2416a(globalUpgradeCategory.f6686c) + " " + f6613h[this.f6622m] : Game.f6551e.m2416a(globalUpgradeCategory.f6686c);
    }

    /* renamed from: d */
    public final TowerType m7499d() {
        TowerType towerType = null;
        if (this.f6620k.name().startsWith("TOWER_")) {
            try {
                towerType = TowerType.valueOf(this.f6620k.name().split("_")[1]);
            } catch (Exception e) {
            }
        }
        return towerType;
    }

    /* renamed from: e */
    public final boolean m7500e() {
        return this.f6618i == null || m7492a(this.f6618i.f6620k);
    }
}
