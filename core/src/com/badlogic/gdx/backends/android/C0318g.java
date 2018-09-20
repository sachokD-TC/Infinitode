package com.badlogic.gdx.backends.android;

import android.content.res.AssetManager;
import android.os.Environment;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.p016c.C0316a;

/* renamed from: com.badlogic.gdx.backends.android.g */
public final class C0318g implements Files {
    /* renamed from: a */
    protected final String f1122a = (Environment.getExternalStorageDirectory().getAbsolutePath() + "/");
    /* renamed from: b */
    protected final String f1123b;
    /* renamed from: c */
    protected final AssetManager f1124c;
    /* renamed from: d */
    C0359x f1125d = null;

    public C0318g(AssetManager assetManager, String str) {
        this.f1124c = assetManager;
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        this.f1123b = str;
    }

    /* renamed from: a */
    private C0316a m910a(C0316a c0316a, String str) {
        try {
            this.f1124c.open(str).close();
            return c0316a;
        } catch (Exception e) {
            C0316a c0357w = new C0357w(str);
            return !c0357w.mo269c() ? c0357w : c0357w.mo270d() ? c0357w : c0316a;
        }
    }

    /* renamed from: a */
    public final C0316a mo274a(String str) {
        return new C0317f(null, str, FileType.Classpath);
    }

    /* renamed from: a */
    public final C0316a mo275a(String str, FileType fileType) {
        C0316a c0317f = new C0317f(fileType == FileType.Internal ? this.f1124c : null, str, fileType);
        return (this.f1125d == null || fileType != FileType.Internal) ? c0317f : m910a(c0317f, str);
    }

    /* renamed from: a */
    public final String mo276a() {
        return this.f1122a;
    }

    /* renamed from: b */
    public final C0316a mo277b(String str) {
        C0316a c0317f = new C0317f(this.f1124c, str, FileType.Internal);
        return this.f1125d != null ? m910a(c0317f, str) : c0317f;
    }

    /* renamed from: b */
    public final String mo278b() {
        return this.f1123b;
    }
}
