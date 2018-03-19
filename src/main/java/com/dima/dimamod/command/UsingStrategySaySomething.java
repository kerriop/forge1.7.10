package com.dima.dimamod.command;

public class UsingStrategySaySomething implements UsingStrategy {
    @Override
    public void execute() {
        System.out.println("say something");
    }
}
