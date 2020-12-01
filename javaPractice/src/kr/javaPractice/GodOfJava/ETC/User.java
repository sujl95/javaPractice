package kr.javaPractice.GodOfJava.ETC;

public class User {
    private int cnt = 0;
    private String name = "name";

    public User(int cnt, String name) {
        this.cnt = cnt;
        this.name = name;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
