package com.badlogic.gdx;

import com.badlogic.gdx.p016c.C0316a;

public interface Files {

    public enum FileType {
        Classpath,
        Internal,
        External,
        Absolute,
        Local
    }

    /* renamed from: a */
    C0316a mo274a(String str);

    /* renamed from: a */
    C0316a mo275a(String str, FileType fileType);

    /* renamed from: a */
    String mo276a();

    /* renamed from: b */
    C0316a mo277b(String str);

    /* renamed from: b */
    String mo278b();
}
