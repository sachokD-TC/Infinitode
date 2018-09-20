package com.badlogic.gdx.p010a;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0433d;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.C0453f;
import com.badlogic.gdx.graphics.g2d.C0470i;
import com.badlogic.gdx.graphics.g2d.C0472j;
import com.badlogic.gdx.graphics.g2d.C0480m;
import com.badlogic.gdx.graphics.glutils.C0501p;
import com.badlogic.gdx.graphics.p019a.C0423d;
import com.badlogic.gdx.graphics.p019a.p021b.C0387a;
import com.badlogic.gdx.graphics.p019a.p021b.C0391c;
import com.badlogic.gdx.graphics.p019a.p024d.C0416c;
import com.badlogic.gdx.graphics.p019a.p024d.C0419d;
import com.badlogic.gdx.p010a.p011a.C0238e;
import com.badlogic.gdx.p010a.p011a.C0240a;
import com.badlogic.gdx.p010a.p011a.C0244c;
import com.badlogic.gdx.p010a.p011a.C0247d;
import com.badlogic.gdx.p010a.p011a.C0249f;
import com.badlogic.gdx.p010a.p011a.C0252h;
import com.badlogic.gdx.p010a.p011a.C0255i;
import com.badlogic.gdx.p010a.p011a.C0256j;
import com.badlogic.gdx.p010a.p011a.C0258k;
import com.badlogic.gdx.p010a.p011a.C0260l;
import com.badlogic.gdx.p010a.p011a.C0261m;
import com.badlogic.gdx.p010a.p011a.C0263o;
import com.badlogic.gdx.p010a.p011a.C0266p;
import com.badlogic.gdx.p010a.p011a.p012a.C0239a;
import com.badlogic.gdx.p014b.C0277a;
import com.badlogic.gdx.p014b.C0278b;
import com.badlogic.gdx.scenes.scene2d.ui.C0645h;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0691j;
import com.badlogic.gdx.utils.C0694m;
import com.badlogic.gdx.utils.C0695n;
import com.badlogic.gdx.utils.C0704p;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.C0710q.C0707b;
import com.badlogic.gdx.utils.C0710q.C0708c;
import com.badlogic.gdx.utils.C0712r;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.ag;
import com.badlogic.gdx.utils.p013a.C0674a;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: com.badlogic.gdx.a.e */
public final class C0273e implements Disposable {
    /* renamed from: a */
    final C0710q<Class, C0710q<String, C0274f>> f974a;
    /* renamed from: b */
    final C0710q<String, Class> f975b;
    /* renamed from: c */
    final C0710q<String, C0676a<String>> f976c;
    /* renamed from: d */
    final C0712r<String> f977d;
    /* renamed from: e */
    final C0710q<Class, C0710q<String, C0240a>> f978e;
    /* renamed from: f */
    final C0676a<C0267a> f979f;
    /* renamed from: g */
    final C0674a f980g;
    /* renamed from: h */
    final Stack<C0271d> f981h;
    /* renamed from: i */
    C0268b f982i;
    /* renamed from: j */
    int f983j;
    /* renamed from: k */
    int f984k;
    /* renamed from: l */
    int f985l;
    /* renamed from: m */
    final C0238e f986m;
    /* renamed from: n */
    public C0695n f987n;

    public C0273e() {
        this(new C0239a());
    }

    private C0273e(C0238e c0238e) {
        this(c0238e, (byte) 0);
    }

    private C0273e(C0238e c0238e, byte b) {
        this.f974a = new C0710q();
        this.f975b = new C0710q();
        this.f976c = new C0710q();
        this.f977d = new C0712r();
        this.f978e = new C0710q();
        this.f979f = new C0676a();
        this.f981h = new Stack();
        this.f982i = null;
        this.f983j = 0;
        this.f984k = 0;
        this.f985l = 0;
        this.f987n = new C0695n("AssetManager");
        this.f986m = c0238e;
        m782a(BitmapFont.class, new C0244c(c0238e));
        m782a(C0277a.class, new C0252h(c0238e));
        m782a(Pixmap.class, new C0256j(c0238e));
        m782a(C0278b.class, new C0261m(c0238e));
        m782a(C0480m.class, new C0263o(c0238e));
        m782a(Texture.class, new C0266p(c0238e));
        m782a(C0645h.class, new C0260l(c0238e));
        m782a(C0453f.class, new C0255i(c0238e));
        m782a(C0416c.class, new C0419d(c0238e));
        m782a(C0470i.class, new C0472j(c0238e));
        m782a(C0691j.class, new C0249f(c0238e));
        m783a(C0423d.class, ".g3dj", new C0387a(new C0694m(), c0238e));
        m783a(C0423d.class, ".g3db", new C0387a(new ag(), c0238e));
        m783a(C0423d.class, ".obj", new C0391c(c0238e));
        m782a(C0501p.class, new C0258k(c0238e));
        m782a(C0433d.class, new C0247d(c0238e));
        this.f980g = new C0674a();
    }

