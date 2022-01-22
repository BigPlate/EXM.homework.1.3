package com;



import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;


public final class joo31775 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().warning("server started."); //checked.
        Bukkit.getServer().getPluginManager().registerEvents(this, this);

        // Plugin startup logic
    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        getLogger().warning("Player JoinEvent triggered.");
        @NotNull TextComponent text = Component.text("Welcome") // Adventure API. remember!
                .color(NamedTextColor.BLUE);

        Player player = event.getPlayer(); // The key
        player.sendActionBar(text);

    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
