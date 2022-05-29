package com.rowanthemodder.artificersexpansion;

import com.rowanthemodder.artificersexpansion.common.Registrar;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("artificersexpansion")
public class ArtificersExpansion
{
    public static final String MODID = "artificersexpansion";

    public static CreativeModeTab ITEM_GROUP_ITEMS = new CreativeModeTab(ArtificersExpansion.MODID + "items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack((ItemLike) Registrar.GALVANIZED_ARGENT_SHEET.get());
        }
    };

    public static CreativeModeTab ITEM_GROUP_BLOCKS = new CreativeModeTab(ArtificersExpansion.MODID + "blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack((ItemLike) Registrar.MARROWWOOD_PLANKS.get());
        }
    };

    public ArtificersExpansion() {
        Registrar.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        Registrar.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
