package com.badlogic.gdx.p018e;

import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;

/* renamed from: com.badlogic.gdx.e.a */
public final class C0371a {
    /* renamed from: a */
    public static String f1337a = "UTF-8";
    /* renamed from: b */
    public static String f1338b = "=";
    /* renamed from: c */
    public static String f1339c = "&";

    /* renamed from: a */
    private static String m1072a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static String m1073a(Map<String, String> map) {
        Set<String> keySet = map.keySet();
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : keySet) {
            stringBuffer.append(C0371a.m1072a(str, f1337a));
            stringBuffer.append(f1338b);
            stringBuffer.append(C0371a.m1072a((String) map.get(str), f1337a));
            stringBuffer.append(f1339c);
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }
}
