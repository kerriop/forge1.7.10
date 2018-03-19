package com.dima.dimamod;

import com.dima.dimamod.command.UsingStrategy;
import com.dima.dimamod.command.UsingStrategySayHello;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TestItems extends Item {
    private UsingStrategy usingStrategy;

    @Override
    public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
        usingStrategy.execute();
        return super.onItemUse(p_77648_1_, p_77648_2_, p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_8_, p_77648_9_, p_77648_10_);
    }

    private TestItems(String name, UsingStrategy usingStrategy) {
        this.usingStrategy = usingStrategy;
        this.setUnlocalizedName(name);
        this.setTextureName(DimaMod.MODID + ":" + name);
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setMaxStackSize(10);
    }

    public static class TestItemsBuilder {
        private String name = "error!";
        private UsingStrategy strategy = new UsingStrategySayHello();
        private TestItemsBuilder() { }

        public static TestItemsBuilder create() {
            TestItemsBuilder builder = new TestItemsBuilder();
            return builder;
        }
        public TestItemsBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public TestItemsBuilder setUsingStrategy(UsingStrategy strategy) {
            this.strategy = strategy;
            return this;
        }

        public TestItems build() {
            return new TestItems(name, strategy);
        }
    }
}
