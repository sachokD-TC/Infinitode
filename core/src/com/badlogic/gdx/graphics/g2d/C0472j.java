package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.C0519a;
import com.badlogic.gdx.p010a.C0242c;
import com.badlogic.gdx.p010a.C0267a;
import com.badlogic.gdx.p010a.C0273e;
import com.badlogic.gdx.p010a.p011a.C0238e;
import com.badlogic.gdx.p010a.p011a.C0254n;
import com.badlogic.gdx.p010a.p011a.p012a.C0239a;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0727y;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.ab;
import java.io.BufferedReader;
import java.io.Closeable;

/* renamed from: com.badlogic.gdx.graphics.g2d.j */
public final class C0472j extends C0254n<C0470i, C0471a> {
    /* renamed from: a */
    private C0471a f2017a;
    /* renamed from: b */
    private C0519a f2018b;

    /* renamed from: com.badlogic.gdx.graphics.g2d.j$a */
    public static class C0471a extends C0242c<C0470i> {
        /* renamed from: b */
        public String f2014b = "i ";
        /* renamed from: c */
        public int f2015c = 1024;
        /* renamed from: d */
        public String[] f2016d = new String[]{"png", "PNG", "jpeg", "JPEG", "jpg", "JPG", "cim", "CIM", "etc1", "ETC1", "ktx", "KTX", "zktx", "ZKTX"};
    }

    public C0472j() {
        this(new C0239a());
    }

    public C0472j(C0238e c0238e) {
        super(c0238e);
        this.f2017a = new C0471a();
        this.f2018b = new C0519a();
    }

    /* renamed from: a */
    private C0470i m1397a(C0438n c0438n, C0316a c0316a) {
        String readLine;
        Closeable a = c0316a.m888a(256);
        do {
            try {
                readLine = a.readLine();
                if (readLine == null) {
                    ab.m2310a(a);
                    throw new GdxRuntimeException("Polygon shape not found: " + c0316a);
                }
            } catch (Throwable e) {
                throw new GdxRuntimeException("Error reading polygon shape file: " + c0316a, e);
            } catch (Throwable th) {
                ab.m2310a(a);
            }
        } while (!readLine.startsWith("s"));
        String[] split = readLine.substring(1).trim().split(",");
        float[] fArr = new float[split.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            fArr[i] = Float.parseFloat(split[i]);
        }
        C0727y a2 = this.f2018b.m1722a(fArr, length);
        Object obj = new short[a2.f3238b];
        System.arraycopy(a2.f3237a, 0, obj, 0, a2.f3238b);
        C0470i c0470i = new C0470i(c0438n, fArr, obj);
        ab.m2310a(a);
        return c0470i;
    }

    /* renamed from: a */
    private C0676a<C0267a> m1398a(String str, C0316a c0316a, C0471a c0471a) {
        if (c0471a == null) {
            c0471a = this.f2017a;
        }
        try {
            String readLine;
            BufferedReader a = c0316a.m888a(c0471a.f2015c);
            for (readLine = a.readLine(); readLine != null; readLine = a.readLine()) {
                if (readLine.startsWith(c0471a.f2014b)) {
                    readLine = readLine.substring(c0471a.f2014b.length());
                    break;
                }
            }
            readLine = null;
            a.close();
            if (readLine == null && c0471a.f2016d != null) {
                for (String str2 : c0471a.f2016d) {
                    C0316a b = c0316a.mo267b(c0316a.m897i().concat("." + str2));
                    if (b.mo270d()) {
                        readLine = b.f1119a.getName();
                    }
                }
            }
            String str3 = readLine;
            if (str3 == null) {
                return null;
            }
            C0676a<C0267a> c0676a = new C0676a(1);
            c0676a.m2296a(new C0267a(c0316a.mo267b(str3), Texture.class));
            return c0676a;
        } catch (Throwable e) {
            throw new GdxRuntimeException("Error reading " + str, e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo154a(C0273e c0273e, String str, C0316a c0316a, C0242c c0242c) {
        return m1397a(new C0438n((Texture) c0273e.m791a((String) c0273e.m801d(str).m2304c())), c0316a);
    }
}
