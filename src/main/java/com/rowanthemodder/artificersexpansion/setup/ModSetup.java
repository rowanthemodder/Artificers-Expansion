package com.rowanthemodder.artificersexpansion.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup {

    public static final String TAB_NAME = "artificersexpansion";

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Registration.HEARTWOOD_PLANKS_ITEM.get());
        }
    };

    public static void init(FMLCommonSetupEvent event) {

    }
}
