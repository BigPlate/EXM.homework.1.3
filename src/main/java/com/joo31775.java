package com;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;



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
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
