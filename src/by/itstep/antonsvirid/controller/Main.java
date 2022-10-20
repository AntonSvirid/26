package by.itstep.antonsvirid.controller;

import by.itstep.antonsvirid.model.entity.A;
import by.itstep.antonsvirid.model.entity.B;
import by.itstep.antonsvirid.model.logic.ExSystem;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        ExSystem.run(b);
    }
}
