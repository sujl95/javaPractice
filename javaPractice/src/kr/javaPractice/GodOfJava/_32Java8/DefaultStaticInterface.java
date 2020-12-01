package kr.javaPractice.GodOfJava._32Java8;

public interface DefaultStaticInterface {
    static final String name = "GodOfJavaBook";
    static final int since = 2013;

    String getName();
    int getSince();
    default String getEmail() {
        return name+"@godofjava.com";
    }
}
