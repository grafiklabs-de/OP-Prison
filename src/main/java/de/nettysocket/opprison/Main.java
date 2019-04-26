package de.nettysocket.opprison;
/*
Created By NettySocket 
© All Rights reserved.
*/

import de.nettysocket.opprison.utils.SpawnManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;

    private static SpawnManager spawnManager;

    public Main() {
        spawnManager = new SpawnManager();
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    public static SpawnManager getSpawnManager() {
        return spawnManager;
    }

    public static Main getInstance() {
        return instance;
    }
}
