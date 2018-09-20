package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0430b;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.C0438n;
import com.badlogic.gdx.graphics.g2d.C0439k;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData;
import com.badlogic.gdx.graphics.g2d.C0452e;
import com.badlogic.gdx.graphics.g2d.C0480m;
import com.badlogic.gdx.graphics.g2d.C0480m.C0475a;
import com.badlogic.gdx.graphics.g2d.C0480m.C0476b;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.scenes.scene2d.utils.C0655f;
import com.badlogic.gdx.scenes.scene2d.utils.C0656b;
import com.badlogic.gdx.scenes.scene2d.utils.C0660h;
import com.badlogic.gdx.scenes.scene2d.utils.C0662j;
import com.badlogic.gdx.scenes.scene2d.utils.C0663k;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.C0636l;
import com.badlogic.gdx.utils.C0636l.C0639b;
import com.badlogic.gdx.utils.C0676a;
import com.badlogic.gdx.utils.C0710q;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.SerializationException;
import com.badlogic.gdx.utils.reflect.C0713a;
import java.util.Iterator;

/* renamed from: com.badlogic.gdx.scenes.scene2d.ui.h */
public class C0645h implements Disposable {
    /* renamed from: a */
    C0710q<Class, C0710q<String, Object>> f2907a = new C0710q();
    /* renamed from: b */
    C0480m f2908b;

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.h$1 */
    class C06371 extends C0636l {
        /* renamed from: a */
        final /* synthetic */ C0645h f2899a;

        public C06371(C0645h c0645h) {
            this.f2899a = c0645h;
        }

