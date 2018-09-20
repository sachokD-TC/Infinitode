package com.prineside.tdi.utility;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.C0353k;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.C0687c;
import com.badlogic.gdx.utils.C0710q;
import com.prineside.tdi.Game;
import java.util.Map.Entry;

public class SafePreferences {
    /* renamed from: a */
    private static final C0710q<String, SafePreferences> f8662a = new C0710q();
    /* renamed from: b */
    private static boolean f8663b = false;
    /* renamed from: c */
    private static byte[] f8664c = new byte[]{(byte) -14, (byte) 28, (byte) -1, (byte) -93, (byte) 8, (byte) 7, (byte) 18, (byte) 71};
    /* renamed from: d */
    private C0353k f8665d;

    private SafePreferences(String str) {
        this.f8665d = Gdx.app.getPreferences(str);
    }

    /* renamed from: a */
    private static char m8834a(char c, int i) {
        return (char) ((((((c - 32) + i) % 94) + 94) % 94) + 32);
    }

    /* renamed from: a */
    public static SafePreferences m8835a(String str) {
        if (f8662a.m2474c((Object) str)) {
            return (SafePreferences) f8662a.m2467a((Object) str);
        }
        SafePreferences safePreferences = new SafePreferences(str);
        f8662a.mo542a(str, safePreferences);
        return safePreferences;
    }

    /* renamed from: a */
    public static void m8836a() {
        f8663b = true;
    }

    /* renamed from: a */
    public static void m8837a(byte[] bArr) {
        if (f8663b) {
            Game.game.logger.log("SafePreferences", "Already init, can't set secret");
        } else {
            f8664c = bArr;
        }
    }

    /* renamed from: a */
    public final synchronized String m8838a(String str, String str2) {
        if (this.f8665d.mo319b(str)) {
            String a = this.f8665d.mo316a(str);
            if (Gdx.app.getType() != ApplicationType.iOS) {
                char[] toCharArray = a.toCharArray();
                int i = 0;
                for (int i2 = 0; i2 < toCharArray.length; i2++) {
                    toCharArray[i2] = m8834a(toCharArray[i2], -(((((int) (((float) i2) * 1.3f)) + i2) + toCharArray.length) - f8664c[i]));
                    i++;
                    if (i == f8664c.length) {
                        i = 0;
                    }
                }
                a = new String(toCharArray);
            }
            try {
                str2 = new String(C0687c.m2391c(a));
            } catch (Throwable e) {
                if (Game.game != null) {
                    Game.game.logger.m7510b("SafePreferences", "Unable to decode Base64 for key '" + str + "': " + e.getMessage());
                    Game.game.logger.m7509a(e);
                }
                m8843c(str);
                m8844d();
            }
        }
        return str2;
    }

    /* renamed from: b */
    public final synchronized void m8839b(String str, String str2) {
        C0353k c0353k = this.f8665d;
        String a = C0687c.m2386a(str2);
        if (Gdx.app.getType() != ApplicationType.iOS) {
            char[] toCharArray = a.toCharArray();
            int i = 0;
            for (int i2 = 0; i2 < toCharArray.length; i2++) {
                toCharArray[i2] = m8834a(toCharArray[i2], ((((int) (((float) i2) * 1.3f)) + i2) + toCharArray.length) - f8664c[i]);
                i++;
                if (i == f8664c.length) {
                    i = 0;
                }
            }
            a = String.valueOf(toCharArray);
        }
        c0353k.mo315a(str, a);
    }

    /* renamed from: b */
    public final boolean m8840b() {
        return Gdx.app.getType() == ApplicationType.iOS ? false : this.f8665d.mo317a().isEmpty();
    }

    /* renamed from: b */
    public final synchronized boolean m8841b(String str) {
        return this.f8665d.mo319b(str);
    }

    /* renamed from: c */
    public final C0710q<String, String> m8842c() {
        C0710q<String, String> c0710q = new C0710q();
        for (Entry entry : this.f8665d.mo317a().entrySet()) {
            if (entry.getValue() instanceof String) {
                c0710q.mo542a(entry.getKey(), m8838a((String) entry.getKey(), ""));
            } else {
                Game.game.logger.log("SafePreferences", "getAll - invalid data type for key '" + ((String) entry.getKey()) + "' : " + entry.getValue().getClass().getName());
            }
        }
        return c0710q;
    }

    /* renamed from: c */
    public final synchronized void m8843c(String str) {
        this.f8665d.mo321c(str);
    }

    /* renamed from: d */
    public final synchronized void m8844d() {
        this.f8665d.mo320c();
    }

    /* renamed from: e */
    public final synchronized void m8845e() {
        this.f8665d.mo318b();
        this.f8665d.mo320c();
    }
}
