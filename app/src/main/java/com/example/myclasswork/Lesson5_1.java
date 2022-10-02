package com.example.myclasswork;

public class Lesson5_1 {
    public static void main(String[] args) {
        Friend friend = new Friend("Gleb", 23, "23.12.1998");
        Friend friend2 = new Friend("Alex", 28);
//        friend.age = 30;
//        friend.name = "Gleb";
        friend.born();
        friend2.born();

    }
}

class Friend{
    private String name;
    private int age;
    private String birthdate;

    public Friend(String name2, int age2, String birthdate2){
        this.name = name2;
        this.age = age2;
        this.birthdate = birthdate2;
    }
    public Friend(String name2, int age2){
        this.name = name2;
        this.age = age2;
    }

    void born(){
        String congratulations = "";
        if (birthdate == null || birthdate.isEmpty()){
            congratulations = name + " has birthday on: " + birthdate + " " + "he is " + age + " years old";
        }else {
            congratulations = name + " has birthday on: " + birthdate + " " + "he is " + age + " years old";
        }
        System.out.println(congratulations);
    }
}
