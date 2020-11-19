package kr.javaPractice.JavaOOP.ETC;


class Animal {
    void method() {
        System.out.println("Animal");
    }
}

class Bird extends Animal {
    void method() {
        super.method();
        System.out.println("Bird");
    }
}

class penguin extends Bird {
    void method() {
        super.method();
        System.out.println("penguin");
    }
}


public class Driver {
    public static void main(String[] args) {
        penguin sample = new penguin();
        sample.method();
    }
}
