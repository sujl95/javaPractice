# 자바와 절차적 구조적 프로그래밍

## Call By Value

- 메서드를 호출하면서 인자로 전달되는 것은 변수 자체가 아니라 변수가 저장한 값만을 복제해서 전달한다.  이런 전달 방식을 값에 의한 전달

```java
public class CallByValue {

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 20;
        System.out.println(a);
        System.out.println(b);
    }
}
//결과 
10
20
```

## Call By Reference

- 참조에 의한 호출

```java
public class CallByReference {
    public static void main(String[] args) {
        Event event = new Event();
        Event event1 = new Event();

        event.id = 10;
        event1.id = 20;

        System.out.println(event.id);
        System.out.println(event1.id);

    }
}

class Event {
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

//결과
20
20
```

### Call By Value와 Call By Reference

- Call By Value는 값을 그 값 자체로 판단
- Call By Reference는 값을 주소로 판단