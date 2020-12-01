package kr.javaPractice.GodOfJava._15String;

public class Json {
    public static void main(String[] args) {
        Member member = new Member("이성준", "sujl@naver.com", 26);
        // member객체를 json으로 변환
        String json = String.format(
                "{\"name\":\"%s\",\"email\":\"%s\",\"age\":%d}",
                member.getName(), member.getEmail(), member.getAge());
        System.out.println(json.length());
        System.out.println(json);
    }
}
