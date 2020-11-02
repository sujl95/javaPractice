package kr.javaPractice.GodOfJava.ETC;

import java.util.Date;

public class DateSample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        long time = date.getTime();
        System.out.println(time);

        date.setTime(0);
        System.out.println(date);
    }
}
