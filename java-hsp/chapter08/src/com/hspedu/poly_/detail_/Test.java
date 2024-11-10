package com.hspedu.poly_.detail_;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.b);
    }
}
class A{
    int b = 10;
}

class B extends A{
    int a = 12;


}
