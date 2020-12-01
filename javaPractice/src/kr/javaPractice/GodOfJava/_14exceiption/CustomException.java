package kr.javaPractice.GodOfJava._14exceiption;

public class CustomException {
    public static void main(String[] args) throws Throwable{
        CustomException sample = new CustomException();


        try {
            sample.throwMyException(13);
        } catch (MyException mye) {
            mye.printStackTrace();
        }
//        try {
            sample.fillInStackTrace(13);
//        } catch (MyException e) {
//            throw e.fillInStackTrace();
//        }
    }

    private void throwMyException(int number) throws MyException{
        try {
            if(number > 12) {
                throw new MyException("Number is over than 12");
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    private void fillInStackTrace(int number) throws Throwable{
        try {
            if(number > 12) {
                throw new MyException("Number is over than 12");
            }
        } catch (MyException e) {
            throw e.fillInStackTrace();
        }
    }
}
