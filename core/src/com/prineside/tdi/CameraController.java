package com.prineside.tdi;

import com.badlogic.gdx.C0366h;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0507i;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class CameraController implements C0366h {
    /* renamed from: a */
    public C0507i f6470a;
    /* renamed from: b */
    public double f6471b = 1.0d;
    /* renamed from: c */
    public int f6472c;
    /* renamed from: d */
    public int f6473d;
    /* renamed from: e */
    public int f6474e;
    /* renamed from: f */
    public int f6475f;
    /* renamed from: g */
    public double f6476g = 0.5d;
    /* renamed from: h */
    public double f6477h = 2.0d;
    /* renamed from: i */
    public float f6478i = 180.0f;
    /* renamed from: j */
    public float f6479j = 180.0f;
    /* renamed from: k */
    public float f6480k = 836.0f;
    /* renamed from: l */
    public float f6481l = 836.0f;
    /* renamed from: m */
    public HashMap<CameraControllerListener, Boolean> f6482m = new HashMap();
    /* renamed from: n */
    private int f6483n;
    /* renamed from: o */
    private int f6484o;
    /* renamed from: p */
    private int f6485p;
    /* renamed from: q */
    private int f6486q;
    /* renamed from: r */
    private HashMap<Integer, CameraControllerTouch> f6487r;

    private class CameraControllerTouch {
        /* renamed from: a */
        public int f6457a;
        /* renamed from: b */
        public int f6458b;
        /* renamed from: c */
        public int f6459c;
        /* renamed from: d */
        public int f6460d;
        /* renamed from: e */
        public int f6461e;
        /* renamed from: f */
        public int f6462f;
        /* renamed from: g */
        public float f6463g;
        /* renamed from: h */
        public float f6464h;
        /* renamed from: i */
        public double f6465i;
        /* renamed from: j */
        public Vector2 f6466j;
        /* renamed from: k */
        public boolean f6467k = false;
        /* renamed from: l */
        public boolean f6468l = false;
        /* renamed from: m */
        final /* synthetic */ CameraController f6469m;

        public CameraControllerTouch(CameraController cameraController, int i, int i2, float f, float f2, double d) {
            this.f6469m = cameraController;
            this.f6457a = i;
            this.f6458b = i2;
            this.f6459c = i;
            this.f6460d = i2;
            this.f6461e = i;
            this.f6462f = i2;
            this.f6463g = f;
            this.f6464h = f2;
            this.f6465i = d;
        }
    }

    public CameraController(C0507i c0507i, int i, int i2) {
        this.f6470a = c0507i;
        this.f6483n = i;
        this.f6484o = i2;
        this.f6487r = new HashMap();
        m7414a();
    }

    /* renamed from: a */
    private void m7412a(int i, int i2, float f, float f2) {
        float f3 = (this.f6470a.j / 2.0f) - (this.f6470a.j * f);
        m7421b(((int) f3) + i, ((int) ((this.f6470a.k / 2.0f) - (this.f6470a.k * f2))) + i2);
    }

    /* renamed from: d */
    private Vector2 m7413d(int i, int i2) {
        Vector2 vector2 = new Vector2();
        float d = 1.0f - (((float) i2) / ((float) Gdx.graphics.mo295d()));
        vector2.f2337x = (((float) i) / ((float) Gdx.graphics.mo294c())) * this.f6470a.j;
        vector2.f2338y = this.f6470a.k * d;
        return vector2;
    }

    /* renamed from: a */
    public final void m7414a() {
        float d = 8.3333335E-4f * ((float) Gdx.graphics.mo295d());
        float f = this.f6481l * d;
        float f2 = this.f6480k * d;
        float f3 = this.f6478i * d;
        d *= this.f6479j;
        if (((double) this.f6470a.a.f2344x) % this.f6471b != 0.0d) {
            Vector3 vector3 = this.f6470a.a;
            vector3.f2344x = (float) (((double) vector3.f2344x) - (((double) this.f6470a.a.f2344x) % this.f6471b));
        }
        if (((double) this.f6470a.a.f2345y) % this.f6471b != 0.0d) {
            vector3 = this.f6470a.a;
            vector3.f2345y = (float) (((double) vector3.f2345y) - (((double) this.f6470a.a.f2345y) % this.f6471b));
        }
        double d2 = this.f6471b;
        Rectangle rectangle = new Rectangle();
        rectangle.width = (float) ((int) (((double) Gdx.graphics.mo294c()) * d2));
        rectangle.height = (float) ((int) (d2 * ((double) Gdx.graphics.mo295d())));
        this.f6470a.j = rectangle.width;
        this.f6470a.k = rectangle.height;
        int i = (int) (((double) f2) * this.f6471b);
        int i2 = (int) (((double) f) * this.f6471b);
        if (((float) ((this.f6483n + i) + i2)) <= this.f6470a.j) {
            this.f6470a.a.f2344x = (float) (this.f6483n / 2);
        } else {
            i = (-i) + (((int) this.f6470a.j) / 2);
            i2 = (i2 + this.f6483n) - (((int) this.f6470a.j) / 2);
            if (this.f6470a.a.f2344x < ((float) i)) {
                this.f6470a.a.f2344x = (float) i;
            } else if (this.f6470a.a.f2344x > ((float) i2)) {
                this.f6470a.a.f2344x = (float) i2;
            }
        }
        i2 = (int) (((double) f3) * this.f6471b);
        int i3 = (int) (((double) d) * this.f6471b);
        if (((float) ((this.f6484o + i2) + i3)) <= this.f6470a.k) {
            this.f6470a.a.f2345y = (float) (this.f6484o / 2);
        } else {
            i3 = (-i3) + (((int) this.f6470a.k) / 2);
            i2 = (i2 + this.f6484o) - (((int) this.f6470a.k) / 2);
            if (this.f6470a.a.f2345y < ((float) i3)) {
                this.f6470a.a.f2345y = (float) i3;
            } else if (this.f6470a.a.f2345y > ((float) i2)) {
                this.f6470a.a.f2345y = (float) i2;
            }
        }
        this.f6470a.mo429a();
        this.f6472c = (int) (this.f6470a.a.f2344x - (this.f6470a.j / 2.0f));
        this.f6473d = (int) (this.f6470a.a.f2344x + (this.f6470a.j / 2.0f));
        this.f6474e = (int) (this.f6470a.a.f2345y - (this.f6470a.k / 2.0f));
        this.f6475f = (int) (this.f6470a.a.f2345y + (this.f6470a.k / 2.0f));
        for (Entry key : this.f6482m.entrySet()) {
            ((CameraControllerListener) key.getKey()).mo1799a(this);
        }
    }

    /* renamed from: a */
    public final void m7415a(double d) {
        this.f6471b = d;
        if (this.f6471b < this.f6476g) {
            this.f6471b = this.f6476g;
        } else if (this.f6471b > this.f6477h) {
            this.f6471b = this.f6477h;
        }
        m7414a();
    }

    /* renamed from: a */
    public final boolean mo330a(char c) {
        return false;
    }

    /* renamed from: a */
    public final boolean mo331a(int i) {
        return false;
    }

    /* renamed from: a */
    public final boolean mo332a(int i, int i2) {
        this.f6485p = i;
        this.f6486q = i2;
        return false;
    }

    /* renamed from: a */
    public boolean mo333a(int i, int i2, int i3) {
        CameraControllerTouch cameraControllerTouch;
        if (this.f6487r.size() != 0) {
            if (this.f6487r.size() == 1) {
                cameraControllerTouch = (CameraControllerTouch) this.f6487r.get(Integer.valueOf(i3));
                if (!(cameraControllerTouch == null || cameraControllerTouch.f6467k)) {
                    int i4 = i - cameraControllerTouch.f6459c;
                    int i5 = i2 - cameraControllerTouch.f6460d;
                    this.f6470a.a.m1709a(((-((float) i4)) * ((float) this.f6471b)) + cameraControllerTouch.f6463g, (((float) i5) * ((float) this.f6471b)) + cameraControllerTouch.f6464h, this.f6470a.a.f2346z);
                    m7414a();
                    if (Math.abs(i4) > 20 || Math.abs(i5) > 20) {
                        cameraControllerTouch.f6468l = true;
                    }
                }
            } else if (this.f6487r.size() == 2) {
                Iterator it = this.f6487r.entrySet().iterator();
                cameraControllerTouch = (CameraControllerTouch) ((Entry) it.next()).getValue();
                CameraControllerTouch cameraControllerTouch2 = (CameraControllerTouch) ((Entry) it.next()).getValue();
                double b = ((double) new Vector2((float) cameraControllerTouch.f6457a, (float) cameraControllerTouch.f6458b).m1703b((float) cameraControllerTouch2.f6457a, (float) cameraControllerTouch2.f6458b)) / ((double) new Vector2((float) cameraControllerTouch.f6461e, (float) cameraControllerTouch.f6462f).m1703b((float) cameraControllerTouch2.f6461e, (float) cameraControllerTouch2.f6462f));
                if (cameraControllerTouch.f6467k) {
                    double d = cameraControllerTouch.f6465i;
                    Vector2 d2 = m7413d((cameraControllerTouch.f6457a + cameraControllerTouch2.f6457a) / 2, (cameraControllerTouch.f6458b + cameraControllerTouch2.f6458b) / 2);
                    float f = d2.f2337x / this.f6470a.j;
                    float f2 = d2.f2338y / this.f6470a.k;
                    m7415a(cameraControllerTouch.f6465i / b);
                    if (this.f6471b != d) {
                        m7412a((int) cameraControllerTouch.f6466j.f2337x, (int) cameraControllerTouch.f6466j.f2338y, f, f2);
                    }
                } else {
                    Vector2 c = m7424c((int) ((float) ((cameraControllerTouch.f6457a + cameraControllerTouch2.f6457a) / 2)), (int) ((float) ((cameraControllerTouch.f6458b + cameraControllerTouch2.f6458b) / 2)));
                    cameraControllerTouch.f6466j = c;
                    cameraControllerTouch2.f6466j = c;
                }
                cameraControllerTouch.f6467k = true;
                cameraControllerTouch2.f6467k = true;
            }
        }
        cameraControllerTouch = (CameraControllerTouch) this.f6487r.get(Integer.valueOf(i3));
        if (cameraControllerTouch != null) {
            cameraControllerTouch.f6457a = i;
            cameraControllerTouch.f6458b = i2;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo334a(int i, int i2, int i3, int i4) {
        CameraControllerTouch cameraControllerTouch = new CameraControllerTouch(this, i, i2, this.f6470a.a.f2344x, this.f6470a.a.f2345y, this.f6471b);
        if (this.f6487r.size() == 1) {
            CameraControllerTouch cameraControllerTouch2 = (CameraControllerTouch) this.f6487r.get(Integer.valueOf(0));
            if (cameraControllerTouch2 != null) {
                cameraControllerTouch2.f6461e = cameraControllerTouch2.f6457a;
                cameraControllerTouch2.f6462f = cameraControllerTouch2.f6458b;
            }
        }
        this.f6487r.put(Integer.valueOf(i3), cameraControllerTouch);
        return false;
    }

    /* renamed from: b */
    public final void m7421b(int i, int i2) {
        this.f6470a.a.m1709a((float) i, (float) i2, this.f6470a.a.f2346z);
        m7414a();
    }

    /* renamed from: b */
    public final boolean mo335b(int i) {
        return false;
    }

    /* renamed from: b */
    public boolean mo336b(int i, int i2, int i3, int i4) {
        if (this.f6487r.get(Integer.valueOf(i3)) != null) {
            CameraControllerTouch cameraControllerTouch = (CameraControllerTouch) this.f6487r.get(Integer.valueOf(i3));
            this.f6487r.remove(Integer.valueOf(i3));
            if (cameraControllerTouch.f6467k || cameraControllerTouch.f6468l) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final Vector2 m7424c(int i, int i2) {
        Vector2 vector2 = new Vector2();
        Vector2 d = m7413d(i, i2);
        float f = (this.f6470a.j / 2.0f) - d.f2337x;
        float f2 = (this.f6470a.k / 2.0f) - d.f2338y;
        vector2.f2337x = this.f6470a.a.f2344x - f;
        vector2.f2338y = this.f6470a.a.f2345y - f2;
        return vector2;
    }

    /* renamed from: c */
    public final boolean mo337c(int i) {
        double d = this.f6471b;
        Vector2 c = m7424c(this.f6485p, this.f6486q);
        Vector2 d2 = m7413d(this.f6485p, this.f6486q);
        float f = d2.f2337x / this.f6470a.j;
        float f2 = d2.f2338y / this.f6470a.k;
        m7415a(i > 0 ? this.f6471b * 2.0d : this.f6471b / 2.0d);
        if (this.f6471b != d) {
            m7412a((int) c.f2337x, (int) c.f2338y, f, f2);
        }
        return false;
    }
}
