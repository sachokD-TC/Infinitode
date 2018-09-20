package com.badlogic.gdx.backends.android;

import com.badlogic.gdx.backends.android.C0341k.C0340c;

/* renamed from: com.badlogic.gdx.backends.android.n */
public final class C0344n {
    /* renamed from: a */
    private int f1256a = 0;
    /* renamed from: b */
    private int f1257b = 0;

    /* renamed from: a */
    private static void m982a(C0341k c0341k, int i, int i2, int i3, int i4, long j) {
        C0340c c0340c = (C0340c) c0341k.f1229b.m965b();
        c0340c.f1195a = j;
        c0340c.f1197c = i2;
        c0340c.f1198d = i3;
        c0340c.f1196b = i;
        c0340c.f1199e = i4;
        c0341k.f1232e.add(c0340c);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final boolean m983a(android.view.MotionEvent r9, C0341k r10) {
        /*
        r8 = this;
        r0 = 0;
        r1 = r9.getSource();
        r1 = r1 & 2;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r0 = r9.getAction();
        r0 = r0 & 255;
        r6 = java.lang.System.nanoTime();
        monitor-enter(r10);
        switch(r0) {
            case 7: goto L_0x0024;
            case 8: goto L_0x0044;
            default: goto L_0x0018;
        };
    L_0x0018:
        monitor-exit(r10);	 Catch:{ all -> 0x0041 }
        r0 = com.badlogic.gdx.Gdx.app;
        r0 = r0.getGraphics();
        r0.mo300i();
        r0 = 1;
        goto L_0x0009;
    L_0x0024:
        r0 = r9.getX();	 Catch:{ all -> 0x0041 }
        r3 = (int) r0;	 Catch:{ all -> 0x0041 }
        r0 = r9.getY();	 Catch:{ all -> 0x0041 }
        r4 = (int) r0;	 Catch:{ all -> 0x0041 }
        r0 = r8.f1256a;	 Catch:{ all -> 0x0041 }
        if (r3 != r0) goto L_0x0036;
    L_0x0032:
        r0 = r8.f1257b;	 Catch:{ all -> 0x0041 }
        if (r4 == r0) goto L_0x0018;
    L_0x0036:
        r2 = 4;
        r5 = 0;
        r1 = r10;
        com.badlogic.gdx.backends.android.C0344n.m982a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0041 }
        r8.f1256a = r3;	 Catch:{ all -> 0x0041 }
        r8.f1257b = r4;	 Catch:{ all -> 0x0041 }
        goto L_0x0018;
    L_0x0041:
        r0 = move-exception;
        monitor-exit(r10);	 Catch:{ all -> 0x0041 }
        throw r0;
    L_0x0044:
        r0 = 9;
        r0 = r9.getAxisValue(r0);	 Catch:{ all -> 0x0041 }
        r0 = java.lang.Math.signum(r0);	 Catch:{ all -> 0x0041 }
        r0 = -r0;
        r5 = (int) r0;	 Catch:{ all -> 0x0041 }
        r2 = 3;
        r3 = 0;
        r4 = 0;
        r1 = r10;
        com.badlogic.gdx.backends.android.C0344n.m982a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0041 }
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.backends.android.n.a(android.view.MotionEvent, com.badlogic.gdx.backends.android.k):boolean");
    }
}
