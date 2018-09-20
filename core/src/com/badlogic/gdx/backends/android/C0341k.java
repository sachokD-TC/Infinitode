package com.badlogic.gdx.backends.android;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.EditText;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.C0326e.C0324b;
import com.badlogic.gdx.C0366h;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.C0237a;
import com.badlogic.gdx.Input.Orientation;
import com.badlogic.gdx.utils.C0328t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.badlogic.gdx.backends.android.k */
public class C0341k implements OnKeyListener, OnTouchListener, Input {
    /* renamed from: A */
    boolean f1202A = false;
    /* renamed from: B */
    C0366h f1203B;
    /* renamed from: C */
    protected final Orientation f1204C;
    /* renamed from: D */
    long f1205D = System.nanoTime();
    /* renamed from: E */
    boolean f1206E = true;
    /* renamed from: F */
    final float[] f1207F = new float[9];
    /* renamed from: G */
    final float[] f1208G = new float[3];
    /* renamed from: H */
    private int f1209H = 0;
    /* renamed from: I */
    private boolean[] f1210I = new boolean[260];
    /* renamed from: J */
    private SensorManager f1211J;
    /* renamed from: K */
    private String f1212K = null;
    /* renamed from: L */
    private C0237a f1213L = null;
    /* renamed from: M */
    private Handler f1214M;
    /* renamed from: N */
    private int f1215N = 0;
    /* renamed from: O */
    private boolean f1216O = false;
    /* renamed from: P */
    private boolean f1217P = false;
    /* renamed from: Q */
    private boolean f1218Q = false;
    /* renamed from: R */
    private boolean f1219R = false;
    /* renamed from: S */
    private float f1220S = 0.0f;
    /* renamed from: T */
    private float f1221T = 0.0f;
    /* renamed from: U */
    private float f1222U = 0.0f;
    /* renamed from: V */
    private float f1223V = 0.0f;
    /* renamed from: W */
    private final C0310b f1224W;
    /* renamed from: X */
    private final C0352r f1225X;
    /* renamed from: Y */
    private SensorEventListener f1226Y;
    /* renamed from: Z */
    private SensorEventListener f1227Z;
    /* renamed from: a */
    C0328t<C0338a> f1228a = new C03291(this);
    private SensorEventListener aa;
    private SensorEventListener ab;
    /* renamed from: b */
    C0328t<C0340c> f1229b = new C03302(this);
    /* renamed from: c */
    ArrayList<OnKeyListener> f1230c = new ArrayList();
    /* renamed from: d */
    ArrayList<C0338a> f1231d = new ArrayList();
    /* renamed from: e */
    ArrayList<C0340c> f1232e = new ArrayList();
    /* renamed from: f */
    int[] f1233f = new int[20];
    /* renamed from: g */
    int[] f1234g = new int[20];
    /* renamed from: h */
    int[] f1235h = new int[20];
    /* renamed from: i */
    int[] f1236i = new int[20];
    /* renamed from: j */
    boolean[] f1237j = new boolean[20];
    /* renamed from: k */
    int[] f1238k = new int[20];
    /* renamed from: l */
    int[] f1239l = new int[20];
    /* renamed from: m */
    final boolean f1240m;
    /* renamed from: n */
    boolean f1241n = false;
    /* renamed from: o */
    boolean[] f1242o = new boolean[260];
    /* renamed from: p */
    public boolean f1243p = false;
    /* renamed from: q */
    protected final float[] f1244q = new float[3];
    /* renamed from: r */
    public boolean f1245r = false;
    /* renamed from: s */
    protected final float[] f1246s = new float[3];
    /* renamed from: t */
    final Application f1247t;
    /* renamed from: u */
    final Context f1248u;
    /* renamed from: v */
    protected final C0345u f1249v;
    /* renamed from: w */
    protected final Vibrator f1250w;
    /* renamed from: x */
    boolean f1251x;
    /* renamed from: y */
    protected final float[] f1252y = new float[3];
    /* renamed from: z */
    protected final float[] f1253z = new float[3];

