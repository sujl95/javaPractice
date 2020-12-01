package kr.javaPractice.JavaOOP.DesignPattern.templateCallbackPattern;

import kr.javaPractice.JavaOOP.DesignPattern.templateCallbackPattern.Strategy;
import kr.javaPractice.JavaOOP.DesignPattern.templateCallbackPattern.*;

public class Client {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();
        
        rambo.runContext("총");
        System.out.println();

        rambo.runContext("칼");
        System.out.println();

        rambo.runContext("도끼");
        
    }
}