    /* renamed from: a */
    private <T> C0240a m780a(Class<T> cls, String str) {
        C0240a c0240a = null;
        C0710q c0710q = (C0710q) this.f978e.m2467a((Object) cls);
        if (c0710q == null || c0710q.f3165a <= 0) {
            return null;
        }
        if (str == null) {
            return (C0240a) c0710q.m2467a((Object) "");
        }
        int i = -1;
        Iterator c = c0710q.mo546c();
        while (c.hasNext()) {
            int i2;
            C0240a c0240a2;
            C0707b c0707b = (C0707b) c.next();
            if (((String) c0707b.f3163a).length() <= i || !str.endsWith((String) c0707b.f3163a)) {
                i2 = i;
                c0240a2 = c0240a;
            } else {
                c0240a2 = (C0240a) c0707b.f3164b;
                i2 = ((String) c0707b.f3163a).length();
            }
            i = i2;
            c0240a = c0240a2;
        }
        return c0240a;
    }

    /* renamed from: a */
    private void m781a(C0267a c0267a) {
        C0240a a = m780a(c0267a.f958b, c0267a.f957a);
        if (a == null) {
            throw new GdxRuntimeException("No loader for type: " + c0267a.f958b.getSimpleName());
        }
        this.f981h.push(new C0271d(this, c0267a, a, this.f980g));
        this.f985l++;
    }

    /* renamed from: a */
    private synchronized <T, P extends C0242c<T>> void m782a(Class<T> cls, C0240a<T, P> c0240a) {
        m783a((Class) cls, null, (C0240a) c0240a);
    }

