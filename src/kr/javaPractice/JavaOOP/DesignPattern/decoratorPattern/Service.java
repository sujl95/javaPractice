package kr.javaPractice.JavaOOP.DesignPattern.decoratorPattern;

import kr.javaPractice.JavaOOP.DesignPattern.decoratorPattern.IService;

public class Service implements IService {
    public String runSomething() {
        return "서비스 짱!!!";
    }
}
