package kr.javaPractice.GodOfJava;

public class OuterInner {
    class Inner{
        private int value = 0;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
