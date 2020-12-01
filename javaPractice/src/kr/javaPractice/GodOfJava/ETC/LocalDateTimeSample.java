package kr.javaPractice.GodOfJava.ETC;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.util.Arrays;

public class LocalDateTimeSample {
    public static void main(String[] args) {
        LocalDateTime nowDateTime = LocalDateTime.now(); //현재 시간
        LocalDateTime nowDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now()); // 현재 날짜와 시간
        LocalDateTime paresDateTime = LocalDateTime.parse("2020-11-02T21:59:59.999"); // 문자열 지정된 날짜 시간
        LocalDateTime ofDateTime = LocalDateTime.of(2020,11,02,21,59,00); //정수형으로 지정된 날짜 시간
        LocalDateTime ofNanoDateTime = LocalDateTime.of(2020,11,02,21,59,00,55); //나노초 포함
        LocalDateTime ofDateTime2 = Year.of(2020).atMonth(11).atDay(02).atTime(14, 15); //시간 분
        LocalDateTime ofDateTime3 = Year.of(2020).atMonth(11).atDay(02).atTime(14, 15, 50); //시간 분 초
        LocalDateTime ofDateTime4 = Year.of(2020).atMonth(11).atDay(02).atTime(14, 15, 50,3); // 시간 분 초 나노초
        System.out.println("nowDateTime = " + nowDateTime);
        System.out.println("nowDateTime2 = " + nowDateTime2);
        System.out.println("paresDateTime = " + paresDateTime);
        System.out.println("ofDateTime = " + ofDateTime);
        System.out.println("ofNanoDateTime = " + ofNanoDateTime);
        System.out.println("ofDateTime2 = " + ofDateTime2);
        System.out.println("ofDateTime3 = " + ofDateTime3);
        System.out.println("ofDateTime4 = " + ofDateTime4);
        System.out.println("getDayOfMonth = " + nowDateTime.getDayOfMonth());
        System.out.println("getDayOfWeek = " + nowDateTime.getDayOfWeek());
        System.out.println("getDayOfYear = " + nowDateTime.getDayOfYear());
        System.out.println("getYear = " + nowDateTime.getYear());
        System.out.println("getHour = " + nowDateTime.getHour());
        System.out.println("getMinute = " + nowDateTime.getMinute());
        System.out.println("getSecond = " + nowDateTime.getSecond());
        System.out.println("getNano = " + nowDateTime.getNano());
        System.out.println("plusYears = " + nowDateTime.plusYears(1));
        System.out.println("plusMonths = " + nowDateTime.plusMonths(1));
        System.out.println("plusDays = " + nowDateTime.plusDays(1));
        System.out.println("plusHours = " + nowDateTime.plusHours(1));
        System.out.println("plusMinutes = " + nowDateTime.plusMinutes(1));
        System.out.println("plusSeconds = " + nowDateTime.plusSeconds(1));

        System.out.println();
        System.out.println(nowDateTime.isBefore(nowDateTime2));
        System.out.println(nowDateTime.isEqual(nowDateTime2));
        System.out.println(nowDateTime.isAfter(nowDateTime2));
    }
}
