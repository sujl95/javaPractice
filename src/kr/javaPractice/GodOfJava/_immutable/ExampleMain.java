package kr.javaPractice.GodOfJava._immutable;

import java.util.ArrayList;
import java.util.List;

public class ExampleMain {
    public static void main(String[] args) {
//        MutablePerson person = new MutablePerson(17, 1);
//        System.out.println(person.age);
//        System.out.println(person.name);
//        ImmutablePerson person1 = new ImmutablePerson(26,1);
//        System.out.println(person1.age);
//        System.out.println(person1.name);
//        BaseObject object =new BaseObject(5);
//        System.out.println(object.getValue());

//        Age age = new Age(1);
//        Animal animal = new Animal(age);

//        System.out.println(animal.getAge().getValue());

//        animal.getAge().setValue(10);
//        System.out.println(animal.getAge().getValue());

//        int[] array = {1,2,3};
//        ArrayObject arrayObject = new ArrayObject(array);
//        for(int num : arrayObject.getArray()) {
//            System.out.print(num + " ");
//        }
//
//        System.out.println();
//        array[0] = 999; //arrayObject의 배열 값은 변하지 않는다.
//        for(int num : arrayObject.getArray()){
//            System.out.print(num + " ");
//        }
//        List<Animal> animals = new ArrayList<>();
//        animals.add(new Animal(new Age(1)));
//
//        ListObject listObject = new ListObject(animals);
//
//        for (Animal animal : listObject.getAnimals()) {
//            System.out.print(animal.getAge().getValue());
//        }
//        System.out.println();
//        // Output: 1
//
//        animals.add(new Animal(new Age(2))); // List인 animals에는 추가되지만 listObject의 List에는 추가되지 않는다
//
//        for (Animal animal : listObject.getAnimals()) {
//            System.out.print(animal.getAge().getValue());
//        }
//        System.out.println();
//        // Output: 1


        String a = "choi";
        String b = "choi";
        String c = new String("choi");
        String d = new String("choi");
        System.out.println("a.hashCode(), b.hashCode : "
                + a.hashCode() + " " + b.hashCode() + " " + c.hashCode());
        System.out.println("a==b : " + (a == b));
        System.out.println("a==c : " + (a == c));
        System.out.println("a.equals(b) : " + a.equals(b));
        System.out.println("a.equals(c) : " + a.equals(c));
        c = c.intern();
        System.out.println(c.intern());
        System.out.println("a==b : " + (a == b));
        System.out.println("a==c : " + (a == c));
        System.out.println("a.hashCode(), b.hashCode : "
                + a.hashCode() + " " + b.hashCode() + " " + c.hashCode());
        System.out.println();
        System.out.println(d.equals(c));
        String e = "choi1";
        String f = "choi2";
        String g = "choi5";
        System.out.println(e.hashCode());
        System.out.println(f.hashCode());
        System.out.println(g.hashCode());
    }
}
