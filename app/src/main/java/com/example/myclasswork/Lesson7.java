package com.example.myclasswork;

import android.widget.Switch;

public class Lesson7 {

    static IRepository iRepository;

    public static void main(String[] args) {

        iRepository = new RepositoryImpl();
        iRepository.login("name","31231");
    }
}
// работа с Enum
enum Shop{
    OPEN,
    CLOSE
}

class Shops{

    final String open = "open";
    final String close = "close";

    public static void main(String[] args) {
        Shop shop = Shop.CLOSE;

        switch (shop){
            case OPEN:
                System.out.println("Shop is open");
                break;
            case CLOSE:
                System.out.println("Shop is close");
                break;
        }
    }
}

