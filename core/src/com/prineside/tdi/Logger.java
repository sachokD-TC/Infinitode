package com.prineside.tdi;

import com.badlogic.gdx.C0350j.C0374b;
import com.badlogic.gdx.C0350j.C0516a;
import com.badlogic.gdx.C0350j.C0517c;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.p018e.C0371a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class Logger {
    /* renamed from: a */
    private final String[] buffer = new String[1024];
    /* renamed from: b */
    private int f6750b = 0;
    /* renamed from: c */
    private boolean f6751c = false;
    /* renamed from: d */
    private long f6752d = 0;

    /* renamed from: com.prineside.tdi.Logger$1 */
    class C10671 implements C0517c {
        /* renamed from: a */
        final /* synthetic */ Logger f6748a;

        C10671(Logger logger) {
            this.f6748a = logger;
        }

        /* renamed from: a */
        public final void mo1740a(C0374b c0374b) {
            try {
                Gdx.app.log("Logger", c0374b.mo343a());
            } catch (Exception e) {
                Gdx.app.log("Logger", "Exception: " + e.getMessage());
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        public final void mo1741a(Throwable th) {
            Gdx.app.log("Logger", "Error sending report: " + th.getMessage());
        }
    }

    /* renamed from: a */
    public final void log(String str, String str2) {
        Gdx.app.log(str, str2);
        m7507a("L", str, str2);
    }

    /* renamed from: a */
    public final synchronized void m7507a(String str, String str2, String str3) {
        this.buffer[this.f6750b] = Game.game.m7478u() + "," + Game.game.m7477t() + "," + str + "," + str2 + "," + str3.replaceAll("\n", "\\n");
        this.f6750b++;
        if (this.f6750b == 1024) {
            this.f6750b = 0;
            this.f6751c = true;
        }
    }

    /* renamed from: a */
    public final void m7508a(String str, Throwable th) {
        if (Game.game.m7478u() - this.f6752d < 0) {
            m7510b("Logger", "Cancelled report - too frequent");
            return;
        }
        int i;
        this.f6752d = Game.game.m7478u();
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f6751c) {
            for (i = this.f6750b; i < 1024; i++) {
                stringBuilder.append(this.buffer[i]);
                stringBuilder.append("\n");
            }
        }
        for (i = 0; i < this.f6750b; i++) {
            stringBuilder.append(this.buffer[i]);
            stringBuilder.append("\n");
        }
        try {
            C0516a c0516a = new C0516a("POST");
            c0516a.f2304b = "http://infinitode.prineside.com/?m=api&a=gameLogReport";
            Map hashMap = new HashMap();
            hashMap.put("log", stringBuilder.toString());
            hashMap.put("version", "66");
            hashMap.put("reason", str);
            hashMap.put("modified", String.valueOf(Game.game.f6566J.mo1737k()));
            hashMap.put("playerid", Game.game.m7464g());
            if (th != null) {
                Writer stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                hashMap.put("stacktrace", stringWriter.toString());
                hashMap.put("exception", th.getMessage());
            }
            c0516a.f2307e = C0371a.m1073a(hashMap);
            Gdx.net.mo313a(c0516a, new C10671(this));
            Gdx.app.error("Logger", "Sent report");
        } catch (Exception e) {
            Gdx.app.log("Logger", "Failed (" + e.getMessage() + ")");
        }
    }

    /* renamed from: a */
    public final void m7509a(Throwable th) {
        th.printStackTrace();
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        m7507a("E", "Stacktrace", stringWriter.toString());
    }

    /* renamed from: b */
    public final void m7510b(String str, String str2) {
        Gdx.app.error(str, str2);
        m7507a("E", str, str2);
    }
}
