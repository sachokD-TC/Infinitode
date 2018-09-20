package com.badlogic.gdx.pay.android.googleplay;

import com.badlogic.gdx.pay.C0585h;

public class ConsumeException extends GdxPayException {
    public final C0585h transaction;

    public ConsumeException(String str, C0585h c0585h) {
        this(str, c0585h, null);
    }

    public ConsumeException(String str, C0585h c0585h, Exception exception) {
        super(str, exception);
        this.transaction = c0585h;
    }
}
