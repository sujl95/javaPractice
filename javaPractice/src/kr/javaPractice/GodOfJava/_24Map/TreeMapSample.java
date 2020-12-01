package kr.javaPractice.GodOfJava._24Map;

import java.util.TreeMap;

public class TreeMapSample {
    public static void main(String[] args) {
        TreeMapSample sample = new TreeMapSample();
        sample.checkTreeMap();
    }

    public void checkTreeMap() {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("A", "a");
        map.put("가", "e");
        map.put("1", "f");
        map.put("a", "g");

        map.entrySet().forEach(System.out::println);
    }
}
