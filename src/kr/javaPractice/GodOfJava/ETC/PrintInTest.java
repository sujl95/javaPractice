package kr.javaPractice.GodOfJava.ETC;

import java.util.logging.Logger;

public class PrintInTest {
    private static final Logger logger = Logger.getLogger(PrintInTest.class.getName());
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i<1000000; i++){
            count++;
//            System.out.println("abc");
            logger.info("abc");

        }

        long finish = System.currentTimeMillis();
        System.out.println("==============");
        System.out.println("count : " + count);
        System.out.println("걸린시간(ms) : " + (finish - start));
    }

}
