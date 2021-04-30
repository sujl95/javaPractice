package kr.javaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class test1 {

	static String[] strings;

	public static void main(String[] args) {
		// Instant now = Instant.now();
		// long timeMillis = System.currentTimeMillis();
		// LocalDateTime time = LocalDateTime.now();
		// System.out.println("now = " + now);
		// System.out.println("timeMillis = " + timeMillis);
		// System.out.println("time = " + time);
		Scanner sc = new Scanner(System.in);

		System.out.println("strings = " + Arrays.toString(strings));
		strings = sc.nextLine().split(" ");
		System.out.println("strings = " + Arrays.toString(strings));

	}
}