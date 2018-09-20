package com.badlogic.gdx.graphics.p019a;

import com.badlogic.gdx.utils.C0676a;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.badlogic.gdx.graphics.a.b */
public class C0392b implements Comparable<C0392b>, Iterable<C0382a>, Comparator<C0382a> {
    /* renamed from: a */
    protected long f1459a;
    /* renamed from: b */
    protected final C0676a<C0382a> f1460b = new C0676a();
    /* renamed from: c */
    protected boolean f1461c = true;

    /* renamed from: a */
    private void m1173a() {
        if (!this.f1461c) {
            this.f1460b.mo526a((Comparator) this);
            this.f1461c = true;
        }
    }

    /* renamed from: a */
    public final void m1174a(C0382a c0382a) {
        int i;
        long j = c0382a.f1409a;
        boolean z = j != 0 && (this.f1459a & j) == j;
        if (z) {
            i = 0;
            while (i < this.f1460b.f3001b) {
                if (((C0382a) this.f1460b.m2291a(i)).f1409a == j) {
                    break;
                }
                i++;
            }
        }
        i = -1;
        if (i < 0) {
            this.f1459a = c0382a.f1409a | this.f1459a;
            this.f1460b.m2296a((Object) c0382a);
            this.f1461c = false;
        } else {
            this.f1460b.mo525a(i, (Object) c0382a);
        }
        m1173a();
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return (int) (((C0382a) obj).f1409a - ((C0382a) obj2).f1409a);
    }

    public /* synthetic */ int compareTo(Object obj) {
        C0392b c0392b = (C0392b) obj;
        if (c0392b == this) {
            return 0;
        }
        if (this.f1459a != c0392b.f1459a) {
            return this.f1459a < c0392b.f1459a ? -1 : 1;
        } else {
            m1173a();
            c0392b.m1173a();
            int i = 0;
            while (i < this.f1460b.f3001b) {
                int compareTo = ((C0382a) this.f1460b.m2291a(i)).compareTo(c0392b.f1460b.m2291a(i));
                if (compareTo != 0) {
                    return compareTo < 0 ? -1 : compareTo > 0 ? 1 : 0;
                } else {
                    i++;
                }
            }
            return 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0392b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0392b c0392b = (C0392b) obj;
        if (c0392b != this) {
            if (c0392b == null || this.f1459a != c0392b.f1459a) {
                return false;
            }
            m1173a();
            c0392b.m1173a();
            for (int i = 0; i < this.f1460b.f3001b; i++) {
                if (!((C0382a) this.f1460b.m2291a(i)).m1159a((C0382a) c0392b.f1460b.m2291a(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        m1173a();
        long j = this.f1459a + 71;
        int i = 1;
        for (int i2 = 0; i2 < this.f1460b.f3001b; i2++) {
            i = 65535 & (i * 7);
            j += (this.f1459a * ((long) ((C0382a) this.f1460b.m2291a(i2)).hashCode())) * ((long) i);
        }
        return (int) ((j >> 32) ^ j);
    }

    public final Iterator<C0382a> iterator() {
        return this.f1460b.iterator();
    }
}
