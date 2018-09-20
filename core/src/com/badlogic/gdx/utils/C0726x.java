package com.badlogic.gdx.utils;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.badlogic.gdx.utils.x */
public class C0726x {
    /* renamed from: a */
    public static boolean f3227a;
    /* renamed from: b */
    public static boolean f3228b;
    /* renamed from: c */
    public static boolean f3229c;
    /* renamed from: d */
    public static boolean f3230d;
    /* renamed from: e */
    public static boolean f3231e;
    /* renamed from: f */
    public static boolean f3232f = System.getProperty("os.arch").startsWith("arm");
    /* renamed from: g */
    public static boolean f3233g;
    /* renamed from: h */
    public static String f3234h = (System.getProperty("sun.arch.abi") != null ? System.getProperty("sun.arch.abi") : "");
    /* renamed from: i */
    private static final HashSet<String> f3235i = new HashSet();
    /* renamed from: j */
    private String f3236j;

    static {
        f3227a = System.getProperty("os.name").contains("Windows");
        f3228b = System.getProperty("os.name").contains("Linux");
        f3229c = System.getProperty("os.name").contains("Mac");
        f3230d = false;
        f3231e = false;
        boolean z = System.getProperty("os.arch").equals("amd64") || System.getProperty("os.arch").equals("x86_64");
        f3233g = z;
        z = "iOS".equals(System.getProperty("moe.platform.name"));
        String property = System.getProperty("java.runtime.name");
        if (property != null && property.contains("Android Runtime")) {
            f3231e = true;
            f3227a = false;
            f3228b = false;
            f3229c = false;
            f3233g = false;
        }
        if (z || !(f3231e || f3227a || f3228b || f3229c)) {
            f3230d = true;
            f3231e = false;
            f3227a = false;
            f3228b = false;
            f3229c = false;
            f3233g = false;
        }
    }

