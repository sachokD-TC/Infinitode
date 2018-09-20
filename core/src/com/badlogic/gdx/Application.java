package com.badlogic.gdx;

import com.badlogic.gdx.utils.C0314e;

public interface Application {
    public static final int LOG_DEBUG = 3;
    public static final int LOG_ERROR = 1;
    public static final int LOG_INFO = 2;
    public static final int LOG_NONE = 0;

    public enum ApplicationType {
        Android,
        Desktop,
        HeadlessDesktop,
        Applet,
        WebGL,
        iOS
    }

    void addLifecycleListener(C0280i c0280i);

    void debug(String str, String str2);

    void debug(String str, String str2, Throwable th);

    void error(String str, String str2);

    void error(String str, String str2, Throwable th);

    void exit();

    ApplicationListener getApplicationListener();

    C0279b getApplicationLogger();

    C0312c getAudio();

    C0314e getClipboard();

    Files getFiles();

    C0326e getGraphics();

    Input getInput();

    long getJavaHeap();

    int getLogLevel();

    long getNativeHeap();

    C0350j getNet();

    C0353k getPreferences(String str);

    ApplicationType getType();

    int getVersion();

    void log(String str, String str2);

    void log(String str, String str2, Throwable th);

    void postRunnable(Runnable runnable);

    void removeLifecycleListener(C0280i c0280i);

    void setApplicationLogger(C0279b c0279b);

    void setLogLevel(int i);
}
