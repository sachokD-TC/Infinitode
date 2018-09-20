package com.badlogic.gdx.utils;

public class GdxRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 6735854402467673117L;

    public GdxRuntimeException(String str) {
        super(str);
    }

    public GdxRuntimeException(String str, Throwable th) {
        super(str, th);
    }

    public GdxRuntimeException(Throwable th) {
        super(th);
    }
}
