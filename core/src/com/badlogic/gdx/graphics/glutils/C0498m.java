package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.C0434e;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.graphics.glutils.ETC1.C0481a;
import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.ab;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.zip.GZIPInputStream;

/* renamed from: com.badlogic.gdx.graphics.glutils.m */
public final class C0498m implements TextureData, C0434e {
    /* renamed from: a */
    private C0316a f2201a;
    /* renamed from: b */
    private int f2202b;
    /* renamed from: c */
    private int f2203c;
    /* renamed from: d */
    private int f2204d;
    /* renamed from: e */
    private int f2205e;
    /* renamed from: f */
    private int f2206f;
    /* renamed from: g */
    private int f2207g = -1;
    /* renamed from: h */
    private int f2208h = -1;
    /* renamed from: i */
    private int f2209i = -1;
    /* renamed from: j */
    private int f2210j;
    /* renamed from: k */
    private int f2211k;
    /* renamed from: l */
    private int f2212l;
    /* renamed from: m */
    private int f2213m;
    /* renamed from: n */
    private ByteBuffer f2214n;
    /* renamed from: o */
    private boolean f2215o;

    public C0498m(C0316a c0316a, boolean z) {
        this.f2201a = c0316a;
        this.f2215o = z;
    }

    /* renamed from: a */
    public final void mo390a(int i) {
        if (this.f2214n == null) {
            throw new GdxRuntimeException("Call prepare() before calling consumeCompressedData()");
        }
        Object obj;
        int i2;
        IntBuffer b = BufferUtils.m2246b(16);
        if (this.f2202b != 0 && this.f2204d != 0) {
            obj = null;
        } else if (this.f2202b + this.f2204d != 0) {
            throw new GdxRuntimeException("either both or none of glType, glFormat must be zero");
        } else {
            obj = 1;
        }
        int i3 = 1;
        int i4 = 4660;
        if (this.f2208h > 0) {
            i3 = 2;
            i4 = 3553;
        }
        if (this.f2209i > 0) {
            i3 = 3;
            i4 = 4660;
        }
        if (this.f2211k == 6) {
            if (i3 == 2) {
                i4 = 34067;
            } else {
                throw new GdxRuntimeException("cube map needs 2D faces");
            }
        } else if (this.f2211k != 1) {
            throw new GdxRuntimeException("numberOfFaces must be either 1 or 6");
        }
        if (this.f2210j > 0) {
            if (i4 == 4660) {
                i4 = 4660;
            } else if (i4 == 3553) {
                i4 = 4660;
            } else {
                throw new GdxRuntimeException("No API for 3D and cube arrays yet");
            }
            i2 = i3 + 1;
            i3 = i4;
        } else {
            i2 = i3;
            i3 = i4;
        }
        if (i3 == 4660) {
            throw new GdxRuntimeException("Unsupported texture format (only 2D texture are supported in LibGdx for the time being)");
        }
        int i5;
        if (this.f2211k != 6 || i == 34067) {
            if (this.f2211k == 6 && i == 34067) {
                i = 34069;
                i5 = -1;
            } else if (i == i3 || (34069 <= i && i <= 34074 && i == 3553)) {
                i5 = -1;
            } else {
                throw new GdxRuntimeException("Invalid target requested : 0x" + Integer.toHexString(i) + ", expecting : 0x" + Integer.toHexString(i3));
            }
        } else if (34069 > i || i > 34074) {
            throw new GdxRuntimeException("You must specify either GL_TEXTURE_CUBE_MAP to bind all 6 faces of the cube or the requested face GL_TEXTURE_CUBE_MAP_POSITIVE_X and followings.");
        } else {
            i4 = i - 34069;
            i = 34069;
            i5 = i4;
        }
        Gdx.gl.glGetIntegerv(3317, b);
        int i6 = b.get(0);
        if (i6 != 4) {
            Gdx.gl.glPixelStorei(3317, 4);
        }
        int i7 = this.f2205e;
        int i8 = this.f2204d;
        i4 = this.f2213m;
        for (int i9 = 0; i9 < this.f2212l; i9++) {
            int max = Math.max(1, this.f2207g >> i9);
            i3 = Math.max(1, this.f2208h >> i9);
            Math.max(1, this.f2209i >> i9);
            this.f2214n.position(i4);
            int i10 = this.f2214n.getInt();
            int i11 = (i10 + 3) & -4;
            int i12 = 0;
            i4 += 4;
            while (i12 < this.f2211k) {
                this.f2214n.position(i4);
                int i13 = i4 + i11;
                if (i5 == -1 || i5 == i12) {
                    Buffer slice = this.f2214n.slice();
                    slice.limit(i11);
                    if (i2 != 1 && i2 == 2) {
                        int i14 = this.f2210j > 0 ? this.f2210j : i3;
                        if (obj == null) {
                            Gdx.gl.glTexImage2D(i + i12, i9, i7, max, i14, 0, i8, this.f2202b, slice);
                            i3 = i14;
                        } else if (i7 != ETC1.f2093b) {
                            Gdx.gl.glCompressedTexImage2D(i + i12, i9, i7, max, i14, 0, i10, slice);
                            i3 = i14;
                        } else if (Gdx.graphics.mo292a("GL_OES_compressed_ETC1_RGB8_texture")) {
                            Gdx.gl.glCompressedTexImage2D(i + i12, i9, i7, max, i14, 0, i10, slice);
                            i3 = i14;
                        } else {
                            Pixmap a = ETC1.m1448a(new C0481a(max, i14, slice), Format.RGB888);
                            Gdx.gl.glTexImage2D(i + i12, i9, a.m1120d(), a.f1378a.f1654b, a.f1378a.f1655c, 0, a.m1119c(), a.m1121e(), a.m1122f());
                            a.dispose();
                            i3 = i14;
                        }
                    }
                }
                i12++;
                i4 = i13;
            }
        }
        if (i6 != 4) {
            Gdx.gl.glPixelStorei(3317, i6);
        }
        if (this.f2215o) {
            Gdx.gl.glGenerateMipmap(i);
        }
        if (this.f2214n != null) {
            BufferUtils.m2243a(this.f2214n);
        }
        this.f2214n = null;
    }

