package com.secapp.typecoupling;

public class Engineer implements Job{
    @Override
    public void display() {
        System.out.println("I'm an Engineer");
    }
}
