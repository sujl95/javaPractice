package kr.javaPractice.GodOfJava.ETC;

import kr.javaPractice.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExampleLogger {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("123");
        list.add("123");
        System.out.println(list);

        int[] arr = new int[5];
        try{
            System.out.println(arr);
            System.out.println(arr[5]);
        } catch (Exception e) {
            logger.log(Level.SEVERE,"SEVERE, {0}" ,e.toString());
            logger.log(Level.WARNING, "WARING, {0}",e.toString());
            logger.log(Level.INFO, "INFO, {0}" , e.toString());
            logger.info(e.toString());
            e.printStackTrace();
        }
        System.out.println();
    }
}
