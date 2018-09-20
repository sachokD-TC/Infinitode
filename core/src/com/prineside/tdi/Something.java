package com.prineside.tdi;

import com.badlogic.gdx.C0350j.C0374b;
import com.badlogic.gdx.C0350j.C0516a;
import com.badlogic.gdx.C0350j.C0517c;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.p018e.C0371a;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0687c;
import com.badlogic.gdx.utils.C0694m;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.C0712r;
import com.badlogic.gdx.utils.JsonValue;
import com.prineside.tdi.Sound.Type;
import com.prineside.tdi.tileInventory.Inventory;
import com.prineside.tdi.tiles.SpaceTileBonus;
import com.prineside.tdi.tiles.Tile;
import com.prineside.tdi.tiles.Tile.TileType;
import com.prineside.tdi.tiles.types.SpaceTile;
import com.prineside.tdi.towers.TowerStat.TowerStatType;
import com.prineside.tdi.utility.ObjectRetriever;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Something {
    /* renamed from: a */
    private static C0710q<EasterEggType, Something> f6788a;
    /* renamed from: b */
    private static C0712r<EasterEggType> f6789b;
    /* renamed from: c */
    private static C0676a<String> f6790c;
    /* renamed from: d */
    private static C0710q<String, EasterEggType> f6791d;

    /* renamed from: com.prineside.tdi.Something$1 */
    static class C10701 extends Something {
        C10701() {
        }

        /* renamed from: c */
        public final void mo1750c() {
            Game.game.m7454b(10000);
        }
    }

    /* renamed from: com.prineside.tdi.Something$2 */
    static class C10712 extends Something {
        C10712() {
        }

        /* renamed from: c */
        public final void mo1750c() {
            Game.game.m7454b(10000);
        }
    }

    /* renamed from: com.prineside.tdi.Something$3 */
    static class C10723 extends Something {
        C10723() {
        }

        /* renamed from: c */
        public final void mo1750c() {
            Game.game.m7454b(30000);
        }
    }

    /* renamed from: com.prineside.tdi.Something$4 */
    static class C10734 extends Something {
        C10734() {
        }

        /* renamed from: c */
        public final void mo1750c() {
            Game.game.m7454b(50000);
        }
    }

    /* renamed from: com.prineside.tdi.Something$5 */
    static class C10745 extends Something {
        C10745() {
        }

        /* renamed from: c */
        public final void mo1750c() {
            Game.game.m7454b(25000);
        }
    }

    /* renamed from: com.prineside.tdi.Something$6 */
    static class C10756 extends Something {
        C10756() {
        }

        /* renamed from: c */
        public final void mo1750c() {
            Game.game.m7454b(5000);
        }
    }

    /* renamed from: com.prineside.tdi.Something$7 */
    static class C10767 extends Something {
        C10767() {
        }

        /* renamed from: c */
        public final void mo1750c() {
            Game.game.m7454b(10000);
        }
    }

    /* renamed from: com.prineside.tdi.Something$8 */
    static class C10778 implements GameListener {
        C10778() {
        }

        /* renamed from: a */
        public final void mo1712a() {
        }

        /* renamed from: c */
        public final void mo1713c() {
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

        public final void k_() {
            Something.m7546b();
        }
    }

    public static class CodeValidationResult {
        /* renamed from: a */
        public String f6794a;
        /* renamed from: b */
        public CodeValidationResultCode f6795b;
        /* renamed from: c */
        public C0676a<String> f6796c = new C0676a();

        public CodeValidationResult(CodeValidationResultCode codeValidationResultCode, String str) {
            this.f6794a = str;
            this.f6795b = codeValidationResultCode;
        }

        public CodeValidationResult(CodeValidationResultCode codeValidationResultCode, String str, C0676a<String> c0676a) {
            this.f6794a = str;
            this.f6795b = codeValidationResultCode;
            this.f6796c = c0676a;
        }
    }

    public enum CodeValidationResultCode {
        NOT_EXISTS,
        APPLIED,
        ALREADY_USED,
        PROCESSING,
        ERROR,
        GAME_UPDATE_REQUIRED
    }

    public enum EasterEggType {
        THANKS_FOR_HACKING_JOKE,
        GU_SCREEN_RESISTANCE,
        TRANSLATION_HELP_SMALL,
        TRANSLATION_HELP_MEDIUM,
        TRANSLATION_HELP_LARGE,
        TRANSLATION_HELP_CN,
        TRANSLATION_HELP_SMALL_2,
        TRANSLATION_HELP_MEDIUM_2
    }

    static {
        C0710q c0710q = new C0710q();
        f6791d = c0710q;
        c0710q.mo542a("Z29vLmdsL3lBdGhsTiAgIA==", EasterEggType.THANKS_FOR_HACKING_JOKE);
        f6791d.mo542a("fD60XVFRFjodKBUqzfKs0Q==", EasterEggType.TRANSLATION_HELP_SMALL);
        f6791d.mo542a("Pi2/l7B0wXhwfRSOTeABJg==", EasterEggType.TRANSLATION_HELP_MEDIUM);
        f6791d.mo542a("Q3I16m1uQqvV3DhmpQYHGA==", EasterEggType.TRANSLATION_HELP_LARGE);
        f6791d.mo542a("WEtrJHI1SCg1h6Ad25q6aw==", EasterEggType.TRANSLATION_HELP_CN);
        f6791d.mo542a("AAAgA8DTpkPHYO7REDPI5w==", EasterEggType.TRANSLATION_HELP_SMALL_2);
        f6791d.mo542a("ybv71eNGc3+shy1ZHYsPlg==", EasterEggType.TRANSLATION_HELP_MEDIUM_2);
    }

    /* renamed from: a */
    public static void m7542a() {
        C0710q c0710q = new C0710q();
        f6788a = c0710q;
        c0710q.mo542a(EasterEggType.GU_SCREEN_RESISTANCE, new C10701());
        f6788a.mo542a(EasterEggType.TRANSLATION_HELP_SMALL, new C10712());
        f6788a.mo542a(EasterEggType.TRANSLATION_HELP_MEDIUM, new C10723());
        f6788a.mo542a(EasterEggType.TRANSLATION_HELP_LARGE, new C10734());
        f6788a.mo542a(EasterEggType.TRANSLATION_HELP_CN, new C10745());
        f6788a.mo542a(EasterEggType.TRANSLATION_HELP_SMALL_2, new C10756());
        f6788a.mo542a(EasterEggType.TRANSLATION_HELP_MEDIUM_2, new C10767());
        m7546b();
        Game.game.m7450a(new C10778());
    }

    /* renamed from: a */
    public static void m7543a(String str) {
        if (!m7547b(str)) {
            f6790c.m2296a((Object) str);
            Sound.m7569a(Type.UPGRADE);
            m7548d();
        }
    }

    /* renamed from: a */
    public static void m7544a(final String str, final ObjectRetriever<CodeValidationResult> objectRetriever) {
        int i = 0;
        Object obj = str;
        while (i < 3) {
            try {
                obj = new String(C0687c.m2388a(MessageDigest.getInstance("MD5").digest(obj.toLowerCase().getBytes("UTF-8"))));
                i++;
            } catch (Exception e) {
                objectRetriever.mo1711a(new CodeValidationResult(CodeValidationResultCode.NOT_EXISTS, "Code not found"));
                return;
            }
        }
        Game.game.logger.log("Something", "hash: " + obj);
        if (f6791d.m2474c(obj)) {
            if (m7545a((EasterEggType) f6791d.m2467a(obj))) {
                objectRetriever.mo1711a(new CodeValidationResult(CodeValidationResultCode.APPLIED, "Success!"));
            } else {
                objectRetriever.mo1711a(new CodeValidationResult(CodeValidationResultCode.ALREADY_USED, "Code already used"));
            }
        } else if (m7547b(str)) {
            objectRetriever.mo1711a(new CodeValidationResult(CodeValidationResultCode.ALREADY_USED, "Code already used"));
        } else {
            objectRetriever.mo1711a(new CodeValidationResult(CodeValidationResultCode.PROCESSING, "Processing..."));
            try {
                C0516a c0516a = new C0516a("POST");
                c0516a.f2304b = "http://infinitode.prineside.com/?m=api&a=redeemSecretCode";
                Map hashMap = new HashMap();
                hashMap.put("code", str);
                c0516a.f2307e = C0371a.m1073a(hashMap);
                Gdx.net.mo313a(c0516a, new C0517c() {
                    /* renamed from: a */
                    public final void mo1740a(C0374b c0374b) {
                        try {
                            String a = c0374b.mo343a();
                            Game.game.logger.log("Something", a);
                            JsonValue a2 = new C0694m().m2433a(a);
                            if (!a2.m2259a("status").m2260a().equals("success")) {
                                objectRetriever.mo1711a(new CodeValidationResult(CodeValidationResultCode.ERROR, a2.m2259a("message").m2260a()));
                            } else if (a2.m2259a("requiredGameBuild").m2269e() > 66) {
                                objectRetriever.mo1711a(new CodeValidationResult(CodeValidationResultCode.GAME_UPDATE_REQUIRED, "Please update the game to apply this code"));
                            } else {
                                Something.m7543a(str);
                                C0676a c0676a = new C0676a();
                                Inventory a3 = Inventory.m8354a();
                                Iterator o = a2.m2259a("contents").m2280o();
                                while (o.hasNext()) {
                                    a2 = (JsonValue) o.next();
                                    String a4 = a2.m2259a("type").m2260a();
                                    if (a4.equals("tile")) {
                                        int e = a2.m2259a("amount").m2269e();
                                        for (int i = 0; i < e; i++) {
                                            JsonValue a5 = a2.m2259a("params");
                                            if (TileType.valueOf(a5.m2259a("tileType").m2260a()) == TileType.SPACE) {
                                                Tile a6;
                                                if (a5.m2259a("random").m2271f()) {
                                                    a6 = a3.m8356a(a5.m2259a("randomQuality").m2262b(), TileType.SPACE);
                                                } else {
                                                    Tile spaceTile = new SpaceTile(0, 0);
                                                    if ((a5.m2259a("uniqueBonusLevel") != null ? 1 : null) != null) {
                                                        spaceTile.f7992t = a5.m2259a("uniqueBonusLevel").m2269e();
                                                        Game.game.logger.log("Something", "UBL " + a5.m2259a("uniqueBonusLevel").m2269e());
                                                    }
                                                    if (a5.m2266c("bonuses")) {
                                                        Iterator o2 = a5.m2259a("bonuses").m2280o();
                                                        int i2 = 0;
                                                        while (o2.hasNext()) {
                                                            JsonValue jsonValue = (JsonValue) o2.next();
                                                            spaceTile.m8398a(i2, new SpaceTileBonus(TowerStatType.valueOf(jsonValue.m2268d("type")), jsonValue.m2270e("level")));
                                                            i2++;
                                                        }
                                                    }
                                                    a6 = spaceTile;
                                                }
                                                a3.m8358a(a6, 1);
                                            }
                                        }
                                        c0676a.m2296a("Tile x" + e);
                                    } else if (a4.equals("money")) {
                                        int e2 = a2.m2270e("amount");
                                        Game.game.m7454b(e2);
                                        c0676a.m2296a("Green papers x" + e2);
                                    } else {
                                        throw new RuntimeException("Unknown content item type: " + a4);
                                    }
                                }
                                a3.m8360b();
                                objectRetriever.mo1711a(new CodeValidationResult(CodeValidationResultCode.APPLIED, "Success!", c0676a));
                            }
                        } catch (Throwable e3) {
                            Game.game.logger.log("Something", "Exception: " + e3.getMessage());
                            Game.game.logger.m7509a(e3);
                        }
                    }

                    /* renamed from: a */
                    public final void mo1741a(Throwable th) {
                        Game.game.logger.log("Something", "Error redeeming secret code: " + th.getMessage());
                        objectRetriever.mo1711a(new CodeValidationResult(CodeValidationResultCode.ERROR, "Error, please try again later"));
                    }
                });
            } catch (Exception e2) {
                Game.game.logger.log("Something", "Failed (" + e2.getMessage() + ")");
                objectRetriever.mo1711a(new CodeValidationResult(CodeValidationResultCode.ERROR, "Error, please try again later"));
            }
        }
    }

    /* renamed from: a */
    public static boolean m7545a(EasterEggType easterEggType) {
        if (f6789b.m2490c((Object) easterEggType)) {
            return false;
        }
        f6789b.m2486a((Object) easterEggType);
        ((Something) f6788a.m2467a((Object) easterEggType)).mo1750c();
        Sound.m7569a(Type.UPGRADE);
        m7548d();
        return true;
    }

    /* renamed from: b */
    public static void m7546b() {
        int i = 0;
        f6790c = new C0676a();
        if (Game.game.f6564H.m8841b("comething...")) {
            for (Object obj : Game.game.f6564H.m8838a("comething...", "").split(",")) {
                try {
                    if (obj.length() != 0) {
                        f6790c.m2296a(obj);
                    }
                } catch (Exception e) {
                }
            }
        }
        f6789b = new C0712r();
        if (Game.game.f6564H.m8841b("something...")) {
            String[] split = Game.game.f6564H.m8838a("something...", "").split(",");
            int length = split.length;
            while (i < length) {
                String str = split[i];
                try {
                    if (str.length() != 0) {
                        f6789b.m2486a(EasterEggType.valueOf(str));
                    }
                } catch (Exception e2) {
                }
                i++;
            }
        }
    }

    /* renamed from: b */
    private static boolean m7547b(String str) {
        Iterator it = f6790c.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private static void m7548d() {
        Iterator c = f6789b.m2489c();
        String str = "";
        while (c.hasNext()) {
            str = str + ((EasterEggType) c.next()).name() + ",";
        }
        if (str.length() != 0) {
            Game.game.f6564H.m8839b("something...", str);
            Game.game.f6564H.m8844d();
        }
        c = f6790c.iterator();
        str = "";
        while (c.hasNext()) {
            str = str + ((String) c.next()) + ",";
        }
        if (str.length() != 0) {
            Game.game.f6564H.m8839b("comething...", str);
            Game.game.f6564H.m8844d();
        }
    }

    /* renamed from: c */
    public void mo1750c() {
    }
}
