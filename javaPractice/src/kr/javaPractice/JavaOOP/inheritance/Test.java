package kr.javaPractice.JavaOOP.inheritance;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        Dog milk = new Dog();

        milk.habit = "짖다";
        milk.name = "우유";
        milk.showName();
        milk.showHabit();
        milk.showName("자식");
//        System.out.println(Dog.i);

//        System.out.println(Dog.i);
//        dog = new Animal();
        Animal samoyed = new Dog();
        samoyed.name = "사모예드";
        samoyed.showName();
    }

}
