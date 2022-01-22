package com;



import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.EventListener;


public final class joo31775 extends JavaPlugin implements EventListener {

    @Override
    public void onEnable() {
        getLogger().warning("server started."); //checked.
        // Plugin startup logic
    }


    //  This following codes are not checked.
    @EventHandler
    public void onPlayerJoin (PlayerJoinEvent event) {
        getLogger().warning("Player JoinEvent triggered.");
        Player player = event.getPlayer(); // The key
        @NotNull TextComponent text = Component.text("2");
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
