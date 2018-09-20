package com.badlogic.gdx.utils;

import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.JsonWriter.OutputType;
import com.badlogic.gdx.utils.reflect.C0713a;
import com.badlogic.gdx.utils.reflect.C0714b;
import com.badlogic.gdx.utils.reflect.C0715c;
import com.badlogic.gdx.utils.reflect.ReflectionException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.badlogic.gdx.utils.l */
public class C0636l {
    /* renamed from: a */
    private boolean f2884a;
    /* renamed from: b */
    public String f2885b = "class";
    /* renamed from: c */
    public boolean f2886c = true;
    /* renamed from: d */
    public OutputType f2887d = OutputType.minimal;
    /* renamed from: e */
    private boolean f2888e;
    /* renamed from: f */
    private boolean f2889f;
    /* renamed from: g */
    private boolean f2890g = true;
    /* renamed from: h */
    private C0638d f2891h;
    /* renamed from: i */
    private final C0710q<Class, C0720s<String, C0693a>> f2892i = new C0710q();
    /* renamed from: j */
    private final C0710q<String, Class> f2893j = new C0710q();
    /* renamed from: k */
    private final C0710q<Class, String> f2894k = new C0710q();
    /* renamed from: l */
    private final C0710q<Class, C0638d> f2895l = new C0710q();
    /* renamed from: m */
    private final C0710q<Class, Object[]> f2896m = new C0710q();
    /* renamed from: n */
    private final Object[] f2897n = new Object[]{null};
    /* renamed from: o */
    private final Object[] f2898o = new Object[]{null};

    /* renamed from: com.badlogic.gdx.utils.l$c */
    public interface C0411c {
        /* renamed from: a */
        void mo350a(C0636l c0636l, JsonValue jsonValue);
    }

    /* renamed from: com.badlogic.gdx.utils.l$d */
    public interface C0638d<T> {
        /* renamed from: a */
        T mo512a(C0636l c0636l, JsonValue jsonValue);
    }

    /* renamed from: com.badlogic.gdx.utils.l$b */
    public static abstract class C0639b<T> implements C0638d<T> {
    }

    /* renamed from: com.badlogic.gdx.utils.l$a */
    private static class C0693a {
        /* renamed from: a */
        C0715c f3093a;
        /* renamed from: b */
        Class f3094b;

        public C0693a(C0715c c0715c) {
            Class cls;
            this.f3093a = c0715c;
            int i = (C0710q.class.isAssignableFrom(c0715c.f3200a.getType()) || Map.class.isAssignableFrom(c0715c.f3200a.getType())) ? 1 : 0;
            Type genericType = c0715c.f3200a.getGenericType();
            if (genericType instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
                if (actualTypeArguments.length - 1 >= i) {
                    genericType = actualTypeArguments[i];
                    if (genericType instanceof Class) {
                        cls = (Class) genericType;
                    } else if (genericType instanceof ParameterizedType) {
                        cls = (Class) ((ParameterizedType) genericType).getRawType();
                    } else if (genericType instanceof GenericArrayType) {
                        genericType = ((GenericArrayType) genericType).getGenericComponentType();
                        if (genericType instanceof Class) {
                            cls = Array.newInstance((Class) genericType, 0).getClass();
                        }
                    }
                    this.f3094b = cls;
                }
            }
            cls = null;
            this.f3094b = cls;
        }
    }

