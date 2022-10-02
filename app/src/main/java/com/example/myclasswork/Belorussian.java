package com.example.myclasswork;

public class Belorussian extends Human{
    public static void main(String[] args) {
        Belorussian belorus = new Belorussian();
        German german = new German();
        belorus.speakLanguage();
        german.speakLanguage();
    }

    @Override
    void speakLanguage() {
        System.out.println("Speak belorussian language");
    }
}

class German extends Human{
    @Override
    void speakLanguage() {
        System.out.println("Speak german language");
    }
}

abstract class Human{
    abstract void speakLanguage();
}
