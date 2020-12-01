package kr.javaPractice.GodOfJava._immutable;

//public class Animal {
//    private final Age age;
//
//    public Animal(final Age age){
//        this.age = age;
//    }
//
//    public Age getAge() {
//        return age;
//    }
//}
//
//class Age {
//    private int value;
//    public Age(final int value){
//        this.value = value;
//    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }
//
//    public int getValue() {
//        return value;
//    }
//}

public class Animal {

    private final Age age;

    public Animal(final Age age) {
        this.age = age;
    }

    public Age getAge() {
        return age;
    }
}

class Age {

    private final int value;

    public Age(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}