    /* renamed from: a */
    private C0720s<String, C0693a> m2171a(Class cls) {
        C0720s<String, C0693a> c0720s = (C0720s) this.f2892i.m2467a((Object) cls);
        if (c0720s != null) {
            return c0720s;
        }
        C0676a c0676a = new C0676a();
        for (Object obj = cls; obj != Object.class; obj = obj.getSuperclass()) {
            c0676a.m2296a(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = c0676a.f3001b - 1; i >= 0; i--) {
            Collections.addAll(arrayList, C0713a.m2496c((Class) c0676a.m2291a(i)));
        }
        C0720s<String, C0693a> c0720s2 = new C0720s(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0715c c0715c = (C0715c) arrayList.get(i2);
            if (!(Modifier.isTransient(c0715c.f3200a.getModifiers()) || Modifier.isStatic(c0715c.f3200a.getModifiers()) || c0715c.f3200a.isSynthetic())) {
                if (!c0715c.f3200a.isAccessible()) {
                    try {
                        c0715c.f3200a.setAccessible(true);
                    } catch (AccessControlException e) {
                    }
                }
                if (this.f2888e && !this.f2889f) {
                    if (c0715c.f3200a.isAnnotationPresent(Deprecated.class)) {
                    }
                }
                c0720s2.mo542a(c0715c.f3200a.getName(), new C0693a(c0715c));
            }
        }
        this.f2892i.mo542a(cls, c0720s2);
        return c0720s2;
    }

    /* renamed from: a */
    private void m2172a(Object obj, JsonValue jsonValue) {
        SerializationException e;
        Class cls = obj.getClass();
        C0710q a = m2171a(cls);
        for (JsonValue jsonValue2 = jsonValue.f2957f; jsonValue2 != null; jsonValue2 = jsonValue2.f2958g) {
            C0693a c0693a = (C0693a) a.m2467a(jsonValue2.f2956e.replace(" ", "_"));
            if (c0693a != null) {
                C0715c c0715c = c0693a.f3093a;
                try {
                    c0715c.f3200a.set(obj, mo511a(c0715c.f3200a.getType(), c0693a.f3094b, jsonValue2));
                } catch (Throwable e2) {
                    throw new ReflectionException("Argument not valid for field: " + c0715c.f3200a.getName(), e2);
                } catch (Throwable e22) {
                    throw new ReflectionException("Illegal access to field: " + c0715c.f3200a.getName(), e22);
                } catch (Throwable e222) {
                    throw new SerializationException("Error accessing field: " + c0715c.f3200a.getName() + " (" + cls.getName() + ")", e222);
                } catch (SerializationException e3) {
                    e3.m2283a(c0715c.f3200a.getName() + " (" + cls.getName() + ")");
                    throw e3;
                } catch (Throwable e2222) {
                    SerializationException serializationException = new SerializationException(e2222);
                    serializationException.m2283a(jsonValue2.m2281p());
                    serializationException.m2283a(c0715c.f3200a.getName() + " (" + cls.getName() + ")");
                    throw serializationException;
                }
            } else if (!(jsonValue2.f2956e.equals(this.f2885b) || this.f2884a)) {
                e3 = new SerializationException("Field not found: " + jsonValue2.f2956e + " (" + cls.getName() + ")");
                e3.m2283a(jsonValue2.m2281p());
                throw e3;
            }
        }
    }

    /* renamed from: b */
    private static Object m2173b(Class cls) {
        try {
            return C0713a.m2494a(cls);
        } catch (Exception e) {
            Throwable e2 = e;
            try {
                C0714b a = C0713a.m2491a(cls, new Class[0]);
                a.m2498a();
                return a.m2497a(new Object[0]);
            } catch (SecurityException e3) {
                throw new SerializationException("Error constructing instance of class: " + cls.getName(), e2);
            } catch (ReflectionException e4) {
                if (Enum.class.isAssignableFrom(cls)) {
                    if (cls.getEnumConstants() == null) {
                        cls = cls.getSuperclass();
                    }
                    return cls.getEnumConstants()[0];
                } else if (cls.isArray()) {
                    throw new SerializationException("Encountered JSON object when expected array of type: " + cls.getName(), e2);
                } else if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
                    throw new SerializationException("Class cannot be created (missing no-arg constructor): " + cls.getName(), e2);
                } else {
                    throw new SerializationException("Class cannot be created (non-static member class): " + cls.getName(), e2);
                }
            } catch (Exception e5) {
                e2 = e5;
                throw new SerializationException("Error constructing instance of class: " + cls.getName(), e2);
            }
        }
    }

