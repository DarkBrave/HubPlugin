package com.darkbrave.hubplugin.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerJoinListener implements Listener {
    @EventHandler
    public void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent e) {
        Player player = e.getPlayer();
        if (!player.hasPermission("hubplugin.operator")) {
            e.getPlayer().setGameMode(org.bukkit.GameMode.ADVENTURE);
        }
    }
}
