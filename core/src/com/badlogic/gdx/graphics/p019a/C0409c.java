package com.badlogic.gdx.graphics.p019a;

/* renamed from: com.badlogic.gdx.graphics.a.c */
public final class C0409c extends C0392b {
    /* renamed from: e */
    private static int f1541e = 0;
    /* renamed from: d */
    public String f1542d;

    public C0409c() {
        StringBuilder stringBuilder = new StringBuilder("mtl");
        int i = f1541e + 1;
        f1541e = i;
        this(stringBuilder.append(i).toString());
    }

    public C0409c(String str) {
        this.f1542d = str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0409c) && (obj == this || (((C0409c) obj).f1542d.equals(this.f1542d) && super.equals(obj)));
    }

    public final int hashCode() {
        return super.hashCode() + (this.f1542d.hashCode() * 3);
    }
}
