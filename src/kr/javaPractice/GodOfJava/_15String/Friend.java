package kr.javaPractice.GodOfJava._15String;

import java.util.*;

public class Friend implements Comparable<Friend> {
    public String name;
    public int age;

    public Friend(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) throws Exception {
        Friend kim = new Friend("Kim", 36);
        Friend park = new Friend("Park", 20);
        Friend lee = new Friend("Lee", 28);
        Friend yong = new Friend("Yong", 18);

        Friend[] friends = {kim, park, lee, yong};
        Arrays.sort(friends);

        for (Friend a : friends){
            System.out.println("age="+a.getAge()+", name="+a.getName());
        }
        System.out.println();
        List<Friend> listfriends = new ArrayList<>();
        listfriends.add(kim);
        listfriends.add(park);
        listfriends.add(lee);
        listfriends.add(yong);

//        Collections.sort(listfriends);
        Collections.sort(listfriends, new SortFriendByNameInAsc());

        for (Friend a : listfriends){
            System.out.println("age="+a.getAge()+", name="+a.getName());
        }



    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Friend o) {
        return this.age - o.age;
    }
}

class SortFriendByNameInAsc implements Comparator<Friend> {
    @Override
    public int compare(Friend o1, Friend o2) {
        return o2.name.compareTo(o1.name);
    }
}
