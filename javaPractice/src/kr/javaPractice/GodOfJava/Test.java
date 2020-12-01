package kr.javaPractice.GodOfJava;

import java.sql.Timestamp;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());
        Timestamp timestamp = new Timestamp(2020,11,20,11,11,11,11);
        System.out.println(date);
    }
}
