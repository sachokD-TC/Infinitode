package com.badlogic.gdx.backends.android;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.badlogic.gdx.backends.android.f */
public class C0317f extends C0316a {
    /* renamed from: c */
    private final AssetManager f1121c;

    C0317f(AssetManager assetManager, File file, FileType fileType) {
        super(file, fileType);
        this.f1121c = assetManager;
    }

    C0317f(AssetManager assetManager, String str, FileType fileType) {
        super(str.replace('\\', '/'), fileType);
        this.f1121c = assetManager;
    }

    /* renamed from: a */
    public C0316a mo265a() {
        File parentFile = this.a.getParentFile();
        if (parentFile == null) {
            parentFile = this.b == FileType.Absolute ? new File("/") : new File("");
        }
        return new C0317f(this.f1121c, parentFile, this.b);
    }

    /* renamed from: a */
    public C0316a mo266a(String str) {
        String replace = str.replace('\\', '/');
        return this.a.getPath().length() == 0 ? new C0317f(this.f1121c, new File(replace), this.b) : new C0317f(this.f1121c, new File(this.a, replace), this.b);
    }

    /* renamed from: b */
    public C0316a mo267b(String str) {
        String replace = str.replace('\\', '/');
        if (this.a.getPath().length() != 0) {
            return Gdx.files.mo275a(new File(this.a.getParent(), replace).getPath(), this.b);
        }
        throw new GdxRuntimeException("Cannot get the sibling of the root.");
    }

    /* renamed from: b */
    public InputStream mo268b() {
        if (this.b != FileType.Internal) {
            return super.mo268b();
        }
        try {
            return this.f1121c.open(this.a.getPath());
        } catch (Throwable e) {
            throw new GdxRuntimeException("Error reading file: " + this.a + " (" + this.b + ")", e);
        }
    }

    /* renamed from: c */
    public boolean mo269c() {
        if (this.b != FileType.Internal) {
            return super.mo269c();
        }
        try {
            return this.f1121c.list(this.a.getPath()).length > 0;
        } catch (IOException e) {
            return false;
        }
    }

    /* renamed from: d */
    public boolean mo270d() {
        if (this.b != FileType.Internal) {
            return super.mo270d();
        }
        String path = this.a.getPath();
        try {
            this.f1121c.open(path).close();
            return true;
        } catch (Exception e) {
            try {
                return this.f1121c.list(path).length > 0;
            } catch (Exception e2) {
                return false;
            }
        }
    }

    /* renamed from: e */
    public long mo271e() {
        AssetFileDescriptor openFd;
        Throwable th;
        if (this.b == FileType.Internal) {
            AssetFileDescriptor assetFileDescriptor = null;
            try {
                openFd = this.f1121c.openFd(this.a.getPath());
            } catch (IOException e) {
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e2) {
                    }
                }
                return super.mo271e();
            } catch (Throwable th2) {
                openFd = null;
                th = th2;
                if (openFd != null) {
                    try {
                        openFd.close();
                    } catch (IOException e3) {
                    }
                }
                throw th;
            }
            try {
                long length = openFd.getLength();
                if (openFd == null) {
                    return length;
                }
                try {
                    openFd.close();
                    return length;
                } catch (IOException e4) {
                    return length;
                }
            } catch (IOException e5) {
                assetFileDescriptor = openFd;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                return super.mo271e();
            } catch (Throwable th3) {
                th = th3;
                if (openFd != null) {
                    openFd.close();
                }
                throw th;
            }
        }
        return super.mo271e();
    }

    /* renamed from: f */
    public final File mo272f() {
        return this.b == FileType.Local ? new File(Gdx.files.mo278b(), this.a.getPath()) : super.mo272f();
    }

    /* renamed from: g */
    public AssetFileDescriptor mo273g() {
        return this.f1121c != null ? this.f1121c.openFd(m896h()) : null;
    }
}
