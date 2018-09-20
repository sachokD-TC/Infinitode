package com.badlogic.gdx.p018e;

import com.badlogic.gdx.C0350j.C0374b;
import com.badlogic.gdx.C0350j.C0516a;
import com.badlogic.gdx.C0350j.C0517c;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.ab;
import com.badlogic.gdx.utils.p013a.C0270c;
import com.badlogic.gdx.utils.p013a.C0674a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;

/* renamed from: com.badlogic.gdx.e.c */
public final class C0376c {
    /* renamed from: a */
    public final C0674a f1348a = new C0674a();
    /* renamed from: b */
    final C0710q<C0516a, HttpURLConnection> f1349b = new C0710q();
    /* renamed from: c */
    final C0710q<C0516a, C0517c> f1350c = new C0710q();

    /* renamed from: com.badlogic.gdx.e.c$1 */
    class C03731 implements C0270c<Void> {
        /* renamed from: a */
        final /* synthetic */ boolean f1341a;
        /* renamed from: b */
        final /* synthetic */ C0516a f1342b;
        /* renamed from: c */
        final /* synthetic */ HttpURLConnection f1343c;
        /* renamed from: d */
        final /* synthetic */ C0517c f1344d;
        /* renamed from: e */
        final /* synthetic */ C0376c f1345e;

        public C03731(C0376c c0376c, boolean z, C0516a c0516a, HttpURLConnection httpURLConnection, C0517c c0517c) {
            this.f1345e = c0376c;
            this.f1341a = z;
            this.f1342b = c0516a;
            this.f1343c = httpURLConnection;
            this.f1344d = c0517c;
        }

        /* renamed from: a */
        private Void m1074a() {
            try {
                if (this.f1341a) {
                    String str = this.f1342b.f2307e;
                    if (str != null) {
                        Closeable outputStreamWriter = new OutputStreamWriter(this.f1343c.getOutputStream());
                        outputStreamWriter.write(str);
                        ab.m2310a(outputStreamWriter);
                    } else {
                        InputStream inputStream = this.f1342b.f2308f;
                        if (inputStream != null) {
                            OutputStream outputStream = this.f1343c.getOutputStream();
                            ab.m2311a(inputStream, outputStream);
                            ab.m2310a(outputStream);
                        }
                    }
                }
                this.f1343c.connect();
                C0374b c0375a = new C0375a(this.f1343c);
                C0517c b = this.f1345e.m1081b(this.f1342b);
                if (b != null) {
                    b.mo1740a(c0375a);
                }
                this.f1345e.m1079a(this.f1342b);
                this.f1343c.disconnect();
            } catch (Throwable e) {
                this.f1343c.disconnect();
                try {
                    this.f1344d.mo1741a(e);
                } finally {
                    this.f1345e.m1079a(this.f1342b);
                }
            } catch (Throwable th) {
                ab.m2310a(outputStreamWriter);
            }
            return null;
        }

        /* renamed from: b */
        public final /* synthetic */ Object mo155b() {
            return m1074a();
        }
    }

    /* renamed from: com.badlogic.gdx.e.c$a */
    static class C0375a implements C0374b {
        /* renamed from: a */
        private final HttpURLConnection f1346a;
        /* renamed from: b */
        private C0372b f1347b;

        public C0375a(HttpURLConnection httpURLConnection) {
            this.f1346a = httpURLConnection;
            try {
                this.f1347b = new C0372b(httpURLConnection.getResponseCode());
            } catch (IOException e) {
                this.f1347b = new C0372b(-1);
            }
        }

        /* renamed from: b */
        private InputStream m1077b() {
            try {
                return this.f1346a.getInputStream();
            } catch (IOException e) {
                return this.f1346a.getErrorStream();
            }
        }

        /* renamed from: a */
        public final String mo343a() {
            Closeable b = m1077b();
            if (b == null) {
                return "";
            }
            String b2;
            try {
                b2 = ab.m2314b(b, this.f1346a.getContentLength());
                return b2;
            } catch (IOException e) {
                b2 = "";
                return b2;
            } finally {
                ab.m2310a(b);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m1079a(C0516a c0516a) {
        this.f1349b.mo545b((Object) c0516a);
        this.f1350c.mo545b((Object) c0516a);
    }

    /* renamed from: a */
    public final synchronized void m1080a(C0516a c0516a, C0517c c0517c, HttpURLConnection httpURLConnection) {
        this.f1349b.mo542a(c0516a, httpURLConnection);
        this.f1350c.mo542a(c0516a, c0517c);
    }

    /* renamed from: b */
    final synchronized C0517c m1081b(C0516a c0516a) {
        return (C0517c) this.f1350c.m2467a((Object) c0516a);
    }
}
