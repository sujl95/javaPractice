package kr.javaPractice.JavaOOP.TMemory;

import java.time.LocalTime;

class Penguin {
//    void test(Penguin this) {
//        System.out.println("Test");
//    }
    void test(){
        System.out.println("Test");
    }
}

public class Driver {
    public static void main(String[] args){
        Penguin pororo = new Penguin();
        Penguin pororo1 = new Penguin();
        Penguin pororo2 = new Penguin();
        pororo.test();
        pororo1.test();
        pororo2.test();
    }
}
