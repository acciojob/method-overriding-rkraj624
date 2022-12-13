package com.driver;

public class Main {
    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        @Override
        public  String meth(){
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {

        A obj = new B();
//        obj.meth();
        System.out.println(obj.meth());
//        B obj1 = new B();
//        obj1.meth();
//        System.out.println(obj1.meth());

    }
  
}
