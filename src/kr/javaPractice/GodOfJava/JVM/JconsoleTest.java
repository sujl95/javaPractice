package kr.javaPractice.GodOfJava.JVM;

import java.util.*;

public class JconsoleTest {

    public static void main(String[] args) {

        boolean ck = true;
        List<String> list = new ArrayList<>();
        int cnt =0;
        int bk = 3;
        int test = 100;
        while(ck){
            cnt++;
            test %= 3;
            list.add("" + cnt);
            if (cnt == 1000000000) {
                System.gc();
                cnt = 0;
                bk++;
                if(bk == 3) break;
            }
        }
    }
}
