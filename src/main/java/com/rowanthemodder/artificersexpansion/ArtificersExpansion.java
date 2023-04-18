package com.rowanthemodder.artificersexpansion;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import com.rowanthemodder.artificersexpansion.setup.ClientSetup;
import com.rowanthemodder.artificersexpansion.setup.ModSetup;
import com.rowanthemodder.artificersexpansion.setup.Registration;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("artificersexpansion") 
public class ArtificersExpansion
{
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "artificersexpansion";

    public ArtificersExpansion() {

        // Register the deferred registry
        Registration.init();

        // Register the setup method for modloading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }
}
