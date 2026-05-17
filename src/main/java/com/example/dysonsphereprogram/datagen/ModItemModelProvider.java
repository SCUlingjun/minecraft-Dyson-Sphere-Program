package com.example.dysonsphereprogram.datagen;

import com.example.dysonsphereprogram.DysonSphereProgram;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper helper) {
        super(output,DysonSphereProgram.MODID, helper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("my_grass", modLoc("block/my_grass"));
    }
}