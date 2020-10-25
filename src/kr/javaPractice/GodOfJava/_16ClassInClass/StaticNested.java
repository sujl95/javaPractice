package kr.javaPractice.GodOfJava._16ClassInClass;

public class StaticNested {
    private int test = 0;
    static class StaticNested1 {
        static int value = 4;

        public int getValue() {
//            test = 1;

            return 1;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    class Inner {
//        static int value2 = 0;

        public int getValue() {
            test = 1;
            return 2;
        }
    }
}
