package com.example.dysonsphereprogram.datagen;

import com.example.dysonsphereprogram.DysonSphereProgram;
import com.example.dysonsphereprogram.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper helper) {
        super(output, DysonSphereProgram.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        BlockModelBuilder model = models().withExistingParent(
                        "my_grass", "minecraft:block/cube_bottom_top")
                .texture("top",      modLoc("block/my_grass_top"))
                .texture("side",     modLoc("block/my_grass_side"))
                .texture("bottom",   modLoc("block/my_grass_bottom"))
                .texture("particle", modLoc("block/my_grass_side"));

        simpleBlock(ModBlocks.MY_GRASS.get(), model);
    }
}