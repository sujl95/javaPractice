package kr.javaPractice.test;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest {

	public static void main(String[] args) {
		ConcurrentHashMap<Long, Long> map = new ConcurrentHashMap<>();
		Map<Long, Long> hashMap = new HashMap<>();
		Map<String, Integer> synchronizedMap = Collections.synchronizedMap(new HashMap<>());

		for (long i = 0; i < 10_000_000_000L; i++) {
			hashMap.put(i, i);
		}

	}

}
