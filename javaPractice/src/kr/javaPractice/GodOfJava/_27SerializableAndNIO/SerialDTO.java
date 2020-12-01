package kr.javaPractice.GodOfJava._27SerializableAndNIO;

import java.io.Serializable;

public class SerialDTO implements Serializable {
    //Serializable  있는 이유 타겟팅을 하기위해서
    static final long serialVersionUID=1L;
    private String bookType = "IT";
    private String bookName;
    private int bookOrder;
    private boolean bestSeller;
    private long soldPerDay;

    public SerialDTO(String bookName, int bookOrder, boolean bestSeller, long soldPerDay) {
        super();
        this.bookName = bookName;
        this.bookOrder = bookOrder;
        this.bestSeller = bestSeller;
        this.soldPerDay = soldPerDay;
    }

    @Override
    public String toString() {
        return "SerialDTO{" +
                "bookType='" + bookType + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookOrder=" + bookOrder +
                ", bestSeller=" + bestSeller +
                ", soldPerDay=" + soldPerDay +
                '}';
    }
}
