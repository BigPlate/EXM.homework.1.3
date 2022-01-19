package com;


import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class joo31775 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().warning("server started.");

        // Plugin startup logic
    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer(); // key
        getLogger().warning("PlayerJoinEvent triggered, do you see?");
        player.sendMessage("Welcome.");
        boolean hasPlayed = player.hasPlayedBefore();
        if (hasPlayed == false) {
            player.sendMessage("First joining!");
        }
    }




    public class PlayerJoining implements Listener {


    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
