package com.badlogic.gdx.graphics.p019a.p024d;

import com.badlogic.gdx.graphics.p019a.p024d.p027c.C0415a;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.C0676a;
import java.util.Iterator;

/* renamed from: com.badlogic.gdx.graphics.a.d.c */
public class C0416c implements Disposable {
    /* renamed from: a */
    C0676a<C0412a> f1562a = new C0676a(true, 3, C0412a.class);

    /* renamed from: b */
    public final void dispose() {
        int i = this.f1562a.f3001b;
        for (int i2 = 0; i2 < i; i2++) {
            C0412a c0412a = (C0412a) this.f1562a.m2291a(i2);
            c0412a.f1544b.dispose();
            Iterator it = c0412a.f1545c.iterator();
            while (it.hasNext()) {
                ((C0415a) it.next()).dispose();
            }
        }
    }
}
