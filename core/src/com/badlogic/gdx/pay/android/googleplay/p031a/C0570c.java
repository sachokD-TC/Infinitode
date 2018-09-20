package com.badlogic.gdx.pay.android.googleplay.p031a;

import com.badlogic.gdx.pay.C0552a;
import com.badlogic.gdx.pay.C0583f;
import com.badlogic.gdx.pay.C0585h;
import com.badlogic.gdx.pay.android.googleplay.GdxPayException;
import java.util.List;
import java.util.Map;

/* renamed from: com.badlogic.gdx.pay.android.googleplay.a.c */
public interface C0570c {

    /* renamed from: com.badlogic.gdx.pay.android.googleplay.a.c$a */
    public interface C0553a {
        /* renamed from: a */
        void mo432a();

        /* renamed from: a */
        void mo433a(GdxPayException gdxPayException);
    }

    /* renamed from: com.badlogic.gdx.pay.android.googleplay.a.c$b */
    public interface C0555b {
        /* renamed from: a */
        void mo434a();

        /* renamed from: a */
        void mo435a(GdxPayException gdxPayException);

        /* renamed from: a */
        void mo436a(C0585h c0585h);
    }

    /* renamed from: a */
    Map<String, C0552a> mo451a(List<String> list, String str);

    /* renamed from: a */
    void mo452a();

    /* renamed from: a */
    void mo453a(C0553a c0553a);

    /* renamed from: a */
    void mo454a(C0585h c0585h, C0583f c0583f);

    /* renamed from: a */
    void mo455a(String str, String str2, C0555b c0555b);

    /* renamed from: b */
    void mo456b();

    /* renamed from: c */
    boolean mo457c();

    /* renamed from: d */
    List<C0585h> mo458d();

    /* renamed from: e */
    void mo459e();
}
