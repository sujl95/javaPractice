package kr.javaPractice;


import java.util.*;

public class Main {

    public static void main(String[] args)  {
        Complex c1=new Complex(3.0,2.0);
        Complex c2=new Complex(1.0,7.0);
        Complex r1=c1.add(c2);
        Complex r2=c1.multiply(c2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(r1);
        System.out.println(r2);
        Complex d1=new Complex(3.0,2.0);
        System.out.println(c1.equals(d1));//true가 되어야하는데 false가떠요...
        System.out.println(c2.equals(d1));

    }
}

class Complex {
    double real;
    double imaginary;
    Complex(){
        this.real=0.0;
        this.imaginary=0.0;
    }
    Complex(double real){
        this.real=real;
        this.imaginary=0.0;
    }
    Complex(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public String toString() {
        return real+"+"+imaginary+"i";
    }
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImaginary() {
        return imaginary;
    }
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
    Complex add(Complex o) {
        Complex com=new Complex();
        com.real=this.real+o.real;
        com.imaginary=this.imaginary+o.imaginary;
        return com;
    }
    Complex multiply(Complex o) {
        Complex com=new Complex();
        com.real=this.real*o.real-this.imaginary*o.imaginary;
        com.imaginary=this.real*o.imaginary+this.imaginary*o.real;
        return com;
    }
    boolean equals(Complex o) {
        Complex com=new Complex();

        if(o == this) return true;
        if(!(o instanceof Complex)) {
            return false;
        }

        Complex complex = (Complex) o;
        return real == complex.real && imaginary == complex.imaginary ;
        //현재의 수와 매개변수로 넘어온 수가 같으면 true, 그렇지 않으면 false 반환
        //이부분을 어떻게 채워야할지 모르겠어요..

    }




}
