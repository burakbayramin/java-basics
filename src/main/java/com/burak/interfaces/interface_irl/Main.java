package com.burak.interfaces.interface_irl;

public class Main {
    public static void main(String[] args) {
        SignUpManager signUpManager = new SignUpManager(new ComplexUserCheckService());
        signUpManager.signUp(new User(93847,"Burak", 22));

    }
}
