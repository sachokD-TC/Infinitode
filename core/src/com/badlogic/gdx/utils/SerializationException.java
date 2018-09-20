package com.badlogic.gdx.utils;

public class SerializationException extends RuntimeException {
    private StringBuffer trace;

    public SerializationException(String str) {
        super(str);
    }

    public SerializationException(String str, Throwable th) {
        super(str, th);
    }

    public SerializationException(Throwable th) {
        super("", th);
    }

    /* renamed from: a */
    public final void m2283a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("log cannot be null.");
        }
        if (this.trace == null) {
            this.trace = new StringBuffer(512);
        }
        this.trace.append('\n');
        this.trace.append(str);
    }

    public String getMessage() {
        if (this.trace == null) {
            return super.getMessage();
        }
        StringBuffer stringBuffer = new StringBuffer(512);
        stringBuffer.append(super.getMessage());
        if (stringBuffer.length() > 0) {
            stringBuffer.append('\n');
        }
        stringBuffer.append("Serialization trace:");
        stringBuffer.append(this.trace);
        return stringBuffer.toString();
    }
}