        /* renamed from: a */
        public final <T> T mo511a(Class<T> cls, Class cls2, JsonValue jsonValue) {
            return (!jsonValue.m2277l() || CharSequence.class.isAssignableFrom(cls)) ? super.mo511a((Class) cls, cls2, jsonValue) : this.f2899a.m2191a(jsonValue.m2260a(), cls);
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.h$2 */
    class C06402 extends C0639b<C0645h> {
        /* renamed from: a */
        final /* synthetic */ C0645h f2900a;
        /* renamed from: b */
        final /* synthetic */ C0645h f2901b;

        public C06402(C0645h c0645h, C0645h c0645h2) {
            this.f2901b = c0645h;
            this.f2900a = c0645h2;
        }

        /* renamed from: b */
        private C0645h m2182b(C0636l c0636l, JsonValue jsonValue) {
            JsonValue jsonValue2 = jsonValue.f2957f;
            while (jsonValue2 != null) {
                Class a;
                JsonValue jsonValue3;
                try {
                    a = C0713a.m2493a(jsonValue2.f2956e);
                    Class cls = a == C0644a.class ? C0655f.class : a;
                    jsonValue3 = jsonValue2.f2957f;
                    while (jsonValue3 != null) {
                        Object a2 = c0636l.mo511a(a, null, jsonValue3);
                        if (a2 != null) {
                            this.f2901b.m2193a(jsonValue3.f2956e, a2, cls);
                            if (cls != C0655f.class && C0655f.class.isAssignableFrom(cls)) {
                                this.f2901b.m2193a(jsonValue3.f2956e, a2, C0655f.class);
                            }
                        }
                        jsonValue3 = jsonValue3.f2958g;
                    }
                    jsonValue2 = jsonValue2.f2958g;
                } catch (Throwable e) {
                    throw new SerializationException("Error reading " + a.getSimpleName() + ": " + jsonValue3.f2956e, e);
                } catch (Throwable e2) {
                    throw new SerializationException(e2);
                }
            }
            return this.f2900a;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo512a(C0636l c0636l, JsonValue jsonValue) {
            return m2182b(c0636l, jsonValue);
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.h$3 */
    class C06413 extends C0639b<BitmapFont> {
        /* renamed from: a */
        final /* synthetic */ C0316a f2902a;
        /* renamed from: b */
        final /* synthetic */ C0645h f2903b;
        /* renamed from: c */
        final /* synthetic */ C0645h f2904c;

        public C06413(C0645h c0645h, C0316a c0316a, C0645h c0645h2) {
            this.f2904c = c0645h;
            this.f2902a = c0316a;
            this.f2903b = c0645h2;
        }

        /* renamed from: b */
        private BitmapFont m2184b(C0636l c0636l, JsonValue jsonValue) {
            String str = (String) c0636l.m2176a("file", String.class, jsonValue);
            int intValue = ((Integer) c0636l.m2178a("scaledSize", Integer.TYPE, Integer.valueOf(-1), jsonValue)).intValue();
            Boolean bool = (Boolean) c0636l.m2178a("flip", Boolean.class, Boolean.valueOf(false), jsonValue);
            Boolean bool2 = (Boolean) c0636l.m2178a("markupEnabled", Boolean.class, Boolean.valueOf(false), jsonValue);
            C0316a a = this.f2902a.mo265a().mo266a(str);
            if (!a.mo270d()) {
                a = Gdx.files.mo277b(str);
            }
            if (a.mo270d()) {
                String i = a.m897i();
                try {
                    BitmapFont bitmapFont;
                    C0676a b = this.f2903b.m2194b(i);
                    if (b != null) {
                        bitmapFont = new BitmapFont(new BitmapFontData(a, bool.booleanValue()), b);
                    } else {
                        C0438n c0438n = (C0438n) this.f2903b.m2195b(i, C0438n.class);
                        if (c0438n != null) {
                            bitmapFont = new BitmapFont(a, c0438n, bool.booleanValue());
                        } else {
                            C0316a a2 = a.mo265a().mo266a(i + ".png");
                            bitmapFont = a2.mo270d() ? new BitmapFont(a, a2, bool.booleanValue()) : new BitmapFont(a, bool.booleanValue());
                        }
                    }
                    bitmapFont.f1821a.f1798p = bool2.booleanValue();
                    if (intValue != -1) {
                        float f = ((float) intValue) / bitmapFont.f1821a.f1791i;
                        bitmapFont.f1821a.m1324a(f, f);
                    }
                    return bitmapFont;
                } catch (Throwable e) {
                    throw new SerializationException("Error loading bitmap font: " + a, e);
                }
            }
            throw new SerializationException("Font file not found: " + a);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo512a(C0636l c0636l, JsonValue jsonValue) {
            return m2184b(c0636l, jsonValue);
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.h$4 */
    class C06424 extends C0639b<C0430b> {
        /* renamed from: a */
        final /* synthetic */ C0645h f2905a;

        public C06424(C0645h c0645h) {
            this.f2905a = c0645h;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo512a(C0636l c0636l, JsonValue jsonValue) {
            if (jsonValue.m2277l()) {
                return (C0430b) this.f2905a.m2191a(jsonValue.m2260a(), C0430b.class);
            }
            String str = (String) c0636l.m2178a("hex", String.class, null, jsonValue);
            return str != null ? C0430b.m1210a(str) : new C0430b(((Float) c0636l.m2178a("r", Float.TYPE, Float.valueOf(0.0f), jsonValue)).floatValue(), ((Float) c0636l.m2178a("g", Float.TYPE, Float.valueOf(0.0f), jsonValue)).floatValue(), ((Float) c0636l.m2178a("b", Float.TYPE, Float.valueOf(0.0f), jsonValue)).floatValue(), ((Float) c0636l.m2178a("a", Float.TYPE, Float.valueOf(1.0f), jsonValue)).floatValue());
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.h$5 */
    class C06435 extends C0639b {
        /* renamed from: a */
        final /* synthetic */ C0645h f2906a;

        public C06435(C0645h c0645h) {
            this.f2906a = c0645h;
        }

        /* renamed from: a */
        public final Object mo512a(C0636l c0636l, JsonValue jsonValue) {
            Object obj;
            String str = (String) c0636l.m2176a("name", String.class, jsonValue);
            C0430b c0430b = (C0430b) c0636l.m2176a("color", C0430b.class, jsonValue);
            C0655f c = this.f2906a.m2197c(str);
            C0439k c0476b;
            C0656b c0662j;
            if (c instanceof C0663k) {
                C0663k c0663k = (C0663k) c;
                c0476b = c0663k.f2934h instanceof C0475a ? new C0476b((C0475a) c0663k.f2934h) : new C0439k(c0663k.f2934h);
                c0476b.m1255a(c0430b);
                c0476b.mo381a(c0663k.f2927f, c0663k.f2928g);
                c0662j = new C0662j(c0476b);
                c0662j.f2923b = c0663k.f2923b;
                c0662j.f2924c = c0663k.f2924c;
                c0662j.f2925d = c0663k.f2925d;
                c0662j.f2926e = c0663k.f2926e;
                obj = c0662j;
            } else if (c instanceof C0660h) {
                obj = new C0660h((C0660h) c);
                obj.m2230a(new C0452e(obj.f2929h, c0430b));
            } else if (c instanceof C0662j) {
                C0662j c0662j2 = (C0662j) c;
                c0476b = c0662j2.f2933h instanceof C0476b ? new C0476b((C0476b) c0662j2.f2933h) : new C0439k(c0662j2.f2933h);
                c0476b.m1255a(c0430b);
                c0476b.mo381a(c0662j2.f2927f, c0662j2.f2928g);
                c0662j = new C0662j(c0476b);
                c0662j.f2923b = c0662j2.f2923b;
                c0662j.f2924c = c0662j2.f2924c;
                c0662j.f2925d = c0662j2.f2925d;
                c0662j.f2926e = c0662j2.f2926e;
                C0656b c0656b = c0662j;
            } else {
                throw new GdxRuntimeException("Unable to copy, unknown drawable type: " + c.getClass());
            }
            C0656b c0656b2 = (C0656b) obj;
            if (c instanceof C0656b) {
                c0656b2.f2922a = ((C0656b) c).f2922a + " (" + c0430b + ")";
            } else {
                c0656b2.f2922a = " (" + c0430b + ")";
            }
            ((C0656b) obj).f2922a = jsonValue.f2956e + " (" + str + ", " + c0430b + ")";
            return obj;
        }
    }

    /* renamed from: com.badlogic.gdx.scenes.scene2d.ui.h$a */
    public static class C0644a {
    }

    public C0645h(C0480m c0480m) {
        this.f2908b = c0480m;
        m2192a(c0480m);
    }

    /* renamed from: d */
    private C0452e m2188d(String str) {
        C0452e c0452e = (C0452e) m2195b(str, C0452e.class);
        if (c0452e == null) {
            try {
                C0438n a = m2190a(str);
                if (a instanceof C0475a) {
                    int[] iArr = ((C0475a) a).f2052j;
                    if (iArr != null) {
                        c0452e = new C0452e(a, iArr[0], iArr[1], iArr[2], iArr[3]);
                        int[] iArr2 = ((C0475a) a).f2053k;
                        if (iArr2 != null) {
                            float f = (float) iArr2[0];
                            float f2 = (float) iArr2[1];
                            float f3 = (float) iArr2[2];
                            float f4 = (float) iArr2[3];
                            c0452e.f1862j = f;
                            c0452e.f1863k = f2;
                            c0452e.f1864l = f3;
                            c0452e.f1865m = f4;
                        }
                    }
                }
                if (c0452e == null) {
                    c0452e = new C0452e(a);
                }
                m2193a(str, c0452e, C0452e.class);
            } catch (GdxRuntimeException e) {
                throw new GdxRuntimeException("No NinePatch, TextureRegion, or Texture registered with name: " + str);
            }
        }
        return c0452e;
    }

    /* renamed from: e */
    private C0439k m2189e(String str) {
        C0439k c0439k = (C0439k) m2195b(str, C0439k.class);
        if (c0439k == null) {
            try {
                C0438n a = m2190a(str);
                if (a instanceof C0475a) {
                    C0475a c0475a = (C0475a) a;
                    if (!(!c0475a.f2051i && c0475a.f2047e == c0475a.f2049g && c0475a.f2048f == c0475a.f2050h)) {
                        c0439k = new C0476b(c0475a);
                    }
                }
                if (c0439k == null) {
                    c0439k = new C0439k(a);
                }
                m2193a(str, c0439k, C0439k.class);
            } catch (GdxRuntimeException e) {
                throw new GdxRuntimeException("No NinePatch, TextureRegion, or Texture registered with name: " + str);
            }
        }
        return c0439k;
    }

    /* renamed from: a */
    public final C0438n m2190a(String str) {
        C0438n c0438n = (C0438n) m2195b(str, C0438n.class);
        if (c0438n != null) {
            return c0438n;
        }
        Texture texture = (Texture) m2195b(str, Texture.class);
        if (texture == null) {
            throw new GdxRuntimeException("No TextureRegion or Texture registered with name: " + str);
        }
        C0438n c0438n2 = new C0438n(texture);
        m2193a(str, c0438n2, C0438n.class);
        return c0438n2;
    }

    /* renamed from: a */
    public final <T> T m2191a(String str, Class<T> cls) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        } else if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        } else if (cls == C0655f.class) {
            return m2197c(str);
        } else {
            if (cls == C0438n.class) {
                return m2190a(str);
            }
            if (cls == C0452e.class) {
                return m2188d(str);
            }
            if (cls == C0439k.class) {
                return m2189e(str);
            }
            C0710q c0710q = (C0710q) this.f2907a.m2467a((Object) cls);
            if (c0710q == null) {
                throw new GdxRuntimeException("No " + cls.getName() + " registered with name: " + str);
            }
            T a = c0710q.m2467a((Object) str);
            if (a != null) {
                return a;
            }
            throw new GdxRuntimeException("No " + cls.getName() + " registered with name: " + str);
        }
    }

    /* renamed from: a */
    public final void m2192a(C0480m c0480m) {
        C0676a c0676a = c0480m.f2087c;
        int i = c0676a.f3001b;
        for (int i2 = 0; i2 < i; i2++) {
            C0475a c0475a = (C0475a) c0676a.m2291a(i2);
            String str = c0475a.f2044b;
            if (c0475a.f2043a != -1) {
                str = str + "_" + c0475a.f2043a;
            }
            m2193a(str, c0475a, C0438n.class);
        }
    }

    /* renamed from: a */
    public final void m2193a(String str, Object obj, Class cls) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        } else if (obj == null) {
            throw new IllegalArgumentException("resource cannot be null.");
        } else {
            C0710q c0710q = (C0710q) this.f2907a.m2467a((Object) cls);
            if (c0710q == null) {
                int i = (cls == C0438n.class || cls == C0655f.class || cls == C0439k.class) ? 256 : 64;
                C0710q c0710q2 = new C0710q(i);
                this.f2907a.mo542a(cls, c0710q2);
                c0710q = c0710q2;
            }
            c0710q.mo542a(str, obj);
        }
    }

    /* renamed from: b */
    public final C0676a<C0438n> m2194b(String str) {
        int i = 1;
        Object obj = (C0438n) m2195b(str + "_" + 0, C0438n.class);
        if (obj == null) {
            return null;
        }
        C0676a<C0438n> c0676a = new C0676a();
        while (obj != null) {
            c0676a.m2296a(obj);
            C0438n c0438n = (C0438n) m2195b(str + "_" + i, C0438n.class);
            i++;
        }
        return c0676a;
    }

    /* renamed from: b */
    public final <T> T m2195b(String str, Class<T> cls) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        C0710q c0710q = (C0710q) this.f2907a.m2467a((Object) cls);
        return c0710q == null ? null : c0710q.m2467a((Object) str);
    }

    /* renamed from: b */
    public final void dispose() {
        if (this.f2908b != null) {
            this.f2908b.dispose();
        }
        Iterator d = this.f2907a.mo547d();
        while (d.hasNext()) {
            Iterator d2 = ((C0710q) d.next()).mo547d();
            while (d2.hasNext()) {
                Object next = d2.next();
                if (next instanceof Disposable) {
                    ((Disposable) next).dispose();
                }
            }
        }
    }

    /* renamed from: c */
    public final C0655f m2197c(String str) {
        C0655f c0655f;
        C0655f c0655f2 = (C0655f) m2195b(str, C0655f.class);
        if (c0655f2 != null) {
            return c0655f2;
        }
        C0452e c0452e;
        C0439k c0439k;
        try {
            C0656b c0660h;
            C0663k c0663k;
            C0656b c0656b;
            C0438n a = m2190a(str);
            if (a instanceof C0475a) {
                C0475a c0475a = (C0475a) a;
                if (c0475a.f2052j != null) {
                    c0660h = new C0660h(m2188d(str));
                } else if (!(!c0475a.f2051i && c0475a.f2047e == c0475a.f2049g && c0475a.f2048f == c0475a.f2050h)) {
                    c0660h = new C0662j(m2189e(str));
                }
                if (c0660h != null) {
                    try {
                        c0663k = new C0663k(a);
                    } catch (GdxRuntimeException e) {
                        Object obj = c0660h;
                        c0655f = c0655f2;
                        if (c0655f == null) {
                            c0452e = (C0452e) m2195b(str, C0452e.class);
                            if (c0452e == null) {
                                c0439k = (C0439k) m2195b(str, C0439k.class);
                                if (c0439k == null) {
                                    throw new GdxRuntimeException("No Drawable, NinePatch, TextureRegion, Texture, or Sprite registered with name: " + str);
                                }
                                c0655f = new C0662j(c0439k);
                            } else {
                                c0655f = new C0660h(c0452e);
                            }
                        }
                        if (c0655f instanceof C0656b) {
                            ((C0656b) c0655f).f2922a = str;
                        }
                        m2193a(str, c0655f, C0655f.class);
                        return c0655f;
                    }
                }
                c0656b = c0660h;
                c0655f = c0663k;
                if (c0655f == null) {
                    c0452e = (C0452e) m2195b(str, C0452e.class);
                    if (c0452e == null) {
                        c0655f = new C0660h(c0452e);
                    } else {
                        c0439k = (C0439k) m2195b(str, C0439k.class);
                        if (c0439k == null) {
                            c0655f = new C0662j(c0439k);
                        } else {
                            throw new GdxRuntimeException("No Drawable, NinePatch, TextureRegion, Texture, or Sprite registered with name: " + str);
                        }
                    }
                }
                if (c0655f instanceof C0656b) {
                    ((C0656b) c0655f).f2922a = str;
                }
                m2193a(str, c0655f, C0655f.class);
                return c0655f;
            }
            c0655f = c0655f2;
            if (c0660h != null) {
                c0656b = c0660h;
            } else {
                c0663k = new C0663k(a);
            }
            c0655f = c0663k;
        } catch (GdxRuntimeException e2) {
            c0655f = c0655f2;
            if (c0655f == null) {
                c0452e = (C0452e) m2195b(str, C0452e.class);
                if (c0452e == null) {
                    c0655f = new C0660h(c0452e);
                } else {
                    c0439k = (C0439k) m2195b(str, C0439k.class);
                    if (c0439k == null) {
                        c0655f = new C0662j(c0439k);
                    } else {
                        throw new GdxRuntimeException("No Drawable, NinePatch, TextureRegion, Texture, or Sprite registered with name: " + str);
                    }
                }
            }
            if (c0655f instanceof C0656b) {
                ((C0656b) c0655f).f2922a = str;
            }
            m2193a(str, c0655f, C0655f.class);
            return c0655f;
        }
        if (c0655f == null) {
            c0452e = (C0452e) m2195b(str, C0452e.class);
            if (c0452e == null) {
                c0439k = (C0439k) m2195b(str, C0439k.class);
                if (c0439k == null) {
                    throw new GdxRuntimeException("No Drawable, NinePatch, TextureRegion, Texture, or Sprite registered with name: " + str);
                }
                c0655f = new C0662j(c0439k);
            } else {
                c0655f = new C0660h(c0452e);
            }
        }
        if (c0655f instanceof C0656b) {
            ((C0656b) c0655f).f2922a = str;
        }
        m2193a(str, c0655f, C0655f.class);
        return c0655f;
    }
}
