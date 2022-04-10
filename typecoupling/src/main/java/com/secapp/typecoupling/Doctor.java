package com.secapp.typecoupling;

public class Doctor implements Job{
    @Override
    public void display() {
        System.out.println("I'm a Doctor");
    }
}
