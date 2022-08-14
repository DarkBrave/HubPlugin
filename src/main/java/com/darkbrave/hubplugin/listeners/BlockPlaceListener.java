package com.darkbrave.hubplugin.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class BlockPlaceListener implements Listener {
    @EventHandler
    public void onPlayerJoin(org.bukkit.event.block.BlockPlaceEvent e) {
        Player player = e.getPlayer();
        if (!player.hasPermission("hubplugin.operator")) {
            e.setCancelled(false);
        }
    }
}
