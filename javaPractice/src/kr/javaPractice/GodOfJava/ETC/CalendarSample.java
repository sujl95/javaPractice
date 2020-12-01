package kr.javaPractice.GodOfJava.ETC;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarSample {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Calendar greCal = new GregorianCalendar();

        int year = greCal.get(Calendar.YEAR);
        int month = greCal.get(Calendar.MONTH);
        int date = greCal.get(Calendar.DAY_OF_MONTH);

        System.out.println(year+"/"+month+"/"+date);
    }
}
