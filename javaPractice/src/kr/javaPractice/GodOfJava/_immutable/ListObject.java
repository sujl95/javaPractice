package kr.javaPractice.GodOfJava._immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListObject {

    private final List<Animal> animals;

    public ListObject(final List<Animal> animals) {
        this.animals = new ArrayList<>(animals);
    }

    public List<Animal> getAnimals() {
        return Collections.unmodifiableList(animals);
    }
}