    /* renamed from: a */
    public final boolean mo391a() {
        return this.f2214n != null;
    }

    /* renamed from: b */
    public final void mo392b() {
        Closeable dataInputStream;
        Throwable e;
        Closeable closeable;
        if (this.f2214n != null) {
            throw new GdxRuntimeException("Already prepared");
        } else if (this.f2201a == null) {
            throw new GdxRuntimeException("Need a file to load from");
        } else {
            if (this.f2201a.f1119a.getName().endsWith(".zktx")) {
                byte[] bArr = new byte[10240];
                try {
                    dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(this.f2201a.mo268b())));
                    try {
                        this.f2214n = BufferUtils.m2247c(dataInputStream.readInt());
                        while (true) {
                            int read = dataInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            this.f2214n.put(bArr, 0, read);
                        }
                        this.f2214n.position(0);
                        this.f2214n.limit(this.f2214n.capacity());
                        ab.m2310a(dataInputStream);
                    } catch (Exception e2) {
                        e = e2;
                        closeable = dataInputStream;
                        try {
                            throw new GdxRuntimeException("Couldn't load zktx file '" + this.f2201a + "'", e);
                        } catch (Throwable th) {
                            e = th;
                            dataInputStream = closeable;
                            ab.m2310a(dataInputStream);
                            throw e;
                        }
                    } catch (Throwable th2) {
                        e = th2;
                        ab.m2310a(dataInputStream);
                        throw e;
                    }
                } catch (Exception e3) {
                    e = e3;
                    closeable = null;
                    throw new GdxRuntimeException("Couldn't load zktx file '" + this.f2201a + "'", e);
                } catch (Throwable th3) {
                    e = th3;
                    dataInputStream = null;
                    ab.m2310a(dataInputStream);
                    throw e;
                }
            }
            this.f2214n = ByteBuffer.wrap(this.f2201a.m900l());
            if (this.f2214n.get() != (byte) -85) {
                throw new GdxRuntimeException("Invalid KTX Header");
            } else if (this.f2214n.get() != (byte) 75) {
                throw new GdxRuntimeException("Invalid KTX Header");
            } else if (this.f2214n.get() != (byte) 84) {
                throw new GdxRuntimeException("Invalid KTX Header");
            } else if (this.f2214n.get() != (byte) 88) {
                throw new GdxRuntimeException("Invalid KTX Header");
            } else if (this.f2214n.get() != (byte) 32) {
                throw new GdxRuntimeException("Invalid KTX Header");
            } else if (this.f2214n.get() != (byte) 49) {
                throw new GdxRuntimeException("Invalid KTX Header");
            } else if (this.f2214n.get() != (byte) 49) {
                throw new GdxRuntimeException("Invalid KTX Header");
            } else if (this.f2214n.get() != (byte) -69) {
                throw new GdxRuntimeException("Invalid KTX Header");
            } else if (this.f2214n.get() != (byte) 13) {
                throw new GdxRuntimeException("Invalid KTX Header");
            } else if (this.f2214n.get() != (byte) 10) {
                throw new GdxRuntimeException("Invalid KTX Header");
            } else if (this.f2214n.get() != (byte) 26) {
                throw new GdxRuntimeException("Invalid KTX Header");
            } else if (this.f2214n.get() != (byte) 10) {
                throw new GdxRuntimeException("Invalid KTX Header");
            } else {
                int i = this.f2214n.getInt();
                if (i == 67305985 || i == 16909060) {
                    if (i != 67305985) {
                        this.f2214n.order(this.f2214n.order() == ByteOrder.BIG_ENDIAN ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN);
                    }
                    this.f2202b = this.f2214n.getInt();
                    this.f2203c = this.f2214n.getInt();
                    this.f2204d = this.f2214n.getInt();
                    this.f2205e = this.f2214n.getInt();
                    this.f2206f = this.f2214n.getInt();
                    this.f2207g = this.f2214n.getInt();
                    this.f2208h = this.f2214n.getInt();
                    this.f2209i = this.f2214n.getInt();
                    this.f2210j = this.f2214n.getInt();
                    this.f2211k = this.f2214n.getInt();
                    this.f2212l = this.f2214n.getInt();
                    if (this.f2212l == 0) {
                        this.f2212l = 1;
                        this.f2215o = true;
                    }
                    this.f2213m = this.f2214n.getInt() + this.f2214n.position();
                    if (!this.f2214n.isDirect()) {
                        int i2 = this.f2213m;
                        for (i = 0; i < this.f2212l; i++) {
                            i2 += (((this.f2214n.getInt(i2) + 3) & -4) * this.f2211k) + 4;
                        }
                        this.f2214n.limit(i2);
                        this.f2214n.position(0);
                        ByteBuffer c = BufferUtils.m2247c(i2);
                        c.order(this.f2214n.order());
                        c.put(this.f2214n);
                        this.f2214n = c;
                        return;
                    }
                    return;
                }
                throw new GdxRuntimeException("Invalid KTX Header");
            }
        }
    }

    /* renamed from: c */
    public final void mo421c() {
        mo390a(34067);
    }

    /* renamed from: d */
    public final boolean mo393d() {
        return true;
    }

    /* renamed from: e */
    public final TextureDataType mo394e() {
        return TextureDataType.Custom;
    }

    /* renamed from: f */
    public final Pixmap mo395f() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    /* renamed from: g */
    public final boolean mo396g() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    /* renamed from: h */
    public final int mo397h() {
        return this.f2207g;
    }

    /* renamed from: i */
    public final int mo398i() {
        return this.f2208h;
    }

    /* renamed from: j */
    public final Format mo399j() {
        throw new GdxRuntimeException("This TextureData implementation directly handles texture formats.");
    }

    /* renamed from: k */
    public final boolean mo400k() {
        return this.f2215o;
    }
}
