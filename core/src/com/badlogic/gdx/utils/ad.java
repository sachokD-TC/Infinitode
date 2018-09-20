package com.badlogic.gdx.utils;

import java.text.MessageFormat;
import java.util.Locale;

final class ad {
    /* renamed from: a */
    private MessageFormat f3010a;
    /* renamed from: b */
    private ac f3011b = new ac();

    public ad(Locale locale, boolean z) {
        if (z) {
            this.f3010a = new MessageFormat("", locale);
        }
    }
}
