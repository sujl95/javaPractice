package kr.javaPractice.GodOfJava._32Java8;

public class DefaultImplementedChild implements DefaultStaticInterface{
    public static void main(String[] args) {
        DefaultImplementedChild sample = new DefaultImplementedChild();
        System.out.println(sample.getName());
        System.out.println(sample.getSince());
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSince() {
        return since;
    }
}
