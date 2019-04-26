package de.nettysocket.opprison.utils;
/*
Created By NettySocket 
© All Rights reserved.
*/

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;

import java.util.ArrayList;
import java.util.List;

public class SpawnManager {

    public SpawnManager() {

    }

    private Location prisonArea;
    private Location prisonAreaMax;
    private Entity

    public Location getPrisonArea() {
        return prisonArea;
    }

    public void spawnEntity() {

    }

    public void setPrisonArea(Location prisonArea) {
        this.prisonArea = prisonArea;
    }

    public List<Block> getBlocksInPrisonArea() {
        List<Block> blocks = new ArrayList<Block>();
        for (int x = prisonArea.getBlockX(); x < prisonAreaMax.getBlockX(); x++) {
            for (int y = prisonArea.getBlockY(); y < prisonAreaMax.getBlockY(); y++) {
                for (int z = prisonArea.getBlockZ(); z < prisonAreaMax.getBlockZ(); z++) {
                    blocks.add(Bukkit.getWorld("world").getBlockAt(x, y, z));
                }
            }
        }
        return blocks;
    }
}
