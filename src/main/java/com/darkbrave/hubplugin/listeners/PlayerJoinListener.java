package com.darkbrave.hubplugin.listeners;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerJoinListener implements Listener {
    @EventHandler
    public void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent e) {
        Player player = e.getPlayer();
        World world = player.getWorld();
        Location spawn = world.getSpawnLocation();
        spawn.setX(spawn.getX()+0.5);
        spawn.setZ(spawn.getZ()+0.5);

        if (!player.hasPermission("hubplugin.gamemode")) {
            e.getPlayer().setGameMode(org.bukkit.GameMode.ADVENTURE);
        }

        player.teleport(spawn);
    }
}
