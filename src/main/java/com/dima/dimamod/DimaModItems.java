package com.dima.dimamod;

import com.dima.dimamod.command.UsingStrategySayHello;
import com.dima.dimamod.command.UsingStrategySaySomething;
import cpw.mods.fml.common.registry.GameRegistry;

public class DimaModItems {
    public  static TestItems testItem;
    public  static TestItems testItem2;

    public static void init() {
        TestItems.TestItemsBuilder testbuilder = TestItems.TestItemsBuilder.create();

        testItem = testbuilder
                .setName("rainbow")
                .setUsingStrategy(new UsingStrategySayHello())
                .build();

        testItem2 = testbuilder
                .setName("rainbow2")
                .setUsingStrategy(new UsingStrategySaySomething())
                .build();


        GameRegistry.registerItem(testItem, "rainbow");
        GameRegistry.registerItem(testItem2, "rainbow2");
    }
}