    /* renamed from: com.badlogic.gdx.backends.android.k$1 */
    class C03291 extends C0328t<C0338a> {
        /* renamed from: a */
        final /* synthetic */ C0341k f1176a;

        C03291(C0341k c0341k) {
            this.f1176a = c0341k;
            super(16, 1000);
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo301a() {
            return new C0338a();
        }
    }

    /* renamed from: com.badlogic.gdx.backends.android.k$2 */
    class C03302 extends C0328t<C0340c> {
        /* renamed from: a */
        final /* synthetic */ C0341k f1177a;

        C03302(C0341k c0341k) {
            this.f1177a = c0341k;
            super(16, 1000);
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo301a() {
            return new C0340c();
        }
    }

    /* renamed from: com.badlogic.gdx.backends.android.k$a */
    static class C0338a {
        /* renamed from: a */
        long f1190a;
        /* renamed from: b */
        int f1191b;
        /* renamed from: c */
        int f1192c;
        /* renamed from: d */
        char f1193d;

        C0338a() {
        }
    }

    /* renamed from: com.badlogic.gdx.backends.android.k$b */
    private class C0339b implements SensorEventListener {
        /* renamed from: a */
        final /* synthetic */ C0341k f1194a;

        public C0339b(C0341k c0341k) {
            this.f1194a = c0341k;
        }

        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        public final void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                if (this.f1194a.f1204C == Orientation.Portrait) {
                    System.arraycopy(sensorEvent.values, 0, this.f1194a.f1244q, 0, this.f1194a.f1244q.length);
                } else {
                    this.f1194a.f1244q[0] = sensorEvent.values[1];
                    this.f1194a.f1244q[1] = -sensorEvent.values[0];
                    this.f1194a.f1244q[2] = sensorEvent.values[2];
                }
            }
            if (sensorEvent.sensor.getType() == 2) {
                System.arraycopy(sensorEvent.values, 0, this.f1194a.f1252y, 0, this.f1194a.f1252y.length);
            }
            if (sensorEvent.sensor.getType() == 4) {
                if (this.f1194a.f1204C == Orientation.Portrait) {
                    System.arraycopy(sensorEvent.values, 0, this.f1194a.f1246s, 0, this.f1194a.f1246s.length);
                } else {
                    this.f1194a.f1246s[0] = sensorEvent.values[1];
                    this.f1194a.f1246s[1] = -sensorEvent.values[0];
                    this.f1194a.f1246s[2] = sensorEvent.values[2];
                }
            }
            if (sensorEvent.sensor.getType() != 11) {
                return;
            }
            if (this.f1194a.f1204C == Orientation.Portrait) {
                System.arraycopy(sensorEvent.values, 0, this.f1194a.f1253z, 0, this.f1194a.f1253z.length);
                return;
            }
            this.f1194a.f1253z[0] = sensorEvent.values[1];
            this.f1194a.f1253z[1] = -sensorEvent.values[0];
            this.f1194a.f1253z[2] = sensorEvent.values[2];
        }
    }

    /* renamed from: com.badlogic.gdx.backends.android.k$c */
    static class C0340c {
        /* renamed from: a */
        long f1195a;
        /* renamed from: b */
        int f1196b;
        /* renamed from: c */
        int f1197c;
        /* renamed from: d */
        int f1198d;
        /* renamed from: e */
        int f1199e;
        /* renamed from: f */
        int f1200f;
        /* renamed from: g */
        int f1201g;

        C0340c() {
        }
    }

