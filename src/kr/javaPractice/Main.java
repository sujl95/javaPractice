package kr.javaPractice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args)  throws Exception{
        int utf8 = "한".getBytes("UTF-8").length;
        int utf81 = "a".getBytes("UTF-8").length;
        int utf82 = "A".getBytes("UTF-8").length;
        int utf83 = "한1".getBytes("UTF-8").length;
        int utf16 = "한".getBytes("UTF-16").length;
        int utf161 = "한1".getBytes("UTF-16").length;
        int utf162 = "한A".getBytes("UTF-16").length;
        int utf163 = "A".getBytes("UTF-16").length;
        int utf164 = "a".getBytes("UTF-16").length;
        int utf165 = "aa".getBytes("UTF-16").length;
        String s = "a";
        char c = '한';

        System.out.println("한="+utf8);
        System.out.println("a="+utf81);
        System.out.println("A="+utf82);
        System.out.println("한1="+utf83);
        System.out.println("한="+utf16);
        System.out.println("한1="+utf161);
        System.out.println("한A="+utf162);
        System.out.println("A="+utf163);
        System.out.println("a="+utf164);
        System.out.println("aa="+utf165);
        System.out.println(new String("한".getBytes(),"UTF-8"));
        System.out.println("\uD83D\uDE00".getBytes().length);
        BigDecimal bd1 = new BigDecimal("1.11234");
        BigDecimal bd2 = new BigDecimal("1.11234");
        System.out.println(bd1.toString()+bd2.toString());
        float f = 1.11234f;
        float f1 = 1.112341f;
        System.out.println(f+f1);


    }
}
