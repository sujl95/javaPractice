package kr.javaPractice.GodOfJava._22List;

import java.util.ArrayList;
import java.util.Arrays;

public class ListSample {
    public static void main(String[] args) {
        ListSample sample = new ListSample();
        sample.checkArrayList2();
    }

    public void checkArrayList1() {
        ArrayList list1 = new ArrayList();
        list1.add(new Object());
        list1.add("ArrayListAmple");
        list1.add(new Double(1));

        System.out.println(list1);
    }

    public void checkArrayList2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add(1, "A1");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("0 ");
        list2.addAll(list);
        list2.forEach(System.out::println);
//        for (String tempData : list2) {
//            System.out.println(tempData);
//        }

        System.out.println(list2);

    }

    public void checkArrayList4() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");

        ArrayList<String> list2 = list;
        list.add("Ooops");
        for (String tempData : list2) {
            System.out.println("List2 " + tempData);
        }
    }

    public void checkArrayList6() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("A");
        String[] strList = list.toArray(new String[0]);
        System.out.println(Arrays.toString(strList));

    }

    public void checkArrayList7() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        String[] tempArray = new String[3];
        String[] strList = list.toArray(tempArray);
        System.out.println(Arrays.toString(strList));

    }

    public void checkArrayList8() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        System.out.println("Removed " + list.remove(0));
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
