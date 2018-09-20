package com.badlogic.gdx.utils;

import java.util.Arrays;

public final class ac implements Appendable, CharSequence {
    /* renamed from: c */
    private static final char[] f3007c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    /* renamed from: a */
    public char[] f3008a;
    /* renamed from: b */
    public int f3009b;

    public ac() {
        this.f3008a = new char[16];
    }

    public ac(int i) {
        if (i < 0) {
            throw new NegativeArraySizeException();
        }
        this.f3008a = new char[i];
    }

    public ac(String str) {
        this.f3009b = str.length();
        this.f3008a = new char[(this.f3009b + 16)];
        str.getChars(0, this.f3009b, this.f3008a, 0);
    }

    /* renamed from: a */
    private void m2315a(int i, int i2) {
        if (this.f3008a.length - this.f3009b >= i) {
            System.arraycopy(this.f3008a, i2, this.f3008a, i2 + i, this.f3009b - i2);
            return;
        }
        int i3 = this.f3009b + i;
        int length = (this.f3008a.length << 1) + 2;
        if (i3 <= length) {
            i3 = length;
        }
        Object obj = new char[i3];
        System.arraycopy(this.f3008a, 0, obj, 0, i2);
        System.arraycopy(this.f3008a, i2, obj, i2 + i, this.f3009b - i2);
        this.f3008a = obj;
    }

    /* renamed from: a */
    public final ac m2316a(char c, String str) {
        int length = str.length();
        int i = 0;
        while (i != this.f3009b) {
            if (this.f3008a[i] != c) {
                i++;
            } else {
                int i2 = i + 1;
                if (i >= 0) {
                    if (i2 > this.f3009b) {
                        i2 = this.f3009b;
                    }
                    if (i2 > i) {
                        int length2 = str.length();
                        int i3 = (i2 - i) - length2;
                        if (i3 > 0) {
                            System.arraycopy(this.f3008a, i2, this.f3008a, i + length2, this.f3009b - i2);
                        } else if (i3 < 0) {
                            m2315a(-i3, i2);
                        }
                        str.getChars(0, length2, this.f3008a, i);
                        this.f3009b -= i3;
                    } else if (i == i2) {
                        if (i < 0 || i > this.f3009b) {
                            throw new StringIndexOutOfBoundsException(i);
                        }
                        i2 = str.length();
                        if (i2 != 0) {
                            m2315a(i2, i);
                            str.getChars(0, i2, this.f3008a, i);
                            this.f3009b = i2 + this.f3009b;
                        }
                    }
                    i += length;
                }
                throw new StringIndexOutOfBoundsException();
            }
        }
        return this;
    }

    /* renamed from: a */
    public final ac m2317a(float f) {
        m2324a(Float.toString(f));
        return this;
    }

    /* renamed from: a */
    public final ac m2318a(long j) {
        if (j == Long.MIN_VALUE) {
            m2324a("-9223372036854775808");
        } else {
            if (j < 0) {
                m2322a('-');
                j = -j;
            }
            if (j >= 10000) {
                if (j >= 1000000000000000000L) {
                    m2322a(f3007c[(int) ((((double) j) % 1.0E19d) / 1.0E18d)]);
                }
                if (j >= 100000000000000000L) {
                    m2322a(f3007c[(int) ((j % 1000000000000000000L) / 100000000000000000L)]);
                }
                if (j >= 10000000000000000L) {
                    m2322a(f3007c[(int) ((j % 100000000000000000L) / 10000000000000000L)]);
                }
                if (j >= 1000000000000000L) {
                    m2322a(f3007c[(int) ((j % 10000000000000000L) / 1000000000000000L)]);
                }
                if (j >= 100000000000000L) {
                    m2322a(f3007c[(int) ((j % 1000000000000000L) / 100000000000000L)]);
                }
                if (j >= 10000000000000L) {
                    m2322a(f3007c[(int) ((j % 100000000000000L) / 10000000000000L)]);
                }
                if (j >= 1000000000000L) {
                    m2322a(f3007c[(int) ((j % 10000000000000L) / 1000000000000L)]);
                }
                if (j >= 100000000000L) {
                    m2322a(f3007c[(int) ((j % 1000000000000L) / 100000000000L)]);
                }
                if (j >= 10000000000L) {
                    m2322a(f3007c[(int) ((j % 100000000000L) / 10000000000L)]);
                }
                if (j >= 1000000000) {
                    m2322a(f3007c[(int) ((j % 10000000000L) / 1000000000)]);
                }
                if (j >= 100000000) {
                    m2322a(f3007c[(int) ((j % 1000000000) / 100000000)]);
                }
                if (j >= 10000000) {
                    m2322a(f3007c[(int) ((j % 100000000) / 10000000)]);
                }
                if (j >= 1000000) {
                    m2322a(f3007c[(int) ((j % 10000000) / 1000000)]);
                }
                if (j >= 100000) {
                    m2322a(f3007c[(int) ((j % 1000000) / 100000)]);
                }
                m2322a(f3007c[(int) ((j % 100000) / 10000)]);
            }
            if (j >= 1000) {
                m2322a(f3007c[(int) ((j % 10000) / 1000)]);
            }
            if (j >= 100) {
                m2322a(f3007c[(int) ((j % 1000) / 100)]);
            }
            if (j >= 10) {
                m2322a(f3007c[(int) ((j % 100) / 10)]);
            }
            m2322a(f3007c[(int) (j % 10)]);
        }
        return this;
    }

    /* renamed from: a */
    public final ac m2319a(CharSequence charSequence) {
        if (charSequence == null) {
            m2321a();
        } else if (charSequence instanceof ac) {
            ac acVar = (ac) charSequence;
            m2325a(acVar.f3008a, 0, acVar.f3009b);
        } else {
            m2324a(charSequence.toString());
        }
        return this;
    }

