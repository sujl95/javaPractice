package kr.javaPractice.GodOfJava.ETC;

import kr.javaPractice.Main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExampleLogger {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {


        int[] arr = new int[5];
        try{
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
