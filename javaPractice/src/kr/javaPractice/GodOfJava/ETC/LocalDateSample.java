package kr.javaPractice.GodOfJava.ETC;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LocalDateSample {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now(); //현재 날짜
        LocalDate ofDate = LocalDate.of(2020, 11,02); //지정 날짜
        LocalDate parseDate = LocalDate.parse("2020-11-02"); //문자열로 날짜 지정
        System.out.println(nowDate);
        System.out.println(ofDate);
        System.out.println(parseDate);
        System.out.println("getYear="+parseDate.getYear());
        System.out.println("getMonth="+parseDate.getMonth());
        System.out.println("getMonthValue="+parseDate.getMonthValue());
        System.out.println("getDayOfYear="+parseDate.getDayOfYear());
        System.out.println("getDayOfMonth="+parseDate.getDayOfMonth());
        System.out.println("getDayOfWeek="+parseDate.getDayOfWeek());
        System.out.println("getDayOfMonth="+parseDate.getDayOfMonth());
        System.out.println("isLeapYear="+parseDate.isLeapYear());
    }
}
