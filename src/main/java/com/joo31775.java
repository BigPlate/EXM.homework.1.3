package com;


import com.sun.jdi.request.EventRequestManager;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
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
