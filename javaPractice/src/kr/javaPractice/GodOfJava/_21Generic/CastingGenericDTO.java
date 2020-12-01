package kr.javaPractice.GodOfJava._21Generic;

import java.io.Serializable;

public class CastingGenericDTO<TheWing> implements Serializable {
    private TheWing object;

    public TheWing getObject() {
        return object;
    }

    public void setObject(TheWing object) {
        this.object = object;
    }
}
