package kr.javaPractice.GodOfJava.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayLinkedList {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        LinkedList<Object> linkedList = new LinkedList<>();

        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");

        System.out.println(arrayList);

        linkedList.remove(1);
        linkedList.add("2");

        System.out.println(linkedList);
        System.out.println(linkedList.get(0));
        System.out.println("ck");
        String[] strlist1 = arrayList.toArray(new String[2]);

        System.out.println(Arrays.toString(strlist1));



    }
}
