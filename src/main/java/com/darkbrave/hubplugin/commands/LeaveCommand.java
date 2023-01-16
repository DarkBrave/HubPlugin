package com.darkbrave.hubplugin.commands;

import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.jetbrains.annotations.NotNull;

public class LeaveCommand implements CommandExecutor
{
    public boolean onCommand(final @NotNull CommandSender sender, final @NotNull Command command, final @NotNull String label, final String[] args) {
        if (sender instanceof Player) {
            final Player player = (Player)sender;
            player.sendMessage("Leaving the server!");
            player.kickPlayer("Leaving the server!");
        }
        else {
            sender.sendMessage("You need to be a player to execute this command!");
        }
        return true;
    }
}