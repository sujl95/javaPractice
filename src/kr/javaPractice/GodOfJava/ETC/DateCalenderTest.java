package kr.javaPractice.GodOfJava.ETC;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateCalenderTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        String stringDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
        System.out.println(stringDate);
//
//        calendar.add(Calendar.DATE, 1);
//        date = calendar.getTime();
//        stringDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
//        System.out.println(stringDate);
//
//        // 오늘 날짜, 2020-11-02
//        LocalDate nowDate = LocalDate.now();
//        System.out.println(nowDate);
//        // 2020년 11월 02일
//        LocalDate ofDate = LocalDate.of(2020, 11, 02);
//        System.out.println(ofDate);
//        // 현재 시간, 2020-11-02T02-50:11.032435800
//        LocalDateTime nowDateTime = LocalDateTime.now();
//        System.out.println(nowDateTime);
//        // 2020년 11월 2일 2시 49분 30초
//        LocalDateTime ofDateTime = LocalDateTime.of(2020, 11, 02, 02, 49,30);
//        System.out.println(ofDateTime);
//
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
//        String sDate = LocalDate.now().atStartOfDay().format(formatter);
//        System.out.println(sDate);

//        LocalDateTime ofDateTime = LocalDateTime.of(2020, 11, 02, 02, 56, 00);
//        System.out.println(ofDateTime);
//        LocalDateTime tomorrow = ofDateTime.plusDays(1);
//        System.out.println(tomorrow);

        // 2020년 11월 03일 23시 59분 59초
        // 정확히는~ 23:59:59.999999999
        System.out.println(LocalDateTime.now().plusDays(1).with(LocalTime.MAX));
    }
}
