package com.prineside.tdi.utility;

public class CheatSafeInt {
    /* renamed from: a */
    private String f8371a;
    /* renamed from: b */
    private int f8372b = (((int) (Math.random() * 12.0d)) + 24);
    /* renamed from: c */
    private int f8373c;
    /* renamed from: d */
    private int f8374d = (((int) (Math.random() * 1000.0d)) - 500);
    /* renamed from: e */
    private int[] f8375e = new int[6];

    public CheatSafeInt(int i) {
        m8801a(i);
    }

    /* renamed from: a */
    public final int m8800a() {
        int i = 1;
        if (!(this.f8373c + this.f8374d == this.f8375e[0] && (-this.f8373c) - this.f8374d == this.f8375e[1])) {
            i = 0;
        }
        if (i != 0) {
            return this.f8373c;
        }
        i = Integer.valueOf(this.f8371a, this.f8372b).intValue() + this.f8372b;
        m8801a(i);
        return i;
    }

    /* renamed from: a */
    public final void m8801a(int i) {
        this.f8373c = i;
        this.f8375e[0] = this.f8373c + this.f8374d;
        this.f8375e[1] = (-this.f8373c) - this.f8374d;
        this.f8371a = Integer.toString(this.f8373c - this.f8372b, this.f8372b);
    }

    /* renamed from: b */
    public final void m8802b(int i) {
        m8801a(m8800a() + i);
    }

    /* renamed from: c */
    public final void m8803c(int i) {
        m8801a(m8800a() - i);
    }

    public String toString() {
        return String.valueOf(m8800a());
    }
}
