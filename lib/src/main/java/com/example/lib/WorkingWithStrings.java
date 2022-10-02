package com.example.lib;

public class WorkingWithStrings {
        static int a = 10;
        public static void main(String[] args) {
            int num = 1000;
            stringExp(String.valueOf(num));

            String course = "TeachMeSkills@";
            if (course.contains("@")){
                System.out.println("Yes");
            }else
                System.out.println("No");

            String checkString1 = "Hello";
            String checkString2 = "Hello";
            String checkString3 = new String("Hello");
            System.out.println(checkString1.equals(checkString2)+" Ура они равны");//сравнивает значения
            System.out.println(checkString1 == checkString3+ " Равны только значения");//сравнивает место в памяти


            String toBeRepl = "I teach ";
            String newStr = toBeRepl.replace("I", "You");//заменяет одно на другое
            System.out.println(newStr);

            String str = "I like programming";
            String subStr = str.substring(2,6);//выводит выделеный дапазон
            System.out.println(subStr);

            String toUpper = "hello";
            String toLower = "HELLO";
            System.out.println(toUpper.toUpperCase() + " " + toLower.toLowerCase());//меняет регистры

            String a = " ";
            String b = " ";
            System.out.println(a.isEmpty());//пробелы не являются пустотой
            //System.out.println(b.isBlank());//пробелы являются пустотой

            String s = "      trim     ";
            System.out.println(s.trim());

            String one = "one";
            System.out.println(one.length());
        }

        static void stringExp(String string){
            System.out.println(string);
        }
}

