package com.rowanthemodder.artificersexpansion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("artificersexpansion")
public class ArtificersExpansionMod
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MODID = "artificersexpansion";

    public ArtificersExpansionMod() {
    }
}
