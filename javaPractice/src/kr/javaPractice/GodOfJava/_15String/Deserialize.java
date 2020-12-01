package kr.javaPractice.GodOfJava._15String;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.Base64;

public class Deserialize {
    public static void main(String[] args){
        // 직렬화 예제에서 생성된 base64 데이터
        String base64Member = "rO0ABXNyACprci5qYXZhUHJhY3RpY2UuR29kT2ZKYXZhLl8xNVN0cmluZy5NZW1iZXI2WVYbBnRfnQIAA0kAA2FnZUwABWVtYWlsdAASTGphdmEvbGFuZy9TdHJpbmc7TAAEbmFtZXEAfgABeHAAAAAadAAOc3VqbEBuYXZlci5jb210AAnsnbTshLHspIA=";
        byte[] serializedMember = Base64.getDecoder().decode(base64Member);
        try (ByteArrayInputStream bais = new ByteArrayInputStream(serializedMember)) {
            try (ObjectInputStream ois = new ObjectInputStream(bais)) {
                // 역직렬화된 Member 객체를 읽어온다.
                Object objectMember = ois.readObject();
                Member member = (Member) objectMember;
                System.out.println(member);
            } catch (Exception e){

            }
        } catch (Exception e){

        }
    }
}
