package kr.javaPractice.GodOfJava._24Map;

import kr.javaPractice.GodOfJava.ETC.Product;
import kr.javaPractice.GodOfJava.ETC.User;

import java.util.HashMap;

public class HashMapSample {
    public static void main(String[] args) {
        HashMap<User, Product> map = new HashMap<>();
        User user = new User(1, "user");
        User user1 = new User(1, "user");
        Product product = new Product(2, "product");
        Product product1 = new Product(3, "product1");
        map.put(new User(3,"user2"), new Product(4,"product2"));
        map.put(user,product);
        user.setCnt(2);
        user.setName("userchange");
        System.out.println(map.get(user));
        System.out.println(user.getCnt());

//        map.put(user1, product);
//        map.put(user,product1);
        map.put(user1, product1);
        Product product2 = map.get(user1);
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("1",1);
        map1.put("1",2);
        System.out.println(map1.get("1"));


        System.out.println(map.get(user));
        System.out.println(map.get(user1));
        System.out.println(map.put(new User(1, "user"),product));
        System.out.println(map.get(new User(1, "user")));
        System.out.println(product2);
        System.out.println(map.get(new User(2,"user1")));

    }
}
