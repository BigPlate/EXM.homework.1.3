package com;


import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.md_5.bungee.api.ChatMessageType;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.jetbrains.annotations.NotNull;


public final class joo31775 extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().warning("server started."); //checked.
        // Plugin startup logic
    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer(); // The key
        player.sendMessage(ChatColor.BLUE + " Welcome."); // here doesn't work
        player.sendMessage("Normal Welcome."); // here, either
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
