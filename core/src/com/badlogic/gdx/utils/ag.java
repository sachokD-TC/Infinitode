package com.badlogic.gdx.utils;

import com.badlogic.gdx.p016c.C0316a;
import com.badlogic.gdx.utils.JsonValue.ValueType;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ag implements C0679d {
    /* renamed from: a */
    public boolean f3027a = true;

    /* renamed from: a */
    private static long m2346a(DataInputStream dataInputStream, byte b, boolean z) {
        return b == (byte) 105 ? (long) m2352b(dataInputStream) : b == (byte) 73 ? (long) (dataInputStream.readShort() & 65535) : b == (byte) 108 ? m2353c(dataInputStream) : b == (byte) 76 ? dataInputStream.readLong() : z ? (((((long) (((short) b) & 255)) << 24) | (((long) (((short) dataInputStream.readByte()) & 255)) << 16)) | (((long) (((short) dataInputStream.readByte()) & 255)) << 8)) | ((long) (((short) dataInputStream.readByte()) & 255)) : -1;
    }

    /* renamed from: a */
    private static long m2347a(DataInputStream dataInputStream, boolean z) {
        return m2346a(dataInputStream, dataInputStream.readByte(), z);
    }

    /* renamed from: a */
    private JsonValue m2348a(DataInputStream dataInputStream) {
        try {
            JsonValue a = m2349a(dataInputStream, dataInputStream.readByte());
            return a;
        } finally {
            ab.m2310a(dataInputStream);
        }
    }

    /* renamed from: a */
    private JsonValue m2349a(DataInputStream dataInputStream, byte b) {
        JsonValue jsonValue;
        long j;
        long j2;
        byte b2;
        JsonValue a;
        JsonValue jsonValue2;
        if (b == (byte) 91) {
            jsonValue = new JsonValue(ValueType.array);
            byte readByte = dataInputStream.readByte();
            byte b3 = (byte) 0;
            if (readByte == (byte) 36) {
                b3 = dataInputStream.readByte();
                readByte = dataInputStream.readByte();
            }
            j = -1;
            if (readByte == (byte) 35) {
                j = m2347a(dataInputStream, false);
                if (j < 0) {
                    throw new GdxRuntimeException("Unrecognized data type");
                }
                if (j != 0) {
                    readByte = b3 == (byte) 0 ? dataInputStream.readByte() : b3;
                }
                return jsonValue;
            }
            j2 = 0;
            b2 = readByte;
            JsonValue jsonValue3 = null;
            while (dataInputStream.available() > 0 && b2 != (byte) 93) {
                a = m2349a(dataInputStream, b2);
                a.f2960i = jsonValue;
                if (jsonValue3 != null) {
                    a.f2959h = jsonValue3;
                    jsonValue3.f2958g = a;
                    jsonValue.f2961j++;
                } else {
                    jsonValue.f2957f = a;
                    jsonValue.f2961j = 1;
                }
                if (j > 0) {
                    j2++;
                    if (j2 >= j) {
                        break;
                    }
                }
                jsonValue2 = a;
                b2 = b3 == (byte) 0 ? dataInputStream.readByte() : b3;
                jsonValue3 = jsonValue2;
            }
            return jsonValue;
        } else if (b == (byte) 123) {
            jsonValue = new JsonValue(ValueType.object);
            byte readByte2 = dataInputStream.readByte();
            b2 = (byte) 0;
            if (readByte2 == (byte) 36) {
                b2 = dataInputStream.readByte();
                readByte2 = dataInputStream.readByte();
            }
            r0 = -1;
            if (readByte2 == (byte) 35) {
                r0 = m2347a(dataInputStream, false);
                if (r0 < 0) {
                    throw new GdxRuntimeException("Unrecognized data type");
                }
                if (r0 != 0) {
                    readByte2 = dataInputStream.readByte();
                }
                return jsonValue;
            }
            JsonValue jsonValue4 = null;
            byte b4 = readByte2;
            j = 0;
            while (dataInputStream.available() > 0 && b4 != (byte) 125) {
                String a2 = m2351a(dataInputStream, true, b4);
                JsonValue a3 = m2349a(dataInputStream, b2 == (byte) 0 ? dataInputStream.readByte() : b2);
                a3.f2956e = a2;
                a3.f2960i = jsonValue;
                if (jsonValue4 != null) {
                    a3.f2959h = jsonValue4;
                    jsonValue4.f2958g = a3;
                    jsonValue.f2961j++;
                } else {
                    jsonValue.f2957f = a3;
                    jsonValue.f2961j = 1;
                }
                if (r0 > 0) {
                    j++;
                    if (j >= r0) {
                        break;
                    }
                }
                jsonValue2 = a3;
                b4 = dataInputStream.readByte();
                jsonValue4 = jsonValue2;
            }
            return jsonValue;
        } else if (b == (byte) 90) {
            return new JsonValue(ValueType.nullValue);
        } else {
            if (b == (byte) 84) {
                return new JsonValue(true);
            }
            if (b == (byte) 70) {
                return new JsonValue(false);
            }
            if (b == (byte) 66) {
                return new JsonValue((long) m2352b(dataInputStream));
            }
            if (b == (byte) 85) {
                return new JsonValue((long) m2352b(dataInputStream));
            }
            if (b == (byte) 105) {
                return new JsonValue(this.f3027a ? (long) dataInputStream.readShort() : (long) dataInputStream.readByte());
            } else if (b == (byte) 73) {
                return new JsonValue(this.f3027a ? (long) dataInputStream.readInt() : (long) dataInputStream.readShort());
            } else if (b == (byte) 108) {
                return new JsonValue((long) dataInputStream.readInt());
            } else {
                if (b == (byte) 76) {
                    return new JsonValue(dataInputStream.readLong());
                }
                if (b == (byte) 100) {
                    return new JsonValue((double) dataInputStream.readFloat());
                }
                if (b == (byte) 68) {
                    return new JsonValue(dataInputStream.readDouble());
                }
                if (b == (byte) 115 || b == (byte) 83) {
                    return new JsonValue(m2351a(dataInputStream, false, b));
                }
                if (b == (byte) 97 || b == (byte) 65) {
                    byte readByte3 = dataInputStream.readByte();
                    r0 = b == (byte) 65 ? m2353c(dataInputStream) : (long) m2352b(dataInputStream);
                    JsonValue jsonValue5 = new JsonValue(ValueType.array);
                    JsonValue jsonValue6 = null;
                    j2 = 0;
                    while (j2 < r0) {
                        a = m2349a(dataInputStream, readByte3);
                        a.f2960i = jsonValue5;
                        if (jsonValue6 != null) {
                            jsonValue6.f2958g = a;
                            jsonValue5.f2961j++;
                        } else {
                            jsonValue5.f2957f = a;
                            jsonValue5.f2961j = 1;
                        }
                        j2++;
                        jsonValue6 = a;
                    }
                    return jsonValue5;
                } else if (b == (byte) 67) {
                    return new JsonValue((long) dataInputStream.readChar());
                } else {
                    throw new GdxRuntimeException("Unrecognized data type");
                }
            }
        }
    }

    /* renamed from: a */
    private JsonValue m2350a(InputStream inputStream) {
        Throwable e;
        Closeable dataInputStream;
        try {
            dataInputStream = new DataInputStream(inputStream);
            try {
                JsonValue a = m2348a((DataInputStream) dataInputStream);
                ab.m2310a(dataInputStream);
                return a;
            } catch (IOException e2) {
                e = e2;
                try {
                    throw new SerializationException(e);
                } catch (Throwable th) {
                    e = th;
                    ab.m2310a(dataInputStream);
                    throw e;
                }
            }
        } catch (IOException e3) {
            e = e3;
            dataInputStream = null;
            throw new SerializationException(e);
        } catch (Throwable th2) {
            e = th2;
            dataInputStream = null;
            ab.m2310a(dataInputStream);
            throw e;
        }
    }

    /* renamed from: a */
    private static String m2351a(DataInputStream dataInputStream, boolean z, byte b) {
        long j = -1;
        if (b == (byte) 83) {
            j = m2347a(dataInputStream, true);
        } else if (b == (byte) 115) {
            j = (long) m2352b(dataInputStream);
        } else if (z) {
            j = m2346a(dataInputStream, b, false);
        }
        if (j < 0) {
            throw new GdxRuntimeException("Unrecognized data type, string expected");
        } else if (j <= 0) {
            return "";
        } else {
            byte[] bArr = new byte[((int) j)];
            dataInputStream.readFully(bArr);
            return new String(bArr, "UTF-8");
        }
    }

    /* renamed from: b */
    private static short m2352b(DataInputStream dataInputStream) {
        return (short) (((short) dataInputStream.readByte()) & 255);
    }

    /* renamed from: c */
    private static long m2353c(DataInputStream dataInputStream) {
        return ((long) dataInputStream.readInt()) & -1;
    }

    /* renamed from: a */
    public final JsonValue mo521a(C0316a c0316a) {
        try {
            return m2350a(new BufferedInputStream(c0316a.mo268b(), 8192));
        } catch (Throwable e) {
            throw new SerializationException("Error parsing file: " + c0316a, e);
        }
    }
}
