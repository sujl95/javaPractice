package kr.javaPractice.GodOfJava._24Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        sample.checkRemove();
    }

    public void checkHashMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
    }

    public void checkKeySet() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("B", "B");
        map.put("C", "c");
        map.put("D", "d");
        map.put("E", "e");
        map.put("F", "f");
        map.put("G", "g");
        map.put("H", "h");
        map.put("I", "i");
        map.put("J", "j");
        Set<String> keySet = map.keySet();
        for (String tempKey : keySet) {
            System.out.println(tempKey+"="+map.get(tempKey));
        }
    }

    public void checkValues() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("C", "c");
        map.put("D", "d");

        String collect = map.values().stream().collect(Collectors.joining());
        System.out.println(collect);
//        map.values().forEach(System.out::println);
//        map.values().stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
//        for (String tempValues : values) {
//            System.out.println(tempValues);
//        }
    }

    public void checkHashMapEntry() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        map.entrySet().forEach(System.out::println);
//        Set<Map.Entry<String, String>> entries = map.entrySet();
//        for(Map.Entry<String,String> tempEntry:entries){
//            System.out.println(tempEntry.getKey()+"="+tempEntry.getValue());
//        }
//        map.entrySet().stream().forEach(new Consumer<Map.Entry<String, String>>() {
//            @Override
//            public void accept(Map.Entry<String, String> stringStringEntry) {
//                System.out.println(stringStringEntry);
//            }
//        });
    }

    public void checkContains() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("Z"));
        System.out.println(map.containsValue("a"));
        System.out.println(map.containsValue("z"));
    }

    public void checkRemove() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.remove("A");
        System.out.println(map.size());
    }
}
