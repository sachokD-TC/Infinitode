package com.prineside.tdi;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.C0676a;
import java.util.Locale;

public class Language {
    /* renamed from: a */
    public static C0676a<Language> f6744a;
    /* renamed from: b */
    public String f6745b;
    /* renamed from: c */
    public String f6746c;
    /* renamed from: d */
    public String f6747d;

    private Language(String str, String str2) {
        this.f6746c = str;
        this.f6745b = str2;
        this.f6747d = str.split("_")[0];
        Game.game.logger.log("Language", "Registered '" + this.f6747d + "'");
    }

    /* renamed from: a */
    public static void m7503a() {
        f6744a = new C0676a();
        String[] strArr = new String[]{"MainBundle.properties", "MainBundle_de_DE.properties", "MainBundle_en_US.properties", "MainBundle_es_ES.properties", "MainBundle_fr_FR.properties", "MainBundle_pt_BR.properties", "MainBundle_ru_RU.properties", "MainBundle_zh_CN.properties"};
        for (int i = 0; i < 8; i++) {
            String str = strArr[i];
            if (str.startsWith("MainBundle")) {
                String substring = str.substring(10, str.length() - 11);
                if (substring.length() != 0) {
                    if (substring.charAt(0) == '_') {
                        substring = substring.substring(1);
                    }
                    String[] split = substring.split("_");
                    String str2 = (split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1])).getDisplayLanguage() + " (" + substring + ")";
                    for (String split2 : Gdx.files.mo277b("i18n/" + str).m899k().split("\n")) {
                        String[] split3 = split2.split("=");
                        if (split3.length > 1 && split3[0].equals("THE_NAME_OF_THE_LANGUAGE")) {
                            str2 = split3[1].trim();
                            break;
                        }
                    }
                    f6744a.m2296a(new Language(substring, str2));
                }
            }
        }
    }
}
