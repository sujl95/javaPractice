package kr.javaPractice.GodOfJava._immutable;

import java.util.Arrays;

public class ArrayObject {
    private final int[] array;

    public ArrayObject(final int[] array) {
        this.array = Arrays.copyOf(array,array.length);
    }

    public int[] getArray() {
        return (array == null) ? null : array.clone();
    }
}
