package com.prineside.tdi.utility;

import com.prineside.tdi.Game;
import java.util.Locale;

public class StringFormatter {
    /* renamed from: a */
    public static String m8846a(float f) {
        if (f < 1000.0f) {
            return String.format(Locale.ENGLISH, "%.0f", new Object[]{Float.valueOf(f)});
        } else if (f < 1000000.0f) {
            return String.format(Locale.ENGLISH, "%.0f%s", new Object[]{Float.valueOf(f / 1000.0f), Game.f6551e.m2416a("LARGE_NUMBER_CHAR_THOUSAND")});
        } else if (f < 1.0E9f) {
            return String.format(Locale.ENGLISH, "%.0f%s", new Object[]{Float.valueOf(f / 1000000.0f), Game.f6551e.m2416a("LARGE_NUMBER_CHAR_MILLION")});
        } else if (f < 1.0E12f) {
            return String.format(Locale.ENGLISH, "%.0f%s", new Object[]{Float.valueOf(f / 1.0E9f), Game.f6551e.m2416a("LARGE_NUMBER_CHAR_BILLION")});
        } else {
            return String.format(Locale.ENGLISH, "%.0f%s", new Object[]{Float.valueOf(f / 1.0E12f), Game.f6551e.m2416a("LARGE_NUMBER_CHAR_TRILLION")});
        }
    }

    /* renamed from: a */
    public static String m8847a(int i) {
        if (i <= 0) {
            return "-";
        }
        int i2 = (i / 60) / 60;
        int i3 = (i % 3600) / 60;
        int i4 = i % 60;
        String str = "";
        if (i2 != 0) {
            str = str + i2 + " " + Game.f6551e.m2416a("TIME_CHAR_HOUR") + " ";
        }
        if (i2 > 0 || i3 != 0) {
            str = str + i3 + " " + Game.f6551e.m2416a("TIME_CHAR_MINUTE") + " ";
        }
        return str + i4 + " " + Game.f6551e.m2416a("TIME_CHAR_SECOND");
    }
}
