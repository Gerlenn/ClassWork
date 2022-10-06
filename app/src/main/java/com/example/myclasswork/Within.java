package com.example.myclasswork;

public class Within {

    private String privateVar = "Hello";
    String publicVar = "Hello";
    static String staticVar = "Hello";

    public static void main(String[] args) {
        Within within = new Within();
        within.callInnerClass();
        within.callNestedClass();

    }

    void callInnerClass(){
        InnerClass innerClass = new InnerClass();
       // innerClass.callOuterClassVariable();
        System.out.println(innerClass.Innerage + " inner class called");
    }
    void callNestedClass(){
        NestedClass nestedClass = new NestedClass();
        //nestedClass.callOuterClassVariable();
        System.out.println(nestedClass.Nestedage + " nested class called");
    }

    class InnerClass{
        int Innerage = 18;
        void  callOuterClassVariable(){
            System.out.println(privateVar);
            System.out.println(publicVar);
            System.out.println(staticVar);
        }
    }

    static class NestedClass{
        int Nestedage = 18;
        void callOuterClassVariable(){
            //System.out.println(PrivateVar);
            //System.out.println(publicVar);
            System.out.println(staticVar);
        }
    }
}