    /* renamed from: a */
    public final ac m2320a(Object obj) {
        if (obj == null) {
            m2321a();
        } else {
            m2324a(obj.toString());
        }
        return this;
    }

    /* renamed from: a */
    public final void m2321a() {
        int i = this.f3009b + 4;
        if (i > this.f3008a.length) {
            m2323a(i);
        }
        char[] cArr = this.f3008a;
        int i2 = this.f3009b;
        this.f3009b = i2 + 1;
        cArr[i2] = 'n';
        cArr = this.f3008a;
        i2 = this.f3009b;
        this.f3009b = i2 + 1;
        cArr[i2] = 'u';
        cArr = this.f3008a;
        i2 = this.f3009b;
        this.f3009b = i2 + 1;
        cArr[i2] = 'l';
        cArr = this.f3008a;
        i2 = this.f3009b;
        this.f3009b = i2 + 1;
        cArr[i2] = 'l';
    }

    /* renamed from: a */
    public final void m2322a(char c) {
        if (this.f3009b == this.f3008a.length) {
            m2323a(this.f3009b + 1);
        }
        char[] cArr = this.f3008a;
        int i = this.f3009b;
        this.f3009b = i + 1;
        cArr[i] = c;
    }

    /* renamed from: a */
    final void m2323a(int i) {
        int length = ((this.f3008a.length >> 1) + this.f3008a.length) + 2;
        if (i <= length) {
            i = length;
        }
        Object obj = new char[i];
        System.arraycopy(this.f3008a, 0, obj, 0, this.f3009b);
        this.f3008a = obj;
    }

    /* renamed from: a */
    public final void m2324a(String str) {
        if (str == null) {
            m2321a();
            return;
        }
        int length = str.length();
        int i = this.f3009b + length;
        if (i > this.f3008a.length) {
            m2323a(i);
        }
        str.getChars(0, length, this.f3008a, this.f3009b);
        this.f3009b = i;
    }

    /* renamed from: a */
    public final void m2325a(char[] cArr, int i, int i2) {
        if (i > cArr.length || i < 0) {
            throw new ArrayIndexOutOfBoundsException("Offset out of bounds: " + i);
        } else if (i2 < 0 || cArr.length - i < i2) {
            throw new ArrayIndexOutOfBoundsException("Length out of bounds: " + i2);
        } else {
            int i3 = this.f3009b + i2;
            if (i3 > this.f3008a.length) {
                m2323a(i3);
            }
            System.arraycopy(cArr, i, this.f3008a, this.f3009b, i2);
            this.f3009b = i3;
        }
    }

    public final /* synthetic */ Appendable append(char c) {
        m2322a(c);
        return this;
    }

    public final /* synthetic */ Appendable append(CharSequence charSequence) {
        return m2319a(charSequence);
    }

    public final /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        if (i < 0 || i2 < 0 || i > i2 || i2 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        m2324a(charSequence.subSequence(i, i2).toString());
        return this;
    }

    /* renamed from: b */
    public final ac m2326b(char[] cArr, int i, int i2) {
        m2325a(cArr, i, i2);
        return this;
    }

    /* renamed from: b */
    public final void m2327b(int i) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (i > this.f3008a.length) {
            m2323a(i);
        } else if (this.f3009b < i) {
            Arrays.fill(this.f3008a, this.f3009b, i, '\u0000');
        }
        this.f3009b = i;
    }

    /* renamed from: c */
    public final ac m2328c(int i) {
        if (i == Integer.MIN_VALUE) {
            m2324a("-2147483648");
        } else {
            if (i < 0) {
                m2322a('-');
                i = -i;
            }
            if (i >= 10000) {
                if (i >= 1000000000) {
                    m2322a(f3007c[(int) ((((long) i) % 10000000000L) / 1000000000)]);
                }
                if (i >= 100000000) {
                    m2322a(f3007c[(i % 1000000000) / 100000000]);
                }
                if (i >= 10000000) {
                    m2322a(f3007c[(i % 100000000) / 10000000]);
                }
                if (i >= 1000000) {
                    m2322a(f3007c[(i % 10000000) / 1000000]);
                }
                if (i >= 100000) {
                    m2322a(f3007c[(i % 1000000) / 100000]);
                }
                m2322a(f3007c[(i % 100000) / 10000]);
            }
            if (i >= 1000) {
                m2322a(f3007c[(i % 10000) / 1000]);
            }
            if (i >= 100) {
                m2322a(f3007c[(i % 1000) / 100]);
            }
            if (i >= 10) {
                m2322a(f3007c[(i % 100) / 10]);
            }
            m2322a(f3007c[i % 10]);
        }
        return this;
    }

    public final char charAt(int i) {
        if (i >= 0 && i < this.f3009b) {
            return this.f3008a[i];
        }
        throw new StringIndexOutOfBoundsException(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ac acVar = (ac) obj;
        int i = this.f3009b;
        if (i != acVar.f3009b) {
            return false;
        }
        char[] cArr = this.f3008a;
        char[] cArr2 = acVar.f3008a;
        if (cArr == cArr2) {
            return true;
        }
        if (cArr == null || cArr2 == null) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (cArr[i2] != cArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f3009b + 31) * 31) + Arrays.hashCode(this.f3008a);
    }

    public final int length() {
        return this.f3009b;
    }

    public final CharSequence subSequence(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= this.f3009b) {
            return i == i2 ? "" : new String(this.f3008a, i, i2 - i);
        } else {
            throw new StringIndexOutOfBoundsException();
        }
    }

    public final String toString() {
        return this.f3009b == 0 ? "" : new String(this.f3008a, 0, this.f3009b);
    }
}
