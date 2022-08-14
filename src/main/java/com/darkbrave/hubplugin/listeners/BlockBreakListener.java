package com.darkbrave.hubplugin.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class BlockBreakListener implements Listener {
    @EventHandler
    public void onPlayerJoin(org.bukkit.event.block.BlockBreakEvent e) {
        Player player = e.getPlayer();
        if (!player.hasPermission("hubplugin.blockbreak")) {
            e.setCancelled(true);
        }
    }
}
