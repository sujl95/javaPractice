package kr.javaPractice.JavaOOP.ETC;

public class CallByReference {
    public static void main(String[] args) {
        Event event = new Event();
        Event event1 = event;

        event.id = 10;
        event1.id = 20;

        System.out.println(event.id);
        System.out.println(event1.id);


    }
}

class Event {
    public static int id;

}
