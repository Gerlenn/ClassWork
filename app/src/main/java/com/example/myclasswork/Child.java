package com.example.myclasswork;

public class Child extends Parent{
    protected int age = 12;
    //Полиморфизм
    @Override
    void speak() {

        super.speak();
        System.out.println("I speak loudly");
    }

    public static void main(String[] args) {
        Parent child = new Child();
        Parent parent = new Parent();

        child.eyeCollor = "green";
        System.out.println("eye collor of the child " + child.eyeCollor);
        System.out.println("eye collor of the parent " + parent.eyeCollor);
        child.speak();
        //parent.speak();

    }
    //Перегрузка
    void phoneNumber(int number){

    }

    void phoneNumber(int number, String mobile_operator){

    }
}

class Parent{
    protected String eyeCollor = "blue";

    void speak(){
        System.out.println("I speak quietly");
    }
}
