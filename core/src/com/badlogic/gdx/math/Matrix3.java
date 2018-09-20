package com.badlogic.gdx.math;

import java.io.Serializable;

public class Matrix3 implements Serializable {
    private static final long serialVersionUID = 7907569533774959788L;
    private float[] tmp = new float[9];
    public float[] val = new float[9];

    public Matrix3() {
        float[] fArr = this.val;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public String toString() {
        float[] fArr = this.val;
        return "[" + fArr[0] + "|" + fArr[3] + "|" + fArr[6] + "]\n[" + fArr[1] + "|" + fArr[4] + "|" + fArr[7] + "]\n[" + fArr[2] + "|" + fArr[5] + "|" + fArr[8] + "]";
    }
}
