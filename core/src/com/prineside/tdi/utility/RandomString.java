package com.prineside.tdi.utility;

public class RandomString {
    /* renamed from: a */
    private static final char[] f8661a;

    static {
        char c;
        StringBuilder stringBuilder = new StringBuilder();
        for (c = '0'; c <= '9'; c = (char) (c + 1)) {
            stringBuilder.append(c);
        }
        for (c = 'a'; c <= 'z'; c = (char) (c + 1)) {
            stringBuilder.append(c);
        }
        f8661a = stringBuilder.toString().toCharArray();
    }
}