    /* renamed from: a */
    private File m2520a(String str, String str2, File file) {
        String a;
        Closeable b;
        Closeable fileOutputStream;
        Throwable e;
        byte[] bArr;
        int read;
        Closeable closeable = null;
        if (file.exists()) {
            try {
                a = C0726x.m2521a(new FileInputStream(file));
            } catch (FileNotFoundException e2) {
            }
            if (a == null || !a.equals(str2)) {
                b = m2522b(str);
                try {
                    file.getParentFile().mkdirs();
                    fileOutputStream = new FileOutputStream(file);
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream = null;
                    closeable = b;
                    try {
                        throw new GdxRuntimeException("Error extracting file: " + str + "\nTo: " + file.getAbsolutePath(), e);
                    } catch (Throwable th) {
                        e = th;
                        ab.m2310a(closeable);
                        ab.m2310a(fileOutputStream);
                        throw e;
                    }
                } catch (Throwable th2) {
                    e = th2;
                    fileOutputStream = null;
                    closeable = b;
                    ab.m2310a(closeable);
                    ab.m2310a(fileOutputStream);
                    throw e;
                }
                try {
                    bArr = new byte[4096];
                    while (true) {
                        read = b.read(bArr);
                        if (read != -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    ab.m2310a(b);
                    ab.m2310a(fileOutputStream);
                } catch (IOException e4) {
                    e = e4;
                    closeable = b;
                    throw new GdxRuntimeException("Error extracting file: " + str + "\nTo: " + file.getAbsolutePath(), e);
                } catch (Throwable th3) {
                    e = th3;
                    closeable = b;
                    ab.m2310a(closeable);
                    ab.m2310a(fileOutputStream);
                    throw e;
                }
            }
            return file;
        }
        a = null;
        try {
            b = m2522b(str);
            file.getParentFile().mkdirs();
            fileOutputStream = new FileOutputStream(file);
            bArr = new byte[4096];
            while (true) {
                read = b.read(bArr);
                if (read != -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            ab.m2310a(b);
            ab.m2310a(fileOutputStream);
            return file;
        } catch (IOException e5) {
            e = e5;
            fileOutputStream = null;
            throw new GdxRuntimeException("Error extracting file: " + str + "\nTo: " + file.getAbsolutePath(), e);
        } catch (Throwable th4) {
            e = th4;
            fileOutputStream = null;
            ab.m2310a(closeable);
            ab.m2310a(fileOutputStream);
            throw e;
        }
    }

    /* renamed from: a */
    private static String m2521a(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        CRC32 crc32 = new CRC32();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                crc32.update(bArr, 0, read);
            } catch (Exception e) {
            } finally {
                ab.m2310a(inputStream);
            }
        }
        return Long.toString(crc32.getValue(), 16);
    }

    /* renamed from: b */
    private InputStream m2522b(String str) {
        InputStream resourceAsStream;
        if (this.f3236j == null) {
            resourceAsStream = C0726x.class.getResourceAsStream("/" + str);
            if (resourceAsStream == null) {
                throw new GdxRuntimeException("Unable to read file for extraction: " + str);
            }
        }
        try {
            ZipFile zipFile = new ZipFile(this.f3236j);
            ZipEntry entry = zipFile.getEntry(str);
            if (entry == null) {
                throw new GdxRuntimeException("Couldn't find '" + str + "' in JAR: " + this.f3236j);
            }
            resourceAsStream = zipFile.getInputStream(entry);
        } catch (Throwable e) {
            throw new GdxRuntimeException("Error reading '" + str + "' in JAR: " + this.f3236j, e);
        }
        return resourceAsStream;
    }

    /* renamed from: b */
    private Throwable m2523b(String str, String str2, File file) {
        try {
            System.load(m2520a(str, str2, file).getAbsolutePath());
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* renamed from: c */
    private static synchronized void m2524c(String str) {
        synchronized (C0726x.class) {
            f3235i.add(str);
        }
    }

    /* renamed from: d */
    private static synchronized boolean m2525d(String str) {
        boolean contains;
        synchronized (C0726x.class) {
            contains = f3235i.contains(str);
        }
        return contains;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m2526a(String r9) {
        /*
        r8 = this;
        r0 = f3230d;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r2 = com.badlogic.gdx.utils.C0726x.class;
        monitor-enter(r2);
        r0 = com.badlogic.gdx.utils.C0726x.m2525d(r9);	 Catch:{ all -> 0x0010 }
        if (r0 == 0) goto L_0x0013;
    L_0x000e:
        monitor-exit(r2);	 Catch:{ all -> 0x0010 }
        goto L_0x0004;
    L_0x0010:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0010 }
        throw r0;
    L_0x0013:
        r0 = f3227a;	 Catch:{ all -> 0x0010 }
        if (r0 == 0) goto L_0x003d;
    L_0x0017:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0010 }
        r0.<init>();	 Catch:{ all -> 0x0010 }
        r1 = r0.append(r9);	 Catch:{ all -> 0x0010 }
        r0 = f3233g;	 Catch:{ all -> 0x0010 }
        if (r0 == 0) goto L_0x003a;
    L_0x0024:
        r0 = "64.dll";
    L_0x0026:
        r0 = r1.append(r0);	 Catch:{ all -> 0x0010 }
        r0 = r0.toString();	 Catch:{ all -> 0x0010 }
    L_0x002e:
        r1 = f3231e;	 Catch:{ Throwable -> 0x0153 }
        if (r1 == 0) goto L_0x009d;
    L_0x0032:
        java.lang.System.loadLibrary(r0);	 Catch:{ Throwable -> 0x0153 }
    L_0x0035:
        com.badlogic.gdx.utils.C0726x.m2524c(r9);	 Catch:{ Throwable -> 0x0153 }
        monitor-exit(r2);	 Catch:{ all -> 0x0010 }
        goto L_0x0004;
    L_0x003a:
        r0 = ".dll";
        goto L_0x0026;
    L_0x003d:
        r0 = f3228b;	 Catch:{ all -> 0x0010 }
        if (r0 == 0) goto L_0x007a;
    L_0x0041:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0010 }
        r1 = "lib";
        r0.<init>(r1);	 Catch:{ all -> 0x0010 }
        r1 = r0.append(r9);	 Catch:{ all -> 0x0010 }
        r0 = f3232f;	 Catch:{ all -> 0x0010 }
        if (r0 == 0) goto L_0x0074;
    L_0x0050:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0010 }
        r3 = "arm";
        r0.<init>(r3);	 Catch:{ all -> 0x0010 }
        r3 = f3234h;	 Catch:{ all -> 0x0010 }
        r0 = r0.append(r3);	 Catch:{ all -> 0x0010 }
        r0 = r0.toString();	 Catch:{ all -> 0x0010 }
    L_0x0061:
        r1 = r1.append(r0);	 Catch:{ all -> 0x0010 }
        r0 = f3233g;	 Catch:{ all -> 0x0010 }
        if (r0 == 0) goto L_0x0077;
    L_0x0069:
        r0 = "64.so";
    L_0x006b:
        r0 = r1.append(r0);	 Catch:{ all -> 0x0010 }
        r0 = r0.toString();	 Catch:{ all -> 0x0010 }
        goto L_0x002e;
    L_0x0074:
        r0 = "";
        goto L_0x0061;
    L_0x0077:
        r0 = ".so";
        goto L_0x006b;
    L_0x007a:
        r0 = f3229c;	 Catch:{ all -> 0x0010 }
        if (r0 == 0) goto L_0x009b;
    L_0x007e:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0010 }
        r1 = "lib";
        r0.<init>(r1);	 Catch:{ all -> 0x0010 }
        r1 = r0.append(r9);	 Catch:{ all -> 0x0010 }
        r0 = f3233g;	 Catch:{ all -> 0x0010 }
        if (r0 == 0) goto L_0x0098;
    L_0x008d:
        r0 = "64.dylib";
    L_0x008f:
        r0 = r1.append(r0);	 Catch:{ all -> 0x0010 }
        r0 = r0.toString();	 Catch:{ all -> 0x0010 }
        goto L_0x002e;
    L_0x0098:
        r0 = ".dylib";
        goto L_0x008f;
    L_0x009b:
        r0 = r9;
        goto L_0x002e;
    L_0x009d:
        r1 = r8.m2522b(r0);	 Catch:{ Throwable -> 0x0153 }
        r1 = com.badlogic.gdx.utils.C0726x.m2521a(r1);	 Catch:{ Throwable -> 0x0153 }
        r3 = new java.io.File;	 Catch:{ Throwable -> 0x0153 }
        r3.<init>(r0);	 Catch:{ Throwable -> 0x0153 }
        r3 = r3.getName();	 Catch:{ Throwable -> 0x0153 }
        r4 = new java.io.File;	 Catch:{ Throwable -> 0x0153 }
        r5 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0153 }
        r5.<init>();	 Catch:{ Throwable -> 0x0153 }
        r6 = "java.io.tmpdir";
        r6 = java.lang.System.getProperty(r6);	 Catch:{ Throwable -> 0x0153 }
        r5 = r5.append(r6);	 Catch:{ Throwable -> 0x0153 }
        r6 = "/libgdx";
        r5 = r5.append(r6);	 Catch:{ Throwable -> 0x0153 }
        r6 = "user.name";
        r6 = java.lang.System.getProperty(r6);	 Catch:{ Throwable -> 0x0153 }
        r5 = r5.append(r6);	 Catch:{ Throwable -> 0x0153 }
        r6 = "/";
        r5 = r5.append(r6);	 Catch:{ Throwable -> 0x0153 }
        r5 = r5.append(r1);	 Catch:{ Throwable -> 0x0153 }
        r5 = r5.toString();	 Catch:{ Throwable -> 0x0153 }
        r4.<init>(r5, r3);	 Catch:{ Throwable -> 0x0153 }
        r4 = r8.m2523b(r0, r1, r4);	 Catch:{ Throwable -> 0x0153 }
        if (r4 == 0) goto L_0x0035;
    L_0x00e6:
        r5 = 0;
        r5 = java.io.File.createTempFile(r1, r5);	 Catch:{ Throwable -> 0x018c }
        r6 = r5.delete();	 Catch:{ Throwable -> 0x018c }
        if (r6 == 0) goto L_0x00f7;
    L_0x00f1:
        r5 = r8.m2523b(r0, r1, r5);	 Catch:{ Throwable -> 0x018c }
        if (r5 == 0) goto L_0x0035;
    L_0x00f7:
        r5 = new java.io.File;	 Catch:{ Throwable -> 0x0153 }
        r6 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0153 }
        r6.<init>();	 Catch:{ Throwable -> 0x0153 }
        r7 = "user.home";
        r7 = java.lang.System.getProperty(r7);	 Catch:{ Throwable -> 0x0153 }
        r6 = r6.append(r7);	 Catch:{ Throwable -> 0x0153 }
        r7 = "/.libgdx/";
        r6 = r6.append(r7);	 Catch:{ Throwable -> 0x0153 }
        r6 = r6.append(r1);	 Catch:{ Throwable -> 0x0153 }
        r6 = r6.toString();	 Catch:{ Throwable -> 0x0153 }
        r5.<init>(r6, r3);	 Catch:{ Throwable -> 0x0153 }
        r5 = r8.m2523b(r0, r1, r5);	 Catch:{ Throwable -> 0x0153 }
        if (r5 == 0) goto L_0x0035;
    L_0x011f:
        r5 = new java.io.File;	 Catch:{ Throwable -> 0x0153 }
        r6 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0153 }
        r7 = ".temp/";
        r6.<init>(r7);	 Catch:{ Throwable -> 0x0153 }
        r6 = r6.append(r1);	 Catch:{ Throwable -> 0x0153 }
        r6 = r6.toString();	 Catch:{ Throwable -> 0x0153 }
        r5.<init>(r6, r3);	 Catch:{ Throwable -> 0x0153 }
        r1 = r8.m2523b(r0, r1, r5);	 Catch:{ Throwable -> 0x0153 }
        if (r1 == 0) goto L_0x0035;
    L_0x0139:
        r1 = new java.io.File;	 Catch:{ Throwable -> 0x0153 }
        r3 = "java.library.path";
        r3 = java.lang.System.getProperty(r3);	 Catch:{ Throwable -> 0x0153 }
        r1.<init>(r3, r0);	 Catch:{ Throwable -> 0x0153 }
        r3 = r1.exists();	 Catch:{ Throwable -> 0x0153 }
        if (r3 == 0) goto L_0x0183;
    L_0x014a:
        r1 = r1.getAbsolutePath();	 Catch:{ Throwable -> 0x0153 }
        java.lang.System.load(r1);	 Catch:{ Throwable -> 0x0153 }
        goto L_0x0035;
    L_0x0153:
        r1 = move-exception;
        r3 = new com.badlogic.gdx.utils.GdxRuntimeException;	 Catch:{ all -> 0x0010 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0010 }
        r5 = "Couldn't load shared library '";
        r4.<init>(r5);	 Catch:{ all -> 0x0010 }
        r0 = r4.append(r0);	 Catch:{ all -> 0x0010 }
        r4 = "' for target: ";
        r0 = r0.append(r4);	 Catch:{ all -> 0x0010 }
        r4 = "os.name";
        r4 = java.lang.System.getProperty(r4);	 Catch:{ all -> 0x0010 }
        r4 = r0.append(r4);	 Catch:{ all -> 0x0010 }
        r0 = f3233g;	 Catch:{ all -> 0x0010 }
        if (r0 == 0) goto L_0x0189;
    L_0x0175:
        r0 = ", 64-bit";
    L_0x0177:
        r0 = r4.append(r0);	 Catch:{ all -> 0x0010 }
        r0 = r0.toString();	 Catch:{ all -> 0x0010 }
        r3.<init>(r0, r1);	 Catch:{ all -> 0x0010 }
        throw r3;	 Catch:{ all -> 0x0010 }
    L_0x0183:
        r1 = new com.badlogic.gdx.utils.GdxRuntimeException;	 Catch:{ Throwable -> 0x0153 }
        r1.<init>(r4);	 Catch:{ Throwable -> 0x0153 }
        throw r1;	 Catch:{ Throwable -> 0x0153 }
    L_0x0189:
        r0 = ", 32-bit";
        goto L_0x0177;
    L_0x018c:
        r5 = move-exception;
        goto L_0x00f7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.x.a(java.lang.String):void");
    }
}
