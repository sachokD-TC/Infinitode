package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class GLVersion {
    /* renamed from: a */
    public int f2099a;
    /* renamed from: b */
    private int f2100b;
    /* renamed from: c */
    private int f2101c;
    /* renamed from: d */
    private final String f2102d;
    /* renamed from: e */
    private final String f2103e;
    /* renamed from: f */
    private final Type f2104f;
    /* renamed from: g */
    private final String f2105g = "GLVersion";

    public enum Type {
        OpenGL,
        GLES,
        WebGL,
        NONE
    }

    public GLVersion(ApplicationType applicationType, String str, String str2, String str3) {
        if (applicationType == ApplicationType.Android) {
            this.f2104f = Type.GLES;
        } else if (applicationType == ApplicationType.iOS) {
            this.f2104f = Type.GLES;
        } else if (applicationType == ApplicationType.Desktop) {
            this.f2104f = Type.OpenGL;
        } else if (applicationType == ApplicationType.Applet) {
            this.f2104f = Type.OpenGL;
        } else if (applicationType == ApplicationType.WebGL) {
            this.f2104f = Type.WebGL;
        } else {
            this.f2104f = Type.NONE;
        }
        if (this.f2104f == Type.GLES) {
            m1450a("OpenGL ES (\\d(\\.\\d){0,2})", str);
        } else if (this.f2104f == Type.WebGL) {
            m1450a("WebGL (\\d(\\.\\d){0,2})", str);
        } else if (this.f2104f == Type.OpenGL) {
            m1450a("(\\d(\\.\\d){0,2})", str);
        } else {
            this.f2099a = -1;
            this.f2100b = -1;
            this.f2101c = -1;
            str2 = "";
            str3 = "";
        }
        this.f2102d = str2;
        this.f2103e = str3;
    }

    /* renamed from: a */
    private static int m1449a(String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            Gdx.app.error("LibGDX GL", "Error parsing number: " + str + ", assuming: " + i);
        }
        return i;
    }

    /* renamed from: a */
    private void m1450a(String str, String str2) {
        int i = 0;
        Matcher matcher = Pattern.compile(str).matcher(str2);
        if (matcher.find()) {
            String[] split = matcher.group(1).split("\\.");
            this.f2099a = m1449a(split[0], 2);
            this.f2100b = split.length < 2 ? 0 : m1449a(split[1], 0);
            if (split.length >= 3) {
                i = m1449a(split[2], 0);
            }
            this.f2101c = i;
            return;
        }
        Gdx.app.log("GLVersion", "Invalid version string: " + str2);
        this.f2099a = 2;
        this.f2100b = 0;
        this.f2101c = 0;
    }
}
