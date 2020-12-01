package kr.javaPractice.GodOfJava.ETC;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.logging.Logger;

public class PrintlnTest {
    static final Logger logger = Logger.getLogger(PrintlnTest.class.getName());

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
//        System.setOut(new PrintStream(new FileOutputStream("log.txt")));
        int count = 0;
        for (int i = 0; i < 1000000; i++) {
            count++;
//            System.out.println("abc");
//            logger.info("abc");
        }

        long finish = System.currentTimeMillis();

        System.out.println("=====================");
        System.out.println("count : "+count);
        System.out.println("걸린시간(ms) :" + (finish - start));
    }
}
