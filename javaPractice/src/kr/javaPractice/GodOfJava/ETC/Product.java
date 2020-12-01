package kr.javaPractice.GodOfJava.ETC;

public class Product {
    private int num = 0;
    private String name = "product";

    public Product(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