    /* renamed from: a */
    private synchronized <T, P extends C0242c<T>> void m783a(Class<T> cls, String str, C0240a<T, P> c0240a) {
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        } else if (c0240a == null) {
            throw new IllegalArgumentException("loader cannot be null.");
        } else {
            Object obj;
            this.f987n.m2434a("Loader set: " + cls.getSimpleName() + " -> " + c0240a.getClass().getSimpleName());
            C0710q c0710q = (C0710q) this.f978e.m2467a((Object) cls);
            if (c0710q == null) {
                C0710q c0710q2 = this.f978e;
                c0710q = new C0710q();
                c0710q2.mo542a(cls, c0710q);
            }
            if (str == null) {
                obj = "";
            }
            c0710q.mo542a(obj, c0240a);
        }
    }

    /* renamed from: a */
    private synchronized void m784a(String str, C0267a c0267a) {
        C0676a c0676a = (C0676a) this.f976c.m2467a((Object) str);
        if (c0676a == null) {
            c0676a = new C0676a();
            this.f976c.mo542a(str, c0676a);
        }
        c0676a.m2296a(c0267a.f957a);
        if (m789e(c0267a.f957a)) {
            this.f987n.m2434a("Dependency already loaded: " + c0267a);
            ((C0274f) ((C0710q) this.f974a.m2467a((Class) this.f975b.m2467a(c0267a.f957a))).m2467a(c0267a.f957a)).m802a();
            m790f(c0267a.f957a);
        } else {
            this.f987n.m2435b("Loading dependency: " + c0267a);
            m781a(c0267a);
        }
    }

    /* renamed from: a */
    private void m785a(Throwable th) {
        C0695n c0695n = this.f987n;
        String str = "Error loading asset.";
        if (c0695n.f3110b > 0) {
            Gdx.app.error(c0695n.f3109a, str, th);
        }
        if (this.f981h.isEmpty()) {
            throw new GdxRuntimeException(th);
        }
        C0271d c0271d = (C0271d) this.f981h.pop();
        if (c0271d.f967g && c0271d.f968h != null) {
            Iterator it = c0271d.f968h.iterator();
            while (it.hasNext()) {
                m799b(((C0267a) it.next()).f957a);
            }
        }
        this.f981h.clear();
        if (this.f982i == null) {
            throw new GdxRuntimeException(th);
        }
    }

    /* renamed from: c */
    private synchronized boolean m786c() {
        boolean z;
        if (this.f981h.size() == 0) {
            while (this.f979f.f3001b != 0 && this.f981h.size() == 0) {
                C0267a c0267a = (C0267a) this.f979f.mo527b(0);
                if (m789e(c0267a.f957a)) {
                    this.f987n.m2434a("Already loaded: " + c0267a);
                    ((C0274f) ((C0710q) this.f974a.m2467a((Class) this.f975b.m2467a(c0267a.f957a))).m2467a(c0267a.f957a)).m802a();
                    m790f(c0267a.f957a);
                    if (!(c0267a.f959c == null || c0267a.f959c.f903a == null)) {
                        c0267a.f959c.f903a.mo344a(this, c0267a.f957a);
                    }
                    this.f983j++;
                } else {
                    try {
                        this.f987n.m2435b("Loading: " + c0267a);
                        m781a(c0267a);
                    } catch (Throwable th) {
                        m785a(th);
                        z = this.f979f.f3001b == 0;
                    }
                }
            }
            if (this.f981h.size() == 0) {
                z = true;
            }
        }
        z = m787d() && this.f979f.f3001b == 0 && this.f981h.size() == 0;
        return z;
    }

    /* renamed from: d */
    private boolean m787d() {
        C0271d c0271d = (C0271d) this.f981h.peek();
        try {
            int i = (c0271d.f973m || c0271d.m777a()) ? true : 0;
            if (i == 0) {
                return false;
            }
            if (this.f981h.size() == 1) {
                this.f983j++;
                this.f985l = 0;
            }
            this.f981h.pop();
            if (c0271d.f973m) {
                return true;
            }
            String str = c0271d.f962b.f957a;
            Object obj = c0271d.f962b.f958b;
            Object obj2 = c0271d.f971k;
            this.f975b.mo542a(str, obj);
            C0710q c0710q = (C0710q) this.f974a.m2467a(obj);
            if (c0710q == null) {
                c0710q = new C0710q();
                this.f974a.mo542a(obj, c0710q);
            }
            c0710q.mo542a(str, new C0274f(obj2));
            if (!(c0271d.f962b.f959c == null || c0271d.f962b.f959c.f903a == null)) {
                c0271d.f962b.f959c.f903a.mo344a(this, c0271d.f962b.f957a);
            }
            this.f987n.m2434a("Loaded: " + (((float) (System.nanoTime() - c0271d.f965e)) / 1000000.0f) + "ms " + c0271d.f962b);
            return true;
        } catch (RuntimeException e) {
            c0271d.f973m = true;
            throw e;
        }
    }

    /* renamed from: e */
    private synchronized void m788e() {
        this.f979f.mo530d();
        do {
        } while (!m786c());
        C0704p c0704p = new C0704p();
        while (this.f975b.f3165a > 0) {
            if (c0704p.f3144a != 0) {
                Object[] objArr = c0704p.f3145b;
                int i = c0704p.f3147d + c0704p.f3148e;
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    objArr[i2] = null;
                    i = i2;
                }
                c0704p.f3144a = 0;
                c0704p.f3148e = 0;
            }
            C0708c e = this.f975b.mo548e();
            C0676a c0676a = new C0676a(true, e.c.f3165a);
            while (e.b) {
                c0676a.m2296a(e.next());
            }
            Iterator it = c0676a.iterator();
            while (it.hasNext()) {
                c0704p.m2454a((String) it.next(), 0);
            }
            it = c0676a.iterator();
            while (it.hasNext()) {
                C0676a c0676a2 = (C0676a) this.f976c.m2467a((String) it.next());
                if (c0676a2 != null) {
                    Iterator it2 = c0676a2.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        c0704p.m2454a(str, c0704p.m2455b(str, 0) + 1);
                    }
                }
            }
            Iterator it3 = c0676a.iterator();
            while (it3.hasNext()) {
                str = (String) it3.next();
                if (c0704p.m2455b(str, 0) == 0) {
                    m799b(str);
                }
            }
        }
        this.f974a.mo543a();
        this.f975b.mo543a();
        this.f976c.mo543a();
        this.f983j = 0;
        this.f984k = 0;
        this.f985l = 0;
        this.f979f.mo530d();
        this.f981h.clear();
    }

    /* renamed from: e */
    private synchronized boolean m789e(String str) {
        return str == null ? false : this.f975b.m2474c((Object) str);
    }

    /* renamed from: f */
    private void m790f(String str) {
        C0676a c0676a = (C0676a) this.f976c.m2467a((Object) str);
        if (c0676a != null) {
            Iterator it = c0676a.iterator();
            while (it.hasNext()) {
                Object obj = (String) it.next();
                ((C0274f) ((C0710q) this.f974a.m2467a((Class) this.f975b.m2467a(obj))).m2467a(obj)).m802a();
                m790f(obj);
            }
        }
    }

    /* renamed from: a */
    public final synchronized <T> T m791a(String str) {
        T t;
        Object obj = (Class) this.f975b.m2467a((Object) str);
        if (obj == null) {
            throw new GdxRuntimeException("Asset not loaded: " + str);
        }
        C0710q c0710q = (C0710q) this.f974a.m2467a(obj);
        if (c0710q == null) {
            throw new GdxRuntimeException("Asset not loaded: " + str);
        }
        C0274f c0274f = (C0274f) c0710q.m2467a((Object) str);
        if (c0274f == null) {
            throw new GdxRuntimeException("Asset not loaded: " + str);
        }
        t = c0274f.f988a;
        if (t == null) {
            throw new GdxRuntimeException("Asset not loaded: " + str);
        }
        return t;
    }

    /* renamed from: a */
    public final synchronized <T> T m792a(String str, Class<T> cls) {
        T t;
        C0710q c0710q = (C0710q) this.f974a.m2467a((Object) cls);
        if (c0710q == null) {
            throw new GdxRuntimeException("Asset not loaded: " + str);
        }
        C0274f c0274f = (C0274f) c0710q.m2467a((Object) str);
        if (c0274f == null) {
            throw new GdxRuntimeException("Asset not loaded: " + str);
        }
        t = c0274f.f988a;
        if (t == null) {
            throw new GdxRuntimeException("Asset not loaded: " + str);
        }
        return t;
    }

    /* renamed from: a */
    public final synchronized <T> String m793a(T t) {
        String str;
        Iterator e = this.f974a.mo548e();
        loop0:
        while (e.hasNext()) {
            C0710q c0710q = (C0710q) this.f974a.m2467a((Class) e.next());
            Iterator e2 = c0710q.mo548e();
            while (e2.hasNext()) {
                str = (String) e2.next();
                T t2 = ((C0274f) c0710q.m2467a((Object) str)).f988a;
                if (t2 != t) {
                    if (t.equals(t2)) {
                        break loop0;
                    }
                }
                break loop0;
            }
        }
        str = null;
        return str;
    }

    /* renamed from: a */
    public final void m794a() {
        this.f987n.m2434a("Waiting for loading to complete...");
        while (!m786c()) {
            Thread.yield();
        }
        this.f987n.m2434a("Loading complete.");
    }

    /* renamed from: a */
    public final synchronized void m795a(String str, int i) {
        Object obj = (Class) this.f975b.m2467a((Object) str);
        if (obj == null) {
            throw new GdxRuntimeException("Asset not loaded: " + str);
        }
        ((C0274f) ((C0710q) this.f974a.m2467a(obj)).m2467a((Object) str)).f989b = i;
    }

    /* renamed from: a */
    final synchronized void m796a(String str, C0676a<C0267a> c0676a) {
        C0712r c0712r = this.f977d;
        Iterator it = c0676a.iterator();
        while (it.hasNext()) {
            C0267a c0267a = (C0267a) it.next();
            if (!c0712r.m2490c(c0267a.f957a)) {
                c0712r.m2486a(c0267a.f957a);
                m784a(str, c0267a);
            }
        }
        c0712r.m2484a();
    }

    /* renamed from: a */
    public final synchronized <T> void m797a(String str, Class<T> cls, C0242c<T> c0242c) {
        int i = 0;
        synchronized (this) {
            if (m780a((Class) cls, str) == null) {
                throw new GdxRuntimeException("No loader for type: " + cls.getSimpleName());
            }
            if (this.f979f.f3001b == 0) {
                this.f983j = 0;
                this.f984k = 0;
                this.f985l = 0;
            }
            int i2 = 0;
            while (i2 < this.f979f.f3001b) {
                C0267a c0267a = (C0267a) this.f979f.m2291a(i2);
                if (!c0267a.f957a.equals(str) || c0267a.f958b.equals(cls)) {
                    i2++;
                } else {
                    throw new GdxRuntimeException("Asset with name '" + str + "' already in preload queue, but has different type (expected: " + cls.getSimpleName() + ", found: " + c0267a.f958b.getSimpleName() + ")");
                }
            }
            while (i < this.f981h.size()) {
                c0267a = ((C0271d) this.f981h.get(i)).f962b;
                if (!c0267a.f957a.equals(str) || c0267a.f958b.equals(cls)) {
                    i++;
                } else {
                    throw new GdxRuntimeException("Asset with name '" + str + "' already in task list, but has different type (expected: " + cls.getSimpleName() + ", found: " + c0267a.f958b.getSimpleName() + ")");
                }
            }
            Class cls2 = (Class) this.f975b.m2467a((Object) str);
            if (cls2 == null || cls2.equals(cls)) {
                this.f984k++;
                Object c0267a2 = new C0267a(str, (Class) cls, (C0242c) c0242c);
                this.f979f.m2296a(c0267a2);
                this.f987n.m2434a("Queued: " + c0267a2);
            } else {
                throw new GdxRuntimeException("Asset with name '" + str + "' already loaded, but has different type (expected: " + cls.getSimpleName() + ", found: " + cls2.getSimpleName() + ")");
            }
        }
    }

    /* renamed from: b */
    public final synchronized void dispose() {
        this.f987n.m2434a("Disposing.");
        m788e();
        this.f980g.dispose();
    }

    /* renamed from: b */
    public final synchronized void m799b(String str) {
        int i;
        if (this.f981h.size() > 0) {
            C0271d c0271d = (C0271d) this.f981h.firstElement();
            if (c0271d.f962b.f957a.equals(str)) {
                c0271d.f973m = true;
                this.f987n.m2434a("Unload (from tasks): " + str);
            }
        }
        for (int i2 = 0; i2 < this.f979f.f3001b; i2++) {
            if (((C0267a) this.f979f.m2291a(i2)).f957a.equals(str)) {
                i = i2;
                break;
            }
        }
        i = -1;
        if (i != -1) {
            this.f984k--;
            this.f979f.mo527b(i);
            this.f987n.m2434a("Unload (from queue): " + str);
        } else {
            Object obj = (Class) this.f975b.m2467a((Object) str);
            if (obj == null) {
                throw new GdxRuntimeException("Asset not loaded: " + str);
            }
            C0274f c0274f = (C0274f) ((C0710q) this.f974a.m2467a(obj)).m2467a((Object) str);
            c0274f.f989b--;
            if (c0274f.f989b <= 0) {
                this.f987n.m2434a("Unload (dispose): " + str);
                if (c0274f.f988a instanceof Disposable) {
                    ((Disposable) c0274f.f988a).dispose();
                }
                this.f975b.mo545b((Object) str);
                ((C0710q) this.f974a.m2467a(obj)).mo545b((Object) str);
            } else {
                this.f987n.m2434a("Unload (decrement): " + str);
            }
            C0676a c0676a = (C0676a) this.f976c.m2467a((Object) str);
            if (c0676a != null) {
                Iterator it = c0676a.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (m789e(str2)) {
                        m799b(str2);
                    }
                }
            }
            if (c0274f.f989b <= 0) {
                this.f976c.mo545b((Object) str);
            }
        }
    }

    /* renamed from: c */
    public final synchronized int m800c(String str) {
        Object obj;
        obj = (Class) this.f975b.m2467a((Object) str);
        if (obj == null) {
            throw new GdxRuntimeException("Asset not loaded: " + str);
        }
        return ((C0274f) ((C0710q) this.f974a.m2467a(obj)).m2467a((Object) str)).f989b;
    }

    /* renamed from: d */
    public final synchronized C0676a<String> m801d(String str) {
        return (C0676a) this.f976c.m2467a((Object) str);
    }
}