    /* renamed from: a */
    public final <T> T m2174a(Class<T> cls, C0316a c0316a) {
        try {
            return mo511a((Class) cls, null, new C0694m().mo521a(c0316a));
        } catch (Throwable e) {
            throw new SerializationException("Error reading file: " + c0316a, e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public <T> T mo511a(Class<T> r11, Class r12, JsonValue r13) {
        /*
        r10 = this;
        r5 = 0;
        r3 = 0;
        if (r13 != 0) goto L_0x0006;
    L_0x0004:
        r1 = r3;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = r13.m2276k();
        if (r0 == 0) goto L_0x0121;
    L_0x000c:
        r0 = r10.f2885b;
        if (r0 != 0) goto L_0x002e;
    L_0x0010:
        r1 = r3;
    L_0x0011:
        if (r1 == 0) goto L_0x03ff;
    L_0x0013:
        r0 = r10.f2893j;
        r0 = r0.m2467a(r1);
        r0 = (java.lang.Class) r0;
        if (r0 != 0) goto L_0x03fc;
    L_0x001d:
        r1 = com.badlogic.gdx.utils.reflect.C0713a.m2493a(r1);	 Catch:{ ReflectionException -> 0x0036 }
    L_0x0021:
        if (r1 != 0) goto L_0x003f;
    L_0x0023:
        r0 = r10.f2891h;
        if (r0 == 0) goto L_0x003d;
    L_0x0027:
        r0 = r10.f2891h;
        r1 = r0.mo512a(r10, r13);
        goto L_0x0005;
    L_0x002e:
        r0 = r10.f2885b;
        r0 = r13.m2261a(r0, r3);
        r1 = r0;
        goto L_0x0011;
    L_0x0036:
        r0 = move-exception;
        r1 = new com.badlogic.gdx.utils.SerializationException;
        r1.<init>(r0);
        throw r1;
    L_0x003d:
        r1 = r13;
        goto L_0x0005;
    L_0x003f:
        r0 = r10.f2885b;
        if (r0 == 0) goto L_0x007c;
    L_0x0043:
        r0 = java.util.Collection.class;
        r0 = r0.isAssignableFrom(r1);
        if (r0 == 0) goto L_0x007c;
    L_0x004b:
        r0 = "items";
        r2 = r13.m2259a(r0);
        if (r2 != 0) goto L_0x0123;
    L_0x0053:
        r0 = new com.badlogic.gdx.utils.SerializationException;
        r3 = new java.lang.StringBuilder;
        r4 = "Unable to convert object to collection: ";
        r3.<init>(r4);
        r2 = r3.append(r2);
        r3 = " (";
        r2 = r2.append(r3);
        r1 = r1.getName();
        r1 = r2.append(r1);
        r2 = ")";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x007c:
        r0 = r10.f2895l;
        r0 = r0.m2467a(r1);
        r0 = (com.badlogic.gdx.utils.C0636l.C0638d) r0;
        if (r0 == 0) goto L_0x008c;
    L_0x0086:
        r1 = r0.mo512a(r10, r13);
        goto L_0x0005;
    L_0x008c:
        r0 = java.lang.String.class;
        if (r1 == r0) goto L_0x00b8;
    L_0x0090:
        r0 = java.lang.Integer.class;
        if (r1 == r0) goto L_0x00b8;
    L_0x0094:
        r0 = java.lang.Boolean.class;
        if (r1 == r0) goto L_0x00b8;
    L_0x0098:
        r0 = java.lang.Float.class;
        if (r1 == r0) goto L_0x00b8;
    L_0x009c:
        r0 = java.lang.Long.class;
        if (r1 == r0) goto L_0x00b8;
    L_0x00a0:
        r0 = java.lang.Double.class;
        if (r1 == r0) goto L_0x00b8;
    L_0x00a4:
        r0 = java.lang.Short.class;
        if (r1 == r0) goto L_0x00b8;
    L_0x00a8:
        r0 = java.lang.Byte.class;
        if (r1 == r0) goto L_0x00b8;
    L_0x00ac:
        r0 = java.lang.Character.class;
        if (r1 == r0) goto L_0x00b8;
    L_0x00b0:
        r0 = java.lang.Enum.class;
        r0 = r0.isAssignableFrom(r1);
        if (r0 == 0) goto L_0x00c0;
    L_0x00b8:
        r0 = "value";
        r1 = r10.m2176a(r0, r1, r13);
        goto L_0x0005;
    L_0x00c0:
        r1 = com.badlogic.gdx.utils.C0636l.m2173b(r1);
        r0 = r1 instanceof com.badlogic.gdx.utils.C0636l.C0411c;
        if (r0 == 0) goto L_0x00d0;
    L_0x00c8:
        r0 = r1;
        r0 = (com.badlogic.gdx.utils.C0636l.C0411c) r0;
        r0.mo350a(r10, r13);
        goto L_0x0005;
    L_0x00d0:
        r0 = r1 instanceof com.badlogic.gdx.utils.C0710q;
        if (r0 == 0) goto L_0x00e6;
    L_0x00d4:
        r1 = (com.badlogic.gdx.utils.C0710q) r1;
        r0 = r13.f2957f;
    L_0x00d8:
        if (r0 == 0) goto L_0x0005;
    L_0x00da:
        r2 = r0.f2956e;
        r4 = r10.mo511a(r12, r3, r0);
        r1.mo542a(r2, r4);
        r0 = r0.f2958g;
        goto L_0x00d8;
    L_0x00e6:
        r0 = r1 instanceof com.badlogic.gdx.utils.C0685b;
        if (r0 == 0) goto L_0x00fc;
    L_0x00ea:
        r1 = (com.badlogic.gdx.utils.C0685b) r1;
        r0 = r13.f2957f;
    L_0x00ee:
        if (r0 == 0) goto L_0x0005;
    L_0x00f0:
        r2 = r0.f2956e;
        r4 = r10.mo511a(r12, r3, r0);
        r1.m2384a(r2, r4);
        r0 = r0.f2958g;
        goto L_0x00ee;
    L_0x00fc:
        r0 = r1 instanceof java.util.Map;
        if (r0 == 0) goto L_0x011c;
    L_0x0100:
        r1 = (java.util.Map) r1;
        r0 = r13.f2957f;
    L_0x0104:
        if (r0 == 0) goto L_0x0005;
    L_0x0106:
        r2 = r0.f2956e;
        r4 = r10.f2885b;
        r2 = r2.equals(r4);
        if (r2 != 0) goto L_0x0119;
    L_0x0110:
        r2 = r0.f2956e;
        r4 = r10.mo511a(r12, r3, r0);
        r1.put(r2, r4);
    L_0x0119:
        r0 = r0.f2958g;
        goto L_0x0104;
    L_0x011c:
        r10.m2172a(r1, r13);
        goto L_0x0005;
    L_0x0121:
        r2 = r13;
        r1 = r11;
    L_0x0123:
        if (r1 == 0) goto L_0x0149;
    L_0x0125:
        r0 = r10.f2895l;
        r0 = r0.m2467a(r1);
        r0 = (com.badlogic.gdx.utils.C0636l.C0638d) r0;
        if (r0 == 0) goto L_0x0135;
    L_0x012f:
        r1 = r0.mo512a(r10, r2);
        goto L_0x0005;
    L_0x0135:
        r0 = com.badlogic.gdx.utils.C0636l.C0411c.class;
        r0 = r0.isAssignableFrom(r1);
        if (r0 == 0) goto L_0x0149;
    L_0x013d:
        r1 = com.badlogic.gdx.utils.C0636l.m2173b(r1);
        r0 = r1;
        r0 = (com.badlogic.gdx.utils.C0636l.C0411c) r0;
        r0.mo350a(r10, r2);
        goto L_0x0005;
    L_0x0149:
        r0 = r2.m2275j();
        if (r0 == 0) goto L_0x0221;
    L_0x014f:
        if (r1 == 0) goto L_0x0155;
    L_0x0151:
        r0 = java.lang.Object.class;
        if (r1 != r0) goto L_0x03f9;
    L_0x0155:
        r0 = com.badlogic.gdx.utils.C0676a.class;
    L_0x0157:
        r1 = com.badlogic.gdx.utils.C0676a.class;
        r1 = r1.isAssignableFrom(r0);
        if (r1 == 0) goto L_0x0180;
    L_0x015f:
        r1 = com.badlogic.gdx.utils.C0676a.class;
        if (r0 != r1) goto L_0x0176;
    L_0x0163:
        r0 = new com.badlogic.gdx.utils.a;
        r0.<init>();
    L_0x0168:
        r1 = r2.f2957f;
    L_0x016a:
        if (r1 == 0) goto L_0x017d;
    L_0x016c:
        r2 = r10.mo511a(r12, r3, r1);
        r0.m2296a(r2);
        r1 = r1.f2958g;
        goto L_0x016a;
    L_0x0176:
        r0 = com.badlogic.gdx.utils.C0636l.m2173b(r0);
        r0 = (com.badlogic.gdx.utils.C0676a) r0;
        goto L_0x0168;
    L_0x017d:
        r1 = r0;
        goto L_0x0005;
    L_0x0180:
        r1 = com.badlogic.gdx.utils.C0724v.class;
        r1 = r1.isAssignableFrom(r0);
        if (r1 == 0) goto L_0x01a9;
    L_0x0188:
        r1 = com.badlogic.gdx.utils.C0724v.class;
        if (r0 != r1) goto L_0x019f;
    L_0x018c:
        r0 = new com.badlogic.gdx.utils.v;
        r0.<init>();
    L_0x0191:
        r1 = r2.f2957f;
    L_0x0193:
        if (r1 == 0) goto L_0x01a6;
    L_0x0195:
        r2 = r10.mo511a(r12, r3, r1);
        r0.m2516a(r2);
        r1 = r1.f2958g;
        goto L_0x0193;
    L_0x019f:
        r0 = com.badlogic.gdx.utils.C0636l.m2173b(r0);
        r0 = (com.badlogic.gdx.utils.C0724v) r0;
        goto L_0x0191;
    L_0x01a6:
        r1 = r0;
        goto L_0x0005;
    L_0x01a9:
        r1 = java.util.Collection.class;
        r1 = r1.isAssignableFrom(r0);
        if (r1 == 0) goto L_0x01d4;
    L_0x01b1:
        r1 = r0.isInterface();
        if (r1 == 0) goto L_0x01ca;
    L_0x01b7:
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x01bc:
        r1 = r2.f2957f;
    L_0x01be:
        if (r1 == 0) goto L_0x01d1;
    L_0x01c0:
        r2 = r10.mo511a(r12, r3, r1);
        r0.add(r2);
        r1 = r1.f2958g;
        goto L_0x01be;
    L_0x01ca:
        r0 = com.badlogic.gdx.utils.C0636l.m2173b(r0);
        r0 = (java.util.Collection) r0;
        goto L_0x01bc;
    L_0x01d1:
        r1 = r0;
        goto L_0x0005;
    L_0x01d4:
        r1 = r0.isArray();
        if (r1 == 0) goto L_0x01f8;
    L_0x01da:
        r0 = r0.getComponentType();
        if (r12 != 0) goto L_0x01e1;
    L_0x01e0:
        r12 = r0;
    L_0x01e1:
        r1 = r2.f2961j;
        r1 = java.lang.reflect.Array.newInstance(r0, r1);
        r0 = r2.f2957f;
    L_0x01e9:
        if (r0 == 0) goto L_0x0005;
    L_0x01eb:
        r2 = r5 + 1;
        r4 = r10.mo511a(r12, r3, r0);
        java.lang.reflect.Array.set(r1, r5, r4);
        r0 = r0.f2958g;
        r5 = r2;
        goto L_0x01e9;
    L_0x01f8:
        r1 = new com.badlogic.gdx.utils.SerializationException;
        r3 = new java.lang.StringBuilder;
        r4 = "Unable to convert value to required type: ";
        r3.<init>(r4);
        r2 = r3.append(r2);
        r3 = " (";
        r2 = r2.append(r3);
        r0 = r0.getName();
        r0 = r2.append(r0);
        r2 = ")";
        r0 = r0.append(r2);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x0221:
        r0 = r2.m2278m();
        if (r0 == 0) goto L_0x03f6;
    L_0x0227:
        if (r1 == 0) goto L_0x0231;
    L_0x0229:
        r0 = java.lang.Float.TYPE;	 Catch:{ NumberFormatException -> 0x02b9 }
        if (r1 == r0) goto L_0x0231;
    L_0x022d:
        r0 = java.lang.Float.class;
        if (r1 != r0) goto L_0x023b;
    L_0x0231:
        r0 = r2.m2262b();	 Catch:{ NumberFormatException -> 0x02b9 }
        r1 = java.lang.Float.valueOf(r0);	 Catch:{ NumberFormatException -> 0x02b9 }
        goto L_0x0005;
    L_0x023b:
        r0 = java.lang.Integer.TYPE;	 Catch:{ NumberFormatException -> 0x02b9 }
        if (r1 == r0) goto L_0x0243;
    L_0x023f:
        r0 = java.lang.Integer.class;
        if (r1 != r0) goto L_0x024d;
    L_0x0243:
        r0 = r2.m2269e();	 Catch:{ NumberFormatException -> 0x02b9 }
        r1 = java.lang.Integer.valueOf(r0);	 Catch:{ NumberFormatException -> 0x02b9 }
        goto L_0x0005;
    L_0x024d:
        r0 = java.lang.Long.TYPE;	 Catch:{ NumberFormatException -> 0x02b9 }
        if (r1 == r0) goto L_0x0255;
    L_0x0251:
        r0 = java.lang.Long.class;
        if (r1 != r0) goto L_0x025f;
    L_0x0255:
        r6 = r2.m2267d();	 Catch:{ NumberFormatException -> 0x02b9 }
        r1 = java.lang.Long.valueOf(r6);	 Catch:{ NumberFormatException -> 0x02b9 }
        goto L_0x0005;
    L_0x025f:
        r0 = java.lang.Double.TYPE;	 Catch:{ NumberFormatException -> 0x02b9 }
        if (r1 == r0) goto L_0x0267;
    L_0x0263:
        r0 = java.lang.Double.class;
        if (r1 != r0) goto L_0x0271;
    L_0x0267:
        r6 = r2.m2265c();	 Catch:{ NumberFormatException -> 0x02b9 }
        r1 = java.lang.Double.valueOf(r6);	 Catch:{ NumberFormatException -> 0x02b9 }
        goto L_0x0005;
    L_0x0271:
        r0 = java.lang.String.class;
        if (r1 != r0) goto L_0x027b;
    L_0x0275:
        r1 = r2.m2260a();	 Catch:{ NumberFormatException -> 0x02b9 }
        goto L_0x0005;
    L_0x027b:
        r0 = java.lang.Short.TYPE;	 Catch:{ NumberFormatException -> 0x02b9 }
        if (r1 == r0) goto L_0x0283;
    L_0x027f:
        r0 = java.lang.Short.class;
        if (r1 != r0) goto L_0x028d;
    L_0x0283:
        r0 = r2.m2272g();	 Catch:{ NumberFormatException -> 0x02b9 }
        r1 = java.lang.Short.valueOf(r0);	 Catch:{ NumberFormatException -> 0x02b9 }
        goto L_0x0005;
    L_0x028d:
        r0 = java.lang.Byte.TYPE;	 Catch:{ NumberFormatException -> 0x02b9 }
        if (r1 == r0) goto L_0x0295;
    L_0x0291:
        r0 = java.lang.Byte.class;
        if (r1 != r0) goto L_0x02ba;
    L_0x0295:
        r0 = com.badlogic.gdx.utils.JsonValue.C06641.f2937a;	 Catch:{ NumberFormatException -> 0x02b9 }
        r4 = r2.f2952a;	 Catch:{ NumberFormatException -> 0x02b9 }
        r4 = r4.ordinal();	 Catch:{ NumberFormatException -> 0x02b9 }
        r0 = r0[r4];	 Catch:{ NumberFormatException -> 0x02b9 }
        switch(r0) {
            case 1: goto L_0x02dd;
            case 2: goto L_0x02e9;
            case 3: goto L_0x02ee;
            case 4: goto L_0x02f3;
            default: goto L_0x02a2;
        };	 Catch:{ NumberFormatException -> 0x02b9 }
    L_0x02a2:
        r0 = new java.lang.IllegalStateException;	 Catch:{ NumberFormatException -> 0x02b9 }
        r4 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x02b9 }
        r6 = "Value cannot be converted to byte: ";
        r4.<init>(r6);	 Catch:{ NumberFormatException -> 0x02b9 }
        r6 = r2.f2952a;	 Catch:{ NumberFormatException -> 0x02b9 }
        r4 = r4.append(r6);	 Catch:{ NumberFormatException -> 0x02b9 }
        r4 = r4.toString();	 Catch:{ NumberFormatException -> 0x02b9 }
        r0.<init>(r4);	 Catch:{ NumberFormatException -> 0x02b9 }
        throw r0;	 Catch:{ NumberFormatException -> 0x02b9 }
    L_0x02b9:
        r0 = move-exception;
    L_0x02ba:
        r0 = new com.badlogic.gdx.utils.JsonValue;
        r2 = r2.m2260a();
        r0.<init>(r2);
    L_0x02c3:
        r2 = r0.m2279n();
        if (r2 == 0) goto L_0x03f3;
    L_0x02c9:
        if (r1 == 0) goto L_0x02d3;
    L_0x02cb:
        r2 = java.lang.Boolean.TYPE;	 Catch:{ NumberFormatException -> 0x02ff }
        if (r1 == r2) goto L_0x02d3;
    L_0x02cf:
        r2 = java.lang.Boolean.class;
        if (r1 != r2) goto L_0x0300;
    L_0x02d3:
        r2 = r0.m2271f();	 Catch:{ NumberFormatException -> 0x02ff }
        r1 = java.lang.Boolean.valueOf(r2);	 Catch:{ NumberFormatException -> 0x02ff }
        goto L_0x0005;
    L_0x02dd:
        r0 = r2.f2953b;	 Catch:{ NumberFormatException -> 0x02b9 }
        r0 = java.lang.Byte.parseByte(r0);	 Catch:{ NumberFormatException -> 0x02b9 }
    L_0x02e3:
        r1 = java.lang.Byte.valueOf(r0);	 Catch:{ NumberFormatException -> 0x02b9 }
        goto L_0x0005;
    L_0x02e9:
        r6 = r2.f2954c;	 Catch:{ NumberFormatException -> 0x02b9 }
        r0 = (int) r6;	 Catch:{ NumberFormatException -> 0x02b9 }
        r0 = (byte) r0;	 Catch:{ NumberFormatException -> 0x02b9 }
        goto L_0x02e3;
    L_0x02ee:
        r6 = r2.f2955d;	 Catch:{ NumberFormatException -> 0x02b9 }
        r0 = (int) r6;	 Catch:{ NumberFormatException -> 0x02b9 }
        r0 = (byte) r0;	 Catch:{ NumberFormatException -> 0x02b9 }
        goto L_0x02e3;
    L_0x02f3:
        r6 = r2.f2955d;	 Catch:{ NumberFormatException -> 0x02b9 }
        r8 = 0;
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 == 0) goto L_0x02fd;
    L_0x02fb:
        r0 = 1;
        goto L_0x02e3;
    L_0x02fd:
        r0 = r5;
        goto L_0x02e3;
    L_0x02ff:
        r2 = move-exception;
    L_0x0300:
        r2 = new com.badlogic.gdx.utils.JsonValue;
        r0 = r0.m2260a();
        r2.<init>(r0);
    L_0x0309:
        r0 = r2.m2277l();
        if (r0 == 0) goto L_0x03f0;
    L_0x030f:
        r4 = r2.m2260a();
        if (r1 == 0) goto L_0x0319;
    L_0x0315:
        r0 = java.lang.String.class;
        if (r1 != r0) goto L_0x031c;
    L_0x0319:
        r1 = r4;
        goto L_0x0005;
    L_0x031c:
        r0 = java.lang.Integer.TYPE;	 Catch:{ NumberFormatException -> 0x0370 }
        if (r1 == r0) goto L_0x0324;
    L_0x0320:
        r0 = java.lang.Integer.class;
        if (r1 != r0) goto L_0x032a;
    L_0x0324:
        r1 = java.lang.Integer.valueOf(r4);	 Catch:{ NumberFormatException -> 0x0370 }
        goto L_0x0005;
    L_0x032a:
        r0 = java.lang.Float.TYPE;	 Catch:{ NumberFormatException -> 0x0370 }
        if (r1 == r0) goto L_0x0332;
    L_0x032e:
        r0 = java.lang.Float.class;
        if (r1 != r0) goto L_0x0338;
    L_0x0332:
        r1 = java.lang.Float.valueOf(r4);	 Catch:{ NumberFormatException -> 0x0370 }
        goto L_0x0005;
    L_0x0338:
        r0 = java.lang.Long.TYPE;	 Catch:{ NumberFormatException -> 0x0370 }
        if (r1 == r0) goto L_0x0340;
    L_0x033c:
        r0 = java.lang.Long.class;
        if (r1 != r0) goto L_0x0346;
    L_0x0340:
        r1 = java.lang.Long.valueOf(r4);	 Catch:{ NumberFormatException -> 0x0370 }
        goto L_0x0005;
    L_0x0346:
        r0 = java.lang.Double.TYPE;	 Catch:{ NumberFormatException -> 0x0370 }
        if (r1 == r0) goto L_0x034e;
    L_0x034a:
        r0 = java.lang.Double.class;
        if (r1 != r0) goto L_0x0354;
    L_0x034e:
        r1 = java.lang.Double.valueOf(r4);	 Catch:{ NumberFormatException -> 0x0370 }
        goto L_0x0005;
    L_0x0354:
        r0 = java.lang.Short.TYPE;	 Catch:{ NumberFormatException -> 0x0370 }
        if (r1 == r0) goto L_0x035c;
    L_0x0358:
        r0 = java.lang.Short.class;
        if (r1 != r0) goto L_0x0362;
    L_0x035c:
        r1 = java.lang.Short.valueOf(r4);	 Catch:{ NumberFormatException -> 0x0370 }
        goto L_0x0005;
    L_0x0362:
        r0 = java.lang.Byte.TYPE;	 Catch:{ NumberFormatException -> 0x0370 }
        if (r1 == r0) goto L_0x036a;
    L_0x0366:
        r0 = java.lang.Byte.class;
        if (r1 != r0) goto L_0x0371;
    L_0x036a:
        r1 = java.lang.Byte.valueOf(r4);	 Catch:{ NumberFormatException -> 0x0370 }
        goto L_0x0005;
    L_0x0370:
        r0 = move-exception;
    L_0x0371:
        r0 = java.lang.Boolean.TYPE;
        if (r1 == r0) goto L_0x0379;
    L_0x0375:
        r0 = java.lang.Boolean.class;
        if (r1 != r0) goto L_0x037f;
    L_0x0379:
        r1 = java.lang.Boolean.valueOf(r4);
        goto L_0x0005;
    L_0x037f:
        r0 = java.lang.Character.TYPE;
        if (r1 == r0) goto L_0x0387;
    L_0x0383:
        r0 = java.lang.Character.class;
        if (r1 != r0) goto L_0x0391;
    L_0x0387:
        r0 = r4.charAt(r5);
        r1 = java.lang.Character.valueOf(r0);
        goto L_0x0005;
    L_0x0391:
        r0 = java.lang.Enum.class;
        r0 = r0.isAssignableFrom(r1);
        if (r0 == 0) goto L_0x03c0;
    L_0x0399:
        r0 = r1.getEnumConstants();
        r0 = (java.lang.Enum[]) r0;
        r0 = (java.lang.Enum[]) r0;
        r6 = r0.length;
    L_0x03a2:
        if (r5 >= r6) goto L_0x03c0;
    L_0x03a4:
        r13 = r0[r5];
        r3 = r10.f2890g;
        if (r3 == 0) goto L_0x03b7;
    L_0x03aa:
        r3 = r13.name();
    L_0x03ae:
        r3 = r4.equals(r3);
        if (r3 == 0) goto L_0x03bc;
    L_0x03b4:
        r1 = r13;
        goto L_0x0005;
    L_0x03b7:
        r3 = r13.toString();
        goto L_0x03ae;
    L_0x03bc:
        r3 = r5 + 1;
        r5 = r3;
        goto L_0x03a2;
    L_0x03c0:
        r0 = java.lang.CharSequence.class;
        if (r1 != r0) goto L_0x03c7;
    L_0x03c4:
        r1 = r4;
        goto L_0x0005;
    L_0x03c7:
        r0 = new com.badlogic.gdx.utils.SerializationException;
        r3 = new java.lang.StringBuilder;
        r4 = "Unable to convert value to required type: ";
        r3.<init>(r4);
        r2 = r3.append(r2);
        r3 = " (";
        r2 = r2.append(r3);
        r1 = r1.getName();
        r1 = r2.append(r1);
        r2 = ")";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x03f0:
        r1 = r3;
        goto L_0x0005;
    L_0x03f3:
        r2 = r0;
        goto L_0x0309;
    L_0x03f6:
        r0 = r2;
        goto L_0x02c3;
    L_0x03f9:
        r0 = r1;
        goto L_0x0157;
    L_0x03fc:
        r1 = r0;
        goto L_0x0021;
    L_0x03ff:
        r1 = r11;
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.l.a(java.lang.Class, java.lang.Class, com.badlogic.gdx.utils.JsonValue):T");
    }

    /* renamed from: a */
    public final <T> T m2176a(String str, Class<T> cls, JsonValue jsonValue) {
        return mo511a((Class) cls, null, jsonValue.m2259a(str));
    }

    /* renamed from: a */
    public final <T> T m2177a(String str, Class<T> cls, Class cls2, JsonValue jsonValue) {
        return mo511a((Class) cls, cls2, jsonValue.m2259a(str));
    }

    /* renamed from: a */
    public final <T> T m2178a(String str, Class<T> cls, T t, JsonValue jsonValue) {
        JsonValue a = jsonValue.m2259a(str);
        return a == null ? t : mo511a((Class) cls, null, a);
    }

    /* renamed from: a */
    public final <T> void m2179a(Class<T> cls, C0638d<T> c0638d) {
        this.f2895l.mo542a(cls, c0638d);
    }
}