    public C0341k(Application application, Context context, Object obj, C0310b c0310b) {
        boolean z = false;
        if (obj instanceof View) {
            View view = (View) obj;
            view.setOnKeyListener(this);
            view.setOnTouchListener(this);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        }
        this.f1224W = c0310b;
        this.f1225X = new C0352r(context, new Handler(), this);
        for (int i = 0; i < this.f1239l.length; i++) {
            this.f1239l[i] = -1;
        }
        this.f1214M = new Handler();
        this.f1247t = application;
        this.f1248u = context;
        this.f1215N = c0310b.f1104m;
        this.f1249v = new C0346o();
        this.f1240m = this.f1249v.mo312a(context);
        this.f1250w = (Vibrator) context.getSystemService("vibrator");
        switch (this.f1248u instanceof Activity ? ((Activity) this.f1248u).getWindowManager().getDefaultDisplay().getRotation() : ((WindowManager) this.f1248u.getSystemService("window")).getDefaultDisplay().getRotation()) {
            case 1:
                z = true;
                break;
            case 2:
                z = true;
                break;
            case 3:
                z = true;
                break;
        }
        C0324b h = this.f1247t.getGraphics().mo299h();
        if (((!z || z) && h.f1136a >= h.f1137b) || ((z || z) && h.f1136a <= h.f1137b)) {
            this.f1204C = Orientation.Landscape;
        } else {
            this.f1204C = Orientation.Portrait;
        }
    }

    /* renamed from: a */
    static int[] m968a(int[] iArr) {
        Object obj = new int[(iArr.length + 2)];
        System.arraycopy(iArr, 0, obj, 0, iArr.length);
        return obj;
    }

    /* renamed from: a */
    public final int mo302a() {
        int i;
        synchronized (this) {
            i = this.f1233f[0];
        }
        return i;
    }

    /* renamed from: a */
    public final void mo303a(C0237a c0237a, String str, String str2, String str3) {
        final String str4 = str;
        final String str5 = str3;
        final String str6 = str2;
        final C0237a c0237a2 = c0237a;
        this.f1214M.post(new Runnable(this) {
            /* renamed from: e */
            final /* synthetic */ C0341k f1189e;

            /* renamed from: com.badlogic.gdx.backends.android.k$3$2 */
            class C03342 implements OnClickListener {
                /* renamed from: a */
                final /* synthetic */ C03373 f1182a;

                /* renamed from: com.badlogic.gdx.backends.android.k$3$2$1 */
                class C03331 implements Runnable {
                    /* renamed from: a */
                    final /* synthetic */ C03342 f1181a;

                    C03331(C03342 c03342) {
                        this.f1181a = c03342;
                    }

                    public final void run() {
                    }
                }

                C03342(C03373 c03373) {
                    this.f1182a = c03373;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    Gdx.app.postRunnable(new C03331(this));
                }
            }

            /* renamed from: com.badlogic.gdx.backends.android.k$3$3 */
            class C03363 implements OnCancelListener {
                /* renamed from: a */
                final /* synthetic */ C03373 f1184a;

                /* renamed from: com.badlogic.gdx.backends.android.k$3$3$1 */
                class C03351 implements Runnable {
                    /* renamed from: a */
                    final /* synthetic */ C03363 f1183a;

                    C03351(C03363 c03363) {
                        this.f1183a = c03363;
                    }

                    public final void run() {
                    }
                }

                C03363(C03373 c03373) {
                    this.f1184a = c03373;
                }

                public final void onCancel(DialogInterface dialogInterface) {
                    Gdx.app.postRunnable(new C03351(this));
                }
            }

            public final void run() {
                Builder builder = new Builder(this.f1189e.f1248u);
                builder.setTitle(str4);
                final View editText = new EditText(this.f1189e.f1248u);
                editText.setHint(str5);
                editText.setText(str6);
                editText.setSingleLine();
                builder.setView(editText);
                builder.setPositiveButton(this.f1189e.f1248u.getString(17039370), new OnClickListener(this) {
                    /* renamed from: b */
                    final /* synthetic */ C03373 f1180b;

                    /* renamed from: com.badlogic.gdx.backends.android.k$3$1$1 */
                    class C03311 implements Runnable {
                        /* renamed from: a */
                        final /* synthetic */ C03321 f1178a;

                        C03311(C03321 c03321) {
                            this.f1178a = c03321;
                        }

                        public final void run() {
                            c0237a2.mo1791a(editText.getText().toString());
                        }
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Gdx.app.postRunnable(new C03311(this));
                    }
                });
                builder.setNegativeButton(this.f1189e.f1248u.getString(17039360), new C03342(this));
                builder.setOnCancelListener(new C03363(this));
                builder.show();
            }
        });
    }

