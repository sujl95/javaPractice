package kr.javaPractice.Practice.DesignPattern.TemplateCallback;

public class Client {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();
        
        rambo.runContext("활");
        rambo.runContext("총");
        rambo.runContext("검");
    }
}
