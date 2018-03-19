package com.dima.dimamod.command;

public class UsingStrategySayHello implements UsingStrategy {
    @Override
    public void execute() {
        System.out.println("hello!");
    }
}
