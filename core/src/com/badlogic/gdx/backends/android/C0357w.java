package com.badlogic.gdx.backends.android;

import android.content.res.AssetFileDescriptor;
import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.android.C0359x.C0358a;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.badlogic.gdx.backends.android.w */
public final class C0357w extends C0317f {
    /* renamed from: c */
    private AssetFileDescriptor f1278c;
    /* renamed from: d */
    private C0359x f1279d;
    /* renamed from: e */
    private String f1280e;

    private C0357w(File file, FileType fileType) {
        super(null, file, fileType);
        m1014m();
    }

    public C0357w(String str) {
        super(null, str, FileType.Internal);
        m1014m();
    }

    /* renamed from: m */
    private void m1014m() {
        this.f1280e = this.a.getPath().replace('\\', '/');
        this.f1279d = ((C0318g) Gdx.files).f1125d;
        C0358a c0358a = (C0358a) this.f1279d.f1286a.get(this.f1280e);
        this.f1278c = c0358a != null ? c0358a.m1023a() : null;
        if (mo269c()) {
            this.f1280e += "/";
        }
    }

    /* renamed from: a */
    public final C0316a mo265a() {
        File parentFile = this.a.getParentFile();
        if (parentFile == null) {
            parentFile = new File("");
        }
        return new C0357w(parentFile.getPath());
    }

    /* renamed from: a */
    public final C0316a mo266a(String str) {
        return this.a.getPath().length() == 0 ? new C0357w(new File(str), this.b) : new C0357w(new File(this.a, str), this.b);
    }

    /* renamed from: b */
    public final C0316a mo267b(String str) {
        if (this.a.getPath().length() != 0) {
            return Gdx.files.mo275a(new File(this.a.getParent(), str).getPath(), this.b);
        }
        throw new GdxRuntimeException("Cannot get the sibling of the root.");
    }

    /* renamed from: b */
    public final InputStream mo268b() {
        Object obj = 1;
        try {
            C0359x c0359x = this.f1279d;
            String str = this.f1280e;
            C0358a c0358a = (C0358a) c0359x.f1286a.get(str);
            if (c0358a != null) {
                if (c0358a.f1283c != 0) {
                    obj = null;
                }
                if (obj != null) {
                    return c0358a.m1023a().createInputStream();
                }
                ZipFile zipFile = (ZipFile) c0359x.f1287b.get(c0358a.f1281a);
                if (zipFile == null) {
                    zipFile = new ZipFile(c0358a.f1281a, 1);
                    c0359x.f1287b.put(c0358a.f1281a, zipFile);
                }
                ZipEntry entry = zipFile.getEntry(str);
                if (entry != null) {
                    return zipFile.getInputStream(entry);
                }
            }
            return null;
        } catch (Throwable e) {
            throw new GdxRuntimeException("Error reading file: " + this.a + " (ZipResourceFile)", e);
        }
    }

    /* renamed from: c */
    public final boolean mo269c() {
        return this.f1278c == null;
    }

    /* renamed from: d */
    public final boolean mo270d() {
        if (this.f1278c == null) {
            C0359x c0359x = this.f1279d;
            String str = this.f1280e;
            Vector vector = new Vector();
            Collection<C0358a> values = c0359x.f1286a.values();
            String str2 = str == null ? "" : str;
            int length = str2.length();
            for (C0358a c0358a : values) {
                if (c0358a.f1282b.startsWith(str2) && -1 == c0358a.f1282b.indexOf(47, length)) {
                    vector.add(c0358a);
                }
            }
            if (((C0358a[]) vector.toArray(new C0358a[vector.size()])).length == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final long mo271e() {
        return this.f1278c != null ? this.f1278c.getLength() : 0;
    }

    /* renamed from: g */
    public final AssetFileDescriptor mo273g() {
        return this.f1278c;
    }
}
