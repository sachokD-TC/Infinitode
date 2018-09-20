package com.badlogic.gdx.backends.android;

import android.content.Context;
import com.badlogic.gdx.backends.android.C0341k.C0340c;

/* renamed from: com.badlogic.gdx.backends.android.o */
public final class C0346o implements C0345u {
    /* renamed from: a */
    private static void m986a(C0341k c0341k, int i, int i2, int i3, int i4, int i5, long j) {
        C0340c c0340c = (C0340c) c0341k.f1229b.m965b();
        c0340c.f1195a = j;
        c0340c.f1201g = i4;
        c0340c.f1197c = i2;
        c0340c.f1198d = i3;
        c0340c.f1196b = i;
        c0340c.f1200f = i5;
        c0341k.f1232e.add(c0340c);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo311a(android.view.MotionEvent r12, C0341k r13) {
        /*
        r11 = this;
        r0 = r12.getAction();
        r0 = r0 & 255;
        r1 = r12.getAction();
        r2 = 65280; // 0xff00 float:9.1477E-41 double:3.22526E-319;
        r1 = r1 & r2;
        r1 = r1 >> 8;
        r2 = r12.getPointerId(r1);
        r5 = 0;
        r6 = java.lang.System.nanoTime();
        monitor-enter(r13);
        switch(r0) {
            case 0: goto L_0x0028;
            case 1: goto L_0x00e3;
            case 2: goto L_0x0127;
            case 3: goto L_0x00e3;
            case 4: goto L_0x00e3;
            case 5: goto L_0x0028;
            case 6: goto L_0x00e3;
            default: goto L_0x001d;
        };
    L_0x001d:
        monitor-exit(r13);	 Catch:{ all -> 0x007f }
        r0 = com.badlogic.gdx.Gdx.app;
        r0 = r0.getGraphics();
        r0.mo300i();
        return;
    L_0x0028:
        r0 = r13.f1239l;	 Catch:{ all -> 0x007f }
        r0 = r0.length;	 Catch:{ all -> 0x007f }
        r4 = 0;
    L_0x002c:
        if (r4 >= r0) goto L_0x0085;
    L_0x002e:
        r3 = r13.f1239l;	 Catch:{ all -> 0x007f }
        r3 = r3[r4];	 Catch:{ all -> 0x007f }
        r8 = -1;
        if (r3 != r8) goto L_0x0082;
    L_0x0035:
        r0 = 20;
        if (r4 >= r0) goto L_0x001d;
    L_0x0039:
        r0 = r13.f1239l;	 Catch:{ all -> 0x007f }
        r0[r4] = r2;	 Catch:{ all -> 0x007f }
        r0 = r12.getX(r1);	 Catch:{ all -> 0x007f }
        r2 = (int) r0;	 Catch:{ all -> 0x007f }
        r0 = r12.getY(r1);	 Catch:{ all -> 0x007f }
        r3 = (int) r0;	 Catch:{ all -> 0x007f }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x007f }
        r1 = 14;
        if (r0 < r1) goto L_0x0058;
    L_0x004d:
        r0 = r12.getButtonState();	 Catch:{ all -> 0x007f }
        if (r0 == 0) goto L_0x0056;
    L_0x0053:
        r1 = 1;
        if (r0 != r1) goto L_0x00c7;
    L_0x0056:
        r0 = 0;
    L_0x0057:
        r5 = r0;
    L_0x0058:
        r0 = -1;
        if (r5 == r0) goto L_0x0060;
    L_0x005b:
        r1 = 0;
        r0 = r13;
        com.badlogic.gdx.backends.android.C0346o.m986a(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x007f }
    L_0x0060:
        r0 = r13.f1233f;	 Catch:{ all -> 0x007f }
        r0[r4] = r2;	 Catch:{ all -> 0x007f }
        r0 = r13.f1234g;	 Catch:{ all -> 0x007f }
        r0[r4] = r3;	 Catch:{ all -> 0x007f }
        r0 = r13.f1235h;	 Catch:{ all -> 0x007f }
        r1 = 0;
        r0[r4] = r1;	 Catch:{ all -> 0x007f }
        r0 = r13.f1236i;	 Catch:{ all -> 0x007f }
        r1 = 0;
        r0[r4] = r1;	 Catch:{ all -> 0x007f }
        r1 = r13.f1237j;	 Catch:{ all -> 0x007f }
        r0 = -1;
        if (r5 == r0) goto L_0x00e1;
    L_0x0077:
        r0 = 1;
    L_0x0078:
        r1[r4] = r0;	 Catch:{ all -> 0x007f }
        r0 = r13.f1238k;	 Catch:{ all -> 0x007f }
        r0[r4] = r5;	 Catch:{ all -> 0x007f }
        goto L_0x001d;
    L_0x007f:
        r0 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x007f }
        throw r0;
    L_0x0082:
        r4 = r4 + 1;
        goto L_0x002c;
    L_0x0085:
        r3 = r13.f1239l;	 Catch:{ all -> 0x007f }
        r3 = com.badlogic.gdx.backends.android.C0341k.m968a(r3);	 Catch:{ all -> 0x007f }
        r13.f1239l = r3;	 Catch:{ all -> 0x007f }
        r3 = r13.f1233f;	 Catch:{ all -> 0x007f }
        r3 = com.badlogic.gdx.backends.android.C0341k.m968a(r3);	 Catch:{ all -> 0x007f }
        r13.f1233f = r3;	 Catch:{ all -> 0x007f }
        r3 = r13.f1234g;	 Catch:{ all -> 0x007f }
        r3 = com.badlogic.gdx.backends.android.C0341k.m968a(r3);	 Catch:{ all -> 0x007f }
        r13.f1234g = r3;	 Catch:{ all -> 0x007f }
        r3 = r13.f1235h;	 Catch:{ all -> 0x007f }
        r3 = com.badlogic.gdx.backends.android.C0341k.m968a(r3);	 Catch:{ all -> 0x007f }
        r13.f1235h = r3;	 Catch:{ all -> 0x007f }
        r3 = r13.f1236i;	 Catch:{ all -> 0x007f }
        r3 = com.badlogic.gdx.backends.android.C0341k.m968a(r3);	 Catch:{ all -> 0x007f }
        r13.f1236i = r3;	 Catch:{ all -> 0x007f }
        r3 = r13.f1237j;	 Catch:{ all -> 0x007f }
        r4 = r3.length;	 Catch:{ all -> 0x007f }
        r4 = r4 + 2;
        r4 = new boolean[r4];	 Catch:{ all -> 0x007f }
        r8 = 0;
        r9 = 0;
        r10 = r3.length;	 Catch:{ all -> 0x007f }
        java.lang.System.arraycopy(r3, r8, r4, r9, r10);	 Catch:{ all -> 0x007f }
        r13.f1237j = r4;	 Catch:{ all -> 0x007f }
        r3 = r13.f1238k;	 Catch:{ all -> 0x007f }
        r3 = com.badlogic.gdx.backends.android.C0341k.m968a(r3);	 Catch:{ all -> 0x007f }
        r13.f1238k = r3;	 Catch:{ all -> 0x007f }
        r4 = r0;
        goto L_0x0035;
    L_0x00c7:
        r1 = 2;
        if (r0 != r1) goto L_0x00cc;
    L_0x00ca:
        r0 = 1;
        goto L_0x0057;
    L_0x00cc:
        r1 = 4;
        if (r0 != r1) goto L_0x00d1;
    L_0x00cf:
        r0 = 2;
        goto L_0x0057;
    L_0x00d1:
        r1 = 8;
        if (r0 != r1) goto L_0x00d7;
    L_0x00d5:
        r0 = 3;
        goto L_0x0057;
    L_0x00d7:
        r1 = 16;
        if (r0 != r1) goto L_0x00de;
    L_0x00db:
        r0 = 4;
        goto L_0x0057;
    L_0x00de:
        r0 = -1;
        goto L_0x0057;
    L_0x00e1:
        r0 = 0;
        goto L_0x0078;
    L_0x00e3:
        r4 = r13.m975c(r2);	 Catch:{ all -> 0x007f }
        r0 = -1;
        if (r4 == r0) goto L_0x001d;
    L_0x00ea:
        r0 = 20;
        if (r4 >= r0) goto L_0x001d;
    L_0x00ee:
        r0 = r13.f1239l;	 Catch:{ all -> 0x007f }
        r2 = -1;
        r0[r4] = r2;	 Catch:{ all -> 0x007f }
        r0 = r12.getX(r1);	 Catch:{ all -> 0x007f }
        r2 = (int) r0;	 Catch:{ all -> 0x007f }
        r0 = r12.getY(r1);	 Catch:{ all -> 0x007f }
        r3 = (int) r0;	 Catch:{ all -> 0x007f }
        r0 = r13.f1238k;	 Catch:{ all -> 0x007f }
        r5 = r0[r4];	 Catch:{ all -> 0x007f }
        r0 = -1;
        if (r5 == r0) goto L_0x0109;
    L_0x0104:
        r1 = 1;
        r0 = r13;
        com.badlogic.gdx.backends.android.C0346o.m986a(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x007f }
    L_0x0109:
        r0 = r13.f1233f;	 Catch:{ all -> 0x007f }
        r0[r4] = r2;	 Catch:{ all -> 0x007f }
        r0 = r13.f1234g;	 Catch:{ all -> 0x007f }
        r0[r4] = r3;	 Catch:{ all -> 0x007f }
        r0 = r13.f1235h;	 Catch:{ all -> 0x007f }
        r1 = 0;
        r0[r4] = r1;	 Catch:{ all -> 0x007f }
        r0 = r13.f1236i;	 Catch:{ all -> 0x007f }
        r1 = 0;
        r0[r4] = r1;	 Catch:{ all -> 0x007f }
        r0 = r13.f1237j;	 Catch:{ all -> 0x007f }
        r1 = 0;
        r0[r4] = r1;	 Catch:{ all -> 0x007f }
        r0 = r13.f1238k;	 Catch:{ all -> 0x007f }
        r1 = 0;
        r0[r4] = r1;	 Catch:{ all -> 0x007f }
        goto L_0x001d;
    L_0x0127:
        r9 = r12.getPointerCount();	 Catch:{ all -> 0x007f }
        r0 = 0;
        r8 = r0;
    L_0x012d:
        if (r8 >= r9) goto L_0x001d;
    L_0x012f:
        r0 = r12.getPointerId(r8);	 Catch:{ all -> 0x007f }
        r1 = r12.getX(r8);	 Catch:{ all -> 0x007f }
        r2 = (int) r1;	 Catch:{ all -> 0x007f }
        r1 = r12.getY(r8);	 Catch:{ all -> 0x007f }
        r3 = (int) r1;	 Catch:{ all -> 0x007f }
        r4 = r13.m975c(r0);	 Catch:{ all -> 0x007f }
        r0 = -1;
        if (r4 == r0) goto L_0x0170;
    L_0x0144:
        r0 = 20;
        if (r4 >= r0) goto L_0x001d;
    L_0x0148:
        r0 = r13.f1238k;	 Catch:{ all -> 0x007f }
        r5 = r0[r4];	 Catch:{ all -> 0x007f }
        r0 = -1;
        if (r5 == r0) goto L_0x0174;
    L_0x014f:
        r1 = 2;
        r0 = r13;
        com.badlogic.gdx.backends.android.C0346o.m986a(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x007f }
    L_0x0154:
        r0 = r13.f1235h;	 Catch:{ all -> 0x007f }
        r1 = r13.f1233f;	 Catch:{ all -> 0x007f }
        r1 = r1[r4];	 Catch:{ all -> 0x007f }
        r1 = r2 - r1;
        r0[r4] = r1;	 Catch:{ all -> 0x007f }
        r0 = r13.f1236i;	 Catch:{ all -> 0x007f }
        r1 = r13.f1234g;	 Catch:{ all -> 0x007f }
        r1 = r1[r4];	 Catch:{ all -> 0x007f }
        r1 = r3 - r1;
        r0[r4] = r1;	 Catch:{ all -> 0x007f }
        r0 = r13.f1233f;	 Catch:{ all -> 0x007f }
        r0[r4] = r2;	 Catch:{ all -> 0x007f }
        r0 = r13.f1234g;	 Catch:{ all -> 0x007f }
        r0[r4] = r3;	 Catch:{ all -> 0x007f }
    L_0x0170:
        r0 = r8 + 1;
        r8 = r0;
        goto L_0x012d;
    L_0x0174:
        r1 = 4;
        r5 = 0;
        r0 = r13;
        com.badlogic.gdx.backends.android.C0346o.m986a(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x007f }
        goto L_0x0154;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.backends.android.o.a(android.view.MotionEvent, com.badlogic.gdx.backends.android.k):void");
    }

    /* renamed from: a */
    public final boolean mo312a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch");
    }
}
