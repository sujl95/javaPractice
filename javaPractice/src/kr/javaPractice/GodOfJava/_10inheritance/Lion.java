package kr.javaPractice.GodOfJava._10inheritance;

public class Lion implements AnimalInterFace {

    @Override
    public void sound() {
        System.out.println("크아앙");
        System.out.println("제 나이는"+ age + "살 입니다.");
    }
}
