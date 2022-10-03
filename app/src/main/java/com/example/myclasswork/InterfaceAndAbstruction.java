package com.example.myclasswork;

public class InterfaceAndAbstruction {

    public static void main(String[] args) {

    }
}

abstract class Bird1{

    abstract void walk();
}
interface FlyingBird{
    void fly();
}

class Crown extends Bird1 implements FlyingBird{

    @Override
    void walk() {

    }

    @Override
    public void fly() {

    }
}

class Papugai extends Bird1 implements FlyingBird{

    @Override
    void walk() {

    }

    @Override
    public void fly() {

    }
}

class Penguin extends Bird1{

    @Override
    void walk() {

    }
}

