package com.example.myclasswork;

public class FunInterface {

    public static void main(String[] args) {
//        Operationable operationable = new Operationable() {//это было бы до "лямбд"
//            @Override
//            public int calculate(int a, int b) {
//                return a + b;
//            }
//        };
        Operationable operationable;
        operationable = ((a, b) -> a * b + 22);

        int result = operationable.calculate(10, 10);
        System.out.println(result);
//1.Predicate
        Operationable2<Integer> operationable2;
        operationable2 = ((a, b) -> a > b);

        boolean result2 = operationable2.calculate(10, 20);
        System.out.println(result2);
//2.Function
        Operationable3<Integer, String> operationable3;
        operationable3 = ((a, b) -> {
            return a + b + " I will be back";
        });

        String result3 = operationable3.calculate(10, 20);
        System.out.println(result3);

//3.Consumer
        Operationable4<Integer> operationable4;
        operationable4 = ((a, b) ->  System.out.println(a+b));

        operationable4.calculate(10, 20);
    }
}

@FunctionalInterface
interface Operationable {

    int calculate(int a, int b);
}

//1.Predicate
interface Operationable2<T> {

    boolean calculate(T t, T t1);
}

//2.Function
interface Operationable3<T, R> {

    R calculate(T t, T t1);
}

//3. Consumer
interface Operationable4<T> {

    void calculate(T t, T t1);
}