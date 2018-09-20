package com.badlogic.gdx.pay.android.googleplay;

public class GdxPayException extends RuntimeException {
    public GdxPayException(String str) {
        super(str);
    }

    public GdxPayException(String str, Exception exception) {
        super(str, exception);
    }
}
