package kr.javaPractice.GodOfJava._immutable;

public class BaseObject {
    private final int value;
    public BaseObject(final int value){
        this.value  = value;
    }

    public int getValue() {
        return value;
    }
}
