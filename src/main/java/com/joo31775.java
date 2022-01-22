package com;


import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;


public final class joo31775 extends JavaPlugin implements Listener {  //here is listener

    @Override
    public void onEnable() {
        getLogger().warning("server started."); //checked.
        Bukkit.getServer().getPluginManager().registerEvents(this, this); // using listener
    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        getLogger().warning("Player JoinEvent triggered.");
        event.getPlayer().sendActionBar(Component.text("Welcome",(NamedTextColor.BLUE)));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
