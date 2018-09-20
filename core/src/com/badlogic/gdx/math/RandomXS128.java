package com.badlogic.gdx.math;

import java.util.Random;

public class RandomXS128 extends Random {
    private long seed0;
    private long seed1;

    public RandomXS128() {
        setSeed(new Random().nextLong());
    }

    /* renamed from: a */
    private static final long m1697a(long j) {
        long j2 = ((j >>> 33) ^ j) * -49064778989728563L;
        j2 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
        return j2 ^ (j2 >>> 33);
    }

    protected final int next(int i) {
        return (int) (nextLong() & ((1 << i) - 1));
    }

    public boolean nextBoolean() {
        return (nextLong() & 1) != 0;
    }

    public void nextBytes(byte[] bArr) {
        int length = bArr.length;
        while (length != 0) {
            int i = length;
            int i2 = length < 8 ? length : 8;
            long nextLong = nextLong();
            while (true) {
                int i3 = i2 - 1;
                if (i2 == 0) {
                    break;
                }
                i--;
                bArr[i] = (byte) ((int) nextLong);
                nextLong >>= 8;
                i2 = i3;
            }
            length = i;
        }
    }

    public double nextDouble() {
        return ((double) (nextLong() >>> 11)) * 1.1102230246251565E-16d;
    }

    public float nextFloat() {
        return (float) (((double) (nextLong() >>> 40)) * 5.9604644775390625E-8d);
    }

    public int nextInt() {
        return (int) nextLong();
    }

    public int nextInt(int i) {
        long j = (long) i;
        if (j <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        long j2;
        long nextLong;
        do {
            nextLong = nextLong() >>> 1;
            j2 = nextLong % j;
        } while ((nextLong - j2) + (j - 1) < 0);
        return (int) j2;
    }

    public long nextLong() {
        long j = this.seed0;
        long j2 = this.seed1;
        this.seed0 = j2;
        j ^= j << 23;
        j = ((j >>> 17) ^ (j ^ j2)) ^ (j2 >>> 26);
        this.seed1 = j;
        return j + j2;
    }

    public void setSeed(long j) {
        if (j == 0) {
            j = Long.MIN_VALUE;
        }
        long a = m1697a(j);
        long a2 = m1697a(a);
        this.seed0 = a;
        this.seed1 = a2;
    }
}
