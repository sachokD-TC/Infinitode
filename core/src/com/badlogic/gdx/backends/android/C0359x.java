package com.badlogic.gdx.backends.android;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.zip.ZipFile;

/* renamed from: com.badlogic.gdx.backends.android.x */
public final class C0359x {
    /* renamed from: a */
    HashMap<String, C0358a> f1286a;
    /* renamed from: b */
    public HashMap<File, ZipFile> f1287b;

    /* renamed from: com.badlogic.gdx.backends.android.x$a */
    public static final class C0358a {
        /* renamed from: a */
        public final File f1281a;
        /* renamed from: b */
        public final String f1282b;
        /* renamed from: c */
        public int f1283c;
        /* renamed from: d */
        public long f1284d;
        /* renamed from: e */
        public long f1285e;

        /* renamed from: a */
        public final AssetFileDescriptor m1023a() {
            if (this.f1283c == 0) {
                try {
                    return new AssetFileDescriptor(ParcelFileDescriptor.open(this.f1281a, 268435456), this.f1285e, this.f1284d);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
    }
}
