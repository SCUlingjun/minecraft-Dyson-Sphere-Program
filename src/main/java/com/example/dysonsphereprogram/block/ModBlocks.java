package com.example.dysonsphereprogram.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import static com.example.dysonsphereprogram.DysonSphereProgram.BLOCKS;
import static com.example.dysonsphereprogram.DysonSphereProgram.ITEMS;

public class ModBlocks {
    public static void register() {
        // Force the class to be initialized and ensure the static DeferredRegister entries are created.
        // Call this from your mod constructor (or early init) to guarantee the static fields run their initializers.
        // We intentionally only read the fields so this method is a no-op at runtime besides class initialization.
        DeferredBlock<Block> b = MY_GRASS;
        DeferredItem<BlockItem> i = MY_GRASS_ITEM;
        // Avoid unused variable warnings; the references exist solely to trigger class initialization.
        if (b == null || i == null) {
            throw new IllegalStateException("ModBlocks failed to initialize");
        }
    }
    public static final DeferredBlock<Block> MY_GRASS =
            BLOCKS.registerSimpleBlock("my_grass",
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK)
                    // ofFullCopy 直接复制草方块的所有属性（硬度、音效、工具等）
            );

    public static final DeferredItem<BlockItem> MY_GRASS_ITEM =
            ITEMS.registerSimpleBlockItem("my_grass", MY_GRASS);
}
