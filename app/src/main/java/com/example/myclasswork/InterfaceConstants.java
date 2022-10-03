package com.example.myclasswork;

public class InterfaceConstants implements IAuthorization{

    @Override
    public void login(boolean isUserIsLoggedIn) {
        if (isUserIsLoggedIn){
            System.out.println("user is logged in");
        }
        if (!isUserIsLoggedIn){
            System.out.println("user is not logged in");
        }
    }

    public static void main(String[] args) {
        InterfaceConstants interfaceConstants = new InterfaceConstants();
        interfaceConstants.login(true);
    }

}

interface IAuthorization{

    boolean userIsNotLoggedIn = false;//this is constant(can't be changed)
    boolean userIsLoggedIn = true;//this is constant(can't be changed)

    void login(boolean isUserIsLoggedIn);
}
