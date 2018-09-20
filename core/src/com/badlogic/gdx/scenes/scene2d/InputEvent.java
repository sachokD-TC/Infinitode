package com.badlogic.gdx.scenes.scene2d;

public class InputEvent extends C0586c {
    /* renamed from: i */
    public Type f2559i;
    /* renamed from: j */
    public float f2560j;
    /* renamed from: k */
    public float f2561k;
    /* renamed from: l */
    public int f2562l;
    /* renamed from: m */
    public int f2563m;
    /* renamed from: n */
    int f2564n;
    /* renamed from: o */
    int f2565o;
    /* renamed from: p */
    char f2566p;
    /* renamed from: q */
    C0602b f2567q;

    public enum Type {
        touchDown,
        touchUp,
        touchDragged,
        mouseMoved,
        enter,
        exit,
        scrolled,
        keyDown,
        keyUp,
        keyTyped
    }

    /* renamed from: a */
    public final void mo360a() {
        super.mo360a();
        this.f2567q = null;
        this.f2563m = -1;
    }

    public String toString() {
        return this.f2559i.toString();
    }
}
