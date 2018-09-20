package com.badlogic.gdx.p016c;

import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.ab;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* renamed from: com.badlogic.gdx.c.a */
public class C0316a {
    /* renamed from: a */
    public File f1119a;
    /* renamed from: b */
    public FileType f1120b;

    protected C0316a() {
    }

    public C0316a(File file, FileType fileType) {
        this.f1119a = file;
        this.f1120b = fileType;
    }

    public C0316a(String str, FileType fileType) {
        this.f1120b = fileType;
        this.f1119a = new File(str);
    }

    /* renamed from: g */
    private int mo273g() {
        int e = (int) mo271e();
        return e != 0 ? e : 512;
    }

    /* renamed from: a */
    public C0316a mo265a() {
        File parentFile = this.f1119a.getParentFile();
        if (parentFile == null) {
            parentFile = this.f1120b == FileType.Absolute ? new File("/") : new File("");
        }
        return new C0316a(parentFile, this.f1120b);
    }

    /* renamed from: a */
    public C0316a mo266a(String str) {
        return this.f1119a.getPath().length() == 0 ? new C0316a(new File(str), this.f1120b) : new C0316a(new File(this.f1119a, str), this.f1120b);
    }

    /* renamed from: a */
    public final BufferedReader m888a(int i) {
        return new BufferedReader(new InputStreamReader(mo268b()), i);
    }

    /* renamed from: b */
    public C0316a mo267b(String str) {
        if (this.f1119a.getPath().length() != 0) {
            return new C0316a(new File(this.f1119a.getParent(), str), this.f1120b);
        }
        throw new GdxRuntimeException("Cannot get the sibling of the root.");
    }

    /* renamed from: b */
    public InputStream mo268b() {
        if (this.f1120b == FileType.Classpath || ((this.f1120b == FileType.Internal && !mo272f().exists()) || (this.f1120b == FileType.Local && !mo272f().exists()))) {
            InputStream resourceAsStream = C0316a.class.getResourceAsStream("/" + this.f1119a.getPath().replace('\\', '/'));
            if (resourceAsStream != null) {
                return resourceAsStream;
            }
            throw new GdxRuntimeException("File not found: " + this.f1119a + " (" + this.f1120b + ")");
        }
        try {
            return new FileInputStream(mo272f());
        } catch (Throwable e) {
            if (mo272f().isDirectory()) {
                throw new GdxRuntimeException("Cannot open a stream to a directory: " + this.f1119a + " (" + this.f1120b + ")", e);
            }
            throw new GdxRuntimeException("Error reading file: " + this.f1119a + " (" + this.f1120b + ")", e);
        }
    }

    /* renamed from: c */
    public final Reader m891c(String str) {
        Closeable b = mo268b();
        try {
            return new InputStreamReader(b, str);
        } catch (Throwable e) {
            ab.m2310a(b);
            throw new GdxRuntimeException("Error reading file: " + this, e);
        }
    }

    /* renamed from: c */
    public boolean mo269c() {
        return this.f1120b == FileType.Classpath ? false : mo272f().isDirectory();
    }

    /* renamed from: d */
    public boolean mo270d() {
        switch (this.f1120b) {
            case Internal:
                if (mo272f().exists()) {
                    return true;
                }
                break;
            case Classpath:
                break;
            default:
                return mo272f().exists();
        }
        return C0316a.class.getResource(new StringBuilder("/").append(this.f1119a.getPath().replace('\\', '/')).toString()) != null;
    }

    /* renamed from: e */
    public long mo271e() {
        if (this.f1120b != FileType.Classpath && (this.f1120b != FileType.Internal || this.f1119a.exists())) {
            return mo272f().length();
        }
        Closeable b = mo268b();
        long available;
        try {
            available = (long) b.available();
            return available;
        } catch (Exception e) {
            available = e;
            return 0;
        } finally {
            ab.m2310a(b);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0316a)) {
            return false;
        }
        C0316a c0316a = (C0316a) obj;
        return this.f1120b == c0316a.f1120b && m896h().equals(c0316a.m896h());
    }

    /* renamed from: f */
    public File mo272f() {
        return this.f1120b == FileType.External ? new File(Gdx.files.mo276a(), this.f1119a.getPath()) : this.f1119a;
    }

    /* renamed from: h */
    public final String m896h() {
        return this.f1119a.getPath().replace('\\', '/');
    }

    public int hashCode() {
        return ((this.f1120b.hashCode() + 37) * 67) + m896h().hashCode();
    }

    /* renamed from: i */
    public final String m897i() {
        String name = this.f1119a.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf == -1 ? name : name.substring(0, lastIndexOf);
    }

    /* renamed from: j */
    public final String m898j() {
        String replace = this.f1119a.getPath().replace('\\', '/');
        int lastIndexOf = replace.lastIndexOf(46);
        return lastIndexOf == -1 ? replace : replace.substring(0, lastIndexOf);
    }

    /* renamed from: k */
    public final String m899k() {
        Closeable inputStreamReader;
        Throwable e;
        StringBuilder stringBuilder = new StringBuilder(mo273g());
        try {
            inputStreamReader = new InputStreamReader(mo268b());
            try {
                char[] cArr = new char[256];
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read != -1) {
                        stringBuilder.append(cArr, 0, read);
                    } else {
                        ab.m2310a(inputStreamReader);
                        return stringBuilder.toString();
                    }
                }
            } catch (IOException e2) {
                e = e2;
                try {
                    throw new GdxRuntimeException("Error reading layout file: " + this, e);
                } catch (Throwable th) {
                    e = th;
                    ab.m2310a(inputStreamReader);
                    throw e;
                }
            }
        } catch (IOException e3) {
            e = e3;
            inputStreamReader = null;
            throw new GdxRuntimeException("Error reading layout file: " + this, e);
        } catch (Throwable th2) {
            e = th2;
            inputStreamReader = null;
            ab.m2310a(inputStreamReader);
            throw e;
        }
    }

    /* renamed from: l */
    public final byte[] m900l() {
        InputStream b = mo268b();
        try {
            byte[] a = ab.m2313a(b, mo273g());
            ab.m2310a(b);
            return a;
        } catch (Throwable e) {
            throw new GdxRuntimeException("Error reading file: " + this, e);
        } catch (Throwable th) {
            ab.m2310a(b);
        }
    }

    public String toString() {
        return this.f1119a.getPath().replace('\\', '/');
    }
}