    /* renamed from: a */
    public final void mo304a(C0366h c0366h) {
        synchronized (this) {
            this.f1203B = c0366h;
        }
    }

    /* renamed from: a */
    public final boolean mo305a(int i) {
        boolean z = true;
        synchronized (this) {
            if (this.f1240m) {
                int i2 = 0;
                while (i2 < 20) {
                    if (this.f1237j[i2] && this.f1238k[i2] == i) {
                        break;
                    }
                    i2++;
                }
            }
            if (!(this.f1237j[0] && this.f1238k[0] == i)) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final int mo306b() {
        int i;
        synchronized (this) {
            i = this.f1234g[0];
        }
        return i;
    }

    /* renamed from: b */
    public final synchronized boolean mo307b(int i) {
        boolean z;
        z = i == -1 ? this.f1241n : (i < 0 || i >= 260) ? false : this.f1242o[i];
        return z;
    }

    /* renamed from: c */
    public final int m975c(int i) {
        int i2;
        int length = this.f1239l.length;
        for (i2 = 0; i2 < length; i2++) {
            if (this.f1239l[i2] == i) {
                return i2;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (i2 = 0; i2 < length; i2++) {
            stringBuffer.append(i2 + ":" + this.f1239l[i2] + " ");
        }
        Gdx.app.log("AndroidInput", "Pointer ID lookup failed: " + i + ", " + stringBuffer.toString());
        return -1;
    }

    /* renamed from: c */
    public final boolean mo308c() {
        boolean z;
        synchronized (this) {
            z = this.f1237j[1];
        }
        return z;
    }

    /* renamed from: d */
    public final long mo309d() {
        return this.f1205D;
    }

    /* renamed from: e */
    public final void mo310e() {
        this.f1216O = true;
    }

    /* renamed from: f */
    public final void m979f() {
        if (this.f1211J != null) {
            if (this.f1226Y != null) {
                this.f1211J.unregisterListener(this.f1226Y);
                this.f1226Y = null;
            }
            if (this.f1227Z != null) {
                this.f1211J.unregisterListener(this.f1227Z);
                this.f1227Z = null;
            }
            if (this.ab != null) {
                this.f1211J.unregisterListener(this.ab);
                this.ab = null;
            }
            if (this.aa != null) {
                this.f1211J.unregisterListener(this.aa);
                this.aa = null;
            }
            this.f1211J = null;
        }
        Gdx.app.log("AndroidInput", "sensor listener tear down");
        Arrays.fill(this.f1239l, -1);
        Arrays.fill(this.f1237j, false);
    }

    /* renamed from: g */
    public final void m980g() {
        Sensor sensor;
        List<Sensor> sensorList;
        if (this.f1224W.f1099h) {
            this.f1211J = (SensorManager) this.f1248u.getSystemService("sensor");
            if (this.f1211J.getSensorList(1).size() != 0) {
                sensor = (Sensor) this.f1211J.getSensorList(1).get(0);
                this.f1226Y = new C0339b(this);
                this.f1243p = this.f1211J.registerListener(this.f1226Y, sensor, this.f1224W.f1103l);
                if (this.f1224W.f1100i) {
                    this.f1211J = (SensorManager) this.f1248u.getSystemService("sensor");
                    if (this.f1211J.getSensorList(4).size() != 0) {
                        sensor = (Sensor) this.f1211J.getSensorList(4).get(0);
                        this.f1227Z = new C0339b(this);
                        this.f1245r = this.f1211J.registerListener(this.f1227Z, sensor, this.f1224W.f1103l);
                        this.f1219R = false;
                        if (this.f1224W.f1102k) {
                            if (this.f1211J == null) {
                                this.f1211J = (SensorManager) this.f1248u.getSystemService("sensor");
                            }
                            sensorList = this.f1211J.getSensorList(11);
                            if (sensorList.size() > 0) {
                                this.ab = new C0339b(this);
                                for (Sensor sensor2 : sensorList) {
                                    if (!sensor2.getVendor().equals("Google Inc.") && sensor2.getVersion() == 3) {
                                        this.f1219R = this.f1211J.registerListener(this.ab, sensor2, this.f1224W.f1103l);
                                        break;
                                    }
                                }
                                if (!this.f1219R) {
                                    this.f1219R = this.f1211J.registerListener(this.ab, (Sensor) sensorList.get(0), this.f1224W.f1103l);
                                }
                            }
                        }
                        if (this.f1224W.f1101j || this.f1219R) {
                            this.f1218Q = false;
                        } else {
                            if (this.f1211J == null) {
                                this.f1211J = (SensorManager) this.f1248u.getSystemService("sensor");
                            }
                            sensor2 = this.f1211J.getDefaultSensor(2);
                            if (sensor2 != null) {
                                this.f1218Q = this.f1243p;
                                if (this.f1218Q) {
                                    this.aa = new C0339b(this);
                                    this.f1218Q = this.f1211J.registerListener(this.aa, sensor2, this.f1224W.f1103l);
                                }
                            } else {
                                this.f1218Q = false;
                            }
                        }
                        Gdx.app.log("AndroidInput", "sensor listener setup");
                    }
                }
                this.f1245r = false;
                this.f1219R = false;
                if (this.f1224W.f1102k) {
                    if (this.f1211J == null) {
                        this.f1211J = (SensorManager) this.f1248u.getSystemService("sensor");
                    }
                    sensorList = this.f1211J.getSensorList(11);
                    if (sensorList.size() > 0) {
                        this.ab = new C0339b(this);
                        for (Sensor sensor22 : sensorList) {
                            if (!sensor22.getVendor().equals("Google Inc.")) {
                            }
                        }
                        if (this.f1219R) {
                            this.f1219R = this.f1211J.registerListener(this.ab, (Sensor) sensorList.get(0), this.f1224W.f1103l);
                        }
                    }
                }
                if (this.f1224W.f1101j) {
                }
                this.f1218Q = false;
                Gdx.app.log("AndroidInput", "sensor listener setup");
            }
        }
        this.f1243p = false;
        if (this.f1224W.f1100i) {
            this.f1211J = (SensorManager) this.f1248u.getSystemService("sensor");
            if (this.f1211J.getSensorList(4).size() != 0) {
                sensor22 = (Sensor) this.f1211J.getSensorList(4).get(0);
                this.f1227Z = new C0339b(this);
                this.f1245r = this.f1211J.registerListener(this.f1227Z, sensor22, this.f1224W.f1103l);
                this.f1219R = false;
                if (this.f1224W.f1102k) {
                    if (this.f1211J == null) {
                        this.f1211J = (SensorManager) this.f1248u.getSystemService("sensor");
                    }
                    sensorList = this.f1211J.getSensorList(11);
                    if (sensorList.size() > 0) {
                        this.ab = new C0339b(this);
                        for (Sensor sensor222 : sensorList) {
                            if (!sensor222.getVendor().equals("Google Inc.")) {
                            }
                        }
                        if (this.f1219R) {
                            this.f1219R = this.f1211J.registerListener(this.ab, (Sensor) sensorList.get(0), this.f1224W.f1103l);
                        }
                    }
                }
                if (this.f1224W.f1101j) {
                }
                this.f1218Q = false;
                Gdx.app.log("AndroidInput", "sensor listener setup");
            }
        }
        this.f1245r = false;
        this.f1219R = false;
        if (this.f1224W.f1102k) {
            if (this.f1211J == null) {
                this.f1211J = (SensorManager) this.f1248u.getSystemService("sensor");
            }
            sensorList = this.f1211J.getSensorList(11);
            if (sensorList.size() > 0) {
                this.ab = new C0339b(this);
                for (Sensor sensor2222 : sensorList) {
                    if (!sensor2222.getVendor().equals("Google Inc.")) {
                    }
                }
                if (this.f1219R) {
                    this.f1219R = this.f1211J.registerListener(this.ab, (Sensor) sensorList.get(0), this.f1224W.f1103l);
                }
            }
        }
        if (this.f1224W.f1101j) {
        }
        this.f1218Q = false;
        Gdx.app.log("AndroidInput", "sensor listener setup");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKey(android.view.View r10, int r11, android.view.KeyEvent r12) {
        /*
        r9 = this;
        r8 = 4;
        r6 = 2;
        r1 = 1;
        r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r2 = 0;
        r0 = r9.f1230c;
        r5 = r0.size();
        r4 = r2;
    L_0x000d:
        if (r4 >= r5) goto L_0x0023;
    L_0x000f:
        r0 = r9.f1230c;
        r0 = r0.get(r4);
        r0 = (android.view.View.OnKeyListener) r0;
        r0 = r0.onKey(r10, r11, r12);
        if (r0 == 0) goto L_0x001f;
    L_0x001d:
        r0 = r1;
    L_0x001e:
        return r0;
    L_0x001f:
        r0 = r4 + 1;
        r4 = r0;
        goto L_0x000d;
    L_0x0023:
        monitor-enter(r9);
        r0 = r12.getKeyCode();	 Catch:{ all -> 0x00d5 }
        if (r0 != 0) goto L_0x0061;
    L_0x002a:
        r0 = r12.getAction();	 Catch:{ all -> 0x00d5 }
        if (r0 != r6) goto L_0x0061;
    L_0x0030:
        r3 = r12.getCharacters();	 Catch:{ all -> 0x00d5 }
        r1 = r2;
    L_0x0035:
        r0 = r3.length();	 Catch:{ all -> 0x00d5 }
        if (r1 >= r0) goto L_0x005e;
    L_0x003b:
        r0 = r9.f1228a;	 Catch:{ all -> 0x00d5 }
        r0 = r0.m965b();	 Catch:{ all -> 0x00d5 }
        r0 = (com.badlogic.gdx.backends.android.C0341k.C0338a) r0;	 Catch:{ all -> 0x00d5 }
        r4 = java.lang.System.nanoTime();	 Catch:{ all -> 0x00d5 }
        r0.f1190a = r4;	 Catch:{ all -> 0x00d5 }
        r4 = 0;
        r0.f1192c = r4;	 Catch:{ all -> 0x00d5 }
        r4 = r3.charAt(r1);	 Catch:{ all -> 0x00d5 }
        r0.f1193d = r4;	 Catch:{ all -> 0x00d5 }
        r4 = 2;
        r0.f1191b = r4;	 Catch:{ all -> 0x00d5 }
        r4 = r9.f1231d;	 Catch:{ all -> 0x00d5 }
        r4.add(r0);	 Catch:{ all -> 0x00d5 }
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0035;
    L_0x005e:
        monitor-exit(r9);	 Catch:{ all -> 0x00d5 }
        r0 = r2;
        goto L_0x001e;
    L_0x0061:
        r0 = r12.getUnicodeChar();	 Catch:{ all -> 0x00d5 }
        r0 = (char) r0;	 Catch:{ all -> 0x00d5 }
        r4 = 67;
        if (r11 != r4) goto L_0x0166;
    L_0x006a:
        r0 = 8;
        r4 = r0;
    L_0x006d:
        r0 = r12.getKeyCode();	 Catch:{ all -> 0x00d5 }
        if (r0 < 0) goto L_0x007b;
    L_0x0073:
        r0 = r12.getKeyCode();	 Catch:{ all -> 0x00d5 }
        r5 = 260; // 0x104 float:3.64E-43 double:1.285E-321;
        if (r0 < r5) goto L_0x007e;
    L_0x007b:
        monitor-exit(r9);	 Catch:{ all -> 0x00d5 }
        r0 = r2;
        goto L_0x001e;
    L_0x007e:
        r0 = r12.getAction();	 Catch:{ all -> 0x00d5 }
        switch(r0) {
            case 0: goto L_0x0093;
            case 1: goto L_0x00d8;
            default: goto L_0x0085;
        };	 Catch:{ all -> 0x00d5 }
    L_0x0085:
        r0 = r9.f1247t;	 Catch:{ all -> 0x00d5 }
        r0 = r0.getGraphics();	 Catch:{ all -> 0x00d5 }
        r0.mo300i();	 Catch:{ all -> 0x00d5 }
        monitor-exit(r9);	 Catch:{ all -> 0x00d5 }
        if (r11 != r3) goto L_0x014f;
    L_0x0091:
        r0 = r1;
        goto L_0x001e;
    L_0x0093:
        r0 = r9.f1228a;	 Catch:{ all -> 0x00d5 }
        r0 = r0.m965b();	 Catch:{ all -> 0x00d5 }
        r0 = (com.badlogic.gdx.backends.android.C0341k.C0338a) r0;	 Catch:{ all -> 0x00d5 }
        r4 = java.lang.System.nanoTime();	 Catch:{ all -> 0x00d5 }
        r0.f1190a = r4;	 Catch:{ all -> 0x00d5 }
        r4 = 0;
        r0.f1193d = r4;	 Catch:{ all -> 0x00d5 }
        r4 = r12.getKeyCode();	 Catch:{ all -> 0x00d5 }
        r0.f1192c = r4;	 Catch:{ all -> 0x00d5 }
        r4 = 0;
        r0.f1191b = r4;	 Catch:{ all -> 0x00d5 }
        if (r11 != r8) goto L_0x00ba;
    L_0x00af:
        r4 = r12.isAltPressed();	 Catch:{ all -> 0x00d5 }
        if (r4 == 0) goto L_0x00ba;
    L_0x00b5:
        r4 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0.f1192c = r4;	 Catch:{ all -> 0x00d5 }
        r11 = r3;
    L_0x00ba:
        r4 = r9.f1231d;	 Catch:{ all -> 0x00d5 }
        r4.add(r0);	 Catch:{ all -> 0x00d5 }
        r4 = r9.f1210I;	 Catch:{ all -> 0x00d5 }
        r5 = r0.f1192c;	 Catch:{ all -> 0x00d5 }
        r4 = r4[r5];	 Catch:{ all -> 0x00d5 }
        if (r4 != 0) goto L_0x0085;
    L_0x00c7:
        r4 = r9.f1209H;	 Catch:{ all -> 0x00d5 }
        r4 = r4 + 1;
        r9.f1209H = r4;	 Catch:{ all -> 0x00d5 }
        r4 = r9.f1210I;	 Catch:{ all -> 0x00d5 }
        r0 = r0.f1192c;	 Catch:{ all -> 0x00d5 }
        r5 = 1;
        r4[r0] = r5;	 Catch:{ all -> 0x00d5 }
        goto L_0x0085;
    L_0x00d5:
        r0 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x00d5 }
        throw r0;
    L_0x00d8:
        r6 = java.lang.System.nanoTime();	 Catch:{ all -> 0x00d5 }
        r0 = r9.f1228a;	 Catch:{ all -> 0x00d5 }
        r0 = r0.m965b();	 Catch:{ all -> 0x00d5 }
        r0 = (com.badlogic.gdx.backends.android.C0341k.C0338a) r0;	 Catch:{ all -> 0x00d5 }
        r0.f1190a = r6;	 Catch:{ all -> 0x00d5 }
        r5 = 0;
        r0.f1193d = r5;	 Catch:{ all -> 0x00d5 }
        r5 = r12.getKeyCode();	 Catch:{ all -> 0x00d5 }
        r0.f1192c = r5;	 Catch:{ all -> 0x00d5 }
        r5 = 1;
        r0.f1191b = r5;	 Catch:{ all -> 0x00d5 }
        if (r11 != r8) goto L_0x00ff;
    L_0x00f4:
        r5 = r12.isAltPressed();	 Catch:{ all -> 0x00d5 }
        if (r5 == 0) goto L_0x00ff;
    L_0x00fa:
        r5 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0.f1192c = r5;	 Catch:{ all -> 0x00d5 }
        r11 = r3;
    L_0x00ff:
        r5 = r9.f1231d;	 Catch:{ all -> 0x00d5 }
        r5.add(r0);	 Catch:{ all -> 0x00d5 }
        r0 = r9.f1228a;	 Catch:{ all -> 0x00d5 }
        r0 = r0.m965b();	 Catch:{ all -> 0x00d5 }
        r0 = (com.badlogic.gdx.backends.android.C0341k.C0338a) r0;	 Catch:{ all -> 0x00d5 }
        r0.f1190a = r6;	 Catch:{ all -> 0x00d5 }
        r0.f1193d = r4;	 Catch:{ all -> 0x00d5 }
        r4 = 0;
        r0.f1192c = r4;	 Catch:{ all -> 0x00d5 }
        r4 = 2;
        r0.f1191b = r4;	 Catch:{ all -> 0x00d5 }
        r4 = r9.f1231d;	 Catch:{ all -> 0x00d5 }
        r4.add(r0);	 Catch:{ all -> 0x00d5 }
        if (r11 != r3) goto L_0x0134;
    L_0x011d:
        r0 = r9.f1210I;	 Catch:{ all -> 0x00d5 }
        r4 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0 = r0[r4];	 Catch:{ all -> 0x00d5 }
        if (r0 == 0) goto L_0x0085;
    L_0x0125:
        r0 = r9.f1209H;	 Catch:{ all -> 0x00d5 }
        r0 = r0 + -1;
        r9.f1209H = r0;	 Catch:{ all -> 0x00d5 }
        r0 = r9.f1210I;	 Catch:{ all -> 0x00d5 }
        r4 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r5 = 0;
        r0[r4] = r5;	 Catch:{ all -> 0x00d5 }
        goto L_0x0085;
    L_0x0134:
        r0 = r9.f1210I;	 Catch:{ all -> 0x00d5 }
        r4 = r12.getKeyCode();	 Catch:{ all -> 0x00d5 }
        r0 = r0[r4];	 Catch:{ all -> 0x00d5 }
        if (r0 == 0) goto L_0x0085;
    L_0x013e:
        r0 = r9.f1209H;	 Catch:{ all -> 0x00d5 }
        r0 = r0 + -1;
        r9.f1209H = r0;	 Catch:{ all -> 0x00d5 }
        r0 = r9.f1210I;	 Catch:{ all -> 0x00d5 }
        r4 = r12.getKeyCode();	 Catch:{ all -> 0x00d5 }
        r5 = 0;
        r0[r4] = r5;	 Catch:{ all -> 0x00d5 }
        goto L_0x0085;
    L_0x014f:
        r0 = r9.f1216O;
        if (r0 == 0) goto L_0x0158;
    L_0x0153:
        if (r11 != r8) goto L_0x0158;
    L_0x0155:
        r0 = r1;
        goto L_0x001e;
    L_0x0158:
        r0 = r9.f1217P;
        if (r0 == 0) goto L_0x0163;
    L_0x015c:
        r0 = 82;
        if (r11 != r0) goto L_0x0163;
    L_0x0160:
        r0 = r1;
        goto L_0x001e;
    L_0x0163:
        r0 = r2;
        goto L_0x001e;
    L_0x0166:
        r4 = r0;
        goto L_0x006d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.backends.android.k.onKey(android.view.View, int, android.view.KeyEvent):boolean");
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f1206E && view != null) {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            this.f1206E = false;
        }
        this.f1249v.mo311a(motionEvent, this);
        if (this.f1215N != 0) {
            try {
                Thread.sleep((long) this.f1215N);
            } catch (InterruptedException e) {
            }
        }
        return true;
    }
}
