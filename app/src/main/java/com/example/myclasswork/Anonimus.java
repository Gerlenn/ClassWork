package com.example.myclasswork;

public class Anonimus {

    static  IRepository iRepository = new IRepository() {
        @Override
        public void login(String userName, String password) {// анонимный класс с help of
            System.out.println("hello");
        }
    };

    public static void main(String[] args) {
        iRepository.login("name", "1231");
        Anonym anonym = new Anonym(){ //анонимный класс
            @Override
            void hackNetwork() {
                super.hackNetwork();// поведение родителя
                System.out.println("i don't hacked the world");//переопределили родительский метод
            }
        };
        anonym.hackNetwork();
    }
}

class Anonym{

    void hackNetwork(){
        System.out.println("I hacked the world");
    }
}
