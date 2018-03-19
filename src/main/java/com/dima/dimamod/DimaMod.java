package com.dima.dimamod;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = DimaMod.MODID, version = DimaMod.VERSION, name = DimaMod.NAME)
public class DimaMod {
    public static final String MODID = "dimamod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Shoop da whoop";

    @Mod.Instance(DimaMod.MODID)
    public static DimaMod instance;

    @EventHandler
    public void PreInit(FMLPreInitializationEvent event) {
		DimaModItems.init();
    }
}
