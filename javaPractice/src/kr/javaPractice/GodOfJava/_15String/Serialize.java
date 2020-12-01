package kr.javaPractice.GodOfJava._15String;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Base64;

public class Serialize {
    public static void main(String[] args) {
        Member member = new Member("이성준", "sujl@naver.com", 26);
        byte[] serializedMember;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
                oos.writeObject(member);
                // serializedMember -> 직렬화된 member 객체
                serializedMember = baos.toByteArray();
                // 바이트 배열로 생성된 직렬화 데이터를 base64로 변환
                System.out.println(serializedMember.length);
                System.out.println(Arrays.toString(serializedMember));
                System.out.println(Base64.getEncoder().encodeToString(serializedMember));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
