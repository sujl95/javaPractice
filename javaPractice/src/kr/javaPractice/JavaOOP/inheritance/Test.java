package kr.javaPractice.JavaOOP.inheritance;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.habit = "짖다";
        dog.name = "우유";
        dog.showHabit();
        dog.showName();
        dog.showName("자식");

//        dog = new Animal();

        Animal animal = new Dog();
        animal.name = "사모예드";
        animal.showName();

    }

}
