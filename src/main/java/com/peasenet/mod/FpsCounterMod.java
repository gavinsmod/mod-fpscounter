package com.peasenet.mod;

import com.peasenet.config.FpsColorConfig;
import com.peasenet.main.GavinsMod;
import com.peasenet.main.Settings;
import com.peasenet.mods.misc.ModFpsCounter;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FpsCounterMod implements ModInitializer {
    public static Logger LOGGER = LoggerFactory.getLogger("gavinsmod");

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        LOGGER.info("Initializing GEM FPS Counter...");
        Settings.addConfig("fpsColors", new FpsColorConfig());
        GavinsMod.addMod(new ModFpsCounter());
        LOGGER.info("GEM FPS Counter Initialized!");
    }
}
