package com;



import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
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

        @NotNull TextComponent text = Component.text("Welcome.") // Adventure API. remember!
        .color(NamedTextColor.BLUE); // action bar??

        Player player = event.getPlayer(); // The key
        player.sendMessage(text);
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
