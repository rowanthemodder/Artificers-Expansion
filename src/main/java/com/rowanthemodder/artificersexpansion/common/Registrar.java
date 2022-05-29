package com.rowanthemodder.artificersexpansion.common;

import java.util.function.Supplier;

import com.rowanthemodder.artificersexpansion.ArtificersExpansion;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registrar {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ArtificersExpansion.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ArtificersExpansion.MODID);

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    //<------------------------------> ITEMS <------------------------------>
    //
    // <------------------------------> START <------------------------------>

    public static final RegistryObject<Item> GALVANIZED_ARGENT_SHEET = ITEMS.register("galvanized_argent_sheet", () -> new Item(new Item.Properties().tab(ArtificersExpansion.ITEM_GROUP_ITEMS)));
    public static final RegistryObject<Item> SUPERHEATED_ZINC = ITEMS.register("superheated_zinc", () -> new Item(new Item.Properties().tab(ArtificersExpansion.ITEM_GROUP_ITEMS)));

    //<------------------------------> ITEMS <------------------------------>
    //
    // <------------------------------> END <------------------------------>



    //<------------------------------> BLOCKS <------------------------------>
    //
    // <------------------------------> START <------------------------------>

    // <------------------------------> Heartwood <------------------------------>
    public static final RegistryObject<Block> HEARTWOOD_PLANKS = registerBlock("heartwood_planks",() -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)),ArtificersExpansion.ITEM_GROUP_BLOCKS);
    public static final RegistryObject<Block> HEARTWOOD_STAIRS = registerBlock("heartwood_stairs",() -> new StairBlock(() -> HEARTWOOD_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)),ArtificersExpansion.ITEM_GROUP_BLOCKS);
    public static final RegistryObject<Block> HEARTWOOD_SLAB = registerBlock("heartwood_slab",() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)),ArtificersExpansion.ITEM_GROUP_BLOCKS);
    public static final RegistryObject<Block> HEARTWOOD_FENCE = registerBlock("heartwood_fence",() -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)),ArtificersExpansion.ITEM_GROUP_BLOCKS);
    public static final RegistryObject<Block> HEARTWOOD_FENCE_GATE = registerBlock("heartwood_fence_gate",() -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)),ArtificersExpansion.ITEM_GROUP_BLOCKS);
    public static final RegistryObject<Block> HEARTWOOD_WALL = registerBlock("heartwood_wall",() -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)),ArtificersExpansion.ITEM_GROUP_BLOCKS);
    // <------------------------------> Marrowwood <------------------------------>
    public static final RegistryObject<Block> MARROWWOOD_PLANKS = registerBlock("marrowwood_planks",() -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)),ArtificersExpansion.ITEM_GROUP_BLOCKS);
    public static final RegistryObject<Block> MARROWWOOD_STAIRS = registerBlock("marrowwood_stairs",() -> new StairBlock(() -> MARROWWOOD_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)),ArtificersExpansion.ITEM_GROUP_BLOCKS);
    public static final RegistryObject<Block> MARROWWOOD_SLAB = registerBlock("marrowwood_slab",() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)),ArtificersExpansion.ITEM_GROUP_BLOCKS);
    public static final RegistryObject<Block> MARROWWOOD_FENCE = registerBlock("marrowwood_fence",() -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)),ArtificersExpansion.ITEM_GROUP_BLOCKS);
    public static final RegistryObject<Block> MARROWWOOD_FENCE_GATE = registerBlock("marrowwood_fence_gate",() -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)),ArtificersExpansion.ITEM_GROUP_BLOCKS);
    public static final RegistryObject<Block> MARROWWOOD_WALL = registerBlock("marrowwood_wall",() -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)),ArtificersExpansion.ITEM_GROUP_BLOCKS);

    //<------------------------------> BLOCKS <------------------------------>
    //
    // <------------------------------> END <------------------------------>
}
