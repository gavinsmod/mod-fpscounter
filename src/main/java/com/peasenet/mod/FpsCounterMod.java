package com.peasenet.mod;

import com.peasenet.config.FpsColorConfig;
import com.peasenet.main.GavinsMod;
import com.peasenet.main.Settings;
import com.peasenet.mods.misc.ModFpsCounter;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FpsCounterMod implements ModInitializer {

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        Settings.addConfig("fpsColors", new FpsColorConfig());
        GavinsMod.addMod(new ModFpsCounter());
    }
}
