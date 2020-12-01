package kr.javaPractice.GodOfJava.ETC;

import java.time.LocalTime;

public class LocalTimeSample {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now(); //현재 시간
        LocalTime ofTime = LocalTime.of(21,30,30); //지정 시간
        LocalTime ofNanoTime = LocalTime.of(21,30,30, 30); // 지정 시간(나노초 포함)
        LocalTime plusHours = ofTime.plusHours(5);
        LocalTime plusMinutes = ofTime.plusMinutes(5);
        LocalTime plusSeconds = ofTime.plusSeconds(5);
        LocalTime minusHours = ofTime.minusHours(5);
        LocalTime minusMinutes = ofTime.minusMinutes(5);
        LocalTime minusSeconds = ofTime.minusSeconds(5);
        System.out.println(nowTime);
        System.out.println(ofTime);
        System.out.println(ofNanoTime);
        System.out.println("plusHours="+plusHours);
        System.out.println("plusMinutes="+plusMinutes);
        System.out.println("plusSeconds="+plusSeconds);
        System.out.println("minusHours="+minusHours);
        System.out.println("minusMinutes="+minusMinutes);
        System.out.println("minusSeconds="+minusSeconds);
        System.out.println("getHour="+ofTime.getHour());
        System.out.println("getMinute="+ofTime.getMinute());
        System.out.println("getSecond="+ofTime.getSecond());
        System.out.println("getNano="+ofTime.getNano());
        System.out.println();
        System.out.println(nowTime.isBefore(ofTime));
        System.out.println(nowTime.isAfter(ofTime));
    }
}
